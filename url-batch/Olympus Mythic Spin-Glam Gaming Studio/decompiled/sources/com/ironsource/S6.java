package com.ironsource;

import android.content.Context;
import com.ironsource.O6;
import com.ironsource.environment.ContextProvider;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public class S6 {
    private static final String a = "adunit_data";

    public void a(String str, Object obj) {
        P6.b().b(str, obj);
    }

    public void a(Map<String, Object> map) {
        P6.b().a(map);
    }

    public void a(String str, JSONArray jSONArray) {
        P6.b().a(str, jSONArray);
    }

    public void a(String str, JSONObject jSONObject) {
        P6.b().a(str, jSONObject);
    }

    public void a(Context context) {
        P6.b().c(context);
    }

    public void a(String str) {
        P6.b().b(str);
    }

    public void a(@NotNull String str, @NotNull Object obj, @NotNull O6.a aVar) {
        try {
            String name = aVar.name();
            P6 b = P6.b();
            JSONObject optJSONObject = b.b(ContextProvider.getInstance().getApplicationContext()).optJSONObject(a);
            if (optJSONObject == null) {
                b.b(a, IronSourceNetworkBridge.jsonObjectInit().put(name, IronSourceNetworkBridge.jsonObjectInit().put(str, obj)));
                return;
            }
            JSONObject optJSONObject2 = optJSONObject.optJSONObject(name);
            if (optJSONObject2 == null) {
                b.b(a, optJSONObject.put(name, IronSourceNetworkBridge.jsonObjectInit().put(str, obj)));
            } else {
                b.b(a, optJSONObject.put(name, optJSONObject2.put(str, obj)));
            }
        } catch (JSONException e) {
            C4782n4.d().a(e);
        }
    }

    public void a(@NotNull String str, @NotNull O6.a aVar) {
        JSONObject optJSONObject;
        try {
            String name = aVar.name();
            P6 b = P6.b();
            JSONObject optJSONObject2 = b.b(ContextProvider.getInstance().getApplicationContext()).optJSONObject(a);
            if (optJSONObject2 == null || (optJSONObject = optJSONObject2.optJSONObject(name)) == null || optJSONObject.remove(str) == null) {
                return;
            }
            b.b(a, optJSONObject2.put(name, optJSONObject));
        } catch (JSONException e) {
            C4782n4.d().a(e);
        }
    }
}
