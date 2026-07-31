package com.revenuecat.purchases.google.usecase;

import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ProductDetails;
import com.android.billingclient.api.ProductDetailsResponseListener;
import com.android.billingclient.api.QueryProductDetailsParams;
import com.android.billingclient.api.QueryProductDetailsResult;
import com.android.billingclient.api.UnfetchedProduct;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.revenuecat.purchases.LogHandler;
import com.revenuecat.purchases.LogLevel;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.common.Config;
import com.revenuecat.purchases.common.DurationExtensionsKt;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker;
import com.revenuecat.purchases.google.BillingClientParamBuildersKt;
import com.revenuecat.purchases.google.StoreProductConversionsKt;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.strings.OfferingStrings;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;

/* compiled from: QueryProductDetailsUseCase.kt */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B²\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u001c\u0010\u0005\u001a\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0004\u0012\u00020\t0\u0006j\u0002`\n\u0012\u0016\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\t0\u0006j\u0002`\r\u0012#\u0010\u000e\u001a\u001f\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\t0\u0006¢\u0006\u0002\b\u0010\u0012\u0004\u0012\u00020\t0\u0006\u0012H\u0010\u0011\u001aD\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012!\u0012\u001f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\t0\u0006¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\t0\u0012j\u0002`\u0017¢\u0006\u0002\u0010\u0018J\u0010\u0010!\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020#H\u0002J\b\u0010$\u001a\u00020\tH\u0016J\u0010\u0010%\u001a\u00020\t2\u0006\u0010&\u001a\u00020\u0002H\u0016J.\u0010'\u001a\u00020\t2\u0006\u0010(\u001a\u00020\u000f2\u0006\u0010)\u001a\u00020\u001a2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u001a0+2\u0006\u0010,\u001a\u00020-H\u0002J.\u0010.\u001a\u00020\t2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u001a0+2\u0006\u0010)\u001a\u00020\u001a2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u000203H\u0002R\u0014\u0010\u0019\u001a\u00020\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR!\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\t0\u0006j\u0002`\r¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR'\u0010\u0005\u001a\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0004\u0012\u00020\t0\u0006j\u0002`\n¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001eR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R.\u0010\u000e\u001a\u001f\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\t0\u0006¢\u0006\u0002\b\u0010\u0012\u0004\u0012\u00020\t0\u0006¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001e¨\u00064"}, d2 = {"Lcom/revenuecat/purchases/google/usecase/QueryProductDetailsUseCase;", "Lcom/revenuecat/purchases/google/usecase/BillingClientUseCase;", "Lcom/android/billingclient/api/QueryProductDetailsResult;", "useCaseParams", "Lcom/revenuecat/purchases/google/usecase/QueryProductDetailsUseCaseParams;", "onReceive", "Lkotlin/Function1;", "", "Lcom/revenuecat/purchases/models/StoreProduct;", "", "Lcom/revenuecat/purchases/common/StoreProductsCallback;", "onError", "Lcom/revenuecat/purchases/PurchasesError;", "Lcom/revenuecat/purchases/PurchasesErrorCallback;", "withConnectedClient", "Lcom/android/billingclient/api/BillingClient;", "Lkotlin/ExtensionFunctionType;", "executeRequestOnUIThread", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "delayInMillis", "Lcom/revenuecat/purchases/google/usecase/ExecuteRequestOnUIThreadFunction;", "(Lcom/revenuecat/purchases/google/usecase/QueryProductDetailsUseCaseParams;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)V", "errorMessage", "", "getErrorMessage", "()Ljava/lang/String;", "getOnError", "()Lkotlin/jvm/functions/Function1;", "getOnReceive", "getWithConnectedClient", "convertUnfetchedProductStatusCodeToString", "statusCode", "", "executeAsync", "onOk", MetricTracker.Action.RECEIVED, "queryProductDetailsAsyncEnsuringOneResponse", "billingClient", "productType", "productIds", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/android/billingclient/api/ProductDetailsResponseListener;", "trackGoogleQueryProductDetailsRequestIfNeeded", "requestedProductIds", "billingResult", "Lcom/android/billingclient/api/BillingResult;", "requestStartTime", "Ljava/util/Date;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class QueryProductDetailsUseCase extends BillingClientUseCase<QueryProductDetailsResult> {
    private final Function1<PurchasesError, Unit> onError;
    private final Function1<List<? extends StoreProduct>, Unit> onReceive;
    private final QueryProductDetailsUseCaseParams useCaseParams;
    private final Function1<Function1<? super BillingClient, Unit>, Unit> withConnectedClient;

    public final Function1<List<? extends StoreProduct>, Unit> getOnReceive() {
        return this.onReceive;
    }

    public final Function1<PurchasesError, Unit> getOnError() {
        return this.onError;
    }

    public final Function1<Function1<? super BillingClient, Unit>, Unit> getWithConnectedClient() {
        return this.withConnectedClient;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public QueryProductDetailsUseCase(QueryProductDetailsUseCaseParams useCaseParams, Function1<? super List<? extends StoreProduct>, Unit> onReceive, Function1<? super PurchasesError, Unit> onError, Function1<? super Function1<? super BillingClient, Unit>, Unit> withConnectedClient, Function2<? super Long, ? super Function1<? super PurchasesError, Unit>, Unit> executeRequestOnUIThread) {
        super(useCaseParams, onError, executeRequestOnUIThread);
        Intrinsics.checkNotNullParameter(useCaseParams, "useCaseParams");
        Intrinsics.checkNotNullParameter(onReceive, "onReceive");
        Intrinsics.checkNotNullParameter(onError, "onError");
        Intrinsics.checkNotNullParameter(withConnectedClient, "withConnectedClient");
        Intrinsics.checkNotNullParameter(executeRequestOnUIThread, "executeRequestOnUIThread");
        this.useCaseParams = useCaseParams;
        this.onReceive = onReceive;
        this.onError = onError;
        this.withConnectedClient = withConnectedClient;
    }

    @Override // com.revenuecat.purchases.google.usecase.BillingClientUseCase
    public String getErrorMessage() {
        return "Error when fetching products";
    }

    @Override // com.revenuecat.purchases.google.usecase.BillingClientUseCase
    public void executeAsync() {
        LogHandler currentLogHandler;
        String str;
        String invoke;
        Set<String> productIds = this.useCaseParams.getProductIds();
        ArrayList arrayList = new ArrayList();
        for (Object obj : productIds) {
            if (((String) obj).length() > 0) {
                arrayList.add(obj);
            }
        }
        Set set = CollectionsKt.toSet(arrayList);
        if (!set.isEmpty()) {
            this.withConnectedClient.invoke(new QueryProductDetailsUseCase$executeAsync$2(this, set));
            return;
        }
        final LogIntent logIntent = LogIntent.DEBUG;
        Function0<String> function0 = new Function0<String>() { // from class: com.revenuecat.purchases.google.usecase.QueryProductDetailsUseCase$executeAsync$$inlined$log$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return CollectionsKt.joinToString$default(LogIntent.this.getEmojiList(), "", null, null, 0, null, null, 62, null) + " productId list is empty, skipping queryProductDetailsAsync call";
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
        this.onReceive.invoke(CollectionsKt.emptyList());
    }

    @Override // com.revenuecat.purchases.google.usecase.BillingClientUseCase
    public void onOk(final QueryProductDetailsResult received) {
        LogHandler currentLogHandler;
        String str;
        String invoke;
        LogHandler currentLogHandler2;
        String str2;
        String invoke2;
        LogHandler currentLogHandler3;
        String str3;
        String invoke3;
        LogHandler currentLogHandler4;
        String str4;
        String invoke4;
        Intrinsics.checkNotNullParameter(received, "received");
        final LogIntent logIntent = LogIntent.DEBUG;
        Function0<String> function0 = new Function0<String>() { // from class: com.revenuecat.purchases.google.usecase.QueryProductDetailsUseCase$onOk$$inlined$log$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                QueryProductDetailsUseCaseParams queryProductDetailsUseCaseParams;
                StringBuilder append = new StringBuilder().append(CollectionsKt.joinToString$default(LogIntent.this.getEmojiList(), "", null, null, 0, null, null, 62, null)).append(' ');
                queryProductDetailsUseCaseParams = this.useCaseParams;
                String format = String.format(OfferingStrings.FETCHING_PRODUCTS_FINISHED, Arrays.copyOf(new Object[]{CollectionsKt.joinToString$default(queryProductDetailsUseCaseParams.getProductIds(), null, null, null, 0, null, null, 63, null)}, 1));
                Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                return append.append(format).toString();
            }
        };
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    str4 = "[Purchases] - " + logLevel.name();
                    invoke4 = function0.invoke();
                    currentLogHandler4.d(str4, invoke4);
                    break;
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", function0.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler5.w("[Purchases] - " + logLevel2.name(), function0.invoke());
                    break;
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler6.i("[Purchases] - " + logLevel3.name(), function0.invoke());
                    break;
                }
                break;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    str4 = "[Purchases] - " + logLevel4.name();
                    invoke4 = function0.invoke();
                    currentLogHandler4.d(str4, invoke4);
                    break;
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", function0.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler7.i("[Purchases] - " + logLevel5.name(), function0.invoke());
                    break;
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    str4 = "[Purchases] - " + logLevel6.name();
                    invoke4 = function0.invoke();
                    currentLogHandler4.d(str4, invoke4);
                    break;
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    str4 = "[Purchases] - " + logLevel7.name();
                    invoke4 = function0.invoke();
                    currentLogHandler4.d(str4, invoke4);
                    break;
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler8 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler8.w("[Purchases] - " + logLevel8.name(), function0.invoke());
                    break;
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler9 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler9.w("[Purchases] - " + logLevel9.name(), function0.invoke());
                    break;
                }
                break;
            case 12:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", function0.invoke(), null);
                break;
        }
        final LogIntent logIntent2 = LogIntent.PURCHASE;
        Function0<String> function02 = new Function0<String>() { // from class: com.revenuecat.purchases.google.usecase.QueryProductDetailsUseCase$onOk$$inlined$log$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                StringBuilder append = new StringBuilder().append(CollectionsKt.joinToString$default(LogIntent.this.getEmojiList(), "", null, null, 0, null, null, 62, null)).append(' ');
                List<ProductDetails> productDetailsList = received.getProductDetailsList();
                Intrinsics.checkNotNullExpressionValue(productDetailsList, "received.productDetailsList");
                String format = String.format(OfferingStrings.RETRIEVED_PRODUCTS, Arrays.copyOf(new Object[]{CollectionsKt.joinToString$default(productDetailsList, null, null, null, 0, null, new Function1<ProductDetails, CharSequence>() { // from class: com.revenuecat.purchases.google.usecase.QueryProductDetailsUseCase$onOk$2$1
                    @Override // kotlin.jvm.functions.Function1
                    public final CharSequence invoke(ProductDetails productDetails) {
                        String productDetails2 = productDetails.toString();
                        Intrinsics.checkNotNullExpressionValue(productDetails2, "it.toString()");
                        return productDetails2;
                    }
                }, 31, null)}, 1));
                Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                return append.append(format).toString();
            }
        };
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent2.ordinal()]) {
            case 1:
                LogLevel logLevel10 = LogLevel.DEBUG;
                LogHandler currentLogHandler10 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler10.d("[Purchases] - " + logLevel10.name(), function02.invoke());
                    break;
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", function02.invoke(), null);
                break;
            case 3:
                LogLevel logLevel11 = LogLevel.WARN;
                LogHandler currentLogHandler11 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel11) <= 0) {
                    currentLogHandler11.w("[Purchases] - " + logLevel11.name(), function02.invoke());
                    break;
                }
                break;
            case 4:
                LogLevel logLevel12 = LogLevel.INFO;
                LogHandler currentLogHandler12 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel12) <= 0) {
                    currentLogHandler12.i("[Purchases] - " + logLevel12.name(), function02.invoke());
                    break;
                }
                break;
            case 5:
                LogLevel logLevel13 = LogLevel.DEBUG;
                LogHandler currentLogHandler13 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel13) <= 0) {
                    currentLogHandler13.d("[Purchases] - " + logLevel13.name(), function02.invoke());
                    break;
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", function02.invoke(), null);
                break;
            case 7:
                LogLevel logLevel14 = LogLevel.INFO;
                LogHandler currentLogHandler14 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel14) <= 0) {
                    currentLogHandler14.i("[Purchases] - " + logLevel14.name(), function02.invoke());
                    break;
                }
                break;
            case 8:
                LogLevel logLevel15 = LogLevel.DEBUG;
                LogHandler currentLogHandler15 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel15) <= 0) {
                    currentLogHandler15.d("[Purchases] - " + logLevel15.name(), function02.invoke());
                    break;
                }
                break;
            case 9:
                LogLevel logLevel16 = LogLevel.DEBUG;
                LogHandler currentLogHandler16 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel16) <= 0) {
                    currentLogHandler16.d("[Purchases] - " + logLevel16.name(), function02.invoke());
                    break;
                }
                break;
            case 10:
                LogLevel logLevel17 = LogLevel.WARN;
                LogHandler currentLogHandler17 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel17) <= 0) {
                    currentLogHandler17.w("[Purchases] - " + logLevel17.name(), function02.invoke());
                    break;
                }
                break;
            case 11:
                LogLevel logLevel18 = LogLevel.WARN;
                LogHandler currentLogHandler18 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel18) <= 0) {
                    currentLogHandler18.w("[Purchases] - " + logLevel18.name(), function02.invoke());
                    break;
                }
                break;
            case 12:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", function02.invoke(), null);
                break;
        }
        List<UnfetchedProduct> it = received.getUnfetchedProductList();
        Intrinsics.checkNotNullExpressionValue(it, "it");
        if (it.isEmpty()) {
            it = null;
        }
        if (it != null) {
            final LogIntent logIntent3 = LogIntent.INFO;
            Function0<String> function03 = new Function0<String>() { // from class: com.revenuecat.purchases.google.usecase.QueryProductDetailsUseCase$onOk$lambda$6$$inlined$log$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    StringBuilder append = new StringBuilder().append(CollectionsKt.joinToString$default(LogIntent.this.getEmojiList(), "", null, null, 0, null, null, 62, null)).append(' ');
                    List<UnfetchedProduct> unfetchedProductList = received.getUnfetchedProductList();
                    Intrinsics.checkNotNullExpressionValue(unfetchedProductList, "received.unfetchedProductList");
                    String format = String.format(OfferingStrings.MISSING_PRODUCT_DETAILS, Arrays.copyOf(new Object[]{CollectionsKt.joinToString$default(unfetchedProductList, null, null, null, 0, null, new Function1<UnfetchedProduct, CharSequence>() { // from class: com.revenuecat.purchases.google.usecase.QueryProductDetailsUseCase$onOk$4$1$1
                        @Override // kotlin.jvm.functions.Function1
                        public final CharSequence invoke(UnfetchedProduct unfetchedProduct) {
                            String unfetchedProduct2 = unfetchedProduct.toString();
                            Intrinsics.checkNotNullExpressionValue(unfetchedProduct2, "it.toString()");
                            return unfetchedProduct2;
                        }
                    }, 31, null)}, 1));
                    Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                    return append.append(format).toString();
                }
            };
            switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent3.ordinal()]) {
                case 1:
                    LogLevel logLevel19 = LogLevel.DEBUG;
                    currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel19) <= 0) {
                        str3 = "[Purchases] - " + logLevel19.name();
                        invoke3 = function03.invoke();
                        currentLogHandler3.d(str3, invoke3);
                        break;
                    }
                    break;
                case 2:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", function03.invoke(), null);
                    break;
                case 3:
                    LogLevel logLevel20 = LogLevel.WARN;
                    LogHandler currentLogHandler19 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel20) <= 0) {
                        currentLogHandler19.w("[Purchases] - " + logLevel20.name(), function03.invoke());
                        break;
                    }
                    break;
                case 4:
                    LogLevel logLevel21 = LogLevel.INFO;
                    LogHandler currentLogHandler20 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel21) <= 0) {
                        currentLogHandler20.i("[Purchases] - " + logLevel21.name(), function03.invoke());
                        break;
                    }
                    break;
                case 5:
                    LogLevel logLevel22 = LogLevel.DEBUG;
                    currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel22) <= 0) {
                        str3 = "[Purchases] - " + logLevel22.name();
                        invoke3 = function03.invoke();
                        currentLogHandler3.d(str3, invoke3);
                        break;
                    }
                    break;
                case 6:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", function03.invoke(), null);
                    break;
                case 7:
                    LogLevel logLevel23 = LogLevel.INFO;
                    LogHandler currentLogHandler21 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel23) <= 0) {
                        currentLogHandler21.i("[Purchases] - " + logLevel23.name(), function03.invoke());
                        break;
                    }
                    break;
                case 8:
                    LogLevel logLevel24 = LogLevel.DEBUG;
                    currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel24) <= 0) {
                        str3 = "[Purchases] - " + logLevel24.name();
                        invoke3 = function03.invoke();
                        currentLogHandler3.d(str3, invoke3);
                        break;
                    }
                    break;
                case 9:
                    LogLevel logLevel25 = LogLevel.DEBUG;
                    currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel25) <= 0) {
                        str3 = "[Purchases] - " + logLevel25.name();
                        invoke3 = function03.invoke();
                        currentLogHandler3.d(str3, invoke3);
                        break;
                    }
                    break;
                case 10:
                    LogLevel logLevel26 = LogLevel.WARN;
                    LogHandler currentLogHandler22 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel26) <= 0) {
                        currentLogHandler22.w("[Purchases] - " + logLevel26.name(), function03.invoke());
                        break;
                    }
                    break;
                case 11:
                    LogLevel logLevel27 = LogLevel.WARN;
                    LogHandler currentLogHandler23 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel27) <= 0) {
                        currentLogHandler23.w("[Purchases] - " + logLevel27.name(), function03.invoke());
                        break;
                    }
                    break;
                case 12:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", function03.invoke(), null);
                    break;
            }
            Unit unit = Unit.INSTANCE;
            Unit unit2 = Unit.INSTANCE;
        }
        List<ProductDetails> productDetailsList = received.getProductDetailsList();
        if (productDetailsList.isEmpty()) {
            productDetailsList = null;
        }
        if (productDetailsList != null) {
            for (final ProductDetails productDetails : productDetailsList) {
                final LogIntent logIntent4 = LogIntent.PURCHASE;
                Function0<String> function04 = new Function0<String>() { // from class: com.revenuecat.purchases.google.usecase.QueryProductDetailsUseCase$onOk$lambda$9$$inlined$log$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        StringBuilder append = new StringBuilder().append(CollectionsKt.joinToString$default(LogIntent.this.getEmojiList(), "", null, null, 0, null, null, 62, null)).append(' ');
                        String format = String.format(OfferingStrings.LIST_PRODUCTS, Arrays.copyOf(new Object[]{productDetails.getProductId(), productDetails}, 2));
                        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                        return append.append(format).toString();
                    }
                };
                switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent4.ordinal()]) {
                    case 1:
                        LogLevel logLevel28 = LogLevel.DEBUG;
                        currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel28) <= 0) {
                            str2 = "[Purchases] - " + logLevel28.name();
                            invoke2 = function04.invoke();
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", function04.invoke(), null);
                        continue;
                    case 3:
                        LogLevel logLevel29 = LogLevel.WARN;
                        LogHandler currentLogHandler24 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel29) <= 0) {
                            currentLogHandler24.w("[Purchases] - " + logLevel29.name(), function04.invoke());
                            break;
                        } else {
                            continue;
                        }
                    case 4:
                        LogLevel logLevel30 = LogLevel.INFO;
                        LogHandler currentLogHandler25 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel30) <= 0) {
                            currentLogHandler25.i("[Purchases] - " + logLevel30.name(), function04.invoke());
                            break;
                        } else {
                            continue;
                        }
                    case 5:
                        LogLevel logLevel31 = LogLevel.DEBUG;
                        currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel31) <= 0) {
                            str2 = "[Purchases] - " + logLevel31.name();
                            invoke2 = function04.invoke();
                            break;
                        } else {
                            break;
                        }
                    case 6:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", function04.invoke(), null);
                        continue;
                    case 7:
                        LogLevel logLevel32 = LogLevel.INFO;
                        LogHandler currentLogHandler26 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel32) <= 0) {
                            currentLogHandler26.i("[Purchases] - " + logLevel32.name(), function04.invoke());
                            break;
                        } else {
                            continue;
                        }
                    case 8:
                        LogLevel logLevel33 = LogLevel.DEBUG;
                        currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel33) <= 0) {
                            str2 = "[Purchases] - " + logLevel33.name();
                            invoke2 = function04.invoke();
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        LogLevel logLevel34 = LogLevel.DEBUG;
                        currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel34) <= 0) {
                            str2 = "[Purchases] - " + logLevel34.name();
                            invoke2 = function04.invoke();
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        LogLevel logLevel35 = LogLevel.WARN;
                        LogHandler currentLogHandler27 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel35) <= 0) {
                            currentLogHandler27.w("[Purchases] - " + logLevel35.name(), function04.invoke());
                            break;
                        } else {
                            continue;
                        }
                    case 11:
                        LogLevel logLevel36 = LogLevel.WARN;
                        LogHandler currentLogHandler28 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel36) <= 0) {
                            currentLogHandler28.w("[Purchases] - " + logLevel36.name(), function04.invoke());
                            break;
                        } else {
                            continue;
                        }
                    case 12:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", function04.invoke(), null);
                        continue;
                }
                currentLogHandler2.d(str2, invoke2);
            }
            Unit unit3 = Unit.INSTANCE;
        }
        List<UnfetchedProduct> unfetchedProductList = received.getUnfetchedProductList();
        if (unfetchedProductList.isEmpty()) {
            unfetchedProductList = null;
        }
        if (unfetchedProductList != null) {
            for (final UnfetchedProduct unfetchedProduct : unfetchedProductList) {
                final LogIntent logIntent5 = LogIntent.INFO;
                Function0<String> function05 = new Function0<String>() { // from class: com.revenuecat.purchases.google.usecase.QueryProductDetailsUseCase$onOk$lambda$12$$inlined$log$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        String convertUnfetchedProductStatusCodeToString;
                        StringBuilder append = new StringBuilder().append(CollectionsKt.joinToString$default(LogIntent.this.getEmojiList(), "", null, null, 0, null, null, 62, null)).append(' ');
                        String productId = unfetchedProduct.getProductId();
                        String productType = unfetchedProduct.getProductType();
                        convertUnfetchedProductStatusCodeToString = this.convertUnfetchedProductStatusCodeToString(unfetchedProduct.getStatusCode());
                        String format = String.format(OfferingStrings.LIST_UNFETCHED_PRODUCTS, Arrays.copyOf(new Object[]{productId, productType, convertUnfetchedProductStatusCodeToString, unfetchedProduct.getSerializedDocid()}, 4));
                        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                        return append.append(format).toString();
                    }
                };
                switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent5.ordinal()]) {
                    case 1:
                        LogLevel logLevel37 = LogLevel.DEBUG;
                        currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel37) <= 0) {
                            str = "[Purchases] - " + logLevel37.name();
                            invoke = function05.invoke();
                            currentLogHandler.d(str, invoke);
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", function05.invoke(), null);
                        break;
                    case 3:
                        LogLevel logLevel38 = LogLevel.WARN;
                        LogHandler currentLogHandler29 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel38) <= 0) {
                            currentLogHandler29.w("[Purchases] - " + logLevel38.name(), function05.invoke());
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        LogLevel logLevel39 = LogLevel.INFO;
                        LogHandler currentLogHandler30 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel39) <= 0) {
                            currentLogHandler30.i("[Purchases] - " + logLevel39.name(), function05.invoke());
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        LogLevel logLevel40 = LogLevel.DEBUG;
                        currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel40) <= 0) {
                            str = "[Purchases] - " + logLevel40.name();
                            invoke = function05.invoke();
                            currentLogHandler.d(str, invoke);
                            break;
                        } else {
                            break;
                        }
                    case 6:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", function05.invoke(), null);
                        break;
                    case 7:
                        LogLevel logLevel41 = LogLevel.INFO;
                        LogHandler currentLogHandler31 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel41) <= 0) {
                            currentLogHandler31.i("[Purchases] - " + logLevel41.name(), function05.invoke());
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        LogLevel logLevel42 = LogLevel.DEBUG;
                        currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel42) <= 0) {
                            str = "[Purchases] - " + logLevel42.name();
                            invoke = function05.invoke();
                            currentLogHandler.d(str, invoke);
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        LogLevel logLevel43 = LogLevel.DEBUG;
                        currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel43) <= 0) {
                            str = "[Purchases] - " + logLevel43.name();
                            invoke = function05.invoke();
                            currentLogHandler.d(str, invoke);
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        LogLevel logLevel44 = LogLevel.WARN;
                        LogHandler currentLogHandler32 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel44) <= 0) {
                            currentLogHandler32.w("[Purchases] - " + logLevel44.name(), function05.invoke());
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        LogLevel logLevel45 = LogLevel.WARN;
                        LogHandler currentLogHandler33 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel45) <= 0) {
                            currentLogHandler33.w("[Purchases] - " + logLevel45.name(), function05.invoke());
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", function05.invoke(), null);
                        break;
                }
            }
            Unit unit4 = Unit.INSTANCE;
        }
        List<ProductDetails> productDetailsList2 = received.getProductDetailsList();
        Intrinsics.checkNotNullExpressionValue(productDetailsList2, "received.productDetailsList");
        this.onReceive.invoke(StoreProductConversionsKt.toStoreProducts(productDetailsList2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void queryProductDetailsAsyncEnsuringOneResponse(BillingClient billingClient, final String productType, final Set<String> productIds, final ProductDetailsResponseListener listener) {
        try {
            try {
                QueryProductDetailsParams buildQueryProductDetailsParams = BillingClientParamBuildersKt.buildQueryProductDetailsParams(productType, productIds);
                final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                final Date now = this.useCaseParams.getDateProvider().getNow();
                billingClient.queryProductDetailsAsync(buildQueryProductDetailsParams, new ProductDetailsResponseListener() { // from class: com.revenuecat.purchases.google.usecase.QueryProductDetailsUseCase$$ExternalSyntheticLambda0
                    @Override // com.android.billingclient.api.ProductDetailsResponseListener
                    public final void onProductDetailsResponse(BillingResult billingResult, QueryProductDetailsResult queryProductDetailsResult) {
                        QueryProductDetailsUseCase.queryProductDetailsAsyncEnsuringOneResponse$lambda$14(atomicBoolean, this, productIds, productType, now, listener, billingResult, queryProductDetailsResult);
                    }
                });
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void queryProductDetailsAsyncEnsuringOneResponse$lambda$14(AtomicBoolean atomicBoolean, QueryProductDetailsUseCase queryProductDetailsUseCase, Set set, String str, Date date, ProductDetailsResponseListener productDetailsResponseListener, final BillingResult billingResult, QueryProductDetailsResult productDetailsList) {
        Intrinsics.checkNotNullParameter(billingResult, "billingResult");
        Intrinsics.checkNotNullParameter(productDetailsList, "productDetailsList");
        if (!atomicBoolean.getAndSet(true)) {
            queryProductDetailsUseCase.trackGoogleQueryProductDetailsRequestIfNeeded(set, str, billingResult, date);
            productDetailsResponseListener.onProductDetailsResponse(billingResult, productDetailsList);
            return;
        }
        final LogIntent logIntent = LogIntent.GOOGLE_ERROR;
        Function0<String> function0 = new Function0<String>() { // from class: com.revenuecat.purchases.google.usecase.QueryProductDetailsUseCase$queryProductDetailsAsyncEnsuringOneResponse$lambda$14$$inlined$log$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                StringBuilder append = new StringBuilder().append(CollectionsKt.joinToString$default(LogIntent.this.getEmojiList(), "", null, null, 0, null, null, 62, null)).append(' ');
                String format = String.format(OfferingStrings.EXTRA_QUERY_PRODUCT_DETAILS_RESPONSE, Arrays.copyOf(new Object[]{Integer.valueOf(billingResult.getResponseCode())}, 1));
                Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                return append.append(format).toString();
            }
        };
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    currentLogHandler.d("[Purchases] - " + logLevel.name(), function0.invoke());
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
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    currentLogHandler4.d("[Purchases] - " + logLevel4.name(), function0.invoke());
                    break;
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", function0.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler5.i("[Purchases] - " + logLevel5.name(), function0.invoke());
                    break;
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    currentLogHandler6.d("[Purchases] - " + logLevel6.name(), function0.invoke());
                    break;
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    currentLogHandler7.d("[Purchases] - " + logLevel7.name(), function0.invoke());
                    break;
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler8 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler8.w("[Purchases] - " + logLevel8.name(), function0.invoke());
                    break;
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler9 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler9.w("[Purchases] - " + logLevel9.name(), function0.invoke());
                    break;
                }
                break;
            case 12:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", function0.invoke(), null);
                break;
        }
    }

    private final void trackGoogleQueryProductDetailsRequestIfNeeded(Set<String> requestedProductIds, String productType, BillingResult billingResult, Date requestStartTime) {
        DiagnosticsTracker diagnosticsTrackerIfEnabled = this.useCaseParams.getDiagnosticsTrackerIfEnabled();
        if (diagnosticsTrackerIfEnabled != null) {
            int responseCode = billingResult.getResponseCode();
            String debugMessage = billingResult.getDebugMessage();
            Intrinsics.checkNotNullExpressionValue(debugMessage, "billingResult.debugMessage");
            diagnosticsTrackerIfEnabled.m10592trackGoogleQueryProductDetailsRequest9VgGkz4(requestedProductIds, productType, responseCode, debugMessage, DurationExtensionsKt.between(Duration.INSTANCE, requestStartTime, this.useCaseParams.getDateProvider().getNow()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String convertUnfetchedProductStatusCodeToString(int statusCode) {
        if (statusCode == 0) {
            return "UNKNOWN";
        }
        if (statusCode == 2) {
            return "INVALID_PRODUCT_ID_FORMAT";
        }
        if (statusCode == 3) {
            return "PRODUCT_NOT_FOUND";
        }
        if (statusCode == 4) {
            return "NO_ELIGIBLE_OFFER";
        }
        return "UNKNOWN_STATUS_CODE: " + statusCode;
    }
}
