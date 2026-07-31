package io.intercom.android.sdk.m5.conversation.usecase;

import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.blocks.BlockFactory;
import io.intercom.android.sdk.blocks.logic.TextSplittingStrategy;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.identity.UserIdentity;
import io.intercom.android.sdk.m5.conversation.data.ConversationRepository;
import io.intercom.android.sdk.m5.conversation.states.ConversationClientState;
import io.intercom.android.sdk.m5.conversation.states.PendingMessage;
import io.intercom.android.sdk.m5.conversation.states.ReplySuggestion;
import io.intercom.android.sdk.m5.data.IntercomDataLayer;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.OpenMessengerResponse;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.models.Participant;
import java.util.LinkedHashMap;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;

/* compiled from: SendSuggestionUseCase.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0086B¢\u0006\u0002\u0010\u0013R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/usecase/SendSuggestionUseCase;", "", "conversationRepository", "Lio/intercom/android/sdk/m5/conversation/data/ConversationRepository;", "soundEffectsUseCase", "Lio/intercom/android/sdk/m5/conversation/usecase/SoundEffectsUseCase;", "userIdentity", "Lio/intercom/android/sdk/identity/UserIdentity;", "intercomDataLayer", "Lio/intercom/android/sdk/m5/data/IntercomDataLayer;", "<init>", "(Lio/intercom/android/sdk/m5/conversation/data/ConversationRepository;Lio/intercom/android/sdk/m5/conversation/usecase/SoundEffectsUseCase;Lio/intercom/android/sdk/identity/UserIdentity;Lio/intercom/android/sdk/m5/data/IntercomDataLayer;)V", "invoke", "", "clientStateFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lio/intercom/android/sdk/m5/conversation/states/ConversationClientState;", MetricTracker.Object.SUGGESTION, "Lio/intercom/android/sdk/m5/conversation/states/ReplySuggestion;", "(Lkotlinx/coroutines/flow/MutableStateFlow;Lio/intercom/android/sdk/m5/conversation/states/ReplySuggestion;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class SendSuggestionUseCase {
    public static final int $stable = 8;
    private final ConversationRepository conversationRepository;
    private final IntercomDataLayer intercomDataLayer;
    private final SoundEffectsUseCase soundEffectsUseCase;
    private final UserIdentity userIdentity;

    public SendSuggestionUseCase(ConversationRepository conversationRepository, SoundEffectsUseCase soundEffectsUseCase, UserIdentity userIdentity, IntercomDataLayer intercomDataLayer) {
        Intrinsics.checkNotNullParameter(conversationRepository, "conversationRepository");
        Intrinsics.checkNotNullParameter(soundEffectsUseCase, "soundEffectsUseCase");
        Intrinsics.checkNotNullParameter(userIdentity, "userIdentity");
        Intrinsics.checkNotNullParameter(intercomDataLayer, "intercomDataLayer");
        this.conversationRepository = conversationRepository;
        this.soundEffectsUseCase = soundEffectsUseCase;
        this.userIdentity = userIdentity;
        this.intercomDataLayer = intercomDataLayer;
    }

    public /* synthetic */ SendSuggestionUseCase(ConversationRepository conversationRepository, SoundEffectsUseCase soundEffectsUseCase, UserIdentity userIdentity, IntercomDataLayer intercomDataLayer, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(conversationRepository, soundEffectsUseCase, (i & 4) != 0 ? Injector.get().getUserIdentity() : userIdentity, (i & 8) != 0 ? Injector.get().getDataLayer() : intercomDataLayer);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(MutableStateFlow<ConversationClientState> mutableStateFlow, ReplySuggestion replySuggestion, Continuation<? super Unit> continuation) {
        SendSuggestionUseCase$invoke$1 sendSuggestionUseCase$invoke$1;
        int i;
        ConversationClientState value;
        ConversationClientState conversationClientState;
        LinkedHashMap linkedHashMap;
        SendSuggestionUseCase sendSuggestionUseCase;
        NetworkResponse networkResponse;
        ConversationClientState value2;
        MutableStateFlow<ConversationClientState> mutableStateFlow2 = mutableStateFlow;
        if (continuation instanceof SendSuggestionUseCase$invoke$1) {
            sendSuggestionUseCase$invoke$1 = (SendSuggestionUseCase$invoke$1) continuation;
            if ((sendSuggestionUseCase$invoke$1.label & Integer.MIN_VALUE) != 0) {
                sendSuggestionUseCase$invoke$1.label -= Integer.MIN_VALUE;
                Object obj = sendSuggestionUseCase$invoke$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = sendSuggestionUseCase$invoke$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    BlockFactory blockFactory = new BlockFactory(new TextSplittingStrategy());
                    String uuid = UUID.randomUUID().toString();
                    Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
                    do {
                        value = mutableStateFlow2.getValue();
                        conversationClientState = value;
                        linkedHashMap = new LinkedHashMap();
                        linkedHashMap.putAll(conversationClientState.getPendingMessages());
                        Part build = new Part.Builder().withBlocks(blockFactory.getBlocksForText(replySuggestion.getText())).withClientAssignedUuid(uuid).build();
                        build.setParticipant(new Participant.Builder().withId(this.userIdentity.getIntercomId()).build());
                        build.setMessageState(Part.MessageState.SENDING);
                        Unit unit = Unit.INSTANCE;
                        Intrinsics.checkNotNullExpressionValue(build, "apply(...)");
                        linkedHashMap.put(uuid, new PendingMessage(build, false, null, 4, null));
                    } while (!mutableStateFlow2.compareAndSet(value, ConversationClientState.copy$default(conversationClientState, linkedHashMap, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, null, null, false, false, null, null, 4194302, null)));
                    if (mutableStateFlow2.getValue().getConversation() == null) {
                        ConversationRepository conversationRepository = this.conversationRepository;
                        String id = replySuggestion.getId();
                        OpenMessengerResponse openResponse = this.intercomDataLayer.getOpenResponse();
                        String requestId = openResponse != null ? openResponse.getRequestId() : null;
                        sendSuggestionUseCase$invoke$1.L$0 = this;
                        sendSuggestionUseCase$invoke$1.L$1 = mutableStateFlow2;
                        sendSuggestionUseCase$invoke$1.label = 1;
                        obj = conversationRepository.createConversationFromSuggestion(id, requestId, sendSuggestionUseCase$invoke$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        sendSuggestionUseCase = this;
                    }
                    return Unit.INSTANCE;
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                mutableStateFlow2 = (MutableStateFlow) sendSuggestionUseCase$invoke$1.L$1;
                sendSuggestionUseCase = (SendSuggestionUseCase) sendSuggestionUseCase$invoke$1.L$0;
                ResultKt.throwOnFailure(obj);
                networkResponse = (NetworkResponse) obj;
                if (!(networkResponse instanceof NetworkResponse.ClientError) || (networkResponse instanceof NetworkResponse.NetworkError) || (networkResponse instanceof NetworkResponse.ServerError)) {
                    sendSuggestionUseCase.soundEffectsUseCase.invoke$intercom_sdk_base_release(Action.MESSAGE_FAILED);
                } else {
                    if (!(networkResponse instanceof NetworkResponse.Success)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    sendSuggestionUseCase.soundEffectsUseCase.invoke$intercom_sdk_base_release(Action.MESSAGE_SENT);
                    Conversation conversation = (Conversation) ((NetworkResponse.Success) networkResponse).getBody();
                    do {
                        value2 = mutableStateFlow2.getValue();
                    } while (!mutableStateFlow2.compareAndSet(value2, ConversationClientState.copy$default(value2, MapsKt.emptyMap(), conversation, conversation.getId(), null, null, null, null, null, null, null, null, null, null, null, 0, 0, null, null, false, false, null, null, 4194296, null)));
                }
                return Unit.INSTANCE;
            }
        }
        sendSuggestionUseCase$invoke$1 = new SendSuggestionUseCase$invoke$1(this, continuation);
        Object obj2 = sendSuggestionUseCase$invoke$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = sendSuggestionUseCase$invoke$1.label;
        if (i != 0) {
        }
        networkResponse = (NetworkResponse) obj2;
        if (!(networkResponse instanceof NetworkResponse.ClientError)) {
        }
        sendSuggestionUseCase.soundEffectsUseCase.invoke$intercom_sdk_base_release(Action.MESSAGE_FAILED);
        return Unit.INSTANCE;
    }
}
