package com.inmobi.media;

import java.util.concurrent.ExecutorService;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.ExecutorsKt;
import kotlinx.coroutines.SupervisorKt;

/* loaded from: classes11.dex */
public abstract class La {
    public static final Lazy a = LazyKt.lazy(new Function0() { // from class: com.inmobi.media.La$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public final Object mo4828invoke() {
            return La.a();
        }
    });

    public static final Ka a() {
        return new Ka(CoroutineScopeKt.CoroutineScope(ExecutorsKt.from((ExecutorService) K.a).plus(SupervisorKt.SupervisorJob$default(null, 1, null))));
    }
}
