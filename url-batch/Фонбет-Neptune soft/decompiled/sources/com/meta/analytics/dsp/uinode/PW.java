package com.meta.analytics.dsp.uinode;

import android.view.MotionEvent;
import android.view.View;

/* loaded from: assets/audience_network.dex */
public class PW implements View.OnTouchListener {
    public final /* synthetic */ C0747Sx A00;

    public PW(C0747Sx c0747Sx) {
        this.A00 = c0747Sx;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        float f;
        int action = motionEvent.getActionMasked();
        switch (action) {
            case 0:
                this.A00.A00 = motionEvent.getY();
                break;
            case 1:
                float browserFinalY = motionEvent.getY();
                f = this.A00.A00;
                if (f < browserFinalY) {
                    this.A00.A0k(false);
                    break;
                }
                break;
        }
        return true;
    }
}
