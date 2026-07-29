package o;

/* renamed from: o.aZ, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0717aZ implements YY {
    public final ZY h;
    public final long i;
    public final long j;

    public C0717aZ(ZY zy, long j) {
        this.h = zy;
        this.i = (zy.i() + zy.d()) * 1000000;
        this.j = j * 1000000;
    }

    @Override // o.YY
    public final long a(V3 v3, V3 v32, V3 v33) {
        return Long.MAX_VALUE;
    }

    @Override // o.YY
    public final V3 f(long j, V3 v3, V3 v32, V3 v33) {
        V3 v34;
        V3 v35;
        V3 v36;
        long j2 = this.j;
        long j3 = j + j2;
        long j4 = this.i;
        long j5 = j3 > 0 ? j3 - ((j3 / j4) * j4) : 0L;
        ZY zy = this.h;
        if (j3 > j4) {
            v34 = zy.j(j4 - j2, v3, v32, v33);
            v36 = v32;
            v35 = v3;
        } else {
            v34 = v33;
            v35 = v3;
            v36 = v32;
        }
        return zy.f(j5, v35, v36, v34);
    }
}
