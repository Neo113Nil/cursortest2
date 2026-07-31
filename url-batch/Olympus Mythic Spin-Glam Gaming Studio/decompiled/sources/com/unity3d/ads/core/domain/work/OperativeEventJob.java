package com.unity3d.ads.core.domain.work;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.domain.GetRequestPolicy;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.domain.events.UniversalRequestEventSender;
import com.unity3d.ads.core.extensions.TimeExtensionsKt;
import com.unity3d.services.core.di.IServiceComponent;
import com.unity3d.services.core.di.ServiceProvider;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.time.TimeSource$Monotonic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: OperativeEventJob.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000e\u0010\u0019\u001a\u00020\u001aH\u0096@¢\u0006\u0002\u0010\u001bR\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0014\u001a\u00020\u00158TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u000e\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001c"}, d2 = {"Lcom/unity3d/ads/core/domain/work/OperativeEventJob;", "Lcom/unity3d/ads/core/domain/work/UniversalRequestJob;", "Lcom/unity3d/services/core/di/IServiceComponent;", "context", "Landroid/content/Context;", "workerParams", "Landroidx/work/WorkerParameters;", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "getOperativeRequestPolicy", "Lcom/unity3d/ads/core/domain/GetRequestPolicy;", "getGetOperativeRequestPolicy", "()Lcom/unity3d/ads/core/domain/GetRequestPolicy;", "getOperativeRequestPolicy$delegate", "Lkotlin/Lazy;", "sendDiagnosticEvent", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "getSendDiagnosticEvent", "()Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "sendDiagnosticEvent$delegate", "universalRequestEventSender", "Lcom/unity3d/ads/core/domain/events/UniversalRequestEventSender;", "getUniversalRequestEventSender", "()Lcom/unity3d/ads/core/domain/events/UniversalRequestEventSender;", "universalRequestEventSender$delegate", "doWork", "Landroidx/work/ListenableWorker$Result;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class OperativeEventJob extends UniversalRequestJob implements IServiceComponent {

    /* renamed from: getOperativeRequestPolicy$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy getOperativeRequestPolicy;

    /* renamed from: sendDiagnosticEvent$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy sendDiagnosticEvent;

    /* renamed from: universalRequestEventSender$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy universalRequestEventSender;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OperativeEventJob(@NotNull Context context, @NotNull WorkerParameters workerParams) {
        super(context, workerParams);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(workerParams, "workerParams");
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final String str = ServiceProvider.NAMED_OPERATIVE_REQ;
        this.getOperativeRequestPolicy = LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.unity3d.ads.core.domain.work.OperativeEventJob$special$$inlined$inject$default$1
            /* JADX WARN: Type inference failed for: r0v3, types: [com.unity3d.ads.core.domain.GetRequestPolicy, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final GetRequestPolicy mo4828invoke() {
                IServiceComponent iServiceComponent = IServiceComponent.this;
                return iServiceComponent.getServiceProvider().getRegistry().getService(str, Reflection.getOrCreateKotlinClass(GetRequestPolicy.class));
            }
        });
        final String str2 = "";
        this.sendDiagnosticEvent = LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.unity3d.ads.core.domain.work.OperativeEventJob$special$$inlined$inject$default$2
            /* JADX WARN: Type inference failed for: r0v3, types: [com.unity3d.ads.core.domain.SendDiagnosticEvent, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final SendDiagnosticEvent mo4828invoke() {
                IServiceComponent iServiceComponent = IServiceComponent.this;
                return iServiceComponent.getServiceProvider().getRegistry().getService(str2, Reflection.getOrCreateKotlinClass(SendDiagnosticEvent.class));
            }
        });
        final String str3 = ServiceProvider.OPERATIVE_EVENT_SENDER;
        this.universalRequestEventSender = LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.unity3d.ads.core.domain.work.OperativeEventJob$special$$inlined$inject$default$3
            /* JADX WARN: Type inference failed for: r0v3, types: [com.unity3d.ads.core.domain.events.UniversalRequestEventSender, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final UniversalRequestEventSender mo4828invoke() {
                IServiceComponent iServiceComponent = IServiceComponent.this;
                return iServiceComponent.getServiceProvider().getRegistry().getService(str3, Reflection.getOrCreateKotlinClass(UniversalRequestEventSender.class));
            }
        });
    }

    private final GetRequestPolicy getGetOperativeRequestPolicy() {
        return (GetRequestPolicy) this.getOperativeRequestPolicy.getValue();
    }

    private final SendDiagnosticEvent getSendDiagnosticEvent() {
        return (SendDiagnosticEvent) this.sendDiagnosticEvent.getValue();
    }

    @Override // com.unity3d.ads.core.domain.work.UniversalRequestJob
    @NotNull
    protected UniversalRequestEventSender getUniversalRequestEventSender() {
        return (UniversalRequestEventSender) this.universalRequestEventSender.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.unity3d.ads.core.domain.work.UniversalRequestJob, androidx.work.CoroutineWorker
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object doWork(@NotNull Continuation continuation) {
        OperativeEventJob$doWork$1 operativeEventJob$doWork$1;
        int i;
        long j;
        String message;
        if (continuation instanceof OperativeEventJob$doWork$1) {
            operativeEventJob$doWork$1 = (OperativeEventJob$doWork$1) continuation;
            int i2 = operativeEventJob$doWork$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                operativeEventJob$doWork$1.label = i2 - Integer.MIN_VALUE;
                Object obj = operativeEventJob$doWork$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = operativeEventJob$doWork$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    ensureApplicationContextSet();
                    long m8186markNowz9LOYto = TimeSource$Monotonic.INSTANCE.m8186markNowz9LOYto();
                    try {
                        setRequestPolicy(getGetOperativeRequestPolicy().invoke());
                        operativeEventJob$doWork$1.J$0 = m8186markNowz9LOYto;
                        operativeEventJob$doWork$1.label = 1;
                        obj = super.doWork(operativeEventJob$doWork$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        j = m8186markNowz9LOYto;
                    } catch (Throwable th) {
                        th = th;
                        j = m8186markNowz9LOYto;
                        SendDiagnosticEvent sendDiagnosticEvent = getSendDiagnosticEvent();
                        DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventType = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_OPERATIVE_EVENT_FAILURE;
                        Double boxDouble = Boxing.boxDouble(TimeExtensionsKt.elapsedMillis(TimeSource$Monotonic.ValueTimeMark.m8187boximpl(j)));
                        Pair pair = TuplesKt.to("reason", th.getClass().getSimpleName());
                        message = th.getMessage();
                        if (message == null) {
                            message = th.getClass().getSimpleName();
                        }
                        SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, diagnosticEventType, boxDouble, MapsKt.mapOf(pair, TuplesKt.to("reason_debug", message)), (Map) null, (AdObject) null, (Integer) null, (ByteString) null, 120, (Object) null);
                        getLogger().trace("OperativeEventJob failed to process work", th);
                        ListenableWorker.Result retry = ListenableWorker.Result.retry();
                        Intrinsics.checkNotNullExpressionValue(retry, "retry(...)");
                        return retry;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j = operativeEventJob$doWork$1.J$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (Throwable th2) {
                        th = th2;
                        SendDiagnosticEvent sendDiagnosticEvent2 = getSendDiagnosticEvent();
                        DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventType2 = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_OPERATIVE_EVENT_FAILURE;
                        Double boxDouble2 = Boxing.boxDouble(TimeExtensionsKt.elapsedMillis(TimeSource$Monotonic.ValueTimeMark.m8187boximpl(j)));
                        Pair pair2 = TuplesKt.to("reason", th.getClass().getSimpleName());
                        message = th.getMessage();
                        if (message == null) {
                        }
                        SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent2, diagnosticEventType2, boxDouble2, MapsKt.mapOf(pair2, TuplesKt.to("reason_debug", message)), (Map) null, (AdObject) null, (Integer) null, (ByteString) null, 120, (Object) null);
                        getLogger().trace("OperativeEventJob failed to process work", th);
                        ListenableWorker.Result retry2 = ListenableWorker.Result.retry();
                        Intrinsics.checkNotNullExpressionValue(retry2, "retry(...)");
                        return retry2;
                    }
                }
                SendDiagnosticEvent.DefaultImpls.invoke$default(getSendDiagnosticEvent(), DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_OPERATIVE_EVENT_SENT, Boxing.boxDouble(TimeExtensionsKt.elapsedMillis(TimeSource$Monotonic.ValueTimeMark.m8187boximpl(j))), (Map) null, (Map) null, (AdObject) null, (Integer) null, (ByteString) null, 124, (Object) null);
                return (ListenableWorker.Result) obj;
            }
        }
        operativeEventJob$doWork$1 = new OperativeEventJob$doWork$1(this, continuation);
        Object obj2 = operativeEventJob$doWork$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = operativeEventJob$doWork$1.label;
        if (i != 0) {
        }
        SendDiagnosticEvent.DefaultImpls.invoke$default(getSendDiagnosticEvent(), DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_OPERATIVE_EVENT_SENT, Boxing.boxDouble(TimeExtensionsKt.elapsedMillis(TimeSource$Monotonic.ValueTimeMark.m8187boximpl(j))), (Map) null, (Map) null, (AdObject) null, (Integer) null, (ByteString) null, 124, (Object) null);
        return (ListenableWorker.Result) obj2;
    }
}
