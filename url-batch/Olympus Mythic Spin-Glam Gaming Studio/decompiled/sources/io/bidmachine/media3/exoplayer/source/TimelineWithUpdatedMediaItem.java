package io.bidmachine.media3.exoplayer.source;

import io.bidmachine.media3.common.MediaItem;
import io.bidmachine.media3.common.Timeline;
import io.bidmachine.media3.common.util.UnstableApi;

@UnstableApi
/* loaded from: classes3.dex */
public final class TimelineWithUpdatedMediaItem extends ForwardingTimeline {
    private final MediaItem updatedMediaItem;

    public TimelineWithUpdatedMediaItem(Timeline timeline, MediaItem mediaItem) {
        super(timeline);
        this.updatedMediaItem = mediaItem;
    }

    @Override // io.bidmachine.media3.exoplayer.source.ForwardingTimeline, io.bidmachine.media3.common.Timeline
    public Timeline.Window getWindow(int i, Timeline.Window window, long j) {
        super.getWindow(i, window, j);
        MediaItem mediaItem = this.updatedMediaItem;
        window.mediaItem = mediaItem;
        MediaItem.LocalConfiguration localConfiguration = mediaItem.localConfiguration;
        window.tag = localConfiguration != null ? localConfiguration.tag : null;
        return window;
    }
}
