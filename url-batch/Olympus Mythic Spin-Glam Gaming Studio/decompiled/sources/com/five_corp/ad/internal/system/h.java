package com.five_corp.ad.internal.system;

import android.content.Context;
import android.net.ConnectivityManager;

/* loaded from: classes5.dex */
public final class h {
    public final Context a;
    public final ConnectivityManager b;
    public final com.five_corp.ad.internal.logger.a c;
    public final com.five_corp.ad.internal.hub.global.b d;

    public h(Context context, com.five_corp.ad.internal.logger.a aVar, com.five_corp.ad.internal.hub.global.b bVar) {
        this.a = context;
        this.b = (ConnectivityManager) context.getSystemService("connectivity");
        this.c = aVar;
        this.d = bVar;
    }

    public final void a() {
        this.b.registerDefaultNetworkCallback(new f(this));
    }
}
