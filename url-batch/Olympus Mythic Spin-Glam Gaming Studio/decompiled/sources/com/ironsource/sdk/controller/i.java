package com.ironsource.sdk.controller;

import android.content.Context;
import com.ironsource.C4720je;
import com.ironsource.InterfaceC4788na;
import com.ironsource.InterfaceC4986y7;
import com.ironsource.Kb;
import com.ironsource.X3;
import com.ironsource.sdk.utils.Logger;
import com.ironsource.sdk.utils.SDKUtils;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public class i {
    private static final String c = "i";
    private static final String d = "getDeviceData";
    private static final String e = "deviceDataFunction";
    private static final String f = "deviceDataParams";
    private static final String g = "success";
    private static final String h = "fail";
    private Context a;
    private final InterfaceC4986y7 b = Kb.Y().a();

    private static class a {
        String a;
        JSONObject b;
        String c;
        String d;

        private a() {
        }
    }

    public i(Context context) {
        this.a = context;
    }

    void a(String str, InterfaceC4788na interfaceC4788na) throws Exception {
        a a2 = a(str);
        if (d.equals(a2.a)) {
            interfaceC4788na.a(true, a2.c, a());
            return;
        }
        Logger.i(c, "unhandled API request " + str);
    }

    private C4720je a() {
        C4720je c4720je = new C4720je();
        c4720je.b(SDKUtils.encodeString(X3.j.i0), SDKUtils.encodeString(String.valueOf(this.b.j())));
        c4720je.b(SDKUtils.encodeString(X3.j.j0), SDKUtils.encodeString(String.valueOf(this.b.r(this.a))));
        c4720je.b(SDKUtils.encodeString(X3.j.k0), SDKUtils.encodeString(String.valueOf(this.b.D(this.a))));
        c4720je.b(SDKUtils.encodeString(X3.j.l0), SDKUtils.encodeString(String.valueOf(this.b.E(this.a))));
        c4720je.b(SDKUtils.encodeString(X3.j.m0), SDKUtils.encodeString(String.valueOf(this.b.f(this.a))));
        c4720je.b(SDKUtils.encodeString(X3.j.n0), SDKUtils.encodeString(String.valueOf(this.b.i(this.a))));
        return c4720je;
    }

    private a a(String str) throws JSONException {
        JSONObject jsonObjectInit = IronSourceNetworkBridge.jsonObjectInit(str);
        a aVar = new a();
        aVar.a = jsonObjectInit.optString(e);
        aVar.b = jsonObjectInit.optJSONObject(f);
        aVar.c = jsonObjectInit.optString("success");
        aVar.d = jsonObjectInit.optString("fail");
        return aVar;
    }
}
