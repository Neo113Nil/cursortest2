package com.revenuecat.purchases.google.history;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.revenuecat.purchases.google.ErrorsKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PurchaseHistoryResult.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\bHÆ\u0003J/\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u0006\u0010\u0017\u001a\u00020\bJ\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\u0006\u0010\u0019\u001a\u00020\u0015J\t\u0010\u001a\u001a\u00020\bHÖ\u0001R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/revenuecat/purchases/google/history/PurchaseHistoryResult;", "", "responseCode", "", "records", "", "Lcom/revenuecat/purchases/google/history/PurchaseHistoryRecord;", "continuationToken", "", "(ILjava/util/List;Ljava/lang/String;)V", "getContinuationToken", "()Ljava/lang/String;", "getRecords", "()Ljava/util/List;", InAppPurchaseConstants.METHOD_GET_RESPONSE_CODE, "()I", "component1", "component2", "component3", "copy", "equals", "", "other", "getResponseCodeString", "hashCode", "isSuccess", InAppPurchaseConstants.METHOD_TO_STRING, "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class PurchaseHistoryResult {
    private final String continuationToken;
    private final List<PurchaseHistoryRecord> records;
    private final int responseCode;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PurchaseHistoryResult copy$default(PurchaseHistoryResult purchaseHistoryResult, int i, List list, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = purchaseHistoryResult.responseCode;
        }
        if ((i2 & 2) != 0) {
            list = purchaseHistoryResult.records;
        }
        if ((i2 & 4) != 0) {
            str = purchaseHistoryResult.continuationToken;
        }
        return purchaseHistoryResult.copy(i, list, str);
    }

    /* renamed from: component1, reason: from getter */
    public final int getResponseCode() {
        return this.responseCode;
    }

    public final List<PurchaseHistoryRecord> component2() {
        return this.records;
    }

    /* renamed from: component3, reason: from getter */
    public final String getContinuationToken() {
        return this.continuationToken;
    }

    public final PurchaseHistoryResult copy(int responseCode, List<PurchaseHistoryRecord> records, String continuationToken) {
        Intrinsics.checkNotNullParameter(records, "records");
        return new PurchaseHistoryResult(responseCode, records, continuationToken);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PurchaseHistoryResult)) {
            return false;
        }
        PurchaseHistoryResult purchaseHistoryResult = (PurchaseHistoryResult) other;
        return this.responseCode == purchaseHistoryResult.responseCode && Intrinsics.areEqual(this.records, purchaseHistoryResult.records) && Intrinsics.areEqual(this.continuationToken, purchaseHistoryResult.continuationToken);
    }

    public int hashCode() {
        int hashCode = ((Integer.hashCode(this.responseCode) * 31) + this.records.hashCode()) * 31;
        String str = this.continuationToken;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "PurchaseHistoryResult(responseCode=" + this.responseCode + ", records=" + this.records + ", continuationToken=" + this.continuationToken + ')';
    }

    public PurchaseHistoryResult(int i, List<PurchaseHistoryRecord> records, String str) {
        Intrinsics.checkNotNullParameter(records, "records");
        this.responseCode = i;
        this.records = records;
        this.continuationToken = str;
    }

    public final int getResponseCode() {
        return this.responseCode;
    }

    public final List<PurchaseHistoryRecord> getRecords() {
        return this.records;
    }

    public final String getContinuationToken() {
        return this.continuationToken;
    }

    public final boolean isSuccess() {
        return this.responseCode == 0;
    }

    public final String getResponseCodeString() {
        return ErrorsKt.getBillingResponseCodeName(this.responseCode);
    }
}
