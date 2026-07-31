package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.R;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.k;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
/* loaded from: classes15.dex */
public final class k extends FrameLayout {

    @NotNull
    public static final a j = new a(null);
    public static final int k = 8;

    @NotNull
    public static final CoroutineContext l = com.moloco.sdk.internal.scheduling.b.a().getMainImmediate();

    @NotNull
    public final Flow a;
    public final int b;
    public final int c;

    @Nullable
    public Function0 d;

    @Nullable
    public Function0 e;

    @Nullable
    public CoroutineScope f;

    @Nullable
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j g;
    public final long h;

    @NotNull
    public final DecelerateInterpolator i;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final CoroutineContext a() {
            return k.l;
        }

        public a() {
        }
    }

    public /* synthetic */ k(Context context, Flow flow, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, flow, (i3 & 4) != 0 ? 8388691 : i, (i3 & 8) != 0 ? context.getResources().getDimensionPixelSize(R.dimen.moloco_default_ad_button_padding) : i2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.D, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Nullable
    public final Function0 getOnClick() {
        return this.e;
    }

    @Nullable
    public final Function0 getOnDisplayed() {
        return this.d;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        CompletableJob Job$default;
        super.onAttachedToWindow();
        Job$default = JobKt__JobKt.Job$default(null, 1, null);
        CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(Job$default.plus(l));
        this.f = CoroutineScope;
        BuildersKt__Builders_commonKt.launch$default(CoroutineScope, null, null, new b(null), 3, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        CoroutineScope coroutineScope = this.f;
        if (coroutineScope != null) {
            CoroutineScopeKt.cancel$default(coroutineScope, null, 1, null);
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

    public final void setOnClick(@Nullable Function0 function0) {
        this.e = function0;
    }

    public final void setOnDisplayed(@Nullable Function0 function0) {
        this.d = function0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(@NotNull Context context, @NotNull Flow vastPrivacyIcon, int i, int i2) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(vastPrivacyIcon, "vastPrivacyIcon");
        this.a = vastPrivacyIcon;
        this.b = i;
        this.c = i2;
        this.h = getResources().getInteger(R.integer.moloco_animated_visibility_fade_duration_ms);
        this.i = new DecelerateInterpolator();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, i);
        layoutParams.setMargins(i2, i2, i2, i2);
        setLayoutParams(layoutParams);
        setVisibility(8);
        setAlpha(0.0f);
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.LinearVastIconView$onAttachedToWindow$1", f = "Linear.kt", l = {436}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements Function2 {
        public int a;

        public b(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return k.this.new b(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flow = k.this.a;
                a aVar = new a(k.this);
                this.a = 1;
                if (flow.collect(aVar, this) == coroutine_suspended) {
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

        public static final class a<T> implements FlowCollector {
            public final /* synthetic */ k a;

            public a(k kVar) {
                this.a = kVar;
            }

            public static final Unit b(k kVar) {
                Function0 onClick = kVar.getOnClick();
                if (onClick != null) {
                    onClick.mo4828invoke();
                }
                return Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j jVar, Continuation continuation) {
                if (Intrinsics.areEqual(jVar, this.a.g)) {
                    return Unit.INSTANCE;
                }
                this.a.g = jVar;
                if (jVar == null) {
                    final View childAt = this.a.getChildCount() > 0 ? this.a.getChildAt(0) : null;
                    k kVar = this.a;
                    long j = kVar.h;
                    DecelerateInterpolator decelerateInterpolator = this.a.i;
                    final k kVar2 = this.a;
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.t.a(kVar, false, j, decelerateInterpolator, new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.k$b$a$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        /* renamed from: invoke */
                        public final Object mo4828invoke() {
                            return k.b.a.a(childAt, kVar2);
                        }
                    });
                } else {
                    this.a.removeAllViews();
                    k kVar3 = this.a;
                    Context context = this.a.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    final k kVar4 = this.a;
                    Function0 function0 = new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.k$b$a$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        /* renamed from: invoke */
                        public final Object mo4828invoke() {
                            return k.b.a.a(k.this);
                        }
                    };
                    final k kVar5 = this.a;
                    kVar3.addView(new u(context, jVar, function0, new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.k$b$a$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        /* renamed from: invoke */
                        public final Object mo4828invoke() {
                            return k.b.a.b(k.this);
                        }
                    }));
                    k kVar6 = this.a;
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.t.a(kVar6, true, kVar6.h, this.a.i, null, 8, null);
                }
                return Unit.INSTANCE;
            }

            public static final Unit a(View view, k kVar) {
                if (view != null && view.getParent() == kVar) {
                    kVar.removeView(view);
                }
                return Unit.INSTANCE;
            }

            public static final Unit a(k kVar) {
                Function0 onDisplayed = kVar.getOnDisplayed();
                if (onDisplayed != null) {
                    onDisplayed.mo4828invoke();
                }
                return Unit.INSTANCE;
            }
        }
    }
}
