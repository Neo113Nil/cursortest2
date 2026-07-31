package io.bidmachine.media3.exoplayer.source.preload;

import androidx.annotation.Nullable;
import io.bidmachine.media3.common.util.UnstableApi;

@UnstableApi
/* loaded from: classes9.dex */
public interface TargetPreloadStatusControl<T> {

    public interface PreloadStatus {
        int getStage();

        long getValue();
    }

    @Nullable
    PreloadStatus getTargetPreloadStatus(T t);
}
