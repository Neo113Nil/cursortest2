package com.unity3d.ads.core.domain;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AndroidHandleGatewayAdResponse.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse", f = "AndroidHandleGatewayAdResponse.kt", l = {277}, m = "loadUrl")
/* loaded from: classes11.dex */
final class AndroidHandleGatewayAdResponse$loadUrl$1 extends ContinuationImpl {
    long J$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AndroidHandleGatewayAdResponse this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidHandleGatewayAdResponse$loadUrl$1(AndroidHandleGatewayAdResponse androidHandleGatewayAdResponse, Continuation continuation) {
        super(continuation);
        this.this$0 = androidHandleGatewayAdResponse;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object loadUrl;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        loadUrl = this.this$0.loadUrl(null, null, null, this);
        return loadUrl;
    }
}
