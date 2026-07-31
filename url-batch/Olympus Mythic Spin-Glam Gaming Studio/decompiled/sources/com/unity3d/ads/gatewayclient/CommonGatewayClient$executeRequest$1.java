package com.unity3d.ads.gatewayclient;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CommonGatewayClient.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.unity3d.ads.gatewayclient.CommonGatewayClient", f = "CommonGatewayClient.kt", l = {Sdk.SDKError.Reason.TPAT_ERROR_VALUE, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE}, m = "executeRequest")
/* loaded from: classes.dex */
final class CommonGatewayClient$executeRequest$1 extends ContinuationImpl {
    int I$0;
    long J$0;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CommonGatewayClient this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CommonGatewayClient$executeRequest$1(CommonGatewayClient commonGatewayClient, Continuation continuation) {
        super(continuation);
        this.this$0 = commonGatewayClient;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object executeRequest;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        executeRequest = this.this$0.executeRequest(null, 0, null, this);
        return executeRequest;
    }
}
