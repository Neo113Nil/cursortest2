package com.fyber.inneractive.sdk.activities;

import android.view.View;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;

/* loaded from: classes6.dex */
public final class d implements View.OnClickListener {
    public final /* synthetic */ InneractiveFullscreenAdActivity a;

    public d(InneractiveFullscreenAdActivity inneractiveFullscreenAdActivity) {
        this.a = inneractiveFullscreenAdActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Logger.d("DTExchange|SafeDK: Execution> Lcom/fyber/inneractive/sdk/activities/d;->onClick(Landroid/view/View;)V");
        CreativeInfoManager.onViewClicked(com.safedk.android.utils.h.p, view);
        safedk_d_onClick_53433ba785fbce6dfb368015a84bf8b7(view);
    }

    public void safedk_d_onClick_53433ba785fbce6dfb368015a84bf8b7(View p0) {
        this.a.dismissAd(true);
    }
}
