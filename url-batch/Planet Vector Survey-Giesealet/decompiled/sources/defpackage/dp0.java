package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class dp0 extends fu0 implements mu {
    public final /* synthetic */ int d = 0;
    public int e;
    public final /* synthetic */ jp0 f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ cx0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dp0(cx0 cx0Var, jp0 jp0Var, Object obj, kj kjVar) {
        super(1, kjVar);
        this.h = cx0Var;
        this.f = jp0Var;
        this.g = obj;
    }

    @Override // defpackage.mu
    public final Object c(Object obj) {
        int i = this.d;
        ky0 ky0Var = ky0.a;
        kj kjVar = (kj) obj;
        switch (i) {
        }
        return ((dp0) create(kjVar)).invokeSuspend(ky0Var);
    }

    @Override // defpackage.h9
    public final kj create(kj kjVar) {
        int i = this.d;
        cx0 cx0Var = this.h;
        Object obj = this.g;
        jp0 jp0Var = this.f;
        switch (i) {
            case 0:
                return new dp0(cx0Var, jp0Var, obj, kjVar);
            default:
                return new dp0(jp0Var, obj, cx0Var, kjVar);
        }
    }

    @Override // defpackage.h9
    public final Object invokeSuspend(Object obj) {
        int i = this.d;
        ky0 ky0Var = ky0.a;
        ck ckVar = ck.d;
        jp0 jp0Var = this.f;
        Object obj2 = this.g;
        cx0 cx0Var = this.h;
        switch (i) {
            case 0:
                int i2 = this.e;
                if (i2 == 0) {
                    rg0.u(obj);
                    cj cjVar = new cj(jp0Var, obj2, cx0Var, (kj) null);
                    this.e = 1;
                    if (x40.v(cjVar, this) == ckVar) {
                        break;
                    }
                } else if (i2 != 1) {
                    g8.s("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    rg0.u(obj);
                }
                cx0Var.i();
                break;
            default:
                int i3 = this.e;
                if (i3 == 0) {
                    rg0.u(obj);
                    jp0Var.n();
                    ce0 ce0Var = jp0Var.b;
                    jp0Var.l = Long.MIN_VALUE;
                    jp0Var.q(0.0f);
                    float f = obj2.equals(jp0Var.c.getValue()) ? -4.0f : obj2.equals(ce0Var.getValue()) ? -5.0f : -3.0f;
                    cx0Var.q(obj2);
                    cx0Var.o(0L);
                    ce0Var.setValue(obj2);
                    jp0Var.q(0.0f);
                    jp0Var.e(obj2);
                    cx0Var.j(f);
                    if (f == -3.0f) {
                        this.e = 1;
                        if (jp0.l(jp0Var, this) == ckVar) {
                            break;
                        }
                    }
                } else if (i3 != 1) {
                    g8.s("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    rg0.u(obj);
                }
                cx0Var.i();
                break;
        }
        return ky0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dp0(jp0 jp0Var, Object obj, cx0 cx0Var, kj kjVar) {
        super(1, kjVar);
        this.f = jp0Var;
        this.g = obj;
        this.h = cx0Var;
    }
}
