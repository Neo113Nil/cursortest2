package yads;

import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes3.dex */
public final /* synthetic */ class ms extends FunctionReferenceImpl implements Function2 {
    public ms(gs2 gs2Var) {
        super(2, gs2Var, gs2.class, "get", "get(Lcom/monetization/ads/common/AdRequestData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        gs2 gs2Var = (gs2) this.receiver;
        pi2 pi2Var = gs2Var.a;
        gs2Var.b.getClass();
        return pi2Var.a(kx0.a((d8) obj), (Continuation) obj2);
    }
}
