package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class vc0 extends xc0 {
    public final zi0 a;

    public vc0(zi0 zi0Var) {
        this.a = zi0Var;
    }

    @Override // defpackage.xc0
    public final zi0 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof vc0) {
            return this.a.equals(((vc0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
