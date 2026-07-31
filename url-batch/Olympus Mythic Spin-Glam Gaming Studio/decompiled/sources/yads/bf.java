package yads;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;

/* loaded from: classes5.dex */
public final class bf {
    public final Context a;
    public final rg0 b;

    public bf(Context context, rg0 rg0Var) {
        this.a = context;
        this.b = rg0Var;
    }

    public final r50 a() {
        PackageInfo packageInfo;
        PackageManager.PackageInfoFlags of;
        PackageManager packageManager = this.a.getPackageManager();
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            String packageName = this.a.getPackageName();
            of = PackageManager.PackageInfoFlags.of(0L);
            packageInfo = packageManager.getPackageInfo(packageName, of);
        } else {
            packageInfo = packageManager.getPackageInfo(this.a.getPackageName(), 0);
        }
        this.b.getClass();
        String b = rg0.b();
        if (b == null) {
            b = "Undefined";
        }
        String str = "Android " + b;
        String str2 = "API " + i;
        String str3 = packageInfo.packageName;
        String str4 = packageInfo.versionName;
        if (str4 == null) {
            str4 = "";
        }
        return new r50(str3, str4, str, str2);
    }
}
