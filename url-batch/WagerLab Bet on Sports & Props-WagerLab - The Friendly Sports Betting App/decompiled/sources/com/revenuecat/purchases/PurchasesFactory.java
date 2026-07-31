package com.revenuecat.purchases;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Process;
import androidx.core.os.UserManagerCompat;
import com.revenuecat.purchases.APIKeyValidator;
import com.revenuecat.purchases.PurchasesFactory;
import com.revenuecat.purchases.common.AppConfig;
import com.revenuecat.purchases.common.Backend;
import com.revenuecat.purchases.common.BackendHelper;
import com.revenuecat.purchases.common.BillingAbstract;
import com.revenuecat.purchases.common.Config;
import com.revenuecat.purchases.common.DateProvider;
import com.revenuecat.purchases.common.DefaultLocaleProvider;
import com.revenuecat.purchases.common.Delay;
import com.revenuecat.purchases.common.Dispatcher;
import com.revenuecat.purchases.common.FileHelper;
import com.revenuecat.purchases.common.HTTPClient;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.OfferingParser;
import com.revenuecat.purchases.common.PlatformInfo;
import com.revenuecat.purchases.common.SharedPreferencesManager;
import com.revenuecat.purchases.common.UtilsKt;
import com.revenuecat.purchases.common.caching.DeviceCache;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsFileHelper;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsHelper;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsSynchronizer;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker;
import com.revenuecat.purchases.common.events.BackendStoredEvent;
import com.revenuecat.purchases.common.events.EventsManager;
import com.revenuecat.purchases.common.events.EventsRequest;
import com.revenuecat.purchases.common.networking.ETagManager;
import com.revenuecat.purchases.common.offerings.OfferingsCache;
import com.revenuecat.purchases.common.offerings.OfferingsFactory;
import com.revenuecat.purchases.common.offerings.OfferingsManager;
import com.revenuecat.purchases.common.offlineentitlements.OfflineCustomerInfoCalculator;
import com.revenuecat.purchases.common.offlineentitlements.OfflineEntitlementsManager;
import com.revenuecat.purchases.common.offlineentitlements.PurchasedProductsFetcher;
import com.revenuecat.purchases.common.subscriberattributes.DeviceIdentifiersFetcher;
import com.revenuecat.purchases.common.verification.SignatureVerificationMode;
import com.revenuecat.purchases.common.verification.SigningManager;
import com.revenuecat.purchases.identity.IdentityManager;
import com.revenuecat.purchases.paywalls.FontLoader;
import com.revenuecat.purchases.paywalls.OfferingFontPreDownloader;
import com.revenuecat.purchases.paywalls.PaywallPresentedCache;
import com.revenuecat.purchases.paywalls.events.PaywallStoredEvent;
import com.revenuecat.purchases.strings.ConfigureStrings;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributesManager;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributesPoster;
import com.revenuecat.purchases.subscriberattributes.caching.SubscriberAttributesCache;
import com.revenuecat.purchases.utils.AndroidVersionUtilsKt;
import com.revenuecat.purchases.utils.CoilImageDownloader;
import com.revenuecat.purchases.utils.EventsFileHelper;
import com.revenuecat.purchases.utils.IsDebugBuildProvider;
import com.revenuecat.purchases.utils.OfferingImagePreDownloader;
import com.revenuecat.purchases.utils.PurchaseParamsValidator;
import com.revenuecat.purchases.virtualcurrencies.VirtualCurrencyManager;
import java.net.URL;
import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: PurchasesFactory.kt */
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u00010B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0002J\b\u0010\t\u001a\u00020\bH\u0002JF\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00132\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00132\u0006\u0010\u0017\u001a\u00020\u0018H\u0002JV\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010#2\b\b\u0002\u0010$\u001a\u00020%2\b\b\u0002\u0010&\u001a\u00020%2\b\b\u0002\u0010'\u001a\u00020(J\u0010\u0010)\u001a\u00020*2\u0006\u0010\u001b\u001a\u00020\u001cH\u0007J\f\u0010+\u001a\u00020,*\u00020-H\u0002J\u0014\u0010.\u001a\u00020%*\u00020-2\u0006\u0010/\u001a\u00020(H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00061"}, d2 = {"Lcom/revenuecat/purchases/PurchasesFactory;", "", "isDebugBuild", "Lcom/revenuecat/purchases/utils/IsDebugBuildProvider;", "apiKeyValidator", "Lcom/revenuecat/purchases/APIKeyValidator;", "(Lcom/revenuecat/purchases/utils/IsDebugBuildProvider;Lcom/revenuecat/purchases/APIKeyValidator;)V", "createDefaultExecutor", "Ljava/util/concurrent/ExecutorService;", "createEventsExecutor", "createEventsManager", "Lcom/revenuecat/purchases/common/events/EventsManager;", "identityManager", "Lcom/revenuecat/purchases/identity/IdentityManager;", "eventsDispatcher", "Lcom/revenuecat/purchases/common/Dispatcher;", "backend", "Lcom/revenuecat/purchases/common/Backend;", "legacyEventsFileHelper", "Lcom/revenuecat/purchases/utils/EventsFileHelper;", "Lcom/revenuecat/purchases/paywalls/events/PaywallStoredEvent;", "fileHelper", "Lcom/revenuecat/purchases/common/events/BackendStoredEvent;", "baseURL", "Ljava/net/URL;", "createPurchases", "Lcom/revenuecat/purchases/Purchases;", "configuration", "Lcom/revenuecat/purchases/PurchasesConfiguration;", "platformInfo", "Lcom/revenuecat/purchases/common/PlatformInfo;", "proxyURL", "overrideBillingAbstract", "Lcom/revenuecat/purchases/common/BillingAbstract;", "forceServerErrorStrategy", "Lcom/revenuecat/purchases/ForceServerErrorStrategy;", "forceSigningError", "", "runningIntegrationTests", "baseUrlString", "", "validateConfiguration", "Lcom/revenuecat/purchases/APIKeyValidator$ValidationResult;", "getApplication", "Landroid/app/Application;", "Landroid/content/Context;", "hasPermission", "permission", "LowPriorityThreadFactory", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PurchasesFactory {
    private final APIKeyValidator apiKeyValidator;
    private final IsDebugBuildProvider isDebugBuild;

    public PurchasesFactory(IsDebugBuildProvider isDebugBuild, APIKeyValidator apiKeyValidator) {
        Intrinsics.checkNotNullParameter(isDebugBuild, "isDebugBuild");
        Intrinsics.checkNotNullParameter(apiKeyValidator, "apiKeyValidator");
        this.isDebugBuild = isDebugBuild;
        this.apiKeyValidator = apiKeyValidator;
    }

    public /* synthetic */ PurchasesFactory(IsDebugBuildProvider isDebugBuildProvider, APIKeyValidator aPIKeyValidator, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(isDebugBuildProvider, (i & 2) != 0 ? new APIKeyValidator() : aPIKeyValidator);
    }

    public static /* synthetic */ Purchases createPurchases$default(PurchasesFactory purchasesFactory, PurchasesConfiguration purchasesConfiguration, PlatformInfo platformInfo, URL url, BillingAbstract billingAbstract, ForceServerErrorStrategy forceServerErrorStrategy, boolean z, boolean z2, String str, int i, Object obj) {
        if ((i & 8) != 0) {
            billingAbstract = null;
        }
        if ((i & 16) != 0) {
            forceServerErrorStrategy = null;
        }
        if ((i & 32) != 0) {
            z = false;
        }
        if ((i & 64) != 0) {
            z2 = false;
        }
        if ((i & 128) != 0) {
            str = AppConfig.baseUrlString;
        }
        return purchasesFactory.createPurchases(purchasesConfiguration, platformInfo, url, billingAbstract, forceServerErrorStrategy, z, z2, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Purchases createPurchases(final PurchasesConfiguration configuration, PlatformInfo platformInfo, URL proxyURL, BillingAbstract overrideBillingAbstract, ForceServerErrorStrategy forceServerErrorStrategy, boolean forceSigningError, boolean runningIntegrationTests, String baseUrlString) {
        Store store;
        Application application;
        Context context;
        AppConfig appConfig;
        Dispatcher dispatcher;
        DiagnosticsTracker diagnosticsTracker;
        DiagnosticsHelper diagnosticsHelper;
        DiagnosticsFileHelper diagnosticsFileHelper;
        SignatureVerificationMode.Disabled disabled;
        BackendHelper backendHelper;
        Application application2;
        DeviceCache deviceCache;
        BillingAbstract billingAbstract;
        BillingAbstract billingAbstract2;
        PostTransactionWithProductDetailsHelper postTransactionWithProductDetailsHelper;
        Dispatcher dispatcher2;
        Backend backend;
        DiagnosticsTracker diagnosticsTracker2;
        DiagnosticsSynchronizer diagnosticsSynchronizer;
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(platformInfo, "platformInfo");
        Intrinsics.checkNotNullParameter(baseUrlString, "baseUrlString");
        APIKeyValidator.ValidationResult validateConfiguration = validateConfiguration(configuration);
        if (validateConfiguration == APIKeyValidator.ValidationResult.SIMULATED_STORE) {
            store = Store.TEST_STORE;
        } else {
            store = configuration.getStore();
        }
        Store store2 = store;
        Application application3 = getApplication(configuration.getContext());
        AppConfig appConfig2 = new AppConfig(configuration.getContext(), configuration.getPurchasesAreCompletedBy(), configuration.getShowInAppMessagesAutomatically(), platformInfo, proxyURL, store2, this.isDebugBuild.invoke(), validateConfiguration, configuration.getDangerousSettings(), runningIntegrationTests, forceSigningError, baseUrlString);
        if (!UtilsKt.isDeviceProtectedStorageCompat(configuration.getContext())) {
            application = application3;
        } else {
            LogLevel logLevel = LogLevel.DEBUG;
            LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
            if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                currentLogHandler.d("[Purchases] - " + logLevel.name(), "‼️ Using device-protected storage. Make sure to *always* configure Purchases with a Context object created using `createDeviceProtectedStorageContext()` to avoid undefined behavior.\nSee https://developer.android.com/reference/android/content/Context#createDeviceProtectedStorageContext() for more info.");
            }
            application = configuration.getContext();
        }
        Context context2 = application;
        try {
            SharedPreferences sharedPreferences = new SharedPreferencesManager(context2, null, null, 6, null).getSharedPreferences();
            ETagManager eTagManager = new ETagManager(context2, null, null, 6, null);
            Dispatcher dispatcher3 = new Dispatcher(createDefaultExecutor(), null, runningIntegrationTests, 2, null);
            ExecutorService service = configuration.getService();
            if (service == null) {
                service = createDefaultExecutor();
            }
            int i = 2;
            DefaultConstructorMarker defaultConstructorMarker = null;
            Handler handler = null;
            Dispatcher dispatcher4 = new Dispatcher(service, handler, runningIntegrationTests, i, defaultConstructorMarker);
            Dispatcher dispatcher5 = new Dispatcher(createEventsExecutor(), handler, runningIntegrationTests, i, defaultConstructorMarker);
            if (configuration.getDiagnosticsEnabled() && AndroidVersionUtilsKt.isAndroidNOrNewer()) {
                DiagnosticsFileHelper diagnosticsFileHelper2 = new DiagnosticsFileHelper(new FileHelper(context2));
                DiagnosticsHelper diagnosticsHelper2 = new DiagnosticsHelper(context2, diagnosticsFileHelper2, null, 4, null);
                context = context2;
                DiagnosticsTracker diagnosticsTracker3 = new DiagnosticsTracker(appConfig2, diagnosticsFileHelper2, diagnosticsHelper2, dispatcher5, null, 16, null);
                appConfig = appConfig2;
                dispatcher = dispatcher5;
                diagnosticsHelper = diagnosticsHelper2;
                diagnosticsFileHelper = diagnosticsFileHelper2;
                diagnosticsTracker = diagnosticsTracker3;
            } else {
                context = context2;
                appConfig = appConfig2;
                dispatcher = dispatcher5;
                if (configuration.getDiagnosticsEnabled()) {
                    LogLevel logLevel2 = LogLevel.WARN;
                    LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                        currentLogHandler2.w("[Purchases] - " + logLevel2.name(), "Diagnostics are only supported on Android N or newer.");
                    }
                }
                diagnosticsTracker = null;
                diagnosticsHelper = null;
                diagnosticsFileHelper = null;
            }
            try {
                disabled = SignatureVerificationMode.Companion.fromEntitlementVerificationMode$default(SignatureVerificationMode.INSTANCE, configuration.getVerificationMode(), null, 2, null);
            } catch (IllegalStateException e) {
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Error creating signature verifier: " + e.getMessage() + ". Disabling signature verification.", null);
                disabled = SignatureVerificationMode.Disabled.INSTANCE;
            }
            SigningManager signingManager = new SigningManager(disabled, appConfig, configuration.getApiKey());
            DeviceCache deviceCache2 = new DeviceCache(sharedPreferences, configuration.getApiKey(), null, 4, null);
            DefaultLocaleProvider defaultLocaleProvider = new DefaultLocaleProvider();
            DefaultLocaleProvider defaultLocaleProvider2 = defaultLocaleProvider;
            DiagnosticsTracker diagnosticsTracker4 = diagnosticsTracker;
            HTTPClient hTTPClient = new HTTPClient(appConfig, eTagManager, diagnosticsTracker4, signingManager, deviceCache2, null, 0 == true ? 1 : 0, defaultLocaleProvider2, forceServerErrorStrategy, null, null, 1632, null);
            BackendHelper backendHelper2 = new BackendHelper(configuration.getApiKey(), dispatcher4, appConfig, hTTPClient);
            final AppConfig appConfig3 = appConfig;
            Backend backend2 = new Backend(appConfig3, dispatcher4, dispatcher, hTTPClient, backendHelper2);
            PurchasesStateCache purchasesStateCache = new PurchasesStateCache(new PurchasesState(null, null, null, false, false, 31, null));
            if (overrideBillingAbstract == null) {
                application2 = application3;
                BillingAbstract createBilling = BillingFactory.INSTANCE.createBilling(store2, application2, backendHelper2, deviceCache2, PurchasesAreCompletedByKt.getFinishTransactions(configuration.getPurchasesAreCompletedBy()), diagnosticsTracker4, purchasesStateCache, configuration.getPendingTransactionsForPrepaidPlansEnabled(), backend2);
                backendHelper = backendHelper2;
                deviceCache = deviceCache2;
                backend2 = backend2;
                billingAbstract = createBilling;
            } else {
                backendHelper = backendHelper2;
                application2 = application3;
                deviceCache = deviceCache2;
                billingAbstract = overrideBillingAbstract;
            }
            SubscriberAttributesPoster subscriberAttributesPoster = new SubscriberAttributesPoster(backendHelper);
            DeviceIdentifiersFetcher createAttributionFetcher = AttributionFetcherFactory.INSTANCE.createAttributionFetcher(configuration.getStore(), dispatcher4);
            SubscriberAttributesCache subscriberAttributesCache = new SubscriberAttributesCache(deviceCache);
            SubscriberAttributesManager subscriberAttributesManager = new SubscriberAttributesManager(subscriberAttributesCache, subscriberAttributesPoster, createAttributionFetcher, configuration.getAutomaticDeviceIdentifierCollectionEnabled());
            DateProvider dateProvider = null;
            DeviceCache deviceCache3 = deviceCache;
            BillingAbstract billingAbstract3 = billingAbstract;
            OfflineEntitlementsManager offlineEntitlementsManager = new OfflineEntitlementsManager(backend2, new OfflineCustomerInfoCalculator(new PurchasedProductsFetcher(deviceCache3, billingAbstract3, dateProvider, 4, null), appConfig3, diagnosticsTracker4, dateProvider, 8, 0 == true ? 1 : 0), deviceCache3, appConfig3, diagnosticsTracker4);
            OfferingsCache offeringsCache = new OfferingsCache(deviceCache3, null, 0 == true ? 1 : 0, defaultLocaleProvider2, 6, null);
            Backend backend3 = backend2;
            IdentityManager identityManager = new IdentityManager(deviceCache3, subscriberAttributesCache, subscriberAttributesManager, offeringsCache, backend3, offlineEntitlementsManager, dispatcher3);
            CustomerInfoUpdateHandler customerInfoUpdateHandler = new CustomerInfoUpdateHandler(deviceCache3, identityManager, offlineEntitlementsManager, appConfig3, diagnosticsTracker4, null, 32, null);
            PaywallPresentedCache paywallPresentedCache = new PaywallPresentedCache();
            PostReceiptHelper postReceiptHelper = new PostReceiptHelper(appConfig3, backend3, billingAbstract3, customerInfoUpdateHandler, deviceCache3, subscriberAttributesManager, offlineEntitlementsManager, paywallPresentedCache);
            PostTransactionWithProductDetailsHelper postTransactionWithProductDetailsHelper2 = new PostTransactionWithProductDetailsHelper(billingAbstract3, postReceiptHelper);
            PostPendingTransactionsHelper postPendingTransactionsHelper = new PostPendingTransactionsHelper(appConfig3, deviceCache3, billingAbstract3, dispatcher4, identityManager, postTransactionWithProductDetailsHelper2);
            CustomerInfoHelper customerInfoHelper = new CustomerInfoHelper(deviceCache3, backend3, offlineEntitlementsManager, customerInfoUpdateHandler, postPendingTransactionsHelper, diagnosticsTracker4, null, null, 192, null);
            OfferingParser createOfferingParser = OfferingParserFactory.INSTANCE.createOfferingParser(store2);
            if (diagnosticsFileHelper == null || diagnosticsHelper == null || diagnosticsTracker4 == null || !AndroidVersionUtilsKt.isAndroidNOrNewer()) {
                billingAbstract2 = billingAbstract3;
                postTransactionWithProductDetailsHelper = postTransactionWithProductDetailsHelper2;
                dispatcher2 = dispatcher;
                backend = backend3;
                diagnosticsTracker2 = diagnosticsTracker4;
                diagnosticsSynchronizer = null;
            } else {
                Dispatcher dispatcher6 = dispatcher;
                diagnosticsSynchronizer = new DiagnosticsSynchronizer(diagnosticsHelper, diagnosticsFileHelper, diagnosticsTracker4, backend3, dispatcher6);
                backend = backend3;
                dispatcher2 = dispatcher6;
                billingAbstract2 = billingAbstract3;
                postTransactionWithProductDetailsHelper = postTransactionWithProductDetailsHelper2;
                diagnosticsTracker2 = diagnosticsTracker4;
                diagnosticsTracker2.setListener(diagnosticsSynchronizer);
            }
            BillingAbstract billingAbstract4 = billingAbstract2;
            DiagnosticsTracker diagnosticsTracker5 = diagnosticsTracker2;
            SyncPurchasesHelper syncPurchasesHelper = new SyncPurchasesHelper(billingAbstract4, identityManager, customerInfoHelper, postReceiptHelper, diagnosticsTracker5, null, 32, null);
            DiagnosticsSynchronizer diagnosticsSynchronizer2 = diagnosticsSynchronizer;
            Application application4 = application2;
            Context context3 = context;
            FontLoader fontLoader = new FontLoader(context3, null, null, 0 == true ? 1 : 0, 14, null);
            Dispatcher dispatcher7 = dispatcher2;
            OfferingFontPreDownloader offeringFontPreDownloader = new OfferingFontPreDownloader(context3, fontLoader);
            OfferingsFactory offeringsFactory = new OfferingsFactory(billingAbstract4, createOfferingParser, dispatcher3, appConfig3);
            Application application5 = application4;
            Backend backend4 = backend;
            OfferingsManager offeringsManager = new OfferingsManager(offeringsCache, backend4, offeringsFactory, new OfferingImagePreDownloader(false, new CoilImageDownloader(application5), 1, null), diagnosticsTracker5, offeringFontPreDownloader, null, 0 == true ? 1 : 0, 192, null);
            final LogIntent logIntent = LogIntent.DEBUG;
            Function0<String> function0 = new Function0<String>() { // from class: com.revenuecat.purchases.PurchasesFactory$createPurchases$lambda$8$$inlined$log$1
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return CollectionsKt.joinToString$default(LogIntent.this.getEmojiList(), "", null, null, 0, null, null, 62, null) + " Debug logging enabled";
                }
            };
            switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                case 1:
                    LogLevel logLevel3 = LogLevel.DEBUG;
                    LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                        currentLogHandler3.d("[Purchases] - " + logLevel3.name(), function0.invoke());
                        break;
                    }
                    break;
                case 2:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", function0.invoke(), null);
                    break;
                case 3:
                    LogLevel logLevel4 = LogLevel.WARN;
                    LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                        currentLogHandler4.w("[Purchases] - " + logLevel4.name(), function0.invoke());
                        break;
                    }
                    break;
                case 4:
                    LogLevel logLevel5 = LogLevel.INFO;
                    LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                        currentLogHandler5.i("[Purchases] - " + logLevel5.name(), function0.invoke());
                        break;
                    }
                    break;
                case 5:
                    LogLevel logLevel6 = LogLevel.DEBUG;
                    LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                        currentLogHandler6.d("[Purchases] - " + logLevel6.name(), function0.invoke());
                        break;
                    }
                    break;
                case 6:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", function0.invoke(), null);
                    break;
                case 7:
                    LogLevel logLevel7 = LogLevel.INFO;
                    LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                        currentLogHandler7.i("[Purchases] - " + logLevel7.name(), function0.invoke());
                        break;
                    }
                    break;
                case 8:
                    LogLevel logLevel8 = LogLevel.DEBUG;
                    LogHandler currentLogHandler8 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                        currentLogHandler8.d("[Purchases] - " + logLevel8.name(), function0.invoke());
                        break;
                    }
                    break;
                case 9:
                    LogLevel logLevel9 = LogLevel.DEBUG;
                    LogHandler currentLogHandler9 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                        currentLogHandler9.d("[Purchases] - " + logLevel9.name(), function0.invoke());
                        break;
                    }
                    break;
                case 10:
                    LogLevel logLevel10 = LogLevel.WARN;
                    LogHandler currentLogHandler10 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                        currentLogHandler10.w("[Purchases] - " + logLevel10.name(), function0.invoke());
                        break;
                    }
                    break;
                case 11:
                    LogLevel logLevel11 = LogLevel.WARN;
                    LogHandler currentLogHandler11 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel11) <= 0) {
                        currentLogHandler11.w("[Purchases] - " + logLevel11.name(), function0.invoke());
                        break;
                    }
                    break;
                case 12:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", function0.invoke(), null);
                    break;
            }
            final LogIntent logIntent2 = LogIntent.DEBUG;
            Function0<String> function02 = new Function0<String>() { // from class: com.revenuecat.purchases.PurchasesFactory$createPurchases$lambda$8$$inlined$log$2
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    StringBuilder append = new StringBuilder().append(CollectionsKt.joinToString$default(LogIntent.this.getEmojiList(), "", null, null, 0, null, null, 62, null)).append(' ');
                    String format = String.format(ConfigureStrings.SDK_VERSION, Arrays.copyOf(new Object[]{Purchases.INSTANCE.getFrameworkVersion()}, 1));
                    Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                    return append.append(format).toString();
                }
            };
            switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent2.ordinal()]) {
                case 1:
                    LogLevel logLevel12 = LogLevel.DEBUG;
                    LogHandler currentLogHandler12 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel12) <= 0) {
                        currentLogHandler12.d("[Purchases] - " + logLevel12.name(), function02.invoke());
                        break;
                    }
                    break;
                case 2:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", function02.invoke(), null);
                    break;
                case 3:
                    LogLevel logLevel13 = LogLevel.WARN;
                    LogHandler currentLogHandler13 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel13) <= 0) {
                        currentLogHandler13.w("[Purchases] - " + logLevel13.name(), function02.invoke());
                        break;
                    }
                    break;
                case 4:
                    LogLevel logLevel14 = LogLevel.INFO;
                    LogHandler currentLogHandler14 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel14) <= 0) {
                        currentLogHandler14.i("[Purchases] - " + logLevel14.name(), function02.invoke());
                        break;
                    }
                    break;
                case 5:
                    LogLevel logLevel15 = LogLevel.DEBUG;
                    LogHandler currentLogHandler15 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel15) <= 0) {
                        currentLogHandler15.d("[Purchases] - " + logLevel15.name(), function02.invoke());
                        break;
                    }
                    break;
                case 6:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", function02.invoke(), null);
                    break;
                case 7:
                    LogLevel logLevel16 = LogLevel.INFO;
                    LogHandler currentLogHandler16 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel16) <= 0) {
                        currentLogHandler16.i("[Purchases] - " + logLevel16.name(), function02.invoke());
                        break;
                    }
                    break;
                case 8:
                    LogLevel logLevel17 = LogLevel.DEBUG;
                    LogHandler currentLogHandler17 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel17) <= 0) {
                        currentLogHandler17.d("[Purchases] - " + logLevel17.name(), function02.invoke());
                        break;
                    }
                    break;
                case 9:
                    LogLevel logLevel18 = LogLevel.DEBUG;
                    LogHandler currentLogHandler18 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel18) <= 0) {
                        currentLogHandler18.d("[Purchases] - " + logLevel18.name(), function02.invoke());
                        break;
                    }
                    break;
                case 10:
                    LogLevel logLevel19 = LogLevel.WARN;
                    LogHandler currentLogHandler19 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel19) <= 0) {
                        currentLogHandler19.w("[Purchases] - " + logLevel19.name(), function02.invoke());
                        break;
                    }
                    break;
                case 11:
                    LogLevel logLevel20 = LogLevel.WARN;
                    LogHandler currentLogHandler20 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel20) <= 0) {
                        currentLogHandler20.w("[Purchases] - " + logLevel20.name(), function02.invoke());
                        break;
                    }
                    break;
                case 12:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", function02.invoke(), null);
                    break;
            }
            final LogIntent logIntent3 = LogIntent.DEBUG;
            Function0<String> function03 = new Function0<String>() { // from class: com.revenuecat.purchases.PurchasesFactory$createPurchases$lambda$8$$inlined$log$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    StringBuilder append = new StringBuilder().append(CollectionsKt.joinToString$default(LogIntent.this.getEmojiList(), "", null, null, 0, null, null, 62, null)).append(' ');
                    String format = String.format(ConfigureStrings.PACKAGE_NAME, Arrays.copyOf(new Object[]{appConfig3.getPackageName()}, 1));
                    Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                    return append.append(format).toString();
                }
            };
            switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent3.ordinal()]) {
                case 1:
                    LogLevel logLevel21 = LogLevel.DEBUG;
                    LogHandler currentLogHandler21 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel21) <= 0) {
                        currentLogHandler21.d("[Purchases] - " + logLevel21.name(), function03.invoke());
                        break;
                    }
                    break;
                case 2:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", function03.invoke(), null);
                    break;
                case 3:
                    LogLevel logLevel22 = LogLevel.WARN;
                    LogHandler currentLogHandler22 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel22) <= 0) {
                        currentLogHandler22.w("[Purchases] - " + logLevel22.name(), function03.invoke());
                        break;
                    }
                    break;
                case 4:
                    LogLevel logLevel23 = LogLevel.INFO;
                    LogHandler currentLogHandler23 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel23) <= 0) {
                        currentLogHandler23.i("[Purchases] - " + logLevel23.name(), function03.invoke());
                        break;
                    }
                    break;
                case 5:
                    LogLevel logLevel24 = LogLevel.DEBUG;
                    LogHandler currentLogHandler24 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel24) <= 0) {
                        currentLogHandler24.d("[Purchases] - " + logLevel24.name(), function03.invoke());
                        break;
                    }
                    break;
                case 6:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", function03.invoke(), null);
                    break;
                case 7:
                    LogLevel logLevel25 = LogLevel.INFO;
                    LogHandler currentLogHandler25 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel25) <= 0) {
                        currentLogHandler25.i("[Purchases] - " + logLevel25.name(), function03.invoke());
                        break;
                    }
                    break;
                case 8:
                    LogLevel logLevel26 = LogLevel.DEBUG;
                    LogHandler currentLogHandler26 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel26) <= 0) {
                        currentLogHandler26.d("[Purchases] - " + logLevel26.name(), function03.invoke());
                        break;
                    }
                    break;
                case 9:
                    LogLevel logLevel27 = LogLevel.DEBUG;
                    LogHandler currentLogHandler27 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel27) <= 0) {
                        currentLogHandler27.d("[Purchases] - " + logLevel27.name(), function03.invoke());
                        break;
                    }
                    break;
                case 10:
                    LogLevel logLevel28 = LogLevel.WARN;
                    LogHandler currentLogHandler28 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel28) <= 0) {
                        currentLogHandler28.w("[Purchases] - " + logLevel28.name(), function03.invoke());
                        break;
                    }
                    break;
                case 11:
                    LogLevel logLevel29 = LogLevel.WARN;
                    LogHandler currentLogHandler29 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel29) <= 0) {
                        currentLogHandler29.w("[Purchases] - " + logLevel29.name(), function03.invoke());
                        break;
                    }
                    break;
                case 12:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", function03.invoke(), null);
                    break;
            }
            final LogIntent logIntent4 = LogIntent.USER;
            Function0<String> function04 = new Function0<String>() { // from class: com.revenuecat.purchases.PurchasesFactory$createPurchases$lambda$8$$inlined$log$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    StringBuilder append = new StringBuilder().append(CollectionsKt.joinToString$default(LogIntent.this.getEmojiList(), "", null, null, 0, null, null, 62, null)).append(' ');
                    String format = String.format(ConfigureStrings.INITIAL_APP_USER_ID, Arrays.copyOf(new Object[]{configuration.getAppUserID()}, 1));
                    Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                    return append.append(format).toString();
                }
            };
            switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent4.ordinal()]) {
                case 1:
                    LogLevel logLevel30 = LogLevel.DEBUG;
                    LogHandler currentLogHandler30 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel30) <= 0) {
                        currentLogHandler30.d("[Purchases] - " + logLevel30.name(), function04.invoke());
                        break;
                    }
                    break;
                case 2:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", function04.invoke(), null);
                    break;
                case 3:
                    LogLevel logLevel31 = LogLevel.WARN;
                    LogHandler currentLogHandler31 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel31) <= 0) {
                        currentLogHandler31.w("[Purchases] - " + logLevel31.name(), function04.invoke());
                        break;
                    }
                    break;
                case 4:
                    LogLevel logLevel32 = LogLevel.INFO;
                    LogHandler currentLogHandler32 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel32) <= 0) {
                        currentLogHandler32.i("[Purchases] - " + logLevel32.name(), function04.invoke());
                        break;
                    }
                    break;
                case 5:
                    LogLevel logLevel33 = LogLevel.DEBUG;
                    LogHandler currentLogHandler33 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel33) <= 0) {
                        currentLogHandler33.d("[Purchases] - " + logLevel33.name(), function04.invoke());
                        break;
                    }
                    break;
                case 6:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", function04.invoke(), null);
                    break;
                case 7:
                    LogLevel logLevel34 = LogLevel.INFO;
                    LogHandler currentLogHandler34 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel34) <= 0) {
                        currentLogHandler34.i("[Purchases] - " + logLevel34.name(), function04.invoke());
                        break;
                    }
                    break;
                case 8:
                    LogLevel logLevel35 = LogLevel.DEBUG;
                    LogHandler currentLogHandler35 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel35) <= 0) {
                        currentLogHandler35.d("[Purchases] - " + logLevel35.name(), function04.invoke());
                        break;
                    }
                    break;
                case 9:
                    LogLevel logLevel36 = LogLevel.DEBUG;
                    LogHandler currentLogHandler36 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel36) <= 0) {
                        currentLogHandler36.d("[Purchases] - " + logLevel36.name(), function04.invoke());
                        break;
                    }
                    break;
                case 10:
                    LogLevel logLevel37 = LogLevel.WARN;
                    LogHandler currentLogHandler37 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel37) <= 0) {
                        currentLogHandler37.w("[Purchases] - " + logLevel37.name(), function04.invoke());
                        break;
                    }
                    break;
                case 11:
                    LogLevel logLevel38 = LogLevel.WARN;
                    LogHandler currentLogHandler38 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel38) <= 0) {
                        currentLogHandler38.w("[Purchases] - " + logLevel38.name(), function04.invoke());
                        break;
                    }
                    break;
                case 12:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", function04.invoke(), null);
                    break;
            }
            final LogIntent logIntent5 = LogIntent.DEBUG;
            Function0<String> function05 = new Function0<String>() { // from class: com.revenuecat.purchases.PurchasesFactory$createPurchases$lambda$8$$inlined$log$5
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    StringBuilder append = new StringBuilder().append(CollectionsKt.joinToString$default(LogIntent.this.getEmojiList(), "", null, null, 0, null, null, 62, null)).append(' ');
                    String format = String.format(ConfigureStrings.VERIFICATION_MODE_SELECTED, Arrays.copyOf(new Object[]{configuration.getVerificationMode().name()}, 1));
                    Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                    return append.append(format).toString();
                }
            };
            switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent5.ordinal()]) {
                case 1:
                    LogLevel logLevel39 = LogLevel.DEBUG;
                    LogHandler currentLogHandler39 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel39) <= 0) {
                        currentLogHandler39.d("[Purchases] - " + logLevel39.name(), function05.invoke());
                        break;
                    }
                    break;
                case 2:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", function05.invoke(), null);
                    break;
                case 3:
                    LogLevel logLevel40 = LogLevel.WARN;
                    LogHandler currentLogHandler40 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel40) <= 0) {
                        currentLogHandler40.w("[Purchases] - " + logLevel40.name(), function05.invoke());
                        break;
                    }
                    break;
                case 4:
                    LogLevel logLevel41 = LogLevel.INFO;
                    LogHandler currentLogHandler41 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel41) <= 0) {
                        currentLogHandler41.i("[Purchases] - " + logLevel41.name(), function05.invoke());
                        break;
                    }
                    break;
                case 5:
                    LogLevel logLevel42 = LogLevel.DEBUG;
                    LogHandler currentLogHandler42 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel42) <= 0) {
                        currentLogHandler42.d("[Purchases] - " + logLevel42.name(), function05.invoke());
                        break;
                    }
                    break;
                case 6:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", function05.invoke(), null);
                    break;
                case 7:
                    LogLevel logLevel43 = LogLevel.INFO;
                    LogHandler currentLogHandler43 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel43) <= 0) {
                        currentLogHandler43.i("[Purchases] - " + logLevel43.name(), function05.invoke());
                        break;
                    }
                    break;
                case 8:
                    LogLevel logLevel44 = LogLevel.DEBUG;
                    LogHandler currentLogHandler44 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel44) <= 0) {
                        currentLogHandler44.d("[Purchases] - " + logLevel44.name(), function05.invoke());
                        break;
                    }
                    break;
                case 9:
                    LogLevel logLevel45 = LogLevel.DEBUG;
                    LogHandler currentLogHandler45 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel45) <= 0) {
                        currentLogHandler45.d("[Purchases] - " + logLevel45.name(), function05.invoke());
                        break;
                    }
                    break;
                case 10:
                    LogLevel logLevel46 = LogLevel.WARN;
                    LogHandler currentLogHandler46 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel46) <= 0) {
                        currentLogHandler46.w("[Purchases] - " + logLevel46.name(), function05.invoke());
                        break;
                    }
                    break;
                case 11:
                    LogLevel logLevel47 = LogLevel.WARN;
                    LogHandler currentLogHandler47 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel47) <= 0) {
                        currentLogHandler47.w("[Purchases] - " + logLevel47.name(), function05.invoke());
                        break;
                    }
                    break;
                case 12:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", function05.invoke(), null);
                    break;
            }
            return new Purchases(new PurchasesOrchestrator(application4, configuration.getAppUserID(), backend4, billingAbstract4, deviceCache3, identityManager, subscriberAttributesManager, appConfig3, customerInfoHelper, customerInfoUpdateHandler, diagnosticsSynchronizer2, diagnosticsTracker5, null, offlineEntitlementsManager, postReceiptHelper, postTransactionWithProductDetailsHelper, postPendingTransactionsHelper, syncPurchasesHelper, offeringsManager, createEventsManager(identityManager, dispatcher7, backend4, EventsManager.INSTANCE.paywalls(new FileHelper(application5)), EventsManager.INSTANCE.backendEvents(new FileHelper(application5)), AppConfig.INSTANCE.getPaywallEventsURL()), createEventsManager(identityManager, dispatcher7, backend4, null, EventsManager.INSTANCE.adEvents(new FileHelper(application5)), AppConfig.INSTANCE.getAdEventsURL()), paywallPresentedCache, purchasesStateCache, null, dispatcher3, configuration, fontLoader, defaultLocaleProvider, null, new VirtualCurrencyManager(identityManager, deviceCache3, backend4, appConfig3), new PurchaseParamsValidator(), null, null, null, null, null, -1870655488, 15, null));
        } catch (IllegalStateException e2) {
            if (!UserManagerCompat.isUserUnlocked(configuration.getContext())) {
                throw new IllegalStateException("Trying to configure Purchases while the device is locked. If you need to support this scenario, ensure you *always* configure Purchases with a Context created with `createDeviceProtectedStorageContext()` to avoid undefined behavior.\nSee https://developer.android.com/reference/android/content/Context#createDeviceProtectedStorageContext() for more info.", e2);
            }
            throw e2;
        }
    }

    private final EventsManager createEventsManager(IdentityManager identityManager, Dispatcher eventsDispatcher, final Backend backend, EventsFileHelper<PaywallStoredEvent> legacyEventsFileHelper, EventsFileHelper<BackendStoredEvent> fileHelper, final URL baseURL) {
        return new EventsManager(null, legacyEventsFileHelper, fileHelper, identityManager, eventsDispatcher, new Function4<EventsRequest, Delay, Function0<? extends Unit>, Function2<? super PurchasesError, ? super Boolean, ? extends Unit>, Unit>() { // from class: com.revenuecat.purchases.PurchasesFactory$createEventsManager$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(EventsRequest eventsRequest, Delay delay, Function0<? extends Unit> function0, Function2<? super PurchasesError, ? super Boolean, ? extends Unit> function2) {
                invoke2(eventsRequest, delay, (Function0<Unit>) function0, (Function2<? super PurchasesError, ? super Boolean, Unit>) function2);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(EventsRequest request, Delay delay, Function0<Unit> onSuccess, Function2<? super PurchasesError, ? super Boolean, Unit> onError) {
                Intrinsics.checkNotNullParameter(request, "request");
                Intrinsics.checkNotNullParameter(delay, "delay");
                Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
                Intrinsics.checkNotNullParameter(onError, "onError");
                Backend.this.postEvents(request, baseURL, delay, onSuccess, onError);
            }
        }, 1, null);
    }

    public final APIKeyValidator.ValidationResult validateConfiguration(PurchasesConfiguration configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        if (!hasPermission(configuration.getContext(), "android.permission.INTERNET")) {
            throw new IllegalArgumentException("Purchases requires INTERNET permission.".toString());
        }
        if (StringsKt.isBlank(configuration.getApiKey())) {
            throw new IllegalArgumentException("API key must be set. Get this from the RevenueCat web app".toString());
        }
        APIKeyValidator.ValidationResult validateAndLog = this.apiKeyValidator.validateAndLog(configuration.getApiKey(), configuration.getStore());
        if (!this.isDebugBuild.invoke() && validateAndLog == APIKeyValidator.ValidationResult.SIMULATED_STORE) {
            String redactApiKey = this.apiKeyValidator.redactApiKey(configuration.getApiKey());
            LogUtilsKt.errorLog(new PurchasesError(PurchasesErrorCode.ConfigurationError, "Test Store API key used in release build: " + redactApiKey + ". Please configure the Play Store/Amazon app on the RevenueCat dashboard and use its corresponding API key before releasing. Visit https://rev.cat/sdk-test-store to learn more."));
            SimulatedStoreErrorDialogActivity.INSTANCE.show(configuration.getContext(), redactApiKey);
            return validateAndLog;
        }
        if (configuration.getContext().getApplicationContext() instanceof Application) {
            return validateAndLog;
        }
        throw new IllegalArgumentException("Needs an application context.".toString());
    }

    private final Application getApplication(Context context) {
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type android.app.Application");
        return (Application) applicationContext;
    }

    private final boolean hasPermission(Context context, String str) {
        return context.checkCallingOrSelfPermission(str) == 0;
    }

    private final ExecutorService createDefaultExecutor() {
        ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        Intrinsics.checkNotNullExpressionValue(newSingleThreadScheduledExecutor, "newSingleThreadScheduledExecutor()");
        return newSingleThreadScheduledExecutor;
    }

    private final ExecutorService createEventsExecutor() {
        ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(new LowPriorityThreadFactory("revenuecat-events-thread"));
        Intrinsics.checkNotNullExpressionValue(newSingleThreadScheduledExecutor, "newSingleThreadScheduled…venuecat-events-thread\"))");
        return newSingleThreadScheduledExecutor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: PurchasesFactory.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/revenuecat/purchases/PurchasesFactory$LowPriorityThreadFactory;", "Ljava/util/concurrent/ThreadFactory;", "threadName", "", "(Ljava/lang/String;)V", "newThread", "Ljava/lang/Thread;", "r", "Ljava/lang/Runnable;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    static final class LowPriorityThreadFactory implements ThreadFactory {
        private final String threadName;

        public LowPriorityThreadFactory(String threadName) {
            Intrinsics.checkNotNullParameter(threadName, "threadName");
            this.threadName = threadName;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(final Runnable r) {
            return new Thread(new Runnable() { // from class: com.revenuecat.purchases.PurchasesFactory$LowPriorityThreadFactory$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    PurchasesFactory.LowPriorityThreadFactory.newThread$lambda$1(r);
                }
            }, this.threadName);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void newThread$lambda$1(Runnable runnable) {
            if (runnable != null) {
                Process.setThreadPriority(5);
                runnable.run();
            }
        }
    }
}
