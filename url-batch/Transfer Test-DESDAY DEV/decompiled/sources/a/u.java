package a;

import Y.A;

/* loaded from: classes.dex */
public final class u implements InterfaceC0057c {

    /* renamed from: a, reason: collision with root package name */
    public final A f1223a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w f1224b;

    public u(w wVar, A a2) {
        g1.f.e(a2, "onBackPressedCallback");
        this.f1224b = wVar;
        this.f1223a = a2;
    }

    @Override // a.InterfaceC0057c
    public final void cancel() {
        w wVar = this.f1224b;
        V0.c cVar = wVar.f1227b;
        A a2 = this.f1223a;
        cVar.remove(a2);
        if (g1.f.a(wVar.f1228c, a2)) {
            a2.getClass();
            wVar.f1228c = null;
        }
        a2.f938b.remove(this);
        v vVar = a2.f939c;
        if (vVar != null) {
            vVar.c();
        }
        a2.f939c = null;
    }
}
