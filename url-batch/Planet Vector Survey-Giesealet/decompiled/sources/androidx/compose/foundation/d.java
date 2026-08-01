package androidx.compose.foundation;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import defpackage.ad0;
import defpackage.b2;
import defpackage.bd0;
import defpackage.hh;
import defpackage.ho0;
import defpackage.ih;
import defpackage.q4;
import defpackage.qh;
import defpackage.r60;
import defpackage.ru;
import defpackage.sc0;
import defpackage.td;
import defpackage.u50;
import defpackage.v00;
import defpackage.y6;
import defpackage.zc0;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class d extends v00 implements ru {
    public final /* synthetic */ ho0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(ho0 ho0Var) {
        super(3);
        this.e = ho0Var;
    }

    @Override // defpackage.ru
    public final Object b(Object obj, Object obj2, Object obj3) {
        bd0 bd0Var;
        ((Number) obj3).intValue();
        qh qhVar = (qh) ((ih) obj2);
        qhVar.V(1478351300);
        ho0 ho0Var = this.e;
        ScrollSemanticsElement scrollSemanticsElement = new ScrollSemanticsElement(ho0Var);
        r60 r60Var = ho0Var.c;
        Context context = (Context) qhVar.j(AndroidCompositionLocals_androidKt.b);
        zc0 zc0Var = (zc0) qhVar.j(ad0.a);
        if (zc0Var != null) {
            qhVar.V(1586021609);
            boolean f = qhVar.f(context) | qhVar.f(zc0Var);
            Object K = qhVar.K();
            if (f || K == hh.a) {
                K = new q4(context, zc0Var);
                qhVar.e0(K);
            }
            bd0Var = (q4) K;
            qhVar.q(false);
        } else {
            qhVar.V(1586120933);
            qhVar.q(false);
            bd0Var = b2.I;
        }
        bd0 bd0Var2 = bd0Var;
        u50 c = y6.d(scrollSemanticsElement, td.a).c(bd0Var2.i());
        u50 c2 = androidx.compose.foundation.gestures.a.b(c, ho0Var, sc0.d, bd0Var2, true, r60Var).c(new ScrollingLayoutElement(ho0Var));
        qhVar.q(false);
        return c2;
    }
}
