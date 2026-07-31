package com.moloco.sdk.internal.ilrd.provider;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.IlrdRequest;
import com.moloco.sdk.internal.ilrd.c;
import com.moloco.sdk.internal.ilrd.g;
import com.unity3d.mediation.LevelPlay;
import com.unity3d.mediation.impression.LevelPlayImpressionData;
import com.unity3d.mediation.impression.LevelPlayImpressionDataListener;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
/* loaded from: classes9.dex */
public final class b implements c {

    @NotNull
    public static final a h = new a(null);
    public static final int i = 8;

    @NotNull
    public static final String j = "IronsourceIlrd";

    @NotNull
    public final Context a;

    @NotNull
    public final CoroutineScope b;

    @NotNull
    public final com.moloco.sdk.internal.ilrd.model.a c;

    @NotNull
    public final Lazy d;

    @NotNull
    public final Lazy e;

    @NotNull
    public final MutableStateFlow f;

    @NotNull
    public final MutableSharedFlow g;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    /* renamed from: com.moloco.sdk.internal.ilrd.provider.b$b, reason: collision with other inner class name */
    public static final class C1535b implements LevelPlayImpressionDataListener {

        @DebugMetadata(c = "com.moloco.sdk.internal.ilrd.provider.IronsourceIlrd$createCallback$1$onImpressionSuccess$1", f = "IronsourceIlrd.kt", l = {97}, m = "invokeSuspend")
        /* renamed from: com.moloco.sdk.internal.ilrd.provider.b$b$a */
        public static final class a extends SuspendLambda implements Function2 {
            public int a;
            public final /* synthetic */ b b;
            public final /* synthetic */ c.a.C1532a c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(b bVar, c.a.C1532a c1532a, Continuation continuation) {
                super(2, continuation);
                this.b = bVar;
                this.c = c1532a;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new a(this.b, this.c, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    MutableSharedFlow mutableSharedFlow = this.b.g;
                    c.a.C1532a c1532a = this.c;
                    this.a = 1;
                    if (mutableSharedFlow.emit(c1532a, this) == coroutine_suspended) {
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

        public C1535b() {
        }

        @Override // com.unity3d.mediation.impression.LevelPlayImpressionDataListener
        public void onImpressionSuccess(LevelPlayImpressionData impressionData) {
            Intrinsics.checkNotNullParameter(impressionData, "impressionData");
            if (CoroutineScopeKt.isActive(b.this.b)) {
                BuildersKt__Builders_commonKt.launch$default(b.this.b, null, null, new a(b.this, b.this.a(impressionData), null), 3, null);
            }
        }
    }

    public b(@NotNull Context context, @NotNull CoroutineScope scope) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.a = context;
        this.b = scope;
        this.c = com.moloco.sdk.internal.ilrd.model.a.b;
        this.d = LazyKt.lazy(new Function0() { // from class: com.moloco.sdk.internal.ilrd.provider.b$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                return b.d(b.this);
            }
        });
        this.e = LazyKt.lazy(new Function0() { // from class: com.moloco.sdk.internal.ilrd.provider.b$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                return b.c(b.this);
            }
        });
        this.f = StateFlowKt.MutableStateFlow(g.c.b);
        this.g = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
    }

    public static final SharedFlow c(b bVar) {
        return FlowKt.asSharedFlow(bVar.g);
    }

    public static final StateFlow d(b bVar) {
        return FlowKt.asStateFlow(bVar.f);
    }

    private final Object e() {
        Object m8023constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            LevelPlay levelPlay = LevelPlay.INSTANCE;
            LevelPlayImpressionData.a aVar = LevelPlayImpressionData.Companion;
            LevelPlay.addImpressionDataListener(d());
            m8023constructorimpl = Result.m8023constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(th));
        }
        Throwable m8026exceptionOrNullimpl = Result.m8026exceptionOrNullimpl(m8023constructorimpl);
        return m8026exceptionOrNullimpl == null ? Result.m8023constructorimpl(Unit.INSTANCE) : Result.m8023constructorimpl(ResultKt.createFailure(m8026exceptionOrNullimpl));
    }

    @Override // com.moloco.sdk.internal.ilrd.c
    @NotNull
    public StateFlow getState() {
        return (StateFlow) this.d.getValue();
    }

    @Override // com.moloco.sdk.internal.ilrd.c
    @NotNull
    public synchronized Object b() {
        Object e;
        try {
            e = e();
            Throwable m8026exceptionOrNullimpl = Result.m8026exceptionOrNullimpl(e);
            if (m8026exceptionOrNullimpl != null) {
                this.f.setValue(new g.a(m8026exceptionOrNullimpl.toString()));
            }
            if (Result.m8029isSuccessimpl(e)) {
                this.f.setValue(g.b.b);
            }
        } catch (Throwable th) {
            throw th;
        }
        return e;
    }

    @Override // com.moloco.sdk.internal.ilrd.c
    @NotNull
    public SharedFlow c() {
        return (SharedFlow) this.e.getValue();
    }

    public final C1535b d() {
        return new C1535b();
    }

    @Override // com.moloco.sdk.internal.ilrd.c
    @NotNull
    public com.moloco.sdk.internal.ilrd.model.a a() {
        return this.c;
    }

    public final c.a.C1532a a(LevelPlayImpressionData levelPlayImpressionData) {
        IlrdRequest.LevelPlayImpression.Builder newBuilder = IlrdRequest.LevelPlayImpression.newBuilder();
        try {
            Result.Companion companion = Result.INSTANCE;
            String auctionId = levelPlayImpressionData.getAuctionId();
            Result.m8023constructorimpl(auctionId != null ? newBuilder.setAuctionId(auctionId) : null);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m8023constructorimpl(ResultKt.createFailure(th));
        }
        try {
            String adFormat = levelPlayImpressionData.getAdFormat();
            Result.m8023constructorimpl(adFormat != null ? newBuilder.setAdFormat(adFormat) : null);
        } catch (Throwable th2) {
            Result.Companion companion3 = Result.INSTANCE;
            Result.m8023constructorimpl(ResultKt.createFailure(th2));
        }
        try {
            String adNetwork = levelPlayImpressionData.getAdNetwork();
            Result.m8023constructorimpl(adNetwork != null ? newBuilder.setNetworkName(adNetwork) : null);
        } catch (Throwable th3) {
            Result.Companion companion4 = Result.INSTANCE;
            Result.m8023constructorimpl(ResultKt.createFailure(th3));
        }
        try {
            String instanceName = levelPlayImpressionData.getInstanceName();
            Result.m8023constructorimpl(instanceName != null ? newBuilder.setInstanceName(instanceName) : null);
        } catch (Throwable th4) {
            Result.Companion companion5 = Result.INSTANCE;
            Result.m8023constructorimpl(ResultKt.createFailure(th4));
        }
        try {
            String instanceId = levelPlayImpressionData.getInstanceId();
            Result.m8023constructorimpl(instanceId != null ? newBuilder.setInstanceId(instanceId) : null);
        } catch (Throwable th5) {
            Result.Companion companion6 = Result.INSTANCE;
            Result.m8023constructorimpl(ResultKt.createFailure(th5));
        }
        try {
            String country = levelPlayImpressionData.getCountry();
            Result.m8023constructorimpl(country != null ? newBuilder.setCountryCode(country) : null);
        } catch (Throwable th6) {
            Result.Companion companion7 = Result.INSTANCE;
            Result.m8023constructorimpl(ResultKt.createFailure(th6));
        }
        try {
            String placement = levelPlayImpressionData.getPlacement();
            Result.m8023constructorimpl(placement != null ? newBuilder.setPlacement(placement) : null);
        } catch (Throwable th7) {
            Result.Companion companion8 = Result.INSTANCE;
            Result.m8023constructorimpl(ResultKt.createFailure(th7));
        }
        try {
            Double revenue = levelPlayImpressionData.getRevenue();
            Result.m8023constructorimpl(revenue != null ? newBuilder.setRevenue(revenue.doubleValue()) : null);
        } catch (Throwable th8) {
            Result.Companion companion9 = Result.INSTANCE;
            Result.m8023constructorimpl(ResultKt.createFailure(th8));
        }
        try {
            String precision = levelPlayImpressionData.getPrecision();
            Result.m8023constructorimpl(precision != null ? newBuilder.setPrecision(precision) : null);
        } catch (Throwable th9) {
            Result.Companion companion10 = Result.INSTANCE;
            Result.m8023constructorimpl(ResultKt.createFailure(th9));
        }
        try {
            String ab = levelPlayImpressionData.getAb();
            Result.m8023constructorimpl(ab != null ? newBuilder.setAb(ab) : null);
        } catch (Throwable th10) {
            Result.Companion companion11 = Result.INSTANCE;
            Result.m8023constructorimpl(ResultKt.createFailure(th10));
        }
        try {
            String segmentName = levelPlayImpressionData.getSegmentName();
            Result.m8023constructorimpl(segmentName != null ? newBuilder.setSegmentName(segmentName) : null);
        } catch (Throwable th11) {
            Result.Companion companion12 = Result.INSTANCE;
            Result.m8023constructorimpl(ResultKt.createFailure(th11));
        }
        try {
            String encryptedCPM = levelPlayImpressionData.getEncryptedCPM();
            Result.m8023constructorimpl(encryptedCPM != null ? newBuilder.setEncryptedCpm(encryptedCPM) : null);
        } catch (Throwable th12) {
            Result.Companion companion13 = Result.INSTANCE;
            Result.m8023constructorimpl(ResultKt.createFailure(th12));
        }
        try {
            String creativeId = levelPlayImpressionData.getCreativeId();
            Result.m8023constructorimpl(creativeId != null ? newBuilder.setCreativeId(creativeId) : null);
        } catch (Throwable th13) {
            Result.Companion companion14 = Result.INSTANCE;
            Result.m8023constructorimpl(ResultKt.createFailure(th13));
        }
        IlrdRequest.LevelPlayImpression build = newBuilder.build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return new c.a.C1532a(build);
    }
}
