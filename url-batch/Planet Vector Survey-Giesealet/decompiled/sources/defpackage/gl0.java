package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class gl0 extends fu0 implements qu {
    public final /* synthetic */ int d;
    public int e;
    public final /* synthetic */ il0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gl0(il0 il0Var, kj kjVar, int i) {
        super(2, kjVar);
        this.d = i;
        this.f = il0Var;
    }

    @Override // defpackage.h9
    public final kj create(Object obj, kj kjVar) {
        int i = this.d;
        il0 il0Var = this.f;
        switch (i) {
            case 0:
                return new gl0(il0Var, kjVar, 0);
            case 1:
                return new gl0(il0Var, kjVar, 1);
            case 2:
                return new gl0(il0Var, kjVar, 2);
            default:
                return new gl0(il0Var, kjVar, 3);
        }
    }

    @Override // defpackage.qu
    public final Object invoke(Object obj, Object obj2) {
        int i = this.d;
        ky0 ky0Var = ky0.a;
        bk bkVar = (bk) obj;
        kj kjVar = (kj) obj2;
        switch (i) {
        }
        return ((gl0) create(bkVar, kjVar)).invokeSuspend(ky0Var);
    }

    @Override // defpackage.h9
    public final Object invokeSuspend(Object obj) {
        int i = this.d;
        ky0 ky0Var = ky0.a;
        il0 il0Var = this.f;
        ck ckVar = ck.d;
        switch (i) {
            case 0:
                int i2 = this.e;
                if (i2 == 0) {
                    rg0.u(obj);
                    b6 b6Var = il0Var.f;
                    Float f = new Float(1.0f);
                    ox0 Q = nk.Q(75, 2, so.b);
                    this.e = 1;
                    if (b6.b(b6Var, f, Q, this) == ckVar) {
                        break;
                    }
                } else if (i2 != 1) {
                    g8.s("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    rg0.u(obj);
                    break;
                }
                break;
            case 1:
                int i3 = this.e;
                if (i3 == 0) {
                    rg0.u(obj);
                    b6 b6Var2 = il0Var.g;
                    Float f2 = new Float(1.0f);
                    ox0 Q2 = nk.Q(225, 2, so.a);
                    this.e = 1;
                    if (b6.b(b6Var2, f2, Q2, this) == ckVar) {
                        break;
                    }
                } else if (i3 != 1) {
                    g8.s("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    rg0.u(obj);
                    break;
                }
                break;
            case 2:
                int i4 = this.e;
                if (i4 == 0) {
                    rg0.u(obj);
                    b6 b6Var3 = il0Var.h;
                    Float f3 = new Float(1.0f);
                    ox0 Q3 = nk.Q(225, 2, so.b);
                    this.e = 1;
                    if (b6.b(b6Var3, f3, Q3, this) == ckVar) {
                        break;
                    }
                } else if (i4 != 1) {
                    g8.s("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    rg0.u(obj);
                    break;
                }
                break;
            default:
                int i5 = this.e;
                if (i5 == 0) {
                    rg0.u(obj);
                    b6 b6Var4 = il0Var.f;
                    Float f4 = new Float(0.0f);
                    ox0 Q4 = nk.Q(150, 2, so.b);
                    this.e = 1;
                    if (b6.b(b6Var4, f4, Q4, this) == ckVar) {
                        break;
                    }
                } else if (i5 != 1) {
                    g8.s("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    rg0.u(obj);
                    break;
                }
                break;
        }
        return ckVar;
    }
}
