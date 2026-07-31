package sg.bigo.ads.cq;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.gamingservices.cloudgaming.internal.SDKAnalyticsEvents;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import sg.bigo.ads.ai.k;
import sg.bigo.ads.ai.n;
import sg.bigo.ads.aj.c;
import sg.bigo.ads.aj.g;
import sg.bigo.ads.api.b;
import sg.bigo.ads.api.core.o;
import sg.bigo.ads.api.core.p;
import sg.bigo.ads.common.utils.l;
import sg.bigo.ads.common.utils.r;

/* loaded from: classes3.dex */
public final class a {
    /* JADX WARN: Multi-variable type inference failed */
    @NonNull
    public static Map<String, Object> a(@NonNull String str, @NonNull n nVar, @NonNull sg.bigo.ads.api.b bVar, @Nullable sg.bigo.ads.api.core.b bVar2, @Nullable Integer num) {
        sg.bigo.ads.api.core.b j;
        HashMap hashMap = new HashMap();
        hashMap.put("action", str);
        hashMap.put("slot", nVar.l());
        hashMap.put("config_id", Long.valueOf(k.a.i()));
        hashMap.put("placement_id", nVar.n());
        hashMap.put("strategy_id", nVar.a());
        hashMap.put("ad_type", Integer.valueOf(nVar.b()));
        hashMap.put("abflags", r.a(k.a.j(), nVar.o()));
        hashMap.put("ts", Long.valueOf(System.currentTimeMillis()));
        hashMap.put("begin_ts", Long.valueOf(bVar.g.f));
        hashMap.put("banner_type", Integer.valueOf(bVar.b));
        hashMap.put("adn_name", "bigoad");
        JSONObject jSONObject = new JSONObject();
        b.a aVar = bVar.g;
        sg.bigo.ads.common.utils.k.a(jSONObject, SDKAnalyticsEvents.PARAMETER_SESSION_ID, aVar.c());
        sg.bigo.ads.common.utils.k.a(jSONObject, "gps_country", aVar.d());
        sg.bigo.ads.common.utils.k.a(jSONObject, "sim_country", aVar.e());
        sg.bigo.ads.common.utils.k.a(jSONObject, "system_country", aVar.f());
        sg.bigo.ads.common.utils.k.a(jSONObject, "req_status", Integer.valueOf(aVar.h()));
        if (bVar2 != null) {
            sg.bigo.ads.common.utils.k.a(jSONObject, "adx_country", bVar2.n());
        }
        if (nVar.w()) {
            sg.bigo.ads.common.utils.k.a(jSONObject, "config_country", k.a.k());
        }
        String g = aVar.g();
        if (!r.a((CharSequence) g)) {
            sg.bigo.ads.common.utils.k.a(jSONObject, "load_ext", g);
        }
        if (num != null) {
            sg.bigo.ads.common.utils.k.a(jSONObject, "auc_mode", num);
        }
        if ((bVar instanceof sg.bigo.ads.aj.b) && (j = ((sg.bigo.ads.aj.b) bVar).j()) != null) {
            sg.bigo.ads.common.utils.k.a(jSONObject, "host_slot", j.b());
            sg.bigo.ads.common.utils.k.a(jSONObject, "host_placement", j.c());
            sg.bigo.ads.common.utils.k.a(jSONObject, "host_sid", Long.valueOf(j.z()));
            sg.bigo.ads.common.utils.k.a(jSONObject, "host_ad_id", j.s());
        }
        if (bVar instanceof c) {
            sg.bigo.ads.common.utils.k.a(jSONObject, "icon_req_num", Integer.valueOf(((c) bVar).k()));
        }
        hashMap.put("extra_json", jSONObject.toString());
        return hashMap;
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x01b0, code lost:
    
        if (r0.bw() > 0) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01b2, code lost:
    
        sg.bigo.ads.common.utils.k.a(r11, "ad_imp_indx", java.lang.Integer.valueOf(r0.bw()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01ca, code lost:
    
        if (r0.bw() > 0) goto L64;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Map<String, Object> a(@NonNull String str, @NonNull n nVar, @NonNull sg.bigo.ads.api.b bVar, @Nullable sg.bigo.ads.api.core.b bVar2, @Nullable Integer num, @Nullable String str2, @Nullable String str3, @Nullable sg.bigo.ads.aj.a aVar) {
        JSONObject jSONObject;
        o oVar;
        g gVar;
        Map<String, Object> a = a(str, nVar, bVar, bVar2, num);
        Object obj = a.get("extra_json");
        if (obj != null && (obj instanceof String)) {
            try {
                jSONObject = new JSONObject((String) obj);
            } catch (JSONException unused) {
            } finally {
                new JSONObject();
            }
        }
        if (aVar instanceof g) {
            gVar = (g) aVar;
            sg.bigo.ads.api.core.b bVar3 = (sg.bigo.ads.api.core.b) l.b(gVar.a());
            if (bVar3 != null) {
                a.put("adx_type", Integer.valueOf(bVar3.x()));
                a.put("sid", Long.valueOf(bVar3.z()));
                a.put("dsp", bVar3.w());
                a.put("logid", Long.valueOf(bVar3.aa()));
            }
            str.hashCode();
            switch (str) {
                case "filled":
                    sg.bigo.ads.common.utils.k.a(jSONObject, "icon_fill_num", Integer.valueOf(gVar.i()));
                    break;
                case "impression":
                case "clicked":
                    sg.bigo.ads.common.utils.k.a(jSONObject, "icon_fill_num", Integer.valueOf(gVar.i()));
                    sg.bigo.ads.common.utils.k.a(jSONObject, "icon_show_num", Integer.valueOf(gVar.j()));
                    break;
            }
        } else if (bVar2 != null) {
            sg.bigo.ads.aj.a Q = aVar != null ? aVar.Q() : null;
            if (Q instanceof g) {
                g gVar2 = (g) Q;
                sg.bigo.ads.common.utils.k.a(jSONObject, "icon_fill_num", Integer.valueOf(gVar2.i()));
                sg.bigo.ads.common.utils.k.a(jSONObject, "icon_show_num", Integer.valueOf(gVar2.j()));
            }
            a.put(CreativeInfo.c, bVar2.s());
            a.put("creative_id", bVar2.A());
            a.put("sid", Long.valueOf(bVar2.z()));
            a.put("series_id", bVar2.B());
            a.put("adx_type", Integer.valueOf(bVar2.x()));
            a.put("mapping_slot", bVar2.N());
            a.put("enc_price", bVar2.I());
            String J = bVar2.J();
            if (!TextUtils.isEmpty(J)) {
                a.put("abflags", r.a((String) a.get("abflags"), J));
            }
            sg.bigo.ads.common.utils.k.a(jSONObject, "dsp", bVar2.w());
            sg.bigo.ads.common.utils.k.a(jSONObject, "logid", Long.valueOf(bVar2.aa()));
            if (sg.bigo.ads.api.core.a.c(nVar.b())) {
                sg.bigo.ads.common.utils.k.a(jSONObject, "style_id", bVar2.ac());
            }
            str.hashCode();
            if (str.equals("impression")) {
                if (bVar2 instanceof o) {
                    oVar = (o) bVar2;
                }
            } else if (str.equals("clicked")) {
                boolean z = bVar2 instanceof o;
                if (z) {
                    o oVar2 = (o) bVar2;
                    if (oVar2.bx() > 0) {
                        sg.bigo.ads.common.utils.k.a(jSONObject, "ad_click_indx", Integer.valueOf(oVar2.bx()));
                    }
                }
                if (z) {
                    oVar = (o) bVar2;
                }
            }
        }
        sg.bigo.ads.common.utils.k.a(jSONObject, SDKAnalyticsEvents.PARAMETER_SESSION_ID, bVar.g.b);
        if (str2 != null) {
            sg.bigo.ads.common.utils.k.a(jSONObject, "sec_price", str2);
        }
        if (str3 != null) {
            sg.bigo.ads.common.utils.k.a(jSONObject, "sec_bidder", str3);
        }
        p b_ = aVar != null ? aVar.b_() : null;
        if (b_ != null && b_.a != null) {
            sg.bigo.ads.common.utils.k.a(jSONObject, "is_vpaid", 1);
        }
        a.put("extra_json", jSONObject.toString());
        return a;
    }
}
