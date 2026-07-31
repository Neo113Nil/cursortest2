package io.bidmachine.util.cache;

import java.util.List;
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
@DebugMetadata(c = "io.bidmachine.util.cache.MediaFileCacheManager", f = "MediaFileCacheManager.kt", l = {180}, m = "getMediaFile-gIAlu-s")
/* loaded from: classes8.dex */
final class MediaFileCacheManager$getMediaFile$3 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ MediaFileCacheManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MediaFileCacheManager$getMediaFile$3(MediaFileCacheManager mediaFileCacheManager, Continuation continuation) {
        super(continuation);
        this.this$0 = mediaFileCacheManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object m7945getMediaFilegIAlus = this.this$0.m7945getMediaFilegIAlus((List<String>) null, this);
        return m7945getMediaFilegIAlus == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? m7945getMediaFilegIAlus : Result.m8022boximpl(m7945getMediaFilegIAlus);
    }
}
