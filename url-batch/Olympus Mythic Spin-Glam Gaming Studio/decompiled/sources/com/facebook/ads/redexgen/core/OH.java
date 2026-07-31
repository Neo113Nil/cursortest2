package com.facebook.ads.redexgen.core;

import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.InterstitialAdExtendedListener;
import com.facebook.ads.InterstitialAdListener;

/* loaded from: assets/audience_network/classes2.dex */
public class OH implements InterstitialAdListener {
    public final /* synthetic */ AbstractC3383jd A00;
    public final /* synthetic */ Cif A01;

    public OH(Cif cif, AbstractC3383jd abstractC3383jd) {
        this.A01 = cif;
        this.A00 = abstractC3383jd;
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdClicked(Ad ad) {
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdLoaded(Ad ad) {
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        C3328iY c3328iY;
        interstitialAdExtendedListener = this.A01.A00.A07;
        c3328iY = this.A01.A00.A08;
        interstitialAdExtendedListener.onAdLoaded(c3328iY.A6k());
    }

    @Override // com.facebook.ads.AdListener
    public final void onError(Ad ad, AdError adError) {
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        C3328iY c3328iY;
        this.A01.A00.A01 = null;
        this.A00.A2J(false);
        interstitialAdExtendedListener = this.A01.A00.A07;
        c3328iY = this.A01.A00.A08;
        interstitialAdExtendedListener.onAdLoaded(c3328iY.A6k());
    }

    @Override // com.facebook.ads.InterstitialAdListener
    public final void onInterstitialDismissed(Ad ad) {
        C20917j c20917j;
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        C3328iY c3328iY;
        C20917j c20917j2;
        C20917j c20917j3;
        C20917j c20917j4;
        this.A01.A00.A04 = false;
        c20917j = this.A01.A00.A03;
        if (c20917j != null) {
            c20917j2 = this.A01.A00.A03;
            c20917j2.A0S(new C3335ih(this));
            c20917j3 = this.A01.A00.A03;
            c20917j3.A0N();
            c20917j4 = this.A01.A00.A03;
            c20917j4.A0K();
            this.A01.A00.A03 = null;
        }
        interstitialAdExtendedListener = this.A01.A00.A07;
        c3328iY = this.A01.A00.A08;
        interstitialAdExtendedListener.onInterstitialDismissed(c3328iY.A6k());
    }

    @Override // com.facebook.ads.InterstitialAdListener
    public final void onInterstitialDisplayed(Ad ad) {
    }

    @Override // com.facebook.ads.AdListener
    public final void onLoggingImpression(Ad ad) {
    }
}
