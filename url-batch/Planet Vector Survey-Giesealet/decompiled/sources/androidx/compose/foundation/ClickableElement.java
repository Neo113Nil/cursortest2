package androidx.compose.foundation;

import defpackage.bu;
import defpackage.ch0;
import defpackage.nl;
import defpackage.nz;
import defpackage.qd;
import defpackage.r60;
import defpackage.t50;
import defpackage.tl0;
import defpackage.vs;
import defpackage.vx;
import defpackage.xs;
import defpackage.z50;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
final class ClickableElement extends z50 {
    public final r60 a;
    public final vx b;
    public final boolean c;
    public final tl0 d;
    public final bu e;

    public ClickableElement(r60 r60Var, vx vxVar, boolean z, tl0 tl0Var, bu buVar) {
        this.a = r60Var;
        this.b = vxVar;
        this.c = z;
        this.d = tl0Var;
        this.e = buVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ClickableElement.class != obj.getClass()) {
            return false;
        }
        ClickableElement clickableElement = (ClickableElement) obj;
        return nz.l(this.a, clickableElement.a) && nz.l(this.b, clickableElement.b) && this.c == clickableElement.c && nz.l(this.d, clickableElement.d) && this.e == clickableElement.e;
    }

    @Override // defpackage.z50
    public final t50 f() {
        return new qd(this.a, this.b, this.c, this.d, this.e);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0075, code lost:
    
        if (r7.B == null) goto L36;
     */
    @Override // defpackage.z50
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(t50 t50Var) {
        boolean z;
        nl nlVar;
        qd qdVar = (qd) t50Var;
        xs xsVar = qdVar.z;
        r60 r60Var = qdVar.G;
        r60 r60Var2 = this.a;
        boolean z2 = true;
        boolean z3 = false;
        if (nz.l(r60Var, r60Var2)) {
            z = false;
        } else {
            qdVar.m0();
            qdVar.G = r60Var2;
            qdVar.t = r60Var2;
            z = true;
        }
        vx vxVar = qdVar.u;
        vx vxVar2 = this.b;
        if (!nz.l(vxVar, vxVar2)) {
            qdVar.u = vxVar2;
            z = true;
        }
        boolean z4 = qdVar.w;
        boolean z5 = this.c;
        if (z4 != z5) {
            vs vsVar = qdVar.y;
            if (z5) {
                qdVar.j0(vsVar);
                qdVar.j0(xsVar);
            } else {
                qdVar.k0(vsVar);
                qdVar.k0(xsVar);
                qdVar.m0();
            }
            ch0.h(qdVar);
            qdVar.w = z5;
        }
        tl0 tl0Var = qdVar.v;
        tl0 tl0Var2 = this.d;
        if (!nz.l(tl0Var, tl0Var2)) {
            qdVar.v = tl0Var2;
            ch0.h(qdVar);
        }
        qdVar.x = this.e;
        boolean z6 = qdVar.H;
        r60 r60Var3 = qdVar.G;
        if (z6 != (r60Var3 == null && qdVar.u != null)) {
            if (r60Var3 == null && qdVar.u != null) {
                z3 = true;
            }
            qdVar.H = z3;
            if (!z3) {
            }
        }
        z2 = z;
        if (z2 && ((nlVar = qdVar.B) != null || !qdVar.H)) {
            if (nlVar != null) {
                qdVar.k0(nlVar);
            }
            qdVar.B = null;
            qdVar.n0();
        }
        xsVar.m0(qdVar.t);
    }

    public final int hashCode() {
        r60 r60Var = this.a;
        int hashCode = (r60Var != null ? r60Var.hashCode() : 0) * 31;
        vx vxVar = this.b;
        int hashCode2 = (((hashCode + (vxVar != null ? vxVar.hashCode() : 0)) * 31) + (this.c ? 1231 : 1237)) * 961;
        tl0 tl0Var = this.d;
        return this.e.hashCode() + ((hashCode2 + (tl0Var != null ? tl0Var.a : 0)) * 31);
    }
}
