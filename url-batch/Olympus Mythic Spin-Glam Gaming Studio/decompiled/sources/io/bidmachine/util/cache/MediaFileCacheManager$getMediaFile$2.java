package io.bidmachine.util.cache;

import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
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
@DebugMetadata(c = "io.bidmachine.util.cache.MediaFileCacheManager$getMediaFile$2", f = "MediaFileCacheManager.kt", l = {164}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class MediaFileCacheManager$getMediaFile$2 extends SuspendLambda implements Function2 {
    final /* synthetic */ String $mediaUrl;
    int label;
    final /* synthetic */ MediaFileCacheManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MediaFileCacheManager$getMediaFile$2(MediaFileCacheManager mediaFileCacheManager, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = mediaFileCacheManager;
        this.$mediaUrl = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
        return new MediaFileCacheManager$getMediaFile$2(this.this$0, this.$mediaUrl, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
        return ((MediaFileCacheManager$getMediaFile$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object m7945getMediaFilegIAlus;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            MediaFileCacheManager mediaFileCacheManager = this.this$0;
            List<String> listOf = CollectionsKt.listOf(this.$mediaUrl);
            this.label = 1;
            m7945getMediaFilegIAlus = mediaFileCacheManager.m7945getMediaFilegIAlus(listOf, this);
            if (m7945getMediaFilegIAlus == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            m7945getMediaFilegIAlus = ((Result) obj).getValue();
        }
        return Result.m8022boximpl(m7945getMediaFilegIAlus);
    }
}
