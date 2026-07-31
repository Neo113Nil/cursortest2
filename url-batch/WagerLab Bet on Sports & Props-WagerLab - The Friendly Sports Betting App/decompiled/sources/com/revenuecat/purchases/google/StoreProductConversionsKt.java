package com.revenuecat.purchases.google;

import com.android.billingclient.api.ProductDetails;
import com.revenuecat.purchases.LogHandler;
import com.revenuecat.purchases.LogLevel;
import com.revenuecat.purchases.PresentedOfferingContext;
import com.revenuecat.purchases.ProductType;
import com.revenuecat.purchases.common.Config;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.models.GoogleStoreProduct;
import com.revenuecat.purchases.models.Price;
import com.revenuecat.purchases.models.PricingPhase;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.models.SubscriptionOption;
import com.revenuecat.purchases.models.SubscriptionOptions;
import com.revenuecat.purchases.strings.PurchaseStrings;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: storeProductConversions.kt */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u000e\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0002\u001a\u000e\u0010\u0003\u001a\u0004\u0018\u00010\u0004*\u00020\u0002H\u0000\u001a\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006*\u00020\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0000\u001a\u0018\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\b*\b\u0012\u0004\u0012\u00020\u00020\bH\u0000¨\u0006\u000b"}, d2 = {"createOneTimeProductPrice", "Lcom/revenuecat/purchases/models/Price;", "Lcom/android/billingclient/api/ProductDetails;", "toInAppStoreProduct", "Lcom/revenuecat/purchases/models/StoreProduct;", "toStoreProduct", "Lcom/revenuecat/purchases/models/GoogleStoreProduct;", "offerDetails", "", "Lcom/android/billingclient/api/ProductDetails$SubscriptionOfferDetails;", "toStoreProducts", "purchases_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class StoreProductConversionsKt {
    public static final StoreProduct toInAppStoreProduct(ProductDetails productDetails) {
        Intrinsics.checkNotNullParameter(productDetails, "<this>");
        return toStoreProduct(productDetails, CollectionsKt.emptyList());
    }

    public static final GoogleStoreProduct toStoreProduct(ProductDetails productDetails, List<ProductDetails.SubscriptionOfferDetails> offerDetails) {
        SubscriptionOptions subscriptionOptions;
        PricingPhase fullPricePhase;
        Intrinsics.checkNotNullParameter(productDetails, "<this>");
        Intrinsics.checkNotNullParameter(offerDetails, "offerDetails");
        if (ProductTypeConversionsKt.toRevenueCatProductType(productDetails.getProductType()) == ProductType.SUBS) {
            List<ProductDetails.SubscriptionOfferDetails> list = offerDetails;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            for (ProductDetails.SubscriptionOfferDetails subscriptionOfferDetails : list) {
                String productId = productDetails.getProductId();
                Intrinsics.checkNotNullExpressionValue(productId, "productId");
                arrayList.add(SubscriptionOptionConversionsKt.toSubscriptionOption(subscriptionOfferDetails, productId, productDetails));
            }
            subscriptionOptions = new SubscriptionOptions(arrayList);
        } else {
            subscriptionOptions = null;
        }
        SubscriptionOption basePlan = subscriptionOptions != null ? subscriptionOptions.getBasePlan() : null;
        Price price = (basePlan == null || (fullPricePhase = basePlan.getFullPricePhase()) == null) ? null : fullPricePhase.getPrice();
        Price createOneTimeProductPrice = createOneTimeProductPrice(productDetails);
        if (createOneTimeProductPrice != null) {
            price = createOneTimeProductPrice;
        } else if (price == null) {
            return null;
        }
        SubscriptionOption subscriptionOption = basePlan;
        Price price2 = price;
        String productId2 = productDetails.getProductId();
        Intrinsics.checkNotNullExpressionValue(productId2, "productId");
        String id = subscriptionOption != null ? subscriptionOption.getId() : null;
        ProductType revenueCatProductType = ProductTypeConversionsKt.toRevenueCatProductType(productDetails.getProductType());
        String name = productDetails.getName();
        Intrinsics.checkNotNullExpressionValue(name, "name");
        String str = id;
        String title = productDetails.getTitle();
        Intrinsics.checkNotNullExpressionValue(title, "title");
        String description = productDetails.getDescription();
        Intrinsics.checkNotNullExpressionValue(description, "description");
        return new GoogleStoreProduct(productId2, str, revenueCatProductType, price2, name, title, description, subscriptionOption != null ? subscriptionOption.getBillingPeriod() : null, subscriptionOptions, subscriptionOptions != null ? subscriptionOptions.getDefaultOffer() : null, productDetails, (PresentedOfferingContext) null);
    }

    private static final Price createOneTimeProductPrice(ProductDetails productDetails) {
        ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails;
        if (ProductTypeConversionsKt.toRevenueCatProductType(productDetails.getProductType()) != ProductType.INAPP || (oneTimePurchaseOfferDetails = productDetails.getOneTimePurchaseOfferDetails()) == null) {
            return null;
        }
        String formattedPrice = oneTimePurchaseOfferDetails.getFormattedPrice();
        Intrinsics.checkNotNullExpressionValue(formattedPrice, "it.formattedPrice");
        long priceAmountMicros = oneTimePurchaseOfferDetails.getPriceAmountMicros();
        String priceCurrencyCode = oneTimePurchaseOfferDetails.getPriceCurrencyCode();
        Intrinsics.checkNotNullExpressionValue(priceCurrencyCode, "it.priceCurrencyCode");
        return new Price(formattedPrice, priceAmountMicros, priceCurrencyCode);
    }

    public static final List<StoreProduct> toStoreProducts(List<ProductDetails> list) {
        ArrayList emptyList;
        LinkedHashMap emptyMap;
        LogHandler currentLogHandler;
        String str;
        String invoke;
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = new ArrayList();
        for (final ProductDetails productDetails : list) {
            List<ProductDetails.SubscriptionOfferDetails> subscriptionOfferDetails = productDetails.getSubscriptionOfferDetails();
            if (subscriptionOfferDetails != null) {
                Intrinsics.checkNotNullExpressionValue(subscriptionOfferDetails, "subscriptionOfferDetails");
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : subscriptionOfferDetails) {
                    ProductDetails.SubscriptionOfferDetails it = (ProductDetails.SubscriptionOfferDetails) obj;
                    Intrinsics.checkNotNullExpressionValue(it, "it");
                    if (SubscriptionOptionConversionsKt.isBasePlan(it)) {
                        arrayList2.add(obj);
                    }
                }
                emptyList = arrayList2;
            } else {
                emptyList = CollectionsKt.emptyList();
            }
            List<ProductDetails.SubscriptionOfferDetails> subscriptionOfferDetails2 = productDetails.getSubscriptionOfferDetails();
            if (subscriptionOfferDetails2 != null) {
                Intrinsics.checkNotNullExpressionValue(subscriptionOfferDetails2, "subscriptionOfferDetails");
                emptyMap = new LinkedHashMap();
                for (Object obj2 : subscriptionOfferDetails2) {
                    String basePlanId = ((ProductDetails.SubscriptionOfferDetails) obj2).getBasePlanId();
                    Object obj3 = emptyMap.get(basePlanId);
                    if (obj3 == null) {
                        obj3 = (List) new ArrayList();
                        emptyMap.put(basePlanId, obj3);
                    }
                    ((List) obj3).add(obj2);
                }
            } else {
                emptyMap = MapsKt.emptyMap();
            }
            if (emptyList.isEmpty()) {
                emptyList = null;
            }
            if (emptyList != null) {
                Iterator it2 = emptyList.iterator();
                while (it2.hasNext()) {
                    List list2 = (List) emptyMap.get(((ProductDetails.SubscriptionOfferDetails) it2.next()).getBasePlanId());
                    if (list2 == null) {
                        list2 = CollectionsKt.emptyList();
                    }
                    GoogleStoreProduct storeProduct = toStoreProduct(productDetails, list2);
                    if (storeProduct != null) {
                        Boolean.valueOf(arrayList.add(storeProduct));
                    } else {
                        final LogIntent logIntent = LogIntent.RC_ERROR;
                        Function0<String> function0 = new Function0<String>() { // from class: com.revenuecat.purchases.google.StoreProductConversionsKt$toStoreProducts$lambda$10$lambda$7$$inlined$log$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public final String invoke() {
                                StringBuilder append = new StringBuilder().append(CollectionsKt.joinToString$default(LogIntent.this.getEmojiList(), "", null, null, 0, null, null, 62, null)).append(' ');
                                String format = String.format(PurchaseStrings.INVALID_PRODUCT_NO_PRICE, Arrays.copyOf(new Object[]{productDetails.getProductId()}, 1));
                                Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                                return append.append(format).toString();
                            }
                        };
                        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                            case 1:
                                LogLevel logLevel = LogLevel.DEBUG;
                                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                                    str = "[Purchases] - " + logLevel.name();
                                    invoke = function0.invoke();
                                    currentLogHandler.d(str, invoke);
                                    break;
                                }
                                break;
                            case 2:
                                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", function0.invoke(), null);
                                break;
                            case 3:
                                LogLevel logLevel2 = LogLevel.WARN;
                                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                                    currentLogHandler2.w("[Purchases] - " + logLevel2.name(), function0.invoke());
                                    break;
                                }
                                break;
                            case 4:
                                LogLevel logLevel3 = LogLevel.INFO;
                                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                                    currentLogHandler3.i("[Purchases] - " + logLevel3.name(), function0.invoke());
                                    break;
                                }
                                break;
                            case 5:
                                LogLevel logLevel4 = LogLevel.DEBUG;
                                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                                    str = "[Purchases] - " + logLevel4.name();
                                    invoke = function0.invoke();
                                    currentLogHandler.d(str, invoke);
                                    break;
                                }
                                break;
                            case 6:
                                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", function0.invoke(), null);
                                break;
                            case 7:
                                LogLevel logLevel5 = LogLevel.INFO;
                                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                                    currentLogHandler4.i("[Purchases] - " + logLevel5.name(), function0.invoke());
                                    break;
                                }
                                break;
                            case 8:
                                LogLevel logLevel6 = LogLevel.DEBUG;
                                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                                    str = "[Purchases] - " + logLevel6.name();
                                    invoke = function0.invoke();
                                    currentLogHandler.d(str, invoke);
                                    break;
                                }
                                break;
                            case 9:
                                LogLevel logLevel7 = LogLevel.DEBUG;
                                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                                    str = "[Purchases] - " + logLevel7.name();
                                    invoke = function0.invoke();
                                    currentLogHandler.d(str, invoke);
                                    break;
                                }
                                break;
                            case 10:
                                LogLevel logLevel8 = LogLevel.WARN;
                                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                                    currentLogHandler5.w("[Purchases] - " + logLevel8.name(), function0.invoke());
                                    break;
                                }
                                break;
                            case 11:
                                LogLevel logLevel9 = LogLevel.WARN;
                                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                                    currentLogHandler6.w("[Purchases] - " + logLevel9.name(), function0.invoke());
                                    break;
                                }
                                break;
                            case 12:
                                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", function0.invoke(), null);
                                break;
                        }
                        Unit unit = Unit.INSTANCE;
                    }
                }
                Unit unit2 = Unit.INSTANCE;
            } else {
                StoreProduct inAppStoreProduct = toInAppStoreProduct(productDetails);
                if (inAppStoreProduct != null) {
                    Boolean.valueOf(arrayList.add(inAppStoreProduct));
                } else {
                    final LogIntent logIntent2 = LogIntent.RC_ERROR;
                    Function0<String> function02 = new Function0<String>() { // from class: com.revenuecat.purchases.google.StoreProductConversionsKt$toStoreProducts$lambda$10$$inlined$log$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public final String invoke() {
                            StringBuilder append = new StringBuilder().append(CollectionsKt.joinToString$default(LogIntent.this.getEmojiList(), "", null, null, 0, null, null, 62, null)).append(' ');
                            String format = String.format(PurchaseStrings.INVALID_PRODUCT_NO_PRICE, Arrays.copyOf(new Object[]{productDetails.getProductId()}, 1));
                            Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                            return append.append(format).toString();
                        }
                    };
                    switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent2.ordinal()]) {
                        case 1:
                            LogLevel logLevel10 = LogLevel.DEBUG;
                            LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                                currentLogHandler7.d("[Purchases] - " + logLevel10.name(), function02.invoke());
                                break;
                            }
                            break;
                        case 2:
                            LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", function02.invoke(), null);
                            break;
                        case 3:
                            LogLevel logLevel11 = LogLevel.WARN;
                            LogHandler currentLogHandler8 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel11) <= 0) {
                                currentLogHandler8.w("[Purchases] - " + logLevel11.name(), function02.invoke());
                                break;
                            }
                            break;
                        case 4:
                            LogLevel logLevel12 = LogLevel.INFO;
                            LogHandler currentLogHandler9 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel12) <= 0) {
                                currentLogHandler9.i("[Purchases] - " + logLevel12.name(), function02.invoke());
                                break;
                            }
                            break;
                        case 5:
                            LogLevel logLevel13 = LogLevel.DEBUG;
                            LogHandler currentLogHandler10 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel13) <= 0) {
                                currentLogHandler10.d("[Purchases] - " + logLevel13.name(), function02.invoke());
                                break;
                            }
                            break;
                        case 6:
                            LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", function02.invoke(), null);
                            break;
                        case 7:
                            LogLevel logLevel14 = LogLevel.INFO;
                            LogHandler currentLogHandler11 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel14) <= 0) {
                                currentLogHandler11.i("[Purchases] - " + logLevel14.name(), function02.invoke());
                                break;
                            }
                            break;
                        case 8:
                            LogLevel logLevel15 = LogLevel.DEBUG;
                            LogHandler currentLogHandler12 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel15) <= 0) {
                                currentLogHandler12.d("[Purchases] - " + logLevel15.name(), function02.invoke());
                                break;
                            }
                            break;
                        case 9:
                            LogLevel logLevel16 = LogLevel.DEBUG;
                            LogHandler currentLogHandler13 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel16) <= 0) {
                                currentLogHandler13.d("[Purchases] - " + logLevel16.name(), function02.invoke());
                                break;
                            }
                            break;
                        case 10:
                            LogLevel logLevel17 = LogLevel.WARN;
                            LogHandler currentLogHandler14 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel17) <= 0) {
                                currentLogHandler14.w("[Purchases] - " + logLevel17.name(), function02.invoke());
                                break;
                            }
                            break;
                        case 11:
                            LogLevel logLevel18 = LogLevel.WARN;
                            LogHandler currentLogHandler15 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel18) <= 0) {
                                currentLogHandler15.w("[Purchases] - " + logLevel18.name(), function02.invoke());
                                break;
                            }
                            break;
                        case 12:
                            LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", function02.invoke(), null);
                            break;
                    }
                    Unit unit3 = Unit.INSTANCE;
                }
            }
        }
        return arrayList;
    }
}
