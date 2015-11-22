package com.example.myhp.sustain;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

/**
 * Created by my hp on 11/22/2015.
 */
public class Web extends AppCompatActivity
        {
            @Override
            protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.web);
                WebView webView = (WebView)findViewById(R.id.webView);

//you can load an html code
                webView.loadData("yourCode Html to load on the webView ", "text/html", "utf-8");
// you can load an URL
                webView.loadUrl("https://www.google.co.in/?gfe_rd=cr&ei=0c9QVqGVC6jG8Afz3rPgDg&gws_rd=ssl#q=sustainable+development&tbm=nws");
            }
        }
