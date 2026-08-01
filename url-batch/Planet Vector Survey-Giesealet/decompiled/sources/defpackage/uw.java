package defpackage;

import androidx.compose.foundation.layout.c;
import androidx.compose.ui.draw.a;
import androidx.compose.ui.semantics.AppendedSemanticsElement;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public abstract class uw {
    public static final u50 a = c.c(r50.a, 24.0f);

    public static final void a(ax axVar, u50 u50Var, long j, ih ihVar, int i) {
        long j2;
        u50 u50Var2;
        qh qhVar = (qh) ihVar;
        qhVar.W(-126890956);
        if ((((qhVar.f(axVar) ? 4 : 2) | i | 384) & 1171) == 1170 && qhVar.z()) {
            qhVar.Q();
            j2 = j;
            u50Var2 = u50Var;
        } else {
            qhVar.S();
            if ((i & 1) == 0 || qhVar.x()) {
                u50Var = r50.a;
            } else {
                qhVar.Q();
            }
            u50 u50Var3 = u50Var;
            qhVar.r();
            b(ze0.s(axVar, qhVar), u50Var3, j, qhVar, 3512);
            j2 = j;
            u50Var2 = u50Var3;
        }
        ri0 s = qhVar.s();
        if (s != null) {
            s.d = new nb(axVar, u50Var2, j2, i);
        }
    }

    public static final void b(md0 md0Var, u50 u50Var, long j, ih ihVar, int i) {
        int i2;
        u50 u50Var2;
        qh qhVar = (qh) ihVar;
        qhVar.W(-2142239481);
        if ((i & 6) == 0) {
            i2 = (qhVar.h(md0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= qhVar.f("Back") ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= qhVar.f(u50Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= qhVar.e(j) ? 2048 : 1024;
        }
        if ((i2 & 1171) == 1170 && qhVar.z()) {
            qhVar.Q();
        } else {
            qhVar.S();
            if ((i & 1) != 0 && !qhVar.x()) {
                qhVar.Q();
            }
            qhVar.r();
            int i3 = 1;
            boolean z = (((i2 & 7168) ^ 3072) > 2048 && qhVar.e(j)) || (i2 & 3072) == 2048;
            Object K = qhVar.K();
            y7 y7Var = hh.a;
            if (z || K == y7Var) {
                K = ge.c(j, ge.g) ? null : new q9(j, 5);
                qhVar.e0(K);
            }
            q9 q9Var = (q9) K;
            qhVar.V(-2144891392);
            boolean z2 = (i2 & 112) == 32;
            Object K2 = qhVar.K();
            if (z2 || K2 == y7Var) {
                K2 = new cz0(i3, 18);
                qhVar.e0(K2);
            }
            AtomicInteger atomicInteger = op0.a;
            AppendedSemanticsElement appendedSemanticsElement = new AppendedSemanticsElement((mu) K2);
            qhVar.q(false);
            if (!fr0.b(md0Var.d(), 9205357640488583168L)) {
                long d = md0Var.d();
                if (!Float.isInfinite(fr0.e(d)) || !Float.isInfinite(fr0.c(d))) {
                    u50Var2 = r50.a;
                    ca.a(a.b(u50Var.c(u50Var2), md0Var, ej.b, 0.0f, q9Var, 22).c(appendedSemanticsElement), qhVar, 0);
                }
            }
            u50Var2 = a;
            ca.a(a.b(u50Var.c(u50Var2), md0Var, ej.b, 0.0f, q9Var, 22).c(appendedSemanticsElement), qhVar, 0);
        }
        ri0 s = qhVar.s();
        if (s != null) {
            s.d = new tw(md0Var, u50Var, j, i);
        }
    }
}
