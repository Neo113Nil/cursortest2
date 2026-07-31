package com.revenuecat.purchases;

import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.models.StoreTransaction;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CoroutinesExtensionsCommon.kt */
@Metadata(d1 = {"\u0000B\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a2\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00050\u00012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0086@¢\u0006\u0002\u0010\b\u001a8\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\n*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00050\u00012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0086@¢\u0006\u0002\u0010\b\u001a\u0012\u0010\u000b\u001a\u00020\f*\u00020\u0003H\u0086@¢\u0006\u0002\u0010\r\u001a\u0018\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\n*\u00020\u0003H\u0086@¢\u0006\u0002\u0010\r\u001a\u001a\u0010\u000f\u001a\u00020\u0010*\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0012H\u0086@¢\u0006\u0002\u0010\u0013\u001a \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00100\n*\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0012H\u0086@¢\u0006\u0002\u0010\u0013\u001a\u0012\u0010\u0015\u001a\u00020\u0016*\u00020\u0003H\u0086@¢\u0006\u0002\u0010\r\u001a\u0018\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\n*\u00020\u0003H\u0086@¢\u0006\u0002\u0010\r\u001a\u0012\u0010\u0018\u001a\u00020\u0005*\u00020\u0003H\u0086@¢\u0006\u0002\u0010\r¨\u0006\u0019"}, d2 = {"awaitGetProducts", "", "Lcom/revenuecat/purchases/models/StoreProduct;", "Lcom/revenuecat/purchases/Purchases;", "productIds", "", "type", "Lcom/revenuecat/purchases/ProductType;", "(Lcom/revenuecat/purchases/Purchases;Ljava/util/List;Lcom/revenuecat/purchases/ProductType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitGetProductsResult", "Lkotlin/Result;", "awaitOfferings", "Lcom/revenuecat/purchases/Offerings;", "(Lcom/revenuecat/purchases/Purchases;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitOfferingsResult", "awaitPurchase", "Lcom/revenuecat/purchases/PurchaseResult;", "purchaseParams", "Lcom/revenuecat/purchases/PurchaseParams;", "(Lcom/revenuecat/purchases/Purchases;Lcom/revenuecat/purchases/PurchaseParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitPurchaseResult", "awaitRestore", "Lcom/revenuecat/purchases/CustomerInfo;", "awaitRestoreResult", "awaitStorefrontCountryCode", "purchases_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CoroutinesExtensionsCommonKt {
    public static final /* synthetic */ Object awaitOfferings(Purchases purchases, Continuation continuation) throws PurchasesException {
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(continuation));
        final SafeContinuation safeContinuation2 = safeContinuation;
        ListenerConversionsCommonKt.getOfferingsWith(purchases, new Function1<PurchasesError, Unit>() { // from class: com.revenuecat.purchases.CoroutinesExtensionsCommonKt$awaitOfferings$2$2
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
                Continuation<Offerings> continuation2 = safeContinuation2;
                Result.Companion companion = Result.INSTANCE;
                continuation2.resumeWith(Result.m12363constructorimpl(ResultKt.createFailure(new PurchasesException(it))));
            }
        }, new CoroutinesExtensionsCommonKt$awaitOfferings$2$1(safeContinuation2));
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ Object awaitOfferingsResult(Purchases purchases, Continuation continuation) {
        CoroutinesExtensionsCommonKt$awaitOfferingsResult$1 coroutinesExtensionsCommonKt$awaitOfferingsResult$1;
        int i;
        if (continuation instanceof CoroutinesExtensionsCommonKt$awaitOfferingsResult$1) {
            coroutinesExtensionsCommonKt$awaitOfferingsResult$1 = (CoroutinesExtensionsCommonKt$awaitOfferingsResult$1) continuation;
            if ((coroutinesExtensionsCommonKt$awaitOfferingsResult$1.label & Integer.MIN_VALUE) != 0) {
                coroutinesExtensionsCommonKt$awaitOfferingsResult$1.label -= Integer.MIN_VALUE;
                Object obj = coroutinesExtensionsCommonKt$awaitOfferingsResult$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = coroutinesExtensionsCommonKt$awaitOfferingsResult$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    coroutinesExtensionsCommonKt$awaitOfferingsResult$1.L$0 = purchases;
                    coroutinesExtensionsCommonKt$awaitOfferingsResult$1.label = 1;
                    CoroutinesExtensionsCommonKt$awaitOfferingsResult$1 coroutinesExtensionsCommonKt$awaitOfferingsResult$12 = coroutinesExtensionsCommonKt$awaitOfferingsResult$1;
                    SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(coroutinesExtensionsCommonKt$awaitOfferingsResult$12));
                    final SafeContinuation safeContinuation2 = safeContinuation;
                    ListenerConversionsCommonKt.getOfferingsWith(purchases, new Function1<PurchasesError, Unit>() { // from class: com.revenuecat.purchases.CoroutinesExtensionsCommonKt$awaitOfferingsResult$2$1
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
                            Continuation<Result<Offerings>> continuation2 = safeContinuation2;
                            Result.Companion companion = Result.INSTANCE;
                            Result m12362boximpl = Result.m12362boximpl(Result.m12363constructorimpl(ResultKt.createFailure(new PurchasesException(it))));
                            Result.Companion companion2 = Result.INSTANCE;
                            continuation2.resumeWith(Result.m12363constructorimpl(m12362boximpl));
                        }
                    }, new Function1<Offerings, Unit>() { // from class: com.revenuecat.purchases.CoroutinesExtensionsCommonKt$awaitOfferingsResult$2$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(Offerings offerings) {
                            invoke2(offerings);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(Offerings it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            Continuation<Result<Offerings>> continuation2 = safeContinuation2;
                            Result.Companion companion = Result.INSTANCE;
                            Result m12362boximpl = Result.m12362boximpl(Result.m12363constructorimpl(it));
                            Result.Companion companion2 = Result.INSTANCE;
                            continuation2.resumeWith(Result.m12363constructorimpl(m12362boximpl));
                        }
                    });
                    obj = safeContinuation.getOrThrow();
                    if (obj == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        DebugProbesKt.probeCoroutineSuspended(coroutinesExtensionsCommonKt$awaitOfferingsResult$12);
                    }
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return ((Result) obj).getValue();
            }
        }
        coroutinesExtensionsCommonKt$awaitOfferingsResult$1 = new CoroutinesExtensionsCommonKt$awaitOfferingsResult$1(continuation);
        Object obj2 = coroutinesExtensionsCommonKt$awaitOfferingsResult$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = coroutinesExtensionsCommonKt$awaitOfferingsResult$1.label;
        if (i != 0) {
        }
        return ((Result) obj2).getValue();
    }

    public static final /* synthetic */ Object awaitPurchase(Purchases purchases, PurchaseParams purchaseParams, Continuation continuation) throws PurchasesTransactionException {
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(continuation));
        final SafeContinuation safeContinuation2 = safeContinuation;
        purchases.purchase(purchaseParams, ListenerConversionsCommonKt.purchaseCompletedCallback(new Function2<StoreTransaction, CustomerInfo, Unit>() { // from class: com.revenuecat.purchases.CoroutinesExtensionsCommonKt$awaitPurchase$2$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(StoreTransaction storeTransaction, CustomerInfo customerInfo) {
                invoke2(storeTransaction, customerInfo);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(StoreTransaction storeTransaction, CustomerInfo customerInfo) {
                Intrinsics.checkNotNullParameter(storeTransaction, "storeTransaction");
                Intrinsics.checkNotNullParameter(customerInfo, "customerInfo");
                Continuation<PurchaseResult> continuation2 = safeContinuation2;
                Result.Companion companion = Result.INSTANCE;
                continuation2.resumeWith(Result.m12363constructorimpl(new PurchaseResult(storeTransaction, customerInfo)));
            }
        }, new Function2<PurchasesError, Boolean, Unit>() { // from class: com.revenuecat.purchases.CoroutinesExtensionsCommonKt$awaitPurchase$2$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(PurchasesError purchasesError, Boolean bool) {
                invoke(purchasesError, bool.booleanValue());
                return Unit.INSTANCE;
            }

            public final void invoke(PurchasesError purchasesError, boolean z) {
                Intrinsics.checkNotNullParameter(purchasesError, "purchasesError");
                Continuation<PurchaseResult> continuation2 = safeContinuation2;
                Result.Companion companion = Result.INSTANCE;
                continuation2.resumeWith(Result.m12363constructorimpl(ResultKt.createFailure(new PurchasesTransactionException(purchasesError, z))));
            }
        }));
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ Object awaitPurchaseResult(Purchases purchases, PurchaseParams purchaseParams, Continuation continuation) {
        CoroutinesExtensionsCommonKt$awaitPurchaseResult$1 coroutinesExtensionsCommonKt$awaitPurchaseResult$1;
        int i;
        if (continuation instanceof CoroutinesExtensionsCommonKt$awaitPurchaseResult$1) {
            coroutinesExtensionsCommonKt$awaitPurchaseResult$1 = (CoroutinesExtensionsCommonKt$awaitPurchaseResult$1) continuation;
            if ((coroutinesExtensionsCommonKt$awaitPurchaseResult$1.label & Integer.MIN_VALUE) != 0) {
                coroutinesExtensionsCommonKt$awaitPurchaseResult$1.label -= Integer.MIN_VALUE;
                Object obj = coroutinesExtensionsCommonKt$awaitPurchaseResult$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = coroutinesExtensionsCommonKt$awaitPurchaseResult$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    coroutinesExtensionsCommonKt$awaitPurchaseResult$1.L$0 = purchases;
                    coroutinesExtensionsCommonKt$awaitPurchaseResult$1.L$1 = purchaseParams;
                    coroutinesExtensionsCommonKt$awaitPurchaseResult$1.label = 1;
                    CoroutinesExtensionsCommonKt$awaitPurchaseResult$1 coroutinesExtensionsCommonKt$awaitPurchaseResult$12 = coroutinesExtensionsCommonKt$awaitPurchaseResult$1;
                    SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(coroutinesExtensionsCommonKt$awaitPurchaseResult$12));
                    final SafeContinuation safeContinuation2 = safeContinuation;
                    purchases.purchase(purchaseParams, ListenerConversionsCommonKt.purchaseCompletedCallback(new Function2<StoreTransaction, CustomerInfo, Unit>() { // from class: com.revenuecat.purchases.CoroutinesExtensionsCommonKt$awaitPurchaseResult$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(StoreTransaction storeTransaction, CustomerInfo customerInfo) {
                            invoke2(storeTransaction, customerInfo);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(StoreTransaction storeTransaction, CustomerInfo customerInfo) {
                            Intrinsics.checkNotNullParameter(storeTransaction, "storeTransaction");
                            Intrinsics.checkNotNullParameter(customerInfo, "customerInfo");
                            Continuation<Result<PurchaseResult>> continuation2 = safeContinuation2;
                            Result.Companion companion = Result.INSTANCE;
                            Result m12362boximpl = Result.m12362boximpl(Result.m12363constructorimpl(new PurchaseResult(storeTransaction, customerInfo)));
                            Result.Companion companion2 = Result.INSTANCE;
                            continuation2.resumeWith(Result.m12363constructorimpl(m12362boximpl));
                        }
                    }, new Function2<PurchasesError, Boolean, Unit>() { // from class: com.revenuecat.purchases.CoroutinesExtensionsCommonKt$awaitPurchaseResult$2$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(PurchasesError purchasesError, Boolean bool) {
                            invoke(purchasesError, bool.booleanValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(PurchasesError purchasesError, boolean z) {
                            Intrinsics.checkNotNullParameter(purchasesError, "purchasesError");
                            Continuation<Result<PurchaseResult>> continuation2 = safeContinuation2;
                            Result.Companion companion = Result.INSTANCE;
                            Result m12362boximpl = Result.m12362boximpl(Result.m12363constructorimpl(ResultKt.createFailure(new PurchasesTransactionException(purchasesError, z))));
                            Result.Companion companion2 = Result.INSTANCE;
                            continuation2.resumeWith(Result.m12363constructorimpl(m12362boximpl));
                        }
                    }));
                    obj = safeContinuation.getOrThrow();
                    if (obj == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        DebugProbesKt.probeCoroutineSuspended(coroutinesExtensionsCommonKt$awaitPurchaseResult$12);
                    }
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return ((Result) obj).getValue();
            }
        }
        coroutinesExtensionsCommonKt$awaitPurchaseResult$1 = new CoroutinesExtensionsCommonKt$awaitPurchaseResult$1(continuation);
        Object obj2 = coroutinesExtensionsCommonKt$awaitPurchaseResult$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = coroutinesExtensionsCommonKt$awaitPurchaseResult$1.label;
        if (i != 0) {
        }
        return ((Result) obj2).getValue();
    }

    public static /* synthetic */ Object awaitGetProducts$default(Purchases purchases, List list, ProductType productType, Continuation continuation, int i, Object obj) throws PurchasesTransactionException {
        if ((i & 2) != 0) {
            productType = null;
        }
        return awaitGetProducts(purchases, list, productType, continuation);
    }

    public static final /* synthetic */ Object awaitGetProducts(Purchases purchases, List list, ProductType productType, Continuation continuation) throws PurchasesTransactionException {
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(continuation));
        final SafeContinuation safeContinuation2 = safeContinuation;
        ListenerConversionsCommonKt.getProductsWith(purchases, list, productType, new Function1<PurchasesError, Unit>() { // from class: com.revenuecat.purchases.CoroutinesExtensionsCommonKt$awaitGetProducts$2$2
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
                Continuation<List<? extends StoreProduct>> continuation2 = safeContinuation2;
                Result.Companion companion = Result.INSTANCE;
                continuation2.resumeWith(Result.m12363constructorimpl(ResultKt.createFailure(new PurchasesException(it))));
            }
        }, new CoroutinesExtensionsCommonKt$awaitGetProducts$2$1(safeContinuation2));
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ Object awaitGetProductsResult(Purchases purchases, List list, ProductType productType, Continuation continuation) {
        CoroutinesExtensionsCommonKt$awaitGetProductsResult$1 coroutinesExtensionsCommonKt$awaitGetProductsResult$1;
        int i;
        if (continuation instanceof CoroutinesExtensionsCommonKt$awaitGetProductsResult$1) {
            coroutinesExtensionsCommonKt$awaitGetProductsResult$1 = (CoroutinesExtensionsCommonKt$awaitGetProductsResult$1) continuation;
            if ((coroutinesExtensionsCommonKt$awaitGetProductsResult$1.label & Integer.MIN_VALUE) != 0) {
                coroutinesExtensionsCommonKt$awaitGetProductsResult$1.label -= Integer.MIN_VALUE;
                Object obj = coroutinesExtensionsCommonKt$awaitGetProductsResult$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = coroutinesExtensionsCommonKt$awaitGetProductsResult$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    coroutinesExtensionsCommonKt$awaitGetProductsResult$1.L$0 = purchases;
                    coroutinesExtensionsCommonKt$awaitGetProductsResult$1.L$1 = list;
                    coroutinesExtensionsCommonKt$awaitGetProductsResult$1.L$2 = productType;
                    coroutinesExtensionsCommonKt$awaitGetProductsResult$1.label = 1;
                    CoroutinesExtensionsCommonKt$awaitGetProductsResult$1 coroutinesExtensionsCommonKt$awaitGetProductsResult$12 = coroutinesExtensionsCommonKt$awaitGetProductsResult$1;
                    SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(coroutinesExtensionsCommonKt$awaitGetProductsResult$12));
                    final SafeContinuation safeContinuation2 = safeContinuation;
                    ListenerConversionsCommonKt.getProductsWith(purchases, list, productType, new Function1<PurchasesError, Unit>() { // from class: com.revenuecat.purchases.CoroutinesExtensionsCommonKt$awaitGetProductsResult$2$1
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
                            Continuation<Result<? extends List<? extends StoreProduct>>> continuation2 = safeContinuation2;
                            Result.Companion companion = Result.INSTANCE;
                            Result m12362boximpl = Result.m12362boximpl(Result.m12363constructorimpl(ResultKt.createFailure(new PurchasesException(it))));
                            Result.Companion companion2 = Result.INSTANCE;
                            continuation2.resumeWith(Result.m12363constructorimpl(m12362boximpl));
                        }
                    }, new Function1<List<? extends StoreProduct>, Unit>() { // from class: com.revenuecat.purchases.CoroutinesExtensionsCommonKt$awaitGetProductsResult$2$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(List<? extends StoreProduct> list2) {
                            invoke2(list2);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(List<? extends StoreProduct> storeProducts) {
                            Intrinsics.checkNotNullParameter(storeProducts, "storeProducts");
                            Continuation<Result<? extends List<? extends StoreProduct>>> continuation2 = safeContinuation2;
                            Result.Companion companion = Result.INSTANCE;
                            Result m12362boximpl = Result.m12362boximpl(Result.m12363constructorimpl(storeProducts));
                            Result.Companion companion2 = Result.INSTANCE;
                            continuation2.resumeWith(Result.m12363constructorimpl(m12362boximpl));
                        }
                    });
                    obj = safeContinuation.getOrThrow();
                    if (obj == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        DebugProbesKt.probeCoroutineSuspended(coroutinesExtensionsCommonKt$awaitGetProductsResult$12);
                    }
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return ((Result) obj).getValue();
            }
        }
        coroutinesExtensionsCommonKt$awaitGetProductsResult$1 = new CoroutinesExtensionsCommonKt$awaitGetProductsResult$1(continuation);
        Object obj2 = coroutinesExtensionsCommonKt$awaitGetProductsResult$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = coroutinesExtensionsCommonKt$awaitGetProductsResult$1.label;
        if (i != 0) {
        }
        return ((Result) obj2).getValue();
    }

    public static /* synthetic */ Object awaitGetProductsResult$default(Purchases purchases, List list, ProductType productType, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            productType = null;
        }
        return awaitGetProductsResult(purchases, list, productType, continuation);
    }

    public static final /* synthetic */ Object awaitRestore(Purchases purchases, Continuation continuation) throws PurchasesTransactionException {
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(continuation));
        final SafeContinuation safeContinuation2 = safeContinuation;
        ListenerConversionsCommonKt.restorePurchasesWith(purchases, new Function1<PurchasesError, Unit>() { // from class: com.revenuecat.purchases.CoroutinesExtensionsCommonKt$awaitRestore$2$1
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
                Continuation<CustomerInfo> continuation2 = safeContinuation2;
                Result.Companion companion = Result.INSTANCE;
                continuation2.resumeWith(Result.m12363constructorimpl(ResultKt.createFailure(new PurchasesException(it))));
            }
        }, new Function1<CustomerInfo, Unit>() { // from class: com.revenuecat.purchases.CoroutinesExtensionsCommonKt$awaitRestore$2$2
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
                Intrinsics.checkNotNullParameter(it, "it");
                Continuation<CustomerInfo> continuation2 = safeContinuation2;
                Result.Companion companion = Result.INSTANCE;
                continuation2.resumeWith(Result.m12363constructorimpl(it));
            }
        });
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ Object awaitRestoreResult(Purchases purchases, Continuation continuation) {
        CoroutinesExtensionsCommonKt$awaitRestoreResult$1 coroutinesExtensionsCommonKt$awaitRestoreResult$1;
        int i;
        if (continuation instanceof CoroutinesExtensionsCommonKt$awaitRestoreResult$1) {
            coroutinesExtensionsCommonKt$awaitRestoreResult$1 = (CoroutinesExtensionsCommonKt$awaitRestoreResult$1) continuation;
            if ((coroutinesExtensionsCommonKt$awaitRestoreResult$1.label & Integer.MIN_VALUE) != 0) {
                coroutinesExtensionsCommonKt$awaitRestoreResult$1.label -= Integer.MIN_VALUE;
                Object obj = coroutinesExtensionsCommonKt$awaitRestoreResult$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = coroutinesExtensionsCommonKt$awaitRestoreResult$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    coroutinesExtensionsCommonKt$awaitRestoreResult$1.L$0 = purchases;
                    coroutinesExtensionsCommonKt$awaitRestoreResult$1.label = 1;
                    CoroutinesExtensionsCommonKt$awaitRestoreResult$1 coroutinesExtensionsCommonKt$awaitRestoreResult$12 = coroutinesExtensionsCommonKt$awaitRestoreResult$1;
                    SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(coroutinesExtensionsCommonKt$awaitRestoreResult$12));
                    final SafeContinuation safeContinuation2 = safeContinuation;
                    ListenerConversionsCommonKt.restorePurchasesWith(purchases, new Function1<PurchasesError, Unit>() { // from class: com.revenuecat.purchases.CoroutinesExtensionsCommonKt$awaitRestoreResult$2$1
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
                            Continuation<Result<CustomerInfo>> continuation2 = safeContinuation2;
                            Result.Companion companion = Result.INSTANCE;
                            Result m12362boximpl = Result.m12362boximpl(Result.m12363constructorimpl(ResultKt.createFailure(new PurchasesException(it))));
                            Result.Companion companion2 = Result.INSTANCE;
                            continuation2.resumeWith(Result.m12363constructorimpl(m12362boximpl));
                        }
                    }, new Function1<CustomerInfo, Unit>() { // from class: com.revenuecat.purchases.CoroutinesExtensionsCommonKt$awaitRestoreResult$2$2
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
                        public final void invoke2(CustomerInfo customerInfo) {
                            Intrinsics.checkNotNullParameter(customerInfo, "customerInfo");
                            Continuation<Result<CustomerInfo>> continuation2 = safeContinuation2;
                            Result.Companion companion = Result.INSTANCE;
                            Result m12362boximpl = Result.m12362boximpl(Result.m12363constructorimpl(customerInfo));
                            Result.Companion companion2 = Result.INSTANCE;
                            continuation2.resumeWith(Result.m12363constructorimpl(m12362boximpl));
                        }
                    });
                    obj = safeContinuation.getOrThrow();
                    if (obj == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        DebugProbesKt.probeCoroutineSuspended(coroutinesExtensionsCommonKt$awaitRestoreResult$12);
                    }
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return ((Result) obj).getValue();
            }
        }
        coroutinesExtensionsCommonKt$awaitRestoreResult$1 = new CoroutinesExtensionsCommonKt$awaitRestoreResult$1(continuation);
        Object obj2 = coroutinesExtensionsCommonKt$awaitRestoreResult$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = coroutinesExtensionsCommonKt$awaitRestoreResult$1.label;
        if (i != 0) {
        }
        return ((Result) obj2).getValue();
    }

    public static final Object awaitStorefrontCountryCode(Purchases purchases, Continuation<? super String> continuation) {
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(continuation));
        final SafeContinuation safeContinuation2 = safeContinuation;
        ListenerConversionsCommonKt.getStorefrontCountryCodeWith(purchases, new Function1<PurchasesError, Unit>() { // from class: com.revenuecat.purchases.CoroutinesExtensionsCommonKt$awaitStorefrontCountryCode$2$2
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
                Continuation<String> continuation2 = safeContinuation2;
                Result.Companion companion = Result.INSTANCE;
                continuation2.resumeWith(Result.m12363constructorimpl(ResultKt.createFailure(new PurchasesException(it))));
            }
        }, new CoroutinesExtensionsCommonKt$awaitStorefrontCountryCode$2$1(safeContinuation2));
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }
}
