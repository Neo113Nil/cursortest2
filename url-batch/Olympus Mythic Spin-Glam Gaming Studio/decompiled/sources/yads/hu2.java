package yads;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
public final class hu2 extends Lambda implements Function1 {
    public final /* synthetic */ ku2 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hu2(ku2 ku2Var) {
        super(1);
        this.b = ku2Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        gu2 gu2Var = this.b.c;
        gu2Var.f.getClass();
        zo2.a(gu2Var);
        return Unit.INSTANCE;
    }
}
