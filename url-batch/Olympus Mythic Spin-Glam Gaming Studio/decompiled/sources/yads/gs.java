package yads;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
public final class gs extends Lambda implements Function1 {
    public final /* synthetic */ ls b;
    public final /* synthetic */ is c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gs(ls lsVar, is isVar) {
        super(1);
        this.b = lsVar;
        this.c = isVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        vd0 vd0Var = this.b.e;
        vd0Var.a.a(this.c.a, null);
        return Unit.INSTANCE;
    }
}
