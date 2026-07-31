package com.five_corp.ad;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes6.dex */
public interface FiveAdInterface {
    void enableSound(boolean z);

    @NonNull
    CreativeType getCreativeType();

    @Nullable
    String getFiveAdTag();

    @NonNull
    String getSlotId();

    boolean isSoundEnabled();

    void setFiveAdTag(@NonNull String str);

    @Deprecated
    void setLoadListener(@NonNull FiveAdLoadListener fiveAdLoadListener);
}
