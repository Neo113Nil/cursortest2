package io.appmetrica.analytics.internal.js;

import android.webkit.JavascriptInterface;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.impl.C5736v1;

/* loaded from: classes6.dex */
public class AppMetricaJsInterface {
    private final C5736v1 a;

    public AppMetricaJsInterface(@NonNull C5736v1 c5736v1) {
        this.a = c5736v1;
    }

    @JavascriptInterface
    public void reportEvent(String str, String str2) {
        this.a.d(str, str2);
    }
}
