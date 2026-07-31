package com.my.target;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.SystemClock;
import android.telephony.CellIdentity;
import android.telephony.CellIdentityCdma;
import android.telephony.CellIdentityGsm;
import android.telephony.CellIdentityLte;
import android.telephony.CellIdentityNr;
import android.telephony.CellIdentityTdscdma;
import android.telephony.CellIdentityWcdma;
import android.telephony.CellInfo;
import android.telephony.CellInfoCdma;
import android.telephony.CellInfoGsm;
import android.telephony.CellInfoLte;
import android.telephony.CellInfoWcdma;
import android.telephony.CellLocation;
import android.telephony.CellSignalStrength;
import android.telephony.CellSignalStrengthCdma;
import android.telephony.CellSignalStrengthGsm;
import android.telephony.CellSignalStrengthLte;
import android.telephony.CellSignalStrengthNr;
import android.telephony.CellSignalStrengthTdscdma;
import android.telephony.CellSignalStrengthWcdma;
import android.telephony.TelephonyManager;
import android.telephony.gsm.GsmCellLocation;
import com.ironsource.T3;
import com.my.target.common.MyTargetConfig;
import com.my.target.q4;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes14.dex */
final class q4 extends t4 {
    private d a = new d(new HashMap(), 0);

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    private static class a implements b {
        private final String a = "cdma";
        private final int b;
        private final int c;
        private final int d;
        private final int e;
        private final int f;
        private final int g;
        private final int h;
        private final int i;
        private final int j;
        private final int k;
        private final int l;
        private final int m;
        private final int n;
        private final int o;
        private final int p;

        a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15) {
            this.b = i;
            this.c = i2;
            this.d = i3;
            this.e = i4;
            this.f = i5;
            this.g = i6;
            this.h = i7;
            this.i = i8;
            this.j = i9;
            this.k = i10;
            this.l = i11;
            this.m = i12;
            this.n = i13;
            this.o = i14;
            this.p = i15;
        }

        @Override // com.my.target.q4.b
        public String a() {
            return this.a + StringUtils.COMMA + this.b + StringUtils.COMMA + this.c + StringUtils.COMMA + this.d + StringUtils.COMMA + this.e + StringUtils.COMMA + this.f + StringUtils.COMMA + this.g + StringUtils.COMMA + this.h + StringUtils.COMMA + this.i + StringUtils.COMMA + this.j + StringUtils.COMMA + this.k + StringUtils.COMMA + this.l + StringUtils.COMMA + this.m + StringUtils.COMMA + this.n + StringUtils.COMMA + this.o + StringUtils.COMMA + this.p;
        }
    }

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    private interface b {
        String a();
    }

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    private static final class c {
        List a;

        c(Context context) {
            b b;
            this.a = null;
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (telephonyManager == null) {
                return;
            }
            try {
                boolean z = Build.VERSION.SDK_INT < 29 && t4.a("android.permission.ACCESS_COARSE_LOCATION", context);
                boolean a = t4.a("android.permission.ACCESS_FINE_LOCATION", context);
                if (z || a) {
                    List a2 = a(telephonyManager);
                    this.a = a2;
                    if ((a2 == null || a2.isEmpty()) && (b = b(telephonyManager)) != null) {
                        ArrayList arrayList = new ArrayList();
                        this.a = arrayList;
                        arrayList.add(b);
                    }
                }
            } catch (Throwable th) {
                mi.a("EnvironmentParamsDataProvider$CellEnvironment: Environment provider error - " + th.getMessage());
            }
        }

        static List a(TelephonyManager telephonyManager) {
            b eVar;
            CellIdentityTdscdma cellIdentity;
            CellSignalStrength cellSignalStrength;
            int cid;
            int lac;
            String mccString;
            String mncString;
            int level;
            int dbm;
            int asuLevel;
            int uarfcn;
            CellIdentity cellIdentity2;
            CellSignalStrength cellSignalStrength2;
            long nci;
            String mccString2;
            String mncString2;
            int level2;
            int dbm2;
            int asuLevel2;
            int nrarfcn;
            int tac;
            List<CellInfo> allCellInfo = telephonyManager.getAllCellInfo();
            if (allCellInfo == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (CellInfo cellInfo : allCellInfo) {
                if (cellInfo.isRegistered()) {
                    if (cellInfo instanceof CellInfoLte) {
                        CellInfoLte cellInfoLte = (CellInfoLte) cellInfo;
                        CellIdentityLte cellIdentity3 = cellInfoLte.getCellIdentity();
                        CellSignalStrengthLte cellSignalStrength3 = cellInfoLte.getCellSignalStrength();
                        long ci = cellIdentity3.getCi();
                        int i = Build.VERSION.SDK_INT;
                        eVar = new e("lte", ci, Integer.MAX_VALUE, i >= 28 ? cellIdentity3.getMccString() : String.valueOf(cellIdentity3.getMcc()), i >= 28 ? cellIdentity3.getMncString() : String.valueOf(cellIdentity3.getMnc()), cellSignalStrength3.getLevel(), cellSignalStrength3.getDbm(), cellSignalStrength3.getAsuLevel(), cellSignalStrength3.getTimingAdvance(), cellIdentity3.getEarfcn(), Integer.MAX_VALUE, Integer.MAX_VALUE, cellIdentity3.getTac());
                    } else if (cellInfo instanceof CellInfoGsm) {
                        CellInfoGsm cellInfoGsm = (CellInfoGsm) cellInfo;
                        CellIdentityGsm cellIdentity4 = cellInfoGsm.getCellIdentity();
                        CellSignalStrengthGsm cellSignalStrength4 = cellInfoGsm.getCellSignalStrength();
                        long cid2 = cellIdentity4.getCid();
                        int lac2 = cellIdentity4.getLac();
                        int i2 = Build.VERSION.SDK_INT;
                        eVar = new e("gsm", cid2, lac2, i2 >= 28 ? cellIdentity4.getMccString() : String.valueOf(cellIdentity4.getMcc()), i2 >= 28 ? cellIdentity4.getMncString() : String.valueOf(cellIdentity4.getMnc()), cellSignalStrength4.getLevel(), cellSignalStrength4.getDbm(), cellSignalStrength4.getAsuLevel(), i2 >= 26 ? cellSignalStrength4.getTimingAdvance() : Integer.MAX_VALUE, Integer.MAX_VALUE, cellIdentity4.getBsic(), cellIdentity4.getPsc(), Integer.MAX_VALUE);
                    } else if (cellInfo instanceof CellInfoWcdma) {
                        CellInfoWcdma cellInfoWcdma = (CellInfoWcdma) cellInfo;
                        CellIdentityWcdma cellIdentity5 = cellInfoWcdma.getCellIdentity();
                        CellSignalStrengthWcdma cellSignalStrength5 = cellInfoWcdma.getCellSignalStrength();
                        long cid3 = cellIdentity5.getCid();
                        int lac3 = cellIdentity5.getLac();
                        int i3 = Build.VERSION.SDK_INT;
                        eVar = new e("wcdma", cid3, lac3, i3 >= 28 ? cellIdentity5.getMccString() : String.valueOf(cellIdentity5.getMcc()), i3 >= 28 ? cellIdentity5.getMncString() : String.valueOf(cellIdentity5.getMnc()), cellSignalStrength5.getLevel(), cellSignalStrength5.getDbm(), cellSignalStrength5.getAsuLevel(), Integer.MAX_VALUE, cellIdentity5.getUarfcn(), Integer.MAX_VALUE, cellIdentity5.getPsc(), Integer.MAX_VALUE);
                    } else if (cellInfo instanceof CellInfoCdma) {
                        CellInfoCdma cellInfoCdma = (CellInfoCdma) cellInfo;
                        CellIdentityCdma cellIdentity6 = cellInfoCdma.getCellIdentity();
                        CellSignalStrengthCdma cellSignalStrength6 = cellInfoCdma.getCellSignalStrength();
                        eVar = new a(cellIdentity6.getNetworkId(), cellIdentity6.getSystemId(), cellIdentity6.getBasestationId(), cellIdentity6.getLatitude(), cellIdentity6.getLongitude(), cellSignalStrength6.getCdmaLevel(), cellSignalStrength6.getLevel(), cellSignalStrength6.getEvdoLevel(), cellSignalStrength6.getAsuLevel(), cellSignalStrength6.getCdmaDbm(), cellSignalStrength6.getDbm(), cellSignalStrength6.getEvdoDbm(), cellSignalStrength6.getEvdoEcio(), cellSignalStrength6.getCdmaEcio(), cellSignalStrength6.getEvdoSnr());
                    } else {
                        int i4 = Build.VERSION.SDK_INT;
                        if (i4 >= 30 && q4$c$$ExternalSyntheticApiModelOutline29.m(cellInfo)) {
                            cellIdentity2 = cellInfo.getCellIdentity();
                            CellIdentityNr m = q4$c$$ExternalSyntheticApiModelOutline31.m(cellIdentity2);
                            cellSignalStrength2 = cellInfo.getCellSignalStrength();
                            CellSignalStrengthNr m2 = q4$c$$ExternalSyntheticApiModelOutline2.m(cellSignalStrength2);
                            nci = m.getNci();
                            mccString2 = m.getMccString();
                            mncString2 = m.getMncString();
                            level2 = m2.getLevel();
                            dbm2 = m2.getDbm();
                            asuLevel2 = m2.getAsuLevel();
                            nrarfcn = m.getNrarfcn();
                            tac = m.getTac();
                            eVar = new e("nr", nci, Integer.MAX_VALUE, mccString2, mncString2, level2, dbm2, asuLevel2, Integer.MAX_VALUE, nrarfcn, Integer.MAX_VALUE, Integer.MAX_VALUE, tac);
                        } else if (i4 >= 30 && q4$c$$ExternalSyntheticApiModelOutline12.m(cellInfo)) {
                            cellIdentity = q4$c$$ExternalSyntheticApiModelOutline13.m(cellInfo).getCellIdentity();
                            cellSignalStrength = cellInfo.getCellSignalStrength();
                            CellSignalStrengthTdscdma m3 = q4$c$$ExternalSyntheticApiModelOutline15.m(cellSignalStrength);
                            cid = cellIdentity.getCid();
                            lac = cellIdentity.getLac();
                            mccString = cellIdentity.getMccString();
                            mncString = cellIdentity.getMncString();
                            level = m3.getLevel();
                            dbm = m3.getDbm();
                            asuLevel = m3.getAsuLevel();
                            uarfcn = cellIdentity.getUarfcn();
                            eVar = new e("tdscdma", cid, lac, mccString, mncString, level, dbm, asuLevel, Integer.MAX_VALUE, uarfcn, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
                        }
                    }
                    arrayList.add(eVar);
                }
            }
            return arrayList;
        }

        static b b(TelephonyManager telephonyManager) {
            String str;
            String str2;
            String str3;
            CellLocation cellLocation = telephonyManager.getCellLocation();
            String str4 = null;
            if (!(cellLocation instanceof GsmCellLocation)) {
                return null;
            }
            GsmCellLocation gsmCellLocation = (GsmCellLocation) cellLocation;
            String networkOperator = telephonyManager.getNetworkOperator();
            if (networkOperator == null || networkOperator.length() == 0) {
                str = null;
                str2 = null;
            } else {
                try {
                    str3 = networkOperator.substring(0, 3);
                } catch (Throwable unused) {
                    str3 = null;
                }
                try {
                    str4 = networkOperator.substring(3);
                } catch (Throwable unused2) {
                    mi.a("EnvironmentParamsDataProvider$CellEnvironment: Unable to substring network operator " + networkOperator);
                    str2 = str4;
                    str = str3;
                    return new e("gsm", gsmCellLocation.getCid(), gsmCellLocation.getLac(), str, str2, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
                }
                str2 = str4;
                str = str3;
            }
            return new e("gsm", gsmCellLocation.getCid(), gsmCellLocation.getLac(), str, str2, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
        }
    }

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    static final class d {
        private final Map a;
        private final long b;

        d(Map map, long j) {
            this.a = map;
            this.b = j;
        }

        long a() {
            return this.b;
        }

        Map b() {
            return new HashMap(this.a);
        }
    }

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    private static class e implements b {
        private final String a;
        private final String b;
        private final String c;
        private final long d;
        private final int e;
        private final int f;
        private final int g;
        private final int h;
        private final int i;
        private final int j;
        private final int k;
        private final int l;
        private final int m;

        e(String str, long j, int i, String str2, String str3, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
            this.a = str;
            this.d = j;
            this.e = i;
            this.b = str2 == null ? String.valueOf(Integer.MAX_VALUE) : str2;
            this.c = str3 == null ? String.valueOf(Integer.MAX_VALUE) : str3;
            this.f = i2;
            this.g = i3;
            this.h = i4;
            this.i = i5;
            this.j = i6;
            this.k = i7;
            this.l = i8;
            this.m = i9;
        }

        @Override // com.my.target.q4.b
        public String a() {
            return this.a + StringUtils.COMMA + this.d + StringUtils.COMMA + this.e + StringUtils.COMMA + this.b + StringUtils.COMMA + this.c + StringUtils.COMMA + this.f + StringUtils.COMMA + this.g + StringUtils.COMMA + this.h + StringUtils.COMMA + this.i + StringUtils.COMMA + this.j + StringUtils.COMMA + this.k + StringUtils.COMMA + this.l + StringUtils.COMMA + this.m;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    static final class f {
        WifiInfo a;
        List b;

        f(Context context) {
            try {
                WifiManager wifiManager = (WifiManager) context.getApplicationContext().getSystemService(T3.b);
                if (wifiManager != null && wifiManager.isWifiEnabled()) {
                    this.a = wifiManager.getConnectionInfo();
                    if (q4.a(context)) {
                        this.b = wifiManager.getScanResults();
                    }
                    List list = this.b;
                    if (list == null) {
                        return;
                    }
                    Collections.sort(list, new Comparator() { // from class: com.my.target.q4$f$$ExternalSyntheticLambda0
                        @Override // java.util.Comparator
                        public final int compare(Object obj, Object obj2) {
                            int a;
                            a = q4.f.a((ScanResult) obj, (ScanResult) obj2);
                            return a;
                        }
                    });
                }
            } catch (Throwable unused) {
                mi.a("EnvironmentParamsDataProvider$WiFiEnvironment: No permissions for access to wifi state");
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ int a(ScanResult scanResult, ScanResult scanResult2) {
            return scanResult2.level - scanResult.level;
        }
    }

    q4() {
    }

    static boolean a(Context context) {
        return t4.a("android.permission.ACCESS_FINE_LOCATION", context) || t4.a("android.permission.ACCESS_COARSE_LOCATION", context);
    }

    private static void b(Map map, Context context) {
        LocationManager locationManager;
        if (a(context) && (locationManager = (LocationManager) context.getSystemService("location")) != null) {
            Location location = null;
            long j = 0;
            float f2 = Float.MAX_VALUE;
            String str = null;
            for (String str2 : locationManager.getAllProviders()) {
                try {
                    Location lastKnownLocation = locationManager.getLastKnownLocation(str2);
                    if (lastKnownLocation != null) {
                        mi.a("EnvironmentParamsDataProvider: LocationProvider - " + str2);
                        float accuracy = lastKnownLocation.getAccuracy();
                        long time = lastKnownLocation.getTime();
                        if (location == null || (time > j && accuracy < f2)) {
                            str = str2;
                            location = lastKnownLocation;
                            f2 = accuracy;
                            j = time;
                        }
                    }
                } catch (Throwable unused) {
                    mi.a("EnvironmentParamsDataProvider: No permissions for get geo data");
                }
            }
            if (location == null) {
                return;
            }
            String str3 = location.getLatitude() + StringUtils.COMMA + location.getLongitude() + StringUtils.COMMA + location.getAccuracy() + StringUtils.COMMA + location.getSpeed() + StringUtils.COMMA + (j / 1000);
            map.put("location", str3);
            mi.a("EnvironmentParamsDataProvider: Location - " + str3);
            map.put("location_provider", str);
        }
    }

    private void c(Map map, Context context) {
        if (t4.a("android.permission.ACCESS_WIFI_STATE", context)) {
            f fVar = new f(context);
            WifiInfo wifiInfo = fVar.a;
            if (wifiInfo != null) {
                String bssid = wifiInfo.getBSSID();
                if (bssid == null) {
                    bssid = "";
                }
                int linkSpeed = wifiInfo.getLinkSpeed();
                int networkId = wifiInfo.getNetworkId();
                int rssi = wifiInfo.getRssi();
                String ssid = wifiInfo.getSSID();
                if (ssid == null) {
                    ssid = "";
                }
                String str = bssid + StringUtils.COMMA + ssid + StringUtils.COMMA + rssi + StringUtils.COMMA + networkId + StringUtils.COMMA + linkSpeed;
                map.put(T3.b, str);
                mi.a("EnvironmentParamsDataProvider: ip - " + wifiInfo.getIpAddress());
                mi.a("EnvironmentParamsDataProvider: wifi - " + str);
            }
            List list = fVar.b;
            if (list == null) {
                return;
            }
            int min = Math.min(list.size(), 5);
            int i = 0;
            while (i < min) {
                ScanResult scanResult = (ScanResult) list.get(i);
                mi.a(scanResult.level + "");
                String str2 = scanResult.BSSID;
                if (str2 == null) {
                    str2 = "";
                }
                String str3 = scanResult.SSID;
                if (str3 == null) {
                    str3 = "";
                }
                String str4 = str2 + StringUtils.COMMA + str3 + StringUtils.COMMA + scanResult.level;
                StringBuilder sb = new StringBuilder();
                sb.append(T3.b);
                i++;
                sb.append(i);
                map.put(sb.toString(), str4);
                mi.a("EnvironmentParamsDataProvider: wifi" + i + " - " + str4);
            }
        }
    }

    public synchronized d a() {
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void c(MyTargetConfig myTargetConfig, Context context) {
        long uptimeMillis = SystemClock.uptimeMillis();
        if (!myTargetConfig.isTrackingLocationEnabled) {
            synchronized (this) {
                this.a = new d(new HashMap(), SystemClock.uptimeMillis() - uptimeMillis);
            }
            return;
        }
        HashMap hashMap = new HashMap();
        b(hashMap, context);
        if (myTargetConfig.isTrackingEnvironmentEnabled) {
            c(hashMap, context);
            a(hashMap, context);
        }
        synchronized (this) {
            this.a = new d(hashMap, SystemClock.uptimeMillis() - uptimeMillis);
        }
    }

    private void a(Map map, Context context) {
        List list;
        if (t4.a("android.permission.ACCESS_COARSE_LOCATION", context) && (list = new c(context).a) != null) {
            int i = 0;
            while (i < list.size()) {
                StringBuilder sb = new StringBuilder();
                sb.append("cell");
                sb.append(i != 0 ? Integer.valueOf(i) : "");
                map.put(sb.toString(), ((b) list.get(i)).a());
                i++;
            }
        }
    }

    synchronized Map b(final MyTargetConfig myTargetConfig, final Context context) {
        d a2;
        a2 = a();
        o0.d(new Runnable() { // from class: com.my.target.q4$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                q4.this.c(myTargetConfig, context);
            }
        });
        return a2.b();
    }
}
