package com.unity3d.ads.core.extensions;

import gatewayprotocol.v1.TransactionEventRequestOuterClass;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: TransactionStateExtensions.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0004"}, d2 = {"fromPurchaseState", "Lgatewayprotocol/v1/TransactionEventRequestOuterClass$TransactionState;", "state", "", "unity-ads_defaultRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class TransactionStateExtensionsKt {
    @NotNull
    public static final TransactionEventRequestOuterClass.TransactionState fromPurchaseState(int i) {
        if (i == 0) {
            return TransactionEventRequestOuterClass.TransactionState.TRANSACTION_STATE_PURCHASED;
        }
        if (i == 1) {
            return TransactionEventRequestOuterClass.TransactionState.TRANSACTION_STATE_CANCELED;
        }
        if (i == 2) {
            return TransactionEventRequestOuterClass.TransactionState.TRANSACTION_STATE_PENDING;
        }
        if (i == 4) {
            return TransactionEventRequestOuterClass.TransactionState.TRANSACTION_STATE_DEFERRED;
        }
        return TransactionEventRequestOuterClass.TransactionState.UNRECOGNIZED;
    }
}
