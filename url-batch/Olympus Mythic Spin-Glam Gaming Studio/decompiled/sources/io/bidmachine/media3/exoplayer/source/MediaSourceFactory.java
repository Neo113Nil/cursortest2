package io.bidmachine.media3.exoplayer.source;

import androidx.annotation.Nullable;
import io.bidmachine.media3.common.MediaItem;
import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.exoplayer.drm.DrmSessionManagerProvider;
import io.bidmachine.media3.exoplayer.source.MediaSource;
import io.bidmachine.media3.exoplayer.upstream.LoadErrorHandlingPolicy;

@UnstableApi
@Deprecated
/* loaded from: classes10.dex */
public interface MediaSourceFactory extends MediaSource.Factory {

    @UnstableApi
    public static final MediaSourceFactory UNSUPPORTED = new MediaSourceFactory() { // from class: io.bidmachine.media3.exoplayer.source.MediaSourceFactory.1
        @Override // io.bidmachine.media3.exoplayer.source.MediaSource.Factory
        public MediaSourceFactory setDrmSessionManagerProvider(@Nullable DrmSessionManagerProvider drmSessionManagerProvider) {
            return this;
        }

        @Override // io.bidmachine.media3.exoplayer.source.MediaSource.Factory
        public MediaSourceFactory setLoadErrorHandlingPolicy(@Nullable LoadErrorHandlingPolicy loadErrorHandlingPolicy) {
            return this;
        }

        @Override // io.bidmachine.media3.exoplayer.source.MediaSource.Factory
        public int[] getSupportedTypes() {
            throw new UnsupportedOperationException();
        }

        @Override // io.bidmachine.media3.exoplayer.source.MediaSource.Factory
        public MediaSource createMediaSource(MediaItem mediaItem) {
            throw new UnsupportedOperationException();
        }
    };
}
