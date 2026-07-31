package com.inmobi.media;

import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.ExecutorsKt;
import kotlinx.coroutines.SupervisorKt;
import okhttp3.Dispatcher;

/* loaded from: classes12.dex */
public abstract class L9 {
    public static final Dispatcher a;
    public static final Dispatcher b;
    public static final CoroutineScope c;
    public static final CoroutineScope d;
    public static final CoroutineScope e;
    public static final CoroutineScope f;

    static {
        Object value = AbstractC4437w6.b.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        a = new Dispatcher((ExecutorService) value);
        Object value2 = AbstractC4437w6.a.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        b = new Dispatcher((ExecutorService) value2);
        Object value3 = AbstractC4437w6.c.getValue();
        Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
        c = CoroutineScopeKt.CoroutineScope(ExecutorsKt.from((ExecutorService) value3).plus(SupervisorKt.SupervisorJob$default(null, 1, null)));
        Object value4 = AbstractC4437w6.d.getValue();
        Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
        d = CoroutineScopeKt.CoroutineScope(ExecutorsKt.from((ExecutorService) value4).plus(SupervisorKt.SupervisorJob$default(null, 1, null)));
        Object value5 = AbstractC4437w6.f.getValue();
        Intrinsics.checkNotNullExpressionValue(value5, "getValue(...)");
        e = CoroutineScopeKt.CoroutineScope(ExecutorsKt.from((ExecutorService) value5).plus(SupervisorKt.SupervisorJob$default(null, 1, null)));
        f = CoroutineScopeKt.CoroutineScope(ExecutorsKt.from((ExecutorC4101jc) AbstractC4437w6.e.getValue()).plus(SupervisorKt.SupervisorJob$default(null, 1, null)));
    }
}
