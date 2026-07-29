package o;

import android.view.MotionEvent;

/* renamed from: o.jD, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1285jD {
    public static final C1285jD a = new C1285jD();

    public final boolean a(MotionEvent motionEvent, int i) {
        float rawX;
        float rawY;
        rawX = motionEvent.getRawX(i);
        if (Float.isInfinite(rawX) || Float.isNaN(rawX)) {
            return false;
        }
        rawY = motionEvent.getRawY(i);
        return (Float.isInfinite(rawY) || Float.isNaN(rawY)) ? false : true;
    }
}
