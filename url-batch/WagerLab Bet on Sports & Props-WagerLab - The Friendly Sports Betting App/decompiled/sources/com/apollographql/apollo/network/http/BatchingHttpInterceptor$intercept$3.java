package com.apollographql.apollo.network.http;

import androidx.media3.extractor.metadata.dvbsi.AppInfoTableDecoder;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.time.Duration;
import kotlin.time.TimeSource;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: BatchingHttpInterceptor.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.apollographql.apollo.network.http.BatchingHttpInterceptor$intercept$3", f = "BatchingHttpInterceptor.kt", i = {}, l = {AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID, 117}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class BatchingHttpInterceptor$intercept$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ BatchingHttpInterceptor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BatchingHttpInterceptor$intercept$3(BatchingHttpInterceptor batchingHttpInterceptor, Continuation<? super BatchingHttpInterceptor$intercept$3> continuation) {
        super(2, continuation);
        this.this$0 = batchingHttpInterceptor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BatchingHttpInterceptor$intercept$3(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BatchingHttpInterceptor$intercept$3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0057, code lost:
    
        if (r11 == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0059, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0049, code lost:
    
        if (kotlinx.coroutines.DelayKt.delay((r4 - (r6 % r8)) - 1, r10) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        long j;
        long j2;
        long j3;
        Object executePendingRequests;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            j = this.this$0.batchIntervalMillis;
            j2 = this.this$0.startMark;
            long m13740getInWholeMillisecondsimpl = Duration.m13740getInWholeMillisecondsimpl(TimeSource.Monotonic.ValueTimeMark.m13849elapsedNowUwyO8pc(j2));
            j3 = this.this$0.batchIntervalMillis;
            this.label = 1;
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
        }
        this.label = 2;
        executePendingRequests = this.this$0.executePendingRequests(true, this);
    }
}
