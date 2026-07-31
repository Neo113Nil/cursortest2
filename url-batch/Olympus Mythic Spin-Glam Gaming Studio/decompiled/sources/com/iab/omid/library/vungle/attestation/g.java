package com.iab.omid.library.vungle.attestation;

import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.webkit.WebViewFeature;

/* loaded from: classes5.dex */
public class g {
    public static boolean a(@NonNull WebView webView) {
        try {
            if (WebViewFeature.isFeatureSupported("WEB_MESSAGE_LISTENER") && c.a(com.iab.omid.library.vungle.internal.g.b().a()).b()) {
                f.a(webView);
                return true;
            }
        } catch (Exception e) {
            com.iab.omid.library.vungle.utils.d.a("Error during initialization of AttestationMessageListener", e);
        } catch (NoClassDefFoundError unused) {
            com.iab.omid.library.vungle.utils.d.a("androidx.webkit not available, skipping attestation listener initialization");
        }
        return false;
    }
}
