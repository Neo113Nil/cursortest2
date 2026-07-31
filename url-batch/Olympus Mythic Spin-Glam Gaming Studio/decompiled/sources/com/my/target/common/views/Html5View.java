package com.my.target.common.views;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.annotation.AttrRes;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StyleRes;
import com.my.target.common.listeners.HtmlCustomEventListener;
import com.my.target.common.listeners.HtmlInteractionListener;
import com.my.target.common.listeners.HtmlInteractiveProgressListener;
import com.my.target.common.listeners.HtmlLoadingListener;
import com.my.target.common.views.Html5View;
import com.my.target.o0;
import com.my.target.y0;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes.dex */
public final class Html5View extends FrameLayout {
    private final y0 a;
    private final d b;
    private final b c;
    private int d;
    private String e;

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    public static abstract class WebViewClickListener {
        public abstract void onCtaClick();

        public abstract void onUrlClick(@NonNull String str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    final class b {
        private HtmlLoadingListener a;
        private WebViewClickListener b;
        private HtmlInteractiveProgressListener c;
        private HtmlCustomEventListener d;

        public b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b() {
            HtmlInteractiveProgressListener htmlInteractiveProgressListener = this.c;
            if (htmlInteractiveProgressListener != null) {
                htmlInteractiveProgressListener.onInteractiveFinished();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c() {
            HtmlInteractiveProgressListener htmlInteractiveProgressListener = this.c;
            if (htmlInteractiveProgressListener != null) {
                htmlInteractiveProgressListener.onInteractiveStarted();
            }
        }

        public void a(HtmlLoadingListener htmlLoadingListener) {
            this.a = htmlLoadingListener;
        }

        @JavascriptInterface
        public void onCTAClicked() {
            o0.e(new Runnable() { // from class: com.my.target.common.views.Html5View$b$$ExternalSyntheticLambda5
                @Override // java.lang.Runnable
                public final void run() {
                    Html5View.b.this.a();
                }
            });
        }

        @JavascriptInterface
        public void onCustomEvent(@NonNull final String str, @Nullable final String str2) {
            o0.e(new Runnable() { // from class: com.my.target.common.views.Html5View$b$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    Html5View.b.this.a(str, str2);
                }
            });
        }

        @JavascriptInterface
        public void onInteractiveFailedToLoad(@Nullable final String str) {
            final WebView webView = Html5View.this.a.getWebView();
            if (webView != null) {
                Html5View html5View = Html5View.this;
                if (html5View.d != 3) {
                    html5View.d = 3;
                    o0.e(new Runnable() { // from class: com.my.target.common.views.Html5View$b$$ExternalSyntheticLambda0
                        @Override // java.lang.Runnable
                        public final void run() {
                            Html5View.b.this.a(webView, str);
                        }
                    });
                }
            }
        }

        @JavascriptInterface
        public void onInteractiveFinished() {
            o0.e(new Runnable() { // from class: com.my.target.common.views.Html5View$b$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    Html5View.b.this.b();
                }
            });
        }

        @JavascriptInterface
        public void onInteractiveLoaded() {
            final WebView webView = Html5View.this.a.getWebView();
            if (webView != null) {
                Html5View html5View = Html5View.this;
                if (html5View.d != 3) {
                    html5View.d = 2;
                    o0.e(new Runnable() { // from class: com.my.target.common.views.Html5View$b$$ExternalSyntheticLambda3
                        @Override // java.lang.Runnable
                        public final void run() {
                            Html5View.b.this.a(webView);
                        }
                    });
                }
            }
        }

        @JavascriptInterface
        public void onInteractiveStarted() {
            o0.e(new Runnable() { // from class: com.my.target.common.views.Html5View$b$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    Html5View.b.this.c();
                }
            });
        }

        public void a(WebViewClickListener webViewClickListener) {
            this.b = webViewClickListener;
        }

        public void a(HtmlInteractiveProgressListener htmlInteractiveProgressListener) {
            this.c = htmlInteractiveProgressListener;
        }

        public void a(HtmlCustomEventListener htmlCustomEventListener) {
            this.d = htmlCustomEventListener;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(WebView webView) {
            HtmlLoadingListener htmlLoadingListener = this.a;
            if (htmlLoadingListener != null) {
                htmlLoadingListener.onPageFinished(webView, "https://ad.mail.ru/");
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(WebView webView, String str) {
            HtmlLoadingListener htmlLoadingListener = this.a;
            if (htmlLoadingListener != null) {
                if (str == null) {
                    str = "Unknown internal error";
                }
                htmlLoadingListener.onError(webView, HtmlLoadingListener.CommonError.a(-1, str), null);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a() {
            WebViewClickListener webViewClickListener = this.b;
            if (webViewClickListener != null) {
                webViewClickListener.onCtaClick();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(String str, String str2) {
            HtmlCustomEventListener htmlCustomEventListener = this.d;
            if (htmlCustomEventListener != null) {
                htmlCustomEventListener.onCustomEvent(str, str2);
            }
        }
    }

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    private static final class c implements y0.e {
        private final HtmlInteractionListener a;

        public c(HtmlInteractionListener htmlInteractionListener) {
            this.a = htmlInteractionListener;
        }

        @Override // com.my.target.y0.e
        public void a() {
            this.a.onActionDown();
        }

        @Override // com.my.target.y0.e
        public void b() {
            this.a.onActionUp();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    static class d {
        private long a;
        private final Handler b;
        private Runnable c;

        private d() {
            this.a = 5000L;
            this.b = o0.g;
            this.c = new Runnable() { // from class: com.my.target.common.views.Html5View$d$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    Html5View.d.b();
                }
            };
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void b() {
        }

        public void a(long j) {
            if (j > 0) {
                this.a = j;
            }
        }

        public void a(Runnable runnable) {
            this.c = runnable;
            this.b.postDelayed(runnable, this.a);
        }

        public void a() {
            this.b.removeCallbacks(this.c);
        }
    }

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    private final class e implements y0.g {
        private final HtmlLoadingListener a;

        public e(HtmlLoadingListener htmlLoadingListener) {
            this.a = htmlLoadingListener;
        }

        @Override // com.my.target.y0.g
        public void a(WebView webView, int i, String str, String str2) {
            Html5View html5View = Html5View.this;
            if (html5View.d != 3) {
                html5View.d = 3;
                this.a.onError(webView, HtmlLoadingListener.HttpError.a(i, str), str2);
            }
        }

        @Override // com.my.target.y0.g
        public void b(WebView webView, int i, String str, String str2) {
            Html5View html5View = Html5View.this;
            if (html5View.d != 3) {
                html5View.d = 3;
                this.a.onError(webView, HtmlLoadingListener.CommonError.a(i, str), str2);
            }
        }
    }

    public Html5View(@NonNull Context context) {
        this(context, null);
    }

    private void a(String str) {
        this.b.a();
        this.d = 0;
        this.a.setData(str);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.r, this, me);
        return super.dispatchTouchEvent(me);
    }

    public boolean getIsLoaded() {
        return this.d == 2;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public void reloadHtmlContent() {
        String str = this.e;
        if (str != null) {
            a(str);
        }
    }

    public void setData(@NonNull String str) {
        this.e = str;
        a(str);
    }

    public void setHtmlCustomEventListener(@NonNull HtmlCustomEventListener htmlCustomEventListener) {
        this.c.a(htmlCustomEventListener);
    }

    public void setHtmlInteractionListener(@NonNull HtmlInteractionListener htmlInteractionListener) {
        this.a.setUserMotionEventListener(new c(htmlInteractionListener));
    }

    public void setHtmlInteractiveProgressListener(@NonNull HtmlInteractiveProgressListener htmlInteractiveProgressListener) {
        this.c.a(htmlInteractiveProgressListener);
    }

    public void setHtmlLoadingListener(@NonNull HtmlLoadingListener htmlLoadingListener) {
        this.a.setWebViewLoadingStartListener(new f(htmlLoadingListener, this.b));
        this.a.setWebViewLoadingErrorListener(new e(htmlLoadingListener));
        this.c.a(htmlLoadingListener);
    }

    public void setLoadingTimeoutMillis(long j) {
        this.b.a(j);
    }

    public void setWebViewBackgroundColor(@ColorInt int i) {
        this.a.setWebViewBackgroundColor(i);
    }

    public void setWebViewClickListener(@NonNull WebViewClickListener webViewClickListener) {
        this.a.setBannerWebViewListener(new a(webViewClickListener));
        this.c.a(webViewClickListener);
    }

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    private static final class a implements y0.a {
        private final WebViewClickListener a;

        public a(WebViewClickListener webViewClickListener) {
            this.a = webViewClickListener;
        }

        @Override // com.my.target.y0.a
        public void a(WebView webView, int i, String str, String str2) {
        }

        @Override // com.my.target.y0.a
        public void a(WebView webView, String str) {
        }

        @Override // com.my.target.y0.a
        public void b() {
        }

        @Override // com.my.target.y0.a
        public void a(String str) {
            this.a.onUrlClick(str);
        }
    }

    public Html5View(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public Html5View(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i) {
        this(context, attributeSet, i, 0);
    }

    public Html5View(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i, @StyleRes int i2) {
        super(context, attributeSet, i, i2);
        b bVar = new b();
        this.c = bVar;
        this.d = 0;
        this.e = null;
        y0 y0Var = new y0(context);
        this.a = y0Var;
        this.b = new d();
        y0Var.g();
        y0Var.a(bVar, "myTargetPlayableAds");
        addView(y0Var, new ViewGroup.LayoutParams(-1, -1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    final class f implements y0.h {
        private final HtmlLoadingListener a;
        private final d b;

        public f(HtmlLoadingListener htmlLoadingListener, d dVar) {
            this.a = htmlLoadingListener;
            this.b = dVar;
        }

        @Override // com.my.target.y0.h
        public void a(final WebView webView, final String str, Bitmap bitmap) {
            Html5View.this.d = 1;
            this.a.onPageStarted(webView, str, bitmap);
            this.b.a(new Runnable() { // from class: com.my.target.common.views.Html5View$f$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    Html5View.f.this.a(webView, str);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(WebView webView, String str) {
            Html5View html5View = Html5View.this;
            if (html5View.d == 1) {
                html5View.d = 3;
                this.a.onError(webView, HtmlLoadingListener.CommonError.a(-8, "Html5 content loading timeout"), str);
            }
        }
    }
}
