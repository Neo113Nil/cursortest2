package io.bidmachine.util.cache;

import io.bidmachine.util.log.LoggerInstance;
import java.io.File;
import java.util.Date;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: MediaFileMetadataManager.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 7, 1}, xi = 48)
@DebugMetadata(c = "io.bidmachine.util.cache.MediaFileMetadataManager$trackUsage$2", f = "MediaFileMetadataManager.kt", l = {37}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class MediaFileMetadataManager$trackUsage$2 extends SuspendLambda implements Function2 {
    final /* synthetic */ File $mediaFile;
    int label;
    final /* synthetic */ MediaFileMetadataManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MediaFileMetadataManager$trackUsage$2(MediaFileMetadataManager mediaFileMetadataManager, File file, Continuation continuation) {
        super(2, continuation);
        this.this$0 = mediaFileMetadataManager;
        this.$mediaFile = file;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
        return new MediaFileMetadataManager$trackUsage$2(this.this$0, this.$mediaFile, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
        return ((MediaFileMetadataManager$trackUsage$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        LoggerInstance loggerInstance;
        Object mediaFileMetadata;
        MediaFileMetadata m7955copy77cDFVw;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            loggerInstance = this.this$0.logger;
            final File file = this.$mediaFile;
            loggerInstance.d("MediaFileMetadataManager", new Function0() { // from class: io.bidmachine.util.cache.MediaFileMetadataManager$trackUsage$2.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @NotNull
                /* renamed from: invoke */
                public final String mo4828invoke() {
                    return "Track usage for " + file.getName();
                }
            });
            MediaFileMetadataManager mediaFileMetadataManager = this.this$0;
            File file2 = this.$mediaFile;
            this.label = 1;
            mediaFileMetadata = mediaFileMetadataManager.getMediaFileMetadata(file2, this);
            if (mediaFileMetadata == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            mediaFileMetadata = obj;
        }
        MediaFileMetadata mediaFileMetadata2 = (MediaFileMetadata) mediaFileMetadata;
        if (mediaFileMetadata2 == null) {
            return null;
        }
        MediaFileMetadataManager mediaFileMetadataManager2 = this.this$0;
        m7955copy77cDFVw = mediaFileMetadata2.m7955copy77cDFVw((r26 & 1) != 0 ? mediaFileMetadata2.file : null, (r26 & 2) != 0 ? mediaFileMetadata2.mimeType : null, (r26 & 4) != 0 ? mediaFileMetadata2.sizeBytes : 0L, (r26 & 8) != 0 ? mediaFileMetadata2.usageFrequency : mediaFileMetadata2.getUsageFrequency() + 1, (r26 & 16) != 0 ? mediaFileMetadata2.pingTime : 0L, (r26 & 32) != 0 ? mediaFileMetadata2.downloadTime : 0L, (r26 & 64) != 0 ? mediaFileMetadata2.lastUsedTime : new Date(), (r26 & 128) != 0 ? mediaFileMetadata2.createdAt : null);
        mediaFileMetadataManager2.saveMediaFileMetadata(m7955copy77cDFVw);
        return Unit.INSTANCE;
    }
}
