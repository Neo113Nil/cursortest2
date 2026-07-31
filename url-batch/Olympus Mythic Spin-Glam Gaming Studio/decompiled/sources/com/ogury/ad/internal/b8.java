package com.ogury.ad.internal;

import android.content.Context;
import android.webkit.WebView;
import com.ogury.core.internal.IntegrationLogger;
import com.ogury.core.internal.LogTag;
import com.ogury.core.internal.Logger;
import com.ogury.core.internal.SourceTag;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public abstract class b8 {
    public static final void a(y7 y7Var, String javascript) {
        Intrinsics.checkNotNullParameter(y7Var, "<this>");
        Intrinsics.checkNotNullParameter(javascript, "javascript");
        try {
            Logger.INSTANCE.d(LogTag.MRAID, SourceTag.ADS, "[Sending] " + w1.a((WebView) y7Var) + " " + javascript);
            StringBuilder sb = new StringBuilder();
            sb.append("javascript:");
            sb.append(javascript);
            y7Var.loadUrl(sb.toString());
        } catch (Throwable th) {
            IntegrationLogger.e(LogTag.INTERNAL, SourceTag.ADS, th);
        }
    }

    public static final y7 a(Context context, b ad) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(ad, "ad");
        try {
            y7 y7Var = new y7(context, ad);
            y7Var.setBackgroundColor(0);
            y7Var.setLayerType(2, null);
            return y7Var;
        } catch (Throwable th) {
            IntegrationLogger.e(LogTag.INTERNAL, SourceTag.ADS, th);
            return null;
        }
    }
}
