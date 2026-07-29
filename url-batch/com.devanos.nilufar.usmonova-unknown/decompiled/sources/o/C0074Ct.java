package o;

/* renamed from: o.Ct, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0074Ct extends AbstractC1232iO {
    public int h;
    public final /* synthetic */ InterfaceC2312yp i;
    public final /* synthetic */ InterfaceC2235xe j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0074Ct(InterfaceC2235xe interfaceC2235xe, InterfaceC2235xe interfaceC2235xe2, InterfaceC2312yp interfaceC2312yp) {
        super(interfaceC2235xe);
        this.i = interfaceC2312yp;
        this.j = interfaceC2235xe2;
    }

    @Override // o.Y7
    public final Object invokeSuspend(Object obj) {
        int i = this.h;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.h = 2;
            AbstractC1494mO.l(obj);
            return obj;
        }
        this.h = 1;
        AbstractC1494mO.l(obj);
        InterfaceC2312yp interfaceC2312yp = this.i;
        AbstractC0048Bt.l(interfaceC2312yp, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
        AbstractC1305jX.i(2, interfaceC2312yp);
        return interfaceC2312yp.invoke(this.j, this);
    }
}
