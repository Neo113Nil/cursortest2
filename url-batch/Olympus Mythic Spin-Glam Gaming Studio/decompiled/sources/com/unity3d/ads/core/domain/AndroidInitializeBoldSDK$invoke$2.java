package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.model.OperationType;
import com.unity3d.ads.core.data.model.exception.GatewayException;
import com.unity3d.ads.core.data.model.exception.InitializationException;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.gatewayclient.GatewayClient;
import com.unity3d.ads.gatewayclient.RequestPolicy;
import com.unity3d.services.UnityAdsConstants;
import gatewayprotocol.v1.UniversalRequestOuterClass;
import gatewayprotocol.v1.UniversalResponseOuterClass;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.time.TimeSource$Monotonic;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.TimeoutKt;

/* compiled from: AndroidInitializeBoldSDK.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.unity3d.ads.core.domain.AndroidInitializeBoldSDK$invoke$2", f = "AndroidInitializeBoldSDK.kt", l = {64, 81}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class AndroidInitializeBoldSDK$invoke$2 extends SuspendLambda implements Function2 {
    final /* synthetic */ String $source;
    int I$0;
    long J$0;
    int label;
    final /* synthetic */ AndroidInitializeBoldSDK this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidInitializeBoldSDK$invoke$2(AndroidInitializeBoldSDK androidInitializeBoldSDK, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = androidInitializeBoldSDK;
        this.$source = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AndroidInitializeBoldSDK$invoke$2(this.this$0, this.$source, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
        return ((AndroidInitializeBoldSDK$invoke$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r5v4, types: [kotlin.time.TimeMark, kotlin.time.TimeSource$Monotonic$ValueTimeMark, long] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        SessionRepository sessionRepository;
        long m8186markNowz9LOYto;
        SessionRepository sessionRepository2;
        ?? m8187boximpl;
        Object initializationSuccess;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                m8186markNowz9LOYto = TimeSource$Monotonic.INSTANCE.m8186markNowz9LOYto();
                sessionRepository2 = this.this$0.sessionRepository;
                boolean isFirstInitAttempt = sessionRepository2.isFirstInitAttempt();
                i = !isFirstInitAttempt ? 1 : 0;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$source, !isFirstInitAttempt, null);
                this.J$0 = m8186markNowz9LOYto;
                this.I$0 = i;
                this.label = 1;
                if (TimeoutKt.withTimeout(UnityAdsConstants.Timeout.INIT_TIMEOUT_MS, anonymousClass1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                i = this.I$0;
                m8186markNowz9LOYto = this.J$0;
                ResultKt.throwOnFailure(obj);
            }
            AndroidInitializeBoldSDK androidInitializeBoldSDK = this.this$0;
            m8187boximpl = TimeSource$Monotonic.ValueTimeMark.m8187boximpl(m8186markNowz9LOYto);
            String str = this.$source;
            boolean z = i != 0;
            this.label = 2;
            initializationSuccess = androidInitializeBoldSDK.initializationSuccess(m8187boximpl, str, z, this);
            if (initializationSuccess == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        } catch (Exception e) {
            InitializationException parseFrom = InitializationException.INSTANCE.parseFrom(e);
            if (e instanceof GatewayException) {
                sessionRepository = this.this$0.sessionRepository;
                sessionRepository.setShouldInitialize(false);
            }
            this.this$0.initializationFailure(TimeSource$Monotonic.ValueTimeMark.m8187boximpl(m8187boximpl), parseFrom, this.$source, i != 0);
            return Unit.INSTANCE;
        }
    }

    /* compiled from: AndroidInitializeBoldSDK.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.unity3d.ads.core.domain.AndroidInitializeBoldSDK$invoke$2$1", f = "AndroidInitializeBoldSDK.kt", l = {65, 67, 69, 70}, m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.core.domain.AndroidInitializeBoldSDK$invoke$2$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2 {
        final /* synthetic */ boolean $isRetry;
        final /* synthetic */ String $source;
        int label;
        final /* synthetic */ AndroidInitializeBoldSDK this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(AndroidInitializeBoldSDK androidInitializeBoldSDK, String str, boolean z, Continuation continuation) {
            super(2, continuation);
            this.this$0 = androidInitializeBoldSDK;
            this.$source = str;
            this.$isRetry = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.this$0, this.$source, this.$isRetry, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0084 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0073 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object initializationStart;
            GetInitializationRequest getInitializationRequest;
            GetRequestPolicy getRequestPolicy;
            GatewayClient gatewayClient;
            HandleGatewayInitializationResponse handleGatewayInitializationResponse;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AndroidInitializeBoldSDK androidInitializeBoldSDK = this.this$0;
                String str = this.$source;
                boolean z = this.$isRetry;
                this.label = 1;
                initializationStart = androidInitializeBoldSDK.initializationStart(str, z, this);
                if (initializationStart == coroutine_suspended) {
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
                            return Unit.INSTANCE;
                        }
                        ResultKt.throwOnFailure(obj);
                        handleGatewayInitializationResponse = this.this$0.handleGatewayInitializationResponse;
                        this.label = 4;
                        if (handleGatewayInitializationResponse.invoke((UniversalResponseOuterClass.UniversalResponse) obj, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return Unit.INSTANCE;
                    }
                    ResultKt.throwOnFailure(obj);
                    UniversalRequestOuterClass.UniversalRequest universalRequest = (UniversalRequestOuterClass.UniversalRequest) obj;
                    getRequestPolicy = this.this$0.getRequestPolicy;
                    RequestPolicy invoke = getRequestPolicy.invoke();
                    gatewayClient = this.this$0.gatewayClient;
                    OperationType operationType = OperationType.INITIALIZATION;
                    this.label = 3;
                    obj = GatewayClient.DefaultImpls.request$default(gatewayClient, null, universalRequest, invoke, operationType, this, 1, null);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    handleGatewayInitializationResponse = this.this$0.handleGatewayInitializationResponse;
                    this.label = 4;
                    if (handleGatewayInitializationResponse.invoke((UniversalResponseOuterClass.UniversalResponse) obj, this) == coroutine_suspended) {
                    }
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
            }
            this.this$0.checkCanInitialize();
            getInitializationRequest = this.this$0.getInitializeRequest;
            this.label = 2;
            obj = getInitializationRequest.invoke(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            UniversalRequestOuterClass.UniversalRequest universalRequest2 = (UniversalRequestOuterClass.UniversalRequest) obj;
            getRequestPolicy = this.this$0.getRequestPolicy;
            RequestPolicy invoke2 = getRequestPolicy.invoke();
            gatewayClient = this.this$0.gatewayClient;
            OperationType operationType2 = OperationType.INITIALIZATION;
            this.label = 3;
            obj = GatewayClient.DefaultImpls.request$default(gatewayClient, null, universalRequest2, invoke2, operationType2, this, 1, null);
            if (obj == coroutine_suspended) {
            }
            handleGatewayInitializationResponse = this.this$0.handleGatewayInitializationResponse;
            this.label = 4;
            if (handleGatewayInitializationResponse.invoke((UniversalResponseOuterClass.UniversalResponse) obj, this) == coroutine_suspended) {
            }
            return Unit.INSTANCE;
        }
    }
}
