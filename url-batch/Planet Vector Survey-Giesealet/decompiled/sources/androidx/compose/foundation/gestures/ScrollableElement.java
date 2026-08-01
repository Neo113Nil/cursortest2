package androidx.compose.foundation.gestures;

import defpackage.bd0;
import defpackage.ch0;
import defpackage.dj;
import defpackage.j3;
import defpackage.j80;
import defpackage.k2;
import defpackage.ku0;
import defpackage.nz;
import defpackage.qo0;
import defpackage.r60;
import defpackage.ro0;
import defpackage.sc0;
import defpackage.t50;
import defpackage.z50;
import defpackage.zo0;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
final class ScrollableElement extends z50 {
    public final ro0 a;
    public final sc0 b;
    public final bd0 c;
    public final boolean d;
    public final r60 e;

    public ScrollableElement(r60 r60Var, sc0 sc0Var, bd0 bd0Var, ro0 ro0Var, boolean z) {
        this.a = ro0Var;
        this.b = sc0Var;
        this.c = bd0Var;
        this.d = z;
        this.e = r60Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScrollableElement)) {
            return false;
        }
        ScrollableElement scrollableElement = (ScrollableElement) obj;
        return nz.l(this.a, scrollableElement.a) && this.b == scrollableElement.b && this.c.equals(scrollableElement.c) && this.d == scrollableElement.d && nz.l(this.e, scrollableElement.e);
    }

    @Override // defpackage.z50
    public final t50 f() {
        return new qo0(this.e, this.b, this.c, this.a, this.d);
    }

    @Override // defpackage.z50
    public final void g(t50 t50Var) {
        boolean z;
        ku0 ku0Var;
        qo0 qo0Var = (qo0) t50Var;
        zo0 zo0Var = qo0Var.F;
        boolean z2 = true;
        boolean z3 = false;
        if (!qo0Var.v) {
            qo0Var.G.getClass();
            qo0Var.D.getClass();
            z = true;
        } else {
            z = false;
        }
        j3 j3Var = qo0Var.E;
        k2 k2Var = qo0Var.C;
        ro0 ro0Var = zo0Var.a;
        ro0 ro0Var2 = this.a;
        if (!nz.l(ro0Var, ro0Var2)) {
            zo0Var.a = ro0Var2;
            z3 = true;
        }
        bd0 bd0Var = this.c;
        zo0Var.b = bd0Var;
        sc0 sc0Var = zo0Var.d;
        sc0 sc0Var2 = this.b;
        if (sc0Var != sc0Var2) {
            zo0Var.d = sc0Var2;
            z3 = true;
        }
        boolean z4 = zo0Var.e;
        boolean z5 = this.d;
        if (z4 != z5) {
            zo0Var.e = z5;
            z3 = true;
        }
        zo0Var.c = j3Var;
        zo0Var.f = k2Var;
        dj djVar = qo0Var.H;
        djVar.r = sc0Var2;
        djVar.t = z5;
        qo0Var.B = bd0Var;
        j80 j80Var = j80.z;
        sc0 sc0Var3 = zo0Var.d;
        sc0 sc0Var4 = sc0.d;
        if (sc0Var3 != sc0Var4) {
            sc0Var4 = sc0.e;
        }
        qo0Var.u = j80Var;
        if (!qo0Var.v) {
            qo0Var.v = true;
            z3 = true;
        }
        r60 r60Var = qo0Var.w;
        r60 r60Var2 = this.e;
        if (!nz.l(r60Var, r60Var2)) {
            qo0Var.p0();
            qo0Var.w = r60Var2;
        }
        if (qo0Var.t != sc0Var4) {
            qo0Var.t = sc0Var4;
        } else {
            z2 = z3;
        }
        if (z2 && (ku0Var = qo0Var.A) != null) {
            ku0Var.k0();
        }
        if (z) {
            qo0Var.J = null;
            qo0Var.K = null;
            ch0.h(qo0Var);
        }
    }

    public final int hashCode() {
        int hashCode = (((((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31) + 1231) * 31) + (this.d ? 1231 : 1237)) * 961;
        r60 r60Var = this.e;
        return (hashCode + (r60Var != null ? r60Var.hashCode() : 0)) * 31;
    }
}
