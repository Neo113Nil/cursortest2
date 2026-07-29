package o;

import java.util.Iterator;

/* renamed from: o.eh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0987eh implements NQ {
    public final /* synthetic */ int a = 0;
    public final Object b;
    public final InterfaceC0174Gp c;

    public C0987eh(InterfaceC1455lp interfaceC1455lp, InterfaceC2114vp interfaceC2114vp) {
        this.b = interfaceC1455lp;
        this.c = interfaceC2114vp;
    }

    @Override // o.NQ
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                return new C0922dh(this);
            default:
                return new C2247xq(this);
        }
    }

    public C0987eh(CharSequence charSequence, C1759qP c1759qP) {
        AbstractC0048Bt.n(charSequence, "input");
        this.b = charSequence;
        this.c = c1759qP;
    }
}
