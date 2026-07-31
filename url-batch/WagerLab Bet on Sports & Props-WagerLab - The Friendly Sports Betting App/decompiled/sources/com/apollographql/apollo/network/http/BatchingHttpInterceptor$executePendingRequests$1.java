package com.apollographql.apollo.network.http;

import expo.modules.notifications.service.NotificationsService;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: BatchingHttpInterceptor.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.apollographql.apollo.network.http.BatchingHttpInterceptor", f = "BatchingHttpInterceptor.kt", i = {0, 1, 1, 1}, l = {284, 182}, m = "executePendingRequests", n = {"$this$withLock_u24default$iv", "pending", NotificationsService.EXCEPTION_KEY, "responseHeader"}, s = {"L$0", "L$0", "L$1", "L$2"})
/* loaded from: classes3.dex */
final class BatchingHttpInterceptor$executePendingRequests$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ BatchingHttpInterceptor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BatchingHttpInterceptor$executePendingRequests$1(BatchingHttpInterceptor batchingHttpInterceptor, Continuation<? super BatchingHttpInterceptor$executePendingRequests$1> continuation) {
        super(continuation);
        this.this$0 = batchingHttpInterceptor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object executePendingRequests;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        executePendingRequests = this.this$0.executePendingRequests(false, this);
        return executePendingRequests;
    }
}
