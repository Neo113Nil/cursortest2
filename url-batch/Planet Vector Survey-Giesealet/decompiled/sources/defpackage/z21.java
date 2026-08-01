package defpackage;

import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.vectorharbor.planetvectorsurvey.R;
import java.util.Set;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class z21 extends v00 implements qu {
    public final /* synthetic */ int e;
    public final /* synthetic */ a31 f;
    public final /* synthetic */ qu g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z21(a31 a31Var, qu quVar, int i) {
        super(2);
        this.e = i;
        this.f = a31Var;
        this.g = quVar;
    }

    @Override // defpackage.qu
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        ky0 ky0Var = ky0.a;
        qu quVar = this.g;
        a31 a31Var = this.f;
        int i2 = 1;
        int i3 = 0;
        switch (i) {
            case 0:
                ih ihVar = (ih) obj;
                int intValue = ((Number) obj2).intValue();
                qh qhVar = (qh) ihVar;
                if (!qhVar.N(intValue & 1, (intValue & 3) != 2)) {
                    qhVar.Q();
                    break;
                } else {
                    AndroidCompositionLocals_androidKt.a(a31Var.d, quVar, qhVar, 0);
                    break;
                }
            default:
                ih ihVar2 = (ih) obj;
                int intValue2 = ((Number) obj2).intValue();
                qh qhVar2 = (qh) ihVar2;
                if (!qhVar2.N(intValue2 & 1, (intValue2 & 3) != 2)) {
                    qhVar2.Q();
                    break;
                } else {
                    f3 f3Var = a31Var.d;
                    Object tag = f3Var.getTag(R.id.inspection_slot_table_set);
                    kj kjVar = null;
                    Set set = (!(tag instanceof Set) || ((tag instanceof j00) && !(tag instanceof m00))) ? null : (Set) tag;
                    if (set == null) {
                        Object parent = f3Var.getParent();
                        View view = parent instanceof View ? (View) parent : null;
                        Object tag2 = view != null ? view.getTag(R.id.inspection_slot_table_set) : null;
                        set = (!(tag2 instanceof Set) || ((tag2 instanceof j00) && !(tag2 instanceof m00))) ? null : (Set) tag2;
                    }
                    if (set != null) {
                        xh xhVar = qhVar2.S;
                        if (xhVar == null) {
                            xhVar = new xh(qhVar2.g);
                            qhVar2.S = xhVar;
                        }
                        set.add(xhVar);
                        qhVar2.p = true;
                        qhVar2.B = true;
                        qhVar2.c.b();
                        qhVar2.G.b();
                        mr0 mr0Var = qhVar2.H;
                        jr0 jr0Var = mr0Var.a;
                        mr0Var.e = jr0Var.m;
                        mr0Var.f = jr0Var.n;
                    }
                    boolean h = qhVar2.h(a31Var);
                    Object K = qhVar2.K();
                    y7 y7Var = hh.a;
                    if (h || K == y7Var) {
                        K = new y21(a31Var, kjVar, i3);
                        qhVar2.e0(K);
                    }
                    mz.k(qhVar2, (qu) K, f3Var);
                    boolean h2 = qhVar2.h(a31Var);
                    Object K2 = qhVar2.K();
                    if (h2 || K2 == y7Var) {
                        K2 = new y21(a31Var, kjVar, i2);
                        qhVar2.e0(K2);
                    }
                    mz.k(qhVar2, (qu) K2, f3Var);
                    nz.b(vy.a.a(set), a50.E(-280240369, new z21(a31Var, quVar, i3), qhVar2), qhVar2, 56);
                    break;
                }
                break;
        }
        return ky0Var;
    }
}
