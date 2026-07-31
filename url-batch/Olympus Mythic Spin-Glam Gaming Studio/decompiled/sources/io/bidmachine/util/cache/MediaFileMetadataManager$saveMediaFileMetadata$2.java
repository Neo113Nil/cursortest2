package io.bidmachine.util.cache;

import java.io.File;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: MediaFileMetadataManager.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 7, 1}, xi = 48)
@DebugMetadata(c = "io.bidmachine.util.cache.MediaFileMetadataManager$saveMediaFileMetadata$2", f = "MediaFileMetadataManager.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class MediaFileMetadataManager$saveMediaFileMetadata$2 extends SuspendLambda implements Function2 {
    final /* synthetic */ MediaFileMetadata $mediaFileMetadata;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ MediaFileMetadataManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MediaFileMetadataManager$saveMediaFileMetadata$2(MediaFileMetadataManager mediaFileMetadataManager, MediaFileMetadata mediaFileMetadata, Continuation continuation) {
        super(2, continuation);
        this.this$0 = mediaFileMetadataManager;
        this.$mediaFileMetadata = mediaFileMetadata;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
        MediaFileMetadataManager$saveMediaFileMetadata$2 mediaFileMetadataManager$saveMediaFileMetadata$2 = new MediaFileMetadataManager$saveMediaFileMetadata$2(this.this$0, this.$mediaFileMetadata, continuation);
        mediaFileMetadataManager$saveMediaFileMetadata$2.L$0 = obj;
        return mediaFileMetadataManager$saveMediaFileMetadata$2;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
        return ((MediaFileMetadataManager$saveMediaFileMetadata$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        JSONObject jSONObject;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        MediaFileMetadataManager mediaFileMetadataManager = this.this$0;
        MediaFileMetadata mediaFileMetadata = this.$mediaFileMetadata;
        try {
            File mediaMetadataFile = mediaFileMetadataManager.mediaMetadataFile(mediaFileMetadata.getFile());
            jSONObject = mediaFileMetadataManager.toJSONObject(mediaFileMetadata);
            String jSONObject2 = jSONObject.toString(2);
            Intrinsics.checkNotNullExpressionValue(jSONObject2, "mediaFileMetadata.toJSONObject().toString(2)");
            FilesKt.writeText$default(mediaMetadataFile, jSONObject2, null, 2, null);
            Unit unit = Unit.INSTANCE;
        } catch (Throwable unused) {
        }
        return Unit.INSTANCE;
    }
}
