package com.pubmatic.sdk.common.viewability;

import android.content.Context;
import android.view.View;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes8.dex */
public interface POBMeasurementProvider extends POBObstructionUpdateListener {

    public interface POBScriptListener {
        public static final int SCRIPT_LOADING_ERROR = 1;

        @Retention(RetentionPolicy.SOURCE)
        public @interface POBScriptError {
        }

        @MainThread
        void onFailedToReceiveMeasurementScript(int i);

        @MainThread
        void onMeasurementScriptReceived(@NonNull String str);
    }

    void finishAdSession();

    @NonNull
    String omSDKVersion();

    void omidJsServiceScript(@NonNull Context context, @NonNull POBScriptListener pOBScriptListener);

    void setTrackView(@NonNull View view);
}
