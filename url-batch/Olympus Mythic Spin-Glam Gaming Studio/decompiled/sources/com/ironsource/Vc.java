package com.ironsource;

import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes10.dex */
class Vc extends AbstractC4616e {
    private final String i = C4666gd.a;

    Vc(int i) {
        this.g = i;
    }

    @Override // com.ironsource.AbstractC4616e
    public String a() {
        return C4666gd.a;
    }

    @Override // com.ironsource.AbstractC4616e
    public String c() {
        return "outcome";
    }

    @Override // com.ironsource.AbstractC4616e
    public String a(ArrayList<C4966x5> arrayList, JSONObject jSONObject) {
        if (jSONObject == null) {
            this.f = IronSourceNetworkBridge.jsonObjectInit();
        } else {
            this.f = jSONObject;
        }
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
        return a(jSONArray);
    }
}
