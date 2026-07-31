package com.pgl.ssdk;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.view.accessibility.AccessibilityManager;
import com.applovin.impl.n7$$ExternalSyntheticBackport3;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class u {
    private static AccessibilityManager a;

    private static AccessibilityManager a(Context context) {
        if (a == null) {
            a = (AccessibilityManager) context.getSystemService("accessibility");
        }
        return a;
    }

    public static String b(Context context) {
        AccessibilityManager a2;
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        if (context == null || (a2 = a(context)) == null || (enabledAccessibilityServiceList = a2.getEnabledAccessibilityServiceList(-1)) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < enabledAccessibilityServiceList.size(); i++) {
            AccessibilityServiceInfo accessibilityServiceInfo = enabledAccessibilityServiceList.get(i);
            if (accessibilityServiceInfo != null) {
                String format = String.format("%s#%s", accessibilityServiceInfo.getResolveInfo().serviceInfo.packageName, accessibilityServiceInfo.getResolveInfo().serviceInfo.name);
                if (!arrayList.contains(format)) {
                    arrayList.add(format);
                }
            }
        }
        return n7$$ExternalSyntheticBackport3.m(StringUtils.COMMA, arrayList);
    }
}
