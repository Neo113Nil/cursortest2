package com.revenuecat.purchases;

import com.revenuecat.purchases.common.BillingAbstract;
import com.revenuecat.purchases.common.Config;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.models.GoogleStoreProduct;
import com.revenuecat.purchases.models.PurchaseState;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.models.StoreTransaction;
import com.revenuecat.purchases.models.SubscriptionOption;
import com.revenuecat.purchases.models.SubscriptionOptions;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PostTransactionWithProductDetailsHelper.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006Jt\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\"\b\u0002\u0010\u0012\u001a\u001c\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\b\u0018\u00010\u0013j\u0004\u0018\u0001`\u00152\"\b\u0002\u0010\u0016\u001a\u001c\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\b\u0018\u00010\u0013j\u0004\u0018\u0001`\u0018R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/revenuecat/purchases/PostTransactionWithProductDetailsHelper;", "", "billing", "Lcom/revenuecat/purchases/common/BillingAbstract;", "postReceiptHelper", "Lcom/revenuecat/purchases/PostReceiptHelper;", "(Lcom/revenuecat/purchases/common/BillingAbstract;Lcom/revenuecat/purchases/PostReceiptHelper;)V", "postTransactions", "", "transactions", "", "Lcom/revenuecat/purchases/models/StoreTransaction;", "allowSharingPlayStoreAccount", "", "appUserID", "", "initiationSource", "Lcom/revenuecat/purchases/PostReceiptInitiationSource;", "transactionPostSuccess", "Lkotlin/Function2;", "Lcom/revenuecat/purchases/CustomerInfo;", "Lcom/revenuecat/purchases/SuccessfulPurchaseCallback;", "transactionPostError", "Lcom/revenuecat/purchases/PurchasesError;", "Lcom/revenuecat/purchases/ErrorPurchaseCallback;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PostTransactionWithProductDetailsHelper {
    private final BillingAbstract billing;
    private final PostReceiptHelper postReceiptHelper;

    public PostTransactionWithProductDetailsHelper(BillingAbstract billing, PostReceiptHelper postReceiptHelper) {
        Intrinsics.checkNotNullParameter(billing, "billing");
        Intrinsics.checkNotNullParameter(postReceiptHelper, "postReceiptHelper");
        this.billing = billing;
        this.postReceiptHelper = postReceiptHelper;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void postTransactions$default(PostTransactionWithProductDetailsHelper postTransactionWithProductDetailsHelper, List list, boolean z, String str, PostReceiptInitiationSource postReceiptInitiationSource, Function2 function2, Function2 function22, int i, Object obj) {
        if ((i & 16) != 0) {
            function2 = null;
        }
        if ((i & 32) != 0) {
            function22 = null;
        }
        postTransactionWithProductDetailsHelper.postTransactions(list, z, str, postReceiptInitiationSource, function2, function22);
    }

    public final void postTransactions(List<StoreTransaction> transactions, final boolean allowSharingPlayStoreAccount, final String appUserID, final PostReceiptInitiationSource initiationSource, final Function2<? super StoreTransaction, ? super CustomerInfo, Unit> transactionPostSuccess, final Function2<? super StoreTransaction, ? super PurchasesError, Unit> transactionPostError) {
        Intrinsics.checkNotNullParameter(transactions, "transactions");
        Intrinsics.checkNotNullParameter(appUserID, "appUserID");
        final PostReceiptInitiationSource initiationSource2 = initiationSource;
        Intrinsics.checkNotNullParameter(initiationSource2, "initiationSource");
        for (final StoreTransaction storeTransaction : transactions) {
            if (storeTransaction.getPurchaseState() != PurchaseState.PENDING) {
                this.billing.queryProductDetailsAsync(storeTransaction.getType(), CollectionsKt.toSet(storeTransaction.getProductIds()), new Function1<List<? extends StoreProduct>, Unit>() { // from class: com.revenuecat.purchases.PostTransactionWithProductDetailsHelper$postTransactions$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(List<? extends StoreProduct> list) {
                        invoke2(list);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(List<? extends StoreProduct> storeProducts) {
                        Object obj;
                        StoreProduct storeProduct;
                        PostReceiptHelper postReceiptHelper;
                        ArrayList emptyList;
                        Object obj2;
                        Intrinsics.checkNotNullParameter(storeProducts, "storeProducts");
                        Map<String, ? extends SubscriptionOption> map = null;
                        if (StoreTransaction.this.getType() == ProductType.SUBS && StoreTransaction.this.getMarketplace() == null) {
                            StoreTransaction storeTransaction2 = StoreTransaction.this;
                            Iterator<T> it = storeProducts.iterator();
                            loop0: while (true) {
                                if (!it.hasNext()) {
                                    obj2 = null;
                                    break;
                                }
                                obj2 = it.next();
                                SubscriptionOptions subscriptionOptions = ((StoreProduct) obj2).getSubscriptionOptions();
                                if (subscriptionOptions != null) {
                                    SubscriptionOptions subscriptionOptions2 = subscriptionOptions;
                                    if (!(subscriptionOptions2 instanceof Collection) || !subscriptionOptions2.isEmpty()) {
                                        Iterator<SubscriptionOption> it2 = subscriptionOptions2.iterator();
                                        while (it2.hasNext()) {
                                            if (Intrinsics.areEqual(it2.next().getId(), storeTransaction2.getSubscriptionOptionId())) {
                                                break loop0;
                                            }
                                        }
                                    }
                                }
                            }
                            storeProduct = (StoreProduct) obj2;
                        } else {
                            StoreTransaction storeTransaction3 = StoreTransaction.this;
                            Iterator<T> it3 = storeProducts.iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    obj = it3.next();
                                    if (Intrinsics.areEqual(((StoreProduct) obj).getId(), CollectionsKt.firstOrNull((List) storeTransaction3.getProductIds()))) {
                                        break;
                                    }
                                } else {
                                    obj = null;
                                    break;
                                }
                            }
                            storeProduct = (StoreProduct) obj;
                        }
                        StoreProduct storeProduct2 = storeProduct;
                        Map subscriptionOptionIdForProductIDs = StoreTransaction.this.getSubscriptionOptionIdForProductIDs();
                        if (subscriptionOptionIdForProductIDs != null) {
                            ArrayList<GoogleStoreProduct> arrayList = new ArrayList();
                            for (Object obj3 : storeProducts) {
                                if (obj3 instanceof GoogleStoreProduct) {
                                    arrayList.add(obj3);
                                }
                            }
                            ArrayList arrayList2 = new ArrayList();
                            for (GoogleStoreProduct googleStoreProduct : arrayList) {
                                SubscriptionOptions subscriptionOptions3 = googleStoreProduct.getSubscriptionOptions();
                                if (subscriptionOptions3 == null) {
                                    emptyList = CollectionsKt.emptyList();
                                } else {
                                    SubscriptionOptions subscriptionOptions4 = subscriptionOptions3;
                                    ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(subscriptionOptions4, 10));
                                    for (SubscriptionOption subscriptionOption : subscriptionOptions4) {
                                        arrayList3.add(TuplesKt.to(googleStoreProduct.getProductId() + '_' + subscriptionOption.getId(), subscriptionOption));
                                    }
                                    emptyList = arrayList3;
                                }
                                CollectionsKt.addAll(arrayList2, emptyList);
                            }
                            Map map2 = MapsKt.toMap(arrayList2);
                            Map createMapBuilder = MapsKt.createMapBuilder();
                            for (Map.Entry entry : subscriptionOptionIdForProductIDs.entrySet()) {
                                String str = (String) entry.getKey();
                                SubscriptionOption subscriptionOption2 = (SubscriptionOption) map2.get(str + '_' + ((String) entry.getValue()));
                                if (subscriptionOption2 != null) {
                                    createMapBuilder.put(str, subscriptionOption2);
                                }
                            }
                            map = MapsKt.build(createMapBuilder);
                        }
                        Map<String, ? extends SubscriptionOption> map3 = map;
                        LogLevel logLevel = LogLevel.DEBUG;
                        LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                            currentLogHandler.d("[Purchases] - " + logLevel.name(), "Store product found for transaction: " + storeProduct2);
                        }
                        postReceiptHelper = this.postReceiptHelper;
                        postReceiptHelper.postTransactionAndConsumeIfNeeded(StoreTransaction.this, storeProduct2, map3, allowSharingPlayStoreAccount, appUserID, initiationSource2, transactionPostSuccess, transactionPostError);
                    }
                }, new Function1<PurchasesError, Unit>() { // from class: com.revenuecat.purchases.PostTransactionWithProductDetailsHelper$postTransactions$1$2
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
                        PostReceiptHelper postReceiptHelper;
                        Intrinsics.checkNotNullParameter(it, "it");
                        postReceiptHelper = PostTransactionWithProductDetailsHelper.this.postReceiptHelper;
                        postReceiptHelper.postTransactionAndConsumeIfNeeded(storeTransaction, null, null, allowSharingPlayStoreAccount, appUserID, initiationSource, transactionPostSuccess, transactionPostError);
                    }
                });
            } else if (transactionPostError != null) {
                PurchasesError purchasesError = new PurchasesError(PurchasesErrorCode.PaymentPendingError, null, 2, null);
                LogUtilsKt.errorLog(purchasesError);
                Unit unit = Unit.INSTANCE;
                transactionPostError.invoke(storeTransaction, purchasesError);
            }
            initiationSource2 = initiationSource;
        }
    }
}
