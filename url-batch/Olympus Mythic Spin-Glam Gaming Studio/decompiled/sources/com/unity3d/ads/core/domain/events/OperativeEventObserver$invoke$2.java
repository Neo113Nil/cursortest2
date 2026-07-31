package com.unity3d.ads.core.domain.events;

import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkRequest;
import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.ByteStringsKt;
import com.unity3d.ads.core.data.datasource.UniversalRequestDataSource;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.repository.OperativeEventRepository;
import com.unity3d.ads.core.domain.GetRequestPolicy;
import com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.domain.work.BackgroundWorker;
import com.unity3d.ads.core.domain.work.OperativeEventJob;
import com.unity3d.ads.core.domain.work.UniversalRequestWorkerData;
import com.unity3d.ads.gatewayclient.RequestPolicy;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import gatewayprotocol.v1.OperativeEventRequestOuterClass;
import gatewayprotocol.v1.UniversalRequestKt;
import gatewayprotocol.v1.UniversalRequestOuterClass;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;

/* compiled from: OperativeEventObserver.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.unity3d.ads.core.domain.events.OperativeEventObserver$invoke$2", f = "OperativeEventObserver.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class OperativeEventObserver$invoke$2 extends SuspendLambda implements Function2 {
    int label;
    final /* synthetic */ OperativeEventObserver this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OperativeEventObserver$invoke$2(OperativeEventObserver operativeEventObserver, Continuation continuation) {
        super(2, continuation);
        this.this$0 = operativeEventObserver;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OperativeEventObserver$invoke$2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
        return ((OperativeEventObserver$invoke$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MutableStateFlow mutableStateFlow;
        Object value;
        Boolean bool;
        OperativeEventRepository operativeEventRepository;
        CoroutineScope coroutineScope;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            mutableStateFlow = this.this$0.isRunning;
            do {
                value = mutableStateFlow.getValue();
                bool = (Boolean) value;
                bool.booleanValue();
            } while (!mutableStateFlow.compareAndSet(value, Boxing.boxBoolean(true)));
            if (bool.booleanValue()) {
                return Unit.INSTANCE;
            }
            operativeEventRepository = this.this$0.operativeEventRepository;
            Flow onEach = FlowKt.onEach(operativeEventRepository.getOperativeEvents(), new AnonymousClass2(this.this$0, null));
            coroutineScope = this.this$0.scope;
            FlowKt.launchIn(onEach, coroutineScope);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    /* compiled from: OperativeEventObserver.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "operativeEventRequest", "Lgatewayprotocol/v1/OperativeEventRequestOuterClass$OperativeEventRequest;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.unity3d.ads.core.domain.events.OperativeEventObserver$invoke$2$2", f = "OperativeEventObserver.kt", l = {47, 51, 59}, m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.core.domain.events.OperativeEventObserver$invoke$2$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function2 {
        /* synthetic */ Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ OperativeEventObserver this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(OperativeEventObserver operativeEventObserver, Continuation continuation) {
            super(2, continuation);
            this.this$0 = operativeEventObserver;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(OperativeEventRequestOuterClass.OperativeEventRequest operativeEventRequest, Continuation continuation) {
            return ((AnonymousClass2) create(operativeEventRequest, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(8:0|1|(1:(1:(1:(3:6|7|8)(2:10|11))(6:12|13|14|15|7|8))(1:21))(2:30|(1:32))|22|23|24|(1:26)(4:27|15|7|8)|(1:(0))) */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x00f5, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x00d7, code lost:
        
            r3 = r15;
         */
        /* JADX WARN: Removed duplicated region for block: B:20:0x00f5 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            GetUniversalRequestForPayLoad getUniversalRequestForPayLoad;
            UniversalRequestOuterClass.UniversalRequest universalRequest;
            String uuid;
            UniversalRequestDataSource universalRequestDataSource;
            UniversalRequestEventSender universalRequestEventSender;
            GetRequestPolicy getRequestPolicy;
            SendDiagnosticEvent sendDiagnosticEvent;
            BackgroundWorker backgroundWorker;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                OperativeEventRequestOuterClass.OperativeEventRequest operativeEventRequest = (OperativeEventRequestOuterClass.OperativeEventRequest) this.L$0;
                UniversalRequestKt universalRequestKt = UniversalRequestKt.INSTANCE;
                UniversalRequestKt.PayloadKt.Dsl.Companion companion = UniversalRequestKt.PayloadKt.Dsl.INSTANCE;
                UniversalRequestOuterClass.UniversalRequest.Payload.Builder newBuilder = UniversalRequestOuterClass.UniversalRequest.Payload.newBuilder();
                Intrinsics.checkNotNullExpressionValue(newBuilder, "newBuilder(...)");
                UniversalRequestKt.PayloadKt.Dsl _create = companion._create(newBuilder);
                _create.setOperativeEvent(operativeEventRequest);
                UniversalRequestOuterClass.UniversalRequest.Payload _build = _create._build();
                getUniversalRequestForPayLoad = this.this$0.getUniversalRequestForPayLoad;
                this.label = 1;
                obj = getUniversalRequestForPayLoad.invoke(_build, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    uuid = (String) this.L$1;
                    universalRequest = (UniversalRequestOuterClass.UniversalRequest) this.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                        sendDiagnosticEvent = this.this$0.sendDiagnosticEvent;
                        SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_SAVED_OPERATIVE_EVENT_SENT, (Double) null, (Map) null, (Map) null, (AdObject) null, (Integer) null, (ByteString) null, 126, (Object) null);
                        UniversalRequestWorkerData universalRequestWorkerData = new UniversalRequestWorkerData(uuid);
                        backgroundWorker = this.this$0.backgroundWorker;
                        WorkRequest build = ((OneTimeWorkRequest.Builder) ((OneTimeWorkRequest.Builder) new OneTimeWorkRequest.Builder(OperativeEventJob.class).setInputData(universalRequestWorkerData.invoke())).addTag(BackgroundWorker.TAG)).build();
                        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
                        backgroundWorker.getWorkManager().enqueue((OneTimeWorkRequest) build);
                    } catch (Throwable unused) {
                        universalRequestEventSender = this.this$0.universalRequestEventSender;
                        getRequestPolicy = this.this$0.operativeRequestPolicy;
                        RequestPolicy invoke = getRequestPolicy.invoke();
                        this.L$0 = null;
                        this.L$1 = null;
                        this.label = 3;
                        if (universalRequestEventSender.invoke(universalRequest, invoke, this) == coroutine_suspended) {
                        }
                        return Unit.INSTANCE;
                    }
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
            }
            UniversalRequestOuterClass.UniversalRequest universalRequest2 = (UniversalRequestOuterClass.UniversalRequest) obj;
            uuid = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
            universalRequestDataSource = this.this$0.universalRequestDataSource;
            byte[] byteArray = universalRequest2.toByteArray();
            Intrinsics.checkNotNullExpressionValue(byteArray, "toByteArray(...)");
            ByteString byteString = ByteStringsKt.toByteString(byteArray);
            this.L$0 = universalRequest2;
            this.L$1 = uuid;
            this.label = 2;
            if (universalRequestDataSource.set(uuid, byteString, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            universalRequest = universalRequest2;
            sendDiagnosticEvent = this.this$0.sendDiagnosticEvent;
            SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_SAVED_OPERATIVE_EVENT_SENT, (Double) null, (Map) null, (Map) null, (AdObject) null, (Integer) null, (ByteString) null, 126, (Object) null);
            UniversalRequestWorkerData universalRequestWorkerData2 = new UniversalRequestWorkerData(uuid);
            backgroundWorker = this.this$0.backgroundWorker;
            WorkRequest build2 = ((OneTimeWorkRequest.Builder) ((OneTimeWorkRequest.Builder) new OneTimeWorkRequest.Builder(OperativeEventJob.class).setInputData(universalRequestWorkerData2.invoke())).addTag(BackgroundWorker.TAG)).build();
            Intrinsics.checkNotNullExpressionValue(build2, "build(...)");
            backgroundWorker.getWorkManager().enqueue((OneTimeWorkRequest) build2);
            return Unit.INSTANCE;
        }
    }
}
