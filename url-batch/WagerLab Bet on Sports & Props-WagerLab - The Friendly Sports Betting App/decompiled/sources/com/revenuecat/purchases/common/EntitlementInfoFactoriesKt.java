package com.revenuecat.purchases.common;

import com.revenuecat.purchases.EntitlementInfo;
import com.revenuecat.purchases.EntitlementInfos;
import com.revenuecat.purchases.LogHandler;
import com.revenuecat.purchases.LogLevel;
import com.revenuecat.purchases.OwnershipType;
import com.revenuecat.purchases.PeriodType;
import com.revenuecat.purchases.Store;
import com.revenuecat.purchases.VerificationResult;
import com.revenuecat.purchases.common.responses.EntitlementsResponseJsonKeys;
import com.revenuecat.purchases.common.responses.ProductResponseJsonKeys;
import com.revenuecat.purchases.strings.PurchaseStrings;
import com.revenuecat.purchases.utils.DateActive;
import com.revenuecat.purchases.utils.DateHelper;
import com.revenuecat.purchases.utils.EntitlementInfoHelper;
import com.revenuecat.purchases.utils.JSONObjectExtensionsKt;
import expo.modules.notifications.service.NotificationsService;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: EntitlementInfoFactories.kt */
@Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\"\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0002\u001a,\u0010\u0007\u001a\u00020\b*\u00020\t2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fH\u0000\u001a,\u0010\r\u001a\u00020\u000e*\u00020\t2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fH\u0000\u001a\u0014\u0010\u0011\u001a\u00020\u0012*\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0003H\u0000\u001a\u0014\u0010\u0014\u001a\u00020\u0015*\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0003H\u0000\u001a\u0014\u0010\u0016\u001a\u00020\u0017*\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0003H\u0000¨\u0006\u0018"}, d2 = {"isDateActive", "", NotificationsService.IDENTIFIER_KEY, "", "expirationDate", "Ljava/util/Date;", "requestDate", "buildEntitlementInfo", "Lcom/revenuecat/purchases/EntitlementInfo;", "Lorg/json/JSONObject;", "productData", "verificationResult", "Lcom/revenuecat/purchases/VerificationResult;", "buildEntitlementInfos", "Lcom/revenuecat/purchases/EntitlementInfos;", "subscriptions", "nonSubscriptionsLatestPurchases", "getStore", "Lcom/revenuecat/purchases/Store;", "name", "optOwnershipType", "Lcom/revenuecat/purchases/OwnershipType;", "optPeriodType", "Lcom/revenuecat/purchases/PeriodType;", "purchases_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class EntitlementInfoFactoriesKt {
    public static final EntitlementInfos buildEntitlementInfos(JSONObject jSONObject, JSONObject subscriptions, JSONObject nonSubscriptionsLatestPurchases, Date requestDate, VerificationResult verificationResult) {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        Intrinsics.checkNotNullParameter(subscriptions, "subscriptions");
        Intrinsics.checkNotNullParameter(nonSubscriptionsLatestPurchases, "nonSubscriptionsLatestPurchases");
        Intrinsics.checkNotNullParameter(requestDate, "requestDate");
        Intrinsics.checkNotNullParameter(verificationResult, "verificationResult");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<String> keys = jSONObject.keys();
        Intrinsics.checkNotNullExpressionValue(keys, "keys()");
        while (keys.hasNext()) {
            String entitlementId = keys.next();
            JSONObject entitlement = jSONObject.getJSONObject(entitlementId);
            String it = entitlement.optString(EntitlementsResponseJsonKeys.PRODUCT_IDENTIFIER);
            Intrinsics.checkNotNullExpressionValue(it, "it");
            if (it.length() <= 0) {
                it = null;
            }
            if (it != null) {
                if (subscriptions.has(it)) {
                    Intrinsics.checkNotNullExpressionValue(entitlementId, "entitlementId");
                    Intrinsics.checkNotNullExpressionValue(entitlement, "entitlement");
                    JSONObject jSONObject2 = subscriptions.getJSONObject(it);
                    Intrinsics.checkNotNullExpressionValue(jSONObject2, "subscriptions.getJSONObject(productIdentifier)");
                    linkedHashMap.put(entitlementId, buildEntitlementInfo(entitlement, entitlementId, jSONObject2, requestDate, verificationResult));
                } else if (nonSubscriptionsLatestPurchases.has(it)) {
                    Intrinsics.checkNotNullExpressionValue(entitlementId, "entitlementId");
                    Intrinsics.checkNotNullExpressionValue(entitlement, "entitlement");
                    JSONObject jSONObject3 = nonSubscriptionsLatestPurchases.getJSONObject(it);
                    Intrinsics.checkNotNullExpressionValue(jSONObject3, "nonSubscriptionsLatestPu…Object(productIdentifier)");
                    linkedHashMap.put(entitlementId, buildEntitlementInfo(entitlement, entitlementId, jSONObject3, requestDate, verificationResult));
                }
            }
        }
        return new EntitlementInfos(linkedHashMap, verificationResult);
    }

    public static final Store getStore(JSONObject jSONObject, String name) {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        Store.Companion companion = Store.INSTANCE;
        String string = jSONObject.getString(name);
        Intrinsics.checkNotNullExpressionValue(string, "getString(name)");
        return companion.fromString(string);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final PeriodType optPeriodType(JSONObject jSONObject, String name) {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        String optString = jSONObject.optString(name);
        if (optString != null) {
            switch (optString.hashCode()) {
                case -1039745817:
                    if (optString.equals("normal")) {
                        return PeriodType.NORMAL;
                    }
                    break;
                case -318370833:
                    if (optString.equals("prepaid")) {
                        return PeriodType.PREPAID;
                    }
                    break;
                case 100361836:
                    if (optString.equals("intro")) {
                        return PeriodType.INTRO;
                    }
                    break;
                case 110628630:
                    if (optString.equals("trial")) {
                        return PeriodType.TRIAL;
                    }
                    break;
            }
        }
        return PeriodType.NORMAL;
    }

    public static final OwnershipType optOwnershipType(JSONObject jSONObject, String name) {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        String optString = jSONObject.optString(name);
        return Intrinsics.areEqual(optString, "PURCHASED") ? OwnershipType.PURCHASED : Intrinsics.areEqual(optString, "FAMILY_SHARED") ? OwnershipType.FAMILY_SHARED : OwnershipType.UNKNOWN;
    }

    public static final EntitlementInfo buildEntitlementInfo(JSONObject jSONObject, String identifier, JSONObject productData, Date requestDate, VerificationResult verificationResult) {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(productData, "productData");
        Intrinsics.checkNotNullParameter(requestDate, "requestDate");
        Intrinsics.checkNotNullParameter(verificationResult, "verificationResult");
        Date optDate = JSONObjectExtensionsKt.optDate(jSONObject, "expires_date");
        Date optDate2 = JSONObjectExtensionsKt.optDate(productData, ProductResponseJsonKeys.UNSUBSCRIBE_DETECTED_AT);
        Date optDate3 = JSONObjectExtensionsKt.optDate(productData, ProductResponseJsonKeys.BILLING_ISSUES_DETECTED_AT);
        PeriodType optPeriodType = optPeriodType(productData, ProductResponseJsonKeys.PERIOD_TYPE);
        Store store = getStore(productData, ProductResponseJsonKeys.STORE);
        boolean isDateActive = isDateActive(identifier, optDate, requestDate);
        boolean willRenew = EntitlementInfoHelper.INSTANCE.getWillRenew(store, optDate, optDate2, optDate3, optPeriodType);
        Date date = JSONObjectExtensionsKt.getDate(jSONObject, "purchase_date");
        Date date2 = JSONObjectExtensionsKt.getDate(productData, "original_purchase_date");
        String string = jSONObject.getString(EntitlementsResponseJsonKeys.PRODUCT_IDENTIFIER);
        Intrinsics.checkNotNullExpressionValue(string, "getString(EntitlementsRe…nKeys.PRODUCT_IDENTIFIER)");
        return new EntitlementInfo(identifier, isDateActive, willRenew, optPeriodType, date, date2, optDate, store, string, JSONObjectExtensionsKt.optNullableString(jSONObject, "product_plan_identifier"), productData.getBoolean(ProductResponseJsonKeys.IS_SANDBOX), optDate2, optDate3, optOwnershipType(productData, ProductResponseJsonKeys.OWNERSHIP_TYPE), jSONObject, verificationResult);
    }

    private static final boolean isDateActive(String str, Date date, Date date2) {
        DateActive m10711isDateActiveSxA4cEA$default = DateHelper.Companion.m10711isDateActiveSxA4cEA$default(DateHelper.INSTANCE, date, date2, 0L, 4, null);
        if (!m10711isDateActiveSxA4cEA$default.isActive() && !m10711isDateActiveSxA4cEA$default.getInGracePeriod()) {
            LogLevel logLevel = LogLevel.WARN;
            LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
            if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                String str2 = "[Purchases] - " + logLevel.name();
                String format = String.format(PurchaseStrings.ENTITLEMENT_EXPIRED_OUTSIDE_GRACE_PERIOD, Arrays.copyOf(new Object[]{str, date, date2}, 3));
                Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                currentLogHandler.w(str2, format);
            }
        }
        return m10711isDateActiveSxA4cEA$default.isActive();
    }
}
