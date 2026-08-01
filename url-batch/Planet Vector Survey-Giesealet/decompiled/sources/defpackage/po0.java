package defpackage;

import androidx.compose.foundation.gestures.a;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class po0 extends fu0 implements qu {
    public int d;
    public final /* synthetic */ qo0 e;
    public final /* synthetic */ float f;
    public final /* synthetic */ float g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public po0(qo0 qo0Var, float f, float f2, kj kjVar) {
        super(2, kjVar);
        this.e = qo0Var;
        this.f = f;
        this.g = f2;
    }

    @Override // defpackage.h9
    public final kj create(Object obj, kj kjVar) {
        return new po0(this.e, this.f, this.g, kjVar);
    }

    @Override // defpackage.qu
    public final Object invoke(Object obj, Object obj2) {
        return ((po0) create((bk) obj, (kj) obj2)).invokeSuspend(ky0.a);
    }

    @Override // defpackage.h9
    public final Object invokeSuspend(Object obj) {
        int i = this.d;
        if (i == 0) {
            rg0.u(obj);
            zo0 zo0Var = this.e.F;
            long o = mz.o(this.f, this.g);
            this.d = 1;
            Object a = a.a(zo0Var, o, this);
            ck ckVar = ck.d;
            if (a == ckVar) {
                return ckVar;
            }
        } else {
            if (i != 1) {
                g8.s("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            rg0.u(obj);
        }
        return ky0.a;
    }
}
