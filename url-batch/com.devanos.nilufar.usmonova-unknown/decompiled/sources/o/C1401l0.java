package o;

import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: o.l0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1401l0 implements InterfaceC1455lp {
    public final /* synthetic */ int h;
    public final Object i;
    public final /* synthetic */ Object j;

    public /* synthetic */ C1401l0(Object obj, int i, Object obj2) {
        this.h = i;
        this.j = obj;
        this.i = obj2;
    }

    @Override // o.InterfaceC1455lp
    public final Object invoke() {
        switch (this.h) {
            case 0:
                OW.i.getClass();
                OW ow = OW.j;
                SW z = ((AbstractC1533n0) this.j).z();
                List list = Collections.EMPTY_LIST;
                C1335k0 c1335k0 = new C1335k0(0, this);
                MA ma = VA.e;
                AbstractC0048Bt.m(ma, "NO_LOCKS");
                return HO.s(list, new C1531mz(ma, c1335k0), ow, z, false);
            case 1:
                C1564nS c1564nS = new C1564nS();
                Iterator it = ((AbstractC0433Qp) this.j).o().iterator();
                while (it.hasNext()) {
                    c1564nS.add(((InterfaceC0381Op) it.next()).e((C2096vX) this.i));
                }
                return c1564nS;
            default:
                C0461Rr c0461Rr = (C0461Rr) this.j;
                C0539Ur c0539Ur = (C0539Ur) this.i;
                try {
                } catch (IOException e) {
                    c0461Rr.b(2, 2, e);
                } catch (Throwable th) {
                    c0461Rr.b(3, 3, null);
                    HY.c(c0539Ur);
                    throw th;
                }
                if (!c0539Ur.b(true, this)) {
                    throw new IOException("Required SETTINGS preface not received");
                }
                while (c0539Ur.b(false, this)) {
                }
                c0461Rr.b(1, 9, null);
                HY.c(c0539Ur);
                return C0782bY.a;
        }
    }
}
