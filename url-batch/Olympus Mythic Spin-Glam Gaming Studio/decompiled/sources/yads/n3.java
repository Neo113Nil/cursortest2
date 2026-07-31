package yads;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.URLUtil;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import kotlin.reflect.KProperty;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* loaded from: classes3.dex */
public final class n3 extends WebViewClient {
    public static final /* synthetic */ KProperty[] d = {ra.a(n3.class, "context", "getContext()Landroid/content/Context;", 0)};
    public final qm2 a;
    public final jo3 b = new jo3();
    public final ob3 c = new ob3();

    public n3(Context context) {
        this.a = new qm2(context);
    }

    @Override // android.webkit.WebViewClient
    public void onLoadResource(WebView view, String url) {
        super.onLoadResource(view, url);
        CreativeInfoManager.onResourceLoaded(com.safedk.android.utils.h.y, view, url);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        qm2 qm2Var = this.a;
        KProperty kProperty = d[0];
        Object obj = (Context) qm2Var.a.get();
        o3 o3Var = obj instanceof o3 ? (o3) obj : null;
        if (o3Var != null) {
            ((r1) o3Var).a(8);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        Logger.d("Yandex|SafeDK: Execution> Lyads/n3;->onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V");
        BrandSafetyUtils.onWebViewPageStarted(com.safedk.android.utils.h.y, webView, str);
        safedk_n3_onPageStarted_052660e46e6929702f3e87a2f6887b37(webView, str, bitmap);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
        super.onReceivedError(view, errorCode, description, failingUrl);
        BrandSafetyUtils.onWebViewReceivedError(com.safedk.android.utils.h.y, view, errorCode, description, failingUrl);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        if (this.b.a(webView.getContext(), sslError)) {
            sslErrorHandler.proceed();
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        return true;
    }

    public void safedk_n3_onPageStarted_052660e46e6929702f3e87a2f6887b37(WebView p0, String p1, Bitmap p2) {
        super.onPageStarted(p0, p1, p2);
        qm2 qm2Var = this.a;
        KProperty kProperty = d[0];
        Object obj = (Context) qm2Var.a.get();
        o3 o3Var = obj instanceof o3 ? (o3) obj : null;
        if (o3Var != null) {
            ((r1) o3Var).a(0);
        }
    }

    public boolean safedk_n3_shouldOverrideUrlLoading_0018653484b74f1200c54c0a972ae46d(WebView p0, String p1) {
        if (p1 == null || p1.length() <= 0) {
            return false;
        }
        if (p1.length() != 0) {
            String replaceFirst = new Regex("http(s?)://").replaceFirst(p1, "");
            lb3.c.getClass();
            lb3[] lb3VarArr = {lb3.d, lb3.e, lb3.f, lb3.g};
            for (int i = 0; i < 4; i++) {
                if (StringsKt.startsWith$default(replaceFirst, lb3VarArr[i].b, false, 2, (Object) null)) {
                    break;
                }
            }
        }
        if (URLUtil.isNetworkUrl(p1)) {
            return false;
        }
        return this.c.a(p0.getContext(), p1);
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest webResourceRequest) {
        return CreativeInfoManager.onWebViewResponseWithHeaders(com.safedk.android.utils.h.y, view, webResourceRequest, super.shouldInterceptRequest(view, webResourceRequest));
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        Logger.d("Yandex|SafeDK: Execution> Lyads/n3;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z");
        boolean safedk_n3_shouldOverrideUrlLoading_0018653484b74f1200c54c0a972ae46d = safedk_n3_shouldOverrideUrlLoading_0018653484b74f1200c54c0a972ae46d(webView, str);
        BrandSafetyUtils.onShouldOverrideUrlLoading(com.safedk.android.utils.h.y, webView, str, safedk_n3_shouldOverrideUrlLoading_0018653484b74f1200c54c0a972ae46d);
        return safedk_n3_shouldOverrideUrlLoading_0018653484b74f1200c54c0a972ae46d;
    }
}
