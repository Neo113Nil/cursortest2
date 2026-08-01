package a;

import X.A;
import androidx.lifecycle.EnumC0069l;
import androidx.lifecycle.InterfaceC0073p;

/* loaded from: classes.dex */
public final class u implements InterfaceC0073p, c {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.lifecycle.t f1088a;

    /* renamed from: b, reason: collision with root package name */
    public final A f1089b;

    /* renamed from: c, reason: collision with root package name */
    public v f1090c;
    public final /* synthetic */ x d;

    public u(x xVar, androidx.lifecycle.t tVar, A a2) {
        X0.e.e(tVar, "lifecycle");
        X0.e.e(a2, "onBackPressedCallback");
        this.d = xVar;
        this.f1088a = tVar;
        this.f1089b = a2;
        tVar.a(this);
    }

    @Override // a.c
    public final void cancel() {
        this.f1088a.f(this);
        this.f1089b.f785b.remove(this);
        v vVar = this.f1090c;
        if (vVar != null) {
            vVar.cancel();
        }
        this.f1090c = null;
    }

    @Override // androidx.lifecycle.InterfaceC0073p
    public final void e(androidx.lifecycle.r rVar, EnumC0069l enumC0069l) {
        if (enumC0069l == EnumC0069l.ON_START) {
            x xVar = this.d;
            A a2 = this.f1089b;
            X0.e.e(a2, "onBackPressedCallback");
            xVar.f1098b.addLast(a2);
            v vVar = new v(xVar, a2);
            a2.f785b.add(vVar);
            xVar.d();
            a2.f786c = new w(1, xVar);
            this.f1090c = vVar;
            return;
        }
        if (enumC0069l != EnumC0069l.ON_STOP) {
            if (enumC0069l == EnumC0069l.ON_DESTROY) {
                cancel();
            }
        } else {
            v vVar2 = this.f1090c;
            if (vVar2 != null) {
                vVar2.cancel();
            }
        }
    }
}
