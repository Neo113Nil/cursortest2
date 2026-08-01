package androidx.compose.ui.draw;

import defpackage.a50;
import defpackage.fr0;
import defpackage.md0;
import defpackage.mz;
import defpackage.nd0;
import defpackage.nz;
import defpackage.o9;
import defpackage.q9;
import defpackage.t50;
import defpackage.y6;
import defpackage.y7;
import defpackage.z50;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
final class PainterElement extends z50 {
    public final md0 a;
    public final o9 b;
    public final y7 c;
    public final float d;
    public final q9 e;

    public PainterElement(md0 md0Var, o9 o9Var, y7 y7Var, float f, q9 q9Var) {
        this.a = md0Var;
        this.b = o9Var;
        this.c = y7Var;
        this.d = f;
        this.e = q9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PainterElement)) {
            return false;
        }
        PainterElement painterElement = (PainterElement) obj;
        return nz.l(this.a, painterElement.a) && nz.l(this.b, painterElement.b) && nz.l(this.c, painterElement.c) && Float.compare(this.d, painterElement.d) == 0 && nz.l(this.e, painterElement.e);
    }

    @Override // defpackage.z50
    public final t50 f() {
        nd0 nd0Var = new nd0();
        nd0Var.r = this.a;
        nd0Var.s = true;
        nd0Var.t = this.b;
        nd0Var.u = this.c;
        nd0Var.v = this.d;
        nd0Var.w = this.e;
        return nd0Var;
    }

    @Override // defpackage.z50
    public final void g(t50 t50Var) {
        nd0 nd0Var = (nd0) t50Var;
        boolean z = nd0Var.s;
        md0 md0Var = this.a;
        boolean z2 = (z && fr0.b(nd0Var.r.d(), md0Var.d())) ? false : true;
        nd0Var.r = md0Var;
        nd0Var.s = true;
        nd0Var.t = this.b;
        nd0Var.u = this.c;
        nd0Var.v = this.d;
        nd0Var.w = this.e;
        if (z2) {
            a50.z(nd0Var);
        }
        mz.H(nd0Var);
    }

    public final int hashCode() {
        int t = y6.t(this.d, (this.c.hashCode() + ((this.b.hashCode() + (((this.a.hashCode() * 31) + 1231) * 31)) * 31)) * 31, 31);
        q9 q9Var = this.e;
        return t + (q9Var == null ? 0 : q9Var.hashCode());
    }

    public final String toString() {
        return "PainterElement(painter=" + this.a + ", sizeToIntrinsics=true, alignment=" + this.b + ", contentScale=" + this.c + ", alpha=" + this.d + ", colorFilter=" + this.e + ')';
    }
}
