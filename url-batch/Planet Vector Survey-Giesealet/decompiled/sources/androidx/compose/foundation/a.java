package androidx.compose.foundation;

import defpackage.bu;
import defpackage.gh;
import defpackage.nq0;
import defpackage.px0;
import defpackage.r60;
import defpackage.rq0;
import defpackage.rx;
import defpackage.tl0;
import defpackage.u50;
import defpackage.vx;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public abstract class a {
    public static u50 a(u50 u50Var, nq0 nq0Var) {
        return u50Var.c(new BackgroundElement(0L, nq0Var, px0.f, 1));
    }

    public static final u50 b(u50 u50Var, long j, rq0 rq0Var) {
        return u50Var.c(new BackgroundElement(j, null, rq0Var, 2));
    }

    public static u50 c(u50 u50Var, r60 r60Var, rx rxVar, boolean z, tl0 tl0Var, bu buVar, int i) {
        if ((i & 16) != 0) {
            tl0Var = null;
        }
        tl0 tl0Var2 = tl0Var;
        return u50Var.c(rxVar instanceof vx ? new ClickableElement(r60Var, (vx) rxVar, z, tl0Var2, buVar) : rxVar == null ? new ClickableElement(r60Var, null, z, tl0Var2, buVar) : r60Var != null ? c.a(r60Var, rxVar).c(new ClickableElement(r60Var, null, z, tl0Var2, buVar)) : new gh(new b(rxVar, z, tl0Var2, buVar)));
    }
}
