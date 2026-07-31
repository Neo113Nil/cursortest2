package io.ktor.client.plugins;

import io.ktor.client.HttpClient;
import io.ktor.client.call.HttpClientCall;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.client.request.HttpRequestPipeline;
import io.ktor.client.request.HttpSendPipeline;
import io.ktor.util.AttributeKey;
import io.ktor.util.reflect.TypeInfo;
import java.util.ArrayList;
import java.util.List;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import kotlinx.coroutines.CoroutineScopeKt;

/* compiled from: HttpSend.kt */
/* loaded from: classes10.dex */
public final class HttpSend {
    public static final Plugin Plugin = new Plugin(0 == true ? 1 : 0);
    private static final AttributeKey key;
    private final List interceptors;
    private final int maxSendCount;

    public /* synthetic */ HttpSend(int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(i);
    }

    private HttpSend(int i) {
        this.maxSendCount = i;
        this.interceptors = new ArrayList();
    }

    /* compiled from: HttpSend.kt */
    public static final class Config {
        private int maxSendCount = 20;

        public final int getMaxSendCount() {
            return this.maxSendCount;
        }
    }

    public final void intercept(Function3 block) {
        Intrinsics.checkNotNullParameter(block, "block");
        this.interceptors.add(block);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        KType kType = null;
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(HttpSend.class);
        try {
            kType = Reflection.typeOf(HttpSend.class);
        } catch (Throwable unused) {
        }
        key = new AttributeKey("HttpSend", new TypeInfo(orCreateKotlinClass, kType));
    }

    /* compiled from: HttpSend.kt */
    public static final class Plugin implements HttpClientPlugin {
        public /* synthetic */ Plugin(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Plugin() {
        }

        @Override // io.ktor.client.plugins.HttpClientPlugin
        public AttributeKey getKey() {
            return HttpSend.key;
        }

        @Override // io.ktor.client.plugins.HttpClientPlugin
        public HttpSend prepare(Function1 block) {
            Intrinsics.checkNotNullParameter(block, "block");
            Config config = new Config();
            block.invoke(config);
            return new HttpSend(config.getMaxSendCount(), null);
        }

        @Override // io.ktor.client.plugins.HttpClientPlugin
        public void install(HttpSend plugin, HttpClient scope) {
            Intrinsics.checkNotNullParameter(plugin, "plugin");
            Intrinsics.checkNotNullParameter(scope, "scope");
            scope.getRequestPipeline().intercept(HttpRequestPipeline.Phases.getSend(), new HttpSend$Plugin$install$1(plugin, scope, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: HttpSend.kt */
    static final class InterceptedSender implements Sender {
        private final Function3 interceptor;
        private final Sender nextSender;

        public InterceptedSender(Function3 interceptor, Sender nextSender) {
            Intrinsics.checkNotNullParameter(interceptor, "interceptor");
            Intrinsics.checkNotNullParameter(nextSender, "nextSender");
            this.interceptor = interceptor;
            this.nextSender = nextSender;
        }

        @Override // io.ktor.client.plugins.Sender
        public Object execute(HttpRequestBuilder httpRequestBuilder, Continuation continuation) {
            return this.interceptor.invoke(this.nextSender, httpRequestBuilder, continuation);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: HttpSend.kt */
    static final class DefaultSender implements Sender {
        private final HttpClient client;
        private HttpClientCall currentCall;
        private final int maxSendCount;
        private int sentCount;

        public DefaultSender(int i, HttpClient client) {
            Intrinsics.checkNotNullParameter(client, "client");
            this.maxSendCount = i;
            this.client = client;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x005c  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0061  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0064  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0032  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
        @Override // io.ktor.client.plugins.Sender
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object execute(HttpRequestBuilder httpRequestBuilder, Continuation continuation) {
            HttpSend$DefaultSender$execute$1 httpSend$DefaultSender$execute$1;
            int i;
            HttpClientCall httpClientCall;
            if (continuation instanceof HttpSend$DefaultSender$execute$1) {
                httpSend$DefaultSender$execute$1 = (HttpSend$DefaultSender$execute$1) continuation;
                int i2 = httpSend$DefaultSender$execute$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    httpSend$DefaultSender$execute$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = httpSend$DefaultSender$execute$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = httpSend$DefaultSender$execute$1.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        HttpClientCall httpClientCall2 = this.currentCall;
                        if (httpClientCall2 != null) {
                            CoroutineScopeKt.cancel$default(httpClientCall2, null, 1, null);
                        }
                        int i3 = this.sentCount;
                        if (i3 >= this.maxSendCount) {
                            throw new SendCountExceedException("Max send count " + this.maxSendCount + " exceeded. Consider increasing the property maxSendCount if more is required.");
                        }
                        this.sentCount = i3 + 1;
                        HttpSendPipeline sendPipeline = this.client.getSendPipeline();
                        Object body = httpRequestBuilder.getBody();
                        httpSend$DefaultSender$execute$1.label = 1;
                        obj = sendPipeline.execute(httpRequestBuilder, body, httpSend$DefaultSender$execute$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    httpClientCall = obj instanceof HttpClientCall ? (HttpClientCall) obj : null;
                    if (httpClientCall != null) {
                        throw new IllegalStateException(("Failed to execute send pipeline. Expected [HttpClientCall], but received " + obj).toString());
                    }
                    this.currentCall = httpClientCall;
                    return httpClientCall;
                }
            }
            httpSend$DefaultSender$execute$1 = new HttpSend$DefaultSender$execute$1(this, continuation);
            Object obj2 = httpSend$DefaultSender$execute$1.result;
            Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i = httpSend$DefaultSender$execute$1.label;
            if (i != 0) {
            }
            if (obj2 instanceof HttpClientCall) {
            }
            if (httpClientCall != null) {
            }
        }
    }
}
