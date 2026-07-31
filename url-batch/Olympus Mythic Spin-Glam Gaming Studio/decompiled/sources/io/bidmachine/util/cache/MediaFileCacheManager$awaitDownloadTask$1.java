package io.bidmachine.util.cache;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: MediaFileCacheManager.kt */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
@DebugMetadata(c = "io.bidmachine.util.cache.MediaFileCacheManager", f = "MediaFileCacheManager.kt", l = {276, 286}, m = "awaitDownloadTask-0E7RQCE")
/* loaded from: classes8.dex */
final class MediaFileCacheManager$awaitDownloadTask$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ MediaFileCacheManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MediaFileCacheManager$awaitDownloadTask$1(MediaFileCacheManager mediaFileCacheManager, Continuation continuation) {
        super(continuation);
        this.this$0 = mediaFileCacheManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object m7941awaitDownloadTask0E7RQCE;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        m7941awaitDownloadTask0E7RQCE = this.this$0.m7941awaitDownloadTask0E7RQCE(null, null, this);
        return m7941awaitDownloadTask0E7RQCE == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? m7941awaitDownloadTask0E7RQCE : Result.m8022boximpl(m7941awaitDownloadTask0E7RQCE);
    }
}
