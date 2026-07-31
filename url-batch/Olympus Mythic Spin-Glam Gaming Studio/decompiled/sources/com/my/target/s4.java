package com.my.target;

import android.content.Context;
import android.media.AudioManager;
import android.net.Uri;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.Player;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.source.MediaSource;
import com.my.target.c0;
import java.math.BigDecimal;
import java.math.RoundingMode;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes3.dex */
public final class s4 implements Player.Listener, c0 {
    final ExoPlayer b;
    final a c;
    private final AudioManager d;
    private final ri f;
    c0.a g;
    MediaSource h;
    Uri i;
    boolean j;
    boolean k;
    final zf a = zf.a(200);
    private final zf e = zf.a(30);

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    public static final class a implements Runnable {
        private final int a;
        private final ExoPlayer b;
        private c0.a c;
        private int d;
        private float e;

        a(int i, ExoPlayer exoPlayer) {
            this.a = i;
            this.b = exoPlayer;
        }

        void a(c0.a aVar) {
            this.c = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                float currentPosition = this.b.getCurrentPosition() / 1000.0f;
                float duration = this.b.getDuration() / 1000.0f;
                if (this.e == currentPosition) {
                    this.d++;
                } else {
                    c0.a aVar = this.c;
                    if (aVar != null) {
                        aVar.a(currentPosition, duration);
                    }
                    this.e = currentPosition;
                    if (this.d > 0) {
                        this.d = 0;
                    }
                }
                if (this.d > this.a) {
                    c0.a aVar2 = this.c;
                    if (aVar2 != null) {
                        aVar2.j();
                    }
                    this.d = 0;
                }
            } catch (Throwable th) {
                String str = "ExoVideoPlayer: Error - " + th.getMessage();
                mi.a(str);
                c0.a aVar3 = this.c;
                if (aVar3 != null) {
                    aVar3.a(str);
                }
            }
        }
    }

    s4(Context context) {
        ExoPlayer build = new ExoPlayer.Builder(context).build();
        this.b = build;
        build.addListener(this);
        this.d = (AudioManager) context.getSystemService("audio");
        this.c = new a(50, build);
        this.f = new ri(this);
    }

    public static s4 a(Context context) {
        return new s4(context);
    }

    @Override // com.my.target.c0
    public boolean b() {
        return this.j && this.k;
    }

    @Override // com.my.target.c0
    public boolean c() {
        try {
            return this.b.getVolume() == 0.0f;
        } catch (Throwable th) {
            mi.a("ExoVideoPlayer: Error - " + th.getMessage());
            return false;
        }
    }

    @Override // com.my.target.c0
    public void d() {
        try {
            this.b.setVolume(1.0f);
        } catch (Throwable th) {
            mi.a("ExoVideoPlayer: Error - " + th.getMessage());
        }
        c0.a aVar = this.g;
        if (aVar != null) {
            aVar.a(1.0f);
        }
    }

    @Override // com.my.target.c0
    public void destroy() {
        this.i = null;
        this.j = false;
        this.k = false;
        this.g = null;
        this.a.b(this.c);
        this.e.b(this.f);
        this.f.a();
        try {
            this.b.setVideoTextureView(null);
            this.b.stop();
            this.b.release();
            this.b.removeListener(this);
        } catch (Throwable unused) {
        }
    }

    @Override // com.my.target.c0
    public void e() {
        try {
            this.b.setVolume(0.2f);
        } catch (Throwable th) {
            mi.a("ExoVideoPlayer: Error - " + th.getMessage());
        }
    }

    @Override // com.my.target.c0
    public void f() {
        try {
            this.b.setVolume(0.0f);
        } catch (Throwable th) {
            mi.a("ExoVideoPlayer: Error - " + th.getMessage());
        }
        c0.a aVar = this.g;
        if (aVar != null) {
            aVar.a(0.0f);
        }
    }

    @Override // com.my.target.c0
    public boolean g() {
        return this.j;
    }

    @Override // com.my.target.c0
    public float getDuration() {
        try {
            return this.b.getDuration() / 1000.0f;
        } catch (Throwable th) {
            mi.a("ExoVideoPlayer: Error - " + th.getMessage());
            return 0.0f;
        }
    }

    @Override // com.my.target.c0
    public long getPosition() {
        try {
            return this.b.getCurrentPosition();
        } catch (Throwable th) {
            mi.a("ExoVideoPlayer: Error - " + th.getMessage());
            return 0L;
        }
    }

    @Override // com.my.target.c0
    public Uri getUri() {
        return this.i;
    }

    @Override // com.my.target.c0
    public float getVolume() {
        int streamMaxVolume = this.d.getStreamMaxVolume(3);
        return new BigDecimal(Double.toString(this.b.getVolume() * (this.d.getStreamVolume(3) / streamMaxVolume))).setScale(2, RoundingMode.HALF_UP).floatValue();
    }

    @Override // com.my.target.c0
    public boolean isPlaying() {
        return this.j && !this.k;
    }

    @Override // androidx.media3.common.Player.Listener
    public void onPlayerError(PlaybackException playbackException) {
        this.k = false;
        this.j = false;
        if (this.g != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("ExoVideoPlayer: Error - ");
            sb.append(playbackException != null ? playbackException.getMessage() : "unknown video error");
            this.g.a(sb.toString());
        }
    }

    @Override // androidx.media3.common.Player.Listener
    public void onPlayerStateChanged(boolean z, int i) {
        if (i == 1) {
            mi.a("ExoVideoPlayer: Player state is changed to IDLE");
            if (this.j) {
                this.j = false;
                c0.a aVar = this.g;
                if (aVar != null) {
                    aVar.p();
                }
            }
            this.a.b(this.c);
            this.e.b(this.f);
            return;
        }
        if (i == 2) {
            mi.a("ExoVideoPlayer: Player state is changed to BUFFERING");
            if (!z || this.j) {
                return;
            }
            this.a.a(this.c);
            this.e.a(this.f);
            return;
        }
        if (i != 3) {
            if (i != 4) {
                return;
            }
            mi.a("ExoVideoPlayer: Player state is changed to ENDED");
            this.k = false;
            this.j = false;
            float duration = getDuration();
            c0.a aVar2 = this.g;
            if (aVar2 != null) {
                aVar2.a(duration, duration);
            }
            c0.a aVar3 = this.g;
            if (aVar3 != null) {
                aVar3.c();
            }
            this.a.b(this.c);
            this.e.b(this.f);
            return;
        }
        mi.a("ExoVideoPlayer: Player state is changed to READY");
        if (!z) {
            if (!this.k) {
                this.k = true;
                c0.a aVar4 = this.g;
                if (aVar4 != null) {
                    aVar4.f();
                }
            }
            this.a.b(this.c);
            this.e.b(this.f);
            return;
        }
        c0.a aVar5 = this.g;
        if (aVar5 != null) {
            aVar5.k();
        }
        if (!this.j) {
            this.j = true;
        } else if (this.k) {
            this.k = false;
            c0.a aVar6 = this.g;
            if (aVar6 != null) {
                aVar6.h();
            }
        }
        this.a.a(this.c);
        this.e.a(this.f);
    }

    @Override // com.my.target.c0
    public void pause() {
        if (!this.j || this.k) {
            return;
        }
        try {
            this.b.setPlayWhenReady(false);
        } catch (Throwable th) {
            a(th);
        }
    }

    @Override // com.my.target.c0
    public void replay() {
        try {
            this.b.seekTo(0L);
            this.b.setPlayWhenReady(true);
        } catch (Throwable th) {
            a(th);
        }
    }

    @Override // com.my.target.c0
    public void resume() {
        try {
            if (this.j) {
                this.b.setPlayWhenReady(true);
                return;
            }
            MediaSource mediaSource = this.h;
            if (mediaSource != null) {
                this.b.setMediaSource(mediaSource, true);
                this.b.prepare();
            }
        } catch (Throwable th) {
            a(th);
        }
    }

    @Override // com.my.target.c0
    public void seekTo(long j) {
        try {
            this.b.seekTo(j);
        } catch (Throwable th) {
            mi.a("ExoVideoPlayer: Error - " + th.getMessage());
        }
    }

    @Override // com.my.target.c0
    public void setVolume(float f) {
        try {
            this.b.setVolume(f);
        } catch (Throwable th) {
            mi.a("ExoVideoPlayer: Error - " + th.getMessage());
        }
        c0.a aVar = this.g;
        if (aVar != null) {
            aVar.a(f);
        }
    }

    @Override // com.my.target.c0
    public void stop() {
        try {
            this.b.stop();
            this.b.clearMediaItems();
        } catch (Throwable th) {
            a(th);
        }
    }

    @Override // com.my.target.c0
    public void a(c0.a aVar) {
        this.g = aVar;
        this.c.a(aVar);
        this.f.a(aVar);
    }

    @Override // com.my.target.c0
    public void a(e0 e0Var) {
        try {
            if (e0Var != null) {
                e0Var.setExoPlayer(this.b);
            } else {
                this.b.setVideoTextureView(null);
            }
        } catch (Throwable th) {
            a(th);
        }
    }

    @Override // com.my.target.c0
    public void a(Uri uri, e0 e0Var) {
        a(e0Var);
        a(uri, e0Var.getContext());
    }

    @Override // com.my.target.c0
    public void a(Uri uri, Context context) {
        mi.a("ExoVideoPlayer: prepare to play video in ExoPlayer");
        this.i = uri;
        this.k = false;
        c0.a aVar = this.g;
        if (aVar != null) {
            aVar.g();
        }
        try {
            this.a.a(this.c);
            this.e.a(this.f);
            this.b.setPlayWhenReady(true);
            if (!this.j) {
                MediaSource a2 = oc.a(uri, context);
                this.h = a2;
                this.b.setMediaSource(a2);
                this.b.prepare();
                mi.a("ExoVideoPlayer: Play new video in ExoPlayer");
                return;
            }
            mi.b("ExoVideoPlayer: New source url not set! Will play previous video! started = true");
        } catch (Throwable th) {
            String str = "ExoVideoPlayer: Error - " + th.getMessage();
            mi.a(str);
            c0.a aVar2 = this.g;
            if (aVar2 != null) {
                aVar2.a(str);
            }
        }
    }

    @Override // com.my.target.c0
    public void a() {
        try {
            setVolume(((double) this.b.getVolume()) == 1.0d ? 0.0f : 1.0f);
        } catch (Throwable th) {
            mi.a("ExoVideoPlayer: error - " + th.getMessage());
        }
    }

    private void a(Throwable th) {
        String str = "ExoVideoPlayer: Error - " + th.getMessage();
        mi.a(str);
        c0.a aVar = this.g;
        if (aVar != null) {
            aVar.a(str);
        }
    }
}
