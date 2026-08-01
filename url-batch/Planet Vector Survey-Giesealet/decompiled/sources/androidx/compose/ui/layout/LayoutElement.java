package androidx.compose.ui.layout;

import defpackage.h10;
import defpackage.ru;
import defpackage.t50;
import defpackage.z50;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
final class LayoutElement extends z50 {
    public final ru a;

    public LayoutElement(ru ruVar) {
        this.a = ruVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LayoutElement) {
            return this.a == ((LayoutElement) obj).a;
        }
        return false;
    }

    @Override // defpackage.z50
    public final t50 f() {
        h10 h10Var = new h10();
        h10Var.r = this.a;
        return h10Var;
    }

    @Override // defpackage.z50
    public final void g(t50 t50Var) {
        ((h10) t50Var).r = this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
