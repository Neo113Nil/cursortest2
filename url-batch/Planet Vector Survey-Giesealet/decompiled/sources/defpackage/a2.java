package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public abstract class a2 implements zu, Serializable {
    public final Object d;
    public final Class e;
    public final String f;
    public final String g;
    public final int i;
    public final boolean h = false;
    public final int j = 4;

    public a2(int i, Object obj, Class cls, String str, String str2) {
        this.d = obj;
        this.e = cls;
        this.f = str;
        this.g = str2;
        this.i = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a2)) {
            return false;
        }
        a2 a2Var = (a2) obj;
        return this.h == a2Var.h && this.i == a2Var.i && this.j == a2Var.j && this.d.equals(a2Var.d) && this.e.equals(a2Var.e) && this.f.equals(a2Var.f) && this.g.equals(a2Var.g);
    }

    @Override // defpackage.zu
    public final int getArity() {
        return this.i;
    }

    public final int hashCode() {
        return ((((((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + (this.d.hashCode() * 31)) * 31)) * 31)) * 31) + (this.h ? 1231 : 1237)) * 31) + this.i) * 31) + this.j;
    }

    public final String toString() {
        hj0.a.getClass();
        return ij0.a(this);
    }
}
