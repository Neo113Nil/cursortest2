package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.internal.ortb.model.C5023e;
import com.moloco.sdk.internal.ortb.model.C5024f;
import com.moloco.sdk.internal.x;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC5050b;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
/* loaded from: classes11.dex */
public final class y implements InterfaceC5050b {
    public static final int h = 8;

    @NotNull
    public final CoroutineScope a;

    @Nullable
    public final C5023e b;

    @NotNull
    public final InterfaceC5064m c;

    @NotNull
    public final Function1 d;

    @NotNull
    public final MutableStateFlow e;

    @NotNull
    public final StateFlow f;

    @NotNull
    public com.moloco.sdk.internal.x<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.c, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d> g;

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.MraidAdLoad$load$1", f = "MraidAdLoad.kt", l = {60, 80}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements Function2 {
        public Object a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ InterfaceC5050b.a e;
        public final /* synthetic */ long f;

        @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.MraidAdLoad$load$1$decDeferred$1", f = "MraidAdLoad.kt", l = {48}, m = "invokeSuspend")
        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.y$a$a, reason: collision with other inner class name */
        public static final class C1674a extends SuspendLambda implements Function2 {
            public int a;
            public final /* synthetic */ long b;
            public final /* synthetic */ C5060i c;
            public final /* synthetic */ y d;

            @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.MraidAdLoad$load$1$decDeferred$1$1", f = "MraidAdLoad.kt", l = {51}, m = "invokeSuspend")
            /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.y$a$a$a, reason: collision with other inner class name */
            public static final class C1675a extends SuspendLambda implements Function2 {
                public Object a;
                public int b;
                public final /* synthetic */ C5060i c;
                public final /* synthetic */ y d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C1675a(C5060i c5060i, y yVar, Continuation continuation) {
                    super(2, continuation);
                    this.c = c5060i;
                    this.d = yVar;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                    return ((C1675a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    return new C1675a(this.c, this.d, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    C5060i c5060i;
                    C5024f ext;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.b;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        C5060i c5060i2 = this.c;
                        String str = null;
                        if (c5060i2 == null) {
                            return null;
                        }
                        y yVar = this.d;
                        try {
                            InterfaceC5064m interfaceC5064m = yVar.c;
                            C5023e c5023e = yVar.b;
                            if (c5023e != null && (ext = c5023e.getExt()) != null) {
                                str = ext.getCom.safedk.android.analytics.brandsafety.creatives.discoveries.n.b java.lang.String();
                            }
                            this.a = c5060i2;
                            this.b = 1;
                            Object a = interfaceC5064m.a(c5060i2, str, this);
                            if (a == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            c5060i = c5060i2;
                            obj = a;
                        } catch (Exception unused) {
                            return c5060i2;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        c5060i = (C5060i) this.a;
                        try {
                            ResultKt.throwOnFailure(obj);
                        } catch (Exception unused2) {
                            return c5060i;
                        }
                    }
                    return (C5060i) obj;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1674a(long j, C5060i c5060i, y yVar, Continuation continuation) {
                super(2, continuation);
                this.b = j;
                this.c = c5060i;
                this.d = yVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((C1674a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new C1674a(this.b, this.c, this.d, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    long j = this.b;
                    C1675a c1675a = new C1675a(this.c, this.d, null);
                    this.a = 1;
                    obj = TimeoutKt.m8206withTimeoutOrNullKLykuaI(j, c1675a, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                C5060i c5060i = (C5060i) obj;
                return c5060i == null ? this.c : c5060i;
            }
        }

        @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.MraidAdLoad$load$1$mraidLoadResultDeferred$1", f = "MraidAdLoad.kt", l = {39}, m = "invokeSuspend")
        public static final class b extends SuspendLambda implements Function2 {
            public int a;
            public final /* synthetic */ long b;
            public final /* synthetic */ y c;

            @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.MraidAdLoad$load$1$mraidLoadResultDeferred$1$1", f = "MraidAdLoad.kt", l = {40}, m = "invokeSuspend")
            /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.y$a$b$a, reason: collision with other inner class name */
            public static final class C1676a extends SuspendLambda implements Function2 {
                public int a;
                public final /* synthetic */ y b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C1676a(y yVar, Continuation continuation) {
                    super(2, continuation);
                    this.b = yVar;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                    return ((C1676a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    return new C1676a(this.b, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.a;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        Function1 function1 = this.b.d;
                        this.a = 1;
                        obj = function1.invoke(this);
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
            public b(long j, y yVar, Continuation continuation) {
                super(2, continuation);
                this.b = j;
                this.c = yVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new b(this.b, this.c, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    long j = this.b;
                    C1676a c1676a = new C1676a(this.c, null);
                    this.a = 1;
                    obj = TimeoutKt.m8206withTimeoutOrNullKLykuaI(j, c1676a, this);
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
        public a(InterfaceC5050b.a aVar, long j, Continuation continuation) {
            super(2, continuation);
            this.e = aVar;
            this.f = j;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            a aVar = y.this.new a(this.e, this.f, continuation);
            aVar.c = obj;
            return aVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:40:0x0122  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0100  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Deferred async$default;
            Deferred async$default2;
            Deferred deferred;
            C5024f ext;
            com.moloco.sdk.internal.ortb.model.z player;
            com.moloco.sdk.internal.ortb.model.l lVar;
            InterfaceC5050b.a aVar;
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.c cVar;
            y yVar;
            InterfaceC5050b.a aVar2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.c;
                if (y.this.a() instanceof x.b) {
                    InterfaceC5050b.a aVar3 = this.e;
                    if (aVar3 != null) {
                        aVar3.a();
                    }
                    return Unit.INSTANCE;
                }
                async$default = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new b(this.f, y.this, null), 3, null);
                C5023e c5023e = y.this.b;
                async$default2 = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new C1674a(this.f, (c5023e == null || (ext = c5023e.getExt()) == null || (player = ext.getPlayer()) == null || (lVar = player.getCom.safedk.android.analytics.brandsafety.m.Q java.lang.String()) == null) ? null : com.moloco.sdk.internal.l.a(lVar), y.this, null), 3, null);
                try {
                    this.c = async$default2;
                    this.b = 1;
                    Object await = async$default.await(this);
                    if (await == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    deferred = async$default2;
                    obj = await;
                } catch (TimeoutCancellationException unused) {
                    deferred = async$default2;
                    Job.DefaultImpls.cancel$default(deferred, null, 1, null);
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a aVar4 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a.f;
                    y.this.a(new x.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d.e));
                    aVar = this.e;
                    if (aVar != null) {
                    }
                    return Unit.INSTANCE;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    cVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.c) this.a;
                    yVar = (y) this.c;
                    ResultKt.throwOnFailure(obj);
                    yVar.a(new x.b(cVar.a((C5060i) obj)));
                    y.this.e.setValue(Boxing.boxBoolean(true));
                    aVar2 = this.e;
                    if (aVar2 != null) {
                        aVar2.a();
                    }
                    return Unit.INSTANCE;
                }
                deferred = (Deferred) this.c;
                try {
                    ResultKt.throwOnFailure(obj);
                } catch (TimeoutCancellationException unused2) {
                    Job.DefaultImpls.cancel$default(deferred, null, 1, null);
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a aVar42 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a.f;
                    y.this.a(new x.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d.e));
                    aVar = this.e;
                    if (aVar != null) {
                        aVar.a(aVar42);
                    }
                    return Unit.INSTANCE;
                }
            }
            com.moloco.sdk.internal.x xVar = (com.moloco.sdk.internal.x) obj;
            if (xVar == null) {
                InterfaceC5050b.a aVar5 = this.e;
                if (aVar5 != null) {
                    aVar5.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a.c);
                }
            } else if (xVar instanceof x.a) {
                InterfaceC5050b.a aVar6 = this.e;
                if (aVar6 != null) {
                    aVar6.a((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c) ((x.a) xVar).a());
                }
                Job.DefaultImpls.cancel$default(deferred, null, 1, null);
            } else {
                if (!(xVar instanceof x.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                y yVar2 = y.this;
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.c cVar2 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.c) ((x.b) xVar).a();
                this.c = yVar2;
                this.a = cVar2;
                this.b = 2;
                Object await2 = deferred.await(this);
                if (await2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                cVar = cVar2;
                obj = await2;
                yVar = yVar2;
                yVar.a(new x.b(cVar.a((C5060i) obj)));
                y.this.e.setValue(Boxing.boxBoolean(true));
                aVar2 = this.e;
                if (aVar2 != null) {
                }
            }
            return Unit.INSTANCE;
        }
    }

    public y(@NotNull CoroutineScope scope, @Nullable C5023e c5023e, @NotNull InterfaceC5064m decLoader, @NotNull Function1 loadAndReadyMraid) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(decLoader, "decLoader");
        Intrinsics.checkNotNullParameter(loadAndReadyMraid, "loadAndReadyMraid");
        this.a = scope;
        this.b = c5023e;
        this.c = decLoader;
        this.d = loadAndReadyMraid;
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        this.e = MutableStateFlow;
        this.f = MutableStateFlow;
        this.g = new x.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d.f);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC5050b
    @NotNull
    public StateFlow isLoaded() {
        return this.f;
    }

    @NotNull
    public final com.moloco.sdk.internal.x<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.c, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d> a() {
        return this.g;
    }

    public final void a(@NotNull com.moloco.sdk.internal.x<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.c, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d> xVar) {
        Intrinsics.checkNotNullParameter(xVar, "<set-?>");
        this.g = xVar;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC5050b
    public void a(long j, @Nullable InterfaceC5050b.a aVar) {
        BuildersKt__Builders_commonKt.launch$default(this.a, null, null, new a(aVar, j, null), 3, null);
    }
}
