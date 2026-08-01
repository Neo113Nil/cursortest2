package a;

import X.A;

/* loaded from: classes.dex */
public final class v implements c {

    /* renamed from: a, reason: collision with root package name */
    public final A f1093a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f1094b;

    public v(x xVar, A a2) {
        X0.d.e(a2, "onBackPressedCallback");
        this.f1094b = xVar;
        this.f1093a = a2;
    }

    @Override // a.c
    public final void cancel() {
        x xVar = this.f1094b;
        Q0.f fVar = xVar.f1100b;
        A a2 = this.f1093a;
        fVar.remove(a2);
        if (X0.d.a(xVar.f1101c, a2)) {
            a2.getClass();
            xVar.f1101c = null;
        }
        a2.f789b.remove(this);
        w wVar = a2.f790c;
        if (wVar != null) {
            wVar.a();
        }
        a2.f790c = null;
    }
}
