package com.ironsource;

import android.content.Context;
import com.ironsource.X3;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.sdk.utils.Logger;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.m8, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C4768m8 implements InterfaceC4600d1 {
    private static final String b = "m8";
    private static C4768m8 c;
    private final Map<String, H8> a = Collections.synchronizedMap(new HashMap());

    /* renamed from: com.ironsource.m8$a */
    class a implements Runnable {
        final /* synthetic */ C4750l8 a;
        final /* synthetic */ Context b;
        final /* synthetic */ String c;

        a(C4750l8 c4750l8, Context context, String str) {
            this.a = c4750l8;
            this.b = context;
            this.c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4768m8.this.a.put(this.c, new C4661g8(this.a, this.b));
        }
    }

    public static synchronized C4768m8 a() {
        C4768m8 c4768m8;
        synchronized (C4768m8.class) {
            try {
                if (c == null) {
                    c = new C4768m8();
                }
                c4768m8 = c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c4768m8;
    }

    private C4625e8 b(JSONObject jSONObject) {
        C4625e8 c4625e8 = new C4625e8();
        try {
            return a(jSONObject);
        } catch (Exception e) {
            C4782n4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
            return c4625e8;
        }
    }

    private boolean d(JSONObject jSONObject) {
        return jSONObject.optBoolean(X3.i.s0);
    }

    public String c(JSONObject jSONObject) throws JSONException {
        return (jSONObject == null || !jSONObject.has("adViewId")) ? (jSONObject == null || !jSONObject.has("params")) ? "" : IronSourceNetworkBridge.jsonObjectInit(jSONObject.getString("params")).getString("adViewId") : jSONObject.getString("adViewId");
    }

    public void d(JSONObject jSONObject, String str, String str2) throws Exception {
        String string = IronSourceNetworkBridge.jsonObjectInit(jSONObject.getString("params")).getString("adViewId");
        if (string.isEmpty()) {
            Logger.i(b, "sendMessageToAd fail - adViewId is empty");
            throw new Exception("adViewId is empty");
        }
        if (!this.a.containsKey(string)) {
            Logger.i(b, "sendMessageToAd fail - collection does not contain adViewId");
            throw new Exception("collection does not contain adViewId");
        }
        H8 h8 = this.a.get(string);
        if (h8 != null) {
            h8.c(jSONObject, str, str2);
        }
    }

    private C4625e8 a(JSONObject jSONObject) {
        try {
            JSONObject jsonObjectInit = IronSourceNetworkBridge.jsonObjectInit(jSONObject.getString("adSize"));
            String obj = jsonObjectInit.get("height").toString();
            String obj2 = jsonObjectInit.get("width").toString();
            return new C4625e8(Integer.parseInt(obj2), Integer.parseInt(obj), jsonObjectInit.get("label").toString());
        } catch (Exception e) {
            C4782n4.d().a(e);
            return new C4625e8();
        }
    }

    public void b(JSONObject jSONObject, String str, String str2) throws Exception {
        String string = jSONObject.getString("adViewId");
        if (!string.isEmpty()) {
            if (this.a.containsKey(string)) {
                H8 h8 = this.a.get(string);
                String string2 = jSONObject.getString(X3.i.v0);
                if (h8 != null) {
                    h8.a(string2, str, str2);
                    return;
                }
                return;
            }
            Logger.i(b, "performWebViewAction fail - collection does not contain adViewId");
            throw new Exception("collection does not contain adViewId");
        }
        Logger.i(b, "performWebViewAction fail - adViewId is empty");
        throw new Exception("adViewId is empty");
    }

    public void c(JSONObject jSONObject, String str, String str2) throws Exception {
        String string = jSONObject.getString("adViewId");
        if (!string.isEmpty()) {
            if (this.a.containsKey(string)) {
                H8 h8 = this.a.get(string);
                this.a.remove(string);
                if (h8 != null) {
                    h8.a(str, str2);
                    return;
                }
                return;
            }
            Logger.i(b, "removeAdView fail - collection does not contain adViewId");
            throw new Exception("collection does not contain adViewId");
        }
        Logger.i(b, "removeAdView fail - adViewId is empty");
        throw new Exception("adViewId is empty");
    }

    public void a(InterfaceC4679h8 interfaceC4679h8, JSONObject jSONObject, Context context, String str, String str2) throws Exception {
        String string = jSONObject.getString("adViewId");
        if (!string.isEmpty()) {
            C4625e8 b2 = b(jSONObject);
            if (!this.a.containsKey(string)) {
                C4750l8 c4750l8 = new C4750l8(interfaceC4679h8, context, string, b2);
                c4750l8.e(IronSourceStorageUtils.getNetworkStorageDir(context));
                c4750l8.b(jSONObject, str, str2);
                if (d(jSONObject)) {
                    R7.a.d(new a(c4750l8, context, string));
                    return;
                } else {
                    this.a.put(string, c4750l8);
                    return;
                }
            }
            Logger.i(b, "sendMessageToAd fail - collection already contain adViewId");
            throw new Exception("collection already contain adViewId");
        }
        Logger.i(b, "loadWithUrl fail - adViewId is empty");
        throw new Exception("adViewId is empty");
    }

    @Override // com.ironsource.InterfaceC4600d1
    @Nullable
    public H8 a(String str) {
        if (str.isEmpty() || !this.a.containsKey(str)) {
            return null;
        }
        return this.a.get(str);
    }

    public void a(JSONObject jSONObject, String str, String str2) throws Exception {
        String string = jSONObject.getString("adViewId");
        if (!string.isEmpty()) {
            if (this.a.containsKey(string)) {
                H8 h8 = this.a.get(string);
                if (h8 != null) {
                    h8.a(jSONObject, str, str2);
                    return;
                }
                return;
            }
            Logger.i(b, "removeAdView fail - collection does not contain adViewId");
            throw new Exception("collection does not contain adViewId");
        }
        Logger.i(b, "removeAdView fail - adViewId is empty");
        throw new Exception("adViewId is empty");
    }
}
