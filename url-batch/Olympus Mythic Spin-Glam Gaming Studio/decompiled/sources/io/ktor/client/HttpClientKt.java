package io.ktor.client;

import io.ktor.client.engine.HttpClientEngine;
import io.ktor.client.engine.HttpClientEngineFactory;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;

/* compiled from: HttpClient.kt */
/* loaded from: classes8.dex */
public abstract class HttpClientKt {
    public static final HttpClient HttpClient(HttpClientEngineFactory engineFactory, Function1 block) {
        Intrinsics.checkNotNullParameter(engineFactory, "engineFactory");
        Intrinsics.checkNotNullParameter(block, "block");
        HttpClientConfig httpClientConfig = new HttpClientConfig();
        block.invoke(httpClientConfig);
        final HttpClientEngine create = engineFactory.create(httpClientConfig.getEngineConfig$ktor_client_core());
        HttpClient httpClient = new HttpClient(create, httpClientConfig, true);
        CoroutineContext.Element element = httpClient.getCoroutineContext().get(Job.Key);
        Intrinsics.checkNotNull(element);
        ((Job) element).invokeOnCompletion(new Function1() { // from class: io.ktor.client.HttpClientKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit HttpClient$lambda$1;
                HttpClient$lambda$1 = HttpClientKt.HttpClient$lambda$1(HttpClientEngine.this, (Throwable) obj);
                return HttpClient$lambda$1;
            }
        });
        return httpClient;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HttpClient$lambda$1(HttpClientEngine httpClientEngine, Throwable th) {
        httpClientEngine.close();
        return Unit.INSTANCE;
    }
}
