package com.my.target;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.util.Log;
import android.view.Surface;
import android.view.TextureView;
import com.my.target.c0;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import java.math.BigDecimal;
import java.math.RoundingMode;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes4.dex */
public class s3 implements c0, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnPreparedListener, TextureView.SurfaceTextureListener, MediaPlayer.OnInfoListener {
    private final zf a;
    private final a b;
    private final zf c;
    private final ri d;
    private final MediaPlayer e;
    private c0.a f;
    private Surface g;
    private int h;
    private float i;
    private int j;
    private long k;
    private e0 l;
    private Uri m;
    private final AudioManager n;

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    static class a implements Runnable {
        private final int a;
        private s3 b;
        private c0.a c;
        private int d;
        private float e;

        a(int i) {
            this.a = i;
        }

        void a(c0.a aVar) {
            this.c = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.b == null) {
                return;
            }
            float position = r0.getPosition() / 1000.0f;
            float duration = this.b.getDuration();
            if (this.e == position) {
                this.d++;
            } else {
                c0.a aVar = this.c;
                if (aVar != null) {
                    aVar.a(position, duration);
                }
                this.e = position;
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
        }

        void a(s3 s3Var) {
            this.b = s3Var;
        }
    }

    s3(MediaPlayer mediaPlayer, a aVar, ri riVar, Context context) {
        this.a = zf.a(200);
        this.c = zf.a(30);
        this.h = 0;
        this.i = 1.0f;
        this.k = 0L;
        this.e = mediaPlayer;
        this.b = aVar;
        this.d = riVar;
        aVar.a(this);
        riVar.a(this);
        this.n = (AudioManager) context.getSystemService("audio");
    }

    public static c0 a(Context context) {
        return new s3(context);
    }

    private void h() {
        e0 e0Var = this.l;
        TextureView textureView = e0Var != null ? e0Var.getTextureView() : null;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != this) {
                Log.w("DefaultVideoPlayer", "SurfaceTextureListener already unset or replaced.");
            } else {
                textureView.setSurfaceTextureListener(null);
            }
        }
    }

    private boolean i() {
        int i = this.h;
        return i >= 1 && i <= 4;
    }

    @Override // com.my.target.c0
    public boolean b() {
        return this.h == 2;
    }

    @Override // com.my.target.c0
    public boolean c() {
        return this.i == 0.0f;
    }

    @Override // com.my.target.c0
    public void d() {
        setVolume(1.0f);
    }

    @Override // com.my.target.c0
    public void destroy() {
        this.f = null;
        this.h = 5;
        this.a.b(this.b);
        this.c.b(this.d);
        this.d.a();
        h();
        if (i()) {
            try {
                this.e.stop();
            } catch (Throwable th) {
                mi.a("DefaultVideoPlayer: Media player's stop method called in wrong state, " + th.getMessage());
            }
        }
        try {
            this.e.release();
        } catch (Throwable th2) {
            mi.a("DefaultVideoPlayer: Media player's release method called in wrong state, " + th2.getMessage());
        }
        this.l = null;
    }

    @Override // com.my.target.c0
    public void e() {
        setVolume(0.2f);
    }

    @Override // com.my.target.c0
    public void f() {
        setVolume(0.0f);
    }

    @Override // com.my.target.c0
    public boolean g() {
        int i = this.h;
        return i >= 1 && i < 3;
    }

    @Override // com.my.target.c0
    public float getDuration() {
        if (!i()) {
            return 0.0f;
        }
        try {
            return this.e.getDuration() / 1000.0f;
        } catch (Throwable th) {
            mi.a("DefaultVideoPlayer: Media player's get duration method called in wrong state, " + th.getMessage());
            return 0.0f;
        }
    }

    @Override // com.my.target.c0
    public long getPosition() {
        if (!i() || this.h == 3) {
            return 0L;
        }
        try {
            return this.e.getCurrentPosition();
        } catch (Throwable th) {
            mi.a("DefaultVideoPlayer: media player's get current position method called in wrong state, " + th.getMessage());
            return 0L;
        }
    }

    @Override // com.my.target.c0
    public Uri getUri() {
        return this.m;
    }

    @Override // com.my.target.c0
    public float getVolume() {
        int streamMaxVolume = this.n.getStreamMaxVolume(3);
        return new BigDecimal(Double.toString(this.i * (this.n.getStreamVolume(3) / streamMaxVolume))).setScale(2, RoundingMode.HALF_UP).floatValue();
    }

    @Override // com.my.target.c0
    public boolean isPlaying() {
        return this.h == 1;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public void onCompletion(MediaPlayer mediaPlayer) {
        Logger.d("MyTarget|SafeDK: Execution> Lcom/my/target/s3;->onCompletion(Landroid/media/MediaPlayer;)V");
        CreativeInfoManager.onVideoCompleted(com.safedk.android.utils.h.r, mediaPlayer, "media-player");
        safedk_s3_onCompletion_ff52309e754ffbc6ceea246357c2f304(mediaPlayer);
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        this.a.b(this.b);
        this.c.a(this.d);
        h();
        a((Surface) null);
        String str = (i == 100 ? "Server died" : "Unknown error") + " (reason: " + (i2 == -1004 ? "IO error" : i2 == -1007 ? "Malformed error" : i2 == -1010 ? "Unsupported error" : i2 == -110 ? "Timed out error" : i2 == Integer.MIN_VALUE ? "Low-level system error" : "Unknown") + ")";
        mi.a("DefaultVideoPlayer: Video error - " + str);
        c0.a aVar = this.f;
        if (aVar != null) {
            aVar.a(str);
        }
        if (this.h > 0) {
            try {
                this.e.reset();
            } catch (Throwable th) {
                mi.a("DefaultVideoPlayer: Media player's reset method called in wrong state, " + th.getMessage());
            }
        }
        this.h = 0;
        return true;
    }

    @Override // android.media.MediaPlayer.OnInfoListener
    public boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
        if (i != 3) {
            return false;
        }
        c0.a aVar = this.f;
        if (aVar == null) {
            return true;
        }
        aVar.k();
        return true;
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public void onPrepared(MediaPlayer mediaPlayer) {
        try {
            float f = this.i;
            mediaPlayer.setVolume(f, f);
            this.h = 1;
            mediaPlayer.start();
            long j = this.k;
            if (j > 0) {
                seekTo(j);
            }
        } catch (Throwable th) {
            mi.a("DefaultVideoPlayer: Media player's start method called in wrong state, " + th.getMessage());
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        a(new Surface(surfaceTexture));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        a((Surface) null);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // com.my.target.c0
    public void pause() {
        if (this.h == 1) {
            this.a.b(this.b);
            this.c.b(this.d);
            try {
                this.j = this.e.getCurrentPosition();
                this.e.pause();
            } catch (Throwable th) {
                mi.a("DefaultVideoPlayer: Media player's pause or get current position method called in wrong state, " + th.getMessage());
            }
            this.h = 2;
            c0.a aVar = this.f;
            if (aVar != null) {
                aVar.f();
            }
        }
    }

    @Override // com.my.target.c0
    public void replay() {
        try {
            this.e.start();
            this.h = 1;
        } catch (Throwable th) {
            mi.a("DefaultVideoPlayer: Media player's start method called in wrong state, " + th.getMessage());
        }
        seekTo(0L);
    }

    @Override // com.my.target.c0
    public void resume() {
        if (this.h == 2) {
            this.a.a(this.b);
            this.c.a(this.d);
            try {
                this.e.start();
            } catch (Throwable unused) {
                mi.a("DefaultVideoPlayer: Media player's start method called in wrong state");
            }
            int i = this.j;
            if (i > 0) {
                try {
                    this.e.seekTo(i);
                } catch (Throwable unused2) {
                    mi.a("DefaultVideoPlayer: Media player's seek to method called in wrong state");
                }
                this.j = 0;
            }
            this.h = 1;
            c0.a aVar = this.f;
            if (aVar != null) {
                aVar.h();
            }
        }
    }

    public void safedk_s3_onCompletion_ff52309e754ffbc6ceea246357c2f304(MediaPlayer p0) {
        c0.a aVar;
        float duration = getDuration();
        this.h = 4;
        if (duration > 0.0f && (aVar = this.f) != null) {
            aVar.a(duration, duration);
        }
        c0.a aVar2 = this.f;
        if (aVar2 != null) {
            aVar2.c();
        }
    }

    @Override // com.my.target.c0
    public void seekTo(long j) {
        this.k = j;
        if (i()) {
            try {
                this.e.seekTo((int) j);
                this.k = 0L;
            } catch (Throwable th) {
                mi.a("DefaultVideoPlayer: media player's seek to method called in wrong state, " + th.getMessage());
            }
        }
    }

    @Override // com.my.target.c0
    public void setVolume(float f) {
        this.i = f;
        if (i()) {
            try {
                this.e.setVolume(f, f);
            } catch (Throwable th) {
                mi.a("DefaultVideoPlayer: Media player's set volume method called in wrong state, " + th.getMessage());
            }
        }
        c0.a aVar = this.f;
        if (aVar != null) {
            aVar.a(f);
        }
    }

    @Override // com.my.target.c0
    public void stop() {
        this.a.b(this.b);
        this.c.b(this.d);
        try {
            this.e.stop();
        } catch (Throwable th) {
            mi.a("DefaultVideoPlayer: Media player's stop method called in wrong state, " + th.getMessage());
        }
        c0.a aVar = this.f;
        if (aVar != null) {
            aVar.p();
        }
        this.h = 3;
    }

    @Override // com.my.target.c0
    public void a(c0.a aVar) {
        this.f = aVar;
        this.b.a(aVar);
        this.d.a(aVar);
    }

    @Override // com.my.target.c0
    public void a(e0 e0Var) {
        h();
        if (e0Var == null) {
            this.l = null;
            a((Surface) null);
            return;
        }
        this.l = e0Var;
        TextureView textureView = e0Var.getTextureView();
        if (textureView.getSurfaceTextureListener() != null) {
            Log.w("DefaultVideoPlayer", "Replacing existing SurfaceTextureListener");
        }
        textureView.setSurfaceTextureListener(this);
        SurfaceTexture surfaceTexture = textureView.isAvailable() ? textureView.getSurfaceTexture() : null;
        a(surfaceTexture != null ? new Surface(surfaceTexture) : null);
    }

    @Override // com.my.target.c0
    public void a(Uri uri, e0 e0Var) {
        a(e0Var);
        a(uri, e0Var.getContext());
    }

    @Override // com.my.target.c0
    public void a(Uri uri, Context context) {
        mi.a("DefaultVideoPlayer: Play video in Android MediaPlayer - " + uri);
        int i = this.h;
        if (i == 2 && uri == this.m) {
            resume();
            return;
        }
        this.m = uri;
        if (i != 0) {
            try {
                this.e.reset();
            } catch (Throwable unused) {
                mi.a("DefaultVideoPlayer: Media player's reset method called in wrong state");
            }
            this.h = 0;
        }
        this.e.setOnCompletionListener(this);
        this.e.setOnErrorListener(this);
        this.e.setOnPreparedListener(this);
        this.e.setOnInfoListener(this);
        try {
            this.e.setDataSource(context, uri);
            c0.a aVar = this.f;
            if (aVar != null) {
                aVar.g();
            }
            try {
                this.e.prepareAsync();
            } catch (Throwable th) {
                mi.a("DefaultVideoPlayer: Media player's prepare async method called in wrong state, " + th.getMessage());
            }
            this.a.a(this.b);
            this.c.a(this.d);
        } catch (Throwable th2) {
            if (this.f != null) {
                this.f.a("DefaultVideoPlayer data source error: " + th2.getMessage());
            }
            mi.a("DefaultVideoPlayer: Unable to parse video source, " + th2.getMessage());
            this.h = 5;
            th2.printStackTrace();
        }
    }

    private s3(Context context) {
        this(new MediaPlayer(), new a(50), new ri(), context);
    }

    @Override // com.my.target.c0
    public void a() {
        if (this.i == 1.0f) {
            setVolume(0.0f);
        } else {
            setVolume(1.0f);
        }
    }

    private void a(Surface surface) {
        try {
            this.e.setSurface(surface);
        } catch (Throwable th) {
            mi.a("DefaultVideoPlayer: Media player's set surface method called in wrong state, " + th.getMessage());
        }
        Surface surface2 = this.g;
        if (surface2 != null && surface2 != surface) {
            surface2.release();
        }
        this.g = surface;
    }
}
