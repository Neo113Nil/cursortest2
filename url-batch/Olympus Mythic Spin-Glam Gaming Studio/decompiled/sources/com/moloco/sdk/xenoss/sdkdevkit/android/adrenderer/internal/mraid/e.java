package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.x;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.n;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.u;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
/* loaded from: classes9.dex */
public class e implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k {
    public static final int n = 8;

    @NotNull
    public final String a;

    @NotNull
    public final r b;

    @NotNull
    public Function0 c;

    @NotNull
    public Function1 d;

    @NotNull
    public Function1 e;

    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r f;
    public final boolean g;

    @NotNull
    public final f h;

    @NotNull
    public final String i;

    @NotNull
    public final CoroutineScope j;
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.c k;

    @Nullable
    public t l;

    @NotNull
    public final u m;

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.MraidBaseAd$loadAndReadyMraid$2", f = "MraidBaseAd.kt", l = {172}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements Function2 {
        public int a;

        public a(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return e.this.new a(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.c cVar;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                f I = e.this.I();
                String str = e.this.a;
                this.a = 1;
                obj = I.a(str, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            x xVar = (x) obj;
            boolean z = xVar instanceof x.a;
            if (z) {
                return xVar;
            }
            f I2 = e.this.I();
            e eVar = e.this;
            I2.a(false, false, false, false, true);
            I2.a(eVar.b);
            I2.a(((Boolean) eVar.m.l().getValue()).booleanValue());
            I2.a(((u.a) eVar.m.k().getValue()).a());
            eVar.b(t.c);
            eVar.W();
            eVar.X();
            eVar.Y();
            I2.j();
            e eVar2 = e.this;
            if (xVar instanceof x.b) {
                MolocoLogger.info$default(MolocoLogger.INSTANCE, eVar2.i, "Mraid Html data successfully loaded", null, false, 12, null);
                cVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.c) ((x.b) xVar).a();
            } else {
                if (!z) {
                    throw new NoWhenBranchMatchedException();
                }
                MolocoLogger.error$default(MolocoLogger.INSTANCE, eVar2.i, "Mraid Html data load failed.", null, false, 12, null);
                cVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.c(null, 1, null);
            }
            eVar2.k = cVar;
            return xVar;
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.MraidBaseAd$startListeningToErrors$1", f = "MraidBaseAd.kt", l = {60}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements Function2 {
        public int a;

        public /* synthetic */ class a {
            public static final /* synthetic */ int[] a;

            static {
                int[] iArr = new int[r.values().length];
                try {
                    iArr[r.c.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[r.b.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                a = iArr;
            }
        }

        @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.MraidBaseAd$startListeningToErrors$1$error$1", f = "MraidBaseAd.kt", l = {}, m = "invokeSuspend")
        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.e$b$b, reason: collision with other inner class name */
        public static final class C1590b extends SuspendLambda implements Function2 {
            public int a;
            public /* synthetic */ Object b;

            public C1590b(Continuation continuation) {
                super(2, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d dVar, Continuation continuation) {
                return ((C1590b) create(dVar, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                C1590b c1590b = new C1590b(continuation);
                c1590b.b = obj;
                return c1590b;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Boxing.boxBoolean(((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d) this.b) != null);
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
            return e.this.new b(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow w = e.this.I().w();
                C1590b c1590b = new C1590b(null);
                this.a = 1;
                obj = FlowKt.first(w, c1590b, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d dVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d) obj;
            if (dVar != null) {
                e eVar = e.this;
                int i2 = a.a[eVar.b.ordinal()];
                if (i2 == 1) {
                    eVar.S().invoke(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.e.b(dVar));
                } else {
                    if (i2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    eVar.S().invoke(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.e.a(dVar));
                }
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.MraidBaseAd$startListeningToMraidJsCommands$1", f = "MraidBaseAd.kt", l = {}, m = "invokeSuspend")
    public static final class c extends SuspendLambda implements Function2 {
        public int a;
        public /* synthetic */ Object b;

        public c(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(n nVar, Continuation continuation) {
            return ((c) create(nVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            c cVar = e.this.new c(continuation);
            cVar.b = obj;
            return cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            n nVar = (n) this.b;
            if (Intrinsics.areEqual(nVar, n.a.i)) {
                e.this.U();
            } else if (nVar instanceof n.d) {
                e.this.a((n.d) nVar);
            } else if (!(nVar instanceof n.f)) {
                if (nVar instanceof n.c) {
                    e.this.a((n.c) nVar);
                } else {
                    e.this.I().a(nVar, "unsupported command: " + nVar.a());
                }
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.MraidBaseAd$startListeningToVisualMetricsChanges$1", f = "MraidBaseAd.kt", l = {}, m = "invokeSuspend")
    public static final class d extends SuspendLambda implements Function2 {
        public int a;
        public /* synthetic */ boolean b;

        public d(Continuation continuation) {
            super(2, continuation);
        }

        public final Object a(boolean z, Continuation continuation) {
            return ((d) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            d dVar = e.this.new d(continuation);
            dVar.b = ((Boolean) obj).booleanValue();
            return dVar;
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
            e.this.I().a(this.b);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.MraidBaseAd$startListeningToVisualMetricsChanges$2", f = "MraidBaseAd.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.e$e, reason: collision with other inner class name */
    public static final class C1591e extends SuspendLambda implements Function2 {
        public int a;
        public /* synthetic */ Object b;

        public C1591e(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(u.a aVar, Continuation continuation) {
            return ((C1591e) create(aVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C1591e c1591e = e.this.new C1591e(continuation);
            c1591e.b = obj;
            return c1591e;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            e.this.I().a(((u.a) this.b).a());
            return Unit.INSTANCE;
        }
    }

    public e(@NotNull Context context, @NotNull String adm, @NotNull r mraidPlacementType, @NotNull Function0 onShowListenerClick, @NotNull Function1 onClickthroughClick, @NotNull Function1 onError, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r externalLinkHandler, boolean z, @NotNull f mraidBridge) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adm, "adm");
        Intrinsics.checkNotNullParameter(mraidPlacementType, "mraidPlacementType");
        Intrinsics.checkNotNullParameter(onShowListenerClick, "onShowListenerClick");
        Intrinsics.checkNotNullParameter(onClickthroughClick, "onClickthroughClick");
        Intrinsics.checkNotNullParameter(onError, "onError");
        Intrinsics.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        Intrinsics.checkNotNullParameter(mraidBridge, "mraidBridge");
        this.a = adm;
        this.b = mraidPlacementType;
        this.c = onShowListenerClick;
        this.d = onClickthroughClick;
        this.e = onError;
        this.f = externalLinkHandler;
        this.g = z;
        this.h = mraidBridge;
        this.i = "MraidBaseAd";
        CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(com.moloco.sdk.internal.scheduling.b.a().getMain());
        this.j = CoroutineScope;
        this.m = new u(mraidBridge.c(), context, CoroutineScope);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l() {
        return Unit.INSTANCE;
    }

    @NotNull
    public final f I() {
        return this.h;
    }

    @NotNull
    public final Function1 J() {
        return this.d;
    }

    @NotNull
    public final Function1 S() {
        return this.e;
    }

    @NotNull
    public final Function0 T() {
        return this.c;
    }

    public final void U() {
        if (((Boolean) this.m.l().getValue()).booleanValue()) {
            s();
        } else {
            this.h.a(n.a.i, "Can't close ad when mraid container is not visible to the user");
        }
    }

    public void V() {
    }

    public final void W() {
        BuildersKt__Builders_commonKt.launch$default(this.j, null, null, new b(null), 3, null);
    }

    public final void X() {
        FlowKt.launchIn(FlowKt.onEach(this.h.v(), new c(null)), this.j);
    }

    public final void Y() {
        FlowKt.launchIn(FlowKt.onEach(this.m.l(), new d(null)), this.j);
        FlowKt.launchIn(FlowKt.onEach(this.m.k(), new C1591e(null)), this.j);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k
    public void destroy() {
        CoroutineScopeKt.cancel$default(this.j, null, 1, null);
        this.h.destroy();
        this.m.destroy();
    }

    public void s() {
        if (this.l == t.e) {
            b(t.c);
        }
    }

    public static final Unit b(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    public final void b(@NotNull Function1 function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.e = function1;
    }

    public final void b(t tVar) {
        this.l = tVar;
        if (tVar != null) {
            this.h.a(tVar);
        }
    }

    public final void a(@NotNull Function0 function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.c = function0;
    }

    @Nullable
    public final Object b(@NotNull Continuation continuation) {
        Deferred async$default;
        async$default = BuildersKt__Builders_commonKt.async$default(this.j, null, null, new a(null), 3, null);
        return async$default.await(continuation);
    }

    public final void a(@NotNull Function1 function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.d = function1;
    }

    public static final Unit a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    public final void a(n.d dVar) {
        if (((Boolean) this.m.l().getValue()).booleanValue()) {
            Function1 function1 = this.d;
            String uri = dVar.b().toString();
            Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
            function1.invoke(uri);
            return;
        }
        this.h.a(dVar, "Can't open links when mraid container is not visible to the user");
    }

    public final void a(n.c cVar) {
        if (this.g) {
            this.h.a(cVar, "expand() is force blocked for the current ad");
            return;
        }
        if (!((Boolean) this.m.l().getValue()).booleanValue()) {
            this.h.a(cVar, "Can't expand() when mraid container is not visible to the user");
            return;
        }
        if (this.l != t.c) {
            this.h.a(cVar, "In order to expand() mraid ad, container must be in Default view state");
            return;
        }
        if (this.b == r.c) {
            this.h.a(cVar, "expand() is not supported for interstitials");
        } else if (cVar.b() != null) {
            this.h.a(cVar, "Two-part expand is not supported yet");
        } else {
            V();
            b(t.e);
        }
    }

    public /* synthetic */ e(Context context, String str, r rVar, Function0 function0, Function1 function1, Function1 function12, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r rVar2, boolean z, f fVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, rVar, (i & 8) != 0 ? new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.e$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                Unit l;
                l = e.l();
                return l;
            }
        } : function0, (i & 16) != 0 ? new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.e$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return e.b((String) obj);
            }
        } : function1, (i & 32) != 0 ? new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.e$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return e.a((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d) obj);
            }
        } : function12, rVar2, (i & 128) != 0 ? false : z, fVar);
    }
}
