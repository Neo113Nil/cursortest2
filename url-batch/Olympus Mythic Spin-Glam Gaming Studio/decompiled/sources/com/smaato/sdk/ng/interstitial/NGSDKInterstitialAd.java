package com.smaato.sdk.ng.interstitial;

import android.app.Activity;
import com.smaato.sdk.ng.interstitial.NextGenInterstitialAd;

/* loaded from: classes12.dex */
public class NGSDKInterstitialAd extends NextGenInterstitialAd {

    public interface Listener extends NextGenInterstitialAd.Listener {
    }

    public NGSDKInterstitialAd(Activity activity, String str, Listener listener) {
        super(activity, str, (NextGenInterstitialAd.Listener) listener);
    }
}
