package yads;

import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
public final class ov2 extends Lambda implements Function0 {
    public final /* synthetic */ ue0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ov2(ue0 ue0Var) {
        super(0);
        this.b = ue0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo4828invoke() {
        ue0 ue0Var = this.b;
        if (v0.d == null) {
            synchronized (v0.c) {
                try {
                    if (v0.d == null) {
                        v0.d = new v0();
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        v0 v0Var = v0.d;
        if (v0Var == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        Function2[] function2Arr = {null};
        xx0 xx0Var = new xx0(ue0Var.c, MapsKt.mapOf(TuplesKt.to(px0.d, new hc1(ue0Var.a, ue0Var.b, v0Var, ue0Var.c, new re0(function2Arr))), TuplesKt.to(px0.e, new zr2(ue0Var.a, ue0Var.b, v0Var, ue0Var.c, new se0(function2Arr))), TuplesKt.to(px0.f, new wg(ue0Var.a, ue0Var.b, v0Var, ue0Var.c, new te0(function2Arr)))));
        function2Arr[0] = new qe0(xx0Var);
        return xx0Var;
    }
}
