package com.revenuecat.purchases.google.usecase;

import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchasesResponseListener;
import com.android.billingclient.api.QueryPurchasesParams;
import com.revenuecat.purchases.LogHandler;
import com.revenuecat.purchases.LogLevel;
import com.revenuecat.purchases.common.Config;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.PurchaseExtensionsKt;
import com.revenuecat.purchases.google.BillingClientParamBuildersKt;
import com.revenuecat.purchases.google.ProductTypeConversionsKt;
import com.revenuecat.purchases.google.StoreTransactionConversionsKt;
import com.revenuecat.purchases.strings.PurchaseStrings;
import com.revenuecat.purchases.strings.RestoreStrings;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* compiled from: QueryPurchaseHistoryUseCase.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/android/billingclient/api/BillingClient;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
final class QueryPurchaseHistoryUseCase$executeAsync$1 extends Lambda implements Function1<BillingClient, Unit> {
    final /* synthetic */ QueryPurchaseHistoryUseCase this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    QueryPurchaseHistoryUseCase$executeAsync$1(QueryPurchaseHistoryUseCase queryPurchaseHistoryUseCase) {
        super(1);
        this.this$0 = queryPurchaseHistoryUseCase;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(BillingClient billingClient) {
        invoke2(billingClient);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(BillingClient invoke) {
        QueryPurchaseHistoryUseCaseParams queryPurchaseHistoryUseCaseParams;
        QueryPurchaseHistoryUseCaseParams queryPurchaseHistoryUseCaseParams2;
        Unit unit;
        Intrinsics.checkNotNullParameter(invoke, "$this$invoke");
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        queryPurchaseHistoryUseCaseParams = this.this$0.useCaseParams;
        final Date now = queryPurchaseHistoryUseCaseParams.getDateProvider().getNow();
        queryPurchaseHistoryUseCaseParams2 = this.this$0.useCaseParams;
        QueryPurchasesParams buildQueryPurchasesParams = BillingClientParamBuildersKt.buildQueryPurchasesParams(queryPurchaseHistoryUseCaseParams2.getProductType());
        if (buildQueryPurchasesParams != null) {
            final QueryPurchaseHistoryUseCase queryPurchaseHistoryUseCase = this.this$0;
            invoke.queryPurchasesAsync(buildQueryPurchasesParams, new PurchasesResponseListener() { // from class: com.revenuecat.purchases.google.usecase.QueryPurchaseHistoryUseCase$executeAsync$1$$ExternalSyntheticLambda0
                @Override // com.android.billingclient.api.PurchasesResponseListener
                public final void onQueryPurchasesResponse(BillingResult billingResult, List list) {
                    QueryPurchaseHistoryUseCase$executeAsync$1.invoke$lambda$7$lambda$6(atomicBoolean, queryPurchaseHistoryUseCase, now, billingResult, list);
                }
            });
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            QueryPurchaseHistoryUseCase queryPurchaseHistoryUseCase2 = this.this$0;
            LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
            String format = String.format(PurchaseStrings.INVALID_PRODUCT_TYPE, Arrays.copyOf(new Object[]{"queryPurchaseHistory"}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "format(...)");
            currentLogHandler.e("[Purchases] - ERROR", format, null);
            BillingResult build = BillingResult.newBuilder().setResponseCode(5).build();
            Intrinsics.checkNotNullExpressionValue(build, "newBuilder()\n           …                 .build()");
            BillingClientUseCase.processResult$default(queryPurchaseHistoryUseCase2, build, null, null, null, 12, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$7$lambda$6(AtomicBoolean atomicBoolean, QueryPurchaseHistoryUseCase queryPurchaseHistoryUseCase, Date date, final BillingResult billingResult, List activePurchases) {
        QueryPurchaseHistoryUseCaseParams queryPurchaseHistoryUseCaseParams;
        Unit unit;
        QueryPurchaseHistoryUseCaseParams queryPurchaseHistoryUseCaseParams2;
        LogHandler currentLogHandler;
        String str;
        String invoke;
        Intrinsics.checkNotNullParameter(billingResult, "billingResult");
        Intrinsics.checkNotNullParameter(activePurchases, "activePurchases");
        if (atomicBoolean.getAndSet(true)) {
            final LogIntent logIntent = LogIntent.GOOGLE_ERROR;
            Function0<String> function0 = new Function0<String>() { // from class: com.revenuecat.purchases.google.usecase.QueryPurchaseHistoryUseCase$executeAsync$1$invoke$lambda$7$lambda$6$$inlined$log$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    StringBuilder append = new StringBuilder().append(CollectionsKt.joinToString$default(LogIntent.this.getEmojiList(), "", null, null, 0, null, null, 62, null)).append(' ');
                    String format = String.format(RestoreStrings.EXTRA_QUERY_PURCHASE_HISTORY_RESPONSE, Arrays.copyOf(new Object[]{Integer.valueOf(billingResult.getResponseCode())}, 1));
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
            return;
        }
        queryPurchaseHistoryUseCaseParams = queryPurchaseHistoryUseCase.useCaseParams;
        queryPurchaseHistoryUseCase.trackGoogleQueryPurchaseHistoryRequestIfNeeded(queryPurchaseHistoryUseCaseParams.getProductType(), billingResult, date);
        List<Purchase> list = !activePurchases.isEmpty() ? activePurchases : null;
        if (list != null) {
            for (final Purchase purchase : list) {
                final LogIntent logIntent2 = LogIntent.RC_PURCHASE_SUCCESS;
                Function0<String> function02 = new Function0<String>() { // from class: com.revenuecat.purchases.google.usecase.QueryPurchaseHistoryUseCase$executeAsync$1$invoke$lambda$7$lambda$6$lambda$3$$inlined$log$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        StringBuilder append = new StringBuilder().append(CollectionsKt.joinToString$default(LogIntent.this.getEmojiList(), "", null, null, 0, null, null, 62, null)).append(' ');
                        Purchase it = purchase;
                        Intrinsics.checkNotNullExpressionValue(it, "it");
                        String format = String.format(RestoreStrings.PURCHASE_HISTORY_RETRIEVED, Arrays.copyOf(new Object[]{PurchaseExtensionsKt.toHumanReadableDescription(purchase)}, 1));
                        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                        return append.append(format).toString();
                    }
                };
                switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent2.ordinal()]) {
                    case 1:
                        LogLevel logLevel10 = LogLevel.DEBUG;
                        currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                            str = "[Purchases] - " + logLevel10.name();
                            invoke = function02.invoke();
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", function02.invoke(), null);
                        continue;
                    case 3:
                        LogLevel logLevel11 = LogLevel.WARN;
                        LogHandler currentLogHandler11 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel11) <= 0) {
                            currentLogHandler11.w("[Purchases] - " + logLevel11.name(), function02.invoke());
                            break;
                        } else {
                            continue;
                        }
                    case 4:
                        LogLevel logLevel12 = LogLevel.INFO;
                        LogHandler currentLogHandler12 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel12) <= 0) {
                            currentLogHandler12.i("[Purchases] - " + logLevel12.name(), function02.invoke());
                            break;
                        } else {
                            continue;
                        }
                    case 5:
                        LogLevel logLevel13 = LogLevel.DEBUG;
                        currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel13) <= 0) {
                            str = "[Purchases] - " + logLevel13.name();
                            invoke = function02.invoke();
                            break;
                        } else {
                            break;
                        }
                    case 6:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", function02.invoke(), null);
                        continue;
                    case 7:
                        LogLevel logLevel14 = LogLevel.INFO;
                        LogHandler currentLogHandler13 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel14) <= 0) {
                            currentLogHandler13.i("[Purchases] - " + logLevel14.name(), function02.invoke());
                            break;
                        } else {
                            continue;
                        }
                    case 8:
                        LogLevel logLevel15 = LogLevel.DEBUG;
                        currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel15) <= 0) {
                            str = "[Purchases] - " + logLevel15.name();
                            invoke = function02.invoke();
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        LogLevel logLevel16 = LogLevel.DEBUG;
                        currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel16) <= 0) {
                            str = "[Purchases] - " + logLevel16.name();
                            invoke = function02.invoke();
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        LogLevel logLevel17 = LogLevel.WARN;
                        LogHandler currentLogHandler14 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel17) <= 0) {
                            currentLogHandler14.w("[Purchases] - " + logLevel17.name(), function02.invoke());
                            break;
                        } else {
                            continue;
                        }
                    case 11:
                        LogLevel logLevel18 = LogLevel.WARN;
                        LogHandler currentLogHandler15 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel18) <= 0) {
                            currentLogHandler15.w("[Purchases] - " + logLevel18.name(), function02.invoke());
                            break;
                        } else {
                            continue;
                        }
                    case 12:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", function02.invoke(), null);
                        continue;
                }
                currentLogHandler.d(str, invoke);
            }
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            final LogIntent logIntent3 = LogIntent.DEBUG;
            Function0<String> function03 = new Function0<String>() { // from class: com.revenuecat.purchases.google.usecase.QueryPurchaseHistoryUseCase$executeAsync$1$invoke$lambda$7$lambda$6$$inlined$log$2
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return CollectionsKt.joinToString$default(LogIntent.this.getEmojiList(), "", null, null, 0, null, null, 62, null) + " Purchase history is empty.";
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
        }
        QueryPurchaseHistoryUseCase queryPurchaseHistoryUseCase2 = queryPurchaseHistoryUseCase;
        List<Purchase> list2 = activePurchases;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        for (Purchase it : list2) {
            Intrinsics.checkNotNullExpressionValue(it, "it");
            queryPurchaseHistoryUseCaseParams2 = queryPurchaseHistoryUseCase.useCaseParams;
            arrayList.add(StoreTransactionConversionsKt.toStoreTransaction$default(it, ProductTypeConversionsKt.toRevenueCatProductType(queryPurchaseHistoryUseCaseParams2.getProductType()), null, null, null, null, 30, null));
        }
        BillingClientUseCase.processResult$default(queryPurchaseHistoryUseCase2, billingResult, arrayList, null, null, 12, null);
    }
}
