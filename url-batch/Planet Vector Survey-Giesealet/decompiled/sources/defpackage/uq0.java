package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class uq0 {
    public final am0 a;
    public final am0 b;
    public final am0 c;
    public final am0 d;
    public final am0 e;

    public uq0() {
        am0 am0Var = sq0.a;
        am0 am0Var2 = sq0.b;
        am0 am0Var3 = sq0.c;
        am0 am0Var4 = sq0.d;
        am0 am0Var5 = sq0.e;
        this.a = am0Var;
        this.b = am0Var2;
        this.c = am0Var3;
        this.d = am0Var4;
        this.e = am0Var5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uq0)) {
            return false;
        }
        uq0 uq0Var = (uq0) obj;
        return nz.l(this.a, uq0Var.a) && nz.l(this.b, uq0Var.b) && nz.l(this.c, uq0Var.c) && nz.l(this.d, uq0Var.d) && nz.l(this.e, uq0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Shapes(extraSmall=" + this.a + ", small=" + this.b + ", medium=" + this.c + ", large=" + this.d + ", extraLarge=" + this.e + ')';
    }
}
