package com.my.target;

import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes3.dex */
public class g2 implements View.OnTouchListener {
    a a;

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    public interface a {
        void a(h2 h2Var);
    }

    public g2(a aVar) {
        this.a = aVar;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() != 1) {
            return false;
        }
        h2 a2 = j2.a(view).a(motionEvent);
        if (a2 == null) {
            a2 = h2.a();
        }
        this.a.a(a2);
        return false;
    }
}
