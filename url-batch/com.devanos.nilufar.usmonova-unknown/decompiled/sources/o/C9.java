package o;

/* loaded from: classes.dex */
public final class C9 extends C0081Da {
    public final AbstractC2225xU l;

    /* JADX WARN: Multi-variable type inference failed */
    public C9(InterfaceC2312yp interfaceC2312yp, InterfaceC0189He interfaceC0189He, int i, H8 h8) {
        super(interfaceC2312yp, interfaceC0189He, i, h8);
        this.l = (AbstractC2225xU) interfaceC2312yp;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // o.C0081Da, o.AbstractC0055Ca
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(InterfaceC2214xJ interfaceC2214xJ, InterfaceC2235xe interfaceC2235xe) {
        B9 b9;
        int i;
        if (interfaceC2235xe instanceof B9) {
            b9 = (B9) interfaceC2235xe;
            int i2 = b9.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                b9.k = i2 - Integer.MIN_VALUE;
                Object obj = b9.i;
                i = b9.k;
                if (i != 0) {
                    AbstractC1494mO.l(obj);
                    b9.h = interfaceC2214xJ;
                    b9.k = 1;
                    Object a = super.a(interfaceC2214xJ, b9);
                    Object obj2 = EnumC0448Re.h;
                    if (a == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    interfaceC2214xJ = b9.h;
                    AbstractC1494mO.l(obj);
                }
                if (((C2148wJ) interfaceC2214xJ).k.u()) {
                    throw new IllegalStateException("'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details.");
                }
                return C0782bY.a;
            }
        }
        b9 = new B9(this, (AbstractC2367ze) interfaceC2235xe);
        Object obj3 = b9.i;
        i = b9.k;
        if (i != 0) {
        }
        if (((C2148wJ) interfaceC2214xJ).k.u()) {
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [o.xU, o.yp] */
    @Override // o.C0081Da, o.AbstractC0055Ca
    public final AbstractC0055Ca b(InterfaceC0189He interfaceC0189He, int i, H8 h8) {
        return new C9(this.l, interfaceC0189He, i, h8);
    }
}
