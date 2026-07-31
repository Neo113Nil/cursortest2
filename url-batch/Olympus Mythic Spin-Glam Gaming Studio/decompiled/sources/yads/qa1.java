package yads;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes6.dex */
public final /* synthetic */ class qa1 extends FunctionReferenceImpl implements Function1 {
    public qa1(za1 za1Var) {
        super(1, za1Var, za1.class, "onAction", "onAction(Lcom/yandex/mobile/ads/features/debugpanel/ui/model/DebugPanelUiAction;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ((za1) this.receiver).a((t90) obj);
        return Unit.INSTANCE;
    }
}
