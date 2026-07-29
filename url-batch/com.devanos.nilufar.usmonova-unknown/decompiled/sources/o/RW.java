package o;

import java.util.ArrayDeque;

/* loaded from: classes.dex */
public class RW {
    public final boolean a;
    public final boolean b;
    public final InterfaceC2298yb c;
    public final C1332jy d;
    public final C1398ky e;
    public int f;
    public ArrayDeque g;
    public C1630oS h;

    public RW(boolean z, boolean z2, InterfaceC2298yb interfaceC2298yb, C1332jy c1332jy, C1398ky c1398ky) {
        AbstractC0048Bt.n(interfaceC2298yb, "typeSystemContext");
        AbstractC0048Bt.n(c1332jy, "kotlinTypePreparator");
        AbstractC0048Bt.n(c1398ky, "kotlinTypeRefiner");
        this.a = z;
        this.b = z2;
        this.c = interfaceC2298yb;
        this.d = c1332jy;
        this.e = c1398ky;
    }

    public final void a() {
        ArrayDeque arrayDeque = this.g;
        AbstractC0048Bt.k(arrayDeque);
        arrayDeque.clear();
        C1630oS c1630oS = this.h;
        AbstractC0048Bt.k(c1630oS);
        c1630oS.clear();
    }

    public final void b() {
        if (this.g == null) {
            this.g = new ArrayDeque(4);
        }
        if (this.h == null) {
            this.h = new C1630oS();
        }
    }

    public final AbstractC2097vY c(InterfaceC1266iy interfaceC1266iy) {
        AbstractC0048Bt.n(interfaceC1266iy, "type");
        return this.d.a(interfaceC1266iy);
    }

    public final AbstractC1004ey d(InterfaceC1266iy interfaceC1266iy) {
        AbstractC0048Bt.n(interfaceC1266iy, "type");
        this.e.getClass();
        return (AbstractC1004ey) interfaceC1266iy;
    }
}
