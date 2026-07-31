package io.bidmachine.util.download;

import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import io.bidmachine.util.download.DownloadManagerImpl;
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

/* compiled from: DownloadManagerImpl.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "Lkotlin/Result;", "Lio/bidmachine/util/download/DownloadManager$CallData;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 7, 1}, xi = 48)
@DebugMetadata(c = "io.bidmachine.util.download.DownloadManagerImpl$getHeadCallData$2", f = "DownloadManagerImpl.kt", l = {TokenParametersOuterClass$TokenParameters.PUBEXTRADATA_FIELD_NUMBER, 78}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class DownloadManagerImpl$getHeadCallData$2 extends SuspendLambda implements Function2 {
    final /* synthetic */ Duration $timeout;
    final /* synthetic */ String $url;
    int label;
    final /* synthetic */ DownloadManagerImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DownloadManagerImpl$getHeadCallData$2(DownloadManagerImpl downloadManagerImpl, String str, Duration duration, Continuation continuation) {
        super(2, continuation);
        this.this$0 = downloadManagerImpl;
        this.$url = str;
        this.$timeout = duration;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
        return new DownloadManagerImpl$getHeadCallData$2(this.this$0, this.$url, this.$timeout, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
        return ((DownloadManagerImpl$getHeadCallData$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        DownloadManagerImpl.ContentFetcher contentFetcher;
        Object mo7972head2Ivn440;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            DownloadManagerImpl downloadManagerImpl = this.this$0;
            this.label = 1;
            if (downloadManagerImpl.ensureCleanupCompleted$bidmachine_android_sdk_bd_3_7_1(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                mo7972head2Ivn440 = ((Result) obj).getValue();
                return Result.m8022boximpl(mo7972head2Ivn440);
            }
            ResultKt.throwOnFailure(obj);
        }
        contentFetcher = this.this$0.getContentFetcher();
        String str = this.$url;
        Duration duration = this.$timeout;
        this.label = 2;
        mo7972head2Ivn440 = contentFetcher.mo7972head2Ivn440(str, duration, this);
        if (mo7972head2Ivn440 == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Result.m8022boximpl(mo7972head2Ivn440);
    }
}
