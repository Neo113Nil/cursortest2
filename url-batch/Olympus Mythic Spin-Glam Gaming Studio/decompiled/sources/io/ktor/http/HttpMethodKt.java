package io.ktor.http;

import io.ktor.http.HttpMethod;
import java.util.Set;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HttpMethod.kt */
/* loaded from: classes3.dex */
public abstract class HttpMethodKt {
    private static final Set REQUESTS_WITHOUT_BODY;

    static {
        HttpMethod.Companion companion = HttpMethod.Companion;
        REQUESTS_WITHOUT_BODY = SetsKt.setOf((Object[]) new HttpMethod[]{companion.getGet(), companion.getHead(), companion.getOptions(), new HttpMethod("TRACE")});
    }

    public static final boolean getSupportsRequestBody(HttpMethod httpMethod) {
        Intrinsics.checkNotNullParameter(httpMethod, "<this>");
        return !REQUESTS_WITHOUT_BODY.contains(httpMethod);
    }
}
