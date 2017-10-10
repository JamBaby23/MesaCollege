package edu.sdmesa.mesacollege;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity
{

    WebView mesaView;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mesaView = (WebView) findViewById(R.id.mesaWebView);
        mesaView.loadUrl("*http://www.sdmesa.edu/*");

    }
}
