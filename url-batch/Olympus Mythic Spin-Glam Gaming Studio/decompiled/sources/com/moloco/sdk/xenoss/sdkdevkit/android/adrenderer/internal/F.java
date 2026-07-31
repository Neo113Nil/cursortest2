package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import androidx.annotation.VisibleForTesting;
import androidx.compose.runtime.internal.StabilityInferred;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import kotlin.KotlinNothingValueException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@SuppressLint({"ViewConstructor"})
/* loaded from: classes3.dex */
public final class F extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e> {
    public static final int r = 8;

    @NotNull
    public final Context j;

    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y k;

    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.a l;

    @NotNull
    public final E m;

    @NotNull
    public final CoroutineScope n;

    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.d o;

    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i p;

    @NotNull
    public final Lazy q;

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.StaticBannerView$isAdDisplaying$2$1", f = "StaticBanner.kt", l = {}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements Function3 {
        public int a;
        public /* synthetic */ boolean b;
        public /* synthetic */ boolean c;

        public a(Continuation continuation) {
            super(3, continuation);
        }

        public final Object a(boolean z, boolean z2, Continuation continuation) {
            a aVar = new a(continuation);
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
            return Boxing.boxBoolean(this.b && this.c);
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.StaticBannerView$prepareAdViewForDisplay$1", f = "StaticBanner.kt", l = {}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements Function2 {
        public int a;
        public /* synthetic */ Object b;

        @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.StaticBannerView$prepareAdViewForDisplay$1$1", f = "StaticBanner.kt", l = {50}, m = "invokeSuspend")
        public static final class a extends SuspendLambda implements Function2 {
            public int a;
            public final /* synthetic */ F b;

            @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.StaticBannerView$prepareAdViewForDisplay$1$1$error$1", f = "StaticBanner.kt", l = {}, m = "invokeSuspend")
            /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.F$b$a$a, reason: collision with other inner class name */
            public static final class C1566a extends SuspendLambda implements Function2 {
                public int a;
                public /* synthetic */ Object b;

                public C1566a(Continuation continuation) {
                    super(2, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.g gVar, Continuation continuation) {
                    return ((C1566a) create(gVar, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    C1566a c1566a = new C1566a(continuation);
                    c1566a.b = obj;
                    return c1566a;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Boxing.boxBoolean(((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.g) this.b) != null);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(F f, Continuation continuation) {
                super(2, continuation);
                this.b = f;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new a(this.b, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e adShowListener;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    StateFlow unrecoverableError = this.b.l.getUnrecoverableError();
                    C1566a c1566a = new C1566a(null);
                    this.a = 1;
                    obj = FlowKt.first(unrecoverableError, c1566a, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.g gVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.g) obj;
                if (gVar != null && (adShowListener = this.b.getAdShowListener()) != null) {
                    adShowListener.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.h.a(gVar));
                }
                return Unit.INSTANCE;
            }
        }

        @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.StaticBannerView$prepareAdViewForDisplay$1$2", f = "StaticBanner.kt", l = {56}, m = "invokeSuspend")
        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.F$b$b, reason: collision with other inner class name */
        public static final class C1567b extends SuspendLambda implements Function2 {
            public int a;
            public final /* synthetic */ F b;

            /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.F$b$b$a */
            public static final class a<T> implements FlowCollector {
                public final /* synthetic */ F a;

                public a(F f) {
                    this.a = f;
                }

                @Override // kotlinx.coroutines.flow.FlowCollector
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object emit(Unit unit, Continuation continuation) {
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e adShowListener = this.a.getAdShowListener();
                    if (adShowListener != null) {
                        adShowListener.b();
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1567b(F f, Continuation continuation) {
                super(2, continuation);
                this.b = f;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((C1567b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new C1567b(this.b, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    SharedFlow clickthroughEvent = this.b.l.getClickthroughEvent();
                    a aVar = new a(this.b);
                    this.a = 1;
                    if (clickthroughEvent.collect(aVar, this) == coroutine_suspended) {
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
            b bVar = F.this.new b(continuation);
            bVar.b = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.b;
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new a(F.this, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C1567b(F.this, null), 3, null);
            F f = F.this;
            FrameLayout a2 = f.o.a(F.this.j, F.this.l);
            F.this.getWatermark().a(a2);
            f.setAdView(a2);
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ F(Context context, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y yVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.a aVar, E e, CoroutineScope coroutineScope, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.d dVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, yVar, aVar, e, coroutineScope, (i & 32) != 0 ? new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.d() : dVar);
    }

    public static final StateFlow d(F f) {
        return FlowKt.stateIn(FlowKt.flowCombine(super.l(), f.l.c(), new a(null)), f.n, SharingStarted.Companion.getEagerly(), Boolean.FALSE);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k
    public void destroy() {
        super.destroy();
        this.l.destroy();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.D, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.j
    @NotNull
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i getCreativeType() {
        return this.p;
    }

    @VisibleForTesting
    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y getWatermark() {
        return this.k;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B
    public void k() {
        BuildersKt.launch(this.n, EmptyCoroutineContext.INSTANCE, CoroutineStart.DEFAULT, new b(null));
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC5049a
    @NotNull
    public StateFlow l() {
        return (StateFlow) this.q.getValue();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B
    @NotNull
    public E getAdLoader() {
        return this.m;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(@NotNull Context context, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y watermark, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.a staticWebView, @NotNull E adLoader, @NotNull CoroutineScope scope, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.d webViewWrapper) {
        super(context, scope);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(watermark, "watermark");
        Intrinsics.checkNotNullParameter(staticWebView, "staticWebView");
        Intrinsics.checkNotNullParameter(adLoader, "adLoader");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(webViewWrapper, "webViewWrapper");
        this.j = context;
        this.k = watermark;
        this.l = staticWebView;
        this.m = adLoader;
        this.n = scope;
        this.o = webViewWrapper;
        setTag("MolocoStaticBannerView");
        this.p = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i.c;
        this.q = LazyKt.lazy(new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.F$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                return F.d(F.this);
            }
        });
    }
}
