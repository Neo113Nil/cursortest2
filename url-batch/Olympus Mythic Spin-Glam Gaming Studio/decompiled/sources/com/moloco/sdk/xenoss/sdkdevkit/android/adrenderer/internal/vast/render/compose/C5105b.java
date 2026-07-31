package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.Logger;
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
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@SuppressLint({"ViewConstructor"})
/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.b, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C5105b extends FrameLayout {

    @NotNull
    public static final a f = new a(null);
    public static final int g = 8;

    @NotNull
    public static final CoroutineContext h = com.moloco.sdk.internal.scheduling.b.a().getMain();

    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.h a;

    @Nullable
    public final Function0 b;

    @Nullable
    public CoroutineScope c;

    @Nullable
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j d;

    @NotNull
    public final GestureDetector e;

    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.b$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final CoroutineContext a() {
            return C5105b.h;
        }

        public a() {
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.CompanionView$onAttachedToWindow$1", f = "Companion.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.b$b, reason: collision with other inner class name */
    public static final class C1652b extends SuspendLambda implements Function2 {
        public int a;

        public C1652b(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C1652b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return C5105b.this.new C1652b(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            C5105b.this.a.b();
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.CompanionView$onAttachedToWindow$2", f = "Companion.kt", l = {151}, m = "invokeSuspend")
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.b$c */
    public static final class c extends SuspendLambda implements Function2 {
        public int a;

        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.b$c$a */
        public static final class a<T> implements FlowCollector {
            public final /* synthetic */ C5105b a;

            public a(C5105b c5105b) {
                this.a = c5105b;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j jVar, Continuation continuation) {
                this.a.d = jVar;
                this.a.a(jVar);
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
            return C5105b.this.new c(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow K = C5105b.this.a.K();
                a aVar = new a(C5105b.this);
                this.a = 1;
                if (K.collect(aVar, this) == coroutine_suspended) {
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
    public C5105b(@NotNull Context context, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.h viewModel, @Nullable Function0 function0) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        this.a = viewModel;
        this.b = function0;
        this.e = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.b.a(context, new Function2() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.b$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return C5105b.a(C5105b.this, (a.AbstractC1677a.f) obj, (a.AbstractC1677a.f) obj2);
            }
        });
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(@NotNull MotionEvent motionEvent) {
        Logger.d("MolocoAds|SafeDK: Execution> Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/b;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z");
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.D, this, motionEvent);
        return safedk_b_dispatchTouchEvent_c736b7206880d4b952453387447e0afd(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        CompletableJob Job$default;
        super.onAttachedToWindow();
        Job$default = JobKt__JobKt.Job$default(null, 1, null);
        CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(Job$default.plus(h));
        this.c = CoroutineScope;
        BuildersKt__Builders_commonKt.launch$default(CoroutineScope, null, null, new C1652b(null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(CoroutineScope, null, null, new c(null), 3, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        CoroutineScope coroutineScope = this.c;
        if (coroutineScope != null) {
            CoroutineScopeKt.cancel$default(coroutineScope, null, 1, null);
        }
        this.c = null;
        this.a.y();
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public boolean safedk_b_dispatchTouchEvent_c736b7206880d4b952453387447e0afd(MotionEvent ev) {
        Intrinsics.checkNotNullParameter(ev, "ev");
        this.e.onTouchEvent(ev);
        super.dispatchTouchEvent(ev);
        return true;
    }

    public static final Unit a(C5105b c5105b, a.AbstractC1677a.f firstTap, a.AbstractC1677a.f fVar) {
        Intrinsics.checkNotNullParameter(firstTap, "firstTap");
        Intrinsics.checkNotNullParameter(fVar, "<unused var>");
        c5105b.a.a(firstTap);
        if (c5105b.d instanceof j.b) {
            Function0 function0 = c5105b.b;
            if (function0 != null) {
                function0.mo4828invoke();
            } else {
                c5105b.a.b(firstTap);
            }
        }
        return Unit.INSTANCE;
    }

    public final void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j jVar) {
        removeAllViews();
        if (jVar instanceof j.a) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            View a2 = z.a(context, (j.a) jVar);
            if (a2 != null) {
                addView(a2, new FrameLayout.LayoutParams(-1, -1));
                return;
            }
            return;
        }
        if (!(jVar instanceof j.b)) {
            if (jVar != null) {
                throw new NoWhenBranchMatchedException();
            }
            return;
        }
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        ImageView a3 = A.a(context2, (j.b) jVar);
        a3.setLayoutParams(new FrameLayout.LayoutParams(a3.getLayoutParams().width, a3.getLayoutParams().height, 17));
        addView(a3);
    }
}
