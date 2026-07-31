package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import net.pubnative.lite.sdk.vpaid.PlayerInfo;
import net.pubnative.lite.sdk.vpaid.VideoAdListener;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ﺘ, reason: contains not printable characters */
/* loaded from: classes15.dex */
public final class C1260 extends VideoAdListener implements InterfaceC1111 {

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C1249 f3421;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final C1189 f3422;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final VideoAdListener f3423;

    public C1260(C1249 c1249, VideoAdListener videoAdListener, C1189 c1189) {
        this.f3421 = c1249;
        this.f3423 = videoAdListener;
        this.f3422 = c1189;
    }

    @Override // net.pubnative.lite.sdk.vpaid.VideoAdListener
    public final void onAdClicked() {
        this.f3421.m4103(this, this.f3422, StringFog.decrypt("EiXt0O6VPyotP/3Q77EpSCsiyNHCuDIFLynt\n", "REyJtYHUW2Y=\n"), new Object[0]);
        VideoAdListener videoAdListener = this.f3423;
        if (videoAdListener != null) {
            videoAdListener.onAdClicked();
        }
    }

    @Override // net.pubnative.lite.sdk.vpaid.VideoAdListener
    public final void onAdCustomEndCardFound() {
        this.f3421.m4103(this, this.f3422, StringFog.decrypt("5KsQENlfwKLbsQAQ2HvWwN2sNRH1a9ea3a8xG9JdxZzWhBsA2Ho=\n", "ssJ0dbYepO4=\n"), new Object[0]);
        VideoAdListener videoAdListener = this.f3423;
        if (videoAdListener != null) {
            videoAdListener.onAdCustomEndCardFound();
        }
    }

    @Override // net.pubnative.lite.sdk.vpaid.VideoAdListener
    public final void onAdDidReachEnd() {
        this.f3421.m4103(this, this.f3422, StringFog.decrypt("h63WrNNr5WS4t8as0k/zBr6q8634Q+V6tKXRoflE5Q==\n", "0cSyybwqgSg=\n"), new Object[0]);
        VideoAdListener videoAdListener = this.f3423;
        if (videoAdListener != null) {
            videoAdListener.onAdDidReachEnd();
        }
    }

    @Override // net.pubnative.lite.sdk.vpaid.VideoAdListener
    public final void onAdDismissed() {
        this.f3421.m4103(this, this.f3422, StringFog.decrypt("kjw9q5j7nBytJi2rmd+Kfqs7GKqz04s9rSYqq5M=\n", "xFVZzve6+FA=\n"), new Object[0]);
        VideoAdListener videoAdListener = this.f3423;
        if (videoAdListener != null) {
            videoAdListener.onAdDismissed();
        }
    }

    @Override // net.pubnative.lite.sdk.vpaid.VideoAdListener
    public final void onAdExpired() {
        this.f3421.m4103(this, this.f3422, StringFog.decrypt("ZN98Awxut+hbxWwDDUqhil3YWQImV6PNQNN8\n", "MrYYZmMv06Q=\n"), new Object[0]);
        VideoAdListener videoAdListener = this.f3423;
        if (videoAdListener != null) {
            videoAdListener.onAdExpired();
        }
    }

    @Override // net.pubnative.lite.sdk.vpaid.VideoAdListener
    public final void onAdLoadFail(PlayerInfo playerInfo) {
        this.f3421.m4103(this, this.f3422, StringFog.decrypt("XX6Fp+4ayXdiZJWn7z7fFWR5oKbNNMxfTXaIrg==\n", "CxfhwoFbrTs=\n"), playerInfo);
        VideoAdListener videoAdListener = this.f3423;
        if (videoAdListener != null) {
            videoAdListener.onAdLoadFail(playerInfo);
        }
    }

    @Override // net.pubnative.lite.sdk.vpaid.VideoAdListener
    public final void onAdLoadSuccess() {
        this.f3421.m4103(this, this.f3422, StringFog.decrypt("hPMDHjFVfoC76RMeMHFo4r30Jh8Se3uoge8EGDtnaQ==\n", "0ppne14UGsw=\n"), new Object[0]);
        VideoAdListener videoAdListener = this.f3423;
        if (videoAdListener != null) {
            videoAdListener.onAdLoadSuccess();
        }
    }

    @Override // net.pubnative.lite.sdk.vpaid.VideoAdListener
    public final void onAdSkipped() {
        this.f3421.m4103(this, this.f3422, StringFog.decrypt("h0K+W2xUJW+4WK5bbXAzDb5Fm1pQfihToU6+\n", "0SvaPgMVQSM=\n"), new Object[0]);
        VideoAdListener videoAdListener = this.f3423;
        if (videoAdListener != null) {
            videoAdListener.onAdSkipped();
        }
    }

    @Override // net.pubnative.lite.sdk.vpaid.VideoAdListener
    public final void onAdStarted() {
        this.f3421.m4103(this, this.f3422, StringFog.decrypt("iqVn+/XalDy1v3f79P6CXrOiQvrJ75ECqKln\n", "3MwDnpqb8HA=\n"), new Object[0]);
        VideoAdListener videoAdListener = this.f3423;
        if (videoAdListener != null) {
            videoAdListener.onAdStarted();
        }
    }

    @Override // net.pubnative.lite.sdk.vpaid.VideoAdListener
    public final void onCustomCTACLick(boolean z) {
        this.f3421.m4103(this, this.f3422, StringFog.decrypt("x6+DNeHJc0v4tZM14O1lKf6opCX9/Hhq0pKmE8LhdGw=\n", "kcbnUI6IFwc=\n"), Boolean.valueOf(z));
        VideoAdListener videoAdListener = this.f3423;
        if (videoAdListener != null) {
            videoAdListener.onCustomCTACLick(z);
        }
    }

    @Override // net.pubnative.lite.sdk.vpaid.VideoAdListener
    public final void onCustomCTALoadFail() {
        this.f3421.m4103(this, this.f3422, StringFog.decrypt("HoRB2BqzKikhnlHYG5c8SyeDZsgGhiEIC7lk8RqTKiMphEk=\n", "SO0lvXXyTmU=\n"), new Object[0]);
        VideoAdListener videoAdListener = this.f3423;
        if (videoAdListener != null) {
            videoAdListener.onCustomCTALoadFail();
        }
    }

    @Override // net.pubnative.lite.sdk.vpaid.VideoAdListener
    public final void onCustomCTAShow() {
        this.f3421.m4103(this, this.f3422, StringFog.decrypt("JMGxew0VPAEb26F7DDEqYx3GlmsRIDcgMfyUTQo7Lw==\n", "cqjVHmJUWE0=\n"), new Object[0]);
        VideoAdListener videoAdListener = this.f3423;
        if (videoAdListener != null) {
            videoAdListener.onCustomCTAShow();
        }
    }

    @Override // net.pubnative.lite.sdk.vpaid.VideoAdListener
    public final void onCustomEndCardClick(String str) {
        this.f3421.m4103(this, this.f3422, StringFog.decrypt("fzWYRM3m8ctAL4hEzMLnqUYyv1TR0/rqbDKYYsPV8cRFNZ9K\n", "KVz8IaKnlYc=\n"), str);
        VideoAdListener videoAdListener = this.f3423;
        if (videoAdListener != null) {
            videoAdListener.onCustomEndCardClick(str);
        }
    }

    @Override // net.pubnative.lite.sdk.vpaid.VideoAdListener
    public final void onCustomEndCardShow(String str) {
        this.f3421.m4103(this, this.f3422, StringFog.decrypt("QYz2R4FNH2N+luZHgGkJAXiL0VedeBRCUov2YY9+H3x/iuU=\n", "F+WSIu4Mey8=\n"), str);
        VideoAdListener videoAdListener = this.f3423;
        if (videoAdListener != null) {
            videoAdListener.onCustomEndCardShow(str);
        }
    }

    @Override // net.pubnative.lite.sdk.vpaid.VideoAdListener
    public final void onDefaultEndCardClick(String str) {
        this.f3421.m4103(this, this.f3422, StringFog.decrypt("34qV8TaOLFLgkIXxN6o6MOaNtfE/rj1y/aaf8BquOnrKj5j3Mg==\n", "iePxlFnPSB4=\n"), str);
        VideoAdListener videoAdListener = this.f3423;
        if (videoAdListener != null) {
            videoAdListener.onDefaultEndCardClick(str);
        }
    }

    @Override // net.pubnative.lite.sdk.vpaid.VideoAdListener
    public final void onDefaultEndCardShow(String str) {
        this.f3421.m4103(this, this.f3422, StringFog.decrypt("BgZNSJnHfj45HF1ImONoXD8BbUiQ528eJCpHSbXnaBYDB0Za\n", "UG8pLfaGGnI=\n"), str);
        VideoAdListener videoAdListener = this.f3423;
        if (videoAdListener != null) {
            videoAdListener.onDefaultEndCardShow(str);
        }
    }

    @Override // net.pubnative.lite.sdk.vpaid.VideoAdListener
    public final void onEndCardClosed(Boolean bool) {
        this.f3421.m4103(this, this.f3422, StringFog.decrypt("ekV1Fki9iohFX2UWSZmc6kNCVB1Dv4+2SG99HFSZig==\n", "LCwRcyf87sQ=\n"), bool);
        VideoAdListener videoAdListener = this.f3423;
        if (videoAdListener != null) {
            videoAdListener.onEndCardClosed(bool);
        }
    }

    @Override // net.pubnative.lite.sdk.vpaid.VideoAdListener
    public final void onEndCardLoadFail(Boolean bool) {
        this.f3421.m4103(this, this.f3422, StringFog.decrypt("aC9GreZcCDdXNVat53geVVEoZ6btXg0JWgpNqe1bDRJS\n", "PkYiyIkdbHs=\n"), bool);
        VideoAdListener videoAdListener = this.f3423;
        if (videoAdListener != null) {
            videoAdListener.onEndCardLoadFail(bool);
        }
    }

    @Override // net.pubnative.lite.sdk.vpaid.VideoAdListener
    public final void onEndCardLoadSuccess(Boolean bool) {
        this.f3421.m4103(this, this.f3422, StringFog.decrypt("NZQwXZfjPtoKjiBdlscouAyTEVac4TvkB7E7WZzxL/UAmCdL\n", "Y/1UOPiiWpY=\n"), bool);
        VideoAdListener videoAdListener = this.f3423;
        if (videoAdListener != null) {
            videoAdListener.onEndCardLoadSuccess(bool);
        }
    }

    @Override // net.pubnative.lite.sdk.vpaid.VideoAdListener
    public final void onEndCardSkipped(Boolean bool) {
        this.f3421.m4103(this, this.f3422, StringFog.decrypt("uAzGblLEFamHFtZuU+ADy4EL52VZxhCXijbJYk31FIE=\n", "7mWiCz2FceU=\n"), bool);
        VideoAdListener videoAdListener = this.f3423;
        if (videoAdListener != null) {
            videoAdListener.onEndCardSkipped(bool);
        }
    }

    @Override // net.pubnative.lite.sdk.vpaid.VideoAdListener
    public final void onLeaveApp() {
        this.f3421.m4103(this, this.f3422, StringFog.decrypt("+UcTkgn6cjvGXQOSCN5kWcBAO5IHzXM2314=\n", "ry5392a7Fnc=\n"), new Object[0]);
        VideoAdListener videoAdListener = this.f3423;
        if (videoAdListener != null) {
            videoAdListener.onLeaveApp();
        }
    }

    @Override // net.pubnative.lite.sdk.vpaid.VideoAdListener
    public final void onReplay() {
        this.f3421.m4103(this, this.f3422, StringFog.decrypt("kcTMsnsvnB2u3tyyeguKf6jD+rJkApko\n", "x62o1xRu+FE=\n"), new Object[0]);
        VideoAdListener videoAdListener = this.f3423;
        if (videoAdListener != null) {
            videoAdListener.onReplay();
        }
    }

    @Override // net.pubnative.lite.sdk.vpaid.VideoAdListener
    public final void onReplayFinish() {
        this.f3421.m4103(this, this.f3422, StringFog.decrypt("vbBmO9Tl1WGCqnY71cHDA4S3UDvLyNBUrbBsN8jM\n", "69kCXruksS0=\n"), new Object[0]);
        VideoAdListener videoAdListener = this.f3423;
        if (videoAdListener != null) {
            videoAdListener.onReplayFinish();
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC1111
    /* renamed from: ﾒ */
    public final Object mo3996() {
        return this.f3423;
    }

    @Override // net.pubnative.lite.sdk.vpaid.VideoAdListener
    public final void onAdDismissed(int i) {
        this.f3421.m4103(this, this.f3422, StringFog.decrypt("jQB9W08x+NmyGm1bThXuu7QHWFpkGe/4shpqW0Qn9eGzOWtRRwL55qg=\n", "22kZPiBwnJU=\n"), Integer.valueOf(i));
        VideoAdListener videoAdListener = this.f3423;
        if (videoAdListener != null) {
            videoAdListener.onAdDismissed(i);
        }
    }
}
