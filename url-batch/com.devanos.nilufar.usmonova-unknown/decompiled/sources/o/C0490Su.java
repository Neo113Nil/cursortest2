package o;

import java.util.Collection;

/* renamed from: o.Su, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0490Su implements InterfaceC1375kb {
    public static final C0140Fh d;
    public static final /* synthetic */ InterfaceC0937dx[] e;
    public static final C2245xo f;
    public static final C0827cE g;
    public static final C1639ob h;
    public final C0826cD a;
    public final InterfaceC2114vp b;
    public final SA c;

    static {
        VM vm = UM.a;
        e = new InterfaceC0937dx[]{vm.g(new UJ(vm.b(C0490Su.class), "cloneable", "getCloneable()Lorg/jetbrains/kotlin/descriptors/impl/ClassDescriptorImpl;"))};
        d = new C0140Fh(9);
        f = AbstractC1499mT.j;
        C2377zo c2377zo = AbstractC1433lT.c;
        C0827cE f2 = c2377zo.f();
        AbstractC0048Bt.m(f2, "cloneable.shortName()");
        g = f2;
        h = C1639ob.j(c2377zo.g());
    }

    public C0490Su(VA va, C0826cD c0826cD) {
        C2316yt c2316yt = C2316yt.k;
        this.a = c0826cD;
        this.b = c2316yt;
        this.c = new SA(va, new K2(this, 7, va));
    }

    @Override // o.InterfaceC1375kb
    public final InterfaceC1245ib a(C1639ob c1639ob) {
        AbstractC0048Bt.n(c1639ob, "classId");
        if (!c1639ob.equals(h)) {
            return null;
        }
        return (C1441lb) AbstractC0772bO.o(this.c, e[0]);
    }

    @Override // o.InterfaceC1375kb
    public final Collection b(C2245xo c2245xo) {
        AbstractC0048Bt.n(c2245xo, "packageFqName");
        if (!c2245xo.equals(f)) {
            return C1648ok.h;
        }
        return AbstractC0773bP.i((C1441lb) AbstractC0772bO.o(this.c, e[0]));
    }

    @Override // o.InterfaceC1375kb
    public final boolean c(C2245xo c2245xo, C0827cE c0827cE) {
        AbstractC0048Bt.n(c2245xo, "packageFqName");
        AbstractC0048Bt.n(c0827cE, "name");
        return c0827cE.equals(g) && c2245xo.equals(f);
    }
}
