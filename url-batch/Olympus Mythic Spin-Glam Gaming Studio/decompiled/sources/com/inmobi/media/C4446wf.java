package com.inmobi.media;

import com.inmobi.media.core.config.models.AdConfig;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Dispatcher;

/* renamed from: com.inmobi.media.wf, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4446wf {
    public final F9 a;

    public C4446wf(AdConfig.PingsV2Config pingsConfig) {
        Intrinsics.checkNotNullParameter(pingsConfig, "pingsConfig");
        Dispatcher dispatcher = new Dispatcher();
        dispatcher.setMaxRequests(pingsConfig.getMaxBatchSize().getHigh());
        Unit unit = Unit.INSTANCE;
        this.a = D9.a(null, dispatcher, null, new Ok(pingsConfig.getConnectTimeout(), pingsConfig.getReadTimeout(), pingsConfig.getCallTimeout()), 5);
    }
}
