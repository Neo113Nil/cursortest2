package yads;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes9.dex */
public final /* synthetic */ class g62 extends FunctionReferenceImpl implements Function0 {
    public g62(i62 i62Var) {
        super(0, i62Var, i62.class, "notifyCompletedContent", "notifyCompletedContent()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo4828invoke() {
        i62 i62Var = (i62) this.receiver;
        zj2 zj2Var = i62Var.c;
        if (zj2Var != null) {
            zj2Var.a();
        }
        s3 s3Var = i62Var.b;
        if (s3Var != null) {
            s3Var.b();
        }
        i62Var.a.a.remove(i62Var);
        i62Var.b = null;
        i62Var.c = null;
        return Unit.INSTANCE;
    }
}
