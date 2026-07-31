package com.ironsource.sdk.controller;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.C4720je;
import com.ironsource.C4768m8;
import com.ironsource.C4782n4;
import com.ironsource.InterfaceC4679h8;
import com.ironsource.InterfaceC4788na;
import com.ironsource.Kg;
import com.ironsource.hh;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class a implements InterfaceC4679h8 {
    private static final String d = "loadWithUrl";
    private static final String e = "sendMessage";
    public static final String f = "removeAdView";
    public static final String g = "webviewAction";
    public static final String h = "handleGetViewVisibility";
    private static final String i = "functionName";
    private static final String j = "functionParams";
    private static final String k = "success";
    private static final String l = "fail";
    public static final String m = "errMsg";
    private static final String n = "%s | unsupported AdViews API";
    private hh a;
    private C4768m8 b = C4768m8.a();
    private Context c;

    /* renamed from: com.ironsource.sdk.controller.a$a, reason: collision with other inner class name */
    private static class C1372a {
        String a;
        JSONObject b;
        String c;
        String d;

        private C1372a() {
        }
    }

    public a(Context context) {
        this.c = context;
    }

    public void a(hh hhVar) {
        this.a = hhVar;
    }

    @Override // com.ironsource.InterfaceC4679h8
    public void a(String str, JSONObject jSONObject) {
        if (this.a == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.a.a(str, jSONObject);
    }

    @Override // com.ironsource.InterfaceC4679h8
    public void a(String str, String str2, String str3) {
        a(str, Kg.a(str2, str3));
    }

    void a(String str, InterfaceC4788na interfaceC4788na) throws Exception {
        char c;
        C1372a a = a(str);
        C4720je c4720je = new C4720je();
        try {
            String str2 = a.a;
            switch (str2.hashCode()) {
                case -1384357108:
                    if (str2.equals(f)) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 691453791:
                    if (str2.equals("sendMessage")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 842351363:
                    if (str2.equals("loadWithUrl")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 1182065477:
                    if (str2.equals("handleGetViewVisibility")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 1491535759:
                    if (str2.equals(g)) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            if (c == 0) {
                this.b.a(this, a.b, this.c, a.c, a.d);
                return;
            }
            if (c == 1) {
                this.b.d(a.b, a.c, a.d);
                return;
            }
            if (c == 2) {
                this.b.c(a.b, a.c, a.d);
            } else if (c == 3) {
                this.b.a(a.b, a.c, a.d);
            } else {
                if (c != 4) {
                    throw new IllegalArgumentException(String.format(n, a.a));
                }
                this.b.b(a.b, a.c, a.d);
            }
        } catch (Exception e2) {
            C4782n4.d().a(e2);
            c4720je.b("errMsg", e2.getMessage());
            String c2 = this.b.c(a.b);
            if (!TextUtils.isEmpty(c2)) {
                c4720je.b("adViewId", c2);
            }
            interfaceC4788na.a(false, a.d, c4720je);
        }
    }

    private C1372a a(String str) throws JSONException {
        JSONObject jsonObjectInit = IronSourceNetworkBridge.jsonObjectInit(str);
        C1372a c1372a = new C1372a();
        c1372a.a = jsonObjectInit.optString("functionName");
        c1372a.b = jsonObjectInit.optJSONObject("functionParams");
        c1372a.c = jsonObjectInit.optString("success");
        c1372a.d = jsonObjectInit.optString("fail");
        return c1372a;
    }
}
