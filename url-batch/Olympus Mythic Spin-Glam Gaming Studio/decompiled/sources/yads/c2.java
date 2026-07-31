package yads;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;

/* loaded from: classes5.dex */
public final class c2 {
    public static final String b;
    public static final String c;
    public final t1 a = new t1();

    static {
        String str = com.safedk.android.utils.h.y + ".common.AdActivity";
        b = str;
        c = "There is no presence of " + str + " activity in AndroidManifest file.";
    }

    public final void a(Context context) {
        try {
            ActivityInfo activityInfo = context.getPackageManager().getActivityInfo(new ComponentName(context.getPackageName(), b), 0);
            this.a.getClass();
            t1.a(activityInfo);
        } catch (PackageManager.NameNotFoundException unused) {
            throw new ja1(c);
        }
    }
}
