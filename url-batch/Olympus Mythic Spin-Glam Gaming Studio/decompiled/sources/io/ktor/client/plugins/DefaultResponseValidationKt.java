package io.ktor.client.plugins;

import io.ktor.client.HttpClientConfig;
import io.ktor.util.AttributeKey;
import io.ktor.util.logging.KtorSimpleLoggerJvmKt;
import io.ktor.util.reflect.TypeInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import org.slf4j.Logger;

/* compiled from: DefaultResponseValidation.kt */
/* loaded from: classes15.dex */
public abstract class DefaultResponseValidationKt {
    private static final Logger LOGGER;
    private static final AttributeKey ValidateMark;

    public static final void addDefaultResponseValidation(final HttpClientConfig httpClientConfig) {
        Intrinsics.checkNotNullParameter(httpClientConfig, "<this>");
        HttpCallValidatorKt.HttpResponseValidator(httpClientConfig, new Function1() { // from class: io.ktor.client.plugins.DefaultResponseValidationKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit addDefaultResponseValidation$lambda$0;
                addDefaultResponseValidation$lambda$0 = DefaultResponseValidationKt.addDefaultResponseValidation$lambda$0(HttpClientConfig.this, (HttpCallValidatorConfig) obj);
                return addDefaultResponseValidation$lambda$0;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit addDefaultResponseValidation$lambda$0(HttpClientConfig httpClientConfig, HttpCallValidatorConfig HttpResponseValidator) {
        Intrinsics.checkNotNullParameter(HttpResponseValidator, "$this$HttpResponseValidator");
        HttpResponseValidator.setExpectSuccess$ktor_client_core(httpClientConfig.getExpectSuccess());
        HttpResponseValidator.validateResponse(new DefaultResponseValidationKt$addDefaultResponseValidation$1$1(null));
        return Unit.INSTANCE;
    }

    static {
        KType kType;
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Unit.class);
        try {
            kType = Reflection.typeOf(Unit.class);
        } catch (Throwable unused) {
            kType = null;
        }
        ValidateMark = new AttributeKey("ValidateMark", new TypeInfo(orCreateKotlinClass, kType));
        LOGGER = KtorSimpleLoggerJvmKt.KtorSimpleLogger("io.ktor.client.plugins.DefaultResponseValidation");
    }
}
