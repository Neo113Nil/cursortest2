package io.bidmachine.util.cache;

import io.bidmachine.util.file.FileUtilsKt;
import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: MediaFileCacheManager.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "Lkotlin/Result;", "Ljava/io/File;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 7, 1}, xi = 48)
@DebugMetadata(c = "io.bidmachine.util.cache.MediaFileCacheManager$getMediaFile$4", f = "MediaFileCacheManager.kt", l = {181, 184}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class MediaFileCacheManager$getMediaFile$4 extends SuspendLambda implements Function2 {
    final /* synthetic */ List<String> $mediaUrlList;
    Object L$0;
    int label;
    final /* synthetic */ MediaFileCacheManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MediaFileCacheManager$getMediaFile$4(MediaFileCacheManager mediaFileCacheManager, List<String> list, Continuation continuation) {
        super(2, continuation);
        this.this$0 = mediaFileCacheManager;
        this.$mediaUrlList = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
        return new MediaFileCacheManager$getMediaFile$4(this.this$0, this.$mediaUrlList, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
        return ((MediaFileCacheManager$getMediaFile$4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object m7943getMediaFileInternalgIAlus;
        MediaFileMetadataManager mediaFileMetadataManager;
        MediaFileMetadataManager mediaFileMetadataManager2;
        Object obj2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            MediaFileCacheManager mediaFileCacheManager = this.this$0;
            List<String> list = this.$mediaUrlList;
            this.label = 1;
            m7943getMediaFileInternalgIAlus = mediaFileCacheManager.m7943getMediaFileInternalgIAlus(list, this);
            if (m7943getMediaFileInternalgIAlus == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj2 = this.L$0;
                ResultKt.throwOnFailure(obj);
                m7943getMediaFileInternalgIAlus = obj2;
                return Result.m8022boximpl(m7943getMediaFileInternalgIAlus);
            }
            ResultKt.throwOnFailure(obj);
            m7943getMediaFileInternalgIAlus = ((Result) obj).getValue();
        }
        File file = (File) (Result.m8028isFailureimpl(m7943getMediaFileInternalgIAlus) ? null : m7943getMediaFileInternalgIAlus);
        if (file != null) {
            MediaFileCacheManager mediaFileCacheManager2 = this.this$0;
            if (FileUtilsKt.existsSafely(file)) {
                mediaFileMetadataManager2 = mediaFileCacheManager2.getMediaFileMetadataManager();
                this.L$0 = m7943getMediaFileInternalgIAlus;
                this.label = 2;
                Object trackUsage = mediaFileMetadataManager2.trackUsage(file, this);
                if (trackUsage == coroutine_suspended) {
                    return coroutine_suspended;
                }
                obj2 = m7943getMediaFileInternalgIAlus;
                obj = trackUsage;
                m7943getMediaFileInternalgIAlus = obj2;
            } else {
                mediaFileMetadataManager = mediaFileCacheManager2.getMediaFileMetadataManager();
                mediaFileMetadataManager.deleteMediaFileMetadata(file);
            }
        }
        return Result.m8022boximpl(m7943getMediaFileInternalgIAlus);
    }
}
