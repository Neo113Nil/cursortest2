package o;

/* renamed from: o.xN, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2218xN extends AbstractC2225xU implements InterfaceC2312yp {
    public int h;
    public /* synthetic */ Object i;
    public final /* synthetic */ AbstractC0106Dz j;
    public final /* synthetic */ EnumC0080Cz k;
    public final /* synthetic */ C0041Bm l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2218xN(AbstractC0106Dz abstractC0106Dz, EnumC0080Cz enumC0080Cz, C0041Bm c0041Bm, InterfaceC2235xe interfaceC2235xe) {
        super(2, interfaceC2235xe);
        this.j = abstractC0106Dz;
        this.k = enumC0080Cz;
        this.l = c0041Bm;
    }

    @Override // o.Y7
    public final InterfaceC2235xe create(Object obj, InterfaceC2235xe interfaceC2235xe) {
        C2218xN c2218xN = new C2218xN(this.j, this.k, this.l, interfaceC2235xe);
        c2218xN.i = obj;
        return c2218xN;
    }

    @Override // o.InterfaceC2312yp
    public final Object invoke(Object obj, Object obj2) {
        return ((C2218xN) create((InterfaceC0422Qe) obj, (InterfaceC2235xe) obj2)).invokeSuspend(C0782bY.a);
    }

    @Override // o.Y7
    public final Object invokeSuspend(Object obj) {
        int i = this.h;
        if (i == 0) {
            AbstractC1494mO.l(obj);
            InterfaceC0422Qe interfaceC0422Qe = (InterfaceC0422Qe) this.i;
            C0191Hg c0191Hg = AbstractC0115Ei.a;
            C1325jr c1325jr = AbstractC1810rB.a.m;
            C2152wN c2152wN = new C2152wN(this.j, this.k, interfaceC0422Qe, this.l, null);
            this.h = 1;
            Object b0 = AbstractC0868ct.b0(c1325jr, c2152wN, this);
            EnumC0448Re enumC0448Re = EnumC0448Re.h;
            if (b0 == enumC0448Re) {
                return enumC0448Re;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1494mO.l(obj);
        }
        return C0782bY.a;
    }
}
