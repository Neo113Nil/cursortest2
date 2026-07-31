package com.revenuecat.purchases.hybridcommon;

import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public interface OnResultList {
    void onError(ErrorContainer errorContainer);

    void onReceived(List<Map<String, ?>> list);
}
