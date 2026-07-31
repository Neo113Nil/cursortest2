package io.appmetrica.analytics.impl;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import io.appmetrica.analytics.coreapi.internal.system.NetworkType;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Locale;

/* renamed from: io.appmetrica.analytics.impl.bf, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC5232bf {
    public static final Xe a;
    public static final Ye b;
    public static final Ze c;

    static {
        NetworkType networkType = NetworkType.UNDEFINED;
        a = new Xe(networkType);
        b = new Ye(networkType);
        c = new Ze(2);
    }

    public static String a(Locale locale) {
        String language = locale.getLanguage();
        String country = locale.getCountry();
        StringBuilder sb = new StringBuilder(language);
        String script = locale.getScript();
        if (!StringUtils.isNullOrEmpty(script)) {
            sb.append('-');
            sb.append(script);
        }
        if (!StringUtils.isNullOrEmpty(country)) {
            sb.append('_');
            sb.append(country);
        }
        return sb.toString();
    }

    public static NetworkType a(ConnectivityManager connectivityManager) {
        NetworkInfo networkInfo;
        NetworkType networkType = NetworkType.UNDEFINED;
        Network activeNetwork = connectivityManager.getActiveNetwork();
        if (!AndroidUtils.isApiAchieved(29) ? !(activeNetwork != null && ((networkInfo = connectivityManager.getNetworkInfo(activeNetwork)) == null || networkInfo.isConnected())) : activeNetwork == null) {
            return NetworkType.OFFLINE;
        }
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
        if (networkCapabilities == null) {
            return networkType;
        }
        for (Integer num : b.a.keySet()) {
            if (networkCapabilities.hasTransport(num.intValue())) {
                return (NetworkType) b.a(num);
            }
        }
        return networkType;
    }
}
