package com.five_corp.ad.internal.system;

import android.content.Context;
import android.net.ConnectivityManager;

/* loaded from: classes5.dex */
public final class e {
    public final Context a;

    static {
        e.class.toString();
    }

    public e(Context context) {
        this.a = context;
    }

    public final boolean a() {
        try {
            return ((ConnectivityManager) this.a.getSystemService("connectivity")).isActiveNetworkMetered();
        } catch (Throwable unused) {
            return false;
        }
    }
}
