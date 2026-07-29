package o;

import android.app.AppOpsManager;
import android.content.Context;

/* renamed from: o.i6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1214i6 {
    public static int a(AppOpsManager appOpsManager, String str, int i, String str2) {
        if (appOpsManager == null) {
            return 1;
        }
        return appOpsManager.checkOpNoThrow(str, i, str2);
    }

    public static String b(Context context) {
        return context.getOpPackageName();
    }

    public static AppOpsManager c(Context context) {
        return (AppOpsManager) context.getSystemService(AppOpsManager.class);
    }
}
