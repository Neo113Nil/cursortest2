package com.fyber.inneractive.sdk.web;

import android.view.View;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;

/* loaded from: classes6.dex */
public final class o implements View.OnClickListener {
    public final /* synthetic */ i0 a;

    public o(i0 i0Var) {
        this.a = i0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Logger.d("DTExchange|SafeDK: Execution> Lcom/fyber/inneractive/sdk/web/o;->onClick(Landroid/view/View;)V");
        CreativeInfoManager.onViewClicked(com.safedk.android.utils.h.p, view);
        safedk_o_onClick_c06d7a4dcd7b0368031f607e07fcfe21(view);
    }

    public void safedk_o_onClick_c06d7a4dcd7b0368031f607e07fcfe21(View p0) {
        this.a.o();
    }
}
