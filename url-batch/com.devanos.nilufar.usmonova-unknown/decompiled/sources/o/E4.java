package o;

import android.window.BackEvent;

/* loaded from: classes.dex */
public final class E4 {
    public static final E4 a = new E4();

    public final BackEvent a(float f, float f2, float f3, int i) {
        return new BackEvent(f, f2, f3, i);
    }

    public final float b(BackEvent backEvent) {
        AbstractC0048Bt.n(backEvent, "backEvent");
        return backEvent.getProgress();
    }

    public final int c(BackEvent backEvent) {
        AbstractC0048Bt.n(backEvent, "backEvent");
        return backEvent.getSwipeEdge();
    }

    public final float d(BackEvent backEvent) {
        AbstractC0048Bt.n(backEvent, "backEvent");
        return backEvent.getTouchX();
    }

    public final float e(BackEvent backEvent) {
        AbstractC0048Bt.n(backEvent, "backEvent");
        return backEvent.getTouchY();
    }
}
