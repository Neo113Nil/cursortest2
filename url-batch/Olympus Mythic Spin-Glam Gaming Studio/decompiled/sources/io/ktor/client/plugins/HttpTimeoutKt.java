package io.ktor.client.plugins;

import io.ktor.client.network.sockets.ConnectTimeoutException;
import io.ktor.client.plugins.api.ClientPlugin;
import io.ktor.client.plugins.api.ClientPluginBuilder;
import io.ktor.client.plugins.api.CreatePluginUtilsKt;
import io.ktor.client.plugins.api.Send;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.client.request.HttpRequestData;
import io.ktor.http.URLProtocolKt;
import io.ktor.util.logging.KtorSimpleLoggerJvmKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import org.slf4j.Logger;

/* compiled from: HttpTimeout.kt */
/* loaded from: classes11.dex */
public abstract class HttpTimeoutKt {
    private static final Logger LOGGER = KtorSimpleLoggerJvmKt.KtorSimpleLogger("io.ktor.client.plugins.HttpTimeout");
    private static final ClientPlugin HttpTimeout = CreatePluginUtilsKt.createClientPlugin("HttpTimeout", HttpTimeoutKt$HttpTimeout$2.INSTANCE, new Function1() { // from class: io.ktor.client.plugins.HttpTimeoutKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            Unit HttpTimeout$lambda$1;
            HttpTimeout$lambda$1 = HttpTimeoutKt.HttpTimeout$lambda$1((ClientPluginBuilder) obj);
            return HttpTimeout$lambda$1;
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean HttpTimeout$lambda$1$hasNotNullTimeouts(Long l, Long l2, Long l3, boolean z) {
        return ((!z || l == null) && l2 == null && l3 == null) ? false : true;
    }

    public static final int convertLongTimeoutToIntWithInfiniteAsZero(long j) {
        if (j == Long.MAX_VALUE) {
            return 0;
        }
        if (j < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) j;
    }

    public static final ClientPlugin getHttpTimeout() {
        return HttpTimeout;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HttpTimeout$lambda$1(ClientPluginBuilder createClientPlugin) {
        Intrinsics.checkNotNullParameter(createClientPlugin, "$this$createClientPlugin");
        createClientPlugin.on(Send.INSTANCE, new HttpTimeoutKt$HttpTimeout$3$1(((HttpTimeoutConfig) createClientPlugin.getPluginConfig()).getRequestTimeoutMillis(), ((HttpTimeoutConfig) createClientPlugin.getPluginConfig()).getConnectTimeoutMillis(), ((HttpTimeoutConfig) createClientPlugin.getPluginConfig()).getSocketTimeoutMillis(), null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getSupportsRequestTimeout(HttpRequestBuilder httpRequestBuilder) {
        if (URLProtocolKt.isWebsocket(httpRequestBuilder.getUrl().getProtocol())) {
            return false;
        }
        httpRequestBuilder.getBody();
        httpRequestBuilder.getBody();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void applyRequestTimeout(CoroutineScope coroutineScope, HttpRequestBuilder httpRequestBuilder, Long l) {
        final Job launch$default;
        if (l == null || l.longValue() == Long.MAX_VALUE) {
            return;
        }
        launch$default = BuildersKt__Builders_commonKt.launch$default(coroutineScope, new CoroutineName("request-timeout"), null, new HttpTimeoutKt$applyRequestTimeout$killer$1(l, httpRequestBuilder, httpRequestBuilder.getExecutionContext(), null), 2, null);
        httpRequestBuilder.getExecutionContext().invokeOnCompletion(new Function1() { // from class: io.ktor.client.plugins.HttpTimeoutKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit applyRequestTimeout$lambda$2;
                applyRequestTimeout$lambda$2 = HttpTimeoutKt.applyRequestTimeout$lambda$2(Job.this, (Throwable) obj);
                return applyRequestTimeout$lambda$2;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit applyRequestTimeout$lambda$2(Job job, Throwable th) {
        Job.DefaultImpls.cancel$default(job, null, 1, null);
        return Unit.INSTANCE;
    }

    public static final void timeout(HttpRequestBuilder httpRequestBuilder, Function1 block) {
        Intrinsics.checkNotNullParameter(httpRequestBuilder, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        HttpTimeoutCapability httpTimeoutCapability = HttpTimeoutCapability.INSTANCE;
        HttpTimeoutConfig httpTimeoutConfig = new HttpTimeoutConfig(null, null, null, 7, null);
        block.invoke(httpTimeoutConfig);
        httpRequestBuilder.setCapability(httpTimeoutCapability, httpTimeoutConfig);
    }

    public static final ConnectTimeoutException ConnectTimeoutException(HttpRequestData request, Throwable th) {
        Object obj;
        Intrinsics.checkNotNullParameter(request, "request");
        StringBuilder sb = new StringBuilder();
        sb.append("Connect timeout has expired [url=");
        sb.append(request.getUrl());
        sb.append(", connect_timeout=");
        HttpTimeoutConfig httpTimeoutConfig = (HttpTimeoutConfig) request.getCapabilityOrNull(HttpTimeoutCapability.INSTANCE);
        if (httpTimeoutConfig == null || (obj = httpTimeoutConfig.getConnectTimeoutMillis()) == null) {
            obj = "unknown";
        }
        sb.append(obj);
        sb.append(" ms]");
        return new ConnectTimeoutException(sb.toString(), th);
    }
}
