package sg.bigo.ads.ci;

import android.os.Parcel;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import sg.bigo.ads.ai.m;
import sg.bigo.ads.ai.n;
import sg.bigo.ads.ai.o;
import sg.bigo.ads.an.f;

/* loaded from: classes4.dex */
class j implements n, sg.bigo.ads.an.f {
    private final h a = new h();
    protected String b;
    protected int c;
    protected int d;
    protected int e;
    protected int f;
    protected int g;
    protected int h;
    protected boolean i;
    protected boolean j;
    protected boolean k;
    protected int l;
    protected String m;
    protected boolean n;
    protected String o;
    protected List<sg.bigo.ads.ai.a> p;
    protected String q;
    protected String r;
    protected o s;
    protected int t;
    protected int u;
    protected boolean v;
    protected int w;

    j() {
    }

    private void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (this.c == 4 && !jSONObject.has("interstitial_video_style")) {
                jSONObject = new JSONObject().put("interstitial_video_style", jSONObject);
            }
            this.s = new k(jSONObject);
        } catch (JSONException unused) {
        }
    }

    @Override // sg.bigo.ads.ai.n
    public String a() {
        return this.b;
    }

    public void a(@NonNull Parcel parcel) {
        parcel.writeString(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
        parcel.writeInt(this.f);
        parcel.writeInt(this.g);
        parcel.writeInt(this.h);
        parcel.writeInt(this.i ? 1 : 0);
        parcel.writeInt(this.j ? 1 : 0);
        parcel.writeInt(this.k ? 1 : 0);
        parcel.writeInt(this.l);
        parcel.writeString(this.m);
        parcel.writeInt(this.n ? 1 : 0);
        parcel.writeString(this.o);
        sg.bigo.ads.an.n.a(parcel, this.p);
        parcel.writeInt(this.t);
        parcel.writeString(this.r);
        o oVar = this.s;
        parcel.writeString(oVar == null ? null : oVar.toString());
        parcel.writeInt(this.v ? 1 : 0);
        parcel.writeInt(this.u);
        parcel.writeInt(this.w);
        sg.bigo.ads.an.n.a(parcel, this.a);
    }

    public boolean a(JSONObject jSONObject) {
        if (jSONObject == null) {
            sg.bigo.ads.bn.a.a(0, "Slot", "parseData error, jsonObject is null.");
            return false;
        }
        this.d = jSONObject.optInt("countdown", 5);
        this.c = jSONObject.optInt("ad_type", -1);
        this.b = jSONObject.optString("strategy_id", "");
        this.e = jSONObject.optInt("req_once_load_timeout", 15);
        this.f = jSONObject.optInt("media_strategy", 0);
        this.g = jSONObject.optInt("webview_enforce_duration", 0) * 1000;
        this.h = jSONObject.optInt("video_direction", 0);
        this.i = sg.bigo.ads.api.core.a.d(this.c) || jSONObject.optInt("video_replay", 1) == 1;
        this.j = sg.bigo.ads.api.core.a.d(this.c) || jSONObject.optInt("video_mute", 0) == 0;
        this.k = jSONObject.optInt("banner_auto_refresh", 0) == 1;
        this.l = jSONObject.optInt("banner_refresh_interval", 20);
        this.m = jSONObject.optString("slot", "");
        this.n = jSONObject.optInt("state", 1) == 1;
        this.o = jSONObject.optString("placement_id", "");
        JSONArray optJSONArray = jSONObject.optJSONArray("express_list");
        this.p = new ArrayList();
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                a aVar = new a();
                if (optJSONObject == null) {
                    sg.bigo.ads.bn.a.a(0, "AdExpress", "parseData error, jsonObject is null.");
                } else {
                    aVar.a = optJSONObject.optLong("id", 0L);
                    aVar.b = optJSONObject.optString("name", "");
                    aVar.c = optJSONObject.optString("url", "");
                    aVar.d = optJSONObject.optString("md5", "");
                    aVar.e = optJSONObject.optString("style", "");
                    aVar.f = optJSONObject.optString("ad_types", "");
                    aVar.g = optJSONObject.optString("file_id", "");
                    if (aVar.a != 0 && !TextUtils.isEmpty(aVar.b) && !TextUtils.isEmpty(aVar.c) && !TextUtils.isEmpty(aVar.d) && !TextUtils.isEmpty(aVar.f) && !TextUtils.isEmpty(aVar.g)) {
                        this.p.add(aVar);
                    }
                }
            }
        }
        this.q = jSONObject.optString("abflags");
        this.t = jSONObject.optInt("playable", 0);
        this.r = jSONObject.optString("style_id");
        a(jSONObject.optString("interstitial_style_config"));
        this.v = jSONObject.optInt("banner_multiple_click", 1) == 1;
        this.u = jSONObject.optInt("companion_render", 0);
        this.w = jSONObject.optInt("auc_mode", 0);
        h hVar = this.a;
        hVar.a = jSONObject.optInt("video_click_mode", 1) == 1;
        hVar.b = jSONObject.optInt("native_ad_view_clickable", 0) == 1;
        hVar.c = jSONObject.optInt("native_ad_click_type", 0);
        if (this.n) {
            return (TextUtils.isEmpty(this.m) || TextUtils.isEmpty(this.o)) ? false : true;
        }
        return true;
    }

    @Override // sg.bigo.ads.ai.n
    public int b() {
        return this.c;
    }

    public void b(@NonNull Parcel parcel) {
        this.b = parcel.readString();
        this.c = parcel.readInt();
        this.d = parcel.readInt();
        this.e = parcel.readInt();
        this.f = parcel.readInt();
        this.g = parcel.readInt();
        this.h = parcel.readInt();
        this.i = parcel.readInt() != 0;
        this.j = parcel.readInt() != 0;
        this.k = parcel.readInt() != 0;
        this.l = parcel.readInt();
        this.m = parcel.readString();
        this.n = parcel.readInt() != 0;
        this.o = parcel.readString();
        this.p = sg.bigo.ads.an.n.a(parcel, new f.a<sg.bigo.ads.ai.a>() { // from class: sg.bigo.ads.ci.j.1
            @Override // sg.bigo.ads.an.f.a
            public final /* synthetic */ sg.bigo.ads.ai.a a() {
                return new a();
            }
        });
        this.t = sg.bigo.ads.an.n.a(parcel, 0);
        this.r = sg.bigo.ads.an.n.a(parcel, "");
        a(sg.bigo.ads.an.n.a(parcel, ""));
        this.v = sg.bigo.ads.an.n.b(parcel, true);
        this.u = sg.bigo.ads.an.n.a(parcel, 0);
        this.w = sg.bigo.ads.an.n.a(parcel, 0);
        sg.bigo.ads.an.n.b(parcel, this.a);
    }

    @Override // sg.bigo.ads.ai.n
    public int c() {
        return this.d;
    }

    @Override // sg.bigo.ads.ai.n
    public int d() {
        return this.e;
    }

    @Override // sg.bigo.ads.ai.n
    public int e() {
        return this.f;
    }

    @Override // sg.bigo.ads.ai.n
    public int f() {
        return this.g;
    }

    @Override // sg.bigo.ads.ai.n
    public int g() {
        return this.h;
    }

    @Override // sg.bigo.ads.ai.n
    public boolean h() {
        return this.i;
    }

    @Override // sg.bigo.ads.ai.n
    public boolean i() {
        return this.j;
    }

    @Override // sg.bigo.ads.ai.n
    public boolean j() {
        return this.k;
    }

    @Override // sg.bigo.ads.ai.n
    public int k() {
        return this.l;
    }

    @Override // sg.bigo.ads.ai.n
    public String l() {
        return this.m;
    }

    @Override // sg.bigo.ads.ai.n
    public boolean m() {
        return this.n;
    }

    @Override // sg.bigo.ads.ai.n
    public String n() {
        return this.o;
    }

    @Override // sg.bigo.ads.ai.n
    public String o() {
        return this.q;
    }

    @Override // sg.bigo.ads.ai.n
    public String p() {
        return this.r;
    }

    @Override // sg.bigo.ads.ai.n
    @NonNull
    public o q() {
        if (this.s == null) {
            this.s = new k(new JSONObject());
        }
        return this.s;
    }

    @Override // sg.bigo.ads.ai.n
    public int r() {
        return this.t;
    }

    @Override // sg.bigo.ads.ai.n
    public boolean s() {
        return this.t == 1;
    }

    @Override // sg.bigo.ads.ai.n
    public boolean t() {
        return this.u == 1;
    }

    @NonNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        List<sg.bigo.ads.ai.a> list = this.p;
        if (list != null) {
            for (sg.bigo.ads.ai.a aVar : list) {
                if (sb.length() > 0) {
                    sb.append(StringUtils.COMMA);
                }
                sb.append(aVar);
            }
        }
        return "{strategyId=" + this.b + ", adType=" + this.c + ", countdown=" + this.d + ", reqTimeout=" + this.e + ", mediaStrategy=" + this.f + ", webViewEnforceDuration=" + this.g + ", videoDirection=" + this.h + ", videoReplay=" + this.i + ", videoMute=" + this.j + ", bannerAutoRefresh=" + this.k + ", bannerRefreshInterval=" + this.l + ", slotId='" + this.m + "', state=" + this.n + ", placementId='" + this.o + "', express=[" + sb.toString() + "], styleId=" + this.r + ", playable=" + this.t + ", isCompanionRenderSupport=" + this.u + ", aucMode=" + this.w + ", nativeAdClickConfig=" + this.a + '}';
    }

    @Override // sg.bigo.ads.ai.n
    public boolean u() {
        return this.v;
    }

    @Override // sg.bigo.ads.ai.n
    public int v() {
        return this.w;
    }

    @Override // sg.bigo.ads.ai.n
    public boolean w() {
        return this.w == 3;
    }

    @Override // sg.bigo.ads.ai.n
    @NonNull
    public m x() {
        return this.a;
    }
}
