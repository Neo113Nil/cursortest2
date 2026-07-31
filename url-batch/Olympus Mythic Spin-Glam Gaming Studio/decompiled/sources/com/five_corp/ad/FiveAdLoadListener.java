package com.five_corp.ad;

import androidx.annotation.NonNull;

@Deprecated
/* loaded from: classes6.dex */
public interface FiveAdLoadListener {
    void onFiveAdLoad(@NonNull FiveAdInterface fiveAdInterface);

    void onFiveAdLoadError(@NonNull FiveAdInterface fiveAdInterface, @NonNull FiveAdErrorCode fiveAdErrorCode);
}
