package yads;

import android.util.Pair;

/* loaded from: classes12.dex */
public final class zt1 implements qx2 {
    public final long[] a;
    public final long[] b;
    public final long c;

    public zt1(long j, long[] jArr, long[] jArr2) {
        this.a = jArr;
        this.b = jArr2;
        this.c = j == -9223372036854775807L ? sb3.a(jArr2[jArr2.length - 1]) : j;
    }

    @Override // yads.qx2
    public final long a() {
        return -1L;
    }

    @Override // yads.qx2
    public final long a(long j) {
        return sb3.a(((Long) a(j, this.a, this.b).second).longValue());
    }

    @Override // yads.mx2
    public final boolean b() {
        return true;
    }

    @Override // yads.mx2
    public final long c() {
        return this.c;
    }

    @Override // yads.mx2
    public final kx2 b(long j) {
        long j2 = this.c;
        int i = sb3.a;
        Pair a = a(sb3.b(Math.max(0L, Math.min(j, j2))), this.b, this.a);
        ox2 ox2Var = new ox2(sb3.a(((Long) a.first).longValue()), ((Long) a.second).longValue());
        return new kx2(ox2Var, ox2Var);
    }

    public static Pair a(long j, long[] jArr, long[] jArr2) {
        int b = sb3.b(jArr, j, true);
        long j2 = jArr[b];
        long j3 = jArr2[b];
        int i = b + 1;
        if (i == jArr.length) {
            return Pair.create(Long.valueOf(j2), Long.valueOf(j3));
        }
        return Pair.create(Long.valueOf(j), Long.valueOf(((long) ((jArr[i] == j2 ? 0.0d : (j - j2) / (r6 - j2)) * (jArr2[i] - j3))) + j3));
    }
}
