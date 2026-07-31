package com.mbridge.msdk.mbbid.common;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.same.DomainNameUtils;
import com.mbridge.msdk.foundation.same.report.metrics.d;
import com.mbridge.msdk.foundation.same.report.metrics.e;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.g0;
import com.mbridge.msdk.foundation.tools.k0;
import com.mbridge.msdk.foundation.tools.l0;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.t0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.foundation.tools.x0;
import com.mbridge.msdk.mbbid.out.BidConstants;
import com.mbridge.msdk.out.MBConfiguration;
import com.mbridge.msdk.setting.g;
import com.mbridge.msdk.setting.i;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import com.safedk.android.analytics.brandsafety.m;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: BidCommon.java */
/* loaded from: classes11.dex */
public class b extends a {
    public static Map<String, String> a = new HashMap();
    public static JSONArray b;

    public static String a(Context context, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(BidConstants.BID_FILTER_KEY_UNIT_ID, str);
        return a(context, hashMap);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004b, code lost:
    
        r14 = java.lang.System.currentTimeMillis();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0051, code lost:
    
        if (r12 <= 0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0062, code lost:
    
        if ((r14 - r12) >= (r7.optInt("ttl") * 1000)) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0091, code lost:
    
        a(r19, r9, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0094, code lost:
    
        r0 = 0;
        r2 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a1, code lost:
    
        r5 = r2;
        r2 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0064, code lost:
    
        r8 = r7.optDouble("rate");
        r0 = new java.util.Random().nextInt(100);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0079, code lost:
    
        if (r8 == 0.0d) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0081, code lost:
    
        if ((r8 * 100.0d) < r0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0083, code lost:
    
        r0 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0088, code lost:
    
        r4 = r0;
        r2 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0086, code lost:
    
        r0 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x008e, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x008f, code lost:
    
        r2 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a4, code lost:
    
        r5 = r2;
        r2 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b3, code lost:
    
        if (com.mbridge.msdk.MBridgeConstans.DEBUG != false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00b5, code lost:
    
        com.mbridge.msdk.foundation.tools.q0.b("BidCommon", r0.getMessage());
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00be, code lost:
    
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x009d, code lost:
    
        a(r19, r9, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0097, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0098, code lost:
    
        r2 = 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean b(Context context, String str) {
        int i;
        int i2;
        JSONArray jSONArray = b;
        int i3 = 2;
        if (jSONArray == null || jSONArray.length() == 0) {
            a(str, 2);
            return false;
        }
        JSONObject jSONObject = new JSONObject();
        int i4 = 0;
        while (true) {
            try {
                if (i4 >= b.length()) {
                    i2 = 0;
                    i = 0;
                    break;
                }
                JSONObject optJSONObject = b.optJSONObject(i4);
                if (optJSONObject != null) {
                    String optString = optJSONObject.optString("key_tpl");
                    String optString2 = optJSONObject.optString("key_value");
                    long longValue = ((Long) x0.a(context, optString2, 0L)).longValue();
                    if (a(optString, optString2)) {
                        try {
                            break;
                        } catch (Exception e) {
                            e = e;
                            int i5 = 0;
                        }
                    }
                }
                i4++;
            } catch (Exception e2) {
                e = e2;
                i = 0;
            }
        }
        a(i3, jSONObject, i, i2);
        a(str, i3);
        return i3 != 1;
    }

    public static String a(Context context, Map<String, String> map) {
        String str;
        String str2;
        a = map;
        try {
            if (com.mbridge.msdk.foundation.controller.c.n().d() == null) {
                com.mbridge.msdk.foundation.controller.c.n().b(context);
            }
            if (com.mbridge.msdk.config.manager.a.c().d()) {
                try {
                    String a2 = com.mbridge.msdk.config.component.common.util.c.a();
                    long currentTimeMillis = System.currentTimeMillis();
                    a("buyerIdStart", a2, 0, 0L);
                    if (com.mbridge.msdk.config.manager.a.c().e()) {
                        String a3 = a(a2, map, currentTimeMillis);
                        if (!TextUtils.isEmpty(a3)) {
                            return a3;
                        }
                    } else if (com.mbridge.msdk.config.manager.a.c().a(com.mbridge.msdk.config.manager.a.o)) {
                        String a4 = a(a2, map, currentTimeMillis);
                        if (!TextUtils.isEmpty(a4)) {
                            return a4;
                        }
                    } else {
                        a("buyerIdEnd", a2, 3, System.currentTimeMillis() - currentTimeMillis);
                    }
                } catch (Throwable th) {
                    q0.b("BidCommon", th.getMessage());
                }
            }
            if (b == null) {
                b = i.b().d(com.mbridge.msdk.foundation.controller.c.n().b()).o0();
            }
            str = SameMD5.getMD5(v0.d());
            try {
                if (b(context, str)) {
                    return "";
                }
                Map<String, String> map2 = a;
                if (map2 == null || !map2.containsKey(BidConstants.BID_FILTER_KEY_UNIT_ID)) {
                    str2 = "";
                } else {
                    str2 = a.get(BidConstants.BID_FILTER_KEY_UNIT_ID);
                }
                return a(context, str2, str);
            } catch (Exception unused) {
                return a(context, "", str);
            }
        } catch (Exception unused2) {
            str = "";
            return a(context, "", str);
        }
    }

    public static String a(Context context, String str, String str2) {
        long j;
        StringBuffer stringBuffer = new StringBuffer();
        if (context != null) {
            try {
                if (com.mbridge.msdk.foundation.controller.c.n().d() == null) {
                    com.mbridge.msdk.foundation.controller.c.n().b(context);
                }
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("BidCommon", e.getMessage());
                }
            }
        }
        g f = i.b().f(com.mbridge.msdk.foundation.controller.c.n().b());
        if (f == null) {
            f = i.b().a();
        }
        stringBuffer.append(com.mbridge.msdk.foundation.tools.g.d());
        stringBuffer.append(m.ad);
        stringBuffer.append(a.a(1, f, context));
        stringBuffer.append(m.ad);
        stringBuffer.append(a.a(2, f, context));
        stringBuffer.append(m.ad);
        stringBuffer.append(m.ad);
        stringBuffer.append(m.ad);
        stringBuffer.append(m0.t());
        stringBuffer.append(m.ad);
        stringBuffer.append(m0.u());
        stringBuffer.append(m.ad);
        stringBuffer.append(m0.s(context));
        stringBuffer.append(m.ad);
        stringBuffer.append(MBConfiguration.SDK_VERSION);
        stringBuffer.append(m.ad);
        stringBuffer.append(m0.n(context));
        stringBuffer.append(VastAttributes.HORIZONTAL_POSITION);
        stringBuffer.append(m0.m(context));
        stringBuffer.append(m.ad);
        stringBuffer.append(m0.i());
        stringBuffer.append(m.ad);
        stringBuffer.append(a.a(3, f, context));
        stringBuffer.append(m.ad);
        stringBuffer.append(v0.b(20));
        stringBuffer.append(m.ad);
        stringBuffer.append(System.currentTimeMillis());
        stringBuffer.append(m.ad);
        stringBuffer.append(com.mbridge.msdk.foundation.same.a.d);
        stringBuffer.append(m.ad);
        stringBuffer.append(m0.x());
        stringBuffer.append(m.ad);
        stringBuffer.append(m0.h());
        stringBuffer.append(m.ad);
        stringBuffer.append(a.a(4, f, context));
        stringBuffer.append(m.ad);
        stringBuffer.append(a.a(5, f, context));
        stringBuffer.append(m.ad);
        stringBuffer.append(a.a(6, f, context));
        stringBuffer.append(m.ad);
        stringBuffer.append(t0.c());
        stringBuffer.append(m.ad);
        stringBuffer.append(t0.a());
        stringBuffer.append(m.ad);
        try {
            j = l0.a();
        } catch (Exception unused) {
            j = 0;
        }
        if (j > 0) {
            stringBuffer.append(j);
            stringBuffer.append(m.ad);
        } else {
            stringBuffer.append("");
            stringBuffer.append(m.ad);
        }
        stringBuffer.append(m.ad);
        stringBuffer.append(m.ad);
        stringBuffer.append(com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a("b"));
        stringBuffer.append(m.ad);
        stringBuffer.append(com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a("c"));
        stringBuffer.append(m.ad);
        stringBuffer.append(m0.j());
        String a2 = f != null ? f.a() : "";
        stringBuffer.append(m.ad);
        stringBuffer.append(a2);
        stringBuffer.append(m.ad);
        stringBuffer.append(v0.a());
        stringBuffer.append(m.ad);
        String c = v0.c();
        if (TextUtils.isEmpty(c)) {
            c = "";
        }
        stringBuffer.append(c);
        stringBuffer.append(m.ad);
        stringBuffer.append(v0.c(str));
        stringBuffer.append(m.ad);
        if (f != null && f.y0() == 1 && com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
            stringBuffer.append(a.a(7, f, context));
        }
        stringBuffer.append(m.ad);
        stringBuffer.append(m0.G());
        stringBuffer.append(m.ad);
        stringBuffer.append(m0.E(context));
        stringBuffer.append(m.ad);
        stringBuffer.append(m0.D() + "");
        stringBuffer.append(m.ad);
        stringBuffer.append(m0.e(com.mbridge.msdk.foundation.controller.c.n().j()) + "");
        stringBuffer.append(m.ad);
        stringBuffer.append(m0.E());
        stringBuffer.append(m.ad);
        stringBuffer.append(com.mbridge.msdk.foundation.controller.authoritycontroller.b.i() ? "1" : "2");
        stringBuffer.append(m.ad);
        if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            if (com.mbridge.msdk.util.b.b()) {
                stringBuffer.append(m0.F());
            } else {
                stringBuffer.append(a.a(8, f, context));
            }
        }
        stringBuffer.append(m.ad);
        stringBuffer.append("");
        stringBuffer.append(m.ad);
        stringBuffer.append("");
        stringBuffer.append(m.ad);
        stringBuffer.append("");
        stringBuffer.append(m.ad);
        stringBuffer.append("1");
        stringBuffer.append(m.ad);
        stringBuffer.append(com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c());
        stringBuffer.append(m.ad);
        if (m0.A() != 0) {
            stringBuffer.append(m0.A() + "");
        }
        if (DomainNameUtils.getInstance().isExcludeCNDomain()) {
            stringBuffer.append(m.ad);
            stringBuffer.append(1);
        } else {
            stringBuffer.append(m.ad);
            stringBuffer.append("");
        }
        stringBuffer.append(m.ad);
        stringBuffer.append("");
        stringBuffer.append(m.ad);
        stringBuffer.append(str2);
        stringBuffer.append(m.ad);
        stringBuffer.append(m0.r(context));
        stringBuffer.append(m.ad);
        stringBuffer.append(m0.q(context));
        stringBuffer.append(m.ad);
        stringBuffer.append(com.mbridge.msdk.foundation.tools.g.e());
        stringBuffer.append(m.ad);
        stringBuffer.append(com.mbridge.msdk.foundation.tools.g.a());
        stringBuffer.append(m.ad);
        stringBuffer.append(com.mbridge.msdk.util.c.b);
        stringBuffer.append(m.ad);
        stringBuffer.append("");
        stringBuffer.append(m.ad);
        stringBuffer.append(g0.a().b());
        stringBuffer.append(m.ad);
        stringBuffer.append(m0.k(context));
        stringBuffer.append(m.ad);
        stringBuffer.append(m0.u(context));
        stringBuffer.append(m.ad);
        stringBuffer.append(m0.o(context));
        stringBuffer.append(m.ad);
        stringBuffer.append(Build.VERSION.RELEASE);
        stringBuffer.append(m.ad);
        stringBuffer.append(Build.VERSION.SDK_INT);
        stringBuffer.append(m.ad);
        stringBuffer.append(m0.v());
        return k0.b(stringBuffer.toString());
    }

    public static void a(Context context, String str, long j) {
        x0.b(context, str, Long.valueOf(j));
    }

    public static boolean a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return false;
        }
        if (str.equals(str2)) {
            return true;
        }
        for (String str3 : str.split("-")) {
            if (!TextUtils.isEmpty(str3) && str3.length() > 2 && str3.startsWith("{") && str3.endsWith("}")) {
                String substring = str3.substring(1, str3.length() - 1);
                Map<String, String> map = a;
                if (map != null && map.containsKey(substring)) {
                    String valueOf = String.valueOf(a.get(substring));
                    if (!TextUtils.isEmpty(valueOf)) {
                        str = str.replace(str3, valueOf + "");
                    }
                } else if (BidConstants.BID_FILTER_KEY_NETWORK.equals(str3)) {
                    str = str.replace(str3, m0.s(com.mbridge.msdk.foundation.controller.c.n().d()) + "");
                }
            }
        }
        return str.equals(str2);
    }

    private static void a(int i, JSONObject jSONObject, int i2, int i3) {
        try {
            Context d = com.mbridge.msdk.foundation.controller.c.n().d();
            if (d != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("key", "2000122");
                jSONObject2.put("filter", i);
                jSONObject2.put("network_type", m0.s(d));
                jSONObject2.put("timeout", i2);
                if (jSONObject != null && jSONObject.length() > 0) {
                    jSONObject2.put("hitNode", jSONObject);
                }
                jSONObject2.put("hitRate", i3);
                Map<String, String> map = a;
                if (map != null) {
                    if (map.containsKey(BidConstants.BID_FILTER_KEY_UNIT_ID)) {
                        jSONObject2.put(MBridgeConstans.PROPERTIES_UNIT_ID, a.get(BidConstants.BID_FILTER_KEY_UNIT_ID));
                    }
                    if (a.containsKey(BidConstants.BID_FILTER_KEY_PLACEMENT_ID)) {
                        jSONObject2.put("placementId", a.get(BidConstants.BID_FILTER_KEY_PLACEMENT_ID));
                    }
                    if (a.containsKey(BidConstants.BID_FILTER_KEY_AD_TYPE)) {
                        jSONObject2.put("adType", a.get(BidConstants.BID_FILTER_KEY_AD_TYPE));
                    }
                }
                d.b().a(jSONObject2);
            }
        } catch (Throwable th) {
            q0.b("BidCommon", th.getMessage());
        }
    }

    private static void a(String str, int i) {
        e eVar = new e();
        eVar.a("filter", Integer.valueOf(i));
        eVar.a("lrid", str);
        d.b().b("2000124", eVar);
    }

    private static void a(String str, String str2, int i, long j) {
        String str3;
        try {
            if (str.equals("buyerIdStart")) {
                str3 = "m_pipe_buyerid_start";
            } else {
                str3 = "m_pipe_buyerid_end";
            }
            HashMap hashMap = new HashMap();
            hashMap.put(SDKConstants.PARAM_CONTEXT_CONTEXT_ID, str2);
            if (str.equals("buyerIdEnd")) {
                hashMap.put("result", Integer.valueOf(i));
                hashMap.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j));
            }
            com.mbridge.msdk.config.component.common.metrics.b.a(str3, hashMap);
        } catch (Throwable th) {
            q0.b("BidCommon", th.getMessage());
        }
    }

    private static String a(String str, Map<String, String> map, long j) {
        try {
            com.mbridge.msdk.config.component.common.util.a aVar = new com.mbridge.msdk.config.component.common.util.a();
            b$$ExternalSyntheticLambda0 b__externalsyntheticlambda0 = new b$$ExternalSyntheticLambda0(aVar);
            HashMap hashMap = new HashMap();
            if (map != null) {
                hashMap.put(MBridgeConstans.PROPERTIES_UNIT_ID, map.get(BidConstants.BID_FILTER_KEY_UNIT_ID));
                hashMap.put("buyer_params", map);
            }
            HashMap hashMap2 = new HashMap();
            hashMap2.put("callback", b__externalsyntheticlambda0);
            hashMap.put("sdk_context", hashMap2);
            com.mbridge.msdk.config.manager.a.c().a(str, "c4", hashMap);
            Object a2 = aVar.a(com.mbridge.msdk.config.manager.a.o);
            if (a2 instanceof Map) {
                Object obj = ((Map) a2).get(CreativeInfo.L);
                if (obj instanceof String) {
                    a("buyerIdEnd", str, 1, System.currentTimeMillis() - j);
                    return String.valueOf(obj);
                }
                a("buyerIdEnd", str, 2, System.currentTimeMillis() - j);
                return "";
            }
            return "";
        } catch (Throwable th) {
            q0.b("BidCommon", th.getMessage());
            return "";
        }
    }
}
