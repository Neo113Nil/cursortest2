package com.mobilefuse.sdk.omid;

import android.graphics.Bitmap;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.mobilefuse.sdk.StabilityHelper;
import com.mobilefuse.sdk.concurrency.SchedulersKt;
import com.mobilefuse.sdk.exception.ExceptionHandlingStrategy;
import com.mobilefuse.sdk.exception.TryKt;
import com.mobilefuse.sdk.logging.HttpRequestTracker;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.h;
import java.util.ArrayList;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: OmidWebViewReleaser.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000+\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\t\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\r\u0010\b\u001a\u00020\tH\u0002¢\u0006\u0002\u0010\nJ\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0007H\u0002J\u0012\u0010\u000e\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0007H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/mobilefuse/sdk/omid/OmidWebViewReleaser;", "", "()V", "WEB_VIEW_RELEASE_DELAY_MS", "", "lockedWebViews", "", "Landroid/webkit/WebView;", "createWebViewClient", "com/mobilefuse/sdk/omid/OmidWebViewReleaser$createWebViewClient$1", "()Lcom/mobilefuse/sdk/omid/OmidWebViewReleaser$createWebViewClient$1;", "freeWebView", "", "webView", "scheduleWebViewRelease", "mobilefuse-sdk-common_release"}, k = 1, mv = {1, 4, 3})
/* loaded from: classes9.dex */
public final class OmidWebViewReleaser {
    private static final long WEB_VIEW_RELEASE_DELAY_MS = 4000;

    @NotNull
    public static final OmidWebViewReleaser INSTANCE = new OmidWebViewReleaser();
    private static final List<WebView> lockedWebViews = new ArrayList();

    /* JADX INFO: Access modifiers changed from: private */
    public final void freeWebView(WebView webView) {
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            lockedWebViews.remove(webView);
            webView.stopLoading();
            webView.destroy();
        } catch (Throwable th) {
            int i = TryKt.WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            } else if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    private OmidWebViewReleaser() {
    }

    public static final void scheduleWebViewRelease(@Nullable final WebView webView) {
        SchedulersKt.safelyRunOnMainThread$default(null, new Function0() { // from class: com.mobilefuse.sdk.omid.OmidWebViewReleaser$scheduleWebViewRelease$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo4828invoke() {
                invoke();
                return Unit.INSTANCE;
            }

            public final void invoke() {
                List list;
                OmidWebViewReleaser$createWebViewClient$1 createWebViewClient;
                if (webView == null) {
                    return;
                }
                OmidWebViewReleaser omidWebViewReleaser = OmidWebViewReleaser.INSTANCE;
                list = OmidWebViewReleaser.lockedWebViews;
                list.add(webView);
                WebView webView2 = webView;
                createWebViewClient = omidWebViewReleaser.createWebViewClient();
                webView2.setWebViewClient(createWebViewClient);
                SchedulersKt.getGlobalHandler().postDelayed(new Runnable() { // from class: com.mobilefuse.sdk.omid.OmidWebViewReleaser$scheduleWebViewRelease$1.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        OmidWebViewReleaser.INSTANCE.freeWebView(webView);
                    }
                }, 4000L);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.mobilefuse.sdk.omid.OmidWebViewReleaser$createWebViewClient$1] */
    public final OmidWebViewReleaser$createWebViewClient$1 createWebViewClient() {
        return new WebViewClient() { // from class: com.mobilefuse.sdk.omid.OmidWebViewReleaser$createWebViewClient$1
            @Override // android.webkit.WebViewClient
            public void onLoadResource(@Nullable WebView view, @Nullable String url) {
                Logger.d("MobileFuse|SafeDK: Execution> Lcom/mobilefuse/sdk/omid/OmidWebViewReleaser$createWebViewClient$1;->onLoadResource(Landroid/webkit/WebView;Ljava/lang/String;)V");
                CreativeInfoManager.onResourceLoaded(h.E, view, url);
                safedk_OmidWebViewReleaser$createWebViewClient$1_onLoadResource_a0872223919dec9eabd2cc067ee13ec7(view, url);
            }

            @Override // android.webkit.WebViewClient
            public void onPageStarted(WebView view, String url, Bitmap favicon) {
                super.onPageStarted(view, url, favicon);
                BrandSafetyUtils.onWebViewPageStarted(h.E, view, url);
            }

            @Override // android.webkit.WebViewClient
            public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
                super.onReceivedError(view, errorCode, description, failingUrl);
                BrandSafetyUtils.onWebViewReceivedError(h.E, view, errorCode, description, failingUrl);
            }

            @Override // android.webkit.WebViewClient
            public boolean onRenderProcessGone(@Nullable WebView view, @Nullable RenderProcessGoneDetail detail) {
                return true;
            }

            @Deprecated
            public boolean safedk_OmidWebViewReleaser$createWebViewClient$1_shouldOverrideUrlLoading_051f01fbc746cbb1e9d7b390baa403d3(WebView p0, String p1) {
                return true;
            }

            public boolean safedk_OmidWebViewReleaser$createWebViewClient$1_shouldOverrideUrlLoading_438f93665f552b5302b30756ce7e2eea(WebView p0, WebResourceRequest p1) {
                return true;
            }

            @Override // android.webkit.WebViewClient
            public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest webResourceRequest) {
                return CreativeInfoManager.onWebViewResponseWithHeaders(h.E, view, webResourceRequest, super.shouldInterceptRequest(view, webResourceRequest));
            }

            @Override // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(@Nullable WebView view, @Nullable WebResourceRequest request) {
                Logger.d("MobileFuse|SafeDK: Execution> Lcom/mobilefuse/sdk/omid/OmidWebViewReleaser$createWebViewClient$1;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Z");
                boolean safedk_OmidWebViewReleaser$createWebViewClient$1_shouldOverrideUrlLoading_438f93665f552b5302b30756ce7e2eea = safedk_OmidWebViewReleaser$createWebViewClient$1_shouldOverrideUrlLoading_438f93665f552b5302b30756ce7e2eea(view, request);
                BrandSafetyUtils.onShouldOverrideUrlLoading(h.E, view, request, safedk_OmidWebViewReleaser$createWebViewClient$1_shouldOverrideUrlLoading_438f93665f552b5302b30756ce7e2eea);
                return safedk_OmidWebViewReleaser$createWebViewClient$1_shouldOverrideUrlLoading_438f93665f552b5302b30756ce7e2eea;
            }

            @Override // android.webkit.WebViewClient
            @Deprecated
            public boolean shouldOverrideUrlLoading(@Nullable WebView view, @Nullable String url) {
                Logger.d("MobileFuse|SafeDK: Execution> Lcom/mobilefuse/sdk/omid/OmidWebViewReleaser$createWebViewClient$1;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z");
                boolean safedk_OmidWebViewReleaser$createWebViewClient$1_shouldOverrideUrlLoading_051f01fbc746cbb1e9d7b390baa403d3 = safedk_OmidWebViewReleaser$createWebViewClient$1_shouldOverrideUrlLoading_051f01fbc746cbb1e9d7b390baa403d3(view, url);
                BrandSafetyUtils.onShouldOverrideUrlLoading(h.E, view, url, safedk_OmidWebViewReleaser$createWebViewClient$1_shouldOverrideUrlLoading_051f01fbc746cbb1e9d7b390baa403d3);
                return safedk_OmidWebViewReleaser$createWebViewClient$1_shouldOverrideUrlLoading_051f01fbc746cbb1e9d7b390baa403d3;
            }

            public void safedk_OmidWebViewReleaser$createWebViewClient$1_onLoadResource_a0872223919dec9eabd2cc067ee13ec7(WebView p0, String p1) {
                ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
                if (p1 == null) {
                    return;
                }
                try {
                    HttpRequestTracker.logHttpRequest(p1);
                } catch (Throwable th) {
                    int i = TryKt.WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
                    if (i == 1) {
                        StabilityHelper.logException("[Automatically caught]", th);
                    } else if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            }
        };
    }
}
