package io.ktor.http;

import io.ktor.http.URLBuilder;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: URLBuilderJvm.kt */
/* loaded from: classes6.dex */
public abstract class URLBuilderJvmKt {
    public static final String getOrigin(URLBuilder.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return "http://localhost";
    }
}
