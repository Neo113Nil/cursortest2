package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.moloco.sdk.acm.TimerEvent;
import com.moloco.sdk.acm.recorder.MetricsRecorder;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.ortb.model.C5023e;
import com.moloco.sdk.internal.ortb.model.C5024f;
import com.moloco.sdk.internal.x;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC5050b;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
/* loaded from: classes10.dex */
public final class L implements InterfaceC5050b {
    public static final int m = 8;

    @NotNull
    public final C5023e a;

    @NotNull
    public final CoroutineScope b;

    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.d c;

    @NotNull
    public final InterfaceC5064m d;
    public final boolean e;

    @Nullable
    public final MetricsRecorder f;

    @NotNull
    public com.moloco.sdk.internal.x<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c> g;

    @NotNull
    public final MutableStateFlow h;

    @NotNull
    public final StateFlow i;

    @Nullable
    public Job j;

    @Nullable
    public TimerEvent k;

    @Nullable
    public String l;

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.VastAdLoad$captureLoadMetrics$2", f = "VastAdLoad.kt", l = {}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements Function2 {
        public int a;
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a aVar, Continuation continuation) {
            super(2, continuation);
            this.c = aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return L.this.new a(this.c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Integer e;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            L l = L.this;
            com.moloco.sdk.internal.utils.f fVar = com.moloco.sdk.internal.utils.f.a;
            com.moloco.sdk.internal.utils.e a = fVar.a(this.c.j().j());
            l.l = (a == null || (e = a.e()) == null) ? null : fVar.b(e.intValue());
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.VastAdLoad$fullLoad$1", f = "VastAdLoad.kt", l = {Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE, Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE, 135}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements Function2 {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ InterfaceC5050b.a d;
        public final /* synthetic */ long e;

        @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.VastAdLoad$fullLoad$1$decDeferred$1", f = "VastAdLoad.kt", l = {108}, m = "invokeSuspend")
        public static final class a extends SuspendLambda implements Function2 {
            public int a;
            public final /* synthetic */ long b;
            public final /* synthetic */ C5060i c;
            public final /* synthetic */ L d;

            @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.VastAdLoad$fullLoad$1$decDeferred$1$1", f = "VastAdLoad.kt", l = {110}, m = "invokeSuspend")
            /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.L$b$a$a, reason: collision with other inner class name */
            public static final class C1570a extends SuspendLambda implements Function2 {
                public int a;
                public final /* synthetic */ C5060i b;
                public final /* synthetic */ L c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C1570a(C5060i c5060i, L l, Continuation continuation) {
                    super(2, continuation);
                    this.b = c5060i;
                    this.c = l;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                    return ((C1570a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    return new C1570a(this.b, this.c, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.a;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        C5060i c5060i = this.b;
                        if (c5060i == null) {
                            return null;
                        }
                        L l = this.c;
                        InterfaceC5064m interfaceC5064m = l.d;
                        C5024f ext = l.a.getExt();
                        String str = ext != null ? ext.getCom.safedk.android.analytics.brandsafety.creatives.discoveries.n.b java.lang.String() : null;
                        this.a = 1;
                        obj = interfaceC5064m.a(c5060i, str, this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return (C5060i) obj;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(long j, C5060i c5060i, L l, Continuation continuation) {
                super(2, continuation);
                this.b = j;
                this.c = c5060i;
                this.d = l;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new a(this.b, this.c, this.d, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    long j = this.b;
                    C1570a c1570a = new C1570a(this.c, this.d, null);
                    this.a = 1;
                    obj = TimeoutKt.m8206withTimeoutOrNullKLykuaI(j, c1570a, this);
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

        @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.VastAdLoad$fullLoad$1$vastAdDeferred$1", f = "VastAdLoad.kt", l = {100}, m = "invokeSuspend")
        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.L$b$b, reason: collision with other inner class name */
        public static final class C1571b extends SuspendLambda implements Function2 {
            public int a;
            public final /* synthetic */ long b;
            public final /* synthetic */ L c;

            @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.VastAdLoad$fullLoad$1$vastAdDeferred$1$1", f = "VastAdLoad.kt", l = {101}, m = "invokeSuspend")
            /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.L$b$b$a */
            public static final class a extends SuspendLambda implements Function2 {
                public int a;
                public final /* synthetic */ L b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(L l, Continuation continuation) {
                    super(2, continuation);
                    this.b = l;
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
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.a;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.d dVar = this.b.c;
                        String adm = this.b.a.getAdm();
                        String b = com.moloco.sdk.internal.ortb.model.h.b(this.b.a);
                        this.a = 1;
                        obj = dVar.a(adm, b, false, this);
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
            public C1571b(long j, L l, Continuation continuation) {
                super(2, continuation);
                this.b = j;
                this.c = l;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((C1571b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new C1571b(this.b, this.c, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    long j = this.b;
                    a aVar = new a(this.c, null);
                    this.a = 1;
                    obj = TimeoutKt.m8205withTimeoutKLykuaI(j, aVar, this);
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
        public b(InterfaceC5050b.a aVar, long j, Continuation continuation) {
            super(2, continuation);
            this.d = aVar;
            this.e = j;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            b bVar = L.this.new b(this.d, this.e, continuation);
            bVar.b = obj;
            return bVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:10:0x010d  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x00e0  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x00fb A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:23:0x00eb  */
        /* JADX WARN: Type inference failed for: r2v0, types: [int] */
        /* JADX WARN: Type inference failed for: r2v1, types: [kotlinx.coroutines.Job] */
        /* JADX WARN: Type inference failed for: r2v18 */
        /* JADX WARN: Type inference failed for: r2v19 */
        /* JADX WARN: Type inference failed for: r2v7, types: [kotlinx.coroutines.Deferred] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Deferred async$default;
            Deferred async$default2;
            Object await;
            com.moloco.sdk.internal.ortb.model.l lVar;
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a aVar;
            Object await2;
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a a2;
            L l;
            InterfaceC5050b.a aVar2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ?? r2 = this.a;
            try {
                if (r2 == 0) {
                    ResultKt.throwOnFailure(obj);
                    CoroutineScope coroutineScope = (CoroutineScope) this.b;
                    if (L.this.d() instanceof x.b) {
                        InterfaceC5050b.a aVar3 = this.d;
                        if (aVar3 != null) {
                            aVar3.a();
                        }
                        return Unit.INSTANCE;
                    }
                    async$default = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new C1571b(this.e, L.this, null), 3, null);
                    com.moloco.sdk.internal.ortb.model.z player = L.this.a.getExt().getPlayer();
                    async$default2 = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new a(this.e, (player == null || (lVar = player.getCom.safedk.android.analytics.brandsafety.m.Q java.lang.String()) == null) ? null : com.moloco.sdk.internal.l.a(lVar), L.this, null), 3, null);
                    this.b = async$default2;
                    this.a = 1;
                    await = async$default.await(this);
                    r2 = async$default2;
                    if (await == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (r2 != 1) {
                        if (r2 != 2) {
                            if (r2 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                            L.this.h.setValue(Boxing.boxBoolean(true));
                            aVar2 = this.d;
                            if (aVar2 != null) {
                                aVar2.a();
                            }
                            return Unit.INSTANCE;
                        }
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a aVar4 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a) this.b;
                        ResultKt.throwOnFailure(obj);
                        aVar = aVar4;
                        await2 = obj;
                        a2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a.a(aVar, null, null, null, null, (C5060i) await2, 15, null);
                        L.this.a(new x.b(a2));
                        L l2 = L.this;
                        MetricsRecorder metricsRecorder = l2.f;
                        l2.k = metricsRecorder == null ? metricsRecorder.startTimerEvent(com.moloco.sdk.internal.client_metrics_data.e.w.c()) : null;
                        l = L.this;
                        this.b = null;
                        this.a = 3;
                        if (l.a(a2, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        L.this.h.setValue(Boxing.boxBoolean(true));
                        aVar2 = this.d;
                        if (aVar2 != null) {
                        }
                        return Unit.INSTANCE;
                    }
                    Deferred deferred = (Deferred) this.b;
                    ResultKt.throwOnFailure(obj);
                    await = obj;
                    r2 = deferred;
                }
                com.moloco.sdk.internal.x xVar = (com.moloco.sdk.internal.x) await;
                if (!(xVar instanceof x.b)) {
                    if (!(xVar instanceof x.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    L.this.a((Deferred) r2, this.d, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c) ((x.a) xVar).a());
                    return Unit.INSTANCE;
                }
                aVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a) ((x.b) xVar).a();
                this.b = aVar;
                this.a = 2;
                await2 = r2.await(this);
                if (await2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                a2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a.a(aVar, null, null, null, null, (C5060i) await2, 15, null);
                L.this.a(new x.b(a2));
                L l22 = L.this;
                MetricsRecorder metricsRecorder2 = l22.f;
                l22.k = metricsRecorder2 == null ? metricsRecorder2.startTimerEvent(com.moloco.sdk.internal.client_metrics_data.e.w.c()) : null;
                l = L.this;
                this.b = null;
                this.a = 3;
                if (l.a(a2, this) == coroutine_suspended) {
                }
                L.this.h.setValue(Boxing.boxBoolean(true));
                aVar2 = this.d;
                if (aVar2 != null) {
                }
                return Unit.INSTANCE;
            } catch (TimeoutCancellationException unused) {
                MolocoLogger.debug$default(MolocoLogger.INSTANCE, M.a, "main VAST ad didn't load due to timeout", false, 4, null);
                Job.DefaultImpls.cancel$default(r2, null, 1, null);
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a aVar5 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a.b;
                L.this.a(new x.a(aVar5));
                InterfaceC5050b.a aVar6 = this.d;
                if (aVar6 != null) {
                    aVar6.a(aVar5);
                }
                return Unit.INSTANCE;
            }
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.VastAdLoad$streamedLoad$1", f = "VastAdLoad.kt", l = {158, TTAdConstant.IMAGE_MODE_VERTICAL_IMG_173, 175, 178}, m = "invokeSuspend")
    public static final class c extends SuspendLambda implements Function2 {
        public Object a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ InterfaceC5050b.a e;
        public final /* synthetic */ long f;

        @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.VastAdLoad$streamedLoad$1$decDeferred$1", f = "VastAdLoad.kt", l = {162}, m = "invokeSuspend")
        public static final class a extends SuspendLambda implements Function2 {
            public int a;
            public final /* synthetic */ long b;
            public final /* synthetic */ C5060i c;
            public final /* synthetic */ L d;

            @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.VastAdLoad$streamedLoad$1$decDeferred$1$1", f = "VastAdLoad.kt", l = {164}, m = "invokeSuspend")
            /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.L$c$a$a, reason: collision with other inner class name */
            public static final class C1572a extends SuspendLambda implements Function2 {
                public int a;
                public final /* synthetic */ C5060i b;
                public final /* synthetic */ L c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C1572a(C5060i c5060i, L l, Continuation continuation) {
                    super(2, continuation);
                    this.b = c5060i;
                    this.c = l;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                    return ((C1572a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    return new C1572a(this.b, this.c, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.a;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        C5060i c5060i = this.b;
                        if (c5060i == null) {
                            return null;
                        }
                        L l = this.c;
                        InterfaceC5064m interfaceC5064m = l.d;
                        String str = l.a.getExt().getCom.safedk.android.analytics.brandsafety.creatives.discoveries.n.b java.lang.String();
                        this.a = 1;
                        obj = interfaceC5064m.a(c5060i, str, this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return (C5060i) obj;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(long j, C5060i c5060i, L l, Continuation continuation) {
                super(2, continuation);
                this.b = j;
                this.c = c5060i;
                this.d = l;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new a(this.b, this.c, this.d, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    long j = this.b;
                    C1572a c1572a = new C1572a(this.c, this.d, null);
                    this.a = 1;
                    obj = TimeoutKt.m8206withTimeoutOrNullKLykuaI(j, c1572a, this);
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC5050b.a aVar, long j, Continuation continuation) {
            super(2, continuation);
            this.e = aVar;
            this.f = j;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            c cVar = L.this.new c(this.e, this.f, continuation);
            cVar.c = obj;
            return cVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x014f  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0122  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x013d A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:23:0x012d  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x00ec  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0155  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            CoroutineScope coroutineScope;
            Object a2;
            Deferred async$default;
            Object a3;
            com.moloco.sdk.internal.x xVar;
            Deferred deferred;
            com.moloco.sdk.internal.ortb.model.l lVar;
            com.moloco.sdk.internal.x xVar2;
            Object await;
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a aVar;
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a a4;
            L l;
            InterfaceC5050b.a aVar2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                coroutineScope = (CoroutineScope) this.c;
                if (L.this.d() instanceof x.b) {
                    InterfaceC5050b.a aVar3 = this.e;
                    if (aVar3 != null) {
                        aVar3.a();
                    }
                    return Unit.INSTANCE;
                }
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.d dVar = L.this.c;
                String adm = L.this.a.getAdm();
                String b = com.moloco.sdk.internal.ortb.model.h.b(L.this.a);
                this.c = coroutineScope;
                this.b = 1;
                a2 = dVar.a(adm, b, true, this);
                if (a2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                            L.this.h.setValue(Boxing.boxBoolean(true));
                            aVar2 = this.e;
                            if (aVar2 != null) {
                                aVar2.a();
                            }
                            return Unit.INSTANCE;
                        }
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a aVar4 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a) this.c;
                        ResultKt.throwOnFailure(obj);
                        aVar = aVar4;
                        await = obj;
                        a4 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a.a(aVar, null, null, null, null, (C5060i) await, 15, null);
                        L.this.a(new x.b(a4));
                        L l2 = L.this;
                        MetricsRecorder metricsRecorder = l2.f;
                        l2.k = metricsRecorder == null ? metricsRecorder.startTimerEvent(com.moloco.sdk.internal.client_metrics_data.e.w.c()) : null;
                        l = L.this;
                        this.c = null;
                        this.b = 4;
                        if (l.a(a4, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        L.this.h.setValue(Boxing.boxBoolean(true));
                        aVar2 = this.e;
                        if (aVar2 != null) {
                        }
                        return Unit.INSTANCE;
                    }
                    deferred = (Deferred) this.a;
                    com.moloco.sdk.internal.x xVar3 = (com.moloco.sdk.internal.x) this.c;
                    ResultKt.throwOnFailure(obj);
                    xVar = xVar3;
                    a3 = obj;
                    xVar2 = (com.moloco.sdk.internal.x) a3;
                    if (xVar2 instanceof x.b) {
                        if (!(xVar2 instanceof x.a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        MolocoLogger.debug$default(MolocoLogger.INSTANCE, M.a, "main VAST ad didn't load due to failure or timeout", false, 4, null);
                        x.a aVar5 = (x.a) xVar2;
                        if (((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.k) aVar5.a()).d()) {
                            L.this.b(deferred, this.e, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c) aVar5.a());
                        } else {
                            L.this.a(deferred, this.e, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c) aVar5.a());
                        }
                        return Unit.INSTANCE;
                    }
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a aVar6 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a) ((x.b) xVar).a();
                    this.c = aVar6;
                    this.a = null;
                    this.b = 3;
                    await = deferred.await(this);
                    if (await == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    aVar = aVar6;
                    a4 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a.a(aVar, null, null, null, null, (C5060i) await, 15, null);
                    L.this.a(new x.b(a4));
                    L l22 = L.this;
                    MetricsRecorder metricsRecorder2 = l22.f;
                    l22.k = metricsRecorder2 == null ? metricsRecorder2.startTimerEvent(com.moloco.sdk.internal.client_metrics_data.e.w.c()) : null;
                    l = L.this;
                    this.c = null;
                    this.b = 4;
                    if (l.a(a4, this) == coroutine_suspended) {
                    }
                    L.this.h.setValue(Boxing.boxBoolean(true));
                    aVar2 = this.e;
                    if (aVar2 != null) {
                    }
                    return Unit.INSTANCE;
                }
                coroutineScope = (CoroutineScope) this.c;
                ResultKt.throwOnFailure(obj);
                a2 = obj;
            }
            CoroutineScope coroutineScope2 = coroutineScope;
            com.moloco.sdk.internal.x xVar4 = (com.moloco.sdk.internal.x) a2;
            com.moloco.sdk.internal.ortb.model.z player = L.this.a.getExt().getPlayer();
            async$default = BuildersKt__Builders_commonKt.async$default(coroutineScope2, null, null, new a(this.f, (player == null || (lVar = player.getCom.safedk.android.analytics.brandsafety.m.Q java.lang.String()) == null) ? null : com.moloco.sdk.internal.l.a(lVar), L.this, null), 3, null);
            if (!(xVar4 instanceof x.b)) {
                if (!(xVar4 instanceof x.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                L.this.a(async$default, this.e, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c) ((x.a) xVar4).a());
                return Unit.INSTANCE;
            }
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.d dVar2 = L.this.c;
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a aVar7 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a) ((x.b) xVar4).a();
            long j = this.f;
            this.c = xVar4;
            this.a = async$default;
            this.b = 2;
            a3 = dVar2.a(aVar7, j, this);
            if (a3 == coroutine_suspended) {
                return coroutine_suspended;
            }
            xVar = xVar4;
            deferred = async$default;
            xVar2 = (com.moloco.sdk.internal.x) a3;
            if (xVar2 instanceof x.b) {
            }
        }
    }

    public L(@NotNull C5023e bid, @NotNull CoroutineScope scope, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.d loadVast, @NotNull InterfaceC5064m decLoader, boolean z, @Nullable MetricsRecorder metricsRecorder) {
        Intrinsics.checkNotNullParameter(bid, "bid");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(loadVast, "loadVast");
        Intrinsics.checkNotNullParameter(decLoader, "decLoader");
        this.a = bid;
        this.b = scope;
        this.c = loadVast;
        this.d = decLoader;
        this.e = z;
        this.f = metricsRecorder;
        this.g = new x.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.k.a);
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        this.h = MutableStateFlow;
        this.i = FlowKt.asStateFlow(MutableStateFlow);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC5050b
    @NotNull
    public StateFlow isLoaded() {
        return this.i;
    }

    @Nullable
    public final TimerEvent c() {
        return this.k;
    }

    @NotNull
    public final com.moloco.sdk.internal.x<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c> d() {
        return this.g;
    }

    @Nullable
    public final String b() {
        return this.l;
    }

    public final void c(long j, InterfaceC5050b.a aVar) {
        Job launch$default;
        Job job = this.j;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, null, 1, null);
        }
        launch$default = BuildersKt__Builders_commonKt.launch$default(this.b, null, null, new c(aVar, j, null), 3, null);
        this.j = launch$default;
    }

    public final void b(long j, InterfaceC5050b.a aVar) {
        Job launch$default;
        Job job = this.j;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, null, 1, null);
        }
        launch$default = BuildersKt__Builders_commonKt.launch$default(this.b, null, null, new b(aVar, j, null), 3, null);
        this.j = launch$default;
    }

    public final void a(@NotNull com.moloco.sdk.internal.x<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c> xVar) {
        Intrinsics.checkNotNullParameter(xVar, "<set-?>");
        this.g = xVar;
    }

    public final void b(Deferred deferred, InterfaceC5050b.a aVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c cVar) {
        Job.DefaultImpls.cancel$default(deferred, null, 1, null);
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a aVar2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a.b;
        this.g = new x.a(cVar);
        if (aVar != null) {
            aVar.a(aVar2);
        }
    }

    @Nullable
    public final Integer a() {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a aVar;
        com.moloco.sdk.internal.x<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c> xVar = this.g;
        x.b bVar = xVar instanceof x.b ? (x.b) xVar : null;
        if (bVar == null || (aVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a) bVar.a()) == null) {
            return null;
        }
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c a2 = this.c.a(aVar.j().l());
        if (a2 instanceof c.a) {
            return 100;
        }
        if (a2 instanceof c.C1589c) {
            c.d d = ((c.C1589c) a2).d();
            if (d.d() > 0) {
                return Integer.valueOf((int) ((d.c() * 100) / d.d()));
            }
            return null;
        }
        if (a2 instanceof c.b) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public /* synthetic */ L(C5023e c5023e, CoroutineScope coroutineScope, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.d dVar, InterfaceC5064m interfaceC5064m, boolean z, MetricsRecorder metricsRecorder, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(c5023e, coroutineScope, dVar, interfaceC5064m, z, (i & 32) != 0 ? null : metricsRecorder);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC5050b
    public void a(long j, @Nullable InterfaceC5050b.a aVar) {
        if (this.e) {
            c(j, aVar);
        } else {
            b(j, aVar);
        }
    }

    public final void a(Deferred deferred, InterfaceC5050b.a aVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c cVar) {
        MolocoLogger.error$default(MolocoLogger.INSTANCE, M.a, "Vast AD failed to load: " + cVar, null, false, 12, null);
        Job.DefaultImpls.cancel$default(deferred, null, 1, null);
        this.g = new x.a(cVar);
        if (aVar != null) {
            aVar.a(cVar);
        }
    }

    public final Object a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a aVar, Continuation continuation) {
        Object withContext = BuildersKt.withContext(com.moloco.sdk.internal.scheduling.b.a().getIo(), new a(aVar, null), continuation);
        return withContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : Unit.INSTANCE;
    }
}
