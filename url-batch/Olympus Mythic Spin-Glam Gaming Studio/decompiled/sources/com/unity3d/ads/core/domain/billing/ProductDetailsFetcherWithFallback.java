package com.unity3d.ads.core.domain.billing;

import com.unity3d.ads.core.domain.billing.ProductDetailsResult;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ProductDetailsFetcherWithFallback.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0096@¢\u0006\u0002\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/unity3d/ads/core/domain/billing/ProductDetailsFetcherWithFallback;", "Lcom/unity3d/ads/core/domain/billing/ProductDetailsFetcher;", "primaryFetcher", "secondaryFetcher", "<init>", "(Lcom/unity3d/ads/core/domain/billing/ProductDetailsFetcher;Lcom/unity3d/ads/core/domain/billing/ProductDetailsFetcher;)V", "fetchProductDetails", "Lcom/unity3d/ads/core/domain/billing/ProductDetailsResult;", InAppPurchaseMetaData.KEY_PRODUCT_ID, "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ProductDetailsFetcherWithFallback implements ProductDetailsFetcher {

    @NotNull
    private final ProductDetailsFetcher primaryFetcher;

    @NotNull
    private final ProductDetailsFetcher secondaryFetcher;

    public ProductDetailsFetcherWithFallback(@NotNull ProductDetailsFetcher primaryFetcher, @NotNull ProductDetailsFetcher secondaryFetcher) {
        Intrinsics.checkNotNullParameter(primaryFetcher, "primaryFetcher");
        Intrinsics.checkNotNullParameter(secondaryFetcher, "secondaryFetcher");
        this.primaryFetcher = primaryFetcher;
        this.secondaryFetcher = secondaryFetcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.unity3d.ads.core.domain.billing.ProductDetailsFetcher
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object fetchProductDetails(@NotNull String str, @NotNull Continuation continuation) {
        ProductDetailsFetcherWithFallback$fetchProductDetails$1 productDetailsFetcherWithFallback$fetchProductDetails$1;
        int i;
        ProductDetailsResult productDetailsResult;
        ProductDetailsResult productDetailsResult2;
        if (continuation instanceof ProductDetailsFetcherWithFallback$fetchProductDetails$1) {
            productDetailsFetcherWithFallback$fetchProductDetails$1 = (ProductDetailsFetcherWithFallback$fetchProductDetails$1) continuation;
            int i2 = productDetailsFetcherWithFallback$fetchProductDetails$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                productDetailsFetcherWithFallback$fetchProductDetails$1.label = i2 - Integer.MIN_VALUE;
                Object obj = productDetailsFetcherWithFallback$fetchProductDetails$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = productDetailsFetcherWithFallback$fetchProductDetails$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    ProductDetailsFetcher productDetailsFetcher = this.primaryFetcher;
                    productDetailsFetcherWithFallback$fetchProductDetails$1.L$0 = str;
                    productDetailsFetcherWithFallback$fetchProductDetails$1.label = 1;
                    obj = productDetailsFetcher.fetchProductDetails(str, productDetailsFetcherWithFallback$fetchProductDetails$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            ResultKt.throwOnFailure(obj);
                        }
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        productDetailsResult2 = (ProductDetailsResult) productDetailsFetcherWithFallback$fetchProductDetails$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        ProductDetailsResult productDetailsResult3 = (ProductDetailsResult) obj;
                        return !(productDetailsResult3 instanceof ProductDetailsResult.Success) ? productDetailsResult3 : productDetailsResult2;
                    }
                    str = (String) productDetailsFetcherWithFallback$fetchProductDetails$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                productDetailsResult = (ProductDetailsResult) obj;
                if (!(productDetailsResult instanceof ProductDetailsResult.Success)) {
                    return productDetailsResult;
                }
                if (productDetailsResult instanceof ProductDetailsResult.NotFound) {
                    ProductDetailsFetcher productDetailsFetcher2 = this.secondaryFetcher;
                    productDetailsFetcherWithFallback$fetchProductDetails$1.L$0 = null;
                    productDetailsFetcherWithFallback$fetchProductDetails$1.label = 2;
                    obj = productDetailsFetcher2.fetchProductDetails(str, productDetailsFetcherWithFallback$fetchProductDetails$1);
                    return obj == coroutine_suspended ? coroutine_suspended : obj;
                }
                if (!(productDetailsResult instanceof ProductDetailsResult.Failure)) {
                    throw new NoWhenBranchMatchedException();
                }
                ProductDetailsFetcher productDetailsFetcher3 = this.secondaryFetcher;
                productDetailsFetcherWithFallback$fetchProductDetails$1.L$0 = productDetailsResult;
                productDetailsFetcherWithFallback$fetchProductDetails$1.label = 3;
                Object fetchProductDetails = productDetailsFetcher3.fetchProductDetails(str, productDetailsFetcherWithFallback$fetchProductDetails$1);
                if (fetchProductDetails == coroutine_suspended) {
                    return coroutine_suspended;
                }
                obj = fetchProductDetails;
                productDetailsResult2 = productDetailsResult;
                ProductDetailsResult productDetailsResult32 = (ProductDetailsResult) obj;
                if (!(productDetailsResult32 instanceof ProductDetailsResult.Success)) {
                }
            }
        }
        productDetailsFetcherWithFallback$fetchProductDetails$1 = new ProductDetailsFetcherWithFallback$fetchProductDetails$1(this, continuation);
        Object obj2 = productDetailsFetcherWithFallback$fetchProductDetails$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = productDetailsFetcherWithFallback$fetchProductDetails$1.label;
        if (i != 0) {
        }
        productDetailsResult = (ProductDetailsResult) obj2;
        if (!(productDetailsResult instanceof ProductDetailsResult.Success)) {
        }
    }
}
