package com.inmobi.media;

import com.inmobi.media.core.config.models.AdConfig;
import com.inmobi.media.core.config.models.Config;
import com.inmobi.media.core.config.models.CrashConfig;
import com.inmobi.media.core.config.models.RootConfig;
import com.inmobi.media.core.config.models.SignalsConfig;
import com.inmobi.media.core.config.models.TelemetryConfig;
import com.mobilefuse.sdk.telemetry.TelemetryCategory;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.u5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC4383u5 {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    public static Config a(String configType) {
        Intrinsics.checkNotNullParameter(configType, "configType");
        switch (configType.hashCode()) {
            case -60641721:
                if (configType.equals("crashReporting")) {
                    return new CrashConfig();
                }
                break;
            case 96432:
                if (configType.equals("ads")) {
                    return new AdConfig();
                }
                break;
            case 3506402:
                if (configType.equals("root")) {
                    return new RootConfig();
                }
                break;
            case 780346297:
                if (configType.equals(TelemetryCategory.TELEMETRY)) {
                    return new TelemetryConfig();
                }
                break;
            case 2088265419:
                if (configType.equals("signals")) {
                    return new SignalsConfig();
                }
                break;
        }
        throw new IllegalArgumentException("Type: " + configType);
    }
}
