package com.mbridge.msdk.dycreator.baseview.videoview;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.mbridge.msdk.dycreator.baseview.videoview.listener.VideoViewEventListener;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultLoadControl;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultRenderersFactory;
import com.mbridge.msdk.playercommon.exoplayer2.ExoPlaybackException;
import com.mbridge.msdk.playercommon.exoplayer2.ExoPlayer;
import com.mbridge.msdk.playercommon.exoplayer2.ExoPlayerFactory;
import com.mbridge.msdk.playercommon.exoplayer2.PlaybackParameters;
import com.mbridge.msdk.playercommon.exoplayer2.Player;
import com.mbridge.msdk.playercommon.exoplayer2.Timeline;
import com.mbridge.msdk.playercommon.exoplayer2.source.ConcatenatingMediaSource;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.mbridge.msdk.playercommon.exoplayer2.source.TrackGroupArray;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.DefaultTrackSelector;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.TrackSelectionArray;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DefaultDataSourceFactory;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;

/* loaded from: classes13.dex */
public class MBVideoView extends FrameLayout implements Player.EventListener {
    private final String a;
    private final int b;
    private ExoPlayer c;
    private final long d;
    private String[] e;
    private VideoViewEventListener f;
    private final SurfaceHolder.Callback g;
    private final Runnable h;
    private final Runnable i;

    /* renamed from: com.mbridge.msdk.dycreator.baseview.videoview.MBVideoView$1, reason: invalid class name */
    /* loaded from: classes5.dex */
    class AnonymousClass1 implements Runnable {
        final /* synthetic */ MBVideoView a;

        @Override // java.lang.Runnable
        public void run() {
            if (this.a.f != null) {
                this.a.f.onBufferingFail("Buffering timeout");
            }
        }
    }

    public MBVideoView(@NonNull Context context) {
        super(context);
        this.a = "MBVideoView";
        this.b = 1000;
        this.d = 5000L;
        this.g = new SurfaceHolder.Callback() { // from class: com.mbridge.msdk.dycreator.baseview.videoview.MBVideoView.2
            @Override // android.view.SurfaceHolder.Callback
            public void surfaceChanged(@NonNull SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            }

            @Override // android.view.SurfaceHolder.Callback
            public void surfaceCreated(@NonNull SurfaceHolder surfaceHolder) {
                try {
                    Player.VideoComponent videoComponent = MBVideoView.this.c.getVideoComponent();
                    if (videoComponent != null) {
                        videoComponent.setVideoSurfaceHolder(surfaceHolder);
                    }
                } catch (Throwable th) {
                    q0.b("MBVideoView", th.getMessage());
                }
            }

            @Override // android.view.SurfaceHolder.Callback
            public void surfaceDestroyed(@NonNull SurfaceHolder surfaceHolder) {
            }
        };
        this.h = new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.videoview.MBVideoView.3
            @Override // java.lang.Runnable
            public void run() {
                if (MBVideoView.this.f != null) {
                    MBVideoView.this.f.onBufferingFail("Buffering fail.");
                }
            }
        };
        this.i = new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.videoview.MBVideoView.4
            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (MBVideoView.this.c == null || !MBVideoView.this.isPlaying()) {
                        return;
                    }
                    long currentPosition = MBVideoView.this.c.getCurrentPosition();
                    long duration = MBVideoView.this.c.getDuration();
                    int round = Math.round(currentPosition / 1000.0f);
                    int round2 = Math.round(duration / 1000.0f);
                    q0.c("MBVideoView", "currentPosition:" + round + " duration:" + duration);
                    if (MBVideoView.this.f != null) {
                        MBVideoView.this.f.onPlayProgress(round, round2);
                    }
                    MBVideoView.this.getHandler().postDelayed(this, 1000L);
                } catch (Exception e) {
                    q0.b("MBVideoView", e.getMessage());
                }
            }
        };
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.o, this, me);
        return super.dispatchTouchEvent(me);
    }

    public boolean isPlaying() {
        ExoPlayer exoPlayer = this.c;
        return exoPlayer != null && exoPlayer.getPlaybackState() == 3 && this.c.getPlayWhenReady();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
    public void onLoadingChanged(boolean z) {
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
    public void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
        q0.b("MBVideoView", "onPlaybackParametersChanged : " + playbackParameters.speed);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
    public void onPlayerStateChanged(boolean z, int i) {
        q0.b("MBVideoView", "onPlaybackStateChanged : " + i);
        if (i == 1) {
            q0.b("MBVideoView", "onPlaybackStateChanged : IDLE");
            return;
        }
        if (i == 2) {
            q0.b("MBVideoView", "onPlaybackStateChanged : Buffering");
        } else if (i == 3) {
            q0.b("MBVideoView", "onPlaybackStateChanged : READY");
        } else {
            if (i != 4) {
                return;
            }
            q0.b("MBVideoView", "onPlaybackStateChanged : Ended : PLAY ENDED");
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
    public void onPositionDiscontinuity(int i) {
        this.c.getCurrentWindowIndex();
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
    public void onRepeatModeChanged(int i) {
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
    public void onSeekProcessed() {
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
    public void onShuffleModeEnabledChanged(boolean z) {
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
    public void onTimelineChanged(Timeline timeline, @Nullable Object obj, int i) {
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
    public void onTracksChanged(TrackGroupArray trackGroupArray, TrackSelectionArray trackSelectionArray) {
    }

    public void pause() {
    }

    public void play() {
    }

    public void setVideoUrl(String... strArr) {
        if (strArr == null || strArr.length <= 0) {
            return;
        }
        this.e = strArr;
        a();
    }

    public void setVideoViewEventLister(VideoViewEventListener videoViewEventListener) {
        this.f = videoViewEventListener;
    }

    public void stop() {
    }

    private void a() {
        try {
            this.c = ExoPlayerFactory.newSimpleInstance(new DefaultRenderersFactory(getContext()), new DefaultTrackSelector(), new DefaultLoadControl());
            ConcatenatingMediaSource concatenatingMediaSource = new ConcatenatingMediaSource();
            for (String str : this.e) {
                concatenatingMediaSource.addMediaSource(new ExtractorMediaSource.Factory(new DefaultDataSourceFactory(getContext(), "MBridge_ExoPlayer")).createMediaSource(Uri.parse(str)));
            }
            this.c.setRepeatMode(0);
            this.c.prepare(concatenatingMediaSource);
            this.c.addListener(this);
        } catch (Throwable th) {
            q0.b("MBVideoView", th.getMessage());
            th.toString();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onPlayerError(ExoPlaybackException exoPlaybackException) {
        String str;
        VideoViewEventListener videoViewEventListener;
        if (exoPlaybackException != null) {
            int i = exoPlaybackException.type;
            if (i == 0) {
                str = "Play error, because have a SourceException.";
            } else if (i == 1) {
                str = "Play error, because have a RendererException.";
            } else if (i == 2) {
                str = "Play error, because have a UnexpectedException.";
            }
            if (exoPlaybackException.getCause() != null && !TextUtils.isEmpty(exoPlaybackException.getCause().getMessage())) {
                str = exoPlaybackException.getCause().getMessage();
            }
            q0.b("MBVideoView", "onPlayerError : " + str);
            videoViewEventListener = this.f;
            if (videoViewEventListener == null) {
                videoViewEventListener.onPlayerError(exoPlaybackException.type, str);
                return;
            }
            return;
        }
        str = "Play error and ExoPlayer have not message.";
        if (exoPlaybackException.getCause() != null) {
            str = exoPlaybackException.getCause().getMessage();
        }
        q0.b("MBVideoView", "onPlayerError : " + str);
        videoViewEventListener = this.f;
        if (videoViewEventListener == null) {
        }
    }

    public MBVideoView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = "MBVideoView";
        this.b = 1000;
        this.d = 5000L;
        this.g = new SurfaceHolder.Callback() { // from class: com.mbridge.msdk.dycreator.baseview.videoview.MBVideoView.2
            @Override // android.view.SurfaceHolder.Callback
            public void surfaceChanged(@NonNull SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            }

            @Override // android.view.SurfaceHolder.Callback
            public void surfaceCreated(@NonNull SurfaceHolder surfaceHolder) {
                try {
                    Player.VideoComponent videoComponent = MBVideoView.this.c.getVideoComponent();
                    if (videoComponent != null) {
                        videoComponent.setVideoSurfaceHolder(surfaceHolder);
                    }
                } catch (Throwable th) {
                    q0.b("MBVideoView", th.getMessage());
                }
            }

            @Override // android.view.SurfaceHolder.Callback
            public void surfaceDestroyed(@NonNull SurfaceHolder surfaceHolder) {
            }
        };
        this.h = new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.videoview.MBVideoView.3
            @Override // java.lang.Runnable
            public void run() {
                if (MBVideoView.this.f != null) {
                    MBVideoView.this.f.onBufferingFail("Buffering fail.");
                }
            }
        };
        this.i = new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.videoview.MBVideoView.4
            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (MBVideoView.this.c == null || !MBVideoView.this.isPlaying()) {
                        return;
                    }
                    long currentPosition = MBVideoView.this.c.getCurrentPosition();
                    long duration = MBVideoView.this.c.getDuration();
                    int round = Math.round(currentPosition / 1000.0f);
                    int round2 = Math.round(duration / 1000.0f);
                    q0.c("MBVideoView", "currentPosition:" + round + " duration:" + duration);
                    if (MBVideoView.this.f != null) {
                        MBVideoView.this.f.onPlayProgress(round, round2);
                    }
                    MBVideoView.this.getHandler().postDelayed(this, 1000L);
                } catch (Exception e) {
                    q0.b("MBVideoView", e.getMessage());
                }
            }
        };
    }

    public MBVideoView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = "MBVideoView";
        this.b = 1000;
        this.d = 5000L;
        this.g = new SurfaceHolder.Callback() { // from class: com.mbridge.msdk.dycreator.baseview.videoview.MBVideoView.2
            @Override // android.view.SurfaceHolder.Callback
            public void surfaceChanged(@NonNull SurfaceHolder surfaceHolder, int i2, int i22, int i3) {
            }

            @Override // android.view.SurfaceHolder.Callback
            public void surfaceCreated(@NonNull SurfaceHolder surfaceHolder) {
                try {
                    Player.VideoComponent videoComponent = MBVideoView.this.c.getVideoComponent();
                    if (videoComponent != null) {
                        videoComponent.setVideoSurfaceHolder(surfaceHolder);
                    }
                } catch (Throwable th) {
                    q0.b("MBVideoView", th.getMessage());
                }
            }

            @Override // android.view.SurfaceHolder.Callback
            public void surfaceDestroyed(@NonNull SurfaceHolder surfaceHolder) {
            }
        };
        this.h = new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.videoview.MBVideoView.3
            @Override // java.lang.Runnable
            public void run() {
                if (MBVideoView.this.f != null) {
                    MBVideoView.this.f.onBufferingFail("Buffering fail.");
                }
            }
        };
        this.i = new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.videoview.MBVideoView.4
            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (MBVideoView.this.c == null || !MBVideoView.this.isPlaying()) {
                        return;
                    }
                    long currentPosition = MBVideoView.this.c.getCurrentPosition();
                    long duration = MBVideoView.this.c.getDuration();
                    int round = Math.round(currentPosition / 1000.0f);
                    int round2 = Math.round(duration / 1000.0f);
                    q0.c("MBVideoView", "currentPosition:" + round + " duration:" + duration);
                    if (MBVideoView.this.f != null) {
                        MBVideoView.this.f.onPlayProgress(round, round2);
                    }
                    MBVideoView.this.getHandler().postDelayed(this, 1000L);
                } catch (Exception e) {
                    q0.b("MBVideoView", e.getMessage());
                }
            }
        };
    }

    @RequiresApi
    public MBVideoView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.a = "MBVideoView";
        this.b = 1000;
        this.d = 5000L;
        this.g = new SurfaceHolder.Callback() { // from class: com.mbridge.msdk.dycreator.baseview.videoview.MBVideoView.2
            @Override // android.view.SurfaceHolder.Callback
            public void surfaceChanged(@NonNull SurfaceHolder surfaceHolder, int i22, int i222, int i3) {
            }

            @Override // android.view.SurfaceHolder.Callback
            public void surfaceCreated(@NonNull SurfaceHolder surfaceHolder) {
                try {
                    Player.VideoComponent videoComponent = MBVideoView.this.c.getVideoComponent();
                    if (videoComponent != null) {
                        videoComponent.setVideoSurfaceHolder(surfaceHolder);
                    }
                } catch (Throwable th) {
                    q0.b("MBVideoView", th.getMessage());
                }
            }

            @Override // android.view.SurfaceHolder.Callback
            public void surfaceDestroyed(@NonNull SurfaceHolder surfaceHolder) {
            }
        };
        this.h = new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.videoview.MBVideoView.3
            @Override // java.lang.Runnable
            public void run() {
                if (MBVideoView.this.f != null) {
                    MBVideoView.this.f.onBufferingFail("Buffering fail.");
                }
            }
        };
        this.i = new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.videoview.MBVideoView.4
            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (MBVideoView.this.c == null || !MBVideoView.this.isPlaying()) {
                        return;
                    }
                    long currentPosition = MBVideoView.this.c.getCurrentPosition();
                    long duration = MBVideoView.this.c.getDuration();
                    int round = Math.round(currentPosition / 1000.0f);
                    int round2 = Math.round(duration / 1000.0f);
                    q0.c("MBVideoView", "currentPosition:" + round + " duration:" + duration);
                    if (MBVideoView.this.f != null) {
                        MBVideoView.this.f.onPlayProgress(round, round2);
                    }
                    MBVideoView.this.getHandler().postDelayed(this, 1000L);
                } catch (Exception e) {
                    q0.b("MBVideoView", e.getMessage());
                }
            }
        };
    }
}
