package com.revenuecat.purchases.common;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.revenuecat.purchases.PresentedOfferingContext;
import com.revenuecat.purchases.ReplacementMode;
import com.revenuecat.purchases.models.Period;
import com.revenuecat.purchases.models.Price;
import com.revenuecat.purchases.models.PricingPhase;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.models.SubscriptionOption;
import com.revenuecat.purchases.models.SubscriptionOptions;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ReceiptInfo.kt */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001Bs\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0002\u0010\u0012J\u0013\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010/\u001a\u000200H\u0016J\b\u00101\u001a\u00020\u0004H\u0016R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u001c\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00038@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0015\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010 \u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001aR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001aR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0010\u0010(\u001a\u0004\u0018\u00010\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u0014R\u001f\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+¨\u00062"}, d2 = {"Lcom/revenuecat/purchases/common/ReceiptInfo;", "", "productIDs", "", "", "presentedOfferingContext", "Lcom/revenuecat/purchases/PresentedOfferingContext;", "subscriptionOptionId", "subscriptionOptionsForProductIDs", "", "Lcom/revenuecat/purchases/models/SubscriptionOption;", "storeProduct", "Lcom/revenuecat/purchases/models/StoreProduct;", "price", "", "currency", "replacementMode", "Lcom/revenuecat/purchases/ReplacementMode;", "(Ljava/util/List;Lcom/revenuecat/purchases/PresentedOfferingContext;Ljava/lang/String;Ljava/util/Map;Lcom/revenuecat/purchases/models/StoreProduct;Ljava/lang/Double;Ljava/lang/String;Lcom/revenuecat/purchases/ReplacementMode;)V", "getCurrency", "()Ljava/lang/String;", TypedValues.TransitionType.S_DURATION, "getDuration", "platformProductIds", "Lcom/revenuecat/purchases/common/PlatformProductId;", "getPlatformProductIds$purchases_defaultsBc8Release", "()Ljava/util/List;", "getPresentedOfferingContext", "()Lcom/revenuecat/purchases/PresentedOfferingContext;", "getPrice", "()Ljava/lang/Double;", "Ljava/lang/Double;", com.facebook.appevents.internal.Constants.GP_IAP_SUBSCRIPTION_PRICING_PHASES, "Lcom/revenuecat/purchases/models/PricingPhase;", "getPricingPhases", "getProductIDs", "getReplacementMode", "()Lcom/revenuecat/purchases/ReplacementMode;", "getStoreProduct", "()Lcom/revenuecat/purchases/models/StoreProduct;", "subscriptionOption", "getSubscriptionOptionId", "getSubscriptionOptionsForProductIDs", "()Ljava/util/Map;", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ReceiptInfo {
    private final String currency;
    private final String duration;
    private final PresentedOfferingContext presentedOfferingContext;
    private final Double price;
    private final List<PricingPhase> pricingPhases;
    private final List<String> productIDs;
    private final ReplacementMode replacementMode;
    private final StoreProduct storeProduct;
    private final SubscriptionOption subscriptionOption;
    private final String subscriptionOptionId;
    private final Map<String, SubscriptionOption> subscriptionOptionsForProductIDs;

    /* JADX WARN: Multi-variable type inference failed */
    public ReceiptInfo(List<String> productIDs, PresentedOfferingContext presentedOfferingContext, String str, Map<String, ? extends SubscriptionOption> map, StoreProduct storeProduct, Double d, String str2, ReplacementMode replacementMode) {
        SubscriptionOption subscriptionOption;
        SubscriptionOptions subscriptionOptions;
        SubscriptionOption subscriptionOption2;
        Period period;
        String iso8601;
        Intrinsics.checkNotNullParameter(productIDs, "productIDs");
        this.productIDs = productIDs;
        this.presentedOfferingContext = presentedOfferingContext;
        this.subscriptionOptionId = str;
        this.subscriptionOptionsForProductIDs = map;
        this.storeProduct = storeProduct;
        this.price = d;
        this.currency = str2;
        this.replacementMode = replacementMode;
        this.duration = (storeProduct == null || (period = storeProduct.getPeriod()) == null || (iso8601 = period.getIso8601()) == null || iso8601.length() == 0) ? null : iso8601;
        if (storeProduct == null || (subscriptionOptions = storeProduct.getSubscriptionOptions()) == null) {
            subscriptionOption = null;
        } else {
            Iterator<SubscriptionOption> it = subscriptionOptions.iterator();
            while (true) {
                if (!it.hasNext()) {
                    subscriptionOption2 = null;
                    break;
                } else {
                    subscriptionOption2 = it.next();
                    if (Intrinsics.areEqual(subscriptionOption2.getId(), this.subscriptionOptionId)) {
                        break;
                    }
                }
            }
            subscriptionOption = subscriptionOption2;
        }
        this.subscriptionOption = subscriptionOption;
        this.pricingPhases = subscriptionOption != null ? subscriptionOption.getPricingPhases() : null;
    }

    public final List<String> getProductIDs() {
        return this.productIDs;
    }

    public final PresentedOfferingContext getPresentedOfferingContext() {
        return this.presentedOfferingContext;
    }

    public final String getSubscriptionOptionId() {
        return this.subscriptionOptionId;
    }

    public final Map<String, SubscriptionOption> getSubscriptionOptionsForProductIDs() {
        return this.subscriptionOptionsForProductIDs;
    }

    public final StoreProduct getStoreProduct() {
        return this.storeProduct;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ ReceiptInfo(List list, PresentedOfferingContext presentedOfferingContext, String str, Map map, StoreProduct storeProduct, Double d, String str2, ReplacementMode replacementMode, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, presentedOfferingContext, str, map, storeProduct, (i & 32) != 0 ? (storeProduct == null || (r11 = storeProduct.getPrice()) == null) ? null : Double.valueOf(r11.getAmountMicros() / 1000000.0d) : d, (i & 64) != 0 ? (storeProduct == null || (r12 = storeProduct.getPrice()) == null) ? null : r12.getCurrencyCode() : str2, (i & 128) != 0 ? null : replacementMode);
        Price price;
        Price price2;
        presentedOfferingContext = (i & 2) != 0 ? null : presentedOfferingContext;
        str = (i & 4) != 0 ? null : str;
        map = (i & 8) != 0 ? null : map;
        storeProduct = (i & 16) != 0 ? null : storeProduct;
    }

    public final Double getPrice() {
        return this.price;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final ReplacementMode getReplacementMode() {
        return this.replacementMode;
    }

    public final String getDuration() {
        return this.duration;
    }

    public final List<PricingPhase> getPricingPhases() {
        return this.pricingPhases;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(getClass(), other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(other, "null cannot be cast to non-null type com.revenuecat.purchases.common.ReceiptInfo");
        ReceiptInfo receiptInfo = (ReceiptInfo) other;
        return Intrinsics.areEqual(this.productIDs, receiptInfo.productIDs) && Intrinsics.areEqual(this.presentedOfferingContext, receiptInfo.presentedOfferingContext) && Intrinsics.areEqual(this.storeProduct, receiptInfo.storeProduct) && Intrinsics.areEqual(this.price, receiptInfo.price) && Intrinsics.areEqual(this.currency, receiptInfo.currency) && Intrinsics.areEqual(this.subscriptionOptionId, receiptInfo.subscriptionOptionId);
    }

    public final List<PlatformProductId> getPlatformProductIds$purchases_defaultsBc8Release() {
        PlatformProductId platformProductId;
        PlatformProductId platformProductId2;
        SubscriptionOption subscriptionOption;
        SubscriptionOption subscriptionOption2 = this.subscriptionOption;
        if (subscriptionOption2 == null || (platformProductId = ReceiptInfoKt.platformProductId(subscriptionOption2)) == null) {
            StoreProduct storeProduct = this.storeProduct;
            platformProductId = storeProduct != null ? ReceiptInfoKt.platformProductId(storeProduct) : null;
        }
        List<String> list = this.productIDs;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (String str : list) {
            if (platformProductId == null || !Intrinsics.areEqual(str, platformProductId.getProductId())) {
                Map<String, SubscriptionOption> map = this.subscriptionOptionsForProductIDs;
                if (map == null || (subscriptionOption = map.get(str)) == null || (platformProductId2 = ReceiptInfoKt.platformProductId(subscriptionOption)) == null) {
                    platformProductId2 = new PlatformProductId(str);
                }
            } else {
                platformProductId2 = platformProductId;
            }
            arrayList.add(platformProductId2);
        }
        return arrayList;
    }

    public int hashCode() {
        int hashCode = this.productIDs.hashCode() * 31;
        PresentedOfferingContext presentedOfferingContext = this.presentedOfferingContext;
        int hashCode2 = (hashCode + (presentedOfferingContext != null ? presentedOfferingContext.hashCode() : 0)) * 31;
        StoreProduct storeProduct = this.storeProduct;
        int hashCode3 = (hashCode2 + (storeProduct != null ? storeProduct.hashCode() : 0)) * 31;
        String str = this.subscriptionOptionId;
        return hashCode3 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "ReceiptInfo(productIDs='" + CollectionsKt.joinToString$default(this.productIDs, null, null, null, 0, null, null, 63, null) + "', presentedOfferingContext=" + this.presentedOfferingContext + ", storeProduct=" + this.storeProduct + ", subscriptionOptionId=" + this.subscriptionOptionId + ", pricingPhases=" + this.pricingPhases + ", price=" + this.price + ", currency=" + this.currency + ", duration=" + this.duration + ')';
    }
}
