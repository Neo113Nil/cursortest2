package io.bidmachine.rendering.internal;

import android.text.TextUtils;
import android.util.Log;
import com.ironsource.X3;
import java.net.UnknownHostException;

/* loaded from: classes4.dex */
public abstract class k {
    private static boolean a;

    public static void a(boolean z) {
        a = z;
    }

    public static boolean b() {
        return a;
    }

    public static void a(Object obj, String str, Object... objArr) {
        a(obj, str, true, objArr);
    }

    public static void b(Object obj, String str, Object... objArr) {
        a(obj, str, false, objArr);
    }

    public static void a(String str, Object... objArr) {
        a(null, str, true, objArr);
    }

    public static void b(String str, Object... objArr) {
        a(null, str, false, objArr);
    }

    private static void a(Object obj, String str, boolean z, Object... objArr) {
        if (a()) {
            if (objArr != null && objArr.length != 0) {
                try {
                    str = String.format(str, objArr);
                } catch (Throwable unused) {
                }
            }
            if (obj != null) {
                String obj2 = obj.toString();
                if (!TextUtils.isEmpty(obj2)) {
                    str = X3.j.d + obj2 + "] " + str;
                }
            }
            if (z) {
                Log.e("AdaptiveRendering", str);
            } else {
                Log.d("AdaptiveRendering", str);
            }
        }
    }

    public static void b(Throwable th) {
        a(th);
    }

    private static void a(Throwable th) {
        if (a()) {
            if (th instanceof UnknownHostException) {
                th.printStackTrace();
            } else {
                Log.w("AdaptiveRendering", th);
            }
        }
    }

    public static boolean a() {
        return b();
    }
}
