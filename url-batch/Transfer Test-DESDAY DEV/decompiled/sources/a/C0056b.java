package a;

import android.window.BackEvent;

/* renamed from: a.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0056b {

    /* renamed from: a, reason: collision with root package name */
    public final float f1181a;

    /* renamed from: b, reason: collision with root package name */
    public final float f1182b;

    /* renamed from: c, reason: collision with root package name */
    public final float f1183c;
    public final int d;

    public C0056b(BackEvent backEvent) {
        g1.f.e(backEvent, "backEvent");
        C0055a c0055a = C0055a.f1180a;
        float d = c0055a.d(backEvent);
        float e2 = c0055a.e(backEvent);
        float b2 = c0055a.b(backEvent);
        int c2 = c0055a.c(backEvent);
        this.f1181a = d;
        this.f1182b = e2;
        this.f1183c = b2;
        this.d = c2;
    }

    public final String toString() {
        return "BackEventCompat{touchX=" + this.f1181a + ", touchY=" + this.f1182b + ", progress=" + this.f1183c + ", swipeEdge=" + this.d + '}';
    }
}
