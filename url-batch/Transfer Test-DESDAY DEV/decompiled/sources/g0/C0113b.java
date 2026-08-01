package g0;

/* renamed from: g0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0113b {

    /* renamed from: a, reason: collision with root package name */
    public long f2412a = 0;

    /* renamed from: b, reason: collision with root package name */
    public C0113b f2413b;

    public final void a(int i) {
        if (i < 64) {
            this.f2412a &= ~(1 << i);
            return;
        }
        C0113b c0113b = this.f2413b;
        if (c0113b != null) {
            c0113b.a(i - 64);
        }
    }

    public final int b(int i) {
        C0113b c0113b = this.f2413b;
        if (c0113b == null) {
            return i >= 64 ? Long.bitCount(this.f2412a) : Long.bitCount(this.f2412a & ((1 << i) - 1));
        }
        if (i < 64) {
            return Long.bitCount(this.f2412a & ((1 << i) - 1));
        }
        return Long.bitCount(this.f2412a) + c0113b.b(i - 64);
    }

    public final void c() {
        if (this.f2413b == null) {
            this.f2413b = new C0113b();
        }
    }

    public final boolean d(int i) {
        if (i < 64) {
            return (this.f2412a & (1 << i)) != 0;
        }
        c();
        return this.f2413b.d(i - 64);
    }

    public final void e(int i, boolean z2) {
        if (i >= 64) {
            c();
            this.f2413b.e(i - 64, z2);
            return;
        }
        long j2 = this.f2412a;
        boolean z3 = (Long.MIN_VALUE & j2) != 0;
        long j3 = (1 << i) - 1;
        this.f2412a = ((j2 & (~j3)) << 1) | (j2 & j3);
        if (z2) {
            h(i);
        } else {
            a(i);
        }
        if (z3 || this.f2413b != null) {
            c();
            this.f2413b.e(0, z3);
        }
    }

    public final boolean f(int i) {
        if (i >= 64) {
            c();
            return this.f2413b.f(i - 64);
        }
        long j2 = 1 << i;
        long j3 = this.f2412a;
        boolean z2 = (j3 & j2) != 0;
        long j4 = j3 & (~j2);
        this.f2412a = j4;
        long j5 = j2 - 1;
        this.f2412a = (j4 & j5) | Long.rotateRight((~j5) & j4, 1);
        C0113b c0113b = this.f2413b;
        if (c0113b != null) {
            if (c0113b.d(0)) {
                h(63);
            }
            this.f2413b.f(0);
        }
        return z2;
    }

    public final void g() {
        this.f2412a = 0L;
        C0113b c0113b = this.f2413b;
        if (c0113b != null) {
            c0113b.g();
        }
    }

    public final void h(int i) {
        if (i < 64) {
            this.f2412a |= 1 << i;
        } else {
            c();
            this.f2413b.h(i - 64);
        }
    }

    public final String toString() {
        if (this.f2413b == null) {
            return Long.toBinaryString(this.f2412a);
        }
        return this.f2413b.toString() + "xx" + Long.toBinaryString(this.f2412a);
    }
}
