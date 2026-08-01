package androidx.compose.foundation;

import defpackage.nl;
import defpackage.nz;
import defpackage.r60;
import defpackage.t50;
import defpackage.ux;
import defpackage.vx;
import defpackage.z50;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
final class IndicationModifierElement extends z50 {
    public final r60 a;
    public final vx b;

    public IndicationModifierElement(r60 r60Var, vx vxVar) {
        this.a = r60Var;
        this.b = vxVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IndicationModifierElement)) {
            return false;
        }
        IndicationModifierElement indicationModifierElement = (IndicationModifierElement) obj;
        return nz.l(this.a, indicationModifierElement.a) && nz.l(this.b, indicationModifierElement.b);
    }

    @Override // defpackage.z50
    public final t50 f() {
        nl b = this.b.b(this.a);
        ux uxVar = new ux();
        uxVar.t = b;
        uxVar.j0(b);
        return uxVar;
    }

    @Override // defpackage.z50
    public final void g(t50 t50Var) {
        ux uxVar = (ux) t50Var;
        nl b = this.b.b(this.a);
        uxVar.k0(uxVar.t);
        uxVar.t = b;
        uxVar.j0(b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
