package com.revenuecat.purchases.common.offerings;

import android.os.Handler;
import android.os.Looper;
import com.revenuecat.purchases.LogHandler;
import com.revenuecat.purchases.LogLevel;
import com.revenuecat.purchases.Offering;
import com.revenuecat.purchases.Offerings;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.common.Backend;
import com.revenuecat.purchases.common.Config;
import com.revenuecat.purchases.common.DateProvider;
import com.revenuecat.purchases.common.DefaultDateProvider;
import com.revenuecat.purchases.common.DurationExtensionsKt;
import com.revenuecat.purchases.common.GetOfferingsErrorHandlingBehavior;
import com.revenuecat.purchases.common.HTTPResponseOriginalSource;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker;
import com.revenuecat.purchases.paywalls.OfferingFontPreDownloader;
import com.revenuecat.purchases.strings.OfferingStrings;
import com.revenuecat.purchases.utils.JSONObjectExtensionsKt;
import com.revenuecat.purchases.utils.OfferingImagePreDownloader;
import java.util.Arrays;
import java.util.Date;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import org.json.JSONObject;

/* compiled from: OfferingsManager.kt */
@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0002\u0010\u0012JP\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0016\b\u0002\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u001c2\u0016\b\u0002\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u001cH\u0002J\u0016\u0010 \u001a\u00020\u00142\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00140\"H\u0002JF\u0010#\u001a\u00020\u00142\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u001a2\u0016\b\u0002\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u001c2\u0016\b\u0002\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u001cJP\u0010'\u001a\u00020\u00142\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u001a2\u0016\b\u0002\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u001c2\u0016\b\u0002\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u001c2\b\b\u0002\u0010)\u001a\u00020\u001aJ&\u0010*\u001a\u00020\u00142\u0006\u0010+\u001a\u00020\u001d2\u0014\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u001cH\u0002J\u000e\u0010,\u001a\u00020\u00142\u0006\u0010$\u001a\u00020%JB\u0010-\u001a\u00020\u00142\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u0002012\b\u0010+\u001a\u0004\u0018\u00010\u001d2\u000e\u00102\u001a\n\u0012\u0004\u0012\u00020%\u0018\u0001032\u000e\u00104\u001a\n\u0012\u0004\u0012\u00020%\u0018\u000103H\u0002J\b\u00105\u001a\u00020\u0014H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00066"}, d2 = {"Lcom/revenuecat/purchases/common/offerings/OfferingsManager;", "", "offeringsCache", "Lcom/revenuecat/purchases/common/offerings/OfferingsCache;", "backend", "Lcom/revenuecat/purchases/common/Backend;", "offeringsFactory", "Lcom/revenuecat/purchases/common/offerings/OfferingsFactory;", "offeringImagePreDownloader", "Lcom/revenuecat/purchases/utils/OfferingImagePreDownloader;", "diagnosticsTrackerIfEnabled", "Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker;", "offeringFontPreDownloader", "Lcom/revenuecat/purchases/paywalls/OfferingFontPreDownloader;", "dateProvider", "Lcom/revenuecat/purchases/common/DateProvider;", "mainHandler", "Landroid/os/Handler;", "(Lcom/revenuecat/purchases/common/offerings/OfferingsCache;Lcom/revenuecat/purchases/common/Backend;Lcom/revenuecat/purchases/common/offerings/OfferingsFactory;Lcom/revenuecat/purchases/utils/OfferingImagePreDownloader;Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker;Lcom/revenuecat/purchases/paywalls/OfferingFontPreDownloader;Lcom/revenuecat/purchases/common/DateProvider;Landroid/os/Handler;)V", "createAndCacheOfferings", "", "offeringsJSON", "Lorg/json/JSONObject;", "originalDataSource", "Lcom/revenuecat/purchases/common/HTTPResponseOriginalSource;", "loadedFromDiskCache", "", "onError", "Lkotlin/Function1;", "Lcom/revenuecat/purchases/PurchasesError;", "onSuccess", "Lcom/revenuecat/purchases/common/offerings/OfferingsResultData;", "dispatch", "action", "Lkotlin/Function0;", "fetchAndCacheOfferings", "appUserID", "", "appInBackground", "getOfferings", "Lcom/revenuecat/purchases/Offerings;", "fetchCurrent", "handleErrorFetchingOfferings", "error", "onAppForeground", "trackGetOfferingsResultIfNeeded", "startTime", "Ljava/util/Date;", "cacheStatus", "Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker$CacheStatus;", "requestedProductIds", "", "notFoundProductIds", "trackGetOfferingsStartedIfNeeded", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class OfferingsManager {
    private final Backend backend;
    private final DateProvider dateProvider;
    private final DiagnosticsTracker diagnosticsTrackerIfEnabled;
    private final Handler mainHandler;
    private final OfferingFontPreDownloader offeringFontPreDownloader;
    private final OfferingImagePreDownloader offeringImagePreDownloader;
    private final OfferingsCache offeringsCache;
    private final OfferingsFactory offeringsFactory;

    public OfferingsManager(OfferingsCache offeringsCache, Backend backend, OfferingsFactory offeringsFactory, OfferingImagePreDownloader offeringImagePreDownloader, DiagnosticsTracker diagnosticsTracker, OfferingFontPreDownloader offeringFontPreDownloader, DateProvider dateProvider, Handler handler) {
        Intrinsics.checkNotNullParameter(offeringsCache, "offeringsCache");
        Intrinsics.checkNotNullParameter(backend, "backend");
        Intrinsics.checkNotNullParameter(offeringsFactory, "offeringsFactory");
        Intrinsics.checkNotNullParameter(offeringImagePreDownloader, "offeringImagePreDownloader");
        Intrinsics.checkNotNullParameter(offeringFontPreDownloader, "offeringFontPreDownloader");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.offeringsCache = offeringsCache;
        this.backend = backend;
        this.offeringsFactory = offeringsFactory;
        this.offeringImagePreDownloader = offeringImagePreDownloader;
        this.diagnosticsTrackerIfEnabled = diagnosticsTracker;
        this.offeringFontPreDownloader = offeringFontPreDownloader;
        this.dateProvider = dateProvider;
        this.mainHandler = handler;
    }

    public /* synthetic */ OfferingsManager(OfferingsCache offeringsCache, Backend backend, OfferingsFactory offeringsFactory, OfferingImagePreDownloader offeringImagePreDownloader, DiagnosticsTracker diagnosticsTracker, OfferingFontPreDownloader offeringFontPreDownloader, DateProvider dateProvider, Handler handler, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(offeringsCache, backend, offeringsFactory, offeringImagePreDownloader, diagnosticsTracker, offeringFontPreDownloader, (i & 64) != 0 ? new DefaultDateProvider() : dateProvider, (i & 128) != 0 ? new Handler(Looper.getMainLooper()) : handler);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void getOfferings$default(OfferingsManager offeringsManager, String str, boolean z, Function1 function1, Function1 function12, boolean z2, int i, Object obj) {
        if ((i & 4) != 0) {
            function1 = null;
        }
        if ((i & 8) != 0) {
            function12 = null;
        }
        if ((i & 16) != 0) {
            z2 = false;
        }
        offeringsManager.getOfferings(str, z, function1, function12, z2);
    }

    public final void getOfferings(String appUserID, final boolean appInBackground, final Function1<? super PurchasesError, Unit> onError, final Function1<? super Offerings, Unit> onSuccess, boolean fetchCurrent) {
        LogHandler currentLogHandler;
        String str;
        String invoke;
        Intrinsics.checkNotNullParameter(appUserID, "appUserID");
        trackGetOfferingsStartedIfNeeded();
        final Date now = this.dateProvider.getNow();
        final Function2<PurchasesError, DiagnosticsTracker.CacheStatus, Unit> function2 = new Function2<PurchasesError, DiagnosticsTracker.CacheStatus, Unit>() { // from class: com.revenuecat.purchases.common.offerings.OfferingsManager$getOfferings$onErrorWithTracking$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(PurchasesError purchasesError, DiagnosticsTracker.CacheStatus cacheStatus) {
                invoke2(purchasesError, cacheStatus);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(PurchasesError error, DiagnosticsTracker.CacheStatus cacheStatus) {
                Intrinsics.checkNotNullParameter(error, "error");
                Intrinsics.checkNotNullParameter(cacheStatus, "cacheStatus");
                OfferingsManager.this.trackGetOfferingsResultIfNeeded(now, cacheStatus, error, null, null);
                Function1<PurchasesError, Unit> function1 = onError;
                if (function1 != null) {
                    function1.invoke(error);
                }
            }
        };
        final Function2<OfferingsResultData, DiagnosticsTracker.CacheStatus, Unit> function22 = new Function2<OfferingsResultData, DiagnosticsTracker.CacheStatus, Unit>() { // from class: com.revenuecat.purchases.common.offerings.OfferingsManager$getOfferings$onSuccessWithTracking$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(OfferingsResultData offeringsResultData, DiagnosticsTracker.CacheStatus cacheStatus) {
                invoke2(offeringsResultData, cacheStatus);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(OfferingsResultData result, DiagnosticsTracker.CacheStatus cacheStatus) {
                Intrinsics.checkNotNullParameter(result, "result");
                Intrinsics.checkNotNullParameter(cacheStatus, "cacheStatus");
                OfferingsManager.this.trackGetOfferingsResultIfNeeded(now, cacheStatus, null, result.getRequestedProductIds(), result.getNotFoundProductIds());
                Function1<Offerings, Unit> function1 = onSuccess;
                if (function1 != null) {
                    function1.invoke(result.getOfferings());
                }
            }
        };
        final Offerings cachedOfferings = this.offeringsCache.getCachedOfferings();
        if (fetchCurrent) {
            final LogIntent logIntent = LogIntent.DEBUG;
            Function0<String> function0 = new Function0<String>() { // from class: com.revenuecat.purchases.common.offerings.OfferingsManager$getOfferings$$inlined$log$1
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return CollectionsKt.joinToString$default(LogIntent.this.getEmojiList(), "", null, null, 0, null, null, 62, null) + " Latest Offerings requested, fetching from network";
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
            fetchAndCacheOfferings(appUserID, appInBackground, new Function1<PurchasesError, Unit>() { // from class: com.revenuecat.purchases.common.offerings.OfferingsManager$getOfferings$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(PurchasesError purchasesError) {
                    invoke2(purchasesError);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(PurchasesError it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    function2.invoke(it, DiagnosticsTracker.CacheStatus.NOT_CHECKED);
                }
            }, new Function1<OfferingsResultData, Unit>() { // from class: com.revenuecat.purchases.common.offerings.OfferingsManager$getOfferings$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(OfferingsResultData offeringsResultData) {
                    invoke2(offeringsResultData);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(OfferingsResultData it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    function22.invoke(it, DiagnosticsTracker.CacheStatus.NOT_CHECKED);
                }
            });
            return;
        }
        if (cachedOfferings == null) {
            final LogIntent logIntent2 = LogIntent.DEBUG;
            Function0<String> function02 = new Function0<String>() { // from class: com.revenuecat.purchases.common.offerings.OfferingsManager$getOfferings$$inlined$log$2
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return CollectionsKt.joinToString$default(LogIntent.this.getEmojiList(), "", null, null, 0, null, null, 62, null) + " No cached Offerings, fetching from network";
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
            fetchAndCacheOfferings(appUserID, appInBackground, new Function1<PurchasesError, Unit>() { // from class: com.revenuecat.purchases.common.offerings.OfferingsManager$getOfferings$5
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(PurchasesError purchasesError) {
                    invoke2(purchasesError);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(PurchasesError it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    function2.invoke(it, DiagnosticsTracker.CacheStatus.NOT_FOUND);
                }
            }, new Function1<OfferingsResultData, Unit>() { // from class: com.revenuecat.purchases.common.offerings.OfferingsManager$getOfferings$6
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(OfferingsResultData offeringsResultData) {
                    invoke2(offeringsResultData);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(OfferingsResultData it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    function22.invoke(it, DiagnosticsTracker.CacheStatus.NOT_FOUND);
                }
            });
            return;
        }
        final LogIntent logIntent3 = LogIntent.DEBUG;
        Function0<String> function03 = new Function0<String>() { // from class: com.revenuecat.purchases.common.offerings.OfferingsManager$getOfferings$$inlined$log$3
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return CollectionsKt.joinToString$default(LogIntent.this.getEmojiList(), "", null, null, 0, null, null, 62, null) + " Vending Offerings from cache";
            }
        };
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent3.ordinal()]) {
            case 1:
                LogLevel logLevel19 = LogLevel.DEBUG;
                LogHandler currentLogHandler16 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel19) <= 0) {
                    currentLogHandler16.d("[Purchases] - " + logLevel19.name(), function03.invoke());
                    break;
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", function03.invoke(), null);
                break;
            case 3:
                LogLevel logLevel20 = LogLevel.WARN;
                LogHandler currentLogHandler17 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel20) <= 0) {
                    currentLogHandler17.w("[Purchases] - " + logLevel20.name(), function03.invoke());
                    break;
                }
                break;
            case 4:
                LogLevel logLevel21 = LogLevel.INFO;
                LogHandler currentLogHandler18 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel21) <= 0) {
                    currentLogHandler18.i("[Purchases] - " + logLevel21.name(), function03.invoke());
                    break;
                }
                break;
            case 5:
                LogLevel logLevel22 = LogLevel.DEBUG;
                LogHandler currentLogHandler19 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel22) <= 0) {
                    currentLogHandler19.d("[Purchases] - " + logLevel22.name(), function03.invoke());
                    break;
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", function03.invoke(), null);
                break;
            case 7:
                LogLevel logLevel23 = LogLevel.INFO;
                LogHandler currentLogHandler20 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel23) <= 0) {
                    currentLogHandler20.i("[Purchases] - " + logLevel23.name(), function03.invoke());
                    break;
                }
                break;
            case 8:
                LogLevel logLevel24 = LogLevel.DEBUG;
                LogHandler currentLogHandler21 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel24) <= 0) {
                    currentLogHandler21.d("[Purchases] - " + logLevel24.name(), function03.invoke());
                    break;
                }
                break;
            case 9:
                LogLevel logLevel25 = LogLevel.DEBUG;
                LogHandler currentLogHandler22 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel25) <= 0) {
                    currentLogHandler22.d("[Purchases] - " + logLevel25.name(), function03.invoke());
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
        boolean isOfferingsCacheStale = this.offeringsCache.isOfferingsCacheStale(appInBackground);
        trackGetOfferingsResultIfNeeded(now, isOfferingsCacheStale ? DiagnosticsTracker.CacheStatus.STALE : DiagnosticsTracker.CacheStatus.VALID, null, null, null);
        dispatch(new Function0<Unit>() { // from class: com.revenuecat.purchases.common.offerings.OfferingsManager$getOfferings$8
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                Function1<Offerings, Unit> function1 = onSuccess;
                if (function1 != null) {
                    function1.invoke(cachedOfferings);
                }
            }
        });
        if (isOfferingsCacheStale) {
            final LogIntent logIntent4 = LogIntent.DEBUG;
            Function0<String> function04 = new Function0<String>() { // from class: com.revenuecat.purchases.common.offerings.OfferingsManager$getOfferings$$inlined$log$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    String str2;
                    StringBuilder append = new StringBuilder().append(CollectionsKt.joinToString$default(LogIntent.this.getEmojiList(), "", null, null, 0, null, null, 62, null)).append(' ');
                    if (appInBackground) {
                        str2 = OfferingStrings.OFFERINGS_STALE_UPDATING_IN_BACKGROUND;
                    } else {
                        str2 = OfferingStrings.OFFERINGS_STALE_UPDATING_IN_FOREGROUND;
                    }
                    return append.append(str2).toString();
                }
            };
            switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent4.ordinal()]) {
                case 1:
                    LogLevel logLevel28 = LogLevel.DEBUG;
                    LogHandler currentLogHandler25 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel28) <= 0) {
                        currentLogHandler25.d("[Purchases] - " + logLevel28.name(), function04.invoke());
                        break;
                    }
                    break;
                case 2:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", function04.invoke(), null);
                    break;
                case 3:
                    LogLevel logLevel29 = LogLevel.WARN;
                    LogHandler currentLogHandler26 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel29) <= 0) {
                        currentLogHandler26.w("[Purchases] - " + logLevel29.name(), function04.invoke());
                        break;
                    }
                    break;
                case 4:
                    LogLevel logLevel30 = LogLevel.INFO;
                    LogHandler currentLogHandler27 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel30) <= 0) {
                        currentLogHandler27.i("[Purchases] - " + logLevel30.name(), function04.invoke());
                        break;
                    }
                    break;
                case 5:
                    LogLevel logLevel31 = LogLevel.DEBUG;
                    LogHandler currentLogHandler28 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel31) <= 0) {
                        currentLogHandler28.d("[Purchases] - " + logLevel31.name(), function04.invoke());
                        break;
                    }
                    break;
                case 6:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", function04.invoke(), null);
                    break;
                case 7:
                    LogLevel logLevel32 = LogLevel.INFO;
                    LogHandler currentLogHandler29 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel32) <= 0) {
                        currentLogHandler29.i("[Purchases] - " + logLevel32.name(), function04.invoke());
                        break;
                    }
                    break;
                case 8:
                    LogLevel logLevel33 = LogLevel.DEBUG;
                    LogHandler currentLogHandler30 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel33) <= 0) {
                        currentLogHandler30.d("[Purchases] - " + logLevel33.name(), function04.invoke());
                        break;
                    }
                    break;
                case 9:
                    LogLevel logLevel34 = LogLevel.DEBUG;
                    LogHandler currentLogHandler31 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel34) <= 0) {
                        currentLogHandler31.d("[Purchases] - " + logLevel34.name(), function04.invoke());
                        break;
                    }
                    break;
                case 10:
                    LogLevel logLevel35 = LogLevel.WARN;
                    LogHandler currentLogHandler32 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel35) <= 0) {
                        currentLogHandler32.w("[Purchases] - " + logLevel35.name(), function04.invoke());
                        break;
                    }
                    break;
                case 11:
                    LogLevel logLevel36 = LogLevel.WARN;
                    LogHandler currentLogHandler33 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel36) <= 0) {
                        currentLogHandler33.w("[Purchases] - " + logLevel36.name(), function04.invoke());
                        break;
                    }
                    break;
                case 12:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", function04.invoke(), null);
                    break;
            }
            fetchAndCacheOfferings$default(this, appUserID, appInBackground, null, null, 12, null);
        }
    }

    public final void onAppForeground(String appUserID) {
        LogHandler currentLogHandler;
        String str;
        String invoke;
        Intrinsics.checkNotNullParameter(appUserID, "appUserID");
        if (this.offeringsCache.isOfferingsCacheStale(false)) {
            final LogIntent logIntent = LogIntent.DEBUG;
            Function0<String> function0 = new Function0<String>() { // from class: com.revenuecat.purchases.common.offerings.OfferingsManager$onAppForeground$$inlined$log$1
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return CollectionsKt.joinToString$default(LogIntent.this.getEmojiList(), "", null, null, 0, null, null, 62, null) + " Offerings cache is stale, updating from network in foreground";
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
            fetchAndCacheOfferings$default(this, appUserID, false, null, null, 12, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void fetchAndCacheOfferings$default(OfferingsManager offeringsManager, String str, boolean z, Function1 function1, Function1 function12, int i, Object obj) {
        if ((i & 4) != 0) {
            function1 = null;
        }
        if ((i & 8) != 0) {
            function12 = null;
        }
        offeringsManager.fetchAndCacheOfferings(str, z, function1, function12);
    }

    public final void fetchAndCacheOfferings(String appUserID, boolean appInBackground, final Function1<? super PurchasesError, Unit> onError, final Function1<? super OfferingsResultData, Unit> onSuccess) {
        LogHandler currentLogHandler;
        String str;
        String invoke;
        Intrinsics.checkNotNullParameter(appUserID, "appUserID");
        final LogIntent logIntent = LogIntent.RC_SUCCESS;
        Function0<String> function0 = new Function0<String>() { // from class: com.revenuecat.purchases.common.offerings.OfferingsManager$fetchAndCacheOfferings$$inlined$log$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return CollectionsKt.joinToString$default(LogIntent.this.getEmojiList(), "", null, null, 0, null, null, 62, null) + " Start Offerings update from network.";
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
        this.backend.getOfferings(appUserID, appInBackground, new Function2<JSONObject, HTTPResponseOriginalSource, Unit>() { // from class: com.revenuecat.purchases.common.offerings.OfferingsManager$fetchAndCacheOfferings$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(JSONObject jSONObject, HTTPResponseOriginalSource hTTPResponseOriginalSource) {
                invoke2(jSONObject, hTTPResponseOriginalSource);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(JSONObject body, HTTPResponseOriginalSource originalDataSource) {
                Intrinsics.checkNotNullParameter(body, "body");
                Intrinsics.checkNotNullParameter(originalDataSource, "originalDataSource");
                OfferingsManager.this.createAndCacheOfferings(body, originalDataSource, false, onError, onSuccess);
            }
        }, new Function2<PurchasesError, GetOfferingsErrorHandlingBehavior, Unit>() { // from class: com.revenuecat.purchases.common.offerings.OfferingsManager$fetchAndCacheOfferings$3

            /* compiled from: OfferingsManager.kt */
            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[GetOfferingsErrorHandlingBehavior.values().length];
                    try {
                        iArr[GetOfferingsErrorHandlingBehavior.SHOULD_FALLBACK_TO_CACHED_OFFERINGS.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[GetOfferingsErrorHandlingBehavior.SHOULD_NOT_FALLBACK.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(PurchasesError purchasesError, GetOfferingsErrorHandlingBehavior getOfferingsErrorHandlingBehavior) {
                invoke2(purchasesError, getOfferingsErrorHandlingBehavior);
                return Unit.INSTANCE;
            }

            /* JADX WARN: Code restructure failed: missing block: B:23:0x007f, code lost:
            
                if (r7 == null) goto L24;
             */
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void invoke2(PurchasesError backendError, GetOfferingsErrorHandlingBehavior errorBehavior) {
                OfferingsCache offeringsCache;
                HTTPResponseOriginalSource hTTPResponseOriginalSource;
                Intrinsics.checkNotNullParameter(backendError, "backendError");
                Intrinsics.checkNotNullParameter(errorBehavior, "errorBehavior");
                int i = WhenMappings.$EnumSwitchMapping$0[errorBehavior.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        return;
                    }
                    OfferingsManager.this.handleErrorFetchingOfferings(backendError, onError);
                    return;
                }
                offeringsCache = OfferingsManager.this.offeringsCache;
                JSONObject cachedOfferingsResponse = offeringsCache.getCachedOfferingsResponse();
                if (cachedOfferingsResponse == null) {
                    OfferingsManager.this.handleErrorFetchingOfferings(backendError, onError);
                    return;
                }
                LogLevel logLevel10 = LogLevel.WARN;
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler7.w("[Purchases] - " + logLevel10.name(), OfferingStrings.ERROR_FETCHING_OFFERINGS_USING_DISK_CACHE);
                }
                String optNullableString = JSONObjectExtensionsKt.optNullableString(cachedOfferingsResponse, OfferingsCache.ORIGINAL_SOURCE_KEY);
                if (optNullableString != null) {
                    try {
                        hTTPResponseOriginalSource = HTTPResponseOriginalSource.valueOf(optNullableString);
                    } catch (IllegalArgumentException e) {
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Invalid original data source for cached offerings", e);
                        hTTPResponseOriginalSource = null;
                    }
                }
                hTTPResponseOriginalSource = HTTPResponseOriginalSource.MAIN;
                OfferingsManager.this.createAndCacheOfferings(cachedOfferingsResponse, hTTPResponseOriginalSource, true, onError, onSuccess);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void createAndCacheOfferings$default(OfferingsManager offeringsManager, JSONObject jSONObject, HTTPResponseOriginalSource hTTPResponseOriginalSource, boolean z, Function1 function1, Function1 function12, int i, Object obj) {
        if ((i & 8) != 0) {
            function1 = null;
        }
        if ((i & 16) != 0) {
            function12 = null;
        }
        offeringsManager.createAndCacheOfferings(jSONObject, hTTPResponseOriginalSource, z, function1, function12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void createAndCacheOfferings(final JSONObject offeringsJSON, HTTPResponseOriginalSource originalDataSource, boolean loadedFromDiskCache, final Function1<? super PurchasesError, Unit> onError, final Function1<? super OfferingsResultData, Unit> onSuccess) {
        this.offeringsFactory.createOfferings(offeringsJSON, originalDataSource, loadedFromDiskCache, new Function1<PurchasesError, Unit>() { // from class: com.revenuecat.purchases.common.offerings.OfferingsManager$createAndCacheOfferings$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(PurchasesError purchasesError) {
                invoke2(purchasesError);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(PurchasesError error) {
                Intrinsics.checkNotNullParameter(error, "error");
                OfferingsManager.this.handleErrorFetchingOfferings(error, onError);
            }
        }, new Function1<OfferingsResultData, Unit>() { // from class: com.revenuecat.purchases.common.offerings.OfferingsManager$createAndCacheOfferings$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(OfferingsResultData offeringsResultData) {
                invoke2(offeringsResultData);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(final OfferingsResultData offeringsResultData) {
                OfferingFontPreDownloader offeringFontPreDownloader;
                OfferingsCache offeringsCache;
                OfferingImagePreDownloader offeringImagePreDownloader;
                Intrinsics.checkNotNullParameter(offeringsResultData, "offeringsResultData");
                Offering current = offeringsResultData.getOfferings().getCurrent();
                if (current != null) {
                    offeringImagePreDownloader = OfferingsManager.this.offeringImagePreDownloader;
                    offeringImagePreDownloader.preDownloadOfferingImages(current);
                }
                offeringFontPreDownloader = OfferingsManager.this.offeringFontPreDownloader;
                offeringFontPreDownloader.preDownloadOfferingFontsIfNeeded(offeringsResultData.getOfferings());
                offeringsCache = OfferingsManager.this.offeringsCache;
                offeringsCache.cacheOfferings(offeringsResultData.getOfferings(), offeringsJSON);
                OfferingsManager offeringsManager = OfferingsManager.this;
                final Function1<OfferingsResultData, Unit> function1 = onSuccess;
                offeringsManager.dispatch(new Function0<Unit>() { // from class: com.revenuecat.purchases.common.offerings.OfferingsManager$createAndCacheOfferings$2.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        Function1<OfferingsResultData, Unit> function12 = function1;
                        if (function12 != null) {
                            function12.invoke(offeringsResultData);
                        }
                    }
                });
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleErrorFetchingOfferings(final PurchasesError error, final Function1<? super PurchasesError, Unit> onError) {
        LogHandler currentLogHandler;
        String str;
        String invoke;
        final LogIntent logIntent = SetsKt.setOf((Object[]) new PurchasesErrorCode[]{PurchasesErrorCode.ConfigurationError, PurchasesErrorCode.UnexpectedBackendResponseError}).contains(error.getCode()) ? LogIntent.RC_ERROR : LogIntent.GOOGLE_ERROR;
        Function0<String> function0 = new Function0<String>() { // from class: com.revenuecat.purchases.common.offerings.OfferingsManager$handleErrorFetchingOfferings$$inlined$log$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                StringBuilder append = new StringBuilder().append(CollectionsKt.joinToString$default(LogIntent.this.getEmojiList(), "", null, null, 0, null, null, 62, null)).append(' ');
                String format = String.format(OfferingStrings.FETCHING_OFFERINGS_ERROR, Arrays.copyOf(new Object[]{error}, 1));
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
        this.offeringsCache.forceCacheStale();
        dispatch(new Function0<Unit>() { // from class: com.revenuecat.purchases.common.offerings.OfferingsManager$handleErrorFetchingOfferings$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                Function1<PurchasesError, Unit> function1 = onError;
                if (function1 != null) {
                    function1.invoke(error);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void dispatch(final Function0<Unit> action) {
        if (!Intrinsics.areEqual(Thread.currentThread(), Looper.getMainLooper().getThread())) {
            Handler handler = this.mainHandler;
            if (handler == null) {
                handler = new Handler(Looper.getMainLooper());
            }
            handler.post(new Runnable() { // from class: com.revenuecat.purchases.common.offerings.OfferingsManager$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    Function0.this.invoke();
                }
            });
            return;
        }
        action.invoke();
    }

    private final void trackGetOfferingsStartedIfNeeded() {
        DiagnosticsTracker diagnosticsTracker = this.diagnosticsTrackerIfEnabled;
        if (diagnosticsTracker != null) {
            diagnosticsTracker.trackGetOfferingsStarted();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void trackGetOfferingsResultIfNeeded(Date startTime, DiagnosticsTracker.CacheStatus cacheStatus, PurchasesError error, Set<String> requestedProductIds, Set<String> notFoundProductIds) {
        PurchasesErrorCode code;
        if (this.diagnosticsTrackerIfEnabled == null) {
            return;
        }
        long between = DurationExtensionsKt.between(Duration.INSTANCE, startTime, this.dateProvider.getNow());
        DiagnosticsTracker diagnosticsTracker = this.diagnosticsTrackerIfEnabled;
        Integer num = null;
        String message = error != null ? error.getMessage() : null;
        if (error != null && (code = error.getCode()) != null) {
            num = Integer.valueOf(code.getCode());
        }
        diagnosticsTracker.m10590trackGetOfferingsResultB8UsjHI(requestedProductIds, notFoundProductIds, message, num, null, cacheStatus, between);
    }
}
