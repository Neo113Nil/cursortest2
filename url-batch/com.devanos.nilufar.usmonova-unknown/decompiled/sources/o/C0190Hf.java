package o;

/* renamed from: o.Hf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0190Hf extends AbstractC2225xU implements InterfaceC2312yp {
    public /* synthetic */ Object h;
    public final /* synthetic */ AT i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0190Hf(AT at, InterfaceC2235xe interfaceC2235xe) {
        super(2, interfaceC2235xe);
        this.i = at;
    }

    @Override // o.Y7
    public final InterfaceC2235xe create(Object obj, InterfaceC2235xe interfaceC2235xe) {
        C0190Hf c0190Hf = new C0190Hf(this.i, interfaceC2235xe);
        c0190Hf.h = obj;
        return c0190Hf;
    }

    @Override // o.InterfaceC2312yp
    public final Object invoke(Object obj, Object obj2) {
        return ((C0190Hf) create((AT) obj, (InterfaceC2235xe) obj2)).invokeSuspend(C0782bY.a);
    }

    @Override // o.Y7
    public final Object invokeSuspend(Object obj) {
        AbstractC1494mO.l(obj);
        AT at = (AT) this.h;
        return Boolean.valueOf((at instanceof C1643of) && at.a <= this.i.a);
    }
}
