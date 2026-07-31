package yads;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes6.dex */
public final /* synthetic */ class e72 extends FunctionReferenceImpl implements Function0 {
    public e72(i72 i72Var) {
        super(0, i72Var, i72.class, "stopCountdownTimer", "stopCountdownTimer()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo4828invoke() {
        i72 i72Var = (i72) this.receiver;
        zq2 zq2Var = i72Var.h;
        if (zq2Var != null) {
            zq2Var.c.a();
        }
        i72Var.h = null;
        return Unit.INSTANCE;
    }
}
