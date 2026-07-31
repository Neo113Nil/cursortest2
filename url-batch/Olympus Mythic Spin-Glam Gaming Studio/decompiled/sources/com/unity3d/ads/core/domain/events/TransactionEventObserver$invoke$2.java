package com.unity3d.ads.core.domain.events;

import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.datasource.ByteStringDataSource;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.OperationType;
import com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException;
import com.unity3d.ads.core.domain.GetRequestPolicy;
import com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.extensions.TimeExtensionsKt;
import com.unity3d.ads.gatewayclient.GatewayClient;
import com.unity3d.ads.gatewayclient.RequestPolicy;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import gatewayprotocol.v1.TransactionEventRequestOuterClass;
import gatewayprotocol.v1.UniversalRequestKt;
import gatewayprotocol.v1.UniversalRequestOuterClass;
import gatewayprotocol.v1.UniversalResponseOuterClass;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.TimeSource$Monotonic;

/* compiled from: TransactionEventObserver.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "currentTransactionEventRequest", "Lgatewayprotocol/v1/TransactionEventRequestOuterClass$TransactionEventRequest;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.unity3d.ads.core.domain.events.TransactionEventObserver$invoke$2", f = "TransactionEventObserver.kt", l = {46, 47, 55}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class TransactionEventObserver$invoke$2 extends SuspendLambda implements Function2 {
    long J$0;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ TransactionEventObserver this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TransactionEventObserver$invoke$2(TransactionEventObserver transactionEventObserver, Continuation continuation) {
        super(2, continuation);
        this.this$0 = transactionEventObserver;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TransactionEventObserver$invoke$2 transactionEventObserver$invoke$2 = new TransactionEventObserver$invoke$2(this.this$0, continuation);
        transactionEventObserver$invoke$2.L$0 = obj;
        return transactionEventObserver$invoke$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(TransactionEventRequestOuterClass.TransactionEventRequest transactionEventRequest, Continuation continuation) {
        return ((TransactionEventObserver$invoke$2) create(transactionEventRequest, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a3 A[Catch: UnityAdsNetworkException -> 0x002e, TRY_LEAVE, TryCatch #0 {UnityAdsNetworkException -> 0x002e, blocks: (B:23:0x0029, B:24:0x009b, B:26:0x00a3), top: B:22:0x0029 }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        long j;
        GetUniversalRequestForPayLoad getUniversalRequestForPayLoad;
        long j2;
        UniversalRequestOuterClass.UniversalRequest universalRequest;
        GatewayClient gatewayClient;
        GetRequestPolicy getRequestPolicy;
        long j3;
        ByteStringDataSource byteStringDataSource;
        SendDiagnosticEvent sendDiagnosticEvent;
        String message;
        SendDiagnosticEvent sendDiagnosticEvent2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            TransactionEventRequestOuterClass.TransactionEventRequest transactionEventRequest = (TransactionEventRequestOuterClass.TransactionEventRequest) this.L$0;
            long m8186markNowz9LOYto = TimeSource$Monotonic.INSTANCE.m8186markNowz9LOYto();
            try {
                UniversalRequestKt universalRequestKt = UniversalRequestKt.INSTANCE;
                UniversalRequestKt.PayloadKt.Dsl.Companion companion = UniversalRequestKt.PayloadKt.Dsl.INSTANCE;
                UniversalRequestOuterClass.UniversalRequest.Payload.Builder newBuilder = UniversalRequestOuterClass.UniversalRequest.Payload.newBuilder();
                Intrinsics.checkNotNullExpressionValue(newBuilder, "newBuilder(...)");
                UniversalRequestKt.PayloadKt.Dsl _create = companion._create(newBuilder);
                _create.setTransactionEventRequest(transactionEventRequest);
                UniversalRequestOuterClass.UniversalRequest.Payload _build = _create._build();
                getUniversalRequestForPayLoad = this.this$0.getUniversalRequestForPayLoad;
                this.J$0 = m8186markNowz9LOYto;
                this.label = 1;
                obj = getUniversalRequestForPayLoad.invoke(_build, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                j2 = m8186markNowz9LOYto;
            } catch (UnityAdsNetworkException e) {
                e = e;
                j = m8186markNowz9LOYto;
                sendDiagnosticEvent = this.this$0.sendDiagnosticEvent;
                DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventType = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_TRANSACTION_FAILURE_TIME;
                Double boxDouble = Boxing.boxDouble(TimeExtensionsKt.elapsedMillis(TimeSource$Monotonic.ValueTimeMark.m8187boximpl(j)));
                Pair pair = TuplesKt.to("reason", e.getClass().getSimpleName());
                message = e.getMessage();
                if (message == null) {
                }
                SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, diagnosticEventType, boxDouble, MapsKt.mapOf(pair, TuplesKt.to("reason_debug", message)), (Map) null, (AdObject) null, (Integer) null, (ByteString) null, 120, (Object) null);
                return Unit.INSTANCE;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j = this.J$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                        sendDiagnosticEvent2 = this.this$0.sendDiagnosticEvent;
                        SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent2, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_TRANSACTION_SUCCESS_TIME, Boxing.boxDouble(TimeExtensionsKt.elapsedMillis(TimeSource$Monotonic.ValueTimeMark.m8187boximpl(j))), (Map) null, (Map) null, (AdObject) null, (Integer) null, (ByteString) null, 124, (Object) null);
                    } catch (UnityAdsNetworkException e2) {
                        e = e2;
                        sendDiagnosticEvent = this.this$0.sendDiagnosticEvent;
                        DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventType2 = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_TRANSACTION_FAILURE_TIME;
                        Double boxDouble2 = Boxing.boxDouble(TimeExtensionsKt.elapsedMillis(TimeSource$Monotonic.ValueTimeMark.m8187boximpl(j)));
                        Pair pair2 = TuplesKt.to("reason", e.getClass().getSimpleName());
                        message = e.getMessage();
                        if (message == null) {
                        }
                        SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, diagnosticEventType2, boxDouble2, MapsKt.mapOf(pair2, TuplesKt.to("reason_debug", message)), (Map) null, (AdObject) null, (Integer) null, (ByteString) null, 120, (Object) null);
                        return Unit.INSTANCE;
                    }
                    return Unit.INSTANCE;
                }
                j3 = this.J$0;
                universalRequest = (UniversalRequestOuterClass.UniversalRequest) this.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                    if (((UniversalResponseOuterClass.UniversalResponse) obj).getError() != null) {
                        byteStringDataSource = this.this$0.iapTransactionStore;
                        ByteString byteString = universalRequest.getSharedData().getTimestamps().getTimestamp().toByteString();
                        Intrinsics.checkNotNullExpressionValue(byteString, "toByteString(...)");
                        this.L$0 = null;
                        this.J$0 = j3;
                        this.label = 3;
                        if (byteStringDataSource.set(byteString, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    j = j3;
                    sendDiagnosticEvent2 = this.this$0.sendDiagnosticEvent;
                    SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent2, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_TRANSACTION_SUCCESS_TIME, Boxing.boxDouble(TimeExtensionsKt.elapsedMillis(TimeSource$Monotonic.ValueTimeMark.m8187boximpl(j))), (Map) null, (Map) null, (AdObject) null, (Integer) null, (ByteString) null, 124, (Object) null);
                } catch (UnityAdsNetworkException e3) {
                    e = e3;
                    j = j3;
                    sendDiagnosticEvent = this.this$0.sendDiagnosticEvent;
                    DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventType22 = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_TRANSACTION_FAILURE_TIME;
                    Double boxDouble22 = Boxing.boxDouble(TimeExtensionsKt.elapsedMillis(TimeSource$Monotonic.ValueTimeMark.m8187boximpl(j)));
                    Pair pair22 = TuplesKt.to("reason", e.getClass().getSimpleName());
                    message = e.getMessage();
                    if (message == null) {
                        message = e.getClass().getSimpleName();
                    }
                    SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, diagnosticEventType22, boxDouble22, MapsKt.mapOf(pair22, TuplesKt.to("reason_debug", message)), (Map) null, (AdObject) null, (Integer) null, (ByteString) null, 120, (Object) null);
                    return Unit.INSTANCE;
                }
                return Unit.INSTANCE;
            }
            j2 = this.J$0;
            try {
                ResultKt.throwOnFailure(obj);
            } catch (UnityAdsNetworkException e4) {
                e = e4;
                j = j2;
                sendDiagnosticEvent = this.this$0.sendDiagnosticEvent;
                DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventType222 = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_TRANSACTION_FAILURE_TIME;
                Double boxDouble222 = Boxing.boxDouble(TimeExtensionsKt.elapsedMillis(TimeSource$Monotonic.ValueTimeMark.m8187boximpl(j)));
                Pair pair222 = TuplesKt.to("reason", e.getClass().getSimpleName());
                message = e.getMessage();
                if (message == null) {
                }
                SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, diagnosticEventType222, boxDouble222, MapsKt.mapOf(pair222, TuplesKt.to("reason_debug", message)), (Map) null, (AdObject) null, (Integer) null, (ByteString) null, 120, (Object) null);
                return Unit.INSTANCE;
            }
        }
        universalRequest = (UniversalRequestOuterClass.UniversalRequest) obj;
        gatewayClient = this.this$0.gatewayClient;
        getRequestPolicy = this.this$0.getRequestPolicy;
        RequestPolicy invoke = getRequestPolicy.invoke();
        OperationType operationType = OperationType.TRANSACTION_EVENT;
        this.L$0 = universalRequest;
        this.J$0 = j2;
        this.label = 2;
        obj = GatewayClient.DefaultImpls.request$default(gatewayClient, null, universalRequest, invoke, operationType, this, 1, null);
        if (obj == coroutine_suspended) {
            return coroutine_suspended;
        }
        j3 = j2;
        if (((UniversalResponseOuterClass.UniversalResponse) obj).getError() != null) {
        }
        j = j3;
        sendDiagnosticEvent2 = this.this$0.sendDiagnosticEvent;
        SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent2, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_TRANSACTION_SUCCESS_TIME, Boxing.boxDouble(TimeExtensionsKt.elapsedMillis(TimeSource$Monotonic.ValueTimeMark.m8187boximpl(j))), (Map) null, (Map) null, (AdObject) null, (Integer) null, (ByteString) null, 124, (Object) null);
        return Unit.INSTANCE;
    }
}
