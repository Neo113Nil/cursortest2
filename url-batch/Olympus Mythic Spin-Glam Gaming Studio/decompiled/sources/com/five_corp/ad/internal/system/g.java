package com.five_corp.ad.internal.system;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.NetworkInfo;
import android.util.Log;
import java.util.Iterator;

/* loaded from: classes5.dex */
public final class g extends BroadcastReceiver {
    public final /* synthetic */ h a;

    public g(h hVar) {
        this.a = hVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        h hVar = this.a;
        hVar.getClass();
        try {
            NetworkInfo activeNetworkInfo = hVar.b.getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                return;
            }
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
