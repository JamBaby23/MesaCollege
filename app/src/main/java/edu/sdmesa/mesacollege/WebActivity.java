package edu.sdmesa.mesacollege;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.Manifest;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;


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
        buttonCall.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View arg0)
            {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:6193882600"));

                if (ActivityCompat.checkSelfPermission(WebActivity.this,
                        Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED)
                {
                    return;
                }

                startActivity(callIntent);
            }

            });
    }
    @Override
    public void onClick(View v)
    {
        Intent m = new Intent();
    }
}
