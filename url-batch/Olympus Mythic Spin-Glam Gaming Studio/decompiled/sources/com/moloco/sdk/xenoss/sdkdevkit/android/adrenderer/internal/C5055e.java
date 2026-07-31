package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import android.webkit.WebView;
import com.ironsource.B5;
import com.pubmatic.sdk.common.POBCommonConstants;
import com.safedk.android.internal.partials.MolocoAdsNetworkBridge;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.e, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C5055e {

    @NotNull
    public static final String a = "https://appassets.androidplatform.net";

    public static final void a(@NotNull WebView webView, @NotNull String data) {
        Intrinsics.checkNotNullParameter(webView, "<this>");
        Intrinsics.checkNotNullParameter(data, "data");
        MolocoAdsNetworkBridge.webviewLoadDataWithBaseURL(webView, a, data, POBCommonConstants.CONTENT_TYPE_HTML, B5.O, null);
    }
}
