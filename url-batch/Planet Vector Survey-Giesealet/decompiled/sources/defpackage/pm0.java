package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class pm0 implements or {
    public final qu d;

    public pm0(qu quVar) {
        this.d = quVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.or
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(pr prVar, kj kjVar) {
        n nVar;
        int i;
        lm0 lm0Var;
        if (kjVar instanceof n) {
            nVar = (n) kjVar;
            int i2 = nVar.g;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nVar.g = i2 - Integer.MIN_VALUE;
                Object obj = nVar.e;
                i = nVar.g;
                ky0 ky0Var = ky0.a;
                if (i != 0) {
                    rg0.u(obj);
                    lm0 lm0Var2 = new lm0(prVar, nVar.getContext());
                    try {
                        nVar.d = lm0Var2;
                        nVar.g = 1;
                        try {
                            Object invoke = this.d.invoke(lm0Var2, nVar);
                            ck ckVar = ck.d;
                            if (invoke != ckVar) {
                                invoke = ky0Var;
                            }
                            if (invoke == ckVar) {
                                return ckVar;
                            }
                            lm0Var = lm0Var2;
                        } catch (Throwable th) {
                            th = th;
                            lm0Var = lm0Var2;
                            lm0Var.releaseIntercepted();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } else {
                    if (i != 1) {
                        g8.s("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    lm0Var = nVar.d;
                    try {
                        rg0.u(obj);
                    } catch (Throwable th3) {
                        th = th3;
                        lm0Var.releaseIntercepted();
                        throw th;
                    }
                }
                lm0Var.releaseIntercepted();
                return ky0Var;
            }
        }
        nVar = new n(this, kjVar);
        Object obj2 = nVar.e;
        i = nVar.g;
        ky0 ky0Var2 = ky0.a;
        if (i != 0) {
        }
        lm0Var.releaseIntercepted();
        return ky0Var2;
    }
}
