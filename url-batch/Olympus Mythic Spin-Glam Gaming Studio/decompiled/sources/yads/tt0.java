package yads;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiManager;
import android.os.SystemClock;
import android.telephony.CellLocation;
import android.telephony.TelephonyManager;
import android.telephony.gsm.GsmCellLocation;
import com.applovin.sdk.AppLovinEventTypes;
import com.ironsource.T3;
import com.mobilefuse.sdk.MobileFuseDefaults;
import com.my.target.common.webform.WebFormSetViewSettings;
import io.appmetrica.analytics.AppMetrica;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.text.StringsKt;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.Json;

/* loaded from: classes4.dex */
public abstract class tt0 {
    /* JADX WARN: Can't wrap try/catch for region: R(38:0|1|(2:2|3)|4|(4:6|(1:19)(1:12)|13|(1:18))|20|(1:24)|25|(4:27|(1:40)(1:33)|34|(1:39))|41|(2:42|43)|(3:(2:45|(27:48|49|50|51|(22:53|54|55|56|(17:58|59|60|61|(4:209|(1:211)|212|(15:214|(3:216|(2:218|219)(2:221|222)|220)|223|224|65|(1:67)(1:208)|68|69|70|71|72|73|74|75|76))(1:63)|64|65|(0)(0)|68|69|70|71|72|73|74|75|76)|228|59|60|61|(0)(0)|64|65|(0)(0)|68|69|70|71|72|73|74|75|76)|231|54|55|56|(0)|228|59|60|61|(0)(0)|64|65|(0)(0)|68|69|70|71|72|73|74|75|76))|75|76)|234|49|50|51|(0)|231|54|55|56|(0)|228|59|60|61|(0)(0)|64|65|(0)(0)|68|69|70|71|72|73|74|(4:(0)|(20:131|(4:134|(2:139|(2:140|(1:1)(2:142|(3:144|145|146)(1:148))))(1:150)|147|132)|152|153|(4:156|(3:158|159|160)(1:162)|161|154)|163|164|(2:167|165)|168|169|(1:171)|172|(1:174)|175|(1:177)|178|(1:180)|181|(1:183)|184)|(14:78|79|80|81|82|(1:84)(1:199)|85|(1:87)(1:198)|88|(1:90)(1:197)|91|(2:93|309)|106|(27:108|(1:110)(1:194)|111|112|113|(4:116|(3:119|(1:187)(1:130)|117)|191|114)|192|131|(1:132)|152|153|(1:154)|163|164|(1:165)|168|169|(0)|172|(0)|175|(0)|178|(0)|181|(0)|184)(2:195|196))|(10:82|(0)(0)|85|(0)(0)|88|(0)(0)|91|(0)|106|(0)(0)))) */
    /* JADX WARN: Can't wrap try/catch for region: R(41:0|1|(2:2|3)|4|(4:6|(1:19)(1:12)|13|(1:18))|20|(1:24)|25|(4:27|(1:40)(1:33)|34|(1:39))|41|42|43|(2:45|(27:48|49|50|51|(22:53|54|55|56|(17:58|59|60|61|(4:209|(1:211)|212|(15:214|(3:216|(2:218|219)(2:221|222)|220)|223|224|65|(1:67)(1:208)|68|69|70|71|72|73|74|75|76))(1:63)|64|65|(0)(0)|68|69|70|71|72|73|74|75|76)|228|59|60|61|(0)(0)|64|65|(0)(0)|68|69|70|71|72|73|74|75|76)|231|54|55|56|(0)|228|59|60|61|(0)(0)|64|65|(0)(0)|68|69|70|71|72|73|74|75|76))|234|49|50|51|(0)|231|54|55|56|(0)|228|59|60|61|(0)(0)|64|65|(0)(0)|68|69|70|71|72|73|74|75|76|(4:(0)|(20:131|(4:134|(2:139|(2:140|(1:1)(2:142|(3:144|145|146)(1:148))))(1:150)|147|132)|152|153|(4:156|(3:158|159|160)(1:162)|161|154)|163|164|(2:167|165)|168|169|(1:171)|172|(1:174)|175|(1:177)|178|(1:180)|181|(1:183)|184)|(14:78|79|80|81|82|(1:84)(1:199)|85|(1:87)(1:198)|88|(1:90)(1:197)|91|(2:93|309)|106|(27:108|(1:110)(1:194)|111|112|113|(4:116|(3:119|(1:187)(1:130)|117)|191|114)|192|131|(1:132)|152|153|(1:154)|163|164|(1:165)|168|169|(0)|172|(0)|175|(0)|178|(0)|181|(0)|184)(2:195|196))|(10:82|(0)(0)|85|(0)(0)|88|(0)(0)|91|(0)|106|(0)(0)))) */
    /* JADX WARN: Can't wrap try/catch for region: R(42:0|1|2|3|4|(4:6|(1:19)(1:12)|13|(1:18))|20|(1:24)|25|(4:27|(1:40)(1:33)|34|(1:39))|41|42|43|(2:45|(27:48|49|50|51|(22:53|54|55|56|(17:58|59|60|61|(4:209|(1:211)|212|(15:214|(3:216|(2:218|219)(2:221|222)|220)|223|224|65|(1:67)(1:208)|68|69|70|71|72|73|74|75|76))(1:63)|64|65|(0)(0)|68|69|70|71|72|73|74|75|76)|228|59|60|61|(0)(0)|64|65|(0)(0)|68|69|70|71|72|73|74|75|76)|231|54|55|56|(0)|228|59|60|61|(0)(0)|64|65|(0)(0)|68|69|70|71|72|73|74|75|76))|234|49|50|51|(0)|231|54|55|56|(0)|228|59|60|61|(0)(0)|64|65|(0)(0)|68|69|70|71|72|73|74|75|76|(4:(0)|(20:131|(4:134|(2:139|(2:140|(1:1)(2:142|(3:144|145|146)(1:148))))(1:150)|147|132)|152|153|(4:156|(3:158|159|160)(1:162)|161|154)|163|164|(2:167|165)|168|169|(1:171)|172|(1:174)|175|(1:177)|178|(1:180)|181|(1:183)|184)|(14:78|79|80|81|82|(1:84)(1:199)|85|(1:87)(1:198)|88|(1:90)(1:197)|91|(2:93|309)|106|(27:108|(1:110)(1:194)|111|112|113|(4:116|(3:119|(1:187)(1:130)|117)|191|114)|192|131|(1:132)|152|153|(1:154)|163|164|(1:165)|168|169|(0)|172|(0)|175|(0)|178|(0)|181|(0)|184)(2:195|196))|(10:82|(0)(0)|85|(0)(0)|88|(0)(0)|91|(0)|106|(0)(0)))) */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x0217, code lost:
    
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x01f5, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0235, code lost:
    
        if (r4.length() == 0) goto L102;
     */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x041d  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0447 A[LOOP:5: B:165:0x0441->B:167:0x0447, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0470  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0495  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x04b6  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x04d3  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x04e9  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x04f5  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x016d A[Catch: Exception -> 0x01c3, TryCatch #9 {Exception -> 0x01c3, blocks: (B:61:0x0155, B:209:0x016d, B:211:0x0173, B:212:0x0177, B:214:0x0186, B:216:0x019a, B:220:0x01ba, B:224:0x01be), top: B:60:0x0155 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0123 A[Catch: Exception -> 0x0129, TRY_LEAVE, TryCatch #2 {Exception -> 0x0129, blocks: (B:51:0x0105, B:53:0x0123), top: B:50:0x0105 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x014a A[Catch: Exception -> 0x0151, TRY_LEAVE, TryCatch #10 {Exception -> 0x0151, blocks: (B:56:0x012c, B:58:0x014a), top: B:55:0x012c }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0307  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static st0 a(Context context, fy2 fy2Var, jx jxVar, up2 up2Var, db2 db2Var) {
        String str;
        Integer num;
        Integer num2;
        Integer num3;
        String str2;
        String str3;
        gh0 gh0Var;
        String str4;
        sw swVar;
        Iterator it;
        Iterator it2;
        Iterator it3;
        byte[] address;
        int i;
        WifiManager wifiManager;
        int lac;
        int cid;
        Intent registerReceiver;
        om0 om0Var = jxVar.a;
        ic icVar = jxVar.b;
        st0 st0Var = new st0(fy2Var.b(context));
        st0Var.r0 = context.getPackageName();
        st0Var.s0 = ff.a(context);
        st0Var.t0 = ff.b(context);
        st0Var.c.getClass();
        String str5 = null;
        try {
            gf.a(context).b.getClass();
            str = AppMetrica.getLibraryVersion();
        } catch (Throwable unused) {
            boolean z = ob1.a;
            str = null;
        }
        st0Var.G0 = str;
        mc mcVar = icVar.a;
        boolean z2 = icVar.c;
        if (mcVar != null) {
            st0Var.S = Boolean.valueOf(mcVar.b);
            st0Var.T = Boolean.valueOf(z2);
            String str6 = mcVar.a;
            st0Var.e.getClass();
            boolean z3 = (str6 == null || str6.length() == 0 || Intrinsics.areEqual(MobileFuseDefaults.ADVERTISING_ID_ZEROS, str6)) ? false : true;
            if (!st0Var.a && Intrinsics.areEqual(st0Var.S, Boolean.FALSE) && z3) {
                st0Var.U = str6;
            }
        }
        String str7 = icVar.d;
        if (str7 != null && !StringsKt.isBlank(str7)) {
            st0Var.q = str7;
        }
        mc mcVar2 = icVar.b;
        if (mcVar2 != null) {
            st0Var.V = Boolean.valueOf(mcVar2.b);
            String str8 = mcVar2.a;
            st0Var.e.getClass();
            boolean z4 = (str8 == null || str8.length() == 0 || Intrinsics.areEqual(MobileFuseDefaults.ADVERTISING_ID_ZEROS, str8)) ? false : true;
            if (!st0Var.a && Intrinsics.areEqual(st0Var.V, Boolean.FALSE) && z4) {
                st0Var.W = str8;
            }
        }
        try {
            registerReceiver = context.getApplicationContext().registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        } catch (Exception unused2) {
            boolean z5 = ob1.a;
        }
        try {
            if (registerReceiver != null) {
                int intExtra = registerReceiver.getIntExtra(AppLovinEventTypes.USER_COMPLETED_LEVEL, -1);
                int intExtra2 = registerReceiver.getIntExtra("scale", -1);
                if (intExtra > -1 && intExtra2 > 0) {
                    num = Integer.valueOf(MathKt.roundToInt((intExtra / intExtra2) * 100));
                    st0Var.X = num;
                    st0Var.e0 = "UTF-8";
                    Object systemService = context.getSystemService("phone");
                    Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
                    CellLocation cellLocation = ((TelephonyManager) systemService).getCellLocation();
                    Intrinsics.checkNotNull(cellLocation, "null cannot be cast to non-null type android.telephony.gsm.GsmCellLocation");
                    cid = ((GsmCellLocation) cellLocation).getCid();
                    if (-1 != cid) {
                        num2 = Integer.valueOf(cid & 65535);
                        st0Var.P = num2;
                        Object systemService2 = context.getSystemService("phone");
                        Intrinsics.checkNotNull(systemService2, "null cannot be cast to non-null type android.telephony.TelephonyManager");
                        CellLocation cellLocation2 = ((TelephonyManager) systemService2).getCellLocation();
                        Intrinsics.checkNotNull(cellLocation2, "null cannot be cast to non-null type android.telephony.gsm.GsmCellLocation");
                        lac = ((GsmCellLocation) cellLocation2).getLac();
                        if (-1 != lac) {
                            num3 = Integer.valueOf(lac & 65535);
                            st0Var.Q = num3;
                            Object systemService3 = context.getApplicationContext().getSystemService(T3.b);
                            Intrinsics.checkNotNull(systemService3, "null cannot be cast to non-null type android.net.wifi.WifiManager");
                            wifiManager = (WifiManager) systemService3;
                            if (wifiManager.isWifiEnabled()) {
                                List<ScanResult> scanResults = wifiManager.getScanResults();
                                if (scanResults == null) {
                                    scanResults = CollectionsKt.emptyList();
                                }
                                List sortedWith = CollectionsKt.sortedWith(scanResults, new jd2());
                                if (!sortedWith.isEmpty()) {
                                    StringBuilder sb = new StringBuilder();
                                    int min = Math.min(3, sortedWith.size());
                                    int i2 = 0;
                                    while (i2 < min) {
                                        sb.append(((ScanResult) sortedWith.get(i2)).BSSID);
                                        sb.append(StringUtils.COMMA);
                                        sb.append(((ScanResult) sortedWith.get(i2)).level);
                                        i2++;
                                        sb.append(i2 < min ? ";" : "");
                                    }
                                    str2 = sb.toString();
                                    st0Var.R = str2;
                                    st0Var.G = st0Var.a ? null : yg1.a(context).a();
                                    Object systemService4 = context.getSystemService("phone");
                                    Intrinsics.checkNotNull(systemService4, "null cannot be cast to non-null type android.telephony.TelephonyManager");
                                    String substring = ((TelephonyManager) systemService4).getNetworkOperator().substring(0, 3);
                                    Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                                    Integer num4 = StringsKt.toIntOrNull(substring);
                                    st0Var.K = num4;
                                    Object systemService5 = context.getSystemService("phone");
                                    Intrinsics.checkNotNull(systemService5, "null cannot be cast to non-null type android.telephony.TelephonyManager");
                                    String substring2 = ((TelephonyManager) systemService5).getNetworkOperator().substring(3);
                                    Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
                                    Integer num5 = StringsKt.toIntOrNull(substring2);
                                    st0Var.L = num5;
                                    st0Var.M = kd2.a(context);
                                    Object systemService6 = context.getSystemService("phone");
                                    Intrinsics.checkNotNull(systemService6, "null cannot be cast to non-null type android.telephony.TelephonyManager");
                                    str3 = ((TelephonyManager) systemService6).getNetworkOperatorName();
                                }
                            }
                            str2 = null;
                            st0Var.R = str2;
                            st0Var.G = st0Var.a ? null : yg1.a(context).a();
                            Object systemService42 = context.getSystemService("phone");
                            Intrinsics.checkNotNull(systemService42, "null cannot be cast to non-null type android.telephony.TelephonyManager");
                            String substring3 = ((TelephonyManager) systemService42).getNetworkOperator().substring(0, 3);
                            Intrinsics.checkNotNullExpressionValue(substring3, "substring(...)");
                            Integer num42 = StringsKt.toIntOrNull(substring3);
                            st0Var.K = num42;
                            Object systemService52 = context.getSystemService("phone");
                            Intrinsics.checkNotNull(systemService52, "null cannot be cast to non-null type android.telephony.TelephonyManager");
                            String substring22 = ((TelephonyManager) systemService52).getNetworkOperator().substring(3);
                            Intrinsics.checkNotNullExpressionValue(substring22, "substring(...)");
                            Integer num52 = StringsKt.toIntOrNull(substring22);
                            st0Var.L = num52;
                            st0Var.M = kd2.a(context);
                            Object systemService62 = context.getSystemService("phone");
                            Intrinsics.checkNotNull(systemService62, "null cannot be cast to non-null type android.telephony.TelephonyManager");
                            str3 = ((TelephonyManager) systemService62).getNetworkOperatorName();
                        }
                        num3 = null;
                        st0Var.Q = num3;
                        Object systemService32 = context.getApplicationContext().getSystemService(T3.b);
                        Intrinsics.checkNotNull(systemService32, "null cannot be cast to non-null type android.net.wifi.WifiManager");
                        wifiManager = (WifiManager) systemService32;
                        if (wifiManager.isWifiEnabled()) {
                        }
                        str2 = null;
                        st0Var.R = str2;
                        st0Var.G = st0Var.a ? null : yg1.a(context).a();
                        Object systemService422 = context.getSystemService("phone");
                        Intrinsics.checkNotNull(systemService422, "null cannot be cast to non-null type android.telephony.TelephonyManager");
                        String substring32 = ((TelephonyManager) systemService422).getNetworkOperator().substring(0, 3);
                        Intrinsics.checkNotNullExpressionValue(substring32, "substring(...)");
                        Integer num422 = StringsKt.toIntOrNull(substring32);
                        st0Var.K = num422;
                        Object systemService522 = context.getSystemService("phone");
                        Intrinsics.checkNotNull(systemService522, "null cannot be cast to non-null type android.telephony.TelephonyManager");
                        String substring222 = ((TelephonyManager) systemService522).getNetworkOperator().substring(3);
                        Intrinsics.checkNotNullExpressionValue(substring222, "substring(...)");
                        Integer num522 = StringsKt.toIntOrNull(substring222);
                        st0Var.L = num522;
                        st0Var.M = kd2.a(context);
                        Object systemService622 = context.getSystemService("phone");
                        Intrinsics.checkNotNull(systemService622, "null cannot be cast to non-null type android.telephony.TelephonyManager");
                        str3 = ((TelephonyManager) systemService622).getNetworkOperatorName();
                    }
                    num2 = null;
                    st0Var.P = num2;
                    Object systemService22 = context.getSystemService("phone");
                    Intrinsics.checkNotNull(systemService22, "null cannot be cast to non-null type android.telephony.TelephonyManager");
                    CellLocation cellLocation22 = ((TelephonyManager) systemService22).getCellLocation();
                    Intrinsics.checkNotNull(cellLocation22, "null cannot be cast to non-null type android.telephony.gsm.GsmCellLocation");
                    lac = ((GsmCellLocation) cellLocation22).getLac();
                    if (-1 != lac) {
                    }
                    num3 = null;
                    st0Var.Q = num3;
                    Object systemService322 = context.getApplicationContext().getSystemService(T3.b);
                    Intrinsics.checkNotNull(systemService322, "null cannot be cast to non-null type android.net.wifi.WifiManager");
                    wifiManager = (WifiManager) systemService322;
                    if (wifiManager.isWifiEnabled()) {
                    }
                    str2 = null;
                    st0Var.R = str2;
                    st0Var.G = st0Var.a ? null : yg1.a(context).a();
                    Object systemService4222 = context.getSystemService("phone");
                    Intrinsics.checkNotNull(systemService4222, "null cannot be cast to non-null type android.telephony.TelephonyManager");
                    String substring322 = ((TelephonyManager) systemService4222).getNetworkOperator().substring(0, 3);
                    Intrinsics.checkNotNullExpressionValue(substring322, "substring(...)");
                    Integer num4222 = StringsKt.toIntOrNull(substring322);
                    st0Var.K = num4222;
                    Object systemService5222 = context.getSystemService("phone");
                    Intrinsics.checkNotNull(systemService5222, "null cannot be cast to non-null type android.telephony.TelephonyManager");
                    String substring2222 = ((TelephonyManager) systemService5222).getNetworkOperator().substring(3);
                    Intrinsics.checkNotNullExpressionValue(substring2222, "substring(...)");
                    Integer num5222 = StringsKt.toIntOrNull(substring2222);
                    st0Var.L = num5222;
                    st0Var.M = kd2.a(context);
                    Object systemService6222 = context.getSystemService("phone");
                    Intrinsics.checkNotNull(systemService6222, "null cannot be cast to non-null type android.telephony.TelephonyManager");
                    str3 = ((TelephonyManager) systemService6222).getNetworkOperatorName();
                }
            }
            Object systemService62222 = context.getSystemService("phone");
            Intrinsics.checkNotNull(systemService62222, "null cannot be cast to non-null type android.telephony.TelephonyManager");
            str3 = ((TelephonyManager) systemService62222).getNetworkOperatorName();
        } catch (Exception unused3) {
        }
        num = null;
        st0Var.X = num;
        st0Var.e0 = "UTF-8";
        Object systemService7 = context.getSystemService("phone");
        Intrinsics.checkNotNull(systemService7, "null cannot be cast to non-null type android.telephony.TelephonyManager");
        CellLocation cellLocation3 = ((TelephonyManager) systemService7).getCellLocation();
        Intrinsics.checkNotNull(cellLocation3, "null cannot be cast to non-null type android.telephony.gsm.GsmCellLocation");
        cid = ((GsmCellLocation) cellLocation3).getCid();
        if (-1 != cid) {
        }
        num2 = null;
        st0Var.P = num2;
        Object systemService222 = context.getSystemService("phone");
        Intrinsics.checkNotNull(systemService222, "null cannot be cast to non-null type android.telephony.TelephonyManager");
        CellLocation cellLocation222 = ((TelephonyManager) systemService222).getCellLocation();
        Intrinsics.checkNotNull(cellLocation222, "null cannot be cast to non-null type android.telephony.gsm.GsmCellLocation");
        lac = ((GsmCellLocation) cellLocation222).getLac();
        if (-1 != lac) {
        }
        num3 = null;
        st0Var.Q = num3;
        Object systemService3222 = context.getApplicationContext().getSystemService(T3.b);
        Intrinsics.checkNotNull(systemService3222, "null cannot be cast to non-null type android.net.wifi.WifiManager");
        wifiManager = (WifiManager) systemService3222;
        if (wifiManager.isWifiEnabled()) {
        }
        str2 = null;
        st0Var.R = str2;
        st0Var.G = st0Var.a ? null : yg1.a(context).a();
        Object systemService42222 = context.getSystemService("phone");
        Intrinsics.checkNotNull(systemService42222, "null cannot be cast to non-null type android.telephony.TelephonyManager");
        String substring3222 = ((TelephonyManager) systemService42222).getNetworkOperator().substring(0, 3);
        Intrinsics.checkNotNullExpressionValue(substring3222, "substring(...)");
        Integer num42222 = StringsKt.toIntOrNull(substring3222);
        st0Var.K = num42222;
        Object systemService52222 = context.getSystemService("phone");
        Intrinsics.checkNotNull(systemService52222, "null cannot be cast to non-null type android.telephony.TelephonyManager");
        String substring22222 = ((TelephonyManager) systemService52222).getNetworkOperator().substring(3);
        Intrinsics.checkNotNullExpressionValue(substring22222, "substring(...)");
        Integer num52222 = StringsKt.toIntOrNull(substring22222);
        st0Var.L = num52222;
        st0Var.M = kd2.a(context);
        r1.Q0 = str5;
        ds1 ds1Var = new ds1();
        String str9 = dr1.d;
        ArrayList a = ds1Var.a(br1.a());
        ArrayList arrayList = new ArrayList();
        it = a.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            List list = ((qr1) next).d;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it4 = list.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        break;
                    }
                    if (((pr1) it4.next()).c) {
                        arrayList.add(next);
                        break;
                    }
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next2 = it2.next();
            if (!Intrinsics.areEqual(((qr1) next2).b, "undefined")) {
                arrayList2.add(next2);
            }
        }
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
        it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            arrayList3.add(((qr1) it3.next()).b);
        }
        Json.Default r2 = Json.Default;
        r2.getSerializersModule();
        r1.i0 = r2.encodeToString(new ArrayListSerializer(StringSerializer.INSTANCE), arrayList3);
        st0 a2 = r1.a();
        if (st0.a(context)) {
            a2.f.getClass();
            a2.U0 = qz0.a(context);
            a2.f.getClass();
            a2.V0 = Integer.valueOf(Runtime.getRuntime().availableProcessors());
        }
        if (st0.a(context)) {
            a2.g.getClass();
            a2.W0 = TimeZone.getDefault().getID();
            a2.g.getClass();
            a2.X0 = u53.a(context);
        }
        if (st0.a(context)) {
            a2.h.getClass();
            a2.Y0 = fh0.a();
            a2.h.getClass();
            a2.Z0 = fh0.b();
        }
        if (st0.a(context)) {
            a2.i.getClass();
            a2.a1 = Long.valueOf(SystemClock.elapsedRealtime());
        }
        if (st0.a(context)) {
            a2.j.getClass();
            a2.b1 = sh3.a();
        }
        return a2;
        str3 = null;
        st0Var.N = str3;
        st0Var.H = Integer.valueOf(hl3.d(context));
        st0Var.I = Integer.valueOf(hl3.b(context));
        st0Var.J = Float.valueOf(context.getResources().getDisplayMetrics().density);
        st0Var.v0 = hl3.a(context);
        try {
            gh0Var = wo3.a(context);
        } catch (Throwable unused4) {
            boolean z6 = ob1.a;
            gh0Var = gh0.g;
        }
        st0Var.w0 = gh0Var.a;
        st0Var.x0 = gh0Var.b;
        st0Var.y0 = gh0Var.c;
        st0Var.z0 = gh0Var.d;
        st0Var.A0 = gh0Var.e;
        st0Var.B0 = gh0Var.f;
        st0Var.E0 = st0Var.d.a("%d.%d%d");
        st0Var.F0 = st0Var.d.a("%d.%d.%d");
        st0Var.l = fy2.a(context);
        st0Var.d0 = Long.valueOf(oa.a);
        om0Var.getClass();
        st0 a3 = st0Var.a(context, om0Var.a);
        a3.z = om0Var.b();
        a3.r = om0Var.d;
        List list2 = jxVar.c;
        a3.b0 = list2 == null ? CollectionsKt.joinToString$default(list2, StringUtils.COMMA, null, null, 0, null, null, 62, null) : null;
        if (new d30(context).a()) {
            ip2 ip2Var = ip2.c;
            str4 = WebFormSetViewSettings.StatusBarStyle.LIGHT;
        } else {
            ip2 ip2Var2 = ip2.c;
            str4 = WebFormSetViewSettings.StatusBarStyle.DARK;
        }
        a3.I0 = str4;
        st0 c = a3.c();
        c.F = 1 != context.getResources().getConfiguration().orientation ? "portrait" : "landscape";
        st0 b = c.b();
        if (qw.a == null) {
            synchronized (qw.b) {
                try {
                    if (qw.a == null) {
                        qw.a = rw.a(context);
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        swVar = qw.a;
        if (swVar != null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        b.u = swVar.c();
        st0 b2 = b.d(context).c(context).e(context).h(context).b(context);
        b2.K0 = Boolean.valueOf(oa.a(context));
        st0 f = b2.g(context).f(context);
        f.S0 = Boolean.valueOf(om0Var.f);
        boolean a4 = ((qg1) db2Var.a).a("OPT_OUT_ENABLED", false);
        f.T0 = a4 ? Boolean.valueOf(a4) : null;
        f.P0 = ((qg1) ky2.a(context).a).c("ServerSideClientIP");
        try {
            Iterator it5 = CollectionsKt.iterator(NetworkInterface.getNetworkInterfaces());
            loop0: while (it5.hasNext()) {
                Iterator it6 = CollectionsKt.iterator(((NetworkInterface) it5.next()).getInetAddresses());
                while (it6.hasNext()) {
                    InetAddress inetAddress = (InetAddress) it6.next();
                    if ((inetAddress instanceof Inet6Address) && (address = ((Inet6Address) inetAddress).getAddress()) != null && ((i = address[0] & 240) == 32 || i == 48)) {
                        str5 = ((Inet6Address) inetAddress).getHostAddress();
                        break loop0;
                    }
                }
            }
        } catch (Throwable unused5) {
        }
        f.Q0 = str5;
        ds1 ds1Var2 = new ds1();
        String str92 = dr1.d;
        ArrayList a5 = ds1Var2.a(br1.a());
        ArrayList arrayList4 = new ArrayList();
        it = a5.iterator();
        while (it.hasNext()) {
        }
        ArrayList arrayList22 = new ArrayList();
        it2 = arrayList4.iterator();
        while (it2.hasNext()) {
        }
        ArrayList arrayList32 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList22, 10));
        it3 = arrayList22.iterator();
        while (it3.hasNext()) {
        }
        Json.Default r22 = Json.Default;
        r22.getSerializersModule();
        f.i0 = r22.encodeToString(new ArrayListSerializer(StringSerializer.INSTANCE), arrayList32);
        st0 a22 = f.a();
        if (st0.a(context)) {
        }
        if (st0.a(context)) {
        }
        if (st0.a(context)) {
        }
        if (st0.a(context)) {
        }
        if (st0.a(context)) {
        }
        return a22;
        st0Var.w0 = gh0Var.a;
        st0Var.x0 = gh0Var.b;
        st0Var.y0 = gh0Var.c;
        st0Var.z0 = gh0Var.d;
        st0Var.A0 = gh0Var.e;
        st0Var.B0 = gh0Var.f;
        st0Var.E0 = st0Var.d.a("%d.%d%d");
        st0Var.F0 = st0Var.d.a("%d.%d.%d");
        st0Var.l = fy2.a(context);
        st0Var.d0 = Long.valueOf(oa.a);
        om0Var.getClass();
        st0 a32 = st0Var.a(context, om0Var.a);
        a32.z = om0Var.b();
        a32.r = om0Var.d;
        List list22 = jxVar.c;
        a32.b0 = list22 == null ? CollectionsKt.joinToString$default(list22, StringUtils.COMMA, null, null, 0, null, null, 62, null) : null;
        if (new d30(context).a()) {
        }
        a32.I0 = str4;
        st0 c2 = a32.c();
        c2.F = 1 != context.getResources().getConfiguration().orientation ? "portrait" : "landscape";
        st0 b3 = c2.b();
        if (qw.a == null) {
        }
        swVar = qw.a;
        if (swVar != null) {
        }
    }

    public static st0 a(Context context, v3 v3Var, fy2 fy2Var) {
        String str;
        String string;
        String str2;
        String decode;
        st0 a = a(context, fy2Var, v3Var.b, new up2(), new db2(context));
        d8 d8Var = v3Var.e;
        if (d8Var != null) {
            a.O = a.a ? null : d8Var;
            String str3 = d8Var.d;
            if (str3 == null || str3.length() == 0) {
                str2 = null;
            } else {
                String encode = Uri.encode(str3);
                if (encode != null && encode.length() > 1024) {
                    qv1 qv1Var = jl2.a;
                    jl2.a("Exceeded the length of the parameter! The maximum size of the parameter is %s bytes. First %s bytes of the parameter will be used", 1024, 1024);
                    String encode2 = Uri.encode(" ");
                    String substring = encode.substring(0, 1024);
                    Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                    boolean startsWith$default = StringsKt.startsWith$default(encode, encode2, 1024, false, 4, null);
                    int lastIndexOf$default = StringsKt.lastIndexOf$default((CharSequence) substring, encode2, 0, false, 6, (Object) null);
                    if (startsWith$default || lastIndexOf$default < 0) {
                        encode = substring;
                    } else {
                        encode = substring.substring(0, lastIndexOf$default);
                        Intrinsics.checkNotNullExpressionValue(encode, "substring(...)");
                    }
                }
                str2 = Uri.decode(encode);
            }
            a.Z = str2;
            List<String> list = d8Var.e;
            String str4 = "";
            if (list != null) {
                StringBuilder sb = new StringBuilder();
                for (String str5 : list) {
                    sb.append(str4);
                    sb.append(str5);
                    sb.append("\n");
                    str4 = "3";
                }
                str4 = sb.toString();
                Intrinsics.checkNotNullExpressionValue(str4, "toString(...)");
            }
            if (str4.length() == 0) {
                decode = null;
            } else {
                String encode3 = Uri.encode(str4);
                if (encode3 != null && encode3.length() > 2048) {
                    qv1 qv1Var2 = jl2.a;
                    jl2.a("Exceeded the length of the parameter! The maximum size of the parameter is %s bytes. First %s bytes of the parameter will be used", 2048, 2048);
                    String encode4 = Uri.encode("\n");
                    encode3 = encode3.substring(0, 2048);
                    Intrinsics.checkNotNullExpressionValue(encode3, "substring(...)");
                    int lastIndexOf$default2 = StringsKt.lastIndexOf$default((CharSequence) encode3, encode4, 0, false, 6, (Object) null);
                    if (!StringsKt.endsWith$default(encode3, encode4, false, 2, (Object) null) && lastIndexOf$default2 >= 0) {
                        encode3 = encode3.substring(0, lastIndexOf$default2);
                        Intrinsics.checkNotNullExpressionValue(encode3, "substring(...)");
                    }
                }
                decode = Uri.decode(encode3);
            }
            a.a0 = decode;
            a.C0 = j8.a(d8Var.b);
            a.D0 = j8.a(d8Var.c);
            a.f0 = d8Var.h;
            ip2 ip2Var = d8Var.i;
            if (ip2Var != null) {
                a.H0 = j8.a(ip2Var.b);
            }
            HashMap a2 = j8.a(d8Var.g);
            if (a2 != null) {
                a.m.putAll(a2);
            }
        }
        e00 e00Var = v3Var.a;
        if (e00Var != null) {
            a.B = e00Var.b;
        }
        a.s = v3Var.j;
        a.A = v3Var.c.a;
        e52 e52Var = v3Var.f;
        if (e52Var != null) {
            a.c0 = e52Var.b;
        }
        l03 l03Var = v3Var.d.a;
        if (l03Var != null) {
            a.E = l03Var.b().b;
            a.C = Integer.valueOf(l03Var.c(context));
            a.D = Integer.valueOf(l03Var.a(context));
        }
        a.g0 = v3Var.h;
        a.h0 = v3Var.i;
        int i = v3Var.n;
        if (1 == i) {
            str = "portrait";
        } else {
            str = "landscape";
        }
        a.F = str;
        String str6 = v3Var.c.a;
        if (str6 != null && (string = dz2.a(new dz2(), context, "ViewSizeInfoStorage").getString(bl3.a(new cl3(i, str6)), null)) != null) {
            a.J0 = string;
        }
        return a;
    }
}
