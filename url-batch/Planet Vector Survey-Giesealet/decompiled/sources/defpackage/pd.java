package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class pd extends fu0 implements ru {
    public int d;
    public /* synthetic */ oh0 e;
    public /* synthetic */ long f;
    public final /* synthetic */ qd g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pd(qd qdVar, kj kjVar) {
        super(3, kjVar);
        this.g = qdVar;
    }

    @Override // defpackage.ru
    public final Object b(Object obj, Object obj2, Object obj3) {
        long j = ((ra0) obj2).a;
        pd pdVar = new pd(this.g, (kj) obj3);
        pdVar.e = (oh0) obj;
        pdVar.f = j;
        return pdVar.invokeSuspend(ky0.a);
    }

    @Override // defpackage.h9
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        int i = this.d;
        ky0 ky0Var = ky0.a;
        if (i != 0) {
            if (i == 1) {
                rg0.u(obj);
                return ky0Var;
            }
            g8.s("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        rg0.u(obj);
        oh0 oh0Var = this.e;
        long j = this.f;
        qd qdVar = this.g;
        if (qdVar.w) {
            this.d = 1;
            r60 r60Var = qdVar.t;
            ck ckVar = ck.d;
            if (r60Var == null || (obj2 = x40.v(new e(oh0Var, j, r60Var, qdVar, null), this)) != ckVar) {
                obj2 = ky0Var;
            }
            if (obj2 == ckVar) {
                return ckVar;
            }
        }
        return ky0Var;
    }
}
