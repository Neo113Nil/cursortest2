package Y;

import android.os.Handler;
import android.view.View;
import android.view.Window;
import g.AbstractActivityC0129i;

/* renamed from: Y.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0058u extends F1.d implements androidx.lifecycle.S, a.y, i0.f, M {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractActivityC0129i f1528a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractActivityC0129i f1529b;

    /* renamed from: c, reason: collision with root package name */
    public final Handler f1530c;
    public final I d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC0129i f1531e;

    public C0058u(AbstractActivityC0129i abstractActivityC0129i) {
        this.f1531e = abstractActivityC0129i;
        Handler handler = new Handler();
        this.d = new I();
        this.f1528a = abstractActivityC0129i;
        this.f1529b = abstractActivityC0129i;
        this.f1530c = handler;
    }

    @Override // F1.d
    public final View T(int i) {
        return this.f1531e.findViewById(i);
    }

    @Override // F1.d
    public final boolean W() {
        Window window = this.f1531e.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }

    @Override // i0.f
    public final i0.d b() {
        return this.f1531e.d.f3037b;
    }

    @Override // androidx.lifecycle.S
    public final androidx.lifecycle.Q c() {
        return this.f1531e.c();
    }

    @Override // androidx.lifecycle.t
    public final androidx.lifecycle.v e() {
        return this.f1531e.f2675t;
    }

    @Override // Y.M
    public final void f() {
    }
}
