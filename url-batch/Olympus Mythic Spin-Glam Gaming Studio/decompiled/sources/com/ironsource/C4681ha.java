package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.ha, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
class C4681ha extends AbstractC4616e {
    private final String i = "https://o-sdk.mediation.unity3d.com/mediation?adUnit=2";
    private final String j = "super.dwh.mediation_events";
    private final String k = B5.R;
    private final String l = "data";

    C4681ha(int i) {
        this.g = i;
    }

    @Override // com.ironsource.AbstractC4616e
    public String a() {
        return "https://o-sdk.mediation.unity3d.com/mediation?adUnit=2";
    }

    @Override // com.ironsource.AbstractC4616e
    public String c() {
        return "ironbeast";
    }

    @Override // com.ironsource.AbstractC4616e
    public String a(ArrayList<C4966x5> arrayList, JSONObject jSONObject) {
        JSONObject jsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
        if (jSONObject == null) {
            this.f = IronSourceNetworkBridge.jsonObjectInit();
        } else {
            this.f = jSONObject;
        }
        try {
            JSONArray jSONArray = new JSONArray();
            if (arrayList != null && !arrayList.isEmpty()) {
                Iterator<C4966x5> it = arrayList.iterator();
                while (it.hasNext()) {
                    JSONObject a = a(it.next());
                    if (a != null) {
                        jSONArray.put(a);
                    }
                }
            }
            jsonObjectInit.put(B5.R, "super.dwh.mediation_events");
            jsonObjectInit.put("data", a(jSONArray));
            return jsonObjectInit.toString();
        } catch (JSONException e) {
            C4782n4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
            return "";
        }
    }
}
