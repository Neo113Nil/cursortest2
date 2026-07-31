package yads;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
public final class qp1 extends Lambda implements Function0 {
    public final /* synthetic */ tp1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qp1(tp1 tp1Var) {
        super(0);
        this.b = tp1Var;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo4828invoke() {
        this.b.e = false;
        return Unit.INSTANCE;
    }
}
