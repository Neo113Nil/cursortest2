package com.revenuecat.purchases.google.history;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: PurchaseHistoryManager.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.revenuecat.purchases.google.history.PurchaseHistoryManager", f = "PurchaseHistoryManager.kt", i = {0, 0}, l = {346}, m = "disconnect", n = {"this", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1"})
/* loaded from: classes7.dex */
final class PurchaseHistoryManager$disconnect$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PurchaseHistoryManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PurchaseHistoryManager$disconnect$1(PurchaseHistoryManager purchaseHistoryManager, Continuation<? super PurchaseHistoryManager$disconnect$1> continuation) {
        super(continuation);
        this.this$0 = purchaseHistoryManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.disconnect(this);
    }
}
