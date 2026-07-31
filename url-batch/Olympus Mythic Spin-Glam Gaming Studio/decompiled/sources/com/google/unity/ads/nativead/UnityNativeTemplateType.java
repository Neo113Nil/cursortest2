package com.google.unity.ads.nativead;

import android.util.Log;
import com.google.unity.ads.PluginUtils;
import com.google.unity.ads.R;

/* loaded from: classes4.dex */
public enum UnityNativeTemplateType {
    SMALL(R.layout.small_template_view_layout),
    MEDIUM(R.layout.medium_template_view_layout);

    private final int resourceId;

    UnityNativeTemplateType(int i) {
        this.resourceId = i;
    }

    public int resourceId() {
        return this.resourceId;
    }

    public static UnityNativeTemplateType fromIntValue(int i) {
        if (i >= 0 && i < values().length) {
            return values()[i];
        }
        Log.w(PluginUtils.LOGTAG, "Invalid template type index: " + i);
        return MEDIUM;
    }
}
