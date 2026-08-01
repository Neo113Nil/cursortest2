package defpackage;

import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class fm extends fu0 implements qu {
    public final /* synthetic */ f70 d;
    public final /* synthetic */ lm e;
    public final /* synthetic */ gs0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fm(f70 f70Var, lm lmVar, gs0 gs0Var, kj kjVar) {
        super(2, kjVar);
        this.d = f70Var;
        this.e = lmVar;
        this.f = gs0Var;
    }

    @Override // defpackage.h9
    public final kj create(Object obj, kj kjVar) {
        return new fm(this.d, this.e, this.f, kjVar);
    }

    @Override // defpackage.qu
    public final Object invoke(Object obj, Object obj2) {
        fm fmVar = (fm) create((bk) obj, (kj) obj2);
        ky0 ky0Var = ky0.a;
        fmVar.invokeSuspend(ky0Var);
        return ky0Var;
    }

    @Override // defpackage.h9
    public final Object invokeSuspend(Object obj) {
        rg0.u(obj);
        for (y70 y70Var : (Set) this.d.getValue()) {
            lm lmVar = this.e;
            if (!((List) lmVar.b().e.d.getValue()).contains(y70Var) && !this.f.contains(y70Var)) {
                lmVar.b().b(y70Var);
            }
        }
        return ky0.a;
    }
}
