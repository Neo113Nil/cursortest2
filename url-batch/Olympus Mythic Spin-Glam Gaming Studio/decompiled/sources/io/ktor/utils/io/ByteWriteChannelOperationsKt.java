package io.ktor.utils.io;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.intrinsics.CancellableKt;

/* compiled from: ByteWriteChannelOperations.kt */
/* loaded from: classes12.dex */
public abstract class ByteWriteChannelOperationsKt {
    private static final ByteWriteChannelOperationsKt$NO_CALLBACK$1 NO_CALLBACK = new Continuation() { // from class: io.ktor.utils.io.ByteWriteChannelOperationsKt$NO_CALLBACK$1
        private final CoroutineContext context = EmptyCoroutineContext.INSTANCE;

        @Override // kotlin.coroutines.Continuation
        public void resumeWith(Object obj) {
        }

        @Override // kotlin.coroutines.Continuation
        public CoroutineContext getContext() {
            return this.context;
        }
    };

    public static final Object writeByte(ByteWriteChannel byteWriteChannel, byte b, Continuation continuation) {
        byteWriteChannel.getWriteBuffer().writeByte(b);
        Object flushIfNeeded = ByteWriteChannelKt.flushIfNeeded(byteWriteChannel, continuation);
        return flushIfNeeded == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? flushIfNeeded : Unit.INSTANCE;
    }

    public static final void close(ByteWriteChannel byteWriteChannel, Throwable th) {
        Intrinsics.checkNotNullParameter(byteWriteChannel, "<this>");
        if (th == null) {
            fireAndForget(new ByteWriteChannelOperationsKt$close$1(byteWriteChannel));
        } else {
            byteWriteChannel.cancel(th);
        }
    }

    public static final DisposableHandle invokeOnCompletion(ChannelJob channelJob, Function1 block) {
        Intrinsics.checkNotNullParameter(channelJob, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        return channelJob.getJob().invokeOnCompletion(block);
    }

    public static /* synthetic */ WriterJob writer$default(CoroutineScope coroutineScope, CoroutineContext coroutineContext, boolean z, Function2 function2, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        return writer(coroutineScope, coroutineContext, z, function2);
    }

    public static final WriterJob writer(CoroutineScope coroutineScope, CoroutineContext coroutineContext, boolean z, Function2 block) {
        Intrinsics.checkNotNullParameter(coroutineScope, "<this>");
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        Intrinsics.checkNotNullParameter(block, "block");
        return writer(coroutineScope, coroutineContext, new ByteChannel(false, 1, null), block);
    }

    public static final WriterJob writer(CoroutineScope coroutineScope, CoroutineContext coroutineContext, final ByteChannel channel, Function2 block) {
        Job launch$default;
        Intrinsics.checkNotNullParameter(coroutineScope, "<this>");
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        Intrinsics.checkNotNullParameter(channel, "channel");
        Intrinsics.checkNotNullParameter(block, "block");
        launch$default = BuildersKt__Builders_commonKt.launch$default(coroutineScope, coroutineContext, null, new ByteWriteChannelOperationsKt$writer$job$1(block, channel, null), 2, null);
        launch$default.invokeOnCompletion(new Function1() { // from class: io.ktor.utils.io.ByteWriteChannelOperationsKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit writer$lambda$2$lambda$1;
                writer$lambda$2$lambda$1 = ByteWriteChannelOperationsKt.writer$lambda$2$lambda$1(ByteChannel.this, (Throwable) obj);
                return writer$lambda$2$lambda$1;
            }
        });
        return new WriterJob(channel, launch$default);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit writer$lambda$2$lambda$1(ByteChannel byteChannel, Throwable th) {
        if (th != null && !byteChannel.isClosedForWrite()) {
            byteChannel.cancel(th);
        }
        return Unit.INSTANCE;
    }

    public static final void fireAndForget(Function1 function1) {
        Intrinsics.checkNotNullParameter(function1, "<this>");
        CancellableKt.startCoroutineCancellable(function1, NO_CALLBACK);
    }
}
