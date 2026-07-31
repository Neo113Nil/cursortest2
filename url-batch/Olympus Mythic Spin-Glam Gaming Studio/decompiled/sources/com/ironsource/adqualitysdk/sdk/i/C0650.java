package com.ironsource.adqualitysdk.sdk.i;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;
import com.ironsource.adqualitysdk.sdk.StringFog;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.پ, reason: contains not printable characters */
/* loaded from: classes15.dex */
public final class C0650 extends AdListener implements InterfaceC1111 {

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C0624 f1379;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final C1189 f1380;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final AdListener f1381;

    public C0650(C0624 c0624, AdListener adListener, C1189 c1189) {
        this.f1379 = c0624;
        this.f1381 = adListener;
        this.f1380 = c1189;
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdClosed() {
        this.f1379.m4103(this, this.f1380, StringFog.decrypt("3OO9XnXsVA/49d9YaNlVIvHoglJi\n", "nYfxNwaYMWE=\n"), new Object[0]);
        AdListener adListener = this.f1381;
        if (adListener != null) {
            adListener.onAdClosed();
        }
    }

    public final void onAdFailedToLoad(int i) {
        this.f1379.m4103(this, this.f1380, StringFog.decrypt("CvMlaw31Q4Iu5UdtEMBCqir+BWca1UmgJPYN\n", "S5dpAn6BJuw=\n"), Integer.valueOf(i));
        AdListener adListener = this.f1381;
        if (adListener != null) {
            adListener.onAdFailedToLoad(i);
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdImpression() {
        this.f1379.m4103(this, this.f1380, StringFog.decrypt("O8RRRyzxJXIf0jNBMcQkVRfQb0ss9ilzFA==\n", "eqAdLl+FQBw=\n"), new Object[0]);
        AdListener adListener = this.f1381;
        if (adListener != null) {
            adListener.onAdImpression();
        }
    }

    public final void onAdLeftApplication() {
        this.f1379.m4103(this, this.f1380, StringFog.decrypt("PgChEbit5dcaFsMXpZjk9RoCmTm7qezQHAWZEaS3\n", "f2TteMvZgLk=\n"), new Object[0]);
        AdListener adListener = this.f1381;
        if (adListener != null) {
            adListener.onAdLeftApplication();
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdLoaded() {
        this.f1379.m4103(this, this.f1380, StringFog.decrypt("dA4ZLflW8mFQGHsr5GPzQ1oLMSHu\n", "NWpVRIoilw8=\n"), new Object[0]);
        AdListener adListener = this.f1381;
        if (adListener != null) {
            adListener.onAdLoaded();
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdOpened() {
        this.f1379.m4103(this, this.f1380, StringFog.decrypt("LGsveS4OM18IfU1/Mzsyfh1qDXU5\n", "bQ9jEF16VjE=\n"), new Object[0]);
        AdListener adListener = this.f1381;
        if (adListener != null) {
            adListener.onAdOpened();
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdSwipeGestureClicked() {
        this.f1379.m4103(this, this.f1380, StringFog.decrypt("3hjIAMvlHUv6DqoG1tAcdugV9Az/9AtR6g7hKtT4G076GA==\n", "n3yEabiReCU=\n"), new Object[0]);
        AdListener adListener = this.f1381;
        if (adListener != null) {
            adListener.onAdSwipeGestureClicked();
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC1111
    /* renamed from: ﾒ */
    public final Object mo3996() {
        return this.f1381;
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        this.f1379.m4103(this, this.f1380, StringFog.decrypt("GU6mrsy4Es89WMSo0Y0T5zlDhqLbmBjtN0uOkNa4H+A8b5i10L4=\n", "WCrqx7/Md6E=\n"), loadAdError);
        AdListener adListener = this.f1381;
        if (adListener != null) {
            adListener.onAdFailedToLoad(loadAdError);
        }
    }
}
