package androidx.compose.foundation;

import defpackage.d9;
import defpackage.ge;
import defpackage.nq0;
import defpackage.nz;
import defpackage.px0;
import defpackage.rq0;
import defpackage.t50;
import defpackage.y6;
import defpackage.z50;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
final class BackgroundElement extends z50 {
    public final long a;
    public final px0 b;
    public final float c;
    public final rq0 d;

    public BackgroundElement(long j, nq0 nq0Var, rq0 rq0Var, int i) {
        j = (i & 1) != 0 ? ge.g : j;
        nq0Var = (i & 2) != 0 ? null : nq0Var;
        this.a = j;
        this.b = nq0Var;
        this.c = 1.0f;
        this.d = rq0Var;
    }

    public final boolean equals(Object obj) {
        BackgroundElement backgroundElement = obj instanceof BackgroundElement ? (BackgroundElement) obj : null;
        return backgroundElement != null && ge.c(this.a, backgroundElement.a) && nz.l(this.b, backgroundElement.b) && this.c == backgroundElement.c && nz.l(this.d, backgroundElement.d);
    }

    @Override // defpackage.z50
    public final t50 f() {
        d9 d9Var = new d9();
        d9Var.r = this.a;
        d9Var.s = this.b;
        d9Var.t = this.c;
        d9Var.u = this.d;
        d9Var.v = 9205357640488583168L;
        return d9Var;
    }

    @Override // defpackage.z50
    public final void g(t50 t50Var) {
        d9 d9Var = (d9) t50Var;
        d9Var.r = this.a;
        d9Var.s = this.b;
        d9Var.t = this.c;
        d9Var.u = this.d;
    }

    public final int hashCode() {
        int i = ge.i(this.a) * 31;
        px0 px0Var = this.b;
        return this.d.hashCode() + y6.t(this.c, (i + (px0Var != null ? px0Var.hashCode() : 0)) * 31, 31);
    }
}
