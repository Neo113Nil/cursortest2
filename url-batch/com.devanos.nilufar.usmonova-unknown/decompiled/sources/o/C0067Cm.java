package o;

/* renamed from: o.Cm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0067Cm extends AbstractC2225xU implements InterfaceC2312yp {
    public int h;
    public /* synthetic */ Object i;
    public final /* synthetic */ AbstractC0106Dz j;
    public final /* synthetic */ EnumC0080Cz k;
    public final /* synthetic */ InterfaceC0189He l;
    public final /* synthetic */ InterfaceC2243xm m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0067Cm(AbstractC0106Dz abstractC0106Dz, EnumC0080Cz enumC0080Cz, InterfaceC0189He interfaceC0189He, InterfaceC2243xm interfaceC2243xm, InterfaceC2235xe interfaceC2235xe) {
        super(2, interfaceC2235xe);
        this.j = abstractC0106Dz;
        this.k = enumC0080Cz;
        this.l = interfaceC0189He;
        this.m = interfaceC2243xm;
    }

    @Override // o.Y7
    public final InterfaceC2235xe create(Object obj, InterfaceC2235xe interfaceC2235xe) {
        C0067Cm c0067Cm = new C0067Cm(this.j, this.k, this.l, this.m, interfaceC2235xe);
        c0067Cm.i = obj;
        return c0067Cm;
    }

    @Override // o.InterfaceC2312yp
    public final Object invoke(Object obj, Object obj2) {
        return ((C0067Cm) create((C2082vJ) obj, (InterfaceC2235xe) obj2)).invokeSuspend(C0782bY.a);
    }

    @Override // o.Y7
    public final Object invokeSuspend(Object obj) {
        Object j;
        int i = this.h;
        C0782bY c0782bY = C0782bY.a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1494mO.l(obj);
            return c0782bY;
        }
        AbstractC1494mO.l(obj);
        C0041Bm c0041Bm = new C0041Bm(this.l, this.m, (C2082vJ) this.i, null);
        this.h = 1;
        EnumC0080Cz enumC0080Cz = EnumC0080Cz.i;
        EnumC0080Cz enumC0080Cz2 = this.k;
        if (enumC0080Cz2 == enumC0080Cz) {
            throw new IllegalArgumentException("repeatOnLifecycle cannot start work with the INITIALIZED lifecycle state.");
        }
        AbstractC0106Dz abstractC0106Dz = this.j;
        EnumC0080Cz enumC0080Cz3 = ((C0417Pz) abstractC0106Dz).d;
        EnumC0080Cz enumC0080Cz4 = EnumC0080Cz.h;
        EnumC0448Re enumC0448Re = EnumC0448Re.h;
        if (enumC0080Cz3 == enumC0080Cz4 || (j = AbstractC1052fg.j(new C2218xN(abstractC0106Dz, enumC0080Cz2, c0041Bm, null), this)) != enumC0448Re) {
            j = c0782bY;
        }
        return j == enumC0448Re ? enumC0448Re : c0782bY;
    }
}
