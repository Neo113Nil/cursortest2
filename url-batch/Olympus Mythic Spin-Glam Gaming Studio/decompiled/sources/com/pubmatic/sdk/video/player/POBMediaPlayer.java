package com.pubmatic.sdk.video.player;

import android.media.MediaPlayer;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import androidx.annotation.NonNull;
import com.pubmatic.sdk.common.log.POBLog;
import com.pubmatic.sdk.common.taskhandler.POBTaskHandler;
import com.pubmatic.sdk.common.utility.POBTimeoutHandler;
import com.pubmatic.sdk.common.utility.POBUtils;
import com.pubmatic.sdk.video.player.POBPlayer;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.internal.partials.PubMaticVideoBridge;
import com.safedk.android.utils.Logger;
import java.io.IOException;

/* loaded from: classes9.dex */
public class POBMediaPlayer implements POBPlayer, MediaPlayer.OnPreparedListener, MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnErrorListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnInfoListener, MediaPlayer.OnVideoSizeChangedListener {
    private POBPlayer.POBPlayerListener a;
    private MediaPlayer b;
    private Handler c;
    private final HandlerThread d;
    private final Handler e;
    private POBTimeoutHandler f;
    private int g;
    private POBTimeoutHandler h;
    private int i;
    private POBTimeoutHandler j;
    private int k;
    private int l;
    private int m;
    private int n;

    class a implements Runnable {

        /* renamed from: com.pubmatic.sdk.video.player.POBMediaPlayer$a$a, reason: collision with other inner class name */
        class RunnableC1689a implements Runnable {
            RunnableC1689a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (POBMediaPlayer.this.a != null) {
                    POBMediaPlayer.this.a.onPause();
                }
            }
        }

        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (POBMediaPlayer.this.b != null) {
                PubMaticVideoBridge.MediaPlayerPause(POBMediaPlayer.this.b);
            }
            POBMediaPlayer.this.e.post(new RunnableC1689a());
        }
    }

    class b implements Runnable {

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (POBMediaPlayer.this.a != null) {
                    POBMediaPlayer.this.a.onStop();
                }
            }
        }

        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (POBMediaPlayer.this.b != null) {
                PubMaticVideoBridge.MediaPlayerStop(POBMediaPlayer.this.b);
                POBMediaPlayer.this.e.post(new a());
            }
        }
    }

    class c implements Runnable {
        final /* synthetic */ int a;
        final /* synthetic */ int b;

        c(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (POBMediaPlayer.this.b != null) {
                POBMediaPlayer.this.b.setVolume(this.a, this.b);
            }
        }
    }

    class d implements Runnable {
        final /* synthetic */ Surface a;

        d(Surface surface) {
            this.a = surface;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (POBMediaPlayer.this.b == null || !this.a.isValid()) {
                return;
            }
            try {
                PubMaticVideoBridge.MediaPlayerSetSurface(POBMediaPlayer.this.b, this.a);
            } catch (IllegalArgumentException e) {
                POBLog.error("POBMediaPlayer", "Unable to set surface to media player. Reason - " + e.getMessage(), new Object[0]);
            }
        }
    }

    class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (POBMediaPlayer.this.b != null) {
                PubMaticVideoBridge.MediaPlayerSetSurface(POBMediaPlayer.this.b, null);
            }
        }
    }

    class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            POBMediaPlayer.this.g();
        }
    }

    class g implements Runnable {
        final /* synthetic */ int a;

        g(int i) {
            this.a = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (POBMediaPlayer.this.a != null) {
                POBMediaPlayer.this.a.onBufferUpdate(this.a);
            }
        }
    }

    class h implements Runnable {
        h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            POBMediaPlayer.this.h();
        }
    }

    class i implements Runnable {
        i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (POBMediaPlayer.this.a != null) {
                POBMediaPlayer.this.a.onCompletion();
            }
        }
    }

    class j implements Runnable {
        j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (POBMediaPlayer.this.a != null) {
                POBMediaPlayer.this.a.onStart();
            }
        }
    }

    class k extends HandlerThread {
        final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(String str, String str2) {
            super(str);
            this.a = str2;
        }

        @Override // android.os.HandlerThread
        protected void onLooperPrepared() {
            POBMediaPlayer.this.c = new Handler(getLooper());
            POBMediaPlayer.this.a(this.a);
        }
    }

    class l implements Runnable {
        l() {
        }

        @Override // java.lang.Runnable
        public void run() {
            POBMediaPlayer.this.c();
        }
    }

    class m implements Runnable {
        m() {
        }

        @Override // java.lang.Runnable
        public void run() {
            POBMediaPlayer.this.f();
        }
    }

    class n implements Runnable {
        n() {
        }

        @Override // java.lang.Runnable
        public void run() {
            POBMediaPlayer.this.g();
        }
    }

    class o implements Runnable {
        o() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (POBMediaPlayer.this.a != null) {
                POBMediaPlayer.this.a.onPrepared();
            }
        }
    }

    class p implements POBTimeoutHandler.POBTimeoutHandlerListener {
        p() {
        }

        @Override // com.pubmatic.sdk.common.utility.POBTimeoutHandler.POBTimeoutHandlerListener
        public void onTimeout() {
            if (POBMediaPlayer.this.a != null) {
                POBMediaPlayer.this.a.onFailure(-1, "MEDIA_FILE_TIMEOUT_ERROR");
            }
            POBMediaPlayer.this.b();
        }
    }

    class q implements POBTimeoutHandler.POBTimeoutHandlerListener {

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (POBMediaPlayer.this.a != null) {
                    POBMediaPlayer.this.a.onFailure(-108, "MEDIA_DISPLAY_ERROR");
                }
            }
        }

        class b implements Runnable {
            b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (POBMediaPlayer.this.b != null) {
                    PubMaticVideoBridge.MediaPlayerStop(POBMediaPlayer.this.b);
                }
            }
        }

        q() {
        }

        @Override // com.pubmatic.sdk.common.utility.POBTimeoutHandler.POBTimeoutHandlerListener
        public void onTimeout() {
            POBMediaPlayer.this.e.post(new a());
            POBMediaPlayer.this.a(new b());
        }
    }

    class r implements POBTimeoutHandler.POBTimeoutHandlerListener {

        class a implements Runnable {

            /* renamed from: com.pubmatic.sdk.video.player.POBMediaPlayer$r$a$a, reason: collision with other inner class name */
            class RunnableC1690a implements Runnable {
                RunnableC1690a() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    if (POBMediaPlayer.this.a != null) {
                        POBMediaPlayer.this.a.onProgressUpdate(POBMediaPlayer.this.g);
                    }
                }
            }

            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (POBMediaPlayer.this.b != null) {
                    POBMediaPlayer pOBMediaPlayer = POBMediaPlayer.this;
                    pOBMediaPlayer.g = pOBMediaPlayer.b.getCurrentPosition();
                }
                POBMediaPlayer.this.e.post(new RunnableC1690a());
            }
        }

        r() {
        }

        @Override // com.pubmatic.sdk.common.utility.POBTimeoutHandler.POBTimeoutHandlerListener
        public void onTimeout() {
            POBMediaPlayer.this.a(new a());
        }
    }

    class s implements Runnable {
        s() {
        }

        @Override // java.lang.Runnable
        public void run() {
            POBMediaPlayer.this.g();
        }
    }

    class t implements Runnable {
        final /* synthetic */ int a;
        final /* synthetic */ String b;

        t(int i, String str) {
            this.a = i;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (POBMediaPlayer.this.a != null) {
                POBMediaPlayer.this.a.onFailure(this.a, this.b);
            }
        }
    }

    class u implements Runnable {
        final /* synthetic */ String a;

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                POBMediaPlayer.this.d();
            }
        }

        u(String str) {
            this.a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            String message;
            int i;
            POBMediaPlayer.this.a();
            try {
                if (POBMediaPlayer.this.b != null) {
                    PubMaticVideoBridge.MediaPlayerSetDataSource(POBMediaPlayer.this.b, this.a);
                    POBTaskHandler.getInstance().runOnMainThread(new a());
                    POBMediaPlayer.this.b.prepare();
                }
            } catch (IOException e) {
                message = e.getMessage();
                if (message != null) {
                    i = -1004;
                    POBMediaPlayer.this.a(i, message);
                }
            } catch (Exception e2) {
                message = e2.getMessage();
                if (message != null) {
                    i = 1;
                    POBMediaPlayer.this.a(i, message);
                }
            }
        }
    }

    class v implements Runnable {
        v() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (POBMediaPlayer.this.b != null) {
                try {
                    try {
                        PubMaticVideoBridge.MediaPlayerSetSurface(POBMediaPlayer.this.b, null);
                        PubMaticVideoBridge.MediaPlayerStop(POBMediaPlayer.this.b);
                        PubMaticVideoBridge.MediaPlayerRelease(POBMediaPlayer.this.b);
                    } finally {
                        POBMediaPlayer.this.b = null;
                    }
                } catch (AssertionError | Exception e) {
                    POBLog.error("POBMediaPlayer", "Error invalidating MediaPlayer, due to " + e.getMessage(), new Object[0]);
                }
            }
            POBMediaPlayer.this.d.quitSafely();
        }
    }

    class w implements Runnable {

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (POBMediaPlayer.this.a != null) {
                    POBMediaPlayer.this.a.onResume();
                }
            }
        }

        w() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (POBMediaPlayer.this.b != null) {
                PubMaticVideoBridge.MediaPlayerStart(POBMediaPlayer.this.b);
            }
            POBMediaPlayer.this.e.post(new a());
        }
    }

    public POBMediaPlayer(@NonNull String str, @NonNull Handler handler) {
        this.e = handler;
        k kVar = new k("POBMediaPlayer", str);
        this.d = kVar;
        kVar.start();
    }

    @Override // com.pubmatic.sdk.video.player.POBPlayer
    public void destroy() {
        b();
    }

    @Override // com.pubmatic.sdk.video.player.POBPlayer
    public int getDuration() {
        return this.n;
    }

    @Override // com.pubmatic.sdk.video.player.POBPlayer
    public int getVideoHeight() {
        return this.m;
    }

    @Override // com.pubmatic.sdk.video.player.POBPlayer
    public int getVideoWidth() {
        return this.l;
    }

    @Override // android.media.MediaPlayer.OnBufferingUpdateListener
    public void onBufferingUpdate(MediaPlayer mediaPlayer, int i2) {
        POBTaskHandler.getInstance().runOnMainThread(new f());
        this.e.post(new g(i2));
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public void onCompletion(MediaPlayer mediaPlayer) {
        Logger.d("PubMatic|SafeDK: Execution> Lcom/pubmatic/sdk/video/player/POBMediaPlayer;->onCompletion(Landroid/media/MediaPlayer;)V");
        CreativeInfoManager.onVideoCompleted(com.safedk.android.utils.h.F, mediaPlayer, "media-player");
        safedk_POBMediaPlayer_onCompletion_77f01fb5fcc0168da17b753c1eb85629(mediaPlayer);
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public boolean onError(MediaPlayer mediaPlayer, int i2, int i3) {
        return a(i3, a(i3));
    }

    @Override // android.media.MediaPlayer.OnInfoListener
    public boolean onInfo(MediaPlayer mediaPlayer, int i2, int i3) {
        POBLog.info("POBMediaPlayer", "onInfo what: " + i2 + ", extra:" + i3, new Object[0]);
        if (i2 == 3) {
            this.e.post(new j());
            return true;
        }
        if (i2 == 701) {
            POBTaskHandler.getInstance().runOnMainThread(new l());
        } else if (i2 == 702) {
            POBUtils.runOnMainThread(new m());
        } else if (i3 == -1004) {
            return a(i3, a(i3));
        }
        return false;
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public void onPrepared(MediaPlayer mediaPlayer) {
        POBTaskHandler.getInstance().runOnMainThread(new n());
        if (mediaPlayer != null) {
            this.n = mediaPlayer.getDuration();
        }
        this.e.post(new o());
    }

    @Override // com.pubmatic.sdk.video.player.POBPlayer
    public void onSurfaceCreated(@NonNull Surface surface) {
        e();
        a(new d(surface));
    }

    @Override // com.pubmatic.sdk.video.player.POBPlayer
    public void onSurfaceDestroyed(@NonNull Surface surface) {
        h();
        a(new e());
    }

    @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
    public void onVideoSizeChanged(MediaPlayer mediaPlayer, int i2, int i3) {
        this.l = i2;
        this.m = i3;
    }

    @Override // com.pubmatic.sdk.video.player.POBPlayer
    public void pause() {
        h();
        a(new a());
    }

    public void safedk_POBMediaPlayer_onCompletion_77f01fb5fcc0168da17b753c1eb85629(MediaPlayer p0) {
        POBTaskHandler.getInstance().runOnMainThread(new h());
        this.e.post(new i());
    }

    @Override // com.pubmatic.sdk.video.player.POBPlayer
    public void setPlayerListener(@NonNull POBPlayer.POBPlayerListener pOBPlayerListener) {
        this.a = pOBPlayerListener;
    }

    @Override // com.pubmatic.sdk.video.player.POBPlayer
    public void setPrepareTimeout(int i2) {
        this.i = i2;
    }

    @Override // com.pubmatic.sdk.video.player.POBPlayer
    public void setStallTimeout(int i2) {
        this.k = i2;
    }

    @Override // com.pubmatic.sdk.video.player.POBPlayer
    public void setVolume(int i2, int i3) {
        a(new c(i2, i3));
    }

    @Override // com.pubmatic.sdk.video.player.POBPlayer
    public void start() {
        e();
        a(new w());
    }

    @Override // com.pubmatic.sdk.video.player.POBPlayer
    public void stop() {
        h();
        a(new b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        this.a = null;
        h();
        g();
        f();
        a(new v());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        if (this.j == null) {
            POBTimeoutHandler pOBTimeoutHandler = new POBTimeoutHandler(new q());
            this.j = pOBTimeoutHandler;
            pOBTimeoutHandler.start(this.k);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        POBTimeoutHandler pOBTimeoutHandler = new POBTimeoutHandler(new p());
        this.h = pOBTimeoutHandler;
        pOBTimeoutHandler.start(this.i);
    }

    private void e() {
        if (this.f == null) {
            POBTimeoutHandler pOBTimeoutHandler = new POBTimeoutHandler(new r());
            this.f = pOBTimeoutHandler;
            pOBTimeoutHandler.startAtFixedRate(0L, 500L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        POBTimeoutHandler pOBTimeoutHandler = this.j;
        if (pOBTimeoutHandler != null) {
            pOBTimeoutHandler.cancel();
            this.j = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        POBTimeoutHandler pOBTimeoutHandler = this.h;
        if (pOBTimeoutHandler != null) {
            pOBTimeoutHandler.cancel();
            this.h = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        POBTimeoutHandler pOBTimeoutHandler = this.f;
        if (pOBTimeoutHandler != null) {
            pOBTimeoutHandler.cancel();
            this.f = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        MediaPlayer mediaPlayer = new MediaPlayer();
        this.b = mediaPlayer;
        mediaPlayer.setOnPreparedListener(this);
        this.b.setOnCompletionListener(this);
        this.b.setOnBufferingUpdateListener(this);
        this.b.setAudioStreamType(3);
        this.b.setOnErrorListener(this);
        this.b.setOnInfoListener(this);
        this.b.setOnVideoSizeChangedListener(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Runnable runnable) {
        if (this.d.isAlive()) {
            Handler handler = this.c;
            if (handler != null) {
                handler.post(runnable);
                return;
            } else {
                POBLog.error("POBMediaPlayer", "mediaPlayerHandler is null", new Object[0]);
                return;
            }
        }
        POBLog.error("POBMediaPlayer", "Handler thread is dead already", new Object[0]);
    }

    private String a(int i2) {
        if (i2 == -1010) {
            return "MEDIA_ERROR_UNSUPPORTED";
        }
        if (i2 == -1007) {
            return "MEDIA_ERROR_MALFORMED";
        }
        if (i2 == -1004) {
            return "MEDIA_ERROR_IO";
        }
        if (i2 != -110) {
            return "MEDIA_ERROR_UNKNOWN";
        }
        return "MEDIA_ERROR_TIMED_OUT";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(int i2, String str) {
        POBTaskHandler.getInstance().runOnMainThread(new s());
        POBLog.error("POBMediaPlayer", "errorCode: " + i2 + ", errorMsg:" + str, new Object[0]);
        this.e.post(new t(i2, str));
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        a(new u(str));
    }
}
