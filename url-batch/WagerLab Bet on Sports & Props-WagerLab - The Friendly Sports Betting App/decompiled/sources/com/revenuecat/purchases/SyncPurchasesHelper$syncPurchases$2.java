package com.revenuecat.purchases;

import com.revenuecat.purchases.common.Config;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.ReceiptInfo;
import com.revenuecat.purchases.models.StoreTransaction;
import com.revenuecat.purchases.strings.PurchaseStrings;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* compiled from: SyncPurchasesHelper.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "allPurchases", "", "Lcom/revenuecat/purchases/models/StoreTransaction;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
final class SyncPurchasesHelper$syncPurchases$2 extends Lambda implements Function1<List<? extends StoreTransaction>, Unit> {
    final /* synthetic */ boolean $appInBackground;
    final /* synthetic */ String $appUserID;
    final /* synthetic */ Function1<PurchasesError, Unit> $handleError;
    final /* synthetic */ Function1<CustomerInfo, Unit> $handleSuccess;
    final /* synthetic */ boolean $isRestore;
    final /* synthetic */ SyncPurchasesHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    SyncPurchasesHelper$syncPurchases$2(SyncPurchasesHelper syncPurchasesHelper, String str, boolean z, boolean z2, Function1<? super CustomerInfo, Unit> function1, Function1<? super PurchasesError, Unit> function12) {
        super(1);
        this.this$0 = syncPurchasesHelper;
        this.$appUserID = str;
        this.$appInBackground = z;
        this.$isRestore = z2;
        this.$handleSuccess = function1;
        this.$handleError = function12;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(List<? extends StoreTransaction> list) {
        invoke2((List<StoreTransaction>) list);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(List<StoreTransaction> allPurchases) {
        PostReceiptHelper postReceiptHelper;
        Intrinsics.checkNotNullParameter(allPurchases, "allPurchases");
        if (allPurchases.isEmpty()) {
            this.this$0.retrieveCustomerInfo(this.$appUserID, this.$appInBackground, this.$isRestore, this.$handleSuccess, this.$handleError);
            return;
        }
        final StoreTransaction storeTransaction = (StoreTransaction) CollectionsKt.last((List) allPurchases);
        final ArrayList arrayList = new ArrayList();
        final SyncPurchasesHelper syncPurchasesHelper = this.this$0;
        final boolean z = this.$isRestore;
        final String str = this.$appUserID;
        final boolean z2 = this.$appInBackground;
        final Function1<CustomerInfo, Unit> function1 = this.$handleSuccess;
        final Function1<PurchasesError, Unit> function12 = this.$handleError;
        for (final StoreTransaction storeTransaction2 : allPurchases) {
            ReceiptInfo receiptInfo = new ReceiptInfo(storeTransaction2.getProductIds(), null, null, null, null, null, null, null, 254, null);
            postReceiptHelper = syncPurchasesHelper.postReceiptHelper;
            String purchaseToken = storeTransaction2.getPurchaseToken();
            String storeUserID = storeTransaction2.getStoreUserID();
            String marketplace = storeTransaction2.getMarketplace();
            PostReceiptInitiationSource postReceiptInitiationSource = PostReceiptInitiationSource.RESTORE;
            final ArrayList arrayList2 = arrayList;
            arrayList = arrayList2;
            Function1<CustomerInfo, Unit> function13 = new Function1<CustomerInfo, Unit>() { // from class: com.revenuecat.purchases.SyncPurchasesHelper$syncPurchases$2$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(CustomerInfo customerInfo) {
                    invoke2(customerInfo);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(CustomerInfo it) {
                    LogHandler currentLogHandler;
                    String str2;
                    String invoke;
                    Intrinsics.checkNotNullParameter(it, "it");
                    final LogIntent logIntent = LogIntent.PURCHASE;
                    final StoreTransaction storeTransaction3 = StoreTransaction.this;
                    Function0<String> function0 = new Function0<String>() { // from class: com.revenuecat.purchases.SyncPurchasesHelper$syncPurchases$2$1$1$invoke$$inlined$log$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public final String invoke() {
                            StringBuilder append = new StringBuilder().append(CollectionsKt.joinToString$default(LogIntent.this.getEmojiList(), "", null, null, 0, null, null, 62, null)).append(' ');
                            String format = String.format(PurchaseStrings.PURCHASE_SYNCED, Arrays.copyOf(new Object[]{storeTransaction3}, 1));
                            Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                            return append.append(format).toString();
                        }
                    };
                    switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                        case 1:
                            LogLevel logLevel = LogLevel.DEBUG;
                            currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                                str2 = "[Purchases] - " + logLevel.name();
                                invoke = function0.invoke();
                                currentLogHandler.d(str2, invoke);
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
                                str2 = "[Purchases] - " + logLevel4.name();
                                invoke = function0.invoke();
                                currentLogHandler.d(str2, invoke);
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
                                str2 = "[Purchases] - " + logLevel6.name();
                                invoke = function0.invoke();
                                currentLogHandler.d(str2, invoke);
                                break;
                            }
                            break;
                        case 9:
                            LogLevel logLevel7 = LogLevel.DEBUG;
                            currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                                str2 = "[Purchases] - " + logLevel7.name();
                                invoke = function0.invoke();
                                currentLogHandler.d(str2, invoke);
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
                    SyncPurchasesHelper$syncPurchases$2.invoke$handleLastPurchase(arrayList2, syncPurchasesHelper, str, z2, z, function1, function12, StoreTransaction.this, storeTransaction);
                }
            };
            final StoreTransaction storeTransaction3 = storeTransaction;
            Function1<PurchasesError, Unit> function14 = new Function1<PurchasesError, Unit>() { // from class: com.revenuecat.purchases.SyncPurchasesHelper$syncPurchases$2$1$2
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
                public final void invoke2(final PurchasesError error) {
                    LogHandler currentLogHandler;
                    String str2;
                    String invoke;
                    Intrinsics.checkNotNullParameter(error, "error");
                    final LogIntent logIntent = LogIntent.RC_ERROR;
                    final StoreTransaction storeTransaction4 = storeTransaction2;
                    Function0<String> function0 = new Function0<String>() { // from class: com.revenuecat.purchases.SyncPurchasesHelper$syncPurchases$2$1$2$invoke$$inlined$log$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public final String invoke() {
                            StringBuilder append = new StringBuilder().append(CollectionsKt.joinToString$default(LogIntent.this.getEmojiList(), "", null, null, 0, null, null, 62, null)).append(' ');
                            String format = String.format(PurchaseStrings.SYNCING_PURCHASES_ERROR_DETAILS, Arrays.copyOf(new Object[]{storeTransaction4, error}, 2));
                            Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                            return append.append(format).toString();
                        }
                    };
                    switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                        case 1:
                            LogLevel logLevel = LogLevel.DEBUG;
                            currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                                str2 = "[Purchases] - " + logLevel.name();
                                invoke = function0.invoke();
                                currentLogHandler.d(str2, invoke);
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
                                str2 = "[Purchases] - " + logLevel4.name();
                                invoke = function0.invoke();
                                currentLogHandler.d(str2, invoke);
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
                                str2 = "[Purchases] - " + logLevel6.name();
                                invoke = function0.invoke();
                                currentLogHandler.d(str2, invoke);
                                break;
                            }
                            break;
                        case 9:
                            LogLevel logLevel7 = LogLevel.DEBUG;
                            currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                                str2 = "[Purchases] - " + logLevel7.name();
                                invoke = function0.invoke();
                                currentLogHandler.d(str2, invoke);
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
                    arrayList.add(error);
                    SyncPurchasesHelper$syncPurchases$2.invoke$handleLastPurchase(arrayList, syncPurchasesHelper, str, z2, z, function1, function12, storeTransaction2, storeTransaction3);
                }
            };
            storeTransaction = storeTransaction3;
            Function1<PurchasesError, Unit> function15 = function12;
            boolean z3 = z;
            String str2 = str;
            postReceiptHelper.postTokenWithoutConsuming(purchaseToken, storeUserID, receiptInfo, z3, str2, marketplace, postReceiptInitiationSource, function13, function14);
            z2 = z2;
            function1 = function1;
            z = z3;
            str = str2;
            function12 = function15;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$handleLastPurchase(List<PurchasesError> list, SyncPurchasesHelper syncPurchasesHelper, String str, boolean z, boolean z2, Function1<? super CustomerInfo, Unit> function1, Function1<? super PurchasesError, Unit> function12, StoreTransaction storeTransaction, StoreTransaction storeTransaction2) {
        if (Intrinsics.areEqual(storeTransaction, storeTransaction2)) {
            if (list.isEmpty()) {
                LogLevel logLevel = LogLevel.DEBUG;
                LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    currentLogHandler.d("[Purchases] - " + logLevel.name(), PurchaseStrings.SYNCED_PURCHASES_SUCCESSFULLY);
                }
                syncPurchasesHelper.retrieveCustomerInfo(str, z, z2, function1, function12);
                return;
            }
            LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
            String format = String.format(PurchaseStrings.SYNCING_PURCHASES_ERROR, Arrays.copyOf(new Object[]{list}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "format(...)");
            currentLogHandler2.e("[Purchases] - ERROR", format, null);
            function12.invoke(CollectionsKt.first((List) list));
        }
    }
}
