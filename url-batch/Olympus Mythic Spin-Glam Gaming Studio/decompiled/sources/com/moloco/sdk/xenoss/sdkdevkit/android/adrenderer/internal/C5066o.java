package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import com.moloco.sdk.internal.MolocoLogger;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.o, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C5066o {

    @NotNull
    public static final String a = "DEC_FAILED_TO_LOAD";

    @NotNull
    public static final String b = "DEC_LOADED_WITH_NO_APP_ICON";

    @NotNull
    public static final String c = "DECLoaderImpl";

    public static final void b(String str) {
        MolocoLogger.debug$default(MolocoLogger.INSTANCE, c, str, false, 4, null);
    }

    @NotNull
    public static final InterfaceC5064m a(@NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.i mediaCacheRepository, @NotNull com.moloco.sdk.internal.error.b errorReportingService) {
        Intrinsics.checkNotNullParameter(mediaCacheRepository, "mediaCacheRepository");
        Intrinsics.checkNotNullParameter(errorReportingService, "errorReportingService");
        return new C5065n(mediaCacheRepository, errorReportingService);
    }
}
