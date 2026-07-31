package yads;

/* loaded from: classes4.dex */
public abstract class yn implements sj1 {
    public final long b;
    public final long c;
    public long d;

    public yn(long j, long j2) {
        this.b = j;
        this.c = j2;
        this.d = j - 1;
    }

    @Override // yads.sj1
    public final boolean next() {
        long j = this.d + 1;
        this.d = j;
        return !(j > this.c);
    }
}
