package yads;

import android.view.View;
import kotlin.reflect.KProperty;

/* loaded from: classes10.dex */
public abstract class ek3 {
    public static final /* synthetic */ KProperty[] b = {ra.a(ek3.class, "viewReference", "getViewReference()Landroid/view/View;", 0)};
    public final qm2 a;

    public ek3(View view) {
        this.a = new qm2(view);
    }

    public void a() {
    }

    public void a(View view) {
        view.setVisibility(8);
        view.setOnClickListener(null);
        view.setOnTouchListener(null);
        view.setSelected(false);
    }

    public abstract boolean a(View view, Object obj);

    public final View b() {
        qm2 qm2Var = this.a;
        KProperty kProperty = b[0];
        return (View) qm2Var.a.get();
    }

    public abstract void b(View view, Object obj);

    public final boolean c() {
        View b2 = b();
        return b2 != null && !hl3.b(b2) && b2.getWidth() >= 1 && b2.getHeight() >= 1;
    }

    public void a(ph phVar, hk3 hk3Var, Object obj) {
        View b2 = b();
        if (b2 == null) {
            return;
        }
        hk3Var.a(b2, phVar);
        hk3Var.a(phVar, new gk3(b2));
    }
}
