package com.revenuecat.purchases.google.usecase;

import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ProductDetailsResponseListener;
import com.android.billingclient.api.QueryProductDetailsResult;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.google.ProductTypeConversionsKt;
import com.revenuecat.purchases.google.QueryProductDetailsParamsBuilderException;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* compiled from: QueryProductDetailsUseCase.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/android/billingclient/api/BillingClient;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
final class QueryProductDetailsUseCase$executeAsync$2 extends Lambda implements Function1<BillingClient, Unit> {
    final /* synthetic */ Set<String> $nonEmptyProductIds;
    final /* synthetic */ QueryProductDetailsUseCase this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    QueryProductDetailsUseCase$executeAsync$2(QueryProductDetailsUseCase queryProductDetailsUseCase, Set<String> set) {
        super(1);
        this.this$0 = queryProductDetailsUseCase;
        this.$nonEmptyProductIds = set;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(BillingClient billingClient) {
        invoke2(billingClient);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(BillingClient invoke) {
        QueryProductDetailsUseCaseParams queryProductDetailsUseCaseParams;
        Intrinsics.checkNotNullParameter(invoke, "$this$invoke");
        queryProductDetailsUseCaseParams = this.this$0.useCaseParams;
        String googleProductType = ProductTypeConversionsKt.toGoogleProductType(queryProductDetailsUseCaseParams.getProductType());
        if (googleProductType == null) {
            googleProductType = "inapp";
        }
        try {
            final QueryProductDetailsUseCase queryProductDetailsUseCase = this.this$0;
            queryProductDetailsUseCase.queryProductDetailsAsyncEnsuringOneResponse(invoke, googleProductType, this.$nonEmptyProductIds, new ProductDetailsResponseListener() { // from class: com.revenuecat.purchases.google.usecase.QueryProductDetailsUseCase$executeAsync$2$$ExternalSyntheticLambda0
                @Override // com.android.billingclient.api.ProductDetailsResponseListener
                public final void onProductDetailsResponse(BillingResult billingResult, QueryProductDetailsResult queryProductDetailsResult) {
                    QueryProductDetailsUseCase$executeAsync$2.invoke$processResult(QueryProductDetailsUseCase.this, billingResult, queryProductDetailsResult);
                }
            });
        } catch (QueryProductDetailsParamsBuilderException e) {
            Function1<PurchasesError, Unit> onError = this.this$0.getOnError();
            PurchasesErrorCode purchasesErrorCode = PurchasesErrorCode.StoreProblemError;
            StringBuilder append = new StringBuilder().append(e.getMessage()).append(": ");
            Throwable cause = e.getCause();
            onError.invoke(new PurchasesError(purchasesErrorCode, append.append(cause != null ? cause.getMessage() : null).toString()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ void invoke$processResult(QueryProductDetailsUseCase queryProductDetailsUseCase, BillingResult billingResult, QueryProductDetailsResult queryProductDetailsResult) {
        BillingClientUseCase.processResult$default(queryProductDetailsUseCase, billingResult, queryProductDetailsResult, null, null, 12, null);
    }
}
