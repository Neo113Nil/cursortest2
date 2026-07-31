package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.StartupParamsCallback;
import java.util.HashMap;

/* renamed from: io.appmetrica.analytics.impl.cm, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C5265cm extends HashMap {
    public C5265cm() {
        put(EnumC5213am.UNKNOWN, StartupParamsCallback.Reason.UNKNOWN);
        put(EnumC5213am.NETWORK, StartupParamsCallback.Reason.NETWORK);
        put(EnumC5213am.PARSE, StartupParamsCallback.Reason.INVALID_RESPONSE);
    }
}
