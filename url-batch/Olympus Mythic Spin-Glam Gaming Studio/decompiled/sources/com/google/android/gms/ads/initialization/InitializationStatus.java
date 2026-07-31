package com.google.android.gms.ads.initialization;

import androidx.annotation.NonNull;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes10.dex */
public interface InitializationStatus {
    @NonNull
    Map<String, AdapterStatus> getAdapterStatusMap();
}
