package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import com.mobilefuse.sdk.MobileFuseDefaults;
import io.appmetrica.analytics.coreapi.internal.backport.Provider;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfo;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfoResult;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;

/* loaded from: classes15.dex */
public final class K implements H {
    public final H a;

    public K(@NonNull H h) {
        this.a = h;
    }

    @Override // io.appmetrica.analytics.impl.H
    @NonNull
    public final AdTrackingInfoResult a(@NonNull Context context) {
        return a(new I(this, context));
    }

    @Override // io.appmetrica.analytics.impl.H
    @NonNull
    public final AdTrackingInfoResult a(@NonNull Context context, @NonNull Ui ui) {
        return a(new J(this, context, ui));
    }

    public static AdTrackingInfoResult a(Provider provider) {
        AdTrackingInfoResult adTrackingInfoResult = (AdTrackingInfoResult) provider.get();
        AdTrackingInfo adTrackingInfo = adTrackingInfoResult.mAdTrackingInfo;
        return (adTrackingInfo == null || !MobileFuseDefaults.ADVERTISING_ID_ZEROS.equals(adTrackingInfo.advId)) ? adTrackingInfoResult : new AdTrackingInfoResult(null, IdentifierStatus.INVALID_ADV_ID, "AdvId is invalid: 00000000-0000-0000-0000-000000000000");
    }
}
