package yads;

/* loaded from: classes5.dex */
public abstract class fo implements hf2 {
    public final int b;
    public on2 d;
    public int e;
    public ff2 f;
    public int g;
    public ys2 h;
    public jw0[] i;
    public long j;
    public boolean l;
    public boolean m;
    public final kw0 c = new kw0();
    public long k = Long.MIN_VALUE;

    public fo(int i) {
        this.b = i;
    }

    public static int a(int i) {
        return i & 128;
    }

    public static int a(int i, int i2, int i3) {
        return i | i2 | i3 | 128;
    }

    public static int b(int i) {
        return i & 64;
    }

    public abstract int a(jw0 jw0Var);

    public void a(float f, float f2) {
    }

    @Override // yads.hf2
    public void a(int i, Object obj) {
    }

    public abstract void a(long j, long j2);

    public abstract void a(long j, boolean z);

    public void a(boolean z) {
    }

    public abstract void a(jw0[] jw0VarArr, long j, long j2);

    public tj1 b() {
        return null;
    }

    public abstract String c();

    public final boolean d() {
        return this.k == Long.MIN_VALUE;
    }

    public abstract boolean e();

    public abstract boolean f();

    public abstract void g();

    public void h() {
    }

    public void i() {
    }

    public void j() {
    }

    public int k() {
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final nn0 a(Exception exc, jw0 jw0Var, boolean z, int i) {
        int i2;
        if (jw0Var != null && !this.m) {
            this.m = true;
            try {
                i2 = a(jw0Var) & 7;
            } catch (nn0 unused) {
            } finally {
                this.m = false;
            }
            return new nn0(1, exc, null, i, c(), this.e, jw0Var, jw0Var != null ? 4 : i2, z);
        }
        i2 = 4;
        return new nn0(1, exc, null, i, c(), this.e, jw0Var, jw0Var != null ? 4 : i2, z);
    }

    public final int a(kw0 kw0Var, fb0 fb0Var, int i) {
        ys2 ys2Var = this.h;
        ys2Var.getClass();
        int a = ys2Var.a(kw0Var, fb0Var, i);
        if (a == -4) {
            if (fb0Var.b(4)) {
                this.k = Long.MIN_VALUE;
                return this.l ? -4 : -3;
            }
            long j = fb0Var.f + this.j;
            fb0Var.f = j;
            this.k = Math.max(this.k, j);
        } else if (a == -5) {
            jw0 jw0Var = kw0Var.b;
            jw0Var.getClass();
            if (jw0Var.q != Long.MAX_VALUE) {
                iw0 iw0Var = new iw0(jw0Var);
                iw0Var.o = jw0Var.q + this.j;
                kw0Var.b = new jw0(iw0Var);
            }
        }
        return a;
    }
}
