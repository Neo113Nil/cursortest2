package com.mbridge.msdk.foundation.same.net.utils;

import android.net.Uri;
import android.text.TextUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.DomainNameUtils;
import com.mbridge.msdk.foundation.same.report.m;
import com.mbridge.msdk.foundation.same.report.n;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.s0;
import com.mbridge.msdk.setting.g;
import com.mbridge.msdk.tracker.network.toolbox.h;
import com.mbridge.msdk.tracker.network.toolbox.i;
import com.mbridge.msdk.tracker.p;
import com.mbridge.msdk.tracker.u;
import com.mbridge.msdk.tracker.x;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Pattern;

/* compiled from: RequestUrlUtil.java */
/* loaded from: classes11.dex */
public class d {
    public String A;
    private String B;
    public String C;
    public String D;
    private String E;
    public String F;
    private String G;
    public String H;
    private String I;
    public String J;
    public String K;
    private String L;
    public String M;
    private String N;
    public String O;
    private String P;
    public String Q;
    public String R;
    private String S;
    public String T;
    public String U;
    private String V;
    public String W;
    public String X;
    private String Y;
    public String Z;
    private final String a;
    private String a0;
    public String b;
    public String b0;
    public String c;
    private String c0;
    public String d;
    public String d0;
    public String e;
    private boolean e0;
    public String f;
    private int f0;
    public String g;
    public String h;
    public String i;
    public String j;
    public String k;
    public String l;
    public String m;
    public int n;
    public int o;
    public int p;
    public int q;
    public boolean r;
    public boolean s;
    public int t;
    public ArrayList<String> u;
    public int v;
    public int w;
    public ArrayList<String> x;
    public String y;
    private String z;

    /* compiled from: RequestUrlUtil.java */
    private static class b {
        private static final d a = new d();
    }

    private boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return Pattern.compile("(https|http)://[-A-Za-z0-9{}+&@#/%?=~_|!:,.;]+[-A-Za-z0-9+&@#/%=~_|]").matcher(str.trim()).matches();
    }

    private void b() {
        this.M = this.f + this.L;
    }

    private void c() {
        this.A = this.y + this.z;
        this.H = this.y + this.G;
        i.b().f(this.y);
    }

    public static d h() {
        return b.a;
    }

    public void d(int i) {
        this.f0 = i;
    }

    public void e() {
        this.Q = this.i + this.P;
        this.C = this.i + this.B;
        this.T = this.i + this.S;
        this.J = this.i + this.I;
        this.W = this.i + this.V;
    }

    public void f() {
        this.R = this.m + this.P;
        this.D = this.m + this.B;
        this.U = this.m + this.S;
        this.K = this.m + this.I;
        this.X = this.m + this.V;
    }

    public boolean g() {
        try {
            if (this.s) {
                ArrayList<String> arrayList = this.x;
                if (arrayList != null && this.w <= arrayList.size() - 1) {
                    if (!a(this.x.get(this.w))) {
                        this.m = this.x.get(this.w);
                        f();
                    }
                    return true;
                }
            } else {
                ArrayList<String> arrayList2 = this.u;
                if (arrayList2 != null && this.v <= arrayList2.size() - 1) {
                    this.i = this.u.get(this.v);
                    e();
                    return true;
                }
            }
            if (this.r) {
                this.v = 0;
                this.w = 0;
            }
            return false;
        } catch (Throwable th) {
            q0.a("RequestUrlUtil", th.getMessage());
            return false;
        }
    }

    public int i() {
        return this.f0;
    }

    public void j() {
        HashMap<String, String> E;
        g f = com.mbridge.msdk.setting.i.b().f(com.mbridge.msdk.foundation.controller.c.n().b());
        if (f != null) {
            com.mbridge.msdk.setting.a j = f.j();
            if (j != null) {
                this.l = j.f();
                this.p = j.g();
                this.h = j.e();
                a();
            }
            com.mbridge.msdk.setting.d A = f.A();
            if (A != null) {
                this.k = A.d();
                this.o = A.e();
                this.f = A.c();
                b();
                a(f);
            }
            this.s = f.t0() == 2;
            this.t = f.t0();
            a(!f.b(2));
            if (f.E() != null && f.E().size() > 0 && (E = f.E()) != null && E.size() > 0) {
                if (E.containsKey("v") && !TextUtils.isEmpty(E.get("v")) && a(E.get("v"))) {
                    this.e = E.get("v");
                    d();
                }
                if (E.containsKey(CampaignEx.JSON_KEY_HB) && !TextUtils.isEmpty(E.get(CampaignEx.JSON_KEY_HB)) && a(E.get(CampaignEx.JSON_KEY_HB))) {
                    this.y = E.get(CampaignEx.JSON_KEY_HB);
                    c();
                }
                if (E.containsKey("lg") && !TextUtils.isEmpty(E.get("lg"))) {
                    String str = E.get("lg");
                    if (a(str)) {
                        this.d = str;
                    } else {
                        this.j = str;
                    }
                }
                if (E.containsKey("lgt") && !TextUtils.isEmpty(E.get("lgt"))) {
                    String str2 = E.get("lgt");
                    if (a(str2)) {
                        String b2 = b(str2);
                        if (!TextUtils.isEmpty(b2)) {
                            this.j = b2;
                        }
                    } else {
                        this.j = str2;
                    }
                }
            }
            String v = f.v();
            if (!TextUtils.isEmpty(v)) {
                this.i = v;
                e();
                this.u.add(0, v);
            }
            String w = f.w();
            if (TextUtils.isEmpty(w)) {
                return;
            }
            this.m = w;
            f();
            this.x.add(0, w);
        }
    }

    private d() {
        this.a = "RequestUrlUtil";
        this.b = DomainNameUtils.getInstance().DEFAULT_HOST_APPLETS;
        this.c = DomainNameUtils.getInstance().DEFAULT_CDN_SPARE_SETTING_URL;
        this.d = DomainNameUtils.getInstance().DEFAULT_HOST_ANALYTICS;
        this.e = DomainNameUtils.getInstance().DEFAULT_HOST_API;
        this.f = DomainNameUtils.getInstance().DEFAULT_HOST_MONITOR_DEFAULT;
        this.g = DomainNameUtils.getInstance().DEFAULT_HOST_PRIVACY;
        this.h = DomainNameUtils.getInstance().DEFAULT_HOST_REVENUE_DEFAULT;
        this.i = DomainNameUtils.getInstance().DEFAULT_HOST_SETTING;
        this.j = DomainNameUtils.getInstance().DEFAULT_HOST_TCP_ANALYTICS;
        this.k = DomainNameUtils.getInstance().DEFAULT_HOST_TCP_MONITOR;
        this.l = DomainNameUtils.getInstance().DEFAULT_HOST_TCP_REVENUE;
        this.m = DomainNameUtils.getInstance().DEFAULT_HOST_TCP_SETTING;
        this.n = 9377;
        this.o = 9377;
        this.p = 9988;
        this.q = 9377;
        this.r = false;
        this.s = false;
        this.t = 1;
        this.u = DomainNameUtils.getInstance().SPARE_SETTING_HOST;
        this.v = 0;
        this.w = 0;
        this.x = DomainNameUtils.getInstance().SPARE_TCP_SETTING_HOST;
        this.y = DomainNameUtils.getInstance().DEFAULT_HB_HOST;
        this.z = "/bid";
        this.A = this.y + this.z;
        this.B = "/sdk/customid";
        this.C = this.i + this.B;
        this.D = this.m + this.B;
        this.E = "/image";
        this.F = this.e + this.E;
        this.G = "/load";
        this.H = this.y + this.G;
        this.I = "/mapping";
        this.J = this.i + this.I;
        this.K = this.m + this.I;
        this.L = "";
        this.M = this.h + this.L;
        this.N = "/batchPaidEvent";
        this.O = this.h + this.N;
        this.P = "/setting";
        this.Q = this.i + this.P;
        this.R = this.m + this.P;
        this.S = "/rewardsetting";
        this.T = this.i + this.S;
        this.U = this.m + this.S;
        this.V = "/appwall/setting";
        this.W = this.i + this.V;
        this.X = this.m + this.V;
        this.Y = "/openapi/ad/v3";
        this.Z = this.e + this.Y;
        this.a0 = "/openapi/ad/v4";
        this.b0 = this.e + this.a0;
        this.c0 = "/openapi/ad/v5";
        this.d0 = this.e + this.c0;
        this.e0 = true;
        this.f0 = 0;
    }

    private String b(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            return Uri.parse(str).getHost();
        } catch (Throwable th) {
            q0.b("RequestUrlUtil", th.getMessage());
            return "";
        }
    }

    private void d() {
        this.Z = this.e + this.Y;
        this.b0 = this.e + this.a0;
        this.d0 = this.e + this.c0;
        this.F = this.e + this.E;
    }

    public void c(int i) {
        this.q = i;
    }

    public String a(String str, int i) {
        try {
            if (!TextUtils.isEmpty(str)) {
                String[] split = str.split("_");
                if (split.length > 1) {
                    return a(true, split[1]);
                }
                return a(true, "");
            }
        } catch (Exception e) {
            q0.b("RequestUrlUtil", e.getMessage());
        }
        return i % 2 == 0 ? this.d0 : this.Z;
    }

    public void b(int i) {
        this.n = i;
    }

    public String a(boolean z, String str) {
        if (z) {
            if (this.H.contains(JsonUtils.EMPTY_JSON) && !TextUtils.isEmpty(str)) {
                return this.H.replace(JsonUtils.EMPTY_JSON, str + "-");
            }
            return this.H.replace(JsonUtils.EMPTY_JSON, "");
        }
        return this.A.replace(JsonUtils.EMPTY_JSON, "");
    }

    public void a(boolean z) {
        this.e0 = z;
    }

    private void a() {
        this.O = this.h + this.N;
    }

    private void a(g gVar) {
        com.mbridge.msdk.setting.d A;
        if (gVar == null || (A = gVar.A()) == null || A.a() == 1) {
            return;
        }
        int b2 = s0.a().b("monitor", "type", s0.a().b("t_r_t", 1));
        if (b2 != 0 && b2 != 1) {
            b2 = 0;
        }
        u.a().a(com.mbridge.msdk.foundation.controller.c.n().d(), new x.b().a(new com.mbridge.msdk.foundation.same.report.d()).a(new n()).a(b2, a(b2)).a(s0.a().b("t_m_e_t", 604800000)).b(s0.a().b("t_m_e_s", 50)).d(s0.a().b("t_m_r_c", 50)).c(s0.a().b("t_m_t", 15000)).e(s0.a().b("t_m_r_t_s", 1)).a(), A.b() * 1000, com.mbridge.msdk.foundation.same.report.c.b());
    }

    private p a(int i) {
        if (i == 1) {
            return new p(new m((byte) 2), h().k, h().o);
        }
        return new p(new h(), h().M, 0);
    }
}
