package com.my.target;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.JavascriptInterface;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes6.dex */
public class b1 extends FrameLayout implements xj {
    static String c = "vkAdsWebInterface";
    private WebView a;
    private List b;

    public b1(Context context) {
        super(context);
        try {
            WebView webView = new WebView(a(context));
            this.a = webView;
            webView.clearCache(true);
            this.a.addJavascriptInterface(this, c);
            addView(this.a);
            this.b = new ArrayList();
        } catch (Throwable th) {
            mi.b("BaseWebView: Webview cannot be initialized, ad will not work properly - " + th.getMessage());
            th.printStackTrace();
        }
    }

    public static Context a(Context context) {
        return context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        WebView webView = this.a;
        if (webView == null) {
            return;
        }
        try {
            webView.destroy();
        } catch (Throwable th) {
            a(th);
        }
    }

    public void b() {
        WebView webView = this.a;
        if (webView == null) {
            return;
        }
        try {
            webView.goBack();
        } catch (Throwable th) {
            a(th);
        }
    }

    public void d() {
        WebView webView = this.a;
        if (webView == null) {
            return;
        }
        try {
            webView.onPause();
        } catch (Throwable th) {
            a(th);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.r, this, me);
        return super.dispatchTouchEvent(me);
    }

    public void e() {
        WebView webView = this.a;
        if (webView == null) {
            return;
        }
        try {
            webView.onResume();
        } catch (Throwable th) {
            a(th);
        }
    }

    public void f() {
        WebView webView = this.a;
        if (webView == null) {
            return;
        }
        try {
            webView.stopLoading();
        } catch (Throwable th) {
            a(th);
        }
    }

    @Nullable
    public WebSettings getSettings() {
        try {
            WebView webView = this.a;
            if (webView == null) {
                return null;
            }
            return webView.getSettings();
        } catch (Throwable th) {
            a(th);
            return null;
        }
    }

    @Nullable
    public String getUrl() {
        try {
            WebView webView = this.a;
            if (webView == null) {
                return null;
            }
            return webView.getUrl();
        } catch (Throwable th) {
            a(th);
            return null;
        }
    }

    @Nullable
    public WebView getWebView() {
        return this.a;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        WebView webView = this.a;
        if (webView == null) {
            return;
        }
        webView.layout(0, 0, i3 - i, i4 - i2);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        WebView webView = this.a;
        if (webView == null) {
            setMeasuredDimension(0, 0);
        } else {
            webView.measure(i, i2);
            setMeasuredDimension(this.a.getMeasuredWidth(), this.a.getMeasuredHeight());
        }
    }

    @Override // com.my.target.xj
    @JavascriptInterface
    public void sendMessage(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        mi.a("BaseWebView: sendMessage " + str + " " + str2 + " " + str3);
        re a = new te().a(str, str2, str3);
        if (a == null) {
            return;
        }
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((se) it.next()).a(a);
        }
    }

    @Override // android.view.View
    public void setHorizontalScrollBarEnabled(boolean z) {
        WebView webView = this.a;
        if (webView == null) {
            return;
        }
        webView.setHorizontalScrollBarEnabled(z);
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public void setOnTouchListener(@Nullable View.OnTouchListener onTouchListener) {
        WebView webView = this.a;
        if (webView == null) {
            return;
        }
        webView.setOnTouchListener(onTouchListener);
    }

    @Override // android.view.View
    public void setScrollContainer(boolean z) {
        WebView webView = this.a;
        if (webView == null) {
            return;
        }
        webView.setScrollContainer(z);
    }

    @Override // android.view.View
    public void setVerticalScrollBarEnabled(boolean z) {
        WebView webView = this.a;
        if (webView == null) {
            return;
        }
        webView.setVerticalScrollBarEnabled(z);
    }

    public void setWebChromeClient(@Nullable WebChromeClient webChromeClient) {
        WebView webView = this.a;
        if (webView == null) {
            return;
        }
        try {
            webView.setWebChromeClient(webChromeClient);
        } catch (Throwable th) {
            a(th);
        }
    }

    public void setWebViewBackgroundColor(int i) {
        WebView webView = this.a;
        if (webView == null) {
            return;
        }
        webView.setBackgroundColor(i);
    }

    public void setWebViewClient(@NonNull WebViewClient webViewClient) {
        WebView webView = this.a;
        if (webView == null) {
            return;
        }
        try {
            webView.setWebViewClient(webViewClient);
        } catch (Throwable th) {
            a(th);
        }
    }

    private static void a(Throwable th) {
        mi.b("BaseWebView: WebView fail - " + th.getMessage());
    }

    public boolean a() {
        try {
            WebView webView = this.a;
            if (webView != null) {
                if (webView.canGoBack()) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            a(th);
            return false;
        }
    }

    public void a(int i) {
        WebView webView = this.a;
        if (webView == null) {
            return;
        }
        if (i <= 0) {
            try {
                webView.destroy();
                return;
            } catch (Throwable th) {
                a(th);
                return;
            }
        }
        o0.a(new Runnable() { // from class: com.my.target.b1$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                b1.this.c();
            }
        }, i);
    }

    public void a(String str) {
        WebView webView = this.a;
        if (webView == null) {
            return;
        }
        try {
            webView.loadUrl(str);
        } catch (Throwable th) {
            a(th);
        }
    }

    public void a(Object obj, String str) {
        WebView webView = this.a;
        if (webView == null) {
            return;
        }
        webView.addJavascriptInterface(obj, str);
    }

    public void a(String str, String str2, String str3, String str4, String str5) {
        WebView webView = this.a;
        if (webView == null) {
            return;
        }
        try {
            webView.loadDataWithBaseURL(str, str2, str3, str4, str5);
        } catch (Throwable th) {
            a(th);
        }
    }

    public void a(se seVar) {
        this.b.add(seVar);
    }
}
