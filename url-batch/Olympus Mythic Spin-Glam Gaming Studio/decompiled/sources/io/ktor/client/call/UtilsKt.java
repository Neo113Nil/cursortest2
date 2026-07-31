package io.ktor.client.call;

import io.ktor.http.HttpMethod;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: utils.kt */
/* loaded from: classes6.dex */
public abstract class UtilsKt {
    public static final void checkContentLength(Long l, long j, HttpMethod method) {
        Intrinsics.checkNotNullParameter(method, "method");
        if (l == null || l.longValue() < 0 || Intrinsics.areEqual(method, HttpMethod.Companion.getHead()) || l.longValue() == j) {
            return;
        }
        throw new IllegalStateException(("Content-Length mismatch: expected " + l + " bytes, but received " + j + " bytes").toString());
    }
}
