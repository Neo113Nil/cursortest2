package com.unity3d.ads.core.domain;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CommonGetHeaderBiddingToken.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.unity3d.ads.core.domain.CommonGetHeaderBiddingToken", f = "CommonGetHeaderBiddingToken.kt", l = {10}, m = "invoke")
/* loaded from: classes15.dex */
final class CommonGetHeaderBiddingToken$invoke$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CommonGetHeaderBiddingToken this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CommonGetHeaderBiddingToken$invoke$1(CommonGetHeaderBiddingToken commonGetHeaderBiddingToken, Continuation continuation) {
        super(continuation);
        this.this$0 = commonGetHeaderBiddingToken;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.invoke(0, null, this);
    }
}
