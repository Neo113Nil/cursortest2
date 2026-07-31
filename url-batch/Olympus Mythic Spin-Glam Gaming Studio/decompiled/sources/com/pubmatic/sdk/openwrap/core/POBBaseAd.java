package com.pubmatic.sdk.openwrap.core;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresPermission;
import java.util.UUID;

/* loaded from: classes15.dex */
public interface POBBaseAd {
    void addExtraInfo(@NonNull String str, @NonNull Object obj);

    void destroy();

    @Nullable
    POBRequest getAdRequest();

    @Nullable
    POBImpression getImpression();

    default String getImpressionId() {
        return UUID.randomUUID().toString();
    }

    @RequiresPermission
    void loadAd();
}
