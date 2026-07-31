package yads;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes10.dex */
public final class rm0 extends Lambda implements Function2 {
    public final /* synthetic */ rl2 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rm0(rl2 rl2Var) {
        super(2);
        this.b = rl2Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        this.b.a((String) obj, (String) obj2);
        return Unit.INSTANCE;
    }
}
