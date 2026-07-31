package com.ogury.ad.internal;

import android.webkit.WebView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public abstract class zi {
    public static final void a(WebView webView) {
        Intrinsics.checkNotNullParameter(webView, "<this>");
        Intrinsics.checkNotNullParameter(webView, "<this>");
        if (webView.isAttachedToWindow()) {
            return;
        }
        webView.destroy();
    }

    public static final void b(y7 y7Var) {
        Intrinsics.checkNotNullParameter(y7Var, "<this>");
        y7Var.setHorizontalScrollBarEnabled(false);
        y7Var.setVerticalScrollBarEnabled(false);
        y7Var.setScrollContainer(false);
    }

    public static final void c(y7 y7Var) {
        Intrinsics.checkNotNullParameter(y7Var, "<this>");
        y7Var.getSettings().setJavaScriptEnabled(true);
        y7Var.getSettings().setDomStorageEnabled(true);
    }

    public static final boolean d(y7 y7Var) {
        Intrinsics.checkNotNullParameter(y7Var, "<this>");
        return y7Var.isAttachedToWindow();
    }

    public static final void a(y7 y7Var) {
        Intrinsics.checkNotNullParameter(y7Var, "<this>");
        y7Var.getSettings().setMediaPlaybackRequiresUserGesture(false);
    }

    public static final void a(WebView webView, final bh callback) {
        Intrinsics.checkNotNullParameter(webView, "<this>");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (webView.getHeight() <= 0 && webView.getWidth() <= 0) {
            webView.post(new Runnable() { // from class: com.ogury.ad.internal.zi$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    zi.a(Function0.this);
                }
            });
        } else {
            ch.a(callback.a, callback.b);
            Unit unit = Unit.INSTANCE;
        }
    }

    public static final void a(Function0 callback) {
        Intrinsics.checkNotNullParameter(callback, "$callback");
        callback.mo4828invoke();
    }
}
