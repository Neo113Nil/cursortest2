package io.bidmachine.nativead.view;

import android.media.MediaPlayer;
import io.bidmachine.core.Logger;
import io.bidmachine.core.Utils;
import io.bidmachine.iab.vast.TrackingEvent;
import io.bidmachine.utils.lazy.LazyValue;
import java.util.TimerTask;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"io/bidmachine/nativead/view/MediaView$startVideoVisibilityCheckerTimer$1", "Ljava/util/TimerTask;", "run", "", "bidmachine-android-sdk_ba_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes11.dex */
public final class MediaView$startVideoVisibilityCheckerTimer$1 extends TimerTask {
    final /* synthetic */ MediaView this$0;

    MediaView$startVideoVisibilityCheckerTimer$1(MediaView mediaView) {
        this.this$0 = mediaView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void run$lambda$0(MediaView this$0) {
        boolean z;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.pausePlayer();
        z = this$0.finishedOrExpanded;
        if (z) {
            this$0.stopVideoVisibilityCheckerTimer();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String run$lambda$1(int i) {
        return "Video started: " + i + '%';
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String run$lambda$2(int i) {
        return "Video at first quartile: " + i + '%';
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String run$lambda$3(int i) {
        return "Video at midpoint: " + i + '%';
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String run$lambda$4(int i) {
        return "Video at third quartile: " + i + '%';
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void run$lambda$5(MediaView this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.tryPlayVideo();
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public void run() {
        boolean z;
        boolean isAdOnScreen;
        MediaPlayer mediaPlayer;
        boolean isMediaPlayerAvailable;
        boolean z2;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        try {
            z = this.this$0.error;
            if (z) {
                this.this$0.clearPlayerOnError();
                return;
            }
            isAdOnScreen = this.this$0.isAdOnScreen();
            if (!isAdOnScreen) {
                final MediaView mediaView = this.this$0;
                Utils.onUiThread(new Runnable() { // from class: io.bidmachine.nativead.view.MediaView$startVideoVisibilityCheckerTimer$1$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        MediaView$startVideoVisibilityCheckerTimer$1.run$lambda$0(MediaView.this);
                    }
                });
                return;
            }
            try {
                mediaPlayer = this.this$0.mediaPlayer;
                if (mediaPlayer != null) {
                    isMediaPlayerAvailable = this.this$0.isMediaPlayerAvailable();
                    if (isMediaPlayerAvailable) {
                        z2 = this.this$0.error;
                        if (!z2 && mediaPlayer.isPlaying()) {
                            i = this.this$0.videoDuration;
                            if (i == 0) {
                                this.this$0.videoDuration = mediaPlayer.getDuration();
                            }
                            i2 = this.this$0.videoDuration;
                            if (i2 != 0) {
                                int currentPosition = mediaPlayer.getCurrentPosition() * 100;
                                i3 = this.this$0.videoDuration;
                                final int i10 = currentPosition / i3;
                                i4 = this.this$0.quartile;
                                if (i10 >= i4 * 25) {
                                    i5 = this.this$0.quartile;
                                    if (i5 == 0) {
                                        Logger.d((LazyValue<String>) new LazyValue() { // from class: io.bidmachine.nativead.view.MediaView$startVideoVisibilityCheckerTimer$1$$ExternalSyntheticLambda1
                                            @Override // io.bidmachine.utils.lazy.LazyValue
                                            public final Object get() {
                                                String run$lambda$1;
                                                run$lambda$1 = MediaView$startVideoVisibilityCheckerTimer$1.run$lambda$1(i10);
                                                return run$lambda$1;
                                            }
                                        });
                                        this.this$0.processEvent(TrackingEvent.start);
                                    } else {
                                        i6 = this.this$0.quartile;
                                        if (i6 == 1) {
                                            Logger.d((LazyValue<String>) new LazyValue() { // from class: io.bidmachine.nativead.view.MediaView$startVideoVisibilityCheckerTimer$1$$ExternalSyntheticLambda2
                                                @Override // io.bidmachine.utils.lazy.LazyValue
                                                public final Object get() {
                                                    String run$lambda$2;
                                                    run$lambda$2 = MediaView$startVideoVisibilityCheckerTimer$1.run$lambda$2(i10);
                                                    return run$lambda$2;
                                                }
                                            });
                                            this.this$0.processEvent(TrackingEvent.firstQuartile);
                                        } else {
                                            i7 = this.this$0.quartile;
                                            if (i7 == 2) {
                                                Logger.d((LazyValue<String>) new LazyValue() { // from class: io.bidmachine.nativead.view.MediaView$startVideoVisibilityCheckerTimer$1$$ExternalSyntheticLambda3
                                                    @Override // io.bidmachine.utils.lazy.LazyValue
                                                    public final Object get() {
                                                        String run$lambda$3;
                                                        run$lambda$3 = MediaView$startVideoVisibilityCheckerTimer$1.run$lambda$3(i10);
                                                        return run$lambda$3;
                                                    }
                                                });
                                                this.this$0.processEvent(TrackingEvent.midpoint);
                                            } else {
                                                i8 = this.this$0.quartile;
                                                if (i8 == 3) {
                                                    Logger.d((LazyValue<String>) new LazyValue() { // from class: io.bidmachine.nativead.view.MediaView$startVideoVisibilityCheckerTimer$1$$ExternalSyntheticLambda4
                                                        @Override // io.bidmachine.utils.lazy.LazyValue
                                                        public final Object get() {
                                                            String run$lambda$4;
                                                            run$lambda$4 = MediaView$startVideoVisibilityCheckerTimer$1.run$lambda$4(i10);
                                                            return run$lambda$4;
                                                        }
                                                    });
                                                    this.this$0.processEvent(TrackingEvent.thirdQuartile);
                                                }
                                            }
                                        }
                                    }
                                    MediaView mediaView2 = this.this$0;
                                    i9 = mediaView2.quartile;
                                    mediaView2.quartile = i9 + 1;
                                }
                            }
                        }
                    }
                }
                Logger.d("MediaView is on screen");
                final MediaView mediaView3 = this.this$0;
                Utils.onUiThread(new Runnable() { // from class: io.bidmachine.nativead.view.MediaView$startVideoVisibilityCheckerTimer$1$$ExternalSyntheticLambda5
                    @Override // java.lang.Runnable
                    public final void run() {
                        MediaView$startVideoVisibilityCheckerTimer$1.run$lambda$5(MediaView.this);
                    }
                });
            } catch (IllegalStateException unused) {
                this.this$0.clearPlayerOnError();
            }
        } catch (Throwable unused2) {
            this.this$0.clearPlayerOnError();
        }
    }
}
