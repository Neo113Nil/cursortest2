package yads;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.sync.MutexKt;

/* loaded from: classes13.dex */
public final class dv0 extends Lambda implements Function1 {
    public static final dv0 b = new dv0();

    public dv0() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return MutexKt.Mutex$default(false, 1, null);
    }
}
