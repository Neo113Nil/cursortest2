package yads;

/* loaded from: classes15.dex */
public final class c51 implements mx2 {
    public final long[] a;
    public final long[] b;
    public final long c;
    public final boolean d;

    public c51(long j, long[] jArr, long[] jArr2) {
        if (jArr.length != jArr2.length) {
            throw new IllegalArgumentException();
        }
        int length = jArr2.length;
        boolean z = length > 0;
        this.d = z;
        if (!z || jArr2[0] <= 0) {
            this.a = jArr;
            this.b = jArr2;
        } else {
            int i = length + 1;
            long[] jArr3 = new long[i];
            this.a = jArr3;
            long[] jArr4 = new long[i];
            this.b = jArr4;
            System.arraycopy(jArr, 0, jArr3, 1, length);
            System.arraycopy(jArr2, 0, jArr4, 1, length);
        }
        this.c = j;
    }

    @Override // yads.mx2
    public final boolean b() {
        return this.d;
    }

    @Override // yads.mx2
    public final long c() {
        return this.c;
    }

    @Override // yads.mx2
    public final kx2 b(long j) {
        if (!this.d) {
            ox2 ox2Var = ox2.c;
            return new kx2(ox2Var, ox2Var);
        }
        int b = sb3.b(this.b, j, true);
        long[] jArr = this.b;
        long j2 = jArr[b];
        long[] jArr2 = this.a;
        ox2 ox2Var2 = new ox2(j2, jArr2[b]);
        if (j2 == j || b == jArr.length - 1) {
            return new kx2(ox2Var2, ox2Var2);
        }
        int i = b + 1;
        return new kx2(ox2Var2, new ox2(jArr[i], jArr2[i]));
    }
}
