package com.unity3d.ads.core.domain.work;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.datasource.UniversalRequestDataSource;
import com.unity3d.ads.core.domain.GetRequestPolicy;
import com.unity3d.ads.core.domain.events.UniversalRequestEventSender;
import com.unity3d.ads.datastore.UniversalRequestStoreOuterClass;
import com.unity3d.services.core.di.IServiceComponent;
import com.unity3d.services.core.di.ServiceProvider;
import gatewayprotocol.v1.UniversalRequestOuterClass;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DiagnosticEventJob.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000e\u0010\u0019\u001a\u00020\u001aH\u0096@¢\u0006\u0002\u0010\u001bR\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0014\u001a\u00020\u00158TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u000e\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001c"}, d2 = {"Lcom/unity3d/ads/core/domain/work/DiagnosticEventJob;", "Lcom/unity3d/ads/core/domain/work/UniversalRequestJob;", "Lcom/unity3d/services/core/di/IServiceComponent;", "context", "Landroid/content/Context;", "workerParams", "Landroidx/work/WorkerParameters;", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "getDiagnosticRequestPolicy", "Lcom/unity3d/ads/core/domain/GetRequestPolicy;", "getGetDiagnosticRequestPolicy", "()Lcom/unity3d/ads/core/domain/GetRequestPolicy;", "getDiagnosticRequestPolicy$delegate", "Lkotlin/Lazy;", "diagnosticEventRequestWorkModifier", "Lcom/unity3d/ads/core/domain/work/DiagnosticEventRequestWorkModifier;", "getDiagnosticEventRequestWorkModifier", "()Lcom/unity3d/ads/core/domain/work/DiagnosticEventRequestWorkModifier;", "diagnosticEventRequestWorkModifier$delegate", "universalRequestEventSender", "Lcom/unity3d/ads/core/domain/events/UniversalRequestEventSender;", "getUniversalRequestEventSender", "()Lcom/unity3d/ads/core/domain/events/UniversalRequestEventSender;", "universalRequestEventSender$delegate", "doWork", "Landroidx/work/ListenableWorker$Result;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class DiagnosticEventJob extends UniversalRequestJob implements IServiceComponent {

    /* renamed from: diagnosticEventRequestWorkModifier$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy diagnosticEventRequestWorkModifier;

    /* renamed from: getDiagnosticRequestPolicy$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy getDiagnosticRequestPolicy;

    /* renamed from: universalRequestEventSender$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy universalRequestEventSender;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiagnosticEventJob(@NotNull Context context, @NotNull WorkerParameters workerParams) {
        super(context, workerParams);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(workerParams, "workerParams");
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final String str = ServiceProvider.NAMED_OTHER_REQ;
        this.getDiagnosticRequestPolicy = LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.unity3d.ads.core.domain.work.DiagnosticEventJob$special$$inlined$inject$default$1
            /* JADX WARN: Type inference failed for: r0v3, types: [com.unity3d.ads.core.domain.GetRequestPolicy, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final GetRequestPolicy mo4828invoke() {
                IServiceComponent iServiceComponent = IServiceComponent.this;
                return iServiceComponent.getServiceProvider().getRegistry().getService(str, Reflection.getOrCreateKotlinClass(GetRequestPolicy.class));
            }
        });
        final String str2 = "";
        this.diagnosticEventRequestWorkModifier = LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.unity3d.ads.core.domain.work.DiagnosticEventJob$special$$inlined$inject$default$2
            /* JADX WARN: Type inference failed for: r0v3, types: [com.unity3d.ads.core.domain.work.DiagnosticEventRequestWorkModifier, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final DiagnosticEventRequestWorkModifier mo4828invoke() {
                IServiceComponent iServiceComponent = IServiceComponent.this;
                return iServiceComponent.getServiceProvider().getRegistry().getService(str2, Reflection.getOrCreateKotlinClass(DiagnosticEventRequestWorkModifier.class));
            }
        });
        final String str3 = ServiceProvider.DIAGNOSTICS_EVENT_SENDER;
        this.universalRequestEventSender = LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.unity3d.ads.core.domain.work.DiagnosticEventJob$special$$inlined$inject$default$3
            /* JADX WARN: Type inference failed for: r0v3, types: [com.unity3d.ads.core.domain.events.UniversalRequestEventSender, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final UniversalRequestEventSender mo4828invoke() {
                IServiceComponent iServiceComponent = IServiceComponent.this;
                return iServiceComponent.getServiceProvider().getRegistry().getService(str3, Reflection.getOrCreateKotlinClass(UniversalRequestEventSender.class));
            }
        });
    }

    private final GetRequestPolicy getGetDiagnosticRequestPolicy() {
        return (GetRequestPolicy) this.getDiagnosticRequestPolicy.getValue();
    }

    private final DiagnosticEventRequestWorkModifier getDiagnosticEventRequestWorkModifier() {
        return (DiagnosticEventRequestWorkModifier) this.diagnosticEventRequestWorkModifier.getValue();
    }

    @Override // com.unity3d.ads.core.domain.work.UniversalRequestJob
    @NotNull
    protected UniversalRequestEventSender getUniversalRequestEventSender() {
        return (UniversalRequestEventSender) this.universalRequestEventSender.getValue();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:(2:3|(7:5|6|7|(1:(1:(1:(3:12|13|14)(2:16|17))(5:18|19|(1:21)|13|14))(2:22|23))(3:33|34|(2:36|37)(2:38|(1:40)))|24|25|(6:27|(1:29)|19|(0)|13|14)(2:30|31)))|7|(0)(0)|24|25|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x004a, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0086, code lost:
    
        r6 = kotlin.Result.INSTANCE;
        r8 = kotlin.Result.m8023constructorimpl(kotlin.ResultKt.createFailure(r8));
        r2 = r2;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00d3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0096 A[Catch: all -> 0x0032, TryCatch #0 {all -> 0x0032, blocks: (B:12:0x002d, B:13:0x00d4, B:18:0x003d, B:19:0x00c0, B:25:0x0090, B:27:0x0096, B:30:0x00d7, B:45:0x0086, B:34:0x0052, B:36:0x0062, B:23:0x0046, B:24:0x007b, B:38:0x006a), top: B:7:0x0025, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d7 A[Catch: all -> 0x0032, TRY_LEAVE, TryCatch #0 {all -> 0x0032, blocks: (B:12:0x002d, B:13:0x00d4, B:18:0x003d, B:19:0x00c0, B:25:0x0090, B:27:0x0096, B:30:0x00d7, B:45:0x0086, B:34:0x0052, B:36:0x0062, B:23:0x0046, B:24:0x007b, B:38:0x006a), top: B:7:0x0025, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    @Override // com.unity3d.ads.core.domain.work.UniversalRequestJob, androidx.work.CoroutineWorker
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object doWork(@NotNull Continuation continuation) {
        DiagnosticEventJob$doWork$1 diagnosticEventJob$doWork$1;
        ?? r2;
        Object m8023constructorimpl;
        try {
            if (continuation instanceof DiagnosticEventJob$doWork$1) {
                diagnosticEventJob$doWork$1 = (DiagnosticEventJob$doWork$1) continuation;
                int i = diagnosticEventJob$doWork$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    diagnosticEventJob$doWork$1.label = i - Integer.MIN_VALUE;
                    Object obj = diagnosticEventJob$doWork$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    r2 = diagnosticEventJob$doWork$1.label;
                    if (r2 != 0) {
                        ResultKt.throwOnFailure(obj);
                        ensureApplicationContextSet();
                        String string = getWorkerParams().getInputData().getString(UniversalRequestWorkerData.KEY_UNIVERSAL_REQUEST_ID);
                        if (string == null) {
                            ListenableWorker.Result success = ListenableWorker.Result.success();
                            Intrinsics.checkNotNullExpressionValue(success, "success(...)");
                            return success;
                        }
                        Result.Companion companion = Result.INSTANCE;
                        UniversalRequestDataSource universalRequestDataSource = getUniversalRequestDataSource();
                        diagnosticEventJob$doWork$1.L$0 = string;
                        diagnosticEventJob$doWork$1.label = 1;
                        obj = universalRequestDataSource.get(diagnosticEventJob$doWork$1);
                        r2 = string;
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (r2 != 1) {
                            if (r2 != 2) {
                                if (r2 != 3) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj);
                                return (ListenableWorker.Result) obj;
                            }
                            ResultKt.throwOnFailure(obj);
                            setRequestPolicy(getGetDiagnosticRequestPolicy().invoke());
                            diagnosticEventJob$doWork$1.label = 3;
                            obj = super.doWork(diagnosticEventJob$doWork$1);
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            return (ListenableWorker.Result) obj;
                        }
                        String str = (String) diagnosticEventJob$doWork$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        r2 = str;
                    }
                    m8023constructorimpl = Result.m8023constructorimpl(((UniversalRequestStoreOuterClass.UniversalRequestStore) obj).getUniversalRequestMapOrThrow(r2));
                    String str2 = r2;
                    if (Result.m8026exceptionOrNullimpl(m8023constructorimpl) == null) {
                        ListenableWorker.Result success2 = ListenableWorker.Result.success();
                        Intrinsics.checkNotNullExpressionValue(success2, "success(...)");
                        return success2;
                    }
                    UniversalRequestOuterClass.UniversalRequest parseFrom = UniversalRequestOuterClass.UniversalRequest.parseFrom((ByteString) m8023constructorimpl);
                    DiagnosticEventRequestWorkModifier diagnosticEventRequestWorkModifier = getDiagnosticEventRequestWorkModifier();
                    Intrinsics.checkNotNull(parseFrom);
                    UniversalRequestOuterClass.UniversalRequest invoke = diagnosticEventRequestWorkModifier.invoke(parseFrom);
                    UniversalRequestDataSource universalRequestDataSource2 = getUniversalRequestDataSource();
                    ByteString byteString = invoke.toByteString();
                    Intrinsics.checkNotNullExpressionValue(byteString, "toByteString(...)");
                    diagnosticEventJob$doWork$1.L$0 = null;
                    diagnosticEventJob$doWork$1.label = 2;
                    if (universalRequestDataSource2.set(str2, byteString, diagnosticEventJob$doWork$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    setRequestPolicy(getGetDiagnosticRequestPolicy().invoke());
                    diagnosticEventJob$doWork$1.label = 3;
                    obj = super.doWork(diagnosticEventJob$doWork$1);
                    if (obj == coroutine_suspended) {
                    }
                    return (ListenableWorker.Result) obj;
                }
            }
            if (r2 != 0) {
            }
            m8023constructorimpl = Result.m8023constructorimpl(((UniversalRequestStoreOuterClass.UniversalRequestStore) obj).getUniversalRequestMapOrThrow(r2));
            String str22 = r2;
            if (Result.m8026exceptionOrNullimpl(m8023constructorimpl) == null) {
            }
        } catch (Throwable th) {
            getLogger().trace("DiagnosticEventJob failed to process work", th);
            ListenableWorker.Result retry = ListenableWorker.Result.retry();
            Intrinsics.checkNotNullExpressionValue(retry, "retry(...)");
            return retry;
        }
        diagnosticEventJob$doWork$1 = new DiagnosticEventJob$doWork$1(this, continuation);
        Object obj2 = diagnosticEventJob$doWork$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        r2 = diagnosticEventJob$doWork$1.label;
    }
}
