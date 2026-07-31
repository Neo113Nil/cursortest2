package com.pubmatic.sdk.common.viewability;

import android.view.View;
import androidx.annotation.NonNull;
import com.pubmatic.sdk.common.POBDataType;
import java.util.List;

/* loaded from: classes9.dex */
public interface POBVideoMeasurementProvider extends POBMeasurementProvider {

    public interface POBOmidSessionListener {
        void onOmidSessionInitialized();
    }

    public enum POBVideoAdErrorType {
        GENERIC,
        VIDEO
    }

    public enum POBVideoPlayerState {
        FULLSCREEN,
        MINIMIZED,
        COLLAPSED,
        NORMAL,
        EXPANDED
    }

    void impressionOccurred();

    void loaded(boolean z, float f);

    void signalAdEvent(@NonNull POBDataType.POBVideoAdEventType pOBVideoAdEventType);

    void signalError(@NonNull POBVideoAdErrorType pOBVideoAdErrorType, @NonNull String str);

    void signalPlayerStateChange(@NonNull POBVideoPlayerState pOBVideoPlayerState);

    void start(float f, float f2);

    void startAdSession(View view, @NonNull List<POBVerificationScriptResource> list, @NonNull POBOmidSessionListener pOBOmidSessionListener);
}
