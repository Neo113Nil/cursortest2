package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class wu0 extends tk0 implements qu {
    public int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ bk g;
    public final /* synthetic */ pd h;
    public final /* synthetic */ f2 i;
    public final /* synthetic */ oh0 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wu0(bk bkVar, pd pdVar, f2 f2Var, oh0 oh0Var, kj kjVar) {
        super(kjVar);
        this.g = bkVar;
        this.h = pdVar;
        this.i = f2Var;
        this.j = oh0Var;
    }

    @Override // defpackage.h9
    public final kj create(Object obj, kj kjVar) {
        wu0 wu0Var = new wu0(this.g, this.h, this.i, this.j, kjVar);
        wu0Var.f = obj;
        return wu0Var;
    }

    @Override // defpackage.qu
    public final Object invoke(Object obj, Object obj2) {
        return ((wu0) create((ju0) obj, (kj) obj2)).invokeSuspend(ky0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0061, code lost:
    
        if (r13 == r11) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0063, code lost:
    
        return r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x003e, code lost:
    
        if (r13 == r11) goto L18;
     */
    @Override // defpackage.h9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ju0 ju0Var;
        int i = this.e;
        bk bkVar = this.g;
        oh0 oh0Var = this.j;
        kj kjVar = null;
        ck ckVar = ck.d;
        if (i == 0) {
            rg0.u(obj);
            ju0Var = (ju0) this.f;
            d31.E(bkVar, null, new qk(oh0Var, kjVar, 4), 3);
            this.f = ju0Var;
            this.e = 1;
            obj = yu0.a(ju0Var, (r3 & 1) != 0, sg0.e, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    g8.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                rg0.u(obj);
                wg0 wg0Var = (wg0) obj;
                if (wg0Var == null) {
                    d31.E(bkVar, null, new vu0(oh0Var, null, 0), 3);
                } else {
                    wg0Var.a();
                    d31.E(bkVar, null, new vu0(oh0Var, null, 1), 3);
                    qd qdVar = (qd) this.i.f;
                    if (qdVar.w) {
                        qdVar.x.a();
                    }
                }
                return ky0.a;
            }
            ju0Var = (ju0) this.f;
            rg0.u(obj);
        }
        wg0 wg0Var2 = (wg0) obj;
        wg0Var2.a();
        go goVar = yu0.a;
        pd pdVar = this.h;
        if (pdVar != goVar) {
            d31.E(bkVar, null, new u6(pdVar, oh0Var, wg0Var2, null, 13), 3);
        }
        this.f = null;
        this.e = 2;
        obj = yu0.c(ju0Var, sg0.e, this);
    }
}
