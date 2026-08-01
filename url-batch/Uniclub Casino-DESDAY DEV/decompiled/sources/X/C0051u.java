package X;

import android.os.Handler;
import android.view.View;
import android.view.Window;
import g.AbstractActivityC0138i;

/* renamed from: X.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0051u extends q1.l implements androidx.lifecycle.P, a.y, h0.f, M {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractActivityC0138i f998a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractActivityC0138i f999b;

    /* renamed from: c, reason: collision with root package name */
    public final Handler f1000c;
    public final I d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC0138i f1001e;

    public C0051u(AbstractActivityC0138i abstractActivityC0138i) {
        this.f1001e = abstractActivityC0138i;
        Handler handler = new Handler();
        this.d = new I();
        this.f998a = abstractActivityC0138i;
        this.f999b = abstractActivityC0138i;
        this.f1000c = handler;
    }

    @Override // h0.f
    public final h0.d b() {
        return this.f1001e.d.f2382b;
    }

    @Override // androidx.lifecycle.P
    public final androidx.lifecycle.O c() {
        return this.f1001e.c();
    }

    @Override // q1.l
    public final View c0(int i) {
        return this.f1001e.findViewById(i);
    }

    @Override // androidx.lifecycle.r
    public final androidx.lifecycle.t e() {
        return this.f1001e.f2328t;
    }

    @Override // X.M
    public final void f() {
    }

    @Override // q1.l
    public final boolean f0() {
        Window window = this.f1001e.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }
}
