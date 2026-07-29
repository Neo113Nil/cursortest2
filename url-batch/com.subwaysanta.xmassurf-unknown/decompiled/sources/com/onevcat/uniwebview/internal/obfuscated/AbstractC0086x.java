package com.onevcat.uniwebview.internal.obfuscated;

import android.app.Activity;
import android.os.Build;
import android.webkit.WebView;
import android.webkit.WebViewDatabase;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.onevcat.uniwebview.internal.obfuscated.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0086x {
    public static void a(Activity activity, String host, String realm) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(realm, "realm");
        if (Build.VERSION.SDK_INT >= 26) {
            WebViewDatabase.getInstance(activity).clearHttpAuthUsernamePassword();
            return;
        }
        WebView webView = new WebView(activity);
        webView.setHttpAuthUsernamePassword(host, realm, null, null);
        webView.destroy();
    }
}
