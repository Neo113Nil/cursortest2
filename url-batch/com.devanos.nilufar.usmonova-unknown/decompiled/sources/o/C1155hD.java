package o;

import android.view.MotionEvent;

/* renamed from: o.hD, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1155hD {
    public static final C1155hD a = new C1155hD();

    public final long a(MotionEvent motionEvent, int i) {
        float rawX;
        float rawY;
        rawX = motionEvent.getRawX(i);
        rawY = motionEvent.getRawY(i);
        return PX.h(rawX, rawY);
    }
}
