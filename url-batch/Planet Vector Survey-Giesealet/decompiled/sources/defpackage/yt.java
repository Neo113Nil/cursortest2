package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class yt extends tk0 implements qu {
    public int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ rj g;
    public final /* synthetic */ qu h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yt(rj rjVar, qu quVar, kj kjVar) {
        super(kjVar);
        this.g = rjVar;
        this.h = quVar;
    }

    @Override // defpackage.h9
    public final kj create(Object obj, kj kjVar) {
        yt ytVar = new yt(this.g, this.h, kjVar);
        ytVar.f = obj;
        return ytVar;
    }

    @Override // defpackage.qu
    public final Object invoke(Object obj, Object obj2) {
        return ((yt) create((ju0) obj, (kj) obj2)).invokeSuspend(ky0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0056, code lost:
    
        if (r9 != r5) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006b, code lost:
    
        if (r9 == r5) goto L34;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0040 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006e  */
    /* JADX WARN: Type inference failed for: r0v0, types: [int] */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, ju0] */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0056 -> B:8:0x0027). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x006b -> B:8:0x0027). Please report as a decompilation issue!!! */
    @Override // defpackage.h9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ju0 ju0Var;
        ju0 ju0Var2;
        ju0 ju0Var3 = this.e;
        rj rjVar = this.g;
        ck ckVar = ck.d;
        try {
        } catch (CancellationException e) {
            e = e;
            if (nk.B(rjVar)) {
                throw e;
            }
            this.f = ju0Var3;
            this.e = 3;
            Object j = d31.j(ju0Var3, this);
            ju0Var2 = ju0Var3;
        }
        if (ju0Var3 == 0) {
            rg0.u(obj);
            ju0Var = (ju0) this.f;
            if (nk.B(rjVar)) {
            }
        } else {
            if (ju0Var3 != 1) {
                if (ju0Var3 == 2) {
                    ju0 ju0Var4 = (ju0) this.f;
                    rg0.u(obj);
                    ju0Var2 = ju0Var4;
                } else {
                    if (ju0Var3 != 3) {
                        g8.s("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ju0 ju0Var5 = (ju0) this.f;
                    rg0.u(obj);
                    ju0Var2 = ju0Var5;
                }
                ju0Var = ju0Var2;
                if (nk.B(rjVar)) {
                    return ky0.a;
                }
                try {
                } catch (CancellationException e2) {
                    ju0Var3 = ju0Var;
                    e = e2;
                    if (nk.B(rjVar)) {
                    }
                }
                qu quVar = this.h;
                this.f = ju0Var;
                this.e = 1;
                if (quVar.invoke(ju0Var, this) != ckVar) {
                    ju0Var3 = ju0Var;
                    this.f = ju0Var3;
                    this.e = 2;
                    Object j2 = d31.j(ju0Var3, this);
                    ju0Var2 = ju0Var3;
                }
                return ckVar;
            }
            ju0 ju0Var6 = (ju0) this.f;
            rg0.u(obj);
            ju0Var3 = ju0Var6;
            this.f = ju0Var3;
            this.e = 2;
            Object j22 = d31.j(ju0Var3, this);
            ju0Var2 = ju0Var3;
        }
    }
}
