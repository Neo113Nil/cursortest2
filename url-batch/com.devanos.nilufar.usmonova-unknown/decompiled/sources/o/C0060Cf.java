package o;

/* renamed from: o.Cf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0060Cf extends AbstractC2225xU implements InterfaceC2312yp {
    public int h;
    public final /* synthetic */ C0657Zf i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0060Cf(C0657Zf c0657Zf, InterfaceC2235xe interfaceC2235xe) {
        super(2, interfaceC2235xe);
        this.i = c0657Zf;
    }

    @Override // o.Y7
    public final InterfaceC2235xe create(Object obj, InterfaceC2235xe interfaceC2235xe) {
        return new C0060Cf(this.i, interfaceC2235xe);
    }

    @Override // o.InterfaceC2312yp
    public final Object invoke(Object obj, Object obj2) {
        ((C0060Cf) create((InterfaceC0422Qe) obj, (InterfaceC2235xe) obj2)).invokeSuspend(C0782bY.a);
        return EnumC0448Re.h;
    }

    @Override // o.Y7
    public final Object invokeSuspend(Object obj) {
        int i = this.h;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1494mO.l(obj);
            throw new C0057Cc();
        }
        AbstractC1494mO.l(obj);
        EL el = this.i.k;
        this.h = 1;
        el.h.collect(C0034Bf.h, this);
        return EnumC0448Re.h;
    }
}
