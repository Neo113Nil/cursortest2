package yads;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes13.dex */
public final class b10 extends Lambda implements Function1 {
    public final /* synthetic */ us3 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b10(us3 us3Var) {
        super(1);
        this.b = us3Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        this.b.onAdFailedToLoad(e8.f);
        return Unit.INSTANCE;
    }
}
