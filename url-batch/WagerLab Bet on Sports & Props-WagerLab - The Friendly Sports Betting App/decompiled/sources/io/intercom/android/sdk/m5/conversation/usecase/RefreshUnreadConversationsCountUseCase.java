package io.intercom.android.sdk.m5.conversation.usecase;

import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.api.MessengerApi;
import io.intercom.android.sdk.m5.conversation.states.ConversationClientState;
import io.intercom.android.sdk.m5.conversation.states.LaunchMode;
import io.intercom.android.sdk.m5.data.CommonRepository;
import io.intercom.android.sdk.m5.data.IntercomDataLayer;
import io.intercom.android.sdk.models.Config;
import io.intercom.android.sdk.models.UsersResponse;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;

/* compiled from: RefreshUnreadConversationsCountUseCase.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0086B¢\u0006\u0002\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/usecase/RefreshUnreadConversationsCountUseCase;", "", "commonRepository", "Lio/intercom/android/sdk/m5/data/CommonRepository;", "intercomDataLayer", "Lio/intercom/android/sdk/m5/data/IntercomDataLayer;", "<init>", "(Lio/intercom/android/sdk/m5/data/CommonRepository;Lio/intercom/android/sdk/m5/data/IntercomDataLayer;)V", "invoke", "", "clientStateFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lio/intercom/android/sdk/m5/conversation/states/ConversationClientState;", "(Lkotlinx/coroutines/flow/MutableStateFlow;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class RefreshUnreadConversationsCountUseCase {
    public static final int $stable = 8;
    private final CommonRepository commonRepository;
    private final IntercomDataLayer intercomDataLayer;

    /* JADX WARN: Multi-variable type inference failed */
    public RefreshUnreadConversationsCountUseCase() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public RefreshUnreadConversationsCountUseCase(CommonRepository commonRepository, IntercomDataLayer intercomDataLayer) {
        Intrinsics.checkNotNullParameter(commonRepository, "commonRepository");
        Intrinsics.checkNotNullParameter(intercomDataLayer, "intercomDataLayer");
        this.commonRepository = commonRepository;
        this.intercomDataLayer = intercomDataLayer;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ RefreshUnreadConversationsCountUseCase(CommonRepository commonRepository, IntercomDataLayer intercomDataLayer, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(commonRepository, (i & 2) != 0 ? Injector.get().getDataLayer() : intercomDataLayer);
        if ((i & 1) != 0) {
            MessengerApi messengerApi = Injector.get().getMessengerApi();
            Intrinsics.checkNotNullExpressionValue(messengerApi, "getMessengerApi(...)");
            IntercomDataLayer dataLayer = Injector.get().getDataLayer();
            Intrinsics.checkNotNullExpressionValue(dataLayer, "getDataLayer(...)");
            commonRepository = new CommonRepository(messengerApi, dataLayer);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(MutableStateFlow<ConversationClientState> mutableStateFlow, Continuation<? super Unit> continuation) {
        RefreshUnreadConversationsCountUseCase$invoke$1 refreshUnreadConversationsCountUseCase$invoke$1;
        int i;
        RefreshUnreadConversationsCountUseCase refreshUnreadConversationsCountUseCase;
        MutableStateFlow<ConversationClientState> mutableStateFlow2;
        UsersResponse usersResponse;
        ConversationClientState value;
        if (continuation instanceof RefreshUnreadConversationsCountUseCase$invoke$1) {
            refreshUnreadConversationsCountUseCase$invoke$1 = (RefreshUnreadConversationsCountUseCase$invoke$1) continuation;
            if ((refreshUnreadConversationsCountUseCase$invoke$1.label & Integer.MIN_VALUE) != 0) {
                refreshUnreadConversationsCountUseCase$invoke$1.label -= Integer.MIN_VALUE;
                Object obj = refreshUnreadConversationsCountUseCase$invoke$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = refreshUnreadConversationsCountUseCase$invoke$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (mutableStateFlow.getValue().getLaunchMode() == LaunchMode.PROGRAMMATIC) {
                        CommonRepository commonRepository = this.commonRepository;
                        refreshUnreadConversationsCountUseCase$invoke$1.L$0 = this;
                        refreshUnreadConversationsCountUseCase$invoke$1.L$1 = mutableStateFlow;
                        refreshUnreadConversationsCountUseCase$invoke$1.label = 1;
                        obj = commonRepository.fetchUnreadCounts(refreshUnreadConversationsCountUseCase$invoke$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        refreshUnreadConversationsCountUseCase = this;
                        mutableStateFlow2 = mutableStateFlow;
                    }
                    return Unit.INSTANCE;
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                mutableStateFlow2 = (MutableStateFlow) refreshUnreadConversationsCountUseCase$invoke$1.L$1;
                refreshUnreadConversationsCountUseCase = (RefreshUnreadConversationsCountUseCase) refreshUnreadConversationsCountUseCase$invoke$1.L$0;
                ResultKt.throwOnFailure(obj);
                usersResponse = (UsersResponse) obj;
                if (usersResponse != null) {
                    return Unit.INSTANCE;
                }
                IntercomDataLayer intercomDataLayer = refreshUnreadConversationsCountUseCase.intercomDataLayer;
                Config config = usersResponse.getConfig();
                Intrinsics.checkNotNullExpressionValue(config, "getConfig(...)");
                intercomDataLayer.updateConfig(config);
                do {
                    value = mutableStateFlow2.getValue();
                } while (!mutableStateFlow2.compareAndSet(value, ConversationClientState.copy$default(value, null, null, null, null, null, null, null, null, null, null, null, null, null, null, usersResponse.getUnreadConversations().getUnreadConversationsCount(), usersResponse.getUnreadTickets().getTotalCount(), null, null, false, false, null, null, 4145151, null)));
                return Unit.INSTANCE;
            }
        }
        refreshUnreadConversationsCountUseCase$invoke$1 = new RefreshUnreadConversationsCountUseCase$invoke$1(this, continuation);
        Object obj2 = refreshUnreadConversationsCountUseCase$invoke$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = refreshUnreadConversationsCountUseCase$invoke$1.label;
        if (i != 0) {
        }
        usersResponse = (UsersResponse) obj2;
        if (usersResponse != null) {
        }
    }
}
