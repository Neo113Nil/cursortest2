package o;

/* renamed from: o.sT, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1894sT {
    public final long a;
    public final long b;

    public C1894sT(long j, long j2) {
        this.a = j;
        this.b = j2;
        if (j < 0) {
            throw new IllegalArgumentException(("stopTimeout(" + j + " ms) cannot be negative").toString());
        }
        if (j2 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("replayExpiration(" + j2 + " ms) cannot be negative").toString());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1894sT)) {
            return false;
        }
        C1894sT c1894sT = (C1894sT) obj;
        return this.a == c1894sT.a && this.b == c1894sT.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        C0889dA c0889dA = new C0889dA(2);
        long j = this.a;
        if (j > 0) {
            c0889dA.add("stopTimeout=" + j + "ms");
        }
        long j2 = this.b;
        if (j2 < Long.MAX_VALUE) {
            c0889dA.add("replayExpiration=" + j2 + "ms");
        }
        return AbstractC2188wx.h(new StringBuilder("SharingStarted.WhileSubscribed("), AbstractC0720ac.t0(AbstractC0868ct.j(c0889dA), null, null, null, null, 63), ')');
    }
}
