package io.bidmachine.rendering.internal.adform.video.player.exo;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import io.bidmachine.media3.common.MediaItem;
import io.bidmachine.media3.common.PlaybackException;
import io.bidmachine.media3.common.Player;
import io.bidmachine.media3.exoplayer.ExoPlayer;
import io.bidmachine.media3.ui.PlayerView;

/* loaded from: classes4.dex */
public class a extends io.bidmachine.rendering.internal.adform.video.player.a {
    private final ExoPlayer l;
    private final PlayerView m;

    /* renamed from: io.bidmachine.rendering.internal.adform.video.player.exo.a$a, reason: collision with other inner class name */
    protected class C1784a implements Player.Listener {
        protected C1784a() {
        }

        @Override // io.bidmachine.media3.common.Player.Listener
        public void onIsPlayingChanged(boolean z) {
            if (z) {
                a.this.r();
            } else {
                a.this.q();
            }
        }

        @Override // io.bidmachine.media3.common.Player.Listener
        public void onPlaybackStateChanged(int i) {
            if (i == 3) {
                a.this.s();
            } else if (i == 4) {
                a.this.I();
            }
        }

        @Override // io.bidmachine.media3.common.Player.Listener
        public void onPlayerError(PlaybackException playbackException) {
            a.this.a(playbackException);
        }

        @Override // io.bidmachine.media3.common.Player.Listener
        public void onPositionDiscontinuity(Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, int i) {
            a.this.b(Long.valueOf(positionInfo2.positionMs));
        }

        @Override // io.bidmachine.media3.common.Player.Listener
        public void onVolumeChanged(float f) {
            a.this.b(f);
        }
    }

    public a(Context context) {
        ExoPlayer build = new ExoPlayer.Builder(context).build();
        this.l = build;
        build.addListener(new C1784a());
        PlayerView playerView = new PlayerView(context);
        this.m = playerView;
        playerView.setPlayer(build);
        playerView.setUseController(false);
    }

    @Override // io.bidmachine.rendering.internal.adform.video.player.a, io.bidmachine.rendering.internal.adform.video.player.b
    public void destroy() {
        super.destroy();
        this.l.release();
        this.m.setPlayer(null);
    }

    @Override // io.bidmachine.rendering.internal.adform.video.player.a
    protected boolean e() {
        return this.l.isPlaying();
    }

    @Override // io.bidmachine.rendering.internal.adform.video.player.a
    protected boolean g() {
        return false;
    }

    @Override // io.bidmachine.rendering.internal.adform.video.player.a
    protected void h() {
        this.l.pause();
    }

    @Override // io.bidmachine.rendering.internal.adform.video.player.a
    protected void i() {
        this.l.play();
    }

    @Override // io.bidmachine.rendering.internal.adform.video.player.a
    protected void k() {
        this.l.prepare();
    }

    @Override // io.bidmachine.rendering.internal.adform.video.player.b
    public View l() {
        return this.m;
    }

    @Override // io.bidmachine.rendering.internal.adform.video.player.a
    protected void m() {
        this.l.stop();
    }

    @Override // io.bidmachine.rendering.internal.adform.video.player.a
    protected void b(Uri uri) {
        this.l.setMediaItem(new MediaItem.Builder().setUri(uri).build());
    }

    @Override // io.bidmachine.rendering.internal.adform.video.player.a
    public float c() {
        return this.l.getVolume();
    }

    @Override // io.bidmachine.rendering.internal.adform.video.player.a
    protected void a(float f) {
        this.l.setVolume(f);
    }

    @Override // io.bidmachine.rendering.internal.adform.video.player.a
    protected long a() {
        return this.l.getCurrentPosition();
    }

    @Override // io.bidmachine.rendering.internal.adform.video.player.a
    protected long b() {
        return this.l.getDuration();
    }

    @Override // io.bidmachine.rendering.internal.adform.video.player.a
    protected void a(long j) {
        this.l.seekTo(j);
    }
}
