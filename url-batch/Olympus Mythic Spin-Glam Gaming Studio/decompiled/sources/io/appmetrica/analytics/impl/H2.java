package io.appmetrica.analytics.impl;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.app.usage.UsageStatsManager;
import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.annotations.DoNotInline;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@DoNotInline
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¨\u0006\n"}, d2 = {"Lio/appmetrica/analytics/impl/H2;", "", "Landroid/content/Context;", "context", "Lio/appmetrica/analytics/impl/p2;", "converter", "Lio/appmetrica/analytics/impl/K2;", "a", "<init>", "()V", "analytics_binaryProdRelease"}, k = 1, mv = {1, 9, 0})
@TargetApi(28)
/* loaded from: classes10.dex */
public final class H2 {

    @NotNull
    public static final H2 a = new H2();

    private H2() {
    }

    @NotNull
    public static final K2 a(@NotNull Context context, @NotNull final C5581p2 converter) {
        return new K2((J2) SystemServiceUtils.accessSystemServiceByNameSafely(context, "usagestats", "getting app standby bucket", "usageStatsManager", new FunctionWithThrowable() { // from class: io.appmetrica.analytics.impl.H2$$ExternalSyntheticLambda2
            @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
            public final Object apply(Object obj) {
                J2 a2;
                a2 = H2.a(C5581p2.this, (UsageStatsManager) obj);
                return a2;
            }
        }), (Boolean) SystemServiceUtils.accessSystemServiceByNameSafely(context, "activity", "getting is background restricted", "activityManager", new FunctionWithThrowable() { // from class: io.appmetrica.analytics.impl.H2$$ExternalSyntheticLambda3
            @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
            public final Object apply(Object obj) {
                Boolean a2;
                a2 = H2.a((ActivityManager) obj);
                return a2;
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J2 a(C5581p2 c5581p2, UsageStatsManager usageStatsManager) {
        int appStandbyBucket;
        appStandbyBucket = usageStatsManager.getAppStandbyBucket();
        c5581p2.getClass();
        if (AndroidUtils.isApiAchieved(28)) {
            if (AndroidUtils.isApiAchieved(30) && appStandbyBucket == 45) {
                return J2.RESTRICTED;
            }
            if (appStandbyBucket == 5) {
                return J2.EXEMPTED;
            }
            if (appStandbyBucket == 10) {
                return J2.ACTIVE;
            }
            if (appStandbyBucket == 30) {
                return J2.FREQUENT;
            }
            if (appStandbyBucket == 20) {
                return J2.WORKING_SET;
            }
            if (appStandbyBucket == 40) {
                return J2.RARE;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean a(ActivityManager activityManager) {
        boolean isBackgroundRestricted;
        isBackgroundRestricted = activityManager.isBackgroundRestricted();
        return Boolean.valueOf(isBackgroundRestricted);
    }
}
