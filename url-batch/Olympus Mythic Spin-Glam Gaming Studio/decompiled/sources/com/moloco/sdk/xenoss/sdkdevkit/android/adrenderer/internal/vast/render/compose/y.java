package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose;

import android.annotation.SuppressLint;
import android.content.Context;
import android.transition.Fade;
import android.transition.TransitionManager;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.ColorInt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import com.moloco.sdk.R;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.service_locator.a;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.Q;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.C5073b;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@SuppressLint({"ViewConstructor"})
/* loaded from: classes13.dex */
public final class y extends FrameLayout {

    @Deprecated
    @NotNull
    public static final String v = "VastRendererView";

    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i a;

    @Nullable
    public final Lifecycle b;

    @Nullable
    public final Function3 c;

    @Nullable
    public final Function3 d;

    @Nullable
    public final Function3 e;

    @Nullable
    public final Function2 f;

    @Nullable
    public final Function5 g;

    @Nullable
    public final o h;

    @NotNull
    public final Q i;
    public final boolean j;

    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r k;

    @NotNull
    public final Function0 l;

    @Nullable
    public Lifecycle m;

    @Nullable
    public CoroutineScope n;

    @Nullable
    public View o;

    @Nullable
    public i.a p;

    @Nullable
    public final com.moloco.sdk.internal.s q;

    @Nullable
    public final C5073b r;

    @NotNull
    public final View s;

    @NotNull
    public static final d t = new d(null);
    public static final int u = 8;

    @NotNull
    public static final CoroutineContext w = com.moloco.sdk.internal.scheduling.b.a().getMainImmediate();

    public /* synthetic */ class a extends FunctionReferenceImpl implements Function3 {
        public static final a a = new a();

        public a() {
            super(3, x.class, "defaultMuteButtonView", "defaultMuteButtonView(Landroid/content/Context;Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;)Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/MuteButtonView;", 1);
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final n invoke(Context p0, Flow p1, Flow p2) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            Intrinsics.checkNotNullParameter(p1, "p1");
            Intrinsics.checkNotNullParameter(p2, "p2");
            return x.a(p0, p1, p2);
        }
    }

    public /* synthetic */ class b extends FunctionReferenceImpl implements Function3 {
        public static final b a = new b();

        public b() {
            super(3, x.class, "defaultProgressBarView", "defaultProgressBarView(Landroid/content/Context;Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;)Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/VastProgressBarView;", 1);
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final w invoke(Context p0, Flow p1, Flow p2) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            Intrinsics.checkNotNullParameter(p1, "p1");
            Intrinsics.checkNotNullParameter(p2, "p2");
            return x.c(p0, p1, p2);
        }
    }

    public /* synthetic */ class c extends FunctionReferenceImpl implements Function2 {
        public static final c a = new c();

        public c() {
            super(2, x.class, "defaultVastIconView", "defaultVastIconView(Landroid/content/Context;Lkotlinx/coroutines/flow/Flow;)Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/LinearVastIconView;", 1);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final k invoke(Context p0, Flow p1) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            Intrinsics.checkNotNullParameter(p1, "p1");
            return x.a(p0, p1);
        }
    }

    public static final class d {
        public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final CoroutineContext a() {
            return y.w;
        }

        public d() {
        }
    }

    public /* synthetic */ class e extends FunctionReferenceImpl implements Function1 {
        public e(Object obj) {
            super(1, obj, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i.class, "onButtonRendered", "onButtonRendered(Lcom/moloco/sdk/xenoss/sdkdevkit/android/core/services/CustomUserEventBuilderService$UserInteraction$Button;)V", 0);
        }

        public final void a(a.AbstractC1677a.c p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i) this.receiver).a(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((a.AbstractC1677a.c) obj);
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ class f extends FunctionReferenceImpl implements Function1 {
        public f(Object obj) {
            super(1, obj, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i.class, "onButtonRendered", "onButtonRendered(Lcom/moloco/sdk/xenoss/sdkdevkit/android/core/services/CustomUserEventBuilderService$UserInteraction$Button;)V", 0);
        }

        public final void a(a.AbstractC1677a.c p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i) this.receiver).a(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((a.AbstractC1677a.c) obj);
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ class g extends FunctionReferenceImpl implements Function0 {
        public g(Object obj) {
            super(0, obj, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i.class, "onCTA", "onCTA()V", 0);
        }

        public final void a() {
            ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i) this.receiver).A();
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo4828invoke() {
            a();
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.VastRendererView$onAttachedToWindow$1", f = "VastRenderer.kt", l = {636}, m = "invokeSuspend")
    public static final class h extends SuspendLambda implements Function2 {
        public int a;

        public static final class a<T> implements FlowCollector {
            public final /* synthetic */ y a;

            public a(y yVar) {
                this.a = yVar;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(i.a aVar, Continuation continuation) {
                this.a.a(aVar);
                this.a.b(aVar);
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
            return y.this.new h(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow k = y.this.a.k();
                a aVar = new a(y.this);
                this.a = 1;
                if (k.collect(aVar, this) == coroutine_suspended) {
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

    public /* synthetic */ y(Context context, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i iVar, Lifecycle lifecycle, int i, Function3 function3, Function3 function32, Function3 function33, Function2 function2, Function5 function5, o oVar, Q q, boolean z, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r rVar, Function0 function0, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, iVar, (i2 & 4) != 0 ? null : lifecycle, (i2 & 8) != 0 ? -16777216 : i, (i2 & 16) != 0 ? a.a : function3, (i2 & 32) != 0 ? b.a : function32, (i2 & 64) != 0 ? null : function33, (i2 & 128) != 0 ? c.a : function2, (i2 & 256) != 0 ? x.a((String) null, (String) null, (Integer) null, (Integer) null, 15, (Object) null) : function5, (i2 & 512) != 0 ? null : oVar, (i2 & 1024) != 0 ? a.h.a.k() : q, (i2 & 2048) != 0 ? true : z, (i2 & 4096) != 0 ? a.h.a.f() : rVar, (i2 & 8192) != 0 ? new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.y$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                return y.a();
            }
        } : function0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.D, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        CompletableJob Job$default;
        super.onAttachedToWindow();
        Lifecycle lifecycle = this.b;
        if (lifecycle == null) {
            LifecycleOwner lifecycleOwner = ViewTreeLifecycleOwner.get(this);
            lifecycle = lifecycleOwner != null ? lifecycleOwner.getLifecycle() : null;
            if (lifecycle == null) {
                lifecycle = a.h.a.j().getLifecycle();
            }
        }
        this.m = lifecycle;
        Job$default = JobKt__JobKt.Job$default(null, 1, null);
        CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(Job$default.plus(w));
        this.n = CoroutineScope;
        BuildersKt__Builders_commonKt.launch$default(CoroutineScope, null, null, new h(null), 3, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        CoroutineScope coroutineScope = this.n;
        if (coroutineScope != null) {
            CoroutineScopeKt.cancel$default(coroutineScope, null, 1, null);
        }
        this.n = null;
        this.m = null;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public static final Unit a() {
        return Unit.INSTANCE;
    }

    public final void b(i.a aVar) {
        int i;
        C5073b c5073b = this.r;
        if (c5073b == null) {
            return;
        }
        if ((aVar instanceof i.a.c) || (aVar instanceof i.a.C1646a)) {
            i = 0;
        } else {
            if (!(aVar instanceof i.a.d) && !(aVar instanceof i.a.b) && aVar != null) {
                throw new NoWhenBranchMatchedException();
            }
            i = 8;
        }
        c5073b.setVisibility(i);
    }

    public final void a(i.a aVar) {
        View view;
        if (Intrinsics.areEqual(this.p, aVar)) {
            return;
        }
        if (aVar instanceof i.a.C1646a) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.h d2 = ((i.a.C1646a) aVar).d();
            o oVar = this.h;
            view = new C5105b(context, d2, oVar != null ? oVar.a() : null);
        } else if (aVar instanceof i.a.c) {
            Lifecycle lifecycle = this.m;
            if (lifecycle == null) {
                MolocoLogger.warn$default(MolocoLogger.INSTANCE, v, "Skipping Linear rebuild: lifecycle not resolved (view detached?)", null, false, 12, null);
                return;
            }
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.k d3 = ((i.a.c) aVar).d();
            o oVar2 = this.h;
            view = new l(context2, d3, oVar2 != null ? oVar2.c() : null, this.i, lifecycle, null, this.c, this.d, this.e, this.f, this.l, 32, null);
        } else {
            if (!(aVar instanceof i.a.d) && !(aVar instanceof i.a.b) && aVar != null) {
                throw new NoWhenBranchMatchedException();
            }
            view = null;
        }
        this.p = aVar;
        if (view == null) {
            view = this.s;
        }
        if (this.o == view) {
            return;
        }
        long integer = getResources().getInteger(R.integer.moloco_vast_renderer_crossfade_duration_ms);
        Fade fade = new Fade();
        fade.setDuration(integer);
        TransitionManager.beginDelayedTransition(this, fade);
        View view2 = this.o;
        if (view2 != null) {
            removeView(view2);
            this.o = null;
        }
        addView(view, RangesKt.coerceAtLeast(getChildCount() - ((this.q != null ? 1 : 0) + (this.r != null ? 1 : 0)), 0), new FrameLayout.LayoutParams(-1, -1, 1));
        this.o = view;
        if (getMeasuredWidth() <= 0 || getMeasuredHeight() <= 0) {
            return;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
        view.layout(0, 0, getMeasuredWidth(), getMeasuredHeight());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(@NotNull Context context, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i adViewModel, @Nullable Lifecycle lifecycle, @ColorInt int i, @Nullable Function3 function3, @Nullable Function3 function32, @Nullable Function3 function33, @Nullable Function2 function2, @Nullable Function5 function5, @Nullable o oVar, @NotNull Q viewVisibilityTracker, boolean z, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r externalLinkHandler, @NotNull Function0 onShouldReplay) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adViewModel, "adViewModel");
        Intrinsics.checkNotNullParameter(viewVisibilityTracker, "viewVisibilityTracker");
        Intrinsics.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        Intrinsics.checkNotNullParameter(onShouldReplay, "onShouldReplay");
        this.a = adViewModel;
        this.b = lifecycle;
        this.c = function3;
        this.d = function32;
        this.e = function33;
        this.f = function2;
        this.g = function5;
        this.h = oVar;
        this.i = viewVisibilityTracker;
        this.j = z;
        this.k = externalLinkHandler;
        this.l = onShouldReplay;
        C5073b c5073b = null;
        com.moloco.sdk.internal.s sVar = function5 != null ? (com.moloco.sdk.internal.s) function5.invoke(context, adViewModel.n(), adViewModel.k(), new f(adViewModel), new g(adViewModel)) : null;
        this.q = sVar;
        if (z) {
            c5073b = new C5073b(externalLinkHandler, context, null, 0, 12, null);
            int dimensionPixelSize = c5073b.getResources().getDimensionPixelSize(R.dimen.moloco_ad_badge_padding);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, 8388691);
            layoutParams.setMargins(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
            c5073b.setLayoutParams(layoutParams);
            c5073b.setVisibility(8);
            c5073b.setOnButtonRenderedListener(new e(adViewModel));
        }
        this.r = c5073b;
        View a2 = x.a(context);
        this.s = a2;
        setBackgroundColor(i);
        setId(R.id.moloco_fullscreen_ad_view_id);
        addView(a2, new FrameLayout.LayoutParams(-1, -1));
        this.o = a2;
        if (sVar != null) {
            addView(sVar);
        }
        if (c5073b != null) {
            addView(c5073b);
        }
    }
}
