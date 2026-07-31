package yads;

import android.view.View;
import android.view.ViewTreeObserver;
import kotlin.reflect.KProperty;

/* loaded from: classes5.dex */
public final class j22 implements View.OnAttachStateChangeListener {
    public static final /* synthetic */ KProperty[] d = {ra.a(j22.class, "viewReference", "getViewReference()Landroid/view/View;", 0)};
    public final e42 a;
    public c22 b;
    public final qm2 c;

    public j22(View view, e42 e42Var) {
        this.a = e42Var;
        this.c = new qm2(view);
    }

    public final void a() {
        ViewTreeObserver viewTreeObserver;
        qm2 qm2Var = this.c;
        KProperty[] kPropertyArr = d;
        KProperty kProperty = kPropertyArr[0];
        View view = (View) qm2Var.a.get();
        if (view != null) {
            view.addOnAttachStateChangeListener(this);
        }
        qm2 qm2Var2 = this.c;
        KProperty kProperty2 = kPropertyArr[0];
        View view2 = (View) qm2Var2.a.get();
        if (view2 != null && view2.isAttachedToWindow()) {
            c22 c22Var = new c22(view2, this.a);
            this.b = c22Var;
            qm2 qm2Var3 = c22Var.b;
            KProperty kProperty3 = c22.d[0];
            View view3 = (View) qm2Var3.a.get();
            if (view3 == null || (viewTreeObserver = view3.getViewTreeObserver()) == null) {
                return;
            }
            viewTreeObserver.addOnGlobalLayoutListener(c22Var);
        }
    }

    public final void b() {
        c22 c22Var = this.b;
        if (c22Var != null) {
            c22Var.a();
        }
        this.b = null;
        qm2 qm2Var = this.c;
        KProperty kProperty = d[0];
        View view = (View) qm2Var.a.get();
        if (view != null) {
            view.removeOnAttachStateChangeListener(this);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        ViewTreeObserver viewTreeObserver;
        this.a.a.i();
        qm2 qm2Var = this.c;
        KProperty kProperty = d[0];
        View view2 = (View) qm2Var.a.get();
        if (view2 != null && view2.isAttachedToWindow()) {
            c22 c22Var = new c22(view2, this.a);
            this.b = c22Var;
            qm2 qm2Var2 = c22Var.b;
            KProperty kProperty2 = c22.d[0];
            View view3 = (View) qm2Var2.a.get();
            if (view3 == null || (viewTreeObserver = view3.getViewTreeObserver()) == null) {
                return;
            }
            viewTreeObserver.addOnGlobalLayoutListener(c22Var);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        c22 c22Var = this.b;
        if (c22Var != null) {
            c22Var.a();
        }
        this.b = null;
        this.a.a.j();
    }
}
