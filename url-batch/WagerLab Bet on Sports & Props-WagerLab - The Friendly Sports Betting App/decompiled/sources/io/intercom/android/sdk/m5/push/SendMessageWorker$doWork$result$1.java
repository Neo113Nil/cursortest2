package io.intercom.android.sdk.m5.push;

import androidx.work.ListenableWorker;
import io.intercom.android.sdk.blocks.BlockFactory;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.blocks.logic.TextSplittingStrategy;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.m5.conversation.data.ConversationRepository;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: SendMessageWorker.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00070\u0001¢\u0006\u0002\b\u0002*\u00020\u0003H\n"}, d2 = {"<anonymous>", "Landroidx/work/ListenableWorker$Result;", "Lkotlin/jvm/internal/EnhancedNullability;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "io.intercom.android.sdk.m5.push.SendMessageWorker$doWork$result$1", f = "SendMessageWorker.kt", i = {}, l = {35}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
final class SendMessageWorker$doWork$result$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ListenableWorker.Result>, Object> {
    final /* synthetic */ String $clientUUID;
    final /* synthetic */ String $conversationId;
    final /* synthetic */ String $messageText;
    int label;
    final /* synthetic */ SendMessageWorker this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SendMessageWorker$doWork$result$1(String str, SendMessageWorker sendMessageWorker, String str2, String str3, Continuation<? super SendMessageWorker$doWork$result$1> continuation) {
        super(2, continuation);
        this.$messageText = str;
        this.this$0 = sendMessageWorker;
        this.$conversationId = str2;
        this.$clientUUID = str3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SendMessageWorker$doWork$result$1(this.$messageText, this.this$0, this.$conversationId, this.$clientUUID, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ListenableWorker.Result> continuation) {
        return ((SendMessageWorker$doWork$result$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ConversationRepository conversationRepository;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            List<Block.Builder> blocksForText = new BlockFactory(new TextSplittingStrategy()).getBlocksForText(this.$messageText);
            conversationRepository = this.this$0.conversationRepository;
            String str = this.$conversationId;
            String str2 = this.$clientUUID;
            Intrinsics.checkNotNull(blocksForText);
            this.label = 1;
            obj = conversationRepository.replyToConversation(str, str2, blocksForText, null, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        NetworkResponse networkResponse = (NetworkResponse) obj;
        if (networkResponse instanceof NetworkResponse.ClientError) {
            return ListenableWorker.Result.failure();
        }
        if ((networkResponse instanceof NetworkResponse.NetworkError) || (networkResponse instanceof NetworkResponse.ServerError)) {
            return ListenableWorker.Result.retry();
        }
        if (!(networkResponse instanceof NetworkResponse.Success)) {
            throw new NoWhenBranchMatchedException();
        }
        return ListenableWorker.Result.success();
    }
}
