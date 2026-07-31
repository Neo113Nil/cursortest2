package com.google.unity.ads.nativead;

import android.graphics.Typeface;
import android.util.Log;
import com.google.unity.ads.PluginUtils;

/* loaded from: classes15.dex */
public enum UnityNativeTemplateFontStyle {
    NORMAL,
    BOLD,
    ITALIC,
    MONOSPACE;

    public static UnityNativeTemplateFontStyle fromIntValue(int i) {
        if (i >= 0 && i < values().length) {
            return values()[i];
        }
        Log.w(PluginUtils.LOGTAG, "Invalid index for NativeTemplateFontStyle: " + i);
        return NORMAL;
    }

    Typeface getTypeface() {
        int ordinal = ordinal();
        if (ordinal == 0) {
            return Typeface.DEFAULT;
        }
        if (ordinal == 1) {
            return Typeface.DEFAULT_BOLD;
        }
        if (ordinal == 2) {
            return Typeface.defaultFromStyle(2);
        }
        if (ordinal == 3) {
            return Typeface.MONOSPACE;
        }
        return Typeface.DEFAULT;
    }
}
