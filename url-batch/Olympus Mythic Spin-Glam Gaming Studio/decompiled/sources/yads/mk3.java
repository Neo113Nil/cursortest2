package yads;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
public final class mk3 extends Lambda implements Function1 {
    public static final mk3 b = new mk3();

    public mk3() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = lk3.a[((ga0) obj).ordinal()];
        return Unit.INSTANCE;
    }
}
