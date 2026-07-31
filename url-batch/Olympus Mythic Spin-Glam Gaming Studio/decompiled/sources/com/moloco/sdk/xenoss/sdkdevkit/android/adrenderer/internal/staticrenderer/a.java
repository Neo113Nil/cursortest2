package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.MotionEvent;
import android.webkit.WebSettings;
import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.services.s;
import com.moloco.sdk.internal.x;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C5054d;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C5055e;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.g;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.h;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@SuppressLint({"SetJavaScriptEnabled", "ViewConstructor"})
/* loaded from: classes13.dex */
public final class a extends C5054d implements g {
    public static final int k = 8;

    @NotNull
    public final CoroutineScope c;

    @NotNull
    public final s d;

    @NotNull
    public final h e;
    public final boolean f;

    @NotNull
    public final c g;

    @NotNull
    public final StateFlow h;

    @NotNull
    public final SharedFlow i;

    @NotNull
    public final StateFlow j;

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.StaticWebView$loadHtml$2", f = "StaticWebView.kt", l = {113}, m = "invokeSuspend")
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.a$a, reason: collision with other inner class name */
    public static final class C1597a extends SuspendLambda implements Function2 {
        public int a;
        public final /* synthetic */ String c;
        public final /* synthetic */ long d;

        @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.StaticWebView$loadHtml$2$isLoadOperationTimedOut$1", f = "StaticWebView.kt", l = {Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE}, m = "invokeSuspend")
        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.a$a$a, reason: collision with other inner class name */
        public static final class C1598a extends SuspendLambda implements Function2 {
            public int a;
            public final /* synthetic */ a b;

            @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.StaticWebView$loadHtml$2$isLoadOperationTimedOut$1$1", f = "StaticWebView.kt", l = {}, m = "invokeSuspend")
            /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.a$a$a$a, reason: collision with other inner class name */
            public static final class C1599a extends SuspendLambda implements Function3 {
                public int a;
                public /* synthetic */ boolean b;
                public /* synthetic */ Object c;

                public C1599a(Continuation continuation) {
                    super(3, continuation);
                }

                public final Object a(boolean z, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.g gVar, Continuation continuation) {
                    C1599a c1599a = new C1599a(continuation);
                    c1599a.b = z;
                    c1599a.c = gVar;
                    return c1599a.invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    return a(((Boolean) obj).booleanValue(), (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.g) obj2, (Continuation) obj3);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    boolean z = this.b;
                    return TuplesKt.to(Boxing.boxBoolean(z), (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.g) this.c);
                }
            }

            @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.StaticWebView$loadHtml$2$isLoadOperationTimedOut$1$2", f = "StaticWebView.kt", l = {}, m = "invokeSuspend")
            /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.a$a$a$b */
            public static final class b extends SuspendLambda implements Function2 {
                public int a;
                public /* synthetic */ Object b;

                public b(Continuation continuation) {
                    super(2, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(Pair<Boolean, ? extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.g> pair, Continuation continuation) {
                    return ((b) create(pair, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    b bVar = new b(continuation);
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
                    Pair pair = (Pair) this.b;
                    return Boxing.boxBoolean(((Boolean) pair.component1()).booleanValue() || ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.g) pair.component2()) != null);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1598a(a aVar, Continuation continuation) {
                super(2, continuation);
                this.b = aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((C1598a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new C1598a(this.b, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowCombine = FlowKt.flowCombine(this.b.g.m(), this.b.g.l(), new C1599a(null));
                    b bVar = new b(null);
                    this.a = 1;
                    obj = FlowKt.first(flowCombine, bVar, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return obj;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1597a(String str, long j, Continuation continuation) {
            super(2, continuation);
            this.c = str;
            this.d = j;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C1597a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return a.this.new C1597a(this.c, this.d, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                try {
                    a aVar = a.this;
                    C5055e.a(aVar, aVar.getHtmlCssFixer().a(this.c));
                    long j = this.d;
                    C1598a c1598a = new C1598a(a.this, null);
                    this.a = 1;
                    obj = TimeoutKt.m8206withTimeoutOrNullKLykuaI(j, c1598a, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } catch (Exception e) {
                    MolocoLogger.error$default(MolocoLogger.INSTANCE, b.a, "loadHtml", e, false, 8, null);
                    return new x.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.g.b);
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            if (obj == null) {
                a.this.g.c();
            }
            boolean booleanValue = ((Boolean) a.this.g.m().getValue()).booleanValue();
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.g gVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.g) a.this.g.l().getValue();
            return gVar != null ? new x.a(gVar) : booleanValue ? new x.b(Unit.INSTANCE) : new x.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.g.a);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ a(Context context, CoroutineScope coroutineScope, s sVar, h hVar, boolean z, c cVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, r2, sVar, hVar, (i & 16) != 0 ? false : z, (i & 32) != 0 ? new c(r2, sVar, hVar) : cVar);
        CoroutineScope CoroutineScope = (i & 2) != 0 ? CoroutineScopeKt.CoroutineScope(com.moloco.sdk.internal.scheduling.b.a().getMain()) : coroutineScope;
    }

    @NotNull
    public final StateFlow c() {
        return this.j;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C5054d, android.webkit.WebView
    public void destroy() {
        super.destroy();
        CoroutineScopeKt.cancel$default(this.c, null, 1, null);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C5054d, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.D, this, me);
        return super.dispatchTouchEvent(me);
    }

    @NotNull
    public final SharedFlow getClickthroughEvent() {
        return this.i;
    }

    @NotNull
    public final StateFlow getUnrecoverableError() {
        return this.h;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C5054d, android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    @Override // android.webkit.WebView, android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(@NotNull MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (this.f) {
            return false;
        }
        if (event.getAction() == 0) {
            int[] iArr = new int[2];
            getLocationOnScreen(iArr);
            this.g.a(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.model.a(ArraysKt.first(iArr), ArraysKt.last(iArr), getHeight(), getWidth(), (int) (event.getX() + ArraysKt.first(iArr)), (int) (event.getY() + ArraysKt.last(iArr))));
        }
        return super.onTouchEvent(event);
    }

    @Nullable
    public final Object a(@NotNull String str, long j, @NotNull Continuation continuation) {
        return BuildersKt.withContext(com.moloco.sdk.internal.scheduling.b.a().getMain(), new C1597a(str, j, null), continuation);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.g
    public void a(@NotNull a.AbstractC1677a.c button) {
        Intrinsics.checkNotNullParameter(button, "button");
        this.g.a(button);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.g
    public void a(@NotNull a.AbstractC1677a.c.EnumC1679a buttonType) {
        Intrinsics.checkNotNullParameter(buttonType, "buttonType");
        this.g.a(buttonType);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(@NotNull Context context, @NotNull CoroutineScope scope, @NotNull s clickthroughService, @NotNull h buttonTracker, boolean z, @NotNull c webViewClientImpl) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(clickthroughService, "clickthroughService");
        Intrinsics.checkNotNullParameter(buttonTracker, "buttonTracker");
        Intrinsics.checkNotNullParameter(webViewClientImpl, "webViewClientImpl");
        this.c = scope;
        this.d = clickthroughService;
        this.e = buttonTracker;
        this.f = z;
        this.g = webViewClientImpl;
        setWebViewClient(webViewClientImpl);
        setScrollBarStyle(0);
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        WebSettings settings = getSettings();
        settings.setSupportZoom(false);
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setAllowFileAccess(false);
        settings.setAllowContentAccess(false);
        setBackgroundColor(0);
        setVisibility(8);
        this.h = webViewClientImpl.l();
        this.i = webViewClientImpl.f();
        this.j = webViewClientImpl.o();
    }
}
