package o;

/* renamed from: o.Ef, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0112Ef extends AbstractC2225xU implements InterfaceC2114vp {
    public int h;
    public final /* synthetic */ C0423Qf i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0112Ef(C0423Qf c0423Qf, InterfaceC2235xe interfaceC2235xe) {
        super(1, interfaceC2235xe);
        this.i = c0423Qf;
    }

    @Override // o.Y7
    public final InterfaceC2235xe create(InterfaceC2235xe interfaceC2235xe) {
        return new C0112Ef(this.i, interfaceC2235xe);
    }

    @Override // o.InterfaceC2114vp
    public final Object invoke(Object obj) {
        return ((C0112Ef) create((InterfaceC2235xe) obj)).invokeSuspend(C0782bY.a);
    }

    @Override // o.Y7
    public final Object invokeSuspend(Object obj) {
        int i = this.h;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1494mO.l(obj);
            return obj;
        }
        AbstractC1494mO.l(obj);
        this.h = 1;
        Object invoke = this.i.invoke(this);
        EnumC0448Re enumC0448Re = EnumC0448Re.h;
        return invoke == enumC0448Re ? enumC0448Re : invoke;
    }
}
