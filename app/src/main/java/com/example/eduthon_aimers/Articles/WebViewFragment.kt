package com.example.eduthon_aimers.Articles

import android.content.pm.ActivityInfo
import android.os.Build
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Toast
import androidx.annotation.RequiresApi
import com.example.eduthon_aimers.R
import kotlinx.android.synthetic.main.fragment_web.view.*

class WebViewFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view =  inflater.inflate(R.layout.fragment_web, container, false)
        var bundle = this.arguments
        var Url: String? = bundle?.getString("URL", "https://www.youtube.com/")
        view.fragwebView.webViewClient =
            MyWebViewClient()
        if(view.fragwebView == null )
            Toast.makeText(context, "Clicked", Toast.LENGTH_LONG).show()
        else {
            view.fragwebView.loadUrl(Url)
//            Toast.makeText(context, Url, Toast.LENGTH_LONG).show()
        }
        return view
    }
    class MyWebViewClient: WebViewClient(){
        @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
        override fun shouldOverrideUrlLoading(view: WebView?, request: WebResourceRequest?): Boolean {
            view?.loadUrl(request?.url.toString())
            return true
        }

        override fun shouldOverrideUrlLoading(view: WebView?, url: String?): Boolean {
            view?.loadUrl(url)
            return true
        }
    }
    override fun onResume() {
        super.onResume()
        activity?.requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT
    }
    override fun onPause() {
        super.onPause()
        activity?.requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_FULL_SENSOR
    }
}