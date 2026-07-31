package com.my.target;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import com.my.target.common.MyTargetConfig;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes6.dex */
class be extends t4 {
    be() {
    }

    synchronized Map a(MyTargetConfig myTargetConfig, Context context) {
        HashMap hashMap = new HashMap();
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
            if (activeNetworkInfo == null) {
                return hashMap;
            }
            hashMap.put("connection", activeNetworkInfo.getTypeName());
            a(hashMap, activeNetworkInfo);
            a(hashMap, connectivityManager);
            return hashMap;
        } catch (Throwable unused) {
            mi.a("NetworkInfoDataProvider: No permissions for access to network state");
            return hashMap;
        }
    }

    private void a(Map map, NetworkInfo networkInfo) {
        if (networkInfo.getType() == 0) {
            map.put("connection_type", networkInfo.getSubtypeName() != null ? networkInfo.getSubtypeName() : "");
        } else {
            map.put("connection_type", networkInfo.getTypeName() != null ? networkInfo.getTypeName() : "");
        }
    }

    private void a(Map map, ConnectivityManager connectivityManager) {
        String str;
        try {
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
            if (networkCapabilities != null) {
                if (networkCapabilities.hasTransport(4)) {
                    str = "1";
                } else {
                    str = "0";
                }
                map.put("vpn_connected", str);
            }
        } catch (Throwable th) {
            mi.b("NetworkInfoDataProvider: " + th.getMessage());
        }
    }
}
