package yads;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.RangesKt;

/* loaded from: classes5.dex */
public final class zq2 {
    public final g52 a;
    public final Lambda b;
    public final oc2 c;
    public final Lambda d;
    public final Function0 e;
    public long f;

    /* JADX WARN: Multi-variable type inference failed */
    public zq2(g52 g52Var, Function0 function0, oc2 oc2Var, Function0 function02, Function0 function03) {
        this.a = g52Var;
        this.b = (Lambda) function0;
        this.c = oc2Var;
        this.d = (Lambda) function02;
        this.e = function03;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.Lambda] */
    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.Lambda] */
    public final void a() {
        long longValue = ((Number) this.b.mo4828invoke()).longValue();
        this.f = longValue;
        long coerceAtLeast = RangesKt.coerceAtLeast(longValue - ((Number) this.d.mo4828invoke()).longValue(), 0L);
        if (coerceAtLeast == 0) {
            this.a.a();
            this.e.mo4828invoke();
        } else {
            yq2 yq2Var = new yq2(this);
            this.c.a(coerceAtLeast, yq2Var);
            this.c.e = yq2Var;
        }
    }
}
