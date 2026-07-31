package com.ogury.ad.viewer;

import com.ironsource.Zf;
import com.mobilefuse.sdk.telemetry.TelemetryAdLifecycleEvent;
import com.ogury.ad.OguryAdError;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\u0003H&J\b\u0010\n\u001a\u00020\u0003H&J\b\u0010\u000b\u001a\u00020\u0003H&J\b\u0010\f\u001a\u00020\u0003H&¨\u0006\r"}, d2 = {"Lcom/ogury/ad/viewer/AdsCallback;", "", Zf.h, "", Zf.f, Zf.g, TelemetryAdLifecycleEvent.AD_ERROR, "oguryAdError", "Lcom/ogury/ad/OguryAdError;", "onAdImpression", Zf.j, "onAdNotAvailable", "onAdNotLoaded", "sdk-ads_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface AdsCallback {
    void onAdAvailable();

    void onAdClicked();

    void onAdClosed();

    void onAdError(@NotNull OguryAdError oguryAdError);

    void onAdImpression();

    void onAdLoaded();

    void onAdNotAvailable();

    void onAdNotLoaded();
}
