package com.example.js.taaruna;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class LecteurYoutubeTaaruna extends YouTubeBaseActivity implements
        YouTubePlayer.OnInitializedListener  {

    private static final int RECOVERY_DIALOG_REQUEST = 1;
    final String EXTRA_TEXT = "text";
    int cmp=0;
    final String [] titreMaquillage = {"Maquillage pour une soirée","Faire ses sourcils","Beaux sourcils sans les épiler","Maquillage de marié","Teint Parfait pour shooting","Maquillage peau noire","Mettre des fares a paupières","Appliquer des rouges à levres"};

    private Button backvideo = null;

    // YouTube player view
    private YouTubePlayerView youTubeView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_lecteur_youtube_taaruna);

        youTubeView = (YouTubePlayerView) findViewById(R.id.youtube_view);


        //Modification du titre
        Intent intent = getIntent();
        intent.getStringExtra(EXTRA_TEXT);
        cmp = Integer.parseInt(intent.getStringExtra(EXTRA_TEXT));
        TextView mytextview = (TextView) findViewById(R.id.youtube_txt) ;
        mytextview.setText(titreMaquillage[cmp]);


        //Retour vers la gallerie
        backvideo = (Button) findViewById(R.id.back);
        backvideo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Intent intent = new Intent(v.getContext(), Maquillage.class);
                v.getContext().startActivity(intent);
            }
        });


        // Initializing video player with developer key

        youTubeView.initialize(Config.DEVELOPER_KEY, this);
    }

    @Override
    public void onInitializationFailure(YouTubePlayer.Provider provider,
                                        YouTubeInitializationResult errorReason) {
        if (errorReason.isUserRecoverableError()) {
            errorReason.getErrorDialog(this, RECOVERY_DIALOG_REQUEST).show();
        } else {
            String errorMessage = String.format(
                    getString(R.string.error_player), errorReason.toString());
            Toast.makeText(this, errorMessage, Toast.LENGTH_LONG).show();
        }
    }

    @Override
    public void onInitializationSuccess(YouTubePlayer.Provider provider,
                                        YouTubePlayer player, boolean wasRestored) {
        Intent intent = getIntent();
        intent.getStringExtra(EXTRA_TEXT);
        cmp = Integer.parseInt(intent.getStringExtra(EXTRA_TEXT));
        if (!wasRestored) {

            // loadVideo() will auto play video
            // Use cueVideo() method, if you don't want to play it automatically

            player.loadVideo(Config.YOUTUBE_VIDEO_CODE[cmp]);

            // Hiding player controls
            player.setPlayerStyle(YouTubePlayer.PlayerStyle.CHROMELESS);
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == RECOVERY_DIALOG_REQUEST) {
            // Retry initialization if user performed a recovery action
            getYouTubePlayerProvider().initialize(Config.DEVELOPER_KEY, this);
        }
    }

    private YouTubePlayer.Provider getYouTubePlayerProvider() {
        return (YouTubePlayerView) findViewById(R.id.youtube_view);
    }

}
