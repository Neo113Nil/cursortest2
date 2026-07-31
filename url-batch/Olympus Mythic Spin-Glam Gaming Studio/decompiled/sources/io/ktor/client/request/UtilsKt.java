package io.ktor.client.request;

import io.ktor.http.HttpMessageBuilder;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: utils.kt */
/* loaded from: classes4.dex */
public abstract class UtilsKt {
    public static final void header(HttpMessageBuilder httpMessageBuilder, String key, Object obj) {
        Intrinsics.checkNotNullParameter(httpMessageBuilder, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        if (obj != null) {
            httpMessageBuilder.getHeaders().append(key, obj.toString());
        }
    }
}
