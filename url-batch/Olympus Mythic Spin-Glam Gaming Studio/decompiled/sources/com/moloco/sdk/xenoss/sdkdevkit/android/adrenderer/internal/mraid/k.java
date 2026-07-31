package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid;

import android.webkit.WebView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.n;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference0Impl;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
/* loaded from: classes11.dex */
public final class k implements j {
    public static final int j = 8;
    public final boolean a;

    @NotNull
    public Function0 b;

    @NotNull
    public final CoroutineScope c;

    @NotNull
    public final WebView d;

    @Nullable
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.k e;

    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.d f;

    @NotNull
    public final MutableSharedFlow g;

    @NotNull
    public final SharedFlow h;

    @NotNull
    public final StateFlow i;

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.MraidFullscreenContentControllerImpl$onEvent$1", f = "MraidFullscreenContentController.kt", l = {106}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements Function2 {
        public int a;
        public final /* synthetic */ l c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(l lVar, Continuation continuation) {
            super(2, continuation);
            this.c = lVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return k.this.new a(this.c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MutableSharedFlow mutableSharedFlow = k.this.g;
                l lVar = this.c;
                this.a = 1;
                if (mutableSharedFlow.emit(lVar, this) == coroutine_suspended) {
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

    public static final class b implements Flow {
        public final /* synthetic */ Flow a;

        public static final class a<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector a;

            @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.MraidFullscreenContentControllerImpl$special$$inlined$mapNotNull$1$2", f = "MraidFullscreenContentController.kt", l = {52}, m = "emit")
            /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.k$b$a$a, reason: collision with other inner class name */
            public static final class C1592a extends ContinuationImpl {
                public /* synthetic */ Object a;
                public int b;
                public Object c;

                public C1592a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(FlowCollector flowCollector) {
                this.a = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) {
                C1592a c1592a;
                int i;
                if (continuation instanceof C1592a) {
                    c1592a = (C1592a) continuation;
                    int i2 = c1592a.b;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        c1592a.b = i2 - Integer.MIN_VALUE;
                        Object obj2 = c1592a.a;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i = c1592a.b;
                        if (i != 0) {
                            ResultKt.throwOnFailure(obj2);
                            FlowCollector flowCollector = this.a;
                            n nVar = (n) obj;
                            n.f fVar = nVar instanceof n.f ? (n.f) nVar : null;
                            if (fVar != null) {
                                c1592a.b = 1;
                                if (flowCollector.emit(fVar, c1592a) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                        } else {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj2);
                        }
                        return Unit.INSTANCE;
                    }
                }
                c1592a = new C1592a(continuation);
                Object obj22 = c1592a.a;
                Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c1592a.b;
                if (i != 0) {
                }
                return Unit.INSTANCE;
            }
        }

        public b(Flow flow) {
            this.a = flow;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector flowCollector, Continuation continuation) {
            Object collect = this.a.collect(new a(flowCollector), continuation);
            return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
        }
    }

    public /* synthetic */ k(boolean z, Function0 function0, CoroutineScope coroutineScope, int i, WebView webView, SharedFlow sharedFlow, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.k kVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, function0, coroutineScope, i, webView, sharedFlow, kVar);
    }

    public static Object b(k kVar) {
        return Reflection.property0(new PropertyReference0Impl(kVar.f, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.d.class, "goNextAction", "getGoNextAction()Lkotlinx/coroutines/flow/StateFlow;", 0));
    }

    public static final Unit p() {
        return Unit.INSTANCE;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.j
    public void B() {
        a(l.a);
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.k E = E();
        if (E != null) {
            E.c("");
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.j
    @Nullable
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.k E() {
        return this.e;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.b
    public boolean J() {
        return this.a;
    }

    @NotNull
    public final Function0 S() {
        return this.b;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.j
    @NotNull
    /* renamed from: T, reason: merged with bridge method [inline-methods] */
    public SharedFlow a() {
        return this.h;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.j
    @NotNull
    public WebView c() {
        return this.d;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k
    public void destroy() {
        this.b.mo4828invoke();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.j
    @NotNull
    public StateFlow e() {
        return this.i;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.d
    @NotNull
    public StateFlow l() {
        return this.f.l();
    }

    public k(boolean z, Function0 closeFullscreenAdRepresentation, CoroutineScope scope, int i, WebView webView, SharedFlow mraidJsCommands, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.k kVar) {
        Intrinsics.checkNotNullParameter(closeFullscreenAdRepresentation, "closeFullscreenAdRepresentation");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(webView, "webView");
        Intrinsics.checkNotNullParameter(mraidJsCommands, "mraidJsCommands");
        this.a = z;
        this.b = closeFullscreenAdRepresentation;
        this.c = scope;
        this.d = webView;
        this.e = kVar;
        this.f = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.f.a(i, scope);
        MutableSharedFlow MutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.g = MutableSharedFlow$default;
        this.h = MutableSharedFlow$default;
        this.i = FlowKt.stateIn(new b(mraidJsCommands), scope, SharingStarted.Companion.getEagerly(), null);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.b
    public void b(@NotNull a.AbstractC1677a.f position) {
        Intrinsics.checkNotNullParameter(position, "position");
        a(l.b);
    }

    public final void a(@NotNull Function0 function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.b = function0;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.j
    public void a(@Nullable com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.k kVar) {
        this.e = kVar;
    }

    public final Job a(l lVar) {
        Job launch$default;
        launch$default = BuildersKt__Builders_commonKt.launch$default(this.c, null, null, new a(lVar, null), 3, null);
        return launch$default;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.j
    public void a(@NotNull String clickThroughUrl, @NotNull a.AbstractC1677a.f position) {
        Intrinsics.checkNotNullParameter(clickThroughUrl, "clickThroughUrl");
        Intrinsics.checkNotNullParameter(position, "position");
        b(position);
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.k E = E();
        if (E != null) {
            E.a(clickThroughUrl);
        }
    }

    public /* synthetic */ k(boolean z, Function0 function0, CoroutineScope coroutineScope, int i, WebView webView, SharedFlow sharedFlow, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.k kVar, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i2 & 2) != 0 ? new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.k$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                return k.p();
            }
        } : function0, coroutineScope, i, webView, sharedFlow, (i2 & 64) != 0 ? null : kVar, null);
    }
}
