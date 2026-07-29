package o;

/* renamed from: o.e0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0941e0 extends AbstractC1596ny implements InterfaceC1455lp {
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0941e0(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        super(0);
        this.h = i;
        this.i = obj;
        this.j = obj2;
        this.k = obj3;
        this.l = obj4;
    }

    @Override // o.InterfaceC1455lp
    public final Object invoke() {
        switch (this.h) {
            case 0:
                return Boolean.valueOf(C0460Rq.u((RW) this.i, ((InterfaceC2298yb) this.j).g0((MR) this.k), (MR) this.l));
            default:
                Number number = (Number) this.k;
                Number number2 = (Number) this.i;
                C0099Ds c0099Ds = (C0099Ds) this.j;
                if (!number2.equals(c0099Ds.h) || !number.equals(c0099Ds.i)) {
                    C0073Cs c0073Cs = (C0073Cs) this.l;
                    c0099Ds.h = number2;
                    c0099Ds.i = number;
                    c0099Ds.l = new JU(c0073Cs, c0099Ds.j, number2, number);
                    c0099Ds.p.b.setValue(Boolean.TRUE);
                    c0099Ds.m = false;
                    c0099Ds.n = true;
                }
                return C0782bY.a;
        }
    }
}
