package io.bidmachine.internal;

/* loaded from: classes12.dex */
public final class O {
    private final boolean a;
    private final boolean b;

    public O(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean a() {
        return this.b;
    }

    public final boolean b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof O)) {
            return false;
        }
        O o = (O) obj;
        return this.a == o.a && this.b == o.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public int hashCode() {
        boolean z = this.a;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        boolean z2 = this.b;
        return i + (z2 ? 1 : z2 ? 1 : 0);
    }

    public String toString() {
        return "TcfSignals(purpose1Consent=" + this.a + ", hasNoLegitimateInterestForPurposes2To10=" + this.b + ')';
    }
}
