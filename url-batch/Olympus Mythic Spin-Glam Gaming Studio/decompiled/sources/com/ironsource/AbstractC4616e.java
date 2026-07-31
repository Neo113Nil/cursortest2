package com.ironsource;

import android.text.TextUtils;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.e, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
abstract class AbstractC4616e {
    private final String a = "eventId";
    private final String b = "timestamp";
    private final String c = "InterstitialEvents";
    private final String d = "events";
    private final String e = "events";
    JSONObject f;
    int g;
    private String h;

    AbstractC4616e() {
    }

    private String a(int i) {
        return i != 2 ? "events" : "InterstitialEvents";
    }

    protected abstract String a();

    public abstract String a(ArrayList<C4966x5> arrayList, JSONObject jSONObject);

    String b() {
        return TextUtils.isEmpty(this.h) ? a() : this.h;
    }

    public abstract String c();

    JSONObject a(C4966x5 c4966x5) {
        JSONObject jsonObjectInit;
        try {
            String a = c4966x5.a();
            if (!TextUtils.isEmpty(a)) {
                jsonObjectInit = IronSourceNetworkBridge.jsonObjectInit(a);
            } else {
                jsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
            }
            jsonObjectInit.put("eventId", c4966x5.c());
            jsonObjectInit.put("timestamp", c4966x5.d());
            return jsonObjectInit;
        } catch (JSONException e) {
            C4782n4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
            return null;
        }
    }

    String a(JSONArray jSONArray) {
        try {
            if (this.f != null) {
                JSONObject jsonObjectInit = IronSourceNetworkBridge.jsonObjectInit(this.f.toString());
                jsonObjectInit.put("timestamp", IronSourceUtils.e());
                jsonObjectInit.put(a(this.g), jSONArray);
                return jsonObjectInit.toString();
            }
        } catch (Exception e) {
            C4782n4.d().a(e);
        }
        return "";
    }

    void a(String str) {
        this.h = str;
    }
}
