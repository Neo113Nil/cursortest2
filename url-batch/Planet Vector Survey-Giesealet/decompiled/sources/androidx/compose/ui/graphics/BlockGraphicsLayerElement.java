package androidx.compose.ui.graphics;

import defpackage.ea0;
import defpackage.mu;
import defpackage.nz;
import defpackage.r9;
import defpackage.t50;
import defpackage.z50;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
final class BlockGraphicsLayerElement extends z50 {
    public final mu a;

    public BlockGraphicsLayerElement(mu muVar) {
        this.a = muVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BlockGraphicsLayerElement) {
            return this.a == ((BlockGraphicsLayerElement) obj).a;
        }
        return false;
    }

    @Override // defpackage.z50
    public final t50 f() {
        r9 r9Var = new r9();
        r9Var.r = this.a;
        return r9Var;
    }

    @Override // defpackage.z50
    public final void g(t50 t50Var) {
        r9 r9Var = (r9) t50Var;
        r9Var.r = this.a;
        ea0 ea0Var = nz.Y(r9Var, 2).s;
        if (ea0Var != null) {
            ea0Var.S0(r9Var.r, true);
        }
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
