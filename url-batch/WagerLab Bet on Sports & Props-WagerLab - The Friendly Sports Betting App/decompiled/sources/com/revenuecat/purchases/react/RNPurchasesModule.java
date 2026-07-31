package com.revenuecat.purchases.react;

import android.util.Log;
import com.amazon.a.a.o.b;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.revenuecat.purchases.CustomerInfo;
import com.revenuecat.purchases.DangerousSettings;
import com.revenuecat.purchases.Purchases;
import com.revenuecat.purchases.Store;
import com.revenuecat.purchases.common.PlatformInfo;
import com.revenuecat.purchases.hybridcommon.CommonKt;
import com.revenuecat.purchases.hybridcommon.ErrorContainer;
import com.revenuecat.purchases.hybridcommon.OnNullableResult;
import com.revenuecat.purchases.hybridcommon.OnResult;
import com.revenuecat.purchases.hybridcommon.OnResultAny;
import com.revenuecat.purchases.hybridcommon.OnResultList;
import com.revenuecat.purchases.hybridcommon.SubscriberAttributesKt;
import com.revenuecat.purchases.hybridcommon.mappers.CustomerInfoMapperKt;
import com.revenuecat.purchases.interfaces.UpdatedCustomerInfoListener;
import com.revenuecat.purchases.models.InAppMessageType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.UninitializedPropertyAccessException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes7.dex */
public class RNPurchasesModule extends ReactContextBaseJavaModule implements UpdatedCustomerInfoListener {
    private static final String CUSTOMER_INFO_UPDATED = "Purchases-CustomerInfoUpdated";
    private static final String LOG_HANDLER_EVENT = "Purchases-LogHandlerEvent";
    public static final String PLATFORM_NAME = "react-native";
    public static final String PLUGIN_VERSION = "9.6.13";
    private final ReactApplicationContext reactContext;

    @ReactMethod
    public void addListener(String str) {
    }

    @ReactMethod
    public void removeListeners(Integer num) {
    }

    public RNPurchasesModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.reactContext = reactApplicationContext;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNPurchases";
    }

    @Override // com.facebook.react.bridge.NativeModule
    public void onCatalystInstanceDestroy() {
        try {
            Purchases.getSharedInstance().close();
        } catch (UninitializedPropertyAccessException unused) {
        }
    }

    @ReactMethod
    public void setupPurchases(String str, String str2, String str3, String str4, String str5, boolean z, boolean z2, String str6, boolean z3, boolean z4, boolean z5, String str7) {
        PlatformInfo platformInfo = new PlatformInfo(PLATFORM_NAME, PLUGIN_VERSION);
        Store store = Store.PLAY_STORE;
        if (z) {
            store = Store.AMAZON;
        }
        CommonKt.configure(this.reactContext, str, str2, str3, platformInfo, store, new DangerousSettings(), Boolean.valueOf(z2), str6, Boolean.valueOf(z3), Boolean.valueOf(z4), Boolean.valueOf(z5), str7);
        Purchases.getSharedInstance().setUpdatedCustomerInfoListener(this);
    }

    @ReactMethod
    public void setAllowSharingStoreAccount(boolean z) {
        CommonKt.setAllowSharingAppStoreAccount(z);
    }

    @ReactMethod
    public void getOfferings(Promise promise) {
        CommonKt.getOfferings(getOnResult(promise));
    }

    @ReactMethod
    public void getCurrentOfferingForPlacement(String str, Promise promise) {
        CommonKt.getCurrentOfferingForPlacement(str, getOnNullableResult(promise));
    }

    @ReactMethod
    public void syncAttributesAndOfferingsIfNeeded(Promise promise) {
        CommonKt.syncAttributesAndOfferingsIfNeeded(getOnResult(promise));
    }

    @ReactMethod
    public void getProductInfo(ReadableArray readableArray, String str, final Promise promise) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < readableArray.size(); i++) {
            arrayList.add(readableArray.getString(i));
        }
        CommonKt.getProductInfo(arrayList, str, new OnResultList() { // from class: com.revenuecat.purchases.react.RNPurchasesModule.1
            @Override // com.revenuecat.purchases.hybridcommon.OnResultList
            public void onReceived(List<Map<String, ?>> list) {
                WritableArray createArray = Arguments.createArray();
                Iterator<Map<String, ?>> it = list.iterator();
                while (it.hasNext()) {
                    createArray.pushMap(RNPurchasesConverters.convertMapToWriteableMap(it.next()));
                }
                promise.resolve(createArray);
            }

            @Override // com.revenuecat.purchases.hybridcommon.OnResultList
            public void onError(ErrorContainer errorContainer) {
                promise.reject(errorContainer.getCode() + "", errorContainer.getMessage(), RNPurchasesConverters.convertMapToWriteableMap(errorContainer.getInfo()));
            }
        });
    }

    @ReactMethod
    public void purchaseProduct(String str, ReadableMap readableMap, String str2, String str3, ReadableMap readableMap2, ReadableMap readableMap3, Promise promise) {
        GoogleUpgradeInfo upgradeInfo = getUpgradeInfo(readableMap);
        CommonKt.purchaseProduct(getReactApplicationContext().getCurrentActivity(), str, str2, null, upgradeInfo.getOldProductIdentifier(), upgradeInfo.getProrationMode(), (readableMap2 == null || !readableMap2.hasKey("isPersonalizedPrice")) ? null : Boolean.valueOf(readableMap2.getBoolean("isPersonalizedPrice")), readableMap3 != null ? readableMap3.toHashMap() : null, getOnResult(promise));
    }

    @ReactMethod
    public void purchasePackage(String str, ReadableMap readableMap, ReadableMap readableMap2, String str2, ReadableMap readableMap3, Promise promise) {
        GoogleUpgradeInfo upgradeInfo = getUpgradeInfo(readableMap2);
        Boolean valueOf = (readableMap3 == null || !readableMap3.hasKey("isPersonalizedPrice")) ? null : Boolean.valueOf(readableMap3.getBoolean("isPersonalizedPrice"));
        CommonKt.purchasePackage(getReactApplicationContext().getCurrentActivity(), str, readableMap.toHashMap(), upgradeInfo.getOldProductIdentifier(), upgradeInfo.getProrationMode(), valueOf, getOnResult(promise));
    }

    @ReactMethod
    public void purchaseSubscriptionOption(String str, String str2, ReadableMap readableMap, String str3, ReadableMap readableMap2, ReadableMap readableMap3, Promise promise) {
        GoogleUpgradeInfo upgradeInfo = getUpgradeInfo(readableMap);
        CommonKt.purchaseSubscriptionOption(getReactApplicationContext().getCurrentActivity(), str, str2, upgradeInfo.getOldProductIdentifier(), upgradeInfo.getProrationMode(), (readableMap2 == null || !readableMap2.hasKey("isPersonalizedPrice")) ? null : Boolean.valueOf(readableMap2.getBoolean("isPersonalizedPrice")), readableMap3 != null ? readableMap3.toHashMap() : null, getOnResult(promise));
    }

    @ReactMethod
    public void getAppUserID(Promise promise) {
        promise.resolve(CommonKt.getAppUserID());
    }

    @ReactMethod
    public void getStorefront(final Promise promise) {
        CommonKt.getStorefront(new Function1() { // from class: com.revenuecat.purchases.react.RNPurchasesModule$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RNPurchasesModule.lambda$getStorefront$0(Promise.this, (Map) obj);
            }
        });
    }

    static /* synthetic */ Unit lambda$getStorefront$0(Promise promise, Map map) {
        if (map == null) {
            promise.resolve(null);
        } else {
            promise.resolve(RNPurchasesConverters.convertMapToWriteableMap(map));
        }
        return null;
    }

    @ReactMethod
    public void restorePurchases(Promise promise) {
        CommonKt.restorePurchases(getOnResult(promise));
    }

    @ReactMethod
    public void logOut(Promise promise) {
        CommonKt.logOut(getOnResult(promise));
    }

    @ReactMethod
    public void logIn(String str, Promise promise) {
        CommonKt.logIn(str, getOnResult(promise));
    }

    @ReactMethod
    @Deprecated
    public void setDebugLogsEnabled(boolean z) {
        CommonKt.setDebugLogsEnabled(z);
    }

    @ReactMethod
    public void setLogLevel(String str) {
        CommonKt.setLogLevel(str);
    }

    @ReactMethod
    public void setLogHandler() {
        CommonKt.setLogHandler(new Function1() { // from class: com.revenuecat.purchases.react.RNPurchasesModule$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit lambda$setLogHandler$1;
                lambda$setLogHandler$1 = RNPurchasesModule.this.lambda$setLogHandler$1((Map) obj);
                return lambda$setLogHandler$1;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Unit lambda$setLogHandler$1(Map map) {
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) this.reactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(LOG_HANDLER_EVENT, RNPurchasesConverters.convertMapToWriteableMap(map));
        return null;
    }

    @ReactMethod
    public void getCustomerInfo(Promise promise) {
        CommonKt.getCustomerInfo(getOnResult(promise));
    }

    @ReactMethod
    public void syncPurchases() {
        CommonKt.syncPurchases();
    }

    @ReactMethod
    public void isAnonymous(Promise promise) {
        promise.resolve(Boolean.valueOf(CommonKt.isAnonymous()));
    }

    @ReactMethod
    public void checkTrialOrIntroductoryPriceEligibility(ReadableArray readableArray, Promise promise) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < readableArray.size(); i++) {
            arrayList.add(readableArray.getString(i));
        }
        promise.resolve(RNPurchasesConverters.convertMapToWriteableMap(CommonKt.checkTrialOrIntroductoryPriceEligibility(arrayList)));
    }

    @Override // com.revenuecat.purchases.interfaces.UpdatedCustomerInfoListener
    public void onReceived(CustomerInfo customerInfo) {
        CustomerInfoMapperKt.mapAsync(customerInfo, new Function1() { // from class: com.revenuecat.purchases.react.RNPurchasesModule$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit lambda$onReceived$2;
                lambda$onReceived$2 = RNPurchasesModule.this.lambda$onReceived$2((Map) obj);
                return lambda$onReceived$2;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Unit lambda$onReceived$2(Map map) {
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) this.reactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(CUSTOMER_INFO_UPDATED, RNPurchasesConverters.convertMapToWriteableMap(map));
        return Unit.INSTANCE;
    }

    @ReactMethod
    public void invalidateCustomerInfoCache() {
        CommonKt.invalidateCustomerInfoCache();
    }

    @ReactMethod
    public void setProxyURLString(String str, Promise promise) {
        CommonKt.setProxyURLString(str);
        promise.resolve(null);
    }

    @ReactMethod
    public void isConfigured(Promise promise) {
        promise.resolve(Boolean.valueOf(Purchases.isConfigured()));
    }

    @ReactMethod
    public void overridePreferredLocale(String str) {
        CommonKt.overridePreferredLocale(str);
    }

    @ReactMethod
    public void getVirtualCurrencies(Promise promise) {
        CommonKt.getVirtualCurrencies(getOnResult(promise));
    }

    @ReactMethod
    public void invalidateVirtualCurrenciesCache() {
        CommonKt.invalidateVirtualCurrenciesCache();
    }

    @ReactMethod
    public void getCachedVirtualCurrencies(Promise promise) {
        Map<String, Object> cachedVirtualCurrencies = CommonKt.getCachedVirtualCurrencies();
        if (cachedVirtualCurrencies == null) {
            promise.resolve(null);
        } else {
            promise.resolve(RNPurchasesConverters.convertMapToWriteableMap(cachedVirtualCurrencies));
        }
    }

    @ReactMethod
    public void setAttributes(ReadableMap readableMap) {
        SubscriberAttributesKt.setAttributes(readableMap.toHashMap());
    }

    @ReactMethod
    public void setEmail(String str) {
        SubscriberAttributesKt.setEmail(str);
    }

    @ReactMethod
    public void setPhoneNumber(String str) {
        SubscriberAttributesKt.setPhoneNumber(str);
    }

    @ReactMethod
    public void setDisplayName(String str) {
        SubscriberAttributesKt.setDisplayName(str);
    }

    @ReactMethod
    public void setPushToken(String str) {
        SubscriberAttributesKt.setPushToken(str);
    }

    @ReactMethod
    public void collectDeviceIdentifiers() {
        SubscriberAttributesKt.collectDeviceIdentifiers();
    }

    @ReactMethod
    public void setAdjustID(String str) {
        SubscriberAttributesKt.setAdjustID(str);
    }

    @ReactMethod
    public void setAppsflyerID(String str) {
        SubscriberAttributesKt.setAppsflyerID(str);
    }

    @ReactMethod
    public void setFBAnonymousID(String str) {
        SubscriberAttributesKt.setFBAnonymousID(str);
    }

    @ReactMethod
    public void setMparticleID(String str) {
        SubscriberAttributesKt.setMparticleID(str);
    }

    @ReactMethod
    public void setCleverTapID(String str) {
        SubscriberAttributesKt.setCleverTapID(str);
    }

    @ReactMethod
    public void setMixpanelDistinctID(String str) {
        SubscriberAttributesKt.setMixpanelDistinctID(str);
    }

    @ReactMethod
    public void setFirebaseAppInstanceID(String str) {
        SubscriberAttributesKt.setFirebaseAppInstanceID(str);
    }

    @ReactMethod
    public void setTenjinAnalyticsInstallationID(String str) {
        SubscriberAttributesKt.setTenjinAnalyticsInstallationID(str);
    }

    @ReactMethod
    public void setKochavaDeviceID(String str) {
        SubscriberAttributesKt.setKochavaDeviceID(str);
    }

    @ReactMethod
    public void setOnesignalID(String str) {
        SubscriberAttributesKt.setOnesignalID(str);
    }

    @ReactMethod
    public void setAirshipChannelID(String str) {
        SubscriberAttributesKt.setAirshipChannelID(str);
    }

    @ReactMethod
    public void setMediaSource(String str) {
        SubscriberAttributesKt.setMediaSource(str);
    }

    @ReactMethod
    public void setCampaign(String str) {
        SubscriberAttributesKt.setCampaign(str);
    }

    @ReactMethod
    public void setAdGroup(String str) {
        SubscriberAttributesKt.setAdGroup(str);
    }

    @ReactMethod
    public void setAd(String str) {
        SubscriberAttributesKt.setAd(str);
    }

    @ReactMethod
    public void setKeyword(String str) {
        SubscriberAttributesKt.setKeyword(str);
    }

    @ReactMethod
    public void setCreative(String str) {
        SubscriberAttributesKt.setCreative(str);
    }

    @ReactMethod
    public void canMakePayments(ReadableArray readableArray, final Promise promise) {
        ArrayList arrayList = new ArrayList();
        if (readableArray != null) {
            for (int i = 0; i < readableArray.size(); i++) {
                arrayList.add(Integer.valueOf(readableArray.getInt(i)));
            }
        }
        CommonKt.canMakePayments(this.reactContext, arrayList, new OnResultAny<Boolean>() { // from class: com.revenuecat.purchases.react.RNPurchasesModule.2
            @Override // com.revenuecat.purchases.hybridcommon.OnResultAny
            public void onError(ErrorContainer errorContainer) {
                promise.reject(errorContainer.getCode() + "", errorContainer.getMessage(), RNPurchasesConverters.convertMapToWriteableMap(errorContainer.getInfo()));
            }

            @Override // com.revenuecat.purchases.hybridcommon.OnResultAny
            public void onReceived(Boolean bool) {
                promise.resolve(bool);
            }
        });
    }

    @ReactMethod
    public void syncAmazonPurchase(String str, String str2, String str3, String str4, Double d, Promise promise) {
        Purchases.getSharedInstance().syncAmazonPurchase(str, str2, str3, str4, d);
        promise.resolve(null);
    }

    @ReactMethod
    @Deprecated
    public void syncObserverModeAmazonPurchase(String str, String str2, String str3, String str4, Double d, Promise promise) {
        syncAmazonPurchase(str, str2, str3, str4, d, promise);
    }

    @ReactMethod
    public void showInAppMessages(ReadableArray readableArray, Promise promise) {
        if (readableArray == null) {
            CommonKt.showInAppMessagesIfNeeded(getReactApplicationContext().getCurrentActivity());
        } else {
            ArrayList arrayList = new ArrayList();
            InAppMessageType[] values = InAppMessageType.values();
            for (int i = 0; i < readableArray.size(); i++) {
                int i2 = readableArray.getInt(i);
                InAppMessageType inAppMessageType = i2 < values.length ? values[i2] : null;
                if (inAppMessageType != null) {
                    arrayList.add(inAppMessageType);
                } else {
                    Log.e("RNPurchases", "Invalid in-app message type: " + i2);
                }
            }
            CommonKt.showInAppMessagesIfNeeded(getReactApplicationContext().getCurrentActivity(), arrayList);
        }
        promise.resolve(null);
    }

    @ReactMethod
    public void isWebPurchaseRedemptionURL(String str, Promise promise) {
        promise.resolve(Boolean.valueOf(CommonKt.isWebPurchaseRedemptionURL(str)));
    }

    @ReactMethod
    public void redeemWebPurchase(String str, Promise promise) {
        CommonKt.redeemWebPurchase(str, getOnResult(promise));
    }

    private OnResult getOnResult(final Promise promise) {
        return new OnResult() { // from class: com.revenuecat.purchases.react.RNPurchasesModule.3
            @Override // com.revenuecat.purchases.hybridcommon.OnResult
            public void onReceived(Map<String, ?> map) {
                promise.resolve(RNPurchasesConverters.convertMapToWriteableMap(map));
            }

            @Override // com.revenuecat.purchases.hybridcommon.OnResult
            public void onError(ErrorContainer errorContainer) {
                promise.reject(errorContainer.getCode() + "", errorContainer.getMessage(), RNPurchasesConverters.convertMapToWriteableMap(errorContainer.getInfo()));
            }
        };
    }

    private OnNullableResult getOnNullableResult(final Promise promise) {
        return new OnNullableResult() { // from class: com.revenuecat.purchases.react.RNPurchasesModule.4
            @Override // com.revenuecat.purchases.hybridcommon.OnNullableResult
            public void onReceived(Map<String, ?> map) {
                if (map != null) {
                    promise.resolve(RNPurchasesConverters.convertMapToWriteableMap(map));
                } else {
                    promise.resolve(null);
                }
            }

            @Override // com.revenuecat.purchases.hybridcommon.OnNullableResult
            public void onError(ErrorContainer errorContainer) {
                promise.reject(errorContainer.getCode() + "", errorContainer.getMessage(), RNPurchasesConverters.convertMapToWriteableMap(errorContainer.getInfo()));
            }
        };
    }

    private static GoogleUpgradeInfo getUpgradeInfo(ReadableMap readableMap) {
        Integer num;
        String str = null;
        if (readableMap != null) {
            String string = readableMap.hasKey("oldProductIdentifier") ? readableMap.getString("oldProductIdentifier") : null;
            num = readableMap.hasKey(b.l) ? Integer.valueOf(readableMap.getInt(b.l)) : null;
            if (string != null) {
                str = string;
            } else if (readableMap.hasKey("oldSKU")) {
                str = readableMap.getString("oldSKU");
            }
        } else {
            num = null;
        }
        return new GoogleUpgradeInfo(str, num);
    }
}
