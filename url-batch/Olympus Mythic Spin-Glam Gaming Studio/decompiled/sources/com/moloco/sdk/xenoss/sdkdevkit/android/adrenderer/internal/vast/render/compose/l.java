package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.VisibleForTesting;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.Lifecycle;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.Q;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.Logger;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@SuppressLint({"ViewConstructor"})
/* loaded from: classes13.dex */
public final class l extends FrameLayout {

    @NotNull
    public static final e m = new e(null);
    public static final int n = 8;

    @NotNull
    public static final CoroutineContext o = com.moloco.sdk.internal.scheduling.b.a().getMainImmediate();

    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.k a;

    @Nullable
    public final Function0 b;

    @NotNull
    public final Q c;

    @NotNull
    public final Lifecycle d;

    @NotNull
    public final C e;

    @NotNull
    public final Function0 f;

    @Nullable
    public CoroutineScope g;

    @NotNull
    public final MutableStateFlow h;

    @NotNull
    public final MutableStateFlow i;

    @NotNull
    public final MutableStateFlow j;

    @NotNull
    public final GestureDetector k;

    @NotNull
    public final View l;

    public /* synthetic */ class a extends FunctionReferenceImpl implements Function1 {
        public a(Object obj) {
            super(1, obj, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.k.class, "onError", "onError(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/errors/VastAdShowError;)V", 0);
        }

        public final void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.l p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.k) this.receiver).a(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.l) obj);
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ class b extends FunctionReferenceImpl implements Function1 {
        public b(Object obj) {
            super(1, obj, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.k.class, "onMuteChange", "onMuteChange(Z)V", 0);
        }

        public final void a(boolean z) {
            ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.k) this.receiver).c(z);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((Boolean) obj).booleanValue());
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ class c extends FunctionReferenceImpl implements Function0 {
        public c(Object obj) {
            super(0, obj, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.k.class, "onVastPrivacyIconDisplayed", "onVastPrivacyIconDisplayed()V", 0);
        }

        public final void a() {
            ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.k) this.receiver).i();
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo4828invoke() {
            a();
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ class d extends FunctionReferenceImpl implements Function0 {
        public d(Object obj) {
            super(0, obj, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.k.class, "onVastPrivacyIconClick", "onVastPrivacyIconClick()V", 0);
        }

        public final void a() {
            ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.k) this.receiver).u();
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo4828invoke() {
            a();
            return Unit.INSTANCE;
        }
    }

    public static final class e {
        public /* synthetic */ e(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final CoroutineContext a() {
            return l.o;
        }

        public e() {
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.LinearView$isPlayerPlayingFlow$1", f = "Linear.kt", l = {}, m = "invokeSuspend")
    public static final class f extends SuspendLambda implements Function3 {
        public int a;
        public /* synthetic */ boolean b;
        public /* synthetic */ Object c;

        public f(Continuation continuation) {
            super(3, continuation);
        }

        public final Object a(boolean z, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i iVar, Continuation continuation) {
            f fVar = new f(continuation);
            fVar.b = z;
            fVar.c = iVar;
            return fVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return a(((Boolean) obj).booleanValue(), (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i) obj2, (Continuation) obj3);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Boxing.boxBoolean(this.b || !(((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i) this.c) instanceof i.a));
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.LinearView$onAttachedToWindow$1", f = "Linear.kt", l = {}, m = "invokeSuspend")
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
            return l.this.new g(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            l.this.a.b();
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.LinearView$onAttachedToWindow$2", f = "Linear.kt", l = {332}, m = "invokeSuspend")
    public static final class h extends SuspendLambda implements Function2 {
        public int a;

        public static final class a<T> implements FlowCollector {
            public final /* synthetic */ l a;

            public a(l lVar) {
                this.a = lVar;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.m<Long> mVar, Continuation continuation) {
                this.a.getVideoPlayer$moloco_sdk_release().a(mVar.a().longValue());
                this.a.getVideoPlayer$moloco_sdk_release().setPlay(((Boolean) this.a.j.getValue()).booleanValue());
                return Unit.INSTANCE;
            }
        }

        public h(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((h) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return l.this.new h(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow Q = l.this.a.Q();
                a aVar = new a(l.this);
                this.a = 1;
                if (Q.collect(aVar, this) == coroutine_suspended) {
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

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.LinearView$onAttachedToWindow$3", f = "Linear.kt", l = {342}, m = "invokeSuspend")
    public static final class i extends SuspendLambda implements Function2 {
        public int a;

        public static final class a<T> implements FlowCollector {
            public final /* synthetic */ l a;

            public a(l lVar) {
                this.a = lVar;
            }

            public final Object a(boolean z, Continuation continuation) {
                this.a.getVideoPlayer$moloco_sdk_release().setMute(z);
                return Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return a(((Boolean) obj).booleanValue(), continuation);
            }
        }

        public i(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((i) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return l.this.new i(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow q = l.this.a.q();
                a aVar = new a(l.this);
                this.a = 1;
                if (q.collect(aVar, this) == coroutine_suspended) {
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

    public /* synthetic */ l(Context context, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.k kVar, Function0 function0, Q q, Lifecycle lifecycle, C c2, Function3 function3, Function3 function32, Function3 function33, Function2 function2, Function0 function02, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, kVar, function0, q, lifecycle, (i2 & 32) != 0 ? new C(context, lifecycle, kVar.L(), q, null, 16, null) : c2, (i2 & 64) != 0 ? null : function3, (i2 & 128) != 0 ? null : function32, (i2 & 256) != 0 ? null : function33, (i2 & 512) != 0 ? null : function2, (i2 & 1024) != 0 ? new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.l$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                return l.a();
            }
        } : function02);
    }

    public static final Unit c(l lVar, boolean z) {
        lVar.j.setValue(Boolean.valueOf(z));
        lVar.e.setPlay(z);
        return Unit.INSTANCE;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(@NotNull MotionEvent motionEvent) {
        Logger.d("MolocoAds|SafeDK: Execution> Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/l;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z");
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.D, this, motionEvent);
        return safedk_l_dispatchTouchEvent_296fb847140a7e88d683eebe93a92de0(motionEvent);
    }

    @NotNull
    public final C getVideoPlayer$moloco_sdk_release() {
        return this.e;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        CompletableJob Job$default;
        super.onAttachedToWindow();
        Job$default = JobKt__JobKt.Job$default(null, 1, null);
        CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(Job$default.plus(o));
        this.g = CoroutineScope;
        BuildersKt__Builders_commonKt.launch$default(CoroutineScope, null, null, new g(null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(CoroutineScope, null, null, new h(null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(CoroutineScope, null, null, new i(null), 3, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        CoroutineScope coroutineScope = this.g;
        if (coroutineScope != null) {
            CoroutineScopeKt.cancel$default(coroutineScope, null, 1, null);
        }
        this.g = null;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public boolean safedk_l_dispatchTouchEvent_296fb847140a7e88d683eebe93a92de0(MotionEvent ev) {
        Intrinsics.checkNotNullParameter(ev, "ev");
        if (super.dispatchTouchEvent(ev)) {
            return true;
        }
        this.k.onTouchEvent(ev);
        return true;
    }

    public static final Unit a() {
        return Unit.INSTANCE;
    }

    public static final Unit a(l lVar, a.AbstractC1677a.f firstTapPosition, a.AbstractC1677a.f fVar) {
        Intrinsics.checkNotNullParameter(firstTapPosition, "firstTapPosition");
        Intrinsics.checkNotNullParameter(fVar, "<unused var>");
        Function0 function0 = lVar.b;
        if (function0 != null) {
            function0.mo4828invoke();
        } else {
            lVar.a.b(firstTapPosition);
        }
        return Unit.INSTANCE;
    }

    public static final Unit b(l lVar, boolean z) {
        if (z) {
            lVar.a.D();
        } else {
            lVar.a.F();
        }
        return Unit.INSTANCE;
    }

    public final Flow c() {
        return FlowKt.combine(this.h, this.i, new f(null));
    }

    public static final Unit a(l lVar, boolean z) {
        lVar.a.d(z);
        lVar.h.setValue(Boolean.valueOf(z));
        return Unit.INSTANCE;
    }

    public static final Unit a(l lVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i progress) {
        Intrinsics.checkNotNullParameter(progress, "progress");
        lVar.a.a(progress);
        lVar.i.setValue(progress);
        return Unit.INSTANCE;
    }

    public static final Unit a(l lVar, a.AbstractC1677a.c button, a.AbstractC1677a.c.EnumC1679a replacedType) {
        Intrinsics.checkNotNullParameter(button, "button");
        Intrinsics.checkNotNullParameter(replacedType, "replacedType");
        lVar.a.a(button);
        lVar.a.a(replacedType);
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(@NotNull Context context, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.k viewModel, @Nullable Function0 function0, @NotNull Q viewVisibilityTracker, @NotNull Lifecycle lifecycle, @VisibleForTesting @NotNull C videoPlayer, @Nullable Function3 function3, @Nullable Function3 function32, @Nullable Function3 function33, @Nullable Function2 function2, @NotNull Function0 onShouldReplay) {
        super(context);
        k kVar;
        q qVar;
        View view;
        n nVar;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(viewVisibilityTracker, "viewVisibilityTracker");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Intrinsics.checkNotNullParameter(videoPlayer, "videoPlayer");
        Intrinsics.checkNotNullParameter(onShouldReplay, "onShouldReplay");
        this.a = viewModel;
        this.b = function0;
        this.c = viewVisibilityTracker;
        this.d = lifecycle;
        this.e = videoPlayer;
        this.f = onShouldReplay;
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        this.h = MutableStateFlow;
        MutableStateFlow MutableStateFlow2 = StateFlowKt.MutableStateFlow(i.b.b);
        this.i = MutableStateFlow2;
        this.j = StateFlowKt.MutableStateFlow(Boolean.TRUE);
        this.k = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.b.a(context, new Function2() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.l$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return l.a(l.this, (a.AbstractC1677a.f) obj, (a.AbstractC1677a.f) obj2);
            }
        });
        View a2 = x.a(context);
        this.l = a2;
        videoPlayer.setOnIsPlaying(new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.l$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return l.a(l.this, ((Boolean) obj).booleanValue());
            }
        });
        videoPlayer.setOnIsVisible(new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.l$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return l.b(l.this, ((Boolean) obj).booleanValue());
            }
        });
        videoPlayer.setOnProgressChanged(new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.l$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return l.a(l.this, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i) obj);
            }
        });
        videoPlayer.setOnError(new a(viewModel));
        videoPlayer.setUri(viewModel.G());
        addView(a2, new FrameLayout.LayoutParams(-1, -1));
        addView(videoPlayer, new FrameLayout.LayoutParams(-1, -1, 1));
        if (function3 != null && (nVar = (n) function3.invoke(context, c(), viewModel.q())) != null) {
            nVar.setOnMuteChange(new b(viewModel));
            nVar.setOnButtonReplaced(new Function2() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.l$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return l.a(l.this, (a.AbstractC1677a.c) obj, (a.AbstractC1677a.c.EnumC1679a) obj2);
                }
            });
            addView(nVar);
        }
        if (function32 != null && (view = (w) function32.invoke(context, MutableStateFlow, MutableStateFlow2)) != null) {
            addView(view);
        }
        if (function33 != null && (qVar = (q) function33.invoke(context, MutableStateFlow, MutableStateFlow2)) != null) {
            qVar.setOnShouldPlay(new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.l$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return l.c(l.this, ((Boolean) obj).booleanValue());
                }
            });
            qVar.setOnShouldReplay(onShouldReplay);
            addView(qVar);
        }
        if (function2 == null || (kVar = (k) function2.invoke(context, viewModel.O())) == null) {
            return;
        }
        kVar.setOnDisplayed(new c(viewModel));
        kVar.setOnClick(new d(viewModel));
        addView(kVar);
    }
}
