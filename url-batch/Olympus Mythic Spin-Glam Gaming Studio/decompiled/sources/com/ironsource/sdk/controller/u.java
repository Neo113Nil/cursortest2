package com.ironsource.sdk.controller;

import android.content.Context;
import com.ironsource.C4720je;
import com.ironsource.C4782n4;
import com.ironsource.C4826pc;
import com.ironsource.C4830pg;
import com.ironsource.InterfaceC4788na;
import com.ironsource.environment.StringUtils;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.Logger;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class u {
    private static final String d = "u";
    private static final String e = "updateToken";
    private static final String f = "getToken";
    private static final String g = "functionName";
    private static final String h = "functionParams";
    private static final String i = "success";
    private static final String j = "fail";
    private Context b;
    private C4826pc a = new C4826pc();
    private C4830pg c = new C4830pg();

    private static class a {
        String a;
        JSONObject b;
        String c;
        String d;

        private a() {
        }
    }

    public u(Context context) {
        this.b = context;
    }

    private a a(String str) throws JSONException {
        JSONObject jsonObjectInit = IronSourceNetworkBridge.jsonObjectInit(str);
        a aVar = new a();
        aVar.a = jsonObjectInit.optString("functionName");
        aVar.b = jsonObjectInit.optJSONObject("functionParams");
        aVar.c = jsonObjectInit.optString("success");
        aVar.d = jsonObjectInit.optString("fail");
        return aVar;
    }

    void a(String str, InterfaceC4788na interfaceC4788na) throws Exception {
        a a2 = a(str);
        if (e.equals(a2.a)) {
            a(a2.b, a2, interfaceC4788na);
            return;
        }
        if (f.equals(a2.a)) {
            a(a2, interfaceC4788na);
            return;
        }
        Logger.i(d, "unhandled API request " + str);
    }

    public void a(JSONObject jSONObject, a aVar, InterfaceC4788na interfaceC4788na) {
        C4720je c4720je = new C4720je();
        try {
            this.a.a(jSONObject);
            interfaceC4788na.a(true, aVar.c, c4720je);
        } catch (Exception e2) {
            C4782n4.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
            Logger.i(d, "updateToken exception " + e2.getMessage());
            interfaceC4788na.a(false, aVar.d, c4720je);
        }
    }

    private void a(a aVar, InterfaceC4788na interfaceC4788na) {
        try {
            JSONObject a2 = this.c.a();
            Iterator<String> keys = a2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                Object obj = a2.get(next);
                if (obj instanceof String) {
                    a2.put(next, StringUtils.encodeURI((String) obj));
                }
            }
            interfaceC4788na.a(true, aVar.c, a2);
        } catch (Exception e2) {
            C4782n4.d().a(e2);
            interfaceC4788na.a(false, aVar.d, e2.getMessage());
        }
    }
}
