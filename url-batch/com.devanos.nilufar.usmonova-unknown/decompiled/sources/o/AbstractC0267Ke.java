package o;

/* renamed from: o.Ke, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0267Ke extends AbstractC2059v implements InterfaceC0007Ae {
    public static final C0241Je i = new C0241Je(C0460Rq.w, new C0215Ie(0));

    public AbstractC0267Ke() {
        super(C0460Rq.w);
    }

    public abstract void L(InterfaceC0189He interfaceC0189He, Runnable runnable);

    public boolean M(InterfaceC0189He interfaceC0189He) {
        return !(this instanceof WX);
    }

    public AbstractC0267Ke N(int i2) {
        AbstractC0946e20.k(i2);
        return new C0469Rz(this, i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001d, code lost:
    
        if (((o.InterfaceC0137Fe) r3.h.invoke(r2)) != null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0027, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0026, code lost:
    
        return o.C1188hk.h;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0022, code lost:
    
        if (o.C0460Rq.w == r3) goto L15;
     */
    @Override // o.AbstractC2059v, o.InterfaceC0189He
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InterfaceC0189He j(InterfaceC0163Ge interfaceC0163Ge) {
        AbstractC0048Bt.n(interfaceC0163Ge, "key");
        if (interfaceC0163Ge instanceof C0241Je) {
            C0241Je c0241Je = (C0241Je) interfaceC0163Ge;
            InterfaceC0163Ge interfaceC0163Ge2 = this.h;
            if (interfaceC0163Ge2 != c0241Je && c0241Je.i != interfaceC0163Ge2) {
                return this;
            }
        }
    }

    @Override // o.AbstractC2059v, o.InterfaceC0189He
    public final InterfaceC0137Fe k(InterfaceC0163Ge interfaceC0163Ge) {
        InterfaceC0137Fe interfaceC0137Fe;
        AbstractC0048Bt.n(interfaceC0163Ge, "key");
        if (interfaceC0163Ge instanceof C0241Je) {
            C0241Je c0241Je = (C0241Je) interfaceC0163Ge;
            InterfaceC0163Ge interfaceC0163Ge2 = this.h;
            if ((interfaceC0163Ge2 == c0241Je || c0241Je.i == interfaceC0163Ge2) && (interfaceC0137Fe = (InterfaceC0137Fe) c0241Je.h.invoke(this)) != null) {
                return interfaceC0137Fe;
            }
        } else if (C0460Rq.w == interfaceC0163Ge) {
            return this;
        }
        return null;
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + AbstractC1052fg.B(this);
    }
}
