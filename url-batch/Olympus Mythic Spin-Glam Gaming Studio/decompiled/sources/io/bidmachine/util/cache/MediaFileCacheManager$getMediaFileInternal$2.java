package io.bidmachine.util.cache;

import com.vungle.ads.internal.protos.Sdk;
import io.bidmachine.util.MimeTypes;
import io.bidmachine.util.cache.MediaFileCacheManager;
import io.bidmachine.util.download.DownloadManager;
import io.bidmachine.util.log.LoggerInstance;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import kotlin.time.Duration;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: MediaFileCacheManager.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "Lkotlin/Result;", "Ljava/io/File;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 7, 1}, xi = 48)
@DebugMetadata(c = "io.bidmachine.util.cache.MediaFileCacheManager$getMediaFileInternal$2", f = "MediaFileCacheManager.kt", l = {Sdk.SDKError.Reason.INVALID_CSB_DATA_VALUE, 232, 235, 251}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class MediaFileCacheManager$getMediaFileInternal$2 extends SuspendLambda implements Function2 {
    final /* synthetic */ List<String> $mediaUrlList;
    Object L$0;
    int label;
    final /* synthetic */ MediaFileCacheManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MediaFileCacheManager$getMediaFileInternal$2(List<String> list, MediaFileCacheManager mediaFileCacheManager, Continuation continuation) {
        super(2, continuation);
        this.$mediaUrlList = list;
        this.this$0 = mediaFileCacheManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
        return new MediaFileCacheManager$getMediaFileInternal$2(this.$mediaUrlList, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
        return ((MediaFileCacheManager$getMediaFileInternal$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x012c A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(@NotNull Object obj) {
        MediaFileCacheManager.Configuration configuration;
        Object obj2;
        Object onCachingStart;
        MediaFileCacheManager.Configuration configuration2;
        Object m7942awaitDownloadTask0E7RQCE$default;
        DownloadManager downloadManager;
        LoggerInstance loggerInstance;
        DownloadManager downloadManager2;
        Object m7941awaitDownloadTask0E7RQCE;
        File parentFile;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (!this.$mediaUrlList.isEmpty()) {
                configuration = this.this$0.configuration;
                Sequence asSequence = CollectionsKt.asSequence(this.$mediaUrlList);
                final MediaFileCacheManager mediaFileCacheManager = this.this$0;
                Iterator it = SequencesKt.mapNotNull(asSequence, new Function1() { // from class: io.bidmachine.util.cache.MediaFileCacheManager$getMediaFileInternal$2$cachedMediaFile$1
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    @Nullable
                    public final Pair<String, File> invoke(@NotNull String mediaUrl) {
                        Intrinsics.checkNotNullParameter(mediaUrl, "mediaUrl");
                        File resourceCacheFile$bidmachine_android_sdk_bd_3_7_1 = MediaFileCacheManager.this.getResourceCacheFile$bidmachine_android_sdk_bd_3_7_1(mediaUrl);
                        if (resourceCacheFile$bidmachine_android_sdk_bd_3_7_1 != null) {
                            return new Pair<>(mediaUrl, resourceCacheFile$bidmachine_android_sdk_bd_3_7_1);
                        }
                        return null;
                    }
                }).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it.next();
                    Pair pair = (Pair) obj2;
                    if (((File) pair.getSecond()).exists() && ((File) pair.getSecond()).length() > 0) {
                        break;
                    }
                }
                final Pair pair2 = (Pair) obj2;
                if (pair2 != null) {
                    loggerInstance = this.this$0.logger;
                    loggerInstance.d("MediaFileCacheManager", new Function0() { // from class: io.bidmachine.util.cache.MediaFileCacheManager$getMediaFileInternal$2.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        @NotNull
                        /* renamed from: invoke */
                        public final String mo4828invoke() {
                            return "Return from cache: " + pair2.getFirst();
                        }
                    });
                    Result.Companion companion = Result.INSTANCE;
                    return Result.m8022boximpl(Result.m8023constructorimpl(pair2.getSecond()));
                }
                DownloadManager.DownloadTask downloadTask = null;
                for (String str : this.$mediaUrlList) {
                    File resourceCacheFile$bidmachine_android_sdk_bd_3_7_1 = this.this$0.getResourceCacheFile$bidmachine_android_sdk_bd_3_7_1(str);
                    if (resourceCacheFile$bidmachine_android_sdk_bd_3_7_1 != null) {
                        downloadManager = this.this$0.downloadManager;
                        downloadTask = downloadManager.getActiveDownloadTask(str, resourceCacheFile$bidmachine_android_sdk_bd_3_7_1);
                        if (downloadTask != null) {
                            break;
                        }
                    }
                }
                DownloadManager.DownloadTask downloadTask2 = downloadTask;
                if (downloadTask2 != null) {
                    MediaFileCacheManager mediaFileCacheManager2 = this.this$0;
                    this.label = 1;
                    m7942awaitDownloadTask0E7RQCE$default = MediaFileCacheManager.m7942awaitDownloadTask0E7RQCE$default(mediaFileCacheManager2, downloadTask2, null, this, 2, null);
                    if (m7942awaitDownloadTask0E7RQCE$default == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Result.m8022boximpl(m7942awaitDownloadTask0E7RQCE$default);
                }
                MediaFileCacheManager mediaFileCacheManager3 = this.this$0;
                this.L$0 = configuration;
                this.label = 2;
                onCachingStart = mediaFileCacheManager3.onCachingStart(this);
                if (onCachingStart == coroutine_suspended) {
                    return coroutine_suspended;
                }
                configuration2 = configuration;
                MediaFileCacheManager mediaFileCacheManager4 = this.this$0;
                List<String> list = this.$mediaUrlList;
                this.L$0 = configuration2;
                this.label = 3;
                obj = mediaFileCacheManager4.pickRemoteMediaFile(configuration2, list, this);
                if (obj == coroutine_suspended) {
                }
            } else {
                Result.Companion companion2 = Result.INSTANCE;
                return Result.m8022boximpl(Result.m8023constructorimpl(ResultKt.createFailure(new Exception("Url list is empty"))));
            }
        } else {
            if (i == 1) {
                ResultKt.throwOnFailure(obj);
                m7942awaitDownloadTask0E7RQCE$default = ((Result) obj).getValue();
                return Result.m8022boximpl(m7942awaitDownloadTask0E7RQCE$default);
            }
            if (i == 2) {
                configuration2 = (MediaFileCacheManager.Configuration) this.L$0;
                ResultKt.throwOnFailure(obj);
                MediaFileCacheManager mediaFileCacheManager42 = this.this$0;
                List<String> list2 = this.$mediaUrlList;
                this.L$0 = configuration2;
                this.label = 3;
                obj = mediaFileCacheManager42.pickRemoteMediaFile(configuration2, list2, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 3) {
                    if (i != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    m7941awaitDownloadTask0E7RQCE = ((Result) obj).getValue();
                    return Result.m8022boximpl(m7941awaitDownloadTask0E7RQCE);
                }
                configuration2 = (MediaFileCacheManager.Configuration) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
        }
        MediaFileCacheManager.RemoteMediaFileInfo remoteMediaFileInfo = (MediaFileCacheManager.RemoteMediaFileInfo) obj;
        String url = remoteMediaFileInfo.getUrl();
        File resourceCacheFile$bidmachine_android_sdk_bd_3_7_12 = this.this$0.getResourceCacheFile$bidmachine_android_sdk_bd_3_7_1(url);
        if (resourceCacheFile$bidmachine_android_sdk_bd_3_7_12 != null && (parentFile = resourceCacheFile$bidmachine_android_sdk_bd_3_7_12.getParentFile()) != null) {
            Boxing.boxBoolean(parentFile.mkdirs());
        }
        if (resourceCacheFile$bidmachine_android_sdk_bd_3_7_12 != null) {
            downloadManager2 = this.this$0.downloadManager;
            DownloadManager.DownloadTask mo7960downloadmoChb0s = downloadManager2.mo7960downloadmoChb0s(url, resourceCacheFile$bidmachine_android_sdk_bd_3_7_12, Duration.m8137boximpl(configuration2.getConnectionConfiguration().getDownloadRequestTimeout()));
            MediaFileCacheManager mediaFileCacheManager5 = this.this$0;
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(mediaFileCacheManager5, remoteMediaFileInfo, null);
            this.L$0 = null;
            this.label = 4;
            m7941awaitDownloadTask0E7RQCE = mediaFileCacheManager5.m7941awaitDownloadTask0E7RQCE(mo7960downloadmoChb0s, anonymousClass2, this);
            if (m7941awaitDownloadTask0E7RQCE == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Result.m8022boximpl(m7941awaitDownloadTask0E7RQCE);
        }
        Result.Companion companion3 = Result.INSTANCE;
        return Result.m8022boximpl(Result.m8023constructorimpl(ResultKt.createFailure(new Exception("Can't create file for media file by url (" + url + ')'))));
    }

    /* compiled from: MediaFileCacheManager.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "downloadData", "Lio/bidmachine/util/download/DownloadManager$DownloadData;"}, k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "io.bidmachine.util.cache.MediaFileCacheManager$getMediaFileInternal$2$2", f = "MediaFileCacheManager.kt", l = {252}, m = "invokeSuspend")
    /* renamed from: io.bidmachine.util.cache.MediaFileCacheManager$getMediaFileInternal$2$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function2 {
        final /* synthetic */ MediaFileCacheManager.RemoteMediaFileInfo $remoteMediaFile;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ MediaFileCacheManager this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(MediaFileCacheManager mediaFileCacheManager, MediaFileCacheManager.RemoteMediaFileInfo remoteMediaFileInfo, Continuation continuation) {
            super(2, continuation);
            this.this$0 = mediaFileCacheManager;
            this.$remoteMediaFile = remoteMediaFileInfo;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, this.$remoteMediaFile, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull DownloadManager.DownloadData downloadData, @Nullable Continuation continuation) {
            return ((AnonymousClass2) create(downloadData, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            MediaFileMetadataManager mediaFileMetadataManager;
            Object mediaFileMetadata;
            DownloadManager.DownloadData downloadData;
            MediaFileMetadataManager mediaFileMetadataManager2;
            MediaFileMetadata m7955copy77cDFVw;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                DownloadManager.DownloadData downloadData2 = (DownloadManager.DownloadData) this.L$0;
                mediaFileMetadataManager = this.this$0.getMediaFileMetadataManager();
                File output = downloadData2.getOutput();
                this.L$0 = downloadData2;
                this.label = 1;
                mediaFileMetadata = mediaFileMetadataManager.getMediaFileMetadata(output, this);
                if (mediaFileMetadata == coroutine_suspended) {
                    return coroutine_suspended;
                }
                downloadData = downloadData2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                downloadData = (DownloadManager.DownloadData) this.L$0;
                ResultKt.throwOnFailure(obj);
                mediaFileMetadata = obj;
            }
            MediaFileMetadata mediaFileMetadata2 = (MediaFileMetadata) mediaFileMetadata;
            if (mediaFileMetadata2 == null) {
                return Unit.INSTANCE;
            }
            String mimeType = mediaFileMetadata2.getMimeType();
            MimeTypes mimeTypes = MimeTypes.INSTANCE;
            if (!mimeTypes.isVisual(mimeType)) {
                mimeType = mimeTypes.isVisual(this.$remoteMediaFile.getContentType()) ? this.$remoteMediaFile.getContentType() : mimeTypes.getMimeTypeFromContent(downloadData.getOutput());
            }
            String str = mimeType;
            mediaFileMetadataManager2 = this.this$0.getMediaFileMetadataManager();
            m7955copy77cDFVw = mediaFileMetadata2.m7955copy77cDFVw((r26 & 1) != 0 ? mediaFileMetadata2.file : null, (r26 & 2) != 0 ? mediaFileMetadata2.mimeType : str, (r26 & 4) != 0 ? mediaFileMetadata2.sizeBytes : 0L, (r26 & 8) != 0 ? mediaFileMetadata2.usageFrequency : 0L, (r26 & 16) != 0 ? mediaFileMetadata2.pingTime : this.$remoteMediaFile.m7951getPingTimeUwyO8pc(), (r26 & 32) != 0 ? mediaFileMetadata2.downloadTime : downloadData.m7969getExecutionTimeUwyO8pc(), (r26 & 64) != 0 ? mediaFileMetadata2.lastUsedTime : null, (r26 & 128) != 0 ? mediaFileMetadata2.createdAt : null);
            mediaFileMetadataManager2.saveMediaFileMetadata(m7955copy77cDFVw);
            return Unit.INSTANCE;
        }
    }
}
