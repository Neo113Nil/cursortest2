package io.ktor.http.cio;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Multipart.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.http.cio.MultipartKt", f = "Multipart.kt", l = {143}, m = "skipIfFoundReadCount")
/* loaded from: classes12.dex */
final class MultipartKt$skipIfFoundReadCount$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    MultipartKt$skipIfFoundReadCount$1(Continuation continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object skipIfFoundReadCount;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        skipIfFoundReadCount = MultipartKt.skipIfFoundReadCount(null, null, this);
        return skipIfFoundReadCount;
    }
}
