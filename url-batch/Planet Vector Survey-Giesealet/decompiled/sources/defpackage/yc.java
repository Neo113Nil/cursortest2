package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class yc extends fu0 implements qu {
    public final /* synthetic */ int d = 0;
    public int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ bd g;
    public final /* synthetic */ pr h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yc(bd bdVar, pr prVar, Object obj, kj kjVar) {
        super(2, kjVar);
        this.g = bdVar;
        this.h = prVar;
        this.f = obj;
    }

    @Override // defpackage.h9
    public final kj create(Object obj, kj kjVar) {
        int i = this.d;
        pr prVar = this.h;
        bd bdVar = this.g;
        switch (i) {
            case 0:
                return new yc(bdVar, prVar, this.f, kjVar);
            default:
                yc ycVar = new yc(bdVar, prVar, kjVar);
                ycVar.f = obj;
                return ycVar;
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
        return ((yc) create(bkVar, kjVar)).invokeSuspend(ky0Var);
    }

    @Override // defpackage.h9
    public final Object invokeSuspend(Object obj) {
        int i = this.d;
        ky0 ky0Var = ky0.a;
        ck ckVar = ck.d;
        switch (i) {
            case 0:
                int i2 = this.e;
                if (i2 == 0) {
                    rg0.u(obj);
                    ru ruVar = this.g.h;
                    Object obj2 = this.f;
                    this.e = 1;
                    if (ruVar.b(this.h, obj2, this) == ckVar) {
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
            default:
                int i3 = this.e;
                if (i3 == 0) {
                    rg0.u(obj);
                    bk bkVar = (bk) this.f;
                    gj0 gj0Var = new gj0();
                    bd bdVar = this.g;
                    or orVar = bdVar.g;
                    ad adVar = new ad(gj0Var, bkVar, bdVar, this.h, 0);
                    this.e = 1;
                    if (orVar.a(adVar, this) == ckVar) {
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
        }
        return ckVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yc(bd bdVar, pr prVar, kj kjVar) {
        super(2, kjVar);
        this.g = bdVar;
        this.h = prVar;
    }
}
