package com.my.target;

import android.app.UiModeManager;
import android.content.Context;
import com.my.target.common.MyTargetConfig;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes6.dex */
class n1 extends t4 {
    n1() {
    }

    public static boolean a(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 3;
    }

    Map a(MyTargetConfig myTargetConfig, Context context) {
        HashMap hashMap = new HashMap();
        if (a(context)) {
            hashMap.put("isc", "1");
        }
        return hashMap;
    }
}
