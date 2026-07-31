package yads;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
public final class z72 extends Lambda implements Function0 {
    public final /* synthetic */ a82 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z72(a82 a82Var) {
        super(0);
        this.b = a82Var;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo4828invoke() {
        a82 a82Var = this.b;
        a82Var.b.a();
        a82Var.a.a.remove(a82Var);
        return Unit.INSTANCE;
    }
}
