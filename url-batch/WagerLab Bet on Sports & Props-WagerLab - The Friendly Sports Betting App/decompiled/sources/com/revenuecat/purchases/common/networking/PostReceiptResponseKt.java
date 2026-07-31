package com.revenuecat.purchases.common.networking;

import com.revenuecat.purchases.CustomerInfo;
import com.revenuecat.purchases.common.CustomerInfoFactory;
import com.revenuecat.purchases.utils.JSONObjectExtensionsKt;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: PostReceiptResponse.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000¨\u0006\u0004"}, d2 = {"buildPostReceiptResponse", "Lcom/revenuecat/purchases/common/networking/PostReceiptResponse;", "result", "Lcom/revenuecat/purchases/common/networking/HTTPResult;", "purchases_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PostReceiptResponseKt {
    public static final PostReceiptResponse buildPostReceiptResponse(HTTPResult result) {
        Intrinsics.checkNotNullParameter(result, "result");
        CustomerInfo buildCustomerInfo = CustomerInfoFactory.INSTANCE.buildCustomerInfo(result);
        JSONObject optJSONObject = result.getBody().optJSONObject("purchased_products");
        LinkedHashMap linkedHashMap = null;
        if (optJSONObject != null) {
            Map map$default = JSONObjectExtensionsKt.toMap$default(optJSONObject, false, 1, null);
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(MapsKt.mapCapacity(map$default.size()));
            for (Map.Entry entry : map$default.entrySet()) {
                Object key = entry.getKey();
                JSONObject jSONObject = (JSONObject) entry.getValue();
                if (!jSONObject.has("should_consume")) {
                    jSONObject = null;
                }
                linkedHashMap2.put(key, new PostReceiptProductInfo(jSONObject != null ? Boolean.valueOf(jSONObject.optBoolean("should_consume")) : null));
            }
            linkedHashMap = linkedHashMap2;
        }
        return new PostReceiptResponse(buildCustomerInfo, linkedHashMap, result.getBody());
    }
}
