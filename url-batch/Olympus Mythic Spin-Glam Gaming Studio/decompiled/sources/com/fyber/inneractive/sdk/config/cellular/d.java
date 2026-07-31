package com.fyber.inneractive.sdk.config.cellular;

import android.content.Context;
import android.net.ConnectivityManager;
import android.telephony.TelephonyManager;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.a1;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes4.dex */
public abstract class d implements h {
    public final TelephonyManager a;
    public final ConnectivityManager b;
    public CopyOnWriteArrayList c = new CopyOnWriteArrayList();

    public d(Context context) {
        this.a = (TelephonyManager) context.getSystemService("phone");
        this.b = (ConnectivityManager) context.getSystemService("connectivity");
    }

    public abstract void a();

    public abstract void a(a aVar);

    public abstract void a(h hVar);

    @Override // com.fyber.inneractive.sdk.config.cellular.h
    public final void a(a1 a1Var) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.c;
        if (copyOnWriteArrayList == null) {
            IAlog.a("NetworkDetector: onNetworkUpdated: no update listeners", new Object[0]);
            return;
        }
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            h hVar = (h) it.next();
            if (hVar != null) {
                hVar.a(a1Var);
            }
        }
    }
}
