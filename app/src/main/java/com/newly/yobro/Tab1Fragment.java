package com.newly.yobro;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by User on 2/28/2017.
 */

public class Tab1Fragment extends Fragment {
    Button one,two,three;
    String str = "";
    WebView wv;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tab1_fragment,container,false);
       one = (Button) view.findViewById(R.id.button);
        two = (Button) view.findViewById(R.id.button2);
        three = (Button) view.findViewById(R.id.button3);
        wv = (WebView) view.findViewById(R.id.webview);
        wv.setWebViewClient(new MyWebViewClient());
        wv.getSettings().setJavaScriptEnabled(true);
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wv.loadUrl("https://vamsimanohar999.github.io/traffic.html");
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wv.loadUrl("https://vamsimanohar999.github.io/comDirection.html");
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wv.loadUrl("https://vamsimanohar999.github.io/places.html");
            }
        });
        return view;
    }
}
