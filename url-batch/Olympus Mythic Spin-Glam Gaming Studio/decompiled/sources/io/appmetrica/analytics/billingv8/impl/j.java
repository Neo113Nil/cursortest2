package io.appmetrica.analytics.billingv8.impl;

import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ProductDetails;
import com.android.billingclient.api.Purchase;
import com.applovin.impl.sdk.utils.JsonUtils;
import io.appmetrica.analytics.billinginterface.internal.ProductInfo;
import io.appmetrica.analytics.billinginterface.internal.ProductType;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes15.dex */
public final class j extends SafeRunnable {
    public final /* synthetic */ k a;
    public final /* synthetic */ BillingResult b;
    public final /* synthetic */ List c;

    public j(k kVar, BillingResult billingResult, List list) {
        this.a = kVar;
        this.b = billingResult;
        this.c = list;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x019e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x007f A[SYNTHETIC] */
    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void runSafety() {
        ProductInfo productInfo;
        String originalJson;
        String str;
        String originalJson2;
        k kVar = this.a;
        BillingResult billingResult = this.b;
        List<Purchase> list = this.c;
        kVar.getClass();
        if (billingResult.getResponseCode() != 0) {
            kVar.f.onUpdateFinished();
        } else {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Purchase purchase : list) {
                Iterator<String> it = purchase.getProducts().iterator();
                while (it.hasNext()) {
                    linkedHashMap.put(it.next(), purchase);
                }
            }
            List<Purchase> list2 = kVar.c;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Purchase purchase2 : list2) {
                Iterator<String> it2 = purchase2.getProducts().iterator();
                while (it2.hasNext()) {
                    linkedHashMap2.put(it2.next(), purchase2);
                }
            }
            List<ProductDetails> list3 = kVar.d;
            ArrayList arrayList = new ArrayList();
            for (ProductDetails productDetails : list3) {
                Purchase purchase3 = (Purchase) linkedHashMap2.get(productDetails.getProductId());
                if (purchase3 != null) {
                    Purchase purchase4 = (Purchase) linkedHashMap.get(productDetails.getProductId());
                    String productType = productDetails.getProductType();
                    int hashCode = productType.hashCode();
                    if (hashCode != 3541555) {
                        if (hashCode == 100343516 && productType.equals("inapp")) {
                            String productType2 = productDetails.getProductType();
                            ProductType productType3 = Intrinsics.areEqual(productType2, "inapp") ? ProductType.INAPP : Intrinsics.areEqual(productType2, "subs") ? ProductType.SUBS : ProductType.UNKNOWN;
                            String productId = productDetails.getProductId();
                            int quantity = purchase3.getQuantity();
                            ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails = productDetails.getOneTimePurchaseOfferDetails();
                            long priceAmountMicros = oneTimePurchaseOfferDetails != null ? oneTimePurchaseOfferDetails.getPriceAmountMicros() : 0L;
                            ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails2 = productDetails.getOneTimePurchaseOfferDetails();
                            if (oneTimePurchaseOfferDetails2 == null || (str = oneTimePurchaseOfferDetails2.getPriceCurrencyCode()) == null) {
                                str = "";
                            }
                            productInfo = new ProductInfo(productType3, productId, quantity, priceAmountMicros, str, 0L, null, 1, null, purchase3.getSignature(), purchase3.getPurchaseToken(), purchase3.getPurchaseTime(), purchase4 != null ? purchase4.isAutoRenewing() : false, (purchase4 == null || (originalJson2 = purchase4.getOriginalJson()) == null) ? JsonUtils.EMPTY_JSON : originalJson2);
                        }
                    } else if (productType.equals("subs")) {
                        String productType4 = productDetails.getProductType();
                        productInfo = new ProductInfo(Intrinsics.areEqual(productType4, "inapp") ? ProductType.INAPP : Intrinsics.areEqual(productType4, "subs") ? ProductType.SUBS : ProductType.UNKNOWN, productDetails.getProductId(), purchase3.getQuantity(), 0L, "", 0L, null, 1, null, purchase3.getSignature(), purchase3.getPurchaseToken(), purchase3.getPurchaseTime(), purchase4 != null ? purchase4.isAutoRenewing() : false, (purchase4 == null || (originalJson = purchase4.getOriginalJson()) == null) ? JsonUtils.EMPTY_JSON : originalJson);
                    }
                    if (productInfo == null) {
                        arrayList.add(productInfo);
                    }
                }
                productInfo = null;
                if (productInfo == null) {
                }
            }
            kVar.a.getBillingInfoSender().sendInfo(arrayList);
            kVar.b.mo4828invoke();
            kVar.f.onUpdateFinished();
        }
        k kVar2 = this.a;
        kVar2.e.a(kVar2);
    }
}
