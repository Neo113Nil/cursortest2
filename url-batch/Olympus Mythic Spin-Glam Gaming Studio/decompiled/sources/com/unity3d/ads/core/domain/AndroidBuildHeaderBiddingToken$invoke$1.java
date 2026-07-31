package com.unity3d.ads.core.domain;

import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AndroidBuildHeaderBiddingToken.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.unity3d.ads.core.domain.AndroidBuildHeaderBiddingToken", f = "AndroidBuildHeaderBiddingToken.kt", l = {44, 65, 71, TokenParametersOuterClass$TokenParameters.ENCRYPTEDTOPICS_FIELD_NUMBER, TokenParametersOuterClass$TokenParameters.ADSERVICESVERSION_FIELD_NUMBER}, m = "invoke")
/* loaded from: classes3.dex */
final class AndroidBuildHeaderBiddingToken$invoke$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AndroidBuildHeaderBiddingToken this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidBuildHeaderBiddingToken$invoke$1(AndroidBuildHeaderBiddingToken androidBuildHeaderBiddingToken, Continuation continuation) {
        super(continuation);
        this.this$0 = androidBuildHeaderBiddingToken;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.invoke(0, null, this);
    }
}
