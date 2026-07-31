package yads;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes4.dex */
public final class pa0 extends Lambda implements Function1 {
    public static final pa0 b = new pa0();

    public pa0() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        obj.getClass();
        throw new ClassCastException();
    }
}
