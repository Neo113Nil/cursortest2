package io.ktor.utils.io;

import com.facebook.internal.FacebookRequestErrorClassification;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;

/* compiled from: ByteWriteChannelOperations.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.utils.io.ByteWriteChannelOperationsKt$writer$job$1", f = "ByteWriteChannelOperations.kt", l = {179, 189, FacebookRequestErrorClassification.EC_INVALID_TOKEN, 189, FacebookRequestErrorClassification.EC_INVALID_TOKEN, 189, FacebookRequestErrorClassification.EC_INVALID_TOKEN}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class ByteWriteChannelOperationsKt$writer$job$1 extends SuspendLambda implements Function2 {
    final /* synthetic */ Function2 $block;
    final /* synthetic */ ByteChannel $channel;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ByteWriteChannelOperationsKt$writer$job$1(Function2 function2, ByteChannel byteChannel, Continuation continuation) {
        super(2, continuation);
        this.$block = function2;
        this.$channel = byteChannel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ByteWriteChannelOperationsKt$writer$job$1 byteWriteChannelOperationsKt$writer$job$1 = new ByteWriteChannelOperationsKt$writer$job$1(this.$block, this.$channel, continuation);
        byteWriteChannelOperationsKt$writer$job$1.L$0 = obj;
        return byteWriteChannelOperationsKt$writer$job$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
        return ((ByteWriteChannelOperationsKt$writer$job$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00cb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009d A[Catch: all -> 0x0056, TRY_LEAVE, TryCatch #1 {all -> 0x0056, blocks: (B:43:0x0052, B:44:0x008c, B:46:0x009d, B:52:0x006d), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00bb A[RETURN] */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [kotlinx.coroutines.Job] */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v9, types: [kotlinx.coroutines.CompletableJob, kotlinx.coroutines.Job] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Throwable th;
        Throwable th2;
        CoroutineScope coroutineScope;
        ByteChannel byteChannel;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ?? r1 = this.label;
        try {
            try {
            } catch (Throwable th3) {
                try {
                    JobKt.cancel(r1, "Exception thrown while writing to channel", th3);
                    this.$channel.cancel(th3);
                    this.L$0 = coroutineScope;
                    this.L$1 = null;
                    this.label = 4;
                    if (r1.join(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    this.L$0 = coroutineScope;
                    this.L$1 = th;
                    this.label = 6;
                    if (r1.join(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            }
        } catch (Throwable th5) {
            Result.Companion companion = Result.INSTANCE;
            Result.m8023constructorimpl(ResultKt.createFailure(th5));
        }
        switch (r1) {
            case 0:
                ResultKt.throwOnFailure(obj);
                coroutineScope = (CoroutineScope) this.L$0;
                CompletableJob Job = JobKt.Job(JobKt.getJob(coroutineScope.getCoroutineContext()));
                Function2 function2 = this.$block;
                WriterScope writerScope = new WriterScope(this.$channel, coroutineScope.getCoroutineContext().plus(Job));
                this.L$0 = coroutineScope;
                this.L$1 = Job;
                this.label = 1;
                r1 = Job;
                if (function2.invoke(writerScope, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                r1.complete();
                if (JobKt.getJob(coroutineScope.getCoroutineContext()).isCancelled()) {
                    this.$channel.cancel(JobKt.getJob(coroutineScope.getCoroutineContext()).getCancellationException());
                }
                this.L$0 = coroutineScope;
                this.L$1 = null;
                this.label = 2;
                if (r1.join(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                byteChannel = this.$channel;
                Result.Companion companion2 = Result.INSTANCE;
                this.L$0 = null;
                this.label = 3;
                if (byteChannel.flushAndClose(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                Result.m8023constructorimpl(Unit.INSTANCE);
                return Unit.INSTANCE;
            case 1:
                CompletableJob completableJob = (CompletableJob) this.L$1;
                coroutineScope = (CoroutineScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                r1 = completableJob;
                r1.complete();
                if (JobKt.getJob(coroutineScope.getCoroutineContext()).isCancelled()) {
                }
                this.L$0 = coroutineScope;
                this.L$1 = null;
                this.label = 2;
                if (r1.join(this) == coroutine_suspended) {
                }
                byteChannel = this.$channel;
                Result.Companion companion22 = Result.INSTANCE;
                this.L$0 = null;
                this.label = 3;
                if (byteChannel.flushAndClose(this) == coroutine_suspended) {
                }
                Result.m8023constructorimpl(Unit.INSTANCE);
                return Unit.INSTANCE;
            case 2:
                ResultKt.throwOnFailure(obj);
                byteChannel = this.$channel;
                Result.Companion companion222 = Result.INSTANCE;
                this.L$0 = null;
                this.label = 3;
                if (byteChannel.flushAndClose(this) == coroutine_suspended) {
                }
                Result.m8023constructorimpl(Unit.INSTANCE);
                return Unit.INSTANCE;
            case 3:
                ResultKt.throwOnFailure(obj);
                Result.m8023constructorimpl(Unit.INSTANCE);
                return Unit.INSTANCE;
            case 4:
                ResultKt.throwOnFailure(obj);
                ByteChannel byteChannel2 = this.$channel;
                Result.Companion companion3 = Result.INSTANCE;
                this.L$0 = null;
                this.label = 5;
                if (byteChannel2.flushAndClose(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                Result.m8023constructorimpl(Unit.INSTANCE);
                return Unit.INSTANCE;
            case 5:
                ResultKt.throwOnFailure(obj);
                Result.m8023constructorimpl(Unit.INSTANCE);
                return Unit.INSTANCE;
            case 6:
                Throwable th6 = (Throwable) this.L$1;
                ResultKt.throwOnFailure(obj);
                th = th6;
                ByteChannel byteChannel3 = this.$channel;
                try {
                    Result.Companion companion4 = Result.INSTANCE;
                    this.L$0 = th;
                    this.L$1 = null;
                    this.label = 7;
                    if (byteChannel3.flushAndClose(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    th = th;
                    Result.m8023constructorimpl(Unit.INSTANCE);
                    throw th;
                } catch (Throwable th7) {
                    th = th;
                    th2 = th7;
                    Result.Companion companion5 = Result.INSTANCE;
                    Result.m8023constructorimpl(ResultKt.createFailure(th2));
                    throw th;
                }
            case 7:
                th = (Throwable) this.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                    Result.m8023constructorimpl(Unit.INSTANCE);
                    throw th;
                } catch (Throwable th8) {
                    th2 = th8;
                    Result.Companion companion52 = Result.INSTANCE;
                    Result.m8023constructorimpl(ResultKt.createFailure(th2));
                    throw th;
                }
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
