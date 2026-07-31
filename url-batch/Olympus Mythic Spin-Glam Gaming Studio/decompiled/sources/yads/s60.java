package yads;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
public final class s60 extends Lambda implements Function0 {
    public final /* synthetic */ r70 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s60(r70 r70Var) {
        super(0);
        this.b = r70Var;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo4828invoke() {
        return new my0((c90) this.b.C.getValue());
    }
}
