package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class lb extends fu0 implements qu {
    public int d;
    public final /* synthetic */ b6 e;
    public final /* synthetic */ float f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ mb h;
    public final /* synthetic */ kz i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lb(b6 b6Var, float f, boolean z, mb mbVar, kz kzVar, kj kjVar) {
        super(2, kjVar);
        this.e = b6Var;
        this.f = f;
        this.g = z;
        this.h = mbVar;
        this.i = kzVar;
    }

    @Override // defpackage.h9
    public final kj create(Object obj, kj kjVar) {
        return new lb(this.e, this.f, this.g, this.h, this.i, kjVar);
    }

    @Override // defpackage.qu
    public final Object invoke(Object obj, Object obj2) {
        return ((lb) create((bk) obj, (kj) obj2)).invokeSuspend(ky0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00ae, code lost:
    
        if ((r0 instanceof defpackage.gs) != false) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00ce A[RETURN] */
    @Override // defpackage.h9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object d;
        int i = this.d;
        ky0 ky0Var = ky0.a;
        ox0 ox0Var = null;
        if (i == 0) {
            rg0.u(obj);
            b6 b6Var = this.e;
            float f = ((jn) b6Var.e.getValue()).d;
            float f2 = this.f;
            if (!jn.a(f, f2)) {
                boolean z = this.g;
                ck ckVar = ck.d;
                if (z) {
                    float f3 = ((jn) b6Var.e.getValue()).d;
                    Object qh0Var = jn.a(f3, 0.0f) ? new qh0(0L) : jn.a(f3, 1.0f) ? new ow() : jn.a(f3, 0.0f) ? new gs() : null;
                    this.d = 2;
                    ox0 ox0Var2 = bp.b;
                    ox0 ox0Var3 = bp.a;
                    kz kzVar = this.i;
                    if (kzVar != null) {
                        if ((kzVar instanceof qh0) || (kzVar instanceof eo) || (kzVar instanceof ow) || (kzVar instanceof gs)) {
                            ox0Var = ox0Var3;
                        }
                    } else if (qh0Var != null) {
                        if (!(qh0Var instanceof qh0) && !(qh0Var instanceof eo)) {
                            if (qh0Var instanceof ow) {
                                ox0Var = bp.c;
                            }
                        }
                        ox0Var = ox0Var2;
                    }
                    if (ox0Var == null ? (d = b6Var.d(new jn(f2), this)) != ckVar : (d = b6.b(b6Var, new jn(f2), ox0Var, this)) != ckVar) {
                        d = ky0Var;
                    }
                    if (d == ckVar) {
                    }
                } else {
                    jn jnVar = new jn(f2);
                    this.d = 1;
                    if (b6Var.d(jnVar, this) == ckVar) {
                        return ckVar;
                    }
                }
            }
        } else {
            if (i != 1 && i != 2) {
                g8.s("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            rg0.u(obj);
        }
        return ky0Var;
    }
}
