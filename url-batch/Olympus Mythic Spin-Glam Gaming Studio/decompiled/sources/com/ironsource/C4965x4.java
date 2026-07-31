package com.ironsource;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.sdk.utils.Logger;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.x4, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C4965x4 {
    private static final String c = "x4";
    private static final String d = "setSharedSignal";
    private static final String e = "getSharedSignal";
    private static final String f = "functionName";
    private static final String g = "functionParams";
    private static final String h = "success";
    private static final String i = "fail";
    private final Context a;
    C4947w4 b;

    /* renamed from: com.ironsource.x4$a */
    private static class a {
        String a;
        JSONObject b;
        String c;
        String d;

        private a() {
        }

        public static a a(JSONObject jSONObject) {
            a aVar = new a();
            aVar.a = jSONObject.optString("functionName");
            aVar.b = jSONObject.optJSONObject("functionParams");
            aVar.c = jSONObject.optString("success");
            aVar.d = jSONObject.optString("fail");
            return aVar;
        }
    }

    public C4965x4(Context context, C4947w4 c4947w4) {
        this.a = context;
        this.b = c4947w4;
    }

    private a a(String str) throws JSONException {
        return a.a(IronSourceNetworkBridge.jsonObjectInit(str));
    }

    private void b(Context context, a aVar, InterfaceC4788na interfaceC4788na) {
        C4720je c4720je = new C4720je();
        JSONObject jSONObject = aVar.b;
        this.b.a(context, EnumC4929v4.a(jSONObject.optString("source")), jSONObject.optString("key"), jSONObject.optString("data"));
        interfaceC4788na.a(true, aVar.c, c4720je);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004e A[Catch: Exception -> 0x0020, TRY_LEAVE, TryCatch #0 {Exception -> 0x0020, blocks: (B:3:0x0004, B:11:0x0031, B:14:0x0037, B:15:0x004d, B:16:0x004e, B:18:0x0016, B:21:0x0022), top: B:2:0x0004 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(String str, InterfaceC4788na interfaceC4788na) throws Exception {
        char c2;
        a a2 = a(str);
        try {
            String str2 = a2.a;
            int hashCode = str2.hashCode();
            if (hashCode != 576059875) {
                if (hashCode == 1486812399 && str2.equals(d)) {
                    c2 = 0;
                    if (c2 != 0) {
                        b(this.a, a2, interfaceC4788na);
                        return;
                    } else {
                        if (c2 == 1) {
                            a(this.a, a2, interfaceC4788na);
                            return;
                        }
                        throw new UnsupportedOperationException("unsupported API: " + str);
                    }
                }
                c2 = 65535;
                if (c2 != 0) {
                }
            } else {
                if (str2.equals(e)) {
                    c2 = 1;
                    if (c2 != 0) {
                    }
                }
                c2 = 65535;
                if (c2 != 0) {
                }
            }
        } catch (Exception e2) {
            a(a2, interfaceC4788na, e2);
        }
    }

    private void a(Context context, a aVar, InterfaceC4788na interfaceC4788na) {
        C4720je c4720je = new C4720je();
        JSONObject jSONObject = aVar.b;
        c4720je.b("data", this.b.a(context, EnumC4929v4.a(jSONObject.optString("source")), jSONObject.optString("key")));
        interfaceC4788na.a(true, aVar.c, c4720je);
    }

    private void a(a aVar, InterfaceC4788na interfaceC4788na, Exception exc) {
        C4782n4.d().a(exc);
        String message = exc.getMessage();
        Logger.i(c, aVar.a + " exception " + message);
        C4720je c4720je = new C4720je();
        if (TextUtils.isEmpty(message)) {
            message = "Unknown error";
        }
        c4720je.b("error", message);
        interfaceC4788na.a(false, aVar.d, c4720je);
    }
}
