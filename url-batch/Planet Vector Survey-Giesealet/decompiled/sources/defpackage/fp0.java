package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class fp0 extends fu0 implements qu {
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ jp0 h;
    public final /* synthetic */ cx0 i;
    public final /* synthetic */ float j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fp0(Object obj, Object obj2, jp0 jp0Var, cx0 cx0Var, float f, kj kjVar) {
        super(2, kjVar);
        this.f = obj;
        this.g = obj2;
        this.h = jp0Var;
        this.i = cx0Var;
        this.j = f;
    }

    @Override // defpackage.h9
    public final kj create(Object obj, kj kjVar) {
        fp0 fp0Var = new fp0(this.f, this.g, this.h, this.i, this.j, kjVar);
        fp0Var.e = obj;
        return fp0Var;
    }

    @Override // defpackage.qu
    public final Object invoke(Object obj, Object obj2) {
        return ((fp0) create((bk) obj, (kj) obj2)).invokeSuspend(ky0.a);
    }

    @Override // defpackage.h9
    public final Object invokeSuspend(Object obj) {
        int i = this.d;
        ky0 ky0Var = ky0.a;
        kj kjVar = null;
        jp0 jp0Var = this.h;
        if (i == 0) {
            rg0.u(obj);
            bk bkVar = (bk) this.e;
            Object obj2 = this.f;
            Object obj3 = this.g;
            if (nz.l(obj2, obj3)) {
                jp0Var.n = null;
                if (nz.l(jp0Var.c.getValue(), obj2)) {
                    return ky0Var;
                }
            } else {
                jp0.h(jp0Var);
            }
            boolean l = nz.l(obj2, obj3);
            float f = this.j;
            if (!l) {
                cx0 cx0Var = this.i;
                cx0Var.q(obj2);
                cx0Var.o(0L);
                jp0Var.b.setValue(obj2);
                cx0Var.j(f);
            }
            jp0Var.q(f);
            if (jp0Var.m.h()) {
                d31.E(bkVar, null, new qk(jp0Var, kjVar, 2), 3);
            } else {
                jp0Var.l = Long.MIN_VALUE;
            }
            this.d = 1;
            Object l2 = jp0.l(jp0Var, this);
            ck ckVar = ck.d;
            if (l2 == ckVar) {
                return ckVar;
            }
        } else {
            if (i != 1) {
                g8.s("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            rg0.u(obj);
        }
        jp0Var.p();
        return ky0Var;
    }
}
