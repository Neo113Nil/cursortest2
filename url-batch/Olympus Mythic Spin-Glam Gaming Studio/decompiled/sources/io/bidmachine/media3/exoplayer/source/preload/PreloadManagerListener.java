package io.bidmachine.media3.exoplayer.source.preload;

import io.bidmachine.media3.common.MediaItem;
import io.bidmachine.media3.common.util.UnstableApi;

@UnstableApi
/* loaded from: classes.dex */
public interface PreloadManagerListener {
    default void onCompleted(MediaItem mediaItem) {
    }

    default void onError(PreloadException preloadException) {
    }
}
