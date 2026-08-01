package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class ax {
    public static int k;
    public static final y7 l = new y7(20);
    public final String a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final ez0 f;
    public final long g;
    public final int h;
    public final boolean i;
    public final int j;

    public ax(String str, float f, float f2, float f3, float f4, ez0 ez0Var, long j, int i, boolean z) {
        int i2;
        synchronized (l) {
            i2 = k;
            k = i2 + 1;
        }
        this.a = str;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = ez0Var;
        this.g = j;
        this.h = i;
        this.i = z;
        this.j = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ax)) {
            return false;
        }
        ax axVar = (ax) obj;
        return nz.l(this.a, axVar.a) && jn.a(this.b, axVar.b) && jn.a(this.c, axVar.c) && this.d == axVar.d && this.e == axVar.e && this.f.equals(axVar.f) && ge.c(this.g, axVar.g) && this.h == axVar.h && this.i == axVar.i;
    }

    public final int hashCode() {
        return ((((ge.i(this.g) + ((this.f.hashCode() + y6.t(this.e, y6.t(this.d, y6.t(this.c, y6.t(this.b, this.a.hashCode() * 31, 31), 31), 31), 31)) * 31)) * 31) + this.h) * 31) + (this.i ? 1231 : 1237);
    }
}
