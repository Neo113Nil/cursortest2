package io.bidmachine.util.download;

import io.bidmachine.util.download.DownloadManagerImpl;
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
@DebugMetadata(c = "io.bidmachine.util.download.DownloadManagerImpl$NetworkContentFetcher", f = "DownloadManagerImpl.kt", l = {258}, m = "head-2Ivn440")
/* loaded from: classes11.dex */
final class DownloadManagerImpl$NetworkContentFetcher$head$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DownloadManagerImpl.NetworkContentFetcher this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DownloadManagerImpl$NetworkContentFetcher$head$1(DownloadManagerImpl.NetworkContentFetcher networkContentFetcher, Continuation continuation) {
        super(continuation);
        this.this$0 = networkContentFetcher;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object mo7972head2Ivn440 = this.this$0.mo7972head2Ivn440(null, null, this);
        return mo7972head2Ivn440 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? mo7972head2Ivn440 : Result.m8022boximpl(mo7972head2Ivn440);
    }
}
