package com.ironsource.adqualitysdk.sdk.i;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.ironsource.adqualitysdk.sdk.StringFog;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ث, reason: contains not printable characters */
/* loaded from: classes15.dex */
public final class C0632 extends FullScreenContentCallback implements InterfaceC1111 {

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C0624 f1268;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final C1189 f1269;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final FullScreenContentCallback f1270;

    public C0632(C0624 c0624, FullScreenContentCallback fullScreenContentCallback, C1189 c1189) {
        this.f1268 = c0624;
        this.f1270 = fullScreenContentCallback;
        this.f1269 = c1189;
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdClicked() {
        this.f1268.m4103(this, this.f1269, StringFog.decrypt("q9au7D3GmY+IzYHvANGOhJngo+wCx4qJho2t7i/BqIaEwKnlCg==\n", "7aPCgG6l6+o=\n"), new Object[0]);
        FullScreenContentCallback fullScreenContentCallback = this.f1270;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdClicked();
        }
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdDismissedFullScreenContent() {
        this.f1268.m4103(this, this.f1269, StringFog.decrypt("pNcEEzA8JxqHzCsQDSswEZbhCRMPPTQciYwHESI7ERaRzwEMEDoxOZfOBCwALTAajOEHERc6Ows=\n", "4qJof2NfVX8=\n"), new Object[0]);
        FullScreenContentCallback fullScreenContentCallback = this.f1270;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdDismissedFullScreenContent();
        }
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdFailedToShowFullScreenContent(AdError adError) {
        this.f1268.m4103(this, this.f1269, StringFog.decrypt("bypvLI0c1+dMMUAvsAvA7F0cYiyyHcThQnFsLp8b4+NAM2YkihD26kYoRTWyE/bhWzpmLp0Qy/ZM\nMXc=\n", "KV8DQN5/pYI=\n"), adError);
        FullScreenContentCallback fullScreenContentCallback = this.f1270;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdFailedToShowFullScreenContent(adError);
        }
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdImpression() {
        this.f1268.m4103(this, this.f1269, StringFog.decrypt("HqKaPQ/X9r09ubU+MsDhtiyUlz0w1uW7M/mZPx3QzbUopZMiL93rtg==\n", "WNf2UVy0hNg=\n"), new Object[0]);
        FullScreenContentCallback fullScreenContentCallback = this.f1270;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdImpression();
        }
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdShowedFullScreenContent() {
        this.f1268.m4103(this, this.f1269, StringFog.decrypt("bW3gQvm8WQZOds9BxKtODV9b7ULGvUoAQDbjQOu7eAtEb+lK7KpHD3h7/kvPsWgMRWzpQN4=\n", "KxiMLqrfK2M=\n"), new Object[0]);
        FullScreenContentCallback fullScreenContentCallback = this.f1270;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdShowedFullScreenContent();
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC1111
    /* renamed from: ﾒ */
    public final Object mo3996() {
        return this.f1270;
    }
}
