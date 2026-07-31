package com.revenuecat.purchases.google.history;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: PurchaseHistoryManager.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.revenuecat.purchases.google.history.PurchaseHistoryManager", f = "PurchaseHistoryManager.kt", i = {0, 0, 0, 0, 0, 2, 2, 2, 3, 3, 3}, l = {355, 382, 355, 355}, m = "queryAllPurchaseHistory", n = {"this", "type", "debugMessage$iv", "$this$withLock_u24default$iv$iv", "clearOnCompletion$iv", "this", "type", "$this$withLock_u24default$iv$iv", "this", "type", "$this$withLock_u24default$iv$iv"}, s = {"L$0", "L$1", "L$2", "L$3", "I$0", "L$0", "L$1", "L$3", "L$0", "L$1", "L$3"})
/* loaded from: classes7.dex */
final class PurchaseHistoryManager$queryAllPurchaseHistory$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PurchaseHistoryManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PurchaseHistoryManager$queryAllPurchaseHistory$1(PurchaseHistoryManager purchaseHistoryManager, Continuation<? super PurchaseHistoryManager$queryAllPurchaseHistory$1> continuation) {
        super(continuation);
        this.this$0 = purchaseHistoryManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.queryAllPurchaseHistory(null, this);
    }
}
