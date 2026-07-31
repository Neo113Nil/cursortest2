package yads;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* loaded from: classes15.dex */
public final class h22 implements v72 {
    public final ry1 a;
    public a22 b;

    public h22(ry1 ry1Var) {
        this.a = ry1Var;
    }

    @Override // yads.v72
    public final void a(a22 a22Var) {
        a22Var.a();
    }

    @Override // yads.v72
    public final void a(a22 a22Var, cv cvVar) {
        this.b = a22Var;
        qa qaVar = new qa(a22Var, cvVar, this.a.f);
        for (ph phVar : this.a.b) {
            qh a = a22Var.a(phVar);
            if (a == null) {
                a = null;
            }
            if (a != null) {
                a.c(phVar.c);
                Intrinsics.checkNotNull(phVar, "null cannot be cast to non-null type com.monetization.ads.network.model.Asset<kotlin.Any?>");
                a.a(phVar, qaVar);
            }
        }
        qm2 qm2Var = a22Var.c.e;
        KProperty kProperty = n22.g[4];
        List list = (List) qm2Var.a.get();
        if (list != null) {
            Iterator it = list.iterator();
            if (it.hasNext()) {
                it.next().getClass();
                throw new ClassCastException();
            }
        }
    }

    @Override // yads.v72
    public final void a() {
        a22 a22Var = this.b;
        if (a22Var != null) {
            for (ph phVar : this.a.b) {
                qh a = a22Var.a(phVar);
                if (a instanceof xf0) {
                    ((xf0) a).b(phVar.c);
                }
            }
        }
    }
}
