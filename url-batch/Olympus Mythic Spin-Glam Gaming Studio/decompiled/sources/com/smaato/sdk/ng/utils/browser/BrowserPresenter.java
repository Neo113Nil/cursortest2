package com.smaato.sdk.ng.utils.browser;

import android.annotation.TargetApi;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.smaato.sdk.ng.utils.Logger;
import com.smaato.sdk.ng.utils.browser.BrowserModel;

/* loaded from: classes10.dex */
public class BrowserPresenter {
    private static final String f = "com.smaato.sdk.ng.utils.browser.BrowserPresenter";
    private final BrowserModel a;
    private final UrlCreator b;
    private final ClipboardManager c;
    private BrowserView d;
    private final BrowserModel.Callback e;

    class a implements BrowserModel.Callback {
        a() {
        }

        @Override // com.smaato.sdk.ng.utils.browser.BrowserModel.Callback
        public void onGeneralError(int i, String str, String str2) {
        }

        @Override // com.smaato.sdk.ng.utils.browser.BrowserModel.Callback
        @TargetApi(23)
        public void onHttpError(WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        }

        @Override // com.smaato.sdk.ng.utils.browser.BrowserModel.Callback
        public void onPageNavigationStackChanged(boolean z, boolean z2) {
            BrowserPresenter.this.a(z, z2);
        }

        @Override // com.smaato.sdk.ng.utils.browser.BrowserModel.Callback
        public void onProgressChanged(int i) {
            BrowserView browserView = BrowserPresenter.this.d;
            if (browserView != null && i >= 0 && i <= 100) {
                if (i == 100) {
                    browserView.hideProgressIndicator();
                } else {
                    browserView.updateProgressIndicator(i);
                    BrowserPresenter.this.d.showProgressIndicator();
                }
            }
        }

        @Override // com.smaato.sdk.ng.utils.browser.BrowserModel.Callback
        @TargetApi(26)
        public void onRenderProcessGone() {
            BrowserView browserView = BrowserPresenter.this.d;
            if (browserView != null) {
                browserView.closeBrowser();
            }
        }

        @Override // com.smaato.sdk.ng.utils.browser.BrowserModel.Callback
        public void onUrlLoadingStarted(String str) {
            BrowserPresenter.this.a(str);
        }

        @Override // com.smaato.sdk.ng.utils.browser.BrowserModel.Callback
        public boolean shouldOverrideUrlLoading(String str) {
            BrowserPresenter.this.loadUrl(str);
            return true;
        }
    }

    BrowserPresenter(BrowserModel browserModel, UrlCreator urlCreator, ClipboardManager clipboardManager) {
        a aVar = new a();
        this.e = aVar;
        if (browserModel == null) {
            throw new NullPointerException("browserModel can not be null");
        }
        this.a = browserModel;
        if (urlCreator == null) {
            throw new NullPointerException("urlCreator can not be null");
        }
        this.b = urlCreator;
        if (clipboardManager == null) {
            throw new NullPointerException("clipboardManager can not be null");
        }
        this.c = clipboardManager;
        browserModel.a(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        if (this.d == null) {
            return;
        }
        this.d.showHostname(this.b.extractHostname(str));
        this.d.showConnectionSecure(this.b.isSecureScheme(this.b.extractScheme(str)));
    }

    public void dropView() {
        this.d = null;
    }

    public void initWithView(BrowserView browserView, WebView webView) {
        if (browserView == null || webView == null) {
            return;
        }
        this.d = browserView;
        this.a.a(webView);
    }

    public void loadUrl(String str) {
        this.a.a(str);
    }

    public void onCopyHostnameClicked() {
        this.c.setPrimaryClip(ClipData.newPlainText(null, this.a.a()));
        Logger.d(f, "Link copied");
    }

    public void onPageNavigationBackClicked() {
        this.a.b();
    }

    public void onPageNavigationForwardClicked() {
        this.a.c();
    }

    public void onPause() {
        this.a.d();
    }

    public void onReloadClicked() {
        this.a.e();
    }

    public void onResume() {
        this.a.f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z, boolean z2) {
        BrowserView browserView = this.d;
        if (browserView == null) {
            return;
        }
        browserView.setPageNavigationBackEnabled(z);
        this.d.setPageNavigationForwardEnabled(z2);
    }
}
