package io.intercom.android.sdk.api;

import com.intercom.twig.Twig;
import io.intercom.android.sdk.identity.UserIdentity;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.m5.data.IntercomDataLayer;
import io.intercom.android.sdk.m5.data.IntercomEvent;
import io.intercom.android.sdk.metrics.UnreadConversationsTracker;
import io.intercom.android.sdk.models.LogEventResponse;
import io.intercom.android.sdk.models.UsersResponse;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* loaded from: classes8.dex */
class CallbackHolder {
    private static final Twig TWIG = LumberMill.getLogger();
    final IntercomDataLayer dataLayer;
    private final UnreadConversationsTracker unreadConversationsTracker;
    private final UserIdentity userIdentity;

    CallbackHolder(IntercomDataLayer intercomDataLayer, UserIdentity userIdentity, UnreadConversationsTracker unreadConversationsTracker) {
        this.dataLayer = intercomDataLayer;
        this.userIdentity = userIdentity;
        this.unreadConversationsTracker = unreadConversationsTracker;
    }

    BaseCallback<LogEventResponse.Builder> logEventCallback() {
        return new BaseCallback<LogEventResponse.Builder>() { // from class: io.intercom.android.sdk.api.CallbackHolder.1
            @Override // io.intercom.android.sdk.api.BaseCallback
            public void onSuccess(LogEventResponse.Builder builder) {
                LogEventResponse build = builder.build();
                CallbackHolder.this.dataLayer.emitEvent(new IntercomEvent.BaseResponseReceived(build));
                CallbackHolder.this.unreadConversationsTracker.track(build);
                CallbackHolder.this.userIdentity.update(build.getUser());
                CallbackHolder.this.dataLayer.updateConfig(build.getConfig());
                CallbackHolder.this.dataLayer.updateCarousel(build.getCarousel());
                CallbackHolder.this.dataLayer.updateOverlayConversations(build.getUnreadConversations().getConversations());
                CallbackHolder.this.dataLayer.updateUnreadConversationIds(build.getUnreadConversations().getUnreadConversationIds());
            }
        };
    }

    BaseCallback<UsersResponse.Builder> unreadCallback() {
        return new BaseCallback<UsersResponse.Builder>() { // from class: io.intercom.android.sdk.api.CallbackHolder.2
            @Override // io.intercom.android.sdk.api.BaseCallback
            public void onSuccess(UsersResponse.Builder builder) {
                UsersResponse build = builder.build();
                CallbackHolder.this.dataLayer.emitEvent(new IntercomEvent.BaseResponseReceived(build));
                CallbackHolder.this.unreadConversationsTracker.track(build);
                CallbackHolder.this.userIdentity.update(build.getUser());
                CallbackHolder.this.dataLayer.updateConfig(build.getConfig());
                CallbackHolder.this.dataLayer.updateOverlayConversations(build.getUnreadConversations().getConversations());
                CallbackHolder.this.dataLayer.updateUnreadConversationIds(build.getUnreadConversations().getUnreadConversationIds());
            }
        };
    }

    Callback<Void> loggingCallback(final String str) {
        return new Callback<Void>() { // from class: io.intercom.android.sdk.api.CallbackHolder.3
            @Override // retrofit2.Callback
            public void onResponse(Call<Void> call, Response<Void> response) {
                CallbackHolder.TWIG.internal(str + " success");
            }

            @Override // retrofit2.Callback
            public void onFailure(Call<Void> call, Throwable th) {
                CallbackHolder.TWIG.internal(str + " failure");
            }
        };
    }
}
