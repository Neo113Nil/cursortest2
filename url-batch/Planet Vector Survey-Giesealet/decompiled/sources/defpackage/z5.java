package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class z5 extends fu0 implements mu {
    public d7 d;
    public cj0 e;
    public int f;
    public final /* synthetic */ b6 g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ zu0 i;
    public final /* synthetic */ long j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z5(b6 b6Var, Object obj, zu0 zu0Var, long j, kj kjVar) {
        super(1, kjVar);
        this.g = b6Var;
        this.h = obj;
        this.i = zu0Var;
        this.j = j;
    }

    @Override // defpackage.mu
    public final Object c(Object obj) {
        return ((z5) create((kj) obj)).invokeSuspend(ky0.a);
    }

    @Override // defpackage.h9
    public final kj create(kj kjVar) {
        return new z5(this.g, this.h, this.i, this.j, kjVar);
    }

    @Override // defpackage.h9
    public final Object invokeSuspend(Object obj) {
        d7 d7Var;
        cj0 cj0Var;
        zu0 zu0Var = this.i;
        int i = this.f;
        int i2 = 0;
        int i3 = 1;
        b6 b6Var = this.g;
        try {
            if (i == 0) {
                rg0.u(obj);
                b6Var.c.f = (i7) ((mu) b6Var.a.e).c(this.h);
                b6Var.e.setValue(zu0Var.c);
                b6Var.d.setValue(Boolean.TRUE);
                d7 d7Var2 = b6Var.c;
                d7 d7Var3 = new d7(d7Var2.d, d7Var2.e.getValue(), mz.y(d7Var2.f), d7Var2.g, Long.MIN_VALUE, d7Var2.i);
                cj0 cj0Var2 = new cj0();
                long j = this.j;
                y5 y5Var = new y5(b6Var, d7Var3, cj0Var2, i2);
                this.d = d7Var3;
                this.e = cj0Var2;
                this.f = 1;
                Object b = ze0.b(d7Var3, zu0Var, j, y5Var, this);
                ck ckVar = ck.d;
                if (b == ckVar) {
                    return ckVar;
                }
                d7Var = d7Var3;
                cj0Var = cj0Var2;
            } else {
                if (i != 1) {
                    g8.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                cj0Var = this.e;
                d7Var = this.d;
                rg0.u(obj);
            }
            if (!cj0Var.d) {
                i3 = 2;
            }
            d7 d7Var4 = b6Var.c;
            d7Var4.f.d();
            d7Var4.g = Long.MIN_VALUE;
            b6Var.d.setValue(Boolean.FALSE);
            return new a7(i3, 0, d7Var);
        } catch (CancellationException e) {
            d7 d7Var5 = b6Var.c;
            d7Var5.f.d();
            d7Var5.g = Long.MIN_VALUE;
            b6Var.d.setValue(Boolean.FALSE);
            throw e;
        }
    }
}
