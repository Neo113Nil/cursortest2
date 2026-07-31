package yads;

import com.monetization.ads.mediation.base.MediatedAdRequestError;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes14.dex */
public final class q22 extends Lambda implements Function1 {
    public final /* synthetic */ r22 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q22(r22 r22Var) {
        super(1);
        this.b = r22Var;
    }

    public final void a(String str) {
        this.b.onAdFailedToLoad(new MediatedAdRequestError(1, "Ad is blocked by quality verification with reasons:  " + str));
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((String) obj);
        return Unit.INSTANCE;
    }
}
