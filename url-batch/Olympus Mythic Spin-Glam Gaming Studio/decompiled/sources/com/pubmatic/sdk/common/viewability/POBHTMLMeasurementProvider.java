package com.pubmatic.sdk.common.viewability;

import android.webkit.WebView;
import androidx.annotation.NonNull;

/* loaded from: classes11.dex */
public interface POBHTMLMeasurementProvider extends POBMeasurementProvider {

    public enum POBHTMLAdEventType {
        LOADED,
        IMPRESSION,
        CLICK,
        ACCEPT_INVITATION
    }

    void signalAdEvent(@NonNull POBHTMLAdEventType pOBHTMLAdEventType);

    void startAdSession(@NonNull WebView webView);
}
