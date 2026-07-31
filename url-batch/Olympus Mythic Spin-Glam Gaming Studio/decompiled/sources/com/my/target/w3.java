package com.my.target;

import android.app.UiModeManager;
import android.content.Context;
import android.content.pm.InstallSourceInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.media.AudioManager;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.inputmethod.InputMethodInfo;
import android.view.inputmethod.InputMethodManager;
import android.view.inputmethod.InputMethodSubtype;
import com.ironsource.O6;
import com.my.target.common.MyTargetConfig;
import com.my.target.common.MyTargetVersion;
import com.pubmatic.sdk.common.POBCommonConstants;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.UUID;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes4.dex */
final class w3 extends t4 {
    private volatile String a;
    private v3 b;
    private Map c;

    w3() {
    }

    private void c(Map map, Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager == null) {
            return;
        }
        map.put("rs", audioManager.getRingerMode() == 2 ? "1" : "0");
    }

    public v3 a() {
        return this.b;
    }

    boolean b() {
        BufferedReader bufferedReader;
        String str = Build.TAGS;
        boolean z = str != null && str.contains("test-keys");
        if (!z) {
            String[] strArr = {"/system/app/Superuser.apk", "/sbin/su", "/system/bin/su", "/system/xbin/su", "/data/local/xbin/su", "/data/local/bin/su", "/system/sd/xbin/su", "/system/bin/failsafe/su", "/data/local/su", "/su/bin/su"};
            int i = 0;
            while (true) {
                if (i >= 10) {
                    break;
                }
                if (new File(strArr[i]).exists()) {
                    z = true;
                    break;
                }
                i++;
            }
        }
        if (!z) {
            Runtime runtime = Runtime.getRuntime();
            String[] strArr2 = {"/system/xbin/which su", "/system/bin/which su", "which su"};
            int i2 = 0;
            while (true) {
                if (i2 >= 3) {
                    break;
                }
                try {
                    Process exec = runtime.exec(strArr2[i2]);
                    try {
                        bufferedReader = new BufferedReader(new InputStreamReader(exec.getInputStream()));
                        try {
                            StringBuilder sb = new StringBuilder();
                            while (true) {
                                String readLine = bufferedReader.readLine();
                                if (readLine == null) {
                                    break;
                                }
                                sb.append(readLine);
                            }
                            exec.destroy();
                            if (TextUtils.isEmpty(sb.toString())) {
                                bufferedReader.close();
                            } else {
                                try {
                                    bufferedReader.close();
                                    try {
                                        exec.destroy();
                                    } catch (Throwable unused) {
                                    }
                                    z = true;
                                    break;
                                } catch (Throwable unused2) {
                                    z = true;
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    } catch (Throwable unused3) {
                    }
                    if (exec != null) {
                        exec.destroy();
                    }
                } catch (Throwable unused4) {
                }
                i2++;
            }
        }
        if (!z) {
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(String.format(Locale.US, "/proc/%d/mounts", Integer.valueOf(Process.myPid())))));
                try {
                    String[] strArr3 = {"/sbin/.magisk/", "/sbin/.core/mirror", "/sbin/.core/img", "/sbin/.core/db-0/magisk.db"};
                    while (true) {
                        String readLine2 = bufferedReader.readLine();
                        if (readLine2 == null) {
                            break;
                        }
                        int i3 = 0;
                        while (true) {
                            if (i3 >= 4) {
                                break;
                            }
                            if (readLine2.contains(strArr3[i3])) {
                                z = true;
                                break;
                            }
                            i3++;
                        }
                    }
                    bufferedReader.close();
                } finally {
                    try {
                        bufferedReader.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
            } catch (Throwable unused5) {
            }
        }
        return z;
    }

    public String a(Context context) {
        if (o0.a()) {
            mi.a("DeviceParamsDataProvider: You must not call getInstanceId method from main thread");
            return "";
        }
        if (this.a == null) {
            synchronized (this) {
                try {
                    if (this.a == null) {
                        String g = ve.a(context).g();
                        if (TextUtils.isEmpty(g)) {
                            g = UUID.randomUUID().toString();
                            ve.a(context).g(g);
                        }
                        this.a = g;
                    }
                } finally {
                }
            }
        }
        String str = this.a;
        return str == null ? "" : str;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(47:10|11|(3:12|13|14)|(2:15|16)|17|18|19|20|21|22|23|(1:25)|26|27|28|29|30|(1:32)(1:118)|33|(31:35|36|37|38|39|(1:41)(1:110)|42|43|(4:45|(1:47)|48|(1:107)(1:52))(1:108)|53|(1:106)(1:57)|58|(1:60)(1:105)|61|(1:63)(1:104)|64|(7:66|67|(1:69)(1:78)|70|72|73|(1:75))|80|81|83|84|86|87|89|90|91|(2:94|92)|95|96|97|98)(1:116)|115|112|43|(0)(0)|53|(1:55)|106|58|(0)(0)|61|(0)(0)|64|(0)|80|81|83|84|86|87|89|90|91|(1:92)|95|96|97|98) */
    /* JADX WARN: Can't wrap try/catch for region: R(49:10|11|12|13|14|(2:15|16)|17|18|19|20|21|22|23|(1:25)|26|27|28|29|30|(1:32)(1:118)|33|(31:35|36|37|38|39|(1:41)(1:110)|42|43|(4:45|(1:47)|48|(1:107)(1:52))(1:108)|53|(1:106)(1:57)|58|(1:60)(1:105)|61|(1:63)(1:104)|64|(7:66|67|(1:69)(1:78)|70|72|73|(1:75))|80|81|83|84|86|87|89|90|91|(2:94|92)|95|96|97|98)(1:116)|115|112|43|(0)(0)|53|(1:55)|106|58|(0)(0)|61|(0)(0)|64|(0)|80|81|83|84|86|87|89|90|91|(1:92)|95|96|97|98) */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x00db, code lost:
    
        r11 = r27;
        r8 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x00e3, code lost:
    
        r13 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x00d9, code lost:
    
        r27 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x00b9, code lost:
    
        r18 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x00e0, code lost:
    
        r8 = null;
        r11 = r27;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x00cd A[Catch: all -> 0x00db, TRY_LEAVE, TryCatch #13 {all -> 0x00db, blocks: (B:32:0x00c4, B:118:0x00cd), top: B:30:0x00c2 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c4 A[Catch: all -> 0x00db, TRY_ENTER, TryCatch #13 {all -> 0x00db, blocks: (B:32:0x00c4, B:118:0x00cd), top: B:30:0x00c2 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0119 A[Catch: all -> 0x0012, TryCatch #10 {, blocks: (B:4:0x0005, B:6:0x0009, B:10:0x0015, B:18:0x009f, B:43:0x0105, B:45:0x0119, B:47:0x0128, B:48:0x012c, B:50:0x0136, B:52:0x013d, B:53:0x0159, B:55:0x0163, B:58:0x016a, B:64:0x018a, B:91:0x01cf, B:92:0x0269, B:94:0x026f, B:96:0x029e, B:130:0x0086), top: B:3:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0163 A[Catch: all -> 0x0012, TryCatch #10 {, blocks: (B:4:0x0005, B:6:0x0009, B:10:0x0015, B:18:0x009f, B:43:0x0105, B:45:0x0119, B:47:0x0128, B:48:0x012c, B:50:0x0136, B:52:0x013d, B:53:0x0159, B:55:0x0163, B:58:0x016a, B:64:0x018a, B:91:0x01cf, B:92:0x0269, B:94:0x026f, B:96:0x029e, B:130:0x0086), top: B:3:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x018f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x026f A[Catch: all -> 0x0012, LOOP:0: B:92:0x0269->B:94:0x026f, LOOP_END, TryCatch #10 {, blocks: (B:4:0x0005, B:6:0x0009, B:10:0x0015, B:18:0x009f, B:43:0x0105, B:45:0x0119, B:47:0x0128, B:48:0x012c, B:50:0x0136, B:52:0x013d, B:53:0x0159, B:55:0x0163, B:58:0x016a, B:64:0x018a, B:91:0x01cf, B:92:0x0269, B:94:0x026f, B:96:0x029e, B:130:0x0086), top: B:3:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    synchronized Map a(MyTargetConfig myTargetConfig, Context context) {
        String str;
        String str2;
        PackageManager packageManager;
        String str3;
        float f;
        String str4;
        TelephonyManager telephonyManager;
        String str5;
        int i;
        String str6;
        String str7;
        String str8;
        int i2;
        InstallSourceInfo installSourceInfo;
        String str9;
        String num;
        long longVersionCode;
        StringBuilder sb;
        if (this.c != null) {
            return new HashMap(this.c);
        }
        final HashMap hashMap = new HashMap();
        mi.a("DeviceParamsDataProvider: Collect application info...");
        String str10 = Build.DEVICE;
        String str11 = Build.MANUFACTURER;
        String str12 = Build.MODEL;
        String str13 = Build.VERSION.RELEASE;
        String packageName = context.getPackageName();
        String language = Locale.getDefault().getLanguage();
        String language2 = context.getResources().getConfiguration().locale.getLanguage();
        int b = qi.b();
        float a = qi.a();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        TimeZone timeZone = TimeZone.getDefault();
        String str14 = "";
        String str15 = "";
        try {
            sb = new StringBuilder();
            str = "";
            str2 = "";
        } catch (Throwable th) {
            th = th;
            str = "";
            str2 = "";
        }
        try {
            sb.append(timeZone.getDisplayName(false, 0));
            sb.append(" ");
            sb.append(timeZone.getID());
            str14 = sb.toString();
        } catch (Throwable th2) {
            th = th2;
            mi.b("DeviceParamsDataProvider: Timezone name error - " + th.getMessage());
            String str16 = str14;
            o0.d(new Runnable() { // from class: com.my.target.w3$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    w3.this.a(hashMap);
                }
            });
            PackageManager packageManager2 = context.getPackageManager();
            PackageInfo packageInfo = packageManager2.getPackageInfo(packageName, 0);
            str9 = packageInfo.versionName;
            if (str9 == null) {
            }
            PackageManager packageManager3 = packageManager2;
            str15 = str9;
            if (Build.VERSION.SDK_INT < 28) {
            }
            String str17 = str15;
            String str18 = num;
            packageManager = packageManager3;
            if (packageManager != null) {
            }
            f = a;
            str4 = str2;
            String str19 = "";
            telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (telephonyManager != null) {
            }
            DisplayMetrics a2 = qi.a(context);
            String str20 = str6;
            i2 = a2.widthPixels;
            if (i2 > 0) {
            }
            i2 = 0;
            int i3 = 0;
            int i4 = i3;
            int i5 = i2;
            hashMap.put("dkm", !((context.getResources().getConfiguration().uiMode & 48) != 32) ? "1" : "0");
            if (packageManager != null) {
            }
            hashMap.put("uimd", String.valueOf(((UiModeManager) context.getSystemService("uimode")).getCurrentModeType()));
            a(hashMap, context);
            c(hashMap, context);
            b(hashMap, context);
            String a3 = a(context);
            hashMap.put("device", str10);
            hashMap.put("os", "Android");
            hashMap.put("manufacture", str11);
            hashMap.put("osver", str13);
            hashMap.put("app", packageName);
            hashMap.put("appver", str17);
            hashMap.put("appbuild", str18);
            hashMap.put(O6.q, language);
            hashMap.put("app_lang", language2);
            hashMap.put("sim_loc", str7);
            hashMap.put("euname", str12);
            hashMap.put("w", String.valueOf(i5));
            hashMap.put("h", String.valueOf(i4));
            hashMap.put("dpi", String.valueOf(i));
            hashMap.put("density", String.valueOf(f));
            hashMap.put("operator_id", str20);
            hashMap.put("operator_name", str8);
            hashMap.put("sim_operator_id", str19);
            hashMap.put("timezone", str3);
            hashMap.put("instance_id", a3);
            hashMap.put("btms", String.valueOf(elapsedRealtime));
            hashMap.put("ains", str5);
            while (r0.hasNext()) {
            }
            this.b = v3.a(a3, "Android", str13, packageName, str17, str18, MyTargetVersion.VERSION);
            this.c = hashMap;
            mi.a("DeviceParamsDataProvider: Collected");
            return new HashMap(this.c);
        }
        String str162 = str14;
        o0.d(new Runnable() { // from class: com.my.target.w3$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                w3.this.a(hashMap);
            }
        });
        PackageManager packageManager22 = context.getPackageManager();
        PackageInfo packageInfo2 = packageManager22.getPackageInfo(packageName, 0);
        str9 = packageInfo2.versionName;
        if (str9 == null) {
            str9 = POBCommonConstants.NULL_VALUE;
        }
        PackageManager packageManager32 = packageManager22;
        str15 = str9;
        if (Build.VERSION.SDK_INT < 28) {
            longVersionCode = packageInfo2.getLongVersionCode();
            num = Long.toString(longVersionCode);
        } else {
            num = Integer.toString(packageInfo2.versionCode);
        }
        String str172 = str15;
        String str182 = num;
        packageManager = packageManager32;
        if (packageManager != null) {
            str3 = str162;
            try {
                f = a;
                try {
                    if (Build.VERSION.SDK_INT >= 30) {
                        installSourceInfo = packageManager.getInstallSourceInfo(packageName);
                        str4 = installSourceInfo.getInstallingPackageName();
                    } else {
                        str4 = packageManager.getInstallerPackageName(packageName);
                    }
                } catch (Throwable unused) {
                }
            } catch (Throwable unused2) {
            }
            String str192 = "";
            telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (telephonyManager != null) {
                str5 = str4;
                i = b;
                str6 = "";
                str7 = "";
                str8 = "";
            } else {
                str8 = telephonyManager.getNetworkOperatorName();
                str5 = str4;
                i = b;
                if (telephonyManager.getSimState() == 5) {
                    str192 = telephonyManager.getSimOperator();
                }
                String networkOperator = telephonyManager.getNetworkOperator();
                if (TextUtils.isEmpty(networkOperator) || networkOperator.length() <= 3) {
                    str6 = networkOperator;
                    str7 = "";
                } else {
                    String substring = networkOperator.substring(3);
                    str7 = networkOperator.substring(0, 3);
                    str6 = substring;
                }
            }
            DisplayMetrics a22 = qi.a(context);
            String str202 = str6;
            i2 = a22.widthPixels;
            if (i2 > 0 || (i3 = a22.heightPixels) <= 0) {
                i2 = 0;
                int i32 = 0;
            }
            int i42 = i32;
            int i52 = i2;
            hashMap.put("dkm", !((context.getResources().getConfiguration().uiMode & 48) != 32) ? "1" : "0");
            if (packageManager != null) {
                try {
                    hashMap.put("tscr", packageManager.hasSystemFeature("android.hardware.touchscreen") ? "1" : "0");
                } catch (Throwable unused3) {
                }
                try {
                    PackageInfo packageInfo3 = packageManager.getPackageInfo("com.google.android.webview", 0);
                    if (packageInfo3 != null) {
                        hashMap.put("swvv", packageInfo3.versionName);
                    }
                } catch (Throwable unused4) {
                }
            }
            hashMap.put("uimd", String.valueOf(((UiModeManager) context.getSystemService("uimode")).getCurrentModeType()));
            a(hashMap, context);
            c(hashMap, context);
            b(hashMap, context);
            String a32 = a(context);
            hashMap.put("device", str10);
            hashMap.put("os", "Android");
            hashMap.put("manufacture", str11);
            hashMap.put("osver", str13);
            hashMap.put("app", packageName);
            hashMap.put("appver", str172);
            hashMap.put("appbuild", str182);
            hashMap.put(O6.q, language);
            hashMap.put("app_lang", language2);
            hashMap.put("sim_loc", str7);
            hashMap.put("euname", str12);
            hashMap.put("w", String.valueOf(i52));
            hashMap.put("h", String.valueOf(i42));
            hashMap.put("dpi", String.valueOf(i));
            hashMap.put("density", String.valueOf(f));
            hashMap.put("operator_id", str202);
            hashMap.put("operator_name", str8);
            hashMap.put("sim_operator_id", str192);
            hashMap.put("timezone", str3);
            hashMap.put("instance_id", a32);
            hashMap.put("btms", String.valueOf(elapsedRealtime));
            hashMap.put("ains", str5);
            for (Map.Entry entry : hashMap.entrySet()) {
                mi.a("DeviceParamsDataProvider: " + ((String) entry.getKey()) + " = " + ((String) entry.getValue()));
            }
            this.b = v3.a(a32, "Android", str13, packageName, str172, str182, MyTargetVersion.VERSION);
            this.c = hashMap;
            mi.a("DeviceParamsDataProvider: Collected");
            return new HashMap(this.c);
        }
        str3 = str162;
        f = a;
        str4 = str2;
        String str1922 = "";
        telephonyManager = (TelephonyManager) context.getSystemService("phone");
        if (telephonyManager != null) {
        }
        DisplayMetrics a222 = qi.a(context);
        String str2022 = str6;
        i2 = a222.widthPixels;
        if (i2 > 0) {
        }
        i2 = 0;
        int i322 = 0;
        int i422 = i322;
        int i522 = i2;
        hashMap.put("dkm", !((context.getResources().getConfiguration().uiMode & 48) != 32) ? "1" : "0");
        if (packageManager != null) {
        }
        hashMap.put("uimd", String.valueOf(((UiModeManager) context.getSystemService("uimode")).getCurrentModeType()));
        a(hashMap, context);
        c(hashMap, context);
        b(hashMap, context);
        String a322 = a(context);
        hashMap.put("device", str10);
        hashMap.put("os", "Android");
        hashMap.put("manufacture", str11);
        hashMap.put("osver", str13);
        hashMap.put("app", packageName);
        hashMap.put("appver", str172);
        hashMap.put("appbuild", str182);
        hashMap.put(O6.q, language);
        hashMap.put("app_lang", language2);
        hashMap.put("sim_loc", str7);
        hashMap.put("euname", str12);
        hashMap.put("w", String.valueOf(i522));
        hashMap.put("h", String.valueOf(i422));
        hashMap.put("dpi", String.valueOf(i));
        hashMap.put("density", String.valueOf(f));
        hashMap.put("operator_id", str2022);
        hashMap.put("operator_name", str8);
        hashMap.put("sim_operator_id", str1922);
        hashMap.put("timezone", str3);
        hashMap.put("instance_id", a322);
        hashMap.put("btms", String.valueOf(elapsedRealtime));
        hashMap.put("ains", str5);
        while (r0.hasNext()) {
        }
        this.b = v3.a(a322, "Android", str13, packageName, str172, str182, MyTargetVersion.VERSION);
        this.c = hashMap;
        mi.a("DeviceParamsDataProvider: Collected");
        return new HashMap(this.c);
    }

    private void b(Map map, Context context) {
        List<InputMethodInfo> enabledInputMethodList;
        InputMethodManager inputMethodManager = (InputMethodManager) context.getSystemService("input_method");
        if (inputMethodManager == null || (enabledInputMethodList = inputMethodManager.getEnabledInputMethodList()) == null) {
            return;
        }
        Iterator<InputMethodInfo> it = enabledInputMethodList.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            List<InputMethodSubtype> enabledInputMethodSubtypeList = inputMethodManager.getEnabledInputMethodSubtypeList(it.next(), true);
            if (enabledInputMethodSubtypeList != null) {
                for (InputMethodSubtype inputMethodSubtype : enabledInputMethodSubtypeList) {
                    if ("keyboard".equals(inputMethodSubtype.getMode())) {
                        String locale = inputMethodSubtype.getLocale();
                        if (!TextUtils.isEmpty(locale)) {
                            if (hashSet == null) {
                                hashSet = new HashSet();
                            }
                            hashSet.add(locale.split("_", 2)[0]);
                        }
                    }
                }
            }
        }
        if (hashSet == null || hashSet.isEmpty()) {
            return;
        }
        String join = TextUtils.join(StringUtils.COMMA, hashSet);
        if (TextUtils.isEmpty(join)) {
            return;
        }
        map.put("kb_lang", join);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Map map) {
        boolean b = b();
        synchronized (this) {
            try {
                map.put("rooted", b ? "1" : "0");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void a(Map map, Context context) {
        File filesDir = context.getFilesDir();
        if (filesDir == null) {
            return;
        }
        long totalSpace = filesDir.getTotalSpace();
        long freeSpace = filesDir.getFreeSpace();
        map.put("mm_tt", String.valueOf(totalSpace));
        map.put("mm_av", String.valueOf(freeSpace));
    }
}
