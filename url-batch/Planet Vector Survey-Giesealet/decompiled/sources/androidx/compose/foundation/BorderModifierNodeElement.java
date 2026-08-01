package androidx.compose.foundation;

import defpackage.ge;
import defpackage.jn;
import defpackage.ks0;
import defpackage.nz;
import defpackage.qb;
import defpackage.rq0;
import defpackage.t50;
import defpackage.y9;
import defpackage.z50;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class BorderModifierNodeElement extends z50 {
    public final float a;
    public final ks0 b;
    public final rq0 c;

    public BorderModifierNodeElement(float f, ks0 ks0Var, rq0 rq0Var) {
        this.a = f;
        this.b = ks0Var;
        this.c = rq0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BorderModifierNodeElement)) {
            return false;
        }
        BorderModifierNodeElement borderModifierNodeElement = (BorderModifierNodeElement) obj;
        return jn.a(this.a, borderModifierNodeElement.a) && this.b.equals(borderModifierNodeElement.b) && nz.l(this.c, borderModifierNodeElement.c);
    }

    @Override // defpackage.z50
    public final t50 f() {
        return new y9(this.a, this.b, this.c);
    }

    @Override // defpackage.z50
    public final void g(t50 t50Var) {
        y9 y9Var = (y9) t50Var;
        float f = y9Var.u;
        qb qbVar = y9Var.x;
        float f2 = this.a;
        if (!jn.a(f, f2)) {
            y9Var.u = f2;
            qbVar.j0();
        }
        ks0 ks0Var = y9Var.v;
        ks0 ks0Var2 = this.b;
        if (!nz.l(ks0Var, ks0Var2)) {
            y9Var.v = ks0Var2;
            qbVar.j0();
        }
        rq0 rq0Var = y9Var.w;
        rq0 rq0Var2 = this.c;
        if (nz.l(rq0Var, rq0Var2)) {
            return;
        }
        y9Var.w = rq0Var2;
        qbVar.j0();
    }

    public final int hashCode() {
        return this.c.hashCode() + ((ge.i(this.b.k) + (Float.floatToIntBits(this.a) * 31)) * 31);
    }

    public final String toString() {
        return "BorderModifierNodeElement(width=" + ((Object) jn.b(this.a)) + ", brush=" + this.b + ", shape=" + this.c + ')';
    }
}
