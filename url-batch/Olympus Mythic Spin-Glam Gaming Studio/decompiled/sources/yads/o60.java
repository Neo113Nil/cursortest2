package yads;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes13.dex */
public final class o60 extends Lambda implements Function0 {
    public final /* synthetic */ r70 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o60(r70 r70Var) {
        super(0);
        this.b = r70Var;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo4828invoke() {
        return new fy0((c90) this.b.C.getValue());
    }
}
