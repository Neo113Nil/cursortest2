package io.bidmachine.util.cache;

import androidx.annotation.VisibleForTesting;
import com.safedk.android.utils.j;
import io.bidmachine.util.SdkDispatchers;
import io.bidmachine.util.download.DownloadManager;
import io.bidmachine.util.file.FileUtilsKt;
import io.bidmachine.util.file.StorageSpaceMonitor;
import io.bidmachine.util.log.EmptyLoggerInstance;
import io.bidmachine.util.log.LoggerInstance;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: MediaFileCacheManager.kt */
@Metadata(d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010%\n\u0002\u0010#\n\u0002\b\f\u0018\u0000 e2\u00020\u0001:\tfeghijklmB3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u000f\u001a\u00020\u000eH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J0\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00182\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0082@ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJR\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u001c2&\b\u0002\u0010!\u001a \b\u0001\u0012\u0004\u0012\u00020\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0 \u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u001eH\u0082@ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b\"\u0010#J)\u0010(\u001a\u00020'2\u0006\u0010&\u001a\u00020%2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0082@ø\u0001\u0000¢\u0006\u0004\b(\u0010)J\u001b\u0010*\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020%H\u0082@ø\u0001\u0000¢\u0006\u0004\b*\u0010+J\u0013\u0010,\u001a\u00020\u0012*\u00020\u0002H\u0002¢\u0006\u0004\b,\u0010\u0014JM\u00104\u001a\u00028\u0000\"\u0004\b\u0000\u0010-2\u0006\u0010/\u001a\u00020.2\u0006\u00101\u001a\u0002002\"\u00103\u001a\u001e\b\u0001\u0012\u0004\u0012\u000202\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000 \u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001eH\u0082@ø\u0001\u0000¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020\u000eH\u0002¢\u0006\u0004\b6\u00107J\u0015\u00108\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b8\u00109J\r\u0010:\u001a\u00020\u000e¢\u0006\u0004\b:\u00107J\r\u0010;\u001a\u00020\u000e¢\u0006\u0004\b;\u00107J\u001d\u0010=\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010<\u001a\u00020\u0001¢\u0006\u0004\b=\u0010>J\u001d\u0010?\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010<\u001a\u00020\u0001¢\u0006\u0004\b?\u0010>J\u0015\u0010@\u001a\u00020\u000e2\u0006\u0010<\u001a\u00020\u0001¢\u0006\u0004\b@\u0010AJ\u001d\u0010C\u001a\u0004\u0018\u00010B2\u0006\u0010\u0011\u001a\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\bC\u0010DJ\u001d\u0010C\u001a\u0004\u0018\u00010B2\u0006\u0010E\u001a\u00020\u0016H\u0086@ø\u0001\u0000¢\u0006\u0004\bC\u0010FJ*\u0010H\u001a\b\u0012\u0004\u0012\u00020\u00020\u00182\u0006\u0010E\u001a\u00020\u0016H\u0086@ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\bG\u0010FJ0\u0010H\u001a\b\u0012\u0004\u0012\u00020\u00020\u00182\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0086@ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\bG\u0010\u001aJ\u0019\u0010L\u001a\u0004\u0018\u00010\u00022\u0006\u0010I\u001a\u00020\u0016H\u0001¢\u0006\u0004\bJ\u0010KR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010MR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010NR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010OR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010PR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010QR\u001b\u0010V\u001a\u0002028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\bT\u0010UR\u0016\u0010&\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010WR\u001b\u0010\\\u001a\u00020X8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bY\u0010S\u001a\u0004\bZ\u0010[R\u0014\u0010]\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010^R\u0014\u0010_\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010`R&\u0010c\u001a\u0014\u0012\u0004\u0012\u00020\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010b0a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010d\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006n"}, d2 = {"Lio/bidmachine/util/cache/MediaFileCacheManager;", "", "Ljava/io/File;", "cacheDir", "Lio/bidmachine/util/download/DownloadManager;", "downloadManager", "Lio/bidmachine/util/file/StorageSpaceMonitor;", "storageSpaceMonitor", "Lio/bidmachine/util/SdkDispatchers;", "dispatchers", "Lio/bidmachine/util/log/LoggerInstance;", "logger", "<init>", "(Ljava/io/File;Lio/bidmachine/util/download/DownloadManager;Lio/bidmachine/util/file/StorageSpaceMonitor;Lio/bidmachine/util/SdkDispatchers;Lio/bidmachine/util/log/LoggerInstance;)V", "", "onCachingStart", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "mediaFile", "", "isMediaFileInUse", "(Ljava/io/File;)Z", "", "", "mediaUrlList", "Lkotlin/Result;", "getMediaFileInternal-gIAlu-s", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMediaFileInternal", "Lio/bidmachine/util/download/DownloadManager$DownloadTask;", "downloadTask", "Lkotlin/Function2;", "Lio/bidmachine/util/download/DownloadManager$DownloadData;", "Lkotlin/coroutines/Continuation;", "postAction", "awaitDownloadTask-0E7RQCE", "(Lio/bidmachine/util/download/DownloadManager$DownloadTask;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitDownloadTask", "Lio/bidmachine/util/cache/MediaFileCacheManager$Configuration;", j.c, "Lio/bidmachine/util/cache/MediaFileCacheManager$RemoteMediaFileInfo;", "pickRemoteMediaFile", "(Lio/bidmachine/util/cache/MediaFileCacheManager$Configuration;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cleanup", "(Lio/bidmachine/util/cache/MediaFileCacheManager$Configuration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isMediaFile", "T", "Lkotlin/coroutines/CoroutineContext;", "context", "Lkotlinx/coroutines/sync/Mutex;", "mutex", "Lkotlinx/coroutines/CoroutineScope;", "block", "withContextAndLock", "(Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/sync/Mutex;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "printHolderStat", "()V", "configure", "(Lio/bidmachine/util/cache/MediaFileCacheManager$Configuration;)V", "onSessionStarted", "onLowDiskSpace", "holder", "holdMediaFile", "(Ljava/io/File;Ljava/lang/Object;)V", "unholdMediaFile", "unholdMediaFiles", "(Ljava/lang/Object;)V", "Lio/bidmachine/util/cache/MediaFileMetadata;", "getMediaFileMetadata", "(Ljava/io/File;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "mediaUrl", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMediaFile-gIAlu-s", "getMediaFile", "url", "getResourceCacheFile$bidmachine_android_sdk_bd_3_7_1", "(Ljava/lang/String;)Ljava/io/File;", "getResourceCacheFile", "Ljava/io/File;", "Lio/bidmachine/util/download/DownloadManager;", "Lio/bidmachine/util/file/StorageSpaceMonitor;", "Lio/bidmachine/util/SdkDispatchers;", "Lio/bidmachine/util/log/LoggerInstance;", "scope$delegate", "Lkotlin/Lazy;", "getScope", "()Lkotlinx/coroutines/CoroutineScope;", "scope", "Lio/bidmachine/util/cache/MediaFileCacheManager$Configuration;", "Lio/bidmachine/util/cache/MediaFileMetadataManager;", "mediaFileMetadataManager$delegate", "getMediaFileMetadataManager", "()Lio/bidmachine/util/cache/MediaFileMetadataManager;", "mediaFileMetadataManager", "cleanupMutex", "Lkotlinx/coroutines/sync/Mutex;", "mediaFileHolderMapLock", "Ljava/lang/Object;", "", "", "mediaFileHolderMap", "Ljava/util/Map;", "Companion", "CleanConfiguration", "Configuration", "ConnectionConfiguration", "DownloadPolicy", "EvictionPolicy", "PolicyConfiguration", "PolicyLimit", "RemoteMediaFileInfo", "bidmachine-android-sdk_bd_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes8.dex */
public final class MediaFileCacheManager {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String TAG = "MediaFileCacheManager";

    @NotNull
    private static final Configuration defaultConfiguration;

    @NotNull
    private final File cacheDir;

    @NotNull
    private final Mutex cleanupMutex;

    @NotNull
    private volatile Configuration configuration;

    @NotNull
    private final SdkDispatchers dispatchers;

    @NotNull
    private final DownloadManager downloadManager;

    @NotNull
    private final LoggerInstance logger;

    @NotNull
    private final Map<String, Set<Object>> mediaFileHolderMap;

    @NotNull
    private final Object mediaFileHolderMapLock;

    /* renamed from: mediaFileMetadataManager$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mediaFileMetadataManager;

    /* renamed from: scope$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy scope;

    @NotNull
    private final StorageSpaceMonitor storageSpaceMonitor;

    public MediaFileCacheManager(@NotNull File cacheDir, @NotNull DownloadManager downloadManager, @NotNull StorageSpaceMonitor storageSpaceMonitor, @NotNull SdkDispatchers dispatchers, @NotNull LoggerInstance logger) {
        Intrinsics.checkNotNullParameter(cacheDir, "cacheDir");
        Intrinsics.checkNotNullParameter(downloadManager, "downloadManager");
        Intrinsics.checkNotNullParameter(storageSpaceMonitor, "storageSpaceMonitor");
        Intrinsics.checkNotNullParameter(dispatchers, "dispatchers");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.cacheDir = cacheDir;
        this.downloadManager = downloadManager;
        this.storageSpaceMonitor = storageSpaceMonitor;
        this.dispatchers = dispatchers;
        this.logger = logger;
        this.scope = LazyKt.lazy(new Function0() { // from class: io.bidmachine.util.cache.MediaFileCacheManager$scope$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* renamed from: invoke */
            public final CoroutineScope mo4828invoke() {
                SdkDispatchers sdkDispatchers;
                CompletableJob SupervisorJob$default = SupervisorKt.SupervisorJob$default(null, 1, null);
                sdkDispatchers = MediaFileCacheManager.this.dispatchers;
                return CoroutineScopeKt.CoroutineScope(SupervisorJob$default.plus(sdkDispatchers.getIo()));
            }
        });
        this.configuration = defaultConfiguration;
        this.mediaFileMetadataManager = LazyKt.lazy(new Function0() { // from class: io.bidmachine.util.cache.MediaFileCacheManager$mediaFileMetadataManager$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* renamed from: invoke */
            public final MediaFileMetadataManager mo4828invoke() {
                SdkDispatchers sdkDispatchers;
                LoggerInstance loggerInstance;
                sdkDispatchers = MediaFileCacheManager.this.dispatchers;
                loggerInstance = MediaFileCacheManager.this.logger;
                return new MediaFileMetadataManager(sdkDispatchers, loggerInstance);
            }
        });
        this.cleanupMutex = MutexKt.Mutex$default(false, 1, null);
        this.mediaFileHolderMapLock = new Object();
        this.mediaFileHolderMap = new LinkedHashMap();
    }

    public /* synthetic */ MediaFileCacheManager(File file, DownloadManager downloadManager, StorageSpaceMonitor storageSpaceMonitor, SdkDispatchers sdkDispatchers, LoggerInstance loggerInstance, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(file, downloadManager, storageSpaceMonitor, (i & 8) != 0 ? SdkDispatchers.INSTANCE.getDefault() : sdkDispatchers, (i & 16) != 0 ? EmptyLoggerInstance.INSTANCE.getINSTANCE() : loggerInstance);
    }

    private final CoroutineScope getScope() {
        return (CoroutineScope) this.scope.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MediaFileMetadataManager getMediaFileMetadataManager() {
        return (MediaFileMetadataManager) this.mediaFileMetadataManager.getValue();
    }

    public final void configure(@NotNull Configuration configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.configuration = configuration;
    }

    public final void onSessionStarted() {
        Configuration configuration = this.configuration;
        if (configuration.getCleanConfiguration().getTriggerOnStartup()) {
            this.logger.d(TAG, new Function0() { // from class: io.bidmachine.util.cache.MediaFileCacheManager$onSessionStarted$1
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                /* renamed from: invoke */
                public final String mo4828invoke() {
                    return "Cleanup is triggered by new session event";
                }
            });
            BuildersKt__Builders_commonKt.launch$default(getScope(), null, null, new MediaFileCacheManager$onSessionStarted$2(this, configuration, null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object onCachingStart(Continuation continuation) {
        Configuration configuration = this.configuration;
        if (configuration.getCleanConfiguration().getTriggerOnCaching()) {
            this.logger.d(TAG, new Function0() { // from class: io.bidmachine.util.cache.MediaFileCacheManager$onCachingStart$2
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                /* renamed from: invoke */
                public final String mo4828invoke() {
                    return "Cleanup is triggered by cache started event";
                }
            });
            Object cleanup = cleanup(configuration, continuation);
            return cleanup == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? cleanup : Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    public final void onLowDiskSpace() {
        Configuration configuration = this.configuration;
        if (configuration.getCleanConfiguration().getTriggerOnDiskIssue()) {
            this.logger.d(TAG, new Function0() { // from class: io.bidmachine.util.cache.MediaFileCacheManager$onLowDiskSpace$1
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                /* renamed from: invoke */
                public final String mo4828invoke() {
                    return "Cleanup is triggered by low disk space event";
                }
            });
            BuildersKt__Builders_commonKt.launch$default(getScope(), null, null, new MediaFileCacheManager$onLowDiskSpace$2(this, configuration, null), 3, null);
        }
    }

    public final void holdMediaFile(@NotNull final File mediaFile, @NotNull final Object holder) {
        Intrinsics.checkNotNullParameter(mediaFile, "mediaFile");
        Intrinsics.checkNotNullParameter(holder, "holder");
        this.logger.d(TAG, new Function0() { // from class: io.bidmachine.util.cache.MediaFileCacheManager$holdMediaFile$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* renamed from: invoke */
            public final String mo4828invoke() {
                return "Hold media file " + mediaFile.getName() + ", holder: " + holder;
            }
        });
        synchronized (this.mediaFileHolderMapLock) {
            try {
                Set<Object> set = this.mediaFileHolderMap.get(mediaFile.getPath());
                if (set == null) {
                    set = new LinkedHashSet<>();
                    Map<String, Set<Object>> map = this.mediaFileHolderMap;
                    String path = mediaFile.getPath();
                    Intrinsics.checkNotNullExpressionValue(path, "mediaFile.path");
                    map.put(path, set);
                }
                set.add(holder);
            } catch (Throwable th) {
                throw th;
            }
        }
        printHolderStat();
    }

    public final void unholdMediaFile(@NotNull final File mediaFile, @NotNull final Object holder) {
        Intrinsics.checkNotNullParameter(mediaFile, "mediaFile");
        Intrinsics.checkNotNullParameter(holder, "holder");
        this.logger.d(TAG, new Function0() { // from class: io.bidmachine.util.cache.MediaFileCacheManager$unholdMediaFile$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* renamed from: invoke */
            public final String mo4828invoke() {
                return "Unhold media file " + mediaFile.getName() + ", holder: " + holder;
            }
        });
        synchronized (this.mediaFileHolderMapLock) {
            try {
                Set<Object> set = this.mediaFileHolderMap.get(mediaFile.getPath());
                if (set != null) {
                    set.remove(holder);
                }
                if (set != null && set.isEmpty()) {
                    this.mediaFileHolderMap.remove(mediaFile.getPath());
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        printHolderStat();
    }

    public final void unholdMediaFiles(@NotNull final Object holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        this.logger.d(TAG, new Function0() { // from class: io.bidmachine.util.cache.MediaFileCacheManager$unholdMediaFiles$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* renamed from: invoke */
            public final String mo4828invoke() {
                return "Unhold holder's media files, holder: " + holder;
            }
        });
        synchronized (this.mediaFileHolderMapLock) {
            try {
                for (String str : CollectionsKt.toList(this.mediaFileHolderMap.keySet())) {
                    Set<Object> set = this.mediaFileHolderMap.get(str);
                    if (set != null) {
                        set.remove(holder);
                    }
                    if (set != null && set.isEmpty()) {
                        this.mediaFileHolderMap.remove(str);
                    }
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        printHolderStat();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isMediaFileInUse(File mediaFile) {
        boolean z;
        synchronized (this.mediaFileHolderMapLock) {
            z = this.mediaFileHolderMap.get(mediaFile.getPath()) != null;
        }
        return z;
    }

    @Nullable
    public final Object getMediaFileMetadata(@NotNull File file, @NotNull Continuation continuation) {
        return BuildersKt.withContext(this.dispatchers.getIo(), new MediaFileCacheManager$getMediaFileMetadata$2(this, file, null), continuation);
    }

    @Nullable
    public final Object getMediaFileMetadata(@NotNull String str, @NotNull Continuation continuation) {
        return BuildersKt.withContext(this.dispatchers.getIo(), new MediaFileCacheManager$getMediaFileMetadata$4(this, str, null), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Nullable
    /* renamed from: getMediaFile-gIAlu-s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m7944getMediaFilegIAlus(@NotNull String str, @NotNull Continuation continuation) {
        MediaFileCacheManager$getMediaFile$1 mediaFileCacheManager$getMediaFile$1;
        int i;
        if (continuation instanceof MediaFileCacheManager$getMediaFile$1) {
            mediaFileCacheManager$getMediaFile$1 = (MediaFileCacheManager$getMediaFile$1) continuation;
            int i2 = mediaFileCacheManager$getMediaFile$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mediaFileCacheManager$getMediaFile$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mediaFileCacheManager$getMediaFile$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = mediaFileCacheManager$getMediaFile$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    CoroutineDispatcher io2 = this.dispatchers.getIo();
                    MediaFileCacheManager$getMediaFile$2 mediaFileCacheManager$getMediaFile$2 = new MediaFileCacheManager$getMediaFile$2(this, str, null);
                    mediaFileCacheManager$getMediaFile$1.label = 1;
                    obj = BuildersKt.withContext(io2, mediaFileCacheManager$getMediaFile$2, mediaFileCacheManager$getMediaFile$1);
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
        mediaFileCacheManager$getMediaFile$1 = new MediaFileCacheManager$getMediaFile$1(this, continuation);
        Object obj2 = mediaFileCacheManager$getMediaFile$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = mediaFileCacheManager$getMediaFile$1.label;
        if (i != 0) {
        }
        return ((Result) obj2).getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Nullable
    /* renamed from: getMediaFile-gIAlu-s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m7945getMediaFilegIAlus(@NotNull List<String> list, @NotNull Continuation continuation) {
        MediaFileCacheManager$getMediaFile$3 mediaFileCacheManager$getMediaFile$3;
        int i;
        if (continuation instanceof MediaFileCacheManager$getMediaFile$3) {
            mediaFileCacheManager$getMediaFile$3 = (MediaFileCacheManager$getMediaFile$3) continuation;
            int i2 = mediaFileCacheManager$getMediaFile$3.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mediaFileCacheManager$getMediaFile$3.label = i2 - Integer.MIN_VALUE;
                Object obj = mediaFileCacheManager$getMediaFile$3.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = mediaFileCacheManager$getMediaFile$3.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    CoroutineDispatcher io2 = this.dispatchers.getIo();
                    MediaFileCacheManager$getMediaFile$4 mediaFileCacheManager$getMediaFile$4 = new MediaFileCacheManager$getMediaFile$4(this, list, null);
                    mediaFileCacheManager$getMediaFile$3.label = 1;
                    obj = BuildersKt.withContext(io2, mediaFileCacheManager$getMediaFile$4, mediaFileCacheManager$getMediaFile$3);
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
        mediaFileCacheManager$getMediaFile$3 = new MediaFileCacheManager$getMediaFile$3(this, continuation);
        Object obj2 = mediaFileCacheManager$getMediaFile$3.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = mediaFileCacheManager$getMediaFile$3.label;
        if (i != 0) {
        }
        return ((Result) obj2).getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: getMediaFileInternal-gIAlu-s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m7943getMediaFileInternalgIAlus(List<String> list, Continuation continuation) {
        MediaFileCacheManager$getMediaFileInternal$1 mediaFileCacheManager$getMediaFileInternal$1;
        int i;
        if (continuation instanceof MediaFileCacheManager$getMediaFileInternal$1) {
            mediaFileCacheManager$getMediaFileInternal$1 = (MediaFileCacheManager$getMediaFileInternal$1) continuation;
            int i2 = mediaFileCacheManager$getMediaFileInternal$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mediaFileCacheManager$getMediaFileInternal$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mediaFileCacheManager$getMediaFileInternal$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = mediaFileCacheManager$getMediaFileInternal$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    CoroutineDispatcher io2 = this.dispatchers.getIo();
                    MediaFileCacheManager$getMediaFileInternal$2 mediaFileCacheManager$getMediaFileInternal$2 = new MediaFileCacheManager$getMediaFileInternal$2(list, this, null);
                    mediaFileCacheManager$getMediaFileInternal$1.label = 1;
                    obj = BuildersKt.withContext(io2, mediaFileCacheManager$getMediaFileInternal$2, mediaFileCacheManager$getMediaFileInternal$1);
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
        mediaFileCacheManager$getMediaFileInternal$1 = new MediaFileCacheManager$getMediaFileInternal$1(this, continuation);
        Object obj2 = mediaFileCacheManager$getMediaFileInternal$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = mediaFileCacheManager$getMediaFileInternal$1.label;
        if (i != 0) {
        }
        return ((Result) obj2).getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: awaitDownloadTask-0E7RQCE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m7941awaitDownloadTask0E7RQCE(DownloadManager.DownloadTask downloadTask, Function2 function2, Continuation continuation) {
        MediaFileCacheManager$awaitDownloadTask$1 mediaFileCacheManager$awaitDownloadTask$1;
        int i;
        String str;
        Object value;
        DownloadManager.DownloadData downloadData;
        DownloadManager.DownloadData downloadData2;
        if (continuation instanceof MediaFileCacheManager$awaitDownloadTask$1) {
            mediaFileCacheManager$awaitDownloadTask$1 = (MediaFileCacheManager$awaitDownloadTask$1) continuation;
            int i2 = mediaFileCacheManager$awaitDownloadTask$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mediaFileCacheManager$awaitDownloadTask$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mediaFileCacheManager$awaitDownloadTask$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = mediaFileCacheManager$awaitDownloadTask$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    String url = downloadTask.getUrl();
                    Deferred deferred = downloadTask.getDeferred();
                    mediaFileCacheManager$awaitDownloadTask$1.L$0 = function2;
                    mediaFileCacheManager$awaitDownloadTask$1.L$1 = url;
                    mediaFileCacheManager$awaitDownloadTask$1.label = 1;
                    Object await = deferred.await(mediaFileCacheManager$awaitDownloadTask$1);
                    if (await == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    obj = await;
                    str = url;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        downloadData2 = (DownloadManager.DownloadData) mediaFileCacheManager$awaitDownloadTask$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        downloadData = downloadData2;
                        Result.Companion companion = Result.INSTANCE;
                        return Result.m8023constructorimpl(downloadData.getOutput());
                    }
                    str = (String) mediaFileCacheManager$awaitDownloadTask$1.L$1;
                    function2 = (Function2) mediaFileCacheManager$awaitDownloadTask$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                value = ((Result) obj).getValue();
                if (!Result.m8028isFailureimpl(value)) {
                    Throwable m8026exceptionOrNullimpl = Result.m8026exceptionOrNullimpl(value);
                    if (m8026exceptionOrNullimpl == null) {
                        m8026exceptionOrNullimpl = new Exception("Unknown error while download " + str);
                    }
                    return Result.m8023constructorimpl(ResultKt.createFailure(m8026exceptionOrNullimpl));
                }
                if (Result.m8028isFailureimpl(value)) {
                    value = null;
                }
                downloadData = (DownloadManager.DownloadData) value;
                if (downloadData == null || !downloadData.getOutput().exists()) {
                    return Result.m8023constructorimpl(ResultKt.createFailure(new Exception("Download task (" + str + ") completed, but file not found")));
                }
                if (function2 != null) {
                    mediaFileCacheManager$awaitDownloadTask$1.L$0 = downloadData;
                    mediaFileCacheManager$awaitDownloadTask$1.L$1 = null;
                    mediaFileCacheManager$awaitDownloadTask$1.label = 2;
                    if (function2.invoke(downloadData, mediaFileCacheManager$awaitDownloadTask$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    downloadData2 = downloadData;
                    downloadData = downloadData2;
                }
                Result.Companion companion2 = Result.INSTANCE;
                return Result.m8023constructorimpl(downloadData.getOutput());
            }
        }
        mediaFileCacheManager$awaitDownloadTask$1 = new MediaFileCacheManager$awaitDownloadTask$1(this, continuation);
        Object obj2 = mediaFileCacheManager$awaitDownloadTask$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = mediaFileCacheManager$awaitDownloadTask$1.label;
        if (i != 0) {
        }
        value = ((Result) obj2).getValue();
        if (!Result.m8028isFailureimpl(value)) {
        }
    }

    /* renamed from: awaitDownloadTask-0E7RQCE$default, reason: not valid java name */
    static /* synthetic */ Object m7942awaitDownloadTask0E7RQCE$default(MediaFileCacheManager mediaFileCacheManager, DownloadManager.DownloadTask downloadTask, Function2 function2, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            function2 = null;
        }
        return mediaFileCacheManager.m7941awaitDownloadTask0E7RQCE(downloadTask, function2, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object pickRemoteMediaFile(Configuration configuration, List<String> list, Continuation continuation) {
        return BuildersKt.withContext(this.dispatchers.getIo(), new MediaFileCacheManager$pickRemoteMediaFile$2(this, configuration, list, null), continuation);
    }

    @VisibleForTesting
    @Nullable
    public final File getResourceCacheFile$bidmachine_android_sdk_bd_3_7_1(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        return FileUtilsKt.createFileByUrl(this.cacheDir, url);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object cleanup(Configuration configuration, Continuation continuation) {
        Object withContextAndLock = withContextAndLock(this.dispatchers.getIo(), this.cleanupMutex, new MediaFileCacheManager$cleanup$2(configuration, this, null), continuation);
        return withContextAndLock == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContextAndLock : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isMediaFile(File file) {
        return StringsKt.isBlank(FilesKt.getExtension(file));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <T> Object withContextAndLock(CoroutineContext coroutineContext, Mutex mutex, Function2 function2, Continuation continuation) {
        return BuildersKt.withContext(coroutineContext, new MediaFileCacheManager$withContextAndLock$2(mutex, function2, null), continuation);
    }

    private final void printHolderStat() {
        this.logger.d(TAG, new Function0() { // from class: io.bidmachine.util.cache.MediaFileCacheManager$printHolderStat$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* renamed from: invoke */
            public final String mo4828invoke() {
                Object obj;
                Map map;
                Map map2;
                StringBuilder sb = new StringBuilder("Holder stat:");
                obj = MediaFileCacheManager.this.mediaFileHolderMapLock;
                MediaFileCacheManager mediaFileCacheManager = MediaFileCacheManager.this;
                synchronized (obj) {
                    try {
                        map = mediaFileCacheManager.mediaFileHolderMap;
                        if (!map.isEmpty()) {
                            map2 = mediaFileCacheManager.mediaFileHolderMap;
                            for (Map.Entry entry : map2.entrySet()) {
                                sb.append("\nFile: " + ((String) entry.getKey()) + "\nHolders: [" + CollectionsKt.joinToString$default((Iterable) entry.getValue(), ", ", null, null, 0, null, null, 62, null) + ']');
                            }
                            Unit unit = Unit.INSTANCE;
                        } else {
                            sb.append("\n No active holds");
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                String sb2 = sb.toString();
                Intrinsics.checkNotNullExpressionValue(sb2, "sb.toString()");
                return sb2;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: MediaFileCacheManager.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B8\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\nø\u0001\u0000¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u0019\u0010\u0016\u001a\u00020\u0005HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u000fJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\bHÆ\u0003J\t\u0010\u001a\u001a\u00020\nHÆ\u0003JH\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0004\u001a\u00020\u0005ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\r\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006$"}, d2 = {"Lio/bidmachine/util/cache/MediaFileCacheManager$RemoteMediaFileInfo;", "", "url", "", "pingTime", "Lkotlin/time/Duration;", "contentType", "size", "", "score", "", "(Ljava/lang/String;JLjava/lang/String;JDLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getContentType", "()Ljava/lang/String;", "getPingTime-UwyO8pc", "()J", "J", "getScore", "()D", "getSize", "getUrl", "component1", "component2", "component2-UwyO8pc", "component3", "component4", "component5", "copy", "copy-WPwdCS8", "(Ljava/lang/String;JLjava/lang/String;JD)Lio/bidmachine/util/cache/MediaFileCacheManager$RemoteMediaFileInfo;", "equals", "", "other", "hashCode", "", "toString", "bidmachine-android-sdk_bd_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
    static final /* data */ class RemoteMediaFileInfo {

        @NotNull
        private final String contentType;
        private final long pingTime;
        private final double score;
        private final long size;

        @NotNull
        private final String url;

        public /* synthetic */ RemoteMediaFileInfo(String str, long j, String str2, long j2, double d, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, j, str2, j2, d);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        /* renamed from: component2-UwyO8pc, reason: not valid java name and from getter */
        public final long getPingTime() {
            return this.pingTime;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final String getContentType() {
            return this.contentType;
        }

        /* renamed from: component4, reason: from getter */
        public final long getSize() {
            return this.size;
        }

        /* renamed from: component5, reason: from getter */
        public final double getScore() {
            return this.score;
        }

        @NotNull
        /* renamed from: copy-WPwdCS8, reason: not valid java name */
        public final RemoteMediaFileInfo m7950copyWPwdCS8(@NotNull String url, long pingTime, @NotNull String contentType, long size, double score) {
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(contentType, "contentType");
            return new RemoteMediaFileInfo(url, pingTime, contentType, size, score, null);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RemoteMediaFileInfo)) {
                return false;
            }
            RemoteMediaFileInfo remoteMediaFileInfo = (RemoteMediaFileInfo) other;
            return Intrinsics.areEqual(this.url, remoteMediaFileInfo.url) && Duration.m8142equalsimpl0(this.pingTime, remoteMediaFileInfo.pingTime) && Intrinsics.areEqual(this.contentType, remoteMediaFileInfo.contentType) && this.size == remoteMediaFileInfo.size && Double.compare(this.score, remoteMediaFileInfo.score) == 0;
        }

        public int hashCode() {
            return (((((((this.url.hashCode() * 31) + Duration.m8156hashCodeimpl(this.pingTime)) * 31) + this.contentType.hashCode()) * 31) + Long.hashCode(this.size)) * 31) + Double.hashCode(this.score);
        }

        @NotNull
        public String toString() {
            return "RemoteMediaFileInfo(url=" + this.url + ", pingTime=" + ((Object) Duration.m8170toStringimpl(this.pingTime)) + ", contentType=" + this.contentType + ", size=" + this.size + ", score=" + this.score + ')';
        }

        private RemoteMediaFileInfo(String str, long j, String str2, long j2, double d) {
            this.url = str;
            this.pingTime = j;
            this.contentType = str2;
            this.size = j2;
            this.score = d;
        }

        @NotNull
        public final String getUrl() {
            return this.url;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ RemoteMediaFileInfo(String str, long j, String str2, long j2, double d, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, r4, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? Long.MAX_VALUE : j2, (i & 16) != 0 ? 0.0d : d, null);
            long j3;
            if ((i & 2) != 0) {
                Duration.Companion companion = Duration.Companion;
                j3 = DurationKt.toDuration(0, DurationUnit.MILLISECONDS);
            } else {
                j3 = j;
            }
        }

        /* renamed from: getPingTime-UwyO8pc, reason: not valid java name */
        public final long m7951getPingTimeUwyO8pc() {
            return this.pingTime;
        }

        @NotNull
        public final String getContentType() {
            return this.contentType;
        }

        public final long getSize() {
            return this.size;
        }

        public final double getScore() {
            return this.score;
        }
    }

    /* compiled from: MediaFileCacheManager.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lio/bidmachine/util/cache/MediaFileCacheManager$Configuration;", "", "cleanConfiguration", "Lio/bidmachine/util/cache/MediaFileCacheManager$CleanConfiguration;", "connectionConfiguration", "Lio/bidmachine/util/cache/MediaFileCacheManager$ConnectionConfiguration;", "policyConfiguration", "Lio/bidmachine/util/cache/MediaFileCacheManager$PolicyConfiguration;", "(Lio/bidmachine/util/cache/MediaFileCacheManager$CleanConfiguration;Lio/bidmachine/util/cache/MediaFileCacheManager$ConnectionConfiguration;Lio/bidmachine/util/cache/MediaFileCacheManager$PolicyConfiguration;)V", "getCleanConfiguration", "()Lio/bidmachine/util/cache/MediaFileCacheManager$CleanConfiguration;", "getConnectionConfiguration", "()Lio/bidmachine/util/cache/MediaFileCacheManager$ConnectionConfiguration;", "getPolicyConfiguration", "()Lio/bidmachine/util/cache/MediaFileCacheManager$PolicyConfiguration;", "bidmachine-android-sdk_bd_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Configuration {

        @NotNull
        private final CleanConfiguration cleanConfiguration;

        @NotNull
        private final ConnectionConfiguration connectionConfiguration;

        @NotNull
        private final PolicyConfiguration policyConfiguration;

        public Configuration(@NotNull CleanConfiguration cleanConfiguration, @NotNull ConnectionConfiguration connectionConfiguration, @NotNull PolicyConfiguration policyConfiguration) {
            Intrinsics.checkNotNullParameter(cleanConfiguration, "cleanConfiguration");
            Intrinsics.checkNotNullParameter(connectionConfiguration, "connectionConfiguration");
            Intrinsics.checkNotNullParameter(policyConfiguration, "policyConfiguration");
            this.cleanConfiguration = cleanConfiguration;
            this.connectionConfiguration = connectionConfiguration;
            this.policyConfiguration = policyConfiguration;
        }

        @NotNull
        public final CleanConfiguration getCleanConfiguration() {
            return this.cleanConfiguration;
        }

        @NotNull
        public final ConnectionConfiguration getConnectionConfiguration() {
            return this.connectionConfiguration;
        }

        @NotNull
        public final PolicyConfiguration getPolicyConfiguration() {
            return this.policyConfiguration;
        }
    }

    /* compiled from: MediaFileCacheManager.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u000b"}, d2 = {"Lio/bidmachine/util/cache/MediaFileCacheManager$CleanConfiguration;", "", "triggerOnStartup", "", "triggerOnCaching", "triggerOnDiskIssue", "(ZZZ)V", "getTriggerOnCaching", "()Z", "getTriggerOnDiskIssue", "getTriggerOnStartup", "bidmachine-android-sdk_bd_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class CleanConfiguration {
        private final boolean triggerOnCaching;
        private final boolean triggerOnDiskIssue;
        private final boolean triggerOnStartup;

        public CleanConfiguration(boolean z, boolean z2, boolean z3) {
            this.triggerOnStartup = z;
            this.triggerOnCaching = z2;
            this.triggerOnDiskIssue = z3;
        }

        public final boolean getTriggerOnStartup() {
            return this.triggerOnStartup;
        }

        public final boolean getTriggerOnCaching() {
            return this.triggerOnCaching;
        }

        public final boolean getTriggerOnDiskIssue() {
            return this.triggerOnDiskIssue;
        }
    }

    /* compiled from: MediaFileCacheManager.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0018\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0002\u0010\u0005R\u001c\u0010\u0004\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\t\u0010\u0007\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\n"}, d2 = {"Lio/bidmachine/util/cache/MediaFileCacheManager$ConnectionConfiguration;", "", "headRequestTimeout", "Lkotlin/time/Duration;", "downloadRequestTimeout", "(JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getDownloadRequestTimeout-UwyO8pc", "()J", "J", "getHeadRequestTimeout-UwyO8pc", "bidmachine-android-sdk_bd_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class ConnectionConfiguration {
        private final long downloadRequestTimeout;
        private final long headRequestTimeout;

        public /* synthetic */ ConnectionConfiguration(long j, long j2, DefaultConstructorMarker defaultConstructorMarker) {
            this(j, j2);
        }

        private ConnectionConfiguration(long j, long j2) {
            this.headRequestTimeout = j;
            this.downloadRequestTimeout = j2;
        }

        /* renamed from: getHeadRequestTimeout-UwyO8pc, reason: not valid java name and from getter */
        public final long getHeadRequestTimeout() {
            return this.headRequestTimeout;
        }

        /* renamed from: getDownloadRequestTimeout-UwyO8pc, reason: not valid java name and from getter */
        public final long getDownloadRequestTimeout() {
            return this.downloadRequestTimeout;
        }
    }

    /* compiled from: MediaFileCacheManager.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lio/bidmachine/util/cache/MediaFileCacheManager$PolicyConfiguration;", "", "downloadPolicy", "Lio/bidmachine/util/cache/MediaFileCacheManager$DownloadPolicy;", "evictionPolicyList", "", "Lio/bidmachine/util/cache/MediaFileCacheManager$EvictionPolicy;", "(Lio/bidmachine/util/cache/MediaFileCacheManager$DownloadPolicy;Ljava/util/List;)V", "getDownloadPolicy", "()Lio/bidmachine/util/cache/MediaFileCacheManager$DownloadPolicy;", "getEvictionPolicyList", "()Ljava/util/List;", "bidmachine-android-sdk_bd_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class PolicyConfiguration {

        @NotNull
        private final DownloadPolicy downloadPolicy;

        @NotNull
        private final List<EvictionPolicy> evictionPolicyList;

        public PolicyConfiguration(@NotNull DownloadPolicy downloadPolicy, @NotNull List<EvictionPolicy> evictionPolicyList) {
            Intrinsics.checkNotNullParameter(downloadPolicy, "downloadPolicy");
            Intrinsics.checkNotNullParameter(evictionPolicyList, "evictionPolicyList");
            this.downloadPolicy = downloadPolicy;
            this.evictionPolicyList = evictionPolicyList;
        }

        @NotNull
        public final DownloadPolicy getDownloadPolicy() {
            return this.downloadPolicy;
        }

        @NotNull
        public final List<EvictionPolicy> getEvictionPolicyList() {
            return this.evictionPolicyList;
        }
    }

    /* compiled from: MediaFileCacheManager.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"Lio/bidmachine/util/cache/MediaFileCacheManager$DownloadPolicy;", "", "maxPingTimeMs", "Lio/bidmachine/util/cache/MediaFileCacheManager$PolicyLimit;", "maxFileSizeBytes", "(Lio/bidmachine/util/cache/MediaFileCacheManager$PolicyLimit;Lio/bidmachine/util/cache/MediaFileCacheManager$PolicyLimit;)V", "getMaxFileSizeBytes", "()Lio/bidmachine/util/cache/MediaFileCacheManager$PolicyLimit;", "getMaxPingTimeMs", "bidmachine-android-sdk_bd_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class DownloadPolicy {

        @NotNull
        private final PolicyLimit maxFileSizeBytes;

        @NotNull
        private final PolicyLimit maxPingTimeMs;

        public DownloadPolicy(@NotNull PolicyLimit maxPingTimeMs, @NotNull PolicyLimit maxFileSizeBytes) {
            Intrinsics.checkNotNullParameter(maxPingTimeMs, "maxPingTimeMs");
            Intrinsics.checkNotNullParameter(maxFileSizeBytes, "maxFileSizeBytes");
            this.maxPingTimeMs = maxPingTimeMs;
            this.maxFileSizeBytes = maxFileSizeBytes;
        }

        @NotNull
        public final PolicyLimit getMaxPingTimeMs() {
            return this.maxPingTimeMs;
        }

        @NotNull
        public final PolicyLimit getMaxFileSizeBytes() {
            return this.maxFileSizeBytes;
        }
    }

    /* compiled from: MediaFileCacheManager.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0002\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\r¨\u0006\u0015"}, d2 = {"Lio/bidmachine/util/cache/MediaFileCacheManager$EvictionPolicy;", "", "score", "", "minDiskAppliedPercent", "maxDiskAppliedPercent", "maxTtlMs", "Lio/bidmachine/util/cache/MediaFileCacheManager$PolicyLimit;", "minFrequency", "maxImageSizeBytes", "maxVideoSizeBytes", "(DDDLio/bidmachine/util/cache/MediaFileCacheManager$PolicyLimit;Lio/bidmachine/util/cache/MediaFileCacheManager$PolicyLimit;Lio/bidmachine/util/cache/MediaFileCacheManager$PolicyLimit;Lio/bidmachine/util/cache/MediaFileCacheManager$PolicyLimit;)V", "getMaxDiskAppliedPercent", "()D", "getMaxImageSizeBytes", "()Lio/bidmachine/util/cache/MediaFileCacheManager$PolicyLimit;", "getMaxTtlMs", "getMaxVideoSizeBytes", "getMinDiskAppliedPercent", "getMinFrequency", "getScore", "bidmachine-android-sdk_bd_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class EvictionPolicy {
        private final double maxDiskAppliedPercent;

        @NotNull
        private final PolicyLimit maxImageSizeBytes;

        @NotNull
        private final PolicyLimit maxTtlMs;

        @NotNull
        private final PolicyLimit maxVideoSizeBytes;
        private final double minDiskAppliedPercent;

        @NotNull
        private final PolicyLimit minFrequency;
        private final double score;

        public EvictionPolicy(double d, double d2, double d3, @NotNull PolicyLimit maxTtlMs, @NotNull PolicyLimit minFrequency, @NotNull PolicyLimit maxImageSizeBytes, @NotNull PolicyLimit maxVideoSizeBytes) {
            Intrinsics.checkNotNullParameter(maxTtlMs, "maxTtlMs");
            Intrinsics.checkNotNullParameter(minFrequency, "minFrequency");
            Intrinsics.checkNotNullParameter(maxImageSizeBytes, "maxImageSizeBytes");
            Intrinsics.checkNotNullParameter(maxVideoSizeBytes, "maxVideoSizeBytes");
            this.score = d;
            this.minDiskAppliedPercent = d2;
            this.maxDiskAppliedPercent = d3;
            this.maxTtlMs = maxTtlMs;
            this.minFrequency = minFrequency;
            this.maxImageSizeBytes = maxImageSizeBytes;
            this.maxVideoSizeBytes = maxVideoSizeBytes;
        }

        public final double getScore() {
            return this.score;
        }

        public final double getMinDiskAppliedPercent() {
            return this.minDiskAppliedPercent;
        }

        public final double getMaxDiskAppliedPercent() {
            return this.maxDiskAppliedPercent;
        }

        @NotNull
        public final PolicyLimit getMaxTtlMs() {
            return this.maxTtlMs;
        }

        @NotNull
        public final PolicyLimit getMinFrequency() {
            return this.minFrequency;
        }

        @NotNull
        public final PolicyLimit getMaxImageSizeBytes() {
            return this.maxImageSizeBytes;
        }

        @NotNull
        public final PolicyLimit getMaxVideoSizeBytes() {
            return this.maxVideoSizeBytes;
        }
    }

    /* compiled from: MediaFileCacheManager.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0005J\u000e\u0010\r\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lio/bidmachine/util/cache/MediaFileCacheManager$PolicyLimit;", "", "threshold", "", "weight", "", "(JD)V", "getThreshold", "()J", "getWeight", "()D", "score", "input", "scoreInverted", "bidmachine-android-sdk_bd_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class PolicyLimit {
        private final long threshold;
        private final double weight;

        public PolicyLimit(long j, double d) {
            this.threshold = j;
            this.weight = d;
        }

        public final long getThreshold() {
            return this.threshold;
        }

        public final double getWeight() {
            return this.weight;
        }

        public final double score(double input) {
            long j = this.threshold;
            if (j == 0) {
                return 0.0d;
            }
            return this.weight * RangesKt.coerceIn(input / j, 0.0d, 1.0d);
        }

        public final double scoreInverted(double input) {
            long j = this.threshold;
            if (j == 0) {
                return 0.0d;
            }
            return this.weight * RangesKt.coerceIn(1 - (input / j), 0.0d, 1.0d);
        }
    }

    /* compiled from: MediaFileCacheManager.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lio/bidmachine/util/cache/MediaFileCacheManager$Companion;", "", "()V", "TAG", "", "defaultConfiguration", "Lio/bidmachine/util/cache/MediaFileCacheManager$Configuration;", "getDefaultConfiguration", "()Lio/bidmachine/util/cache/MediaFileCacheManager$Configuration;", "bidmachine-android-sdk_bd_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @NotNull
        public final Configuration getDefaultConfiguration() {
            return MediaFileCacheManager.defaultConfiguration;
        }
    }

    static {
        CleanConfiguration cleanConfiguration = new CleanConfiguration(true, true, true);
        Duration.Companion companion = Duration.Companion;
        defaultConfiguration = new Configuration(cleanConfiguration, new ConnectionConfiguration(DurationKt.toDuration(10, DurationUnit.SECONDS), DurationKt.toDuration(10, DurationUnit.MINUTES), null), new PolicyConfiguration(new DownloadPolicy(new PolicyLimit(500L, 0.8d), new PolicyLimit(5242880L, 0.4d)), CollectionsKt.listOf(new EvictionPolicy(0.1d, 0.0d, 1.0d, new PolicyLimit(Duration.m8147getInWholeMillisecondsimpl(DurationKt.toDuration(3, DurationUnit.DAYS)), 1.0d), new PolicyLimit(0L, 0.0d), new PolicyLimit(0L, 0.0d), new PolicyLimit(0L, 0.0d)))));
    }
}
