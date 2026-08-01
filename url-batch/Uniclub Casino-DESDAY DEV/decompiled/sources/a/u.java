package a;

import X.A;
import androidx.lifecycle.EnumC0068l;
import androidx.lifecycle.InterfaceC0072p;

/* loaded from: classes.dex */
public final class u implements InterfaceC0072p, c {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.lifecycle.t f1090a;

    /* renamed from: b, reason: collision with root package name */
    public final A f1091b;

    /* renamed from: c, reason: collision with root package name */
    public v f1092c;
    public final /* synthetic */ x d;

    public u(x xVar, androidx.lifecycle.t tVar, A a2) {
        X0.d.e(tVar, "lifecycle");
        X0.d.e(a2, "onBackPressedCallback");
        this.d = xVar;
        this.f1090a = tVar;
        this.f1091b = a2;
        tVar.a(this);
    }

    @Override // a.c
    public final void cancel() {
        this.f1090a.f(this);
        this.f1091b.f789b.remove(this);
        v vVar = this.f1092c;
        if (vVar != null) {
            vVar.cancel();
        }
        this.f1092c = null;
    }

    @Override // androidx.lifecycle.InterfaceC0072p
    public final void e(androidx.lifecycle.r rVar, EnumC0068l enumC0068l) {
        if (enumC0068l == EnumC0068l.ON_START) {
            x xVar = this.d;
            A a2 = this.f1091b;
            X0.d.e(a2, "onBackPressedCallback");
            xVar.f1100b.addLast(a2);
            v vVar = new v(xVar, a2);
            a2.f789b.add(vVar);
            xVar.d();
            a2.f790c = new w(1, xVar);
            this.f1092c = vVar;
            return;
        }
        if (enumC0068l != EnumC0068l.ON_STOP) {
            if (enumC0068l == EnumC0068l.ON_DESTROY) {
                cancel();
            }
        } else {
            v vVar2 = this.f1092c;
            if (vVar2 != null) {
                vVar2.cancel();
            }
        }
    }
}
