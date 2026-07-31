package yads;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class se0 extends Lambda implements Function1 {
    public final /* synthetic */ Function2[] b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public se0(Function2[] function2Arr) {
        super(1);
        this.b = function2Arr;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        d8 d8Var = (d8) obj;
        Function2 function2 = this.b[0];
        if (function2 != null) {
            function2.invoke(d8Var, px0.e);
        }
        return Unit.INSTANCE;
    }
}
