package com.moloco.sdk.internal.services.config.handlers;

import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.Init;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
/* loaded from: classes4.dex */
public final class b implements a {
    public static final int a = 0;

    @Override // com.moloco.sdk.internal.services.config.handlers.a
    @NotNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.moloco.sdk.internal.configs.a a(@NotNull Init.SDKInitResponse sdkInitResponse) {
        Intrinsics.checkNotNullParameter(sdkInitResponse, "sdkInitResponse");
        if (!sdkInitResponse.hasOperationalMetricsConfig()) {
            return com.moloco.sdk.internal.configs.b.c();
        }
        Init.SDKInitResponse.OperationalMetricsConfig operationalMetricsConfig = sdkInitResponse.getOperationalMetricsConfig();
        String url = operationalMetricsConfig.getUrl();
        Intrinsics.checkNotNullExpressionValue(url, "getUrl(...)");
        return new com.moloco.sdk.internal.configs.a(url, operationalMetricsConfig.getPollingIntervalSeconds());
    }

    @Override // com.moloco.sdk.internal.services.config.handlers.a
    @NotNull
    public Class<com.moloco.sdk.internal.configs.a> a() {
        return com.moloco.sdk.internal.configs.a.class;
    }
}
