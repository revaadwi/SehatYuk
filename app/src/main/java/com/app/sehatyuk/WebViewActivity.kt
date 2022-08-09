package com.app.sehatyuk

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_web_view.*

class WebViewActivity : AppCompatActivity() {
    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_view)

        wv_result.webViewClient = WebViewClient()
        wv_result.loadUrl(intent.getStringExtra("url")?:"")
        val webViewSettings = wv_result.settings
        webViewSettings.javaScriptEnabled = true
        webViewSettings.domStorageEnabled = true
    }

    override fun onBackPressed() {
        if (wv_result!!.canGoBack()) {
            wv_result.goBack()
        } else{
            super.onBackPressed()
        }
    }
}