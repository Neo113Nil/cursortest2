package io.ktor.utils.io;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ByteChannel.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.utils.io.ByteChannel", f = "ByteChannel.kt", l = {284}, m = "awaitContent")
/* loaded from: classes11.dex */
final class ByteChannel$awaitContent$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ByteChannel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ByteChannel$awaitContent$1(ByteChannel byteChannel, Continuation continuation) {
        super(continuation);
        this.this$0 = byteChannel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.awaitContent(0, this);
    }
}
