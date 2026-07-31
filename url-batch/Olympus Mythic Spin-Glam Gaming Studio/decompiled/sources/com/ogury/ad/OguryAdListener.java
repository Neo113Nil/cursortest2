package com.ogury.ad;

import com.ironsource.Zf;
import com.mobilefuse.sdk.telemetry.TelemetryAdLifecycleEvent;
import com.ogury.ad.internal.p8;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00028\u0000H&¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\b\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00028\u0000H&¢\u0006\u0004\b\b\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00028\u0000H&¢\u0006\u0004\b\t\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00028\u0000H&¢\u0006\u0004\b\n\u0010\u0007J\u001f\u0010\r\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/ogury/ad/OguryAdListener;", "Lcom/ogury/ad/internal/p8;", "T", "", "ad", "", Zf.j, "(Lcom/ogury/ad/internal/p8;)V", "onAdImpression", Zf.f, Zf.g, "Lcom/ogury/ad/OguryAdError;", "error", TelemetryAdLifecycleEvent.AD_ERROR, "(Lcom/ogury/ad/internal/p8;Lcom/ogury/ad/OguryAdError;)V", "sdk-ads_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface OguryAdListener<T extends p8> {
    void onAdClicked(@NotNull T ad);

    void onAdClosed(@NotNull T ad);

    void onAdError(@NotNull T ad, @NotNull OguryAdError error);

    void onAdImpression(@NotNull T ad);

    void onAdLoaded(@NotNull T ad);
}
