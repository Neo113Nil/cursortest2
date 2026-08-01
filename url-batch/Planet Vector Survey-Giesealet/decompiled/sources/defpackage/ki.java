package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class ki implements xy0 {
    public final mu a;

    public ki(mu muVar) {
        this.a = muVar;
    }

    @Override // defpackage.xy0
    public final Object a(gf0 gf0Var) {
        return this.a.c(gf0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ki) && this.a.equals(((ki) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ComputedValueHolder(compute=" + this.a + ')';
    }
}
