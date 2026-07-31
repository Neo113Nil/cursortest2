package sg.bigo.ads.ci;

import android.content.Context;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import com.ironsource.X3;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.safedk.android.analytics.events.CrashEvent;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import sg.bigo.ads.ai.p;
import sg.bigo.ads.ai.q;
import sg.bigo.ads.an.n;
import sg.bigo.ads.api.core.l;
import sg.bigo.ads.api.core.m;
import sg.bigo.ads.api.core.s;
import sg.bigo.ads.api.core.t;
import sg.bigo.ads.common.utils.r;

/* loaded from: classes13.dex */
public abstract class f extends sg.bigo.ads.an.e implements sg.bigo.ads.ai.j {
    protected int A;
    protected boolean B;
    protected String C;
    protected String D;
    protected m E;
    protected sg.bigo.ads.ai.g F;
    protected p G;
    protected q H;

    @Deprecated
    protected String I;
    protected Map<String, sg.bigo.ads.ai.c> J;

    @Deprecated
    protected String K;
    protected String L;
    protected c M;
    protected d N;
    protected int O;
    public String P;
    private int Q;
    private int R;
    private int S;
    private int T;
    private int U;
    private int V;
    private final sg.bigo.ads.ai.b a;
    private int b;
    private int c;
    private String g;
    protected sg.bigo.ads.an.a h;
    protected sg.bigo.ads.an.a i;
    protected sg.bigo.ads.bm.a j;
    protected sg.bigo.ads.an.a k;
    protected long l;
    protected boolean m;
    protected long n;
    protected int o;
    protected String p;
    protected String q;
    protected int r;
    protected String s;
    protected String t;
    protected String u;
    protected String v;
    protected String w;
    protected String x;

    @Deprecated
    protected String y;
    protected String z;

    public f(@NonNull Context context) {
        super(context);
        this.r = 1;
        this.E = new m();
        this.F = new l();
        this.G = new s();
        this.H = new t();
        this.J = new HashMap();
        this.M = new c();
        this.N = new d();
        this.a = new b();
        this.U = 0;
        this.V = 0;
    }

    public static long F() {
        return sg.bigo.ads.common.utils.s.a.a(30);
    }

    private void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.Q = jSONObject.optInt("host_retry", 0);
            this.R = jSONObject.optInt("retry_times", 3);
            this.S = jSONObject.optInt("retry_interval", 60);
            this.T = jSONObject.optInt("next_retry_interval", 7);
        } catch (JSONException unused) {
        }
    }

    @Override // sg.bigo.ads.ai.j
    public final int A() {
        return this.T;
    }

    @Override // sg.bigo.ads.ai.j
    public final sg.bigo.ads.ai.h B() {
        return this.N;
    }

    public final void C() {
        M();
        L();
        N();
    }

    public final int D() {
        boolean z = Math.abs((sg.bigo.ads.common.utils.s.b() / 1000) - this.l) > ((long) this.o);
        return this.r == 0 ? z ? 4 : 5 : z ? 3 : 2;
    }

    public final int E() {
        return this.A;
    }

    public final String G() {
        return this.z;
    }

    public final String H() {
        return this.L;
    }

    public final boolean I() {
        return this.m;
    }

    public final String J() {
        return this.C;
    }

    @NonNull
    public final p K() {
        return this.G;
    }

    public final sg.bigo.ads.an.a L() {
        if (this.h == null) {
            this.h = sg.bigo.ads.an.a.a;
        }
        if (this.h.a()) {
            sg.bigo.ads.bh.d.a(0, new Runnable() { // from class: sg.bigo.ads.ci.f.1
                @Override // java.lang.Runnable
                public final void run() {
                    f fVar = f.this;
                    fVar.h = sg.bigo.ads.bi.c.a(fVar.d);
                    f.this.a(0L);
                }
            });
        }
        return this.h;
    }

    public final sg.bigo.ads.an.a M() {
        if (this.i == null) {
            this.i = sg.bigo.ads.an.a.a;
        }
        if (this.i.a()) {
            sg.bigo.ads.bh.d.a(0, new Runnable() { // from class: sg.bigo.ads.ci.f.2
                @Override // java.lang.Runnable
                public final void run() {
                    f fVar = f.this;
                    fVar.i = sg.bigo.ads.bf.b.a(fVar.d);
                    f.this.a(0L);
                }
            });
        }
        return this.i;
    }

    public final sg.bigo.ads.an.a N() {
        if (this.k == null) {
            this.k = sg.bigo.ads.an.a.a;
        }
        if (this.k.a()) {
            sg.bigo.ads.bh.d.a(0, new Runnable() { // from class: sg.bigo.ads.ci.f.3
                @Override // java.lang.Runnable
                public final void run() {
                    f fVar = f.this;
                    fVar.k = sg.bigo.ads.bd.a.a(fVar.d);
                    f.this.a(0L);
                }
            });
        }
        return this.k;
    }

    public final boolean O() {
        return this.l != 0;
    }

    @CallSuper
    public final int a(@NonNull JSONObject jSONObject, String str) {
        this.m = jSONObject.optInt("state", 1) == 1;
        this.n = jSONObject.optLong("config_id", 0L);
        this.o = jSONObject.optInt("conf_interval", 3600);
        this.p = jSONObject.optString("token", "");
        this.q = jSONObject.optString("anti_ban", "");
        this.r = jSONObject.optInt("config_strategy", 1);
        this.s = jSONObject.optString("abflags", "");
        this.t = jSONObject.optString("country", "");
        this.L = jSONObject.optString("req_country", "");
        int optInt = jSONObject.optInt("app_flag", 0);
        int i = optInt != this.O ? 1 : 0;
        this.O = optInt;
        this.b = jSONObject.optInt("ad_net", 0);
        this.c = jSONObject.optInt(X3.i.n, 0);
        this.U = jSONObject.optInt("token_v", 0);
        this.V = jSONObject.optInt("token_exp", 0);
        String optString = jSONObject.optString("host_retry_cfg", "");
        this.g = optString;
        a(optString);
        JSONObject optJSONObject = jSONObject.optJSONObject("creatives");
        if (optJSONObject != null) {
            this.u = optJSONObject.toString();
        } else {
            this.u = "";
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("track");
        if (optJSONObject2 != null) {
            this.v = optJSONObject2.toString();
        } else {
            this.v = "";
        }
        JSONObject optJSONObject3 = jSONObject.optJSONObject("cb");
        if (optJSONObject3 != null) {
            this.w = optJSONObject3.toString();
        } else {
            this.w = "";
        }
        JSONObject optJSONObject4 = jSONObject.optJSONObject(CrashEvent.e);
        if (optJSONObject4 != null) {
            this.x = optJSONObject4.toString();
        } else {
            this.x = "";
        }
        this.y = "";
        this.K = "";
        String optString2 = jSONObject.optString("uid", "");
        if (!TextUtils.isEmpty(optString2)) {
            this.z = optString2;
        }
        int optInt2 = jSONObject.optInt("concurrent_req_num", 3);
        this.A = optInt2;
        if (optInt2 <= 0) {
            this.A = Integer.MAX_VALUE;
        }
        this.B = jSONObject.optInt("neg_feedback", 1) == 1;
        this.C = jSONObject.optString("om_js_url", "");
        this.D = jSONObject.optString("banner_js_url", "");
        this.F.a(jSONObject.optJSONObject("free_material"));
        this.G.a(jSONObject.optJSONObject("u_running_conf"));
        this.H.a(jSONObject.optJSONObject("u_running_inf"));
        this.E.a = jSONObject.optLong("global_switch", 0L);
        this.I = "";
        c cVar = this.M;
        String optString3 = jSONObject.optString("ad_fill_strategy");
        if (!TextUtils.isEmpty(optString3)) {
            try {
                JSONObject jSONObject2 = new JSONObject(optString3);
                cVar.a = jSONObject2.optInt(CampaignEx.JSON_KEY_VIDEO_RESOLUTION, 0);
                cVar.b = jSONObject2.optString("white_dsp", "");
                cVar.c = jSONObject2.optString("black_dsp", "");
                cVar.d = jSONObject2.optInt("int_time", 0);
                cVar.e = jSONObject2.optInt("rew_time", 0);
                cVar.f = jSONObject2.optInt("spl_time", 0);
                cVar.g = jSONObject2.optInt("nat_time", 0);
                cVar.h = jSONObject2.optInt("pop_time", 0);
                cVar.i.a(jSONObject2);
                cVar.j.a(jSONObject2);
                cVar.k.a(jSONObject2);
                cVar.l.a(jSONObject2);
                cVar.m.a(jSONObject2);
            } catch (JSONException unused) {
            }
        }
        this.a.a(jSONObject.optString("ad_fill_cost_optimize_strategy"));
        d dVar = this.N;
        JSONObject optJSONObject5 = jSONObject.optJSONObject("gdpr");
        if (optJSONObject5 != null) {
            dVar.a = optJSONObject5.optInt("check_by_server", 0);
            dVar.b = optJSONObject5.optInt("check_only_purpose", 0);
            dVar.c = optJSONObject5.optInt("check_vendor", 0);
        }
        String optString4 = jSONObject.optString("global_conf");
        JSONArray jSONArray = null;
        try {
            if (!r.a((CharSequence) optString4)) {
                jSONArray = new JSONArray(optString4);
            }
        } catch (JSONException unused2) {
        }
        HashMap hashMap = new HashMap();
        for (int i2 = 0; jSONArray != null && i2 < jSONArray.length(); i2++) {
            JSONObject optJSONObject6 = jSONArray.optJSONObject(i2);
            if (optJSONObject6 != null) {
                String optString5 = optJSONObject6.optString("key");
                if (!r.a((CharSequence) optString5)) {
                    hashMap.put(optString5, new sg.bigo.ads.ai.c(optJSONObject6.optString("value", "")));
                }
            }
        }
        this.J = hashMap;
        a(optJSONObject2);
        b(optJSONObject);
        c(optJSONObject4);
        d(optJSONObject3);
        this.P = str;
        this.l = sg.bigo.ads.common.utils.s.b() / 1000;
        return i;
    }

    @Override // sg.bigo.ads.an.e
    public final String a() {
        return "bigoad_config.dat";
    }

    @Override // sg.bigo.ads.an.f
    public final void a(@NonNull Parcel parcel) {
        if (this.h == null) {
            this.h = sg.bigo.ads.an.a.a;
        }
        this.h.a(parcel);
        if (this.i == null) {
            this.i = sg.bigo.ads.an.a.a;
        }
        this.i.a(parcel);
        if (this.j == null) {
            this.j = new sg.bigo.ads.bm.a(this.d);
        }
        this.j.a(parcel);
        parcel.writeInt(this.m ? 1 : 0);
        parcel.writeLong(this.n);
        parcel.writeInt(this.o);
        parcel.writeString(this.p);
        parcel.writeString(this.q);
        parcel.writeInt(this.r);
        parcel.writeString(this.s);
        parcel.writeString(this.t);
        parcel.writeString(this.u);
        parcel.writeString(this.v);
        parcel.writeString(this.w);
        parcel.writeString(this.x);
        parcel.writeString(this.y);
        parcel.writeString(this.z);
        parcel.writeInt(this.A);
        parcel.writeInt(this.B ? 1 : 0);
        parcel.writeString(this.C);
        parcel.writeLong(this.l);
        this.E.a(parcel);
        parcel.writeString(this.D);
        this.F.a(parcel);
        parcel.writeString(this.I);
        Map<String, sg.bigo.ads.ai.c> map = this.J;
        int size = map == null ? 0 : map.size();
        parcel.writeInt(size);
        if (size != 0) {
            for (Map.Entry<String, sg.bigo.ads.ai.c> entry : map.entrySet()) {
                String key = entry.getKey();
                sg.bigo.ads.ai.c value = entry.getValue();
                if (key == null || value == null) {
                    parcel.writeInt(0);
                } else {
                    n.a(parcel, value);
                    parcel.writeString(key);
                }
            }
        }
        parcel.writeString(this.K);
        this.G.a(parcel);
        this.H.a(parcel);
        parcel.writeString(this.L);
        n.a(parcel, this.M);
        parcel.writeInt(this.O);
        n.a(parcel, this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        if (this.k == null) {
            this.k = sg.bigo.ads.an.a.a;
        }
        this.k.a(parcel);
        parcel.writeInt(this.U);
        parcel.writeInt(this.V);
        parcel.writeString(this.g);
        n.a(parcel, this.N);
        parcel.writeString(this.P);
    }

    protected abstract void a(JSONObject jSONObject);

    @Override // sg.bigo.ads.an.f
    public final void b(@NonNull Parcel parcel) {
        this.h = new sg.bigo.ads.an.a(parcel);
        this.i = new sg.bigo.ads.an.a(parcel);
        this.j = new sg.bigo.ads.bm.a(this.d, parcel);
        this.m = parcel.readInt() != 0;
        this.n = parcel.readLong();
        this.o = parcel.readInt();
        this.p = parcel.readString();
        this.q = parcel.readString();
        this.r = parcel.readInt();
        this.s = parcel.readString();
        this.t = parcel.readString();
        this.u = parcel.readString();
        this.v = parcel.readString();
        this.w = parcel.readString();
        this.x = parcel.readString();
        this.y = parcel.readString();
        this.z = parcel.readString();
        this.A = parcel.readInt();
        this.B = parcel.readInt() != 0;
        this.C = parcel.readString();
        this.l = parcel.readLong();
        if (parcel.dataAvail() > 0) {
            this.E.b(parcel);
        }
        if (parcel.dataAvail() > 0) {
            this.D = parcel.readString();
        }
        if (parcel.dataAvail() > 0) {
            this.F.b(parcel);
        }
        this.I = n.a(parcel, "");
        this.J = n.a(parcel, sg.bigo.ads.ai.c.b, new HashMap());
        this.K = n.a(parcel, "");
        if (parcel.dataAvail() > 0) {
            this.G.b(parcel);
        }
        if (parcel.dataAvail() > 0) {
            this.H.b(parcel);
        }
        this.L = n.a(parcel, "");
        n.b(parcel, this.M);
        this.O = n.a(parcel, 0);
        n.b(parcel, this.a);
        this.b = n.a(parcel, 0);
        this.c = n.a(parcel, 0);
        this.k = new sg.bigo.ads.an.a(parcel);
        this.U = n.a(parcel, 0);
        this.V = n.a(parcel, 0);
        String a = n.a(parcel, "");
        this.g = a;
        a(a);
        n.b(parcel, this.N);
        this.P = n.a(parcel, "");
    }

    protected abstract void b(JSONObject jSONObject);

    protected abstract void c(JSONObject jSONObject);

    @Override // sg.bigo.ads.ai.j
    public final boolean c() {
        return this.E.a(6);
    }

    protected abstract void d(JSONObject jSONObject);

    @Override // sg.bigo.ads.ai.j
    public final boolean d() {
        return this.E.a(7);
    }

    public final void e(@NonNull JSONObject jSONObject) {
        this.n = jSONObject.optLong("config_id", 0L);
        this.p = jSONObject.optString("token", "");
    }

    @Override // sg.bigo.ads.ai.j
    public final boolean e() {
        return d();
    }

    @Override // sg.bigo.ads.ai.j
    public final boolean f() {
        return this.E.a(5);
    }

    @Override // sg.bigo.ads.ai.j
    public final boolean g() {
        return this.E.a(4);
    }

    @Override // sg.bigo.ads.ai.j
    public final boolean h() {
        return this.E.a(22);
    }

    @Override // sg.bigo.ads.ai.j
    public final long i() {
        return this.n;
    }

    @Override // sg.bigo.ads.ai.j
    public final String j() {
        return this.s;
    }

    @Override // sg.bigo.ads.ai.j
    public final String k() {
        return this.t;
    }

    @Override // sg.bigo.ads.ai.j
    public final String l() {
        return this.p;
    }

    @Override // sg.bigo.ads.ai.j
    @NonNull
    public final sg.bigo.ads.ai.l n() {
        return this.E;
    }

    @Override // sg.bigo.ads.ai.j
    public final String o() {
        return this.D;
    }

    @Override // sg.bigo.ads.ai.j
    @NonNull
    public final sg.bigo.ads.ai.g p() {
        return this.F;
    }

    @Override // sg.bigo.ads.ai.j
    @NonNull
    public final sg.bigo.ads.ai.b q() {
        return this.a;
    }

    @Override // sg.bigo.ads.ai.j
    public final sg.bigo.ads.ai.d r() {
        return this.M;
    }

    @Override // sg.bigo.ads.ai.j
    public final int s() {
        return this.O;
    }

    @Override // sg.bigo.ads.ai.j
    public final boolean t() {
        return this.b == 1;
    }

    @Override // sg.bigo.ads.ai.j
    public final int u() {
        return this.c;
    }

    @Override // sg.bigo.ads.ai.j
    public final int v() {
        return this.U;
    }

    @Override // sg.bigo.ads.ai.j
    public final int w() {
        return this.V;
    }

    @Override // sg.bigo.ads.ai.j
    public final boolean x() {
        return 1 == this.Q;
    }

    @Override // sg.bigo.ads.ai.j
    public final int y() {
        return this.R;
    }

    @Override // sg.bigo.ads.ai.j
    public final int z() {
        return this.S;
    }
}
