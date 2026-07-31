package io.bidmachine.util.cache;

import io.bidmachine.util.SdkDispatchers;
import io.bidmachine.util.log.EmptyLoggerInstance;
import io.bidmachine.util.log.LoggerInstance;
import java.io.File;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.SupervisorKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: MediaFileMetadataManager.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 #2\u00020\u0001:\u0001#B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015J\u001b\u0010\u0016\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0014\u001a\u00020\u0015H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0006\u0010\u0019\u001a\u00020\u0013J\u000e\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\nJ\u001b\u0010\u001c\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0017J\n\u0010\u001d\u001a\u00020\u001e*\u00020\u0015J\n\u0010\u001f\u001a\u00020\u0015*\u00020\u0015J\f\u0010 \u001a\u00020!*\u00020\nH\u0002J\u000e\u0010\"\u001a\u0004\u0018\u00010\n*\u00020!H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006$"}, d2 = {"Lio/bidmachine/util/cache/MediaFileMetadataManager;", "", "dispatchers", "Lio/bidmachine/util/SdkDispatchers;", "logger", "Lio/bidmachine/util/log/LoggerInstance;", "(Lio/bidmachine/util/SdkDispatchers;Lio/bidmachine/util/log/LoggerInstance;)V", "mediaFileMetadataMap", "", "", "Lio/bidmachine/util/cache/MediaFileMetadata;", "mediaFileMetadataMapLock", "scope", "Lkotlinx/coroutines/CoroutineScope;", "getScope", "()Lkotlinx/coroutines/CoroutineScope;", "scope$delegate", "Lkotlin/Lazy;", "deleteMediaFileMetadata", "", "mediaFile", "Ljava/io/File;", "getMediaFileMetadata", "(Ljava/io/File;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadMediaFileMetadata", "resetMemoryCache", "saveMediaFileMetadata", "mediaFileMetadata", "trackUsage", "isMediaMetadataFile", "", "mediaMetadataFile", "toJSONObject", "Lorg/json/JSONObject;", "toMediaFileMetadata", "Companion", "bidmachine-android-sdk_bd_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes11.dex */
public final class MediaFileMetadataManager {

    @NotNull
    private static final String EXT_META = "meta";

    @NotNull
    private static final String KEY_CREATED_AT = "createdAt";

    @NotNull
    private static final String KEY_DOWNLOAD_TIME = "downloadTime";

    @NotNull
    private static final String KEY_FILE = "file";

    @NotNull
    private static final String KEY_FREQUENCY = "frequency";

    @NotNull
    private static final String KEY_LAST_USED = "lastUsed";

    @NotNull
    private static final String KEY_MIME_TYPE = "mime";

    @NotNull
    private static final String KEY_PING_TIME = "pingTime";

    @NotNull
    private static final String KEY_SIZE = "size";

    @NotNull
    private static final String TAG = "MediaFileMetadataManager";

    @NotNull
    private final SdkDispatchers dispatchers;

    @NotNull
    private final LoggerInstance logger;

    @NotNull
    private final Map<String, MediaFileMetadata> mediaFileMetadataMap;

    @NotNull
    private final Object mediaFileMetadataMapLock;

    /* renamed from: scope$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy scope;

    /* JADX WARN: Multi-variable type inference failed */
    public MediaFileMetadataManager() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public MediaFileMetadataManager(@NotNull SdkDispatchers dispatchers, @NotNull LoggerInstance logger) {
        Intrinsics.checkNotNullParameter(dispatchers, "dispatchers");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.dispatchers = dispatchers;
        this.logger = logger;
        this.mediaFileMetadataMapLock = new Object();
        this.mediaFileMetadataMap = new LinkedHashMap();
        this.scope = LazyKt.lazy(new Function0() { // from class: io.bidmachine.util.cache.MediaFileMetadataManager$scope$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* renamed from: invoke */
            public final CoroutineScope mo4828invoke() {
                SdkDispatchers sdkDispatchers;
                CompletableJob SupervisorJob$default = SupervisorKt.SupervisorJob$default(null, 1, null);
                sdkDispatchers = MediaFileMetadataManager.this.dispatchers;
                return CoroutineScopeKt.CoroutineScope(SupervisorJob$default.plus(sdkDispatchers.getIo()));
            }
        });
    }

    public /* synthetic */ MediaFileMetadataManager(SdkDispatchers sdkDispatchers, LoggerInstance loggerInstance, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? SdkDispatchers.INSTANCE.getDefault() : sdkDispatchers, (i & 2) != 0 ? EmptyLoggerInstance.INSTANCE.getINSTANCE() : loggerInstance);
    }

    private final CoroutineScope getScope() {
        return (CoroutineScope) this.scope.getValue();
    }

    public final void resetMemoryCache() {
        synchronized (this.mediaFileMetadataMapLock) {
            this.mediaFileMetadataMap.clear();
            Unit unit = Unit.INSTANCE;
        }
    }

    @Nullable
    public final Object trackUsage(@NotNull File file, @NotNull Continuation continuation) {
        return BuildersKt.withContext(this.dispatchers.getIo(), new MediaFileMetadataManager$trackUsage$2(this, file, null), continuation);
    }

    @Nullable
    public final Object getMediaFileMetadata(@NotNull File file, @NotNull Continuation continuation) {
        return BuildersKt.withContext(this.dispatchers.getIo(), new MediaFileMetadataManager$getMediaFileMetadata$2(file, this, null), continuation);
    }

    public final void deleteMediaFileMetadata(@NotNull File mediaFile) {
        Intrinsics.checkNotNullParameter(mediaFile, "mediaFile");
        synchronized (this.mediaFileMetadataMapLock) {
            this.mediaFileMetadataMap.remove(mediaFile.getName());
        }
        BuildersKt__Builders_commonKt.launch$default(getScope(), null, null, new MediaFileMetadataManager$deleteMediaFileMetadata$2(mediaFile, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MediaFileMetadata loadMediaFileMetadata(File mediaFile) {
        try {
            File mediaMetadataFile = mediaMetadataFile(mediaFile);
            if (mediaMetadataFile.exists() && mediaMetadataFile.length() != 0) {
                return toMediaFileMetadata(new JSONObject(FilesKt.readText$default(mediaMetadataFile, null, 1, null)));
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public final void saveMediaFileMetadata(@NotNull MediaFileMetadata mediaFileMetadata) {
        Intrinsics.checkNotNullParameter(mediaFileMetadata, "mediaFileMetadata");
        synchronized (this.mediaFileMetadataMapLock) {
            Map<String, MediaFileMetadata> map = this.mediaFileMetadataMap;
            String name = mediaFileMetadata.getFile().getName();
            Intrinsics.checkNotNullExpressionValue(name, "mediaFileMetadata.file.name");
            map.put(name, mediaFileMetadata);
            Unit unit = Unit.INSTANCE;
        }
        BuildersKt__Builders_commonKt.launch$default(getScope(), null, null, new MediaFileMetadataManager$saveMediaFileMetadata$2(this, mediaFileMetadata, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final JSONObject toJSONObject(MediaFileMetadata mediaFileMetadata) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("file", mediaFileMetadata.getFile().getPath());
        jSONObject.put(KEY_MIME_TYPE, mediaFileMetadata.getMimeType());
        jSONObject.put(KEY_SIZE, mediaFileMetadata.getSizeBytes());
        jSONObject.put(KEY_FREQUENCY, mediaFileMetadata.getUsageFrequency());
        jSONObject.put(KEY_PING_TIME, Duration.m8147getInWholeMillisecondsimpl(mediaFileMetadata.m7957getPingTimeUwyO8pc()));
        jSONObject.put(KEY_DOWNLOAD_TIME, Duration.m8147getInWholeMillisecondsimpl(mediaFileMetadata.m7956getDownloadTimeUwyO8pc()));
        jSONObject.put(KEY_LAST_USED, mediaFileMetadata.getLastUsedTime().getTime());
        jSONObject.put(KEY_CREATED_AT, mediaFileMetadata.getCreatedAt().getTime());
        return jSONObject;
    }

    private final MediaFileMetadata toMediaFileMetadata(JSONObject jSONObject) {
        try {
            File file = new File(jSONObject.getString("file"));
            String string = jSONObject.getString(KEY_MIME_TYPE);
            Intrinsics.checkNotNullExpressionValue(string, "getString(KEY_MIME_TYPE)");
            long j = jSONObject.getLong(KEY_SIZE);
            long j2 = jSONObject.getLong(KEY_FREQUENCY);
            Duration.Companion companion = Duration.Companion;
            long j3 = jSONObject.getLong(KEY_PING_TIME);
            DurationUnit durationUnit = DurationUnit.MILLISECONDS;
            return new MediaFileMetadata(file, string, j, j2, DurationKt.toDuration(j3, durationUnit), DurationKt.toDuration(jSONObject.getLong(KEY_DOWNLOAD_TIME), durationUnit), new Date(jSONObject.getLong(KEY_LAST_USED)), new Date(jSONObject.getLong(KEY_CREATED_AT)), null);
        } catch (Throwable unused) {
            return null;
        }
    }

    @NotNull
    public final File mediaMetadataFile(@NotNull File file) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        if (isMediaMetadataFile(file)) {
            return file;
        }
        return new File(file.getParentFile(), FilesKt.getNameWithoutExtension(file) + ".meta");
    }

    public final boolean isMediaMetadataFile(@NotNull File file) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        return Intrinsics.areEqual(FilesKt.getExtension(file), "meta");
    }
}
