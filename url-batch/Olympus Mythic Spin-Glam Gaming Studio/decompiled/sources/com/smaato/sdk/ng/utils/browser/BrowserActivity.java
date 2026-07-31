package com.smaato.sdk.ng.utils.browser;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.h;
import com.smaato.sdk.ng.R;

/* loaded from: classes14.dex */
public class BrowserActivity extends Activity implements BrowserView {
    private static final String g = "com.smaato.sdk.ng.utils.browser.BrowserActivity";
    private WebView a;
    private TextView b;
    private ProgressBar c;
    private View d;
    private View e;
    protected BrowserPresenter f;

    public interface WebViewCloseListener {
        void onWebViewCloseRequested();
    }

    class a extends DoubleClickPreventionListener {
        a() {
        }

        @Override // com.smaato.sdk.ng.utils.browser.DoubleClickPreventionListener
        protected void a() {
            BrowserActivity.this.finish();
        }
    }

    class b extends DoubleClickPreventionListener {
        b() {
        }

        @Override // com.smaato.sdk.ng.utils.browser.DoubleClickPreventionListener
        protected void a() {
            BrowserPresenter browserPresenter = BrowserActivity.this.f;
            if (browserPresenter != null) {
                browserPresenter.onReloadClicked();
            }
        }
    }

    class c extends DoubleClickPreventionListener {
        c() {
        }

        @Override // com.smaato.sdk.ng.utils.browser.DoubleClickPreventionListener
        protected void a() {
            BrowserPresenter browserPresenter = BrowserActivity.this.f;
            if (browserPresenter != null) {
                browserPresenter.onPageNavigationBackClicked();
            }
        }
    }

    class d extends DoubleClickPreventionListener {
        d() {
        }

        @Override // com.smaato.sdk.ng.utils.browser.DoubleClickPreventionListener
        protected void a() {
            BrowserPresenter browserPresenter = BrowserActivity.this.f;
            if (browserPresenter != null) {
                browserPresenter.onPageNavigationForwardClicked();
            }
        }
    }

    public static Intent createIntent(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) BrowserActivity.class);
        intent.addFlags(536870912);
        intent.putExtra("KEY_CTA_URL", str);
        return intent;
    }

    private void e() {
        BrowserPresenter browserPresenter;
        WebView webView = this.a;
        if (webView != null && (browserPresenter = this.f) != null) {
            browserPresenter.initWithView(this, webView);
        }
        String stringExtra = getIntent().getStringExtra("KEY_CTA_URL");
        BrowserPresenter browserPresenter2 = this.f;
        if (browserPresenter2 != null) {
            browserPresenter2.loadUrl(stringExtra);
        }
    }

    private void f() {
        this.a = (WebView) findViewById(R.id.webView);
        this.c = (ProgressBar) findViewById(R.id.progressBar);
        findViewById(R.id.btnClose).setOnClickListener(b());
        findViewById(R.id.btnRefresh).setOnClickListener(d());
        View findViewById = findViewById(R.id.btnBackward);
        this.d = findViewById;
        findViewById.setOnClickListener(a());
        View findViewById2 = findViewById(R.id.btnForward);
        this.e = findViewById2;
        findViewById2.setOnClickListener(c());
        TextView textView = (TextView) findViewById(R.id.tvHostname);
        this.b = textView;
        textView.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.smaato.sdk.ng.utils.browser.BrowserActivity$$ExternalSyntheticLambda0
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                boolean a2;
                a2 = BrowserActivity.this.a(view);
                return a2;
            }
        });
    }

    private void g() {
        WebView webView = this.a;
        if (webView != null) {
            WebSettings settings = webView.getSettings();
            settings.setUseWideViewPort(true);
            settings.setSupportZoom(true);
            settings.setDomStorageEnabled(true);
            settings.setBuiltInZoomControls(true);
            settings.setDisplayZoomControls(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        finish();
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p0, Intent p1) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p1, h.v);
        p0.startActivity(p1);
    }

    protected DoubleClickPreventionListener a() {
        return new c();
    }

    protected DoubleClickPreventionListener b() {
        return new a();
    }

    protected DoubleClickPreventionListener c() {
        return new d();
    }

    @Override // com.smaato.sdk.ng.utils.browser.BrowserView
    public void closeBrowser() {
        finish();
    }

    protected DoubleClickPreventionListener d() {
        return new b();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.activityOnTouch(this, h.v, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // com.smaato.sdk.ng.utils.browser.BrowserView
    public void hideProgressIndicator() {
        ProgressBar progressBar = this.c;
        if (progressBar != null) {
            progressBar.setVisibility(4);
        }
    }

    @Override // com.smaato.sdk.ng.utils.browser.BrowserView
    public void launchExternalBrowser(Intent intent) {
        try {
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(this, intent);
        } catch (ActivityNotFoundException e) {
            e.printStackTrace();
            com.smaato.sdk.ng.utils.Logger.e(g, "The url seems to be invalid while launching external browser");
        }
        finish();
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f = new BrowserPresenter(new BrowserModel(new BaseWebViewClient(new WebViewCloseListener() { // from class: com.smaato.sdk.ng.utils.browser.BrowserActivity$$ExternalSyntheticLambda1
            @Override // com.smaato.sdk.ng.utils.browser.BrowserActivity.WebViewCloseListener
            public final void onWebViewCloseRequested() {
                BrowserActivity.this.h();
            }
        }), new BaseWebChromeClient(), new BrowserCookieManager(CookieManager.getInstance())), new UrlCreator(), (ClipboardManager) getApplication().getSystemService("clipboard"));
        setContentView(R.layout.activity_internal_browser);
        f();
        g();
        e();
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        WebView webView = this.a;
        if (webView != null) {
            webView.destroy();
        }
        BrowserPresenter browserPresenter = this.f;
        if (browserPresenter != null) {
            browserPresenter.dropView();
        }
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        BrowserPresenter browserPresenter = this.f;
        if (browserPresenter != null) {
            browserPresenter.onPause();
        }
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        BrowserPresenter browserPresenter = this.f;
        if (browserPresenter != null) {
            browserPresenter.onResume();
        }
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
    }

    @Override // com.smaato.sdk.ng.utils.browser.BrowserView
    public void redirectToExternalApp(Intent intent) {
        try {
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(this, intent);
        } catch (ActivityNotFoundException e) {
            e.printStackTrace();
            com.smaato.sdk.ng.utils.Logger.e(g, "The url seems to be invalid while redirecting to external app");
        }
    }

    @Override // com.smaato.sdk.ng.utils.browser.BrowserView
    public void setPageNavigationBackEnabled(boolean z) {
        View view = this.d;
        if (view != null) {
            view.setEnabled(z);
        }
    }

    @Override // com.smaato.sdk.ng.utils.browser.BrowserView
    public void setPageNavigationForwardEnabled(boolean z) {
        View view = this.e;
        if (view != null) {
            view.setEnabled(z);
        }
    }

    @Override // com.smaato.sdk.ng.utils.browser.BrowserView
    public void showConnectionSecure(boolean z) {
        int i = z ? R.drawable.browser_secure_connection : 0;
        TextView textView = this.b;
        if (textView != null) {
            textView.setCompoundDrawablesWithIntrinsicBounds(i, 0, 0, 0);
        }
    }

    @Override // com.smaato.sdk.ng.utils.browser.BrowserView
    public void showHostname(String str) {
        TextView textView = this.b;
        if (textView != null) {
            textView.setText(str);
        }
    }

    @Override // com.smaato.sdk.ng.utils.browser.BrowserView
    public void showProgressIndicator() {
        ProgressBar progressBar = this.c;
        if (progressBar != null) {
            progressBar.setVisibility(0);
        }
    }

    @Override // com.smaato.sdk.ng.utils.browser.BrowserView
    public void updateProgressIndicator(int i) {
        ProgressBar progressBar = this.c;
        if (progressBar != null) {
            progressBar.setProgress(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean a(View view) {
        BrowserPresenter browserPresenter = this.f;
        if (browserPresenter == null) {
            return false;
        }
        browserPresenter.onCopyHostnameClicked();
        return true;
    }
}
