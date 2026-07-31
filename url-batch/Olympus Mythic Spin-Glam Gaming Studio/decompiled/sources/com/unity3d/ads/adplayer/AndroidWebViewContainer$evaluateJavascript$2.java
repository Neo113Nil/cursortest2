package com.unity3d.ads.adplayer;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: AndroidWebViewContainer.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.unity3d.ads.adplayer.AndroidWebViewContainer$evaluateJavascript$2", f = "AndroidWebViewContainer.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class AndroidWebViewContainer$evaluateJavascript$2 extends SuspendLambda implements Function2 {
    final /* synthetic */ String $selectedString;
    int label;
    final /* synthetic */ AndroidWebViewContainer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidWebViewContainer$evaluateJavascript$2(AndroidWebViewContainer androidWebViewContainer, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = androidWebViewContainer;
        this.$selectedString = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AndroidWebViewContainer$evaluateJavascript$2(this.this$0, this.$selectedString, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
        return ((AndroidWebViewContainer$evaluateJavascript$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.this$0.getWebView().evaluateJavascript(this.$selectedString, null);
        return Unit.INSTANCE;
    }
}
