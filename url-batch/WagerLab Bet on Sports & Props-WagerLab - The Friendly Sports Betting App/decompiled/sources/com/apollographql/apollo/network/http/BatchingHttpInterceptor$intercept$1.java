package com.apollographql.apollo.network.http;

import androidx.appcompat.app.AppCompatDelegate;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: BatchingHttpInterceptor.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.apollographql.apollo.network.http.BatchingHttpInterceptor", f = "BatchingHttpInterceptor.kt", i = {1, 1, 2, 2, 2}, l = {96, 287, AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY, 121}, m = "intercept", n = {"pendingRequest", "$this$withLock_u24default$iv", "pendingRequest", "$this$withLock_u24default$iv", "batchFull"}, s = {"L$0", "L$1", "L$0", "L$1", "I$0"})
/* loaded from: classes3.dex */
final class BatchingHttpInterceptor$intercept$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ BatchingHttpInterceptor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BatchingHttpInterceptor$intercept$1(BatchingHttpInterceptor batchingHttpInterceptor, Continuation<? super BatchingHttpInterceptor$intercept$1> continuation) {
        super(continuation);
        this.this$0 = batchingHttpInterceptor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.intercept(null, null, this);
    }
}
