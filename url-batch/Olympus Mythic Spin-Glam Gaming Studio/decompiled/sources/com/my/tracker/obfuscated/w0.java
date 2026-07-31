package com.my.tracker.obfuscated;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.text.TextUtils;
import com.inmobi.media.core.config.models.TelemetryConfig;
import com.my.tracker.obfuscated.o1;

/* loaded from: classes9.dex */
public abstract class w0 {
    public static void a(final y2 y2Var, final e0 e0Var, final w1 w1Var, final Context context) {
        m.a(new Runnable() { // from class: com.my.tracker.obfuscated.w0$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                w0.a(context, y2Var, e0Var, w1Var);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(Context context, y2 y2Var, e0 e0Var, w1 w1Var) {
        String str;
        String str2;
        char c;
        Context context2;
        y2 y2Var2;
        long j;
        String num;
        long longVersionCode;
        PackageInfo a = t.a(context);
        if (a != null) {
            if (Build.VERSION.SDK_INT >= 28) {
                longVersionCode = a.getLongVersionCode();
                num = Long.toString(longVersionCode);
            } else {
                num = Integer.toString(a.versionCode);
            }
            str = num;
            str2 = a.versionName;
        } else {
            str = "";
            str2 = str;
        }
        p1 a2 = p1.a(context);
        String a3 = a2.a();
        String g = y2Var.g();
        if (!g.equals(a2.c())) {
            x2.a("InstallHandler: tracking install");
            if (a != null) {
                j = v2.b(a.firstInstallTime);
                context2 = context;
                y2Var2 = y2Var;
            } else {
                context2 = context;
                y2Var2 = y2Var;
                j = 0;
            }
            o1 a4 = o1.a(e0Var, y2Var2, context2);
            o1.a a5 = a4.a();
            e0Var.a(j, t.b(context), a5);
            if (a5 == null) {
                a4.c();
            }
            a2.e(g);
            c = 1;
        } else if (str.equals(a3)) {
            c = 0;
        } else {
            if (a3.isEmpty()) {
                x2.a("InstallHandler: tracking update");
            } else {
                x2.a("InstallHandler: tracking update from" + a3 + " to " + str);
            }
            e0Var.a(a2.f(), a3, str2, str, t.b(context));
            c = 2;
        }
        long j2 = a2.j();
        long a6 = v2.a();
        String b = y2Var.b();
        if (!TextUtils.isEmpty(b)) {
            if (a6 - j2 < TelemetryConfig.DEFAULT_EVENT_TTL_SEC || j2 == 0) {
                x2.a("InstallHandler: tracking apkPreinstallParams");
                e0Var.d(b);
            } else {
                x2.a("InstallHandler: can't track apkPreinstallParams, tracking period has ended");
            }
        }
        if (c == 0) {
            x2.a("InstallHandler: no install/update");
            w1Var.a(j2);
            return;
        }
        if (c == 1) {
            a2.b(a6);
            w1Var.a(a6);
        } else if (c == 2) {
            w1Var.a(j2);
        }
        a2.d(str);
        a2.g(str2);
        a2.c(a6);
    }
}
