package com.example.cardsagainsthumanity.cardsagainsthumanity;

import com.example.cardsagainsthumanity.cardsagainsthumanity.util.SystemUiHider;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;


/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 *
 * @see SystemUiHider
 */
public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        Button btnView = (Button)findViewById(R.id.view);
        btnView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnView_Click();
            }
        });


        final View controlsView = findViewById(R.id.fullscreen_content_controls);
        final View contentView = findViewById(R.id.fullscreen_content);
    }

    private void btnPlay_Click (View view)
    {

    }

    private void btnView_Click ()
    {
        startActivity(new Intent(MainActivity.this,ViewCards.class));
    }
}
