package com.revenuecat.purchases.hybridcommon;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: common.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010 \n\u0002\b\"\b\u0082\b\u0018\u00002\u00020\u0001B\u009d\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0016\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u000b\u0012\u001c\u0010\f\u001a\u0018\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000b\u0018\u00010\r\u0012\u001c\u0010\u000e\u001a\u0018\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000b\u0018\u00010\r\u0012\u001c\u0010\u000f\u001a\u0018\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000b\u0018\u00010\r¢\u0006\u0002\u0010\u0010J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010#\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u001bJ\u0010\u0010$\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0016J\u0019\u0010%\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u000bHÆ\u0003J\u001f\u0010&\u001a\u0018\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000b\u0018\u00010\rHÆ\u0003J\u001f\u0010'\u001a\u0018\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000b\u0018\u00010\rHÆ\u0003J\u001f\u0010(\u001a\u0018\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000b\u0018\u00010\rHÆ\u0003J¶\u0001\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u0018\b\u0002\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u000b2\u001e\b\u0002\u0010\f\u001a\u0018\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000b\u0018\u00010\r2\u001e\b\u0002\u0010\u000e\u001a\u0018\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000b\u0018\u00010\r2\u001e\b\u0002\u0010\u000f\u001a\u0018\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000b\u0018\u00010\rHÆ\u0001¢\u0006\u0002\u0010*J\u0013\u0010+\u001a\u00020\t2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020\u0007HÖ\u0001J\t\u0010.\u001a\u00020\u0005HÖ\u0001R'\u0010\u000f\u001a\u0018\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000b\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R'\u0010\f\u001a\u0018\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000b\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R'\u0010\u000e\u001a\u0018\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000b\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001a\u0010\u001bR!\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 ¨\u0006/"}, d2 = {"Lcom/revenuecat/purchases/hybridcommon/CommonPurchaseParams;", "", "purchasableItem", "Lcom/revenuecat/purchases/hybridcommon/PurchasableItem;", "googleOldProductId", "", "googleReplacementMode", "", "googleIsPersonalizedPrice", "", "presentedOfferingContext", "", "addOnStoreProducts", "", "addOnSubscriptionOptions", "addOnPackages", "(Lcom/revenuecat/purchases/hybridcommon/PurchasableItem;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/util/Map;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getAddOnPackages", "()Ljava/util/List;", "getAddOnStoreProducts", "getAddOnSubscriptionOptions", "getGoogleIsPersonalizedPrice", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getGoogleOldProductId", "()Ljava/lang/String;", "getGoogleReplacementMode", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getPresentedOfferingContext", "()Ljava/util/Map;", "getPurchasableItem", "()Lcom/revenuecat/purchases/hybridcommon/PurchasableItem;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Lcom/revenuecat/purchases/hybridcommon/PurchasableItem;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/util/Map;Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lcom/revenuecat/purchases/hybridcommon/CommonPurchaseParams;", "equals", "other", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "hybridcommon_bc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
final /* data */ class CommonPurchaseParams {
    private final List<Map<String, Object>> addOnPackages;
    private final List<Map<String, Object>> addOnStoreProducts;
    private final List<Map<String, Object>> addOnSubscriptionOptions;
    private final Boolean googleIsPersonalizedPrice;
    private final String googleOldProductId;
    private final Integer googleReplacementMode;
    private final Map<String, Object> presentedOfferingContext;
    private final PurchasableItem purchasableItem;

    public static /* synthetic */ CommonPurchaseParams copy$default(CommonPurchaseParams commonPurchaseParams, PurchasableItem purchasableItem, String str, Integer num, Boolean bool, Map map, List list, List list2, List list3, int i, Object obj) {
        if ((i & 1) != 0) {
            purchasableItem = commonPurchaseParams.purchasableItem;
        }
        if ((i & 2) != 0) {
            str = commonPurchaseParams.googleOldProductId;
        }
        if ((i & 4) != 0) {
            num = commonPurchaseParams.googleReplacementMode;
        }
        if ((i & 8) != 0) {
            bool = commonPurchaseParams.googleIsPersonalizedPrice;
        }
        if ((i & 16) != 0) {
            map = commonPurchaseParams.presentedOfferingContext;
        }
        if ((i & 32) != 0) {
            list = commonPurchaseParams.addOnStoreProducts;
        }
        if ((i & 64) != 0) {
            list2 = commonPurchaseParams.addOnSubscriptionOptions;
        }
        if ((i & 128) != 0) {
            list3 = commonPurchaseParams.addOnPackages;
        }
        List list4 = list2;
        List list5 = list3;
        Map map2 = map;
        List list6 = list;
        return commonPurchaseParams.copy(purchasableItem, str, num, bool, map2, list6, list4, list5);
    }

    /* renamed from: component1, reason: from getter */
    public final PurchasableItem getPurchasableItem() {
        return this.purchasableItem;
    }

    /* renamed from: component2, reason: from getter */
    public final String getGoogleOldProductId() {
        return this.googleOldProductId;
    }

    /* renamed from: component3, reason: from getter */
    public final Integer getGoogleReplacementMode() {
        return this.googleReplacementMode;
    }

    /* renamed from: component4, reason: from getter */
    public final Boolean getGoogleIsPersonalizedPrice() {
        return this.googleIsPersonalizedPrice;
    }

    public final Map<String, Object> component5() {
        return this.presentedOfferingContext;
    }

    public final List<Map<String, Object>> component6() {
        return this.addOnStoreProducts;
    }

    public final List<Map<String, Object>> component7() {
        return this.addOnSubscriptionOptions;
    }

    public final List<Map<String, Object>> component8() {
        return this.addOnPackages;
    }

    public final CommonPurchaseParams copy(PurchasableItem purchasableItem, String googleOldProductId, Integer googleReplacementMode, Boolean googleIsPersonalizedPrice, Map<String, ? extends Object> presentedOfferingContext, List<? extends Map<String, ? extends Object>> addOnStoreProducts, List<? extends Map<String, ? extends Object>> addOnSubscriptionOptions, List<? extends Map<String, ? extends Object>> addOnPackages) {
        Intrinsics.checkNotNullParameter(purchasableItem, "purchasableItem");
        return new CommonPurchaseParams(purchasableItem, googleOldProductId, googleReplacementMode, googleIsPersonalizedPrice, presentedOfferingContext, addOnStoreProducts, addOnSubscriptionOptions, addOnPackages);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommonPurchaseParams)) {
            return false;
        }
        CommonPurchaseParams commonPurchaseParams = (CommonPurchaseParams) other;
        return Intrinsics.areEqual(this.purchasableItem, commonPurchaseParams.purchasableItem) && Intrinsics.areEqual(this.googleOldProductId, commonPurchaseParams.googleOldProductId) && Intrinsics.areEqual(this.googleReplacementMode, commonPurchaseParams.googleReplacementMode) && Intrinsics.areEqual(this.googleIsPersonalizedPrice, commonPurchaseParams.googleIsPersonalizedPrice) && Intrinsics.areEqual(this.presentedOfferingContext, commonPurchaseParams.presentedOfferingContext) && Intrinsics.areEqual(this.addOnStoreProducts, commonPurchaseParams.addOnStoreProducts) && Intrinsics.areEqual(this.addOnSubscriptionOptions, commonPurchaseParams.addOnSubscriptionOptions) && Intrinsics.areEqual(this.addOnPackages, commonPurchaseParams.addOnPackages);
    }

    public int hashCode() {
        int hashCode = this.purchasableItem.hashCode() * 31;
        String str = this.googleOldProductId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.googleReplacementMode;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.googleIsPersonalizedPrice;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Map<String, Object> map = this.presentedOfferingContext;
        int hashCode5 = (hashCode4 + (map == null ? 0 : map.hashCode())) * 31;
        List<Map<String, Object>> list = this.addOnStoreProducts;
        int hashCode6 = (hashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        List<Map<String, Object>> list2 = this.addOnSubscriptionOptions;
        int hashCode7 = (hashCode6 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<Map<String, Object>> list3 = this.addOnPackages;
        return hashCode7 + (list3 != null ? list3.hashCode() : 0);
    }

    public String toString() {
        return "CommonPurchaseParams(purchasableItem=" + this.purchasableItem + ", googleOldProductId=" + this.googleOldProductId + ", googleReplacementMode=" + this.googleReplacementMode + ", googleIsPersonalizedPrice=" + this.googleIsPersonalizedPrice + ", presentedOfferingContext=" + this.presentedOfferingContext + ", addOnStoreProducts=" + this.addOnStoreProducts + ", addOnSubscriptionOptions=" + this.addOnSubscriptionOptions + ", addOnPackages=" + this.addOnPackages + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CommonPurchaseParams(PurchasableItem purchasableItem, String str, Integer num, Boolean bool, Map<String, ? extends Object> map, List<? extends Map<String, ? extends Object>> list, List<? extends Map<String, ? extends Object>> list2, List<? extends Map<String, ? extends Object>> list3) {
        Intrinsics.checkNotNullParameter(purchasableItem, "purchasableItem");
        this.purchasableItem = purchasableItem;
        this.googleOldProductId = str;
        this.googleReplacementMode = num;
        this.googleIsPersonalizedPrice = bool;
        this.presentedOfferingContext = map;
        this.addOnStoreProducts = list;
        this.addOnSubscriptionOptions = list2;
        this.addOnPackages = list3;
    }

    public final PurchasableItem getPurchasableItem() {
        return this.purchasableItem;
    }

    public final String getGoogleOldProductId() {
        return this.googleOldProductId;
    }

    public final Integer getGoogleReplacementMode() {
        return this.googleReplacementMode;
    }

    public final Boolean getGoogleIsPersonalizedPrice() {
        return this.googleIsPersonalizedPrice;
    }

    public final Map<String, Object> getPresentedOfferingContext() {
        return this.presentedOfferingContext;
    }

    public final List<Map<String, Object>> getAddOnStoreProducts() {
        return this.addOnStoreProducts;
    }

    public final List<Map<String, Object>> getAddOnSubscriptionOptions() {
        return this.addOnSubscriptionOptions;
    }

    public final List<Map<String, Object>> getAddOnPackages() {
        return this.addOnPackages;
    }
}
