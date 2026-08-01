package a;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.EnumC0071l;
import androidx.lifecycle.J;
import i0.C0141d;
import i0.C0142e;
import i0.InterfaceC0143f;

/* loaded from: classes.dex */
public class l extends Dialog implements androidx.lifecycle.t, x, InterfaceC0143f {

    /* renamed from: a, reason: collision with root package name */
    public androidx.lifecycle.v f1203a;

    /* renamed from: b, reason: collision with root package name */
    public final C0142e f1204b;

    /* renamed from: c, reason: collision with root package name */
    public final w f1205c;

    public l(Context context, int i) {
        super(context, i);
        this.f1204b = new C0142e(this);
        this.f1205c = new w(new B0.b(8, this));
    }

    public static void a(l lVar) {
        g1.f.e(lVar, "this$0");
        super.onBackPressed();
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        g1.f.e(view, "view");
        e();
        super.addContentView(view, layoutParams);
    }

    @Override // i0.InterfaceC0143f
    public final C0141d b() {
        return this.f1204b.f2617b;
    }

    public final androidx.lifecycle.v c() {
        androidx.lifecycle.v vVar = this.f1203a;
        if (vVar != null) {
            return vVar;
        }
        androidx.lifecycle.v vVar2 = new androidx.lifecycle.v(this);
        this.f1203a = vVar2;
        return vVar2;
    }

    @Override // androidx.lifecycle.t
    public final androidx.lifecycle.v d() {
        return c();
    }

    public final void e() {
        Window window = getWindow();
        g1.f.b(window);
        View decorView = window.getDecorView();
        g1.f.d(decorView, "window!!.decorView");
        J.g(decorView, this);
        Window window2 = getWindow();
        g1.f.b(window2);
        View decorView2 = window2.getDecorView();
        g1.f.d(decorView2, "window!!.decorView");
        T.e.T(decorView2, this);
        Window window3 = getWindow();
        g1.f.b(window3);
        View decorView3 = window3.getDecorView();
        g1.f.d(decorView3, "window!!.decorView");
        h0.f.m(decorView3, this);
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        this.f1205c.b();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            g1.f.d(onBackInvokedDispatcher, "onBackInvokedDispatcher");
            w wVar = this.f1205c;
            wVar.getClass();
            wVar.f1229e = onBackInvokedDispatcher;
            wVar.c(wVar.f1231g);
        }
        this.f1204b.b(bundle);
        c().d(EnumC0071l.ON_CREATE);
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle onSaveInstanceState = super.onSaveInstanceState();
        g1.f.d(onSaveInstanceState, "super.onSaveInstanceState()");
        this.f1204b.c(onSaveInstanceState);
        return onSaveInstanceState;
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        c().d(EnumC0071l.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        c().d(EnumC0071l.ON_DESTROY);
        this.f1203a = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        e();
        super.setContentView(i);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        g1.f.e(view, "view");
        e();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        g1.f.e(view, "view");
        e();
        super.setContentView(view, layoutParams);
    }
}
