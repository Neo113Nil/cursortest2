package o;

import java.util.Iterator;

/* renamed from: o.rW, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1831rW implements NQ {
    public final NQ a;
    public final InterfaceC2114vp b;

    public C1831rW(NQ nq, InterfaceC2114vp interfaceC2114vp) {
        AbstractC0048Bt.n(interfaceC2114vp, "transformer");
        this.a = nq;
        this.b = interfaceC2114vp;
    }

    @Override // o.NQ
    public final Iterator iterator() {
        return new C1766qW(this);
    }
}
