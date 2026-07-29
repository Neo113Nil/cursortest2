package o;

/* renamed from: o.iR, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1235iR extends AbstractC2367ze {
    public C1299jR h;
    public InterfaceC2309ym i;
    public C1365kR j;
    public InterfaceC0075Cu k;
    public /* synthetic */ Object l;
    public final /* synthetic */ C1299jR m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1235iR(C1299jR c1299jR, InterfaceC2235xe interfaceC2235xe) {
        super(interfaceC2235xe);
        this.m = c1299jR;
    }

    @Override // o.Y7
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        C1299jR.h(this.m, null, this);
        return EnumC0448Re.h;
    }
}
