package com.my.target;

import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes6.dex */
public class j2 implements i2 {
    private final View a;

    private j2(View view) {
        this.a = view;
    }

    @Override // com.my.target.i2
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public wf a(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 1) {
            return null;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        float f = this.a.getContext().getResources().getDisplayMetrics().widthPixels;
        float f2 = this.a.getContext().getResources().getDisplayMetrics().heightPixels;
        this.a.getLocationOnScreen(new int[2]);
        return new wf((r4[0] + x) / f, (r4[1] + y) / f2);
    }

    public static j2 a(View view) {
        return new j2(view);
    }
}
