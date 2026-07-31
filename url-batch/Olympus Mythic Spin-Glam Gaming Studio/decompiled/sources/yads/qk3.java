package yads;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
public final class qk3 extends Lambda implements Function1 {
    public final /* synthetic */ tk3 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qk3(tk3 tk3Var) {
        super(1);
        this.b = tk3Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        this.b.a.invoke(new s90((String) obj));
        return Unit.INSTANCE;
    }
}
