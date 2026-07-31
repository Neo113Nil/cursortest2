package com.fyber.inneractive.sdk.activities;

import android.view.View;
import android.webkit.WebView;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;

/* loaded from: classes6.dex */
public final class k implements View.OnClickListener {
    public final /* synthetic */ InneractiveInternalBrowserActivity a;

    public k(InneractiveInternalBrowserActivity inneractiveInternalBrowserActivity) {
        this.a = inneractiveInternalBrowserActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Logger.d("DTExchange|SafeDK: Execution> Lcom/fyber/inneractive/sdk/activities/k;->onClick(Landroid/view/View;)V");
        CreativeInfoManager.onViewClicked(com.safedk.android.utils.h.p, view);
        safedk_k_onClick_ba5f94c7940c4319420d8dfee82a8dac(view);
    }

    public void safedk_k_onClick_ba5f94c7940c4319420d8dfee82a8dac(View p0) {
        WebView webView = this.a.e;
        if (webView == null || !webView.canGoForward()) {
            return;
        }
        this.a.e.goForward();
    }
}
