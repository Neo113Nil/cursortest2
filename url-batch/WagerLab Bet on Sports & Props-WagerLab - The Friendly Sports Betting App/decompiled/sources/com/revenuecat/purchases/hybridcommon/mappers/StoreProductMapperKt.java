package com.revenuecat.purchases.hybridcommon.mappers;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.facebook.appevents.internal.Constants;
import com.revenuecat.purchases.PresentedOfferingContext;
import com.revenuecat.purchases.ProductType;
import com.revenuecat.purchases.amazon.AmazonStoreProduct;
import com.revenuecat.purchases.models.InstallmentsInfo;
import com.revenuecat.purchases.models.OfferPaymentMode;
import com.revenuecat.purchases.models.Period;
import com.revenuecat.purchases.models.Price;
import com.revenuecat.purchases.models.PricingPhase;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.models.SubscriptionOption;
import com.revenuecat.purchases.models.SubscriptionOptions;
import expo.modules.notifications.service.NotificationsService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* compiled from: StoreProductMapper.kt */
@Metadata(d1 = {"\u0000n\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001a\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010%0$*\u00020&H\u0002\u001a\u0018\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010%0$*\u00020\u0005\u001a&\u0010#\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010%0$0'*\b\u0012\u0004\u0012\u00020\u00050'H\u0002\u001a8\u0010(\u001a\u00020)*\b\u0012\u0004\u0012\u00020\u00050'2&\u0010*\u001a\"\u0012\u0018\u0012\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010%0$0'\u0012\u0004\u0012\u00020)0+\u001a\u001c\u0010,\u001a\u0012\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010%\u0018\u00010$*\u00020\u0005H\u0001\u001a\u001c\u0010-\u001a\u0012\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010%\u0018\u00010$*\u00020\tH\u0002\u001a\u001a\u0010.\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010%0$*\u00020\tH\u0002\u001a\u001a\u0010/\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010%0$*\u000200H\u0002\u001a\u001a\u00101\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010%0$*\u00020\rH\u0002\u001a\f\u00102\u001a\u000203*\u00020\u0005H\u0001\u001a\f\u00104\u001a\u00020\u0011*\u00020\u0005H\u0001\u001a\"\u00105\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010%0$*\u0002062\u0006\u00107\u001a\u00020\u0005H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u0017\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\"\u0017\u0010\b\u001a\u0004\u0018\u00010\t*\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b\"\u001a\u0010\f\u001a\u0004\u0018\u00010\r*\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f\"\u0017\u0010\u0010\u001a\u0004\u0018\u00010\u0011*\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013\"\u0015\u0010\u0014\u001a\u00020\u0015*\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017\"\u0015\u0010\u0018\u001a\u00020\u0001*\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a\"\u0017\u0010\u001b\u001a\u0004\u0018\u00010\t*\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u000b\"\u0015\u0010\u001d\u001a\u00020\u0015*\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0017\"\u0015\u0010\u001f\u001a\u00020\u0011*\u00020\u00058F¢\u0006\u0006\u001a\u0004\b \u0010\u0013\"\u0015\u0010!\u001a\u00020\u0011*\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\"\u0010\u0013¨\u00068"}, d2 = {"DAYS_PER_WEEK", "", "MICROS_CONVERSION_METRIC", "", "googleFreeTrialCycles", "Lcom/revenuecat/purchases/models/StoreProduct;", "getGoogleFreeTrialCycles", "(Lcom/revenuecat/purchases/models/StoreProduct;)Ljava/lang/Integer;", "googleFreeTrialPeriod", "Lcom/revenuecat/purchases/models/Period;", "getGoogleFreeTrialPeriod", "(Lcom/revenuecat/purchases/models/StoreProduct;)Lcom/revenuecat/purchases/models/Period;", "googleIntroductoryPhase", "Lcom/revenuecat/purchases/models/PricingPhase;", "getGoogleIntroductoryPhase", "(Lcom/revenuecat/purchases/models/StoreProduct;)Lcom/revenuecat/purchases/models/PricingPhase;", "googleIntroductoryPrice", "", "getGoogleIntroductoryPrice", "(Lcom/revenuecat/purchases/models/StoreProduct;)Ljava/lang/String;", "googleIntroductoryPriceAmountMicros", "", "getGoogleIntroductoryPriceAmountMicros", "(Lcom/revenuecat/purchases/models/StoreProduct;)J", "googleIntroductoryPriceCycles", "getGoogleIntroductoryPriceCycles", "(Lcom/revenuecat/purchases/models/StoreProduct;)I", "googleIntroductoryPricePeriod", "getGoogleIntroductoryPricePeriod", Constants.GP_IAP_PRICE_AMOUNT_MICROS_V5V7, "getPriceAmountMicros", Constants.GP_IAP_PRICE_CURRENCY_CODE_V5V7, "getPriceCurrencyCode", "priceString", "getPriceString", "map", "", "", "Lcom/revenuecat/purchases/models/InstallmentsInfo;", "", "mapAsync", "", "callback", "Lkotlin/Function1;", "mapIntroPrice", "mapPeriod", "mapPeriodForStoreProduct", "mapPrice", "Lcom/revenuecat/purchases/models/Price;", "mapPricingPhase", "mapProductCategory", "Lcom/revenuecat/purchases/hybridcommon/mappers/MappedProductCategory;", "mapProductType", "mapSubscriptionOption", "Lcom/revenuecat/purchases/models/SubscriptionOption;", "storeProduct", "hybridcommon_bc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class StoreProductMapperKt {
    private static final int DAYS_PER_WEEK = 7;
    private static final double MICROS_CONVERSION_METRIC = 1000000.0d;

    /* compiled from: StoreProductMapper.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[ProductType.values().length];
            try {
                iArr[ProductType.INAPP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ProductType.SUBS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ProductType.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[Period.Unit.values().length];
            try {
                iArr2[Period.Unit.DAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[Period.Unit.WEEK.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[Period.Unit.MONTH.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[Period.Unit.YEAR.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[Period.Unit.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final long getPriceAmountMicros(StoreProduct storeProduct) {
        Intrinsics.checkNotNullParameter(storeProduct, "<this>");
        return storeProduct.getPrice().getAmountMicros();
    }

    public static final String getPriceString(StoreProduct storeProduct) {
        Intrinsics.checkNotNullParameter(storeProduct, "<this>");
        return storeProduct.getPrice().getFormatted();
    }

    public static final String getPriceCurrencyCode(StoreProduct storeProduct) {
        Intrinsics.checkNotNullParameter(storeProduct, "<this>");
        return storeProduct.getPrice().getCurrencyCode();
    }

    public static final Period getGoogleFreeTrialPeriod(StoreProduct storeProduct) {
        PricingPhase freePhase;
        Intrinsics.checkNotNullParameter(storeProduct, "<this>");
        SubscriptionOption defaultOption = storeProduct.getDefaultOption();
        if (defaultOption == null || (freePhase = defaultOption.getFreePhase()) == null) {
            return null;
        }
        return freePhase.getBillingPeriod();
    }

    public static final Integer getGoogleFreeTrialCycles(StoreProduct storeProduct) {
        PricingPhase freePhase;
        Intrinsics.checkNotNullParameter(storeProduct, "<this>");
        SubscriptionOption defaultOption = storeProduct.getDefaultOption();
        if (defaultOption == null || (freePhase = defaultOption.getFreePhase()) == null) {
            return null;
        }
        return freePhase.getBillingCycleCount();
    }

    private static final PricingPhase getGoogleIntroductoryPhase(StoreProduct storeProduct) {
        SubscriptionOption defaultOption = storeProduct.getDefaultOption();
        if (defaultOption != null) {
            return defaultOption.getIntroPhase();
        }
        return null;
    }

    public static final String getGoogleIntroductoryPrice(StoreProduct storeProduct) {
        Price price;
        Intrinsics.checkNotNullParameter(storeProduct, "<this>");
        PricingPhase googleIntroductoryPhase = getGoogleIntroductoryPhase(storeProduct);
        if (googleIntroductoryPhase == null || (price = googleIntroductoryPhase.getPrice()) == null) {
            return null;
        }
        return price.getFormatted();
    }

    public static final Period getGoogleIntroductoryPricePeriod(StoreProduct storeProduct) {
        Intrinsics.checkNotNullParameter(storeProduct, "<this>");
        PricingPhase googleIntroductoryPhase = getGoogleIntroductoryPhase(storeProduct);
        if (googleIntroductoryPhase != null) {
            return googleIntroductoryPhase.getBillingPeriod();
        }
        return null;
    }

    public static final long getGoogleIntroductoryPriceAmountMicros(StoreProduct storeProduct) {
        Price price;
        Intrinsics.checkNotNullParameter(storeProduct, "<this>");
        PricingPhase googleIntroductoryPhase = getGoogleIntroductoryPhase(storeProduct);
        if (googleIntroductoryPhase == null || (price = googleIntroductoryPhase.getPrice()) == null) {
            return 0L;
        }
        return price.getAmountMicros();
    }

    public static final int getGoogleIntroductoryPriceCycles(StoreProduct storeProduct) {
        Integer billingCycleCount;
        Intrinsics.checkNotNullParameter(storeProduct, "<this>");
        PricingPhase googleIntroductoryPhase = getGoogleIntroductoryPhase(storeProduct);
        if (googleIntroductoryPhase == null || (billingCycleCount = googleIntroductoryPhase.getBillingCycleCount()) == null) {
            return 0;
        }
        return billingCycleCount.intValue();
    }

    public static final Map<String, Object> map(StoreProduct storeProduct) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(storeProduct, "<this>");
        Pair[] pairArr = new Pair[21];
        pairArr[0] = TuplesKt.to(NotificationsService.IDENTIFIER_KEY, storeProduct.getId());
        pairArr[1] = TuplesKt.to("description", storeProduct.getDescription());
        pairArr[2] = TuplesKt.to("title", storeProduct.getTitle());
        pairArr[3] = TuplesKt.to("price", Double.valueOf(getPriceAmountMicros(storeProduct) / 1000000.0d));
        pairArr[4] = TuplesKt.to("priceString", getPriceString(storeProduct));
        pairArr[5] = TuplesKt.to("currencyCode", getPriceCurrencyCode(storeProduct));
        pairArr[6] = TuplesKt.to("introPrice", mapIntroPrice(storeProduct));
        pairArr[7] = TuplesKt.to("discounts", null);
        Price pricePerWeek$default = StoreProduct.pricePerWeek$default(storeProduct, null, 1, null);
        pairArr[8] = TuplesKt.to("pricePerWeek", pricePerWeek$default != null ? Long.valueOf(pricePerWeek$default.getAmountMicros()) : null);
        Price pricePerMonth$default = StoreProduct.pricePerMonth$default(storeProduct, null, 1, null);
        pairArr[9] = TuplesKt.to("pricePerMonth", pricePerMonth$default != null ? Long.valueOf(pricePerMonth$default.getAmountMicros()) : null);
        Price pricePerYear$default = StoreProduct.pricePerYear$default(storeProduct, null, 1, null);
        pairArr[10] = TuplesKt.to("pricePerYear", pricePerYear$default != null ? Long.valueOf(pricePerYear$default.getAmountMicros()) : null);
        Price pricePerWeek$default2 = StoreProduct.pricePerWeek$default(storeProduct, null, 1, null);
        pairArr[11] = TuplesKt.to("pricePerWeekString", pricePerWeek$default2 != null ? pricePerWeek$default2.getFormatted() : null);
        Price pricePerMonth$default2 = StoreProduct.pricePerMonth$default(storeProduct, null, 1, null);
        pairArr[12] = TuplesKt.to("pricePerMonthString", pricePerMonth$default2 != null ? pricePerMonth$default2.getFormatted() : null);
        Price pricePerYear$default2 = StoreProduct.pricePerYear$default(storeProduct, null, 1, null);
        pairArr[13] = TuplesKt.to("pricePerYearString", pricePerYear$default2 != null ? pricePerYear$default2.getFormatted() : null);
        pairArr[14] = TuplesKt.to("productCategory", mapProductCategory(storeProduct).getValue());
        pairArr[15] = TuplesKt.to("productType", mapProductType(storeProduct));
        Period period = storeProduct.getPeriod();
        pairArr[16] = TuplesKt.to("subscriptionPeriod", period != null ? period.getIso8601() : null);
        SubscriptionOption defaultOption = storeProduct.getDefaultOption();
        pairArr[17] = TuplesKt.to("defaultOption", defaultOption != null ? mapSubscriptionOption(defaultOption, storeProduct) : null);
        SubscriptionOptions subscriptionOptions = storeProduct.getSubscriptionOptions();
        if (subscriptionOptions != null) {
            SubscriptionOptions subscriptionOptions2 = subscriptionOptions;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(subscriptionOptions2, 10));
            Iterator<SubscriptionOption> it = subscriptionOptions2.iterator();
            while (it.hasNext()) {
                arrayList2.add(mapSubscriptionOption(it.next(), storeProduct));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        pairArr[18] = TuplesKt.to("subscriptionOptions", arrayList);
        PresentedOfferingContext presentedOfferingContext = storeProduct.getPresentedOfferingContext();
        pairArr[19] = TuplesKt.to("presentedOfferingIdentifier", presentedOfferingContext != null ? presentedOfferingContext.getOfferingIdentifier() : null);
        PresentedOfferingContext presentedOfferingContext2 = storeProduct.getPresentedOfferingContext();
        pairArr[20] = TuplesKt.to("presentedOfferingContext", presentedOfferingContext2 != null ? OfferingsMapperKt.map(presentedOfferingContext2) : null);
        return MapsKt.mapOf(pairArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Map<String, Object>> map(List<? extends StoreProduct> list) {
        List<? extends StoreProduct> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(map((StoreProduct) it.next()));
        }
        return arrayList;
    }

    public static final void mapAsync(List<? extends StoreProduct> list, Function1<? super List<? extends Map<String, ? extends Object>>, Unit> callback) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(callback, "callback");
        BuildersKt__Builders_commonKt.launch$default(MappersHelpersKt.getMainScope(), null, null, new StoreProductMapperKt$mapAsync$1(callback, list, null), 3, null);
    }

    public static final MappedProductCategory mapProductCategory(StoreProduct storeProduct) {
        Intrinsics.checkNotNullParameter(storeProduct, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[storeProduct.getType().ordinal()];
        if (i == 1) {
            return MappedProductCategory.NON_SUBSCRIPTION;
        }
        if (i == 2) {
            return MappedProductCategory.SUBSCRIPTION;
        }
        if (i == 3) {
            return MappedProductCategory.UNKNOWN;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final String mapProductType(StoreProduct storeProduct) {
        Intrinsics.checkNotNullParameter(storeProduct, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[storeProduct.getType().ordinal()];
        if (i == 1) {
            return "CONSUMABLE";
        }
        if (i != 2) {
            if (i == 3) {
                return "UNKNOWN";
            }
            throw new NoWhenBranchMatchedException();
        }
        SubscriptionOption defaultOption = storeProduct.getDefaultOption();
        if (defaultOption != null && defaultOption.isPrepaid()) {
            return "PREPAID_SUBSCRIPTION";
        }
        return "AUTO_RENEWABLE_SUBSCRIPTION";
    }

    public static final Map<String, Object> mapIntroPrice(StoreProduct storeProduct) {
        Period googleIntroductoryPricePeriod;
        Map<String, Object> mapPeriodForStoreProduct;
        Map<String, Object> mapPeriodForStoreProduct2;
        Map<String, Object> mapPeriodForStoreProduct3;
        Intrinsics.checkNotNullParameter(storeProduct, "<this>");
        if (storeProduct instanceof AmazonStoreProduct) {
            AmazonStoreProduct amazonStoreProduct = (AmazonStoreProduct) storeProduct;
            Period freeTrialPeriod = amazonStoreProduct.getFreeTrialPeriod();
            if (freeTrialPeriod == null || (mapPeriodForStoreProduct3 = mapPeriodForStoreProduct(freeTrialPeriod)) == null) {
                return null;
            }
            Pair[] pairArr = new Pair[4];
            pairArr[0] = TuplesKt.to("price", 0);
            pairArr[1] = TuplesKt.to("priceString", MappersHelpersKt.formatUsingDeviceLocale(getPriceCurrencyCode(storeProduct), 0L));
            Period freeTrialPeriod2 = amazonStoreProduct.getFreeTrialPeriod();
            pairArr[2] = TuplesKt.to(TypedValues.CycleType.S_WAVE_PERIOD, freeTrialPeriod2 != null ? freeTrialPeriod2.getIso8601() : null);
            pairArr[3] = TuplesKt.to("cycles", 1);
            return MapsKt.plus(MapsKt.mapOf(pairArr), mapPeriodForStoreProduct3);
        }
        if (getGoogleFreeTrialPeriod(storeProduct) != null) {
            Period googleFreeTrialPeriod = getGoogleFreeTrialPeriod(storeProduct);
            if (googleFreeTrialPeriod == null || (mapPeriodForStoreProduct2 = mapPeriodForStoreProduct(googleFreeTrialPeriod)) == null) {
                return null;
            }
            Pair[] pairArr2 = new Pair[4];
            pairArr2[0] = TuplesKt.to("price", 0);
            pairArr2[1] = TuplesKt.to("priceString", MappersHelpersKt.formatUsingDeviceLocale(getPriceCurrencyCode(storeProduct), 0L));
            Period googleFreeTrialPeriod2 = getGoogleFreeTrialPeriod(storeProduct);
            pairArr2[2] = TuplesKt.to(TypedValues.CycleType.S_WAVE_PERIOD, googleFreeTrialPeriod2 != null ? googleFreeTrialPeriod2.getIso8601() : null);
            Integer googleFreeTrialCycles = getGoogleFreeTrialCycles(storeProduct);
            pairArr2[3] = TuplesKt.to("cycles", Integer.valueOf(googleFreeTrialCycles != null ? googleFreeTrialCycles.intValue() : 1));
            return MapsKt.plus(MapsKt.mapOf(pairArr2), mapPeriodForStoreProduct2);
        }
        if (getGoogleIntroductoryPrice(storeProduct) == null || (googleIntroductoryPricePeriod = getGoogleIntroductoryPricePeriod(storeProduct)) == null || (mapPeriodForStoreProduct = mapPeriodForStoreProduct(googleIntroductoryPricePeriod)) == null) {
            return null;
        }
        Pair[] pairArr3 = new Pair[4];
        pairArr3[0] = TuplesKt.to("price", Double.valueOf(getGoogleIntroductoryPriceAmountMicros(storeProduct) / 1000000.0d));
        pairArr3[1] = TuplesKt.to("priceString", getGoogleIntroductoryPrice(storeProduct));
        Period googleIntroductoryPricePeriod2 = getGoogleIntroductoryPricePeriod(storeProduct);
        pairArr3[2] = TuplesKt.to(TypedValues.CycleType.S_WAVE_PERIOD, googleIntroductoryPricePeriod2 != null ? googleIntroductoryPricePeriod2.getIso8601() : null);
        pairArr3[3] = TuplesKt.to("cycles", Integer.valueOf(getGoogleIntroductoryPriceCycles(storeProduct)));
        return MapsKt.plus(MapsKt.mapOf(pairArr3), mapPeriodForStoreProduct);
    }

    private static final Map<String, Object> mapPeriodForStoreProduct(Period period) {
        int i = WhenMappings.$EnumSwitchMapping$1[period.getUnit().ordinal()];
        if (i == 1) {
            return MapsKt.mapOf(TuplesKt.to("periodUnit", "DAY"), TuplesKt.to("periodNumberOfUnits", Integer.valueOf(period.getValue())));
        }
        if (i == 2) {
            return MapsKt.mapOf(TuplesKt.to("periodUnit", "DAY"), TuplesKt.to("periodNumberOfUnits", Integer.valueOf(period.getValue() * 7)));
        }
        if (i == 3) {
            return MapsKt.mapOf(TuplesKt.to("periodUnit", "MONTH"), TuplesKt.to("periodNumberOfUnits", Integer.valueOf(period.getValue())));
        }
        if (i == 4) {
            return MapsKt.mapOf(TuplesKt.to("periodUnit", "YEAR"), TuplesKt.to("periodNumberOfUnits", Integer.valueOf(period.getValue())));
        }
        if (i == 5) {
            return MapsKt.mapOf(TuplesKt.to("periodUnit", "DAY"), TuplesKt.to("periodNumberOfUnits", 0));
        }
        throw new NoWhenBranchMatchedException();
    }

    private static final Map<String, Object> mapPeriod(Period period) {
        Map mapOf;
        int i = WhenMappings.$EnumSwitchMapping$1[period.getUnit().ordinal()];
        if (i == 1) {
            mapOf = MapsKt.mapOf(TuplesKt.to("unit", "DAY"), TuplesKt.to("value", Integer.valueOf(period.getValue())));
        } else if (i == 2) {
            mapOf = MapsKt.mapOf(TuplesKt.to("unit", "DAY"), TuplesKt.to("value", Integer.valueOf(period.getValue() * 7)));
        } else if (i == 3) {
            mapOf = MapsKt.mapOf(TuplesKt.to("unit", "MONTH"), TuplesKt.to("value", Integer.valueOf(period.getValue())));
        } else if (i == 4) {
            mapOf = MapsKt.mapOf(TuplesKt.to("unit", "YEAR"), TuplesKt.to("value", Integer.valueOf(period.getValue())));
        } else {
            if (i != 5) {
                throw new NoWhenBranchMatchedException();
            }
            mapOf = MapsKt.mapOf(TuplesKt.to("unit", "DAY"), TuplesKt.to("value", 0));
        }
        return MapsKt.plus(mapOf, MapsKt.mapOf(TuplesKt.to("iso8601", period.getIso8601())));
    }

    private static final Map<String, Object> mapSubscriptionOption(SubscriptionOption subscriptionOption, StoreProduct storeProduct) {
        Pair[] pairArr = new Pair[14];
        pairArr[0] = TuplesKt.to("id", subscriptionOption.getId());
        pairArr[1] = TuplesKt.to("storeProductId", storeProduct.getId());
        pairArr[2] = TuplesKt.to("productId", storeProduct.getPurchasingData().getProductId());
        List<PricingPhase> pricingPhases = subscriptionOption.getPricingPhases();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(pricingPhases, 10));
        Iterator<T> it = pricingPhases.iterator();
        while (it.hasNext()) {
            arrayList.add(mapPricingPhase((PricingPhase) it.next()));
        }
        pairArr[3] = TuplesKt.to(Constants.GP_IAP_SUBSCRIPTION_PRICING_PHASES, arrayList);
        pairArr[4] = TuplesKt.to("tags", subscriptionOption.getTags());
        pairArr[5] = TuplesKt.to("isBasePlan", Boolean.valueOf(subscriptionOption.isBasePlan()));
        Period billingPeriod = subscriptionOption.getBillingPeriod();
        pairArr[6] = TuplesKt.to(Constants.GP_IAP_BILLING_PERIOD, billingPeriod != null ? mapPeriod(billingPeriod) : null);
        pairArr[7] = TuplesKt.to("isPrepaid", Boolean.valueOf(subscriptionOption.isPrepaid()));
        PricingPhase fullPricePhase = subscriptionOption.getFullPricePhase();
        pairArr[8] = TuplesKt.to("fullPricePhase", fullPricePhase != null ? mapPricingPhase(fullPricePhase) : null);
        PricingPhase freePhase = subscriptionOption.getFreePhase();
        pairArr[9] = TuplesKt.to("freePhase", freePhase != null ? mapPricingPhase(freePhase) : null);
        PricingPhase introPhase = subscriptionOption.getIntroPhase();
        pairArr[10] = TuplesKt.to("introPhase", introPhase != null ? mapPricingPhase(introPhase) : null);
        PresentedOfferingContext presentedOfferingContext = subscriptionOption.getPresentedOfferingContext();
        pairArr[11] = TuplesKt.to("presentedOfferingIdentifier", presentedOfferingContext != null ? presentedOfferingContext.getOfferingIdentifier() : null);
        PresentedOfferingContext presentedOfferingContext2 = subscriptionOption.getPresentedOfferingContext();
        pairArr[12] = TuplesKt.to("presentedOfferingContext", presentedOfferingContext2 != null ? OfferingsMapperKt.map(presentedOfferingContext2) : null);
        InstallmentsInfo installmentsInfo = subscriptionOption.getInstallmentsInfo();
        pairArr[13] = TuplesKt.to("installmentsInfo", installmentsInfo != null ? map(installmentsInfo) : null);
        return MapsKt.mapOf(pairArr);
    }

    private static final Map<String, Object> mapPricingPhase(PricingPhase pricingPhase) {
        Pair[] pairArr = new Pair[5];
        Period billingPeriod = pricingPhase.getBillingPeriod();
        pairArr[0] = TuplesKt.to(Constants.GP_IAP_BILLING_PERIOD, billingPeriod != null ? mapPeriod(billingPeriod) : null);
        pairArr[1] = TuplesKt.to(Constants.GP_IAP_RECURRENCE_MODE, pricingPhase.getRecurrenceMode().getIdentifier());
        pairArr[2] = TuplesKt.to("billingCycleCount", pricingPhase.getBillingCycleCount());
        pairArr[3] = TuplesKt.to("price", mapPrice(pricingPhase.getPrice()));
        OfferPaymentMode offerPaymentMode = pricingPhase.getOfferPaymentMode();
        pairArr[4] = TuplesKt.to("offerPaymentMode", offerPaymentMode != null ? offerPaymentMode.toString() : null);
        return MapsKt.mapOf(pairArr);
    }

    private static final Map<String, Object> mapPrice(Price price) {
        return MapsKt.mapOf(TuplesKt.to("formatted", price.getFormatted()), TuplesKt.to("amountMicros", Long.valueOf(price.getAmountMicros())), TuplesKt.to("currencyCode", price.getCurrencyCode()));
    }

    private static final Map<String, Object> map(InstallmentsInfo installmentsInfo) {
        return MapsKt.mapOf(TuplesKt.to("commitmentPaymentsCount", Integer.valueOf(installmentsInfo.getCommitmentPaymentsCount())), TuplesKt.to("renewalCommitmentPaymentsCount", Integer.valueOf(installmentsInfo.getRenewalCommitmentPaymentsCount())));
    }
}
