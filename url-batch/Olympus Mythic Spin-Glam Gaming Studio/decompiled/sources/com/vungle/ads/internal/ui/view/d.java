package com.vungle.ads.internal.ui.view;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.media.AudioAttributes;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.TextureView;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.annotation.VisibleForTesting;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.internal.partials.LiftoffMonetizeVideoBridge;
import com.safedk.android.utils.Logger;
import com.vungle.ads.internal.r1;
import com.vungle.ads.internal.util.t;
import com.vungle.ads.internal.util.u;
import com.vungle.ads.nativead.NativeVideoListener;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes4.dex */
public final class d extends FrameLayout implements TextureView.SurfaceTextureListener {
    public boolean a;
    public final ViewTreeObserver.OnScrollChangedListener b;
    public final ViewTreeObserver.OnGlobalLayoutListener c;
    public float d;
    public TextureView e;
    public Surface f;
    public MediaPlayer g;
    public Uri h;
    public AtomicBoolean i;
    public AtomicBoolean j;
    public boolean k;
    public boolean l;
    public int m;
    public int n;
    public boolean o;
    public boolean p;
    public boolean q;
    public int r;
    public int s;
    public com.vungle.ads.nativead.b t;
    public b u;
    public int v;
    public final Handler w;
    public final a x;
    public Function0 y;

    public /* synthetic */ d(Context context) {
        this(context, null);
    }

    public static final void a(d this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.c();
    }

    public static final void b(d this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.c();
    }

    @VisibleForTesting
    public static /* synthetic */ void getMediaPlayerFactory$vungle_ads_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getSurface$vungle_ads_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getTexture$vungle_ads_release$annotations() {
    }

    public final void c() {
        MediaPlayer mediaPlayer;
        Surface surface;
        if (this.a) {
            if (!e() || !this.k || this.l) {
                if (this.i.get() && (mediaPlayer = this.g) != null && mediaPlayer.isPlaying()) {
                    boolean z = u.a;
                    t.a("NativeAd-Video", "auto-pause: visibility NOT enough");
                    g();
                    return;
                }
                return;
            }
            if (!this.i.get() || (surface = this.f) == null || !surface.isValid()) {
                k();
                return;
            }
            MediaPlayer mediaPlayer2 = this.g;
            if ((mediaPlayer2 == null || !mediaPlayer2.isPlaying()) && !this.q) {
                boolean z2 = u.a;
                StringBuilder a = com.iab.omid.library.vungle.internal.l.a("auto-resume: visibility OK, start() at pos=");
                MediaPlayer mediaPlayer3 = this.g;
                a.append(mediaPlayer3 != null ? Integer.valueOf(mediaPlayer3.getCurrentPosition()) : null);
                a.append(" ms");
                t.a("NativeAd-Video", a.toString());
                MediaPlayer mediaPlayer4 = this.g;
                if (mediaPlayer4 != null) {
                    LiftoffMonetizeVideoBridge.MediaPlayerStart(mediaPlayer4);
                }
                f();
            }
        }
    }

    public final void d() {
        if (this.g != null) {
            return;
        }
        MediaPlayer mediaPlayer = (MediaPlayer) this.y.mo4828invoke();
        mediaPlayer.setAudioAttributes(new AudioAttributes.Builder().setUsage(1).setContentType(3).build());
        mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: com.vungle.ads.internal.ui.view.d$$ExternalSyntheticLambda0
            @Override // android.media.MediaPlayer.OnPreparedListener
            public final void onPrepared(MediaPlayer mediaPlayer2) {
                d.a(d.this, mediaPlayer2);
            }
        });
        mediaPlayer.setOnVideoSizeChangedListener(new MediaPlayer.OnVideoSizeChangedListener() { // from class: com.vungle.ads.internal.ui.view.d$$ExternalSyntheticLambda1
            @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
            public final void onVideoSizeChanged(MediaPlayer mediaPlayer2, int i, int i2) {
                d.a(d.this, mediaPlayer2, i, i2);
            }
        });
        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: com.vungle.ads.internal.ui.view.d$$ExternalSyntheticLambda2
            @Override // android.media.MediaPlayer.OnCompletionListener
            public final void onCompletion(MediaPlayer mediaPlayer2) {
                Logger.d("LiftoffMonetize|SafeDK: Execution> Lcom/vungle/ads/internal/ui/view/d$$ExternalSyntheticLambda2;->onCompletion(Landroid/media/MediaPlayer;)V");
                CreativeInfoManager.onVideoCompleted(com.safedk.android.utils.h.d, mediaPlayer2, "media-player");
                safedk_d$$ExternalSyntheticLambda2_onCompletion_0ae16ea718275f8aea90a4a0d869e1f8(mediaPlayer2);
            }

            public void safedk_d$$ExternalSyntheticLambda2_onCompletion_0ae16ea718275f8aea90a4a0d869e1f8(MediaPlayer p0) {
                d.b(d.this, p0);
            }
        });
        mediaPlayer.setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: com.vungle.ads.internal.ui.view.d$$ExternalSyntheticLambda3
            @Override // android.media.MediaPlayer.OnErrorListener
            public final boolean onError(MediaPlayer mediaPlayer2, int i, int i2) {
                return d.b(d.this, mediaPlayer2, i, i2);
            }
        });
        this.g = mediaPlayer;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.d, this, me);
        return super.dispatchTouchEvent(me);
    }

    public final boolean e() {
        if (!isShown()) {
            return false;
        }
        if (!getGlobalVisibleRect(new Rect())) {
            return false;
        }
        long height = getHeight() * getWidth();
        return height > 0 && ((float) (r0.height() * r0.width())) / ((float) height) >= this.d;
    }

    public final void f() {
        NativeVideoListener nativeVideoListener;
        this.w.removeCallbacks(this.x);
        this.w.post(this.x);
        com.vungle.ads.nativead.b bVar = this.t;
        if (bVar == null || (nativeVideoListener = ((n) bVar).getNativeVideoListener()) == null) {
            return;
        }
        nativeVideoListener.onVideoPlay();
    }

    public final void g() {
        Object m8023constructorimpl;
        NativeVideoListener nativeVideoListener;
        MediaPlayer mediaPlayer = this.g;
        if (mediaPlayer != null && this.i.get() && mediaPlayer.isPlaying()) {
            boolean z = u.a;
            StringBuilder a = com.iab.omid.library.vungle.internal.l.a("pauseInternal(): pos=");
            a.append(mediaPlayer.getCurrentPosition());
            a.append(" ms");
            t.a("NativeAd-Video", a.toString());
            LiftoffMonetizeVideoBridge.MediaPlayerPause(mediaPlayer);
            this.w.removeCallbacks(this.x);
            b();
            com.vungle.ads.nativead.b bVar = this.t;
            if (bVar != null && (nativeVideoListener = ((n) bVar).getNativeVideoListener()) != null) {
                nativeVideoListener.onVideoPause();
            }
        } else {
            boolean z2 = u.a;
            t.a("NativeAd-Video", "pauseInternal(): no-op (not playing or no player)");
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            m8023constructorimpl = Result.m8023constructorimpl(Integer.valueOf(mediaPlayer != null ? mediaPlayer.getCurrentPosition() : this.m));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(th));
        }
        Integer valueOf = Integer.valueOf(this.m);
        if (Result.m8028isFailureimpl(m8023constructorimpl)) {
            m8023constructorimpl = valueOf;
        }
        this.m = ((Number) m8023constructorimpl).intValue();
    }

    public final int getCurrentPositionMs() {
        Object m8023constructorimpl;
        if (!this.i.get()) {
            return RangesKt.coerceAtLeast(this.m, 0);
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            MediaPlayer mediaPlayer = this.g;
            m8023constructorimpl = Result.m8023constructorimpl(Integer.valueOf(mediaPlayer != null ? mediaPlayer.getCurrentPosition() : this.m));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(th));
        }
        Integer valueOf = Integer.valueOf(this.m);
        if (Result.m8028isFailureimpl(m8023constructorimpl)) {
            m8023constructorimpl = valueOf;
        }
        return RangesKt.coerceAtLeast(((Number) m8023constructorimpl).intValue(), 0);
    }

    public final int getDurationMs() {
        return this.n;
    }

    @NotNull
    public final Function0 getMediaPlayerFactory$vungle_ads_release() {
        return this.y;
    }

    @Nullable
    public final Surface getSurface$vungle_ads_release() {
        return this.f;
    }

    @NotNull
    public final TextureView getTexture$vungle_ads_release() {
        return this.e;
    }

    public final void h() {
        this.l = true;
        g();
    }

    public final void i() {
        Surface surface;
        this.k = true;
        this.l = false;
        this.q = false;
        boolean z = u.a;
        StringBuilder a = com.iab.omid.library.vungle.internal.l.a("play(): prepared=");
        a.append(this.i);
        a.append(", surfaceValid=");
        Surface surface2 = this.f;
        a.append(surface2 != null ? Boolean.valueOf(surface2.isValid()) : null);
        a.append(", visible=");
        a.append(e());
        t.a("NativeAd-Video", a.toString());
        if (!this.i.get() || (surface = this.f) == null || !surface.isValid() || !e()) {
            k();
            return;
        }
        MediaPlayer mediaPlayer = this.g;
        if (mediaPlayer == null || !mediaPlayer.isPlaying()) {
            StringBuilder a2 = com.iab.omid.library.vungle.internal.l.a("play(): pos=");
            MediaPlayer mediaPlayer2 = this.g;
            a2.append(mediaPlayer2 != null ? Integer.valueOf(mediaPlayer2.getCurrentPosition()) : null);
            a2.append(" ms");
            t.a("NativeAd-Video", a2.toString());
            MediaPlayer mediaPlayer3 = this.g;
            if (mediaPlayer3 != null) {
                LiftoffMonetizeVideoBridge.MediaPlayerStart(mediaPlayer3);
            }
            f();
        }
    }

    public final void j() {
        if (this.k && this.l && !this.q) {
            i();
        }
    }

    public final void k() {
        Object m8023constructorimpl;
        Uri uri;
        try {
            Result.Companion companion = Result.INSTANCE;
            uri = this.h;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(th));
        }
        if (uri != null && !this.i.get() && !this.j.get()) {
            d();
            this.j.set(true);
            this.i.set(false);
            MediaPlayer mediaPlayer = this.g;
            if (mediaPlayer != null) {
                mediaPlayer.reset();
            }
            MediaPlayer mediaPlayer2 = this.g;
            if (mediaPlayer2 != null) {
                mediaPlayer2.setLooping(this.p);
            }
            MediaPlayer mediaPlayer3 = this.g;
            if (mediaPlayer3 != null) {
                LiftoffMonetizeVideoBridge.MediaPlayerSetSurface(mediaPlayer3, this.f);
            }
            MediaPlayer mediaPlayer4 = this.g;
            if (mediaPlayer4 != null) {
                LiftoffMonetizeVideoBridge.MediaPlayerSetDataSource(mediaPlayer4, getContext(), uri);
            }
            boolean z = u.a;
            StringBuilder sb = new StringBuilder();
            sb.append("prepareAsync(): uri=");
            sb.append(uri);
            sb.append(", surfaceValid=");
            Surface surface = this.f;
            Unit unit = null;
            sb.append(surface != null ? Boolean.valueOf(surface.isValid()) : null);
            t.a("NativeAd-Video", sb.toString());
            MediaPlayer mediaPlayer5 = this.g;
            if (mediaPlayer5 != null) {
                mediaPlayer5.prepareAsync();
                unit = Unit.INSTANCE;
            }
            m8023constructorimpl = Result.m8023constructorimpl(unit);
            Throwable m8026exceptionOrNullimpl = Result.m8026exceptionOrNullimpl(m8023constructorimpl);
            if (m8026exceptionOrNullimpl != null) {
                String valueOf = String.valueOf(m8026exceptionOrNullimpl.getLocalizedMessage());
                com.vungle.ads.nativead.b bVar = this.t;
                if (bVar != null) {
                    ((n) bVar).a(valueOf, -1);
                }
            }
        }
    }

    public final void l() {
        Object m8023constructorimpl;
        Object m8023constructorimpl2;
        Object m8023constructorimpl3;
        Unit unit;
        Unit unit2;
        Unit unit3;
        boolean z = u.a;
        t.a("NativeAd-Video", "release()");
        StringBuilder sb = new StringBuilder();
        sb.append("pause() at pos=");
        MediaPlayer mediaPlayer = this.g;
        sb.append(mediaPlayer != null ? Integer.valueOf(mediaPlayer.getCurrentPosition()) : null);
        sb.append(" ms");
        t.a("NativeAd-Video", sb.toString());
        this.l = true;
        this.k = false;
        g();
        this.w.removeCallbacks(this.x);
        try {
            Result.Companion companion = Result.INSTANCE;
            MediaPlayer mediaPlayer2 = this.g;
            if (mediaPlayer2 != null) {
                LiftoffMonetizeVideoBridge.MediaPlayerSetSurface(mediaPlayer2, null);
                unit3 = Unit.INSTANCE;
            } else {
                unit3 = null;
            }
            m8023constructorimpl = Result.m8023constructorimpl(unit3);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(th));
        }
        Throwable m8026exceptionOrNullimpl = Result.m8026exceptionOrNullimpl(m8023constructorimpl);
        if (m8026exceptionOrNullimpl != null) {
            boolean z2 = u.a;
            t.a("NativeAd-Video", "Failed to clear Surface", m8026exceptionOrNullimpl);
        }
        try {
            MediaPlayer mediaPlayer3 = this.g;
            if (mediaPlayer3 != null) {
                LiftoffMonetizeVideoBridge.MediaPlayerStop(mediaPlayer3);
                unit2 = Unit.INSTANCE;
            } else {
                unit2 = null;
            }
            m8023constructorimpl2 = Result.m8023constructorimpl(unit2);
        } catch (Throwable th2) {
            Result.Companion companion3 = Result.INSTANCE;
            m8023constructorimpl2 = Result.m8023constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable m8026exceptionOrNullimpl2 = Result.m8026exceptionOrNullimpl(m8023constructorimpl2);
        if (m8026exceptionOrNullimpl2 != null) {
            boolean z3 = u.a;
            t.a("NativeAd-Video", "Failed to stop MediaPlayer", m8026exceptionOrNullimpl2);
        }
        try {
            MediaPlayer mediaPlayer4 = this.g;
            if (mediaPlayer4 != null) {
                LiftoffMonetizeVideoBridge.MediaPlayerRelease(mediaPlayer4);
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            m8023constructorimpl3 = Result.m8023constructorimpl(unit);
        } catch (Throwable th3) {
            Result.Companion companion4 = Result.INSTANCE;
            m8023constructorimpl3 = Result.m8023constructorimpl(ResultKt.createFailure(th3));
        }
        Throwable m8026exceptionOrNullimpl3 = Result.m8026exceptionOrNullimpl(m8023constructorimpl3);
        if (m8026exceptionOrNullimpl3 != null) {
            boolean z4 = u.a;
            t.a("NativeAd-Video", "Failed to release MediaPlayer", m8026exceptionOrNullimpl3);
        }
        this.g = null;
        Surface surface = this.f;
        if (surface != null) {
            surface.release();
        }
        this.f = null;
        this.i.set(false);
        this.j.set(false);
    }

    public final void m() {
        boolean z = u.a;
        t.a("NativeAd-Video", "setAutoVisibility enabled=true threshold=0.01");
        this.a = true;
        this.d = RangesKt.coerceIn(0.01f, 0.0f, 1.0f);
        c();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        boolean z = u.a;
        t.a("NativeAd-Video", "onAttachedToWindow()");
        super.onAttachedToWindow();
        getViewTreeObserver().addOnScrollChangedListener(this.b);
        getViewTreeObserver().addOnGlobalLayoutListener(this.c);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        boolean z = u.a;
        t.a("NativeAd-Video", "onDetachedFromWindow()");
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnScrollChangedListener(this.b);
        getViewTreeObserver().removeOnGlobalLayoutListener(this.c);
        g();
        Surface surface = this.f;
        if (surface != null) {
            surface.release();
        }
        this.f = null;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture st, int i, int i2) {
        Object m8023constructorimpl;
        Unit unit;
        Intrinsics.checkNotNullParameter(st, "st");
        Surface surface = this.f;
        if (surface != null) {
            surface.release();
        }
        Surface surface2 = new Surface(st);
        this.f = surface2;
        try {
            Result.Companion companion = Result.INSTANCE;
            MediaPlayer mediaPlayer = this.g;
            if (mediaPlayer != null) {
                LiftoffMonetizeVideoBridge.MediaPlayerSetSurface(mediaPlayer, surface2);
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            m8023constructorimpl = Result.m8023constructorimpl(unit);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(th));
        }
        Throwable m8026exceptionOrNullimpl = Result.m8026exceptionOrNullimpl(m8023constructorimpl);
        if (m8026exceptionOrNullimpl != null) {
            boolean z = u.a;
            t.a("NativeAd-Video", "Failed to set surface", m8026exceptionOrNullimpl);
        }
        boolean m8029isSuccessimpl = Result.m8029isSuccessimpl(m8023constructorimpl);
        boolean z2 = u.a;
        t.a("NativeAd-Video", "onSurfaceTextureAvailable(): " + i + " x " + i2 + ", prepared=" + this.i + ", wantPlay=" + this.k + ", surfaceRet=" + m8029isSuccessimpl);
        if (m8029isSuccessimpl && this.i.get() && this.k) {
            StringBuilder a = com.iab.omid.library.vungle.internal.l.a("onSurfaceTextureAvailable and videoCompleted=");
            a.append(this.q);
            t.a("NativeAd-Video", a.toString());
            if (this.q) {
                this.m = RangesKt.coerceAtLeast(this.n, 0);
                StringBuilder a2 = com.iab.omid.library.vungle.internal.l.a("seekTo ");
                a2.append(this.m);
                t.a("NativeAd-Video", a2.toString());
                if (this.i.get()) {
                    MediaPlayer mediaPlayer2 = this.g;
                    if (mediaPlayer2 != null) {
                        mediaPlayer2.seekTo(this.m);
                    }
                    b();
                }
                MediaPlayer mediaPlayer3 = this.g;
                if (mediaPlayer3 != null) {
                    LiftoffMonetizeVideoBridge.MediaPlayerStart(mediaPlayer3);
                }
                MediaPlayer mediaPlayer4 = this.g;
                if (mediaPlayer4 != null) {
                    LiftoffMonetizeVideoBridge.MediaPlayerPause(mediaPlayer4);
                }
            } else {
                MediaPlayer mediaPlayer5 = this.g;
                if (mediaPlayer5 != null) {
                    LiftoffMonetizeVideoBridge.MediaPlayerStart(mediaPlayer5);
                }
                f();
            }
        } else {
            k();
        }
        a();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture st) {
        Object m8023constructorimpl;
        Unit unit;
        Intrinsics.checkNotNullParameter(st, "st");
        boolean z = u.a;
        t.a("NativeAd-Video", "onSurfaceTextureDestroyed()");
        g();
        try {
            Result.Companion companion = Result.INSTANCE;
            MediaPlayer mediaPlayer = this.g;
            if (mediaPlayer != null) {
                LiftoffMonetizeVideoBridge.MediaPlayerSetSurface(mediaPlayer, null);
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            m8023constructorimpl = Result.m8023constructorimpl(unit);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(th));
        }
        Throwable m8026exceptionOrNullimpl = Result.m8026exceptionOrNullimpl(m8023constructorimpl);
        if (m8026exceptionOrNullimpl != null) {
            boolean z2 = u.a;
            t.a("NativeAd-Video", "Failed to clear surface", m8026exceptionOrNullimpl);
        }
        Surface surface = this.f;
        if (surface != null) {
            surface.release();
        }
        this.f = null;
        this.w.removeCallbacks(this.x);
        b();
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture st, int i, int i2) {
        Intrinsics.checkNotNullParameter(st, "st");
        boolean z = u.a;
        t.a("NativeAd-Video", "onSurfaceTextureSizeChanged() width=" + i + " height=" + i2);
        a();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture st) {
        Intrinsics.checkNotNullParameter(st, "st");
    }

    public final void setLooping(boolean z) {
        boolean z2 = u.a;
        StringBuilder a = com.iab.omid.library.vungle.internal.l.a("setLooping to ");
        a.append(this.p);
        t.a("NativeAd-Video", a.toString());
        this.p = z;
        MediaPlayer mediaPlayer = this.g;
        if (mediaPlayer == null) {
            return;
        }
        mediaPlayer.setLooping(z);
    }

    public final void setMediaPlayerFactory$vungle_ads_release(@NotNull Function0 function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.y = function0;
    }

    public final void setMuted(boolean z) {
        boolean z2 = u.a;
        t.a("NativeAd-Video", "setMuted to " + z);
        this.o = z;
        float f = z ? 0.0f : 1.0f;
        MediaPlayer mediaPlayer = this.g;
        if (mediaPlayer != null) {
            mediaPlayer.setVolume(f, f);
        }
        com.vungle.ads.nativead.b bVar = this.t;
        if (bVar != null) {
            n nVar = (n) bVar;
            if (z) {
                r1.a(nVar.getInternal(), "video.mute");
                nVar.getInternal().a(9, (Map) null);
                NativeVideoListener nativeVideoListener = nVar.getNativeVideoListener();
                if (nativeVideoListener != null) {
                    nativeVideoListener.onVideoMute();
                    return;
                }
                return;
            }
            r1.a(nVar.getInternal(), "video.unmute");
            nVar.getInternal().a(10, (Map) null);
            NativeVideoListener nativeVideoListener2 = nVar.getNativeVideoListener();
            if (nativeVideoListener2 != null) {
                nativeVideoListener2.onVideoUnmute();
            }
        }
    }

    public final void setSource(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        this.h = uri;
        this.i.set(false);
        this.j.set(false);
        this.r = 0;
        this.s = 0;
        k();
    }

    public final void setSurface$vungle_ads_release(@Nullable Surface surface) {
        this.f = surface;
    }

    public final void setTexture$vungle_ads_release(@NotNull TextureView textureView) {
        Intrinsics.checkNotNullParameter(textureView, "<set-?>");
        this.e = textureView;
    }

    public final void setVideoLifecycleCallback(@NotNull com.vungle.ads.nativead.b lifecycleCallback) {
        Intrinsics.checkNotNullParameter(lifecycleCallback, "lifecycleCallback");
        this.t = lifecycleCallback;
    }

    public final void setVideoTransformCallback$vungle_ads_release(@Nullable b bVar) {
        this.u = bVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.b = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.vungle.ads.internal.ui.view.d$$ExternalSyntheticLambda4
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                d.b(d.this);
            }
        };
        this.c = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.vungle.ads.internal.ui.view.d$$ExternalSyntheticLambda5
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                d.a(d.this);
            }
        };
        this.d = 0.01f;
        TextureView textureView = new TextureView(context);
        textureView.setSurfaceTextureListener(this);
        this.e = textureView;
        this.i = new AtomicBoolean(false);
        this.j = new AtomicBoolean(false);
        this.v = -1;
        this.w = new Handler(Looper.getMainLooper());
        this.x = new a(this);
        this.y = c.a;
        setClickable(false);
        setFocusable(false);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(this.e, new FrameLayout.LayoutParams(-1, -1));
    }

    public static final void a(d this$0, MediaPlayer mediaPlayer) {
        Surface surface;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        com.vungle.ads.nativead.b bVar = this$0.t;
        if (bVar != null) {
            ((n) bVar).b();
        }
        this$0.n = mediaPlayer.getDuration();
        this$0.j.set(false);
        this$0.i.set(true);
        int i = this$0.m;
        if (i > 0) {
            mediaPlayer.seekTo(i);
        }
        float f = this$0.o ? 0.0f : 1.0f;
        MediaPlayer mediaPlayer2 = this$0.g;
        if (mediaPlayer2 != null) {
            mediaPlayer2.setVolume(f, f);
        }
        boolean z = u.a;
        StringBuilder a = com.iab.omid.library.vungle.internal.l.a("onPrepared(): duration=");
        a.append(this$0.n);
        a.append(" ms lastPos=");
        a.append(this$0.m);
        a.append(" wantPlay=");
        a.append(this$0.k);
        t.a("NativeAd-Video", a.toString());
        if (this$0.k && (surface = this$0.f) != null && surface.isValid()) {
            t.a("NativeAd-Video", "start video on prepared.");
            LiftoffMonetizeVideoBridge.MediaPlayerStart(mediaPlayer);
            this$0.f();
        }
    }

    public static final void b(d this$0, MediaPlayer mediaPlayer) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        boolean z = u.a;
        t.a("NativeAd-Video", "onCompletion()");
        this$0.m = this$0.n;
        this$0.q = true;
        this$0.w.removeCallbacks(this$0.x);
        this$0.b();
        this$0.v = 100;
        com.vungle.ads.nativead.b bVar = this$0.t;
        if (bVar != null) {
            ((n) bVar).a(100);
        }
        com.vungle.ads.nativead.b bVar2 = this$0.t;
        if (bVar2 != null) {
            n nVar = (n) bVar2;
            r1.a(nVar.getInternal(), "video.close");
            nVar.getInternal().a(3, (Map) null);
            NativeVideoListener nativeVideoListener = nVar.getNativeVideoListener();
            if (nativeVideoListener != null) {
                nativeVideoListener.onVideoEnd();
            }
        }
    }

    public static final boolean b(d this$0, MediaPlayer mediaPlayer, int i, int i2) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        boolean z = u.a;
        t.c("NativeAd-Video", "onError(): what=" + i + ", extra=" + i2);
        this$0.j.set(false);
        this$0.i.set(false);
        String valueOf = String.valueOf(i2);
        com.vungle.ads.nativead.b bVar = this$0.t;
        if (bVar == null) {
            return true;
        }
        ((n) bVar).a(valueOf, i);
        return true;
    }

    public final void b() {
        int coerceIn;
        int i = this.n;
        if (i <= 0 || !this.i.get() || (coerceIn = RangesKt.coerceIn((int) ((getCurrentPositionMs() * 100) / i), 0, 100)) == this.v) {
            return;
        }
        this.v = coerceIn;
        com.vungle.ads.nativead.b bVar = this.t;
        if (bVar != null) {
            ((n) bVar).a(coerceIn);
        }
    }

    public static final void a(d this$0, MediaPlayer mediaPlayer, int i, int i2) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (i <= 0 || i2 <= 0) {
            return;
        }
        this$0.r = i;
        this$0.s = i2;
        SurfaceTexture surfaceTexture = this$0.e.getSurfaceTexture();
        if (surfaceTexture != null) {
            surfaceTexture.setDefaultBufferSize(i, i2);
        }
        this$0.a();
    }

    public final void a() {
        float f;
        if (this.r <= 0 || this.s <= 0) {
            return;
        }
        int width = this.e.getWidth();
        int height = this.e.getHeight();
        if (width == 0 || height == 0) {
            return;
        }
        float f2 = width;
        float f3 = height;
        float f4 = f2 / f3;
        float f5 = this.r / this.s;
        Matrix matrix = new Matrix();
        if (f4 > f5) {
            f = f3 / this.s;
        } else {
            f = f2 / this.r;
        }
        matrix.setScale((this.r * f) / f2, (this.s * f) / f3, f2 / 2.0f, f3 / 2.0f);
        this.e.setTransform(matrix);
        this.e.invalidate();
        float f6 = (f2 - (this.r * f)) / 2.0f;
        float f7 = (f3 - (this.s * f)) / 2.0f;
        b bVar = this.u;
        if (bVar != null) {
            bVar.a(this.e.getX() + f6, this.e.getY() + f7);
        }
    }
}
