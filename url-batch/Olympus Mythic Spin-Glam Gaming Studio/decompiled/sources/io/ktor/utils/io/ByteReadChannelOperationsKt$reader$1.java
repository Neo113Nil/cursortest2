package io.ktor.utils.io;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.Job;

/* compiled from: ByteReadChannelOperations.kt */
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.utils.io.ByteReadChannelOperationsKt$reader$1", f = "ByteReadChannelOperations.kt", l = {353}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class ByteReadChannelOperationsKt$reader$1 extends SuspendLambda implements Function1 {
    final /* synthetic */ Job $job;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ByteReadChannelOperationsKt$reader$1(Job job, Continuation continuation) {
        super(1, continuation);
        this.$job = job;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new ByteReadChannelOperationsKt$reader$1(this.$job, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation continuation) {
        return ((ByteReadChannelOperationsKt$reader$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Job job = this.$job;
            this.label = 1;
            if (job.join(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
