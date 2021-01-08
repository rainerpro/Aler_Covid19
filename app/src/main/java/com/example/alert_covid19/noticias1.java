package com.example.alert_covid19;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

import androidx.appcompat.app.AppCompatActivity;

public class noticias1 extends AppCompatActivity {
    WebView miVisorWeb;
    String link1;
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_noticias1);

        miVisorWeb = findViewById(R.id.view2);
        final WebSettings ajustesVisorWeb = miVisorWeb.getSettings();
        ajustesVisorWeb.setJavaScriptEnabled(true);
        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            if (bundle.get("linknoticias") != null) {
                link1 = bundle.get("linknoticias").toString();}
        }
        miVisorWeb.loadUrl(link1);



    }

}