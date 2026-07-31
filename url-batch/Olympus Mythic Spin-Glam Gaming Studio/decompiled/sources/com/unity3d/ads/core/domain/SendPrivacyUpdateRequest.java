package com.unity3d.ads.core.domain;

import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.model.OperationType;
import com.unity3d.ads.gatewayclient.GatewayClient;
import com.unity3d.ads.gatewayclient.RequestPolicy;
import gatewayprotocol.v1.PrivacyUpdateResponseOuterClass;
import gatewayprotocol.v1.UniversalRequestOuterClass;
import gatewayprotocol.v1.UniversalResponseOuterClass;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SendPrivacyUpdateRequest.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u001e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0086B¢\u0006\u0002\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/unity3d/ads/core/domain/SendPrivacyUpdateRequest;", "", "getPrivacyUpdateRequest", "Lcom/unity3d/ads/core/domain/GetPrivacyUpdateRequest;", "getRequestPolicy", "Lcom/unity3d/ads/core/domain/GetRequestPolicy;", "gatewayClient", "Lcom/unity3d/ads/gatewayclient/GatewayClient;", "<init>", "(Lcom/unity3d/ads/core/domain/GetPrivacyUpdateRequest;Lcom/unity3d/ads/core/domain/GetRequestPolicy;Lcom/unity3d/ads/gatewayclient/GatewayClient;)V", "invoke", "Lgatewayprotocol/v1/PrivacyUpdateResponseOuterClass$PrivacyUpdateResponse;", "privacyUpdateVersion", "", "privacyUpdateContent", "Lcom/google/protobuf/ByteString;", "(ILcom/google/protobuf/ByteString;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class SendPrivacyUpdateRequest {

    @NotNull
    private final GatewayClient gatewayClient;

    @NotNull
    private final GetPrivacyUpdateRequest getPrivacyUpdateRequest;

    @NotNull
    private final GetRequestPolicy getRequestPolicy;

    public SendPrivacyUpdateRequest(@NotNull GetPrivacyUpdateRequest getPrivacyUpdateRequest, @NotNull GetRequestPolicy getRequestPolicy, @NotNull GatewayClient gatewayClient) {
        Intrinsics.checkNotNullParameter(getPrivacyUpdateRequest, "getPrivacyUpdateRequest");
        Intrinsics.checkNotNullParameter(getRequestPolicy, "getRequestPolicy");
        Intrinsics.checkNotNullParameter(gatewayClient, "gatewayClient");
        this.getPrivacyUpdateRequest = getPrivacyUpdateRequest;
        this.getRequestPolicy = getRequestPolicy;
        this.gatewayClient = gatewayClient;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0060 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(int i, @NotNull ByteString byteString, @NotNull Continuation continuation) {
        SendPrivacyUpdateRequest$invoke$1 sendPrivacyUpdateRequest$invoke$1;
        Object obj;
        Object coroutine_suspended;
        int i2;
        if (continuation instanceof SendPrivacyUpdateRequest$invoke$1) {
            sendPrivacyUpdateRequest$invoke$1 = (SendPrivacyUpdateRequest$invoke$1) continuation;
            int i3 = sendPrivacyUpdateRequest$invoke$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                sendPrivacyUpdateRequest$invoke$1.label = i3 - Integer.MIN_VALUE;
                SendPrivacyUpdateRequest$invoke$1 sendPrivacyUpdateRequest$invoke$12 = sendPrivacyUpdateRequest$invoke$1;
                obj = sendPrivacyUpdateRequest$invoke$12.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = sendPrivacyUpdateRequest$invoke$12.label;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    GetPrivacyUpdateRequest getPrivacyUpdateRequest = this.getPrivacyUpdateRequest;
                    sendPrivacyUpdateRequest$invoke$12.label = 1;
                    obj = getPrivacyUpdateRequest.invoke(i, byteString, sendPrivacyUpdateRequest$invoke$12);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse privacyUpdateResponse = ((UniversalResponseOuterClass.UniversalResponse) obj).getPayload().getPrivacyUpdateResponse();
                        Intrinsics.checkNotNullExpressionValue(privacyUpdateResponse, "getPrivacyUpdateResponse(...)");
                        return privacyUpdateResponse;
                    }
                    ResultKt.throwOnFailure(obj);
                }
                RequestPolicy invoke = this.getRequestPolicy.invoke();
                GatewayClient gatewayClient = this.gatewayClient;
                OperationType operationType = OperationType.PRIVACY_UPDATE;
                sendPrivacyUpdateRequest$invoke$12.label = 2;
                obj = GatewayClient.DefaultImpls.request$default(gatewayClient, null, (UniversalRequestOuterClass.UniversalRequest) obj, invoke, operationType, sendPrivacyUpdateRequest$invoke$12, 1, null);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse privacyUpdateResponse2 = ((UniversalResponseOuterClass.UniversalResponse) obj).getPayload().getPrivacyUpdateResponse();
                Intrinsics.checkNotNullExpressionValue(privacyUpdateResponse2, "getPrivacyUpdateResponse(...)");
                return privacyUpdateResponse2;
            }
        }
        sendPrivacyUpdateRequest$invoke$1 = new SendPrivacyUpdateRequest$invoke$1(this, continuation);
        SendPrivacyUpdateRequest$invoke$1 sendPrivacyUpdateRequest$invoke$122 = sendPrivacyUpdateRequest$invoke$1;
        obj = sendPrivacyUpdateRequest$invoke$122.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = sendPrivacyUpdateRequest$invoke$122.label;
        if (i2 != 0) {
        }
        RequestPolicy invoke2 = this.getRequestPolicy.invoke();
        GatewayClient gatewayClient2 = this.gatewayClient;
        OperationType operationType2 = OperationType.PRIVACY_UPDATE;
        sendPrivacyUpdateRequest$invoke$122.label = 2;
        obj = GatewayClient.DefaultImpls.request$default(gatewayClient2, null, (UniversalRequestOuterClass.UniversalRequest) obj, invoke2, operationType2, sendPrivacyUpdateRequest$invoke$122, 1, null);
        if (obj == coroutine_suspended) {
        }
        PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse privacyUpdateResponse22 = ((UniversalResponseOuterClass.UniversalResponse) obj).getPayload().getPrivacyUpdateResponse();
        Intrinsics.checkNotNullExpressionValue(privacyUpdateResponse22, "getPrivacyUpdateResponse(...)");
        return privacyUpdateResponse22;
    }
}
