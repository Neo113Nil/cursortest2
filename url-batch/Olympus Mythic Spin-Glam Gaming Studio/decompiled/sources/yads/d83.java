package yads;

/* loaded from: classes4.dex */
public final class d83 {
    public final u73 a;
    public final int b;
    public final long[] c;
    public final int[] d;
    public final int e;
    public final long[] f;
    public final int[] g;
    public final long h;

    public d83(u73 u73Var, long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, long j) {
        if (iArr.length != jArr2.length) {
            throw new IllegalArgumentException();
        }
        if (jArr.length != jArr2.length) {
            throw new IllegalArgumentException();
        }
        if (iArr2.length != jArr2.length) {
            throw new IllegalArgumentException();
        }
        this.a = u73Var;
        this.c = jArr;
        this.d = iArr;
        this.e = i;
        this.f = jArr2;
        this.g = iArr2;
        this.h = j;
        this.b = jArr.length;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }

    public final int a(long j) {
        for (int a = sb3.a(this.f, j, true); a < this.f.length; a++) {
            if ((this.g[a] & 1) != 0) {
                return a;
            }
        }
        return -1;
    }
}
