package o;

import java.util.Iterator;

/* renamed from: o.am, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0730am implements NQ {
    public final NQ a;
    public final boolean b;
    public final InterfaceC2114vp c;

    public C0730am(NQ nq, boolean z, InterfaceC2114vp interfaceC2114vp) {
        this.a = nq;
        this.b = z;
        this.c = interfaceC2114vp;
    }

    @Override // o.NQ
    public final Iterator iterator() {
        return new C0663Zl(this);
    }
}
