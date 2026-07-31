package com.unity3d.ads.core.domain;

import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CommonInitAwaitingGetHeaderBiddingToken.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken", f = "CommonInitAwaitingGetHeaderBiddingToken.kt", l = {TokenParametersOuterClass$TokenParameters.ADSERVICESVERSION_FIELD_NUMBER}, m = "fetchToken")
/* loaded from: classes14.dex */
final class CommonInitAwaitingGetHeaderBiddingToken$fetchToken$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CommonInitAwaitingGetHeaderBiddingToken this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CommonInitAwaitingGetHeaderBiddingToken$fetchToken$1(CommonInitAwaitingGetHeaderBiddingToken commonInitAwaitingGetHeaderBiddingToken, Continuation continuation) {
        super(continuation);
        this.this$0 = commonInitAwaitingGetHeaderBiddingToken;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object fetchToken;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        fetchToken = this.this$0.fetchToken(0, null, this);
        return fetchToken;
    }
}
