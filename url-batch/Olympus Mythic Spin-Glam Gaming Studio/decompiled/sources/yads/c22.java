package yads;

import android.view.View;
import android.view.ViewTreeObserver;
import kotlin.reflect.KProperty;

/* loaded from: classes3.dex */
public final class c22 implements ViewTreeObserver.OnGlobalLayoutListener {
    public static final /* synthetic */ KProperty[] d = {ra.a(c22.class, "viewReference", "getViewReference()Landroid/view/View;", 0)};
    public final e42 a;
    public final qm2 b;
    public Integer c;

    public c22(View view, e42 e42Var) {
        this.a = e42Var;
        this.b = new qm2(view);
    }

    public final void a() {
        ViewTreeObserver viewTreeObserver;
        qm2 qm2Var = this.b;
        KProperty kProperty = d[0];
        View view = (View) qm2Var.a.get();
        if (view == null || (viewTreeObserver = view.getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.removeOnGlobalLayoutListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        qm2 qm2Var = this.b;
        KProperty kProperty = d[0];
        View view = (View) qm2Var.a.get();
        if (view != null) {
            int visibility = view.getVisibility();
            Integer num = this.c;
            if (num != null && visibility == num.intValue()) {
                return;
            }
            this.c = Integer.valueOf(visibility);
            if (visibility == 0) {
                this.a.a.i();
            } else {
                this.a.a.j();
            }
        }
    }
}
