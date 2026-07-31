package com.fyber.inneractive.sdk.activities;

import android.view.View;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;

/* loaded from: classes6.dex */
public final class o implements View.OnClickListener {
    public final /* synthetic */ InneractiveRichMediaVideoPlayerActivityCore a;

    public o(InneractiveRichMediaVideoPlayerActivityCore inneractiveRichMediaVideoPlayerActivityCore) {
        this.a = inneractiveRichMediaVideoPlayerActivityCore;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Logger.d("DTExchange|SafeDK: Execution> Lcom/fyber/inneractive/sdk/activities/o;->onClick(Landroid/view/View;)V");
        CreativeInfoManager.onViewClicked(com.safedk.android.utils.h.p, view);
        safedk_o_onClick_9d08e69ad268a09ef2e64d1a44838d1d(view);
    }

    public void safedk_o_onClick_9d08e69ad268a09ef2e64d1a44838d1d(View p0) {
        this.a.finish();
    }
}
