package yads;

import android.os.Environment;
import android.os.StatFs;

/* loaded from: classes15.dex */
public final class fh0 {
    public static Long a() {
        try {
            return Long.valueOf(new StatFs(Environment.getDataDirectory().getAbsolutePath()).getAvailableBytes() / 1048576);
        } catch (Throwable unused) {
            boolean z = ob1.a;
            return null;
        }
    }

    public static Long b() {
        try {
            return Long.valueOf(new StatFs(Environment.getDataDirectory().getAbsolutePath()).getTotalBytes() / 1048576);
        } catch (Throwable unused) {
            boolean z = ob1.a;
            return null;
        }
    }
}
