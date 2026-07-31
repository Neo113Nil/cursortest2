package io.bidmachine.util.cache;

import java.io.File;
import java.util.Date;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: MediaFileMetadataManager.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Lio/bidmachine/util/cache/MediaFileMetadata;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 7, 1}, xi = 48)
@DebugMetadata(c = "io.bidmachine.util.cache.MediaFileMetadataManager$getMediaFileMetadata$2", f = "MediaFileMetadataManager.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class MediaFileMetadataManager$getMediaFileMetadata$2 extends SuspendLambda implements Function2 {
    final /* synthetic */ File $mediaFile;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ MediaFileMetadataManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MediaFileMetadataManager$getMediaFileMetadata$2(File file, MediaFileMetadataManager mediaFileMetadataManager, Continuation continuation) {
        super(2, continuation);
        this.$mediaFile = file;
        this.this$0 = mediaFileMetadataManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
        MediaFileMetadataManager$getMediaFileMetadata$2 mediaFileMetadataManager$getMediaFileMetadata$2 = new MediaFileMetadataManager$getMediaFileMetadata$2(this.$mediaFile, this.this$0, continuation);
        mediaFileMetadataManager$getMediaFileMetadata$2.L$0 = obj;
        return mediaFileMetadataManager$getMediaFileMetadata$2;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
        return ((MediaFileMetadataManager$getMediaFileMetadata$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0090 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(@NotNull Object obj) {
        Object obj2;
        Object obj3;
        Map map;
        MediaFileMetadata loadMediaFileMetadata;
        MediaFileMetadata mediaFileMetadata;
        long length;
        DurationUnit durationUnit;
        Map map2;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        if (!this.$mediaFile.exists()) {
            return null;
        }
        obj2 = this.this$0.mediaFileMetadataMapLock;
        MediaFileMetadataManager mediaFileMetadataManager = this.this$0;
        File file = this.$mediaFile;
        synchronized (obj2) {
            try {
                map = mediaFileMetadataManager.mediaFileMetadataMap;
                MediaFileMetadata mediaFileMetadata2 = (MediaFileMetadata) map.get(file.getName());
                if (mediaFileMetadata2 != null) {
                    return mediaFileMetadata2;
                }
                loadMediaFileMetadata = mediaFileMetadataManager.loadMediaFileMetadata(file);
                if (loadMediaFileMetadata != null) {
                    map2 = mediaFileMetadataManager.mediaFileMetadataMap;
                    String name = file.getName();
                    Intrinsics.checkNotNullExpressionValue(name, "mediaFile.name");
                    map2.put(name, loadMediaFileMetadata);
                    return loadMediaFileMetadata;
                }
                try {
                    length = file.length();
                    Duration.Companion companion = Duration.Companion;
                    durationUnit = DurationUnit.MILLISECONDS;
                    obj3 = obj2;
                } catch (Throwable unused) {
                    obj3 = obj2;
                }
                try {
                    mediaFileMetadata = new MediaFileMetadata(file, "", length, 0L, DurationKt.toDuration(0, durationUnit), DurationKt.toDuration(0, durationUnit), new Date(file.lastModified()), new Date(file.lastModified()), null);
                } catch (Throwable unused2) {
                    mediaFileMetadata = null;
                    if (mediaFileMetadata == null) {
                    }
                    return mediaFileMetadata;
                }
                if (mediaFileMetadata == null) {
                    try {
                        mediaFileMetadataManager.saveMediaFileMetadata(mediaFileMetadata);
                    } catch (Throwable th) {
                        th = th;
                        throw th;
                    }
                } else {
                    mediaFileMetadata = null;
                }
                return mediaFileMetadata;
            } catch (Throwable th2) {
                th = th2;
                obj3 = obj2;
            }
        }
    }
}
