package yads;

import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KProperty;

/* loaded from: classes13.dex */
public final class mr2 extends Lambda implements Function0 {
    public final /* synthetic */ or2 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mr2(or2 or2Var) {
        super(0);
        this.b = or2Var;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo4828invoke() {
        or2 or2Var = this.b;
        qm2 qm2Var = or2Var.e;
        KProperty kProperty = or2.g[1];
        bx0 bx0Var = (bx0) qm2Var.a.get();
        if (bx0Var != null) {
            or2Var.a.c(MapsKt.emptyMap());
            bx0Var.g();
        }
        return Unit.INSTANCE;
    }
}
