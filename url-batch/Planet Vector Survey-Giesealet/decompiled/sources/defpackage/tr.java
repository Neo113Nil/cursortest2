package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class tr implements or {
    public final /* synthetic */ uc d;
    public final /* synthetic */ tg e;

    public tr(uc ucVar, tg tgVar) {
        this.d = ucVar;
        this.e = tgVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|(2:3|(9:5|6|7|(1:(1:(1:(5:12|13|14|15|16)(2:22|23))(2:24|25))(2:26|27))(2:38|39)|28|29|30|(3:32|15|16)|33))|46|6|7|(0)(0)|28|29|30|(0)|33|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0062, code lost:
    
        if (r11.a(r10, r0) == r7) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x004e, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x004f, code lost:
    
        r10 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0087, code lost:
    
        r11 = new defpackage.nw0(r10);
        r10 = r10.e;
        r0.g = r10;
        r0.h = null;
        r0.e = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0098, code lost:
    
        if (defpackage.d31.i(r11, r10, r10, r0) == r7) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:?, code lost:
    
        throw r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    @Override // defpackage.or
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(pr prVar, kj kjVar) {
        sr srVar;
        int i;
        ky0 ky0Var;
        ck ckVar;
        lm0 lm0Var;
        lm0 lm0Var2;
        try {
            if (kjVar instanceof sr) {
                srVar = (sr) kjVar;
                int i2 = srVar.e;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    srVar.e = i2 - Integer.MIN_VALUE;
                    Object obj = srVar.d;
                    i = srVar.e;
                    ky0Var = ky0.a;
                    ckVar = ck.d;
                    if (i != 0) {
                        rg0.u(obj);
                        uc ucVar = this.d;
                        srVar.g = this;
                        srVar.h = prVar;
                        srVar.e = 1;
                    } else {
                        if (i != 1) {
                            if (i == 2) {
                                Throwable th = (Throwable) srVar.g;
                                rg0.u(obj);
                                throw th;
                            }
                            if (i != 3) {
                                g8.s("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            lm0Var2 = (lm0) srVar.g;
                            try {
                                rg0.u(obj);
                                lm0Var2.releaseIntercepted();
                                return ky0Var;
                            } catch (Throwable th2) {
                                th = th2;
                                lm0Var2.releaseIntercepted();
                                throw th;
                            }
                        }
                        prVar = srVar.h;
                        this = (tr) srVar.g;
                        rg0.u(obj);
                    }
                    lm0Var = new lm0(prVar, srVar.getContext());
                    tg tgVar = this.e;
                    srVar.g = lm0Var;
                    srVar.h = null;
                    srVar.e = 3;
                    tgVar.b(lm0Var, null, srVar);
                    if (ky0Var != ckVar) {
                        lm0Var2 = lm0Var;
                        lm0Var2.releaseIntercepted();
                        return ky0Var;
                    }
                    return ckVar;
                }
            }
            tg tgVar2 = this.e;
            srVar.g = lm0Var;
            srVar.h = null;
            srVar.e = 3;
            tgVar2.b(lm0Var, null, srVar);
            if (ky0Var != ckVar) {
            }
            return ckVar;
        } catch (Throwable th3) {
            th = th3;
            lm0Var2 = lm0Var;
            lm0Var2.releaseIntercepted();
            throw th;
        }
        srVar = new sr(this, kjVar);
        Object obj2 = srVar.d;
        i = srVar.e;
        ky0Var = ky0.a;
        ckVar = ck.d;
        if (i != 0) {
        }
        lm0Var = new lm0(prVar, srVar.getContext());
    }
}
