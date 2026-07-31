package com.fyber.inneractive.sdk.util;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.ironsource.T3;

/* loaded from: classes13.dex */
public enum a1 {
    UNKNOWN(""),
    ETHERNET(T3.a),
    WIFI(T3.b),
    MOBILE_3G(T3.a),
    MOBILE_4G("4g"),
    MOBILE_5G("5g"),
    CELLULAR("Cellular");

    final String key;

    a1(String str) {
        this.key = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static a1 a() {
        int i;
        a1 a1Var;
        ConnectivityManager connectivityManager;
        NetworkInfo activeNetworkInfo;
        try {
            connectivityManager = (ConnectivityManager) o.a.getSystemService("connectivity");
        } catch (Exception unused) {
        }
        if (o.a("android.permission.ACCESS_NETWORK_STATE") && (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) != null) {
            i = activeNetworkInfo.getType();
            if (i != 9) {
                return ETHERNET;
            }
            if (i != 0) {
                if (i == 1) {
                    return WIFI;
                }
                if (i != 2 && i != 3 && i != 4 && i != 5) {
                    return UNKNOWN;
                }
            }
            com.fyber.inneractive.sdk.config.cellular.a aVar = IAConfigManager.N.M;
            if (aVar == null || aVar.a == null) {
                int k = k.k();
                if (k != 0) {
                    if (k != 3) {
                        if (k == 18) {
                            a1Var = WIFI;
                        } else if (k == 20) {
                            a1Var = MOBILE_5G;
                        } else if (k != 5 && k != 6) {
                            switch (k) {
                                default:
                                    switch (k) {
                                        case 12:
                                        case 14:
                                        case 15:
                                            break;
                                        case 13:
                                            a1Var = MOBILE_4G;
                                            break;
                                        default:
                                            a1Var = CELLULAR;
                                            break;
                                    }
                                case 8:
                                case 9:
                                case 10:
                                    a1Var = MOBILE_3G;
                                    break;
                            }
                        }
                    }
                    a1Var = MOBILE_3G;
                } else {
                    a1Var = UNKNOWN;
                }
            } else {
                a1Var = aVar.b;
            }
            return a1Var == UNKNOWN ? k.k() == 13 ? MOBILE_4G : MOBILE_3G : a1Var;
        }
        i = 8;
        if (i != 9) {
        }
    }

    public final String b() {
        return this.key;
    }
}
