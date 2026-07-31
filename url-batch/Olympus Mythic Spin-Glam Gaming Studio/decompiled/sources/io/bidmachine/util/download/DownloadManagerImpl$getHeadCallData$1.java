package io.bidmachine.util.download;

import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DownloadManagerImpl.kt */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
@DebugMetadata(c = "io.bidmachine.util.download.DownloadManagerImpl", f = "DownloadManagerImpl.kt", l = {TokenParametersOuterClass$TokenParameters.ADSERVICESVERSION_FIELD_NUMBER}, m = "getHeadCallData-2Ivn440")
/* loaded from: classes11.dex */
final class DownloadManagerImpl$getHeadCallData$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DownloadManagerImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DownloadManagerImpl$getHeadCallData$1(DownloadManagerImpl downloadManagerImpl, Continuation continuation) {
        super(continuation);
        this.this$0 = downloadManagerImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object mo7961getHeadCallData2Ivn440 = this.this$0.mo7961getHeadCallData2Ivn440(null, null, this);
        return mo7961getHeadCallData2Ivn440 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? mo7961getHeadCallData2Ivn440 : Result.m8022boximpl(mo7961getHeadCallData2Ivn440);
    }
}
