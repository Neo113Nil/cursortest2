package yads;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
public final class lm1 extends Lambda implements Function1 {
    public final /* synthetic */ nm1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lm1(nm1 nm1Var) {
        super(1);
        this.b = nm1Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        fn1 fn1Var = this.b.a;
        return fn1.a((ry1) obj);
    }
}
