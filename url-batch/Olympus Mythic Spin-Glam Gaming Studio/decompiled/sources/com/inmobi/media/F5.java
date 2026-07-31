package com.inmobi.media;

import android.app.NotificationManager;
import android.app.usage.StorageStatsManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Environment;
import android.os.PowerManager;
import android.os.StatFs;
import android.os.SystemClock;
import android.os.storage.StorageManager;
import android.os.storage.StorageVolume;
import android.provider.Settings;
import android.view.inputmethod.InputMethodInfo;
import android.view.inputmethod.InputMethodManager;
import android.view.inputmethod.InputMethodSubtype;
import com.applovin.sdk.AppLovinEventTypes;
import com.inmobi.media.core.config.models.SignalsConfig;
import com.ironsource.X3;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import org.json.JSONArray;

/* loaded from: classes10.dex */
public final class F5 {
    public static String d;
    public static final M1 f;
    public static final M1 g;
    public static final String i;
    public static final Pair j;
    public static final String k;
    public static final String l;
    public static final String m;
    public static volatile boolean n;
    public static volatile long o;
    public static final Lazy p;
    public static final Lazy q;
    public static final Lazy r;
    public static final JSONArray s;
    public static final /* synthetic */ KProperty[] b = {Reflection.property1(new PropertyReference1Impl(F5.class, "maxDeviceVolume", "getMaxDeviceVolume()I", 0)), Reflection.property1(new PropertyReference1Impl(F5.class, "curDeviceVolume", "getCurDeviceVolume()I", 0)), Reflection.property1(new PropertyReference1Impl(F5.class, "asyncNetworkInfo", "getAsyncNetworkInfo()Ljava/lang/String;", 0))};
    public static final F5 a = new F5();
    public static long c = -1;
    public static final String e = F5.class.getSimpleName();
    public static final M1 h = new M1("", new Function0() { // from class: com.inmobi.media.F5$$ExternalSyntheticLambda13
        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public final Object mo4828invoke() {
            return F5.a();
        }
    }, true, true);

    static {
        int i2 = 15;
        f = new M1(i2, new Function0() { // from class: com.inmobi.media.F5$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                return Integer.valueOf(F5.C());
            }
        }, 12);
        g = new M1(i2, new Function0() { // from class: com.inmobi.media.F5$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                return Integer.valueOf(F5.c());
            }
        }, 8);
        String RELEASE = Build.VERSION.RELEASE;
        Intrinsics.checkNotNullExpressionValue(RELEASE, "RELEASE");
        i = RELEASE;
        int i3 = Build.VERSION.SDK_INT;
        StringBuilder sb = new StringBuilder();
        sb.append(i3);
        j = new Pair("d-api-lev", sb.toString());
        String MANUFACTURER = Build.MANUFACTURER;
        Intrinsics.checkNotNullExpressionValue(MANUFACTURER, "MANUFACTURER");
        k = MANUFACTURER;
        String MODEL = Build.MODEL;
        Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
        l = MODEL;
        String HARDWARE = Build.HARDWARE;
        Intrinsics.checkNotNullExpressionValue(HARDWARE, "HARDWARE");
        m = HARDWARE;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        p = LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.inmobi.media.F5$$ExternalSyntheticLambda14
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                return F5.D();
            }
        });
        q = LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.inmobi.media.F5$$ExternalSyntheticLambda15
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                return Boolean.valueOf(F5.d());
            }
        });
        Lazy lazy = LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.inmobi.media.F5$$ExternalSyntheticLambda16
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                return F5.b();
            }
        });
        r = lazy;
        s = (JSONArray) lazy.getValue();
    }

    public static boolean A() {
        return Build.VERSION.SDK_INT >= 26;
    }

    public static boolean B() {
        return Build.VERSION.SDK_INT >= 34;
    }

    public static final int C() {
        Context context = AbstractC4002fj.a;
        Object systemService = context != null ? context.getSystemService("audio") : null;
        AudioManager audioManager = systemService instanceof AudioManager ? (AudioManager) systemService : null;
        if (audioManager != null) {
            return audioManager.getStreamMaxVolume(3);
        }
        return 15;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:8|(3:9|10|11)|(6:13|14|15|(1:17)|18|19)|22|14|15|(0)|18|19) */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x002e, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final D5 D() {
        boolean z;
        String str;
        a.getClass();
        try {
            Context context = AbstractC4002fj.a;
            if (context == null) {
                return new D5(null, false);
            }
            PackageManager packageManager = context.getPackageManager();
            if (packageManager.getApplicationEnabledSetting("com.android.vending") >= 2) {
                z = true;
                str = packageManager.getPackageInfo("com.android.vending", 0).versionName;
                if (str == null) {
                    str = "";
                }
                return new D5(str, z);
            }
            z = false;
            str = packageManager.getPackageInfo("com.android.vending", 0).versionName;
            if (str == null) {
            }
            return new D5(str, z);
        } catch (Exception e2) {
            Lazy lazy = AbstractC3861aa.a;
            AbstractC3861aa.a(new Q2(e2));
            return new D5(null, false);
        }
    }

    public static void E() {
        Runnable runnable = new Runnable() { // from class: com.inmobi.media.F5$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                F5.F();
            }
        };
        Context context = AbstractC4002fj.a;
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        AbstractC4002fj.g.submit(runnable);
    }

    public static final void F() {
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getAbsolutePath());
            StatFs statFs2 = new StatFs(Environment.getExternalStorageDirectory().getAbsolutePath());
            long availableBytes = statFs.getAvailableBytes();
            long availableBytes2 = statFs2.getAvailableBytes() + availableBytes;
            if (Environment.getExternalStorageState().equals("mounted")) {
                availableBytes = availableBytes2;
            }
            c = availableBytes / 1048576;
        } catch (Exception e2) {
            AbstractC4361t9.a(e2);
        }
    }

    public static void G() {
        Runnable runnable = new Runnable() { // from class: com.inmobi.media.F5$$ExternalSyntheticLambda10
            @Override // java.lang.Runnable
            public final void run() {
                F5.H();
            }
        };
        Context context = AbstractC4002fj.a;
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        AbstractC4002fj.g.submit(runnable);
    }

    public static final void H() {
        long freeBytes;
        Context context = AbstractC4002fj.a;
        if (context == null) {
            return;
        }
        Object systemService = context.getSystemService("storagestats");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.usage.StorageStatsManager");
        StorageStatsManager m2 = F5$$ExternalSyntheticApiModelOutline0.m(systemService);
        Object systemService2 = context.getSystemService(X3.a.k);
        Intrinsics.checkNotNull(systemService2, "null cannot be cast to non-null type android.os.storage.StorageManager");
        List<StorageVolume> storageVolumes = ((StorageManager) systemService2).getStorageVolumes();
        Intrinsics.checkNotNullExpressionValue(storageVolumes, "getStorageVolumes(...)");
        long j2 = 0;
        for (StorageVolume storageVolume : storageVolumes) {
            try {
                UUID fromString = UUID.fromString(String.valueOf(storageVolume.getUuid()));
                Intrinsics.checkNotNull(fromString);
                if (storageVolume.getState().equals("mounted")) {
                    try {
                        freeBytes = m2.getFreeBytes(fromString);
                        j2 += freeBytes;
                    } catch (Exception e2) {
                        Q2 q2 = new Q2(e2);
                        Lazy lazy = AbstractC3861aa.a;
                        AbstractC3861aa.a(q2);
                    }
                }
            } catch (Exception unused) {
            }
        }
        c = j2 / 1048576;
    }

    public static void I() {
        Runnable runnable = new Runnable() { // from class: com.inmobi.media.F5$$ExternalSyntheticLambda9
            @Override // java.lang.Runnable
            public final void run() {
                F5.J();
            }
        };
        Context context = AbstractC4002fj.a;
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        AbstractC4002fj.g.submit(runnable);
    }

    public static final void J() {
        UUID storageUuid;
        long freeBytes;
        Context context = AbstractC4002fj.a;
        if (context == null) {
            return;
        }
        Object systemService = context.getSystemService("storagestats");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.usage.StorageStatsManager");
        StorageStatsManager m2 = F5$$ExternalSyntheticApiModelOutline0.m(systemService);
        Object systemService2 = context.getSystemService(X3.a.k);
        Intrinsics.checkNotNull(systemService2, "null cannot be cast to non-null type android.os.storage.StorageManager");
        List<StorageVolume> storageVolumes = ((StorageManager) systemService2).getStorageVolumes();
        Intrinsics.checkNotNullExpressionValue(storageVolumes, "getStorageVolumes(...)");
        long j2 = 0;
        for (StorageVolume storageVolume : storageVolumes) {
            storageUuid = storageVolume.getStorageUuid();
            if (storageUuid != null && storageVolume.getState().equals("mounted")) {
                try {
                    freeBytes = m2.getFreeBytes(storageUuid);
                    j2 += freeBytes;
                } catch (Exception e2) {
                    Q2 q2 = new Q2(e2);
                    Lazy lazy = AbstractC3861aa.a;
                    AbstractC3861aa.a(q2);
                }
            }
        }
        c = j2 / 1048576;
    }

    public static void K() {
        Runnable runnable = new Runnable() { // from class: com.inmobi.media.F5$$ExternalSyntheticLambda8
            @Override // java.lang.Runnable
            public final void run() {
                F5.L();
            }
        };
        Context context = AbstractC4002fj.a;
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        AbstractC4002fj.g.submit(runnable);
    }

    public static final void L() {
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getAbsolutePath());
            StatFs statFs2 = new StatFs(Environment.getExternalStorageDirectory().getAbsolutePath());
            float blockCountLong = statFs.getBlockCountLong() * statFs.getBlockSizeLong();
            float blockCountLong2 = (statFs2.getBlockCountLong() * statFs2.getBlockSizeLong()) + blockCountLong;
            if (Environment.getExternalStorageState().equals("mounted")) {
                blockCountLong = blockCountLong2;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(blockCountLong / 1048576);
            d = sb.toString();
        } catch (Exception e2) {
            AbstractC4361t9.a(e2);
        }
    }

    public static void M() {
        Runnable runnable = new Runnable() { // from class: com.inmobi.media.F5$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                F5.N();
            }
        };
        Context context = AbstractC4002fj.a;
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        AbstractC4002fj.g.submit(runnable);
    }

    public static final void N() {
        UUID uuid;
        long totalBytes;
        Context context = AbstractC4002fj.a;
        if (context == null) {
            return;
        }
        Object systemService = context.getSystemService("storagestats");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.usage.StorageStatsManager");
        StorageStatsManager m2 = F5$$ExternalSyntheticApiModelOutline0.m(systemService);
        Object systemService2 = context.getSystemService(X3.a.k);
        Intrinsics.checkNotNull(systemService2, "null cannot be cast to non-null type android.os.storage.StorageManager");
        List<StorageVolume> storageVolumes = ((StorageManager) systemService2).getStorageVolumes();
        Intrinsics.checkNotNullExpressionValue(storageVolumes, "getStorageVolumes(...)");
        long j2 = 0;
        for (StorageVolume storageVolume : storageVolumes) {
            String uuid2 = storageVolume.getUuid();
            if (uuid2 == null) {
                uuid = StorageManager.UUID_DEFAULT;
                Intrinsics.checkNotNull(uuid);
            } else {
                try {
                    uuid = UUID.fromString(uuid2);
                    Intrinsics.checkNotNull(uuid);
                } catch (Exception unused) {
                }
            }
            if (storageVolume.getState().equals("mounted")) {
                try {
                    totalBytes = m2.getTotalBytes(uuid);
                    j2 += totalBytes;
                } catch (Exception e2) {
                    Q2 q2 = new Q2(e2);
                    Lazy lazy = AbstractC3861aa.a;
                    AbstractC3861aa.a(q2);
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(j2 / 1048576);
        d = sb.toString();
    }

    public static void O() {
        Runnable runnable = new Runnable() { // from class: com.inmobi.media.F5$$ExternalSyntheticLambda7
            @Override // java.lang.Runnable
            public final void run() {
                F5.P();
            }
        };
        Context context = AbstractC4002fj.a;
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        AbstractC4002fj.g.submit(runnable);
    }

    public static final void P() {
        UUID storageUuid;
        long totalBytes;
        Context context = AbstractC4002fj.a;
        if (context == null) {
            return;
        }
        Object systemService = context.getSystemService("storagestats");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.usage.StorageStatsManager");
        StorageStatsManager m2 = F5$$ExternalSyntheticApiModelOutline0.m(systemService);
        Object systemService2 = context.getSystemService(X3.a.k);
        Intrinsics.checkNotNull(systemService2, "null cannot be cast to non-null type android.os.storage.StorageManager");
        List<StorageVolume> storageVolumes = ((StorageManager) systemService2).getStorageVolumes();
        Intrinsics.checkNotNullExpressionValue(storageVolumes, "getStorageVolumes(...)");
        long j2 = 0;
        for (StorageVolume storageVolume : storageVolumes) {
            storageUuid = storageVolume.getStorageUuid();
            if (storageUuid != null && storageVolume.getState().equals("mounted")) {
                try {
                    totalBytes = m2.getTotalBytes(storageUuid);
                    j2 += totalBytes;
                } catch (Exception e2) {
                    Q2 q2 = new Q2(e2);
                    Lazy lazy = AbstractC3861aa.a;
                    AbstractC3861aa.a(q2);
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(j2 / 1048576);
        d = sb.toString();
    }

    public static final int c() {
        Context context = AbstractC4002fj.a;
        Object systemService = context != null ? context.getSystemService("audio") : null;
        AudioManager audioManager = systemService instanceof AudioManager ? (AudioManager) systemService : null;
        if (audioManager != null) {
            return audioManager.getStreamVolume(3);
        }
        return 15;
    }

    public static final boolean d() {
        a.getClass();
        try {
            String FINGERPRINT = Build.FINGERPRINT;
            Intrinsics.checkNotNullExpressionValue(FINGERPRINT, "FINGERPRINT");
            Locale ROOT = Locale.ROOT;
            Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
            String lowerCase = FINGERPRINT.toLowerCase(ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            String MODEL = Build.MODEL;
            Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
            Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
            String lowerCase2 = MODEL.toLowerCase(ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
            String MANUFACTURER = Build.MANUFACTURER;
            Intrinsics.checkNotNullExpressionValue(MANUFACTURER, "MANUFACTURER");
            Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
            String lowerCase3 = MANUFACTURER.toLowerCase(ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase3, "toLowerCase(...)");
            String BRAND = Build.BRAND;
            Intrinsics.checkNotNullExpressionValue(BRAND, "BRAND");
            Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
            String lowerCase4 = BRAND.toLowerCase(ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase4, "toLowerCase(...)");
            String DEVICE = Build.DEVICE;
            Intrinsics.checkNotNullExpressionValue(DEVICE, "DEVICE");
            Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
            String lowerCase5 = DEVICE.toLowerCase(ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase5, "toLowerCase(...)");
            String HARDWARE = Build.HARDWARE;
            Intrinsics.checkNotNullExpressionValue(HARDWARE, "HARDWARE");
            Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
            String lowerCase6 = HARDWARE.toLowerCase(ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase6, "toLowerCase(...)");
            String PRODUCT = Build.PRODUCT;
            Intrinsics.checkNotNullExpressionValue(PRODUCT, "PRODUCT");
            Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
            String lowerCase7 = PRODUCT.toLowerCase(ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase7, "toLowerCase(...)");
            if (StringsKt.startsWith$default(lowerCase, "generic", false, 2, (Object) null) || StringsKt.startsWith$default(lowerCase, "unknown", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) lowerCase2, (CharSequence) "google_sdk", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) lowerCase2, (CharSequence) "emu", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) lowerCase2, (CharSequence) "Android SDK built for x86", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) lowerCase3, (CharSequence) "Genymotion", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) lowerCase7, (CharSequence) "sdk", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) lowerCase7, (CharSequence) "vbox86p", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) lowerCase7, (CharSequence) "emu", false, 2, (Object) null) || Intrinsics.areEqual(lowerCase6, "goldfish") || Intrinsics.areEqual(lowerCase6, "ranchu") || Intrinsics.areEqual(lowerCase6, "vbox86p") || StringsKt.contains$default((CharSequence) lowerCase6, (CharSequence) "nox", false, 2, (Object) null)) {
                return true;
            }
            if (StringsKt.startsWith$default(lowerCase4, "generic", false, 2, (Object) null)) {
                if (StringsKt.startsWith$default(lowerCase5, "generic", false, 2, (Object) null)) {
                    return true;
                }
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public static String e() {
        Context context = AbstractC4002fj.a;
        if (context == null || !AbstractC3867ag.a(context, "android.permission.ACCESS_NETWORK_STATE")) {
            return "";
        }
        Object systemService = context.getSystemService("connectivity");
        NetworkInfo networkInfo = null;
        ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
        if (connectivityManager == null) {
            return "";
        }
        try {
            networkInfo = connectivityManager.getActiveNetworkInfo();
        } catch (Exception e2) {
            Intrinsics.checkNotNullExpressionValue(F5.class.getSimpleName(), "getSimpleName(...)");
            e2.toString();
        }
        return networkInfo == null ? "" : Build.VERSION.SDK_INT < 28 ? a(networkInfo) : a(connectivityManager, networkInfo);
    }

    public static Pair f() {
        Context context = AbstractC4002fj.a;
        if (context == null) {
            return null;
        }
        return Settings.Global.getInt(context.getContentResolver(), "airplane_mode_on", 0) != 0 ? new Pair("d-airplane-m", "1") : new Pair("d-airplane-m", "0");
    }

    public static final String g() {
        F5 f5 = a;
        f5.getClass();
        String str = (String) h.getValue(f5, b[2]);
        return StringsKt.startsWith$default(str, "0", false, 2, (Object) null) ? "carrier" : StringsKt.startsWith$default(str, "1", false, 2, (Object) null) ? com.ironsource.T3.b : "NIL";
    }

    public static Pair h() {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            I();
        } else if (i2 >= 26) {
            G();
        } else {
            E();
        }
        long j2 = c;
        if (j2 != -1) {
            return new Pair("d-av-disk", String.valueOf(j2));
        }
        return null;
    }

    public static Pair i() {
        Context context = AbstractC4002fj.a;
        Integer num = null;
        if (context == null) {
            return null;
        }
        if (N3.a(context, (BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED")) != null) {
            num = Integer.valueOf((int) ((r0.getIntExtra(AppLovinEventTypes.USER_COMPLETED_LEVEL, -1) * 100) / r0.getIntExtra("scale", -1)));
        }
        StringBuilder sb = new StringBuilder();
        sb.append(num);
        return new Pair("d-bat-lev", sb.toString());
    }

    public static Pair j() {
        Context context = AbstractC4002fj.a;
        if (context == null) {
            return null;
        }
        Object systemService = context.getSystemService("power");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.os.PowerManager");
        return ((PowerManager) systemService).isPowerSaveMode() ? new Pair("d-bat-sav", "1") : new Pair("d-bat-sav", "0");
    }

    public static Pair k() {
        String str;
        int i2 = Resources.getSystem().getConfiguration().uiMode & 48;
        if (i2 == 16) {
            str = "0";
        } else {
            if (i2 != 32) {
                return null;
            }
            str = "1";
        }
        return new Pair("d-drk-m", str);
    }

    public static Pair l() {
        Context context = AbstractC4002fj.a;
        if (context == null) {
            return null;
        }
        Object systemService = context.getSystemService("notification");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        try {
            int currentInterruptionFilter = ((NotificationManager) systemService).getCurrentInterruptionFilter();
            return new Pair("d-dnd", (currentInterruptionFilter == 2 || currentInterruptionFilter == 3 || currentInterruptionFilter == 4) ? "1" : "0");
        } catch (Exception unused) {
            return null;
        }
    }

    public static Pair m() {
        ArrayList arrayList = new ArrayList();
        Context context = AbstractC4002fj.a;
        if (context == null) {
            return null;
        }
        Object systemService = context.getSystemService("input_method");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        InputMethodManager inputMethodManager = (InputMethodManager) systemService;
        List<InputMethodInfo> enabledInputMethodList = inputMethodManager.getEnabledInputMethodList();
        Intrinsics.checkNotNullExpressionValue(enabledInputMethodList, "getEnabledInputMethodList(...)");
        Iterator<InputMethodInfo> it = enabledInputMethodList.iterator();
        while (it.hasNext()) {
            List<InputMethodSubtype> enabledInputMethodSubtypeList = inputMethodManager.getEnabledInputMethodSubtypeList(it.next(), true);
            Intrinsics.checkNotNullExpressionValue(enabledInputMethodSubtypeList, "getEnabledInputMethodSubtypeList(...)");
            for (InputMethodSubtype inputMethodSubtype : enabledInputMethodSubtypeList) {
                if (Intrinsics.areEqual(inputMethodSubtype.getMode(), "keyboard")) {
                    String languageTag = inputMethodSubtype.getLanguageTag();
                    Intrinsics.checkNotNullExpressionValue(languageTag, "getLanguageTag(...)");
                    String language = languageTag.length() > 0 ? Locale.forLanguageTag(inputMethodSubtype.getLanguageTag()).getLanguage() : new Locale(inputMethodSubtype.getLocale()).getLanguage();
                    Intrinsics.checkNotNull(language);
                    if (language.length() > 0) {
                        arrayList.add(language);
                    }
                }
            }
        }
        return new Pair("d-key-lang", new JSONArray((Collection) arrayList).toString());
    }

    public static int n() {
        String e2 = e();
        if (StringsKt.startsWith$default(e2, "0", false, 2, (Object) null)) {
            return 0;
        }
        return StringsKt.startsWith$default(e2, "1", false, 2, (Object) null) ? 1 : 2;
    }

    public static final String o() {
        a.getClass();
        int n2 = n();
        return n2 != 0 ? n2 != 1 ? "NIL" : com.ironsource.T3.b : "carrier";
    }

    public static HashMap p() {
        C4277q4 c4277q4 = AbstractC4015g4.a;
        Intrinsics.checkNotNullParameter(SignalsConfig.class, "clazz");
        boolean enabled = ((SignalsConfig) AbstractC4015g4.a.a(SignalsConfig.class)).getBts().getEnabled();
        HashMap hashMap = new HashMap();
        if (enabled) {
            hashMap.put("d-t1", s.toString());
            return hashMap;
        }
        String TAG = e;
        Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
        return hashMap;
    }

    public static Pair q() {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            O();
        } else if (i2 >= 26) {
            M();
        } else {
            K();
        }
        String str = d;
        if (str != null) {
            return new Pair("d-tot-disk", str);
        }
        return null;
    }

    public static boolean r() {
        return Build.VERSION.SDK_INT >= 28;
    }

    public static boolean s() {
        return Build.VERSION.SDK_INT >= 29;
    }

    public static boolean t() {
        return Build.VERSION.SDK_INT >= 30;
    }

    public static boolean u() {
        return Build.VERSION.SDK_INT >= 31;
    }

    public static boolean v() {
        return Build.VERSION.SDK_INT >= 36;
    }

    public static boolean w() {
        return true;
    }

    public static boolean x() {
        return true;
    }

    public static boolean y() {
        return true;
    }

    public static boolean z() {
        return true;
    }

    public final int a(Context context, boolean z) {
        if (context == null || z) {
            return 0;
        }
        M1 m1 = g;
        KProperty[] kPropertyArr = b;
        int intValue = ((Number) m1.getValue(this, kPropertyArr[1])).intValue();
        int intValue2 = ((Number) f.getValue(this, kPropertyArr[0])).intValue();
        if (intValue2 > 0) {
            return (intValue * 100) / intValue2;
        }
        Intrinsics.checkNotNullExpressionValue(F5.class.getSimpleName(), "getSimpleName(...)");
        return 0;
    }

    public final HashMap b(boolean z) {
        int i2;
        HashMap hashMap = new HashMap();
        hashMap.put("os-v", i);
        hashMap.put("d-brand-name", Build.BRAND);
        hashMap.put("d-manufacturer-name", k);
        hashMap.put("d-model-name", l);
        hashMap.put("d-nettype-raw", e());
        String locale = Locale.getDefault().toString();
        Intrinsics.checkNotNullExpressionValue(locale, "toString(...)");
        hashMap.put("d-localization", locale);
        String language = Locale.getDefault().getLanguage();
        Intrinsics.checkNotNullExpressionValue(language, "getLanguage(...)");
        hashMap.put("d-language", language);
        hashMap.put("d-devicemachinehw", m);
        if (System.currentTimeMillis() >= o) {
            C4277q4 c4277q4 = AbstractC4015g4.a;
            Intrinsics.checkNotNullParameter(SignalsConfig.class, "clazz");
            SignalsConfig signalsConfig = (SignalsConfig) AbstractC4015g4.a.a(SignalsConfig.class);
            o = (signalsConfig.getLowMemoryFreq() * 1000) + System.currentTimeMillis();
            BuildersKt__Builders_commonKt.launch$default(L9.c, null, null, new E5(null), 3, null);
        }
        hashMap.put("d-lowmem", String.valueOf(n));
        try {
            i2 = Runtime.getRuntime().availableProcessors();
        } catch (Exception e2) {
            Lazy lazy = AbstractC3861aa.a;
            AbstractC4361t9.a(e2);
            i2 = 0;
        }
        hashMap.put("d-pcount", String.valueOf(i2));
        hashMap.put("d-emu", String.valueOf(((Boolean) q.getValue()).booleanValue()));
        Lazy lazy2 = p;
        hashMap.put("d-ps-disabled", String.valueOf(((D5) lazy2.getValue()).a));
        String str = ((D5) lazy2.getValue()).b;
        if (str == null) {
            str = "N/A";
        }
        hashMap.put("d-ps-v", str);
        hashMap.put("d-media-volume", String.valueOf(a(AbstractC4002fj.a, z)));
        return hashMap;
    }

    public static final String a() {
        a.getClass();
        return e();
    }

    public static String a(NetworkInfo networkInfo) {
        int type = networkInfo.getType();
        int subtype = networkInfo.getSubtype();
        if (type != 0) {
            if (type != 1) {
                return String.valueOf(type);
            }
            return "1";
        }
        return type + com.safedk.android.analytics.brandsafety.m.ad + subtype;
    }

    public static String a(ConnectivityManager connectivityManager, NetworkInfo networkInfo) {
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
        if (networkCapabilities == null) {
            return "";
        }
        if (networkCapabilities.hasTransport(0)) {
            return "0|" + networkInfo.getSubtype();
        }
        if (networkCapabilities.hasTransport(1)) {
            return "1";
        }
        if (networkCapabilities.hasTransport(2)) {
            return "7";
        }
        if (networkCapabilities.hasTransport(3)) {
            return "9";
        }
        if (networkCapabilities.hasTransport(4)) {
            return "17";
        }
        if (networkCapabilities.hasTransport(5)) {
            return "10";
        }
        return networkCapabilities.hasTransport(6) ? "11" : "8";
    }

    public final HashMap a(boolean z) {
        HashMap hashMap = new HashMap();
        try {
            hashMap.putAll(b(z));
            hashMap.putAll(p());
            return hashMap;
        } catch (Exception e2) {
            Intrinsics.checkNotNullExpressionValue(F5.class.getSimpleName(), "getSimpleName(...)");
            e2.getMessage();
            return hashMap;
        }
    }

    public static final JSONArray b() {
        a.getClass();
        Context context = AbstractC4002fj.a;
        if (context != null) {
            try {
                C4277q4 c4277q4 = AbstractC4015g4.a;
                Intrinsics.checkNotNullParameter(SignalsConfig.class, "clazz");
                SignalsConfig signalsConfig = (SignalsConfig) AbstractC4015g4.a.a(SignalsConfig.class);
                ConcurrentHashMap concurrentHashMap = Qa.b;
                Qa a2 = Pa.a(context, "boot_time");
                Intrinsics.checkNotNullParameter("bt", "key");
                JSONArray jSONArray = new JSONArray(a2.a.getString("bt", "[]"));
                long currentTimeMillis = System.currentTimeMillis() - SystemClock.elapsedRealtime();
                Long valueOf = jSONArray.length() > 0 ? Long.valueOf(jSONArray.optLong(jSONArray.length() - 1, 0L)) : null;
                if (valueOf != null) {
                    if (Math.abs(valueOf.longValue() - currentTimeMillis) <= signalsConfig.getBts().getThreshold() * 1000) {
                        return jSONArray;
                    }
                }
                jSONArray.put(currentTimeMillis);
                while (jSONArray.length() > 0 && jSONArray.length() > signalsConfig.getBts().getMaxEntries()) {
                    jSONArray.remove(0);
                }
                a2.a("bt", jSONArray.toString(), true);
                return jSONArray;
            } catch (Exception e2) {
                Lazy lazy = AbstractC3861aa.a;
                AbstractC4361t9.a(e2);
            }
        }
        return new JSONArray();
    }
}
