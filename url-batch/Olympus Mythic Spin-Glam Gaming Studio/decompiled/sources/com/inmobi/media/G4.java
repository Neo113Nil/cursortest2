package com.inmobi.media;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiManager;
import android.telephony.TelephonyManager;
import androidx.core.content.ContextCompat;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public abstract class G4 {
    public static final EnumC3944df a() {
        Context context = AbstractC4002fj.a;
        if (context == null) {
            return EnumC3944df.a;
        }
        try {
            Object systemService = context.getSystemService("connectivity");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) systemService).getActiveNetworkInfo();
            if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                int type = activeNetworkInfo.getType();
                if (type != 0) {
                    if (type != 1) {
                        return EnumC3944df.b;
                    }
                    Object systemService2 = context.getApplicationContext().getSystemService(com.ironsource.T3.b);
                    Intrinsics.checkNotNull(systemService2, "null cannot be cast to non-null type android.net.wifi.WifiManager");
                    int linkSpeed = ((WifiManager) systemService2).getConnectionInfo().getLinkSpeed();
                    return linkSpeed >= 10 ? EnumC3944df.d : linkSpeed >= 2 ? EnumC3944df.c : EnumC3944df.b;
                }
                Intrinsics.checkNotNullParameter(context, "context");
                if (ContextCompat.checkSelfPermission(context, "android.permission.READ_PHONE_STATE") != 0) {
                    return EnumC3944df.a;
                }
                Object systemService3 = context.getSystemService("phone");
                Intrinsics.checkNotNull(systemService3, "null cannot be cast to non-null type android.telephony.TelephonyManager");
                int networkType = ((TelephonyManager) systemService3).getNetworkType();
                return (networkType == 1 || networkType == 2 || networkType == 4 || networkType == 7 || networkType == 11 || networkType == 16) ? EnumC3944df.b : (networkType == 18 || networkType == 20) ? EnumC3944df.d : EnumC3944df.c;
            }
            return EnumC3944df.a;
        } catch (SecurityException unused) {
            return EnumC3944df.a;
        }
    }
}
