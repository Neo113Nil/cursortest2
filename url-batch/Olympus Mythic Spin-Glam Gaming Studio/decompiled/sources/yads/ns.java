package yads;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class ns extends Lambda implements Function1 {
    public final /* synthetic */ ts b;
    public final /* synthetic */ ps c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ns(ts tsVar, ps psVar) {
        super(1);
        this.b = tsVar;
        this.c = psVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        vd0 vd0Var = this.b.e;
        vd0Var.a.a(this.c.a, null);
        return Unit.INSTANCE;
    }
}
