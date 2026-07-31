package com.my.tracker.obfuscated;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;

/* loaded from: classes15.dex */
public final class i1 {
    private String b(NetworkInfo networkInfo) {
        if (networkInfo != null) {
            return networkInfo.getType() == 0 ? networkInfo.getSubtypeName() : networkInfo.getTypeName();
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0042 A[Catch: SecurityException -> 0x004f, TryCatch #1 {SecurityException -> 0x004f, blocks: (B:9:0x003c, B:11:0x0042, B:13:0x0048, B:15:0x004c), top: B:8:0x003c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public h1 a(Context context) {
        NetworkInfo networkInfo;
        String b;
        BluetoothAdapter defaultAdapter;
        int i = -1;
        Boolean bool = null;
        int i2 = 0;
        if (m1.a("android.permission.ACCESS_NETWORK_STATE", context)) {
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                if (connectivityManager != null) {
                    networkInfo = connectivityManager.getActiveNetworkInfo();
                    i2 = a(connectivityManager);
                } else {
                    networkInfo = null;
                }
                i = a(networkInfo);
                b = b(networkInfo);
            } catch (SecurityException unused) {
                x2.a("NetworkInfoDataProvider: No permissions for access to network state");
            }
            if (!m1.a() && m1.a("android.permission.BLUETOOTH", context)) {
                try {
                    defaultAdapter = BluetoothAdapter.getDefaultAdapter();
                    if (defaultAdapter != null) {
                        bool = defaultAdapter.isEnabled() ? Boolean.TRUE : Boolean.FALSE;
                    }
                } catch (SecurityException unused2) {
                    x2.a("NetworkInfoDataProvider: Permission android.permission.BLUETOOTH check was positive, but still got security exception on the bluetooth provider");
                }
            }
            return new h1(i, b, bool, i2);
        }
        b = null;
        if (!m1.a()) {
            defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            if (defaultAdapter != null) {
            }
        }
        return new h1(i, b, bool, i2);
    }

    private int a(NetworkInfo networkInfo) {
        if (networkInfo == null) {
            return -1;
        }
        int type = networkInfo.getType();
        if (type != 0) {
            return type != 1 ? 1 : 3;
        }
        return 2;
    }

    private int a(ConnectivityManager connectivityManager) {
        try {
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
            if (networkCapabilities != null) {
                return networkCapabilities.hasTransport(4) ? 2 : 1;
            }
        } catch (Throwable unused) {
        }
        return 0;
    }
}
