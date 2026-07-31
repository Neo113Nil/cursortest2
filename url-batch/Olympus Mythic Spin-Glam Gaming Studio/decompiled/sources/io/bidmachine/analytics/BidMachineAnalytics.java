package io.bidmachine.analytics;

import android.content.Context;
import android.util.Base64;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import io.bidmachine.analytics.internal.a.C5890a;
import io.bidmachine.analytics.internal.b.C5893a;
import io.bidmachine.analytics.internal.c.C5894a;
import io.bidmachine.analytics.internal.d.C5895a;
import io.bidmachine.analytics.internal.g.EnumC5899a;
import io.bidmachine.analytics.internal.h.C5910e;
import java.util.Map;
import java.util.concurrent.Executors;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.ExecutorsKt;
import kotlinx.coroutines.SupervisorKt;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\bJ\u001f\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\f\u0010\rJ)\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0007¢\u0006\u0004\b\f\u0010\u0010J/\u0010\u0015\u001a\u001a\u0012\u0004\u0012\u00020\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00010\u00130\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0017\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ)\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u001d\u0010\u0010J\u0017\u0010\u001d\u001a\u00020\u001f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001d\u0010 R!\u0010&\u001a\u00020!8@X\u0081\u0084\u0002¢\u0006\u0012\n\u0004\b\u001d\u0010\"\u0012\u0004\b%\u0010\u0003\u001a\u0004\b#\u0010$R$\u0010+\u001a\u00020\u00142\u0006\u0010'\u001a\u00020\u00148\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b\t\u0010(\u001a\u0004\b)\u0010*R$\u00102\u001a\u0004\u0018\u00010\u001c8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u0018\u00105\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104¨\u00066"}, d2 = {"Lio/bidmachine/analytics/BidMachineAnalytics;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "initialize", "(Landroid/content/Context;)V", "b", "Lio/bidmachine/analytics/AnalyticsConfig;", "analyticsConfig", "configure", "(Landroid/content/Context;Lio/bidmachine/analytics/AnalyticsConfig;)V", "Lio/bidmachine/analytics/ConfigureListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "(Landroid/content/Context;Lio/bidmachine/analytics/AnalyticsConfig;Lio/bidmachine/analytics/ConfigureListener;)V", "", "typeId", "", "", "getImpData", "(I)Ljava/util/Map;", "key", "getProperty", "(Ljava/lang/String;)Ljava/lang/Object;", "", "outPublicKey", "Lio/bidmachine/analytics/internal/b/a;", "a", "([B)Lio/bidmachine/analytics/internal/b/a;", "Lio/bidmachine/analytics/internal/a/a;", "(Landroid/content/Context;)Lio/bidmachine/analytics/internal/a/a;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/Lazy;", "getScope$bidmachine_android_sdk_j_3_7_1", "()Lkotlinx/coroutines/CoroutineScope;", "getScope$bidmachine_android_sdk_j_3_7_1$annotations", "scope", "<set-?>", "Ljava/lang/String;", "getSessionId$bidmachine_android_sdk_j_3_7_1", "()Ljava/lang/String;", "sessionId", "c", "Lio/bidmachine/analytics/internal/b/a;", "getEncryptionManager$bidmachine_android_sdk_j_3_7_1", "()Lio/bidmachine/analytics/internal/b/a;", "setEncryptionManager$bidmachine_android_sdk_j_3_7_1", "(Lio/bidmachine/analytics/internal/b/a;)V", "encryptionManager", "d", "Lio/bidmachine/analytics/internal/a/a;", "analyticsContext", "bidmachine-android-sdk_j_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes5.dex */
public final class BidMachineAnalytics {
    public static final BidMachineAnalytics INSTANCE = new BidMachineAnalytics();

    /* renamed from: a, reason: from kotlin metadata */
    private static final Lazy scope = LazyKt.lazy(b.a);

    /* renamed from: b, reason: from kotlin metadata */
    private static String sessionId = "";

    /* renamed from: c, reason: from kotlin metadata */
    private static C5893a encryptionManager;

    /* renamed from: d, reason: from kotlin metadata */
    private static C5890a analyticsContext;

    static final class a extends SuspendLambda implements Function2 {
        int a;
        private /* synthetic */ Object b;
        final /* synthetic */ AnalyticsConfig c;
        final /* synthetic */ String d;
        final /* synthetic */ Context e;
        final /* synthetic */ ConfigureListener f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(AnalyticsConfig analyticsConfig, String str, Context context, ConfigureListener configureListener, Continuation continuation) {
            super(2, continuation);
            this.c = analyticsConfig;
            this.d = str;
            this.e = context;
            this.f = configureListener;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            a aVar = new a(this.c, this.d, this.e, this.f, continuation);
            aVar.b = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object m8023constructorimpl;
            Object m8023constructorimpl2;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            AnalyticsConfig analyticsConfig = this.c;
            try {
                Result.Companion companion = Result.INSTANCE;
                BidMachineAnalytics bidMachineAnalytics = BidMachineAnalytics.INSTANCE;
                bidMachineAnalytics.setEncryptionManager$bidmachine_android_sdk_j_3_7_1(bidMachineAnalytics.a(Base64.decode(analyticsConfig.getBpk(), 2)));
                m8023constructorimpl = Result.m8023constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(th));
            }
            if (Result.m8029isSuccessimpl(m8023constructorimpl)) {
            }
            Result.m8026exceptionOrNullimpl(m8023constructorimpl);
            try {
                BidMachineAnalytics.INSTANCE.a(this.e, this.c, this.f);
                m8023constructorimpl2 = Result.m8023constructorimpl(Unit.INSTANCE);
            } catch (Throwable th2) {
                Result.Companion companion3 = Result.INSTANCE;
                m8023constructorimpl2 = Result.m8023constructorimpl(ResultKt.createFailure(th2));
            }
            if (Result.m8029isSuccessimpl(m8023constructorimpl2)) {
            }
            Result.m8026exceptionOrNullimpl(m8023constructorimpl2);
            return Unit.INSTANCE;
        }
    }

    static final class b extends Lambda implements Function0 {
        public static final b a = new b();

        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CoroutineScope mo4828invoke() {
            return CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default(null, 1, null).plus(ExecutorsKt.from(Executors.newSingleThreadExecutor())));
        }
    }

    private BidMachineAnalytics() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C5893a a(byte[] outPublicKey) {
        C5894a c5894a = new C5894a();
        return new C5893a(c5894a, new C5895a(outPublicKey, c5894a.getName(), null, false, 12, null));
    }

    private final void b(Context context) {
        C5910e.a.d(a(context));
    }

    public static final void configure(Context context, AnalyticsConfig analyticsConfig) {
        configure(context, analyticsConfig, null);
    }

    public static final Map<String, Map<String, Object>> getImpData(int typeId) {
        EnumC5899a enumC5899a = (EnumC5899a) ArraysKt.getOrNull(EnumC5899a.values(), typeId);
        return enumC5899a == null ? MapsKt.emptyMap() : C5910e.a.a(enumC5899a);
    }

    public static final Object getProperty(String key) {
        return C5910e.a.a(key);
    }

    public static /* synthetic */ void getScope$bidmachine_android_sdk_j_3_7_1$annotations() {
    }

    public static final void initialize(Context context) {
        C5910e.a.c(INSTANCE.a(context));
    }

    public final C5893a getEncryptionManager$bidmachine_android_sdk_j_3_7_1() {
        return encryptionManager;
    }

    public final CoroutineScope getScope$bidmachine_android_sdk_j_3_7_1() {
        return (CoroutineScope) scope.getValue();
    }

    public final String getSessionId$bidmachine_android_sdk_j_3_7_1() {
        return sessionId;
    }

    public final void setEncryptionManager$bidmachine_android_sdk_j_3_7_1(C5893a c5893a) {
        encryptionManager = c5893a;
    }

    public static final void configure(Context context, AnalyticsConfig analyticsConfig, ConfigureListener listener) {
        String sessionId2 = analyticsConfig.getSessionId();
        sessionId = sessionId2;
        initialize(context);
        BidMachineAnalytics bidMachineAnalytics = INSTANCE;
        bidMachineAnalytics.b(context);
        BuildersKt__Builders_commonKt.launch$default(bidMachineAnalytics.getScope$bidmachine_android_sdk_j_3_7_1(), null, null, new a(analyticsConfig, sessionId2, context.getApplicationContext(), listener, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(Context context, AnalyticsConfig analyticsConfig, ConfigureListener listener) {
        C5890a a2 = a(context);
        io.bidmachine.analytics.internal.z.a.a.a(a2, analyticsConfig);
        C5910e.a.a(a2, analyticsConfig);
        if (listener != null) {
            listener.onConfigured();
        }
    }

    private final synchronized C5890a a(Context context) {
        C5890a c5890a;
        c5890a = analyticsContext;
        if (c5890a == null) {
            c5890a = new C5890a(context);
            analyticsContext = c5890a;
        }
        return c5890a;
    }
}
