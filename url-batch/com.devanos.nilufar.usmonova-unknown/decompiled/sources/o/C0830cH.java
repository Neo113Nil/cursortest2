package o;

/* renamed from: o.cH, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0830cH extends AbstractC2225xU implements InterfaceC2312yp {
    public int h;
    public final /* synthetic */ String i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0830cH(String str, InterfaceC2235xe interfaceC2235xe) {
        super(2, interfaceC2235xe);
        this.i = str;
    }

    @Override // o.Y7
    public final InterfaceC2235xe create(Object obj, InterfaceC2235xe interfaceC2235xe) {
        return new C0830cH(this.i, interfaceC2235xe);
    }

    @Override // o.InterfaceC2312yp
    public final Object invoke(Object obj, Object obj2) {
        return ((C0830cH) create((InterfaceC0422Qe) obj, (InterfaceC2235xe) obj2)).invokeSuspend(C0782bY.a);
    }

    @Override // o.Y7
    public final Object invokeSuspend(Object obj) {
        int i = this.h;
        if (i == 0) {
            AbstractC1494mO.l(obj);
            C0274Kl c0274Kl = (C0274Kl) UQ.j.getValue();
            this.h = 1;
            Object b = c0274Kl.b(this.i, this);
            EnumC0448Re enumC0448Re = EnumC0448Re.h;
            if (b == enumC0448Re) {
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
