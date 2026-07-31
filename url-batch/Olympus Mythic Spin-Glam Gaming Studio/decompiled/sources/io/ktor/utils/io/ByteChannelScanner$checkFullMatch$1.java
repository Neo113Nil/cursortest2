package io.ktor.utils.io;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ByteChannelScanner.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.utils.io.ByteChannelScanner", f = "ByteChannelScanner.kt", l = {124, 142}, m = "checkFullMatch")
/* loaded from: classes14.dex */
final class ByteChannelScanner$checkFullMatch$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ByteChannelScanner this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ByteChannelScanner$checkFullMatch$1(ByteChannelScanner byteChannelScanner, Continuation continuation) {
        super(continuation);
        this.this$0 = byteChannelScanner;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object checkFullMatch;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        checkFullMatch = this.this$0.checkFullMatch(this);
        return checkFullMatch;
    }
}
