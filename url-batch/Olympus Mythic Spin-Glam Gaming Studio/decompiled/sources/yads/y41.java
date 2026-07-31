package yads;

/* loaded from: classes3.dex */
public final class y41 {
    public final fo2 a;
    public final fo2 b;
    public final fo2 c;
    public final fo2 d;

    public y41(fo2 fo2Var, fo2 fo2Var2, fo2 fo2Var3, fo2 fo2Var4) {
        this.a = fo2Var;
        this.b = fo2Var2;
        this.c = fo2Var3;
        this.d = fo2Var4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y41)) {
            return false;
        }
        y41 y41Var = (y41) obj;
        return this.a == y41Var.a && this.b == y41Var.b && this.c == y41Var.c && this.d == y41Var.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ImpressionTrackingReportTypes(impressionTrackingSuccessReportType=" + this.a + ", impressionTrackingStartReportType=" + this.b + ", impressionTrackingFailureReportType=" + this.c + ", forcedImpressionTrackingFailureReportType=" + this.d + ")";
    }
}
