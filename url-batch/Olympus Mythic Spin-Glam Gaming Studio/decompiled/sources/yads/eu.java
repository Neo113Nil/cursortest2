package yads;

import java.util.Arrays;

/* loaded from: classes5.dex */
public final class eu implements mx2 {
    public final int a;
    public final int[] b;
    public final long[] c;
    public final long[] d;
    public final long[] e;
    public final long f;

    public eu(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.b = iArr;
        this.c = jArr;
        this.d = jArr2;
        this.e = jArr3;
        int length = iArr.length;
        this.a = length;
        if (length <= 0) {
            this.f = 0L;
        } else {
            int i = length - 1;
            this.f = jArr2[i] + jArr3[i];
        }
    }

    @Override // yads.mx2
    public final kx2 b(long j) {
        int b = sb3.b(this.e, j, true);
        long[] jArr = this.e;
        long j2 = jArr[b];
        long[] jArr2 = this.c;
        ox2 ox2Var = new ox2(j2, jArr2[b]);
        if (j2 >= j || b == this.a - 1) {
            return new kx2(ox2Var, ox2Var);
        }
        int i = b + 1;
        return new kx2(ox2Var, new ox2(jArr[i], jArr2[i]));
    }

    @Override // yads.mx2
    public final boolean b() {
        return true;
    }

    @Override // yads.mx2
    public final long c() {
        return this.f;
    }

    public final String toString() {
        return "ChunkIndex(length=" + this.a + ", sizes=" + Arrays.toString(this.b) + ", offsets=" + Arrays.toString(this.c) + ", timeUs=" + Arrays.toString(this.e) + ", durationsUs=" + Arrays.toString(this.d) + ")";
    }
}
