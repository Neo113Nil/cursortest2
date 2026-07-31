package com.revenuecat.purchases.common.caching;

import android.content.SharedPreferences;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.revenuecat.purchases.CustomerInfo;
import com.revenuecat.purchases.CustomerInfoOriginalSource;
import com.revenuecat.purchases.LogHandler;
import com.revenuecat.purchases.LogLevel;
import com.revenuecat.purchases.VerificationResult;
import com.revenuecat.purchases.common.Config;
import com.revenuecat.purchases.common.CustomerInfoFactory;
import com.revenuecat.purchases.common.DateProvider;
import com.revenuecat.purchases.common.DefaultDateProvider;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.SharedPreferencesManager;
import com.revenuecat.purchases.common.UtilsKt;
import com.revenuecat.purchases.common.offlineentitlements.ProductEntitlementMapping;
import com.revenuecat.purchases.interfaces.StorefrontProvider;
import com.revenuecat.purchases.models.StoreTransaction;
import com.revenuecat.purchases.strings.BillingStrings;
import com.revenuecat.purchases.strings.OfflineEntitlementsStrings;
import com.revenuecat.purchases.strings.ReceiptStrings;
import com.revenuecat.purchases.strings.VirtualCurrencyStrings;
import com.revenuecat.purchases.utils.JSONObjectExtensionsKt;
import com.revenuecat.purchases.virtualcurrencies.VirtualCurrencies;
import com.revenuecat.purchases.virtualcurrencies.VirtualCurrenciesFactory;
import io.intercom.android.sdk.models.AttributeType;
import java.util.Arrays;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.json.Json;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: DeviceCache.kt */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b'\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u001a\b\u0010\u0018\u0000 {2\u00020\u0001:\u0001{B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000e\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020\u0005J\u000e\u00101\u001a\u00020/2\u0006\u00102\u001a\u00020\u0005J\u0016\u00101\u001a\u0002032\u0006\u00102\u001a\u00020\u00052\u0006\u00104\u001a\u000203J\u0016\u00105\u001a\u00020/2\u0006\u00102\u001a\u00020\u00052\u0006\u00106\u001a\u000207J\u000e\u00108\u001a\u00020/2\u0006\u00109\u001a\u00020:J\u000e\u0010;\u001a\u00020/2\u0006\u0010<\u001a\u00020=J\u0016\u0010>\u001a\u00020/2\u0006\u00102\u001a\u00020\u00052\u0006\u0010?\u001a\u00020@J\u0014\u0010A\u001a\u00020/2\f\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00050CJ\u0006\u0010D\u001a\u00020/J\u000e\u0010E\u001a\u00020/2\u0006\u00102\u001a\u00020\u0005J\u000e\u0010F\u001a\u00020/2\u0006\u00102\u001a\u00020\u0005J\u0016\u0010F\u001a\u00020/2\u0006\u00102\u001a\u00020\u00052\u0006\u0010G\u001a\u000203J\u000e\u0010H\u001a\u00020/2\u0006\u00102\u001a\u00020\u0005J\u0006\u0010I\u001a\u00020/J\u000e\u0010J\u001a\u00020/2\u0006\u00102\u001a\u00020\u0005J\u0016\u0010J\u001a\u00020/2\u0006\u00102\u001a\u00020\u00052\u0006\u0010G\u001a\u000203J\u000e\u0010K\u001a\u00020\u00052\u0006\u00102\u001a\u00020\u0005J\u000e\u0010L\u001a\u00020\u00052\u0006\u00102\u001a\u00020\u0005J\u0014\u0010M\u001a\b\u0012\u0004\u0012\u00020\u00050C2\u0006\u0010N\u001a\u00020\u0005J \u0010O\u001a\b\u0012\u0004\u0012\u00020Q0P2\u0012\u0010B\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020Q0RJ\b\u0010S\u001a\u0004\u0018\u00010\u0005J\u0010\u0010T\u001a\u0004\u0018\u0001072\u0006\u00102\u001a\u00020\u0005J\u0010\u0010U\u001a\u0004\u0018\u00010@2\u0006\u00102\u001a\u00020\u0005J\u0010\u0010V\u001a\u00020W2\u0006\u00102\u001a\u00020\u0005H\u0002J\u0012\u0010X\u001a\u0004\u0018\u00010:2\u0006\u0010Y\u001a\u00020\u0005H\u0016J\b\u0010Z\u001a\u0004\u0018\u00010\u0005J\b\u0010[\u001a\u0004\u0018\u00010:J\f\u0010\\\u001a\b\u0012\u0004\u0012\u00020\u00050CJ\b\u0010]\u001a\u0004\u0018\u00010=J\n\u0010^\u001a\u0004\u0018\u00010WH\u0002J\n\u0010_\u001a\u0004\u0018\u00010\u0005H\u0016J\u0010\u0010`\u001a\u00020W2\u0006\u00102\u001a\u00020\u0005H\u0002J\u0016\u0010a\u001a\u00020b2\u0006\u00102\u001a\u00020\u00052\u0006\u0010c\u001a\u00020bJ\u0006\u0010d\u001a\u00020bJ\u0016\u0010e\u001a\u00020b2\u0006\u00102\u001a\u00020\u00052\u0006\u0010c\u001a\u00020bJ\u000e\u0010f\u001a\u00020\u00052\u0006\u0010Y\u001a\u00020\u0005J\u0018\u0010g\u001a\u00020/2\u0006\u0010N\u001a\u00020\u00052\u0006\u0010h\u001a\u00020\u0005H\u0016J\u000e\u0010i\u001a\u00020/2\u0006\u0010N\u001a\u00020\u0005J\u0016\u0010j\u001a\u00020/2\u0006\u00102\u001a\u00020\u00052\u0006\u0010k\u001a\u00020WJ\u000e\u0010l\u001a\u00020/2\u0006\u00102\u001a\u00020\u0005J\u0010\u0010m\u001a\u00020/2\u0006\u0010k\u001a\u00020WH\u0002J\u0006\u0010n\u001a\u00020/J\u0016\u0010o\u001a\u00020/2\f\u0010p\u001a\b\u0012\u0004\u0012\u00020\u00050CH\u0002J\u000e\u0010q\u001a\u00020/2\u0006\u0010r\u001a\u00020\u0005J\u0016\u0010s\u001a\u00020/2\u0006\u00102\u001a\u00020\u00052\u0006\u0010k\u001a\u00020WJ\u000e\u0010t\u001a\u00020/2\u0006\u00102\u001a\u00020\u0005J\u0006\u0010u\u001a\u000203J\u000e\u0010v\u001a\u00020\u00052\u0006\u00102\u001a\u00020\u0005J\u000e\u0010w\u001a\u00020\u00052\u0006\u00102\u001a\u00020\u0005J\f\u0010x\u001a\u000203*\u000203H\u0002J\f\u0010y\u001a\u000203*\u000203H\u0002J\u0014\u0010H\u001a\u000203*\u0002032\u0006\u00102\u001a\u00020\u0005H\u0002J\u0014\u0010J\u001a\u000203*\u0002032\u0006\u00102\u001a\u00020\u0005H\u0002J\u0014\u0010z\u001a\u000203*\u0002032\u0006\u00102\u001a\u00020\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\t\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\u000e\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u000f\u0010\u000bR\u0014\u0010\u0011\u001a\u00020\u0005X\u0080D¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000bR\u001b\u0010\u0013\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\r\u001a\u0004\b\u0014\u0010\u000bR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0016\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\r\u001a\u0004\b\u0017\u0010\u000bR\u001b\u0010\u0019\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\r\u001a\u0004\b\u001a\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u001c\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\r\u001a\u0004\b\u001d\u0010\u000bR\u001b\u0010\u001f\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\r\u001a\u0004\b \u0010\u000bR\u001b\u0010\"\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\r\u001a\u0004\b#\u0010\u000bR\u001b\u0010%\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b'\u0010\r\u001a\u0004\b&\u0010\u000bR\u001b\u0010(\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010\r\u001a\u0004\b)\u0010\u000bR\u001b\u0010+\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010\r\u001a\u0004\b,\u0010\u000b¨\u0006|"}, d2 = {"Lcom/revenuecat/purchases/common/caching/DeviceCache;", "Lcom/revenuecat/purchases/interfaces/StorefrontProvider;", "preferences", "Landroid/content/SharedPreferences;", "apiKey", "", "dateProvider", "Lcom/revenuecat/purchases/common/DateProvider;", "(Landroid/content/SharedPreferences;Ljava/lang/String;Lcom/revenuecat/purchases/common/DateProvider;)V", "apiKeyPrefix", "getApiKeyPrefix", "()Ljava/lang/String;", "apiKeyPrefix$delegate", "Lkotlin/Lazy;", "appUserIDCacheKey", "getAppUserIDCacheKey", "appUserIDCacheKey$delegate", "attributionCacheKey", "getAttributionCacheKey$purchases_defaultsBc8Release", "customerInfoCachesLastUpdatedCacheBaseKey", "getCustomerInfoCachesLastUpdatedCacheBaseKey", "customerInfoCachesLastUpdatedCacheBaseKey$delegate", "legacyAppUserIDCacheKey", "getLegacyAppUserIDCacheKey", "legacyAppUserIDCacheKey$delegate", "offeringsResponseCacheKey", "getOfferingsResponseCacheKey", "offeringsResponseCacheKey$delegate", "productEntitlementMappingCacheKey", "getProductEntitlementMappingCacheKey", "productEntitlementMappingCacheKey$delegate", "productEntitlementMappingLastUpdatedCacheKey", "getProductEntitlementMappingLastUpdatedCacheKey", "productEntitlementMappingLastUpdatedCacheKey$delegate", "storefrontCacheKey", "getStorefrontCacheKey", "storefrontCacheKey$delegate", "tokensCacheKey", "getTokensCacheKey", "tokensCacheKey$delegate", "virtualCurrenciesCacheBaseKey", "getVirtualCurrenciesCacheBaseKey", "virtualCurrenciesCacheBaseKey$delegate", "virtualCurrenciesLastUpdatedCacheBaseKey", "getVirtualCurrenciesLastUpdatedCacheBaseKey", "virtualCurrenciesLastUpdatedCacheBaseKey$delegate", "addSuccessfullyPostedToken", "", "token", "cacheAppUserID", "appUserID", "Landroid/content/SharedPreferences$Editor;", "cacheEditor", "cacheCustomerInfo", "info", "Lcom/revenuecat/purchases/CustomerInfo;", "cacheOfferingsResponse", "offeringsResponse", "Lorg/json/JSONObject;", "cacheProductEntitlementMapping", "productEntitlementMapping", "Lcom/revenuecat/purchases/common/offlineentitlements/ProductEntitlementMapping;", "cacheVirtualCurrencies", "virtualCurrencies", "Lcom/revenuecat/purchases/virtualcurrencies/VirtualCurrencies;", "cleanPreviouslySentTokens", "hashedTokens", "", "cleanupOldAttributionData", "clearCachesForAppUserID", "clearCustomerInfoCache", "editor", "clearCustomerInfoCacheTimestamp", "clearOfferingsResponseCache", "clearVirtualCurrenciesCache", "customerInfoCacheKey", "customerInfoLastUpdatedCacheKey", "findKeysThatStartWith", "cacheKey", "getActivePurchasesNotInCache", "", "Lcom/revenuecat/purchases/models/StoreTransaction;", "", "getCachedAppUserID", "getCachedCustomerInfo", "getCachedVirtualCurrencies", "getCustomerInfoCachesLastUpdated", "Ljava/util/Date;", "getJSONObjectOrNull", "key", "getLegacyCachedAppUserID", "getOfferingsResponseCache", "getPreviouslySentHashedTokens", "getProductEntitlementMapping", "getProductEntitlementMappingLastUpdated", "getStorefront", "getVirtualCurrenciesCacheLastUpdated", "isCustomerInfoCacheStale", "", "appInBackground", "isProductEntitlementMappingCacheStale", "isVirtualCurrenciesCacheStale", "newKey", "putString", "value", "remove", "setCustomerInfoCacheTimestamp", AttributeType.DATE, "setCustomerInfoCacheTimestampToNow", "setProductEntitlementMappingCacheTimestamp", "setProductEntitlementMappingCacheTimestampToNow", "setSavedTokenHashes", "newSet", "setStorefront", RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE, "setVirtualCurrenciesCacheTimestamp", "setVirtualCurrenciesCacheTimestampToNow", "startEditing", "virtualCurrenciesCacheKey", "virtualCurrenciesLastUpdatedCacheKey", "clearAppUserID", "clearCustomerInfo", "clearVirtualCurrenciesCacheTimestamp", "Companion", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public class DeviceCache implements StorefrontProvider {
    private static final String CUSTOMER_INFO_ORIGINAL_SOURCE_KEY = "customer_info_original_source";
    private static final String CUSTOMER_INFO_REQUEST_DATE_KEY = "customer_info_request_date";
    private static final String CUSTOMER_INFO_SCHEMA_VERSION_KEY = "schema_version";
    private static final String CUSTOMER_INFO_VERIFICATION_RESULT_KEY = "verification_result";
    private final String apiKey;

    /* renamed from: apiKeyPrefix$delegate, reason: from kotlin metadata */
    private final Lazy apiKeyPrefix;

    /* renamed from: appUserIDCacheKey$delegate, reason: from kotlin metadata */
    private final Lazy appUserIDCacheKey;
    private final String attributionCacheKey;

    /* renamed from: customerInfoCachesLastUpdatedCacheBaseKey$delegate, reason: from kotlin metadata */
    private final Lazy customerInfoCachesLastUpdatedCacheBaseKey;
    private final DateProvider dateProvider;

    /* renamed from: legacyAppUserIDCacheKey$delegate, reason: from kotlin metadata */
    private final Lazy legacyAppUserIDCacheKey;

    /* renamed from: offeringsResponseCacheKey$delegate, reason: from kotlin metadata */
    private final Lazy offeringsResponseCacheKey;
    private final SharedPreferences preferences;

    /* renamed from: productEntitlementMappingCacheKey$delegate, reason: from kotlin metadata */
    private final Lazy productEntitlementMappingCacheKey;

    /* renamed from: productEntitlementMappingLastUpdatedCacheKey$delegate, reason: from kotlin metadata */
    private final Lazy productEntitlementMappingLastUpdatedCacheKey;

    /* renamed from: storefrontCacheKey$delegate, reason: from kotlin metadata */
    private final Lazy storefrontCacheKey;

    /* renamed from: tokensCacheKey$delegate, reason: from kotlin metadata */
    private final Lazy tokensCacheKey;

    /* renamed from: virtualCurrenciesCacheBaseKey$delegate, reason: from kotlin metadata */
    private final Lazy virtualCurrenciesCacheBaseKey;

    /* renamed from: virtualCurrenciesLastUpdatedCacheBaseKey$delegate, reason: from kotlin metadata */
    private final Lazy virtualCurrenciesLastUpdatedCacheBaseKey;

    public DeviceCache(SharedPreferences preferences, String apiKey, DateProvider dateProvider) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.preferences = preferences;
        this.apiKey = apiKey;
        this.dateProvider = dateProvider;
        this.apiKeyPrefix = LazyKt.lazy(new Function0<String>() { // from class: com.revenuecat.purchases.common.caching.DeviceCache$apiKeyPrefix$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                String str;
                StringBuilder sb = new StringBuilder(SharedPreferencesManager.SHARED_PREFERENCES_PREFIX);
                str = DeviceCache.this.apiKey;
                return sb.append(str).toString();
            }
        });
        this.legacyAppUserIDCacheKey = LazyKt.lazy(new Function0<String>() { // from class: com.revenuecat.purchases.common.caching.DeviceCache$legacyAppUserIDCacheKey$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                String apiKeyPrefix;
                apiKeyPrefix = DeviceCache.this.getApiKeyPrefix();
                return apiKeyPrefix;
            }
        });
        this.appUserIDCacheKey = LazyKt.lazy(new Function0<String>() { // from class: com.revenuecat.purchases.common.caching.DeviceCache$appUserIDCacheKey$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                String apiKeyPrefix;
                StringBuilder sb = new StringBuilder();
                apiKeyPrefix = DeviceCache.this.getApiKeyPrefix();
                return sb.append(apiKeyPrefix).append(".new").toString();
            }
        });
        this.attributionCacheKey = "com.revenuecat.purchases..attribution";
        this.tokensCacheKey = LazyKt.lazy(new Function0<String>() { // from class: com.revenuecat.purchases.common.caching.DeviceCache$tokensCacheKey$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                String apiKeyPrefix;
                StringBuilder sb = new StringBuilder();
                apiKeyPrefix = DeviceCache.this.getApiKeyPrefix();
                return sb.append(apiKeyPrefix).append(".tokens").toString();
            }
        });
        this.storefrontCacheKey = LazyKt.lazy(new Function0<String>() { // from class: com.revenuecat.purchases.common.caching.DeviceCache$storefrontCacheKey$2
            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "storefrontCacheKey";
            }
        });
        this.productEntitlementMappingCacheKey = LazyKt.lazy(new Function0<String>() { // from class: com.revenuecat.purchases.common.caching.DeviceCache$productEntitlementMappingCacheKey$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                String apiKeyPrefix;
                StringBuilder sb = new StringBuilder();
                apiKeyPrefix = DeviceCache.this.getApiKeyPrefix();
                return sb.append(apiKeyPrefix).append(".productEntitlementMapping").toString();
            }
        });
        this.productEntitlementMappingLastUpdatedCacheKey = LazyKt.lazy(new Function0<String>() { // from class: com.revenuecat.purchases.common.caching.DeviceCache$productEntitlementMappingLastUpdatedCacheKey$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                String apiKeyPrefix;
                StringBuilder sb = new StringBuilder();
                apiKeyPrefix = DeviceCache.this.getApiKeyPrefix();
                return sb.append(apiKeyPrefix).append(".productEntitlementMappingLastUpdated").toString();
            }
        });
        this.customerInfoCachesLastUpdatedCacheBaseKey = LazyKt.lazy(new Function0<String>() { // from class: com.revenuecat.purchases.common.caching.DeviceCache$customerInfoCachesLastUpdatedCacheBaseKey$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                String apiKeyPrefix;
                StringBuilder sb = new StringBuilder();
                apiKeyPrefix = DeviceCache.this.getApiKeyPrefix();
                return sb.append(apiKeyPrefix).append(".purchaserInfoLastUpdated").toString();
            }
        });
        this.virtualCurrenciesCacheBaseKey = LazyKt.lazy(new Function0<String>() { // from class: com.revenuecat.purchases.common.caching.DeviceCache$virtualCurrenciesCacheBaseKey$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                String apiKeyPrefix;
                StringBuilder sb = new StringBuilder();
                apiKeyPrefix = DeviceCache.this.getApiKeyPrefix();
                return sb.append(apiKeyPrefix).append(".virtualCurrencies").toString();
            }
        });
        this.virtualCurrenciesLastUpdatedCacheBaseKey = LazyKt.lazy(new Function0<String>() { // from class: com.revenuecat.purchases.common.caching.DeviceCache$virtualCurrenciesLastUpdatedCacheBaseKey$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                String apiKeyPrefix;
                StringBuilder sb = new StringBuilder();
                apiKeyPrefix = DeviceCache.this.getApiKeyPrefix();
                return sb.append(apiKeyPrefix).append(".virtualCurrenciesLastUpdated").toString();
            }
        });
        this.offeringsResponseCacheKey = LazyKt.lazy(new Function0<String>() { // from class: com.revenuecat.purchases.common.caching.DeviceCache$offeringsResponseCacheKey$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                String apiKeyPrefix;
                StringBuilder sb = new StringBuilder();
                apiKeyPrefix = DeviceCache.this.getApiKeyPrefix();
                return sb.append(apiKeyPrefix).append(".offeringsResponse").toString();
            }
        });
    }

    public /* synthetic */ DeviceCache(SharedPreferences sharedPreferences, String str, DefaultDateProvider defaultDateProvider, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(sharedPreferences, str, (i & 4) != 0 ? new DefaultDateProvider() : defaultDateProvider);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getApiKeyPrefix() {
        return (String) this.apiKeyPrefix.getValue();
    }

    public final String getLegacyAppUserIDCacheKey() {
        return (String) this.legacyAppUserIDCacheKey.getValue();
    }

    public final String getAppUserIDCacheKey() {
        return (String) this.appUserIDCacheKey.getValue();
    }

    /* renamed from: getAttributionCacheKey$purchases_defaultsBc8Release, reason: from getter */
    public final String getAttributionCacheKey() {
        return this.attributionCacheKey;
    }

    public final String getTokensCacheKey() {
        return (String) this.tokensCacheKey.getValue();
    }

    public final String getStorefrontCacheKey() {
        return (String) this.storefrontCacheKey.getValue();
    }

    private final String getProductEntitlementMappingCacheKey() {
        return (String) this.productEntitlementMappingCacheKey.getValue();
    }

    private final String getProductEntitlementMappingLastUpdatedCacheKey() {
        return (String) this.productEntitlementMappingLastUpdatedCacheKey.getValue();
    }

    private final String getCustomerInfoCachesLastUpdatedCacheBaseKey() {
        return (String) this.customerInfoCachesLastUpdatedCacheBaseKey.getValue();
    }

    private final String getVirtualCurrenciesCacheBaseKey() {
        return (String) this.virtualCurrenciesCacheBaseKey.getValue();
    }

    private final String getVirtualCurrenciesLastUpdatedCacheBaseKey() {
        return (String) this.virtualCurrenciesLastUpdatedCacheBaseKey.getValue();
    }

    private final String getOfferingsResponseCacheKey() {
        return (String) this.offeringsResponseCacheKey.getValue();
    }

    public final SharedPreferences.Editor startEditing() {
        SharedPreferences.Editor edit = this.preferences.edit();
        Intrinsics.checkNotNullExpressionValue(edit, "preferences.edit()");
        return edit;
    }

    public final synchronized String getLegacyCachedAppUserID() {
        return this.preferences.getString(getLegacyAppUserIDCacheKey(), null);
    }

    public final synchronized String getCachedAppUserID() {
        return this.preferences.getString(getAppUserIDCacheKey(), null);
    }

    public final synchronized void cacheAppUserID(String appUserID) {
        Intrinsics.checkNotNullParameter(appUserID, "appUserID");
        SharedPreferences.Editor edit = this.preferences.edit();
        Intrinsics.checkNotNullExpressionValue(edit, "preferences.edit()");
        cacheAppUserID(appUserID, edit).apply();
    }

    public final synchronized SharedPreferences.Editor cacheAppUserID(String appUserID, SharedPreferences.Editor cacheEditor) {
        SharedPreferences.Editor putString;
        Intrinsics.checkNotNullParameter(appUserID, "appUserID");
        Intrinsics.checkNotNullParameter(cacheEditor, "cacheEditor");
        putString = cacheEditor.putString(getAppUserIDCacheKey(), appUserID);
        Intrinsics.checkNotNullExpressionValue(putString, "cacheEditor.putString(ap…serIDCacheKey, appUserID)");
        return putString;
    }

    public final synchronized void clearCachesForAppUserID(String appUserID) {
        Intrinsics.checkNotNullParameter(appUserID, "appUserID");
        SharedPreferences.Editor edit = this.preferences.edit();
        Intrinsics.checkNotNullExpressionValue(edit, "preferences.edit()");
        clearVirtualCurrenciesCache(clearVirtualCurrenciesCacheTimestamp(clearCustomerInfoCacheTimestamp(clearAppUserID(clearCustomerInfo(edit)), appUserID), appUserID), appUserID).apply();
    }

    private final SharedPreferences.Editor clearCustomerInfo(SharedPreferences.Editor editor) {
        String cachedAppUserID = getCachedAppUserID();
        if (cachedAppUserID != null) {
            editor.remove(customerInfoCacheKey(cachedAppUserID));
        }
        String legacyCachedAppUserID = getLegacyCachedAppUserID();
        if (legacyCachedAppUserID != null) {
            editor.remove(customerInfoCacheKey(legacyCachedAppUserID));
        }
        return editor;
    }

    private final SharedPreferences.Editor clearAppUserID(SharedPreferences.Editor editor) {
        editor.remove(getAppUserIDCacheKey());
        editor.remove(getLegacyAppUserIDCacheKey());
        return editor;
    }

    private final SharedPreferences.Editor clearCustomerInfoCacheTimestamp(SharedPreferences.Editor editor, String str) {
        editor.remove(customerInfoLastUpdatedCacheKey(str));
        return editor;
    }

    public final String customerInfoCacheKey(String appUserID) {
        Intrinsics.checkNotNullParameter(appUserID, "appUserID");
        return getLegacyAppUserIDCacheKey() + '.' + appUserID;
    }

    public final String customerInfoLastUpdatedCacheKey(String appUserID) {
        Intrinsics.checkNotNullParameter(appUserID, "appUserID");
        return getCustomerInfoCachesLastUpdatedCacheBaseKey() + '.' + appUserID;
    }

    public final CustomerInfo getCachedCustomerInfo(String appUserID) {
        String verificationResultString;
        Intrinsics.checkNotNullParameter(appUserID, "appUserID");
        String string = this.preferences.getString(customerInfoCacheKey(appUserID), null);
        if (string != null) {
            try {
                JSONObject jSONObject = new JSONObject(string);
                int optInt = jSONObject.optInt(CUSTOMER_INFO_SCHEMA_VERSION_KEY);
                if (jSONObject.has("verification_result")) {
                    verificationResultString = jSONObject.getString("verification_result");
                } else {
                    verificationResultString = "NOT_REQUESTED";
                }
                Long valueOf = Long.valueOf(jSONObject.optLong(CUSTOMER_INFO_REQUEST_DATE_KEY));
                if (valueOf.longValue() <= 0) {
                    valueOf = null;
                }
                Date date = valueOf != null ? new Date(valueOf.longValue()) : null;
                CustomerInfoOriginalSource fromString = CustomerInfoOriginalSource.INSTANCE.fromString(JSONObjectExtensionsKt.optNullableString(jSONObject, CUSTOMER_INFO_ORIGINAL_SOURCE_KEY));
                jSONObject.remove("verification_result");
                jSONObject.remove(CUSTOMER_INFO_REQUEST_DATE_KEY);
                jSONObject.remove(CUSTOMER_INFO_ORIGINAL_SOURCE_KEY);
                Intrinsics.checkNotNullExpressionValue(verificationResultString, "verificationResultString");
                VerificationResult valueOf2 = VerificationResult.valueOf(verificationResultString);
                if (optInt == 3) {
                    return CustomerInfoFactory.INSTANCE.buildCustomerInfo(jSONObject, date, valueOf2, fromString, true);
                }
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    public final synchronized void cacheCustomerInfo(String appUserID, CustomerInfo info) {
        Intrinsics.checkNotNullParameter(appUserID, "appUserID");
        Intrinsics.checkNotNullParameter(info, "info");
        JSONObject jsonObject = info.getJsonObject();
        jsonObject.put(CUSTOMER_INFO_SCHEMA_VERSION_KEY, 3);
        jsonObject.put("verification_result", info.getEntitlements().getVerification().name());
        jsonObject.put(CUSTOMER_INFO_REQUEST_DATE_KEY, info.getRequestDate().getTime());
        jsonObject.put(CUSTOMER_INFO_ORIGINAL_SOURCE_KEY, info.getOriginalSource().name());
        this.preferences.edit().putString(customerInfoCacheKey(appUserID), jsonObject.toString()).apply();
        setCustomerInfoCacheTimestampToNow(appUserID);
    }

    public final synchronized boolean isCustomerInfoCacheStale(String appUserID, boolean appInBackground) {
        Intrinsics.checkNotNullParameter(appUserID, "appUserID");
        return DateExtensionsKt.isCacheStale(getCustomerInfoCachesLastUpdated(appUserID), appInBackground, this.dateProvider);
    }

    public final synchronized void clearCustomerInfoCacheTimestamp(String appUserID) {
        Intrinsics.checkNotNullParameter(appUserID, "appUserID");
        SharedPreferences.Editor edit = this.preferences.edit();
        Intrinsics.checkNotNullExpressionValue(edit, "preferences.edit()");
        clearCustomerInfoCacheTimestamp(edit, appUserID).apply();
    }

    public final synchronized void clearCustomerInfoCache(String appUserID) {
        Intrinsics.checkNotNullParameter(appUserID, "appUserID");
        SharedPreferences.Editor editor = this.preferences.edit();
        Intrinsics.checkNotNullExpressionValue(editor, "editor");
        clearCustomerInfoCache(appUserID, editor);
        editor.apply();
    }

    public final synchronized void clearCustomerInfoCache(String appUserID, SharedPreferences.Editor editor) {
        Intrinsics.checkNotNullParameter(appUserID, "appUserID");
        Intrinsics.checkNotNullParameter(editor, "editor");
        clearCustomerInfoCacheTimestamp(editor, appUserID);
        editor.remove(customerInfoCacheKey(appUserID));
    }

    public final synchronized void setCustomerInfoCacheTimestampToNow(String appUserID) {
        Intrinsics.checkNotNullParameter(appUserID, "appUserID");
        setCustomerInfoCacheTimestamp(appUserID, this.dateProvider.getNow());
    }

    public final synchronized void setCustomerInfoCacheTimestamp(String appUserID, Date date) {
        Intrinsics.checkNotNullParameter(appUserID, "appUserID");
        Intrinsics.checkNotNullParameter(date, "date");
        this.preferences.edit().putLong(customerInfoLastUpdatedCacheKey(appUserID), date.getTime()).apply();
    }

    @Override // com.revenuecat.purchases.interfaces.StorefrontProvider
    public synchronized String getStorefront() {
        String string;
        string = this.preferences.getString(getStorefrontCacheKey(), null);
        if (string == null) {
            LogLevel logLevel = LogLevel.DEBUG;
            LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
            if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                currentLogHandler.d("[Purchases] - " + logLevel.name(), BillingStrings.BILLING_STOREFRONT_NULL_FROM_CACHE);
            }
        }
        return string;
    }

    private final synchronized Date getCustomerInfoCachesLastUpdated(String appUserID) {
        return new Date(this.preferences.getLong(customerInfoLastUpdatedCacheKey(appUserID), 0L));
    }

    public final String virtualCurrenciesCacheKey(String appUserID) {
        Intrinsics.checkNotNullParameter(appUserID, "appUserID");
        return getVirtualCurrenciesCacheBaseKey() + '.' + appUserID;
    }

    public final String virtualCurrenciesLastUpdatedCacheKey(String appUserID) {
        Intrinsics.checkNotNullParameter(appUserID, "appUserID");
        return getVirtualCurrenciesLastUpdatedCacheBaseKey() + '.' + appUserID;
    }

    public final synchronized VirtualCurrencies getCachedVirtualCurrencies(String appUserID) {
        LogHandler currentLogHandler;
        String str;
        String invoke;
        Intrinsics.checkNotNullParameter(appUserID, "appUserID");
        String string = this.preferences.getString(virtualCurrenciesCacheKey(appUserID), null);
        if (string != null) {
            try {
                return VirtualCurrenciesFactory.INSTANCE.buildVirtualCurrencies(string);
            } catch (SerializationException e) {
                final LogIntent logIntent = LogIntent.WARNING;
                Function0<String> function0 = new Function0<String>() { // from class: com.revenuecat.purchases.common.caching.DeviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        StringBuilder append = new StringBuilder().append(CollectionsKt.joinToString$default(LogIntent.this.getEmojiList(), "", null, null, 0, null, null, 62, null)).append(' ');
                        String format = String.format(VirtualCurrencyStrings.ERROR_DECODING_CACHED_VIRTUAL_CURRENCIES, Arrays.copyOf(new Object[]{e}, 1));
                        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                        return append.append(format).toString();
                    }
                };
                switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                    case 1:
                        LogLevel logLevel = LogLevel.DEBUG;
                        LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                            currentLogHandler2.d("[Purchases] - " + logLevel.name(), function0.invoke());
                            break;
                        }
                        break;
                    case 2:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", function0.invoke(), null);
                        break;
                    case 3:
                        LogLevel logLevel2 = LogLevel.WARN;
                        LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                            currentLogHandler3.w("[Purchases] - " + logLevel2.name(), function0.invoke());
                            break;
                        }
                        break;
                    case 4:
                        LogLevel logLevel3 = LogLevel.INFO;
                        LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                            currentLogHandler4.i("[Purchases] - " + logLevel3.name(), function0.invoke());
                            break;
                        }
                        break;
                    case 5:
                        LogLevel logLevel4 = LogLevel.DEBUG;
                        LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                            currentLogHandler5.d("[Purchases] - " + logLevel4.name(), function0.invoke());
                            break;
                        }
                        break;
                    case 6:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", function0.invoke(), null);
                        break;
                    case 7:
                        LogLevel logLevel5 = LogLevel.INFO;
                        LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                            currentLogHandler6.i("[Purchases] - " + logLevel5.name(), function0.invoke());
                            break;
                        }
                        break;
                    case 8:
                        LogLevel logLevel6 = LogLevel.DEBUG;
                        LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                            currentLogHandler7.d("[Purchases] - " + logLevel6.name(), function0.invoke());
                            break;
                        }
                        break;
                    case 9:
                        LogLevel logLevel7 = LogLevel.DEBUG;
                        LogHandler currentLogHandler8 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                            currentLogHandler8.d("[Purchases] - " + logLevel7.name(), function0.invoke());
                            break;
                        }
                        break;
                    case 10:
                        LogLevel logLevel8 = LogLevel.WARN;
                        LogHandler currentLogHandler9 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                            currentLogHandler9.w("[Purchases] - " + logLevel8.name(), function0.invoke());
                            break;
                        }
                        break;
                    case 11:
                        LogLevel logLevel9 = LogLevel.WARN;
                        LogHandler currentLogHandler10 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                            currentLogHandler10.w("[Purchases] - " + logLevel9.name(), function0.invoke());
                            break;
                        }
                        break;
                    case 12:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", function0.invoke(), null);
                        break;
                }
            } catch (IllegalArgumentException e2) {
                final LogIntent logIntent2 = LogIntent.WARNING;
                Function0<String> function02 = new Function0<String>() { // from class: com.revenuecat.purchases.common.caching.DeviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        StringBuilder append = new StringBuilder().append(CollectionsKt.joinToString$default(LogIntent.this.getEmojiList(), "", null, null, 0, null, null, 62, null)).append(' ');
                        String format = String.format(VirtualCurrencyStrings.ERROR_DECODING_CACHED_VIRTUAL_CURRENCIES, Arrays.copyOf(new Object[]{e2}, 1));
                        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                        return append.append(format).toString();
                    }
                };
                switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent2.ordinal()]) {
                    case 1:
                        LogLevel logLevel10 = LogLevel.DEBUG;
                        LogHandler currentLogHandler11 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                            currentLogHandler11.d("[Purchases] - " + logLevel10.name(), function02.invoke());
                            break;
                        }
                        break;
                    case 2:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", function02.invoke(), null);
                        break;
                    case 3:
                        LogLevel logLevel11 = LogLevel.WARN;
                        LogHandler currentLogHandler12 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel11) <= 0) {
                            currentLogHandler12.w("[Purchases] - " + logLevel11.name(), function02.invoke());
                            break;
                        }
                        break;
                    case 4:
                        LogLevel logLevel12 = LogLevel.INFO;
                        LogHandler currentLogHandler13 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel12) <= 0) {
                            currentLogHandler13.i("[Purchases] - " + logLevel12.name(), function02.invoke());
                            break;
                        }
                        break;
                    case 5:
                        LogLevel logLevel13 = LogLevel.DEBUG;
                        LogHandler currentLogHandler14 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel13) <= 0) {
                            currentLogHandler14.d("[Purchases] - " + logLevel13.name(), function02.invoke());
                            break;
                        }
                        break;
                    case 6:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", function02.invoke(), null);
                        break;
                    case 7:
                        LogLevel logLevel14 = LogLevel.INFO;
                        LogHandler currentLogHandler15 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel14) <= 0) {
                            currentLogHandler15.i("[Purchases] - " + logLevel14.name(), function02.invoke());
                            break;
                        }
                        break;
                    case 8:
                        LogLevel logLevel15 = LogLevel.DEBUG;
                        LogHandler currentLogHandler16 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel15) <= 0) {
                            currentLogHandler16.d("[Purchases] - " + logLevel15.name(), function02.invoke());
                            break;
                        }
                        break;
                    case 9:
                        LogLevel logLevel16 = LogLevel.DEBUG;
                        LogHandler currentLogHandler17 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel16) <= 0) {
                            currentLogHandler17.d("[Purchases] - " + logLevel16.name(), function02.invoke());
                            break;
                        }
                        break;
                    case 10:
                        LogLevel logLevel17 = LogLevel.WARN;
                        LogHandler currentLogHandler18 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel17) <= 0) {
                            currentLogHandler18.w("[Purchases] - " + logLevel17.name(), function02.invoke());
                            break;
                        }
                        break;
                    case 11:
                        LogLevel logLevel18 = LogLevel.WARN;
                        LogHandler currentLogHandler19 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel18) <= 0) {
                            currentLogHandler19.w("[Purchases] - " + logLevel18.name(), function02.invoke());
                            break;
                        }
                        break;
                    case 12:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", function02.invoke(), null);
                        break;
                }
            } catch (JSONException e3) {
                final LogIntent logIntent3 = LogIntent.WARNING;
                Function0<String> function03 = new Function0<String>() { // from class: com.revenuecat.purchases.common.caching.DeviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        StringBuilder append = new StringBuilder().append(CollectionsKt.joinToString$default(LogIntent.this.getEmojiList(), "", null, null, 0, null, null, 62, null)).append(' ');
                        String format = String.format(VirtualCurrencyStrings.ERROR_DECODING_CACHED_VIRTUAL_CURRENCIES, Arrays.copyOf(new Object[]{e3}, 1));
                        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                        return append.append(format).toString();
                    }
                };
                switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent3.ordinal()]) {
                    case 1:
                        LogLevel logLevel19 = LogLevel.DEBUG;
                        currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel19) <= 0) {
                            str = "[Purchases] - " + logLevel19.name();
                            invoke = function03.invoke();
                            currentLogHandler.d(str, invoke);
                            break;
                        }
                        break;
                    case 2:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", function03.invoke(), null);
                        break;
                    case 3:
                        LogLevel logLevel20 = LogLevel.WARN;
                        LogHandler currentLogHandler20 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel20) <= 0) {
                            currentLogHandler20.w("[Purchases] - " + logLevel20.name(), function03.invoke());
                            break;
                        }
                        break;
                    case 4:
                        LogLevel logLevel21 = LogLevel.INFO;
                        LogHandler currentLogHandler21 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel21) <= 0) {
                            currentLogHandler21.i("[Purchases] - " + logLevel21.name(), function03.invoke());
                            break;
                        }
                        break;
                    case 5:
                        LogLevel logLevel22 = LogLevel.DEBUG;
                        currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel22) <= 0) {
                            str = "[Purchases] - " + logLevel22.name();
                            invoke = function03.invoke();
                            currentLogHandler.d(str, invoke);
                            break;
                        }
                        break;
                    case 6:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", function03.invoke(), null);
                        break;
                    case 7:
                        LogLevel logLevel23 = LogLevel.INFO;
                        LogHandler currentLogHandler22 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel23) <= 0) {
                            currentLogHandler22.i("[Purchases] - " + logLevel23.name(), function03.invoke());
                            break;
                        }
                        break;
                    case 8:
                        LogLevel logLevel24 = LogLevel.DEBUG;
                        currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel24) <= 0) {
                            str = "[Purchases] - " + logLevel24.name();
                            invoke = function03.invoke();
                            currentLogHandler.d(str, invoke);
                            break;
                        }
                        break;
                    case 9:
                        LogLevel logLevel25 = LogLevel.DEBUG;
                        currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel25) <= 0) {
                            str = "[Purchases] - " + logLevel25.name();
                            invoke = function03.invoke();
                            currentLogHandler.d(str, invoke);
                            break;
                        }
                        break;
                    case 10:
                        LogLevel logLevel26 = LogLevel.WARN;
                        LogHandler currentLogHandler23 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel26) <= 0) {
                            currentLogHandler23.w("[Purchases] - " + logLevel26.name(), function03.invoke());
                            break;
                        }
                        break;
                    case 11:
                        LogLevel logLevel27 = LogLevel.WARN;
                        LogHandler currentLogHandler24 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel27) <= 0) {
                            currentLogHandler24.w("[Purchases] - " + logLevel27.name(), function03.invoke());
                            break;
                        }
                        break;
                    case 12:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", function03.invoke(), null);
                        break;
                }
            }
        }
        return null;
    }

    public final synchronized void cacheVirtualCurrencies(String appUserID, VirtualCurrencies virtualCurrencies) {
        Intrinsics.checkNotNullParameter(appUserID, "appUserID");
        Intrinsics.checkNotNullParameter(virtualCurrencies, "virtualCurrencies");
        this.preferences.edit().putString(virtualCurrenciesCacheKey(appUserID), Json.INSTANCE.encodeToString(VirtualCurrencies.INSTANCE.serializer(), virtualCurrencies)).apply();
        setVirtualCurrenciesCacheTimestampToNow(appUserID);
    }

    public final synchronized boolean isVirtualCurrenciesCacheStale(String appUserID, boolean appInBackground) {
        Intrinsics.checkNotNullParameter(appUserID, "appUserID");
        return DateExtensionsKt.isCacheStale(getVirtualCurrenciesCacheLastUpdated(appUserID), appInBackground, this.dateProvider);
    }

    public final synchronized void clearVirtualCurrenciesCache(String appUserID) {
        Intrinsics.checkNotNullParameter(appUserID, "appUserID");
        SharedPreferences.Editor editor = this.preferences.edit();
        Intrinsics.checkNotNullExpressionValue(editor, "editor");
        clearVirtualCurrenciesCache(appUserID, editor);
        editor.apply();
    }

    public final synchronized void clearVirtualCurrenciesCache(String appUserID, SharedPreferences.Editor editor) {
        Intrinsics.checkNotNullParameter(appUserID, "appUserID");
        Intrinsics.checkNotNullParameter(editor, "editor");
        clearVirtualCurrenciesCacheTimestamp(editor, appUserID);
        clearVirtualCurrenciesCache(editor, appUserID);
    }

    public final synchronized void setVirtualCurrenciesCacheTimestampToNow(String appUserID) {
        Intrinsics.checkNotNullParameter(appUserID, "appUserID");
        setVirtualCurrenciesCacheTimestamp(appUserID, this.dateProvider.getNow());
    }

    public final synchronized void setVirtualCurrenciesCacheTimestamp(String appUserID, Date date) {
        Intrinsics.checkNotNullParameter(appUserID, "appUserID");
        Intrinsics.checkNotNullParameter(date, "date");
        this.preferences.edit().putLong(virtualCurrenciesLastUpdatedCacheKey(appUserID), date.getTime()).apply();
    }

    private final synchronized Date getVirtualCurrenciesCacheLastUpdated(String appUserID) {
        return new Date(this.preferences.getLong(virtualCurrenciesLastUpdatedCacheKey(appUserID), 0L));
    }

    private final SharedPreferences.Editor clearVirtualCurrenciesCacheTimestamp(SharedPreferences.Editor editor, String str) {
        editor.remove(virtualCurrenciesLastUpdatedCacheKey(str));
        String cachedAppUserID = getCachedAppUserID();
        if (cachedAppUserID != null) {
            editor.remove(virtualCurrenciesLastUpdatedCacheKey(cachedAppUserID));
        }
        String legacyCachedAppUserID = getLegacyCachedAppUserID();
        if (legacyCachedAppUserID != null) {
            editor.remove(virtualCurrenciesLastUpdatedCacheKey(legacyCachedAppUserID));
        }
        return editor;
    }

    private final SharedPreferences.Editor clearVirtualCurrenciesCache(SharedPreferences.Editor editor, String str) {
        editor.remove(virtualCurrenciesCacheKey(str));
        String cachedAppUserID = getCachedAppUserID();
        if (cachedAppUserID != null) {
            editor.remove(virtualCurrenciesCacheKey(cachedAppUserID));
        }
        String legacyCachedAppUserID = getLegacyCachedAppUserID();
        if (legacyCachedAppUserID != null) {
            editor.remove(virtualCurrenciesCacheKey(legacyCachedAppUserID));
        }
        return editor;
    }

    public final synchronized void cleanupOldAttributionData() {
        SharedPreferences.Editor edit = this.preferences.edit();
        for (String str : this.preferences.getAll().keySet()) {
            if (str != null && StringsKt.startsWith$default(str, this.attributionCacheKey, false, 2, (Object) null)) {
                edit.remove(str);
            }
        }
        edit.apply();
    }

    public final synchronized Set<String> getPreviouslySentHashedTokens() {
        final Set<String> emptySet;
        LogHandler currentLogHandler;
        String str;
        String invoke;
        try {
            Set<String> stringSet = this.preferences.getStringSet(getTokensCacheKey(), SetsKt.emptySet());
            if (stringSet == null || (emptySet = CollectionsKt.toSet(stringSet)) == null) {
                emptySet = SetsKt.emptySet();
            }
            final LogIntent logIntent = LogIntent.DEBUG;
            Function0<String> function0 = new Function0<String>() { // from class: com.revenuecat.purchases.common.caching.DeviceCache$getPreviouslySentHashedTokens$lambda$17$$inlined$log$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    StringBuilder append = new StringBuilder().append(CollectionsKt.joinToString$default(LogIntent.this.getEmojiList(), "", null, null, 0, null, null, 62, null)).append(' ');
                    String format = String.format(ReceiptStrings.TOKENS_ALREADY_POSTED, Arrays.copyOf(new Object[]{emptySet}, 1));
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
        } catch (ClassCastException unused) {
            emptySet = SetsKt.emptySet();
        }
        return emptySet;
    }

    public final synchronized void addSuccessfullyPostedToken(final String token) {
        LogHandler currentLogHandler;
        String str;
        String invoke;
        LogHandler currentLogHandler2;
        String str2;
        String invoke2;
        Intrinsics.checkNotNullParameter(token, "token");
        final LogIntent logIntent = LogIntent.DEBUG;
        Function0<String> function0 = new Function0<String>() { // from class: com.revenuecat.purchases.common.caching.DeviceCache$addSuccessfullyPostedToken$$inlined$log$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                StringBuilder append = new StringBuilder().append(CollectionsKt.joinToString$default(LogIntent.this.getEmojiList(), "", null, null, 0, null, null, 62, null)).append(' ');
                String str3 = token;
                String format = String.format(ReceiptStrings.SAVING_TOKENS_WITH_HASH, Arrays.copyOf(new Object[]{str3, UtilsKt.sha1(str3)}, 2));
                Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                return append.append(format).toString();
            }
        };
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    currentLogHandler3.d("[Purchases] - " + logLevel.name(), function0.invoke());
                    break;
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", function0.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler4.w("[Purchases] - " + logLevel2.name(), function0.invoke());
                    break;
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler5.i("[Purchases] - " + logLevel3.name(), function0.invoke());
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
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler6.i("[Purchases] - " + logLevel5.name(), function0.invoke());
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
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler7.w("[Purchases] - " + logLevel8.name(), function0.invoke());
                    break;
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler8 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler8.w("[Purchases] - " + logLevel9.name(), function0.invoke());
                    break;
                }
                break;
            case 12:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", function0.invoke(), null);
                break;
        }
        final Set<String> previouslySentHashedTokens = getPreviouslySentHashedTokens();
        final LogIntent logIntent2 = LogIntent.DEBUG;
        Function0<String> function02 = new Function0<String>() { // from class: com.revenuecat.purchases.common.caching.DeviceCache$addSuccessfullyPostedToken$lambda$21$$inlined$log$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                StringBuilder append = new StringBuilder().append(CollectionsKt.joinToString$default(LogIntent.this.getEmojiList(), "", null, null, 0, null, null, 62, null)).append(' ');
                String format = String.format(ReceiptStrings.TOKENS_IN_CACHE, Arrays.copyOf(new Object[]{previouslySentHashedTokens}, 1));
                Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                return append.append(format).toString();
            }
        };
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent2.ordinal()]) {
            case 1:
                LogLevel logLevel10 = LogLevel.DEBUG;
                currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    str2 = "[Purchases] - " + logLevel10.name();
                    invoke2 = function02.invoke();
                    currentLogHandler2.d(str2, invoke2);
                    break;
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", function02.invoke(), null);
                break;
            case 3:
                LogLevel logLevel11 = LogLevel.WARN;
                LogHandler currentLogHandler9 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel11) <= 0) {
                    currentLogHandler9.w("[Purchases] - " + logLevel11.name(), function02.invoke());
                    break;
                }
                break;
            case 4:
                LogLevel logLevel12 = LogLevel.INFO;
                LogHandler currentLogHandler10 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel12) <= 0) {
                    currentLogHandler10.i("[Purchases] - " + logLevel12.name(), function02.invoke());
                    break;
                }
                break;
            case 5:
                LogLevel logLevel13 = LogLevel.DEBUG;
                currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel13) <= 0) {
                    str2 = "[Purchases] - " + logLevel13.name();
                    invoke2 = function02.invoke();
                    currentLogHandler2.d(str2, invoke2);
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
                currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel15) <= 0) {
                    str2 = "[Purchases] - " + logLevel15.name();
                    invoke2 = function02.invoke();
                    currentLogHandler2.d(str2, invoke2);
                    break;
                }
                break;
            case 9:
                LogLevel logLevel16 = LogLevel.DEBUG;
                currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel16) <= 0) {
                    str2 = "[Purchases] - " + logLevel16.name();
                    invoke2 = function02.invoke();
                    currentLogHandler2.d(str2, invoke2);
                    break;
                }
                break;
            case 10:
                LogLevel logLevel17 = LogLevel.WARN;
                LogHandler currentLogHandler12 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel17) <= 0) {
                    currentLogHandler12.w("[Purchases] - " + logLevel17.name(), function02.invoke());
                    break;
                }
                break;
            case 11:
                LogLevel logLevel18 = LogLevel.WARN;
                LogHandler currentLogHandler13 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel18) <= 0) {
                    currentLogHandler13.w("[Purchases] - " + logLevel18.name(), function02.invoke());
                    break;
                }
                break;
            case 12:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", function02.invoke(), null);
                break;
        }
        Set<String> mutableSet = CollectionsKt.toMutableSet(previouslySentHashedTokens);
        mutableSet.add(UtilsKt.sha1(token));
        setSavedTokenHashes(mutableSet);
    }

    private final synchronized void setSavedTokenHashes(final Set<String> newSet) {
        LogHandler currentLogHandler;
        String str;
        String invoke;
        final LogIntent logIntent = LogIntent.DEBUG;
        Function0<String> function0 = new Function0<String>() { // from class: com.revenuecat.purchases.common.caching.DeviceCache$setSavedTokenHashes$$inlined$log$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                StringBuilder append = new StringBuilder().append(CollectionsKt.joinToString$default(LogIntent.this.getEmojiList(), "", null, null, 0, null, null, 62, null)).append(' ');
                String format = String.format(ReceiptStrings.SAVING_TOKENS, Arrays.copyOf(new Object[]{newSet}, 1));
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
        this.preferences.edit().putStringSet(getTokensCacheKey(), newSet).apply();
    }

    public final synchronized void cleanPreviouslySentTokens(Set<String> hashedTokens) {
        LogHandler currentLogHandler;
        String str;
        String invoke;
        Intrinsics.checkNotNullParameter(hashedTokens, "hashedTokens");
        final LogIntent logIntent = LogIntent.DEBUG;
        Function0<String> function0 = new Function0<String>() { // from class: com.revenuecat.purchases.common.caching.DeviceCache$cleanPreviouslySentTokens$$inlined$log$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return CollectionsKt.joinToString$default(LogIntent.this.getEmojiList(), "", null, null, 0, null, null, 62, null) + " Cleaning previously sent tokens";
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
        setSavedTokenHashes(CollectionsKt.intersect(hashedTokens, getPreviouslySentHashedTokens()));
    }

    public final synchronized List<StoreTransaction> getActivePurchasesNotInCache(Map<String, StoreTransaction> hashedTokens) {
        Intrinsics.checkNotNullParameter(hashedTokens, "hashedTokens");
        return CollectionsKt.toList(MapsKt.minus((Map) hashedTokens, (Iterable) getPreviouslySentHashedTokens()).values());
    }

    public final synchronized JSONObject getOfferingsResponseCache() {
        return getJSONObjectOrNull(getOfferingsResponseCacheKey());
    }

    public final synchronized void cacheOfferingsResponse(JSONObject offeringsResponse) {
        Intrinsics.checkNotNullParameter(offeringsResponse, "offeringsResponse");
        this.preferences.edit().putString(getOfferingsResponseCacheKey(), offeringsResponse.toString()).apply();
    }

    public final synchronized void clearOfferingsResponseCache() {
        this.preferences.edit().remove(getOfferingsResponseCacheKey()).apply();
    }

    public final synchronized void cacheProductEntitlementMapping(ProductEntitlementMapping productEntitlementMapping) {
        Intrinsics.checkNotNullParameter(productEntitlementMapping, "productEntitlementMapping");
        this.preferences.edit().putString(getProductEntitlementMappingCacheKey(), productEntitlementMapping.toJson().toString()).apply();
        setProductEntitlementMappingCacheTimestampToNow();
    }

    public final synchronized void setProductEntitlementMappingCacheTimestampToNow() {
        setProductEntitlementMappingCacheTimestamp(this.dateProvider.getNow());
    }

    private final void setProductEntitlementMappingCacheTimestamp(Date date) {
        this.preferences.edit().putLong(getProductEntitlementMappingLastUpdatedCacheKey(), date.getTime()).apply();
    }

    public final synchronized boolean isProductEntitlementMappingCacheStale() {
        Date productEntitlementMappingLastUpdated;
        long j;
        productEntitlementMappingLastUpdated = getProductEntitlementMappingLastUpdated();
        j = DeviceCacheKt.PRODUCT_ENTITLEMENT_MAPPING_CACHE_REFRESH_PERIOD;
        return DateExtensionsKt.m10584isCacheStale8Mi8wO0(productEntitlementMappingLastUpdated, j, this.dateProvider);
    }

    public final synchronized ProductEntitlementMapping getProductEntitlementMapping() {
        ProductEntitlementMapping productEntitlementMapping = null;
        String string = this.preferences.getString(getProductEntitlementMappingCacheKey(), null);
        if (string == null) {
            return null;
        }
        try {
            productEntitlementMapping = ProductEntitlementMapping.INSTANCE.fromJson(new JSONObject(string), true);
        } catch (JSONException e) {
            LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
            String format = String.format(OfflineEntitlementsStrings.ERROR_PARSING_PRODUCT_ENTITLEMENT_MAPPING, Arrays.copyOf(new Object[]{string}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "format(...)");
            currentLogHandler.e("[Purchases] - ERROR", format, e);
            this.preferences.edit().remove(getProductEntitlementMappingCacheKey()).apply();
        }
        return productEntitlementMapping;
    }

    private final Date getProductEntitlementMappingLastUpdated() {
        if (this.preferences.contains(getProductEntitlementMappingLastUpdatedCacheKey())) {
            return new Date(this.preferences.getLong(getProductEntitlementMappingLastUpdatedCacheKey(), -1L));
        }
        return null;
    }

    public JSONObject getJSONObjectOrNull(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        String string = this.preferences.getString(key, null);
        if (string == null) {
            return null;
        }
        try {
            return new JSONObject(string);
        } catch (JSONException unused) {
            return null;
        }
    }

    public void putString(String cacheKey, String value) {
        Intrinsics.checkNotNullParameter(cacheKey, "cacheKey");
        Intrinsics.checkNotNullParameter(value, "value");
        this.preferences.edit().putString(cacheKey, value).apply();
    }

    public final void remove(String cacheKey) {
        Intrinsics.checkNotNullParameter(cacheKey, "cacheKey");
        this.preferences.edit().remove(cacheKey).apply();
    }

    public final Set<String> findKeysThatStartWith(String cacheKey) {
        Intrinsics.checkNotNullParameter(cacheKey, "cacheKey");
        try {
            Map<String, ?> all = this.preferences.getAll();
            if (all != null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry<String, ?> entry : all.entrySet()) {
                    String it = entry.getKey();
                    Intrinsics.checkNotNullExpressionValue(it, "it");
                    if (StringsKt.startsWith$default(it, cacheKey, false, 2, (Object) null)) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                Set<String> keySet = linkedHashMap.keySet();
                if (keySet != null) {
                    return keySet;
                }
            }
            return SetsKt.emptySet();
        } catch (NullPointerException unused) {
            return SetsKt.emptySet();
        }
    }

    public final String newKey(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return getApiKeyPrefix() + '.' + key;
    }

    public final synchronized void setStorefront(String countryCode) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        LogLevel logLevel = LogLevel.VERBOSE;
        LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
        if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
            String str = "[Purchases] - " + logLevel.name();
            String format = String.format(BillingStrings.BILLING_STOREFRONT_CACHING, Arrays.copyOf(new Object[]{countryCode}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "format(...)");
            currentLogHandler.v(str, format);
        }
        this.preferences.edit().putString(getStorefrontCacheKey(), countryCode).apply();
    }
}
