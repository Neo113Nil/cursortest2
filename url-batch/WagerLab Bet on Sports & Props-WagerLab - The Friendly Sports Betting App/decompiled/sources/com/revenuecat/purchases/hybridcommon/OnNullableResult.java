package com.revenuecat.purchases.hybridcommon;

import java.util.Map;

/* loaded from: classes7.dex */
public interface OnNullableResult {
    void onError(ErrorContainer errorContainer);

    void onReceived(Map<String, ?> map);
}
