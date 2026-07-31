package io.ktor.utils.io.jvm.javaio;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Writing.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.utils.io.jvm.javaio.WritingKt", f = "Writing.kt", l = {25}, m = "copyTo")
/* loaded from: classes4.dex */
final class WritingKt$copyTo$1 extends ContinuationImpl {
    long J$0;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;

    WritingKt$copyTo$1(Continuation continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return WritingKt.copyTo(null, null, 0L, this);
    }
}
