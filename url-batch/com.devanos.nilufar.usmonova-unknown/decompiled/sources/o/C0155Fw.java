package o;

/* renamed from: o.Fw, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0155Fw extends AbstractC1596ny implements InterfaceC1455lp {
    public final /* synthetic */ int h = 1;
    public final /* synthetic */ C0207Hw i;
    public final /* synthetic */ C0259Jw j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0155Fw(C0207Hw c0207Hw, C0259Jw c0259Jw) {
        super(0);
        this.i = c0207Hw;
        this.j = c0259Jw;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0023, code lost:
    
        if (((o.EnumC0571Vx) r0.c) == o.EnumC0571Vx.MULTIFILE_CLASS_PART) goto L10;
     */
    @Override // o.InterfaceC1455lp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        String str;
        switch (this.h) {
            case 0:
                RM rm = this.i.d;
                InterfaceC0937dx interfaceC0937dx = C0207Hw.g[1];
                Object invoke = rm.invoke();
                AbstractC0048Bt.m(invoke, "<get-scope>(...)");
                return this.j.p((WB) invoke, 1);
            default:
                RM rm2 = this.i.c;
                InterfaceC0937dx interfaceC0937dx2 = C0207Hw.g[0];
                OM om = (OM) rm2.invoke();
                if (om != null) {
                    C0202Hr c0202Hr = om.b;
                    str = (String) c0202Hr.h;
                    break;
                }
                str = null;
                if (str == null || str.length() <= 0) {
                    return null;
                }
                return this.j.i.getClassLoader().loadClass(AbstractC0778bU.y(str, '/', '.'));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0155Fw(C0259Jw c0259Jw, C0207Hw c0207Hw) {
        super(0);
        this.j = c0259Jw;
        this.i = c0207Hw;
    }
}
