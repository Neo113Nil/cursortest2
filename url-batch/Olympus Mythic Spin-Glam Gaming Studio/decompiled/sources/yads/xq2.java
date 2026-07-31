package yads;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
public final class xq2 extends Lambda implements Function0 {
    public final /* synthetic */ yj2 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xq2(yj2 yj2Var) {
        super(0);
        this.b = yj2Var;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo4828invoke() {
        return Long.valueOf(this.b.a);
    }
}
