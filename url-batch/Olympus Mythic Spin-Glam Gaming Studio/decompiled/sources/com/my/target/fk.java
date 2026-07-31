package com.my.target;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.LayerDrawable;
import android.net.Uri;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import java.net.URI;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes14.dex */
public class fk extends LinearLayout {
    public static final int n = qi.c();
    public static final int o = qi.c();
    private final qi a;
    private final ImageButton b;
    private final LinearLayout c;
    private final TextView d;
    private final TextView e;
    private final FrameLayout f;
    private final View g;
    private final FrameLayout h;
    private final ImageButton i;
    private final RelativeLayout j;
    private final b1 k;
    private final ProgressBar l;
    private d m;

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    class a extends WebViewClient {
        a() {
        }

        @Override // android.webkit.WebViewClient
        public void onLoadResource(WebView view, String url) {
            super.onLoadResource(view, url);
            CreativeInfoManager.onResourceLoaded(com.safedk.android.utils.h.r, view, url);
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView view, String url, Bitmap favicon) {
            super.onPageStarted(view, url, favicon);
            BrandSafetyUtils.onWebViewPageStarted(com.safedk.android.utils.h.r, view, url);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
            super.onReceivedError(view, errorCode, description, failingUrl);
            BrandSafetyUtils.onWebViewReceivedError(com.safedk.android.utils.h.r, view, errorCode, description, failingUrl);
        }

        public boolean safedk_fk$a_shouldOverrideUrlLoading_942e258a48186662ba0ab7b96284d17b(WebView p0, String p1) {
            p0.loadUrl(p1);
            fk fkVar = fk.this;
            fkVar.d.setText(fkVar.a(p1));
            return true;
        }

        @Override // android.webkit.WebViewClient
        public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest webResourceRequest) {
            return CreativeInfoManager.onWebViewResponseWithHeaders(com.safedk.android.utils.h.r, view, webResourceRequest, super.shouldInterceptRequest(view, webResourceRequest));
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            Logger.d("MyTarget|SafeDK: Execution> Lcom/my/target/fk$a;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z");
            boolean safedk_fk$a_shouldOverrideUrlLoading_942e258a48186662ba0ab7b96284d17b = safedk_fk$a_shouldOverrideUrlLoading_942e258a48186662ba0ab7b96284d17b(webView, str);
            BrandSafetyUtils.onShouldOverrideUrlLoading(com.safedk.android.utils.h.r, webView, str, safedk_fk$a_shouldOverrideUrlLoading_942e258a48186662ba0ab7b96284d17b);
            return safedk_fk$a_shouldOverrideUrlLoading_942e258a48186662ba0ab7b96284d17b;
        }
    }

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    class b extends WebChromeClient {
        b() {
        }

        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(WebView webView, int i) {
            if (i < 100 && fk.this.l.getVisibility() == 8) {
                fk.this.l.setVisibility(0);
                fk.this.g.setVisibility(8);
            }
            fk.this.l.setProgress(i);
            if (i >= 100) {
                fk.this.l.setVisibility(8);
                fk.this.g.setVisibility(0);
            }
        }

        @Override // android.webkit.WebChromeClient
        public void onReceivedTitle(WebView webView, String str) {
            super.onReceivedTitle(webView, str);
            fk.this.e.setText(webView.getTitle());
            fk.this.e.setVisibility(0);
        }
    }

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    private class c implements View.OnClickListener {
        private c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            fk fkVar = fk.this;
            if (view != fkVar.b) {
                if (view == fkVar.i) {
                    fkVar.e();
                }
            } else {
                d dVar = fkVar.m;
                if (dVar != null) {
                    dVar.a();
                }
            }
        }
    }

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    public interface d {
        void a();
    }

    public fk(Context context) {
        super(context);
        this.j = new RelativeLayout(context);
        this.k = new b1(context);
        this.b = new ImageButton(context);
        this.c = new LinearLayout(context);
        this.d = new TextView(context);
        this.e = new TextView(context);
        this.f = new FrameLayout(context);
        this.h = new FrameLayout(context);
        this.i = new ImageButton(context);
        this.l = new ProgressBar(context, null, android.R.attr.progressBarStyleHorizontal);
        this.g = new View(context);
        this.a = qi.g(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        String url = this.k.getUrl();
        if (TextUtils.isEmpty(url)) {
            return;
        }
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(url));
            if (!(getContext() instanceof Activity)) {
                intent.addFlags(268435456);
            }
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(getContext(), intent);
        } catch (Throwable unused) {
            mi.a("WebViewBrowser: Unable to open url " + url);
        }
    }

    private void f() {
        setOrientation(1);
        setGravity(16);
        c cVar = new c();
        this.k.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        TypedValue typedValue = new TypedValue();
        int b2 = this.a.b(50);
        if (getContext().getTheme().resolveAttribute(android.R.attr.actionBarSize, typedValue, true)) {
            b2 = TypedValue.complexToDimensionPixelSize(typedValue.data, getResources().getDisplayMetrics());
        }
        this.j.setLayoutParams(new LinearLayout.LayoutParams(-1, b2));
        this.f.setLayoutParams(new LinearLayout.LayoutParams(b2, b2));
        FrameLayout frameLayout = this.f;
        int i = n;
        frameLayout.setId(i);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        this.b.setLayoutParams(layoutParams);
        this.b.setImageBitmap(a1.a(b2 / 4, this.a.b(2)));
        this.b.setContentDescription("Close");
        this.b.setOnClickListener(cVar);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(b2, b2);
        layoutParams2.addRule(21);
        this.h.setLayoutParams(layoutParams2);
        FrameLayout frameLayout2 = this.h;
        int i2 = o;
        frameLayout2.setId(i2);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams3.gravity = 17;
        this.i.setLayoutParams(layoutParams3);
        this.i.setImageBitmap(a1.b(getContext()));
        this.i.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.i.setContentDescription("Open outside");
        this.i.setOnClickListener(cVar);
        qi.a(this.b, 0, -3355444);
        qi.a(this.i, 0, -3355444);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams4.addRule(15, -1);
        layoutParams4.addRule(1, i);
        layoutParams4.addRule(0, i2);
        this.c.setLayoutParams(layoutParams4);
        this.c.setOrientation(1);
        this.c.setPadding(this.a.b(4), this.a.b(4), this.a.b(4), this.a.b(4));
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-2, -2);
        this.e.setVisibility(8);
        this.e.setLayoutParams(layoutParams5);
        this.e.setTextColor(-16777216);
        this.e.setTextSize(2, 18.0f);
        this.e.setSingleLine();
        TextView textView = this.e;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.MIDDLE;
        textView.setEllipsize(truncateAt);
        this.d.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        this.d.setSingleLine();
        this.d.setTextSize(2, 12.0f);
        this.d.setEllipsize(truncateAt);
        ClipDrawable clipDrawable = new ClipDrawable(new ColorDrawable(-16537100), 8388611, 1);
        ColorDrawable colorDrawable = new ColorDrawable(-1968642);
        LayerDrawable layerDrawable = (LayerDrawable) this.l.getProgressDrawable();
        layerDrawable.setDrawableByLayerId(android.R.id.background, colorDrawable);
        layerDrawable.setDrawableByLayerId(android.R.id.progress, clipDrawable);
        this.l.setProgressDrawable(layerDrawable);
        this.l.setLayoutParams(new LinearLayout.LayoutParams(-1, this.a.b(2)));
        this.l.setProgress(0);
        this.c.addView(this.e);
        this.c.addView(this.d);
        this.f.addView(this.b);
        this.h.addView(this.i);
        this.j.addView(this.f);
        this.j.addView(this.c);
        this.j.addView(this.h);
        addView(this.j);
        this.g.setBackgroundColor(-5592406);
        RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(-1, 1);
        this.g.setVisibility(8);
        this.g.setLayoutParams(layoutParams6);
        addView(this.l);
        addView(this.g);
        addView(this.k);
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p0, Intent p1) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p1, com.safedk.android.utils.h.r);
        p0.startActivity(p1);
    }

    public boolean a() {
        return this.k.a();
    }

    public void b() {
        this.k.setWebChromeClient(null);
        this.k.a(0);
    }

    public void c() {
        this.k.b();
    }

    public void d() {
        WebSettings settings = this.k.getSettings();
        if (settings != null) {
            settings.setJavaScriptEnabled(true);
            settings.setLoadWithOverviewMode(true);
            settings.setUseWideViewPort(true);
            settings.setBuiltInZoomControls(true);
            settings.setDisplayZoomControls(false);
            settings.setAllowFileAccessFromFileURLs(false);
            settings.setAllowUniversalAccessFromFileURLs(false);
            settings.setDomStorageEnabled(true);
        }
        this.k.setWebViewClient(new a());
        this.k.setWebChromeClient(new b());
        f();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.r, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public void setListener(@Nullable d dVar) {
        this.m = dVar;
    }

    public void setUrl(@NonNull String str) {
        this.k.a(str);
        this.d.setText(a(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String a(String str) {
        try {
            URI uri = new URI(str);
            return uri.getScheme() + "://" + uri.getHost();
        } catch (Throwable th) {
            th.printStackTrace();
            return str;
        }
    }
}
