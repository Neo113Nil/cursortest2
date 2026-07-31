package com.ironsource;

import android.content.Context;
import com.ironsource.O6;
import com.ironsource.environment.ContextProvider;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public class Q6 {
    private static final String a = "adunit_data";

    public JSONObject a(List<String> list) throws JSONException {
        return a(ContextProvider.getInstance().getApplicationContext(), list);
    }

    public JSONObject a(Context context, String[] strArr) throws JSONException {
        return a(a(P6.b().b(context)), strArr);
    }

    public JSONObject a(List<String> list, O6.a aVar) throws JSONException {
        return a(a(ContextProvider.getInstance().getApplicationContext(), aVar), (String[]) list.toArray(new String[list.size()]));
    }

    private JSONObject a(Context context, List<String> list) throws JSONException {
        return a(a(P6.b().b(context)), (String[]) list.toArray(new String[list.size()]));
    }

    public JSONObject a(String[] strArr) throws JSONException {
        return a(a(P6.b().b(ContextProvider.getInstance().getApplicationContext())), strArr);
    }

    private JSONObject a(Context context, @NotNull O6.a aVar) throws JSONException {
        String name = aVar.name();
        JSONObject b = P6.b().b(context);
        JSONObject optJSONObject = b.optJSONObject(a);
        JSONObject a2 = a(b);
        if (optJSONObject != null && optJSONObject.optJSONObject(name) != null) {
            JSONObject jSONObject = optJSONObject.getJSONObject(name);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                a2.putOpt(next, jSONObject.opt(next));
            }
        }
        return a2;
    }

    private JSONObject a(JSONObject jSONObject, String[] strArr) throws JSONException {
        JSONObject jsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
        for (String str : strArr) {
            if (jSONObject.has(str)) {
                jsonObjectInit.put(str, jSONObject.opt(str));
            }
        }
        return jsonObjectInit;
    }

    private JSONObject a(JSONObject jSONObject) {
        jSONObject.remove(a);
        return jSONObject;
    }
}
