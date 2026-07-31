package com.fyber.inneractive.sdk.flow.nativead.trackers;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.fyber.inneractive.sdk.network.z;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.web.m;
import com.pubmatic.sdk.common.POBCommonConstants;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.internal.partials.DTExchangeNetworkBridge;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.h;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentLinkedQueue;

/* loaded from: classes3.dex */
public final class b extends WebViewClient implements Handler.Callback {
    public static final String e = IAlog.a(b.class);
    public final ConcurrentLinkedQueue a;
    public c b;
    public m c;
    public Handler d = new Handler(Looper.getMainLooper(), this);

    public b(ArrayList arrayList, c cVar) {
        this.a = new ConcurrentLinkedQueue(arrayList);
        this.b = cVar;
        m mVar = new m();
        mVar.setWebViewClient(this);
        mVar.setVisibility(8);
        mVar.getSettings().setJavaScriptEnabled(true);
        this.c = mVar;
    }

    public final void a() {
        String str;
        Handler handler = this.d;
        if (handler != null) {
            handler.removeMessages(13);
        }
        if (this.a.isEmpty() || this.d == null || this.c == null || (str = (String) this.a.poll()) == null) {
            Handler handler2 = this.d;
            if (handler2 != null) {
                handler2.sendEmptyMessage(12);
                return;
            }
            return;
        }
        if (this.d != null) {
            Message obtain = Message.obtain();
            obtain.what = 14;
            obtain.obj = str;
            this.d.sendMessage(obtain);
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (message.what) {
            case 12:
                c cVar = this.b;
                if (cVar != null) {
                    cVar.b();
                    break;
                }
                break;
            case 13:
                Object obj = message.obj;
                IAlog.b("%sTimeout reached for tracker: %s", e, obj != null ? obj.toString() : "unknown");
                a();
                break;
            case 14:
                Object obj2 = message.obj;
                if (obj2 != null) {
                    String str = e;
                    IAlog.a("%sLoading tracker %s", str, obj2);
                    String obj3 = message.obj.toString();
                    if (this.d != null && this.c != null) {
                        Message obtain = Message.obtain();
                        obtain.what = 13;
                        obtain.obj = obj3;
                        this.d.sendMessageDelayed(obtain, 5000L);
                        DTExchangeNetworkBridge.webviewLoadDataWithBaseURL(this.c, null, obj3, POBCommonConstants.CONTENT_TYPE_HTML, "UTF-8", null);
                        break;
                    } else {
                        IAlog.b("%sWas destroyed. Unable to load JS tracker %s", str, obj3);
                        break;
                    }
                }
                break;
        }
        return true;
    }

    @Override // android.webkit.WebViewClient
    public void onLoadResource(WebView view, String url) {
        super.onLoadResource(view, url);
        CreativeInfoManager.onResourceLoaded(h.p, view, url);
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView view, String url, Bitmap favicon) {
        super.onPageStarted(view, url, favicon);
        BrandSafetyUtils.onWebViewPageStarted(h.p, view, url);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
        super.onReceivedError(view, errorCode, description, failingUrl);
        BrandSafetyUtils.onWebViewReceivedError(h.p, view, errorCode, description, failingUrl);
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        z.a("WebViewRendererProcessGone", "Encountered WebViewRendererProcessGone while executing native JS tracking", null, null);
        Handler handler = this.d;
        if (handler == null) {
            return true;
        }
        handler.sendEmptyMessage(12);
        return true;
    }

    public boolean safedk_b_shouldOverrideUrlLoading_be336b6550c1769861c4d09a8f9da4dd(WebView p0, String p1) {
        if (TextUtils.isEmpty(p1) || !p1.contains("iaadfinishedloading")) {
            return super.shouldOverrideUrlLoading(p0, p1);
        }
        IAlog.a("%sTracker finished", e);
        a();
        return true;
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest webResourceRequest) {
        return CreativeInfoManager.onWebViewResponseWithHeaders(h.p, view, webResourceRequest, super.shouldInterceptRequest(view, webResourceRequest));
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        Logger.d("DTExchange|SafeDK: Execution> Lcom/fyber/inneractive/sdk/flow/nativead/trackers/b;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z");
        boolean safedk_b_shouldOverrideUrlLoading_be336b6550c1769861c4d09a8f9da4dd = safedk_b_shouldOverrideUrlLoading_be336b6550c1769861c4d09a8f9da4dd(webView, str);
        BrandSafetyUtils.onShouldOverrideUrlLoading(h.p, webView, str, safedk_b_shouldOverrideUrlLoading_be336b6550c1769861c4d09a8f9da4dd);
        return safedk_b_shouldOverrideUrlLoading_be336b6550c1769861c4d09a8f9da4dd;
    }
}
