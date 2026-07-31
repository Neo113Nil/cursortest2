package com.ogury.ad.internal;

import com.ogury.ad.OguryAdError;
import com.ogury.ad.viewer.AdsCallback;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes9.dex */
public final class f1 implements AdsCallback {
    public OguryListenerAdapter a;
    public FunctionReferenceImpl b;

    @Override // com.ogury.ad.viewer.AdsCallback
    public final void onAdAvailable() {
        OguryListenerAdapter oguryListenerAdapter = this.a;
        if (oguryListenerAdapter != null) {
            oguryListenerAdapter.onAdAvailable();
        }
    }

    @Override // com.ogury.ad.viewer.AdsCallback
    public final void onAdClicked() {
        OguryListenerAdapter oguryListenerAdapter = this.a;
        if (oguryListenerAdapter != null) {
            oguryListenerAdapter.onAdClicked();
        }
    }

    @Override // com.ogury.ad.viewer.AdsCallback
    public final void onAdClosed() {
        OguryListenerAdapter oguryListenerAdapter = this.a;
        if (oguryListenerAdapter != null) {
            oguryListenerAdapter.onAdClosed();
        }
    }

    @Override // com.ogury.ad.viewer.AdsCallback
    public final void onAdError(OguryAdError oguryAdError) {
        Intrinsics.checkNotNullParameter(oguryAdError, "oguryAdError");
        OguryListenerAdapter oguryListenerAdapter = this.a;
        if (oguryListenerAdapter != null) {
            oguryListenerAdapter.onAdError(oguryAdError);
        }
    }

    @Override // com.ogury.ad.viewer.AdsCallback
    public final void onAdImpression() {
        OguryListenerAdapter oguryListenerAdapter = this.a;
        if (oguryListenerAdapter != null) {
            oguryListenerAdapter.onAdImpression();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.FunctionReferenceImpl] */
    @Override // com.ogury.ad.viewer.AdsCallback
    public final void onAdLoaded() {
        OguryListenerAdapter oguryListenerAdapter = this.a;
        if (oguryListenerAdapter != null) {
            oguryListenerAdapter.onAdLoaded();
        }
        ?? r0 = this.b;
        if (r0 != 0) {
            r0.mo4828invoke();
        }
    }

    @Override // com.ogury.ad.viewer.AdsCallback
    public final void onAdNotAvailable() {
        OguryListenerAdapter oguryListenerAdapter = this.a;
        if (oguryListenerAdapter != null) {
            oguryListenerAdapter.onAdNotAvailable();
        }
    }

    @Override // com.ogury.ad.viewer.AdsCallback
    public final void onAdNotLoaded() {
        OguryListenerAdapter oguryListenerAdapter = this.a;
        if (oguryListenerAdapter != null) {
            oguryListenerAdapter.onAdNotLoaded();
        }
    }
}
