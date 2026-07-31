package com.moloco.sdk.internal.error.api;

import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.services.I;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
/* loaded from: classes13.dex */
public final class b implements a {
    public static final int d = 0;

    @NotNull
    public final I a;

    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.a b;

    @NotNull
    public final String c;

    public b(@NotNull I timeProviderService, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.a httpClient) {
        Intrinsics.checkNotNullParameter(timeProviderService, "timeProviderService");
        Intrinsics.checkNotNullParameter(httpClient, "httpClient");
        this.a = timeProviderService;
        this.b = httpClient;
        this.c = "ErrorReportingApi";
    }

    @Override // com.moloco.sdk.internal.error.api.a
    public void a(@NotNull Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        MolocoLogger.error$default(MolocoLogger.INSTANCE, this.c, "SDK Crashed", error, false, 8, null);
    }

    @Override // com.moloco.sdk.internal.error.api.a
    public void a(@NotNull String error, @NotNull String url, @NotNull com.moloco.sdk.internal.error.a errorMetadata) {
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(errorMetadata, "errorMetadata");
        String b = com.moloco.sdk.internal.utils.b.b(com.moloco.sdk.internal.utils.b.a(url, error, this.a.invoke()), errorMetadata.b());
        MolocoLogger.info$default(MolocoLogger.INSTANCE, this.c, "Reporting error: " + error + " to url: " + b, null, false, 12, null);
        this.b.a(b);
    }
}
