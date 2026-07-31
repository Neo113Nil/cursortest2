package yads;

/* loaded from: classes4.dex */
public abstract class xn extends au {
    public final long j;
    public final long k;
    public final long l;
    public zn m;
    public int[] n;

    public xn(q30 q30Var, v30 v30Var, jw0 jw0Var, int i, Object obj, long j, long j2, long j3, long j4, long j5) {
        super(q30Var, v30Var, 1, jw0Var, i, obj, j, j2);
        jw0Var.getClass();
        this.j = j5;
        this.k = j3;
        this.l = j4;
    }

    public final int a(int i) {
        int[] iArr = this.n;
        if (iArr != null) {
            return iArr[i];
        }
        throw new IllegalStateException();
    }

    public long c() {
        long j = this.j;
        if (j != -1) {
            return 1 + j;
        }
        return -1L;
    }

    public abstract boolean d();
}
