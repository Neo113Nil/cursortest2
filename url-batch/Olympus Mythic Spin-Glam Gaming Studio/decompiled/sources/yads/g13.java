package yads;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class g13 implements v72 {
    public final List a;

    public g13(List list) {
        this.a = list;
    }

    @Override // yads.v72
    public final void a() {
    }

    @Override // yads.v72
    public final void a(a22 a22Var) {
    }

    @Override // yads.v72
    public final void a(a22 a22Var, cv cvVar) {
        List<ph> list = this.a;
        if (list != null) {
            ja jaVar = new ja(a22Var, cvVar);
            for (ph phVar : list) {
                qh a = a22Var.a(phVar);
                if (a == null) {
                    a = null;
                }
                if (a != null) {
                    a.c(phVar.c);
                    Intrinsics.checkNotNull(phVar, "null cannot be cast to non-null type com.monetization.ads.network.model.Asset<kotlin.Any?>");
                    a.a(phVar, jaVar);
                }
            }
        }
    }
}
