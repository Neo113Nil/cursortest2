package androidx.compose.ui.draw;

import defpackage.io;
import defpackage.mu;
import defpackage.t50;
import defpackage.z50;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
final class DrawBehindElement extends z50 {
    public final mu a;

    public DrawBehindElement(mu muVar) {
        this.a = muVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DrawBehindElement) {
            return this.a == ((DrawBehindElement) obj).a;
        }
        return false;
    }

    @Override // defpackage.z50
    public final t50 f() {
        io ioVar = new io();
        ioVar.r = this.a;
        return ioVar;
    }

    @Override // defpackage.z50
    public final void g(t50 t50Var) {
        ((io) t50Var).r = this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
