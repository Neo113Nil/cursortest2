package com.unity3d.ads.core.domain;

import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.OperationType;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.extensions.ExceptionExtensionsKt;
import com.unity3d.ads.core.extensions.TimeExtensionsKt;
import com.unity3d.ads.gatewayclient.GatewayClient;
import com.unity3d.ads.gatewayclient.RequestPolicy;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import gatewayprotocol.v1.UniversalRequestOuterClass;
import gatewayprotocol.v1.UniversalResponseOuterClass;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.TimeSource$Monotonic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AndroidTriggerInitializationCompletedRequest.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\f\u001a\u00020\rH\u0096B¢\u0006\u0002\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/unity3d/ads/core/domain/AndroidTriggerInitializationCompletedRequest;", "Lcom/unity3d/ads/core/domain/TriggerInitializationCompletedRequest;", "getInitializationCompletedRequest", "Lcom/unity3d/ads/core/domain/GetInitializationCompletedRequest;", "getRequestPolicy", "Lcom/unity3d/ads/core/domain/GetRequestPolicy;", "gatewayClient", "Lcom/unity3d/ads/gatewayclient/GatewayClient;", "sendDiagnosticEvent", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "<init>", "(Lcom/unity3d/ads/core/domain/GetInitializationCompletedRequest;Lcom/unity3d/ads/core/domain/GetRequestPolicy;Lcom/unity3d/ads/gatewayclient/GatewayClient;Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;)V", "invoke", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class AndroidTriggerInitializationCompletedRequest implements TriggerInitializationCompletedRequest {

    @NotNull
    private final GatewayClient gatewayClient;

    @NotNull
    private final GetInitializationCompletedRequest getInitializationCompletedRequest;

    @NotNull
    private final GetRequestPolicy getRequestPolicy;

    @NotNull
    private final SendDiagnosticEvent sendDiagnosticEvent;

    public AndroidTriggerInitializationCompletedRequest(@NotNull GetInitializationCompletedRequest getInitializationCompletedRequest, @NotNull GetRequestPolicy getRequestPolicy, @NotNull GatewayClient gatewayClient, @NotNull SendDiagnosticEvent sendDiagnosticEvent) {
        Intrinsics.checkNotNullParameter(getInitializationCompletedRequest, "getInitializationCompletedRequest");
        Intrinsics.checkNotNullParameter(getRequestPolicy, "getRequestPolicy");
        Intrinsics.checkNotNullParameter(gatewayClient, "gatewayClient");
        Intrinsics.checkNotNullParameter(sendDiagnosticEvent, "sendDiagnosticEvent");
        this.getInitializationCompletedRequest = getInitializationCompletedRequest;
        this.getRequestPolicy = getRequestPolicy;
        this.gatewayClient = gatewayClient;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(1:52)(1:5)|6|7|8|(4:(1:(1:(5:12|13|14|15|(2:17|18)(2:21|22))(2:26|27))(2:28|29))(3:46|47|(1:49))|35|36|(1:38)(3:39|15|(0)(0)))|30|32|33|34|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0116, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0117, code lost:
    
        r16 = r9;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00a6 A[Catch: Exception -> 0x003a, TRY_LEAVE, TryCatch #1 {Exception -> 0x003a, blocks: (B:14:0x0036, B:15:0x009e, B:17:0x00a6), top: B:13:0x0036 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ec  */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v5 */
    @Override // com.unity3d.ads.core.domain.TriggerInitializationCompletedRequest
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object invoke(@NotNull Continuation continuation) {
        AndroidTriggerInitializationCompletedRequest$invoke$1 androidTriggerInitializationCompletedRequest$invoke$1;
        ?? r5;
        long j;
        long j2;
        UniversalRequestOuterClass.UniversalRequest universalRequest;
        RequestPolicy invoke;
        GatewayClient gatewayClient;
        OperationType operationType;
        UniversalResponseOuterClass.UniversalResponse universalResponse;
        int i;
        if (!(continuation instanceof AndroidTriggerInitializationCompletedRequest$invoke$1) || (r5 = (i = (androidTriggerInitializationCompletedRequest$invoke$1 = (AndroidTriggerInitializationCompletedRequest$invoke$1) continuation).label) & Integer.MIN_VALUE) == 0) {
            androidTriggerInitializationCompletedRequest$invoke$1 = new AndroidTriggerInitializationCompletedRequest$invoke$1(this, continuation);
        } else {
            androidTriggerInitializationCompletedRequest$invoke$1.label = i - Integer.MIN_VALUE;
        }
        AndroidTriggerInitializationCompletedRequest$invoke$1 androidTriggerInitializationCompletedRequest$invoke$12 = androidTriggerInitializationCompletedRequest$invoke$1;
        Object obj = androidTriggerInitializationCompletedRequest$invoke$12.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = androidTriggerInitializationCompletedRequest$invoke$12.label;
        try {
        } catch (Exception e) {
            e = e;
            j = r5;
        }
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                long m8186markNowz9LOYto = TimeSource$Monotonic.INSTANCE.m8186markNowz9LOYto();
                SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_INITIALIZATION_COMPLETED_EVENT_REQUEST_STARTED, (Double) null, (Map) null, (Map) null, (AdObject) null, (Integer) null, (ByteString) null, 126, (Object) null);
                GetInitializationCompletedRequest getInitializationCompletedRequest = this.getInitializationCompletedRequest;
                androidTriggerInitializationCompletedRequest$invoke$12.J$0 = m8186markNowz9LOYto;
                androidTriggerInitializationCompletedRequest$invoke$12.label = 1;
                obj = getInitializationCompletedRequest.invoke(androidTriggerInitializationCompletedRequest$invoke$12);
                r5 = m8186markNowz9LOYto;
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j = androidTriggerInitializationCompletedRequest$invoke$12.J$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                        universalResponse = (UniversalResponseOuterClass.UniversalResponse) obj;
                        if (!universalResponse.hasError()) {
                            SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_INITIALIZATION_COMPLETED_EVENT_REQUEST_FAILURE_TIME, Boxing.boxDouble(TimeExtensionsKt.elapsedMillis(TimeSource$Monotonic.ValueTimeMark.m8187boximpl(j))), MapsKt.mapOf(TuplesKt.to("operation", OperationType.INITIALIZATION_COMPLETED.toString()), TuplesKt.to("reason", "gateway"), TuplesKt.to("reason_debug", universalResponse.getError().getErrorText())), (Map) null, (AdObject) null, (Integer) null, (ByteString) null, 120, (Object) null);
                            return Unit.INSTANCE;
                        }
                        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_INITIALIZATION_COMPLETED_EVENT_REQUEST_SUCCESS_TIME, Boxing.boxDouble(TimeExtensionsKt.elapsedMillis(TimeSource$Monotonic.ValueTimeMark.m8187boximpl(j))), (Map) null, (Map) null, (AdObject) null, (Integer) null, (ByteString) null, 124, (Object) null);
                        return Unit.INSTANCE;
                    } catch (Exception e2) {
                        e = e2;
                        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_INITIALIZATION_COMPLETED_EVENT_REQUEST_FAILURE_TIME, Boxing.boxDouble(TimeExtensionsKt.elapsedMillis(TimeSource$Monotonic.ValueTimeMark.m8187boximpl(j))), MapsKt.mapOf(TuplesKt.to("operation", OperationType.INITIALIZATION_COMPLETED.toString()), TuplesKt.to("reason", "uncaught_exception"), TuplesKt.to("reason_debug", ExceptionExtensionsKt.getShortenedStackTrace$default(e, 0, 1, null))), (Map) null, (AdObject) null, (Integer) null, (ByteString) null, 120, (Object) null);
                        return Unit.INSTANCE;
                    }
                }
                long j3 = androidTriggerInitializationCompletedRequest$invoke$12.J$0;
                ResultKt.throwOnFailure(obj);
                r5 = j3;
            }
            obj = GatewayClient.DefaultImpls.request$default(gatewayClient, null, universalRequest, invoke, operationType, androidTriggerInitializationCompletedRequest$invoke$12, 1, null);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            j = j2;
            universalResponse = (UniversalResponseOuterClass.UniversalResponse) obj;
            if (!universalResponse.hasError()) {
            }
        } catch (Exception e3) {
            e = e3;
            j = j2;
            SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_INITIALIZATION_COMPLETED_EVENT_REQUEST_FAILURE_TIME, Boxing.boxDouble(TimeExtensionsKt.elapsedMillis(TimeSource$Monotonic.ValueTimeMark.m8187boximpl(j))), MapsKt.mapOf(TuplesKt.to("operation", OperationType.INITIALIZATION_COMPLETED.toString()), TuplesKt.to("reason", "uncaught_exception"), TuplesKt.to("reason_debug", ExceptionExtensionsKt.getShortenedStackTrace$default(e, 0, 1, null))), (Map) null, (AdObject) null, (Integer) null, (ByteString) null, 120, (Object) null);
            return Unit.INSTANCE;
        }
        long j4 = r5 == true ? 1 : 0;
        universalRequest = (UniversalRequestOuterClass.UniversalRequest) obj;
        invoke = this.getRequestPolicy.invoke();
        gatewayClient = this.gatewayClient;
        operationType = OperationType.INITIALIZATION_COMPLETED;
        androidTriggerInitializationCompletedRequest$invoke$12.J$0 = j4;
        androidTriggerInitializationCompletedRequest$invoke$12.label = 2;
        j2 = j4;
    }
}
