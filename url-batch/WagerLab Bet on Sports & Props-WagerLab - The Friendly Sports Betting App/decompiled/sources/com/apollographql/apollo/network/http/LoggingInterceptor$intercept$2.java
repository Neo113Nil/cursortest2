package com.apollographql.apollo.network.http;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: LoggingInterceptor.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.apollographql.apollo.network.http.LoggingInterceptor", f = "LoggingInterceptor.kt", i = {1, 1}, l = {119, 147}, m = "intercept", n = {"logHeaders", "logBody"}, s = {"I$0", "I$1"})
/* loaded from: classes3.dex */
final class LoggingInterceptor$intercept$2 extends ContinuationImpl {
    int I$0;
    int I$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ LoggingInterceptor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LoggingInterceptor$intercept$2(LoggingInterceptor loggingInterceptor, Continuation<? super LoggingInterceptor$intercept$2> continuation) {
        super(continuation);
        this.this$0 = loggingInterceptor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.intercept(null, null, this);
    }
}
