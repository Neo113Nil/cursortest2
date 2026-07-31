package io.ktor.client.plugins;

import io.ktor.client.plugins.api.ClientPlugin;
import io.ktor.client.plugins.api.ClientPluginBuilder;
import io.ktor.client.plugins.api.CreatePluginUtilsKt;
import io.ktor.client.statement.HttpReceivePipeline;
import io.ktor.client.statement.HttpResponse;
import io.ktor.util.AttributeKey;
import io.ktor.util.logging.KtorSimpleLoggerJvmKt;
import io.ktor.util.reflect.TypeInfo;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import org.slf4j.Logger;

/* compiled from: SaveBody.kt */
/* loaded from: classes15.dex */
public abstract class DoubleReceivePluginKt {
    private static final Lazy LOGGER$delegate;
    private static final AttributeKey RESPONSE_BODY_SAVED;
    private static final AttributeKey SKIP_SAVE_BODY;
    private static final ClientPlugin SaveBody;
    private static final ClientPlugin SaveBodyPlugin;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Logger LOGGER_delegate$lambda$0() {
        return KtorSimpleLoggerJvmKt.KtorSimpleLogger("io.ktor.client.plugins.SaveBody");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Logger getLOGGER() {
        return (Logger) LOGGER$delegate.getValue();
    }

    public static final ClientPlugin getSaveBody() {
        return SaveBody;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SaveBody$lambda$1(ClientPluginBuilder createClientPlugin) {
        Intrinsics.checkNotNullParameter(createClientPlugin, "$this$createClientPlugin");
        createClientPlugin.getClient().getReceivePipeline().intercept(HttpReceivePipeline.Phases.getBefore(), new DoubleReceivePluginKt$SaveBody$1$1(null));
        return Unit.INSTANCE;
    }

    static {
        KType kType;
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Unit.class);
        KType kType2 = null;
        try {
            kType = Reflection.typeOf(Unit.class);
        } catch (Throwable unused) {
            kType = null;
        }
        SKIP_SAVE_BODY = new AttributeKey("SkipSaveBody", new TypeInfo(orCreateKotlinClass, kType));
        KClass orCreateKotlinClass2 = Reflection.getOrCreateKotlinClass(Unit.class);
        try {
            kType2 = Reflection.typeOf(Unit.class);
        } catch (Throwable unused2) {
        }
        RESPONSE_BODY_SAVED = new AttributeKey("ResponseBodySaved", new TypeInfo(orCreateKotlinClass2, kType2));
        LOGGER$delegate = LazyKt.lazy(new Function0() { // from class: io.ktor.client.plugins.DoubleReceivePluginKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                Logger LOGGER_delegate$lambda$0;
                LOGGER_delegate$lambda$0 = DoubleReceivePluginKt.LOGGER_delegate$lambda$0();
                return LOGGER_delegate$lambda$0;
            }
        });
        SaveBody = CreatePluginUtilsKt.createClientPlugin("SaveBody", new Function1() { // from class: io.ktor.client.plugins.DoubleReceivePluginKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit SaveBody$lambda$1;
                SaveBody$lambda$1 = DoubleReceivePluginKt.SaveBody$lambda$1((ClientPluginBuilder) obj);
                return SaveBody$lambda$1;
            }
        });
        SaveBodyPlugin = CreatePluginUtilsKt.createClientPlugin("DoubleReceivePlugin", DoubleReceivePluginKt$SaveBodyPlugin$1.INSTANCE, new Function1() { // from class: io.ktor.client.plugins.DoubleReceivePluginKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit SaveBodyPlugin$lambda$2;
                SaveBodyPlugin$lambda$2 = DoubleReceivePluginKt.SaveBodyPlugin$lambda$2((ClientPluginBuilder) obj);
                return SaveBodyPlugin$lambda$2;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SaveBodyPlugin$lambda$2(ClientPluginBuilder createClientPlugin) {
        Intrinsics.checkNotNullParameter(createClientPlugin, "$this$createClientPlugin");
        if (((SaveBodyPluginConfig) createClientPlugin.getPluginConfig()).getDisabled()) {
            getLOGGER().warn("It is no longer possible to disable body saving for all requests. Use client.prepareRequest(...).execute { ... } syntax to prevent saving the body in memory.\n\nThis API is deprecated and will be removed in Ktor 4.0.0\nIf you were relying on this functionality, share your use case by commenting on this issue: https://youtrack.jetbrains.com/issue/KTOR-8367/");
        } else {
            getLOGGER().warn("The SaveBodyPlugin plugin is deprecated and can be safely removed. Request bodies are now saved in memory by default for all non-streaming responses.");
        }
        return Unit.INSTANCE;
    }

    public static final boolean isSaved(HttpResponse httpResponse) {
        Intrinsics.checkNotNullParameter(httpResponse, "<this>");
        return httpResponse.getCall().getAttributes().contains(RESPONSE_BODY_SAVED);
    }
}
