package com.my.target;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Outline;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import com.my.target.ck;
import com.my.target.common.CustomParams;
import com.my.target.common.webform.UserInfo;
import com.my.target.common.webform.WebForm;
import com.my.target.common.webform.WebFormClient;
import com.my.target.common.webform.WebFormSetViewSettings;
import com.my.target.o;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes5.dex */
public final class ck implements WebForm, o.a {
    private final WebFormClient a;
    private final o b;
    private final ek c;

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    class a extends WebViewClient {
        final /* synthetic */ WebFormClient a;

        a(WebFormClient webFormClient) {
            this.a = webFormClient;
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
        public void onReceivedError(WebView webView, int i, String str, String str2) {
            Logger.d("MyTarget|SafeDK: Execution> Lcom/my/target/ck$a;->onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V");
            BrandSafetyUtils.onWebViewReceivedError(com.safedk.android.utils.h.r, webView, i, str, str2);
            safedk_ck$a_onReceivedError_a5d32685a99a6a1c06d7d5122ce2b670(webView, i, str, str2);
        }

        public void safedk_ck$a_onReceivedError_a5d32685a99a6a1c06d7d5122ce2b670(WebView p0, int p1, String p2, String p3) {
            View errorView;
            super.onReceivedError(p0, p1, p2, p3);
            WebFormClient webFormClient = this.a;
            if (webFormClient == null || (errorView = webFormClient.getErrorView(p2, ck.this)) == null) {
                return;
            }
            ck.this.c.a(errorView);
        }

        @Override // android.webkit.WebViewClient
        public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest webResourceRequest) {
            return CreativeInfoManager.onWebViewResponseWithHeaders(com.safedk.android.utils.h.r, view, webResourceRequest, super.shouldInterceptRequest(view, webResourceRequest));
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            boolean shouldOverrideUrlLoading = super.shouldOverrideUrlLoading(view, url);
            BrandSafetyUtils.onShouldOverrideUrlLoading(com.safedk.android.utils.h.r, view, url, shouldOverrideUrlLoading);
            return shouldOverrideUrlLoading;
        }
    }

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    class b extends ViewOutlineProvider {
        final /* synthetic */ int a;

        b(int i) {
            this.a = i;
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            int width = view.getWidth();
            int height = view.getHeight();
            int i = this.a;
            outline.setRoundRect(0, 0, width, height + i, i);
            view.setClipToOutline(true);
        }
    }

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    final class c implements zj {
        private final WebFormClient a;
        private final WebForm b;
        private final CustomParams c;
        private final Context d;

        c(WebFormClient webFormClient, WebForm webForm, CustomParams customParams, Context context) {
            this.a = webFormClient;
            this.b = webForm;
            this.c = customParams;
            this.d = context;
        }

        @Override // com.my.target.zj
        public void a() {
            ck.this.dismiss();
        }

        @Override // com.my.target.zj
        public void a(String str) {
            WebFormClient webFormClient;
            ((ClipboardManager) this.d.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(null, str));
            if (TextUtils.isEmpty(str) || (webFormClient = this.a) == null) {
                return;
            }
            webFormClient.onCopyText(str, this.b);
        }

        @Override // com.my.target.zj
        public void a(WebFormSetViewSettings webFormSetViewSettings) {
            WebFormClient webFormClient;
            if (webFormSetViewSettings == null || (webFormClient = this.a) == null) {
                return;
            }
            webFormClient.setViewSettings(webFormSetViewSettings, this.b);
        }

        @Override // com.my.target.zj
        public void a(final int i) {
            WebFormClient webFormClient;
            if (i < 0 || (webFormClient = this.a) == null) {
                return;
            }
            UserInfo customSdkUserInfo = webFormClient.getCustomSdkUserInfo(this.b);
            if (customSdkUserInfo != null) {
                bk.a(ck.this.c, customSdkUserInfo, this.c.getVKId(), i);
            } else {
                this.a.getCustomSdkUserInfo(this.b, new WebFormClient.CustomSdkUserInfoCallback() { // from class: com.my.target.ck$c$$ExternalSyntheticLambda0
                    @Override // com.my.target.common.webform.WebFormClient.CustomSdkUserInfoCallback
                    public final void onGetUserInfo(UserInfo userInfo) {
                        ck.c.this.a(i, userInfo);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(final int i, final UserInfo userInfo) {
            if (userInfo == null) {
                return;
            }
            o0.e(new Runnable() { // from class: com.my.target.ck$c$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    ck.c.this.a(userInfo, i);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(UserInfo userInfo, int i) {
            bk.a(ck.this.c, userInfo, this.c.getVKId(), i);
        }
    }

    private ck(String str, WebFormClient webFormClient, CustomParams customParams, Context context) {
        this.a = webFormClient;
        this.c = new ek(str, new yj(new c(webFormClient, this, customParams, context)), new a(webFormClient), context);
        this.b = o.a(this, context);
    }

    public static void a(String str, WebFormClient webFormClient, CustomParams customParams, Context context) {
        new ck(str, webFormClient, customParams, context).a();
    }

    @Override // com.my.target.o.a
    public void b(boolean z) {
    }

    @Override // com.my.target.common.webform.WebForm
    public void dismiss() {
        this.b.dismiss();
    }

    @Override // com.my.target.o.a
    public void m() {
        WebFormClient webFormClient = this.a;
        if (webFormClient == null) {
            return;
        }
        webFormClient.onDismiss(this);
    }

    @Override // com.my.target.common.webform.WebForm
    public void reload() {
        this.c.g();
    }

    private void a() {
        try {
            this.b.show();
        } catch (Throwable unused) {
            mi.b("WebFormView: Unable to start WebForm dialog");
            m();
        }
    }

    @Override // com.my.target.o.a
    public void a(o oVar, FrameLayout frameLayout) {
        frameLayout.setBackground(new ColorDrawable(1711276032));
        frameLayout.setAlpha(0.0f);
        frameLayout.animate().alpha(1.0f).setDuration(300L).start();
        DisplayMetrics displayMetrics = frameLayout.getContext().getResources().getDisplayMetrics();
        this.c.setOutlineProvider(new b((int) TypedValue.applyDimension(1, 16.0f, displayMetrics)));
        frameLayout.addView(this.c, -1, -1);
        View akVar = new ak(frameLayout.getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 36.0f, displayMetrics), (int) TypedValue.applyDimension(1, 36.0f, displayMetrics));
        layoutParams.gravity = 8388661;
        int applyDimension = (int) TypedValue.applyDimension(1, 8.0f, displayMetrics);
        layoutParams.setMargins(0, applyDimension, applyDimension, 0);
        frameLayout.addView(akVar, layoutParams);
        akVar.setOnClickListener(new View.OnClickListener() { // from class: com.my.target.ck$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ck.this.a(view);
            }
        });
        this.c.i();
        WebFormClient webFormClient = this.a;
        if (webFormClient == null) {
            return;
        }
        webFormClient.onPresent(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        dismiss();
    }
}
