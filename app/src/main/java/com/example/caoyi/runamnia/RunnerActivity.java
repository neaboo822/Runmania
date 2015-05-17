package com.example.caoyi.runamnia;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class RunnerActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_runner);

        UserJsonReader userJsonReader = new UserJsonReader();
        UserJsonWriter userJsonWriter = new UserJsonWriter();
        //Get start time
        Record userRecord = userJsonReader.readFromFile();
        //loop API updates
        //user push stop button -> get end time
        //calculate calories
        //get distance,endtime
        //add runningRecord constructor
        //  -> userRecord.addRunningRecord(rr);
        //check challenge (complete -> true)
        //update user record (sets function)
        //userJsonWriter.writeeToFile(userRecord);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_runner, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
