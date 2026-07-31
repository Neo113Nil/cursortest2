package com.pubmatic.sdk.common.viewability;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;

/* loaded from: classes12.dex */
public interface POBNativeMeasurementProvider extends POBMeasurementProvider {

    public enum POBNativeAdEventType {
        LOADED,
        IMPRESSION
    }

    public interface POBOmidSessionListener {
        void onOmidSessionInitializationFailed();

        void onOmidSessionInitialized();
    }

    void signalAdEvent(@NonNull POBNativeAdEventType pOBNativeAdEventType);

    void startAdSession(@NonNull View view, @Nullable List<? extends POBVerificationScriptResource> list, @NonNull POBOmidSessionListener pOBOmidSessionListener);
}
