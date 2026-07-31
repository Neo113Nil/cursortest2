package com.pubmatic.sdk.openwrap.banner;

import android.view.View;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.POBError;
import com.pubmatic.sdk.openwrap.core.POBAdEventListener;

@MainThread
/* loaded from: classes13.dex */
public interface POBBannerEventListener extends POBAdEventListener {
    void onAdExecutionComplete();

    void onAdServerWin(@NonNull View view);

    void onFailed(@NonNull POBError pOBError);

    void onOpenWrapPartnerWin(@Nullable String str);
}
