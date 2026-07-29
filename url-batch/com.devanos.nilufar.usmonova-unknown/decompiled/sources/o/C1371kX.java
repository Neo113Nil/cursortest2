package o;

/* renamed from: o.kX, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1371kX {
    public static final C1371kX k = new C1371kX(false, false, false, false, false, new C1371kX(false, false, false, false, false, null, false, null, null, 1023), false, null, null, 988);
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final C1371kX f;
    public final boolean g;
    public final C1371kX h;
    public final C1371kX i;
    public final boolean j;

    public C1371kX(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, C1371kX c1371kX, boolean z6, C1371kX c1371kX2, C1371kX c1371kX3, int i) {
        z = (i & 1) != 0 ? true : z;
        z2 = (i & 2) != 0 ? true : z2;
        z3 = (i & 4) != 0 ? false : z3;
        z4 = (i & 8) != 0 ? false : z4;
        z5 = (i & 16) != 0 ? false : z5;
        c1371kX = (i & 32) != 0 ? null : c1371kX;
        z6 = (i & 64) != 0 ? true : z6;
        c1371kX2 = (i & 128) != 0 ? c1371kX : c1371kX2;
        c1371kX3 = (i & 256) != 0 ? c1371kX : c1371kX3;
        boolean z7 = (i & 512) == 0;
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = c1371kX;
        this.g = z6;
        this.h = c1371kX2;
        this.i = c1371kX3;
        this.j = z7;
    }
}
