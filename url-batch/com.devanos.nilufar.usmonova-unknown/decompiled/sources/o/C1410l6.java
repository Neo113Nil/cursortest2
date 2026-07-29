package o;

/* renamed from: o.l6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1410l6 implements InterfaceC2243xm {
    public final /* synthetic */ int h;
    public final /* synthetic */ InterfaceC2243xm i;

    public /* synthetic */ C1410l6(InterfaceC2243xm interfaceC2243xm, int i) {
        this.h = i;
        this.i = interfaceC2243xm;
    }

    @Override // o.InterfaceC2243xm
    public final Object collect(InterfaceC2309ym interfaceC2309ym, InterfaceC2235xe interfaceC2235xe) {
        switch (this.h) {
            case 0:
                Object collect = this.i.collect(new C1344k6(interfaceC2309ym, 0), interfaceC2235xe);
                if (collect != EnumC0448Re.h) {
                    break;
                }
                break;
            case 1:
                Object collect2 = this.i.collect(new C1344k6(interfaceC2309ym, 1), interfaceC2235xe);
                if (collect2 != EnumC0448Re.h) {
                    break;
                }
                break;
            case 2:
                Object collect3 = this.i.collect(new C1344k6(interfaceC2309ym, 2), interfaceC2235xe);
                if (collect3 != EnumC0448Re.h) {
                    break;
                }
                break;
            case 3:
                Object collect4 = this.i.collect(new C1344k6(interfaceC2309ym, 3), interfaceC2235xe);
                if (collect4 != EnumC0448Re.h) {
                    break;
                }
                break;
            default:
                Object collect5 = this.i.collect(new C1344k6(interfaceC2309ym, 4), interfaceC2235xe);
                if (collect5 != EnumC0448Re.h) {
                    break;
                }
                break;
        }
        return C0782bY.a;
    }
}
