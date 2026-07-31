package io.ktor.client.plugins.api;

import io.ktor.client.HttpClient;
import io.ktor.client.plugins.HttpClientPluginKt;
import io.ktor.client.plugins.HttpSend;
import io.ktor.client.request.HttpRequestBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: CommonHooks.kt */
/* loaded from: classes12.dex */
public final class Send implements ClientHook {
    public static final Send INSTANCE = new Send();

    private Send() {
    }

    /* compiled from: CommonHooks.kt */
    public static final class Sender implements CoroutineScope {
        private final CoroutineContext coroutineContext;
        private final io.ktor.client.plugins.Sender httpSendSender;

        public Sender(io.ktor.client.plugins.Sender httpSendSender, CoroutineContext coroutineContext) {
            Intrinsics.checkNotNullParameter(httpSendSender, "httpSendSender");
            Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
            this.httpSendSender = httpSendSender;
            this.coroutineContext = coroutineContext;
        }

        @Override // kotlinx.coroutines.CoroutineScope
        public CoroutineContext getCoroutineContext() {
            return this.coroutineContext;
        }

        public final Object proceed(HttpRequestBuilder httpRequestBuilder, Continuation continuation) {
            return this.httpSendSender.execute(httpRequestBuilder, continuation);
        }
    }

    @Override // io.ktor.client.plugins.api.ClientHook
    public void install(HttpClient client, Function3 handler) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(handler, "handler");
        ((HttpSend) HttpClientPluginKt.plugin(client, HttpSend.Plugin)).intercept(new Send$install$1(handler, client, null));
    }
}
