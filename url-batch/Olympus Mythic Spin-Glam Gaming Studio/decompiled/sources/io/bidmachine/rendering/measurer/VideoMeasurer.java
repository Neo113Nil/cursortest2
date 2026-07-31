package io.bidmachine.rendering.measurer;

import android.view.View;
import androidx.annotation.FloatRange;

/* loaded from: classes5.dex */
public interface VideoMeasurer extends Measurer<View> {
    void onMediaCompleted();

    void onMediaFirstQuartile();

    void onMediaMidpoint();

    void onMediaPaused();

    void onMediaResumed();

    void onMediaSkipped();

    void onMediaStarted(float f, @FloatRange float f2);

    void onMediaThirdQuartile();

    void onMediaVolumeChanged(@FloatRange float f);
}
