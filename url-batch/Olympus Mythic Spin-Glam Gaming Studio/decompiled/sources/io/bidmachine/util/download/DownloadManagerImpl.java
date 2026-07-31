package io.bidmachine.util.download;

import android.content.Context;
import androidx.annotation.VisibleForTesting;
import io.bidmachine.util.SdkDispatchers;
import io.bidmachine.util.download.DownloadManager;
import io.bidmachine.util.download.DownloadManagerImpl;
import io.bidmachine.util.log.EmptyLoggerInstance;
import io.bidmachine.util.log.LoggerInstance;
import io.bidmachine.util.network.FileResponseProcessor;
import io.bidmachine.util.network.HeadersResponseProcessor;
import io.bidmachine.util.network.Method;
import io.bidmachine.util.network.NetworkError;
import io.bidmachine.util.network.NetworkRequest;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.SupervisorKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DownloadManagerImpl.kt */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\n\u0018\u0000 F2\u00020\u0001:\u0005FGHIJBM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012 \b\u0002\u0010\t\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012JC\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\u000f2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00042\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\u001f\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001f\u0010 J\u0013\u0010#\u001a\u00020\u0010H\u0081@ø\u0001\u0001¢\u0006\u0004\b!\u0010\"J1\u0010'\u001a\b\u0012\u0004\u0012\u00020$0\u001a2\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0096@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b%\u0010&J!\u0010)\u001a\u0004\u0018\u00010(2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0004H\u0016¢\u0006\u0004\b)\u0010*J/\u0010-\u001a\u00020(2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00042\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b+\u0010,R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010.R,\u0010\t\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010/R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00100R\u0014\u0010\f\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u00101R\u0014\u00102\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u001b\u00109\u001a\u0002048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u001b\u0010=\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b:\u00106\u001a\u0004\b;\u0010<R\u0014\u0010?\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R \u0010B\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020(0A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u001a\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010E\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006K"}, d2 = {"Lio/bidmachine/util/download/DownloadManagerImpl;", "Lio/bidmachine/util/download/DownloadManager;", "Landroid/content/Context;", "context", "Ljava/io/File;", "tempDir", "Lkotlin/Function3;", "Lio/bidmachine/util/log/LoggerInstance;", "Lio/bidmachine/util/download/DownloadManagerImpl$ContentFetcher;", "contentFetcherBuilder", "Lio/bidmachine/util/SdkDispatchers;", "dispatchers", "logger", "<init>", "(Landroid/content/Context;Ljava/io/File;Lkotlin/jvm/functions/Function3;Lio/bidmachine/util/SdkDispatchers;Lio/bidmachine/util/log/LoggerInstance;)V", "Lkotlinx/coroutines/Deferred;", "", "cleanupNotCompletedDownloads", "()Lkotlinx/coroutines/Deferred;", "Lio/bidmachine/util/download/DownloadManagerImpl$DownloadKey;", "downloadKey", "", "url", "outputFile", "Lkotlin/time/Duration;", "timeout", "Lkotlin/Result;", "Lio/bidmachine/util/download/DownloadManager$DownloadData;", "runDownload-Q2Q30fc", "(Lio/bidmachine/util/download/DownloadManagerImpl$DownloadKey;Ljava/lang/String;Ljava/io/File;Lkotlin/time/Duration;)Lkotlinx/coroutines/Deferred;", "runDownload", "createDownloadKey", "(Ljava/lang/String;Ljava/io/File;)Lio/bidmachine/util/download/DownloadManagerImpl$DownloadKey;", "ensureCleanupCompleted$bidmachine_android_sdk_bd_3_7_1", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ensureCleanupCompleted", "Lio/bidmachine/util/download/DownloadManager$CallData;", "getHeadCallData-2Ivn440", "(Ljava/lang/String;Lkotlin/time/Duration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHeadCallData", "Lio/bidmachine/util/download/DownloadManager$DownloadTask;", "getActiveDownloadTask", "(Ljava/lang/String;Ljava/io/File;)Lio/bidmachine/util/download/DownloadManager$DownloadTask;", "download-moChb0s", "(Ljava/lang/String;Ljava/io/File;Lkotlin/time/Duration;)Lio/bidmachine/util/download/DownloadManager$DownloadTask;", "download", "Ljava/io/File;", "Lkotlin/jvm/functions/Function3;", "Lio/bidmachine/util/SdkDispatchers;", "Lio/bidmachine/util/log/LoggerInstance;", "applicationContext", "Landroid/content/Context;", "Lkotlinx/coroutines/CoroutineScope;", "scope$delegate", "Lkotlin/Lazy;", "getScope", "()Lkotlinx/coroutines/CoroutineScope;", "scope", "contentFetcher$delegate", "getContentFetcher", "()Lio/bidmachine/util/download/DownloadManagerImpl$ContentFetcher;", "contentFetcher", "", "activeDownloadsLock", "Ljava/lang/Object;", "", "activeDownloads", "Ljava/util/Map;", "cleanupDeferred", "Lkotlinx/coroutines/Deferred;", "Companion", "ContentFetcher", "CoroutineNetworkRequestListener", "DownloadKey", "NetworkContentFetcher", "bidmachine-android-sdk_bd_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes11.dex */
public final class DownloadManagerImpl implements DownloadManager {

    @NotNull
    private static final String TAG = "DownloadManager";

    @NotNull
    private final Map<DownloadKey, DownloadManager.DownloadTask> activeDownloads;

    @NotNull
    private final Object activeDownloadsLock;

    @NotNull
    private final Context applicationContext;

    @NotNull
    private final Deferred cleanupDeferred;

    /* renamed from: contentFetcher$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy contentFetcher;

    @NotNull
    private final Function3 contentFetcherBuilder;

    @NotNull
    private final SdkDispatchers dispatchers;

    @NotNull
    private final LoggerInstance logger;

    /* renamed from: scope$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy scope;

    @NotNull
    private final File tempDir;

    /* compiled from: DownloadManagerImpl.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J;\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH¦@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fJ1\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00032\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\nH¦@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010ø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u0006\u0011À\u0006\u0001"}, d2 = {"Lio/bidmachine/util/download/DownloadManagerImpl$ContentFetcher;", "", "get", "Lkotlin/Result;", "Lio/bidmachine/util/download/DownloadManager$DownloadData;", "url", "", "outputFile", "Ljava/io/File;", "timeout", "Lkotlin/time/Duration;", "get-WS52aQU", "(Ljava/lang/String;Ljava/io/File;Lkotlin/time/Duration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "head", "Lio/bidmachine/util/download/DownloadManager$CallData;", "head-2Ivn440", "(Ljava/lang/String;Lkotlin/time/Duration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "bidmachine-android-sdk_bd_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public interface ContentFetcher {
        @Nullable
        /* renamed from: get-WS52aQU, reason: not valid java name */
        Object mo7971getWS52aQU(@NotNull String str, @NotNull File file, @Nullable Duration duration, @NotNull Continuation continuation);

        @Nullable
        /* renamed from: head-2Ivn440, reason: not valid java name */
        Object mo7972head2Ivn440(@NotNull String str, @Nullable Duration duration, @NotNull Continuation continuation);
    }

    public DownloadManagerImpl(@NotNull Context context, @NotNull File tempDir, @NotNull Function3 contentFetcherBuilder, @NotNull SdkDispatchers dispatchers, @NotNull LoggerInstance logger) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(tempDir, "tempDir");
        Intrinsics.checkNotNullParameter(contentFetcherBuilder, "contentFetcherBuilder");
        Intrinsics.checkNotNullParameter(dispatchers, "dispatchers");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.tempDir = tempDir;
        this.contentFetcherBuilder = contentFetcherBuilder;
        this.dispatchers = dispatchers;
        this.logger = logger;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
        this.applicationContext = applicationContext;
        this.scope = LazyKt.lazy(new Function0() { // from class: io.bidmachine.util.download.DownloadManagerImpl$scope$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* renamed from: invoke */
            public final CoroutineScope mo4828invoke() {
                SdkDispatchers sdkDispatchers;
                CompletableJob SupervisorJob$default = SupervisorKt.SupervisorJob$default(null, 1, null);
                sdkDispatchers = DownloadManagerImpl.this.dispatchers;
                return CoroutineScopeKt.CoroutineScope(SupervisorJob$default.plus(sdkDispatchers.getIo()));
            }
        });
        this.contentFetcher = LazyKt.lazy(new Function0() { // from class: io.bidmachine.util.download.DownloadManagerImpl$contentFetcher$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* renamed from: invoke */
            public final DownloadManagerImpl.ContentFetcher mo4828invoke() {
                Function3 function3;
                Context context2;
                File file;
                LoggerInstance loggerInstance;
                function3 = DownloadManagerImpl.this.contentFetcherBuilder;
                context2 = DownloadManagerImpl.this.applicationContext;
                file = DownloadManagerImpl.this.tempDir;
                loggerInstance = DownloadManagerImpl.this.logger;
                return (DownloadManagerImpl.ContentFetcher) function3.invoke(context2, file, loggerInstance);
            }
        });
        this.activeDownloadsLock = new Object();
        this.activeDownloads = new LinkedHashMap();
        this.cleanupDeferred = cleanupNotCompletedDownloads();
    }

    public /* synthetic */ DownloadManagerImpl(Context context, File file, Function3 function3, SdkDispatchers sdkDispatchers, LoggerInstance loggerInstance, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, file, (i & 4) != 0 ? new Function3() { // from class: io.bidmachine.util.download.DownloadManagerImpl.1
            @Override // kotlin.jvm.functions.Function3
            @NotNull
            public final NetworkContentFetcher invoke(@NotNull Context context2, @NotNull File tempDownloadDir, @NotNull LoggerInstance logger) {
                Intrinsics.checkNotNullParameter(context2, "context");
                Intrinsics.checkNotNullParameter(tempDownloadDir, "tempDownloadDir");
                Intrinsics.checkNotNullParameter(logger, "logger");
                return new NetworkContentFetcher(context2, tempDownloadDir, logger);
            }
        } : function3, (i & 8) != 0 ? SdkDispatchers.INSTANCE.getDefault() : sdkDispatchers, (i & 16) != 0 ? EmptyLoggerInstance.INSTANCE.getINSTANCE() : loggerInstance);
    }

    private final CoroutineScope getScope() {
        return (CoroutineScope) this.scope.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ContentFetcher getContentFetcher() {
        return (ContentFetcher) this.contentFetcher.getValue();
    }

    private final Deferred cleanupNotCompletedDownloads() {
        Deferred async$default;
        async$default = BuildersKt__Builders_commonKt.async$default(getScope(), this.dispatchers.getIo(), null, new DownloadManagerImpl$cleanupNotCompletedDownloads$1(this, null), 2, null);
        return async$default;
    }

    @VisibleForTesting
    @Nullable
    public final Object ensureCleanupCompleted$bidmachine_android_sdk_bd_3_7_1(@NotNull Continuation continuation) {
        Object await = this.cleanupDeferred.await(continuation);
        return await == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? await : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // io.bidmachine.util.download.DownloadManager
    @Nullable
    /* renamed from: getHeadCallData-2Ivn440 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo7961getHeadCallData2Ivn440(@NotNull String str, @Nullable Duration duration, @NotNull Continuation continuation) {
        DownloadManagerImpl$getHeadCallData$1 downloadManagerImpl$getHeadCallData$1;
        int i;
        if (continuation instanceof DownloadManagerImpl$getHeadCallData$1) {
            downloadManagerImpl$getHeadCallData$1 = (DownloadManagerImpl$getHeadCallData$1) continuation;
            int i2 = downloadManagerImpl$getHeadCallData$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                downloadManagerImpl$getHeadCallData$1.label = i2 - Integer.MIN_VALUE;
                Object obj = downloadManagerImpl$getHeadCallData$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = downloadManagerImpl$getHeadCallData$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    CoroutineDispatcher io2 = this.dispatchers.getIo();
                    DownloadManagerImpl$getHeadCallData$2 downloadManagerImpl$getHeadCallData$2 = new DownloadManagerImpl$getHeadCallData$2(this, str, duration, null);
                    downloadManagerImpl$getHeadCallData$1.label = 1;
                    obj = BuildersKt.withContext(io2, downloadManagerImpl$getHeadCallData$2, downloadManagerImpl$getHeadCallData$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return ((Result) obj).getValue();
            }
        }
        downloadManagerImpl$getHeadCallData$1 = new DownloadManagerImpl$getHeadCallData$1(this, continuation);
        Object obj2 = downloadManagerImpl$getHeadCallData$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = downloadManagerImpl$getHeadCallData$1.label;
        if (i != 0) {
        }
        return ((Result) obj2).getValue();
    }

    @Override // io.bidmachine.util.download.DownloadManager
    @Nullable
    public DownloadManager.DownloadTask getActiveDownloadTask(@NotNull String url, @NotNull File outputFile) {
        DownloadManager.DownloadTask downloadTask;
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(outputFile, "outputFile");
        synchronized (this.activeDownloadsLock) {
            downloadTask = this.activeDownloads.get(createDownloadKey(url, outputFile));
        }
        return downloadTask;
    }

    @Override // io.bidmachine.util.download.DownloadManager
    @NotNull
    /* renamed from: download-moChb0s */
    public DownloadManager.DownloadTask mo7960downloadmoChb0s(@NotNull final String url, @NotNull File outputFile, @Nullable Duration timeout) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(outputFile, "outputFile");
        synchronized (this.activeDownloadsLock) {
            DownloadKey createDownloadKey = createDownloadKey(url, outputFile);
            DownloadManager.DownloadTask downloadTask = this.activeDownloads.get(createDownloadKey);
            if (downloadTask != null) {
                this.logger.d(TAG, new Function0() { // from class: io.bidmachine.util.download.DownloadManagerImpl$download$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    /* renamed from: invoke */
                    public final String mo4828invoke() {
                        return "Active download detected: " + url;
                    }
                });
                return downloadTask;
            }
            DownloadManager.DownloadTask downloadTask2 = new DownloadManager.DownloadTask(url, m7970runDownloadQ2Q30fc(createDownloadKey, url, outputFile, timeout));
            this.activeDownloads.put(createDownloadKey, downloadTask2);
            return downloadTask2;
        }
    }

    /* renamed from: runDownload-Q2Q30fc, reason: not valid java name */
    private final Deferred m7970runDownloadQ2Q30fc(DownloadKey downloadKey, String url, File outputFile, Duration timeout) {
        Deferred async$default;
        async$default = BuildersKt__Builders_commonKt.async$default(getScope(), null, null, new DownloadManagerImpl$runDownload$1(this, url, outputFile, timeout, downloadKey, null), 3, null);
        return async$default;
    }

    private final DownloadKey createDownloadKey(String url, File outputFile) {
        String path = outputFile.getPath();
        Intrinsics.checkNotNullExpressionValue(path, "outputFile.path");
        return new DownloadKey(url, path);
    }

    /* compiled from: DownloadManagerImpl.kt */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ;\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013J1\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u000b2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u000e\u0010\t\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"Lio/bidmachine/util/download/DownloadManagerImpl$NetworkContentFetcher;", "Lio/bidmachine/util/download/DownloadManagerImpl$ContentFetcher;", "context", "Landroid/content/Context;", "tempDownloadDir", "Ljava/io/File;", "logger", "Lio/bidmachine/util/log/LoggerInstance;", "(Landroid/content/Context;Ljava/io/File;Lio/bidmachine/util/log/LoggerInstance;)V", "applicationContext", "get", "Lkotlin/Result;", "Lio/bidmachine/util/download/DownloadManager$DownloadData;", "url", "", "outputFile", "timeout", "Lkotlin/time/Duration;", "get-WS52aQU", "(Ljava/lang/String;Ljava/io/File;Lkotlin/time/Duration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "head", "Lio/bidmachine/util/download/DownloadManager$CallData;", "head-2Ivn440", "(Ljava/lang/String;Lkotlin/time/Duration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "bidmachine-android-sdk_bd_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class NetworkContentFetcher implements ContentFetcher {

        @NotNull
        private final Context applicationContext;

        @NotNull
        private final LoggerInstance logger;

        @NotNull
        private final File tempDownloadDir;

        public NetworkContentFetcher(@NotNull Context context, @NotNull File tempDownloadDir, @NotNull LoggerInstance logger) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(tempDownloadDir, "tempDownloadDir");
            Intrinsics.checkNotNullParameter(logger, "logger");
            this.tempDownloadDir = tempDownloadDir;
            this.logger = logger;
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
            this.applicationContext = applicationContext;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0042  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
        @Override // io.bidmachine.util.download.DownloadManagerImpl.ContentFetcher
        @Nullable
        /* renamed from: get-WS52aQU */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object mo7971getWS52aQU(@NotNull final String str, @NotNull File file, @Nullable Duration duration, @NotNull Continuation continuation) {
            DownloadManagerImpl$NetworkContentFetcher$get$1 downloadManagerImpl$NetworkContentFetcher$get$1;
            int i;
            if (continuation instanceof DownloadManagerImpl$NetworkContentFetcher$get$1) {
                downloadManagerImpl$NetworkContentFetcher$get$1 = (DownloadManagerImpl$NetworkContentFetcher$get$1) continuation;
                int i2 = downloadManagerImpl$NetworkContentFetcher$get$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    downloadManagerImpl$NetworkContentFetcher$get$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = downloadManagerImpl$NetworkContentFetcher$get$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = downloadManagerImpl$NetworkContentFetcher$get$1.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        downloadManagerImpl$NetworkContentFetcher$get$1.L$0 = this;
                        downloadManagerImpl$NetworkContentFetcher$get$1.L$1 = str;
                        downloadManagerImpl$NetworkContentFetcher$get$1.L$2 = file;
                        downloadManagerImpl$NetworkContentFetcher$get$1.L$3 = duration;
                        downloadManagerImpl$NetworkContentFetcher$get$1.label = 1;
                        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(downloadManagerImpl$NetworkContentFetcher$get$1), 1);
                        cancellableContinuationImpl.initCancellability();
                        CoroutineNetworkRequestListener coroutineNetworkRequestListener = new CoroutineNetworkRequestListener(cancellableContinuationImpl, new Function2() { // from class: io.bidmachine.util.download.DownloadManagerImpl$NetworkContentFetcher$get$2$listener$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                                return Result.m8022boximpl(m7973invokegIAlus((NetworkRequest) obj2, (File) obj3));
                            }

                            @NotNull
                            /* renamed from: invoke-gIAlu-s, reason: not valid java name */
                            public final Object m7973invokegIAlus(@Nullable NetworkRequest<File> networkRequest, @Nullable File file2) {
                                LoggerInstance loggerInstance = DownloadManagerImpl.NetworkContentFetcher.this.logger;
                                final String str2 = str;
                                loggerInstance.d("DownloadManager", new Function0() { // from class: io.bidmachine.util.download.DownloadManagerImpl$NetworkContentFetcher$get$2$listener$1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    @NotNull
                                    /* renamed from: invoke */
                                    public final String mo4828invoke() {
                                        return "Download success: " + str2;
                                    }
                                });
                                Duration executionTime = networkRequest != null ? networkRequest.getExecutionTime() : null;
                                if (file2 != null && executionTime != null) {
                                    Result.Companion companion = Result.INSTANCE;
                                    return Result.m8023constructorimpl(new DownloadManager.DownloadData(executionTime.m8173unboximpl(), file2, null));
                                }
                                return Result.m8023constructorimpl(null);
                            }
                        }, new Function2() { // from class: io.bidmachine.util.download.DownloadManagerImpl$NetworkContentFetcher$get$2$listener$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                                return Result.m8022boximpl(m7974invokegIAlus((NetworkRequest) obj2, (NetworkError) obj3));
                            }

                            @NotNull
                            /* renamed from: invoke-gIAlu-s, reason: not valid java name */
                            public final Object m7974invokegIAlus(@Nullable NetworkRequest<File> networkRequest, @NotNull final NetworkError networkError) {
                                Intrinsics.checkNotNullParameter(networkError, "networkError");
                                LoggerInstance loggerInstance = DownloadManagerImpl.NetworkContentFetcher.this.logger;
                                final String str2 = str;
                                loggerInstance.w("DownloadManager", new Function0() { // from class: io.bidmachine.util.download.DownloadManagerImpl$NetworkContentFetcher$get$2$listener$2.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    @NotNull
                                    /* renamed from: invoke */
                                    public final String mo4828invoke() {
                                        return "Download failed (" + NetworkError.this.getThrowable().getMessage() + "): " + str2;
                                    }
                                });
                                Result.Companion companion = Result.INSTANCE;
                                return Result.m8023constructorimpl(ResultKt.createFailure(networkError.getThrowable()));
                            }
                        });
                        NetworkRequest build = new NetworkRequest.Builder(str, Method.Get).setResponseProcessor(new FileResponseProcessor(this.applicationContext, file, this.tempDownloadDir)).setListener(coroutineNetworkRequestListener).setTimeoutMs(duration != null ? Boxing.boxLong(Duration.m8147getInWholeMillisecondsimpl(duration.m8173unboximpl())) : null).build();
                        coroutineNetworkRequestListener.setRequest(build);
                        this.logger.d(DownloadManagerImpl.TAG, new Function0() { // from class: io.bidmachine.util.download.DownloadManagerImpl$NetworkContentFetcher$get$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            @NotNull
                            /* renamed from: invoke */
                            public final String mo4828invoke() {
                                return "Starting download " + str;
                            }
                        });
                        NetworkRequest.send$default(build, null, 1, null);
                        obj = cancellableContinuationImpl.getResult();
                        if (obj == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            DebugProbesKt.probeCoroutineSuspended(downloadManagerImpl$NetworkContentFetcher$get$1);
                        }
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return ((Result) obj).getValue();
                }
            }
            downloadManagerImpl$NetworkContentFetcher$get$1 = new DownloadManagerImpl$NetworkContentFetcher$get$1(this, continuation);
            Object obj2 = downloadManagerImpl$NetworkContentFetcher$get$1.result;
            Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i = downloadManagerImpl$NetworkContentFetcher$get$1.label;
            if (i != 0) {
            }
            return ((Result) obj2).getValue();
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
        @Override // io.bidmachine.util.download.DownloadManagerImpl.ContentFetcher
        @Nullable
        /* renamed from: head-2Ivn440 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object mo7972head2Ivn440(@NotNull String str, @Nullable Duration duration, @NotNull Continuation continuation) {
            DownloadManagerImpl$NetworkContentFetcher$head$1 downloadManagerImpl$NetworkContentFetcher$head$1;
            int i;
            if (continuation instanceof DownloadManagerImpl$NetworkContentFetcher$head$1) {
                downloadManagerImpl$NetworkContentFetcher$head$1 = (DownloadManagerImpl$NetworkContentFetcher$head$1) continuation;
                int i2 = downloadManagerImpl$NetworkContentFetcher$head$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    downloadManagerImpl$NetworkContentFetcher$head$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = downloadManagerImpl$NetworkContentFetcher$head$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = downloadManagerImpl$NetworkContentFetcher$head$1.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        downloadManagerImpl$NetworkContentFetcher$head$1.L$0 = str;
                        downloadManagerImpl$NetworkContentFetcher$head$1.L$1 = duration;
                        downloadManagerImpl$NetworkContentFetcher$head$1.label = 1;
                        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(downloadManagerImpl$NetworkContentFetcher$head$1), 1);
                        cancellableContinuationImpl.initCancellability();
                        CoroutineNetworkRequestListener coroutineNetworkRequestListener = new CoroutineNetworkRequestListener(cancellableContinuationImpl, new Function2() { // from class: io.bidmachine.util.download.DownloadManagerImpl$NetworkContentFetcher$head$2$listener$1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                                return Result.m8022boximpl(m7975invokegIAlus((NetworkRequest) obj2, (Map) obj3));
                            }

                            @NotNull
                            /* renamed from: invoke-gIAlu-s, reason: not valid java name */
                            public final Object m7975invokegIAlus(@Nullable NetworkRequest<Map<String, List<String>>> networkRequest, @Nullable Map<String, ? extends List<String>> map) {
                                long duration2;
                                Duration executionTime;
                                Result.Companion companion = Result.INSTANCE;
                                if (networkRequest == null || (executionTime = networkRequest.getExecutionTime()) == null) {
                                    Duration.Companion companion2 = Duration.Companion;
                                    duration2 = DurationKt.toDuration(0, DurationUnit.MILLISECONDS);
                                } else {
                                    duration2 = executionTime.m8173unboximpl();
                                }
                                if (map == null) {
                                    map = MapsKt.emptyMap();
                                }
                                return Result.m8023constructorimpl(new DownloadManager.CallData(duration2, map, null));
                            }
                        }, new Function2() { // from class: io.bidmachine.util.download.DownloadManagerImpl$NetworkContentFetcher$head$2$listener$2
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                                return Result.m8022boximpl(m7976invokegIAlus((NetworkRequest) obj2, (NetworkError) obj3));
                            }

                            @NotNull
                            /* renamed from: invoke-gIAlu-s, reason: not valid java name */
                            public final Object m7976invokegIAlus(@Nullable NetworkRequest<Map<String, List<String>>> networkRequest, @NotNull NetworkError networkError) {
                                Intrinsics.checkNotNullParameter(networkError, "networkError");
                                Result.Companion companion = Result.INSTANCE;
                                return Result.m8023constructorimpl(ResultKt.createFailure(networkError.getThrowable()));
                            }
                        });
                        NetworkRequest build = new NetworkRequest.Builder(str, Method.Head).setResponseProcessor(new HeadersResponseProcessor()).setListener(coroutineNetworkRequestListener).setTimeoutMs(duration != null ? Boxing.boxLong(Duration.m8147getInWholeMillisecondsimpl(duration.m8173unboximpl())) : null).build();
                        coroutineNetworkRequestListener.setRequest(build);
                        NetworkRequest.send$default(build, null, 1, null);
                        obj = cancellableContinuationImpl.getResult();
                        if (obj == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            DebugProbesKt.probeCoroutineSuspended(downloadManagerImpl$NetworkContentFetcher$head$1);
                        }
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return ((Result) obj).getValue();
                }
            }
            downloadManagerImpl$NetworkContentFetcher$head$1 = new DownloadManagerImpl$NetworkContentFetcher$head$1(this, continuation);
            Object obj2 = downloadManagerImpl$NetworkContentFetcher$head$1.result;
            Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i = downloadManagerImpl$NetworkContentFetcher$head$1.label;
            if (i != 0) {
            }
            return ((Result) obj2).getValue();
        }
    }

    /* compiled from: DownloadManagerImpl.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B[\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\"\u0010\b\u001a\u001e\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00028\u00010\u0006\u0012 \u0010\n\u001a\u001c\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0007\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00028\u00010\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014R0\u0010\b\u001a\u001e\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00028\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0015R.\u0010\n\u001a\u001c\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0007\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00028\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0015R*\u0010\u0016\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lio/bidmachine/util/download/DownloadManagerImpl$CoroutineNetworkRequestListener;", "T", "R", "Lio/bidmachine/util/network/NetworkRequest$Listener;", "Lkotlinx/coroutines/CancellableContinuation;", "continuation", "Lkotlin/Function2;", "Lio/bidmachine/util/network/NetworkRequest;", "successBuilder", "Lio/bidmachine/util/network/NetworkError;", "errorBuilder", "<init>", "(Lkotlinx/coroutines/CancellableContinuation;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)V", "response", "", "onSuccess", "(Ljava/lang/Object;)V", "networkError", "onError", "(Lio/bidmachine/util/network/NetworkError;)V", "Lkotlinx/coroutines/CancellableContinuation;", "Lkotlin/jvm/functions/Function2;", "request", "Lio/bidmachine/util/network/NetworkRequest;", "getRequest", "()Lio/bidmachine/util/network/NetworkRequest;", "setRequest", "(Lio/bidmachine/util/network/NetworkRequest;)V", "bidmachine-android-sdk_bd_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
    private static final class CoroutineNetworkRequestListener<T, R> implements NetworkRequest.Listener<T> {

        @NotNull
        private final CancellableContinuation continuation;

        @NotNull
        private final Function2 errorBuilder;

        @Nullable
        private NetworkRequest<T> request;

        @NotNull
        private final Function2 successBuilder;

        public CoroutineNetworkRequestListener(@NotNull CancellableContinuation continuation, @NotNull Function2 successBuilder, @NotNull Function2 errorBuilder) {
            Intrinsics.checkNotNullParameter(continuation, "continuation");
            Intrinsics.checkNotNullParameter(successBuilder, "successBuilder");
            Intrinsics.checkNotNullParameter(errorBuilder, "errorBuilder");
            this.continuation = continuation;
            this.successBuilder = successBuilder;
            this.errorBuilder = errorBuilder;
        }

        @Nullable
        public final NetworkRequest<T> getRequest() {
            return this.request;
        }

        public final void setRequest(@Nullable NetworkRequest<T> networkRequest) {
            this.request = networkRequest;
        }

        @Override // io.bidmachine.util.network.NetworkRequest.Listener
        public void onSuccess(@Nullable T response) {
            if (this.continuation.isActive()) {
                CancellableContinuation cancellableContinuation = this.continuation;
                Result.Companion companion = Result.INSTANCE;
                cancellableContinuation.resumeWith(Result.m8023constructorimpl(this.successBuilder.invoke(this.request, response)));
            }
        }

        @Override // io.bidmachine.util.network.NetworkRequest.Listener
        public void onError(@NotNull NetworkError networkError) {
            Intrinsics.checkNotNullParameter(networkError, "networkError");
            if (this.continuation.isActive()) {
                CancellableContinuation cancellableContinuation = this.continuation;
                Result.Companion companion = Result.INSTANCE;
                cancellableContinuation.resumeWith(Result.m8023constructorimpl(this.errorBuilder.invoke(this.request, networkError)));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DownloadManagerImpl.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lio/bidmachine/util/download/DownloadManagerImpl$DownloadKey;", "", "url", "", "outputFilePath", "(Ljava/lang/String;Ljava/lang/String;)V", "getOutputFilePath", "()Ljava/lang/String;", "getUrl", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "bidmachine-android-sdk_bd_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
    static final /* data */ class DownloadKey {

        @NotNull
        private final String outputFilePath;

        @NotNull
        private final String url;

        public static /* synthetic */ DownloadKey copy$default(DownloadKey downloadKey, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = downloadKey.url;
            }
            if ((i & 2) != 0) {
                str2 = downloadKey.outputFilePath;
            }
            return downloadKey.copy(str, str2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getOutputFilePath() {
            return this.outputFilePath;
        }

        @NotNull
        public final DownloadKey copy(@NotNull String url, @NotNull String outputFilePath) {
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(outputFilePath, "outputFilePath");
            return new DownloadKey(url, outputFilePath);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DownloadKey)) {
                return false;
            }
            DownloadKey downloadKey = (DownloadKey) other;
            return Intrinsics.areEqual(this.url, downloadKey.url) && Intrinsics.areEqual(this.outputFilePath, downloadKey.outputFilePath);
        }

        public int hashCode() {
            return (this.url.hashCode() * 31) + this.outputFilePath.hashCode();
        }

        @NotNull
        public String toString() {
            return "DownloadKey(url=" + this.url + ", outputFilePath=" + this.outputFilePath + ')';
        }

        public DownloadKey(@NotNull String url, @NotNull String outputFilePath) {
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(outputFilePath, "outputFilePath");
            this.url = url;
            this.outputFilePath = outputFilePath;
        }

        @NotNull
        public final String getUrl() {
            return this.url;
        }

        @NotNull
        public final String getOutputFilePath() {
            return this.outputFilePath;
        }
    }
}
