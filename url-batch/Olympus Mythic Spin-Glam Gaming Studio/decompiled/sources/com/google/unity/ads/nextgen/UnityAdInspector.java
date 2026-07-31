package com.google.unity.ads.nextgen;

import android.app.Activity;
import com.google.android.libraries.ads.mobile.sdk.MobileAds;
import com.google.android.libraries.ads.mobile.sdk.common.AdInspectorError;
import com.google.android.libraries.ads.mobile.sdk.common.OnAdInspectorClosedListener;

/* loaded from: classes3.dex */
public final class UnityAdInspector {
    private UnityAdInspector() {
    }

    public static void openAdInspector(Activity activity, final UnityAdInspectorListener unityAdInspectorListener) {
        MobileAds.openAdInspector(new OnAdInspectorClosedListener() { // from class: com.google.unity.ads.nextgen.UnityAdInspector.1
            public void onAdInspectorClosed(AdInspectorError adInspectorError) {
                UnityAdInspectorListener unityAdInspectorListener2 = UnityAdInspectorListener.this;
                if (unityAdInspectorListener2 != null) {
                    unityAdInspectorListener2.onAdInspectorClosed(adInspectorError);
                }
            }
        });
    }
}
