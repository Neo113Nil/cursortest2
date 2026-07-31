package yads;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class sb0 extends Lambda implements Function0 {
    public final /* synthetic */ tb0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sb0(tb0 tb0Var) {
        super(0);
        this.b = tb0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo4828invoke() {
        tb0 tb0Var = this.b;
        return Long.valueOf(tb0Var.b.toMillis(tb0Var.a));
    }
}
