package com.fyber.inneractive.sdk.player.controller;

import android.view.View;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;

/* loaded from: classes12.dex */
public final class e0 implements View.OnClickListener {
    public final /* synthetic */ f0 a;

    public e0(f0 f0Var) {
        this.a = f0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Logger.d("DTExchange|SafeDK: Execution> Lcom/fyber/inneractive/sdk/player/controller/e0;->onClick(Landroid/view/View;)V");
        CreativeInfoManager.onViewClicked(com.safedk.android.utils.h.p, view);
        safedk_e0_onClick_4d93ab782816bfab8a321d1b641091a8(view);
    }

    public void safedk_e0_onClick_4d93ab782816bfab8a321d1b641091a8(View p0) {
        this.a.b.dismiss();
        this.a.a.getClass();
    }
}
