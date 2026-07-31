package yads;

import com.monetization.ads.mediation.base.MediatedAdRequestError;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class nr2 extends Lambda implements Function1 {
    public final /* synthetic */ or2 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nr2(or2 or2Var) {
        super(1);
        this.b = or2Var;
    }

    public final void a(String str) {
        this.b.onRewardedAdFailedToLoad(new MediatedAdRequestError(1, "Ad is blocked by quality verification with reasons:  " + str));
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((String) obj);
        return Unit.INSTANCE;
    }
}
