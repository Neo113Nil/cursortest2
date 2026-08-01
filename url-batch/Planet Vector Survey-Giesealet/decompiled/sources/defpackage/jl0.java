package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class jl0 {
    public final long a = ge.g;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof jl0) {
            return ge.c(this.a, ((jl0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return ge.i(this.a) * 31;
    }

    public final String toString() {
        return "RippleConfiguration(color=" + ((Object) ge.j(this.a)) + ", rippleAlpha=null)";
    }
}
