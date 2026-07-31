package io.intercom.android.sdk.push;

import android.app.Application;
import android.app.TaskStackBuilder;
import android.content.Context;
import android.os.Bundle;
import androidx.media3.common.MimeTypes;
import com.intercom.twig.Twig;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.api.Api;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.identity.UserIdentity;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.m5.push.IntercomPushClientHandler;
import io.intercom.android.sdk.utilities.ContextLocaliser;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: IntercomPushClient.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\t\b\u0016¢\u0006\u0004\b\u0006\u0010\bJ\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u0016\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0011J\"\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\u0012J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u0011J\u001a\u0010\u0013\u001a\u00020\u00142\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\u0012J\u001e\u0010\u0015\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0017J*\u0010\u0015\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\u00122\u0006\u0010\u0016\u001a\u00020\u0017J\u001c\u0010\u0018\u001a\u00020\u00112\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\u0012H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lio/intercom/android/sdk/push/IntercomPushClient;", "", "twig", "Lcom/intercom/twig/Twig;", "pushHandler", "Lio/intercom/android/sdk/m5/push/IntercomPushClientHandler;", "<init>", "(Lcom/intercom/twig/Twig;Lio/intercom/android/sdk/m5/push/IntercomPushClientHandler;)V", "()V", "sendTokenToIntercom", "", MimeTypes.BASE_TYPE_APPLICATION, "Landroid/app/Application;", "token", "", "handlePush", "message", "Landroid/os/Bundle;", "", "isIntercomPush", "", "handlePushWithCustomStack", "customStack", "Landroid/app/TaskStackBuilder;", "convertMessageMapToBundle", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class IntercomPushClient {
    public static final int $stable = 8;
    private final IntercomPushClientHandler pushHandler;
    private final Twig twig;

    public IntercomPushClient(Twig twig, IntercomPushClientHandler pushHandler) {
        Intrinsics.checkNotNullParameter(twig, "twig");
        Intrinsics.checkNotNullParameter(pushHandler, "pushHandler");
        this.twig = twig;
        this.pushHandler = pushHandler;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public IntercomPushClient() {
        this(r0, new IntercomPushClientHandler());
        Twig logger = LumberMill.getLogger();
        Intrinsics.checkNotNullExpressionValue(logger, "getLogger(...)");
    }

    public final void sendTokenToIntercom(Application application, String token) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(token, "token");
        if (StringsKt.isBlank(token)) {
            this.twig.e("sendTokenToIntercom() was called with a null or empty token. This user will not receive push notifications until a valid device token is sent.", new Object[0]);
            return;
        }
        Injector.initIfCachedCredentials(application);
        if (Injector.isNotInitialised()) {
            this.twig.w("Token not sent because Intercom is not initialised", new Object[0]);
            return;
        }
        Injector injector = Injector.get();
        Application application2 = application;
        if (this.pushHandler.shouldSendDeviceToken(application2, token)) {
            IntercomPushClientHandler intercomPushClientHandler = this.pushHandler;
            Api api = injector.getApi();
            Intrinsics.checkNotNullExpressionValue(api, "getApi(...)");
            UserIdentity userIdentity = injector.getUserIdentity();
            Intrinsics.checkNotNullExpressionValue(userIdentity, "getUserIdentity(...)");
            Provider<AppConfig> appConfigProvider = injector.getAppConfigProvider();
            Intrinsics.checkNotNullExpressionValue(appConfigProvider, "getAppConfigProvider(...)");
            intercomPushClientHandler.sendTokenToIntercom(application2, token, api, userIdentity, appConfigProvider);
        }
    }

    public final void handlePush(Application application, Bundle message) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(message, "message");
        if (!isIntercomPush(message)) {
            this.twig.i("The message passed to handlePush() was not an Intercom push message.", new Object[0]);
            return;
        }
        Injector.initIfCachedCredentials(application);
        if (Injector.isNotInitialised()) {
            this.twig.w("Push not handled because Intercom is not initialised", new Object[0]);
            return;
        }
        Injector injector = Injector.get();
        Context createLocalisedContext = new ContextLocaliser(injector.getAppConfigProvider()).createLocalisedContext(application);
        IntercomPushClientHandler.Companion companion = IntercomPushClientHandler.INSTANCE;
        Intrinsics.checkNotNull(createLocalisedContext);
        companion.setUpNotificationChannels(createLocalisedContext);
        IntercomPushClientHandler intercomPushClientHandler = this.pushHandler;
        UserIdentity userIdentity = injector.getUserIdentity();
        Intrinsics.checkNotNullExpressionValue(userIdentity, "getUserIdentity(...)");
        IntercomPushClientHandler.handlePush$default(intercomPushClientHandler, message, createLocalisedContext, userIdentity, null, 8, null);
    }

    public final void handlePush(Application application, Map<String, String> message) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(message, "message");
        handlePush(application, convertMessageMapToBundle(message));
    }

    public final boolean isIntercomPush(Bundle message) {
        Intrinsics.checkNotNullParameter(message, "message");
        return this.pushHandler.isIntercomPush(message);
    }

    public final boolean isIntercomPush(Map<String, String> message) {
        Intrinsics.checkNotNullParameter(message, "message");
        return isIntercomPush(convertMessageMapToBundle(message));
    }

    public final void handlePushWithCustomStack(Application application, Bundle message, TaskStackBuilder customStack) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(customStack, "customStack");
        if (!isIntercomPush(message)) {
            this.twig.i("The message passed to handlePush() was not an Intercom push message.", new Object[0]);
            return;
        }
        Injector.initIfCachedCredentials(application);
        if (Injector.isNotInitialised()) {
            this.twig.w("Push not handled because Intercom is not initialised", new Object[0]);
            return;
        }
        Injector injector = Injector.get();
        Context createLocalisedContext = new ContextLocaliser(injector.getAppConfigProvider()).createLocalisedContext(application);
        IntercomPushClientHandler.Companion companion = IntercomPushClientHandler.INSTANCE;
        Intrinsics.checkNotNull(createLocalisedContext);
        companion.setUpNotificationChannels(createLocalisedContext);
        IntercomPushClientHandler intercomPushClientHandler = this.pushHandler;
        UserIdentity userIdentity = injector.getUserIdentity();
        Intrinsics.checkNotNullExpressionValue(userIdentity, "getUserIdentity(...)");
        intercomPushClientHandler.handlePush(message, createLocalisedContext, userIdentity, customStack);
    }

    public final void handlePushWithCustomStack(Application application, Map<String, String> message, TaskStackBuilder customStack) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(customStack, "customStack");
        handlePushWithCustomStack(application, convertMessageMapToBundle(message), customStack);
    }

    private final Bundle convertMessageMapToBundle(Map<String, String> message) {
        Bundle bundle = new Bundle(message.size());
        for (Map.Entry<String, String> entry : message.entrySet()) {
            bundle.putString(entry.getKey(), entry.getValue());
        }
        return bundle;
    }
}
