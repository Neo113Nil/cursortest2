package a;

import Y.A;
import androidx.lifecycle.EnumC0071l;

/* loaded from: classes.dex */
public final class t implements androidx.lifecycle.r, InterfaceC0057c {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.lifecycle.v f1220a;

    /* renamed from: b, reason: collision with root package name */
    public final A f1221b;

    /* renamed from: c, reason: collision with root package name */
    public u f1222c;
    public final /* synthetic */ w d;

    public t(w wVar, androidx.lifecycle.v vVar, A a2) {
        g1.f.e(vVar, "lifecycle");
        g1.f.e(a2, "onBackPressedCallback");
        this.d = wVar;
        this.f1220a = vVar;
        this.f1221b = a2;
        vVar.a(this);
    }

    @Override // androidx.lifecycle.r
    public final void a(androidx.lifecycle.t tVar, EnumC0071l enumC0071l) {
        if (enumC0071l == EnumC0071l.ON_START) {
            w wVar = this.d;
            A a2 = this.f1221b;
            g1.f.e(a2, "onBackPressedCallback");
            wVar.f1227b.addLast(a2);
            u uVar = new u(wVar, a2);
            a2.f938b.add(uVar);
            wVar.d();
            a2.f939c = new v(0, wVar, w.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 1);
            this.f1222c = uVar;
            return;
        }
        if (enumC0071l != EnumC0071l.ON_STOP) {
            if (enumC0071l == EnumC0071l.ON_DESTROY) {
                cancel();
            }
        } else {
            u uVar2 = this.f1222c;
            if (uVar2 != null) {
                uVar2.cancel();
            }
        }
    }

    @Override // a.InterfaceC0057c
    public final void cancel() {
        this.f1220a.f(this);
        this.f1221b.f938b.remove(this);
        u uVar = this.f1222c;
        if (uVar != null) {
            uVar.cancel();
        }
        this.f1222c = null;
    }
}
