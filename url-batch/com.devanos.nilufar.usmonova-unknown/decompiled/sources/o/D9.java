package o;

/* loaded from: classes.dex */
public final class D9 implements InterfaceC2309ym {
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;

    public /* synthetic */ D9(int i, Object obj) {
        this.h = i;
        this.i = obj;
    }

    @Override // o.InterfaceC2309ym
    public final Object emit(Object obj, InterfaceC2235xe interfaceC2235xe) {
        Object d;
        switch (this.h) {
            case 0:
                ((InterfaceC0655Zd) this.i).accept(obj);
                return C0782bY.a;
            case 1:
                Object d2 = ((C2148wJ) ((InterfaceC2214xJ) this.i)).k.d(obj, interfaceC2235xe);
                return d2 == EnumC0448Re.h ? d2 : C0782bY.a;
            case 2:
                C0657Zf c0657Zf = (C0657Zf) this.i;
                return ((c0657Zf.n.Y() instanceof C0796bm) || (d = C0657Zf.d(c0657Zf, true, interfaceC2235xe)) != EnumC0448Re.h) ? C0782bY.a : d;
            case 3:
                ((C1360kM) this.i).h = obj;
                throw new C0940e(this);
            default:
                ((C1023fD) this.i).h.g(((Number) obj).floatValue());
                return C0782bY.a;
        }
    }
}
