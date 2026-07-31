package com.revenuecat.purchases.common;

import com.revenuecat.purchases.models.GoogleReplacementMode;
import com.revenuecat.purchases.models.PricingPhase;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Backend.kt */
@Metadata(d1 = {"\u0000 \u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001a\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\n0\t*\u00020\u000bH\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u0018\u0010\u0003\u001a\u00020\u0004*\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007*H\b\u0000\u0010\f\" \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000f0\u00100\r2 \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000f0\u00100\r*\u0018\b\u0000\u0010\u0012\"\b\u0012\u0004\u0012\u00020\u00010\u00132\b\u0012\u0004\u0012\u00020\u00010\u0013*T\b\u0000\u0010\u0014\"&\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u000f0\u0010\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000f0\u00100\r2&\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u000f0\u0010\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000f0\u00100\r*T\b\u0000\u0010\u0016\"&\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u000f0\u0010\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000f0\u00100\r2&\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u000f0\u0010\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000f0\u00100\r*~\b\u0000\u0010\u0018\";\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u000f0\u0010\u0012%\u0012#\u0012\u0004\u0012\u00020\u0011\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00020\u000f0\u001a0\r2;\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u000f0\u0010\u0012%\u0012#\u0012\u0004\u0012\u00020\u0011\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00020\u000f0\u001a0\r*`\b\u0000\u0010\u001e\",\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u000f0\u0010\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u000f0\u001a0\r2,\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u000f0\u0010\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u000f0\u001a0\r*`\b\u0000\u0010 \",\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u000f0\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000f0\u00100\r2,\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u000f0\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000f0\u00100\r*\u008a\u0001\b\u0000\u0010!\"A\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u000f0\u001a\u0012%\u0012#\u0012\u0004\u0012\u00020\u0011\u0012\u0013\u0012\u00110#¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\u000f0\u001a0\r2A\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u000f0\u001a\u0012%\u0012#\u0012\u0004\u0012\u00020\u0011\u0012\u0013\u0012\u00110#¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\u000f0\u001a0\r*T\b\u0000\u0010%\"&\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u000f0\u001a0\r2&\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u000f0\u001a0\r*p\b\u0000\u0010&\"\u000e\u0012\u0004\u0012\u0002`'\u0012\u0004\u0012\u0002`(0\r2Z\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u000f0\u0010j\u0002`'\u0012@\u0012>\u0012\u0004\u0012\u00020\u0011\u0012\u0013\u0012\u00110+¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(,\u0012\u0015\u0012\u0013\u0018\u00010\u001f¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(-\u0012\u0004\u0012\u00020\u000f0*j\u0002`(0\r*|\b\u0000\u0010.\":\u0012\u0004\u0012\u00020\u0011\u0012\u0013\u0012\u00110+¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(,\u0012\u0015\u0012\u0013\u0018\u00010\u001f¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(-\u0012\u0004\u0012\u00020\u000f0*2:\u0012\u0004\u0012\u00020\u0011\u0012\u0013\u0012\u00110+¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(,\u0012\u0015\u0012\u0013\u0018\u00010\u001f¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(-\u0012\u0004\u0012\u00020\u000f0**$\b\u0000\u0010/\"\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u000f0\u00102\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u000f0\u0010*T\b\u0000\u00100\"&\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020\u000f0\u0010\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000f0\u00100\r2&\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020\u000f0\u0010\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000f0\u00100\r*$\b\u0000\u00102\"\u000e\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020\u000f0\u00102\u000e\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020\u000f0\u0010*T\b\u0000\u00104\"&\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00020\u000f0\u0010\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000f0\u00100\r2&\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00020\u000f0\u0010\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000f0\u00100\r*T\b\u0000\u00106\"&\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u00020\u000f0\u0010\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000f0\u00100\r2&\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u00020\u000f0\u0010\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000f0\u00100\r¨\u00068"}, d2 = {"ATTRIBUTES_ERROR_RESPONSE_KEY", "", "ATTRIBUTE_ERRORS_KEY", "asLegacyProrationMode", "Lcom/revenuecat/purchases/common/LegacyProrationMode;", "Lcom/revenuecat/purchases/models/GoogleReplacementMode;", "getAsLegacyProrationMode", "(Lcom/revenuecat/purchases/models/GoogleReplacementMode;)Lcom/revenuecat/purchases/common/LegacyProrationMode;", "toMap", "", "", "Lcom/revenuecat/purchases/models/PricingPhase;", "AliasCallback", "Lkotlin/Pair;", "Lkotlin/Function0;", "", "Lkotlin/Function1;", "Lcom/revenuecat/purchases/PurchasesError;", "CallbackCacheKey", "", "CreateSupportTicketCallback", "", "CustomerCenterCallback", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData;", "CustomerInfoCallback", "Lcom/revenuecat/purchases/CustomerInfo;", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "isServerError", "DiagnosticsCallback", "Lorg/json/JSONObject;", "IdentifyCallback", "OfferingsCallback", "Lcom/revenuecat/purchases/common/HTTPResponseOriginalSource;", "Lcom/revenuecat/purchases/common/GetOfferingsErrorHandlingBehavior;", "errorHandlingBehavior", "PaywallEventsCallback", "PostReceiptCallback", "Lcom/revenuecat/purchases/common/PostReceiptDataSuccessCallback;", "Lcom/revenuecat/purchases/common/PostReceiptDataErrorCallback;", "Lcom/revenuecat/purchases/common/networking/PostReceiptResponse;", "Lkotlin/Function3;", "Lcom/revenuecat/purchases/common/PostReceiptErrorHandlingBehavior;", "postReceiptErrorHandlingBehavior", "body", "PostReceiptDataErrorCallback", "PostReceiptDataSuccessCallback", "ProductEntitlementCallback", "Lcom/revenuecat/purchases/common/offlineentitlements/ProductEntitlementMapping;", "RedeemWebPurchaseCallback", "Lcom/revenuecat/purchases/interfaces/RedeemWebPurchaseListener$Result;", "VirtualCurrenciesCallback", "Lcom/revenuecat/purchases/virtualcurrencies/VirtualCurrencies;", "WebBillingProductsCallback", "Lcom/revenuecat/purchases/common/networking/WebBillingProductsResponse;", "purchases_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class BackendKt {
    public static final String ATTRIBUTES_ERROR_RESPONSE_KEY = "attributes_error_response";
    public static final String ATTRIBUTE_ERRORS_KEY = "attribute_errors";

    /* compiled from: Backend.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[GoogleReplacementMode.values().length];
            try {
                iArr[GoogleReplacementMode.WITHOUT_PRORATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GoogleReplacementMode.WITH_TIME_PRORATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[GoogleReplacementMode.CHARGE_FULL_PRICE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[GoogleReplacementMode.CHARGE_PRORATED_PRICE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[GoogleReplacementMode.DEFERRED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static /* synthetic */ void CustomerCenterCallback$annotations() {
    }

    public static final Map<String, Object> toMap(PricingPhase pricingPhase) {
        Intrinsics.checkNotNullParameter(pricingPhase, "<this>");
        return MapsKt.mapOf(TuplesKt.to(com.facebook.appevents.internal.Constants.GP_IAP_BILLING_PERIOD, pricingPhase.getBillingPeriod().getIso8601()), TuplesKt.to("billingCycleCount", pricingPhase.getBillingCycleCount()), TuplesKt.to(com.facebook.appevents.internal.Constants.GP_IAP_RECURRENCE_MODE, pricingPhase.getRecurrenceMode().getIdentifier()), TuplesKt.to("formattedPrice", pricingPhase.getPrice().getFormatted()), TuplesKt.to(com.facebook.appevents.internal.Constants.GP_IAP_PRICE_AMOUNT_MICROS_V5V7, Long.valueOf(pricingPhase.getPrice().getAmountMicros())), TuplesKt.to(com.facebook.appevents.internal.Constants.GP_IAP_PRICE_CURRENCY_CODE_V5V7, pricingPhase.getPrice().getCurrencyCode()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LegacyProrationMode getAsLegacyProrationMode(GoogleReplacementMode googleReplacementMode) {
        int i = WhenMappings.$EnumSwitchMapping$0[googleReplacementMode.ordinal()];
        if (i == 1) {
            return LegacyProrationMode.IMMEDIATE_WITHOUT_PRORATION;
        }
        if (i == 2) {
            return LegacyProrationMode.IMMEDIATE_WITH_TIME_PRORATION;
        }
        if (i == 3) {
            return LegacyProrationMode.IMMEDIATE_AND_CHARGE_FULL_PRICE;
        }
        if (i == 4) {
            return LegacyProrationMode.IMMEDIATE_AND_CHARGE_PRORATED_PRICE;
        }
        if (i == 5) {
            return LegacyProrationMode.DEFERRED;
        }
        throw new NoWhenBranchMatchedException();
    }
}
