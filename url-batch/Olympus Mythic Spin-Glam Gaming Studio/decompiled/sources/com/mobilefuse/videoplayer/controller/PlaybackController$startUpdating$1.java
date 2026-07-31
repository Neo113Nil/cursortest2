package com.mobilefuse.videoplayer.controller;

import com.mobilefuse.sdk.StabilityHelper;
import com.mobilefuse.videoplayer.VideoPlayer;
import java.util.TimerTask;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;

/* compiled from: PlaybackController.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/mobilefuse/videoplayer/controller/PlaybackController$startUpdating$1", "Ljava/util/TimerTask;", "run", "", "mobilefuse-video-player_release"}, k = 1, mv = {1, 4, 3})
/* loaded from: classes4.dex */
public final class PlaybackController$startUpdating$1 extends TimerTask {
    final /* synthetic */ Function2 $updateBlock;
    final /* synthetic */ PlaybackController this$0;

    PlaybackController$startUpdating$1(PlaybackController playbackController, Function2 function2) {
        this.this$0 = playbackController;
        this.$updateBlock = function2;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public void run() {
        this.this$0.getHandler().post(new Runnable() { // from class: com.mobilefuse.videoplayer.controller.PlaybackController$startUpdating$1$run$1
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    if (PlaybackController$startUpdating$1.this.this$0.getPlayerState() != VideoPlayer.PlayerState.PLAYING) {
                        return;
                    }
                    PlaybackController playbackController = PlaybackController$startUpdating$1.this.this$0;
                    playbackController.onVideoProgress(playbackController.getVideoPlayer().getCurrentPlaybackPositionMillis(), PlaybackController$startUpdating$1.this.this$0.getVideoPlayer().getPlaybackDurationMillis());
                    PlaybackController$startUpdating$1 playbackController$startUpdating$1 = PlaybackController$startUpdating$1.this;
                    playbackController$startUpdating$1.$updateBlock.invoke(Long.valueOf(playbackController$startUpdating$1.this$0.getVideoPosition()), Long.valueOf(PlaybackController$startUpdating$1.this.this$0.getVideoDuration()));
                } catch (Throwable th) {
                    StabilityHelper.logException(PlaybackController$startUpdating$1.this, th);
                }
            }
        });
    }
}
