package io.intercom.android.sdk.m5.conversation.usecase;

import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.m5.conversation.states.ConversationClientState;
import io.intercom.android.sdk.m5.conversation.states.PushNotificationsBannerState;
import io.intercom.android.sdk.m5.data.IntercomDataLayer;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;

/* compiled from: PushNotificationsBannerUseCase.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0001\u0018\u00002\u00020\u0001B!\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0086\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/usecase/PushNotificationsBannerUseCase;", "", "intercomDataLayer", "Lio/intercom/android/sdk/m5/data/IntercomDataLayer;", "config", "Lkotlin/Function0;", "Lio/intercom/android/sdk/identity/AppConfig;", "<init>", "(Lio/intercom/android/sdk/m5/data/IntercomDataLayer;Lkotlin/jvm/functions/Function0;)V", "invoke", "", "clientState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lio/intercom/android/sdk/m5/conversation/states/ConversationClientState;", "arePushNotificationsEnabled", "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class PushNotificationsBannerUseCase {
    public static final int $stable = 8;
    private final Function0<AppConfig> config;
    private final IntercomDataLayer intercomDataLayer;

    /* JADX WARN: Multi-variable type inference failed */
    public PushNotificationsBannerUseCase() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public PushNotificationsBannerUseCase(IntercomDataLayer intercomDataLayer, Function0<AppConfig> config) {
        Intrinsics.checkNotNullParameter(intercomDataLayer, "intercomDataLayer");
        Intrinsics.checkNotNullParameter(config, "config");
        this.intercomDataLayer = intercomDataLayer;
        this.config = config;
    }

    public /* synthetic */ PushNotificationsBannerUseCase(IntercomDataLayer intercomDataLayer, Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Injector.get().getDataLayer() : intercomDataLayer, (i & 2) != 0 ? new Function0() { // from class: io.intercom.android.sdk.m5.conversation.usecase.PushNotificationsBannerUseCase$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                AppConfig _init_$lambda$0;
                _init_$lambda$0 = PushNotificationsBannerUseCase._init_$lambda$0();
                return _init_$lambda$0;
            }
        } : function0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AppConfig _init_$lambda$0() {
        return Injector.get().getAppConfigProvider().get();
    }

    public final void invoke(MutableStateFlow<ConversationClientState> clientState, boolean arePushNotificationsEnabled) {
        ConversationClientState value;
        Intrinsics.checkNotNullParameter(clientState, "clientState");
        do {
            value = clientState.getValue();
        } while (!clientState.compareAndSet(value, ConversationClientState.copy$default(value, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, null, null, false, false, (arePushNotificationsEnabled || this.intercomDataLayer.getPushNotificationsBannerDismissed().getValue().booleanValue()) ? null : new PushNotificationsBannerState(this.config.invoke().getAskUsersToAllowNotifications()), null, 3145727, null)));
    }
}
