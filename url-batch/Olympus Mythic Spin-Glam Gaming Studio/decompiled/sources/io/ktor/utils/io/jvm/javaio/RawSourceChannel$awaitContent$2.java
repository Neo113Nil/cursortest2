package io.ktor.utils.io.jvm.javaio;

import io.ktor.utils.io.CloseToken;
import io.ktor.utils.io.core.ByteReadPacketKt;
import java.io.EOFException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.io.Buffer;
import kotlinx.io.RawSource;

/* compiled from: Reading.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.utils.io.jvm.javaio.RawSourceChannel$awaitContent$2", f = "Reading.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class RawSourceChannel$awaitContent$2 extends SuspendLambda implements Function2 {
    final /* synthetic */ int $min;
    int label;
    final /* synthetic */ RawSourceChannel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RawSourceChannel$awaitContent$2(RawSourceChannel rawSourceChannel, int i, Continuation continuation) {
        super(2, continuation);
        this.this$0 = rawSourceChannel;
        this.$min = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RawSourceChannel$awaitContent$2(this.this$0, this.$min, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
        return ((RawSourceChannel$awaitContent$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Incorrect condition in loop: B:5:0x001e */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Buffer buffer;
        RawSource rawSource;
        RawSource rawSource2;
        Buffer buffer2;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        long j = 0;
        while (ByteReadPacketKt.getRemaining(buffer) < this.$min && j >= 0) {
            try {
                rawSource2 = this.this$0.source;
                buffer2 = this.this$0.buffer;
                j = rawSource2.readAtMostTo(buffer2, Long.MAX_VALUE);
            } catch (EOFException unused) {
                j = -1;
            }
        }
        if (j == -1) {
            rawSource = this.this$0.source;
            rawSource.close();
            this.this$0.getJob().complete();
            this.this$0.closedToken = new CloseToken(null);
        }
        return Unit.INSTANCE;
    }
}
