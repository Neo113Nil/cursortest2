package com.vungle.ads.internal.platform;

import android.content.Context;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.core.util.Consumer;
import com.vungle.ads.internal.model.f0;
import com.vungle.ads.internal.util.t;
import com.vungle.ads.internal.util.u;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public abstract class g {
    public static void a(Context context, Consumer consumer) {
        Object m8023constructorimpl;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(consumer, "consumer");
        try {
            Result.Companion companion = Result.INSTANCE;
            m8023constructorimpl = Result.m8023constructorimpl(WebSettings.getDefaultUserAgent(context));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m8029isSuccessimpl(m8023constructorimpl)) {
            consumer.accept((String) m8023constructorimpl);
        }
        Throwable m8026exceptionOrNullimpl = Result.m8026exceptionOrNullimpl(m8023constructorimpl);
        if (m8026exceptionOrNullimpl != null) {
            boolean z = u.a;
            t.a("WebViewUtil", "Failed to get user agent", m8026exceptionOrNullimpl);
            consumer.accept(null);
        }
    }

    public static void a(WebView webView, f0 f0Var) {
        Boolean b;
        Boolean a;
        Intrinsics.checkNotNullParameter(webView, "webView");
        WebSettings settings = webView.getSettings();
        Intrinsics.checkNotNullExpressionValue(settings, "webView.settings");
        settings.setBuiltInZoomControls(false);
        settings.setJavaScriptEnabled(true);
        settings.setLoadWithOverviewMode(true);
        settings.setSaveFormData(true);
        settings.setUseWideViewPort(false);
        settings.setAllowFileAccess(true);
        settings.setAllowFileAccessFromFileURLs((f0Var == null || (a = f0Var.a()) == null) ? false : a.booleanValue());
        settings.setAllowUniversalAccessFromFileURLs((f0Var == null || (b = f0Var.b()) == null) ? false : b.booleanValue());
        webView.setVisibility(4);
        settings.setMediaPlaybackRequiresUserGesture(false);
    }
}
