package yads;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.webkit.WebView;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes3.dex */
public abstract class yn3 {
    public static PackageInfo a(Context context) {
        PackageInfo packageInfo;
        if (Build.VERSION.SDK_INT >= 26) {
            packageInfo = WebView.getCurrentWebViewPackage();
        } else {
            try {
                packageInfo = a();
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                packageInfo = null;
            }
        }
        if (packageInfo != null) {
            return packageInfo;
        }
        try {
            String str = (String) Class.forName("android.webkit.WebViewUpdateService").getMethod("getCurrentWebViewPackageName", null).invoke(null, null);
            if (str == null) {
                return null;
            }
            return context.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException | ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
            return null;
        }
    }

    public static PackageInfo a() {
        return (PackageInfo) Class.forName("android.webkit.WebViewFactory").getMethod("getLoadedPackageInfo", null).invoke(null, null);
    }
}
