package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class m90 extends a50 {
    public final e90 u;

    public m90(e90 e90Var) {
        e90Var.getClass();
        this.u = e90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && m90.class == obj.getClass() && nz.l(this.u, ((m90) obj).u);
    }

    public final int hashCode() {
        return this.u.hashCode() - 31;
    }

    public final String toString() {
        return "InProgress(latestEvent=" + this.u + ", direction=-1)";
    }
}
