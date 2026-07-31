package yads;

import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes5.dex */
public final /* synthetic */ class es extends FunctionReferenceImpl implements Function2 {
    public es(kc1 kc1Var) {
        super(2, kc1Var, kc1.class, "get", "get(Lcom/monetization/ads/common/AdRequestData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        kc1 kc1Var = (kc1) this.receiver;
        pi2 pi2Var = kc1Var.a;
        kc1Var.b.getClass();
        return pi2Var.a(kx0.a((d8) obj), (Continuation) obj2);
    }
}
