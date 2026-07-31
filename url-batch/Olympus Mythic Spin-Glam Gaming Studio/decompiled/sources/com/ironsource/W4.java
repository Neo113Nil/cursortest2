package com.ironsource;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.X3;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.sdk.utils.Logger;
import com.ironsource.sdk.utils.SDKUtils;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import java.util.Locale;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public class W4 {
    private static final String a = "W4";

    public static JSONObject a(Context context) {
        SDKUtils.loadGoogleAdvertiserInfo(context);
        String advertiserId = SDKUtils.getAdvertiserId();
        String limitAdTracking = SDKUtils.getLimitAdTracking();
        JSONObject jsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
        try {
            if (!TextUtils.isEmpty(advertiserId)) {
                Logger.i(a, "add AID");
                jsonObjectInit.put("deviceIds" + X3.j.d + X3.j.L + X3.j.e, SDKUtils.encodeString(advertiserId));
            }
            if (!TextUtils.isEmpty(limitAdTracking)) {
                Logger.i(a, "add LAT");
                jsonObjectInit.put(X3.j.M, Boolean.parseBoolean(limitAdTracking));
            }
        } catch (Exception e) {
            C4782n4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
        return jsonObjectInit;
    }

    public static JSONObject b(Context context) {
        JSONObject jsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
        a(jsonObjectInit);
        d(context, jsonObjectInit);
        c(jsonObjectInit);
        b(context, jsonObjectInit);
        g(context, jsonObjectInit);
        e(context, jsonObjectInit);
        b(jsonObjectInit);
        f(context, jsonObjectInit);
        c(context, jsonObjectInit);
        a(context, jsonObjectInit);
        h(context, jsonObjectInit);
        return jsonObjectInit;
    }

    private static void c(JSONObject jSONObject) {
        try {
            jSONObject.put(SDKUtils.encodeString(X3.j.y), SDKUtils.encodeString(String.valueOf(Kb.Y().a().h())));
        } catch (Exception e) {
            C4782n4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    private static void d(Context context, JSONObject jSONObject) {
        try {
            String b = U3.b(context);
            String d = U3.d(context);
            if (!TextUtils.isEmpty(d)) {
                jSONObject.put(SDKUtils.encodeString("rawConnectionType"), SDKUtils.encodeString(d));
            }
            if (!TextUtils.isEmpty(b) && !b.equals("none")) {
                jSONObject.put(SDKUtils.encodeString("connectionType"), SDKUtils.encodeString(b));
            }
            jSONObject.put(SDKUtils.encodeString(X3.j.v), U3.e(context));
        } catch (Exception e) {
            C4782n4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    private static void e(Context context, JSONObject jSONObject) {
        try {
            jSONObject.put(SDKUtils.encodeString(X3.j.P), X4.b(context).a(context));
        } catch (Exception e) {
            C4782n4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    private static void f(Context context, JSONObject jSONObject) {
        InterfaceC4986y7 a2 = Kb.Y().a();
        try {
            if (a(X3.j.k0)) {
                jSONObject.put(SDKUtils.encodeString(X3.j.k0), a2.D(context));
            }
        } catch (Exception e) {
            C4782n4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    private static void g(Context context, JSONObject jSONObject) {
        try {
            jSONObject.put(SDKUtils.encodeString(O6.a1), Kb.Y().a().J(context));
        } catch (Exception e) {
            C4782n4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    private static void h(Context context, JSONObject jSONObject) {
        InterfaceC4986y7 a2 = Kb.Y().a();
        try {
            if (a(X3.j.n0)) {
                jSONObject.put(SDKUtils.encodeString(X3.j.n0), a2.i(context));
            }
        } catch (Exception e) {
            C4782n4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    private static void b(Context context, JSONObject jSONObject) {
        try {
            jSONObject.put(SDKUtils.encodeString(X3.j.Y), Kb.Y().a().l(context));
        } catch (Exception e) {
            C4782n4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    private static void c(Context context, JSONObject jSONObject) {
        InterfaceC4986y7 a2 = Kb.Y().a();
        try {
            if (a(X3.j.l0)) {
                jSONObject.put(SDKUtils.encodeString(X3.j.l0), a2.E(context));
            }
        } catch (Exception e) {
            C4782n4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    private static void b(JSONObject jSONObject) {
        InterfaceC4986y7 a2 = Kb.Y().a();
        try {
            if (a(X3.j.i0)) {
                jSONObject.put(SDKUtils.encodeString(X3.j.i0), a2.j());
            }
        } catch (Exception e) {
            C4782n4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    public static JSONObject c(Context context) {
        InterfaceC4986y7 a2 = Kb.Y().a();
        X4 b = X4.b(context);
        JSONObject jsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
        try {
            String d = b.d();
            if (d != null) {
                jsonObjectInit.put(SDKUtils.encodeString("deviceOEM"), SDKUtils.encodeString(d));
            }
            String c = b.c();
            if (c != null) {
                jsonObjectInit.put(SDKUtils.encodeString("deviceModel"), SDKUtils.encodeString(c));
            }
            String e = b.e();
            if (e != null) {
                jsonObjectInit.put(SDKUtils.encodeString(X3.j.m), SDKUtils.encodeString(e));
            }
            String f = b.f();
            if (f != null) {
                jsonObjectInit.put(SDKUtils.encodeString(X3.j.n), f.replaceAll("[^0-9/.]", ""));
            }
            String f2 = b.f();
            if (f2 != null) {
                jsonObjectInit.put(SDKUtils.encodeString(X3.j.o), SDKUtils.encodeString(f2));
            }
            jsonObjectInit.put(SDKUtils.encodeString(X3.j.p), String.valueOf(b.a()));
            jsonObjectInit.put(SDKUtils.encodeString(X3.j.q), SDKUtils.encodeString(SDKUtils.getSDKVersion()));
            if (b.b() != null && b.b().length() > 0) {
                jsonObjectInit.put(SDKUtils.encodeString(X3.j.r), SDKUtils.encodeString(b.b()));
            }
            String language = context.getResources().getConfiguration().locale.getLanguage();
            if (!TextUtils.isEmpty(language)) {
                jsonObjectInit.put(SDKUtils.encodeString(X3.j.x), SDKUtils.encodeString(language.toUpperCase(Locale.getDefault())));
            }
            if (a(X3.j.j0)) {
                jsonObjectInit.put(SDKUtils.encodeString(X3.j.j0), SDKUtils.encodeString(String.valueOf(a2.r(context))));
            }
            String g = E1.g(context);
            if (!TextUtils.isEmpty(g)) {
                jsonObjectInit.put(SDKUtils.encodeString("bundleId"), SDKUtils.encodeString(g));
            }
            String valueOf = String.valueOf(a2.r());
            if (!TextUtils.isEmpty(valueOf)) {
                jsonObjectInit.put(SDKUtils.encodeString(X3.j.K), SDKUtils.encodeString(valueOf));
            }
            String valueOf2 = String.valueOf(a2.p());
            if (!TextUtils.isEmpty(valueOf2)) {
                jsonObjectInit.put(SDKUtils.encodeString(X3.j.O), SDKUtils.encodeString(valueOf2));
            }
            jsonObjectInit.put("mcc", T3.b(context));
            jsonObjectInit.put("mnc", T3.c(context));
            jsonObjectInit.put(SDKUtils.encodeString(X3.j.S), T3.f(context));
            jsonObjectInit.put(SDKUtils.encodeString(X3.j.R), SDKUtils.encodeString(T3.g(context)));
            jsonObjectInit.put(SDKUtils.encodeString(X3.j.V), E1.f(context));
            jsonObjectInit.put(SDKUtils.encodeString(X3.j.X), E1.d(context));
            jsonObjectInit.put(SDKUtils.encodeString(X3.j.W), SDKUtils.encodeString(E1.b(context)));
            String e2 = E1.e(context);
            if (!TextUtils.isEmpty(e2)) {
                jsonObjectInit.put(SDKUtils.encodeString(X3.j.c0), SDKUtils.encodeString(e2));
            }
            jsonObjectInit.put(X3.j.d0, SDKUtils.encodeString(String.valueOf(a2.a())));
            jsonObjectInit.put(X3.j.e0, SDKUtils.encodeString(String.valueOf(a2.m())));
            String H = a2.H(context);
            if (!TextUtils.isEmpty(H)) {
                jsonObjectInit.put("icc", H);
            }
            String d2 = a2.d();
            if (!TextUtils.isEmpty(d2)) {
                jsonObjectInit.put("tz", SDKUtils.encodeString(d2));
            }
            jsonObjectInit.put("uxt", IronSourceStorageUtils.isUxt());
        } catch (Exception e3) {
            C4782n4.d().a(e3);
            IronLog.INTERNAL.error(e3.toString());
        }
        return jsonObjectInit;
    }

    private static void a(JSONObject jSONObject, String str, String str2) {
        try {
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            jSONObject.put(str, SDKUtils.encodeString(str2));
        } catch (Exception e) {
            C4782n4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    private static boolean a(String str) {
        return SDKUtils.getControllerConfigAsJSONObject().optBoolean(str);
    }

    private static void a(JSONObject jSONObject) {
        InterfaceC4986y7 a2 = Kb.Y().a();
        try {
            a(jSONObject, X3.j.H, String.valueOf(a2.k()));
            a(jSONObject, X3.j.I, String.valueOf(a2.c()));
        } catch (Exception e) {
            C4782n4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    private static void a(Context context, JSONObject jSONObject) {
        InterfaceC4986y7 a2 = Kb.Y().a();
        try {
            if (a(X3.j.m0)) {
                jSONObject.put(SDKUtils.encodeString(X3.j.m0), a2.f(context));
            }
        } catch (Exception e) {
            C4782n4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }
}
