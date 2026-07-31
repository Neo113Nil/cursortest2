package io.bidmachine.media3.common;

import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import io.bidmachine.media3.common.util.UnstableApi;

@UnstableApi
/* loaded from: classes3.dex */
public interface VideoGraph {

    @UnstableApi
    public interface Listener {
        default void onEnded(long j) {
        }

        default void onError(VideoFrameProcessingException videoFrameProcessingException) {
        }

        default void onOutputFrameAvailableForRendering(long j) {
        }

        default void onOutputFrameRateChanged(float f) {
        }

        default void onOutputSizeChanged(int i, int i2) {
        }
    }

    VideoFrameProcessor getProcessor(int i);

    boolean hasProducedFrameWithTimestampZero();

    void initialize() throws VideoFrameProcessingException;

    void registerInput(@IntRange int i) throws VideoFrameProcessingException;

    void release();

    void setOutputSurfaceInfo(@Nullable SurfaceInfo surfaceInfo);
}
