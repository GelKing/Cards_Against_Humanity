package com.example.cardsagainsthumanity.cardsagainsthumanity;

import com.example.util.SystemUiHider;

import android.annotation.TargetApi;
import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.view.MenuItem;
import android.support.v4.app.NavUtils;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 *
 * @see SystemUiHider
 */
public class ViewCards extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_view_cards);
        setupActionBar();

        Button btnWhite = (Button)findViewById(R.id.white);
        btnWhite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnWhite_Click();
            }
        });

        Button btnBlack = (Button)findViewById(R.id.black);
        btnBlack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnBlack_Click();
            }
        });

        final View controlsView = findViewById(R.id.fullscreen_content_controls);
        final View contentView = findViewById(R.id.fullscreen_content);
    }

    /**
     * Set up the {@link android.app.ActionBar}, if the API is available.
     */
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    private void setupActionBar() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
            // Show the Up button in the action bar.
            getActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home) {
            // This ID represents the Home or Up button. In the case of this
            // activity, the Up button is shown. Use NavUtils to allow users
            // to navigate up one level in the application structure. For
            // more details, see the Navigation pattern on Android Design:
            //
            // http://developer.android.com/design/patterns/navigation.html#up-vs-back
            //
            // TODO: If Settings has multiple levels, Up should navigate up
            // that hierarchy.
            NavUtils.navigateUpFromSameTask(this);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    private void btnWhite_Click ()
    {
        ListView lvWhite = (ListView)findViewById(R.id.whites);

        ArrayList<String> testList;
        testList = new ArrayList<String>();
        testList.add("White Ass Daddy");

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.test_list_item,testList);
        lvWhite.setAdapter(adapter);
        lvWhite.setVisibility(View.VISIBLE);

        ListView lvBlack = (ListView)findViewById(R.id.blacks);
        lvBlack.setVisibility(View.GONE);
    }

    private void btnBlack_Click ()
    {
        ListView lvBlack = (ListView)findViewById(R.id.blacks);

        ArrayList<String> testList;
        testList = new ArrayList<String>();
        testList.add("Black Ass Momma");

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.test_list_item,testList);
        lvBlack.setAdapter(adapter);

        lvBlack.setVisibility(View.VISIBLE);

        ListView lvWhite = (ListView)findViewById(R.id.whites);
        lvWhite.setVisibility(View.GONE);
    }
}
