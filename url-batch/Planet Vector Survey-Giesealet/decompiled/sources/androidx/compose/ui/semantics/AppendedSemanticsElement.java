package androidx.compose.ui.semantics;

import defpackage.mu;
import defpackage.nj;
import defpackage.t50;
import defpackage.z50;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class AppendedSemanticsElement extends z50 {
    public final mu a;

    public AppendedSemanticsElement(mu muVar) {
        this.a = muVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AppendedSemanticsElement) && this.a == ((AppendedSemanticsElement) obj).a;
    }

    @Override // defpackage.z50
    public final t50 f() {
        nj njVar = new nj();
        njVar.r = this.a;
        return njVar;
    }

    @Override // defpackage.z50
    public final void g(t50 t50Var) {
        nj njVar = (nj) t50Var;
        njVar.getClass();
        njVar.r = this.a;
    }

    public final int hashCode() {
        return this.a.hashCode() + 38347;
    }
}
