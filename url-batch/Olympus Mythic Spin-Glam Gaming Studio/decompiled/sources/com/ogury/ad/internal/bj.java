package com.ogury.ad.internal;

import android.app.Activity;
import android.content.pm.ActivityInfo;
import com.ogury.core.internal.IntegrationLogger;
import com.ogury.core.internal.LogTag;
import com.ogury.core.internal.Logger;
import com.ogury.core.internal.SourceTag;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public abstract class bj {
    public static final le a = le.a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.util.ArrayList] */
    public static void a(Activity context, aa aaVar) {
        ?? emptyList;
        Intrinsics.checkNotNullParameter(context, "context");
        boolean z = true;
        try {
            emptyList = new ArrayList();
            ActivityInfo[] activityInfoArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 1).activities;
            if (activityInfoArr == null) {
                activityInfoArr = new ActivityInfo[0];
            }
            for (ActivityInfo activityInfo : activityInfoArr) {
                String name = activityInfo.name;
                Intrinsics.checkNotNullExpressionValue(name, "name");
                Activity activity = null;
                try {
                    Object newInstance = Class.forName(name).getConstructor(null).newInstance(null);
                    if (newInstance instanceof Activity) {
                        activity = (Activity) newInstance;
                    }
                } catch (Exception e) {
                    Logger.INSTANCE.e(LogTag.INTERNAL, SourceTag.ADS, e);
                }
                if (activity != null) {
                    emptyList.add(activity);
                }
            }
        } catch (Exception e2) {
            Logger.INSTANCE.e(LogTag.INTERNAL, SourceTag.ADS, e2);
            emptyList = CollectionsKt.emptyList();
        }
        IntegrationLogger.i(LogTag.INTERNAL, SourceTag.ADS, "Displaying whitelisted activities");
        for (Activity activity2 : emptyList) {
            if (aaVar.a(activity2)) {
                IntegrationLogger.i(LogTag.INTERNAL, SourceTag.ADS, "Whitelisted: " + activity2.getClass().getName());
                z = false;
            }
        }
        if (z) {
            IntegrationLogger.i(LogTag.INTERNAL, SourceTag.ADS, "No activity is whitelisted");
        }
    }
}
