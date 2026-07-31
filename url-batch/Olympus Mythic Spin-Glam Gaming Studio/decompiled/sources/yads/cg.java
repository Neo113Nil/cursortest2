package yads;

import kotlin.Lazy;

/* loaded from: classes5.dex */
public final class cg implements lo2 {
    public final qf a;
    public final Lazy b;

    public cg(Lazy lazy, qf qfVar) {
        this.a = qfVar;
        this.b = lazy;
    }

    @Override // yads.lo2
    public final void reportError(String str, Throwable th) {
        if (this.a.a()) {
            try {
                ((ac0) this.b.getValue()).a.reportError(str, th);
            } catch (Throwable unused) {
                boolean z = ob1.a;
            }
        }
    }
}
