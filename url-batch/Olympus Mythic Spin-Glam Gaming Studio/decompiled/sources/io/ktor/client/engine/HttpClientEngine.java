package io.ktor.client.engine;

import io.ktor.client.HttpClient;
import io.ktor.client.request.HttpRequestData;
import io.ktor.client.request.HttpSendPipeline;
import java.io.Closeable;
import java.util.Set;
import kotlin.ResultKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Job;

/* compiled from: HttpClientEngine.kt */
/* loaded from: classes13.dex */
public interface HttpClientEngine extends CoroutineScope, Closeable {
    Object execute(HttpRequestData httpRequestData, Continuation continuation);

    HttpClientEngineConfig getConfig();

    Set getSupportedCapabilities();

    void install(HttpClient httpClient);

    /* compiled from: HttpClientEngine.kt */
    public static final class DefaultImpls {
        public static Set getSupportedCapabilities(HttpClientEngine httpClientEngine) {
            return SetsKt.emptySet();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean getClosed(HttpClientEngine httpClientEngine) {
            return !(((Job) httpClientEngine.getCoroutineContext().get(Job.Key)) != null ? r1.isActive() : false);
        }

        public static void install(HttpClientEngine httpClientEngine, HttpClient client) {
            Intrinsics.checkNotNullParameter(client, "client");
            client.getSendPipeline().intercept(HttpSendPipeline.Phases.getEngine(), new HttpClientEngine$install$1(client, httpClientEngine, null));
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:11:0x007b A[PHI: r12
          0x007b: PHI (r12v7 java.lang.Object) = (r12v6 java.lang.Object), (r12v1 java.lang.Object) binds: [B:18:0x0078, B:10:0x0028] A[DONT_GENERATE, DONT_INLINE], RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:19:0x007a A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0042  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Object executeWithinCallContext(HttpClientEngine httpClientEngine, HttpRequestData httpRequestData, Continuation continuation) {
            HttpClientEngine$executeWithinCallContext$1 httpClientEngine$executeWithinCallContext$1;
            int i;
            Deferred async$default;
            if (continuation instanceof HttpClientEngine$executeWithinCallContext$1) {
                httpClientEngine$executeWithinCallContext$1 = (HttpClientEngine$executeWithinCallContext$1) continuation;
                int i2 = httpClientEngine$executeWithinCallContext$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    httpClientEngine$executeWithinCallContext$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = httpClientEngine$executeWithinCallContext$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = httpClientEngine$executeWithinCallContext$1.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        Job executionContext = httpRequestData.getExecutionContext();
                        httpClientEngine$executeWithinCallContext$1.L$0 = httpClientEngine;
                        httpClientEngine$executeWithinCallContext$1.L$1 = httpRequestData;
                        httpClientEngine$executeWithinCallContext$1.label = 1;
                        obj = HttpClientEngineKt.createCallContext(httpClientEngine, executionContext, httpClientEngine$executeWithinCallContext$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            if (i == 2) {
                                ResultKt.throwOnFailure(obj);
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        httpRequestData = (HttpRequestData) httpClientEngine$executeWithinCallContext$1.L$1;
                        httpClientEngine = (HttpClientEngine) httpClientEngine$executeWithinCallContext$1.L$0;
                        ResultKt.throwOnFailure(obj);
                    }
                    HttpClientEngine httpClientEngine2 = httpClientEngine;
                    CoroutineContext coroutineContext = (CoroutineContext) obj;
                    async$default = BuildersKt__Builders_commonKt.async$default(httpClientEngine2, coroutineContext.plus(new KtorCallContextElement(coroutineContext)), null, new HttpClientEngine$executeWithinCallContext$2(httpClientEngine2, httpRequestData, null), 2, null);
                    httpClientEngine$executeWithinCallContext$1.L$0 = null;
                    httpClientEngine$executeWithinCallContext$1.L$1 = null;
                    httpClientEngine$executeWithinCallContext$1.label = 2;
                    obj = async$default.await(httpClientEngine$executeWithinCallContext$1);
                    return obj != coroutine_suspended ? coroutine_suspended : obj;
                }
            }
            httpClientEngine$executeWithinCallContext$1 = new HttpClientEngine$executeWithinCallContext$1(continuation);
            Object obj2 = httpClientEngine$executeWithinCallContext$1.result;
            Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i = httpClientEngine$executeWithinCallContext$1.label;
            if (i != 0) {
            }
            HttpClientEngine httpClientEngine22 = httpClientEngine;
            CoroutineContext coroutineContext2 = (CoroutineContext) obj2;
            async$default = BuildersKt__Builders_commonKt.async$default(httpClientEngine22, coroutineContext2.plus(new KtorCallContextElement(coroutineContext2)), null, new HttpClientEngine$executeWithinCallContext$2(httpClientEngine22, httpRequestData, null), 2, null);
            httpClientEngine$executeWithinCallContext$1.L$0 = null;
            httpClientEngine$executeWithinCallContext$1.L$1 = null;
            httpClientEngine$executeWithinCallContext$1.label = 2;
            obj2 = async$default.await(httpClientEngine$executeWithinCallContext$1);
            if (obj2 != coroutine_suspended2) {
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void checkExtensions(HttpClientEngine httpClientEngine, HttpRequestData httpRequestData) {
            for (HttpClientEngineCapability httpClientEngineCapability : httpRequestData.getRequiredCapabilities$ktor_client_core()) {
                if (!httpClientEngine.getSupportedCapabilities().contains(httpClientEngineCapability)) {
                    throw new IllegalArgumentException(("Engine doesn't support " + httpClientEngineCapability).toString());
                }
            }
        }
    }
}
