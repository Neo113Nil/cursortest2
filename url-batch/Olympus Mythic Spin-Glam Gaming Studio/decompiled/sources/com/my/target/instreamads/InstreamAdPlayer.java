package com.my.target.instreamads;

import android.net.Uri;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes12.dex */
public interface InstreamAdPlayer {

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    public interface AdPlayerListener {
        void onAdVideoCompleted();

        void onAdVideoError(@NonNull String str);

        void onAdVideoPaused();

        void onAdVideoResumed();

        void onAdVideoStarted();

        void onAdVideoStopped();

        void onVolumeChanged(float f);
    }

    void destroy();

    @Nullable
    AdPlayerListener getAdPlayerListener();

    float getAdVideoDuration();

    float getAdVideoPosition();

    @NonNull
    View getView();

    void pauseAdVideo();

    void playAdVideo(@NonNull Uri uri, int i, int i2);

    void playAdVideo(@NonNull Uri uri, int i, int i2, float f);

    void resumeAdVideo();

    void setAdPlayerListener(@Nullable AdPlayerListener adPlayerListener);

    void setVolume(float f);

    void stopAdVideo();
}
