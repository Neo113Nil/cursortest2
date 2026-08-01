package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class ih0 extends nz {
    public final Object o;
    public final long p;

    public ih0(long j, Object obj) {
        this.o = obj;
        this.p = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ih0)) {
            return false;
        }
        ih0 ih0Var = (ih0) obj;
        return this.o.equals(ih0Var.o) && this.p == ih0Var.p;
    }

    public final int hashCode() {
        int hashCode = this.o.hashCode() * 31;
        long j = this.p;
        return hashCode + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return "PredictiveBackHandlerInfo(owner=" + this.o + ", compositeKey=" + this.p + ')';
    }
}
