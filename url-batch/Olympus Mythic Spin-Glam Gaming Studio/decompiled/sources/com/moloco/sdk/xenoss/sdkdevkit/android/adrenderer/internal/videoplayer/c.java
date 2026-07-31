package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer;

import android.content.Context;
import android.os.Looper;
import android.view.InflateException;
import androidx.annotation.MainThread;
import androidx.annotation.VisibleForTesting;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.Lifecycle;
import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.source.DefaultMediaSourceFactory;
import com.google.android.exoplayer2.ui.StyledPlayerView;
import com.google.android.exoplayer2.upstream.DataSource;
import com.ironsource.X3;
import com.moloco.sdk.acm.CountEvent;
import com.moloco.sdk.acm.recorder.MetricsRecorder;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.l;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.i;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i;
import com.safedk.android.analytics.brandsafety.creatives.VideoEventsManager;
import com.safedk.android.internal.partials.MolocoAdsVideoBridge;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.h;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@MainThread
/* loaded from: classes4.dex */
public final class c implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.e {
    public static final int x = 8;

    @NotNull
    public final Context a;
    public final boolean b;

    @NotNull
    public final i c;

    @NotNull
    public final MetricsRecorder d;

    @NotNull
    public final String e;

    @NotNull
    public final CoroutineScope f;

    @NotNull
    public final MutableStateFlow g;

    @NotNull
    public final StateFlow h;

    @NotNull
    public final MutableStateFlow i;

    @NotNull
    public final StateFlow j;

    @NotNull
    public final MutableStateFlow k;

    @NotNull
    public final StateFlow l;

    @Nullable
    public final StyledPlayerView m;

    @Nullable
    public String n;
    public boolean o;
    public final Looper p;

    @Nullable
    public ExoPlayer q;

    @Nullable
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.b r;
    public boolean s;

    @NotNull
    public final d t;

    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.d u;
    public long v;

    @Nullable
    public Job w;

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.SimplifiedExoPlayer$1", f = "SimplifiedExoPlayer.kt", l = {}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements Function2 {
        public int a;
        public /* synthetic */ Object b;

        public a(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.a aVar, Continuation continuation) {
            return ((a) create(aVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            a aVar = c.this.new a(continuation);
            aVar.b = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.a) this.b).e()) {
                c.this.I();
            } else {
                Job job = c.this.w;
                if (job != null) {
                    Job.DefaultImpls.cancel$default(job, null, 1, null);
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class b implements Function1 {
        public final /* synthetic */ ExoPlayer a;
        public final /* synthetic */ C1669c b;

        public b(ExoPlayer exoPlayer, C1669c c1669c) {
            this.a = exoPlayer;
            this.b = c1669c;
        }

        public final void a(Throwable th) {
            this.a.removeListener(this.b);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.c$c, reason: collision with other inner class name */
    public static final class C1669c implements Player.Listener {
        public final /* synthetic */ int a;
        public final /* synthetic */ ExoPlayer b;
        public final /* synthetic */ CancellableContinuation c;

        public C1669c(int i, ExoPlayer exoPlayer, CancellableContinuation cancellableContinuation) {
            this.a = i;
            this.b = exoPlayer;
            this.c = cancellableContinuation;
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onPlaybackStateChanged(int i) {
            if (i == this.a) {
                this.b.removeListener(this);
                if (this.c.isActive()) {
                    CancellableContinuation cancellableContinuation = this.c;
                    Result.Companion companion = Result.INSTANCE;
                    cancellableContinuation.resumeWith(Result.m8023constructorimpl(Unit.INSTANCE));
                }
            }
        }
    }

    public static final class d implements Player.Listener {
        public d() {
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onIsPlayingChanged(boolean z) {
            super.onIsPlayingChanged(z);
            ExoPlayer l = c.this.l();
            long duration = l != null ? l.getDuration() : 0L;
            ExoPlayer l2 = c.this.l();
            boolean z2 = duration - (l2 != null ? l2.getCurrentPosition() : 0L) > 0;
            MolocoLogger.info$default(MolocoLogger.INSTANCE, c.this.e, "onIsPlayingChanged hasMore= " + z2, null, false, 12, null);
            c.this.i.setValue(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.a(z, true, z2));
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onPlaybackStateChanged(int i) {
            super.onPlaybackStateChanged(i);
            String valueOf = i != 1 ? i != 2 ? i != 3 ? i != 4 ? String.valueOf(i) : "ENDED" : "READY" : "BUFFERING" : "IDLE";
            MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
            String str = c.this.e;
            StringBuilder sb = new StringBuilder();
            sb.append("onPlaybackStateChanged: ");
            sb.append(valueOf);
            sb.append(" pos=");
            ExoPlayer l = c.this.l();
            sb.append(l != null ? Long.valueOf(l.getCurrentPosition()) : null);
            sb.append(" dur=");
            ExoPlayer l2 = c.this.l();
            sb.append(l2 != null ? Long.valueOf(l2.getDuration()) : null);
            MolocoLogger.info$default(molocoLogger, str, sb.toString(), null, false, 12, null);
            if (i == 4) {
                c cVar = c.this;
                ExoPlayer l3 = c.this.l();
                cVar.b(new i.a(l3 != null ? l3.getDuration() : 1L));
                c.this.A();
            }
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onPlayerError(PlaybackException error) {
            String str;
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.b bVar;
            Intrinsics.checkNotNullParameter(error, "error");
            super.onPlayerError(error);
            MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
            MolocoLogger.error$default(molocoLogger, c.this.e, "Exoplayer error (streaming enabled = " + c.this.b + ')', error, false, 8, null);
            MetricsRecorder metricsRecorder = c.this.d;
            CountEvent withTag = new CountEvent(com.moloco.sdk.internal.client_metrics_data.b.c0.c()).withTag("error_code", String.valueOf(error.errorCode));
            String errorCodeName = PlaybackException.getErrorCodeName(error.errorCode);
            Intrinsics.checkNotNullExpressionValue(errorCodeName, "getErrorCodeName(...)");
            CountEvent withTag2 = withTag.withTag("error_code_name", errorCodeName);
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.b bVar2 = c.this.r;
            CountEvent withTag3 = withTag2.withTag("has_streaming_error", String.valueOf(bVar2 != null && bVar2.a()));
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i iVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i) c.this.g.getValue();
            if (iVar instanceof i.b) {
                str = "not_available";
            } else if (iVar instanceof i.d) {
                str = "preparing";
            } else if (iVar instanceof i.c) {
                str = X3.i.L;
            } else {
                if (!(iVar instanceof i.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                str = "finished";
            }
            metricsRecorder.recordCountEvent(withTag3.withTag("playback_progress", str));
            if (c.this.b && (bVar = c.this.r) != null && bVar.a()) {
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i iVar2 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i) c.this.g.getValue();
                if ((iVar2 instanceof i.a) || (iVar2 instanceof i.c)) {
                    MolocoLogger.info$default(molocoLogger, c.this.e, "Ignoring exoplayer streaming error as the user has viewed some of the ad already", null, false, 12, null);
                    return;
                } else {
                    if (!(iVar2 instanceof i.d) && !Intrinsics.areEqual(iVar2, i.b.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    MolocoLogger.info$default(molocoLogger, c.this.e, "Exoplayer streaming failed before any playback started, so report that as error", null, false, 12, null);
                }
            }
            c.this.k.setValue(l.a);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onRenderedFirstFrame() {
            super.onRenderedFirstFrame();
            MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
            String str = c.this.e;
            StringBuilder sb = new StringBuilder();
            sb.append("onRenderedFirstFrame pos=");
            ExoPlayer l = c.this.l();
            sb.append(l != null ? Long.valueOf(l.getCurrentPosition()) : null);
            MolocoLogger.info$default(molocoLogger, str, sb.toString(), null, false, 12, null);
        }
    }

    public /* synthetic */ class e extends FunctionReferenceImpl implements Function0 {
        public e(Object obj) {
            super(0, obj, c.class, "initOrResumeExoPlayer", "initOrResumeExoPlayer()V", 0);
        }

        public final void a() {
            ((c) this.receiver).z();
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo4828invoke() {
            a();
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ class f extends FunctionReferenceImpl implements Function0 {
        public f(Object obj) {
            super(0, obj, c.class, "disposeExoPlayer", "disposeExoPlayer()V", 0);
        }

        public final void a() {
            ((c) this.receiver).k();
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo4828invoke() {
            a();
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.SimplifiedExoPlayer$startPlaybackProgressJob$1", f = "SimplifiedExoPlayer.kt", l = {356}, m = "invokeSuspend")
    public static final class g extends SuspendLambda implements Function2 {
        public int a;

        public g(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((g) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return c.this.new g(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i != 0 && i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            do {
                ExoPlayer l = c.this.l();
                if (l != null) {
                    c.this.b(new i.c(l.getCurrentPosition(), l.getDuration()));
                }
                this.a = 1;
            } while (DelayKt.delay(500L, this) != coroutine_suspended);
            return coroutine_suspended;
        }
    }

    public c(@NotNull Context context, boolean z, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.i mediaCacheRepository, @NotNull Lifecycle lifecycle, @NotNull MetricsRecorder metricsRecorder) {
        StyledPlayerView styledPlayerView;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mediaCacheRepository, "mediaCacheRepository");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        this.a = context;
        this.b = z;
        this.c = mediaCacheRepository;
        this.d = metricsRecorder;
        this.e = "SimplifiedExoPlayer";
        this.f = CoroutineScopeKt.CoroutineScope(com.moloco.sdk.internal.scheduling.b.a().getMain());
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(i.b.b);
        this.g = MutableStateFlow;
        this.h = MutableStateFlow;
        MutableStateFlow MutableStateFlow2 = StateFlowKt.MutableStateFlow(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.a(false, false, false, 6, null));
        this.i = MutableStateFlow2;
        this.j = MutableStateFlow2;
        MutableStateFlow MutableStateFlow3 = StateFlowKt.MutableStateFlow(null);
        this.k = MutableStateFlow3;
        this.l = MutableStateFlow3;
        try {
            styledPlayerView = new StyledPlayerView(context);
            styledPlayerView.setUseController(false);
        } catch (InflateException e2) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, this.e, "ExoPlayerView could not be instantiated.", e2, false, 8, null);
            this.k.setValue(l.b);
            styledPlayerView = null;
        }
        this.m = styledPlayerView;
        this.p = Looper.getMainLooper();
        FlowKt.launchIn(FlowKt.onEach(isPlaying(), new a(null)), this.f);
        this.t = new d();
        this.u = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.d(lifecycle, new e(this), new f(this));
    }

    @VisibleForTesting
    public static /* synthetic */ void n() {
    }

    @VisibleForTesting
    public static /* synthetic */ void x() {
    }

    public static /* synthetic */ void y() {
    }

    public final void A() {
        this.s = false;
        this.v = 0L;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.e
    public boolean C() {
        return this.o;
    }

    public final void I() {
        Job launch$default;
        Job job = this.w;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, null, 1, null);
        }
        launch$default = BuildersKt__Builders_commonKt.launch$default(this.f, null, null, new g(null), 3, null);
        this.w = launch$default;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k
    public void destroy() {
        CoroutineScopeKt.cancel$default(this.f, null, 1, null);
        this.u.destroy();
        k();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.e
    @NotNull
    public StateFlow isPlaying() {
        return this.j;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.e
    @Nullable
    public String m() {
        return this.n;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.e
    @NotNull
    public StateFlow o() {
        return this.h;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.e
    @MainThread
    @Nullable
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public StyledPlayerView N() {
        return this.m;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.e
    public void pause() {
        Logger.d("MolocoAds|SafeDK: Execution> Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/videoplayer/c;->pause()V");
        VideoEventsManager.onPlayerStop(h.D, this, "exo-player");
        safedk_c_pause_df8320920cdbb802f36c74a62756f5ea();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.e
    public void play() {
        Logger.d("MolocoAds|SafeDK: Execution> Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/videoplayer/c;->play()V");
        VideoEventsManager.onPlayerPlay(h.D, this, "exo-player");
        safedk_c_play_8a1177ec132c8cf5c3741dd4d6cb930a();
    }

    public final boolean s() {
        return this.s;
    }

    public void safedk_c_pause_df8320920cdbb802f36c74a62756f5ea() {
        this.s = false;
        ExoPlayer exoPlayer = this.q;
        if (exoPlayer != null) {
            exoPlayer.pause();
        }
    }

    public void safedk_c_play_8a1177ec132c8cf5c3741dd4d6cb930a() {
        this.s = true;
        ExoPlayer exoPlayer = this.q;
        if (exoPlayer != null) {
            exoPlayer.play();
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.e
    public void seekTo(long j) {
        this.v = j;
        ExoPlayer exoPlayer = this.q;
        if (exoPlayer != null) {
            exoPlayer.seekTo(j);
        }
    }

    public final void z() {
        MolocoLogger.info$default(MolocoLogger.INSTANCE, this.e, "Init exo player", null, false, 12, null);
        StyledPlayerView N = N();
        if (N == null) {
            return;
        }
        if (this.q == null) {
            ExoPlayer build = new ExoPlayer.Builder(this.a).setLooper(this.p).setPauseAtEndOfMediaItems(true).build();
            Intrinsics.checkNotNullExpressionValue(build, "build(...)");
            MolocoAdsVideoBridge.molocoStyledPlayerViewOnSetPlayer(N, build);
            this.q = build;
            build.setPlayWhenReady(false);
            build.addListener(this.t);
            b(build);
            if (Intrinsics.areEqual(o().getValue(), i.b.b)) {
                b(new i.d(build.getDuration()));
            }
        }
        MolocoAdsVideoBridge.molocoStyledPlayerViewOnResume(N);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.e
    public void b(boolean z) {
        this.o = z;
        ExoPlayer exoPlayer = this.q;
        if (exoPlayer != null) {
            a(exoPlayer, z);
        }
    }

    public final void c(ExoPlayer exoPlayer) {
        this.v = exoPlayer.getCurrentPosition();
    }

    public final void d(@Nullable ExoPlayer exoPlayer) {
        this.q = exoPlayer;
    }

    public final void e(boolean z) {
        this.s = z;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.e
    @NotNull
    public StateFlow f() {
        return this.l;
    }

    public final void k() {
        MolocoLogger.info$default(MolocoLogger.INSTANCE, this.e, "Disposing exo player", null, false, 12, null);
        StyledPlayerView N = N();
        if (N != null) {
            MolocoAdsVideoBridge.molocoStyledPlayerViewOnPause(N);
            MolocoAdsVideoBridge.molocoStyledPlayerViewOnSetPlayer(N, null);
        }
        ExoPlayer exoPlayer = this.q;
        long duration = exoPlayer != null ? exoPlayer.getDuration() : 0L;
        ExoPlayer exoPlayer2 = this.q;
        boolean z = duration - (exoPlayer2 != null ? exoPlayer2.getCurrentPosition() : 0L) > 0;
        ExoPlayer exoPlayer3 = this.q;
        if (exoPlayer3 != null) {
            c(exoPlayer3);
            exoPlayer3.removeListener(this.t);
            exoPlayer3.release();
        }
        this.q = null;
        this.i.setValue(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.a(false, false, z));
    }

    @MainThread
    @Nullable
    public final ExoPlayer l() {
        return this.q;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.e
    public void a(@Nullable String str) {
        this.n = str;
        ExoPlayer exoPlayer = this.q;
        if (exoPlayer != null) {
            a(exoPlayer, str);
        }
        A();
    }

    public final void b(ExoPlayer exoPlayer) {
        a(exoPlayer, C());
        a(exoPlayer, m());
        exoPlayer.seekTo(this.v);
        if (this.s) {
            exoPlayer.play();
        } else {
            exoPlayer.pause();
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.e
    @Nullable
    public Object a(@NotNull Continuation continuation) {
        Object a2;
        ExoPlayer exoPlayer = this.q;
        return (exoPlayer == null || (a2 = a(exoPlayer, 3, continuation)) != IntrinsicsKt.getCOROUTINE_SUSPENDED()) ? Unit.INSTANCE : a2;
    }

    public final void b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i iVar) {
        this.g.setValue(iVar);
    }

    public final boolean a(ExoPlayer exoPlayer) {
        return exoPlayer.getVolume() == 0.0f;
    }

    public final void a(ExoPlayer exoPlayer, boolean z) {
        exoPlayer.setVolume(z ? 0.0f : 1.0f);
    }

    public final void a(ExoPlayer exoPlayer, final String str) {
        if (str == null) {
            MolocoLogger.info$default(MolocoLogger.INSTANCE, this.e, "URI Source is empty", null, false, 12, null);
            return;
        }
        try {
            if (this.b) {
                MolocoLogger.info$default(MolocoLogger.INSTANCE, this.e, "Streaming is enabled", null, false, 12, null);
                DefaultMediaSourceFactory defaultMediaSourceFactory = new DefaultMediaSourceFactory(new DataSource.Factory() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.c$$ExternalSyntheticLambda0
                    @Override // com.google.android.exoplayer2.upstream.DataSource.Factory
                    public final DataSource createDataSource() {
                        return c.a(str, this);
                    }
                });
                MediaItem fromUri = MediaItem.fromUri(str);
                Intrinsics.checkNotNullExpressionValue(fromUri, "fromUri(...)");
                exoPlayer.setMediaSource(defaultMediaSourceFactory.createMediaSource(fromUri));
            } else {
                MolocoLogger.info$default(MolocoLogger.INSTANCE, this.e, "Streaming is disabled", null, false, 12, null);
                MolocoAdsVideoBridge.molocoExoPlayerSetMediaItem(exoPlayer, MediaItem.fromUri(str));
            }
            exoPlayer.prepare();
        } catch (Exception e2) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, this.e, "ExoPlayer setMediaItem exception", e2, false, 8, null);
            this.k.setValue(l.c);
        }
    }

    public static final DataSource a(String str, c cVar) {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.b bVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.b(str, cVar.c);
        cVar.r = bVar;
        return bVar;
    }

    public final Object a(ExoPlayer exoPlayer, int i, Continuation continuation) {
        if (exoPlayer.getPlaybackState() == i) {
            return Unit.INSTANCE;
        }
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        C1669c c1669c = new C1669c(i, exoPlayer, cancellableContinuationImpl);
        exoPlayer.addListener(c1669c);
        if (exoPlayer.getPlaybackState() == i) {
            exoPlayer.removeListener(c1669c);
            if (cancellableContinuationImpl.isActive()) {
                Result.Companion companion = Result.INSTANCE;
                cancellableContinuationImpl.resumeWith(Result.m8023constructorimpl(Unit.INSTANCE));
            }
        }
        cancellableContinuationImpl.invokeOnCancellation(new b(exoPlayer, c1669c));
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? result : Unit.INSTANCE;
    }
}
