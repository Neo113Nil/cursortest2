package io.bidmachine.util.cache;

import io.bidmachine.util.file.FileUtilsKt;
import java.io.File;
import kotlin.Metadata;
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

/* compiled from: MediaFileMetadataManager.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 7, 1}, xi = 48)
@DebugMetadata(c = "io.bidmachine.util.cache.MediaFileMetadataManager$deleteMediaFileMetadata$2", f = "MediaFileMetadataManager.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class MediaFileMetadataManager$deleteMediaFileMetadata$2 extends SuspendLambda implements Function2 {
    final /* synthetic */ File $mediaFile;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MediaFileMetadataManager$deleteMediaFileMetadata$2(File file, Continuation continuation) {
        super(2, continuation);
        this.$mediaFile = file;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
        return new MediaFileMetadataManager$deleteMediaFileMetadata$2(this.$mediaFile, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
        return ((MediaFileMetadataManager$deleteMediaFileMetadata$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        FileUtilsKt.deleteFile(this.$mediaFile);
        return Unit.INSTANCE;
    }
}
