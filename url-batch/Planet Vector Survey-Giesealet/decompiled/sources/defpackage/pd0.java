package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class pd0 implements Serializable {
    public final Object d;
    public final Object e;

    public pd0(Object obj, Object obj2) {
        this.d = obj;
        this.e = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pd0)) {
            return false;
        }
        pd0 pd0Var = (pd0) obj;
        return nz.l(this.d, pd0Var.d) && nz.l(this.e, pd0Var.e);
    }

    public final int hashCode() {
        Object obj = this.d;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.e;
        return hashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.d + ", " + this.e + ')';
    }
}
