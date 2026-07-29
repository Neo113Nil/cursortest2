package o;

/* renamed from: o.o3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1605o3 extends AbstractC1596ny implements InterfaceC2312yp {
    public final /* synthetic */ int h = 0;
    public final /* synthetic */ Q3 i;
    public final /* synthetic */ InterfaceC2312yp j;
    public final /* synthetic */ ZG k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1605o3(S2 s2, Q3 q3, InterfaceC2312yp interfaceC2312yp) {
        super(2);
        this.k = s2;
        this.i = q3;
        this.j = interfaceC2312yp;
    }

    @Override // o.InterfaceC2312yp
    public final Object invoke(Object obj, Object obj2) {
        switch (this.h) {
            case 0:
                InterfaceC1377kd interfaceC1377kd = (InterfaceC1377kd) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    C1575nd c1575nd = (C1575nd) interfaceC1377kd;
                    if (c1575nd.t()) {
                        c1575nd.F();
                        break;
                    }
                }
                AbstractC2300yd.a((S2) this.k, this.i, this.j, interfaceC1377kd, 0);
            default:
                ((Number) obj2).intValue();
                int a0 = AbstractC1052fg.a0(1);
                AbstractC2300yd.a(this.k, this.i, this.j, (InterfaceC1377kd) obj, a0);
                break;
        }
        return C0782bY.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1605o3(ZG zg, Q3 q3, InterfaceC2312yp interfaceC2312yp, int i) {
        super(2);
        this.k = zg;
        this.i = q3;
        this.j = interfaceC2312yp;
    }
}
