package com.pubmatic.sdk.openwrap.core.nativead;

import androidx.annotation.Nullable;

/* loaded from: classes14.dex */
public enum POBNativeEventType {
    IMPRESSION(1),
    VIEWABLE_MRC50(2),
    VIEWABLE_MRC100(3),
    VIEWABLE_VIDEO_MRC50(4),
    OMID(555);

    final int a;

    POBNativeEventType(int i) {
        this.a = i;
    }

    @Nullable
    public static POBNativeEventType getEventType(int i) {
        if (i == 555) {
            return OMID;
        }
        if (i == 1) {
            return IMPRESSION;
        }
        if (i == 2) {
            return VIEWABLE_MRC50;
        }
        if (i == 3) {
            return VIEWABLE_MRC100;
        }
        if (i != 4) {
            return null;
        }
        return VIEWABLE_VIDEO_MRC50;
    }

    public int getEventTypeValue() {
        return this.a;
    }
}
