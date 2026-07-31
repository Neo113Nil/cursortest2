package io.ktor.utils.io;

import kotlin.Metadata;
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

/* compiled from: ByteReadChannelOperations.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.utils.io.ByteReadChannelOperationsKt$reader$job$1", f = "ByteReadChannelOperations.kt", l = {333, 343, 343, 343}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class ByteReadChannelOperationsKt$reader$job$1 extends SuspendLambda implements Function2 {
    final /* synthetic */ Function2 $block;
    final /* synthetic */ ByteChannel $channel;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ByteReadChannelOperationsKt$reader$job$1(Function2 function2, ByteChannel byteChannel, Continuation continuation) {
        super(2, continuation);
        this.$block = function2;
        this.$channel = byteChannel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ByteReadChannelOperationsKt$reader$job$1 byteReadChannelOperationsKt$reader$job$1 = new ByteReadChannelOperationsKt$reader$job$1(this.$block, this.$channel, continuation);
        byteReadChannelOperationsKt$reader$job$1.L$0 = obj;
        return byteReadChannelOperationsKt$reader$job$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
        return ((ByteReadChannelOperationsKt$reader$job$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [kotlinx.coroutines.Job] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v6, types: [kotlinx.coroutines.CompletableJob, kotlinx.coroutines.Job] */
    /* JADX WARN: Type inference failed for: r1v9 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineScope coroutineScope;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ?? r1 = this.label;
        try {
        } catch (Throwable th) {
            try {
                JobKt.cancel(r1, "Exception thrown while reading from channel", th);
                ByteWriteChannelOperationsKt.close(this.$channel, th);
                this.L$0 = null;
                this.L$1 = null;
                this.label = 3;
                if (r1.join(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } catch (Throwable th2) {
                this.L$0 = th2;
                this.L$1 = null;
                this.label = 4;
                if (r1.join(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                throw th2;
            }
        }
        if (r1 == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
            CompletableJob Job = JobKt.Job(JobKt.getJob(coroutineScope2.getCoroutineContext()));
            Function2 function2 = this.$block;
            ReaderScope readerScope = new ReaderScope(this.$channel, coroutineScope2.getCoroutineContext().plus(Job));
            this.L$0 = coroutineScope2;
            this.L$1 = Job;
            this.label = 1;
            if (function2.invoke(readerScope, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            coroutineScope = coroutineScope2;
            r1 = Job;
        } else {
            if (r1 != 1) {
                if (r1 == 2 || r1 == 3) {
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                if (r1 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Throwable th3 = (Throwable) this.L$0;
                ResultKt.throwOnFailure(obj);
                throw th3;
            }
            CompletableJob completableJob = (CompletableJob) this.L$1;
            coroutineScope = (CoroutineScope) this.L$0;
            ResultKt.throwOnFailure(obj);
            r1 = completableJob;
        }
        r1.complete();
        if (JobKt.getJob(coroutineScope.getCoroutineContext()).isCancelled()) {
            this.$channel.cancel(JobKt.getJob(coroutineScope.getCoroutineContext()).getCancellationException());
        }
        this.L$0 = null;
        this.L$1 = null;
        this.label = 2;
        if (r1.join(this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}
