package io.bidmachine.iab.vast;

import androidx.annotation.FloatRange;
import java.io.Serializable;

/* loaded from: classes5.dex */
public interface VastPlaybackListener extends Serializable {
    void onVideoCompleted();

    void onVideoFirstQuartile();

    void onVideoMidpoint();

    void onVideoPaused();

    void onVideoResumed();

    void onVideoSkipped();

    void onVideoStarted(float f, @FloatRange float f2);

    void onVideoThirdQuartile();

    void onVideoVolumeChanged(@FloatRange float f);
}
