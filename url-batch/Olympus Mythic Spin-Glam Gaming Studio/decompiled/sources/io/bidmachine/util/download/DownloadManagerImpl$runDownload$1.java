package io.bidmachine.util.download;

import com.vungle.ads.internal.protos.Sdk;
import io.bidmachine.util.download.DownloadManager;
import io.bidmachine.util.download.DownloadManagerImpl;
import java.io.File;
import java.util.Map;
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
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "Lkotlin/Result;", "Lio/bidmachine/util/download/DownloadManager$DownloadData;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 7, 1}, xi = 48)
@DebugMetadata(c = "io.bidmachine.util.download.DownloadManagerImpl$runDownload$1", f = "DownloadManagerImpl.kt", l = {Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE, 120}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class DownloadManagerImpl$runDownload$1 extends SuspendLambda implements Function2 {
    final /* synthetic */ DownloadManagerImpl.DownloadKey $downloadKey;
    final /* synthetic */ File $outputFile;
    final /* synthetic */ Duration $timeout;
    final /* synthetic */ String $url;
    int label;
    final /* synthetic */ DownloadManagerImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DownloadManagerImpl$runDownload$1(DownloadManagerImpl downloadManagerImpl, String str, File file, Duration duration, DownloadManagerImpl.DownloadKey downloadKey, Continuation continuation) {
        super(2, continuation);
        this.this$0 = downloadManagerImpl;
        this.$url = str;
        this.$outputFile = file;
        this.$timeout = duration;
        this.$downloadKey = downloadKey;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
        return new DownloadManagerImpl$runDownload$1(this.this$0, this.$url, this.$outputFile, this.$timeout, this.$downloadKey, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
        return ((DownloadManagerImpl$runDownload$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x005d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x004d  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(@NotNull Object obj) {
        DownloadManagerImpl.ContentFetcher contentFetcher;
        Object mo7971getWS52aQU;
        Object obj2;
        Map map;
        Object m8023constructorimpl;
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
                mo7971getWS52aQU = ((Result) obj).getValue();
                DownloadManager.DownloadData downloadData = (DownloadManager.DownloadData) (!Result.m8028isFailureimpl(mo7971getWS52aQU) ? null : mo7971getWS52aQU);
                obj2 = this.this$0.activeDownloadsLock;
                DownloadManagerImpl downloadManagerImpl2 = this.this$0;
                DownloadManagerImpl.DownloadKey downloadKey = this.$downloadKey;
                synchronized (obj2) {
                    map = downloadManagerImpl2.activeDownloads;
                }
                if (downloadData != null) {
                    m8023constructorimpl = Result.m8023constructorimpl(downloadData);
                } else {
                    m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(new Exception("Failed to download content from url (" + this.$url + ')', Result.m8026exceptionOrNullimpl(mo7971getWS52aQU))));
                }
                return Result.m8022boximpl(m8023constructorimpl);
            }
            ResultKt.throwOnFailure(obj);
        }
        contentFetcher = this.this$0.getContentFetcher();
        String str = this.$url;
        File file = this.$outputFile;
        Duration duration = this.$timeout;
        this.label = 2;
        mo7971getWS52aQU = contentFetcher.mo7971getWS52aQU(str, file, duration, this);
        if (mo7971getWS52aQU == coroutine_suspended) {
            return coroutine_suspended;
        }
        DownloadManager.DownloadData downloadData2 = (DownloadManager.DownloadData) (!Result.m8028isFailureimpl(mo7971getWS52aQU) ? null : mo7971getWS52aQU);
        obj2 = this.this$0.activeDownloadsLock;
        DownloadManagerImpl downloadManagerImpl22 = this.this$0;
        DownloadManagerImpl.DownloadKey downloadKey2 = this.$downloadKey;
        synchronized (obj2) {
        }
    }
}
