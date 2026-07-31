package com.pubmatic.sdk.nativead.request;

import androidx.annotation.NonNull;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeRequestEventTracker;
import com.pubmatic.sdk.openwrap.core.nativead.POBNativeEventTrackingMethod;
import com.pubmatic.sdk.openwrap.core.nativead.POBNativeEventType;
import java.util.List;

/* loaded from: classes6.dex */
public class POBNativeRequestEventTracker extends POBCoreNativeRequestEventTracker {
    public POBNativeRequestEventTracker(@NonNull POBNativeEventType pOBNativeEventType, @NonNull List<POBNativeEventTrackingMethod> list) {
        super(pOBNativeEventType, list);
    }
}
