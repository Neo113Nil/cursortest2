package a;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.EnumC0079l;
import androidx.lifecycle.J;
import c1.AbstractC0104b;

/* loaded from: classes.dex */
public class m extends Dialog implements androidx.lifecycle.t, y, i0.f {

    /* renamed from: a, reason: collision with root package name */
    public androidx.lifecycle.v f1597a;

    /* renamed from: b, reason: collision with root package name */
    public final i0.e f1598b;

    /* renamed from: c, reason: collision with root package name */
    public final x f1599c;

    public m(Context context, int i) {
        super(context, i);
        this.f1598b = new i0.e(this);
        this.f1599c = new x(new G0.o(9, this));
    }

    public static void a(m mVar) {
        i1.f.e(mVar, "this$0");
        super.onBackPressed();
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        i1.f.e(view, "view");
        d();
        super.addContentView(view, layoutParams);
    }

    @Override // i0.f
    public final i0.d b() {
        return this.f1598b.f3037b;
    }

    public final androidx.lifecycle.v c() {
        androidx.lifecycle.v vVar = this.f1597a;
        if (vVar != null) {
            return vVar;
        }
        androidx.lifecycle.v vVar2 = new androidx.lifecycle.v(this);
        this.f1597a = vVar2;
        return vVar2;
    }

    public final void d() {
        Window window = getWindow();
        i1.f.b(window);
        View decorView = window.getDecorView();
        i1.f.d(decorView, "window!!.decorView");
        J.g(decorView, this);
        Window window2 = getWindow();
        i1.f.b(window2);
        View decorView2 = window2.getDecorView();
        i1.f.d(decorView2, "window!!.decorView");
        F1.l.g0(decorView2, this);
        Window window3 = getWindow();
        i1.f.b(window3);
        View decorView3 = window3.getDecorView();
        i1.f.d(decorView3, "window!!.decorView");
        AbstractC0104b.w(decorView3, this);
    }

    @Override // androidx.lifecycle.t
    public final androidx.lifecycle.v e() {
        return c();
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        this.f1599c.b();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            i1.f.d(onBackInvokedDispatcher, "onBackInvokedDispatcher");
            x xVar = this.f1599c;
            xVar.getClass();
            xVar.f1623e = onBackInvokedDispatcher;
            xVar.c(xVar.f1625g);
        }
        this.f1598b.b(bundle);
        c().d(EnumC0079l.ON_CREATE);
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle onSaveInstanceState = super.onSaveInstanceState();
        i1.f.d(onSaveInstanceState, "super.onSaveInstanceState()");
        this.f1598b.c(onSaveInstanceState);
        return onSaveInstanceState;
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        c().d(EnumC0079l.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        c().d(EnumC0079l.ON_DESTROY);
        this.f1597a = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        d();
        super.setContentView(i);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        i1.f.e(view, "view");
        d();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        i1.f.e(view, "view");
        d();
        super.setContentView(view, layoutParams);
    }
}
