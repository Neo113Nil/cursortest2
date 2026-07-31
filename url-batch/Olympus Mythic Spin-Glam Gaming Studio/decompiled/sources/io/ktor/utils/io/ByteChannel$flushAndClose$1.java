package io.ktor.utils.io;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ByteChannel.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.utils.io.ByteChannel", f = "ByteChannel.kt", l = {128}, m = "flushAndClose")
/* loaded from: classes11.dex */
final class ByteChannel$flushAndClose$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ByteChannel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ByteChannel$flushAndClose$1(ByteChannel byteChannel, Continuation continuation) {
        super(continuation);
        this.this$0 = byteChannel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.flushAndClose(this);
    }
}
