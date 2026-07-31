package yads;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes10.dex */
public final /* synthetic */ class t32 extends FunctionReferenceImpl implements Function0 {
    public t32(u32 u32Var) {
        super(0, u32Var, u32.class, "stopCountdownTimer", "stopCountdownTimer()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo4828invoke() {
        u32 u32Var = (u32) this.receiver;
        zq2 zq2Var = u32Var.e;
        if (zq2Var != null) {
            zq2Var.c.a();
        }
        u32Var.e = null;
        return Unit.INSTANCE;
    }
}
