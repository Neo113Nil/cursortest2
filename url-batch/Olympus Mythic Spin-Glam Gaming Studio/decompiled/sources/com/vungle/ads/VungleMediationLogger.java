package com.vungle.ads;

import com.vungle.ads.internal.AnalyticsClient;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¨\u0006\b"}, d2 = {"Lcom/vungle/ads/VungleMediationLogger;", "", "Lcom/vungle/ads/VungleAdType;", "ad", "", "message", "", "logError", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes3.dex */
public final class VungleMediationLogger {

    @NotNull
    public static final VungleMediationLogger INSTANCE = new VungleMediationLogger();

    public static final void logError(@Nullable VungleAdType ad, @NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        AnalyticsClient.INSTANCE.c(Sdk.SDKError.Reason.MEDIATION_ERROR, message, ad != null ? VungleMediationLoggerKt.access$getAdLogEntry(ad) : null);
    }
}
