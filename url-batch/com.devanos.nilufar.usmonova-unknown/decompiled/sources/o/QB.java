package o;

/* loaded from: classes.dex */
public final class QB extends AbstractC1596ny implements InterfaceC1455lp {
    public final /* synthetic */ int h;
    public final /* synthetic */ SB i;
    public final /* synthetic */ CK j;
    public final /* synthetic */ C1186hi k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ QB(SB sb, CK ck, C1186hi c1186hi, int i) {
        super(0);
        this.h = i;
        this.i = sb;
        this.j = ck;
        this.k = c1186hi;
    }

    @Override // o.InterfaceC1455lp
    public final Object invoke() {
        switch (this.h) {
            case 0:
                SB sb = this.i;
                C0321Mh c0321Mh = sb.a;
                AbstractC0900dL a = sb.a(c0321Mh.c);
                AbstractC0048Bt.k(a);
                InterfaceC0686a4 interfaceC0686a4 = c0321Mh.a.e;
                AbstractC1004ey returnType = this.k.getReturnType();
                AbstractC0048Bt.m(returnType, "property.returnType");
                return (AbstractC0551Vd) interfaceC0686a4.j(a, this.j, returnType);
            case 1:
                SB sb2 = this.i;
                VA va = sb2.a.a.a;
                QB qb = new QB(sb2, this.j, this.k, 0);
                va.getClass();
                return new RA(va, qb);
            case 2:
                SB sb3 = this.i;
                C0321Mh c0321Mh2 = sb3.a;
                AbstractC0900dL a2 = sb3.a(c0321Mh2.c);
                AbstractC0048Bt.k(a2);
                InterfaceC0686a4 interfaceC0686a42 = c0321Mh2.a.e;
                AbstractC1004ey returnType2 = this.k.getReturnType();
                AbstractC0048Bt.m(returnType2, "property.returnType");
                return (AbstractC0551Vd) interfaceC0686a42.r(a2, this.j, returnType2);
            default:
                SB sb4 = this.i;
                VA va2 = sb4.a.a.a;
                QB qb2 = new QB(sb4, this.j, this.k, 2);
                va2.getClass();
                return new RA(va2, qb2);
        }
    }
}
