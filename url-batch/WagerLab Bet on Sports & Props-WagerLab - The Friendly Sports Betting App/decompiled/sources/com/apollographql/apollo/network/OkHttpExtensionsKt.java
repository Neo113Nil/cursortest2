package com.apollographql.apollo.network;

import com.apollographql.apollo.ApolloClient;
import com.apollographql.apollo.api.http.HttpHeader;
import com.apollographql.apollo.network.http.DefaultHttpEngine;
import com.apollographql.apollo.network.http.HttpNetworkTransport;
import com.apollographql.apollo.network.ws.DefaultWebSocketEngine;
import com.apollographql.apollo.network.ws.WebSocketNetworkTransport;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Call;
import okhttp3.Headers;
import okhttp3.OkHttpClient;

/* compiled from: OkHttpExtensions.kt */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0000\u001a\u00020\u0002\u001a\u0012\u0010\u0003\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005\u001a\u0018\u0010\u0003\u001a\u00020\u0001*\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00050\u0006\u001a\u0012\u0010\u0000\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u0000\u001a\u00020\u0002\u001a\u0012\u0010\u0003\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0005\u001a\u0012\u0010\u0000\u001a\u00020\b*\u00020\b2\u0006\u0010\u0000\u001a\u00020\u0002\u001a\u0012\u0010\t\u001a\u00020\n*\b\u0012\u0004\u0012\u00020\f0\u000bH\u0000\"\u001b\u0010\r\u001a\u00020\u000e8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"okHttpClient", "Lcom/apollographql/apollo/ApolloClient$Builder;", "Lokhttp3/OkHttpClient;", "okHttpCallFactory", "callFactory", "Lokhttp3/Call$Factory;", "Lkotlin/Function0;", "Lcom/apollographql/apollo/network/http/HttpNetworkTransport$Builder;", "Lcom/apollographql/apollo/network/ws/WebSocketNetworkTransport$Builder;", "toOkHttpHeaders", "Lokhttp3/Headers;", "", "Lcom/apollographql/apollo/api/http/HttpHeader;", "defaultOkHttpClientBuilder", "Lokhttp3/OkHttpClient$Builder;", "getDefaultOkHttpClientBuilder", "()Lokhttp3/OkHttpClient$Builder;", "defaultOkHttpClientBuilder$delegate", "Lkotlin/Lazy;", "apollo-runtime_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OkHttpExtensionsKt {
    private static final Lazy defaultOkHttpClientBuilder$delegate = LazyKt.lazy(new Function0() { // from class: com.apollographql.apollo.network.OkHttpExtensionsKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            OkHttpClient.Builder defaultOkHttpClientBuilder_delegate$lambda$8;
            defaultOkHttpClientBuilder_delegate$lambda$8 = OkHttpExtensionsKt.defaultOkHttpClientBuilder_delegate$lambda$8();
            return defaultOkHttpClientBuilder_delegate$lambda$8;
        }
    });

    public static final ApolloClient.Builder okHttpClient(ApolloClient.Builder builder, OkHttpClient okHttpClient) {
        Intrinsics.checkNotNullParameter(builder, "<this>");
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        builder.httpEngine(DefaultHttpEngine.DefaultHttpEngine(okHttpClient));
        builder.webSocketEngine(new DefaultWebSocketEngine(okHttpClient));
        return builder;
    }

    public static final ApolloClient.Builder okHttpCallFactory(ApolloClient.Builder builder, Call.Factory callFactory) {
        Intrinsics.checkNotNullParameter(builder, "<this>");
        Intrinsics.checkNotNullParameter(callFactory, "callFactory");
        builder.httpEngine(DefaultHttpEngine.DefaultHttpEngine(callFactory));
        return builder;
    }

    public static final ApolloClient.Builder okHttpCallFactory(ApolloClient.Builder builder, Function0<? extends Call.Factory> callFactory) {
        Intrinsics.checkNotNullParameter(builder, "<this>");
        Intrinsics.checkNotNullParameter(callFactory, "callFactory");
        builder.httpEngine(DefaultHttpEngine.DefaultHttpEngine(callFactory));
        return builder;
    }

    public static final HttpNetworkTransport.Builder okHttpClient(HttpNetworkTransport.Builder builder, OkHttpClient okHttpClient) {
        Intrinsics.checkNotNullParameter(builder, "<this>");
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        builder.httpEngine(DefaultHttpEngine.DefaultHttpEngine(okHttpClient));
        return builder;
    }

    public static final HttpNetworkTransport.Builder okHttpCallFactory(HttpNetworkTransport.Builder builder, Call.Factory okHttpCallFactory) {
        Intrinsics.checkNotNullParameter(builder, "<this>");
        Intrinsics.checkNotNullParameter(okHttpCallFactory, "okHttpCallFactory");
        builder.httpEngine(DefaultHttpEngine.DefaultHttpEngine(okHttpCallFactory));
        return builder;
    }

    public static final WebSocketNetworkTransport.Builder okHttpClient(WebSocketNetworkTransport.Builder builder, OkHttpClient okHttpClient) {
        Intrinsics.checkNotNullParameter(builder, "<this>");
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        builder.webSocketEngine(new DefaultWebSocketEngine(okHttpClient));
        return builder;
    }

    public static final Headers toOkHttpHeaders(List<HttpHeader> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Headers.Builder builder = new Headers.Builder();
        for (HttpHeader httpHeader : list) {
            builder.add(httpHeader.getName(), httpHeader.getValue());
        }
        return builder.build();
    }

    public static final OkHttpClient.Builder getDefaultOkHttpClientBuilder() {
        return (OkHttpClient.Builder) defaultOkHttpClientBuilder$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OkHttpClient.Builder defaultOkHttpClientBuilder_delegate$lambda$8() {
        return new OkHttpClient.Builder();
    }
}
