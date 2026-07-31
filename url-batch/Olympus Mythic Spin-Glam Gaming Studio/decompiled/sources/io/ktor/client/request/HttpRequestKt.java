package io.ktor.client.request;

import io.ktor.http.HeadersBuilder;
import io.ktor.http.HttpMessageBuilder;
import io.ktor.http.URLParserKt;
import io.ktor.util.AttributeKey;
import io.ktor.util.reflect.TypeInfo;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;

/* compiled from: HttpRequest.kt */
/* loaded from: classes5.dex */
public abstract class HttpRequestKt {
    private static final AttributeKey ResponseAdapterAttributeKey;

    static {
        KType kType;
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ResponseAdapter.class);
        try {
            kType = Reflection.typeOf(ResponseAdapter.class);
        } catch (Throwable unused) {
            kType = null;
        }
        ResponseAdapterAttributeKey = new AttributeKey("ResponseAdapterAttributeKey", new TypeInfo(orCreateKotlinClass, kType));
    }

    public static final HeadersBuilder headers(HttpMessageBuilder httpMessageBuilder, Function1 block) {
        Intrinsics.checkNotNullParameter(httpMessageBuilder, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        HeadersBuilder headers = httpMessageBuilder.getHeaders();
        block.invoke(headers);
        return headers;
    }

    public static final void url(HttpRequestBuilder httpRequestBuilder, String urlString) {
        Intrinsics.checkNotNullParameter(httpRequestBuilder, "<this>");
        Intrinsics.checkNotNullParameter(urlString, "urlString");
        URLParserKt.takeFrom(httpRequestBuilder.getUrl(), urlString);
    }

    public static final AttributeKey getResponseAdapterAttributeKey() {
        return ResponseAdapterAttributeKey;
    }
}
