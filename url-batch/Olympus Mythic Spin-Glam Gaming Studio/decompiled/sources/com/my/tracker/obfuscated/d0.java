package com.my.tracker.obfuscated;

import android.content.Context;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
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
import android.telephony.CellInfoNr;
import android.telephony.CellInfoTdscdma;
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
import android.text.TextUtils;
import com.ironsource.T3;
import com.my.target.q4$c$$ExternalSyntheticApiModelOutline12;
import com.my.target.q4$c$$ExternalSyntheticApiModelOutline13;
import com.my.target.q4$c$$ExternalSyntheticApiModelOutline2;
import com.my.target.q4$c$$ExternalSyntheticApiModelOutline29;
import com.my.target.q4$c$$ExternalSyntheticApiModelOutline31;
import com.my.tracker.obfuscated.c0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes15.dex */
public final class d0 {
    private static final c0.k a = new c0.k(null, Collections.EMPTY_LIST);
    public static int b = 5;

    private List a(Context context) {
        c0.h a2;
        if (Build.VERSION.SDK_INT < 29) {
            if (!m1.a("android.permission.ACCESS_COARSE_LOCATION", context)) {
                x2.a("EnvironmentParamsDataProvider: can't access information");
                return Collections.EMPTY_LIST;
            }
        } else if (!m1.a("android.permission.ACCESS_FINE_LOCATION", context)) {
            x2.a("EnvironmentParamsDataProvider: can't access information");
            return Collections.EMPTY_LIST;
        }
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (telephonyManager == null) {
                return Collections.EMPTY_LIST;
            }
            List<CellInfo> allCellInfo = telephonyManager.getAllCellInfo();
            if (allCellInfo != null && !allCellInfo.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                for (CellInfo cellInfo : allCellInfo) {
                    if (cellInfo.isRegistered()) {
                        if (cellInfo instanceof CellInfoCdma) {
                            arrayList.add(a((CellInfoCdma) cellInfo));
                        } else if (cellInfo instanceof CellInfoGsm) {
                            arrayList.add(a((CellInfoGsm) cellInfo));
                        } else if (cellInfo instanceof CellInfoLte) {
                            arrayList.add(a((CellInfoLte) cellInfo));
                        } else if (cellInfo instanceof CellInfoWcdma) {
                            arrayList.add(a((CellInfoWcdma) cellInfo));
                        } else {
                            int i = Build.VERSION.SDK_INT;
                            if (i >= 29 && q4$c$$ExternalSyntheticApiModelOutline12.m(cellInfo)) {
                                arrayList.add(a(q4$c$$ExternalSyntheticApiModelOutline13.m(cellInfo)));
                            } else if (i >= 29 && q4$c$$ExternalSyntheticApiModelOutline29.m(cellInfo)) {
                                arrayList.add(a(d0$$ExternalSyntheticApiModelOutline2.m(cellInfo)));
                            }
                        }
                    }
                }
                if (arrayList.isEmpty() && (a2 = a(telephonyManager)) != null) {
                    arrayList.add(a2);
                }
                return arrayList;
            }
            return Collections.EMPTY_LIST;
        } catch (Throwable th) {
            x2.a("EnvironmentParamsDataProvider: exception during collecting c-info", th);
            return Collections.EMPTY_LIST;
        }
    }

    private c0.k c(Context context) {
        c0.j jVar;
        if (!m1.a("android.permission.ACCESS_WIFI_STATE", context)) {
            return a;
        }
        try {
            WifiManager wifiManager = (WifiManager) context.getApplicationContext().getSystemService(T3.b);
            if (wifiManager != null && wifiManager.isWifiEnabled()) {
                WifiInfo connectionInfo = wifiManager.getConnectionInfo();
                if (connectionInfo != null) {
                    String ssid = connectionInfo.getSSID();
                    String bssid = connectionInfo.getBSSID();
                    jVar = new c0.j(ssid == null ? "<null>" : ssid, bssid == null ? "<null>" : bssid, connectionInfo.getRssi(), connectionInfo.getNetworkId(), connectionInfo.getLinkSpeed());
                } else {
                    jVar = null;
                }
                if (!m1.a("android.permission.ACCESS_FINE_LOCATION", context) && !m1.a("android.permission.ACCESS_COARSE_LOCATION", context)) {
                    return new c0.k(jVar, Collections.EMPTY_LIST);
                }
                List<ScanResult> scanResults = wifiManager.getScanResults();
                if (scanResults != null && !scanResults.isEmpty()) {
                    Collections.sort(scanResults, new Comparator() { // from class: com.my.tracker.obfuscated.d0$$ExternalSyntheticLambda6
                        @Override // java.util.Comparator
                        public final int compare(Object obj, Object obj2) {
                            int a2;
                            a2 = d0.a((ScanResult) obj, (ScanResult) obj2);
                            return a2;
                        }
                    });
                    int min = Math.min(scanResults.size(), b);
                    ArrayList arrayList = new ArrayList(min);
                    for (int i = 0; i < min; i++) {
                        ScanResult scanResult = scanResults.get(i);
                        String str = scanResult.SSID;
                        String str2 = scanResult.BSSID;
                        if (str == null) {
                            str = "<null>";
                        }
                        if (str2 == null) {
                            str2 = "<null>";
                        }
                        arrayList.add(new c0.a(str, str2, scanResult.level));
                    }
                    return new c0.k(jVar, arrayList);
                }
                return new c0.k(jVar, Collections.EMPTY_LIST);
            }
            return a;
        } catch (Throwable th) {
            x2.a("EnvironmentParamsDataProvider: exception during collecting w-info", th);
            return a;
        }
    }

    public c0 b(Context context) {
        return new c0(a(context), c(context));
    }

    private c0.c a(CellInfoCdma cellInfoCdma) {
        CellIdentityCdma cellIdentity = cellInfoCdma.getCellIdentity();
        int networkId = cellIdentity.getNetworkId();
        int systemId = cellIdentity.getSystemId();
        int basestationId = cellIdentity.getBasestationId();
        int latitude = cellIdentity.getLatitude();
        int longitude = cellIdentity.getLongitude();
        CellSignalStrengthCdma cellSignalStrength = cellInfoCdma.getCellSignalStrength();
        return new c0.c(networkId, systemId, basestationId, latitude, longitude, cellSignalStrength.getCdmaLevel(), cellSignalStrength.getCdmaDbm(), cellSignalStrength.getCdmaEcio(), cellSignalStrength.getEvdoLevel(), cellSignalStrength.getEvdoDbm(), cellSignalStrength.getEvdoEcio(), cellSignalStrength.getEvdoSnr());
    }

    private c0.d a(CellInfoGsm cellInfoGsm) {
        CellIdentityGsm cellIdentity = cellInfoGsm.getCellIdentity();
        CellSignalStrengthGsm cellSignalStrength = cellInfoGsm.getCellSignalStrength();
        int i = Build.VERSION.SDK_INT;
        return new c0.d(i >= 28 ? cellIdentity.getMccString() : String.valueOf(cellIdentity.getMcc()), i >= 28 ? cellIdentity.getMncString() : String.valueOf(cellIdentity.getMnc()), cellIdentity.getCid(), cellIdentity.getLac(), cellIdentity.getArfcn(), cellIdentity.getBsic(), cellSignalStrength.getLevel(), cellSignalStrength.getDbm(), cellSignalStrength.getAsuLevel(), i >= 26 ? cellSignalStrength.getTimingAdvance() : -1);
    }

    private c0.e a(CellInfoLte cellInfoLte) {
        CellIdentityLte cellIdentity = cellInfoLte.getCellIdentity();
        CellSignalStrengthLte cellSignalStrength = cellInfoLte.getCellSignalStrength();
        int i = Build.VERSION.SDK_INT;
        return new c0.e(i >= 28 ? cellIdentity.getMccString() : String.valueOf(cellIdentity.getMcc()), i >= 28 ? cellIdentity.getMncString() : String.valueOf(cellIdentity.getMnc()), cellIdentity.getCi(), cellIdentity.getTac(), cellIdentity.getEarfcn(), cellIdentity.getPci(), cellSignalStrength.getLevel(), cellSignalStrength.getDbm(), cellSignalStrength.getAsuLevel(), i >= 26 ? cellSignalStrength.getTimingAdvance() : -1);
    }

    private c0.i a(CellInfoWcdma cellInfoWcdma) {
        CellIdentityWcdma cellIdentity = cellInfoWcdma.getCellIdentity();
        CellSignalStrengthWcdma cellSignalStrength = cellInfoWcdma.getCellSignalStrength();
        int i = Build.VERSION.SDK_INT;
        return new c0.i(i >= 28 ? cellIdentity.getMccString() : String.valueOf(cellIdentity.getMcc()), i >= 28 ? cellIdentity.getMncString() : String.valueOf(cellIdentity.getMnc()), cellIdentity.getCid(), cellIdentity.getLac(), cellIdentity.getUarfcn(), cellIdentity.getPsc(), cellSignalStrength.getLevel(), cellSignalStrength.getDbm(), cellSignalStrength.getAsuLevel());
    }

    private c0.g a(CellInfoTdscdma cellInfoTdscdma) {
        CellIdentityTdscdma cellIdentity;
        CellSignalStrengthTdscdma cellSignalStrength;
        String mccString;
        String mncString;
        int cid;
        int lac;
        int uarfcn;
        int cpid;
        int level;
        int dbm;
        int asuLevel;
        cellIdentity = cellInfoTdscdma.getCellIdentity();
        cellSignalStrength = cellInfoTdscdma.getCellSignalStrength();
        mccString = cellIdentity.getMccString();
        mncString = cellIdentity.getMncString();
        cid = cellIdentity.getCid();
        lac = cellIdentity.getLac();
        uarfcn = cellIdentity.getUarfcn();
        cpid = cellIdentity.getCpid();
        level = cellSignalStrength.getLevel();
        dbm = cellSignalStrength.getDbm();
        asuLevel = cellSignalStrength.getAsuLevel();
        return new c0.g(mccString, mncString, cid, lac, uarfcn, cpid, level, dbm, asuLevel);
    }

    private c0.f a(CellInfoNr cellInfoNr) {
        CellIdentity cellIdentity;
        CellSignalStrength cellSignalStrength;
        String mccString;
        String mncString;
        long nci;
        int tac;
        int nrarfcn;
        int pci;
        int level;
        int dbm;
        int asuLevel;
        cellIdentity = cellInfoNr.getCellIdentity();
        CellIdentityNr m = q4$c$$ExternalSyntheticApiModelOutline31.m(cellIdentity);
        cellSignalStrength = cellInfoNr.getCellSignalStrength();
        CellSignalStrengthNr m2 = q4$c$$ExternalSyntheticApiModelOutline2.m(cellSignalStrength);
        mccString = m.getMccString();
        mncString = m.getMncString();
        nci = m.getNci();
        tac = m.getTac();
        nrarfcn = m.getNrarfcn();
        pci = m.getPci();
        level = m2.getLevel();
        dbm = m2.getDbm();
        asuLevel = m2.getAsuLevel();
        return new c0.f(mccString, mncString, nci, tac, nrarfcn, pci, level, dbm, asuLevel);
    }

    private c0.h a(TelephonyManager telephonyManager) {
        String str;
        String str2;
        CellLocation cellLocation = telephonyManager.getCellLocation();
        String str3 = null;
        if (!(cellLocation instanceof GsmCellLocation)) {
            return null;
        }
        String networkOperator = telephonyManager.getNetworkOperator();
        if (TextUtils.isEmpty(networkOperator)) {
            str = null;
        } else {
            try {
                str2 = networkOperator.substring(0, 3);
            } catch (Throwable unused) {
                str2 = null;
            }
            try {
                str3 = networkOperator.substring(3);
            } catch (Throwable unused2) {
                x2.a("EnvironmentParamsDataProvider: unable to substring network operator " + networkOperator);
                str = str3;
                str3 = str2;
                GsmCellLocation gsmCellLocation = (GsmCellLocation) cellLocation;
                return new c0.h(str3, str, gsmCellLocation.getCid(), gsmCellLocation.getLac());
            }
            str = str3;
            str3 = str2;
        }
        GsmCellLocation gsmCellLocation2 = (GsmCellLocation) cellLocation;
        return new c0.h(str3, str, gsmCellLocation2.getCid(), gsmCellLocation2.getLac());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int a(ScanResult scanResult, ScanResult scanResult2) {
        return Integer.compare(scanResult2.level, scanResult.level);
    }
}
