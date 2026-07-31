package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.PreloadInfo;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class Of {
    public final Kf a;

    public Of(PreloadInfo preloadInfo, PublicLogger publicLogger, boolean z) {
        if (preloadInfo != null) {
            if (StringUtils.isNullOrEmpty(preloadInfo.getTrackingId())) {
                publicLogger.error("Required field \"PreloadInfo.trackingId\" is empty!\nThis preload info will be skipped.", new Object[0]);
            } else {
                this.a = new Kf(preloadInfo.getTrackingId(), new JSONObject(preloadInfo.getAdditionalParams()), true, z, EnumC5483l8.d);
            }
        }
    }
}
