package com.androidtraining.com.androidtraining;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;

public class training01 extends AppCompatActivity {


    public static final String EXTRAMSG = "com.training.training01.msg";


    EditText editText;
    Button sendBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_training01);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        initUI();
    }


    private void initUI()
    {
        editText = (EditText)findViewById(R.id.editText);
        sendBtn = (Button)findViewById(R.id.sendBtn);


        sendBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(training01.this, Training02.class);
                String temp = editText.getText().toString();
                intent.putExtra(EXTRAMSG, temp);

                startActivity(intent);


            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_training01, menu);
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
            new AlertDialog.Builder(this).setTitle("Setting").
                    setIcon(R.mipmap.ic_launcher).setMessage("setting click!").show();
            return true;
        }

        if (id == R.id.action_search) {
            new AlertDialog.Builder(this).setTitle("Search").
                    setIcon(R.mipmap.ic_launcher).setMessage("search click!").show();
            return true;
        }



        return super.onOptionsItemSelected(item);
    }
}
