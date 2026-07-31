package io.appmetrica.analytics.internal.js;

import android.webkit.JavascriptInterface;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.impl.C5736v1;

/* loaded from: classes5.dex */
public class AppMetricaInitializerJsInterface {
    private final C5736v1 a;

    public AppMetricaInitializerJsInterface(@NonNull C5736v1 c5736v1) {
        this.a = c5736v1;
    }

    @JavascriptInterface
    public void init(String str) {
        this.a.c(str);
    }
}
