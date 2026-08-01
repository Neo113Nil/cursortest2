package androidx.compose.ui.layout;

import defpackage.jm0;
import defpackage.nz;
import defpackage.p10;
import defpackage.py;
import defpackage.t50;
import defpackage.z50;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
final class RulerProviderModifierElement extends z50 {
    public final py a;

    public RulerProviderModifierElement(py pyVar) {
        this.a = pyVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        RulerProviderModifierElement rulerProviderModifierElement = obj instanceof RulerProviderModifierElement ? (RulerProviderModifierElement) obj : null;
        return (rulerProviderModifierElement != null ? rulerProviderModifierElement.a : null) == this.a;
    }

    @Override // defpackage.z50
    public final t50 f() {
        return new jm0(this.a);
    }

    @Override // defpackage.z50
    public final void g(t50 t50Var) {
        jm0 jm0Var = (jm0) t50Var;
        py pyVar = jm0Var.r;
        py pyVar2 = this.a;
        if (pyVar != pyVar2) {
            jm0Var.r = pyVar2;
            p10.M(nz.a0(jm0Var), false, 7);
        }
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
