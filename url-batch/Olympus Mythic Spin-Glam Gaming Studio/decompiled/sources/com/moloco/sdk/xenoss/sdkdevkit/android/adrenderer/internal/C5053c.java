package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.acm.recorder.MetricsRecorder;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.ortb.model.C5023e;
import com.moloco.sdk.service_locator.a;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC5050b;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5053c implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.o {
    public static final int t = 8;

    @NotNull
    public final Context a;

    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a b;

    @NotNull
    public final C5023e c;

    @NotNull
    public final r d;

    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y e;

    @NotNull
    public final MetricsRecorder f;

    @NotNull
    public final String g;

    @Nullable
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i h;

    @NotNull
    public final CoroutineScope i;

    @Nullable
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.w, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.x> j;

    @Nullable
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.f> k;

    @Nullable
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.f> l;

    @NotNull
    public final v m;

    @NotNull
    public final MutableStateFlow n;

    @NotNull
    public final StateFlow o;

    @NotNull
    public final MutableStateFlow p;

    @NotNull
    public final StateFlow q;

    @NotNull
    public final MutableStateFlow r;

    @NotNull
    public final StateFlow s;

    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.c$a */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i.values().length];
            try {
                iArr[com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i.a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i.b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i.c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i.d.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i.e.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i.f.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i.g.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            a = iArr;
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.AggregatedFullscreenAd$load$1", f = "AggregatedFullscreenAd.kt", l = {108}, m = "invokeSuspend")
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.c$b */
    public static final class b extends SuspendLambda implements Function2 {
        public int a;
        public final /* synthetic */ long c;
        public final /* synthetic */ InterfaceC5050b.a d;

        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.c$b$a */
        public static final class a implements InterfaceC5050b.a {
            public final /* synthetic */ InterfaceC5050b.a a;
            public final /* synthetic */ C5053c b;

            /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.c$b$a$a, reason: collision with other inner class name */
            public /* synthetic */ class C1581a {
                public static final /* synthetic */ int[] a;

                static {
                    int[] iArr = new int[com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i.values().length];
                    try {
                        iArr[com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i.a.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i.b.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i.c.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i.d.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i.e.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    try {
                        iArr[com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i.f.ordinal()] = 6;
                    } catch (NoSuchFieldError unused6) {
                    }
                    try {
                        iArr[com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i.g.ordinal()] = 7;
                    } catch (NoSuchFieldError unused7) {
                    }
                    a = iArr;
                }
            }

            public a(InterfaceC5050b.a aVar, C5053c c5053c) {
                this.a = aVar;
                this.b = c5053c;
            }

            @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC5050b.a
            public void a() {
                InterfaceC5050b.a aVar = this.a;
                if (aVar != null) {
                    aVar.a();
                }
            }

            @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC5050b.a
            public void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a timeoutError) {
                Intrinsics.checkNotNullParameter(timeoutError, "timeoutError");
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i creativeType = this.b.getCreativeType();
                switch (creativeType == null ? -1 : C1581a.a[creativeType.ordinal()]) {
                    case -1:
                        MolocoLogger.error$default(MolocoLogger.INSTANCE, this.b.g, "creativeType is null", null, false, 12, null);
                        return;
                    case 0:
                    default:
                        throw new NoWhenBranchMatchedException();
                    case 1:
                        InterfaceC5050b.a aVar = this.a;
                        if (aVar != null) {
                            aVar.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a.e);
                            return;
                        }
                        return;
                    case 2:
                        InterfaceC5050b.a aVar2 = this.a;
                        if (aVar2 != null) {
                            aVar2.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a.f);
                            return;
                        }
                        return;
                    case 3:
                        InterfaceC5050b.a aVar3 = this.a;
                        if (aVar3 != null) {
                            aVar3.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a.g);
                            return;
                        }
                        return;
                    case 4:
                    case 5:
                    case 6:
                        MolocoLogger.error$default(MolocoLogger.INSTANCE, this.b.g, "Template creative types should not be used with AggregatedFullscreenAd. Use TemplateFullscreenAd instead.", null, false, 12, null);
                        return;
                    case 7:
                        MolocoLogger.error$default(MolocoLogger.INSTANCE, this.b.g, "Failed to resolve creative type for the ad. Please check the ad markup and ensure it follows the expected format.", null, false, 12, null);
                        return;
                }
            }

            @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC5050b.a
            public void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c internalError) {
                Intrinsics.checkNotNullParameter(internalError, "internalError");
                InterfaceC5050b.a aVar = this.a;
                if (aVar != null) {
                    aVar.a(internalError);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(long j, InterfaceC5050b.a aVar, Continuation continuation) {
            super(2, continuation);
            this.c = j;
            this.d = aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return C5053c.this.new b(this.c, this.d, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C5053c c5053c = C5053c.this;
                this.a = 1;
                if (c5053c.b(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l n = C5053c.this.n();
            if (n != null) {
                n.a(this.c, new a(this.d, C5053c.this));
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.AggregatedFullscreenAd", f = "AggregatedFullscreenAd.kt", l = {69}, m = "prepareAd")
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.c$c, reason: collision with other inner class name */
    public static final class C1582c extends ContinuationImpl {
        public Object a;
        public /* synthetic */ Object b;
        public int d;

        public C1582c(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return C5053c.this.b(this);
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.AggregatedFullscreenAd$prepareAd$2", f = "AggregatedFullscreenAd.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.c$d */
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
            d dVar = C5053c.this.new d(continuation);
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
            C5053c.this.n.setValue(Boxing.boxBoolean(this.b));
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.AggregatedFullscreenAd$prepareAd$3", f = "AggregatedFullscreenAd.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.c$e */
    public static final class e extends SuspendLambda implements Function2 {
        public int a;
        public /* synthetic */ boolean b;

        public e(Continuation continuation) {
            super(2, continuation);
        }

        public final Object a(boolean z, Continuation continuation) {
            return ((e) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            e eVar = C5053c.this.new e(continuation);
            eVar.b = ((Boolean) obj).booleanValue();
            return eVar;
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
            C5053c.this.p.setValue(Boxing.boxBoolean(this.b));
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.AggregatedFullscreenAd$prepareAd$4", f = "AggregatedFullscreenAd.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.c$f */
    public static final class f extends SuspendLambda implements Function2 {
        public int a;
        public /* synthetic */ boolean b;

        public f(Continuation continuation) {
            super(2, continuation);
        }

        public final Object a(boolean z, Continuation continuation) {
            return ((f) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            f fVar = C5053c.this.new f(continuation);
            fVar.b = ((Boolean) obj).booleanValue();
            return fVar;
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
            C5053c.this.r.setValue(Boxing.boxBoolean(this.b));
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.AggregatedFullscreenAd$prepareAd$crType$1", f = "AggregatedFullscreenAd.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.c$g */
    public static final class g extends SuspendLambda implements Function2 {
        public int a;

        public g(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((g) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return C5053c.this.new g(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i c = C5059h.a.c(C5053c.this.c.getAdm());
            C5053c c5053c = C5053c.this;
            c5053c.h = c;
            MolocoLogger.debug$default(MolocoLogger.INSTANCE, c5053c.g, "Native ad resolved creativeType: " + c, false, 4, null);
            return c;
        }
    }

    public C5053c(@NotNull Context context, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a customUserEventBuilderService, @Nullable com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i iVar, @NotNull C5023e bid, @NotNull r externalLinkHandler, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y watermark, @NotNull MetricsRecorder metricsRecorder) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(customUserEventBuilderService, "customUserEventBuilderService");
        Intrinsics.checkNotNullParameter(bid, "bid");
        Intrinsics.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        Intrinsics.checkNotNullParameter(watermark, "watermark");
        Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        this.a = context;
        this.b = customUserEventBuilderService;
        this.c = bid;
        this.d = externalLinkHandler;
        this.e = watermark;
        this.f = metricsRecorder;
        this.g = "AggregatedFullscreenAd";
        this.h = iVar;
        this.i = CoroutineScopeKt.CoroutineScope(com.moloco.sdk.internal.scheduling.b.a().getMain());
        this.m = new v();
        Boolean bool = Boolean.FALSE;
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(bool);
        this.n = MutableStateFlow;
        this.o = MutableStateFlow;
        MutableStateFlow MutableStateFlow2 = StateFlowKt.MutableStateFlow(bool);
        this.p = MutableStateFlow2;
        this.q = MutableStateFlow2;
        MutableStateFlow MutableStateFlow3 = StateFlowKt.MutableStateFlow(bool);
        this.r = MutableStateFlow3;
        this.s = MutableStateFlow3;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k
    public void destroy() {
        CoroutineScopeKt.cancel$default(this.i, null, 1, null);
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l<?, ?> n = n();
        if (n != null) {
            n.destroy();
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.j
    @Nullable
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i getCreativeType() {
        return this.h;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC5050b
    @NotNull
    public StateFlow isLoaded() {
        return this.o;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.m
    @NotNull
    public StateFlow k() {
        return this.s;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC5049a
    @NotNull
    public StateFlow l() {
        return this.q;
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l<?, ?> n() {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.w, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.x> lVar = this.j;
        if (lVar != null) {
            return lVar;
        }
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.f> lVar2 = this.k;
        return lVar2 == null ? this.l : lVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Continuation continuation) {
        C1582c c1582c;
        int i;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i creativeType;
        C5053c c5053c;
        com.moloco.sdk.internal.ortb.model.y mute;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l<?, ?> n;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l<?, ?> n2;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l<?, ?> n3;
        StateFlow k;
        Flow onEach;
        StateFlow l;
        Flow onEach2;
        StateFlow isLoaded;
        Flow onEach3;
        if (continuation instanceof C1582c) {
            c1582c = (C1582c) continuation;
            int i2 = c1582c.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c1582c.d = i2 - Integer.MIN_VALUE;
                Object obj = c1582c.b;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c1582c.d;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    creativeType = getCreativeType();
                    if (creativeType != null) {
                        c5053c = this;
                        switch (a.a[creativeType.ordinal()]) {
                            case 1:
                                c5053c.j = c5053c.m.a(c5053c.a, c5053c.c, a.g.a.b().h(), c5053c.e, c5053c.f);
                                break;
                            case 2:
                                v vVar = c5053c.m;
                                Context context = c5053c.a;
                                CoroutineScope coroutineScope = c5053c.i;
                                C5023e c5023e = c5053c.c;
                                r rVar = c5053c.d;
                                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y yVar = c5053c.e;
                                MutableStateFlow mutableStateFlow = c5053c.p;
                                com.moloco.sdk.internal.ortb.model.z player = c5023e.getExt().getPlayer();
                                c5053c.k = vVar.a(context, coroutineScope, c5023e, rVar, yVar, mutableStateFlow, (player == null || (mute = player.getMute()) == null) ? false : mute.getMute(), c5053c.f);
                                break;
                            case 3:
                                c5053c.l = c5053c.m.a(c5053c.a, c5053c.b, c5053c.c.getAdm(), c5053c.d, c5053c.e, c5053c.f);
                                break;
                            case 4:
                            case 5:
                            case 6:
                                MolocoLogger.error$default(MolocoLogger.INSTANCE, c5053c.g, "Template creative types should not be used with AggregatedFullscreenAd. Use TemplateFullscreenAd instead.", null, false, 12, null);
                                break;
                            case 7:
                                MolocoLogger.error$default(MolocoLogger.INSTANCE, c5053c.g, "Failed to resolve creative type for the ad. Please check the ad markup and ensure it follows the expected format.", null, false, 12, null);
                                break;
                            default:
                                throw new NoWhenBranchMatchedException();
                        }
                        n = c5053c.n();
                        if (n != null && (isLoaded = n.isLoaded()) != null && (onEach3 = FlowKt.onEach(isLoaded, c5053c.new d(null))) != null) {
                            FlowKt.launchIn(onEach3, c5053c.i);
                        }
                        n2 = c5053c.n();
                        if (n2 != null && (l = n2.l()) != null && (onEach2 = FlowKt.onEach(l, c5053c.new e(null))) != null) {
                            FlowKt.launchIn(onEach2, c5053c.i);
                        }
                        n3 = c5053c.n();
                        if (n3 != null && (k = n3.k()) != null && (onEach = FlowKt.onEach(k, c5053c.new f(null))) != null) {
                            FlowKt.launchIn(onEach, c5053c.i);
                        }
                        return Unit.INSTANCE;
                    }
                    CoroutineContext coroutineContext = com.moloco.sdk.internal.scheduling.b.a().getDefault();
                    g gVar = new g(null);
                    c1582c.a = this;
                    c1582c.d = 1;
                    obj = BuildersKt.withContext(coroutineContext, gVar, c1582c);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    c5053c = this;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c5053c = (C5053c) c1582c.a;
                    ResultKt.throwOnFailure(obj);
                }
                creativeType = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i) obj;
                switch (a.a[creativeType.ordinal()]) {
                }
                n = c5053c.n();
                if (n != null) {
                    FlowKt.launchIn(onEach3, c5053c.i);
                }
                n2 = c5053c.n();
                if (n2 != null) {
                    FlowKt.launchIn(onEach2, c5053c.i);
                }
                n3 = c5053c.n();
                if (n3 != null) {
                    FlowKt.launchIn(onEach, c5053c.i);
                }
                return Unit.INSTANCE;
            }
        }
        c1582c = new C1582c(continuation);
        Object obj2 = c1582c.b;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c1582c.d;
        if (i != 0) {
        }
        creativeType = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i) obj2;
        switch (a.a[creativeType.ordinal()]) {
        }
        n = c5053c.n();
        if (n != null) {
        }
        n2 = c5053c.n();
        if (n2 != null) {
        }
        n3 = c5053c.n();
        if (n3 != null) {
        }
        return Unit.INSTANCE;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC5050b
    public void a(long j, @Nullable InterfaceC5050b.a aVar) {
        BuildersKt__Builders_commonKt.launch$default(this.i, null, null, new b(j, aVar, null), 3, null);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l
    public void a(@NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.h options, @Nullable com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g gVar) {
        Unit unit;
        Intrinsics.checkNotNullParameter(options, "options");
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.w, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.x> lVar = this.j;
        if (lVar != null) {
            lVar.a((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.w, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.x>) options.c(), (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.x) gVar);
            Unit unit2 = Unit.INSTANCE;
            return;
        }
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.f> lVar2 = this.k;
        if (lVar2 != null) {
            lVar2.a((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.f>) options.a(), (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.f) gVar);
            Unit unit3 = Unit.INSTANCE;
            return;
        }
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.f> lVar3 = this.l;
        if (lVar3 != null) {
            lVar3.a((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.f>) options.b(), (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.f) gVar);
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit != null || gVar == null) {
            return;
        }
        gVar.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.b.a);
        Unit unit4 = Unit.INSTANCE;
    }
}
