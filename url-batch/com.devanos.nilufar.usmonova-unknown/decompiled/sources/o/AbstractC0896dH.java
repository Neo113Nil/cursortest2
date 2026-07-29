package o;

import android.util.Log;
import java.util.regex.Pattern;

/* renamed from: o.dH, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0896dH {
    public static final BU a = EB.D(new C0641Yp(1));

    public static void a(String str, String str2) {
        if (c()) {
            Log.d("P7", "[" + str + "] " + e(str2));
        }
    }

    public static void b(String str, String str2, Throwable th) {
        AbstractC0048Bt.n(str2, "message");
        if (c()) {
            Log.e("P7", "[" + str + "] " + e(str2), th);
        }
    }

    public static boolean c() {
        return ((Boolean) a.getValue()).booleanValue();
    }

    public static void d(String str, String str2) {
        AbstractC0048Bt.n(str2, "message");
        if (c()) {
            Log.i("P7", "[" + str + "] " + e(str2));
        }
    }

    public static String e(String str) {
        Pattern compile = Pattern.compile("https?://[^\\s\"']+");
        AbstractC0048Bt.m(compile, "compile(...)");
        AbstractC0048Bt.n(str, "input");
        String replaceAll = compile.matcher(str).replaceAll("[host]");
        AbstractC0048Bt.m(replaceAll, "replaceAll(...)");
        Pattern compile2 = Pattern.compile("(?i)(webview|url|link)");
        AbstractC0048Bt.m(compile2, "compile(...)");
        String replaceAll2 = compile2.matcher(replaceAll).replaceAll("[x]");
        AbstractC0048Bt.m(replaceAll2, "replaceAll(...)");
        return replaceAll2;
    }

    public static void f(String str, String str2, Exception exc) {
        AbstractC0048Bt.n(str2, "message");
        if (c()) {
            if (exc != null) {
                Log.w("P7", "[" + str + "] " + e(str2), exc);
                return;
            }
            Log.w("P7", "[" + str + "] " + e(str2));
        }
    }
}
