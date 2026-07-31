package com.ironsource.sdk.controller;

import android.content.Context;
import com.ironsource.C4720je;
import com.ironsource.C4782n4;
import com.ironsource.E1;
import com.ironsource.InterfaceC4788na;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.Logger;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class q {
    private static final String b = "q";
    private static final String c = "getPermissions";
    private static final String d = "isPermissionGranted";
    private static final String e = "permissions";
    private static final String f = "permission";
    private static final String g = "status";
    private static final String h = "functionName";
    private static final String i = "functionParams";
    private static final String j = "success";
    private static final String k = "fail";
    private static final String l = "unhandledPermission";
    private Context a;

    private static class a {
        String a;
        JSONObject b;
        String c;
        String d;

        private a() {
        }
    }

    public q(Context context) {
        this.a = context;
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

    public void b(JSONObject jSONObject, a aVar, InterfaceC4788na interfaceC4788na) {
        C4720je c4720je = new C4720je();
        try {
            String string = jSONObject.getString(f);
            c4720je.b(f, string);
            if (E1.d(this.a, string)) {
                c4720je.b("status", String.valueOf(E1.c(this.a, string)));
                interfaceC4788na.a(true, aVar.c, c4720je);
            } else {
                c4720je.b("status", l);
                interfaceC4788na.a(false, aVar.d, c4720je);
            }
        } catch (Exception e2) {
            C4782n4.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
            c4720je.b("errMsg", e2.getMessage());
            interfaceC4788na.a(false, aVar.d, c4720je);
        }
    }

    void a(String str, InterfaceC4788na interfaceC4788na) throws Exception {
        a a2 = a(str);
        if (c.equals(a2.a)) {
            a(a2.b, a2, interfaceC4788na);
            return;
        }
        if (d.equals(a2.a)) {
            b(a2.b, a2, interfaceC4788na);
            return;
        }
        Logger.i(b, "PermissionsJSAdapter unhandled API request " + str);
    }

    public void a(JSONObject jSONObject, a aVar, InterfaceC4788na interfaceC4788na) {
        C4720je c4720je = new C4720je();
        try {
            c4720je.a("permissions", E1.a(this.a, jSONObject.getJSONArray("permissions")));
            interfaceC4788na.a(true, aVar.c, c4720je);
        } catch (Exception e2) {
            C4782n4.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
            Logger.i(b, "PermissionsJSAdapter getPermissions JSON Exception when getting permissions parameter " + e2.getMessage());
            c4720je.b("errMsg", e2.getMessage());
            interfaceC4788na.a(false, aVar.d, c4720je);
        }
    }
}
