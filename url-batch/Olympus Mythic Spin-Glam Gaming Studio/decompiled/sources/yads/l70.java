package yads;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.json.Json;

/* loaded from: classes15.dex */
public final class l70 extends Lambda implements Function0 {
    public final /* synthetic */ r70 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l70(r70 r70Var) {
        super(0);
        this.b = r70Var;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo4828invoke() {
        return new ua1(new t43(), (Json) this.b.s.getValue(), new mm3());
    }
}
