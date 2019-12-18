package com.example.a024n.cash;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.support.v7.app.AppCompatActivity;

public class Fragment extends android.app.Fragment
{
    int pos;
    private static final String url = "http://abpoll.com/deneme0.docx";
    //private static final String myScript ="<html><iframe src='http://docs.google.com/gview?url=http://abpoll.com/deneme0.docx&embedded=true' style='width:350px; height:490px;' frameborder='0'></iframe></html>";
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fragment, container, false);





        /*
        WebView webview = (WebView) view.findViewById(R.id.webview);
        webview.getSettings().setJavaScriptEnabled(true);
        webview.loadData(myScript,"text/html", "UTF-8");
        //webview.loadUrl(<iframe src="http://docs.google.com/gview?url=http://abpoll.com/deneme0.docx&embedded=true" style="width:560px; height:790px;" frameborder="0"></iframe>);
        */
        return view;
    }

    public void setData(int position)
    {
        this.pos = position;
    }
}