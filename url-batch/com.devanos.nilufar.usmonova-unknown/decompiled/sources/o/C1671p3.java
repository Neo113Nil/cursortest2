package o;

/* renamed from: o.p3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1671p3 extends AbstractC1596ny implements InterfaceC2312yp {
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1671p3(Object obj, int i, Object obj2) {
        super(2);
        this.h = i;
        this.i = obj;
        this.j = obj2;
    }

    @Override // o.InterfaceC2312yp
    public final Object invoke(Object obj, Object obj2) {
        switch (this.h) {
            case 0:
                ((Number) obj2).intValue();
                AbstractC1934t3.a((S2) this.i, (InterfaceC2312yp) this.j, (InterfaceC1377kd) obj, AbstractC1052fg.a0(1));
                break;
            case 1:
                ((Number) obj2).intValue();
                AbstractC1052fg.b((UC) this.i, (InterfaceC2114vp) this.j, (InterfaceC1377kd) obj, AbstractC1052fg.a0(1));
                break;
            case 2:
                break;
            case 3:
                InterfaceC1377kd interfaceC1377kd = (InterfaceC1377kd) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    C1575nd c1575nd = (C1575nd) interfaceC1377kd;
                    if (c1575nd.t()) {
                        c1575nd.F();
                        break;
                    }
                }
                AbstractC1369kV.a(((QX) this.i).j, (C0721ad) this.j, interfaceC1377kd, 0);
            default:
                ((Number) obj2).intValue();
                AbstractC1369kV.a((C1699pV) this.i, (C0721ad) this.j, (InterfaceC1377kd) obj, AbstractC1052fg.a0(1));
                break;
        }
        return C0782bY.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1671p3(Object obj, InterfaceC0174Gp interfaceC0174Gp, int i, int i2) {
        super(2);
        this.h = i2;
        this.i = obj;
        this.j = interfaceC0174Gp;
    }
}
