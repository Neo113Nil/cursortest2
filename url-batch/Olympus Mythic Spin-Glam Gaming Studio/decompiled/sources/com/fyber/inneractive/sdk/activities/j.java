package com.fyber.inneractive.sdk.activities;

import android.view.View;
import android.webkit.WebView;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;

/* loaded from: classes6.dex */
public final class j implements View.OnClickListener {
    public final /* synthetic */ InneractiveInternalBrowserActivity a;

    public j(InneractiveInternalBrowserActivity inneractiveInternalBrowserActivity) {
        this.a = inneractiveInternalBrowserActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Logger.d("DTExchange|SafeDK: Execution> Lcom/fyber/inneractive/sdk/activities/j;->onClick(Landroid/view/View;)V");
        CreativeInfoManager.onViewClicked(com.safedk.android.utils.h.p, view);
        safedk_j_onClick_de0d2565025937b8ee6b9157ff655a60(view);
    }

    public void safedk_j_onClick_de0d2565025937b8ee6b9157ff655a60(View p0) {
        WebView webView = this.a.e;
        if (webView == null || !webView.canGoBack()) {
            return;
        }
        this.a.e.goBack();
    }
}
