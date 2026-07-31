package io.ktor.utils.io.jvm.javaio;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Reading.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.utils.io.jvm.javaio.RawSourceChannel", f = "Reading.kt", l = {69}, m = "awaitContent")
/* loaded from: classes12.dex */
final class RawSourceChannel$awaitContent$1 extends ContinuationImpl {
    int I$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RawSourceChannel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RawSourceChannel$awaitContent$1(RawSourceChannel rawSourceChannel, Continuation continuation) {
        super(continuation);
        this.this$0 = rawSourceChannel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.awaitContent(0, this);
    }
}
