package Y;

import android.os.Handler;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.FragmentActivity;
import i0.C0141d;
import i0.InterfaceC0143f;

/* renamed from: Y.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0052u extends T.e implements androidx.lifecycle.S, a.x, InterfaceC0143f, M {

    /* renamed from: a, reason: collision with root package name */
    public final FragmentActivity f1147a;

    /* renamed from: b, reason: collision with root package name */
    public final FragmentActivity f1148b;

    /* renamed from: c, reason: collision with root package name */
    public final Handler f1149c;
    public final I d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ FragmentActivity f1150e;

    public C0052u(FragmentActivity fragmentActivity) {
        this.f1150e = fragmentActivity;
        Handler handler = new Handler();
        this.d = new I();
        this.f1147a = fragmentActivity;
        A.c.l(fragmentActivity, "context == null");
        this.f1148b = fragmentActivity;
        this.f1149c = handler;
    }

    @Override // T.e
    public final View H(int i) {
        return this.f1150e.findViewById(i);
    }

    @Override // T.e
    public final boolean I() {
        Window window = this.f1150e.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }

    @Override // Y.M
    public final void a() {
        this.f1150e.getClass();
    }

    @Override // i0.InterfaceC0143f
    public final C0141d b() {
        return this.f1150e.d.f2617b;
    }

    @Override // androidx.lifecycle.S
    public final androidx.lifecycle.Q c() {
        return this.f1150e.c();
    }

    @Override // androidx.lifecycle.t
    public final androidx.lifecycle.v d() {
        return this.f1150e.f1479t;
    }
}
