package io.bidmachine.rendering.internal.adform.video.player.media;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.MediaPlayer;
import android.net.Uri;
import android.view.View;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.internal.partials.BidMachineVideoBridge;
import com.safedk.android.utils.Logger;
import io.bidmachine.rendering.model.Error;

/* loaded from: classes11.dex */
public class a extends io.bidmachine.rendering.internal.adform.video.player.a {
    private final Context l;
    private final MediaPlayer m;
    private final io.bidmachine.rendering.internal.adform.video.player.media.b n;
    private float o = 1.0f;

    /* renamed from: io.bidmachine.rendering.internal.adform.video.player.media.a$a, reason: collision with other inner class name */
    protected class C1785a implements io.bidmachine.rendering.internal.adform.video.player.media.c {
        protected C1785a() {
        }

        @Override // io.bidmachine.rendering.internal.adform.video.player.media.c
        public void a() {
            if (a.this.C()) {
                a.this.b(new Error("Surface Destroyed"));
            }
        }
    }

    protected class b implements MediaPlayer.OnCompletionListener {
        protected b() {
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(MediaPlayer mediaPlayer) {
            Logger.d("BidMachine|SafeDK: Execution> Lio/bidmachine/rendering/internal/adform/video/player/media/a$b;->onCompletion(Landroid/media/MediaPlayer;)V");
            CreativeInfoManager.onVideoCompleted("io.bidmachine", mediaPlayer, "media-player");
            safedk_a$b_onCompletion_2898fde2b994bca6b51285049f7703f7(mediaPlayer);
        }

        public void safedk_a$b_onCompletion_2898fde2b994bca6b51285049f7703f7(MediaPlayer p0) {
            a.this.I();
        }
    }

    protected class c implements MediaPlayer.OnErrorListener {
        protected c() {
        }

        @Override // android.media.MediaPlayer.OnErrorListener
        public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
            a.this.a(new Error("MediaPlayer - onError (what - " + i + ", extra - " + i2 + ")"));
            return true;
        }
    }

    protected class d implements MediaPlayer.OnPreparedListener {
        protected d() {
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public void onPrepared(MediaPlayer mediaPlayer) {
            mediaPlayer.seekTo(1);
            a.this.s();
        }
    }

    protected class e implements MediaPlayer.OnSeekCompleteListener {
        protected e() {
        }

        @Override // android.media.MediaPlayer.OnSeekCompleteListener
        public void onSeekComplete(MediaPlayer mediaPlayer) {
            a aVar = a.this;
            aVar.b(aVar.o());
        }
    }

    public a(Context context) {
        this.l = context.getApplicationContext();
        MediaPlayer mediaPlayer = new MediaPlayer();
        this.m = mediaPlayer;
        mediaPlayer.setLooping(false);
        mediaPlayer.setAudioAttributes(new AudioAttributes.Builder().setContentType(2).setUsage(1).build());
        mediaPlayer.setOnPreparedListener(new d());
        mediaPlayer.setOnErrorListener(new c());
        mediaPlayer.setOnSeekCompleteListener(new e());
        mediaPlayer.setOnCompletionListener(new b());
        io.bidmachine.rendering.internal.adform.video.player.media.b bVar = new io.bidmachine.rendering.internal.adform.video.player.media.b(context);
        this.n = bVar;
        bVar.setListener(new C1785a());
        bVar.setMediaPlayer(mediaPlayer);
    }

    @Override // io.bidmachine.rendering.internal.adform.video.player.a
    public float c() {
        return this.o;
    }

    @Override // io.bidmachine.rendering.internal.adform.video.player.a, io.bidmachine.rendering.internal.adform.video.player.b
    public void destroy() {
        super.destroy();
        this.n.a();
        this.m.reset();
        BidMachineVideoBridge.MediaPlayerRelease(this.m);
    }

    @Override // io.bidmachine.rendering.internal.adform.video.player.a
    protected boolean e() {
        return this.m.isPlaying();
    }

    @Override // io.bidmachine.rendering.internal.adform.video.player.a
    protected boolean g() {
        return false;
    }

    @Override // io.bidmachine.rendering.internal.adform.video.player.a
    protected void h() {
        BidMachineVideoBridge.MediaPlayerPause(this.m);
    }

    @Override // io.bidmachine.rendering.internal.adform.video.player.a
    protected void i() {
        BidMachineVideoBridge.MediaPlayerStart(this.m);
    }

    @Override // io.bidmachine.rendering.internal.adform.video.player.a
    protected void k() {
        this.m.prepareAsync();
    }

    @Override // io.bidmachine.rendering.internal.adform.video.player.b
    public View l() {
        return this.n;
    }

    @Override // io.bidmachine.rendering.internal.adform.video.player.a
    protected void m() {
        BidMachineVideoBridge.MediaPlayerStop(this.m);
    }

    @Override // io.bidmachine.rendering.internal.adform.video.player.a
    protected void y() {
        super.y();
        q();
    }

    @Override // io.bidmachine.rendering.internal.adform.video.player.a
    protected void z() {
        super.z();
        r();
    }

    @Override // io.bidmachine.rendering.internal.adform.video.player.a
    protected void c(float f) {
        this.o = f;
        super.c(f);
        b(f);
    }

    @Override // io.bidmachine.rendering.internal.adform.video.player.a
    protected void b(Uri uri) {
        this.m.reset();
        BidMachineVideoBridge.MediaPlayerSetDataSource(this.m, this.l, uri);
    }

    @Override // io.bidmachine.rendering.internal.adform.video.player.a
    protected void a(float f) {
        this.m.setVolume(f, f);
    }

    @Override // io.bidmachine.rendering.internal.adform.video.player.a
    protected long a() {
        return this.m.getCurrentPosition();
    }

    @Override // io.bidmachine.rendering.internal.adform.video.player.a
    protected long b() {
        return this.m.getDuration();
    }

    @Override // io.bidmachine.rendering.internal.adform.video.player.a
    protected void a(long j) {
        this.m.seekTo((int) j);
    }
}
