package com.pgl.ssdk;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.text.TextUtils;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

/* loaded from: classes3.dex */
public class ab {
    private static int a = -1;
    private static int b = -1;

    @SuppressLint({"PrivateApi"})
    public static Application a() {
        try {
            return (Application) Class.forName("android.app.ActivityThread").getMethod("currentApplication", null).invoke(null, null);
        } catch (Throwable unused) {
            return null;
        }
    }

    private static String a(Context context, int i, String str) {
        Configuration configuration = new Configuration(context.getResources().getConfiguration());
        configuration.setLocale(new Locale(str));
        return context.createConfigurationContext(configuration).getResources().getString(i);
    }

    private static boolean a(Context context) {
        List<ActivityManager.AppTask> appTasks;
        Intent intent;
        if (context != null && (appTasks = ((ActivityManager) context.getSystemService("activity")).getAppTasks()) != null && !appTasks.isEmpty()) {
            for (ActivityManager.AppTask appTask : appTasks) {
                if (appTask.getTaskInfo() != null) {
                    intent = appTask.getTaskInfo().baseIntent;
                    if (a(intent)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private static boolean a(Intent intent) {
        return (intent == null || (intent.getFlags() & 8388608) == 0) ? false : true;
    }

    public static String b() {
        String processName;
        if (Build.VERSION.SDK_INT >= 28) {
            processName = Application.getProcessName();
            return processName;
        }
        try {
            Method declaredMethod = Class.forName("android.app.ActivityThread", false, Application.class.getClassLoader()).getDeclaredMethod("currentProcessName", null);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(null, null);
            if (invoke instanceof String) {
                return (String) invoke;
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    public static void b(Context context) {
        try {
            if (a == -1 || b == -1) {
                l(context);
            }
            if (a(context)) {
                a++;
            }
            b++;
            if (a != 0) {
                m(context);
                com.pgl.ssdk.ces.a.meta(160, null, new int[]{a, b});
            }
        } catch (Throwable unused) {
        }
    }

    public static String c() {
        String str;
        try {
            str = Environment.getDataDirectory().getPath();
        } catch (Throwable unused) {
            str = null;
        }
        return str == null ? "" : str.trim();
    }

    public static String c(Context context) {
        String str;
        try {
            str = context.getApplicationInfo().sourceDir;
        } catch (Throwable unused) {
            str = null;
        }
        return str == null ? "" : str.trim();
    }

    public static String d() {
        String str;
        try {
            str = Environment.getExternalStorageDirectory().getAbsolutePath();
        } catch (Throwable unused) {
            str = null;
        }
        return str == null ? "" : str.trim();
    }

    public static String d(Context context) {
        try {
            return a(context, context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).labelRes, "en");
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String e(Context context) {
        String str;
        try {
            str = context.getFilesDir().getAbsolutePath();
        } catch (Throwable unused) {
            str = null;
        }
        return str == null ? "" : str.trim();
    }

    public static String f(Context context) {
        String str;
        try {
            str = context.getPackageName();
        } catch (Throwable unused) {
            str = null;
        }
        return str == null ? "" : str.trim();
    }

    public static String g(Context context) {
        String str;
        try {
            str = context.getPackageResourcePath();
        } catch (Throwable unused) {
            str = null;
        }
        return str == null ? "" : str.trim();
    }

    public static int h(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (Throwable unused) {
            return 0;
        }
    }

    public static String i(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (Throwable unused) {
            return "";
        }
    }

    public static boolean j(Context context) {
        ResolveInfo resolveInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            Intent intent = new Intent("android.intent.action.MAIN", (Uri) null);
            intent.addCategory("android.intent.category.LAUNCHER");
            intent.setPackage(context.getPackageName());
            List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 0);
            if (queryIntentActivities == null || queryIntentActivities.isEmpty() || (resolveInfo = queryIntentActivities.get(0)) == null) {
                return false;
            }
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            int componentEnabledSetting = packageManager.getComponentEnabledSetting(new ComponentName(activityInfo.packageName, activityInfo.name));
            return componentEnabledSetting == 0 || componentEnabledSetting == 1;
        } catch (Throwable unused) {
            return true;
        }
    }

    public static int k(Context context) {
        int i;
        PackageManager packageManager = context.getPackageManager();
        String packageName = context.getPackageName();
        Intent intent = new Intent("android.net.VpnService");
        intent.setPackage(packageName);
        Iterator<ResolveInfo> it = packageManager.queryIntentServices(intent, 128).iterator();
        while (true) {
            if (!it.hasNext()) {
                i = 999999;
                break;
            }
            if (it.next().serviceInfo.packageName.equals(packageName)) {
                i = 1;
                break;
            }
        }
        if (i != 1) {
            return -1;
        }
        return i;
    }

    private static void l(Context context) {
        int i;
        String a2 = aw.a(context, "hac_date", (String) null);
        if (!TextUtils.isEmpty(a2)) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
            if (a2.equals(simpleDateFormat.format(new Date()))) {
                int a3 = aw.a(context, "hac", -1);
                i = aw.a(context, "tac", -1);
                if (a3 != -1 && i != -1) {
                    a = a3;
                    b = i;
                }
            }
        }
        i = 0;
        a = 0;
        b = i;
    }

    private static void m(Context context) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        aw.b(context, "hac_date", simpleDateFormat.format(new Date()));
        aw.b(context, "hac", a);
        aw.b(context, "tac", b);
    }
}
