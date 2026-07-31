package com.google.unity.ads;

import android.app.Activity;
import android.content.res.Resources;
import android.util.Log;
import com.unity3d.services.UnityAdsConstants;

/* loaded from: classes4.dex */
public class PluginUtils {
    public static final String LOGTAG = "AdsUnity";
    public static final int POSITION_BOTTOM = 1;
    public static final int POSITION_BOTTOM_LEFT = 4;
    public static final int POSITION_BOTTOM_RIGHT = 5;
    public static final int POSITION_CENTER = 6;
    public static final int POSITION_CUSTOM = -1;
    public static final int POSITION_TOP = 0;
    public static final int POSITION_TOP_LEFT = 2;
    public static final int POSITION_TOP_RIGHT = 3;

    public static String getErrorReason(int i) {
        if (i == 0) {
            return UnityAdsConstants.Messages.MSG_INTERNAL_ERROR;
        }
        if (i == 1) {
            return "Invalid request";
        }
        if (i == 2) {
            return "Network error";
        }
        if (i == 3) {
            return "No fill";
        }
        Log.w(LOGTAG, String.format("Unexpected error code: %s", Integer.valueOf(i)));
        return "";
    }

    public static int getLayoutGravityForPositionCode(int i) {
        switch (i) {
            case -1:
            case 2:
                return 51;
            case 0:
                return 49;
            case 1:
                return 81;
            case 3:
                return 53;
            case 4:
                return 83;
            case 5:
                return 85;
            case 6:
                return 17;
            default:
                throw new IllegalArgumentException("Attempted to position ad with invalid ad position.");
        }
    }

    public static float convertPixelsToDp(float f) {
        float f2 = Resources.getSystem().getDisplayMetrics().density;
        if (f2 != 0.0f) {
            return f / f2;
        }
        throw new IllegalStateException("Pixels to DP conversion failed. Display metrics density is zero.");
    }

    public static float convertDpToPixel(float f) {
        return f * Resources.getSystem().getDisplayMetrics().density;
    }

    public static float getDeviceDensity(Activity activity) {
        if (activity == null) {
            throw new IllegalStateException("Activity is null.");
        }
        return activity.getResources().getDisplayMetrics().density;
    }
}
