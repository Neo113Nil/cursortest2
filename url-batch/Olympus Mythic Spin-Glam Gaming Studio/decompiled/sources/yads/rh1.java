package yads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;

/* loaded from: classes12.dex */
public final class rh1 {
    public static Boolean a(Context context) {
        return (Boolean) a(context, sh1.d.b);
    }

    public static Boolean b(Context context) {
        return (Boolean) a(context, sh1.e.b);
    }

    public static Object a(Context context, String str) {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            try {
                applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            } catch (Throwable unused) {
                boolean z = ob1.a;
                applicationInfo = null;
            }
            if (applicationInfo != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey(str)) {
                Object obj = bundle.get(str);
                if (obj == null) {
                    return null;
                }
                return obj;
            }
        } catch (Throwable unused2) {
            boolean z2 = ob1.a;
        }
        return null;
    }
}
