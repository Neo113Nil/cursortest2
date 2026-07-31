package yads;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes13.dex */
public final class mu2 extends Lambda implements Function1 {
    public static final mu2 b = new mu2();

    public mu2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        obj.getClass();
        throw new ClassCastException();
    }
}
