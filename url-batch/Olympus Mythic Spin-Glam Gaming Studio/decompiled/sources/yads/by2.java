package yads;

/* loaded from: classes4.dex */
public final class by2 implements Comparable {
    public final long b;
    public final v30 c;

    public by2(long j, v30 v30Var) {
        this.b = j;
        this.c = v30Var;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j = this.b;
        long j2 = ((by2) obj).b;
        int i = sb3.a;
        if (j < j2) {
            return -1;
        }
        return j == j2 ? 0 : 1;
    }
}
