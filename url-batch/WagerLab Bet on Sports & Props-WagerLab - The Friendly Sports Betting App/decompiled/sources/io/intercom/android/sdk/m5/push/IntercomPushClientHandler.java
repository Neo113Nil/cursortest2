package io.intercom.android.sdk.m5.push;

import android.app.TaskStackBuilder;
import android.content.Context;
import android.os.Bundle;
import com.intercom.twig.Twig;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.api.Api;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.identity.UserIdentity;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.user.DeviceData;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: IntercomPushClientHandler.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000  2\u00020\u0001:\u0001 B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ4\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015J*\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00132\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001cJ\u000e\u0010\u001d\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0019J\u0018\u0010\u001e\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020\u0016H\u0002R\u0018\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0007¨\u0006!"}, d2 = {"Lio/intercom/android/sdk/m5/push/IntercomPushClientHandler;", "", "<init>", "()V", "twig", "Lcom/intercom/twig/Twig;", "kotlin.jvm.PlatformType", "Lcom/intercom/twig/Twig;", "shouldSendDeviceToken", "", "context", "Landroid/content/Context;", "token", "", "sendTokenToIntercom", "", MetricTracker.Place.API, "Lio/intercom/android/sdk/api/Api;", "userIdentity", "Lio/intercom/android/sdk/identity/UserIdentity;", "appConfigProvider", "Lio/intercom/android/sdk/Provider;", "Lio/intercom/android/sdk/identity/AppConfig;", "handlePush", "message", "Landroid/os/Bundle;", "localisedContext", "customStack", "Landroid/app/TaskStackBuilder;", "isIntercomPush", "hasUserHashIfNeeded", "appConfig", "Companion", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class IntercomPushClientHandler {
    private final Twig twig = LumberMill.getLogger();

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public final boolean shouldSendDeviceToken(Context context, String token) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(token, "token");
        return !DeviceData.hasCachedDeviceToken(context, token);
    }

    public final void sendTokenToIntercom(Context context, String token, Api api, UserIdentity userIdentity, Provider<AppConfig> appConfigProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(userIdentity, "userIdentity");
        Intrinsics.checkNotNullParameter(appConfigProvider, "appConfigProvider");
        if (userIdentity.identityExists()) {
            AppConfig appConfig = appConfigProvider.get();
            Intrinsics.checkNotNullExpressionValue(appConfig, "get(...)");
            if (hasUserHashIfNeeded(userIdentity, appConfig)) {
                api.setDeviceToken(token);
            }
        }
        DeviceData.cacheDeviceToken(context, token);
    }

    public static /* synthetic */ void handlePush$default(IntercomPushClientHandler intercomPushClientHandler, Bundle bundle, Context context, UserIdentity userIdentity, TaskStackBuilder taskStackBuilder, int i, Object obj) {
        if ((i & 8) != 0) {
            taskStackBuilder = null;
        }
        intercomPushClientHandler.handlePush(bundle, context, userIdentity, taskStackBuilder);
    }

    public final void handlePush(Bundle message, Context localisedContext, UserIdentity userIdentity, TaskStackBuilder customStack) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(localisedContext, "localisedContext");
        Intrinsics.checkNotNullParameter(userIdentity, "userIdentity");
        IntercomPushData createFrom = IntercomPushData.INSTANCE.createFrom(localisedContext, message);
        if (createFrom == null) {
            this.twig.i("This is not an Intercom push message", new Object[0]);
        } else if (!userIdentity.identityExists()) {
            this.twig.i("Can't create push message as we have no user identity. This can be caused by messages being sent to a logged out user.", new Object[0]);
            IntercomNotificationHandler.INSTANCE.clear(localisedContext);
        } else {
            IntercomNotificationHandler.processIntercomPushNotification$intercom_sdk_base_release$default(IntercomNotificationHandler.INSTANCE, localisedContext, createFrom, customStack, null, 8, null);
        }
    }

    public final boolean isIntercomPush(Bundle message) {
        Intrinsics.checkNotNullParameter(message, "message");
        return IntercomPushData.INSTANCE.isIntercomPush(message);
    }

    private final boolean hasUserHashIfNeeded(UserIdentity userIdentity, AppConfig appConfig) {
        if (!appConfig.isReceivedFromServer()) {
            return false;
        }
        if (!appConfig.isIdentityVerificationEnabled()) {
            return true;
        }
        if (!appConfig.isIdentityVerificationEnabled()) {
            return false;
        }
        String hmac = userIdentity.getHmac();
        Intrinsics.checkNotNullExpressionValue(hmac, "getHmac(...)");
        return !StringsKt.isBlank(hmac);
    }

    /* compiled from: IntercomPushClientHandler.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\t"}, d2 = {"Lio/intercom/android/sdk/m5/push/IntercomPushClientHandler$Companion;", "", "<init>", "()V", "clear", "", "context", "Landroid/content/Context;", "setUpNotificationChannels", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final void clear(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            IntercomNotificationHandler.INSTANCE.clear(context);
        }

        public final void setUpNotificationChannels(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            IntercomNotificationHandler.INSTANCE.setUpNotificationChannels$intercom_sdk_base_release(context);
        }
    }
}
