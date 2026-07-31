package com.mbridge.msdk.setting;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: BaseUnitSetting.java */
/* loaded from: classes5.dex */
public class c {
    private String A;
    private int D;
    private int E;
    private int I;
    private String K;
    private int N;
    private List<Integer> b;
    private List<Integer> c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private long k;
    private long l;
    private int m;
    private int n;
    private int o;
    private long p;
    private long q;
    private int r;
    private String s;
    private int t;
    private int u;
    private String z;
    private String a = "";
    private int j = 0;
    private int v = 30;
    private int w = 1;
    private int x = 10;
    private int y = 60;
    private int B = 1;
    private String C = "";
    private int F = 100;
    private int G = 60;
    private int H = 5000;
    private int J = 1;
    private String L = "";
    private String M = "";

    public static m a(JSONObject jSONObject) {
        m mVar = null;
        if (jSONObject == null) {
            return null;
        }
        try {
            m mVar2 = new m();
            try {
                mVar2.e(jSONObject.optString("unitId"));
                mVar2.a(jSONObject.optString("ab_id"));
                mVar2.f(jSONObject.optString(com.safedk.android.analytics.brandsafety.m.x));
                JSONArray optJSONArray = jSONObject.optJSONArray("adSourceList");
                if (optJSONArray != null && optJSONArray.length() > 0) {
                    ArrayList arrayList = new ArrayList();
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        arrayList.add(Integer.valueOf(optJSONArray.optInt(i)));
                    }
                    mVar2.a(arrayList);
                }
                JSONArray optJSONArray2 = jSONObject.optJSONArray("ad_source_timeout");
                if (optJSONArray2 != null && optJSONArray2.length() > 0) {
                    ArrayList arrayList2 = new ArrayList();
                    for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                        arrayList2.add(Integer.valueOf(optJSONArray2.optInt(i2)));
                    }
                    mVar2.b(arrayList2);
                }
                mVar2.x(jSONObject.optInt("tpqn"));
                mVar2.c(jSONObject.optInt("aqn"));
                mVar2.b(jSONObject.optInt("acn"));
                mVar2.z(jSONObject.optInt("wt"));
                int i3 = 1;
                mVar2.o(jSONObject.optInt("iscasf", 1));
                mVar2.w(jSONObject.optInt("spmxrt", 5000));
                mVar2.c(jSONObject.optLong("current_time"));
                mVar2.r(jSONObject.optInt("offset"));
                mVar2.d(jSONObject.optLong("dlct", 3600L));
                mVar2.d(jSONObject.optInt("autoplay", 0));
                mVar2.k(jSONObject.optInt("dlnet", 2));
                mVar2.c(jSONObject.optString("no_offer"));
                mVar2.f(jSONObject.optInt("cb_type"));
                mVar2.b(jSONObject.optLong("clct", 86400L));
                mVar2.a(jSONObject.optLong("clcq", 300L));
                mVar2.u(jSONObject.optInt(CampaignEx.JSON_KEY_READY_RATE, 100));
                mVar2.g(jSONObject.optInt("cd_rate", 0));
                mVar2.i(jSONObject.optInt("content", 1));
                mVar2.m(jSONObject.optInt("impt", 0));
                mVar2.l(jSONObject.optInt("icon_type", 1));
                mVar2.b(jSONObject.optString("no_ads_url", ""));
                mVar2.t(jSONObject.optInt("playclosebtn_tm", -1));
                mVar2.s(jSONObject.optInt("play_ctdown", 0));
                mVar2.h(jSONObject.optInt("close_alert", 0));
                mVar2.n(jSONObject.optInt("intershowlimit", 30));
                mVar2.v(jSONObject.optInt("refreshFq", 60));
                mVar2.e(jSONObject.optInt("closeBtn", 0));
                int optInt = jSONObject.optInt("tmorl", 1);
                if (optInt <= 2 && optInt > 0) {
                    i3 = optInt;
                }
                mVar2.y(i3);
                mVar2.d(jSONObject.optString("placementid", ""));
                mVar2.p(jSONObject.optInt("ltafemty", 10));
                mVar2.q(jSONObject.optInt("ltorwc", 60));
                mVar2.g(jSONObject.optString("vtag", ""));
                return mVar2;
            } catch (Exception e) {
                e = e;
                mVar = mVar2;
                e.printStackTrace();
                return mVar;
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    public int A() {
        return this.D;
    }

    public int B() {
        return this.E;
    }

    public int C() {
        return this.F;
    }

    public int D() {
        return this.G;
    }

    public int E() {
        return this.H;
    }

    public int F() {
        return this.I;
    }

    public int G() {
        return this.J;
    }

    public String H() {
        return this.K;
    }

    public String I() {
        return this.L;
    }

    public String J() {
        return this.M;
    }

    public int K() {
        return this.N;
    }

    public int L() {
        return this.g;
    }

    public JSONObject M() {
        JSONObject jSONObject = new JSONObject();
        try {
            List<Integer> b = b();
            if (b != null && b.size() > 0) {
                int size = b.size();
                JSONArray jSONArray = new JSONArray();
                for (int i = 0; i < size; i++) {
                    jSONArray.put(b.get(i));
                }
                jSONObject.put("adSourceList", jSONArray);
            }
            List<Integer> c = c();
            if (c != null && c.size() > 0) {
                int size2 = c.size();
                JSONArray jSONArray2 = new JSONArray();
                for (int i2 = 0; i2 < size2; i2++) {
                    jSONArray2.put(c.get(i2));
                }
                jSONObject.put("ad_source_timeout", jSONArray2);
            }
            jSONObject.put("tpqn", F());
            jSONObject.put("aqn", f());
            jSONObject.put("acn", e());
            jSONObject.put("wt", K());
            jSONObject.put("current_time", o());
            jSONObject.put("offset", y());
            jSONObject.put("dlct", p());
            jSONObject.put("autoplay", L());
            jSONObject.put("dlnet", q());
            jSONObject.put("no_offer", x());
            jSONObject.put("cb_type", h());
            jSONObject.put("clct", k());
            jSONObject.put("clcq", j());
            jSONObject.put(CampaignEx.JSON_KEY_READY_RATE, C());
            jSONObject.put("content", m());
            jSONObject.put("impt", s());
            jSONObject.put("icon_type", r());
            jSONObject.put("no_ads_url", w());
            jSONObject.put("playclosebtn_tm", B());
            jSONObject.put("play_ctdown", A());
            jSONObject.put("close_alert", l());
            jSONObject.put("closeBtn", g());
            jSONObject.put("refreshFq", D());
            jSONObject.put("countdown", n());
            jSONObject.put("allowSkip", d());
            jSONObject.put("tmorl", G());
            jSONObject.put("unitId", H());
            jSONObject.put("placementid", z());
            jSONObject.put("ltafemty", u());
            jSONObject.put("ltorwc", v());
            jSONObject.put("vtag", J());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    public List<Integer> b() {
        return this.b;
    }

    public void c(String str) {
        this.A = str;
    }

    public void d(int i) {
        this.g = i;
    }

    public int e() {
        return this.e;
    }

    public int f() {
        return this.f;
    }

    public int g() {
        return this.h;
    }

    public int h() {
        return this.i;
    }

    public int i() {
        return this.j;
    }

    public long j() {
        return this.k;
    }

    public long k() {
        return this.l;
    }

    public int l() {
        return this.m;
    }

    public int m() {
        return this.n;
    }

    public int n() {
        return this.o;
    }

    public long o() {
        return this.p;
    }

    public long p() {
        return this.q;
    }

    public int q() {
        return this.r;
    }

    public int r() {
        return this.t;
    }

    public int s() {
        return this.u;
    }

    public int t() {
        return this.w;
    }

    public int u() {
        return this.x;
    }

    public int v() {
        return this.y;
    }

    public String w() {
        return this.z;
    }

    public String x() {
        return this.A;
    }

    public void y(int i) {
        this.J = i;
    }

    public String z() {
        return this.C;
    }

    public void b(List<Integer> list) {
        this.c = list;
    }

    public List<Integer> c() {
        return this.c;
    }

    public int d() {
        return this.d;
    }

    public void e(int i) {
        this.h = i;
    }

    public void f(int i) {
        this.i = i;
    }

    public void g(int i) {
        this.j = i;
    }

    public void h(int i) {
        this.m = i;
    }

    public void i(int i) {
        this.n = i;
    }

    public void j(int i) {
        this.o = i;
    }

    public void k(int i) {
        this.r = i;
    }

    public void l(int i) {
        this.t = i;
    }

    public void m(int i) {
        this.u = i;
    }

    public void n(int i) {
        this.v = i;
    }

    public void o(int i) {
        this.w = i;
    }

    public void p(int i) {
        this.x = i;
    }

    public void q(int i) {
        this.y = i;
    }

    public void r(int i) {
        this.B = i;
    }

    public void s(int i) {
        this.D = i;
    }

    public void t(int i) {
        this.E = i;
    }

    public String toString() {
        List<Integer> list = this.b;
        String str = "";
        if (list != null && list.size() > 0) {
            Iterator<Integer> it = this.b.iterator();
            while (it.hasNext()) {
                str = str + it.next() + StringUtils.COMMA;
            }
        }
        return "offset = " + y() + " unitId = " + this.K + " fbPlacementId = " + this.s + str;
    }

    public void u(int i) {
        this.F = i;
    }

    public void v(int i) {
        this.G = i;
    }

    public void w(int i) {
        this.H = i;
    }

    public void x(int i) {
        this.I = i;
    }

    public int y() {
        return this.B;
    }

    public void z(int i) {
        this.N = i;
    }

    public void b(int i) {
        this.e = i;
    }

    public void c(int i) {
        this.f = i;
    }

    public void d(long j) {
        this.q = j;
    }

    public void e(String str) {
        this.K = str;
    }

    public void f(String str) {
        this.L = str;
    }

    public void g(String str) {
        this.M = str;
    }

    public void b(long j) {
        this.l = j;
    }

    public void c(long j) {
        this.p = j;
    }

    public void d(String str) {
        this.C = str;
    }

    public void b(String str) {
        this.z = str;
    }

    public String a() {
        return this.a;
    }

    public void a(String str) {
        this.a = str;
        com.mbridge.msdk.foundation.controller.a.r.put(this.K, str);
    }

    public void a(List<Integer> list) {
        this.b = list;
    }

    public void a(int i) {
        this.d = i;
    }

    public void a(long j) {
        this.k = j;
    }
}
