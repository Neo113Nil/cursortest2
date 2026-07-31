package yads;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.Dispatchers;

/* loaded from: classes15.dex */
public final class l60 extends Lambda implements Function0 {
    public final /* synthetic */ r70 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l60(r70 r70Var) {
        super(0);
        this.b = r70Var;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo4828invoke() {
        return new c90((ng1) this.b.w.getValue(), (en2) this.b.x.getValue(), (a60) this.b.B.getValue(), Dispatchers.getIO());
    }
}
