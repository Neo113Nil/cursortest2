package io.bidmachine.util.cache;

import io.bidmachine.util.MimeTypes;
import io.bidmachine.util.cache.MediaFileCacheManager;
import io.bidmachine.util.file.FileUtilsKt;
import io.bidmachine.util.file.StorageSpaceMonitor;
import io.bidmachine.util.log.LoggerInstance;
import java.io.File;
import java.io.FileFilter;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$IntRef;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: MediaFileCacheManager.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 7, 1}, xi = 48)
@DebugMetadata(c = "io.bidmachine.util.cache.MediaFileCacheManager$cleanup$2", f = "MediaFileCacheManager.kt", l = {369}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class MediaFileCacheManager$cleanup$2 extends SuspendLambda implements Function2 {
    final /* synthetic */ MediaFileCacheManager.Configuration $configuration;
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ MediaFileCacheManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MediaFileCacheManager$cleanup$2(MediaFileCacheManager.Configuration configuration, MediaFileCacheManager mediaFileCacheManager, Continuation continuation) {
        super(2, continuation);
        this.$configuration = configuration;
        this.this$0 = mediaFileCacheManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
        return new MediaFileCacheManager$cleanup$2(this.$configuration, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
        return ((MediaFileCacheManager$cleanup$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0147  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0120 -> B:9:0x01d3). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0140 -> B:5:0x0143). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(@NotNull Object obj) {
        StorageSpaceMonitor storageSpaceMonitor;
        MediaFileCacheManager.EvictionPolicy evictionPolicy;
        final Ref$IntRef ref$IntRef;
        File file;
        MediaFileCacheManager mediaFileCacheManager;
        MediaFileCacheManager.EvictionPolicy evictionPolicy2;
        int i;
        Ref$IntRef ref$IntRef2;
        int length;
        File[] fileArr;
        LoggerInstance loggerInstance;
        LoggerInstance loggerInstance2;
        LoggerInstance loggerInstance3;
        MediaFileMetadataManager mediaFileMetadataManager;
        boolean isMediaFileInUse;
        MediaFileMetadataManager mediaFileMetadataManager2;
        Object obj2;
        int i2;
        String str;
        int i3;
        String str2;
        double scoreInverted;
        MediaFileMetadataManager mediaFileMetadataManager3;
        LoggerInstance loggerInstance4;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = this.label;
        String str3 = "mediaFile";
        int i5 = 1;
        if (i4 == 0) {
            ResultKt.throwOnFailure(obj);
            if (this.$configuration.getPolicyConfiguration().getEvictionPolicyList().isEmpty()) {
                loggerInstance2 = this.this$0.logger;
                loggerInstance2.d("MediaFileCacheManager", new Function0() { // from class: io.bidmachine.util.cache.MediaFileCacheManager$cleanup$2.1
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    /* renamed from: invoke */
                    public final String mo4828invoke() {
                        return "Cleanup is skipped due to empty eviction policy list";
                    }
                });
                return Unit.INSTANCE;
            }
            storageSpaceMonitor = this.this$0.storageSpaceMonitor;
            final StorageSpaceMonitor.StorageSpaceStat storageSpaceStat = storageSpaceMonitor.getStorageSpaceStat();
            Object obj3 = null;
            if (storageSpaceStat != null) {
                double usedStorageSpaceInPercent = storageSpaceStat.getUsedStorageSpaceInPercent();
                Iterator<T> it = this.$configuration.getPolicyConfiguration().getEvictionPolicyList().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    MediaFileCacheManager.EvictionPolicy evictionPolicy3 = (MediaFileCacheManager.EvictionPolicy) next;
                    if (evictionPolicy3.getMinDiskAppliedPercent() <= usedStorageSpaceInPercent && usedStorageSpaceInPercent < evictionPolicy3.getMaxDiskAppliedPercent()) {
                        obj3 = next;
                        break;
                    }
                }
                evictionPolicy = (MediaFileCacheManager.EvictionPolicy) obj3;
            } else {
                Iterator<T> it2 = this.$configuration.getPolicyConfiguration().getEvictionPolicyList().iterator();
                if (it2.hasNext()) {
                    obj3 = it2.next();
                    if (it2.hasNext()) {
                        double minDiskAppliedPercent = ((MediaFileCacheManager.EvictionPolicy) obj3).getMinDiskAppliedPercent();
                        do {
                            Object next2 = it2.next();
                            double minDiskAppliedPercent2 = ((MediaFileCacheManager.EvictionPolicy) next2).getMinDiskAppliedPercent();
                            if (Double.compare(minDiskAppliedPercent, minDiskAppliedPercent2) < 0) {
                                obj3 = next2;
                                minDiskAppliedPercent = minDiskAppliedPercent2;
                            }
                        } while (it2.hasNext());
                    }
                }
                evictionPolicy = (MediaFileCacheManager.EvictionPolicy) obj3;
            }
            if (evictionPolicy == null) {
                loggerInstance = this.this$0.logger;
                loggerInstance.d("MediaFileCacheManager", new Function0() { // from class: io.bidmachine.util.cache.MediaFileCacheManager$cleanup$2.2
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    /* renamed from: invoke */
                    public final String mo4828invoke() {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Cleanup is skipped due not existing eviction policy (free space ");
                        StorageSpaceMonitor.StorageSpaceStat storageSpaceStat2 = StorageSpaceMonitor.StorageSpaceStat.this;
                        sb.append(storageSpaceStat2 != null ? Double.valueOf(storageSpaceStat2.getAvailableStorageSpaceInPercent()) : null);
                        sb.append("%)");
                        return sb.toString();
                    }
                });
                return Unit.INSTANCE;
            }
            ref$IntRef = new Ref$IntRef();
            file = this.this$0.cacheDir;
            final MediaFileCacheManager mediaFileCacheManager2 = this.this$0;
            File[] listFiles = file.listFiles(new FileFilter() { // from class: io.bidmachine.util.cache.MediaFileCacheManager$cleanup$2$$ExternalSyntheticLambda0
                @Override // java.io.FileFilter
                public final boolean accept(File file2) {
                    boolean invokeSuspend$lambda$2;
                    invokeSuspend$lambda$2 = MediaFileCacheManager$cleanup$2.invokeSuspend$lambda$2(MediaFileCacheManager.this, file2);
                    return invokeSuspend$lambda$2;
                }
            });
            if (listFiles != null) {
                mediaFileCacheManager = this.this$0;
                evictionPolicy2 = evictionPolicy;
                i = 0;
                ref$IntRef2 = ref$IntRef;
                length = listFiles.length;
                fileArr = listFiles;
                if (i >= length) {
                }
            }
            loggerInstance3 = this.this$0.logger;
            loggerInstance3.d("MediaFileCacheManager", new Function0() { // from class: io.bidmachine.util.cache.MediaFileCacheManager$cleanup$2.5
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @NotNull
                /* renamed from: invoke */
                public final String mo4828invoke() {
                    return "Cleanup is finished, total removed count: " + Ref$IntRef.this.element;
                }
            });
            mediaFileMetadataManager = this.this$0.getMediaFileMetadataManager();
            mediaFileMetadataManager.resetMemoryCache();
            return Unit.INSTANCE;
        }
        if (i4 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        length = this.I$1;
        i = this.I$0;
        final File file2 = (File) this.L$4;
        mediaFileCacheManager = (MediaFileCacheManager) this.L$3;
        fileArr = (File[]) this.L$2;
        ref$IntRef2 = (Ref$IntRef) this.L$1;
        evictionPolicy2 = (MediaFileCacheManager.EvictionPolicy) this.L$0;
        ResultKt.throwOnFailure(obj);
        Object mediaFileMetadata = obj;
        MediaFileMetadata mediaFileMetadata2 = (MediaFileMetadata) mediaFileMetadata;
        if (mediaFileMetadata2 != null) {
            obj2 = coroutine_suspended;
            i2 = length;
            str = str3;
            i3 = i;
        } else {
            double scoreInverted2 = evictionPolicy2.getMaxTtlMs().scoreInverted(System.currentTimeMillis() - mediaFileMetadata2.getLastUsedTime().getTime());
            i3 = i;
            double score = evictionPolicy2.getMinFrequency().score(mediaFileMetadata2.getUsageFrequency());
            obj2 = coroutine_suspended;
            if (MimeTypes.INSTANCE.isVideo(mediaFileMetadata2.getMimeType())) {
                i2 = length;
                str2 = str3;
                scoreInverted = evictionPolicy2.getMaxVideoSizeBytes().scoreInverted(mediaFileMetadata2.getSizeBytes());
            } else {
                i2 = length;
                str2 = str3;
                scoreInverted = evictionPolicy2.getMaxImageSizeBytes().scoreInverted(mediaFileMetadata2.getSizeBytes());
            }
            if (scoreInverted2 + score + scoreInverted < evictionPolicy2.getScore()) {
                ref$IntRef2.element++;
                mediaFileMetadataManager3 = mediaFileCacheManager.getMediaFileMetadataManager();
                str = str2;
                Intrinsics.checkNotNullExpressionValue(file2, str);
                mediaFileMetadataManager3.deleteMediaFileMetadata(file2);
                FileUtilsKt.deleteFile(file2);
                loggerInstance4 = mediaFileCacheManager.logger;
                loggerInstance4.d("MediaFileCacheManager", new Function0() { // from class: io.bidmachine.util.cache.MediaFileCacheManager$cleanup$2$4$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    /* renamed from: invoke */
                    public final String mo4828invoke() {
                        return "Remove from cache: " + file2.getName();
                    }
                });
            } else {
                str = str2;
            }
        }
        i = i3;
        int i6 = 1;
        i += i6;
        i5 = i6;
        str3 = str;
        coroutine_suspended = obj2;
        length = i2;
        if (i >= length) {
            file2 = fileArr[i];
            Intrinsics.checkNotNullExpressionValue(file2, str3);
            isMediaFileInUse = mediaFileCacheManager.isMediaFileInUse(file2);
            if (isMediaFileInUse) {
                obj2 = coroutine_suspended;
                i2 = length;
                str = str3;
                i6 = i5;
                i += i6;
                i5 = i6;
                str3 = str;
                coroutine_suspended = obj2;
                length = i2;
                if (i >= length) {
                    ref$IntRef = ref$IntRef2;
                    loggerInstance3 = this.this$0.logger;
                    loggerInstance3.d("MediaFileCacheManager", new Function0() { // from class: io.bidmachine.util.cache.MediaFileCacheManager$cleanup$2.5
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        @NotNull
                        /* renamed from: invoke */
                        public final String mo4828invoke() {
                            return "Cleanup is finished, total removed count: " + Ref$IntRef.this.element;
                        }
                    });
                    mediaFileMetadataManager = this.this$0.getMediaFileMetadataManager();
                    mediaFileMetadataManager.resetMemoryCache();
                    return Unit.INSTANCE;
                }
            } else {
                mediaFileMetadataManager2 = mediaFileCacheManager.getMediaFileMetadataManager();
                this.L$0 = evictionPolicy2;
                this.L$1 = ref$IntRef2;
                this.L$2 = fileArr;
                this.L$3 = mediaFileCacheManager;
                this.L$4 = file2;
                this.I$0 = i;
                this.I$1 = length;
                this.label = i5;
                mediaFileMetadata = mediaFileMetadataManager2.getMediaFileMetadata(file2, this);
                if (mediaFileMetadata == coroutine_suspended) {
                    return coroutine_suspended;
                }
                MediaFileMetadata mediaFileMetadata22 = (MediaFileMetadata) mediaFileMetadata;
                if (mediaFileMetadata22 != null) {
                }
                i = i3;
                int i62 = 1;
                i += i62;
                i5 = i62;
                str3 = str;
                coroutine_suspended = obj2;
                length = i2;
                if (i >= length) {
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invokeSuspend$lambda$2(MediaFileCacheManager mediaFileCacheManager, File file) {
        boolean isMediaFile;
        Intrinsics.checkNotNullExpressionValue(file, "file");
        isMediaFile = mediaFileCacheManager.isMediaFile(file);
        return isMediaFile;
    }
}
