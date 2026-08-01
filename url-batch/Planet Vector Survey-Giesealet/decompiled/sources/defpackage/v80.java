package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class v80 extends fu0 implements qu {
    public final /* synthetic */ int d = 0;
    public int e;
    public float f;
    public /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v80(float f, jp0 jp0Var, y70 y70Var, kj kjVar) {
        super(2, kjVar);
        this.f = f;
        this.g = jp0Var;
        this.h = y70Var;
    }

    @Override // defpackage.h9
    public final kj create(Object obj, kj kjVar) {
        int i = this.d;
        Object obj2 = this.h;
        switch (i) {
            case 0:
                return new v80(this.f, (jp0) this.g, (y70) obj2, kjVar);
            case 1:
                return new v80((w4) this.g, this.f, (c7) obj2, kjVar);
            default:
                v80 v80Var = new v80((cx0) obj2, kjVar);
                v80Var.g = obj;
                return v80Var;
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
        return ((v80) create(bkVar, kjVar)).invokeSuspend(ky0Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x00b5, code lost:
    
        if (r0.o(r7, r0.b.getValue(), r11) == r4) goto L50;
     */
    @Override // defpackage.h9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object a;
        float k;
        bk bkVar;
        int i = this.d;
        ky0 ky0Var = ky0.a;
        Object obj2 = this.h;
        ck ckVar = ck.d;
        switch (i) {
            case 0:
                jp0 jp0Var = (jp0) this.g;
                float f = this.f;
                int i2 = this.e;
                if (i2 == 0) {
                    rg0.u(obj);
                    if (f > 0.0f) {
                        this.e = 1;
                        break;
                    }
                } else if (i2 == 1) {
                    rg0.u(obj);
                } else if (i2 != 2) {
                    g8.s("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    rg0.u(obj);
                    break;
                }
                if (f == 0.0f) {
                    y70 y70Var = (y70) obj2;
                    this.e = 2;
                    cx0 cx0Var = jp0Var.e;
                    if (cx0Var == null || ((nz.l(jp0Var.c.getValue(), y70Var) && nz.l(jp0Var.b.getValue(), y70Var)) || (a = s70.a(jp0Var.k, new dp0(jp0Var, y70Var, cx0Var, (kj) null), this)) != ckVar)) {
                        a = ky0Var;
                    }
                    if (a != ckVar) {
                    }
                    break;
                }
                break;
            case 1:
                int i3 = this.e;
                if (i3 == 0) {
                    rg0.u(obj);
                    this.e = 1;
                    if (b6.b((b6) ((w4) this.g).c, new Float(this.f), (c7) obj2, this) == ckVar) {
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
            default:
                int i4 = this.e;
                if (i4 == 0) {
                    rg0.u(obj);
                    bk bkVar2 = (bk) this.g;
                    k = ze0.k(bkVar2.f());
                    bkVar = bkVar2;
                } else if (i4 != 1) {
                    g8.s("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    k = this.f;
                    bkVar = (bk) this.g;
                    rg0.u(obj);
                }
                while (x40.G(bkVar)) {
                    bx0 bx0Var = new bx0((cx0) obj2, k);
                    this.g = bkVar;
                    this.f = k;
                    this.e = 1;
                    if (x40.D(getContext()).e(bx0Var, this) == ckVar) {
                        break;
                    }
                }
                break;
        }
        return ckVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v80(w4 w4Var, float f, c7 c7Var, kj kjVar) {
        super(2, kjVar);
        this.g = w4Var;
        this.f = f;
        this.h = c7Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v80(cx0 cx0Var, kj kjVar) {
        super(2, kjVar);
        this.h = cx0Var;
    }
}
