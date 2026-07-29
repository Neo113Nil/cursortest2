package o;

import java.util.Iterator;
import java.util.List;

/* renamed from: o.r4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1803r4 implements InterfaceC1738q4 {
    public final /* synthetic */ int h;
    public final Object i;

    public /* synthetic */ C1803r4(int i, List list) {
        this.h = i;
        this.i = list;
    }

    @Override // o.InterfaceC1738q4
    public final InterfaceC0948e4 c(C2245xo c2245xo) {
        switch (this.h) {
            case 0:
                return AbstractC1052fg.n(this, c2245xo);
            case 1:
                AbstractC0048Bt.n(c2245xo, "fqName");
                return (InterfaceC0948e4) PQ.v(PQ.A(AbstractC0720ac.i0((List) this.i), new C1641od(c2245xo, 0)));
            default:
                AbstractC0048Bt.n(c2245xo, "fqName");
                if (c2245xo.equals((C2245xo) this.i)) {
                    return C1911sk.a;
                }
                return null;
        }
    }

    @Override // o.InterfaceC1738q4
    public final boolean i(C2245xo c2245xo) {
        switch (this.h) {
            case 1:
                AbstractC0048Bt.n(c2245xo, "fqName");
                Iterator it = ((Iterable) AbstractC0720ac.i0((List) this.i).b).iterator();
                while (it.hasNext()) {
                    if (((InterfaceC1738q4) it.next()).i(c2245xo)) {
                        break;
                    }
                }
                break;
        }
        return AbstractC1052fg.F(this, c2245xo);
    }

    @Override // o.InterfaceC1738q4
    public final boolean isEmpty() {
        switch (this.h) {
            case 0:
                return ((List) this.i).isEmpty();
            case 1:
                List list = (List) this.i;
                if (list != null && list.isEmpty()) {
                    return true;
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (!((InterfaceC1738q4) it.next()).isEmpty()) {
                        return false;
                    }
                }
                return true;
            default:
                return false;
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        switch (this.h) {
            case 0:
                return ((List) this.i).iterator();
            case 1:
                return new C0663Zl(new C1716pm(AbstractC0720ac.i0((List) this.i), I2.x, SQ.j));
            default:
                return C1253ik.h;
        }
    }

    public String toString() {
        switch (this.h) {
            case 0:
                return ((List) this.i).toString();
            default:
                return super.toString();
        }
    }

    public C1803r4(InterfaceC1738q4[] interfaceC1738q4Arr) {
        this.h = 1;
        this.i = P6.t0(interfaceC1738q4Arr);
    }

    public C1803r4(C2245xo c2245xo) {
        this.h = 2;
        AbstractC0048Bt.n(c2245xo, "fqNameToMatch");
        this.i = c2245xo;
    }
}
