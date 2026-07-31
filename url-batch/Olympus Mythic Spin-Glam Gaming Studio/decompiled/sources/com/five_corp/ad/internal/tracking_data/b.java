package com.five_corp.ad.internal.tracking_data;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;

/* loaded from: classes3.dex */
public final class b {
    public final Context a;

    public b(Context context) {
        this.a = context;
    }

    public final a a() {
        try {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(this.a);
            return new a(advertisingIdInfo.getId(), advertisingIdInfo.isLimitAdTrackingEnabled());
        } catch (Throwable unused) {
            return new a(null, true);
        }
    }
}
