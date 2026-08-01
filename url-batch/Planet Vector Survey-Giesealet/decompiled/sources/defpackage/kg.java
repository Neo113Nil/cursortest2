package defpackage;

import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class kg extends v00 implements ru {
    public static final kg f = new kg(3, 0);
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kg(int i, int i2) {
        super(i);
        this.e = i2;
    }

    @Override // defpackage.ru
    public final Object b(Object obj, Object obj2, Object obj3) {
        i21 i21Var;
        switch (this.e) {
            case 0:
                ((Number) obj3).intValue();
                return ky0.a;
            default:
                ((Number) obj3).intValue();
                qh qhVar = (qh) ((ih) obj2);
                qhVar.V(359872873);
                WeakHashMap weakHashMap = i21.u;
                View view = (View) qhVar.j(AndroidCompositionLocals_androidKt.f);
                WeakHashMap weakHashMap2 = i21.u;
                synchronized (weakHashMap2) {
                    try {
                        Object obj4 = weakHashMap2.get(view);
                        if (obj4 == null) {
                            obj4 = new i21(view);
                            weakHashMap2.put(view, obj4);
                        }
                        i21Var = (i21) obj4;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                boolean h = qhVar.h(i21Var) | qhVar.h(view);
                Object K = qhVar.K();
                if (h || K == hh.a) {
                    K = new y3(24, i21Var, view);
                    qhVar.e0(K);
                }
                mz.h(i21Var, (mu) K, qhVar);
                boolean f2 = qhVar.f(i21Var);
                Object K2 = qhVar.K();
                if (f2 || K2 == hh.a) {
                    K2 = new sy(i21Var.g);
                    qhVar.e0(K2);
                }
                sy syVar = (sy) K2;
                qhVar.q(false);
                return syVar;
        }
    }
}
