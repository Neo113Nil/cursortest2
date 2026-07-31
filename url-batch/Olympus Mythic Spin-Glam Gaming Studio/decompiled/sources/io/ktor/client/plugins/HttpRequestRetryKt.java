package io.ktor.client.plugins;

import io.ktor.client.call.HttpClientCall;
import io.ktor.client.network.sockets.ConnectTimeoutException;
import io.ktor.client.plugins.api.ClientPlugin;
import io.ktor.client.plugins.api.ClientPluginBuilder;
import io.ktor.client.plugins.api.CreatePluginUtilsKt;
import io.ktor.client.plugins.api.Send;
import io.ktor.client.request.HttpRequest;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.client.statement.HttpResponse;
import io.ktor.client.utils.ExceptionUtilsJvmKt;
import io.ktor.events.EventDefinition;
import io.ktor.util.AttributeKey;
import io.ktor.util.logging.KtorSimpleLoggerJvmKt;
import io.ktor.util.reflect.TypeInfo;
import io.ktor.utils.io.ByteReadChannel;
import java.net.SocketTimeoutException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeProjection;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.Job;
import org.slf4j.Logger;

/* compiled from: HttpRequestRetry.kt */
/* loaded from: classes14.dex */
public abstract class HttpRequestRetryKt {
    private static final AttributeKey MaxRetriesPerRequestAttributeKey;
    private static final AttributeKey ModifyRequestPerRequestAttributeKey;
    private static final AttributeKey RetryDelayPerRequestAttributeKey;
    private static final AttributeKey ShouldRetryOnExceptionPerRequestAttributeKey;
    private static final AttributeKey ShouldRetryPerRequestAttributeKey;
    private static final Logger LOGGER = KtorSimpleLoggerJvmKt.KtorSimpleLogger("io.ktor.client.plugins.HttpRequestRetry");
    private static final EventDefinition HttpRequestRetryEvent = new EventDefinition();
    private static final ClientPlugin HttpRequestRetry = CreatePluginUtilsKt.createClientPlugin("RetryFeature", HttpRequestRetryKt$HttpRequestRetry$1.INSTANCE, new Function1() { // from class: io.ktor.client.plugins.HttpRequestRetryKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            Unit HttpRequestRetry$lambda$1;
            HttpRequestRetry$lambda$1 = HttpRequestRetryKt.HttpRequestRetry$lambda$1((ClientPluginBuilder) obj);
            return HttpRequestRetry$lambda$1;
        }
    });

    static {
        KType kType;
        KType kType2;
        KType kType3;
        KType kType4;
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Integer.class);
        KType kType5 = null;
        try {
            kType = Reflection.typeOf(Integer.TYPE);
        } catch (Throwable unused) {
            kType = null;
        }
        MaxRetriesPerRequestAttributeKey = new AttributeKey("MaxRetriesPerRequestAttributeKey", new TypeInfo(orCreateKotlinClass, kType));
        KClass orCreateKotlinClass2 = Reflection.getOrCreateKotlinClass(Function3.class);
        try {
            KTypeProjection.Companion companion = KTypeProjection.INSTANCE;
            kType2 = Reflection.typeOf(Function3.class, companion.invariant(Reflection.typeOf(HttpRetryShouldRetryContext.class)), companion.invariant(Reflection.typeOf(HttpRequest.class)), companion.invariant(Reflection.typeOf(HttpResponse.class)), companion.invariant(Reflection.typeOf(Boolean.TYPE)));
        } catch (Throwable unused2) {
            kType2 = null;
        }
        ShouldRetryPerRequestAttributeKey = new AttributeKey("ShouldRetryPerRequestAttributeKey", new TypeInfo(orCreateKotlinClass2, kType2));
        KClass orCreateKotlinClass3 = Reflection.getOrCreateKotlinClass(Function3.class);
        try {
            KTypeProjection.Companion companion2 = KTypeProjection.INSTANCE;
            kType3 = Reflection.typeOf(Function3.class, companion2.invariant(Reflection.typeOf(HttpRetryShouldRetryContext.class)), companion2.invariant(Reflection.typeOf(HttpRequestBuilder.class)), companion2.invariant(Reflection.typeOf(Throwable.class)), companion2.invariant(Reflection.typeOf(Boolean.TYPE)));
        } catch (Throwable unused3) {
            kType3 = null;
        }
        ShouldRetryOnExceptionPerRequestAttributeKey = new AttributeKey("ShouldRetryOnExceptionPerRequestAttributeKey", new TypeInfo(orCreateKotlinClass3, kType3));
        KClass orCreateKotlinClass4 = Reflection.getOrCreateKotlinClass(Function2.class);
        try {
            KTypeProjection.Companion companion3 = KTypeProjection.INSTANCE;
            kType4 = Reflection.typeOf(Function2.class, companion3.invariant(Reflection.typeOf(HttpRetryModifyRequestContext.class)), companion3.invariant(Reflection.typeOf(HttpRequestBuilder.class)), companion3.invariant(Reflection.typeOf(Unit.class)));
        } catch (Throwable unused4) {
            kType4 = null;
        }
        ModifyRequestPerRequestAttributeKey = new AttributeKey("ModifyRequestPerRequestAttributeKey", new TypeInfo(orCreateKotlinClass4, kType4));
        KClass orCreateKotlinClass5 = Reflection.getOrCreateKotlinClass(Function2.class);
        try {
            KTypeProjection.Companion companion4 = KTypeProjection.INSTANCE;
            kType5 = Reflection.typeOf(Function2.class, companion4.invariant(Reflection.typeOf(HttpRetryDelayContext.class)), companion4.invariant(Reflection.typeOf(Integer.TYPE)), companion4.invariant(Reflection.typeOf(Long.TYPE)));
        } catch (Throwable unused5) {
        }
        RetryDelayPerRequestAttributeKey = new AttributeKey("RetryDelayPerRequestAttributeKey", new TypeInfo(orCreateKotlinClass5, kType5));
    }

    public static final EventDefinition getHttpRequestRetryEvent() {
        return HttpRequestRetryEvent;
    }

    public static final ClientPlugin getHttpRequestRetry() {
        return HttpRequestRetry;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HttpRequestRetry$lambda$1(ClientPluginBuilder createClientPlugin) {
        Intrinsics.checkNotNullParameter(createClientPlugin, "$this$createClientPlugin");
        Function3 shouldRetry$ktor_client_core = ((HttpRequestRetryConfig) createClientPlugin.getPluginConfig()).getShouldRetry$ktor_client_core();
        Function3 shouldRetryOnException$ktor_client_core = ((HttpRequestRetryConfig) createClientPlugin.getPluginConfig()).getShouldRetryOnException$ktor_client_core();
        Function2 delayMillis$ktor_client_core = ((HttpRequestRetryConfig) createClientPlugin.getPluginConfig()).getDelayMillis$ktor_client_core();
        Function2 delay$ktor_client_core = ((HttpRequestRetryConfig) createClientPlugin.getPluginConfig()).getDelay$ktor_client_core();
        createClientPlugin.on(Send.INSTANCE, new HttpRequestRetryKt$HttpRequestRetry$2$1(shouldRetry$ktor_client_core, shouldRetryOnException$ktor_client_core, ((HttpRequestRetryConfig) createClientPlugin.getPluginConfig()).getMaxRetries(), delayMillis$ktor_client_core, ((HttpRequestRetryConfig) createClientPlugin.getPluginConfig()).getModifyRequest(), createClientPlugin, delay$ktor_client_core, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean HttpRequestRetry$lambda$1$shouldRetry(int i, int i2, Function3 function3, HttpClientCall httpClientCall) {
        return i < i2 && ((Boolean) function3.invoke(new HttpRetryShouldRetryContext(i + 1), httpClientCall.getRequest(), httpClientCall.getResponse())).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean HttpRequestRetry$lambda$1$shouldRetryOnException(int i, int i2, Function3 function3, HttpRequestBuilder httpRequestBuilder, Throwable th) {
        return i < i2 && ((Boolean) function3.invoke(new HttpRetryShouldRetryContext(i + 1), httpRequestBuilder, th)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HttpRequestBuilder HttpRequestRetry$lambda$1$prepareRequest(HttpRequestBuilder httpRequestBuilder) {
        final HttpRequestBuilder takeFrom = new HttpRequestBuilder().takeFrom(httpRequestBuilder);
        httpRequestBuilder.getExecutionContext().invokeOnCompletion(new Function1() { // from class: io.ktor.client.plugins.HttpRequestRetryKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit HttpRequestRetry$lambda$1$prepareRequest$lambda$0;
                HttpRequestRetry$lambda$1$prepareRequest$lambda$0 = HttpRequestRetryKt.HttpRequestRetry$lambda$1$prepareRequest$lambda$0(HttpRequestBuilder.this, (Throwable) obj);
                return HttpRequestRetry$lambda$1$prepareRequest$lambda$0;
            }
        });
        return takeFrom;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HttpRequestRetry$lambda$1$prepareRequest$lambda$0(HttpRequestBuilder httpRequestBuilder, Throwable th) {
        Job executionContext = httpRequestBuilder.getExecutionContext();
        Intrinsics.checkNotNull(executionContext, "null cannot be cast to non-null type kotlinx.coroutines.CompletableJob");
        CompletableJob completableJob = (CompletableJob) executionContext;
        if (th == null) {
            completableJob.complete();
        } else {
            completableJob.completeExceptionally(th);
        }
        return Unit.INSTANCE;
    }

    public static final void retry(HttpRequestBuilder httpRequestBuilder, Function1 block) {
        Intrinsics.checkNotNullParameter(httpRequestBuilder, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        HttpRequestRetryConfig httpRequestRetryConfig = new HttpRequestRetryConfig();
        block.invoke(httpRequestRetryConfig);
        httpRequestBuilder.getAttributes().put(ShouldRetryPerRequestAttributeKey, httpRequestRetryConfig.getShouldRetry$ktor_client_core());
        httpRequestBuilder.getAttributes().put(ShouldRetryOnExceptionPerRequestAttributeKey, httpRequestRetryConfig.getShouldRetryOnException$ktor_client_core());
        httpRequestBuilder.getAttributes().put(RetryDelayPerRequestAttributeKey, httpRequestRetryConfig.getDelayMillis$ktor_client_core());
        httpRequestBuilder.getAttributes().put(MaxRetriesPerRequestAttributeKey, Integer.valueOf(httpRequestRetryConfig.getMaxRetries()));
        httpRequestBuilder.getAttributes().put(ModifyRequestPerRequestAttributeKey, httpRequestRetryConfig.getModifyRequest());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isTimeoutException(Throwable th) {
        Throwable unwrapCancellationException = ExceptionUtilsJvmKt.unwrapCancellationException(th);
        return (unwrapCancellationException instanceof HttpRequestTimeoutException) || (unwrapCancellationException instanceof ConnectTimeoutException) || (unwrapCancellationException instanceof SocketTimeoutException);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object throwOnInvalidResponseBody(HttpResponse httpResponse, Continuation continuation) {
        return DoubleReceivePluginKt.isSaved(httpResponse) ? ByteReadChannel.DefaultImpls.awaitContent$default(httpResponse.getRawContent(), 0, continuation, 1, null) : Boxing.boxBoolean(false);
    }
}
