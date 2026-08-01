package a;

import X.A;
import androidx.lifecycle.EnumC0069l;
import androidx.lifecycle.InterfaceC0073p;

/* loaded from: classes.dex */
public final class u implements InterfaceC0073p, c {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.lifecycle.t f1091a;

    /* renamed from: b, reason: collision with root package name */
    public final A f1092b;

    /* renamed from: c, reason: collision with root package name */
    public v f1093c;
    public final /* synthetic */ x d;

    public u(x xVar, androidx.lifecycle.t tVar, A a2) {
        X0.d.e(tVar, "lifecycle");
        X0.d.e(a2, "onBackPressedCallback");
        this.d = xVar;
        this.f1091a = tVar;
        this.f1092b = a2;
        tVar.a(this);
    }

    @Override // a.c
    public final void cancel() {
        this.f1091a.f(this);
        this.f1092b.f791b.remove(this);
        v vVar = this.f1093c;
        if (vVar != null) {
            vVar.cancel();
        }
        this.f1093c = null;
    }

    @Override // androidx.lifecycle.InterfaceC0073p
    public final void e(androidx.lifecycle.r rVar, EnumC0069l enumC0069l) {
        if (enumC0069l == EnumC0069l.ON_START) {
            x xVar = this.d;
            A a2 = this.f1092b;
            X0.d.e(a2, "onBackPressedCallback");
            xVar.f1101b.addLast(a2);
            v vVar = new v(xVar, a2);
            a2.f791b.add(vVar);
            xVar.d();
            a2.f792c = new w(1, xVar);
            this.f1093c = vVar;
            return;
        }
        if (enumC0069l != EnumC0069l.ON_STOP) {
            if (enumC0069l == EnumC0069l.ON_DESTROY) {
                cancel();
            }
        } else {
            v vVar2 = this.f1093c;
            if (vVar2 != null) {
                vVar2.cancel();
            }
        }
    }
}
