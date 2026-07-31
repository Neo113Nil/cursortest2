package com.unity3d.ads.adplayer;

import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AndroidEmbeddableWebViewAdPlayer.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer", f = "AndroidEmbeddableWebViewAdPlayer.kt", l = {71, TokenParametersOuterClass$TokenParameters.ENCRYPTEDTOPICS_FIELD_NUMBER, TokenParametersOuterClass$TokenParameters.ADSERVICESVERSION_FIELD_NUMBER}, m = "destroy")
/* loaded from: classes9.dex */
final class AndroidEmbeddableWebViewAdPlayer$destroy$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AndroidEmbeddableWebViewAdPlayer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidEmbeddableWebViewAdPlayer$destroy$1(AndroidEmbeddableWebViewAdPlayer androidEmbeddableWebViewAdPlayer, Continuation continuation) {
        super(continuation);
        this.this$0 = androidEmbeddableWebViewAdPlayer;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.destroy(this);
    }
}
