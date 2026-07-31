package io.ktor.client.plugins;

import io.ktor.client.HttpClientConfig;
import io.ktor.client.plugins.DefaultRequest;
import io.ktor.util.logging.KtorSimpleLoggerJvmKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.slf4j.Logger;

/* compiled from: DefaultRequest.kt */
/* loaded from: classes6.dex */
public abstract class DefaultRequestKt {
    private static final Logger LOGGER = KtorSimpleLoggerJvmKt.KtorSimpleLogger("io.ktor.client.plugins.DefaultRequest");

    public static final void defaultRequest(HttpClientConfig httpClientConfig, final Function1 block) {
        Intrinsics.checkNotNullParameter(httpClientConfig, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        httpClientConfig.install(DefaultRequest.Plugin, new Function1() { // from class: io.ktor.client.plugins.DefaultRequestKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit defaultRequest$lambda$0;
                defaultRequest$lambda$0 = DefaultRequestKt.defaultRequest$lambda$0(Function1.this, (DefaultRequest.DefaultRequestBuilder) obj);
                return defaultRequest$lambda$0;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit defaultRequest$lambda$0(Function1 function1, DefaultRequest.DefaultRequestBuilder install) {
        Intrinsics.checkNotNullParameter(install, "$this$install");
        function1.invoke(install);
        return Unit.INSTANCE;
    }
}
