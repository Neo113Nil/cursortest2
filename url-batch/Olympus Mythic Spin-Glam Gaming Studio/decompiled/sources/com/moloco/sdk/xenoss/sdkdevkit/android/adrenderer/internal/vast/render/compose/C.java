package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.VisibleForTesting;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.Lifecycle;
import com.facebook.internal.FacebookRequestErrorClassification;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.Q;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@SuppressLint({"ViewConstructor"})
/* loaded from: classes9.dex */
public final class C extends FrameLayout {

    @NotNull
    public static final a o = new a(null);
    public static final int p = 8;

    @NotNull
    public static final CoroutineContext q = com.moloco.sdk.internal.scheduling.b.a().getMain();

    @NotNull
    public final Lifecycle a;
    public final boolean b;

    @NotNull
    public final Q c;

    @NotNull
    public final b d;

    @Nullable
    public Function1 e;

    @Nullable
    public Function1 f;

    @Nullable
    public Function1 g;

    @Nullable
    public Function1 h;

    @Nullable
    public String i;
    public long j;
    public boolean k;
    public boolean l;

    @Nullable
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.e m;

    @Nullable
    public CoroutineScope n;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final CoroutineContext a() {
            return C.q;
        }

        public a() {
        }
    }

    public interface b {
        @NotNull
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.e a(@NotNull Lifecycle lifecycle);
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.VastVideoPlayerView$onAttachedToWindow$2", f = "VastVideoPlayer.kt", l = {Sdk.SDKError.Reason.MRAID_JS_CALL_EMPTY_VALUE}, m = "invokeSuspend")
    public static final class c extends SuspendLambda implements Function2 {
        public int a;
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.e b;
        public final /* synthetic */ C c;

        public static final class a<T> implements FlowCollector {
            public final /* synthetic */ C a;
            public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.e b;

            public a(C c, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.e eVar) {
                this.a = c;
                this.b = eVar;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.a aVar, Continuation continuation) {
                Function1 onIsPlaying = this.a.getOnIsPlaying();
                if (onIsPlaying != null) {
                    onIsPlaying.invoke(Boxing.boxBoolean(aVar.e()));
                }
                Function1 onIsVisible = this.a.getOnIsVisible();
                if (onIsVisible != null) {
                    onIsVisible.invoke(Boxing.boxBoolean(aVar.f()));
                }
                View N = this.b.N();
                if (N != null) {
                    N.setKeepScreenOn(aVar.d());
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.e eVar, C c, Continuation continuation) {
            super(2, continuation);
            this.b = eVar;
            this.c = c;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new c(this.b, this.c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow isPlaying = this.b.isPlaying();
                a aVar = new a(this.c, this.b);
                this.a = 1;
                if (isPlaying.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.VastVideoPlayerView$onAttachedToWindow$3", f = "VastVideoPlayer.kt", l = {Sdk.SDKError.Reason.AD_CLOSED_MISSING_HEARTBEAT_VALUE}, m = "invokeSuspend")
    public static final class d extends SuspendLambda implements Function2 {
        public int a;
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.e b;
        public final /* synthetic */ C c;

        public static final class a<T> implements FlowCollector {
            public final /* synthetic */ C a;

            public a(C c) {
                this.a = c;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i iVar, Continuation continuation) {
                Function1 onProgressChanged = this.a.getOnProgressChanged();
                if (onProgressChanged != null) {
                    onProgressChanged.invoke(iVar);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.e eVar, C c, Continuation continuation) {
            super(2, continuation);
            this.b = eVar;
            this.c = c;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new d(this.b, this.c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow o = this.b.o();
                a aVar = new a(this.c);
                this.a = 1;
                if (o.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.VastVideoPlayerView$onAttachedToWindow$4", f = "VastVideoPlayer.kt", l = {323}, m = "invokeSuspend")
    public static final class e extends SuspendLambda implements Function2 {
        public int a;
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.e b;
        public final /* synthetic */ C c;

        public static final class a<T> implements FlowCollector {
            public final /* synthetic */ C a;

            public a(C c) {
                this.a = c;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.l lVar, Continuation continuation) {
                Function1 onError = this.a.getOnError();
                if (onError != null) {
                    onError.invoke(lVar);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.e eVar, C c, Continuation continuation) {
            super(2, continuation);
            this.b = eVar;
            this.c = c;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new e(this.b, this.c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow filterNotNull = FlowKt.filterNotNull(this.b.f());
                a aVar = new a(this.c);
                this.a = 1;
                if (filterNotNull.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.VastVideoPlayerView$onAttachedToWindow$6", f = "VastVideoPlayer.kt", l = {339, FacebookRequestErrorClassification.EC_TOO_MANY_USER_ACTION_CALLS}, m = "invokeSuspend")
    public static final class f extends SuspendLambda implements Function2 {
        public Object a;
        public int b;
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.e c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.e eVar, Continuation continuation) {
            super(2, continuation);
            this.c = eVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new f(this.c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            View N;
            View view;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                N = this.c.N();
                if (N == null) {
                    return Unit.INSTANCE;
                }
                N.setVisibility(4);
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.e eVar = this.c;
                this.a = N;
                this.b = 1;
                if (eVar.a(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    view = (View) this.a;
                    ResultKt.throwOnFailure(obj);
                    view.setVisibility(4);
                    view.setVisibility(0);
                    return Unit.INSTANCE;
                }
                View view2 = (View) this.a;
                ResultKt.throwOnFailure(obj);
                N = view2;
            }
            N.setVisibility(0);
            this.a = N;
            this.b = 2;
            if (DelayKt.delay(50L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            view = N;
            view.setVisibility(4);
            view.setVisibility(0);
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ C(Context context, Lifecycle lifecycle, boolean z, Q q2, b bVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, lifecycle, z, q2, (i & 16) != 0 ? new i(context, z, q2) : bVar);
    }

    @VisibleForTesting
    public static /* synthetic */ void getVideoPlayer$moloco_sdk_release$annotations() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.D, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Nullable
    public final Function1 getOnError() {
        return this.h;
    }

    @Nullable
    public final Function1 getOnIsPlaying() {
        return this.e;
    }

    @Nullable
    public final Function1 getOnIsVisible() {
        return this.f;
    }

    @Nullable
    public final Function1 getOnProgressChanged() {
        return this.g;
    }

    @Nullable
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.e getVideoPlayer$moloco_sdk_release() {
        return this.m;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        CompletableJob Job$default;
        super.onAttachedToWindow();
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.e a2 = this.d.a(this.a);
        this.m = a2;
        Job$default = JobKt__JobKt.Job$default(null, 1, null);
        CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(Job$default.plus(q));
        this.n = CoroutineScope;
        View N = a2.N();
        if (N != null) {
            addView(N, new ViewGroup.LayoutParams(-1, -1));
        }
        BuildersKt__Builders_commonKt.launch$default(CoroutineScope, null, null, new c(a2, this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(CoroutineScope, null, null, new d(a2, this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(CoroutineScope, null, null, new e(a2, this, null), 3, null);
        String str = this.i;
        if (str != null) {
            a2.a(str);
        }
        a2.seekTo(this.j);
        if (this.k) {
            a2.play();
        } else {
            a2.pause();
        }
        a2.b(this.l);
        BuildersKt__Builders_commonKt.launch$default(CoroutineScope, null, null, new f(a2, null), 3, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        CoroutineScope coroutineScope = this.n;
        if (coroutineScope != null) {
            CoroutineScopeKt.cancel$default(coroutineScope, null, 1, null);
        }
        this.n = null;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.e eVar = this.m;
        if (eVar != null) {
            eVar.destroy();
        }
        this.m = null;
        removeAllViews();
        Function1 function1 = this.e;
        if (function1 != null) {
            function1.invoke(Boolean.FALSE);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public final void setMute(boolean z) {
        this.l = z;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.e eVar = this.m;
        if (eVar != null) {
            eVar.b(z);
        }
    }

    public final void setOnError(@Nullable Function1 function1) {
        this.h = function1;
    }

    public final void setOnIsPlaying(@Nullable Function1 function1) {
        this.e = function1;
    }

    public final void setOnIsVisible(@Nullable Function1 function1) {
        this.f = function1;
    }

    public final void setOnProgressChanged(@Nullable Function1 function1) {
        this.g = function1;
    }

    public final void setPlay(boolean z) {
        this.k = z;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.e eVar = this.m;
        if (eVar != null) {
            if (z) {
                eVar.play();
            } else {
                eVar.pause();
            }
        }
    }

    public final void setUri(@NotNull String uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        this.i = uri;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.e eVar = this.m;
        if (eVar != null) {
            eVar.a(uri);
            eVar.seekTo(this.j);
            if (this.k) {
                eVar.play();
            } else {
                eVar.pause();
            }
            eVar.b(this.l);
        }
    }

    public final void a(long j) {
        this.j = j;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.e eVar = this.m;
        if (eVar != null) {
            eVar.seekTo(j);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(@NotNull Context context, @NotNull Lifecycle lifecycle, boolean z, @NotNull Q viewVisibilityTracker, @NotNull b videoPlayerFactory) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Intrinsics.checkNotNullParameter(viewVisibilityTracker, "viewVisibilityTracker");
        Intrinsics.checkNotNullParameter(videoPlayerFactory, "videoPlayerFactory");
        this.a = lifecycle;
        this.b = z;
        this.c = viewVisibilityTracker;
        this.d = videoPlayerFactory;
        this.k = true;
    }
}
