package com.revenuecat.purchases.common.offerings;

import com.revenuecat.purchases.LogHandler;
import com.revenuecat.purchases.LogLevel;
import com.revenuecat.purchases.Offerings;
import com.revenuecat.purchases.ProductType;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.common.AppConfig;
import com.revenuecat.purchases.common.BillingAbstract;
import com.revenuecat.purchases.common.Config;
import com.revenuecat.purchases.common.Dispatcher;
import com.revenuecat.purchases.common.HTTPResponseOriginalSource;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.OfferingParser;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.strings.OfferingStrings;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.SerializationException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: OfferingsFactory.kt */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJF\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\f0\u00142\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\f0\u0014J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\r\u001a\u00020\u000eH\u0002JP\u0010\u001b\u001a\u00020\f2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192$\u0010\u001d\u001a \u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\u001e\u0012\u0004\u0012\u00020\f0\u00142\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\f0\u0014H\u0002R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/revenuecat/purchases/common/offerings/OfferingsFactory;", "", "billing", "Lcom/revenuecat/purchases/common/BillingAbstract;", "offeringParser", "Lcom/revenuecat/purchases/common/OfferingParser;", "dispatcher", "Lcom/revenuecat/purchases/common/Dispatcher;", "appConfig", "Lcom/revenuecat/purchases/common/AppConfig;", "(Lcom/revenuecat/purchases/common/BillingAbstract;Lcom/revenuecat/purchases/common/OfferingParser;Lcom/revenuecat/purchases/common/Dispatcher;Lcom/revenuecat/purchases/common/AppConfig;)V", "createOfferings", "", "offeringsJSON", "Lorg/json/JSONObject;", "originalDataSource", "Lcom/revenuecat/purchases/common/HTTPResponseOriginalSource;", "loadedFromDiskCache", "", "onError", "Lkotlin/Function1;", "Lcom/revenuecat/purchases/PurchasesError;", "onSuccess", "Lcom/revenuecat/purchases/common/offerings/OfferingsResultData;", "extractProductIdentifiers", "", "", "getStoreProductsById", "productIds", "onCompleted", "", "", "Lcom/revenuecat/purchases/models/StoreProduct;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class OfferingsFactory {
    private final AppConfig appConfig;
    private final BillingAbstract billing;
    private final Dispatcher dispatcher;
    private final OfferingParser offeringParser;

    public OfferingsFactory(BillingAbstract billing, OfferingParser offeringParser, Dispatcher dispatcher, AppConfig appConfig) {
        Intrinsics.checkNotNullParameter(billing, "billing");
        Intrinsics.checkNotNullParameter(offeringParser, "offeringParser");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(appConfig, "appConfig");
        this.billing = billing;
        this.offeringParser = offeringParser;
        this.dispatcher = dispatcher;
        this.appConfig = appConfig;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0224  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void createOfferings(final JSONObject offeringsJSON, final HTTPResponseOriginalSource originalDataSource, final boolean loadedFromDiskCache, Function1<? super PurchasesError, Unit> onError, final Function1<? super OfferingsResultData, Unit> onSuccess) {
        final Function1<? super PurchasesError, Unit> function1;
        final JSONException jSONException;
        final LogIntent logIntent;
        LogHandler currentLogHandler;
        String str;
        String invoke;
        Intrinsics.checkNotNullParameter(offeringsJSON, "offeringsJSON");
        Intrinsics.checkNotNullParameter(originalDataSource, "originalDataSource");
        Intrinsics.checkNotNullParameter(onError, "onError");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        try {
            final Set<String> extractProductIdentifiers = extractProductIdentifiers(offeringsJSON);
            if (extractProductIdentifiers.isEmpty()) {
                try {
                    onError.invoke(new PurchasesError(PurchasesErrorCode.ConfigurationError, OfferingStrings.INSTANCE.getConfigurationErrorNoProductsForOfferings(this.appConfig.getApiKeyValidationResult(), this.appConfig.getStore())));
                    return;
                } catch (JSONException e) {
                    jSONException = e;
                    function1 = onError;
                    logIntent = LogIntent.RC_ERROR;
                    Function0<String> function0 = new Function0<String>() { // from class: com.revenuecat.purchases.common.offerings.OfferingsFactory$createOfferings$$inlined$log$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public final String invoke() {
                            StringBuilder append = new StringBuilder().append(CollectionsKt.joinToString$default(LogIntent.this.getEmojiList(), "", null, null, 0, null, null, 62, null)).append(' ');
                            String format = String.format(OfferingStrings.JSON_EXCEPTION_ERROR, Arrays.copyOf(new Object[]{jSONException.getLocalizedMessage()}, 1));
                            Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                            return append.append(format).toString();
                        }
                    };
                    switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                    }
                    function1.invoke(new PurchasesError(PurchasesErrorCode.UnexpectedBackendResponseError, jSONException.getLocalizedMessage()));
                }
            }
            function1 = onError;
            try {
                getStoreProductsById(extractProductIdentifiers, new Function1<Map<String, ? extends List<? extends StoreProduct>>, Unit>() { // from class: com.revenuecat.purchases.common.offerings.OfferingsFactory$createOfferings$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Map<String, ? extends List<? extends StoreProduct>> map) {
                        invoke2(map);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Map<String, ? extends List<? extends StoreProduct>> productsById) {
                        OfferingParser offeringParser;
                        LogHandler currentLogHandler2;
                        String str2;
                        String invoke2;
                        Intrinsics.checkNotNullParameter(productsById, "productsById");
                        try {
                            Set<String> set = extractProductIdentifiers;
                            ArrayList arrayList = new ArrayList();
                            for (Object obj : set) {
                                if (!productsById.containsKey((String) obj)) {
                                    arrayList.add(obj);
                                }
                            }
                            Set set2 = CollectionsKt.toSet(arrayList);
                            final Set set3 = !set2.isEmpty() ? set2 : null;
                            if (set3 != null) {
                                final LogIntent logIntent2 = LogIntent.GOOGLE_WARNING;
                                Function0<String> function02 = new Function0<String>() { // from class: com.revenuecat.purchases.common.offerings.OfferingsFactory$createOfferings$1$invoke$lambda$3$$inlined$log$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    public final String invoke() {
                                        StringBuilder append = new StringBuilder().append(CollectionsKt.joinToString$default(LogIntent.this.getEmojiList(), "", null, null, 0, null, null, 62, null)).append(' ');
                                        String format = String.format(OfferingStrings.CANNOT_FIND_PRODUCT_CONFIGURATION_ERROR, Arrays.copyOf(new Object[]{CollectionsKt.joinToString$default(set3, ", ", null, null, 0, null, null, 62, null)}, 1));
                                        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                                        return append.append(format).toString();
                                    }
                                };
                                switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent2.ordinal()]) {
                                    case 1:
                                        LogLevel logLevel = LogLevel.DEBUG;
                                        currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                                            str2 = "[Purchases] - " + logLevel.name();
                                            invoke2 = function02.invoke();
                                            currentLogHandler2.d(str2, invoke2);
                                            break;
                                        }
                                        break;
                                    case 2:
                                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", function02.invoke(), null);
                                        break;
                                    case 3:
                                        LogLevel logLevel2 = LogLevel.WARN;
                                        LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                                            currentLogHandler3.w("[Purchases] - " + logLevel2.name(), function02.invoke());
                                            break;
                                        }
                                        break;
                                    case 4:
                                        LogLevel logLevel3 = LogLevel.INFO;
                                        LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                                            currentLogHandler4.i("[Purchases] - " + logLevel3.name(), function02.invoke());
                                            break;
                                        }
                                        break;
                                    case 5:
                                        LogLevel logLevel4 = LogLevel.DEBUG;
                                        currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                                            str2 = "[Purchases] - " + logLevel4.name();
                                            invoke2 = function02.invoke();
                                            currentLogHandler2.d(str2, invoke2);
                                            break;
                                        }
                                        break;
                                    case 6:
                                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", function02.invoke(), null);
                                        break;
                                    case 7:
                                        LogLevel logLevel5 = LogLevel.INFO;
                                        LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                                            currentLogHandler5.i("[Purchases] - " + logLevel5.name(), function02.invoke());
                                            break;
                                        }
                                        break;
                                    case 8:
                                        LogLevel logLevel6 = LogLevel.DEBUG;
                                        currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                                            str2 = "[Purchases] - " + logLevel6.name();
                                            invoke2 = function02.invoke();
                                            currentLogHandler2.d(str2, invoke2);
                                            break;
                                        }
                                        break;
                                    case 9:
                                        LogLevel logLevel7 = LogLevel.DEBUG;
                                        currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                                            str2 = "[Purchases] - " + logLevel7.name();
                                            invoke2 = function02.invoke();
                                            currentLogHandler2.d(str2, invoke2);
                                            break;
                                        }
                                        break;
                                    case 10:
                                        LogLevel logLevel8 = LogLevel.WARN;
                                        LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                                            currentLogHandler6.w("[Purchases] - " + logLevel8.name(), function02.invoke());
                                            break;
                                        }
                                        break;
                                    case 11:
                                        LogLevel logLevel9 = LogLevel.WARN;
                                        LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                                            currentLogHandler7.w("[Purchases] - " + logLevel9.name(), function02.invoke());
                                            break;
                                        }
                                        break;
                                    case 12:
                                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", function02.invoke(), null);
                                        break;
                                }
                            }
                            offeringParser = this.offeringParser;
                            Offerings createOfferings = offeringParser.createOfferings(offeringsJSON, productsById, originalDataSource, loadedFromDiskCache);
                            if (createOfferings.getAll().isEmpty()) {
                                function1.invoke(new PurchasesError(PurchasesErrorCode.ConfigurationError, OfferingStrings.CONFIGURATION_ERROR_PRODUCTS_NOT_FOUND));
                                return;
                            }
                            LogLevel logLevel10 = LogLevel.VERBOSE;
                            LogHandler currentLogHandler8 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                                String str3 = "[Purchases] - " + logLevel10.name();
                                String format = String.format(OfferingStrings.CREATED_OFFERINGS, Arrays.copyOf(new Object[]{Integer.valueOf(createOfferings.getAll().size())}, 1));
                                Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                                currentLogHandler8.v(str3, format);
                            }
                            onSuccess.invoke(new OfferingsResultData(createOfferings, extractProductIdentifiers, set2));
                        } catch (Exception e2) {
                            if (!(e2 instanceof JSONException ? true : e2 instanceof SerializationException)) {
                                throw e2;
                            }
                            final LogIntent logIntent3 = LogIntent.RC_ERROR;
                            Function0<String> function03 = new Function0<String>() { // from class: com.revenuecat.purchases.common.offerings.OfferingsFactory$createOfferings$1$invoke$$inlined$log$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public final String invoke() {
                                    StringBuilder append = new StringBuilder().append(CollectionsKt.joinToString$default(LogIntent.this.getEmojiList(), "", null, null, 0, null, null, 62, null)).append(' ');
                                    String format2 = String.format(OfferingStrings.JSON_EXCEPTION_ERROR, Arrays.copyOf(new Object[]{e2.getLocalizedMessage()}, 1));
                                    Intrinsics.checkNotNullExpressionValue(format2, "format(...)");
                                    return append.append(format2).toString();
                                }
                            };
                            switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent3.ordinal()]) {
                                case 1:
                                    LogLevel logLevel11 = LogLevel.DEBUG;
                                    LogHandler currentLogHandler9 = LogWrapperKt.getCurrentLogHandler();
                                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel11) <= 0) {
                                        currentLogHandler9.d("[Purchases] - " + logLevel11.name(), function03.invoke());
                                        break;
                                    }
                                    break;
                                case 2:
                                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", function03.invoke(), null);
                                    break;
                                case 3:
                                    LogLevel logLevel12 = LogLevel.WARN;
                                    LogHandler currentLogHandler10 = LogWrapperKt.getCurrentLogHandler();
                                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel12) <= 0) {
                                        currentLogHandler10.w("[Purchases] - " + logLevel12.name(), function03.invoke());
                                        break;
                                    }
                                    break;
                                case 4:
                                    LogLevel logLevel13 = LogLevel.INFO;
                                    LogHandler currentLogHandler11 = LogWrapperKt.getCurrentLogHandler();
                                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel13) <= 0) {
                                        currentLogHandler11.i("[Purchases] - " + logLevel13.name(), function03.invoke());
                                        break;
                                    }
                                    break;
                                case 5:
                                    LogLevel logLevel14 = LogLevel.DEBUG;
                                    LogHandler currentLogHandler12 = LogWrapperKt.getCurrentLogHandler();
                                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel14) <= 0) {
                                        currentLogHandler12.d("[Purchases] - " + logLevel14.name(), function03.invoke());
                                        break;
                                    }
                                    break;
                                case 6:
                                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", function03.invoke(), null);
                                    break;
                                case 7:
                                    LogLevel logLevel15 = LogLevel.INFO;
                                    LogHandler currentLogHandler13 = LogWrapperKt.getCurrentLogHandler();
                                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel15) <= 0) {
                                        currentLogHandler13.i("[Purchases] - " + logLevel15.name(), function03.invoke());
                                        break;
                                    }
                                    break;
                                case 8:
                                    LogLevel logLevel16 = LogLevel.DEBUG;
                                    LogHandler currentLogHandler14 = LogWrapperKt.getCurrentLogHandler();
                                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel16) <= 0) {
                                        currentLogHandler14.d("[Purchases] - " + logLevel16.name(), function03.invoke());
                                        break;
                                    }
                                    break;
                                case 9:
                                    LogLevel logLevel17 = LogLevel.DEBUG;
                                    LogHandler currentLogHandler15 = LogWrapperKt.getCurrentLogHandler();
                                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel17) <= 0) {
                                        currentLogHandler15.d("[Purchases] - " + logLevel17.name(), function03.invoke());
                                        break;
                                    }
                                    break;
                                case 10:
                                    LogLevel logLevel18 = LogLevel.WARN;
                                    LogHandler currentLogHandler16 = LogWrapperKt.getCurrentLogHandler();
                                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel18) <= 0) {
                                        currentLogHandler16.w("[Purchases] - " + logLevel18.name(), function03.invoke());
                                        break;
                                    }
                                    break;
                                case 11:
                                    LogLevel logLevel19 = LogLevel.WARN;
                                    LogHandler currentLogHandler17 = LogWrapperKt.getCurrentLogHandler();
                                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel19) <= 0) {
                                        currentLogHandler17.w("[Purchases] - " + logLevel19.name(), function03.invoke());
                                        break;
                                    }
                                    break;
                                case 12:
                                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", function03.invoke(), null);
                                    break;
                            }
                            function1.invoke(new PurchasesError(PurchasesErrorCode.UnexpectedBackendResponseError, e2.getLocalizedMessage()));
                        }
                    }
                }, new Function1<PurchasesError, Unit>() { // from class: com.revenuecat.purchases.common.offerings.OfferingsFactory$createOfferings$2
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
                        function1.invoke(error);
                    }
                });
            } catch (JSONException e2) {
                e = e2;
                jSONException = e;
                logIntent = LogIntent.RC_ERROR;
                Function0<String> function02 = new Function0<String>() { // from class: com.revenuecat.purchases.common.offerings.OfferingsFactory$createOfferings$$inlined$log$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        StringBuilder append = new StringBuilder().append(CollectionsKt.joinToString$default(LogIntent.this.getEmojiList(), "", null, null, 0, null, null, 62, null)).append(' ');
                        String format = String.format(OfferingStrings.JSON_EXCEPTION_ERROR, Arrays.copyOf(new Object[]{jSONException.getLocalizedMessage()}, 1));
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
                            invoke = function02.invoke();
                            currentLogHandler.d(str, invoke);
                            break;
                        }
                        break;
                    case 2:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", function02.invoke(), null);
                        break;
                    case 3:
                        LogLevel logLevel2 = LogLevel.WARN;
                        LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                            currentLogHandler2.w("[Purchases] - " + logLevel2.name(), function02.invoke());
                            break;
                        }
                        break;
                    case 4:
                        LogLevel logLevel3 = LogLevel.INFO;
                        LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                            currentLogHandler3.i("[Purchases] - " + logLevel3.name(), function02.invoke());
                            break;
                        }
                        break;
                    case 5:
                        LogLevel logLevel4 = LogLevel.DEBUG;
                        currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                            str = "[Purchases] - " + logLevel4.name();
                            invoke = function02.invoke();
                            currentLogHandler.d(str, invoke);
                            break;
                        }
                        break;
                    case 6:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", function02.invoke(), null);
                        break;
                    case 7:
                        LogLevel logLevel5 = LogLevel.INFO;
                        LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                            currentLogHandler4.i("[Purchases] - " + logLevel5.name(), function02.invoke());
                            break;
                        }
                        break;
                    case 8:
                        LogLevel logLevel6 = LogLevel.DEBUG;
                        currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                            str = "[Purchases] - " + logLevel6.name();
                            invoke = function02.invoke();
                            currentLogHandler.d(str, invoke);
                            break;
                        }
                        break;
                    case 9:
                        LogLevel logLevel7 = LogLevel.DEBUG;
                        currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                            str = "[Purchases] - " + logLevel7.name();
                            invoke = function02.invoke();
                            currentLogHandler.d(str, invoke);
                            break;
                        }
                        break;
                    case 10:
                        LogLevel logLevel8 = LogLevel.WARN;
                        LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                            currentLogHandler5.w("[Purchases] - " + logLevel8.name(), function02.invoke());
                            break;
                        }
                        break;
                    case 11:
                        LogLevel logLevel9 = LogLevel.WARN;
                        LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                            currentLogHandler6.w("[Purchases] - " + logLevel9.name(), function02.invoke());
                            break;
                        }
                        break;
                    case 12:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", function02.invoke(), null);
                        break;
                }
                function1.invoke(new PurchasesError(PurchasesErrorCode.UnexpectedBackendResponseError, jSONException.getLocalizedMessage()));
            }
        } catch (JSONException e3) {
            e = e3;
            function1 = onError;
        }
    }

    private final Set<String> extractProductIdentifiers(JSONObject offeringsJSON) {
        JSONArray jSONArray = offeringsJSON.getJSONArray("offerings");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONArray jSONArray2 = jSONArray.getJSONObject(i).getJSONArray("packages");
            int length2 = jSONArray2.length();
            for (int i2 = 0; i2 < length2; i2++) {
                String it = jSONArray2.getJSONObject(i2).optString("platform_product_identifier");
                Intrinsics.checkNotNullExpressionValue(it, "it");
                if (StringsKt.isBlank(it)) {
                    it = null;
                }
                if (it != null) {
                    linkedHashSet.add(it);
                }
            }
        }
        return linkedHashSet;
    }

    private final void getStoreProductsById(Set<String> productIds, Function1<? super Map<String, ? extends List<? extends StoreProduct>>, Unit> onCompleted, final Function1<? super PurchasesError, Unit> onError) {
        this.billing.queryProductDetailsAsync(ProductType.SUBS, productIds, new OfferingsFactory$getStoreProductsById$1(this, productIds, onCompleted, onError), new Function1<PurchasesError, Unit>() { // from class: com.revenuecat.purchases.common.offerings.OfferingsFactory$getStoreProductsById$2
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
                onError.invoke(it);
            }
        });
    }
}
