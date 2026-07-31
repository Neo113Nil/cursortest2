package yads;

import kotlin.collections.MapsKt;
import kotlin.reflect.KProperty;

/* loaded from: classes5.dex */
public final class il {
    public final /* synthetic */ com.monetization.ads.mediation.banner.a a;

    public il(com.monetization.ads.mediation.banner.a aVar) {
        this.a = aVar;
    }

    public final void a() {
        this.a.a.c();
        if (this.a.a.d()) {
            com.monetization.ads.mediation.banner.a aVar = this.a;
            qm2 qm2Var = aVar.d;
            KProperty kProperty = com.monetization.ads.mediation.banner.a.g[0];
            fl flVar = (fl) qm2Var.a.get();
            if (flVar != null) {
                aVar.a.b(MapsKt.emptyMap());
                flVar.E.a(aVar.c.a());
            }
        }
    }
}
