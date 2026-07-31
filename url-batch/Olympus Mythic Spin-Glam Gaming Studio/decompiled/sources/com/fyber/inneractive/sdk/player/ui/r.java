package com.fyber.inneractive.sdk.player.ui;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;

/* loaded from: classes6.dex */
public final class r implements View.OnTouchListener {
    public final /* synthetic */ GestureDetector a;

    public r(GestureDetector gestureDetector) {
        this.a = gestureDetector;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        Logger.d("DTExchange|SafeDK: Execution> Lcom/fyber/inneractive/sdk/player/ui/r;->onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        CreativeInfoManager.onViewTouched(com.safedk.android.utils.h.p, view, motionEvent);
        return safedk_r_onTouch_4b21bea1d0af37bd04a97bd86608af6c(view, motionEvent);
    }

    public boolean safedk_r_onTouch_4b21bea1d0af37bd04a97bd86608af6c(View p0, MotionEvent p1) {
        return this.a.onTouchEvent(p1);
    }
}
