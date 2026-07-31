package com.revenuecat.purchases;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: CoroutinesExtensionsCommon.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.revenuecat.purchases.CoroutinesExtensionsCommonKt", f = "CoroutinesExtensionsCommon.kt", i = {0}, l = {228}, m = "awaitRestoreResult", n = {"$this$awaitRestoreResult"}, s = {"L$0"})
/* loaded from: classes7.dex */
final class CoroutinesExtensionsCommonKt$awaitRestoreResult$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    CoroutinesExtensionsCommonKt$awaitRestoreResult$1(Continuation<? super CoroutinesExtensionsCommonKt$awaitRestoreResult$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object awaitRestoreResult = CoroutinesExtensionsCommonKt.awaitRestoreResult(null, this);
        return awaitRestoreResult == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? awaitRestoreResult : Result.m12362boximpl(awaitRestoreResult);
    }
}
