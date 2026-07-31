package yads;

import android.text.TextUtils;
import android.util.Log;
import java.net.UnknownHostException;

/* loaded from: classes4.dex */
public abstract class gh1 {
    public static final Object a = new Object();

    public static void a(String str, String str2) {
        synchronized (a) {
            Log.d(str, str2);
        }
    }

    public static void b(String str, String str2) {
        synchronized (a) {
            Log.e(str, str2);
        }
    }

    public static void c(String str, String str2) {
        synchronized (a) {
            Log.i(str, str2);
        }
    }

    public static void d(String str, String str2) {
        synchronized (a) {
            Log.w(str, str2);
        }
    }

    public static String a(String str, Throwable th) {
        String replace;
        synchronized (a) {
            try {
                if (th != null) {
                    Throwable th2 = th;
                    while (true) {
                        if (th2 != null) {
                            if (th2 instanceof UnknownHostException) {
                                replace = "UnknownHostException (no network)";
                            } else {
                                th2 = th2.getCause();
                            }
                        } else {
                            replace = Log.getStackTraceString(th).trim().replace("\t", "    ");
                            break;
                        }
                    }
                } else {
                    replace = null;
                }
            } finally {
            }
        }
        if (TextUtils.isEmpty(replace)) {
            return str;
        }
        return str + "\n  " + replace.replace("\n", "\n  ") + '\n';
    }
}
