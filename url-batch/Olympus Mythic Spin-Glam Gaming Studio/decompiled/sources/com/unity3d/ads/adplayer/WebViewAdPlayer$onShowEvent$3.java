package com.unity3d.ads.adplayer;

import com.unity3d.ads.adplayer.model.ShowStatus;
import com.unity3d.ads.core.data.model.ShowEvent;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;

/* compiled from: WebViewAdPlayer.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/data/model/ShowEvent;", "event", "isCompletedManually", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.unity3d.ads.adplayer.WebViewAdPlayer$onShowEvent$3", f = "WebViewAdPlayer.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class WebViewAdPlayer$onShowEvent$3 extends SuspendLambda implements Function3 {
    /* synthetic */ Object L$0;
    /* synthetic */ boolean Z$0;
    int label;

    WebViewAdPlayer$onShowEvent$3(Continuation continuation) {
        super(3, continuation);
    }

    public final Object invoke(ShowEvent showEvent, boolean z, Continuation continuation) {
        WebViewAdPlayer$onShowEvent$3 webViewAdPlayer$onShowEvent$3 = new WebViewAdPlayer$onShowEvent$3(continuation);
        webViewAdPlayer$onShowEvent$3.L$0 = showEvent;
        webViewAdPlayer$onShowEvent$3.Z$0 = z;
        return webViewAdPlayer$onShowEvent$3.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((ShowEvent) obj, ((Boolean) obj2).booleanValue(), (Continuation) obj3);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return this.Z$0 ? new ShowEvent.Completed(ShowStatus.COMPLETED, null, null, 6, null) : (ShowEvent) this.L$0;
    }
}
