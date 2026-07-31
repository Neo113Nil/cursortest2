package com.unity3d.ads.core.domain.events;

import com.unity3d.ads.core.data.model.OperationType;
import com.unity3d.ads.core.data.model.exception.GatewayException;
import com.unity3d.ads.gatewayclient.GatewayClient;
import com.unity3d.ads.gatewayclient.RequestPolicy;
import gatewayprotocol.v1.UniversalRequestOuterClass;
import gatewayprotocol.v1.UniversalResponseOuterClass;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: UniversalRequestEventSender.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u001e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0086B¢\u0006\u0002\u0010\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/unity3d/ads/core/domain/events/UniversalRequestEventSender;", "", "gatewayClient", "Lcom/unity3d/ads/gatewayclient/GatewayClient;", "handleGatewayEventResponse", "Lcom/unity3d/ads/core/domain/events/HandleGatewayEventResponse;", "universalRequestTtlValidator", "Lcom/unity3d/ads/core/domain/events/UniversalRequestTtlValidator;", "operationType", "Lcom/unity3d/ads/core/data/model/OperationType;", "<init>", "(Lcom/unity3d/ads/gatewayclient/GatewayClient;Lcom/unity3d/ads/core/domain/events/HandleGatewayEventResponse;Lcom/unity3d/ads/core/domain/events/UniversalRequestTtlValidator;Lcom/unity3d/ads/core/data/model/OperationType;)V", "invoke", "", "universalRequest", "Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest;", "requestPolicy", "Lcom/unity3d/ads/gatewayclient/RequestPolicy;", "(Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest;Lcom/unity3d/ads/gatewayclient/RequestPolicy;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class UniversalRequestEventSender {

    @NotNull
    private final GatewayClient gatewayClient;

    @NotNull
    private final HandleGatewayEventResponse handleGatewayEventResponse;

    @NotNull
    private final OperationType operationType;

    @NotNull
    private final UniversalRequestTtlValidator universalRequestTtlValidator;

    public UniversalRequestEventSender(@NotNull GatewayClient gatewayClient, @NotNull HandleGatewayEventResponse handleGatewayEventResponse, @NotNull UniversalRequestTtlValidator universalRequestTtlValidator, @NotNull OperationType operationType) {
        Intrinsics.checkNotNullParameter(gatewayClient, "gatewayClient");
        Intrinsics.checkNotNullParameter(handleGatewayEventResponse, "handleGatewayEventResponse");
        Intrinsics.checkNotNullParameter(universalRequestTtlValidator, "universalRequestTtlValidator");
        Intrinsics.checkNotNullParameter(operationType, "operationType");
        this.gatewayClient = gatewayClient;
        this.handleGatewayEventResponse = handleGatewayEventResponse;
        this.universalRequestTtlValidator = universalRequestTtlValidator;
        this.operationType = operationType;
    }

    public /* synthetic */ UniversalRequestEventSender(GatewayClient gatewayClient, HandleGatewayEventResponse handleGatewayEventResponse, UniversalRequestTtlValidator universalRequestTtlValidator, OperationType operationType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(gatewayClient, handleGatewayEventResponse, universalRequestTtlValidator, (i & 8) != 0 ? OperationType.UNIVERSAL_EVENT : operationType);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:(3:11|12|13)(2:15|16))(1:17))(2:27|(2:29|30)(2:31|(1:33)))|18|19|(2:21|22)(4:23|(1:25)|12|13)))|36|6|7|(0)(0)|18|19|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0038, code lost:
    
        r12 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0064, code lost:
    
        r13 = kotlin.Result.INSTANCE;
        r12 = kotlin.Result.m8023constructorimpl(kotlin.ResultKt.createFailure(r12));
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(@NotNull UniversalRequestOuterClass.UniversalRequest universalRequest, @NotNull RequestPolicy requestPolicy, @NotNull Continuation continuation) {
        UniversalRequestEventSender$invoke$1 universalRequestEventSender$invoke$1;
        int i;
        Object m8023constructorimpl;
        if (continuation instanceof UniversalRequestEventSender$invoke$1) {
            universalRequestEventSender$invoke$1 = (UniversalRequestEventSender$invoke$1) continuation;
            int i2 = universalRequestEventSender$invoke$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                universalRequestEventSender$invoke$1.label = i2 - Integer.MIN_VALUE;
                Object obj = universalRequestEventSender$invoke$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = universalRequestEventSender$invoke$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (!this.universalRequestTtlValidator.invoke(universalRequest, requestPolicy)) {
                        return Unit.INSTANCE;
                    }
                    Result.Companion companion = Result.INSTANCE;
                    GatewayClient gatewayClient = this.gatewayClient;
                    OperationType operationType = this.operationType;
                    universalRequestEventSender$invoke$1.label = 1;
                    obj = GatewayClient.DefaultImpls.request$default(gatewayClient, null, universalRequest, requestPolicy, operationType, universalRequestEventSender$invoke$1, 1, null);
                    if (obj == coroutine_suspended) {
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
                    ResultKt.throwOnFailure(obj);
                }
                m8023constructorimpl = Result.m8023constructorimpl((UniversalResponseOuterClass.UniversalResponse) obj);
                if (!(Result.m8026exceptionOrNullimpl(m8023constructorimpl) instanceof GatewayException)) {
                    return Unit.INSTANCE;
                }
                HandleGatewayEventResponse handleGatewayEventResponse = this.handleGatewayEventResponse;
                ResultKt.throwOnFailure(m8023constructorimpl);
                universalRequestEventSender$invoke$1.label = 2;
                if (handleGatewayEventResponse.invoke((UniversalResponseOuterClass.UniversalResponse) m8023constructorimpl, universalRequestEventSender$invoke$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
        }
        universalRequestEventSender$invoke$1 = new UniversalRequestEventSender$invoke$1(this, continuation);
        Object obj2 = universalRequestEventSender$invoke$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = universalRequestEventSender$invoke$1.label;
        if (i != 0) {
        }
        m8023constructorimpl = Result.m8023constructorimpl((UniversalResponseOuterClass.UniversalResponse) obj2);
        if (!(Result.m8026exceptionOrNullimpl(m8023constructorimpl) instanceof GatewayException)) {
        }
    }
}
