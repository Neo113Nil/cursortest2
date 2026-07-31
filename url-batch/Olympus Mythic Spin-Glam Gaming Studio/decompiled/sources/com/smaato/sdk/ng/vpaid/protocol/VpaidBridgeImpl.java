package com.smaato.sdk.ng.vpaid.protocol;

import android.webkit.JavascriptInterface;
import com.smaato.sdk.ng.utils.Logger;
import com.smaato.sdk.ng.vpaid.models.vpaid.CreativeParams;
import java.util.Locale;
import java.util.Objects;

/* loaded from: classes6.dex */
public class VpaidBridgeImpl implements VpaidBridge {
    private static final String c = "VpaidBridgeImpl";
    private final BridgeEventHandler a;
    private final CreativeParams b;

    public VpaidBridgeImpl(BridgeEventHandler bridgeEventHandler, CreativeParams creativeParams) {
        this.a = bridgeEventHandler;
        this.b = creativeParams;
    }

    private void a(Runnable runnable) {
        this.a.runOnUiThread(runnable);
    }

    private void b(String str) {
        a("vapidWrapperInstance." + str);
    }

    @JavascriptInterface
    public void getAdDurationResult(int i) {
        Logger.d(c, "JS: getAdDurationResult: " + i);
    }

    @JavascriptInterface
    public void getAdExpandedResult(String str) {
        Logger.d(c, "JS: getAdExpandedResult");
    }

    @JavascriptInterface
    public void getAdLinearResult(boolean z) {
        Logger.d(c, "getAdLinearResult: " + z);
    }

    @JavascriptInterface
    public void getAdRemainingTimeResult(int i) {
        Logger.d(c, "JS: getAdRemainingTimeResult: " + i);
        if (i == 0) {
            this.a.postEvent("complete", true);
        } else {
            this.a.postEvent("progress", i, false);
        }
    }

    @Override // com.smaato.sdk.ng.vpaid.protocol.VpaidBridge
    public void getAdSkippableState() {
        Logger.d(c, "call getAdSkippableState()");
        b("getAdSkippableState()");
    }

    @JavascriptInterface
    public void getAdSkippableStateResult(boolean z) {
        Logger.d(c, "JS: SkippableState: " + z);
        this.a.setSkippableState(z);
    }

    @JavascriptInterface
    public void getAdVolumeResult() {
        Logger.d(c, "JS: getAdVolumeResult");
    }

    @JavascriptInterface
    public String handshakeVersionResult(String str) {
        Logger.d(c, "JS: handshakeVersion()");
        return str;
    }

    @JavascriptInterface
    public void initAdResult() {
        Logger.d(c, "JS: Init ad done");
    }

    @Override // com.smaato.sdk.ng.vpaid.protocol.VpaidBridge
    public void pauseAd() {
        Logger.d(c, "call pauseAd()");
        b("pauseAd()");
    }

    @Override // com.smaato.sdk.ng.vpaid.protocol.VpaidBridge
    public void prepare() {
        Logger.d(c, "call initVpaidWrapper()");
        a("initVpaidWrapper()");
    }

    @Override // com.smaato.sdk.ng.vpaid.protocol.VpaidBridge
    public void resumeAd() {
        Logger.d(c, "call resumeAd()");
        b("resumeAd()");
    }

    @Override // com.smaato.sdk.ng.vpaid.protocol.VpaidBridge
    public void startAd() {
        Logger.d(c, "call startAd()");
        b("startAd()");
    }

    @Override // com.smaato.sdk.ng.vpaid.protocol.VpaidBridge
    public void stopAd() {
        Logger.d(c, "call stopAd()");
        b("stopAd()");
    }

    @JavascriptInterface
    public void vpaidAdClickThruIdPlayerHandles(String str, String str2, boolean z) {
        if (z) {
            this.a.openUrl(str);
        }
    }

    @JavascriptInterface
    public void vpaidAdDurationChange() {
        Logger.d(c, "JS: vpaidAdDurationChange");
        b("getAdDurationResult");
        this.a.onDurationChanged();
    }

    @JavascriptInterface
    public void vpaidAdError(String str) {
        Logger.d(c, "JS: vpaidAdError" + str);
        this.a.trackError(str);
    }

    @JavascriptInterface
    public void vpaidAdExpandedChange() {
        Logger.d(c, "JS: vpaidAdExpandedChange");
    }

    @JavascriptInterface
    public void vpaidAdImpression() {
        Logger.d(c, "JS: vpaidAdImpression");
        this.a.onAdImpression();
    }

    @JavascriptInterface
    public void vpaidAdInteraction() {
        Logger.d(c, "JS: vpaidAdInteraction");
    }

    @JavascriptInterface
    public void vpaidAdLinearChange() {
        Logger.d(c, "JS: vpaidAdLinearChange");
        this.a.onAdLinearChange();
    }

    @JavascriptInterface
    public void vpaidAdLoaded() {
        Logger.d(c, "JS: vpaidAdLoaded");
        this.a.onPrepared();
    }

    @JavascriptInterface
    public void vpaidAdLog(String str) {
        Logger.d(c, "JS: vpaidAdLog " + str);
    }

    @JavascriptInterface
    public void vpaidAdPaused() {
        Logger.d(c, "JS: vpaidAdPaused");
        this.a.postEvent("pause", false);
    }

    @JavascriptInterface
    public void vpaidAdPlaying() {
        Logger.d(c, "JS: vpaidAdPlaying");
        this.a.postEvent("resume", false);
    }

    @JavascriptInterface
    public void vpaidAdRemainingTimeChange() {
        Logger.d(c, "JS: vpaidAdRemainingTimeChange");
        b("getAdRemainingTime()");
    }

    @JavascriptInterface
    public void vpaidAdSizeChange() {
        Logger.d(c, "JS: vpaidAdSizeChange");
    }

    @JavascriptInterface
    public void vpaidAdSkippableStateChange() {
        Logger.d(c, "JS: vpaidAdSkippableStateChange");
    }

    @JavascriptInterface
    public void vpaidAdSkipped() {
        Logger.d(c, "JS: vpaidAdSkipped");
        final BridgeEventHandler bridgeEventHandler = this.a;
        Objects.requireNonNull(bridgeEventHandler);
        a(new Runnable() { // from class: com.smaato.sdk.ng.vpaid.protocol.VpaidBridgeImpl$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                BridgeEventHandler.this.onAdSkipped();
            }
        });
    }

    @JavascriptInterface
    public void vpaidAdStarted() {
        Logger.d(c, "JS: vpaidAdStarted");
    }

    @JavascriptInterface
    public void vpaidAdStopped() {
        Logger.d(c, "JS: vpaidAdStopped");
        final BridgeEventHandler bridgeEventHandler = this.a;
        Objects.requireNonNull(bridgeEventHandler);
        a(new Runnable() { // from class: com.smaato.sdk.ng.vpaid.protocol.VpaidBridgeImpl$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                BridgeEventHandler.this.onAdStopped();
            }
        });
    }

    @JavascriptInterface
    public void vpaidAdUserAcceptInvitation() {
        Logger.d(c, "JS: vpaidAdUserAcceptInvitation");
    }

    @JavascriptInterface
    public void vpaidAdUserClose() {
        Logger.d(c, "JS: vpaidAdUserClose");
    }

    @JavascriptInterface
    public void vpaidAdUserMinimize() {
        Logger.d(c, "JS: vpaidAdUserMinimize");
    }

    @JavascriptInterface
    public void vpaidAdVideoComplete() {
        Logger.d(c, "JS: vpaidAdVideoComplete");
    }

    @JavascriptInterface
    public void vpaidAdVideoFirstQuartile() {
        this.a.postEvent("firstQuartile", true);
    }

    @JavascriptInterface
    public void vpaidAdVideoMidpoint() {
        Logger.d(c, "JS: vpaidAdVideoMidpoint");
        this.a.postEvent("midpoint", true);
    }

    @JavascriptInterface
    public void vpaidAdVideoStart() {
        Logger.d(c, "JS: vpaidAdVideoStart");
        this.a.postEvent("start", true);
    }

    @JavascriptInterface
    public void vpaidAdVideoThirdQuartile() {
        Logger.d(c, "JS: vpaidAdVideoThirdQuartile");
        this.a.postEvent("thirdQuartile", true);
    }

    @JavascriptInterface
    public void vpaidAdVolumeChanged() {
        Logger.d(c, "JS: vpaidAdVolumeChanged");
        this.a.onAdVolumeChange();
    }

    @JavascriptInterface
    public void wrapperReady() {
        a();
    }

    private void a(String str) {
        this.a.callJsMethod(str);
    }

    private void a() {
        Logger.d(c, "JS: call initAd()");
        b(String.format(Locale.ENGLISH, "initAd(%1$d,%2$d,%3$s,%4$s,%5$s,%6$s)", Integer.valueOf(this.b.getWidth()), Integer.valueOf(this.b.getHeight()), this.b.getViewMode(), Integer.valueOf(this.b.getDesiredBitrate()), this.b.getCreativeData(), this.b.getEnvironmentVars()));
    }
}
