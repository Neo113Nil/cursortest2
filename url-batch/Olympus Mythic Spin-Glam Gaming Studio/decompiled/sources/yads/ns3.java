package yads;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class ns3 extends Lambda implements Function0 {
    public final /* synthetic */ os3 b;
    public final /* synthetic */ xq3 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ns3(os3 os3Var, xq3 xq3Var) {
        super(0);
        this.b = os3Var;
        this.c = xq3Var;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo4828invoke() {
        this.b.a.onImpression(this.c);
        return Unit.INSTANCE;
    }
}
