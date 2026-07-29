package com.techno_world.pencil.sketch.camera;

import android.os.Build;
import android.webkit.ConsoleMessage;
import android.webkit.CookieSyncManager;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Locale;

/* loaded from: classes2.dex */
public class WebViewBaseActivity extends AppCompatActivity {
    protected WebView webView = null;

    protected boolean openInAppUrl(String str) {
        return false;
    }

    protected void initializeWebView(int i) {
        WebView webView = (WebView) findViewById(i);
        this.webView = webView;
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setBuiltInZoomControls(false);
        this.webView.setVerticalScrollBarEnabled(false);
        this.webView.setHorizontalScrollBarEnabled(false);
        settings.setGeolocationDatabasePath(getCacheDir().getPath());
        settings.setDatabaseEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setGeolocationEnabled(true);
        settings.setUserAgentString(settings.getUserAgentString() + " | language: " + Locale.getDefault().getLanguage());
        this.webView.setWebChromeClient(new WebChromeClient() { // from class: com.techno_world.pencil.sketch.camera.WebViewBaseActivity.1
            @Override // android.webkit.WebChromeClient
            public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
                return true;
            }
        });
        this.webView.setWebViewClient(new WebViewClient() { // from class: com.techno_world.pencil.sketch.camera.WebViewBaseActivity.2
            @Override // android.webkit.WebViewClient
            public void onPageFinished(WebView webView2, String str) {
                if (Build.VERSION.SDK_INT < 21) {
                    CookieSyncManager.getInstance().sync();
                }
            }

            @Override // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView webView2, String str) {
                if (!str.startsWith("app://")) {
                    return true;
                }
                WebViewBaseActivity.this.openInAppUrl(str);
                return true;
            }
        });
    }
}
