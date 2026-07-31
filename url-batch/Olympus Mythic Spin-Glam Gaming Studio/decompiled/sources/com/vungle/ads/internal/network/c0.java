package com.vungle.ads.internal.network;

import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import com.vungle.ads.internal.model.h0;
import com.vungle.ads.internal.model.p1;
import com.vungle.ads.internal.model.t1;
import com.vungle.ads.internal.model.v2;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializersKt;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonKt;
import okhttp3.Call;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;

/* loaded from: classes3.dex */
public final class c0 {
    public static final Json c = JsonKt.Json$default(null, b0.a, 1, null);
    public final Call.Factory a;
    public final com.vungle.ads.internal.network.converters.b b;

    public c0(OkHttpClient okHttpClient) {
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        this.a = okHttpClient;
        this.b = new com.vungle.ads.internal.network.converters.b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Request.Builder a(c0 c0Var, String str, String str2, String str3, Map map, int i) {
        if ((i & 4) != 0) {
            str3 = null;
        }
        if ((i & 8) != 0) {
            map = null;
        }
        c0Var.getClass();
        Request.Builder addHeader = new Request.Builder().url(str2).addHeader("User-Agent", str).addHeader("Vungle-Version", "7.1.0").addHeader("Content-Type", "application/json");
        if (map != null) {
            addHeader.headers(Headers.INSTANCE.of((Map<String, String>) map));
        }
        if (str3 != null) {
            addHeader.addHeader("X-Vungle-Placement-Ref-Id", str3);
        }
        String c2 = d0.c();
        if (c2 != null) {
            addHeader.addHeader("X-VUNGLE-APP-VERSION", c2);
        }
        String b = d0.b();
        if (b != null) {
            addHeader.addHeader("X-Vungle-App-Id", b);
        }
        return addHeader;
    }

    public final m b(String ua, String path, t1 body) {
        Intrinsics.checkNotNullParameter(ua, "ua");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(body, "body");
        try {
            Json json = c;
            KSerializer serializer = SerializersKt.serializer(json.getSerializersModule(), Reflection.typeOf(t1.class));
            Intrinsics.checkNotNull(serializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
            return new m(this.a.newCall(a(this, ua, path, null, null, 12).post(RequestBody.INSTANCE.create(json.encodeToString(serializer, body), (MediaType) null)).build()), new com.vungle.ads.internal.network.converters.d(Reflection.typeOf(v2.class)));
        } catch (Exception unused) {
            return null;
        }
    }

    public final m c(String ua, String path, t1 body) {
        Intrinsics.checkNotNullParameter(ua, "ua");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(body, "body");
        try {
            Json json = c;
            KSerializer serializer = SerializersKt.serializer(json.getSerializersModule(), Reflection.typeOf(t1.class));
            Intrinsics.checkNotNull(serializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
            return new m(this.a.newCall(a(this, ua, path, null, null, 12).post(RequestBody.INSTANCE.create(json.encodeToString(serializer, body), (MediaType) null)).build()), this.b);
        } catch (Exception unused) {
            return null;
        }
    }

    public final m a(String ua, String path, t1 body) {
        List a;
        Intrinsics.checkNotNullParameter(ua, "ua");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(body, "body");
        try {
            Json json = c;
            KSerializer serializer = SerializersKt.serializer(json.getSerializersModule(), Reflection.typeOf(t1.class));
            Intrinsics.checkNotNull(serializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
            String encodeToString = json.encodeToString(serializer, body);
            p1 c2 = body.c();
            return new m(this.a.newCall(a(this, ua, path, (c2 == null || (a = c2.a()) == null) ? null : (String) CollectionsKt.firstOrNull(a), null, 8).post(RequestBody.INSTANCE.create(encodeToString, (MediaType) null)).build()), new com.vungle.ads.internal.network.converters.d(Reflection.typeOf(h0.class)));
        } catch (Exception unused) {
            return null;
        }
    }

    public final m b(String ua, String path, RequestBody requestBody) {
        Intrinsics.checkNotNullParameter(ua, "ua");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        Request.Builder addHeader = new Request.Builder().url(HttpUrl.INSTANCE.get(path).newBuilder().build()).addHeader("User-Agent", ua).addHeader("Vungle-Version", "7.1.0").addHeader("Content-Type", CommonGatewayClient.HEADER_PROTOBUF);
        String b = d0.b();
        if (b != null) {
            addHeader.addHeader("X-Vungle-App-Id", b);
        }
        String c2 = d0.c();
        if (c2 != null) {
            addHeader.addHeader("X-VUNGLE-APP-VERSION", c2);
        }
        return new m(this.a.newCall(addHeader.post(requestBody).build()), this.b);
    }

    public final m a(String ua, String url, g requestType, Map map, RequestBody requestBody) {
        Request build;
        Intrinsics.checkNotNullParameter(ua, "ua");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(requestType, "requestType");
        Request.Builder a = a(this, ua, url, null, map, 4);
        int ordinal = requestType.ordinal();
        if (ordinal == 0) {
            build = a.get().build();
        } else {
            if (ordinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            if (requestBody == null) {
                requestBody = RequestBody.Companion.create$default(RequestBody.INSTANCE, new byte[0], (MediaType) null, 0, 0, 6, (Object) null);
            }
            build = a.post(requestBody).build();
        }
        return new m(this.a.newCall(build), this.b);
    }

    public final m a(String ua, String path, RequestBody requestBody) {
        Intrinsics.checkNotNullParameter(ua, "ua");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        Request.Builder addHeader = new Request.Builder().url(HttpUrl.INSTANCE.get(path).newBuilder().build()).addHeader("User-Agent", ua).addHeader("Vungle-Version", "7.1.0").addHeader("Content-Type", CommonGatewayClient.HEADER_PROTOBUF);
        String b = d0.b();
        if (b != null) {
            addHeader.addHeader("X-Vungle-App-Id", b);
        }
        String c2 = d0.c();
        if (c2 != null) {
            addHeader.addHeader("X-VUNGLE-APP-VERSION", c2);
        }
        return new m(this.a.newCall(addHeader.post(requestBody).build()), this.b);
    }

    public final m a(RequestBody requestBody) {
        Intrinsics.checkNotNullParameter("https://events.ads.vungle.com/rtadebugging", "path");
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        return new m(this.a.newCall(a(this, "debug", HttpUrl.INSTANCE.get("https://events.ads.vungle.com/rtadebugging").newBuilder().build().getUrl(), null, null, 12).post(requestBody).build()), this.b);
    }
}
