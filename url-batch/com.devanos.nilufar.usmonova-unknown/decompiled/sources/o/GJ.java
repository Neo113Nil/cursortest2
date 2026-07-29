package o;

/* loaded from: classes.dex */
public final class GJ {
    public static final GJ b = new GJ(new C0341Nb());
    public final C0341Nb a;

    public GJ(C0341Nb c0341Nb) {
        this.a = c0341Nb;
        if (Float.isNaN(0.0f)) {
            throw new IllegalArgumentException("current must not be NaN");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GJ)) {
            return false;
        }
        GJ gj = (GJ) obj;
        gj.getClass();
        return this.a.equals(gj.a);
    }

    public final int hashCode() {
        return (this.a.hashCode() + (Float.hashCode(0.0f) * 31)) * 31;
    }

    public final String toString() {
        return "ProgressBarRangeInfo(current=0.0, range=" + this.a + ", steps=0)";
    }
}
