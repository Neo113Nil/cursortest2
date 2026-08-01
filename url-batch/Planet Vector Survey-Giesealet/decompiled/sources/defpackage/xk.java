package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class xk extends fu0 implements qu {
    public dj0 d;
    public d7 e;
    public int f;
    public final /* synthetic */ float g;
    public final /* synthetic */ j3 h;
    public final /* synthetic */ vo0 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xk(float f, j3 j3Var, vo0 vo0Var, kj kjVar) {
        super(2, kjVar);
        this.g = f;
        this.h = j3Var;
        this.i = vo0Var;
    }

    @Override // defpackage.h9
    public final kj create(Object obj, kj kjVar) {
        return new xk(this.g, this.h, this.i, kjVar);
    }

    @Override // defpackage.qu
    public final Object invoke(Object obj, Object obj2) {
        return ((xk) create((bk) obj, (kj) obj2)).invokeSuspend(ky0.a);
    }

    @Override // defpackage.h9
    public final Object invokeSuspend(Object obj) {
        float f;
        dj0 dj0Var;
        d7 d7Var;
        int i = this.f;
        if (i == 0) {
            rg0.u(obj);
            f = this.g;
            if (Math.abs(f) > 1.0f) {
                dj0 dj0Var2 = new dj0();
                dj0Var2.d = f;
                dj0 dj0Var3 = new dj0();
                j3 j3Var = dz0.a;
                d7 d7Var2 = new d7(j3Var, Float.valueOf(0.0f), new e7(f), Long.MIN_VALUE, Long.MIN_VALUE, false);
                try {
                    j3 j3Var2 = this.h;
                    p01 p01Var = (p01) j3Var2.e;
                    wk wkVar = new wk(dj0Var3, this.i, dj0Var2, j3Var2);
                    this.d = dj0Var2;
                    this.e = d7Var2;
                    this.f = 1;
                    Object b = ze0.b(d7Var2, new ok(p01Var, j3Var, d7Var2.e.getValue(), d7Var2.f), Long.MIN_VALUE, wkVar, this);
                    Object obj2 = ck.d;
                    if (b != obj2) {
                        b = ky0.a;
                    }
                    if (b == obj2) {
                        return obj2;
                    }
                    dj0Var = dj0Var2;
                } catch (CancellationException unused) {
                    dj0Var = dj0Var2;
                    d7Var = d7Var2;
                    dj0Var.d = ((Number) ((mu) d7Var.d.f).c(d7Var.f)).floatValue();
                    f = dj0Var.d;
                    return new Float(f);
                }
            }
            return new Float(f);
        }
        if (i != 1) {
            g8.s("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        d7Var = this.e;
        dj0Var = this.d;
        try {
            rg0.u(obj);
        } catch (CancellationException unused2) {
            dj0Var.d = ((Number) ((mu) d7Var.d.f).c(d7Var.f)).floatValue();
            f = dj0Var.d;
            return new Float(f);
        }
        f = dj0Var.d;
        return new Float(f);
    }
}
