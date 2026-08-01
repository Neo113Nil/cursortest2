package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class e extends fu0 implements qu {
    public boolean d;
    public int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ oh0 g;
    public final /* synthetic */ long h;
    public final /* synthetic */ r60 i;
    public final /* synthetic */ qd j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(oh0 oh0Var, long j, r60 r60Var, qd qdVar, kj kjVar) {
        super(2, kjVar);
        this.g = oh0Var;
        this.h = j;
        this.i = r60Var;
        this.j = qdVar;
    }

    @Override // defpackage.h9
    public final kj create(Object obj, kj kjVar) {
        e eVar = new e(this.g, this.h, this.i, this.j, kjVar);
        eVar.f = obj;
        return eVar;
    }

    @Override // defpackage.qu
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((bk) obj, (kj) obj2)).invokeSuspend(ky0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x00bb, code lost:
    
        if (r14.a(r1, r18) != r11) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d8, code lost:
    
        if (r14.a(r2, r18) == r11) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0074, code lost:
    
        if (r2 == r11) goto L43;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009a  */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, java.util.concurrent.CancellationException] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v5, types: [qh0] */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v4, types: [zz] */
    @Override // defpackage.h9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ck ckVar;
        ?? r10;
        Object d;
        ?? r1;
        boolean z;
        rh0 rh0Var;
        int i = this.e;
        qd qdVar = this.j;
        ky0 ky0Var = ky0.a;
        r60 r60Var = this.i;
        ck ckVar2 = ck.d;
        if (i == 0) {
            rg0.u(obj);
            ckVar = ckVar2;
            r10 = 0;
            ws0 E = d31.E((bk) this.f, null, new d(qdVar, this.h, this.i, null, 0), 3);
            this.f = E;
            this.e = 1;
            d = this.g.d(this);
            r1 = E;
        } else if (i == 1) {
            zz zzVar = (zz) this.f;
            rg0.u(obj);
            r10 = 0;
            ckVar = ckVar2;
            d = obj;
            r1 = zzVar;
        } else {
            if (i == 2) {
                z = this.d;
                rg0.u(obj);
                r10 = 0;
                ckVar = ckVar2;
                if (z) {
                    qh0 qh0Var = new qh0(this.h);
                    rh0 rh0Var2 = new rh0(qh0Var);
                    this.f = rh0Var2;
                    this.e = 3;
                    if (r60Var.a(qh0Var, this) != ckVar) {
                        rh0Var = rh0Var2;
                        r10 = r10;
                        this.f = r10;
                        this.e = 4;
                    }
                    return ckVar;
                }
                qdVar.C = r10;
                return ky0Var;
            }
            if (i != 3) {
                if (i != 4 && i != 5) {
                    g8.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                rg0.u(obj);
                r10 = 0;
                qdVar.C = r10;
                return ky0Var;
            }
            rh0Var = (rh0) this.f;
            rg0.u(obj);
            r10 = 0;
            ckVar = ckVar2;
            this.f = r10;
            this.e = 4;
        }
        boolean booleanValue = ((Boolean) d).booleanValue();
        if (!r1.b()) {
            qh0 qh0Var2 = qdVar.C;
            if (qh0Var2 != null) {
                kz rh0Var3 = booleanValue ? new rh0(qh0Var2) : new ph0(qh0Var2);
                this.f = r10;
                this.e = 5;
            }
            qdVar.C = r10;
            return ky0Var;
        }
        this.f = r10;
        this.d = booleanValue;
        this.e = 2;
        r1.a(r10);
        Object u = r1.u(this);
        if (u != ckVar) {
            u = ky0Var;
        }
        if (u != ckVar) {
            z = booleanValue;
            r10 = r10;
            if (z) {
            }
            qdVar.C = r10;
            return ky0Var;
        }
        return ckVar;
    }
}
