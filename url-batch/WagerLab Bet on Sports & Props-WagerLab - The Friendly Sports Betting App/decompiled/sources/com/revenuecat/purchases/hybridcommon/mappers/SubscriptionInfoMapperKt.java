package com.revenuecat.purchases.hybridcommon.mappers;

import com.amazon.a.a.o.b;
import com.revenuecat.purchases.SubscriptionInfo;
import com.revenuecat.purchases.common.responses.ProductResponseJsonKeys;
import java.util.Date;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SubscriptionInfoMapper.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0000\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001*\u00020\u0004¨\u0006\u0005"}, d2 = {"map", "", "", "", "Lcom/revenuecat/purchases/SubscriptionInfo;", "hybridcommon_bc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SubscriptionInfoMapperKt {
    public static final Map<String, Object> map(SubscriptionInfo subscriptionInfo) {
        Intrinsics.checkNotNullParameter(subscriptionInfo, "<this>");
        Pair[] pairArr = new Pair[15];
        pairArr[0] = TuplesKt.to("productIdentifier", subscriptionInfo.getProductIdentifier());
        pairArr[1] = TuplesKt.to(b.Q, MappersHelpersKt.toIso8601(subscriptionInfo.getPurchaseDate()));
        Date originalPurchaseDate = subscriptionInfo.getOriginalPurchaseDate();
        pairArr[2] = TuplesKt.to("originalPurchaseDate", originalPurchaseDate != null ? MappersHelpersKt.toIso8601(originalPurchaseDate) : null);
        Date expiresDate = subscriptionInfo.getExpiresDate();
        pairArr[3] = TuplesKt.to("expiresDate", expiresDate != null ? MappersHelpersKt.toIso8601(expiresDate) : null);
        pairArr[4] = TuplesKt.to(ProductResponseJsonKeys.STORE, subscriptionInfo.getStore().name());
        Date unsubscribeDetectedAt = subscriptionInfo.getUnsubscribeDetectedAt();
        pairArr[5] = TuplesKt.to("unsubscribeDetectedAt", unsubscribeDetectedAt != null ? MappersHelpersKt.toIso8601(unsubscribeDetectedAt) : null);
        pairArr[6] = TuplesKt.to("isSandbox", Boolean.valueOf(subscriptionInfo.getIsSandbox()));
        Date billingIssuesDetectedAt = subscriptionInfo.getBillingIssuesDetectedAt();
        pairArr[7] = TuplesKt.to("billingIssuesDetectedAt", billingIssuesDetectedAt != null ? MappersHelpersKt.toIso8601(billingIssuesDetectedAt) : null);
        Date gracePeriodExpiresDate = subscriptionInfo.getGracePeriodExpiresDate();
        pairArr[8] = TuplesKt.to("gracePeriodExpiresDate", gracePeriodExpiresDate != null ? MappersHelpersKt.toIso8601(gracePeriodExpiresDate) : null);
        pairArr[9] = TuplesKt.to("ownershipType", subscriptionInfo.getOwnershipType().name());
        pairArr[10] = TuplesKt.to("periodType", subscriptionInfo.getPeriodType().name());
        Date refundedAt = subscriptionInfo.getRefundedAt();
        pairArr[11] = TuplesKt.to("refundedAt", refundedAt != null ? MappersHelpersKt.toIso8601(refundedAt) : null);
        pairArr[12] = TuplesKt.to("storeTransactionId", subscriptionInfo.getStoreTransactionId());
        pairArr[13] = TuplesKt.to("isActive", Boolean.valueOf(subscriptionInfo.getIsActive()));
        pairArr[14] = TuplesKt.to("willRenew", Boolean.valueOf(subscriptionInfo.getWillRenew()));
        return MapsKt.mapOf(pairArr);
    }
}
