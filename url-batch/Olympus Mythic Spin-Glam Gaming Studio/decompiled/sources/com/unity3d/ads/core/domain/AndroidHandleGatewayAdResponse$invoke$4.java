package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.model.WebViewConfiguration;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: AndroidHandleGatewayAdResponse.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$invoke$4", f = "AndroidHandleGatewayAdResponse.kt", l = {257}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class AndroidHandleGatewayAdResponse$invoke$4 extends SuspendLambda implements Function2 {
    final /* synthetic */ WebViewConfiguration $webviewConfiguration;
    int label;
    final /* synthetic */ AndroidHandleGatewayAdResponse this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidHandleGatewayAdResponse$invoke$4(AndroidHandleGatewayAdResponse androidHandleGatewayAdResponse, WebViewConfiguration webViewConfiguration, Continuation continuation) {
        super(2, continuation);
        this.this$0 = androidHandleGatewayAdResponse;
        this.$webviewConfiguration = webViewConfiguration;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AndroidHandleGatewayAdResponse$invoke$4(this.this$0, this.$webviewConfiguration, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
        return ((AndroidHandleGatewayAdResponse$invoke$4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CacheWebViewAssets cacheWebViewAssets;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            cacheWebViewAssets = this.this$0.cacheWebViewAssets;
            WebViewConfiguration webViewConfiguration = this.$webviewConfiguration;
            this.label = 1;
            if (cacheWebViewAssets.invoke(webViewConfiguration, true, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
