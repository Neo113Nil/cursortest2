package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class wr extends fu0 implements ru {
    public int d;
    public /* synthetic */ pr e;
    public /* synthetic */ Object f;
    public final /* synthetic */ wg g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wr(wg wgVar, kj kjVar) {
        super(3, kjVar);
        this.g = wgVar;
    }

    @Override // defpackage.ru
    public final Object b(Object obj, Object obj2, Object obj3) {
        wr wrVar = new wr(this.g, (kj) obj3);
        wrVar.e = (pr) obj;
        wrVar.f = obj2;
        return wrVar.invokeSuspend(ky0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0039, code lost:
    
        if (r0.e(r6, r5) == r4) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003b, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002e, code lost:
    
        if (r6 == r4) goto L15;
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
            Object obj2 = this.f;
            this.e = prVar;
            this.d = 1;
            obj = this.g.invoke(obj2, this);
        } else {
            if (i != 1) {
                if (i == 2) {
                    rg0.u(obj);
                    return ky0.a;
                }
                g8.s("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            prVar = this.e;
            rg0.u(obj);
        }
        this.e = null;
        this.d = 2;
    }
}
