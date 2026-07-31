package yads;

import kotlin.TuplesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes15.dex */
public final class l72 extends Lambda implements Function1 {
    public static final l72 b = new l72();

    public l72() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        we3 we3Var = (we3) obj;
        return TuplesKt.to(((t62) we3Var.d).a, we3Var.f);
    }
}
