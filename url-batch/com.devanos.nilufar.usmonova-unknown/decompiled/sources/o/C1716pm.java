package o;

import java.util.Iterator;

/* renamed from: o.pm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1716pm implements NQ {
    public final NQ a;
    public final InterfaceC2114vp b;
    public final InterfaceC2114vp c;

    public C1716pm(NQ nq, InterfaceC2114vp interfaceC2114vp, InterfaceC2114vp interfaceC2114vp2) {
        AbstractC0048Bt.n(interfaceC2114vp, "transformer");
        this.a = nq;
        this.b = interfaceC2114vp;
        this.c = interfaceC2114vp2;
    }

    @Override // o.NQ
    public final Iterator iterator() {
        return new C0663Zl(this);
    }
}
