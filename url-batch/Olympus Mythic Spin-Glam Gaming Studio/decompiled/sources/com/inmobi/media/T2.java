package com.inmobi.media;

import android.content.Context;
import android.location.LocationManager;
import android.os.Build;
import android.telephony.CellInfo;
import android.telephony.CellLocation;
import android.telephony.TelephonyManager;
import android.telephony.cdma.CdmaCellLocation;
import android.telephony.gsm.GsmCellLocation;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;

/* loaded from: classes13.dex */
public abstract class T2 {
    public static HashMap a() {
        String str;
        HashMap hashMap = new HashMap();
        Context context = AbstractC4002fj.a;
        if (context == null) {
            return hashMap;
        }
        int cellOperatorFlag = AbstractC4477xj.a().getCellOperatorFlag();
        boolean z = (cellOperatorFlag & 2) == 2;
        boolean z2 = (cellOperatorFlag & 1) == 1;
        R2 r2 = new R2();
        Object systemService = context.getSystemService("phone");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
        TelephonyManager telephonyManager = (TelephonyManager) systemService;
        if (!z) {
            int[] a = a(telephonyManager.getNetworkOperator());
            r2.a = a[0];
            r2.b = a[1];
            String networkCountryIso = telephonyManager.getNetworkCountryIso();
            if (networkCountryIso != null) {
                Locale ENGLISH = Locale.ENGLISH;
                Intrinsics.checkNotNullExpressionValue(ENGLISH, "ENGLISH");
                String lowerCase = networkCountryIso.toLowerCase(ENGLISH);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                r2.e = lowerCase;
            }
        }
        if (!z2) {
            int[] a2 = a(telephonyManager.getSimOperator());
            r2.c = a2[0];
            r2.d = a2[1];
        }
        String b = r2.b();
        if (b != null) {
            hashMap.put("s-ho", b);
        }
        String a3 = r2.a();
        if (a3 != null) {
            hashMap.put("s-co", a3);
        }
        String str2 = r2.e;
        if (str2 != null) {
            hashMap.put("s-iso", str2);
        }
        F5.a.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService2 = context.getSystemService("phone");
        TelephonyManager telephonyManager2 = systemService2 instanceof TelephonyManager ? (TelephonyManager) systemService2 : null;
        if (telephonyManager2 == null || (str = telephonyManager2.getNetworkOperatorName()) == null) {
            str = "";
        }
        hashMap.put("s-cn", str);
        return hashMap;
    }

    public static HashMap b() {
        Context context;
        Hh hh = AbstractC4477xj.a;
        S2 s2 = null;
        if ((AbstractC4002fj.b() == null || AbstractC4477xj.a().isConnectedCellTowerEnabled()) && d() && e() && (context = AbstractC4002fj.a) != null) {
            Object systemService = context.getSystemService("phone");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
            TelephonyManager telephonyManager = (TelephonyManager) systemService;
            int[] a = a(telephonyManager.getNetworkOperator());
            String valueOf = String.valueOf(a[0]);
            String valueOf2 = String.valueOf(a[1]);
            List<CellInfo> allCellInfo = telephonyManager.getAllCellInfo();
            if (allCellInfo != null) {
                int size = allCellInfo.size();
                CellInfo cellInfo = null;
                for (int i = 0; i < size; i++) {
                    cellInfo = allCellInfo.get(i);
                    if (cellInfo.isRegistered()) {
                        break;
                    }
                }
                if (cellInfo != null) {
                    s2 = new S2(cellInfo, valueOf, valueOf2, Build.VERSION.SDK_INT >= 30 ? telephonyManager.getDataNetworkType() : telephonyManager.getNetworkType());
                }
            }
            CellLocation cellLocation = telephonyManager.getCellLocation();
            if (cellLocation != null && a[0] != -1) {
                s2 = new S2();
                if (cellLocation instanceof CdmaCellLocation) {
                    s2.b = Integer.MAX_VALUE;
                    s2.c = Build.VERSION.SDK_INT >= 30 ? telephonyManager.getDataNetworkType() : telephonyManager.getNetworkType();
                    CdmaCellLocation cdmaCellLocation = (CdmaCellLocation) cellLocation;
                    s2.a = S2.a(valueOf, cdmaCellLocation.getSystemId(), cdmaCellLocation.getNetworkId(), cdmaCellLocation.getBaseStationId());
                } else {
                    GsmCellLocation gsmCellLocation = (GsmCellLocation) cellLocation;
                    s2.b = Integer.MAX_VALUE;
                    s2.c = Build.VERSION.SDK_INT >= 30 ? telephonyManager.getDataNetworkType() : telephonyManager.getNetworkType();
                    s2.a = S2.a(valueOf, valueOf2, gsmCellLocation.getLac(), gsmCellLocation.getCid(), gsmCellLocation.getPsc(), Integer.MAX_VALUE);
                }
            }
        }
        HashMap hashMap = new HashMap();
        if (s2 != null) {
            hashMap.put("c-sc", s2.a().toString());
        }
        return hashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static HashMap c() {
        ArrayList arrayList;
        if (AbstractC4002fj.d() && d() && e()) {
            Hh hh = AbstractC4477xj.a;
            if (AbstractC4002fj.b() == null || AbstractC4477xj.a().isVisibleCellTowerEnabled()) {
                Context context = AbstractC4002fj.a;
                if (context == null) {
                    arrayList = new ArrayList();
                } else {
                    Object systemService = context.getSystemService("phone");
                    Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
                    TelephonyManager telephonyManager = (TelephonyManager) systemService;
                    ArrayList arrayList2 = new ArrayList();
                    int[] a = a(telephonyManager.getNetworkOperator());
                    String valueOf = String.valueOf(a[0]);
                    String valueOf2 = String.valueOf(a[1]);
                    List<CellInfo> allCellInfo = telephonyManager.getAllCellInfo();
                    if (allCellInfo != null) {
                        for (CellInfo cellInfo : allCellInfo) {
                            if (!cellInfo.isRegistered()) {
                                arrayList2.add(new S2(cellInfo, valueOf, valueOf2, Build.VERSION.SDK_INT >= 30 ? telephonyManager.getDataNetworkType() : telephonyManager.getNetworkType()));
                            }
                        }
                    }
                    arrayList = arrayList2;
                }
                HashMap hashMap = new HashMap();
                if (!arrayList.isEmpty()) {
                    JSONArray jSONArray = new JSONArray();
                    jSONArray.put(((S2) arrayList.get(arrayList.size() - 1)).a());
                    hashMap.put("v-sc", jSONArray.toString());
                }
                return hashMap;
            }
        }
        arrayList = new ArrayList();
        HashMap hashMap2 = new HashMap();
        if (!arrayList.isEmpty()) {
        }
        return hashMap2;
    }

    public static boolean d() {
        if (!AbstractC4002fj.d()) {
            return false;
        }
        boolean a = AbstractC3867ag.a(AbstractC4002fj.a, "android.permission.READ_PHONE_STATE");
        boolean a2 = AbstractC3867ag.a(AbstractC4002fj.a, "android.permission.ACCESS_FINE_LOCATION");
        int i = Build.VERSION.SDK_INT;
        if (i == 29) {
            if (!a2) {
                Intrinsics.checkNotNullExpressionValue("T2", "TAG");
            }
            return a2;
        }
        if (i >= 30) {
            if (!a2 || !a) {
                Intrinsics.checkNotNullExpressionValue("T2", "TAG");
            }
            return a2 && a;
        }
        boolean a3 = AbstractC3867ag.a(AbstractC4002fj.a, "android.permission.ACCESS_COARSE_LOCATION");
        if (!a3 && !a2) {
            Intrinsics.checkNotNullExpressionValue("T2", "TAG");
        }
        return a3 || a2;
    }

    public static boolean e() {
        boolean isLocationEnabled;
        if (Build.VERSION.SDK_INT < 28) {
            return true;
        }
        Context context = AbstractC4002fj.a;
        Object systemService = context != null ? context.getSystemService("location") : null;
        LocationManager locationManager = systemService instanceof LocationManager ? (LocationManager) systemService : null;
        if (locationManager == null) {
            return false;
        }
        isLocationEnabled = locationManager.isLocationEnabled();
        return isLocationEnabled;
    }

    public static int[] a(String str) {
        int[] iArr = {-1, -1};
        if (str != null && !Intrinsics.areEqual("", str)) {
            try {
                String substring = str.substring(0, 3);
                Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                int parseInt = Integer.parseInt(substring);
                String substring2 = str.substring(3);
                Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
                int parseInt2 = Integer.parseInt(substring2);
                iArr[0] = parseInt;
                iArr[1] = parseInt2;
            } catch (IndexOutOfBoundsException | NumberFormatException unused) {
            }
        }
        return iArr;
    }
}
