package com.ogury.ad.internal;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.ogury.core.internal.LogTag;
import com.ogury.core.internal.Logger;
import com.ogury.core.internal.SourceTag;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import java.io.ByteArrayInputStream;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__BuildersKt;

/* loaded from: classes10.dex */
public final class a8 extends ni {
    public static final WebResourceResponse f;
    public y a;
    public final Handler b;
    public final u7 c;
    public final y7 d;
    public z7 e;

    static {
        byte[] bytes = "".getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        f = new WebResourceResponse("text/image", "UTF-8", new ByteArrayInputStream(bytes));
    }

    public a8(y7 mraidWebView) {
        Intrinsics.checkNotNullParameter(mraidWebView, "mraidWebView");
        this.a = null;
        this.b = new Handler(Looper.getMainLooper());
        this.c = u7.a;
        this.d = mraidWebView;
    }

    @Override // com.ogury.ad.internal.ni
    public final void a(String type, int i, String str, Uri failingUri) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(failingUri, "failingUri");
        Uri.Builder builder = new Uri.Builder();
        builder.scheme(failingUri.getScheme());
        builder.authority(failingUri.getAuthority());
        builder.path(failingUri.getPath());
        String str2 = "errorType: " + type + " errorCode: " + i + ", description: " + str + ", failingUrl: " + builder.build();
        Logger.INSTANCE.d(LogTag.MRAID, SourceTag.ADS, "onReceivedError " + str2);
        z7 z7Var = this.e;
        if (z7Var != null) {
            z7Var.a(str2);
        }
    }

    public final WebResourceResponse b(WebView view, final String url) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(url, "<this>");
        Locale US = Locale.US;
        Intrinsics.checkNotNullExpressionValue(US, "US");
        String lowerCase = url.toLowerCase(US);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        if (StringsKt.startsWith$default(lowerCase, "http://ogymraid", false, 2, (Object) null) || StringsKt.startsWith$default(lowerCase, "https://ogymraid", false, 2, (Object) null)) {
            this.b.post(new Runnable() { // from class: com.ogury.ad.internal.a8$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    a8.a(url, this);
                }
            });
            return f;
        }
        if (Intrinsics.areEqual(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.w.k, Uri.parse(url).getLastPathSegment())) {
            return a(view);
        }
        return null;
    }

    @Override // com.ogury.ad.internal.ni, android.webkit.WebViewClient
    public void onLoadResource(WebView view, String url) {
        super.onLoadResource(view, url);
        CreativeInfoManager.onResourceLoaded("io.presage", view, url);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView view, String url) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(url, "url");
        z7 z7Var = this.e;
        if (z7Var != null) {
            z7Var.b(view, url);
        }
    }

    @Override // com.ogury.ad.internal.ni, android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        com.safedk.android.utils.Logger.d("Ogury|SafeDK: Execution> Lcom/ogury/ad/internal/a8;->onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V");
        BrandSafetyUtils.onWebViewPageStarted("io.presage", webView, str);
        safedk_a8_onPageStarted_48824b0e0918b9707a271aafea3d85c7(webView, str, bitmap);
    }

    public void safedk_a8_onPageStarted_48824b0e0918b9707a271aafea3d85c7(WebView view, String url, Bitmap p2) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(url, "url");
        z7 z7Var = this.e;
        if (z7Var != null) {
            z7Var.c(view, url);
        }
    }

    public static final void a(String url, a8 this$0) {
        z7 z7Var;
        Intrinsics.checkNotNullParameter(url, "$url");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Logger.INSTANCE.d(LogTag.MRAID, SourceTag.ADS, "[Receiving] " + gi.a(url));
        this$0.getClass();
        Intrinsics.checkNotNullParameter(url, "url");
        y7 webView = this$0.d;
        webView.getClass();
        Intrinsics.checkNotNullParameter(url, "url");
        if (webView.q.containsMatchIn(url)) {
            webView.h = true;
            t7 t7Var = webView.p;
            t7Var.getClass();
            Intrinsics.checkNotNullParameter(webView, "webView");
            t7Var.b.a(webView.getMraidCommandExecutor());
            z7 z7Var2 = webView.m;
            if (z7Var2 != null) {
                z7Var2.b(webView);
            }
        } else if (webView.r.containsMatchIn(url) && (z7Var = webView.m) != null) {
            z7Var.a(webView);
        }
        webView.i.a(url, webView, webView.a);
    }

    public final WebResourceResponse a(WebView webView) {
        String str;
        Object runBlocking$default;
        u7 u7Var = this.c;
        Context context = webView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        y yVar = this.a;
        u7Var.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        if (yVar != null && Intrinsics.areEqual(yVar.c, "optin_video")) {
            str = p7.a(yVar);
        } else {
            str = "window.MRAID_ENV =  { version: '3.0', sdk: 'Presage', sdkVersion: '5.2.2'};";
        }
        runBlocking$default = BuildersKt__BuildersKt.runBlocking$default(null, new g7(l7.b.a(context), null), 1, null);
        String str2 = (String) runBlocking$default;
        WebResourceResponse a = str2.length() > 0 ? u7.a(str2, str) : null;
        if (a != null) {
            return a;
        }
        this.b.post(new Runnable() { // from class: com.ogury.ad.internal.a8$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                a8.a(a8.this);
            }
        });
        return f;
    }

    public static final void a(a8 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getClass();
        Logger.INSTANCE.d(LogTag.INTERNAL, SourceTag.ADS, "Mraid injection failed");
        z7 z7Var = this$0.e;
        if (z7Var != null) {
            z7Var.a("Mraid injection failed");
        }
    }

    @Override // com.ogury.ad.internal.ni
    public final WebResourceResponse a(WebView view, String url) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(url, "url");
        z7 z7Var = this.e;
        if (z7Var != null) {
            z7Var.a(view, url);
        }
        z7 z7Var2 = this.e;
        if (z7Var2 != null && z7Var2.b(url)) {
            Logger.INSTANCE.d(LogTag.INTERNAL, SourceTag.ADS, "blockedzzz " + url);
            byte[] bytes = "".getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            return new WebResourceResponse("text/image", "UTF-8", new ByteArrayInputStream(bytes));
        }
        return b(view, url);
    }
}
