package com.five_corp.ad.internal.system;

import android.net.ConnectivityManager;
import android.net.Network;
import android.util.Log;
import java.util.Iterator;

/* loaded from: classes5.dex */
public final class f extends ConnectivityManager.NetworkCallback {
    public final /* synthetic */ h a;

    public f(h hVar) {
        this.a = hVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        super.onAvailable(network);
        h hVar = this.a;
        hVar.getClass();
        try {
            Iterator it = hVar.d.e.iterator();
            while (it.hasNext()) {
                com.five_corp.ad.k kVar = (com.five_corp.ad.k) ((com.five_corp.ad.internal.hub.global.e) it.next());
                kVar.g.a();
                kVar.h.a();
                com.five_corp.ad.internal.http.auxcache.h hVar2 = kVar.p;
                hVar2.a.post(new com.five_corp.ad.internal.http.auxcache.c(hVar2));
            }
        } catch (Exception e) {
            com.five_corp.ad.internal.logger.a aVar = hVar.c;
            aVar.getClass();
            aVar.a.a(new com.five_corp.ad.internal.logger.b(6, null, null, e + " - " + Log.getStackTraceString(e)));
        }
    }
}
