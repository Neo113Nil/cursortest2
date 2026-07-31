package io.intercom.android.sdk.m5.push;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import io.intercom.android.sdk.m5.conversation.data.ConversationRepository;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;

/* compiled from: SendMessageWorker.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\n\u001a\u00020\u000bH\u0096@¢\u0006\u0002\u0010\fR\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lio/intercom/android/sdk/m5/push/SendMessageWorker;", "Landroidx/work/CoroutineWorker;", "context", "Landroid/content/Context;", "params", "Landroidx/work/WorkerParameters;", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "conversationRepository", "Lio/intercom/android/sdk/m5/conversation/data/ConversationRepository;", "doWork", "Landroidx/work/ListenableWorker$Result;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class SendMessageWorker extends CoroutineWorker {
    public static final int $stable = 8;
    private final ConversationRepository conversationRepository;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SendMessageWorker(Context context, WorkerParameters params) {
        super(context, params);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(params, "params");
        this.conversationRepository = new ConversationRepository(null, null, null, null, null, null, CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), 63, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object doWork(Continuation<? super ListenableWorker.Result> continuation) {
        SendMessageWorker$doWork$1 sendMessageWorker$doWork$1;
        int i;
        if (continuation instanceof SendMessageWorker$doWork$1) {
            sendMessageWorker$doWork$1 = (SendMessageWorker$doWork$1) continuation;
            if ((sendMessageWorker$doWork$1.label & Integer.MIN_VALUE) != 0) {
                sendMessageWorker$doWork$1.label -= Integer.MIN_VALUE;
                Object obj = sendMessageWorker$doWork$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = sendMessageWorker$doWork$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    String string = getInputData().getString(ConversationActionHandlerKt.KEY_TEXT_REPLY);
                    if (string == null) {
                        ListenableWorker.Result failure = ListenableWorker.Result.failure();
                        Intrinsics.checkNotNullExpressionValue(failure, "failure(...)");
                        return failure;
                    }
                    String string2 = getInputData().getString(ConversationActionHandlerKt.KEY_CONVERSATION_ID);
                    if (string2 == null) {
                        ListenableWorker.Result failure2 = ListenableWorker.Result.failure();
                        Intrinsics.checkNotNullExpressionValue(failure2, "failure(...)");
                        return failure2;
                    }
                    String uuid = UUID.randomUUID().toString();
                    Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
                    CoroutineDispatcher io2 = Dispatchers.getIO();
                    SendMessageWorker$doWork$result$1 sendMessageWorker$doWork$result$1 = new SendMessageWorker$doWork$result$1(string, this, string2, uuid, null);
                    sendMessageWorker$doWork$1.label = 1;
                    obj = BuildersKt.withContext(io2, sendMessageWorker$doWork$result$1, sendMessageWorker$doWork$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                Intrinsics.checkNotNullExpressionValue(obj, "withContext(...)");
                return (ListenableWorker.Result) obj;
            }
        }
        sendMessageWorker$doWork$1 = new SendMessageWorker$doWork$1(this, continuation);
        Object obj2 = sendMessageWorker$doWork$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = sendMessageWorker$doWork$1.label;
        if (i != 0) {
        }
        Intrinsics.checkNotNullExpressionValue(obj2, "withContext(...)");
        return (ListenableWorker.Result) obj2;
    }
}
