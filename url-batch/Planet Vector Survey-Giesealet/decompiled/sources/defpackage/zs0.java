package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class zs0 extends fu0 implements ru {
    public int d;
    public /* synthetic */ pr e;
    public /* synthetic */ int f;
    public final /* synthetic */ at0 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zs0(at0 at0Var, kj kjVar) {
        super(3, kjVar);
        this.g = at0Var;
    }

    @Override // defpackage.ru
    public final Object b(Object obj, Object obj2, Object obj3) {
        int intValue = ((Number) obj2).intValue();
        zs0 zs0Var = new zs0(this.g, (kj) obj3);
        zs0Var.e = (pr) obj;
        zs0Var.f = intValue;
        return zs0Var.invokeSuspend(ky0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x007b, code lost:
    
        if (r0.e(defpackage.br0.f, r8) == r7) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006e, code lost:
    
        if (defpackage.mz.B(Long.MAX_VALUE, r8) == r7) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005e, code lost:
    
        if (r0.e(defpackage.br0.e, r8) == r7) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0044, code lost:
    
        if (r0.e(defpackage.br0.d, r8) == r7) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0051, code lost:
    
        if (defpackage.mz.B(0, r8) == r7) goto L32;
     */
    @Override // defpackage.h9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        pr prVar;
        int i = this.d;
        ck ckVar = ck.d;
        if (i == 0) {
            rg0.u(obj);
            prVar = this.e;
            if (this.f > 0) {
                this.d = 1;
            } else {
                this.e = prVar;
                this.d = 2;
            }
            return ckVar;
        }
        if (i != 1) {
            if (i == 2) {
                prVar = this.e;
                rg0.u(obj);
                this.e = prVar;
                this.d = 3;
            } else if (i == 3) {
                prVar = this.e;
                rg0.u(obj);
                this.e = prVar;
                this.d = 4;
            } else if (i == 4) {
                prVar = this.e;
                rg0.u(obj);
                this.e = null;
                this.d = 5;
            } else if (i != 5) {
                g8.s("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }
        rg0.u(obj);
        return ky0.a;
    }
}
