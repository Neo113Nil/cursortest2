package o;

/* loaded from: classes.dex */
public final class SI extends AbstractC1596ny implements InterfaceC2114vp {
    public final /* synthetic */ int h;
    public final /* synthetic */ String i;
    public final /* synthetic */ String j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SI(int i, String str, String str2) {
        super(1);
        this.h = i;
        this.i = str;
        this.j = str2;
    }

    @Override // o.InterfaceC2114vp
    public final Object invoke(Object obj) {
        switch (this.h) {
            case 0:
                CR cr = (CR) obj;
                AbstractC0048Bt.n(cr, "$this$function");
                C1921su c1921su = TI.b;
                String str = this.i;
                cr.a(str, c1921su);
                C1921su c1921su2 = TI.a;
                cr.a(this.j, c1921su, c1921su, c1921su2, c1921su2);
                cr.b(str, c1921su2);
                break;
            case 1:
                CR cr2 = (CR) obj;
                AbstractC0048Bt.n(cr2, "$this$function");
                C1921su c1921su3 = TI.b;
                String str2 = this.i;
                cr2.a(str2, c1921su3);
                cr2.a(this.j, c1921su3, c1921su3, c1921su3);
                cr2.b(str2, c1921su3);
                break;
            case 2:
                CR cr3 = (CR) obj;
                AbstractC0048Bt.n(cr3, "$this$function");
                C1921su c1921su4 = TI.b;
                String str3 = this.i;
                cr3.a(str3, c1921su4);
                C1921su c1921su5 = TI.c;
                C1921su c1921su6 = TI.a;
                cr3.a(this.j, c1921su4, c1921su4, c1921su5, c1921su6);
                cr3.b(str3, c1921su6);
                break;
            case 3:
                CR cr4 = (CR) obj;
                AbstractC0048Bt.n(cr4, "$this$function");
                C1921su c1921su7 = TI.b;
                String str4 = this.i;
                cr4.a(str4, c1921su7);
                C1921su c1921su8 = TI.c;
                cr4.a(str4, c1921su8);
                C1921su c1921su9 = TI.a;
                cr4.a(this.j, c1921su7, c1921su8, c1921su8, c1921su9);
                cr4.b(str4, c1921su9);
                break;
            case 4:
                CR cr5 = (CR) obj;
                AbstractC0048Bt.n(cr5, "$this$function");
                C1921su c1921su10 = TI.c;
                cr5.a(this.i, c1921su10);
                cr5.b(this.j, TI.b, c1921su10);
                break;
            default:
                CR cr6 = (CR) obj;
                AbstractC0048Bt.n(cr6, "$this$function");
                cr6.a(this.i, TI.a);
                cr6.b(this.j, TI.b, TI.c);
                break;
        }
        return C0782bY.a;
    }
}
