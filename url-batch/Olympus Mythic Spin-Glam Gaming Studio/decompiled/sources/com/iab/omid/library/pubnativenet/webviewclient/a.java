package com.iab.omid.library.pubnativenet.webviewclient;

import android.net.Uri;
import android.os.Build;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.NonNull;
import com.iab.omid.library.pubnativenet.attestation.c;
import com.iab.omid.library.pubnativenet.internal.g;
import com.iab.omid.library.pubnativenet.internal.j;

/* loaded from: classes15.dex */
public class a {
    public static void a(@NonNull WebView webView) {
        WebViewClient webViewClient;
        if (Build.VERSION.SDK_INT < 26 || !c.a(g.b().a()).b()) {
            return;
        }
        webViewClient = webView.getWebViewClient();
        webView.setWebViewClient(new b(webViewClient));
    }

    public static boolean a(String str) {
        if (str != null && str.startsWith("omid-native")) {
            try {
                Uri parse = Uri.parse(str);
                if ("omid-native".equals(parse.getScheme())) {
                    j.b(parse);
                    return true;
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }
}
