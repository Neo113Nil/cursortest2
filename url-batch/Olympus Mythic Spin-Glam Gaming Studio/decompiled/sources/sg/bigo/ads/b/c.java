package sg.bigo.ads.b;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import android.os.Process;
import android.text.TextUtils;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public final class c implements g<JSONObject> {
    @SuppressLint({"PrivateApi", "DiscouragedPrivateApi"})
    private static String b() {
        try {
            Method declaredMethod = Class.forName(sg.bigo.ads.a.a.af).getDeclaredMethod(sg.bigo.ads.a.a.ag, String.class);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(null, "activity");
            return (invoke == null || !Proxy.isProxyClass(invoke.getClass())) ? "" : invoke.getClass().getName();
        } catch (Throwable unused) {
            return "";
        }
    }

    @SuppressLint({"PrivateApi"})
    private static String b(Context context) {
        ArrayList<?> a = sg.bigo.ads.c.d.a();
        if (a == null) {
            return "";
        }
        Iterator<?> it = a.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof Application) {
                Application application = (Application) next;
                String packageName = application.getPackageName();
                if (!TextUtils.equals(context.getPackageName(), packageName) && !TextUtils.equals(packageName, sg.bigo.ads.a.a.al) && (application.getApplicationInfo().flags & 1) == 0 && application.getApplicationInfo().publicSourceDir.startsWith(sg.bigo.ads.a.a.ah)) {
                    return packageName;
                }
            }
        }
        return "";
    }

    @Override // sg.bigo.ads.b.g
    public final /* synthetic */ JSONObject a(Context context) {
        JSONObject jSONObject = new JSONObject();
        String b = b();
        if (!TextUtils.isEmpty(b)) {
            jSONObject.put(sg.bigo.ads.a.a.x, b);
        }
        String b2 = b(context);
        if (!TextUtils.isEmpty(b2)) {
            jSONObject.put(sg.bigo.ads.a.a.A, b2);
        }
        int myUid = Process.myUid();
        if (sg.bigo.ads.c.c.a(myUid, "/")) {
            jSONObject.put(sg.bigo.ads.a.a.w, myUid);
        }
        if (jSONObject.length() == 0) {
            return null;
        }
        return jSONObject;
    }

    @Override // sg.bigo.ads.b.g
    public final String a() {
        return sg.bigo.ads.a.a.r;
    }
}
