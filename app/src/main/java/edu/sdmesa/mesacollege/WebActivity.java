package edu.sdmesa.mesacollege;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class WebActivity extends AppCompatActivity implements View.OnClickListener
{

    Button buttonWebsite;
    Button buttonCall;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);

        buttonWebsite = (Button) findViewById(R.id.buttonWebsite);
        buttonWebsite.setOnClickListener(this);

        buttonCall = (Button) findViewById(R.id.buttonCall);
        buttonCall.setOnClickListener(this);
    }
    @Override
    public void onClick(View v)
    {
        Intent m = new Intent();
    }
}
