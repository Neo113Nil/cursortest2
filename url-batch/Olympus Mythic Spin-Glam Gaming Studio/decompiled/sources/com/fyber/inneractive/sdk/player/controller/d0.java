package com.fyber.inneractive.sdk.player.controller;

import android.view.View;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;

/* loaded from: classes12.dex */
public final class d0 implements View.OnClickListener {
    public final /* synthetic */ f0 a;

    public d0(f0 f0Var) {
        this.a = f0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Logger.d("DTExchange|SafeDK: Execution> Lcom/fyber/inneractive/sdk/player/controller/d0;->onClick(Landroid/view/View;)V");
        CreativeInfoManager.onViewClicked(com.safedk.android.utils.h.p, view);
        safedk_d0_onClick_551b6fca0ffcd85e1039d424c1c59acc(view);
    }

    public void safedk_d0_onClick_551b6fca0ffcd85e1039d424c1c59acc(View p0) {
        this.a.b.dismiss();
        v vVar = this.a.a;
        vVar.b.d(vVar.a);
    }
}
