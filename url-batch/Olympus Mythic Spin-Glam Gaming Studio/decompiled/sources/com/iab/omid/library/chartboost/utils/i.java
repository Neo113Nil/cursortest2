package com.iab.omid.library.chartboost.utils;

import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.webkit.WebViewCompat;
import java.util.Set;

/* loaded from: classes14.dex */
public class i {
    public void a(@NonNull WebView webView, @NonNull String str) {
        WebViewCompat.removeWebMessageListener(webView, str);
    }

    public void a(@NonNull WebView webView, @NonNull String str, @NonNull Set<String> set, @NonNull WebViewCompat.WebMessageListener webMessageListener) {
        WebViewCompat.addWebMessageListener(webView, str, set, webMessageListener);
    }
}
