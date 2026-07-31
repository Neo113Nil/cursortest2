package io.bidmachine;

import android.content.Context;
import android.content.res.AssetManager;
import android.text.TextUtils;
import io.bidmachine.core.Logger;
import io.bidmachine.core.Utils;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* loaded from: classes5.dex */
abstract class w {
    static final Map a = new ConcurrentHashMap();

    static void a(Context context) {
        String[] list;
        if (a.isEmpty()) {
            try {
                AssetManager assets = context.getAssets();
                if (assets == null || (list = assets.list("bm_networks")) == null) {
                    return;
                }
                for (String str : list) {
                    b(assets, str);
                }
            } catch (Exception unused) {
            }
        }
    }

    static Map b(Context context) {
        Map map = a;
        if (!map.isEmpty()) {
            return map;
        }
        a(context);
        return map;
    }

    private static String c(AssetManager assetManager, String str) {
        try {
            return Utils.streamToString(assetManager.open("bm_networks/" + str));
        } catch (Throwable th) {
            Logger.w(th);
            return null;
        }
    }

    private static x b(AssetManager assetManager, String str) {
        x a2 = a(assetManager, str);
        if (a2 != null) {
            a.put(a2.c(), a2);
        }
        return a2;
    }

    static x a(Context context, String str) {
        Map map = a;
        if (map.containsKey(str)) {
            return (x) map.get(str);
        }
        try {
            AssetManager assets = context.getAssets();
            if (assets == null) {
                return null;
            }
            return b(assets, str + ".bmnetwork");
        } catch (Exception unused) {
            return null;
        }
    }

    private static x a(AssetManager assetManager, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String c = c(assetManager, str);
        if (TextUtils.isEmpty(c)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(c);
        String optString = jSONObject.optString("name");
        String optString2 = jSONObject.optString("version");
        String optString3 = jSONObject.optString("classpath");
        String optString4 = jSONObject.optString("sdk_version");
        if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(optString2) && !TextUtils.isEmpty(optString3) && !TextUtils.isEmpty(optString4)) {
            return new x(optString, optString2, optString3, optString4);
        }
        return null;
    }
}
