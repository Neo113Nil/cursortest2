package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class vn extends fu0 implements qu {
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ qo0 f;
    public final /* synthetic */ ah0 g;
    public final /* synthetic */ xn h;
    public final /* synthetic */ y3 i;
    public final /* synthetic */ wn j;
    public final /* synthetic */ wn k;
    public final /* synthetic */ w3 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vn(qo0 qo0Var, ah0 ah0Var, xn xnVar, y3 y3Var, wn wnVar, wn wnVar2, w3 w3Var, kj kjVar) {
        super(2, kjVar);
        this.f = qo0Var;
        this.g = ah0Var;
        this.h = xnVar;
        this.i = y3Var;
        this.j = wnVar;
        this.k = wnVar2;
        this.l = w3Var;
    }

    @Override // defpackage.h9
    public final kj create(Object obj, kj kjVar) {
        vn vnVar = new vn(this.f, this.g, this.h, this.i, this.j, this.k, this.l, kjVar);
        vnVar.e = obj;
        return vnVar;
    }

    @Override // defpackage.qu
    public final Object invoke(Object obj, Object obj2) {
        return ((vn) create((bk) obj, (kj) obj2)).invokeSuspend(ky0.a);
    }

    @Override // defpackage.h9
    public final Object invokeSuspend(Object obj) {
        CancellationException cancellationException;
        bk bkVar;
        Object k;
        ck ckVar;
        int i = this.d;
        ky0 ky0Var = ky0.a;
        qo0 qo0Var = this.f;
        if (i == 0) {
            rg0.u(obj);
            bk bkVar2 = (bk) this.e;
            try {
                sc0 sc0Var = qo0Var.t;
                ah0 ah0Var = this.g;
                xn xnVar = this.h;
                y3 y3Var = this.i;
                wn wnVar = this.j;
                wn wnVar2 = this.k;
                w3 w3Var = this.l;
                this.e = bkVar2;
                this.d = 1;
                float f = un.a;
                k = d31.k(ah0Var, new tn(wnVar2, new fj0(), sc0Var, xnVar, w3Var, wnVar, y3Var, null), this);
                ckVar = ck.d;
                if (k != ckVar) {
                    k = ky0Var;
                }
            } catch (CancellationException e) {
                cancellationException = e;
                bkVar = bkVar2;
            }
            return k == ckVar ? ckVar : ky0Var;
        }
        if (i != 1) {
            g8.s("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        bkVar = (bk) this.e;
        try {
            rg0.u(obj);
            return ky0Var;
        } catch (CancellationException e2) {
            cancellationException = e2;
        }
        eb ebVar = qo0Var.x;
        if (ebVar != null) {
            ebVar.r(on.a);
        }
        if (!x40.G(bkVar)) {
            throw cancellationException;
        }
    }
}
