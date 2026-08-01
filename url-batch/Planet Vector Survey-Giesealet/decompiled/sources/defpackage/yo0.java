package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class yo0 extends fu0 implements qu {
    public long d;
    public int e;
    public /* synthetic */ long f;
    public final /* synthetic */ zo0 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yo0(zo0 zo0Var, kj kjVar) {
        super(2, kjVar);
        this.g = zo0Var;
    }

    @Override // defpackage.h9
    public final kj create(Object obj, kj kjVar) {
        yo0 yo0Var = new yo0(this.g, kjVar);
        yo0Var.f = ((mz0) obj).a;
        return yo0Var;
    }

    @Override // defpackage.qu
    public final Object invoke(Object obj, Object obj2) {
        long j = ((mz0) obj).a;
        yo0 yo0Var = new yo0(this.g, (kj) obj2);
        yo0Var.f = j;
        return yo0Var.invokeSuspend(ky0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x003d, code lost:
    
        if (r15 == r5) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006e  */
    @Override // defpackage.h9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        long j;
        long j2;
        long j3;
        long j4;
        int i = this.e;
        zo0 zo0Var = this.g;
        ck ckVar = ck.d;
        if (i == 0) {
            rg0.u(obj);
            j = this.f;
            k2 k2Var = zo0Var.f;
            this.f = j;
            this.e = 1;
            obj = k2Var.e(j, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        g8.s("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j4 = this.d;
                    j3 = this.f;
                    rg0.u(obj);
                    return new mz0(mz0.d(j3, mz0.d(j4, ((mz0) obj).a)));
                }
                j2 = this.d;
                j = this.f;
                rg0.u(obj);
                long j5 = ((mz0) obj).a;
                k2 k2Var2 = zo0Var.f;
                long d = mz0.d(j2, j5);
                this.f = j;
                this.d = j5;
                this.e = 3;
                obj = k2Var2.d(d, j5, this);
                if (obj != ckVar) {
                    j3 = j;
                    j4 = j5;
                    return new mz0(mz0.d(j3, mz0.d(j4, ((mz0) obj).a)));
                }
                return ckVar;
            }
            j = this.f;
            rg0.u(obj);
        }
        long d2 = mz0.d(j, ((mz0) obj).a);
        this.f = j;
        this.d = d2;
        this.e = 2;
        obj = zo0Var.b(d2, this);
        if (obj != ckVar) {
            j2 = d2;
            long j52 = ((mz0) obj).a;
            k2 k2Var22 = zo0Var.f;
            long d3 = mz0.d(j2, j52);
            this.f = j;
            this.d = j52;
            this.e = 3;
            obj = k2Var22.d(d3, j52, this);
            if (obj != ckVar) {
            }
        }
        return ckVar;
    }
}
