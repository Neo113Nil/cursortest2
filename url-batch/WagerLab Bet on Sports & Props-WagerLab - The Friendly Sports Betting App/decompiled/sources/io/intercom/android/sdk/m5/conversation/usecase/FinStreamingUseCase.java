package io.intercom.android.sdk.m5.conversation.usecase;

import io.intercom.android.sdk.m5.conversation.data.ParsedNexusEvent;
import io.intercom.android.sdk.m5.conversation.states.ConversationClientState;
import io.intercom.android.sdk.m5.conversation.states.CurrentlyTypingState;
import io.intercom.android.sdk.m5.conversation.states.TypingIndicatorType;
import io.intercom.android.sdk.models.Conversation;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.MutableStateFlow;

/* compiled from: FinStreamingUseCase.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\nH\u0086B¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/usecase/FinStreamingUseCase;", "", "<init>", "()V", "invoke", "", "clientStateFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lio/intercom/android/sdk/m5/conversation/states/ConversationClientState;", "data", "Lio/intercom/android/sdk/m5/conversation/data/ParsedNexusEvent$ConversationNexusEvent$FinStreaming;", "(Lkotlinx/coroutines/flow/MutableStateFlow;Lio/intercom/android/sdk/m5/conversation/data/ParsedNexusEvent$ConversationNexusEvent$FinStreaming;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class FinStreamingUseCase {
    public static final int $stable = 0;

    /* JADX WARN: Removed duplicated region for block: B:12:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006f A[LOOP:0: B:15:0x006f->B:23:?, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(MutableStateFlow<ConversationClientState> mutableStateFlow, ParsedNexusEvent.ConversationNexusEvent.FinStreaming finStreaming, Continuation<? super Unit> continuation) {
        FinStreamingUseCase$invoke$1 finStreamingUseCase$invoke$1;
        int i;
        MutableStateFlow<ConversationClientState> mutableStateFlow2;
        ParsedNexusEvent.ConversationNexusEvent.FinStreaming finStreaming2;
        ConversationClientState value;
        ConversationClientState conversationClientState;
        Conversation conversation;
        if (continuation instanceof FinStreamingUseCase$invoke$1) {
            finStreamingUseCase$invoke$1 = (FinStreamingUseCase$invoke$1) continuation;
            if ((finStreamingUseCase$invoke$1.label & Integer.MIN_VALUE) != 0) {
                finStreamingUseCase$invoke$1.label -= Integer.MIN_VALUE;
                Object obj = finStreamingUseCase$invoke$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = finStreamingUseCase$invoke$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    mutableStateFlow2 = mutableStateFlow;
                    finStreamingUseCase$invoke$1.L$0 = mutableStateFlow2;
                    finStreamingUseCase$invoke$1.L$1 = finStreaming;
                    finStreamingUseCase$invoke$1.label = 1;
                    if (DelayKt.delay(100L, finStreamingUseCase$invoke$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    finStreaming2 = finStreaming;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    finStreaming2 = (ParsedNexusEvent.ConversationNexusEvent.FinStreaming) finStreamingUseCase$invoke$1.L$1;
                    MutableStateFlow<ConversationClientState> mutableStateFlow3 = (MutableStateFlow) finStreamingUseCase$invoke$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    mutableStateFlow2 = mutableStateFlow3;
                }
                if (finStreaming2.getTokenSequenceIndex() >= mutableStateFlow2.getValue().getFinStreamingData().getTokenSequenceIndex()) {
                    return Unit.INSTANCE;
                }
                do {
                    value = mutableStateFlow2.getValue();
                    conversationClientState = value;
                    conversation = conversationClientState.getConversation();
                } while (!mutableStateFlow2.compareAndSet(value, ConversationClientState.copy$default(conversationClientState, null, conversation != null ? Conversation.copy$default(conversation, null, false, null, null, null, null, null, false, false, null, null, false, null, null, null, null, null, null, null, null, 983039, null) : null, null, new CurrentlyTypingState(null, false, null, TypingIndicatorType.NONE, 7, null), null, null, null, null, null, null, null, null, conversationClientState.getFinStreamingData().copy(true, finStreaming2.getBlocks(), finStreaming2.getClientAssignedUUID(), finStreaming2.getTokenSequenceIndex()), null, 0, 0, null, null, false, false, null, null, 4190197, null)));
                return Unit.INSTANCE;
            }
        }
        finStreamingUseCase$invoke$1 = new FinStreamingUseCase$invoke$1(this, continuation);
        Object obj2 = finStreamingUseCase$invoke$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = finStreamingUseCase$invoke$1.label;
        if (i != 0) {
        }
        if (finStreaming2.getTokenSequenceIndex() >= mutableStateFlow2.getValue().getFinStreamingData().getTokenSequenceIndex()) {
        }
    }
}
