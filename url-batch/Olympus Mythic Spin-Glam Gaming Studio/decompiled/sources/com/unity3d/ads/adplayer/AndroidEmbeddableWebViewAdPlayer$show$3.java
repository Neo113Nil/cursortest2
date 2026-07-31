package com.unity3d.ads.adplayer;

import com.unity3d.services.banners.BannerView;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: AndroidEmbeddableWebViewAdPlayer.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$3", f = "AndroidEmbeddableWebViewAdPlayer.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes9.dex */
final class AndroidEmbeddableWebViewAdPlayer$show$3 extends SuspendLambda implements Function2 {
    final /* synthetic */ BannerView $bannerView;
    int label;
    final /* synthetic */ AndroidEmbeddableWebViewAdPlayer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidEmbeddableWebViewAdPlayer$show$3(BannerView bannerView, AndroidEmbeddableWebViewAdPlayer androidEmbeddableWebViewAdPlayer, Continuation continuation) {
        super(2, continuation);
        this.$bannerView = bannerView;
        this.this$0 = androidEmbeddableWebViewAdPlayer;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AndroidEmbeddableWebViewAdPlayer$show$3(this.$bannerView, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
        return ((AndroidEmbeddableWebViewAdPlayer$show$3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.$bannerView.addView(this.this$0.getWebViewContainer().getWebView());
        return Unit.INSTANCE;
    }
}
