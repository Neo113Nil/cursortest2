package com.ogury.ad.internal;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ironsource.Zf;
import com.mobilefuse.sdk.telemetry.TelemetryAdLifecycleEvent;
import com.ogury.ad.OguryAdError;
import com.ogury.ad.OguryAdListener;
import com.ogury.ad.OguryShowErrorCode;
import com.ogury.ad.internal.p8;
import com.ogury.ad.viewer.AdsCallback;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\b\u0016\u0018\u0000 \u0019*\b\b\u0000\u0010\u0002*\u00020\u0001*\u000e\b\u0001\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00000\u00032\u00020\u0005:\u0001\u001aB\u0019\u0012\u0006\u0010\u0006\u001a\u00028\u0000\u0012\b\u0010\u0007\u001a\u0004\u0018\u00018\u0001¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000e\u0010\fJ\u000f\u0010\u000f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010\fJ\u000f\u0010\u0010\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0010\u0010\fJ\u000f\u0010\u0011\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0011\u0010\fJ\u0017\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0016\u0010\fR\u0014\u0010\u0006\u001a\u00028\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0017R\u0016\u0010\u0007\u001a\u0004\u0018\u00018\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0018¨\u0006\u001b"}, d2 = {"Lcom/ogury/ad/internal/OguryListenerAdapter;", "Lcom/ogury/ad/internal/p8;", "T", "Lcom/ogury/ad/OguryAdListener;", "L", "Lcom/ogury/ad/viewer/AdsCallback;", "ad", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(Lcom/ogury/ad/internal/p8;Lcom/ogury/ad/OguryAdListener;)V", "", Zf.h, "()V", "onAdNotAvailable", Zf.j, "onAdImpression", "onAdNotLoaded", Zf.g, "Lcom/ogury/ad/OguryAdError;", "oguryAdError", TelemetryAdLifecycleEvent.AD_ERROR, "(Lcom/ogury/ad/OguryAdError;)V", Zf.f, "Lcom/ogury/ad/internal/p8;", "Lcom/ogury/ad/OguryAdListener;", "Companion", "com/ogury/ad/internal/f9", "sdk-ads_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public class OguryListenerAdapter<T extends p8, L extends OguryAdListener<T>> implements AdsCallback {

    @NotNull
    public static final f9 Companion = new f9();

    @NotNull
    private final T ad;

    @Nullable
    private final L listener;

    public OguryListenerAdapter(@NotNull T ad, @Nullable L l) {
        Intrinsics.checkNotNullParameter(ad, "ad");
        this.ad = ad;
        this.listener = l;
    }

    @Override // com.ogury.ad.viewer.AdsCallback
    public void onAdAvailable() {
    }

    @Override // com.ogury.ad.viewer.AdsCallback
    public void onAdClicked() {
        L l = this.listener;
        if (l != null) {
            l.onAdClicked(this.ad);
        }
    }

    @Override // com.ogury.ad.viewer.AdsCallback
    public void onAdClosed() {
        L l = this.listener;
        if (l != null) {
            l.onAdClosed(this.ad);
        }
    }

    @Override // com.ogury.ad.viewer.AdsCallback
    public void onAdError(@NotNull OguryAdError oguryAdError) {
        Intrinsics.checkNotNullParameter(oguryAdError, "oguryAdError");
        L l = this.listener;
        if (l != null) {
            l.onAdError(this.ad, oguryAdError);
        }
    }

    @Override // com.ogury.ad.viewer.AdsCallback
    public void onAdImpression() {
        L l = this.listener;
        if (l != null) {
            l.onAdImpression(this.ad);
        }
    }

    @Override // com.ogury.ad.viewer.AdsCallback
    public void onAdLoaded() {
        L l = this.listener;
        if (l != null) {
            l.onAdLoaded(this.ad);
        }
    }

    @Override // com.ogury.ad.viewer.AdsCallback
    public void onAdNotAvailable() {
        L l = this.listener;
        if (l != null) {
            l.onAdError(this.ad, new OguryAdError(OguryAdError.Type.LOAD_ERROR, 2201, "No ad is currently available for this placement (no fill)."));
        }
    }

    @Override // com.ogury.ad.viewer.AdsCallback
    public void onAdNotLoaded() {
        L l = this.listener;
        if (l != null) {
            l.onAdError(this.ad, new OguryAdError(OguryAdError.Type.LOAD_ERROR, OguryShowErrorCode.NO_AD_LOADED, "No ad has been loaded."));
        }
    }
}
