package com.moloco.sdk.internal.error;

import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.internal.MolocoLogger;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
/* loaded from: classes14.dex */
public final class c implements b {
    public static final int d = 0;

    @NotNull
    public final com.moloco.sdk.internal.services.config.a a;

    @NotNull
    public final com.moloco.sdk.internal.error.api.a b;

    @NotNull
    public final String c;

    public c(@NotNull com.moloco.sdk.internal.services.config.a configService, @NotNull com.moloco.sdk.internal.error.api.a errorReportingApi) {
        Intrinsics.checkNotNullParameter(configService, "configService");
        Intrinsics.checkNotNullParameter(errorReportingApi, "errorReportingApi");
        this.a = configService;
        this.b = errorReportingApi;
        this.c = "ErrorReportingServiceImpl";
    }

    @Override // com.moloco.sdk.internal.error.b
    public void a(@NotNull String error, @NotNull a errorMetadata) {
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(errorMetadata, "errorMetadata");
        if (this.a.a(d.a)) {
            String b = this.a.b(d.a);
            if (b == null) {
                MolocoLogger.error$default(MolocoLogger.INSTANCE, this.c, "Error reporting is enabled but with invalid url", null, false, 12, null);
                return;
            } else {
                this.b.a(error, b, errorMetadata);
                return;
            }
        }
        MolocoLogger.warn$default(MolocoLogger.INSTANCE, this.c, "Error reporting is disabled. Tried to report error: " + error, null, false, 12, null);
    }
}
