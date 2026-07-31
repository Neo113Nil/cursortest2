package com.revenuecat.purchases;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: CoroutinesExtensionsCommon.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.revenuecat.purchases.CoroutinesExtensionsCommonKt", f = "CoroutinesExtensionsCommon.kt", i = {0, 0, 0}, l = {169}, m = "awaitGetProductsResult", n = {"$this$awaitGetProductsResult", "productIds", "type"}, s = {"L$0", "L$1", "L$2"})
/* loaded from: classes7.dex */
final class CoroutinesExtensionsCommonKt$awaitGetProductsResult$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;

    CoroutinesExtensionsCommonKt$awaitGetProductsResult$1(Continuation<? super CoroutinesExtensionsCommonKt$awaitGetProductsResult$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object awaitGetProductsResult = CoroutinesExtensionsCommonKt.awaitGetProductsResult(null, null, null, this);
        return awaitGetProductsResult == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? awaitGetProductsResult : Result.m12362boximpl(awaitGetProductsResult);
    }
}
