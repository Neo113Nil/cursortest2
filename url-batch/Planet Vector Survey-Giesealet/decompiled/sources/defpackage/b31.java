package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.vectorharbor.planetvectorsurvey.R;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public abstract class b31 {
    public static final ViewGroup.LayoutParams a = new ViewGroup.LayoutParams(-2, -2);

    /* JADX WARN: Removed duplicated region for block: B:19:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final a31 a(k kVar, vh vhVar, eg egVar) {
        f3 f3Var;
        a31 a31Var;
        if (kv.a.compareAndSet(false, true)) {
            eb b = x40.b(1, null, 6);
            d31.E(x40.d((rj) p5.p.getValue()), null, new u6(b, null, 6), 3);
            f2 f2Var = new f2(12, b);
            synchronized (ur0.c) {
                ur0.i = zd.k0(ur0.i, f2Var);
            }
            ur0.a();
        }
        if (kVar.getChildCount() > 0) {
            View childAt = kVar.getChildAt(0);
            if (childAt instanceof f3) {
                f3Var = (f3) childAt;
                if (f3Var == null) {
                    f3Var = new f3(kVar.getContext(), vhVar.i());
                    kVar.addView(f3Var.getView(), a);
                }
                Object tag = f3Var.getView().getTag(R.id.wrapped_composition_tag);
                a31Var = tag instanceof a31 ? (a31) tag : null;
                if (a31Var == null) {
                    a31Var = new a31(f3Var, new bi(vhVar, new t7(f3Var.getRoot())));
                    f3Var.getView().setTag(R.id.wrapped_composition_tag, a31Var);
                }
                a31Var.i(egVar);
                if (!nz.l(f3Var.getCoroutineContext(), vhVar.i())) {
                    f3Var.setCoroutineContext(vhVar.i());
                }
                return a31Var;
            }
        } else {
            kVar.removeAllViews();
        }
        f3Var = null;
        if (f3Var == null) {
        }
        Object tag2 = f3Var.getView().getTag(R.id.wrapped_composition_tag);
        if (tag2 instanceof a31) {
        }
        if (a31Var == null) {
        }
        a31Var.i(egVar);
        if (!nz.l(f3Var.getCoroutineContext(), vhVar.i())) {
        }
        return a31Var;
    }
}
