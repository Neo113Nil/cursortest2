package com.unity3d.ads.gatewayclient;

import com.unity3d.ads.core.data.model.OperationType;
import gatewayprotocol.v1.UniversalRequestOuterClass;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: CommonGatewayClient.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponse;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.unity3d.ads.gatewayclient.CommonGatewayClient$request$2", f = "CommonGatewayClient.kt", l = {63}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class CommonGatewayClient$request$2 extends SuspendLambda implements Function2 {
    final /* synthetic */ OperationType $operationType;
    final /* synthetic */ UniversalRequestOuterClass.UniversalRequest $request;
    final /* synthetic */ RequestPolicy $requestPolicy;
    final /* synthetic */ String $url;
    int label;
    final /* synthetic */ CommonGatewayClient this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CommonGatewayClient$request$2(CommonGatewayClient commonGatewayClient, OperationType operationType, String str, UniversalRequestOuterClass.UniversalRequest universalRequest, RequestPolicy requestPolicy, Continuation continuation) {
        super(2, continuation);
        this.this$0 = commonGatewayClient;
        this.$operationType = operationType;
        this.$url = str;
        this.$request = universalRequest;
        this.$requestPolicy = requestPolicy;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CommonGatewayClient$request$2(this.this$0, this.$operationType, this.$url, this.$request, this.$requestPolicy, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
        return ((CommonGatewayClient$request$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        RequestUrlFactory requestUrlFactory;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CommonGatewayClient commonGatewayClient = this.this$0;
            requestUrlFactory = commonGatewayClient.requestUrlFactory;
            String requestUrl = requestUrlFactory.getRequestUrl(this.$operationType, this.$url);
            UniversalRequestOuterClass.UniversalRequest universalRequest = this.$request;
            RequestPolicy requestPolicy = this.$requestPolicy;
            OperationType operationType = this.$operationType;
            this.label = 1;
            obj = commonGatewayClient.executeWithRetry(requestUrl, universalRequest, requestPolicy, operationType, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return obj;
    }
}
