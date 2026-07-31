package com.safedk.android.utils;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.os.SystemClock;
import com.pubmatic.sdk.common.POBCommonConstants;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import com.safedk.android.analytics.brandsafety.m;
import com.safedk.android.utils.Logger;
import java.io.File;
import java.sql.Timestamp;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes3.dex */
public class e {
    private static final String a = "MemoryUtils";
    private static final int b = 5000;
    private static final double c = 1.5d;
    private static final double d = 2.0d;
    private static final long e = 1024;
    private static final long f = 1048576;
    private static final long g = 1073741824;
    private static final long h = 1099511627776L;
    private static final long i = 1125899906842624L;
    private static final long j = 1152921504606846976L;
    private static long k = 0;
    private static final a l = new a();
    private static final Object m = new Object();
    private static final long n = 33554432;
    private static final long o = 67108864;

    public static long a(Context context) {
        return Runtime.getRuntime().freeMemory();
    }

    public static String a() {
        try {
            return a(a(Environment.getDataDirectory()));
        } catch (Throwable th) {
            Logger.e(a, "error in getHumanReadableFreeInternalMemory()");
            return "";
        }
    }

    public static long b() {
        return a(Environment.getDataDirectory());
    }

    private static long a(File file) {
        try {
            StatFs statFs = new StatFs(file.getAbsolutePath());
            return Build.VERSION.SDK_INT >= 18 ? statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong() : statFs.getAvailableBlocks() * statFs.getBlockSize();
        } catch (Throwable th) {
            Logger.e(a, "error in getAvailableMemoryInPath");
            return 0L;
        }
    }

    public static String a(long j2) {
        if (j2 < 1024) {
            return a(j2) + " byte";
        }
        if (j2 >= 1024 && j2 < f) {
            StringBuilder sb = new StringBuilder();
            double d2 = j2;
            Double.isNaN(d2);
            sb.append(a(d2 / 1024.0d));
            sb.append(" Kb");
            return sb.toString();
        }
        if (j2 >= f && j2 < g) {
            StringBuilder sb2 = new StringBuilder();
            double d3 = j2;
            Double.isNaN(d3);
            sb2.append(a(d3 / 1048576.0d));
            sb2.append(" Mb");
            return sb2.toString();
        }
        if (j2 >= g && j2 < h) {
            StringBuilder sb3 = new StringBuilder();
            double d4 = j2;
            Double.isNaN(d4);
            sb3.append(a(d4 / 1.073741824E9d));
            sb3.append(" Gb");
            return sb3.toString();
        }
        if (j2 >= h && j2 < i) {
            StringBuilder sb4 = new StringBuilder();
            double d5 = j2;
            Double.isNaN(d5);
            sb4.append(a(d5 / 1.099511627776E12d));
            sb4.append(" Tb");
            return sb4.toString();
        }
        if (j2 >= i && j2 < j) {
            StringBuilder sb5 = new StringBuilder();
            double d6 = j2;
            Double.isNaN(d6);
            sb5.append(a(d6 / 1.125899906842624E15d));
            sb5.append(" Pb");
            return sb5.toString();
        }
        if (j2 < j) {
            return "???";
        }
        StringBuilder sb6 = new StringBuilder();
        double d7 = j2;
        Double.isNaN(d7);
        sb6.append(a(d7 / 1.152921504606847E18d));
        sb6.append(" Eb");
        return sb6.toString();
    }

    private static String a(double d2) {
        return new DecimalFormat("#.##").format(d2);
    }

    public static long c() {
        Runtime runtime = Runtime.getRuntime();
        return runtime.maxMemory() - (runtime.totalMemory() - runtime.freeMemory());
    }

    public static void a(String str) {
        String a2 = a(str.getBytes().length);
        String a3 = a(c());
        Logger.d(a, "loaded from prefs: ", a2);
        Logger.d(a, "available heap size: ", a3);
        if (b(SafeDK.getInstance().m())) {
            Logger.e(a, "android low memory!");
        }
    }

    public static void b(String str) {
        String a2 = a(str.getBytes().length);
        String a3 = a(c());
        Logger.d(a, "saved in prefs: ", a2);
        boolean b2 = b(SafeDK.getInstance().m());
        Logger.d(a, "available heap size: ", a3);
        if (b2) {
            Logger.e(a, "android low memory!");
        }
    }

    public static void a(Map<?, ?> map, String str) {
        char c2;
        if (map == null || map.isEmpty()) {
            return;
        }
        String uuid = UUID.randomUUID().toString();
        try {
            String a2 = a(map);
            if (!CreativeInfoManager.a(a2, AdNetworkConfiguration.SDK_SPECIFIC_CACHED_CI_EXPIRATION, true)) {
                Logger.d(a, "clear CIs from memory, don't clean on CI expiration, sdk: ", a2);
                return;
            }
            long a3 = CreativeInfoManager.a(a2, AdNetworkConfiguration.SDK_SPECIFIC_CACHED_CI_THRESHOLD, SafeDK.getInstance().U());
            long a4 = CreativeInfoManager.a(a2, AdNetworkConfiguration.FULL_SCREEN_CI_MAX_AGE, 1200000L);
            long a5 = CreativeInfoManager.a(a2, AdNetworkConfiguration.BANNER_CI_MAX_AGE, 600000L);
            Logger.d(a, "clear CIs from memory for ", str, ", map size:", Integer.valueOf(map.size()), ", sdk: ", a2, ", threshold: ", Long.valueOf(a3), ", fullscreen max age: ", Long.valueOf(a4), ", banner max age: ", Long.valueOf(a5));
            c2 = 1;
            try {
                Map<BrandSafetyUtils.AdType, Integer> a6 = a(map, str, a3, a4, a5, uuid);
                for (BrandSafetyUtils.AdType adType : a6.keySet()) {
                    if (a6.get(adType) != null && r2.intValue() > a3) {
                        a(adType, map, str, a3, uuid);
                    }
                }
            } catch (Throwable th) {
                th = th;
                Object[] objArr = new Object[5];
                objArr[0] = "Exception in clear CIs from memory ";
                objArr[c2] = uuid;
                objArr[2] = " for ";
                objArr[3] = str;
                objArr[4] = th;
                Logger.d(a, objArr);
            }
        } catch (Throwable th2) {
            th = th2;
            c2 = 1;
        }
    }

    private static String a(Map<?, ?> map) {
        CreativeInfo a2;
        if (map != null && !map.isEmpty() && map.values().iterator().hasNext() && (a2 = a(map.values().iterator().next())) != null) {
            return a2.Q();
        }
        return null;
    }

    private static Map<BrandSafetyUtils.AdType, Integer> a(Map<?, ?> map, String str, long j2, long j3, long j4, String str2) {
        Iterator it;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        synchronized (map) {
            for (Map.Entry<?, ?> entry : map.entrySet()) {
                CreativeInfo a2 = a(entry.getValue());
                if (a2 != null) {
                    BrandSafetyUtils.AdType K = a2.K();
                    Integer num = (Integer) hashMap.get(K);
                    if (num == null) {
                        num = 0;
                    }
                    hashMap.put(K, Integer.valueOf(num.intValue() + 1));
                    if (a2.ac() + (K == BrandSafetyUtils.AdType.INTERSTITIAL ? j3 : j4) < elapsedRealtime) {
                        List list = (List) hashMap2.get(K);
                        if (list == null) {
                            list = new ArrayList();
                            hashMap2.put(K, list);
                        }
                        list.add(entry.getKey());
                    }
                }
            }
        }
        char c2 = 4;
        char c3 = 3;
        Logger.d(a, "clear CIs from memory (expired) ", str2, ", total CI counts: ", hashMap);
        Iterator it2 = hashMap2.keySet().iterator();
        while (it2.hasNext()) {
            BrandSafetyUtils.AdType adType = (BrandSafetyUtils.AdType) it2.next();
            Integer num2 = (Integer) hashMap.get(adType);
            if (num2 == null || num2.intValue() <= j2) {
                it = it2;
            } else {
                Object[] objArr = new Object[8];
                objArr[0] = "clear CIs from memory (expired) ";
                objArr[1] = str2;
                objArr[2] = " for ";
                objArr[c3] = str;
                objArr[c2] = ", type:";
                objArr[5] = adType;
                objArr[6] = ", total count: ";
                objArr[7] = num2;
                Logger.d(a, objArr);
                long intValue = num2.intValue() - j2;
                List list2 = (List) hashMap2.get(adType);
                if (list2 == null) {
                    it = it2;
                } else {
                    int i2 = 0;
                    while (true) {
                        it = it2;
                        if (i2 < intValue && i2 < list2.size()) {
                            Object obj = list2.get(i2);
                            synchronized (map) {
                                if (map.remove(obj) != null) {
                                    Integer valueOf = Integer.valueOf(num2.intValue() - 1);
                                    hashMap.put(adType, valueOf);
                                    Logger.d(a, "clear CIs from memory (expired) ", str2, ", removing item with key: ", obj, ", remaining items: ", valueOf);
                                    num2 = valueOf;
                                }
                            }
                            i2++;
                            it2 = it;
                        }
                    }
                }
            }
            it2 = it;
            c2 = 4;
            c3 = 3;
        }
        return hashMap;
    }

    private static void a(BrandSafetyUtils.AdType adType, Map<?, ?> map, String str, long j2, String str2) {
        Map<Long, List<Object>> a2 = a(map, adType, str2);
        int b2 = b(a2, str2);
        long j3 = b2;
        if (j3 > j2) {
            long j4 = j3 - j2;
            if (j4 > 0) {
                ArrayList arrayList = new ArrayList(a2.keySet());
                Collections.sort(arrayList);
                Logger.d(a, "clear CIs from memory (oldest) ", str2, " for ", str, ", type:", adType, ", total count: ", Integer.valueOf(b2));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    List<Object> list = a2.get((Long) it.next());
                    if (list != null) {
                        for (Object obj : list) {
                            if (map.containsKey(obj)) {
                                synchronized (map) {
                                    map.remove(obj);
                                }
                                b2--;
                                Logger.d(a, "clear CIs from memory (oldest) ", str2, ", removing item with key: ", obj, ", remaining items: ", Integer.valueOf(b2));
                                j4--;
                                if (j4 <= 0) {
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    private static CreativeInfo a(Object obj) {
        if (obj instanceof CreativeInfo) {
            return (CreativeInfo) obj;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            if (!list.isEmpty() && (list.get(0) instanceof CreativeInfo)) {
                return (CreativeInfo) list.get(0);
            }
        }
        return null;
    }

    private static int b(Map<Long, List<Object>> map, String str) {
        int i2;
        if (map == null) {
            i2 = 0;
        } else {
            Iterator<List<Object>> it = map.values().iterator();
            i2 = 0;
            while (it.hasNext()) {
                i2 += it.next().size();
            }
        }
        if (i2 > 0) {
            Logger.d(a, "clear CIs from memory (oldest) ", str, ", total values in TS map: ", Integer.valueOf(i2));
        }
        return i2;
    }

    private static Map<Long, List<Object>> a(Map<?, ?> map, BrandSafetyUtils.AdType adType, String str) {
        HashMap hashMap = new HashMap();
        synchronized (map) {
            for (Map.Entry<?, ?> entry : map.entrySet()) {
                CreativeInfo a2 = a(entry.getValue());
                if (a2 != null && ((a2.K() == null && adType == null) || (a2.K() != null && a2.K().equals(adType)))) {
                    List list = (List) hashMap.get(Long.valueOf(a2.ag()));
                    if (list == null) {
                        list = new ArrayList();
                        hashMap.put(Long.valueOf(a2.ag()), list);
                    }
                    list.add(entry.getKey());
                }
            }
        }
        if (!hashMap.isEmpty()) {
            Object[] objArr = new Object[6];
            objArr[0] = "clear CIs from memory (oldest) ";
            objArr[1] = str;
            objArr[2] = ", total keys in TS map: ";
            objArr[3] = Integer.valueOf(hashMap.size());
            objArr[4] = ", adType: ";
            objArr[5] = adType != null ? adType.name() : POBCommonConstants.NULL_VALUE;
            Logger.d(a, objArr);
        }
        return hashMap;
    }

    public static boolean a(com.safedk.android.analytics.brandsafety.c cVar) {
        if (b(SafeDK.getInstance().m())) {
            cVar.b(com.safedk.android.analytics.brandsafety.m.H, new m.a("lvl", com.safedk.android.analytics.brandsafety.m.ab));
            return true;
        }
        if (d()) {
            cVar.b(com.safedk.android.analytics.brandsafety.m.H, new m.a("lvl", "low"));
        } else if (e()) {
            cVar.b(com.safedk.android.analytics.brandsafety.m.H, new m.a("lvl", com.safedk.android.analytics.brandsafety.m.Z));
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0028, code lost:
    
        if (r0 >= (r4 * com.safedk.android.utils.e.c)) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean d() {
        a.b(SafeDK.getInstance().m());
        if (l.a != null) {
            double d2 = l.a.availMem;
            double d3 = l.a.threshold;
            Double.isNaN(d3);
        }
        return l();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0028, code lost:
    
        if (r0 >= (r4 * 2.0d)) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean e() {
        a.b(SafeDK.getInstance().m());
        if (l.a != null) {
            double d2 = l.a.availMem;
            double d3 = l.a.threshold;
            Double.isNaN(d3);
        }
        return l();
    }

    public static String f() {
        if (l.a != null) {
            return "{ available=" + a(l.a.availMem) + ", total=" + a(l.a.totalMem) + ", threshold=" + a(l.a.threshold) + ", app heap free mem =" + a(l.b) + " }";
        }
        return "{ }";
    }

    private static String a(Timestamp timestamp) {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault()).format(new Date(timestamp.getTime()));
    }

    public static String b(long j2) {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format((Object) new Date(j2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long j() {
        Runtime runtime = Runtime.getRuntime();
        long maxMemory = runtime.maxMemory() - (runtime.totalMemory() - runtime.freeMemory());
        if (maxMemory < 0) {
            return 0L;
        }
        return maxMemory;
    }

    private static boolean k() {
        long j2 = j();
        if (j2 >= n) {
            return false;
        }
        Logger.d(a, "app heap free mem critical : ", a(j2));
        return true;
    }

    private static boolean l() {
        long j2 = j();
        if (j2 >= o || j2 < n) {
            return false;
        }
        Logger.d(a, "app heap free mem low : ", a(j2));
        return true;
    }

    public static boolean b(Context context) {
        a.b(context);
        return (l.a != null && l.a.lowMemory) || k();
    }

    public static class a {
        public ActivityManager.MemoryInfo a = null;
        public long b;

        /* JADX INFO: Access modifiers changed from: private */
        public static void b(Context context) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (elapsedRealtime - e.k > 5000 && SafeDK.getInstance() != null) {
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
                e.l.a = memoryInfo;
                long unused = e.k = elapsedRealtime;
                e.l.b = e.j();
                if (memoryInfo.lowMemory) {
                    Logger.d(e.a, Logger.FeatureTag.MEMORY_LOAD, "critical RAM memory level reached: ", e.f());
                    return;
                }
                double d = memoryInfo.availMem;
                double d2 = memoryInfo.threshold;
                Double.isNaN(d2);
                if (d < d2 * e.c) {
                    Logger.d(e.a, Logger.FeatureTag.MEMORY_LOAD, "low RAM memory level reached: ", e.f());
                    return;
                }
                double d3 = memoryInfo.availMem;
                double d4 = memoryInfo.threshold;
                Double.isNaN(d4);
                if (d3 < d4 * 2.0d) {
                    Logger.d(e.a, Logger.FeatureTag.MEMORY_LOAD, "medium RAM memory level reached: ", e.f());
                } else if (e.l.b < e.n) {
                    Logger.d(e.a, Logger.FeatureTag.MEMORY_LOAD, "critical app-heap: avail app heap=", e.f());
                } else {
                    Logger.d(e.a, Logger.FeatureTag.MEMORY_LOAD, "update memory info: ", e.f());
                }
            }
        }
    }
}
