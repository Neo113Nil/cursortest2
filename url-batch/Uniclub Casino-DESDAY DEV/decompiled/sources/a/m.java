package a;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.EnumC0068l;
import androidx.lifecycle.H;

/* loaded from: classes.dex */
public class m extends Dialog implements androidx.lifecycle.r, y, h0.f {

    /* renamed from: a, reason: collision with root package name */
    public androidx.lifecycle.t f1073a;

    /* renamed from: b, reason: collision with root package name */
    public final h0.e f1074b;

    /* renamed from: c, reason: collision with root package name */
    public final x f1075c;

    public m(Context context, int i) {
        super(context, i);
        this.f1074b = new h0.e(this);
        this.f1075c = new x(new D0.p(7, this));
    }

    public static void a(m mVar) {
        X0.d.e(mVar, "this$0");
        super.onBackPressed();
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        X0.d.e(view, "view");
        d();
        super.addContentView(view, layoutParams);
    }

    @Override // h0.f
    public final h0.d b() {
        return this.f1074b.f2382b;
    }

    public final androidx.lifecycle.t c() {
        androidx.lifecycle.t tVar = this.f1073a;
        if (tVar != null) {
            return tVar;
        }
        androidx.lifecycle.t tVar2 = new androidx.lifecycle.t(this);
        this.f1073a = tVar2;
        return tVar2;
    }

    public final void d() {
        Window window = getWindow();
        X0.d.b(window);
        View decorView = window.getDecorView();
        X0.d.d(decorView, "window!!.decorView");
        H.f(decorView, this);
        Window window2 = getWindow();
        X0.d.b(window2);
        View decorView2 = window2.getDecorView();
        X0.d.d(decorView2, "window!!.decorView");
        q1.d.M(decorView2, this);
        Window window3 = getWindow();
        X0.d.b(window3);
        View decorView3 = window3.getDecorView();
        X0.d.d(decorView3, "window!!.decorView");
        q1.l.p0(decorView3, this);
    }

    @Override // androidx.lifecycle.r
    public final androidx.lifecycle.t e() {
        return c();
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        this.f1075c.b();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            X0.d.d(onBackInvokedDispatcher, "onBackInvokedDispatcher");
            x xVar = this.f1075c;
            xVar.getClass();
            xVar.f1102e = onBackInvokedDispatcher;
            xVar.c(xVar.f1104g);
        }
        this.f1074b.b(bundle);
        c().d(EnumC0068l.ON_CREATE);
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle onSaveInstanceState = super.onSaveInstanceState();
        X0.d.d(onSaveInstanceState, "super.onSaveInstanceState()");
        this.f1074b.c(onSaveInstanceState);
        return onSaveInstanceState;
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        c().d(EnumC0068l.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        c().d(EnumC0068l.ON_DESTROY);
        this.f1073a = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        d();
        super.setContentView(i);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        X0.d.e(view, "view");
        d();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        X0.d.e(view, "view");
        d();
        super.setContentView(view, layoutParams);
    }
}
