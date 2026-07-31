package io.bidmachine.util.cache;

import io.bidmachine.util.download.DownloadManager;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.time.Duration;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: MediaFileCacheManager.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "Lkotlin/Result;", "Lio/bidmachine/util/download/DownloadManager$CallData;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 7, 1}, xi = 48)
@DebugMetadata(c = "io.bidmachine.util.cache.MediaFileCacheManager$pickRemoteMediaFile$2$remoteMediaFileInfoList$1$1", f = "MediaFileCacheManager.kt", l = {302}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class MediaFileCacheManager$pickRemoteMediaFile$2$remoteMediaFileInfoList$1$1 extends SuspendLambda implements Function2 {
    final /* synthetic */ long $headRequestTimeout;
    final /* synthetic */ String $mediaUrl;
    int label;
    final /* synthetic */ MediaFileCacheManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MediaFileCacheManager$pickRemoteMediaFile$2$remoteMediaFileInfoList$1$1(MediaFileCacheManager mediaFileCacheManager, String str, long j, Continuation continuation) {
        super(2, continuation);
        this.this$0 = mediaFileCacheManager;
        this.$mediaUrl = str;
        this.$headRequestTimeout = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
        return new MediaFileCacheManager$pickRemoteMediaFile$2$remoteMediaFileInfoList$1$1(this.this$0, this.$mediaUrl, this.$headRequestTimeout, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
        return ((MediaFileCacheManager$pickRemoteMediaFile$2$remoteMediaFileInfoList$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        DownloadManager downloadManager;
        Object mo7961getHeadCallData2Ivn440;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            downloadManager = this.this$0.downloadManager;
            String str = this.$mediaUrl;
            Duration m8137boximpl = Duration.m8137boximpl(this.$headRequestTimeout);
            this.label = 1;
            mo7961getHeadCallData2Ivn440 = downloadManager.mo7961getHeadCallData2Ivn440(str, m8137boximpl, this);
            if (mo7961getHeadCallData2Ivn440 == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            mo7961getHeadCallData2Ivn440 = ((Result) obj).getValue();
        }
        return Result.m8022boximpl(mo7961getHeadCallData2Ivn440);
    }
}
