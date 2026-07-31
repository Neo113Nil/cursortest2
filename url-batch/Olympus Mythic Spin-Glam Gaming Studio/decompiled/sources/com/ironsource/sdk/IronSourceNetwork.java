package com.ironsource.sdk;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.ironsource.C4782n4;
import com.ironsource.C4840q8;
import com.ironsource.C4951w8;
import com.ironsource.C4969x8;
import com.ironsource.C4987y8;
import com.ironsource.D5;
import com.ironsource.K9;
import com.ironsource.Nc;
import com.ironsource.P9;
import com.ironsource.V9;
import com.ironsource.Y9;
import com.ironsource.sdk.controller.e;
import com.ironsource.sdk.utils.Logger;
import com.ironsource.sdk.utils.SDKUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes15.dex */
public class IronSourceNetwork {
    static final String a = "IronSourceNetwork";
    private static V9 b;
    private static List<Nc> c = new ArrayList();
    private static Y9 d;

    private static void a(Context context, JSONObject jSONObject, String str, String str2, String str3, Map<String, String> map) throws Exception {
        if (jSONObject != null) {
            D5 a2 = C4969x8.a(jSONObject);
            if (a2.a()) {
                C4951w8.a(a2, C4969x8.a(context, str, str2, str3, map));
            }
        }
    }

    public static synchronized void addInitListener(Nc nc) {
        synchronized (IronSourceNetwork.class) {
            Y9 y9 = d;
            if (y9 == null) {
                c.add(nc);
            } else if (y9.b()) {
                nc.onSuccess();
            } else {
                nc.onFail(d.a());
            }
        }
    }

    public static synchronized void destroyAd(K9 k9) throws Exception {
        synchronized (IronSourceNetwork.class) {
            a();
            b.b(k9);
        }
    }

    public static synchronized e getControllerManager() {
        e a2;
        synchronized (IronSourceNetwork.class) {
            a2 = b.a();
        }
        return a2;
    }

    public static String getVersion() {
        return SDKUtils.getSDKVersion();
    }

    public static synchronized void initSDK(Context context, String str, String str2, Map<String, String> map) {
        synchronized (IronSourceNetwork.class) {
            if (TextUtils.isEmpty(str)) {
                Logger.e(a, "applicationKey is NULL");
                return;
            }
            if (b == null) {
                SDKUtils.setInitSDKParams(map);
                try {
                    a(context, SDKUtils.getNetworkConfiguration().optJSONObject("events"), str2, str, C4987y8.a(), map);
                } catch (Exception e) {
                    C4782n4.d().a(e);
                    Logger.e(a, "Failed to init event tracker: " + e.getMessage());
                }
                b = P9.a(context, str, str2);
            }
        }
    }

    public static synchronized boolean isAdAvailableForInstance(K9 k9) {
        synchronized (IronSourceNetwork.class) {
            V9 v9 = b;
            if (v9 == null) {
                return false;
            }
            return v9.a(k9);
        }
    }

    public static synchronized void loadAd(K9 k9, Map<String, String> map) throws Exception {
        synchronized (IronSourceNetwork.class) {
            a();
            b.a(k9, map);
        }
    }

    public static synchronized void loadAdView(Activity activity, K9 k9, Map<String, String> map) throws Exception {
        synchronized (IronSourceNetwork.class) {
            a();
            b.b(activity, k9, map);
        }
    }

    public static void onPause(Activity activity) {
        V9 v9 = b;
        if (v9 == null) {
            return;
        }
        v9.b(activity);
    }

    public static void onResume(Activity activity) {
        V9 v9 = b;
        if (v9 == null) {
            return;
        }
        v9.a(activity);
    }

    public static synchronized void release(Activity activity) {
        synchronized (IronSourceNetwork.class) {
            V9 v9 = b;
            if (v9 == null) {
                return;
            }
            v9.c(activity);
        }
    }

    public static synchronized void showAd(Activity activity, K9 k9, Map<String, String> map) throws Exception {
        synchronized (IronSourceNetwork.class) {
            a();
            b.a(activity, k9, map);
        }
    }

    public static synchronized void updateInitFailed(C4840q8 c4840q8) {
        synchronized (IronSourceNetwork.class) {
            try {
                d = new Y9(c4840q8);
                Iterator<Nc> it = c.iterator();
                while (it.hasNext()) {
                    it.next().onFail(c4840q8);
                }
                c.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static synchronized void updateInitSucceeded() {
        synchronized (IronSourceNetwork.class) {
            try {
                d = new Y9();
                Iterator<Nc> it = c.iterator();
                while (it.hasNext()) {
                    it.next().onSuccess();
                }
                c.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static synchronized void a() throws Exception {
        synchronized (IronSourceNetwork.class) {
            if (b == null) {
                throw new NullPointerException("Call initSDK first");
            }
        }
    }
}
