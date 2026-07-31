package com.my.target;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.JavascriptInterface;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes12.dex */
public final class v9 extends ne {
    private final WebView a;
    private final ViewGroup b;
    private final ImageView c;

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    public interface a {
        void a();

        void c();
    }

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    private static class b {
        final a a;

        public b(a aVar) {
            this.a = aVar;
        }

        @JavascriptInterface
        public void onCTAClicked() {
            this.a.c();
        }

        @JavascriptInterface
        public void onInteractiveFinished() {
            this.a.a();
        }
    }

    public v9(Context context, a aVar, WebViewClient webViewClient) {
        super(context);
        WebView webView = new WebView(context);
        this.a = webView;
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setAllowFileAccess(false);
        settings.setAllowContentAccess(false);
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        webView.addJavascriptInterface(new b(aVar), "myTargetPlayableAds");
        webView.setWebViewClient(webViewClient);
        addView(webView, -1, -1);
        FrameLayout frameLayout = new FrameLayout(context);
        this.b = frameLayout;
        frameLayout.setBackgroundColor(1711276032);
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        imageView.setImageBitmap(f9.f(context));
        frameLayout.addView(imageView);
        addView(frameLayout, -1, -1);
        frameLayout.setOnClickListener(new View.OnClickListener() { // from class: com.my.target.v9$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                v9.this.a(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        removeView(this.b);
    }

    @Override // com.my.target.ne, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.r, this, me);
        return super.dispatchTouchEvent(me);
    }

    @NonNull
    public WebView getWebView() {
        return this.a;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = i3 - i;
        int i6 = i4 - i2;
        this.a.layout(0, 0, i5, i6);
        this.b.layout(0, 0, i5, i6);
        int measuredWidth = this.c.getMeasuredWidth();
        int measuredHeight = this.c.getMeasuredHeight();
        int i7 = (i5 - measuredWidth) / 2;
        int i8 = (i6 - measuredHeight) / 2;
        this.c.layout(i7, i8, measuredWidth + i7, measuredHeight + i8);
    }

    @Override // com.my.target.ne, android.view.View
    protected void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        this.a.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        this.c.measure(View.MeasureSpec.makeMeasureSpec(qi.a(109, getContext()), 1073741824), View.MeasureSpec.makeMeasureSpec(qi.a(102, getContext()), 1073741824));
        setMeasuredDimension(size, size2);
    }
}
