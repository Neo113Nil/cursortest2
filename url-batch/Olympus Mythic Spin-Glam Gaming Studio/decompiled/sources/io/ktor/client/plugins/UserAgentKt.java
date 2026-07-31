package io.ktor.client.plugins;

import io.ktor.client.plugins.api.ClientPlugin;
import io.ktor.client.plugins.api.ClientPluginBuilder;
import io.ktor.client.plugins.api.CreatePluginUtilsKt;
import io.ktor.util.logging.KtorSimpleLoggerJvmKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.slf4j.Logger;

/* compiled from: UserAgent.kt */
/* loaded from: classes11.dex */
public abstract class UserAgentKt {
    private static final Logger LOGGER = KtorSimpleLoggerJvmKt.KtorSimpleLogger("io.ktor.client.plugins.UserAgent");
    private static final ClientPlugin UserAgent = CreatePluginUtilsKt.createClientPlugin("UserAgent", UserAgentKt$UserAgent$2.INSTANCE, new Function1() { // from class: io.ktor.client.plugins.UserAgentKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            Unit UserAgent$lambda$1;
            UserAgent$lambda$1 = UserAgentKt.UserAgent$lambda$1((ClientPluginBuilder) obj);
            return UserAgent$lambda$1;
        }
    });

    public static final ClientPlugin getUserAgent() {
        return UserAgent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UserAgent$lambda$1(ClientPluginBuilder createClientPlugin) {
        Intrinsics.checkNotNullParameter(createClientPlugin, "$this$createClientPlugin");
        createClientPlugin.onRequest(new UserAgentKt$UserAgent$3$1(((UserAgentConfig) createClientPlugin.getPluginConfig()).getAgent(), null));
        return Unit.INSTANCE;
    }
}
