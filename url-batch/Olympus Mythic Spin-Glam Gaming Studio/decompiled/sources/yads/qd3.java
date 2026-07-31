package yads;

/* loaded from: classes6.dex */
public final class qd3 implements qx2 {
    public final long[] a;
    public final long[] b;
    public final long c;
    public final long d;

    public qd3(long[] jArr, long[] jArr2, long j, long j2) {
        this.a = jArr;
        this.b = jArr2;
        this.c = j;
        this.d = j2;
    }

    @Override // yads.qx2
    public final long a(long j) {
        return this.a[sb3.b(this.b, j, true)];
    }

    @Override // yads.mx2
    public final boolean b() {
        return true;
    }

    @Override // yads.mx2
    public final long c() {
        return this.c;
    }

    @Override // yads.qx2
    public final long a() {
        return this.d;
    }

    @Override // yads.mx2
    public final kx2 b(long j) {
        int b = sb3.b(this.a, j, true);
        long[] jArr = this.a;
        long j2 = jArr[b];
        long[] jArr2 = this.b;
        ox2 ox2Var = new ox2(j2, jArr2[b]);
        if (j2 >= j || b == jArr.length - 1) {
            return new kx2(ox2Var, ox2Var);
        }
        int i = b + 1;
        return new kx2(ox2Var, new ox2(jArr[i], jArr2[i]));
    }
}
