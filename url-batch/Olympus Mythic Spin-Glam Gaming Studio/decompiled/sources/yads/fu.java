package yads;

import java.util.Arrays;

/* loaded from: classes5.dex */
public final class fu {
    public final c83 a;
    public final int b;
    public final int c;
    public final long d;
    public final int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public long[] k;
    public int[] l;

    public fu(int i, int i2, long j, int i3, c83 c83Var) {
        if (i2 != 1 && i2 != 2) {
            throw new IllegalArgumentException();
        }
        this.d = j;
        this.e = i3;
        this.a = c83Var;
        int i4 = (((i % 10) + 48) << 8) | ((i / 10) + 48);
        this.b = (i2 == 2 ? 1667497984 : 1651965952) | i4;
        this.c = i2 == 2 ? i4 | 1650720768 : -1;
        this.k = new long[512];
        this.l = new int[512];
    }

    public final void a(long j) {
        if (this.j == this.l.length) {
            long[] jArr = this.k;
            this.k = Arrays.copyOf(jArr, (jArr.length * 3) / 2);
            int[] iArr = this.l;
            this.l = Arrays.copyOf(iArr, (iArr.length * 3) / 2);
        }
        long[] jArr2 = this.k;
        int i = this.j;
        jArr2[i] = j;
        this.l[i] = this.i;
        this.j = i + 1;
    }

    public final kx2 b(long j) {
        long j2 = 1;
        int i = (int) (j / ((this.d * j2) / this.e));
        int a = sb3.a(this.l, i, true, true);
        int i2 = this.l[a];
        if (i2 == i) {
            ox2 ox2Var = new ox2(((this.d * j2) / this.e) * i2, this.k[a]);
            return new kx2(ox2Var, ox2Var);
        }
        long j3 = i2;
        long j4 = (this.d * j2) / this.e;
        long[] jArr = this.k;
        ox2 ox2Var2 = new ox2(j3 * j4, jArr[a]);
        int i3 = a + 1;
        return i3 < jArr.length ? new kx2(ox2Var2, new ox2(j4 * r0[i3], jArr[i3])) : new kx2(ox2Var2, ox2Var2);
    }

    public final void a() {
        this.k = Arrays.copyOf(this.k, this.j);
        this.l = Arrays.copyOf(this.l, this.j);
    }
}
