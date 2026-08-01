package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class p9 extends md0 {
    public final x4 e;
    public final long f;
    public final int g = 1;
    public final long h;
    public float i;
    public q9 j;

    public p9(x4 x4Var) {
        int i;
        long width = (x4Var.a.getWidth() << 32) | (x4Var.a.getHeight() & 4294967295L);
        this.e = x4Var;
        this.f = width;
        int i2 = (int) (width >> 32);
        if (i2 < 0 || (i = (int) (width & 4294967295L)) < 0 || i2 > x4Var.a.getWidth() || i > x4Var.a.getHeight()) {
            g8.r("Failed requirement.");
            throw null;
        }
        this.h = width;
        this.i = 1.0f;
    }

    @Override // defpackage.md0
    public final void a(float f) {
        this.i = f;
    }

    @Override // defpackage.md0
    public final void b(q9 q9Var) {
        this.j = q9Var;
    }

    @Override // defpackage.md0
    public final long d() {
        return px0.W(this.h);
    }

    @Override // defpackage.md0
    public final void e(r10 r10Var) {
        int round = Math.round(Float.intBitsToFloat((int) (r10Var.c() >> 32)));
        int round2 = Math.round(Float.intBitsToFloat((int) (r10Var.c() & 4294967295L)));
        y6.n(r10Var, this.e, this.f, (round << 32) | (round2 & 4294967295L), this.i, this.j, this.g, 328);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p9)) {
            return false;
        }
        p9 p9Var = (p9) obj;
        return nz.l(this.e, p9Var.e) && bz.a(0L, 0L) && iz.a(this.f, p9Var.f) && this.g == p9Var.g;
    }

    public final int hashCode() {
        int hashCode = this.e.hashCode() * 961;
        long j = this.f;
        return ((((int) (j ^ (j >>> 32))) + hashCode) * 31) + this.g;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BitmapPainter(image=");
        sb.append(this.e);
        sb.append(", srcOffset=");
        sb.append((Object) bz.d(0L));
        sb.append(", srcSize=");
        sb.append((Object) iz.b(this.f));
        sb.append(", filterQuality=");
        int i = this.g;
        sb.append((Object) (i == 0 ? "None" : i == 1 ? "Low" : i == 2 ? "Medium" : i == 3 ? "High" : "Unknown"));
        sb.append(')');
        return sb.toString();
    }
}
