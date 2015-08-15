package com.jclin.myappportfolio;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        if (item.getItemId() == R.id.action_settings)
        {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void onSpotifyStreamerButtonClick(View view)
    {
        showToast("Spotify Streaming");
    }

    public void onScoresAppButtonClick(View view)
    {
        showToast("Scores");
    }

    public void onLibraryAppButtonClick(View view)
    {
        showToast("Library");
    }

    public void onBuildItBiggerButtonClick(View view)
    {
        showToast("Build It Bigger");
    }

    public void onXYZReaderButtonClick(View view)
    {
        showToast("XYZ Reader");
    }

    public void onCapstoneProjectButtonClick(View view)
    {
        showToast("Capstone");
    }

    private void showToast(String appName)
    {
        Toast.makeText(
            getApplicationContext(),
            String.format(getString(R.string.buttonClickToastMessageFormat), appName),
            Toast.LENGTH_SHORT)
        .show();
    }
}
