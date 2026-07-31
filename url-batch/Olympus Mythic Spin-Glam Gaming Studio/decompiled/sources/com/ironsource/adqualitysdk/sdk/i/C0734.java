package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.List;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.บ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0734 extends AbstractC0698 {

    /* renamed from: ﻛ, reason: contains not printable characters */
    public Context f1658;

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0698
    /* renamed from: ﻛ */
    public final boolean mo4144() {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) this.f1658.getSystemService(StringFog.decrypt("+oq3jn91O0w=\n", "m+nD5wkcTzU=\n"))).getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return false;
        }
        String packageName = this.f1658.getPackageName();
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.importance == 100 && runningAppProcessInfo.processName.equals(packageName)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0698
    /* renamed from: ﾒ */
    public final Activity mo4146() {
        return null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0698
    /* renamed from: ﾒ */
    public final synchronized void mo4147(Application application, Activity activity) {
        try {
            if (application != null) {
                this.f1658 = application.getApplicationContext();
            } else if (activity != null) {
                this.f1658 = activity.getApplicationContext();
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
