package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class u9 {
    public x4 a = null;
    public o2 b = null;
    public nc c = null;
    public e5 d = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u9)) {
            return false;
        }
        u9 u9Var = (u9) obj;
        return nz.l(this.a, u9Var.a) && nz.l(this.b, u9Var.b) && nz.l(this.c, u9Var.c) && nz.l(this.d, u9Var.d);
    }

    public final int hashCode() {
        x4 x4Var = this.a;
        int hashCode = (x4Var == null ? 0 : x4Var.hashCode()) * 31;
        o2 o2Var = this.b;
        int hashCode2 = (hashCode + (o2Var == null ? 0 : o2Var.hashCode())) * 31;
        nc ncVar = this.c;
        int hashCode3 = (hashCode2 + (ncVar == null ? 0 : ncVar.hashCode())) * 31;
        e5 e5Var = this.d;
        return hashCode3 + (e5Var != null ? e5Var.hashCode() : 0);
    }

    public final String toString() {
        return "BorderCache(imageBitmap=" + this.a + ", canvas=" + this.b + ", canvasDrawScope=" + this.c + ", borderPath=" + this.d + ')';
    }
}
