package a;

import Y.A;
import androidx.lifecycle.EnumC0079l;

/* loaded from: classes.dex */
public final class u implements androidx.lifecycle.r, c {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.lifecycle.v f1614a;

    /* renamed from: b, reason: collision with root package name */
    public final A f1615b;

    /* renamed from: c, reason: collision with root package name */
    public v f1616c;
    public final /* synthetic */ x d;

    public u(x xVar, androidx.lifecycle.v vVar, A a2) {
        i1.f.e(vVar, "lifecycle");
        i1.f.e(a2, "onBackPressedCallback");
        this.d = xVar;
        this.f1614a = vVar;
        this.f1615b = a2;
        vVar.a(this);
    }

    @Override // androidx.lifecycle.r
    public final void a(androidx.lifecycle.t tVar, EnumC0079l enumC0079l) {
        if (enumC0079l == EnumC0079l.ON_START) {
            x xVar = this.d;
            A a2 = this.f1615b;
            i1.f.e(a2, "onBackPressedCallback");
            xVar.f1621b.addLast(a2);
            v vVar = new v(xVar, a2);
            a2.f1320b.add(vVar);
            xVar.d();
            a2.f1321c = new w(0, xVar, x.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 1);
            this.f1616c = vVar;
            return;
        }
        if (enumC0079l != EnumC0079l.ON_STOP) {
            if (enumC0079l == EnumC0079l.ON_DESTROY) {
                cancel();
            }
        } else {
            v vVar2 = this.f1616c;
            if (vVar2 != null) {
                vVar2.cancel();
            }
        }
    }

    @Override // a.c
    public final void cancel() {
        this.f1614a.f(this);
        this.f1615b.f1320b.remove(this);
        v vVar = this.f1616c;
        if (vVar != null) {
            vVar.cancel();
        }
        this.f1616c = null;
    }
}
