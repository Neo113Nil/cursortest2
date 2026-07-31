package yads;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes15.dex */
public final /* synthetic */ class y72 extends FunctionReferenceImpl implements Function0 {
    public y72(a82 a82Var) {
        super(0, a82Var, a82.class, "notifyOnShowClose", "notifyOnShowClose()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo4828invoke() {
        a82 a82Var = (a82) this.receiver;
        a82Var.b.a();
        a82Var.a.a.remove(a82Var);
        return Unit.INSTANCE;
    }
}
