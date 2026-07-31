package yads;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes4.dex */
public final class m72 extends Lambda implements Function1 {
    public final /* synthetic */ p72 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m72(p72 p72Var) {
        super(1);
        this.b = p72Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        fn1 fn1Var = this.b.a;
        return fn1.a((ry1) obj);
    }
}
