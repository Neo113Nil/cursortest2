package io.ktor.http;

import java.nio.charset.Charset;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HttpMessageProperties.kt */
/* loaded from: classes3.dex */
public abstract class HttpMessagePropertiesKt {
    public static final void contentType(HttpMessageBuilder httpMessageBuilder, ContentType type) {
        Intrinsics.checkNotNullParameter(httpMessageBuilder, "<this>");
        Intrinsics.checkNotNullParameter(type, "type");
        httpMessageBuilder.getHeaders().set(HttpHeaders.INSTANCE.getContentType(), type.toString());
    }

    public static final ContentType contentType(HttpMessageBuilder httpMessageBuilder) {
        Intrinsics.checkNotNullParameter(httpMessageBuilder, "<this>");
        String str = httpMessageBuilder.getHeaders().get(HttpHeaders.INSTANCE.getContentType());
        if (str != null) {
            return ContentType.Companion.parse(str);
        }
        return null;
    }

    public static final ContentType contentType(HttpMessage httpMessage) {
        Intrinsics.checkNotNullParameter(httpMessage, "<this>");
        String str = httpMessage.getHeaders().get(HttpHeaders.INSTANCE.getContentType());
        if (str != null) {
            return ContentType.Companion.parse(str);
        }
        return null;
    }

    public static final Charset charset(HttpMessage httpMessage) {
        Intrinsics.checkNotNullParameter(httpMessage, "<this>");
        ContentType contentType = contentType(httpMessage);
        if (contentType != null) {
            return ContentTypesKt.charset(contentType);
        }
        return null;
    }

    public static final Long contentLength(HttpMessage httpMessage) {
        Intrinsics.checkNotNullParameter(httpMessage, "<this>");
        String str = httpMessage.getHeaders().get(HttpHeaders.INSTANCE.getContentLength());
        if (str != null) {
            return Long.valueOf(Long.parseLong(str));
        }
        return null;
    }
}
