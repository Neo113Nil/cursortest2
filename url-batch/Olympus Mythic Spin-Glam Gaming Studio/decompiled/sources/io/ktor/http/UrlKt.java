package io.ktor.http;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: Url.kt */
/* loaded from: classes15.dex */
public abstract class UrlKt {
    public static final String getAuthority(Url url) {
        Intrinsics.checkNotNullParameter(url, "<this>");
        return getEncodedUserAndPassword(url) + URLUtilsKt.getHostWithPortIfSpecified(url);
    }

    public static final String getEncodedUserAndPassword(Url url) {
        Intrinsics.checkNotNullParameter(url, "<this>");
        StringBuilder sb = new StringBuilder();
        URLUtilsKt.appendUserAndPassword(sb, url.getEncodedUser(), url.getEncodedPassword());
        return sb.toString();
    }
}
