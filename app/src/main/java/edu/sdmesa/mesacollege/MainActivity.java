package edu.sdmesa.mesacollege;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity
{

    WebView mesaView;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mesaView = (WebView) findViewById(R.id.mesaWebView);
        mesaView.setWebViewClient(new WebViewClient());
        mesaView.loadUrl("*http://www.sdmesa.edu/*");

    }
}
