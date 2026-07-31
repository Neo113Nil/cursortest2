package net.pubnative.lite.sdk.utils.browser;

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
import net.pubnative.lite.sdk.R;

/* loaded from: classes8.dex */
public class BrowserActivity extends Activity implements BrowserView {
    private static final String KEY_CTA_URL = "KEY_CTA_URL";
    private static final String TAG = "net.pubnative.lite.sdk.utils.browser.BrowserActivity";
    protected BrowserPresenter browserPresenter;
    private View btnNavigationBackward;
    private View btnNavigationForward;
    private ProgressBar progressBar;
    private TextView tvHostname;
    private WebView webView;

    public interface WebViewCloseListener {
        void onWebViewCloseRequested();
    }

    public static Intent createIntent(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) BrowserActivity.class);
        intent.addFlags(536870912);
        intent.putExtra(KEY_CTA_URL, str);
        return intent;
    }

    private void initLogic() {
        BrowserPresenter browserPresenter;
        WebView webView = this.webView;
        if (webView != null && (browserPresenter = this.browserPresenter) != null) {
            browserPresenter.initWithView(this, webView);
        }
        String stringExtra = getIntent().getStringExtra(KEY_CTA_URL);
        BrowserPresenter browserPresenter2 = this.browserPresenter;
        if (browserPresenter2 != null) {
            browserPresenter2.loadUrl(stringExtra);
        }
    }

    private void initViews() {
        this.webView = (WebView) findViewById(R.id.webView);
        this.progressBar = (ProgressBar) findViewById(R.id.progressBar);
        findViewById(R.id.btnClose).setOnClickListener(createCloseButtonListener());
        findViewById(R.id.btnRefresh).setOnClickListener(createRefreshButtonListener());
        View findViewById = findViewById(R.id.btnBackward);
        this.btnNavigationBackward = findViewById;
        findViewById.setOnClickListener(createBackwardButtonListener());
        View findViewById2 = findViewById(R.id.btnForward);
        this.btnNavigationForward = findViewById2;
        findViewById2.setOnClickListener(createForwardButtonListener());
        TextView textView = (TextView) findViewById(R.id.tvHostname);
        this.tvHostname = textView;
        textView.setOnLongClickListener(new View.OnLongClickListener() { // from class: net.pubnative.lite.sdk.utils.browser.BrowserActivity$$ExternalSyntheticLambda1
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                boolean lambda$initViews$0;
                lambda$initViews$0 = BrowserActivity.this.lambda$initViews$0(view);
                return lambda$initViews$0;
            }
        });
    }

    private void initWebView() {
        WebView webView = this.webView;
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
    public /* synthetic */ boolean lambda$initViews$0(View view) {
        BrowserPresenter browserPresenter = this.browserPresenter;
        if (browserPresenter == null) {
            return false;
        }
        browserPresenter.onCopyHostnameClicked();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onWebViewCloseRequested() {
        finish();
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p0, Intent p1) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p1, h.C);
        p0.startActivity(p1);
    }

    @Override // net.pubnative.lite.sdk.utils.browser.BrowserView
    public void closeBrowser() {
        finish();
    }

    protected DoubleClickPreventionListener createBackwardButtonListener() {
        return new DoubleClickPreventionListener() { // from class: net.pubnative.lite.sdk.utils.browser.BrowserActivity.3
            @Override // net.pubnative.lite.sdk.utils.browser.DoubleClickPreventionListener
            protected void processClick() {
                BrowserPresenter browserPresenter = BrowserActivity.this.browserPresenter;
                if (browserPresenter != null) {
                    browserPresenter.onPageNavigationBackClicked();
                }
            }
        };
    }

    protected DoubleClickPreventionListener createCloseButtonListener() {
        return new DoubleClickPreventionListener() { // from class: net.pubnative.lite.sdk.utils.browser.BrowserActivity.1
            @Override // net.pubnative.lite.sdk.utils.browser.DoubleClickPreventionListener
            protected void processClick() {
                BrowserActivity.this.finish();
            }
        };
    }

    protected DoubleClickPreventionListener createForwardButtonListener() {
        return new DoubleClickPreventionListener() { // from class: net.pubnative.lite.sdk.utils.browser.BrowserActivity.4
            @Override // net.pubnative.lite.sdk.utils.browser.DoubleClickPreventionListener
            protected void processClick() {
                BrowserPresenter browserPresenter = BrowserActivity.this.browserPresenter;
                if (browserPresenter != null) {
                    browserPresenter.onPageNavigationForwardClicked();
                }
            }
        };
    }

    protected DoubleClickPreventionListener createRefreshButtonListener() {
        return new DoubleClickPreventionListener() { // from class: net.pubnative.lite.sdk.utils.browser.BrowserActivity.2
            @Override // net.pubnative.lite.sdk.utils.browser.DoubleClickPreventionListener
            protected void processClick() {
                BrowserPresenter browserPresenter = BrowserActivity.this.browserPresenter;
                if (browserPresenter != null) {
                    browserPresenter.onReloadClicked();
                }
            }
        };
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.activityOnTouch(this, h.C, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // net.pubnative.lite.sdk.utils.browser.BrowserView
    public void hideProgressIndicator() {
        ProgressBar progressBar = this.progressBar;
        if (progressBar != null) {
            progressBar.setVisibility(4);
        }
    }

    @Override // net.pubnative.lite.sdk.utils.browser.BrowserView
    public void launchExternalBrowser(Intent intent) {
        try {
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(this, intent);
        } catch (ActivityNotFoundException e) {
            e.printStackTrace();
            net.pubnative.lite.sdk.utils.Logger.e(TAG, "The url seems to be invalid while launching external browser");
        }
        finish();
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.browserPresenter = new BrowserPresenter(new BrowserModel(new BaseWebViewClient(new WebViewCloseListener() { // from class: net.pubnative.lite.sdk.utils.browser.BrowserActivity$$ExternalSyntheticLambda0
            @Override // net.pubnative.lite.sdk.utils.browser.BrowserActivity.WebViewCloseListener
            public final void onWebViewCloseRequested() {
                BrowserActivity.this.onWebViewCloseRequested();
            }
        }), new BaseWebChromeClient(), new BrowserCookieManager(CookieManager.getInstance())), new UrlCreator(), (ClipboardManager) getApplication().getSystemService("clipboard"));
        setContentView(R.layout.activity_internal_browser);
        initViews();
        initWebView();
        initLogic();
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        WebView webView = this.webView;
        if (webView != null) {
            webView.destroy();
        }
        BrowserPresenter browserPresenter = this.browserPresenter;
        if (browserPresenter != null) {
            browserPresenter.dropView();
        }
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        BrowserPresenter browserPresenter = this.browserPresenter;
        if (browserPresenter != null) {
            browserPresenter.onPause();
        }
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        BrowserPresenter browserPresenter = this.browserPresenter;
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

    @Override // net.pubnative.lite.sdk.utils.browser.BrowserView
    public void redirectToExternalApp(Intent intent) {
        try {
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(this, intent);
        } catch (ActivityNotFoundException e) {
            e.printStackTrace();
            net.pubnative.lite.sdk.utils.Logger.e(TAG, "The url seems to be invalid while redirecting to external app");
        }
    }

    @Override // net.pubnative.lite.sdk.utils.browser.BrowserView
    public void setPageNavigationBackEnabled(boolean z) {
        View view = this.btnNavigationBackward;
        if (view != null) {
            view.setEnabled(z);
        }
    }

    @Override // net.pubnative.lite.sdk.utils.browser.BrowserView
    public void setPageNavigationForwardEnabled(boolean z) {
        View view = this.btnNavigationForward;
        if (view != null) {
            view.setEnabled(z);
        }
    }

    @Override // net.pubnative.lite.sdk.utils.browser.BrowserView
    public void showConnectionSecure(boolean z) {
        int i = z ? R.drawable.browser_secure_connection : 0;
        TextView textView = this.tvHostname;
        if (textView != null) {
            textView.setCompoundDrawablesWithIntrinsicBounds(i, 0, 0, 0);
        }
    }

    @Override // net.pubnative.lite.sdk.utils.browser.BrowserView
    public void showHostname(String str) {
        TextView textView = this.tvHostname;
        if (textView != null) {
            textView.setText(str);
        }
    }

    @Override // net.pubnative.lite.sdk.utils.browser.BrowserView
    public void showProgressIndicator() {
        ProgressBar progressBar = this.progressBar;
        if (progressBar != null) {
            progressBar.setVisibility(0);
        }
    }

    @Override // net.pubnative.lite.sdk.utils.browser.BrowserView
    public void updateProgressIndicator(int i) {
        ProgressBar progressBar = this.progressBar;
        if (progressBar != null) {
            progressBar.setProgress(i);
        }
    }
}
