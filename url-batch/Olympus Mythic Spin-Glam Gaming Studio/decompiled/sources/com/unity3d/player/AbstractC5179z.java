package com.unity3d.player;

import android.util.Log;
import com.mobilefuse.sdk.config.ExternalUsageInfo;

/* renamed from: com.unity3d.player.z, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
abstract class AbstractC5179z {
    protected static boolean a;

    protected static void Log(int i, String str) {
        if (a) {
            return;
        }
        if (i == 6) {
            Log.e(ExternalUsageInfo.SDK_MODULE_UNITY, str);
        }
        if (i == 5) {
            Log.w(ExternalUsageInfo.SDK_MODULE_UNITY, str);
        }
    }
}
