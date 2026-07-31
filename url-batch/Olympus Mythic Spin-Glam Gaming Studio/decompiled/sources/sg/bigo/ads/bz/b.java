package sg.bigo.ads.bz;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.hardware.display.DisplayManager;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.os.PowerManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.accessibility.AccessibilityManager;
import android.webkit.WebSettings;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import com.applovin.sdk.AppLovinEventTypes;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.ironsource.C4538a2;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import com.unity3d.player.UnityPlayer;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import sg.bigo.ads.ar.e;
import sg.bigo.ads.common.utils.d;
import sg.bigo.ads.common.utils.r;
import sg.bigo.ads.common.utils.s;

/* loaded from: classes3.dex */
public final class b {
    private static int a;
    private static final List<a> b = new CopyOnWriteArrayList();
    private static boolean c = false;
    private static String d = C4538a2.f;
    private static String e = C4538a2.f;
    private static int f = 0;
    private static final AtomicBoolean g = new AtomicBoolean(false);
    private static long h = 0;
    private static sg.bigo.ads.an.b i = new sg.bigo.ads.an.b();
    private static boolean j = false;
    private static BroadcastReceiver k = new BroadcastReceiver() { // from class: sg.bigo.ads.bz.b.3
        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if (b.h <= 0 || System.currentTimeMillis() - b.h >= s.a.a(10)) {
                long unused = b.h = System.currentTimeMillis();
                if (intent != null) {
                    try {
                        b.i.a = intent.getIntExtra(AppLovinEventTypes.USER_COMPLETED_LEVEL, -1);
                        b.i.b = intent.getIntExtra("scale", -1);
                        b.i.c = intent.getIntExtra("status", -1);
                    } catch (Throwable unused2) {
                        b.i.a = -1;
                        b.i.b = -1;
                        b.i.c = -1;
                    }
                }
            }
        }
    };

    public interface a {
        void a(int i);
    }

    public static int a(@NonNull Activity activity) {
        int rotation = activity.getWindowManager().getDefaultDisplay().getRotation();
        int i2 = activity.getResources().getConfiguration().orientation;
        if (1 == i2) {
            return (rotation == 1 || rotation == 2) ? 9 : 1;
        }
        if (2 == i2) {
            return (rotation == 2 || rotation == 3) ? 8 : 0;
        }
        sg.bigo.ads.bn.a.a(0, "DeviceUtil", "Unknown orientation. return portrait by default");
        return 9;
    }

    public static void a() {
        d = C4538a2.f;
        e = C4538a2.f;
    }

    public static synchronized void a(Context context, @NonNull a aVar) {
        synchronized (b.class) {
            if (context != null) {
                try {
                    List<a> list = b;
                    if (!list.contains(aVar)) {
                        list.add(aVar);
                    }
                    if (!c) {
                        c = true;
                        sg.bigo.ads.ar.a.a().a(context, new e() { // from class: sg.bigo.ads.bz.b.1
                            /* JADX WARN: Removed duplicated region for block: B:13:0x0030  */
                            /* JADX WARN: Removed duplicated region for block: B:19:0x004c A[ORIG_RETURN, RETURN] */
                            @Override // sg.bigo.ads.ar.b
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final void a(Context context2, Intent intent) {
                                int i2;
                                String action = intent.getAction();
                                if (r.a((CharSequence) action)) {
                                    return;
                                }
                                int i3 = b.a;
                                action.hashCode();
                                if (!action.equals("android.intent.action.SCREEN_OFF")) {
                                    i2 = action.equals("android.intent.action.USER_PRESENT") ? 1 : 2;
                                    if (i3 == b.a) {
                                        Iterator it = b.b.iterator();
                                        while (it.hasNext()) {
                                            ((a) it.next()).a(b.a);
                                        }
                                        return;
                                    }
                                    return;
                                }
                                int unused = b.a = i2;
                                if (i3 == b.a) {
                                }
                            }
                        });
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static boolean a(Context context) {
        if (context == null) {
            return false;
        }
        if (a == 0) {
            PowerManager powerManager = (PowerManager) context.getSystemService("power");
            a = (powerManager == null || powerManager.isScreenOn()) ? 1 : 2;
        }
        return a == 1;
    }

    public static String b(Context context) {
        Resources resources;
        Locale locale;
        if (context == null || (resources = context.getResources()) == null || (locale = resources.getConfiguration().locale) == null) {
            return Locale.US.getLanguage();
        }
        String language = locale.getLanguage();
        return language.equals("iw") ? "he" : language.equals("in") ? "id" : language.equals("ji") ? "yi" : language;
    }

    public static boolean b() {
        return j() && f == 1;
    }

    public static String c(Context context) {
        Resources resources;
        Locale locale;
        return (context == null || (resources = context.getResources()) == null || (locale = resources.getConfiguration().locale) == null) ? "zz" : locale.getCountry();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0039, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0026, code lost:
    
        r1 = android.os.Build.TAGS;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0028, code lost:
    
        if (r1 == null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0030, code lost:
    
        if (r1.contains("test-keys") == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0037, code lost:
    
        if (k() == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:?, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean c() {
        try {
            String[] strArr = {"/system/app/Superuser.apk", "/sbin/su", "/system/bin/su", "/system/xbin/su", "/data/local/xbin/su", "/data/local/bin/su"};
            int i2 = 0;
            while (true) {
                if (i2 >= 6) {
                    break;
                }
                if (new File(strArr[i2]).exists()) {
                    break;
                }
                i2++;
            }
        } catch (Throwable unused) {
            return false;
        }
    }

    public static String d(Context context) {
        if (context == null) {
            return "";
        }
        if (C4538a2.f.equals(d)) {
            d = "";
            if (!d.a(context, "android.permission.READ_PHONE_STATE")) {
                return d;
            }
            try {
                d = ((TelephonyManager) context.getSystemService("phone")).getSimOperatorName();
            } catch (Exception unused) {
            }
        }
        return d;
    }

    public static boolean d() {
        return true;
    }

    public static String e(Context context) {
        if (context == null) {
            return "";
        }
        if (C4538a2.f.equals(e)) {
            e = "";
            if (!d.a(context, "android.permission.READ_PHONE_STATE")) {
                return e;
            }
            try {
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                String networkCountryIso = telephonyManager.getNetworkCountryIso();
                e = networkCountryIso;
                if (TextUtils.isEmpty(networkCountryIso)) {
                    e = telephonyManager.getSimCountryIso();
                }
            } catch (Exception unused) {
            }
        }
        return e;
    }

    public static String f(Context context) {
        String str;
        try {
            str = context.getPackageManager().getPackageInfo("com.google.android.webview", 0).versionName;
        } catch (Exception unused) {
            str = "";
        }
        try {
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
            String defaultUserAgent = WebSettings.getDefaultUserAgent(context);
            return !TextUtils.isEmpty(defaultUserAgent) ? defaultUserAgent.substring(defaultUserAgent.indexOf("Chrome/") + 7, defaultUserAgent.indexOf("Mobile")).trim() : defaultUserAgent;
        } catch (Exception unused2) {
            return str;
        }
    }

    @WorkerThread
    public static void g(Context context) {
        if (g.getAndSet(true) || context == null || !j()) {
            return;
        }
        final DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        displayManager.registerDisplayListener(new DisplayManager.DisplayListener() { // from class: sg.bigo.ads.bz.b.2
            @Override // android.hardware.display.DisplayManager.DisplayListener
            public final void onDisplayAdded(int i2) {
            }

            @Override // android.hardware.display.DisplayManager.DisplayListener
            public final void onDisplayChanged(int i2) {
                if (i2 == 0) {
                    try {
                        int unused = b.f = displayManager.getDisplay(i2).getState();
                    } catch (Throwable unused2) {
                    }
                }
                int unused3 = b.f;
            }

            @Override // android.hardware.display.DisplayManager.DisplayListener
            public final void onDisplayRemoved(int i2) {
            }
        }, null);
    }

    public static sg.bigo.ads.an.b h(Context context) {
        if (!j) {
            i(context);
        }
        return i;
    }

    public static void i(Context context) {
        if (context == null || j) {
            return;
        }
        context.registerReceiver(k, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        j = true;
    }

    public static void j(Context context) {
        BroadcastReceiver broadcastReceiver;
        if (context == null || (broadcastReceiver = k) == null || !j) {
            return;
        }
        try {
            context.unregisterReceiver(broadcastReceiver);
        } catch (Throwable unused) {
        }
        k = null;
        j = false;
    }

    private static boolean j() {
        return true;
    }

    private static boolean k() {
        for (String str : System.getenv(AndroidStaticDeviceInfoDataSource.ENVIRONMENT_VARIABLE_PATH).split(":")) {
            File file = new File(str);
            if (file.isDirectory() && new File(file, "su").exists()) {
                return true;
            }
        }
        return false;
    }

    public static boolean k(Context context) {
        PowerManager powerManager;
        return (context == null || (powerManager = (PowerManager) context.getSystemService("power")) == null || !powerManager.isPowerSaveMode()) ? false : true;
    }

    public static int l(Context context) {
        int i2 = 4;
        if (context == null) {
            return 4;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager.isActiveNetworkMetered()) {
            int restrictBackgroundStatus = connectivityManager.getRestrictBackgroundStatus();
            i2 = 3;
            if (restrictBackgroundStatus != 1) {
                if (restrictBackgroundStatus != 2) {
                    return restrictBackgroundStatus != 3 ? 0 : 1;
                }
                return 2;
            }
        }
        return i2;
    }

    public static float m(Context context) {
        if (context == null) {
            return 0.0f;
        }
        try {
            if (((AudioManager) context.getSystemService("audio")) != null) {
                return r3.getStreamVolume(3) / r3.getStreamMaxVolume(3);
            }
        } catch (Exception e2) {
            sg.bigo.ads.bn.a.a(0, "DeviceUtil", "getVolume exception: " + e2.getMessage());
        }
        return 0.0f;
    }

    public static boolean n(Context context) {
        if (context == null) {
            return false;
        }
        try {
            AccessibilityManager accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility");
            if (accessibilityManager != null) {
                if (accessibilityManager.isEnabled()) {
                    return true;
                }
            }
            return false;
        } catch (Exception e2) {
            sg.bigo.ads.bn.a.a(0, "DeviceUtil", "isAccessibilityServiceEnabled exception: " + e2.getMessage());
            return false;
        }
    }

    public static int o(Context context) {
        if (context == null) {
            return 0;
        }
        try {
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            if (audioManager != null) {
                return audioManager.getRingerMode();
            }
        } catch (Exception e2) {
            sg.bigo.ads.bn.a.a(0, "DeviceUtil", "getNotificationMode exception: " + e2.getMessage());
        }
        return 0;
    }

    public static float p(Context context) {
        if (context == null) {
            return 1.0f;
        }
        try {
            Configuration configuration = context.getResources().getConfiguration();
            if (configuration != null) {
                return configuration.fontScale;
            }
        } catch (Exception e2) {
            sg.bigo.ads.bn.a.a(0, "DeviceUtil", "getFontScale exception: " + e2.getMessage());
        }
        return 1.0f;
    }

    public static int q(Context context) {
        if (context == null) {
            return -1;
        }
        try {
            int i2 = context.getResources().getDisplayMetrics().densityDpi;
            int i3 = DisplayMetrics.DENSITY_DEVICE_STABLE;
            if (i2 > i3) {
                return 1;
            }
            return i2 == i3 ? 0 : 2;
        } catch (Exception e2) {
            sg.bigo.ads.bn.a.a(0, "DeviceUtil", "getDisplayScale exception: " + e2.getMessage());
            return -1;
        }
    }

    public static int r(Context context) {
        if (context == null) {
            return 0;
        }
        try {
            int i2 = context.getResources().getConfiguration().uiMode & 48;
            if (i2 != 16) {
                return i2 != 32 ? 0 : 2;
            }
            return 1;
        } catch (Exception e2) {
            sg.bigo.ads.bn.a.a(0, "DeviceUtil", "getThemeMode exception: " + e2.getMessage());
            return 0;
        }
    }

    public static int s(Context context) {
        if (context == null) {
            return 0;
        }
        try {
            return context.getApplicationInfo().targetSdkVersion;
        } catch (Throwable th) {
            sg.bigo.ads.bn.a.a(0, "DeviceUtil", "getTargetSdkVersion exception: " + th.getMessage());
            return 0;
        }
    }

    public static int t(Context context) {
        if (context == null) {
            return 0;
        }
        try {
            return context.getApplicationInfo().minSdkVersion;
        } catch (Throwable th) {
            sg.bigo.ads.bn.a.a(0, "DeviceUtil", "getMinSdkVersion exception: " + th.getMessage());
            return 0;
        }
    }

    public static boolean u(Context context) {
        if (context == null) {
            return false;
        }
        try {
            return GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(context) == 0;
        } catch (Throwable unused) {
            sg.bigo.ads.bn.a.a("DeviceUtil", "Unexpected exception from Play services lib.");
            return false;
        }
    }

    public static long v(Context context) {
        if (context == null) {
            return 0L;
        }
        try {
            return new File(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).applicationInfo.sourceDir).length();
        } catch (Throwable th) {
            sg.bigo.ads.bn.a.a(0, "DeviceUtil", "getApkSize exception: " + th.getMessage());
            return 0L;
        }
    }

    public static boolean w(Context context) {
        if (context == null) {
            return false;
        }
        try {
            Activity activity = UnityPlayer.currentActivity;
            return true;
        } catch (Throwable th) {
            sg.bigo.ads.bn.a.a(0, "DeviceUtil", "isUnityEnvironment exception: " + th.getMessage());
            return false;
        }
    }
}
