package com.ironsource;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.ironsource.C4822p8;
import com.ironsource.X3;
import com.ironsource.mediationsdk.logger.IronLog;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.da, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4609da {
    private static final String b = "da";
    private static final String c = "supersonic_shared_preferen";
    private static final String d = "version";
    private static final String e = "back_button_state";
    private static final String f = "search_keys";
    private static final String g = "^\\d+_\\d+$";
    private static C4609da h;
    private SharedPreferences a;

    private C4609da(Context context) {
        this.a = context.getSharedPreferences("supersonic_shared_preferen", 0);
    }

    public static synchronized C4609da a(Context context) {
        C4609da c4609da;
        synchronized (C4609da.class) {
            try {
                if (h == null) {
                    h = new C4609da(context);
                }
                c4609da = h;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c4609da;
    }

    public static synchronized C4609da e() {
        C4609da c4609da;
        synchronized (C4609da.class) {
            c4609da = h;
        }
        return c4609da;
    }

    public C4822p8.a b() {
        int parseInt = Integer.parseInt(this.a.getString(e, "2"));
        return parseInt == 0 ? C4822p8.a.None : parseInt == 1 ? C4822p8.a.Device : parseInt == 2 ? C4822p8.a.Controller : C4822p8.a.Controller;
    }

    public void c(String str) {
        SharedPreferences.Editor edit = this.a.edit();
        edit.putString(e, str);
        edit.apply();
    }

    public List<String> d() {
        String string = this.a.getString(f, null);
        ArrayList arrayList = new ArrayList();
        if (string != null) {
            C4720je c4720je = new C4720je(string);
            if (c4720je.a(X3.i.R)) {
                try {
                    arrayList.addAll(c4720je.a((JSONArray) c4720je.b(X3.i.R)));
                } catch (JSONException e2) {
                    C4782n4.d().a(e2);
                    IronLog.INTERNAL.error(e2.toString());
                }
            }
        }
        return arrayList;
    }

    public void e(String str) {
        SharedPreferences.Editor edit = this.a.edit();
        edit.putString(f, str);
        edit.apply();
    }

    public void a(String str, String str2) {
        SharedPreferences.Editor edit = this.a.edit();
        edit.putString(str, str2);
        edit.apply();
    }

    public String c() {
        return this.a.getString("version", C4538a2.f);
    }

    public String a(String str) {
        String string = this.a.getString(str, null);
        return string != null ? string : JsonUtils.EMPTY_JSON;
    }

    private boolean b(String str) {
        return str.matches(g);
    }

    public boolean a(String str, String str2, String str3) {
        String string = this.a.getString("ssaUserData", null);
        if (TextUtils.isEmpty(string)) {
            return false;
        }
        try {
            JSONObject jsonObjectInit = IronSourceNetworkBridge.jsonObjectInit(string);
            if (jsonObjectInit.isNull(str2)) {
                return false;
            }
            JSONObject jSONObject = jsonObjectInit.getJSONObject(str2);
            if (jSONObject.isNull(str3)) {
                return false;
            }
            jSONObject.getJSONObject(str3).put("timestamp", str);
            SharedPreferences.Editor edit = this.a.edit();
            edit.putString("ssaUserData", jsonObjectInit.toString());
            edit.apply();
            return true;
        } catch (JSONException e2) {
            C4782n4.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
            return false;
        }
    }

    public void d(String str) {
        if (c().equalsIgnoreCase(str)) {
            return;
        }
        SharedPreferences.Editor edit = this.a.edit();
        edit.putString("version", str);
        edit.apply();
    }

    public ArrayList<String> a() {
        ArrayList<String> arrayList = new ArrayList<>();
        String[] strArr = (String[]) this.a.getAll().keySet().toArray(new String[0]);
        SharedPreferences.Editor edit = this.a.edit();
        for (String str : strArr) {
            if (b(str)) {
                arrayList.add(str);
                edit.remove(str);
            }
        }
        edit.apply();
        return arrayList;
    }
}
