package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.annotation.VisibleForTesting;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ComposeView;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC5050b;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
/* loaded from: classes12.dex */
public abstract class B<T extends e> extends FrameLayout implements j, InterfaceC5050b, InterfaceC5049a, k {

    @NotNull
    public static final a g = new a(null);
    public static final int h = 8;

    @NotNull
    public static final String i = "XenossBannerView";

    @NotNull
    public final CoroutineScope a;

    @Nullable
    public T b;

    @Nullable
    public View c;

    @NotNull
    public final Lazy d;

    @NotNull
    public final MutableStateFlow e;

    @NotNull
    public final Lazy f;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.XenossBannerView$isAdDisplaying$2$1", f = "XenossBannerView.kt", l = {}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements Function3 {
        public int a;
        public /* synthetic */ boolean b;
        public /* synthetic */ boolean c;

        public b(Continuation continuation) {
            super(3, continuation);
        }

        public final Object a(boolean z, boolean z2, Continuation continuation) {
            b bVar = new b(continuation);
            bVar.b = z;
            bVar.c = z2;
            return bVar.invokeSuspend(Unit.INSTANCE);
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
            return Boxing.boxBoolean(this.b && this.c);
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.XenossBannerView$load$1", f = "XenossBannerView.kt", l = {70}, m = "invokeSuspend")
    public static final class c extends SuspendLambda implements Function2 {
        public int a;
        public final /* synthetic */ B<T> b;
        public final /* synthetic */ long c;
        public final /* synthetic */ InterfaceC5050b.a d;

        @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.XenossBannerView$load$1$1", f = "XenossBannerView.kt", l = {}, m = "invokeSuspend")
        public static final class a extends SuspendLambda implements Function2 {
            public int a;
            public /* synthetic */ boolean b;

            public a(Continuation continuation) {
                super(2, continuation);
            }

            public final Object a(boolean z, Continuation continuation) {
                return ((a) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                a aVar = new a(continuation);
                aVar.b = ((Boolean) obj).booleanValue();
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return a(((Boolean) obj).booleanValue(), (Continuation) obj2);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Boxing.boxBoolean(this.b);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(B<T> b, long j, InterfaceC5050b.a aVar, Continuation continuation) {
            super(2, continuation);
            this.b = b;
            this.c = j;
            this.d = aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new c(this.b, this.c, this.d, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.b.getAdLoader().a(this.c, this.d);
                StateFlow isLoaded = this.b.isLoaded();
                a aVar = new a(null);
                this.a = 1;
                if (FlowKt.first(isLoaded, aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            this.b.k();
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(@NotNull Context context, @NotNull CoroutineScope scope) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.a = scope;
        this.d = LazyKt.lazy(new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                return B.b(B.this);
            }
        });
        this.e = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        this.f = LazyKt.lazy(new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                return B.a(B.this);
            }
        });
    }

    public static final StateFlow b(B b2) {
        return b2.getAdLoader().isLoaded();
    }

    @VisibleForTesting
    public static /* synthetic */ void getAdView$annotations() {
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC5050b
    public void a(long j, @Nullable InterfaceC5050b.a aVar) {
        BuildersKt__Builders_commonKt.launch$default(this.a, null, null, new c(this, j, aVar, null), 3, null);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k
    public void destroy() {
        CoroutineScopeKt.cancel$default(this.a, null, 1, null);
        setAdView(null);
        ViewParent parent = getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.D, this, me);
        return super.dispatchTouchEvent(me);
    }

    @NotNull
    public abstract InterfaceC5050b getAdLoader();

    @Nullable
    public T getAdShowListener() {
        return this.b;
    }

    @Nullable
    public final View getAdView() {
        return this.c;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC5050b
    @NotNull
    public StateFlow isLoaded() {
        return (StateFlow) this.d.getValue();
    }

    public abstract void k();

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC5049a
    @NotNull
    public StateFlow l() {
        return (StateFlow) this.f.getValue();
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    @Override // android.view.View
    public void onVisibilityChanged(@NotNull View changedView, int i2) {
        Intrinsics.checkNotNullParameter(changedView, "changedView");
        super.onVisibilityChanged(changedView, i2);
        this.e.setValue(Boolean.valueOf(i2 == 0));
    }

    public void setAdShowListener(@Nullable T t) {
        this.b = t;
    }

    public final void setAdView(@Nullable View view) {
        View view2 = this.c;
        this.c = view;
        removeAllViews();
        try {
            ComposeView composeView = view2 instanceof ComposeView ? (ComposeView) view2 : null;
            if (composeView != null) {
                composeView.disposeComposition();
            }
        } catch (ClassNotFoundException e) {
            MolocoLogger.warn$default(MolocoLogger.INSTANCE, i, "Compose not available, skipping ComposeView disposeComposition", e, false, 8, null);
        } catch (NoClassDefFoundError e2) {
            MolocoLogger.warn$default(MolocoLogger.INSTANCE, i, "Compose not available, skipping ComposeView disposeComposition", e2, false, 8, null);
        }
        if (view != null) {
            addView(view, new ViewGroup.LayoutParams(-1, -1));
        }
    }

    public static final StateFlow a(B b2) {
        return FlowKt.stateIn(FlowKt.flowCombine(b2.isLoaded(), b2.e, new b(null)), b2.a, SharingStarted.Companion.getEagerly(), Boolean.FALSE);
    }
}
