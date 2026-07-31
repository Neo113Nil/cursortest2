package yads;

import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KProperty;

/* loaded from: classes15.dex */
public final class bc1 extends Lambda implements Function0 {
    public final /* synthetic */ com.monetization.ads.mediation.interstitial.a b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bc1(com.monetization.ads.mediation.interstitial.a aVar) {
        super(0);
        this.b = aVar;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo4828invoke() {
        com.monetization.ads.mediation.interstitial.a aVar = this.b;
        qm2 qm2Var = aVar.e;
        KProperty kProperty = com.monetization.ads.mediation.interstitial.a.g[1];
        bx0 bx0Var = (bx0) qm2Var.a.get();
        if (bx0Var != null) {
            aVar.a.c(MapsKt.emptyMap());
            bx0Var.g();
        }
        return Unit.INSTANCE;
    }
}
