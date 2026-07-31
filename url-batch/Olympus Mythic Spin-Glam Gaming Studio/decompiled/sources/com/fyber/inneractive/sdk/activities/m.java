package com.fyber.inneractive.sdk.activities;

import android.view.View;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;

/* loaded from: classes6.dex */
public final class m implements View.OnClickListener {
    public final /* synthetic */ InneractiveInternalBrowserActivity a;

    public m(InneractiveInternalBrowserActivity inneractiveInternalBrowserActivity) {
        this.a = inneractiveInternalBrowserActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Logger.d("DTExchange|SafeDK: Execution> Lcom/fyber/inneractive/sdk/activities/m;->onClick(Landroid/view/View;)V");
        CreativeInfoManager.onViewClicked(com.safedk.android.utils.h.p, view);
        safedk_m_onClick_5e21165c27f1f5d634df9f274d2a362b(view);
    }

    public void safedk_m_onClick_5e21165c27f1f5d634df9f274d2a362b(View p0) {
        this.a.finish();
    }
}
