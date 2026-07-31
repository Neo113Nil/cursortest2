package com.inmobi.media;

import com.inmobi.media.core.config.models.AdConfig;
import com.inmobi.media.core.config.models.CrashConfig;
import com.inmobi.media.core.config.models.RootConfig;
import com.inmobi.media.core.config.models.SignalsConfig;
import com.inmobi.media.core.config.models.TelemetryConfig;
import com.mobilefuse.sdk.telemetry.TelemetryCategory;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public abstract class B4 {
    public static final String a(Class clazz) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        if (Intrinsics.areEqual(clazz, RootConfig.class)) {
            return "root";
        }
        if (Intrinsics.areEqual(clazz, AdConfig.class)) {
            return "ads";
        }
        if (Intrinsics.areEqual(clazz, TelemetryConfig.class)) {
            return TelemetryCategory.TELEMETRY;
        }
        if (Intrinsics.areEqual(clazz, SignalsConfig.class)) {
            return "signals";
        }
        if (Intrinsics.areEqual(clazz, CrashConfig.class)) {
            return "crashReporting";
        }
        throw new IllegalArgumentException("Type: " + clazz);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    public static final Class a(String configType) {
        Intrinsics.checkNotNullParameter(configType, "configType");
        switch (configType.hashCode()) {
            case -60641721:
                if (configType.equals("crashReporting")) {
                    return CrashConfig.class;
                }
                break;
            case 96432:
                if (configType.equals("ads")) {
                    return AdConfig.class;
                }
                break;
            case 3506402:
                if (configType.equals("root")) {
                    return RootConfig.class;
                }
                break;
            case 780346297:
                if (configType.equals(TelemetryCategory.TELEMETRY)) {
                    return TelemetryConfig.class;
                }
                break;
            case 2088265419:
                if (configType.equals("signals")) {
                    return SignalsConfig.class;
                }
                break;
        }
        throw new IllegalArgumentException("Type: " + configType);
    }
}
