package o;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;

/* renamed from: o.Tc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class DialogC0498Tc extends Dialog implements InterfaceC0365Nz, ZF, MP {
    public C0417Pz h;
    public final LP i;
    public final YF j;

    public DialogC0498Tc(Context context, int i) {
        super(context, i);
        this.i = new LP(this);
        this.j = new YF(new D1(6, this));
    }

    public static void a(DialogC0498Tc dialogC0498Tc) {
        super.onBackPressed();
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        AbstractC0048Bt.n(view, "view");
        b();
        super.addContentView(view, layoutParams);
    }

    public final void b() {
        Window window = getWindow();
        AbstractC0048Bt.k(window);
        View decorView = window.getDecorView();
        AbstractC0048Bt.m(decorView, "window!!.decorView");
        ON.q(decorView, this);
        Window window2 = getWindow();
        AbstractC0048Bt.k(window2);
        View decorView2 = window2.getDecorView();
        AbstractC0048Bt.m(decorView2, "window!!.decorView");
        AbstractC0772bO.y(decorView2, this);
        Window window3 = getWindow();
        AbstractC0048Bt.k(window3);
        View decorView3 = window3.getDecorView();
        AbstractC0048Bt.m(decorView3, "window!!.decorView");
        AbstractC1494mO.k(decorView3, this);
    }

    @Override // o.InterfaceC0365Nz
    public final AbstractC0106Dz getLifecycle() {
        C0417Pz c0417Pz = this.h;
        if (c0417Pz != null) {
            return c0417Pz;
        }
        C0417Pz c0417Pz2 = new C0417Pz(this);
        this.h = c0417Pz2;
        return c0417Pz2;
    }

    @Override // o.ZF
    public final YF getOnBackPressedDispatcher() {
        return this.j;
    }

    @Override // o.MP
    public final KP getSavedStateRegistry() {
        return this.i.b;
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        this.j.b();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            AbstractC0048Bt.m(onBackInvokedDispatcher, "onBackInvokedDispatcher");
            YF yf = this.j;
            yf.getClass();
            yf.e = onBackInvokedDispatcher;
            yf.c(yf.g);
        }
        this.i.b(bundle);
        C0417Pz c0417Pz = this.h;
        if (c0417Pz == null) {
            c0417Pz = new C0417Pz(this);
            this.h = c0417Pz;
        }
        c0417Pz.e(EnumC0054Bz.ON_CREATE);
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle onSaveInstanceState = super.onSaveInstanceState();
        AbstractC0048Bt.m(onSaveInstanceState, "super.onSaveInstanceState()");
        this.i.c(onSaveInstanceState);
        return onSaveInstanceState;
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        C0417Pz c0417Pz = this.h;
        if (c0417Pz == null) {
            c0417Pz = new C0417Pz(this);
            this.h = c0417Pz;
        }
        c0417Pz.e(EnumC0054Bz.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        C0417Pz c0417Pz = this.h;
        if (c0417Pz == null) {
            c0417Pz = new C0417Pz(this);
            this.h = c0417Pz;
        }
        c0417Pz.e(EnumC0054Bz.ON_DESTROY);
        this.h = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        b();
        super.setContentView(i);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        AbstractC0048Bt.n(view, "view");
        b();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        AbstractC0048Bt.n(view, "view");
        b();
        super.setContentView(view, layoutParams);
    }
}
