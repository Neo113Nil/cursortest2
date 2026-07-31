package com.mbridge.msdk.config.dynamic.baseview.video;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.SurfaceHolder;
import androidx.annotation.Nullable;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultLoadControl;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultRenderersFactory;
import com.mbridge.msdk.playercommon.exoplayer2.ExoPlaybackException;
import com.mbridge.msdk.playercommon.exoplayer2.ExoPlayerFactory;
import com.mbridge.msdk.playercommon.exoplayer2.PlaybackParameters;
import com.mbridge.msdk.playercommon.exoplayer2.Player;
import com.mbridge.msdk.playercommon.exoplayer2.SimpleExoPlayer;
import com.mbridge.msdk.playercommon.exoplayer2.Timeline;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.mbridge.msdk.playercommon.exoplayer2.source.MediaSource;
import com.mbridge.msdk.playercommon.exoplayer2.source.TrackGroupArray;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.DefaultTrackSelector;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.TrackSelectionArray;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DefaultDataSourceFactory;
import com.mbridge.msdk.playercommon.exoplayer2.video.VideoListener;

/* compiled from: ComponentVideoPlayer.java */
/* loaded from: classes11.dex */
public class b implements Player.EventListener, VideoListener {
    private long e;
    private boolean f;
    private Context g;
    private SimpleExoPlayer h;
    private MediaSource i;
    private volatile com.mbridge.msdk.config.dynamic.baseview.video.a k;
    private c l;
    SurfaceHolder m;
    private d n;
    private boolean a = false;
    private boolean b = false;
    private boolean c = false;
    private int d = 5;
    private final Handler j = new Handler(Looper.getMainLooper());
    private final Runnable o = new a();

    /* compiled from: ComponentVideoPlayer.java */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            long j;
            try {
                if (b.this.h == null || !b.this.b()) {
                    return;
                }
                b bVar = b.this;
                bVar.e = bVar.h.getCurrentPosition();
                float f = b.this.e % 1000;
                int round = Math.round(b.this.e / 1000.0f);
                q0.c("ComponentVideoPlayer", "currentPosition:" + round + " mCurrentPosition:" + b.this.e);
                if (b.this.h == null || b.this.h.getDuration() <= 0) {
                    j = 0;
                } else {
                    j = b.this.h.getDuration() / 1000;
                    if (f > 0.0f && f < 500.0f) {
                        round++;
                    }
                }
                if (round >= 0 && j > 0) {
                    long j2 = round;
                    if (j2 < 1 + j && b.this.k != null) {
                        b.this.k.a(j2, j);
                    }
                }
                b.this.a = false;
                b.this.j.postDelayed(this, 1000L);
            } catch (Exception e) {
                q0.b("ComponentVideoPlayer", e.getMessage());
            }
        }
    }

    private void r() {
        try {
            a();
            this.j.post(this.o);
        } catch (Exception e) {
            q0.b("ComponentVideoPlayer", e.getMessage());
        }
    }

    public float e() {
        SimpleExoPlayer simpleExoPlayer = this.h;
        if (simpleExoPlayer != null) {
            return simpleExoPlayer.getVolume();
        }
        return 0.0f;
    }

    public boolean f() {
        return this.b;
    }

    public boolean g() {
        return this.a;
    }

    public boolean h() {
        return this.h != null && b();
    }

    public boolean i() {
        return this.f;
    }

    public void j() {
        SimpleExoPlayer simpleExoPlayer = this.h;
        if (simpleExoPlayer == null) {
            return;
        }
        simpleExoPlayer.setVolume(0.0f);
        this.f = true;
    }

    public void k() {
        try {
            this.a = true;
            this.e = 0L;
            if (this.k != null) {
                this.k.onPlayCompleted();
            }
        } catch (Exception e) {
            q0.b("ComponentVideoPlayer", e.getMessage());
        }
    }

    public void l() {
        try {
            this.b = true;
            if (this.h != null && !this.c) {
                this.c = true;
                if (this.k != null) {
                    this.k.a(this.h.getDuration() / 1000);
                }
            }
            r();
        } catch (Throwable th) {
            q0.b("ComponentVideoPlayer", th.getMessage());
        }
    }

    public void m() {
        try {
            if (this.b && this.h != null && b()) {
                this.h.setPlayWhenReady(false);
                a();
            }
        } catch (Exception e) {
            q0.b("ComponentVideoPlayer", e.getMessage());
        }
    }

    public void n() {
        try {
            if (this.b) {
                r();
            } else {
                this.h.prepare(this.i);
            }
            this.h.setPlayWhenReady(true);
        } catch (Exception e) {
            q0.b("ComponentVideoPlayer", e.getMessage());
            p();
            b("play error");
        }
    }

    public void o() {
        SimpleExoPlayer simpleExoPlayer;
        try {
            if (this.b || (simpleExoPlayer = this.h) == null) {
                return;
            }
            simpleExoPlayer.prepare(this.i);
            this.b = true;
        } catch (Exception e) {
            q0.b("ComponentVideoPlayer", e.getMessage());
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
    public void onLoadingChanged(boolean z) {
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
    public void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
        q0.b("ComponentVideoPlayer", "onPlaybackParametersChanged : " + playbackParameters.speed);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
    public void onPlayerStateChanged(boolean z, int i) {
        q0.b("ComponentVideoPlayer", "onPlaybackStateChanged : " + i);
        if (i == 1) {
            q0.b("ComponentVideoPlayer", "onPlaybackStateChanged : IDLE");
            return;
        }
        if (i == 2) {
            q0.b("ComponentVideoPlayer", "onPlaybackStateChanged : Buffering");
            return;
        }
        if (i == 3) {
            q0.b("ComponentVideoPlayer", "onPlaybackStateChanged : READY");
            l();
        } else {
            if (i != 4) {
                return;
            }
            q0.b("ComponentVideoPlayer", "onPlaybackStateChanged : Ended : PLAY ENDED");
            a();
            k();
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
    public void onPositionDiscontinuity(int i) {
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.video.VideoListener
    public void onRenderedFirstFrame() {
        c cVar = this.l;
        if (cVar != null) {
            cVar.onRenderedFirstFrame();
        }
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

    @Override // com.mbridge.msdk.playercommon.exoplayer2.video.VideoListener
    public void onVideoSizeChanged(int i, int i2, int i3, float f) {
        c cVar = this.l;
        if (cVar != null) {
            cVar.a(i2 == 0 ? 1.0f : (i * f) / i2);
        }
    }

    public void p() {
        try {
            a();
            if (this.h != null) {
                s();
                this.h.removeListener(this);
                this.h.release();
                this.k = null;
            }
            d dVar = this.n;
            if (dVar != null) {
                dVar.c();
            }
        } catch (Throwable th) {
            q0.b("ComponentVideoPlayer", th.getMessage());
        }
    }

    public void q() {
        SimpleExoPlayer simpleExoPlayer = this.h;
        if (simpleExoPlayer != null) {
            simpleExoPlayer.seekTo(simpleExoPlayer.getCurrentPosition() - 500);
        }
    }

    public void s() {
        try {
            if (this.b && this.h != null && b()) {
                this.h.stop();
                a();
            }
        } catch (Exception e) {
            q0.b("ComponentVideoPlayer", e.getMessage());
        }
    }

    public void t() {
        SimpleExoPlayer simpleExoPlayer = this.h;
        if (simpleExoPlayer == null) {
            return;
        }
        simpleExoPlayer.setVolume(1.0f);
        this.f = false;
    }

    public void b(int i) {
        this.d = i;
    }

    public void c(String str) {
        if (TextUtils.isEmpty(str)) {
            b("play url is illegal");
            return;
        }
        try {
            this.h = ExoPlayerFactory.newSimpleInstance(new DefaultRenderersFactory(this.g), new DefaultTrackSelector(), new DefaultLoadControl());
            this.i = new ExtractorMediaSource.Factory(new DefaultDataSourceFactory(this.g, "MBridge_ExoPlayer")).createMediaSource(Uri.parse(str));
            this.h.setRepeatMode(0);
            this.h.prepare(this.i);
            this.h.addListener(this);
            this.h.addVideoListener(this);
            SurfaceHolder surfaceHolder = this.m;
            if (surfaceHolder != null) {
                a(surfaceHolder);
            }
            d dVar = new d(this.g, this.h);
            this.n = dVar;
            dVar.a(str, this.k, this.d);
        } catch (Throwable unused) {
            b("Player init error");
        }
    }

    public int d() {
        SimpleExoPlayer simpleExoPlayer = this.h;
        if (simpleExoPlayer != null) {
            return (int) (simpleExoPlayer.getDuration() / 1000);
        }
        return 0;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
    public void onPlayerError(ExoPlaybackException exoPlaybackException) {
        d dVar = this.n;
        if ((dVar == null || !dVar.a(exoPlaybackException)) && exoPlaybackException != null) {
            int i = exoPlaybackException.type;
            String str = i != 0 ? i != 1 ? i != 2 ? "Play error and ExoPlayer have not message." : "Play error, because have a UnexpectedException." : "Play error, because have a RendererException." : "Play error, because have a SourceException.";
            if (exoPlaybackException.getCause() != null && !TextUtils.isEmpty(exoPlaybackException.getCause().getMessage())) {
                str = exoPlaybackException.getCause().getMessage();
            }
            q0.b("ComponentVideoPlayer", "onPlayerError : " + str);
            a(str);
        }
    }

    private void b(String str) {
        if (this.k != null) {
            this.k.onPlayError(str);
        }
    }

    public void a(Context context, SurfaceHolder surfaceHolder) {
        try {
            this.g = context;
            this.m = surfaceHolder;
        } catch (Throwable th) {
            q0.b("ComponentVideoPlayer", th.getMessage());
        }
    }

    public boolean b() {
        return this.h.getPlaybackState() == 3 && this.h.getPlayWhenReady();
    }

    public void a(SurfaceHolder surfaceHolder) {
        Player.VideoComponent videoComponent;
        try {
            SimpleExoPlayer simpleExoPlayer = this.h;
            if (simpleExoPlayer == null || (videoComponent = simpleExoPlayer.getVideoComponent()) == null) {
                return;
            }
            videoComponent.setVideoSurfaceHolder(surfaceHolder);
        } catch (Throwable th) {
            q0.b("ComponentVideoPlayer", th.getMessage());
            b(th.toString());
        }
    }

    public void a(c cVar) {
        if (cVar != null) {
            this.l = cVar;
        }
    }

    public void a(long j) {
        try {
            if (!this.b) {
                this.h.prepare(this.i);
            } else {
                r();
            }
            this.h.seekTo(j);
            this.h.setPlayWhenReady(true);
        } catch (Exception e) {
            q0.b("ComponentVideoPlayer", e.getMessage());
            p();
            b("play error");
        }
    }

    public long c() {
        return this.e;
    }

    public void a(int i) {
        long j = i;
        try {
            this.e = j;
            if (!this.b) {
                q0.a("ComponentVideoPlayer", "seekTo return mHasPrepare false");
                return;
            }
            SimpleExoPlayer simpleExoPlayer = this.h;
            if (simpleExoPlayer != null) {
                simpleExoPlayer.seekTo(j);
            }
        } catch (Exception e) {
            q0.b("ComponentVideoPlayer", e.getMessage());
        }
    }

    private void a() {
        try {
            this.j.removeCallbacks(this.o);
        } catch (Exception e) {
            q0.b("ComponentVideoPlayer", e.getMessage());
        }
    }

    public void a(com.mbridge.msdk.config.dynamic.baseview.video.a aVar) {
        this.k = aVar;
    }

    public boolean a(String str) {
        try {
            this.b = false;
            b(str);
            return true;
        } catch (Exception e) {
            q0.b("ComponentVideoPlayer", e.getMessage());
            return true;
        }
    }

    public void a(float f, float f2) {
        try {
            SimpleExoPlayer simpleExoPlayer = this.h;
            if (simpleExoPlayer != null) {
                simpleExoPlayer.setVolume(f2);
            }
        } catch (Throwable th) {
            q0.b("ComponentVideoPlayer", th.getMessage());
        }
    }

    public void a(float f) {
        try {
            if (b()) {
                this.h.setPlaybackParameters(new PlaybackParameters(f));
            } else {
                this.h.setPlaybackParameters(new PlaybackParameters(f));
                this.h.stop();
            }
        } catch (Throwable th) {
            q0.b("ComponentVideoPlayer", th.getMessage());
        }
    }
}
