package com.inmobi.media;

import android.content.Context;
import android.os.Looper;
import android.transition.TransitionManager;
import android.view.Surface;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.core.view.ViewCompat;
import androidx.media3.exoplayer.ExoPlayer;
import com.inmobi.media.core.config.models.AdConfig;
import com.inmobi.media.videoPlayer.model.HtmlVideoFile;
import com.inmobi.media.videoPlayer.model.HtmlVideoPlaybackState;
import com.inmobi.media.videoPlayer.model.HtmlVideoPlayerConfig;
import com.inmobi.media.videoPlayer.model.HtmlVideoPlayerRequest;
import com.inmobi.media.videoPlayer.model.VideoViewPosition;
import com.ironsource.X3;
import com.safedk.android.internal.partials.InMobiVideoBridge;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;

/* loaded from: classes12.dex */
public final class V7 {
    public final T7 A;
    public final N7 B;
    public final MutableSharedFlow C;
    public final HtmlVideoPlayerRequest a;
    public final InterfaceC4466x9 b;
    public final CoroutineScope c;
    public final CoroutineScope d;
    public final HtmlVideoPlayerConfig e;
    public final AtomicBoolean f;
    public final AtomicBoolean g;
    public final AtomicBoolean h;
    public volatile int i;
    public volatile int j;
    public final List k;
    public final AtomicReference l;
    public final MutableSharedFlow m;
    public final K1 n;
    public final ProgressBar o;
    public final ExoPlayer p;
    public String q;
    public WeakReference r;
    public final List s;
    public Jg t;
    public long u;
    public Job v;
    public final P2 w;
    public final C6 x;
    public final C3859a8 y;
    public final C4439w8 z;

    public V7(Context context, AdConfig.HybridNativeConfig hybridNativeConfig, CoroutineScope coroutineScope, HtmlVideoPlayerRequest htmlVideoPlayerRequest, InterfaceC4466x9 interfaceC4466x9) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(hybridNativeConfig, "hybridNativeConfig");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(htmlVideoPlayerRequest, "htmlVideoPlayerRequest");
        this.a = htmlVideoPlayerRequest;
        this.b = interfaceC4466x9;
        this.c = X4.a(coroutineScope, new S7(CoroutineExceptionHandler.Key, this));
        CoroutineScope a = X4.a(coroutineScope);
        this.d = a;
        HtmlVideoPlayerConfig config = htmlVideoPlayerRequest.getConfig();
        this.e = config;
        this.f = new AtomicBoolean(false);
        this.g = new AtomicBoolean(false);
        this.h = new AtomicBoolean(false);
        List synchronizedList = Collections.synchronizedList(new ArrayList());
        Intrinsics.checkNotNullExpressionValue(synchronizedList, "synchronizedList(...)");
        this.k = synchronizedList;
        Jg jg = Jg.a;
        this.l = new AtomicReference(jg);
        MutableSharedFlow MutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.m = MutableSharedFlow$default;
        K1 k1 = new K1(context);
        this.n = k1;
        this.o = new ProgressBar(context);
        ExoPlayer build = new ExoPlayer.Builder(context).build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        this.p = build;
        List synchronizedList2 = Collections.synchronizedList(new ArrayList());
        Intrinsics.checkNotNullExpressionValue(synchronizedList2, "synchronizedList(...)");
        this.s = synchronizedList2;
        this.t = jg;
        this.w = (P2) P2.g.getValue();
        this.x = new C6(build, hybridNativeConfig, a, config.getPlaybackUpdateInterval(), MutableSharedFlow$default, config.getTrackPercentages());
        Context context2 = k1.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.y = new C3859a8(context2, a, build, config.getMuted(), MutableSharedFlow$default);
        this.z = new C4439w8(a, build, k1, interfaceC4466x9);
        this.A = new T7(this);
        this.B = new N7(this);
        this.C = MutableSharedFlow$default;
    }

    public final void a(AbstractC4295qm abstractC4295qm) {
        BuildersKt__Builders_commonKt.launch$default(this.c, null, null, new O7(this, abstractC4295qm, null), 3, null);
    }

    public final Jg b() {
        Object obj = this.l.get();
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        return (Jg) obj;
    }

    public final void c() {
        if (!this.h.get() && b() == Jg.d) {
            if (!Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                BuildersKt__Builders_commonKt.launch$default(this.c, null, null, new L7(null, this), 3, null);
                return;
            }
            InMobiVideoBridge.exoPlayer3Pause(this.p);
            this.x.a();
            C3859a8 c3859a8 = this.y;
            c3859a8.b.setVolume(0.0f);
            c3859a8.d.a();
            this.l.set(Jg.e);
            a(new C4218nn(this.p.getCurrentPosition()));
        }
    }

    public final void d() {
        Job launch$default;
        Job launch$default2;
        if (this.h.get()) {
            return;
        }
        InterfaceC4466x9 interfaceC4466x9 = this.b;
        if (interfaceC4466x9 != null) {
            ((C4493y9) interfaceC4466x9).b("HtmlMediaPlayer", "playVideo called");
        }
        if (b() != Jg.e && b() != Jg.c && b() != Jg.f) {
            InterfaceC4466x9 interfaceC4466x92 = this.b;
            if (interfaceC4466x92 != null) {
                ((C4493y9) interfaceC4466x92).b("HtmlMediaPlayer", "playVideo: Player not in playable state");
                return;
            }
            return;
        }
        if (!Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
            BuildersKt__Builders_commonKt.launch$default(this.c, null, null, new M7(null, this), 3, null);
            return;
        }
        if (b() == Jg.f) {
            this.p.seekTo(0L);
            this.l.set(Jg.c);
        }
        C3859a8 c3859a8 = this.y;
        if (c3859a8.e) {
            c3859a8.a();
            c3859a8.d.a();
        } else {
            X4.a(c3859a8.a, new Z7(c3859a8, null));
        }
        C6 c6 = this.x;
        if (!c6.d.getAndSet(true)) {
            CoroutineScope coroutineScope = c6.b;
            long j = c6.k;
            A6 action = new A6(c6, null);
            Intrinsics.checkNotNullParameter(coroutineScope, "<this>");
            Intrinsics.checkNotNullParameter(action, "action");
            launch$default = BuildersKt__Builders_commonKt.launch$default(coroutineScope, Dispatchers.getMain().getImmediate(), null, new K3(j, null, action), 2, null);
            c6.e = launch$default;
            CoroutineScope coroutineScope2 = c6.b;
            long j2 = c6.l;
            B6 action2 = new B6(c6, null);
            Intrinsics.checkNotNullParameter(coroutineScope2, "<this>");
            Intrinsics.checkNotNullParameter(action2, "action");
            launch$default2 = BuildersKt__Builders_commonKt.launch$default(coroutineScope2, Dispatchers.getMain().getImmediate(), null, new K3(j2, null, action2), 2, null);
            c6.f = launch$default2;
        }
        InMobiVideoBridge.exoPlayer3Play(this.p);
        this.l.set(Jg.d);
        a(new Gn(this.p.getCurrentPosition()));
    }

    public final void e() {
        Job launch$default;
        if (this.h.get()) {
            return;
        }
        String str = this.q;
        if (str != null) {
            for (HtmlVideoFile htmlVideoFile : this.s) {
                if (Intrinsics.areEqual(htmlVideoFile.getUrl(), str)) {
                    break;
                }
            }
        }
        htmlVideoFile = null;
        if (htmlVideoFile == null) {
            InterfaceC4466x9 interfaceC4466x9 = this.b;
            if (interfaceC4466x9 != null) {
                ((C4493y9) interfaceC4466x9).b("HtmlMediaPlayer", "start() called before successful load – ignoring");
                return;
            }
            return;
        }
        if (!this.g.get()) {
            this.g.set(true);
            launch$default = BuildersKt__Builders_commonKt.launch$default(this.c, null, null, new C7(new F7(this.C), null, this), 3, null);
            List activeJobs = this.k;
            Intrinsics.checkNotNullParameter(launch$default, "<this>");
            Intrinsics.checkNotNullParameter(activeJobs, "activeJobs");
            activeJobs.add(launch$default);
        }
        if (!this.f.get()) {
            this.f.set(true);
            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                this.p.addListener(this.B);
            } else {
                BuildersKt__Builders_commonKt.launch$default(this.c, null, null, new A7(null, this), 3, null);
            }
        }
        if (this.e.getAutoplay()) {
            d();
        }
    }

    public final void f() {
        if (this.h.get()) {
            return;
        }
        if (b() == Jg.d) {
            c();
        }
        if (this.f.get()) {
            this.f.set(false);
            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                this.p.removeListener(this.B);
            } else {
                BuildersKt__Builders_commonKt.launch$default(this.c, null, null, new Q7(null, this), 3, null);
            }
        }
        this.x.a();
        this.g.set(false);
        X4.a(this.k);
    }

    public final void a(RelativeLayout parentView) {
        InterfaceC4466x9 interfaceC4466x9;
        Intrinsics.checkNotNullParameter(parentView, "parentView");
        if (this.h.get()) {
            return;
        }
        this.r = new WeakReference(parentView);
        C4439w8 c4439w8 = this.z;
        T7 surfaceViewabilityListener = this.A;
        c4439w8.getClass();
        Intrinsics.checkNotNullParameter(surfaceViewabilityListener, "surfaceViewabilityListener");
        X4.a(c4439w8.a, new C4386u8(c4439w8, surfaceViewabilityListener, null));
        K1 k1 = this.n;
        VideoViewPosition videoViewPosition = new VideoViewPosition();
        VideoViewPosition videoViewPosition2 = this.e.getVideoViewPosition();
        if (this.e.getFullscreenEnabled()) {
            videoViewPosition.setX(0);
            videoViewPosition.setY(0);
            videoViewPosition.setWidth(-1);
            videoViewPosition.setHeight(-1);
        } else {
            videoViewPosition.setX(videoViewPosition2 != null ? (int) (R5.b() * videoViewPosition2.getX()) : 0);
            videoViewPosition.setY(videoViewPosition2 != null ? (int) (R5.b() * videoViewPosition2.getY()) : 0);
            videoViewPosition.setWidth(videoViewPosition2 != null ? (int) (R5.b() * videoViewPosition2.getWidth()) : -2);
            videoViewPosition.setHeight(videoViewPosition2 != null ? (int) (R5.b() * videoViewPosition2.getHeight()) : -2);
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(videoViewPosition.getWidth(), videoViewPosition.getHeight());
        if (this.e.getFullscreenEnabled()) {
            layoutParams.addRule(13, -1);
        } else {
            layoutParams.setMargins(videoViewPosition.getX(), videoViewPosition.getY(), 0, 0);
        }
        k1.setLayoutParams(layoutParams);
        this.n.setOnPositionChangeListener(new J7(this));
        ViewParent parent = this.o.getParent();
        if (parent != null) {
            ((ViewGroup) parent).removeView(this.o);
        }
        ProgressBar progressBar = this.o;
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(100, 100);
        layoutParams2.gravity = 17;
        progressBar.setLayoutParams(layoutParams2);
        progressBar.setVisibility(0);
        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
            this.n.addView(this.o, 0);
        } else {
            BuildersKt__Builders_commonKt.launch$default(this.c, null, null, new R7(null, this), 3, null);
        }
        K1 k12 = this.n;
        if (ViewCompat.isAttachedToWindow(k12)) {
            InterfaceC4466x9 interfaceC4466x92 = this.b;
            if (interfaceC4466x92 != null) {
                ((C4493y9) interfaceC4466x92).a("HtmlMediaPlayer", "inflate: MediaPlayerLayout is attached to window");
            }
            a(C4492y8.a);
        } else {
            k12.addOnAttachStateChangeListener(new I7(k12, this));
        }
        parentView.addView(this.n, 0);
        if (b() == Jg.c || (interfaceC4466x9 = this.b) == null) {
            return;
        }
        ((C4493y9) interfaceC4466x9).b("HtmlMediaPlayer", "inflate() called before successful load – waiting for load to complete");
    }

    public final HtmlVideoPlaybackState a() {
        String str;
        HtmlVideoPlaybackState htmlVideoPlaybackState = new HtmlVideoPlaybackState();
        int ordinal = b().ordinal();
        if (ordinal == 2) {
            EnumC4307r8[] enumC4307r8Arr = EnumC4307r8.a;
            str = X3.i.s;
        } else if (ordinal == 3) {
            EnumC4307r8[] enumC4307r8Arr2 = EnumC4307r8.a;
            str = "playing";
        } else if (ordinal == 4) {
            EnumC4307r8[] enumC4307r8Arr3 = EnumC4307r8.a;
            str = "paused";
        } else if (ordinal == 5) {
            EnumC4307r8[] enumC4307r8Arr4 = EnumC4307r8.a;
            str = X3.i.h0;
        } else if (ordinal != 6) {
            EnumC4307r8[] enumC4307r8Arr5 = EnumC4307r8.a;
            str = "loading";
        } else {
            EnumC4307r8[] enumC4307r8Arr6 = EnumC4307r8.a;
            str = X3.i.t;
        }
        htmlVideoPlaybackState.setState(str);
        htmlVideoPlaybackState.setDuration(this.p.getDuration() / 1000.0f);
        htmlVideoPlaybackState.setTime(this.p.getCurrentPosition() / 1000.0f);
        htmlVideoPlaybackState.setMuted(this.y.e);
        return htmlVideoPlaybackState;
    }

    public final void a(VideoViewPosition newVideoViewPosition) {
        Intrinsics.checkNotNullParameter(newVideoViewPosition, "newVideoViewPosition");
        if (this.h.get()) {
            return;
        }
        if (!Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
            BuildersKt__Builders_commonKt.launch$default(this.c, null, null, new U7(null, this, newVideoViewPosition), 3, null);
            return;
        }
        TransitionManager.beginDelayedTransition(this.n);
        this.e.setVideoViewPosition(newVideoViewPosition);
        int b = (int) (R5.b() * newVideoViewPosition.getWidth());
        int b2 = (int) (R5.b() * newVideoViewPosition.getHeight());
        K1 k1 = this.n;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(b, b2);
        if (this.e.getVideoViewPosition() != null) {
            layoutParams.setMargins((int) (R5.b() * newVideoViewPosition.getX()), (int) (R5.b() * newVideoViewPosition.getY()), 0, 0);
        }
        k1.setLayoutParams(layoutParams);
        if (this.i > 0 && this.j > 0) {
            K1 k12 = this.n;
            int i = this.i;
            int i2 = this.j;
            k12.getClass();
            if (i > 0 && i2 > 0) {
                k12.a = i / i2;
                k12.requestLayout();
            }
        }
        this.n.requestLayout();
    }

    public final void a(AbstractC4175m8 abstractC4175m8) {
        Surface surface;
        if (abstractC4175m8 instanceof C4202n8) {
            C4202n8 c4202n8 = (C4202n8) abstractC4175m8;
            this.q = c4202n8.a;
            this.v = null;
            if (!Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                BuildersKt__Builders_commonKt.launch$default(this.c, null, null, new H7(null, this, c4202n8), 3, null);
                return;
            }
            this.l.set(Jg.c);
            this.p.seekTo(0L);
            C4439w8 c4439w8 = this.z;
            if (!c4439w8.g && (surface = c4439w8.e) != null) {
                c4439w8.g = true;
                c4439w8.b.setVideoSurface(surface);
            }
            HtmlVideoPlaybackState htmlVideoPlaybackState = new HtmlVideoPlaybackState();
            htmlVideoPlaybackState.setDuration(c4202n8.b / 1000.0f);
            htmlVideoPlaybackState.setVideoUrl(c4202n8.a);
            htmlVideoPlaybackState.setLatency(Long.valueOf(System.currentTimeMillis() - this.u));
            htmlVideoPlaybackState.setMuted(this.y.e);
            EnumC4307r8[] enumC4307r8Arr = EnumC4307r8.a;
            htmlVideoPlaybackState.setState(X3.i.s);
            htmlVideoPlaybackState.setTime(this.p.getCurrentPosition() / 1000.0f);
            a(new C4229o8(htmlVideoPlaybackState, c4202n8.c));
            return;
        }
        if (abstractC4175m8 instanceof C4123k8) {
            this.l.set(Jg.g);
            this.v = null;
            a(new C4097j8(this.a, ((C4123k8) abstractC4175m8).a.a.a));
            return;
        }
        throw new NoWhenBranchMatchedException();
    }
}
