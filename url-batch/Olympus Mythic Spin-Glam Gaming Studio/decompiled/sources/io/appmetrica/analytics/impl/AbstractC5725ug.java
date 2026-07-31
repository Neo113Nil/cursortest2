package io.appmetrica.analytics.impl;

import com.pubmatic.sdk.common.POBCommonConstants;

/* renamed from: io.appmetrica.analytics.impl.ug, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public abstract /* synthetic */ class AbstractC5725ug {
    public static /* synthetic */ String a(int i) {
        if (i == 1) {
            return "unknown";
        }
        if (i == 2) {
            return "gpl";
        }
        if (i == 3) {
            return "hms-content-provider";
        }
        throw null;
    }

    public static /* synthetic */ String b(int i) {
        return i != 1 ? i != 2 ? i != 3 ? POBCommonConstants.NULL_VALUE : "HMS" : "GP" : "UNKNOWN";
    }
}
