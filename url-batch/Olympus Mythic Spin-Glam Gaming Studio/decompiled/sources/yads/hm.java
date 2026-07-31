package yads;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
public final class hm extends Lambda implements Function1 {
    public static final hm b = new hm();

    public hm() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        obj.getClass();
        throw new ClassCastException();
    }
}
