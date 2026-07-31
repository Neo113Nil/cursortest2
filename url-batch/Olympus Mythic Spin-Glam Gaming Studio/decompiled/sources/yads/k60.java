package yads;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.Dispatchers;

/* loaded from: classes9.dex */
public final class k60 extends Lambda implements Function0 {
    public final /* synthetic */ r70 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k60(r70 r70Var) {
        super(0);
        this.b = r70Var;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo4828invoke() {
        return new a90((ng1) this.b.w.getValue(), (en2) this.b.x.getValue(), (cs1) this.b.h.getValue(), (q51) this.b.A.getValue(), (v51) this.b.z.getValue(), Dispatchers.getIO());
    }
}
