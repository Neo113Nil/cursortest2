package com.moloco.sdk.internal;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import androidx.annotation.ColorInt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.moloco.sdk.R;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.KotlinNothingValueException;
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
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
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
/* loaded from: classes9.dex */
public final class s extends FrameLayout {

    @NotNull
    public static final a k = new a(null);
    public static final int l = 8;

    @NotNull
    public static final CoroutineContext m = com.moloco.sdk.internal.scheduling.b.a().getMain();

    @NotNull
    public final Flow a;

    @NotNull
    public final StateFlow b;

    @NotNull
    public final Function1 c;

    @NotNull
    public final Function0 d;
    public final long e;

    @NotNull
    public final DecelerateInterpolator f;

    @NotNull
    public final w g;
    public boolean h;

    @Nullable
    public i.a i;

    @Nullable
    public CoroutineScope j;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final CoroutineContext a() {
            return s.m;
        }

        public a() {
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.internal.MolocoCTAButtonHostView$onAttachedToWindow$1", f = "MolocoVastCTA.kt", l = {Sdk.SDKError.Reason.DEEPLINK_OPEN_FAILED_VALUE}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements Function2 {
        public int a;

        public static final class a<T> implements FlowCollector {
            public final /* synthetic */ s a;

            public a(s sVar) {
                this.a = sVar;
            }

            public final Object a(boolean z, Continuation continuation) {
                this.a.h = z;
                this.a.b();
                return Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return a(((Boolean) obj).booleanValue(), continuation);
            }
        }

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
            return s.this.new b(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flow = s.this.a;
                a aVar = new a(s.this);
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
    }

    @DebugMetadata(c = "com.moloco.sdk.internal.MolocoCTAButtonHostView$onAttachedToWindow$2", f = "MolocoVastCTA.kt", l = {Sdk.SDKError.Reason.AD_CLOSED_MISSING_HEARTBEAT_VALUE}, m = "invokeSuspend")
    public static final class c extends SuspendLambda implements Function2 {
        public int a;

        public static final class a<T> implements FlowCollector {
            public final /* synthetic */ s a;

            public a(s sVar) {
                this.a = sVar;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(i.a aVar, Continuation continuation) {
                this.a.i = aVar;
                this.a.b();
                return Unit.INSTANCE;
            }
        }

        public c(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return s.this.new c(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow stateFlow = s.this.b;
                a aVar = new a(s.this);
                this.a = 1;
                if (stateFlow.collect(aVar, this) == coroutine_suspended) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(@NotNull Context context, int i, int i2, @NotNull String text, @ColorInt int i3, @ColorInt int i4, @Nullable String str, @NotNull Flow ctaAvailable, @NotNull StateFlow currentAdPart, @NotNull Function1 onButtonRendered, @NotNull Function0 onCTA) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(ctaAvailable, "ctaAvailable");
        Intrinsics.checkNotNullParameter(currentAdPart, "currentAdPart");
        Intrinsics.checkNotNullParameter(onButtonRendered, "onButtonRendered");
        Intrinsics.checkNotNullParameter(onCTA, "onCTA");
        this.a = ctaAvailable;
        this.b = currentAdPart;
        this.c = onButtonRendered;
        this.d = onCTA;
        this.e = getResources().getInteger(R.integer.moloco_animated_visibility_fade_duration_ms);
        this.f = new DecelerateInterpolator();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, i);
        layoutParams.setMargins(i2, i2, i2, i2);
        setLayoutParams(layoutParams);
        ViewCompat.setOnApplyWindowInsetsListener(this, new OnApplyWindowInsetsListener() { // from class: com.moloco.sdk.internal.s$$ExternalSyntheticLambda0
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                return s.a(view, windowInsetsCompat);
            }
        });
        w wVar = new w(context, text, i3, i4, str, onCTA);
        this.g = wVar;
        addView(wVar);
        setAlpha(0.0f);
        setVisibility(8);
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
        Job$default = JobKt__JobKt.Job$default(null, 1, null);
        CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(Job$default.plus(m));
        this.j = CoroutineScope;
        BuildersKt__Builders_commonKt.launch$default(CoroutineScope, null, null, new b(null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(CoroutineScope, null, null, new c(null), 3, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        CoroutineScope coroutineScope = this.j;
        if (coroutineScope != null) {
            CoroutineScopeKt.cancel$default(coroutineScope, null, 1, null);
        }
        this.j = null;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z && getVisibility() == 0) {
            c();
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

    public final void b() {
        i.a aVar = this.i;
        boolean z = this.h && ((aVar instanceof i.a.C1646a) || (aVar instanceof i.a.c));
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.t.a(this, z, this.e, this.f, null, 8, null);
        if (z) {
            c();
        }
    }

    public final void c() {
        if (getWidth() == 0 || getHeight() == 0) {
            return;
        }
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        Function1 function1 = this.c;
        a.AbstractC1677a.c.EnumC1679a enumC1679a = a.AbstractC1677a.c.EnumC1679a.g;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.c cVar = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.c.a;
        function1.invoke(new a.AbstractC1677a.c(enumC1679a, new a.AbstractC1677a.f(cVar.a(iArr[0]), cVar.a(iArr[1])), new a.AbstractC1677a.g(cVar.a(getWidth()), cVar.a(getHeight()))));
    }

    public static final WindowInsetsCompat a(View v, WindowInsetsCompat insets) {
        Intrinsics.checkNotNullParameter(v, "v");
        Intrinsics.checkNotNullParameter(insets, "insets");
        Insets insets2 = insets.getInsets(WindowInsetsCompat.Type.displayCutout());
        Intrinsics.checkNotNullExpressionValue(insets2, "getInsets(...)");
        v.setPadding(insets2.left, insets2.top, insets2.right, insets2.bottom);
        return insets;
    }
}
