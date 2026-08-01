package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public abstract class yf0 {
    public int d;
    public int e;
    public long f = 0;
    public long g = zf0.a;
    public long h = 0;

    public int E() {
        return (int) (this.f & 4294967295L);
    }

    public int H() {
        return (int) (this.f >> 32);
    }

    public final void L() {
        this.d = rg0.g((int) (this.f >> 32), ui.j(this.g), ui.h(this.g));
        this.e = rg0.g((int) (this.f & 4294967295L), ui.i(this.g), ui.g(this.g));
        int i = this.d;
        long j = this.f;
        this.h = (((i - ((int) (j >> 32))) / 2) << 32) | (4294967295L & ((r0 - ((int) (j & 4294967295L))) / 2));
    }

    public abstract void M(long j, float f, mu muVar);

    public final void N(long j) {
        if (iz.a(this.f, j)) {
            return;
        }
        this.f = j;
        L();
    }

    public final void O(long j) {
        if (ui.b(this.g, j)) {
            return;
        }
        this.g = j;
        L();
    }

    public abstract Object f();
}
