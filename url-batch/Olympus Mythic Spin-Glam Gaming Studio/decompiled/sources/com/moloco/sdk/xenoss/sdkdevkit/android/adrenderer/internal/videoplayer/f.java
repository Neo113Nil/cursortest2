package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer;

import android.view.View;
import androidx.annotation.MainThread;
import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.Q;
import com.safedk.android.analytics.brandsafety.creatives.VideoEventsManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.h;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@MainThread
/* loaded from: classes11.dex */
public final class f implements e {
    public static final int f = 8;

    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.c a;

    @NotNull
    public final CoroutineScope b;

    @NotNull
    public final StateFlow c;

    @NotNull
    public final MutableSharedFlow d;

    @NotNull
    public final MutableStateFlow e;

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.VisibilityAwareVideoPlayer$1", f = "VisibilityAwareVideoPlayer.kt", l = {}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements Function3 {
        public int a;
        public /* synthetic */ boolean b;
        public /* synthetic */ boolean c;

        public a(Continuation continuation) {
            super(3, continuation);
        }

        public final Object a(boolean z, boolean z2, Continuation continuation) {
            a aVar = f.this.new a(continuation);
            aVar.b = z;
            aVar.c = z2;
            return aVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return a(((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue(), (Continuation) obj3);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            boolean z = this.b;
            boolean z2 = this.c;
            if (z && z2) {
                f.this.a.play();
            } else {
                f.this.a.pause();
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.VisibilityAwareVideoPlayer$2", f = "VisibilityAwareVideoPlayer.kt", l = {}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements Function3 {
        public int a;
        public /* synthetic */ Object b;
        public /* synthetic */ boolean c;

        public b(Continuation continuation) {
            super(3, continuation);
        }

        public final Object a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.a aVar, boolean z, Continuation continuation) {
            b bVar = new b(continuation);
            bVar.b = aVar;
            bVar.c = z;
            return bVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return a((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.a) obj, ((Boolean) obj2).booleanValue(), (Continuation) obj3);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.a.a((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.a) this.b, false, this.c, false, 5, null);
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.VisibilityAwareVideoPlayer$3", f = "VisibilityAwareVideoPlayer.kt", l = {}, m = "invokeSuspend")
    public static final class c extends SuspendLambda implements Function2 {
        public int a;
        public /* synthetic */ Object b;

        public c(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.a aVar, Continuation continuation) {
            return ((c) create(aVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            c cVar = f.this.new c(continuation);
            cVar.b = obj;
            return cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            f.this.e.setValue((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.a) this.b);
            return Unit.INSTANCE;
        }
    }

    public f(@NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.c basePlayer, @NotNull Q viewVisibilityTracker) {
        Flow b2;
        Intrinsics.checkNotNullParameter(basePlayer, "basePlayer");
        Intrinsics.checkNotNullParameter(viewVisibilityTracker, "viewVisibilityTracker");
        this.a = basePlayer;
        CoroutineScope MainScope = CoroutineScopeKt.MainScope();
        this.b = MainScope;
        b2 = g.b(viewVisibilityTracker, basePlayer.N());
        StateFlow stateIn = FlowKt.stateIn(b2, MainScope, SharingStarted.Companion.getEagerly(), Boolean.FALSE);
        this.c = stateIn;
        MutableSharedFlow MutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(1, 0, BufferOverflow.DROP_OLDEST, 2, null);
        this.d = MutableSharedFlow$default;
        this.e = StateFlowKt.MutableStateFlow(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.a.a((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.a) basePlayer.isPlaying().getValue(), false, ((Boolean) stateIn.getValue()).booleanValue(), false, 5, null));
        FlowKt.launchIn(FlowKt.combine(stateIn, MutableSharedFlow$default, new a(null)), MainScope);
        FlowKt.launchIn(FlowKt.onEach(FlowKt.combine(basePlayer.isPlaying(), stateIn, new b(null)), new c(null)), MainScope);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.e
    public boolean C() {
        return this.a.C();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.e
    @Nullable
    public View N() {
        return this.a.N();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.e
    @Nullable
    public Object a(@NotNull Continuation continuation) {
        return this.a.a(continuation);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.e
    public void b(boolean z) {
        this.a.b(z);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k
    public void destroy() {
        CoroutineScopeKt.cancel$default(this.b, null, 1, null);
        this.a.destroy();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.e
    @NotNull
    public StateFlow f() {
        return this.a.f();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.e
    @NotNull
    public StateFlow isPlaying() {
        return this.e;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.e
    @Nullable
    public String m() {
        return this.a.m();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.e
    @NotNull
    public StateFlow o() {
        return this.a.o();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.e
    public void pause() {
        Logger.d("MolocoAds|SafeDK: Execution> Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/videoplayer/f;->pause()V");
        VideoEventsManager.onPlayerStop(h.D, this, "exo-player");
        safedk_f_pause_1a63ef16ab77c86cd32efdbbd5391aeb();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.e
    public void play() {
        Logger.d("MolocoAds|SafeDK: Execution> Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/videoplayer/f;->play()V");
        VideoEventsManager.onPlayerPlay(h.D, this, "exo-player");
        safedk_f_play_c383d149319f172edf2bd374d20697f2();
    }

    public void safedk_f_pause_1a63ef16ab77c86cd32efdbbd5391aeb() {
        this.d.tryEmit(Boolean.FALSE);
    }

    public void safedk_f_play_c383d149319f172edf2bd374d20697f2() {
        this.d.tryEmit(Boolean.TRUE);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.e
    public void seekTo(long j) {
        this.a.seekTo(j);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.e
    public void a(@Nullable String str) {
        this.a.a(str);
    }
}
