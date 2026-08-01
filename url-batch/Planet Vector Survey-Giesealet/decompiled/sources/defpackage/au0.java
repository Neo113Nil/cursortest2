package defpackage;

import androidx.compose.foundation.BorderModifierNodeElement;
import androidx.compose.ui.graphics.a;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public abstract class au0 {
    public static final ji a = new ji(gi.A);

    public static final void a(u50 u50Var, rq0 rq0Var, long j, long j2, float f, z9 z9Var, qu quVar, ih ihVar, int i, int i2) {
        if ((i2 & 1) != 0) {
            u50Var = r50.a;
        }
        if ((i2 & 2) != 0) {
            rq0Var = px0.f;
        }
        if ((i2 & 4) != 0) {
            j = ((ke) ((qh) ihVar).j(le.a)).p;
        }
        if ((i2 & 8) != 0) {
            j2 = le.b(j, ihVar);
        }
        if ((i2 & 32) != 0) {
            f = 0.0f;
        }
        if ((i2 & 64) != 0) {
            z9Var = null;
        }
        qh qhVar = (qh) ihVar;
        ji jiVar = a;
        float f2 = ((jn) qhVar.j(jiVar)).d + 0.0f;
        nz.c(new ki0[]{aj.a.a(new ge(j2)), jiVar.a(new jn(f2))}, a50.E(-70914509, new yt0(u50Var, rq0Var, j, f2, z9Var, f, quVar), qhVar), qhVar, 56);
    }

    public static final u50 b(u50 u50Var, rq0 rq0Var, long j, z9 z9Var, float f) {
        u50 u50Var2 = r50.a;
        u50 c = u50Var.c(f > 0.0f ? a.b(u50Var2, f, rq0Var, 124895) : u50Var2);
        if (z9Var != null) {
            u50Var2 = new BorderModifierNodeElement(z9Var.a, z9Var.b, rq0Var);
        }
        return a.c(androidx.compose.foundation.a.b(c.c(u50Var2), j, rq0Var), rq0Var, 518143);
    }

    public static final long c(long j, float f, ih ihVar) {
        qh qhVar = (qh) ihVar;
        ke keVar = (ke) qhVar.j(le.a);
        boolean booleanValue = ((Boolean) qhVar.j(le.b)).booleanValue();
        long j2 = keVar.p;
        if (!ge.c(j, j2) || !booleanValue) {
            return j;
        }
        if (jn.a(f, 0.0f)) {
            return j2;
        }
        return d31.n(ge.b(keVar.t, ((((float) Math.log(f + 1.0f)) * 4.5f) + 2.0f) / 100.0f), j2);
    }
}
