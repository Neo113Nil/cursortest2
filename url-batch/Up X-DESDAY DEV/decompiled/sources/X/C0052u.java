package X;

import android.os.Handler;
import android.view.View;
import android.view.Window;
import g.AbstractActivityC0126i;
import h0.C0133d;
import h0.InterfaceC0135f;

/* renamed from: X.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0052u extends q1.d implements androidx.lifecycle.P, a.y, InterfaceC0135f, M {

    /* renamed from: e, reason: collision with root package name */
    public final AbstractActivityC0126i f994e;

    /* renamed from: f, reason: collision with root package name */
    public final AbstractActivityC0126i f995f;

    /* renamed from: g, reason: collision with root package name */
    public final Handler f996g;
    public final I h;
    public final /* synthetic */ AbstractActivityC0126i i;

    public C0052u(AbstractActivityC0126i abstractActivityC0126i) {
        this.i = abstractActivityC0126i;
        Handler handler = new Handler();
        this.h = new I();
        this.f994e = abstractActivityC0126i;
        this.f995f = abstractActivityC0126i;
        this.f996g = handler;
    }

    @Override // X.M
    public final void a() {
    }

    @Override // h0.InterfaceC0135f
    public final C0133d b() {
        return this.i.d.f2376b;
    }

    @Override // androidx.lifecycle.P
    public final androidx.lifecycle.O c() {
        return this.i.c();
    }

    @Override // q1.d
    public final View c0(int i) {
        return this.i.findViewById(i);
    }

    @Override // androidx.lifecycle.r
    public final androidx.lifecycle.t d() {
        return this.i.f2322t;
    }

    @Override // q1.d
    public final boolean d0() {
        Window window = this.i.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }
}
