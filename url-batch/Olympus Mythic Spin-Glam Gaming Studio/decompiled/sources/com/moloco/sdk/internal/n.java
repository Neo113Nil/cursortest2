package com.moloco.sdk.internal;

import com.moloco.sdk.publisher.MediationInfo;
import io.ktor.http.HeadersBuilder;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes5.dex */
public final class n {
    public static /* synthetic */ void a(HeadersBuilder headersBuilder, String str, String str2, MediationInfo mediationInfo, int i, Object obj) {
        if ((i & 4) != 0) {
            mediationInfo = null;
        }
        a(headersBuilder, str, str2, mediationInfo);
    }

    public static final void a(@NotNull HeadersBuilder headersBuilder, @Nullable String str, @Nullable String str2, @Nullable MediationInfo mediationInfo) {
        Intrinsics.checkNotNullParameter(headersBuilder, "<this>");
        StringBuilder sb = new StringBuilder();
        if (str != null) {
            sb.append("MolocoSDK/" + str + ';');
        }
        if (mediationInfo != null) {
            sb.append("Mediator/" + mediationInfo.getName() + ';');
        }
        if (str2 != null) {
            sb.append("Android/" + str2 + ';');
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        headersBuilder.append("X-Moloco-User-Agent", sb2);
    }
}
