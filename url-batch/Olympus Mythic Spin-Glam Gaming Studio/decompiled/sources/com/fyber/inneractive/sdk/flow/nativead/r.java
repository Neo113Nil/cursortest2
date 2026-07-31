package com.fyber.inneractive.sdk.flow.nativead;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.fyber.inneractive.sdk.flow.w0;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;

/* loaded from: classes4.dex */
public final class r extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener {
    public final GestureDetector a;
    public final u b;
    public String c;

    public r(Context context, u uVar) {
        this.b = uVar;
        this.a = new GestureDetector(context, this);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        onSingleTapConfirmed(motionEvent);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        onSingleTapConfirmed(motionEvent);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        ((w0) this.b).b(this.c);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        Logger.d("DTExchange|SafeDK: Execution> Lcom/fyber/inneractive/sdk/flow/nativead/r;->onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        CreativeInfoManager.onViewTouched(com.safedk.android.utils.h.p, view, motionEvent);
        return safedk_r_onTouch_e733b4ceac84839e86931962f0259748(view, motionEvent);
    }

    public boolean safedk_r_onTouch_e733b4ceac84839e86931962f0259748(View p0, MotionEvent p1) {
        this.c = p0.getTag() instanceof String ? p0.getTag().toString() : null;
        return this.a.onTouchEvent(p1);
    }
}
