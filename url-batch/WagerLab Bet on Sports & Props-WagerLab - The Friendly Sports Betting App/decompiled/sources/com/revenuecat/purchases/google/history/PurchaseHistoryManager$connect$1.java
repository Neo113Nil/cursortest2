package com.revenuecat.purchases.google.history;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: PurchaseHistoryManager.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.revenuecat.purchases.google.history.PurchaseHistoryManager", f = "PurchaseHistoryManager.kt", i = {0, 0, 0, 0, 0, 2, 2, 2, 2, 2, 3, 3, 4, 4}, l = {347, 374, 379, 347, 347}, m = "connect", n = {"this", "this_$iv", "debugMessage$iv", "$this$withLock_u24default$iv$iv", "clearOnCompletion$iv", "this", "this_$iv", "deferred$iv", "$completion$iv", "clearOnCompletion$iv", "this", "$this$withLock_u24default$iv$iv", "this", "$this$withLock_u24default$iv$iv"}, s = {"L$0", "L$1", "L$2", "L$3", "I$0", "L$0", "L$1", "L$2", "L$3", "I$0", "L$0", "L$2", "L$0", "L$2"})
/* loaded from: classes7.dex */
final class PurchaseHistoryManager$connect$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PurchaseHistoryManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PurchaseHistoryManager$connect$1(PurchaseHistoryManager purchaseHistoryManager, Continuation<? super PurchaseHistoryManager$connect$1> continuation) {
        super(continuation);
        this.this$0 = purchaseHistoryManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.connect(this);
    }
}
