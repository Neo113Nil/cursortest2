package com.ogury.sdk.internal;

import com.ogury.ad.common.OnAdsInitListener;
import com.ogury.core.OguryError;
import com.ogury.core.internal.IntegrationLogger;
import com.ogury.core.internal.LogTag;
import com.ogury.core.internal.SourceTag;
import com.ogury.sdk.Ogury;

/* compiled from: r8-map-id-d03ac3f9e324b82242ed8abc94e35cfcf54ca1b7c6df624f1ee1a6ff838e9b84 */
/* loaded from: classes5.dex */
public final class a implements OnAdsInitListener {
    @Override // com.ogury.ad.common.OnAdsInitListener
    public final void onFailed(OguryError oguryError) {
        Ogury.access$handleFailedSdkStart(Ogury.INSTANCE, 1001);
    }

    @Override // com.ogury.ad.common.OnAdsInitListener
    public final void onInit() {
        IntegrationLogger.d(LogTag.PUBLISHER, SourceTag.WRAPPER, "Ogury SDK is started");
        Ogury.access$sendOnStart(Ogury.INSTANCE);
    }
}
