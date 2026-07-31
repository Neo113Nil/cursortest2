package com.my.target.instreamads;

import android.content.Context;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.my.target.instreamads.InstreamAudioAd;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes.dex */
public interface InstreamAudioAdPlayer {

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    public interface AdPlayerListener {
        void onAdAudioCompleted();

        void onAdAudioError(@NonNull String str);

        void onAdAudioPaused();

        void onAdAudioResumed();

        void onAdAudioStarted();

        void onAdAudioStopped();

        void onVolumeChanged(float f);
    }

    void destroy();

    float getAdAudioDuration();

    float getAdAudioPosition();

    @Nullable
    AdPlayerListener getAdPlayerListener();

    @NonNull
    Context getCurrentContext();

    void pauseAdAudio();

    @Deprecated
    void playAdAudio(@NonNull Uri uri);

    void playAdAudio(@NonNull Uri uri, @NonNull InstreamAudioAd.InstreamAudioAdBanner instreamAudioAdBanner);

    void resumeAdAudio();

    void setAdPlayerListener(@Nullable AdPlayerListener adPlayerListener);

    void setVolume(float f);

    void stopAdAudio();
}
