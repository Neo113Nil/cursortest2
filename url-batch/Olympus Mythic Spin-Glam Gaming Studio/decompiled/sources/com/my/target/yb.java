package com.my.target;

import android.text.TextUtils;
import com.ironsource.X3;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes4.dex */
final class yb {
    yb() {
    }

    public String a(vh vhVar) {
        if (vhVar.a.f != vb.a() && vhVar.a.a() == 1) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("ad_context", a(vhVar.a));
                w0 w0Var = vhVar.b;
                if (w0Var != null) {
                    jSONObject.put("banner_context", a(w0Var));
                }
                jSONObject.put(X3.i.q, vhVar.c);
                jSONObject.put("stat_description", vhVar.d);
                return jSONObject.toString();
            } catch (Throwable th) {
                mi.a("MonitoringSerializer: seriailize exception - " + th.getMessage());
            }
        }
        return "";
    }

    public vh a(String str) {
        if (TextUtils.isEmpty(str)) {
            return vh.e;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            t a = a(jSONObject.getJSONObject("ad_context"));
            return new vh(a, jSONObject.has("banner_context") ? a(a, jSONObject.getJSONObject("banner_context")) : null, jSONObject.getInt(X3.i.q), jSONObject.getString("stat_description"));
        } catch (Throwable th) {
            mi.a("MonitoringSerializer: deseriailize exception - " + th.getMessage());
            return vh.e;
        }
    }

    private w0 a(t tVar, JSONObject jSONObject) {
        return tVar.a(new u0(jSONObject.getString("banner_id"), ya.c(jSONObject, "impression_id"), ya.c(jSONObject, "pad_id"), ya.c(jSONObject, "pattern_id"), ya.a(jSONObject, "dsp_id"), ya.b(jSONObject, "labels")));
    }

    private t a(JSONObject jSONObject) {
        t a;
        String string = jSONObject.getString(CreativeInfo.c);
        String string2 = jSONObject.has("handle_data_id") ? jSONObject.getString("handle_data_id") : null;
        int i = jSONObject.getInt("ad_format");
        Integer valueOf = jSONObject.has("slot_id") ? Integer.valueOf(jSONObject.getInt("slot_id")) : null;
        int i2 = jSONObject.getInt("ad_source");
        int i3 = jSONObject.getInt("cache_policy");
        if (i2 == 0 && valueOf != null) {
            a = t.a(string, valueOf.intValue(), i, vb.b());
        } else if (i2 == 1) {
            a = t.a(string, string2, i, vb.b());
        } else if (i2 == 2) {
            a = t.a(string, i, vb.b());
        } else {
            throw new Exception("Unknown json format or content");
        }
        a.c(true);
        a.a(i3);
        return a;
    }

    private JSONObject a(t tVar) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(CreativeInfo.c, tVar.a);
        jSONObject.putOpt("handle_data_id", tVar.b);
        jSONObject.put("ad_format", tVar.c);
        jSONObject.putOpt("slot_id", tVar.d);
        jSONObject.put("ad_source", tVar.e);
        jSONObject.put("cache_policy", tVar.b());
        jSONObject.put("tag", tVar.d());
        return jSONObject;
    }

    private JSONObject a(w0 w0Var) {
        JSONObject jSONObject = new JSONObject();
        u0 u0Var = w0Var.b;
        jSONObject.put("banner_id", u0Var.a);
        jSONObject.put("impression_id", u0Var.b);
        jSONObject.put("pad_id", u0Var.c);
        jSONObject.put("pattern_id", u0Var.d);
        Integer num = u0Var.e;
        if (num != null) {
            jSONObject.put("dsp_id", num);
        }
        if (u0Var.f != null) {
            JSONArray jSONArray = new JSONArray();
            Iterator it = u0Var.f.iterator();
            while (it.hasNext()) {
                jSONArray.put(((Integer) it.next()).intValue());
            }
            jSONObject.put("labels", jSONArray);
        }
        return jSONObject;
    }
}
