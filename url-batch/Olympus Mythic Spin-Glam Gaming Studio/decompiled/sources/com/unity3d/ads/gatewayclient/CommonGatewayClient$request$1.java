package com.unity3d.ads.gatewayclient;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CommonGatewayClient.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.unity3d.ads.gatewayclient.CommonGatewayClient", f = "CommonGatewayClient.kt", l = {62}, m = "request")
/* loaded from: classes.dex */
final class CommonGatewayClient$request$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CommonGatewayClient this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CommonGatewayClient$request$1(CommonGatewayClient commonGatewayClient, Continuation continuation) {
        super(continuation);
        this.this$0 = commonGatewayClient;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.request(null, null, null, null, this);
    }
}
