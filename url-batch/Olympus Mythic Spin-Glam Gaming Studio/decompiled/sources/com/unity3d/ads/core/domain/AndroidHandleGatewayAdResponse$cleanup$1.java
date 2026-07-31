package com.unity3d.ads.core.domain;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AndroidHandleGatewayAdResponse.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse", f = "AndroidHandleGatewayAdResponse.kt", l = {301, 307}, m = "cleanup")
/* loaded from: classes11.dex */
final class AndroidHandleGatewayAdResponse$cleanup$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AndroidHandleGatewayAdResponse this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidHandleGatewayAdResponse$cleanup$1(AndroidHandleGatewayAdResponse androidHandleGatewayAdResponse, Continuation continuation) {
        super(continuation);
        this.this$0 = androidHandleGatewayAdResponse;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object cleanup;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        cleanup = this.this$0.cleanup(null, null, null, null, this);
        return cleanup;
    }
}
