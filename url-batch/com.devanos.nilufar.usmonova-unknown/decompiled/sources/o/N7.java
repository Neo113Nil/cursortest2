package o;

import android.window.BackEvent;

/* loaded from: classes.dex */
public final class N7 {
    public final float a;
    public final float b;
    public final float c;
    public final int d;

    public N7(BackEvent backEvent) {
        E4 e4 = E4.a;
        float d = e4.d(backEvent);
        float e = e4.e(backEvent);
        float b = e4.b(backEvent);
        int c = e4.c(backEvent);
        this.a = d;
        this.b = e;
        this.c = b;
        this.d = c;
    }

    public final String toString() {
        return "BackEventCompat{touchX=" + this.a + ", touchY=" + this.b + ", progress=" + this.c + ", swipeEdge=" + this.d + '}';
    }
}
