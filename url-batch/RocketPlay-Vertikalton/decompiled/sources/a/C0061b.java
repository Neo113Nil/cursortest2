package a;

import android.window.BackEvent;

/* renamed from: a.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0061b {

    /* renamed from: a, reason: collision with root package name */
    public final float f1560a;

    /* renamed from: b, reason: collision with root package name */
    public final float f1561b;

    /* renamed from: c, reason: collision with root package name */
    public final float f1562c;
    public final int d;

    public C0061b(BackEvent backEvent) {
        i1.f.e(backEvent, "backEvent");
        C0060a c0060a = C0060a.f1559a;
        float d = c0060a.d(backEvent);
        float e2 = c0060a.e(backEvent);
        float b2 = c0060a.b(backEvent);
        int c2 = c0060a.c(backEvent);
        this.f1560a = d;
        this.f1561b = e2;
        this.f1562c = b2;
        this.d = c2;
    }

    public final String toString() {
        return "BackEventCompat{touchX=" + this.f1560a + ", touchY=" + this.f1561b + ", progress=" + this.f1562c + ", swipeEdge=" + this.d + '}';
    }
}
