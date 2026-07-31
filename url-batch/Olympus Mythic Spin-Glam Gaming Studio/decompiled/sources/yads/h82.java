package yads;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes14.dex */
public final /* synthetic */ class h82 extends FunctionReferenceImpl implements Function0 {
    public h82(i82 i82Var) {
        super(0, i82Var, i82.class, "invalidate", "invalidate()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo4828invoke() {
        ((i82) this.receiver).invalidate();
        return Unit.INSTANCE;
    }
}
