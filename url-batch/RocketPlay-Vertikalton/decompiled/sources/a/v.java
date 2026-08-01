package a;

import Y.A;

/* loaded from: classes.dex */
public final class v implements c {

    /* renamed from: a, reason: collision with root package name */
    public final A f1617a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f1618b;

    public v(x xVar, A a2) {
        i1.f.e(a2, "onBackPressedCallback");
        this.f1618b = xVar;
        this.f1617a = a2;
    }

    @Override // a.c
    public final void cancel() {
        x xVar = this.f1618b;
        W0.h hVar = xVar.f1621b;
        A a2 = this.f1617a;
        hVar.remove(a2);
        if (i1.f.a(xVar.f1622c, a2)) {
            a2.getClass();
            xVar.f1622c = null;
        }
        a2.f1320b.remove(this);
        w wVar = a2.f1321c;
        if (wVar != null) {
            wVar.c();
        }
        a2.f1321c = null;
    }
}
