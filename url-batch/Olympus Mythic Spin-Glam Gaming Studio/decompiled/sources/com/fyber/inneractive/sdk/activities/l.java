package com.fyber.inneractive.sdk.activities;

import android.view.View;
import android.webkit.WebView;
import com.fyber.inneractive.sdk.util.IAlog;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;

/* loaded from: classes6.dex */
public final class l implements View.OnClickListener {
    public final /* synthetic */ InneractiveInternalBrowserActivity a;

    public l(InneractiveInternalBrowserActivity inneractiveInternalBrowserActivity) {
        this.a = inneractiveInternalBrowserActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Logger.d("DTExchange|SafeDK: Execution> Lcom/fyber/inneractive/sdk/activities/l;->onClick(Landroid/view/View;)V");
        CreativeInfoManager.onViewClicked(com.safedk.android.utils.h.p, view);
        safedk_l_onClick_d7c7888abfb6187679676e7d36a80bd0(view);
    }

    public void safedk_l_onClick_d7c7888abfb6187679676e7d36a80bd0(View p0) {
        WebView webView = this.a.e;
        if (webView != null) {
            webView.reload();
            int i = IAlog.a;
            IAlog.d("%s %s", "AD_INTERNAL_BROWSER_REFRESH", this.a.e.getUrl());
        }
    }
}
