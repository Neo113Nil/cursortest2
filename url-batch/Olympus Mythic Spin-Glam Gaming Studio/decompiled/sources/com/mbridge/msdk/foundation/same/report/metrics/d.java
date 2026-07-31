package com.mbridge.msdk.foundation.same.report.metrics;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.db.g;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.n;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.s0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.tracker.m;
import com.mbridge.msdk.tracker.network.toolbox.h;
import com.mbridge.msdk.tracker.p;
import com.mbridge.msdk.tracker.x;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: MetricsManager.java */
/* loaded from: classes8.dex */
public class d {
    private static d e;
    private volatile m a;
    private Map<String, e> b = new HashMap();
    private LinkedHashMap<String, c> c = new LinkedHashMap<>();
    private Map<String, e> d = new HashMap();

    private d() {
        if (this.a == null) {
            this.a = m.a("metrics_sdk", com.mbridge.msdk.foundation.controller.c.n().d(), a());
        }
        JSONObject b = com.mbridge.msdk.foundation.same.report.c.b();
        if (this.a != null) {
            this.a.a(b);
            this.a.h();
        }
    }

    public c a(boolean z, String str, e eVar, CampaignEx campaignEx, String str2) {
        c cVar;
        c cVar2 = new c();
        try {
            a(z, str2);
            String md5 = TextUtils.isEmpty(str) ? SameMD5.getMD5(v0.d()) : a(str);
            campaignEx.setLocalRequestId(md5);
            cVar2 = b().b(md5);
            if (cVar2 == null) {
                cVar = new c();
                try {
                    b().c().put(md5, cVar);
                    cVar.d(true);
                    b().c().put(md5, cVar);
                    cVar2 = cVar;
                } catch (Exception e2) {
                    e = e2;
                    if (MBridgeConstans.DEBUG) {
                        q0.b("MetricsManager", e.getMessage());
                    }
                    return cVar;
                }
            }
            cVar2.i(md5);
            cVar2.n(str2);
            if (eVar != null) {
                if (eVar.a("adtp")) {
                    cVar2.a(Integer.parseInt((String) eVar.b("adtp")));
                }
                if (eVar.a(CampaignEx.JSON_KEY_HB)) {
                    String str3 = (String) eVar.b(CampaignEx.JSON_KEY_HB);
                    cVar2.h(str3);
                    if (str3.equals("1")) {
                        cVar2.g(str);
                    }
                }
            }
            cVar2.f(z ? "2" : "1");
            return cVar2;
        } catch (Exception e3) {
            e = e3;
            cVar = cVar2;
        }
    }

    public void b(c cVar) {
        if (cVar != null) {
            try {
                if (this.b != null) {
                    e eVar = new e();
                    eVar.a("rs_rid", cVar.x());
                    eVar.a("r_stid", cVar.y());
                    eVar.a("rus_rid", cVar.z());
                    eVar.a("u_stid", cVar.C());
                    this.b.put(cVar.B(), eVar);
                }
            } catch (Exception e2) {
                if (MBridgeConstans.DEBUG) {
                    e2.printStackTrace();
                }
            }
        }
    }

    public e c(String str) {
        Map<String, e> map;
        e eVar = new e();
        try {
            return (TextUtils.isEmpty(str) || (map = this.b) == null || !map.containsKey(str)) ? eVar : this.b.get(str);
        } catch (Exception e2) {
            if (!MBridgeConstans.DEBUG) {
                return eVar;
            }
            e2.printStackTrace();
            return eVar;
        }
    }

    public void d(String str) {
        b(str, "");
    }

    public m e() {
        try {
            JSONObject b = com.mbridge.msdk.foundation.same.report.c.b();
            if (this.a == null) {
                this.a = m.a("metrics_sdk", com.mbridge.msdk.foundation.controller.c.n().d(), a());
                if (this.a != null) {
                    this.a.a(b);
                    this.a.h();
                }
            } else {
                this.a.a(b);
            }
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                e2.printStackTrace();
            }
        }
        return this.a;
    }

    public String d() {
        return this.a == null ? "" : this.a.d();
    }

    public LinkedHashMap<String, c> c() {
        return this.c;
    }

    public static d b() {
        if (e == null) {
            synchronized (d.class) {
                try {
                    if (e == null) {
                        e = new d();
                    }
                } finally {
                }
            }
        }
        return e;
    }

    public void e(String str) {
        try {
            JSONObject a = com.mbridge.msdk.foundation.same.c.a(str);
            if (a != null && a.length() != 0) {
                String optString = a.optString("key");
                if (TextUtils.isEmpty(optString)) {
                    return;
                }
                com.mbridge.msdk.tracker.e eVar = new com.mbridge.msdk.tracker.e(optString);
                eVar.a(0);
                eVar.b(0);
                eVar.a(com.mbridge.msdk.foundation.same.report.c.d());
                eVar.a(a);
                m e2 = b().e();
                if (e2 == null || !e2.g()) {
                    return;
                }
                e2.d(eVar);
            }
        } catch (Exception e3) {
            if (MBridgeConstans.DEBUG) {
                q0.b("EventLibraryReport", "reportByTrackManager error: " + e3.getMessage());
            }
        }
    }

    public void b(String str, c cVar, com.mbridge.msdk.foundation.same.report.metrics.callback.a aVar) {
        a(str, cVar, aVar);
    }

    public void b(String str, e eVar) {
        try {
            c cVar = new c();
            if (eVar.b(MBridgeConstans.PROPERTIES_UNIT_ID) != null) {
                cVar.n(String.valueOf(eVar.b(MBridgeConstans.PROPERTIES_UNIT_ID)));
            }
            if (eVar.b("lrid") != null && (eVar.b("lrid") instanceof String)) {
                cVar.i(String.valueOf(eVar.b("lrid")));
            }
            cVar.a(str, eVar);
            new f().b(str, e(), cVar, null);
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                e2.printStackTrace();
            }
        }
    }

    public c b(String str) {
        return a(str, "");
    }

    public void b(String str, String str2) {
        LinkedHashMap<String, c> linkedHashMap;
        try {
            String str3 = str + str2;
            if (!TextUtils.isEmpty(str3) && (linkedHashMap = this.c) != null && linkedHashMap.containsKey(str3)) {
                this.c.remove(str3);
            }
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                e2.printStackTrace();
            }
        }
    }

    public String a(String str) {
        String str2 = "";
        try {
            if (TextUtils.isEmpty(str)) {
                str2 = SameMD5.getMD5(v0.d());
            }
            String[] split = str.split("_");
            if (split != null && split.length >= 3) {
                str2 = split[2];
            }
            return TextUtils.isEmpty(str2) ? SameMD5.getMD5(v0.d()) : str2;
        } catch (Exception e2) {
            if (!MBridgeConstans.DEBUG) {
                return "";
            }
            e2.printStackTrace();
            return "";
        }
    }

    private void a(boolean z, String str) {
        List<String> e2;
        if (z) {
            try {
                com.mbridge.msdk.foundation.db.e a = com.mbridge.msdk.foundation.db.e.a(g.a(com.mbridge.msdk.foundation.controller.c.n().d()));
                if (a != null && (e2 = a.e(str)) != null && e2.size() > 0) {
                    Iterator<String> it = e2.iterator();
                    while (it.hasNext()) {
                        b().d(it.next());
                    }
                }
                LinkedHashMap<String, c> c = b().c();
                if (c == null || c.size() <= 0) {
                    return;
                }
                Iterator<Map.Entry<String, c>> it2 = c.entrySet().iterator();
                while (it2.hasNext()) {
                    Map.Entry<String, c> next = it2.next();
                    if (next != null && next.getValue().E()) {
                        it2.remove();
                    }
                }
            } catch (Exception e3) {
                if (MBridgeConstans.DEBUG) {
                    e3.printStackTrace();
                }
            }
        }
    }

    public void a(String str, e eVar) {
        Map<String, e> map = this.d;
        if (map != null) {
            map.put(str, eVar);
        }
    }

    public e a(int i, int i2, String str, boolean z, int i3) {
        e eVar = new e();
        try {
            eVar.a(CampaignEx.JSON_KEY_HB, Integer.valueOf(i));
            eVar.a("adtp", Integer.valueOf(i2));
            eVar.a(MBridgeConstans.PROPERTIES_UNIT_ID, str);
            if (z) {
                eVar.a("auto_load", Integer.valueOf(i3));
            }
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                e2.printStackTrace();
            }
        }
        return eVar;
    }

    private x a() {
        try {
            int b = s0.a().b("metrics", "t_m_e_t", s0.a().b("t_m_e_t", 604800000));
            int b2 = s0.a().b("metrics", "t_m_e_s", s0.a().b("t_m_e_s", 50));
            int b3 = s0.a().b("metrics", "t_m_r_c", s0.a().b("t_m_r_c", 50));
            int b4 = s0.a().b("metrics", "t_m_t", s0.a().b("t_m_t", 15000));
            int b5 = s0.a().b("metrics", "t_m_r_t_s", s0.a().b("t_m_r_t_s", 2));
            int b6 = s0.a().b("metrics", "t_r_t", s0.a().b("t_r_t", 1));
            if (b6 != 0 && b6 != 1) {
                b6 = 0;
            }
            return new x.b().a(b).b(b2).d(b3).c(b4).e(b5).a(new com.mbridge.msdk.foundation.same.report.d()).a(com.mbridge.msdk.foundation.same.report.c.c()).a(new n()).a(b6, a(b6)).a();
        } catch (Exception e2) {
            q0.b("EventLibraryReport", "configTrackManager error: " + e2.getMessage());
            return null;
        }
    }

    private p a(int i) {
        if (i == 1) {
            return new p(new com.mbridge.msdk.foundation.same.report.m((byte) 2), com.mbridge.msdk.foundation.same.net.utils.d.h().j, com.mbridge.msdk.foundation.same.net.utils.d.h().n);
        }
        return new p(new h(), com.mbridge.msdk.foundation.same.net.utils.d.h().d, 0);
    }

    public void a(String str, CampaignEx campaignEx, e eVar) {
        c cVar;
        String str2 = "";
        if (campaignEx != null) {
            try {
                str2 = campaignEx.getLocalRequestId();
                cVar = c().get(str2);
            } catch (Exception e2) {
                if (MBridgeConstans.DEBUG) {
                    e2.printStackTrace();
                    return;
                }
                return;
            }
        } else {
            cVar = null;
        }
        if (cVar != null) {
            if (Arrays.asList(b.h).contains(str)) {
                cVar = a(cVar);
            }
        } else {
            cVar = new c();
        }
        cVar.a(campaignEx);
        cVar.i(str2);
        cVar.a(str, eVar);
        a(str, cVar, (com.mbridge.msdk.foundation.same.report.metrics.callback.a) null);
    }

    public void a(String str, CampaignEx campaignEx) {
        String str2 = "";
        if (campaignEx != null) {
            try {
                str2 = campaignEx.getCurrentLocalRid();
            } catch (Exception e2) {
                if (MBridgeConstans.DEBUG) {
                    e2.printStackTrace();
                    return;
                }
                return;
            }
        }
        c cVar = c().get(str2);
        if (cVar == null) {
            cVar = new c();
        }
        if (cVar.o() != null && !cVar.o().isEmpty() && campaignEx != null) {
            int i = 0;
            while (true) {
                if (i >= cVar.o().size()) {
                    break;
                }
                if (cVar.o().get(i).getId().equals(campaignEx.getId())) {
                    cVar.o().set(i, campaignEx);
                    break;
                }
                i++;
            }
        }
        cVar.a(campaignEx);
        cVar.i(str2);
        a(str, cVar, (com.mbridge.msdk.foundation.same.report.metrics.callback.a) null);
    }

    public void a(String str, List<CampaignEx> list, e eVar) {
        CampaignEx campaignEx;
        String str2 = "";
        if (list != null) {
            try {
                if (list.size() > 0 && (campaignEx = list.get(0)) != null) {
                    str2 = campaignEx.getCurrentLocalRid();
                }
            } catch (Exception e2) {
                if (MBridgeConstans.DEBUG) {
                    e2.printStackTrace();
                    return;
                }
                return;
            }
        }
        c cVar = c().get(str2);
        if (cVar == null) {
            cVar = new c();
        }
        cVar.b(list);
        if (list != null && list.size() > 0) {
            cVar.i(list.get(0).getCurrentLocalRid());
        }
        cVar.a(str, eVar);
        a(str, cVar, (com.mbridge.msdk.foundation.same.report.metrics.callback.a) null);
    }

    public void a(com.mbridge.msdk.foundation.entity.n nVar, CampaignEx campaignEx) {
        e eVar = new e();
        eVar.a("result", Integer.valueOf(nVar.x()));
        eVar.a("scenes", nVar.a("scenes", ""));
        eVar.a("resource_type", Integer.valueOf(nVar.y()));
        eVar.a("url", nVar.a("url", ""));
        eVar.a("reason", nVar.t());
        eVar.a("mraid_type", Integer.valueOf(nVar.p()));
        b().a(nVar.n(), campaignEx, eVar);
    }

    public void a(String str, c cVar) {
        try {
            Map<String, e> map = this.d;
            if (map != null && map.containsKey(str) && cVar != null) {
                cVar.a(str, this.d.get(str));
            }
            new f().a(str, e(), cVar, null);
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                e2.printStackTrace();
            }
        }
    }

    public void a(String str, c cVar, CampaignEx campaignEx, Context context, com.mbridge.msdk.foundation.same.report.metrics.callback.a aVar) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            if (cVar == null) {
                cVar = new c();
            }
            e eVar = new e();
            eVar.a("st", Long.valueOf(System.currentTimeMillis()));
            if (campaignEx != null) {
                eVar.a("cid", campaignEx.getId());
                eVar.a("lrid", campaignEx.getLocalRequestId());
                eVar.a(com.safedk.android.analytics.brandsafety.m.x, campaignEx.getRequestId());
                eVar.a("rid_n", campaignEx.getRequestIdNotice());
                eVar.a("adtp", Integer.valueOf(campaignEx.getAdType()));
                if (!eVar.a(MBridgeConstans.PROPERTIES_UNIT_ID)) {
                    eVar.a(MBridgeConstans.PROPERTIES_UNIT_ID, campaignEx.getCampaignUnitId());
                }
                eVar.a(CampaignEx.JSON_KEY_HB, Integer.valueOf(campaignEx.isBidCampaign() ? 1 : 0));
                eVar.a("bid_tk", campaignEx.getBidToken());
            }
            if (context != null) {
                eVar.a("network_type", Integer.valueOf(m0.s(context)));
            }
            cVar.a(str, eVar);
            a(str, cVar, aVar);
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                e2.printStackTrace();
            }
        }
    }

    private void a(String str, c cVar, com.mbridge.msdk.foundation.same.report.metrics.callback.a aVar) {
        try {
            if (Arrays.asList(b.c).contains(str)) {
                cVar.d(str);
            }
            Map<String, e> map = this.d;
            if (map != null && map.containsKey(str)) {
                cVar.a(str, this.d.get(str));
            }
            new f().a(str, e(), cVar, aVar);
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                e2.printStackTrace();
            }
        }
    }

    public c a(String str, String str2) {
        LinkedHashMap<String, c> linkedHashMap;
        try {
            String str3 = str + str2;
            if (!TextUtils.isEmpty(str3) && (linkedHashMap = this.c) != null && linkedHashMap.containsKey(str3)) {
                return this.c.get(str3);
            }
            return null;
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                e2.printStackTrace();
            }
            return null;
        }
    }

    public c a(c cVar) {
        if (cVar == null) {
            return null;
        }
        try {
            return (c) cVar.clone();
        } catch (CloneNotSupportedException e2) {
            if (!MBridgeConstans.DEBUG) {
                return null;
            }
            e2.printStackTrace();
            return null;
        }
    }

    public void a(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                if (jSONObject.length() == 0) {
                    return;
                }
                String optString = jSONObject.optString("key");
                if (TextUtils.isEmpty(optString)) {
                    return;
                }
                com.mbridge.msdk.tracker.e eVar = new com.mbridge.msdk.tracker.e(optString);
                eVar.a(0);
                eVar.b(0);
                eVar.a(com.mbridge.msdk.foundation.same.report.c.d());
                eVar.a(jSONObject);
                m e2 = b().e();
                if (e2 == null || !e2.g()) {
                    return;
                }
                e2.d(eVar);
            } catch (Exception e3) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("EventLibraryReport", "reportByTrackManager error: " + e3.getMessage());
                }
            }
        }
    }
}
