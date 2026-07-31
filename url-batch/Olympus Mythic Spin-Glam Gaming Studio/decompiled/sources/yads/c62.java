package yads;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes15.dex */
public final /* synthetic */ class c62 extends FunctionReferenceImpl implements Function0 {
    public c62(d62 d62Var) {
        super(0, d62Var, d62.class, "notifyOnShowClose", "notifyOnShowClose()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo4828invoke() {
        d62 d62Var = (d62) this.receiver;
        d62Var.b.a();
        d62Var.a.a.remove(d62Var);
        return Unit.INSTANCE;
    }
}
