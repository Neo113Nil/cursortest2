package com.google.android.gms.internal.consent_sdk;

import android.webkit.WebView;
import androidx.annotation.GuardedBy;
import com.safedk.android.internal.partials.AdMobNetworkBridge;

/* compiled from: com.google.android.ump:user-messaging-platform@@4.0.0 */
/* loaded from: classes15.dex */
public final class zzda {

    @GuardedBy
    private static Boolean zza;

    private zzda() {
    }

    public static void zza(WebView webView, String str) {
        boolean booleanValue;
        synchronized (zzda.class) {
            if (zza == null) {
                try {
                    webView.evaluateJavascript("(function(){})()", null);
                    zza = Boolean.TRUE;
                } catch (IllegalStateException unused) {
                    zza = Boolean.FALSE;
                }
            }
            booleanValue = zza.booleanValue();
        }
        if (booleanValue) {
            webView.evaluateJavascript(str, null);
        } else {
            AdMobNetworkBridge.webviewLoadUrl(webView, "javascript:".concat(str));
        }
    }
}
