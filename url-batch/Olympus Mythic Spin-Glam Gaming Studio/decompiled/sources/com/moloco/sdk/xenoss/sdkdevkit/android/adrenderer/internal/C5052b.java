package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.MotionEvent;
import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.ortb.model.C5023e;
import com.moloco.sdk.service_locator.a;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC5050b;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
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
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@SuppressLint({"ViewConstructor"})
/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C5052b extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g> {
    public static final int B = 8;

    @NotNull
    public final StateFlow A;

    @NotNull
    public final Context j;

    @NotNull
    public final C5023e k;

    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.h l;

    @NotNull
    public final r m;

    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y n;

    @NotNull
    public final com.moloco.sdk.internal.C o;

    @NotNull
    public final CoroutineScope p;

    @NotNull
    public final com.moloco.sdk.internal.services.s q;

    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.h r;

    @NotNull
    public final String s;

    @Nullable
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i t;

    @Nullable
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g u;

    @Nullable
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.w> v;

    @Nullable
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e> w;

    @Nullable
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e> x;

    @NotNull
    public final InterfaceC5050b y;

    @NotNull
    public final MutableStateFlow z;

    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.b$a */
    public static final class a implements InterfaceC5050b {
        public final MutableStateFlow a;
        public final StateFlow b;
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a d;

        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.b$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C1576a {
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

        @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.AggregatedBanner$adLoader$1$load$1", f = "AggregatedBanner.kt", l = {109}, m = "invokeSuspend")
        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.b$a$b, reason: collision with other inner class name */
        public static final class C1577b extends SuspendLambda implements Function2 {
            public int a;
            public final /* synthetic */ C5052b c;
            public final /* synthetic */ long d;
            public final /* synthetic */ InterfaceC5050b.a e;

            /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.b$a$b$a, reason: collision with other inner class name */
            public static final class C1578a implements InterfaceC5050b.a {
                public final /* synthetic */ InterfaceC5050b.a a;
                public final /* synthetic */ C5052b b;

                /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.b$a$b$a$a, reason: collision with other inner class name */
                public /* synthetic */ class C1579a {
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

                public C1578a(InterfaceC5050b.a aVar, C5052b c5052b) {
                    this.a = aVar;
                    this.b = c5052b;
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
                    switch (creativeType == null ? -1 : C1579a.a[creativeType.ordinal()]) {
                        case -1:
                            MolocoLogger.error$default(MolocoLogger.INSTANCE, this.b.s, "creativeType is null", new Throwable(), false, 8, null);
                            return;
                        case 0:
                        default:
                            throw new NoWhenBranchMatchedException();
                        case 1:
                            InterfaceC5050b.a aVar = this.a;
                            if (aVar != null) {
                                aVar.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a.h);
                                return;
                            }
                            return;
                        case 2:
                            InterfaceC5050b.a aVar2 = this.a;
                            if (aVar2 != null) {
                                aVar2.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a.i);
                                return;
                            }
                            return;
                        case 3:
                            InterfaceC5050b.a aVar3 = this.a;
                            if (aVar3 != null) {
                                aVar3.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a.j);
                                return;
                            }
                            return;
                        case 4:
                        case 5:
                        case 6:
                            MolocoLogger.error$default(MolocoLogger.INSTANCE, this.b.s, "Template creative types should not be used with AggregatedBanner. Use TemplateBannerView instead.", null, false, 12, null);
                            return;
                        case 7:
                            MolocoLogger.error$default(MolocoLogger.INSTANCE, this.b.s, "Unknown creative type for timeout error", null, false, 12, null);
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
            public C1577b(C5052b c5052b, long j, InterfaceC5050b.a aVar, Continuation continuation) {
                super(2, continuation);
                this.c = c5052b;
                this.d = j;
                this.e = aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((C1577b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return a.this.new C1577b(this.c, this.d, this.e, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    a aVar = a.this;
                    this.a = 1;
                    if (aVar.a(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B bannerImpl = this.c.getBannerImpl();
                if (bannerImpl != null) {
                    bannerImpl.a(this.d, new C1578a(this.e, this.c));
                }
                return Unit.INSTANCE;
            }
        }

        @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.AggregatedBanner$adLoader$1", f = "AggregatedBanner.kt", l = {160}, m = "prepareBanner")
        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.b$a$c */
        public static final class c extends ContinuationImpl {
            public Object a;
            public /* synthetic */ Object b;
            public int d;

            public c(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.b = obj;
                this.d |= Integer.MIN_VALUE;
                return a.this.a(this);
            }
        }

        @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.AggregatedBanner$adLoader$1$prepareBanner$2", f = "AggregatedBanner.kt", l = {}, m = "invokeSuspend")
        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.b$a$d */
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
                d dVar = a.this.new d(continuation);
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
                a.this.a.setValue(Boxing.boxBoolean(this.b));
                return Unit.INSTANCE;
            }
        }

        @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.AggregatedBanner$adLoader$1$prepareBanner$3", f = "AggregatedBanner.kt", l = {}, m = "invokeSuspend")
        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.b$a$e */
        public static final class e extends SuspendLambda implements Function2 {
            public int a;
            public /* synthetic */ boolean b;
            public final /* synthetic */ C5052b c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(C5052b c5052b, Continuation continuation) {
                super(2, continuation);
                this.c = c5052b;
            }

            public final Object a(boolean z, Continuation continuation) {
                return ((e) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                e eVar = new e(this.c, continuation);
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
                this.c.z.setValue(Boxing.boxBoolean(this.b));
                return Unit.INSTANCE;
            }
        }

        @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.AggregatedBanner$adLoader$1$prepareBanner$crType$1", f = "AggregatedBanner.kt", l = {}, m = "invokeSuspend")
        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.b$a$f */
        public static final class f extends SuspendLambda implements Function2 {
            public int a;
            public final /* synthetic */ C5052b b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public f(C5052b c5052b, Continuation continuation) {
                super(2, continuation);
                this.b = c5052b;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new f(this.b, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i c = C5059h.a.c(this.b.k.getAdm());
                this.b.t = c;
                return c;
            }
        }

        public a(com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a aVar) {
            this.d = aVar;
            MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(Boolean.FALSE);
            this.a = MutableStateFlow;
            this.b = FlowKt.asStateFlow(MutableStateFlow);
        }

        @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC5050b
        public StateFlow isLoaded() {
            return this.b;
        }

        @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC5050b
        public void a(long j, InterfaceC5050b.a aVar) {
            BuildersKt__Builders_commonKt.launch$default(C5052b.this.p, null, null, new C1577b(C5052b.this, j, aVar, null), 3, null);
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x007f  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0085  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x01c1  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x01e3  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0099  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00b0  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x0129  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x015b  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x003a  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object a(Continuation continuation) {
            c cVar;
            int i;
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i creativeType;
            a aVar;
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B bannerImpl;
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B bannerImpl2;
            StateFlow l;
            Flow onEach;
            StateFlow isLoaded;
            Flow onEach2;
            if (continuation instanceof c) {
                cVar = (c) continuation;
                int i2 = cVar.d;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    cVar.d = i2 - Integer.MIN_VALUE;
                    Object obj = cVar.b;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = cVar.d;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        MolocoLogger.debug$default(MolocoLogger.INSTANCE, C5052b.this.s, "Preparing banner", false, 4, null);
                        creativeType = C5052b.this.getCreativeType();
                        if (creativeType != null) {
                            aVar = this;
                            switch (C1576a.a[creativeType.ordinal()]) {
                                case 1:
                                    C5052b.this.o.a(C5052b.this);
                                    C5052b.this.v = new N(C5052b.this.j, aVar.d, C5052b.this.l.c(), C5052b.this.m, C5052b.this.p, new L(C5052b.this.k, C5052b.this.p, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.f.a(C5052b.this.j), a.C1563a.a.a(), true, null, 32, null));
                                    break;
                                case 2:
                                    C5052b.this.w = new z(C5052b.this.j, C5052b.this.k.getAdm(), C5052b.this.m, C5052b.this.n, null, C5052b.this.p, 16, null);
                                    break;
                                case 3:
                                    Context context = C5052b.this.j;
                                    com.moloco.sdk.internal.services.s sVar = C5052b.this.q;
                                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.h hVar = C5052b.this.r;
                                    com.moloco.sdk.internal.ortb.model.w molocoSdkClickMetaData = C5052b.this.k.getExt().getMolocoSdkClickMetaData();
                                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.a aVar2 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.a(context, null, sVar, hVar, (molocoSdkClickMetaData != null ? molocoSdkClickMetaData.getBannerClickMetaData() : null) != null, null, 34, null);
                                    C5052b.this.x = new F(C5052b.this.j, C5052b.this.n, aVar2, new E(C5052b.this.k.getAdm(), C5052b.this.p, aVar2), C5052b.this.p, null, 32, null);
                                    break;
                                case 4:
                                case 5:
                                case 6:
                                    MolocoLogger.error$default(MolocoLogger.INSTANCE, C5052b.this.s, "Template creative types should not be used with AggregatedBanner. Use TemplateBannerView instead.", null, false, 12, null);
                                    break;
                                case 7:
                                    MolocoLogger.error$default(MolocoLogger.INSTANCE, C5052b.this.s, "Unknown creative type for timeout error", null, false, 12, null);
                                    break;
                                default:
                                    throw new NoWhenBranchMatchedException();
                            }
                            bannerImpl = C5052b.this.getBannerImpl();
                            if (bannerImpl != null && (isLoaded = bannerImpl.isLoaded()) != null && (onEach2 = FlowKt.onEach(isLoaded, aVar.new d(null))) != null) {
                                FlowKt.launchIn(onEach2, C5052b.this.p);
                            }
                            bannerImpl2 = C5052b.this.getBannerImpl();
                            if (bannerImpl2 != null && (l = bannerImpl2.l()) != null && (onEach = FlowKt.onEach(l, new e(C5052b.this, null))) != null) {
                                FlowKt.launchIn(onEach, C5052b.this.p);
                            }
                            C5052b c5052b = C5052b.this;
                            c5052b.setAdShowListener(c5052b.getAdShowListener());
                            return Unit.INSTANCE;
                        }
                        CoroutineContext coroutineContext = com.moloco.sdk.internal.scheduling.b.a().getDefault();
                        f fVar = new f(C5052b.this, null);
                        cVar.a = this;
                        cVar.d = 1;
                        obj = BuildersKt.withContext(coroutineContext, fVar, cVar);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        aVar = this;
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        aVar = (a) cVar.a;
                        ResultKt.throwOnFailure(obj);
                    }
                    creativeType = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i) obj;
                    switch (C1576a.a[creativeType.ordinal()]) {
                    }
                    bannerImpl = C5052b.this.getBannerImpl();
                    if (bannerImpl != null) {
                        FlowKt.launchIn(onEach2, C5052b.this.p);
                    }
                    bannerImpl2 = C5052b.this.getBannerImpl();
                    if (bannerImpl2 != null) {
                        FlowKt.launchIn(onEach, C5052b.this.p);
                    }
                    C5052b c5052b2 = C5052b.this;
                    c5052b2.setAdShowListener(c5052b2.getAdShowListener());
                    return Unit.INSTANCE;
                }
            }
            cVar = new c(continuation);
            Object obj2 = cVar.b;
            Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i = cVar.d;
            if (i != 0) {
            }
            creativeType = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i) obj2;
            switch (C1576a.a[creativeType.ordinal()]) {
            }
            bannerImpl = C5052b.this.getBannerImpl();
            if (bannerImpl != null) {
            }
            bannerImpl2 = C5052b.this.getBannerImpl();
            if (bannerImpl2 != null) {
            }
            C5052b c5052b22 = C5052b.this;
            c5052b22.setAdShowListener(c5052b22.getAdShowListener());
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.AggregatedBanner$destroy$1", f = "AggregatedBanner.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.b$b, reason: collision with other inner class name */
    public static final class C1580b extends SuspendLambda implements Function2 {
        public int a;

        public C1580b(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C1580b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return C5052b.this.new C1580b(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            C5052b.super.destroy();
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B bannerImpl = C5052b.this.getBannerImpl();
            if (bannerImpl != null) {
                bannerImpl.destroy();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5052b(@NotNull Context context, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a customUserEventBuilderService, @Nullable com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i iVar, @NotNull C5023e bid, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.h options, @NotNull r externalLinkHandler, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y watermark, @NotNull com.moloco.sdk.internal.C viewLifecycleOwner, @NotNull CoroutineScope scope, @NotNull com.moloco.sdk.internal.services.s clickthroughService, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.h buttonTracker) {
        super(context, scope);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(customUserEventBuilderService, "customUserEventBuilderService");
        Intrinsics.checkNotNullParameter(bid, "bid");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        Intrinsics.checkNotNullParameter(watermark, "watermark");
        Intrinsics.checkNotNullParameter(viewLifecycleOwner, "viewLifecycleOwner");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(clickthroughService, "clickthroughService");
        Intrinsics.checkNotNullParameter(buttonTracker, "buttonTracker");
        this.j = context;
        this.k = bid;
        this.l = options;
        this.m = externalLinkHandler;
        this.n = watermark;
        this.o = viewLifecycleOwner;
        this.p = scope;
        this.q = clickthroughService;
        this.r = buttonTracker;
        this.s = "AggregatedBanner";
        setTag("MolocoAggregatedBannerView");
        this.t = iVar;
        this.y = new a(customUserEventBuilderService);
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        this.z = MutableStateFlow;
        this.A = FlowKt.asStateFlow(MutableStateFlow);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B<?> getBannerImpl() {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.w> b = this.v;
        if (b != null) {
            return b;
        }
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e> b2 = this.w;
        return b2 == null ? this.x : b2;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k
    public void destroy() {
        BuildersKt__Builders_commonKt.launch$default(this.p, null, null, new C1580b(null), 3, null);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.D, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B
    @NotNull
    public InterfaceC5050b getAdLoader() {
        return this.y;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.j
    @Nullable
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i getCreativeType() {
        return this.t;
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
    @Nullable
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g getAdShowListener() {
        return this.u;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B
    public void k() {
        setAdView(getBannerImpl());
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC5049a
    @NotNull
    public StateFlow l() {
        return this.A;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B
    public void setAdShowListener(@Nullable com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g gVar) {
        this.u = gVar;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.w> b = this.v;
        if (b != null) {
            b.setAdShowListener(gVar);
            return;
        }
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e> b2 = this.w;
        if (b2 == null) {
            b2 = this.x;
        }
        if (b2 != null) {
            b2.setAdShowListener(gVar);
        }
    }
}
