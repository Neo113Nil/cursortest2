package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose;

import android.content.Context;
import android.content.res.TypedArray;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;
import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.R;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i;
import com.pubmatic.sdk.common.POBCommonConstants;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
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
import kotlin.jvm.internal.FunctionReferenceImpl;
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
/* loaded from: classes8.dex */
public final class q extends FrameLayout {

    @NotNull
    public static final a l = new a(null);
    public static final int m = 8;

    @NotNull
    public static final CoroutineContext n = com.moloco.sdk.internal.scheduling.b.a().getMain();

    @NotNull
    public final Flow a;

    @NotNull
    public final Flow b;
    public final int c;

    @Nullable
    public Function1 d;

    @Nullable
    public Function0 e;

    @NotNull
    public final View f;

    @NotNull
    public final View g;
    public final long h;
    public boolean i;

    @NotNull
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i j;

    @Nullable
    public CoroutineScope k;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final CoroutineContext a() {
            return q.n;
        }

        public a() {
        }
    }

    public /* synthetic */ class b extends FunctionReferenceImpl implements Function0 {
        public b(Object obj) {
            super(0, obj, q.class, "handleTap", "handleTap()V", 0);
        }

        public final void a() {
            ((q) this.receiver).b();
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo4828invoke() {
            a();
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.PlaybackControlView$onAttachedToWindow$1", f = "PlaybackControl.kt", l = {244}, m = "invokeSuspend")
    public static final class c extends SuspendLambda implements Function2 {
        public int a;

        public static final class a<T> implements FlowCollector {
            public final /* synthetic */ q a;

            public a(q qVar) {
                this.a = qVar;
            }

            public final Object a(boolean z, Continuation continuation) {
                this.a.i = z;
                this.a.a(z);
                return Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return a(((Boolean) obj).booleanValue(), continuation);
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
            return q.this.new c(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flow = q.this.a;
                a aVar = new a(q.this);
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

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.PlaybackControlView$onAttachedToWindow$2", f = "PlaybackControl.kt", l = {POBCommonConstants.DEFAULT_MIN_BITRATE}, m = "invokeSuspend")
    public static final class d extends SuspendLambda implements Function2 {
        public int a;

        public static final class a<T> implements FlowCollector {
            public final /* synthetic */ q a;

            public a(q qVar) {
                this.a = qVar;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i iVar, Continuation continuation) {
                this.a.j = iVar;
                return Unit.INSTANCE;
            }
        }

        public d(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return q.this.new d(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flow = q.this.b;
                a aVar = new a(q.this);
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

    public /* synthetic */ q(Context context, Flow flow, Flow flow2, int i, int i2, Integer num, Integer num2, String str, String str2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, flow, flow2, (i3 & 8) != 0 ? com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.theme.b.a(context) : i, (i3 & 16) != 0 ? 81 : i2, (i3 & 32) != 0 ? null : num, (i3 & 64) != 0 ? null : num2, (i3 & 128) != 0 ? null : str, (i3 & 256) != 0 ? null : str2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.D, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Nullable
    public final Function1 getOnShouldPlay() {
        return this.d;
    }

    @Nullable
    public final Function0 getOnShouldReplay() {
        return this.e;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        CompletableJob Job$default;
        super.onAttachedToWindow();
        Job$default = JobKt__JobKt.Job$default(null, 1, null);
        CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(Job$default.plus(n));
        this.k = CoroutineScope;
        BuildersKt__Builders_commonKt.launch$default(CoroutineScope, null, null, new c(null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(CoroutineScope, null, null, new d(null), 3, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        CoroutineScope coroutineScope = this.k;
        if (coroutineScope != null) {
            CoroutineScopeKt.cancel$default(coroutineScope, null, 1, null);
        }
        this.k = null;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public final void setOnShouldPlay(@Nullable Function1 function1) {
        this.d = function1;
    }

    public final void setOnShouldReplay(@Nullable Function0 function0) {
        this.e = function0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(@NotNull Context context, @NotNull Flow isPlaying, @NotNull Flow progress, @ColorInt int i, int i2, @DrawableRes @Nullable Integer num, @DrawableRes @Nullable Integer num2, @Nullable String str, @Nullable String str2) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(isPlaying, "isPlaying");
        Intrinsics.checkNotNullParameter(progress, "progress");
        this.a = isPlaying;
        this.b = progress;
        this.c = i2;
        this.h = getResources().getInteger(R.integer.moloco_playback_control_fade_duration_ms);
        this.j = i.b.b;
        setLayoutParams(new FrameLayout.LayoutParams(-1, -2, i2));
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.moloco_playback_control_padding);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.moloco_playback_control_horizontal_padding);
        boolean z = (num == null || num2 == null) ? false : true;
        if (z) {
            Intrinsics.checkNotNull(num);
            this.f = a(num.intValue(), i, str);
            Intrinsics.checkNotNull(num2);
            this.g = a(num2.intValue(), i, str);
        } else {
            this.f = a(R.string.moloco_playback_control_play, i, dimensionPixelSize2, dimensionPixelSize);
            this.g = a(R.string.moloco_playback_control_pause, i, dimensionPixelSize2, dimensionPixelSize);
        }
        this.g.setAlpha(0.0f);
        addView(this.f, a(z, this, dimensionPixelSize));
        addView(this.g, a(z, this, dimensionPixelSize));
        if (str2 != null) {
            setContentDescription(str2);
            setTag(str2);
        }
    }

    public final void b() {
        if (this.j instanceof i.a) {
            Function0 function0 = this.e;
            if (function0 != null) {
                function0.mo4828invoke();
                return;
            }
            return;
        }
        Function1 function1 = this.d;
        if (function1 != null) {
            function1.invoke(Boolean.valueOf(!this.i));
        }
    }

    public static final FrameLayout.LayoutParams a(boolean z, q qVar, int i) {
        if (z) {
            int dimensionPixelSize = qVar.getResources().getDimensionPixelSize(R.dimen.moloco_default_button_size);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize, 81);
            layoutParams.setMargins(i, i, i, i);
            return layoutParams;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2, 81);
        layoutParams2.setMargins(i, i, i, i);
        return layoutParams2;
    }

    public final TextView a(@StringRes int i, @ColorInt int i2, int i3, int i4) {
        TextView textView = new TextView(getContext());
        textView.setText(textView.getContext().getString(i));
        textView.setAllCaps(true);
        textView.setTextColor(i2);
        textView.setPadding(i3, i4, i3, i4);
        a(textView);
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.q$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                q.a(q.this, view);
            }
        });
        return textView;
    }

    public static final void a(q qVar, View view) {
        qVar.b();
    }

    public final ImageView a(@DrawableRes int i, @ColorInt int i2, String str) {
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.moloco_default_button_size);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.u.a(context, i, i2, dimensionPixelSize, dimensionPixelSize, false, str, null, new b(this), 32, null);
    }

    public final void a(View view) {
        view.setClickable(true);
        view.setFocusable(true);
        TypedArray obtainStyledAttributes = view.getContext().obtainStyledAttributes(new int[]{android.R.attr.selectableItemBackground});
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
        view.setBackground(obtainStyledAttributes.getDrawable(0));
        obtainStyledAttributes.recycle();
    }

    public final void a(boolean z) {
        View view = z ? this.g : this.f;
        View view2 = z ? this.f : this.g;
        view.bringToFront();
        view.animate().alpha(1.0f).setDuration(this.h).start();
        view2.animate().alpha(0.0f).setDuration(this.h).start();
    }
}
