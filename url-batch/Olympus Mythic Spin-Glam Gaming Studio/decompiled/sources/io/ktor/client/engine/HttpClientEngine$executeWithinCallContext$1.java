package io.ktor.client.engine;

import io.ktor.client.engine.HttpClientEngine;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: HttpClientEngine.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.client.engine.HttpClientEngine$DefaultImpls", f = "HttpClientEngine.kt", l = {175, 184}, m = "executeWithinCallContext")
/* loaded from: classes13.dex */
final class HttpClientEngine$executeWithinCallContext$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;

    HttpClientEngine$executeWithinCallContext$1(Continuation continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object executeWithinCallContext;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        executeWithinCallContext = HttpClientEngine.DefaultImpls.executeWithinCallContext(null, null, this);
        return executeWithinCallContext;
    }
}
