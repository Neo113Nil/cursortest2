package yads;

import android.os.Build;
import java.io.File;

/* loaded from: classes6.dex */
public final class ls2 {
    public static final ls2 a = new ls2();
    public static final String[] b = {"/sbin/su", "/system/bin/su", "/system/xbin/su", "/data/local/xbin/su", "/data/local/bin/su", "/system/sd/xbin/su", "/system/bin/failsafe/su", "/data/local/su"};

    public static boolean a() {
        boolean z;
        boolean z2;
        try {
            z = new File("/system/app/Superuser/Superuser.apk").exists();
        } catch (Throwable unused) {
            z = false;
        }
        if (!z) {
            try {
                String[] strArr = b;
                z2 = false;
                for (int i = 0; i < 8; i++) {
                    z2 = z2 || (Build.VERSION.SDK_INT < 31 && new File(strArr[i]).exists());
                }
            } catch (Throwable unused2) {
                z2 = false;
            }
            if (!z2) {
                return false;
            }
        }
        return true;
    }
}
