package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;

/* renamed from: io.appmetrica.analytics.impl.c6, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC5249c6 extends BaseRequestConfig.ComponentLoader {
    public final SafePackageManager a;

    public AbstractC5249c6(@NonNull Context context, @NonNull String str) {
        this(context, str, new SafePackageManager());
    }

    @Override // io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.ComponentLoader, io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.RequestConfigLoader
    @NonNull
    /* renamed from: a */
    public C5275d6 load(@NonNull C5223b6 c5223b6) {
        C5275d6 c5275d6 = (C5275d6) super.load((AbstractC5249c6) c5223b6);
        String packageName = getContext().getPackageName();
        ApplicationInfo applicationInfo = this.a.getApplicationInfo(getContext(), getPackageName(), 0);
        if (applicationInfo != null) {
            int i = applicationInfo.flags;
            c5275d6.a = (i & 2) != 0 ? "1" : "0";
            c5275d6.b = (i & 1) == 0 ? "0" : "1";
        } else if (TextUtils.equals(packageName, getPackageName())) {
            c5275d6.a = (getContext().getApplicationInfo().flags & 2) != 0 ? "1" : "0";
            c5275d6.b = (getContext().getApplicationInfo().flags & 1) == 0 ? "0" : "1";
        } else {
            c5275d6.a = "0";
            c5275d6.b = "0";
        }
        C5783wm c5783wm = c5223b6.a;
        c5275d6.c = c5783wm;
        c5275d6.setRetryPolicyConfig(c5783wm.t);
        return c5275d6;
    }

    public AbstractC5249c6(@NonNull Context context, @NonNull String str, @NonNull SafePackageManager safePackageManager) {
        super(context, str);
        this.a = safePackageManager;
    }
}
