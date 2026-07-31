package com.my.target;

import android.text.TextUtils;
import com.my.target.mediation.AdNetworkLoader;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes12.dex */
public final class pb implements Runnable, AdNetworkLoader.AdParamsListener {
    final zf a = zf.a(10000);
    final String b;
    final jg c;
    final List d;
    final Map e;
    volatile a f;
    volatile int g;

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    interface a {
        void a(Map map);
    }

    public pb(String str, List list, jg jgVar, a aVar) {
        this.b = str;
        this.d = list;
        this.c = jgVar;
        this.f = aVar;
        this.g = list.size();
        this.e = this.g == 0 ? Collections.EMPTY_MAP : new HashMap();
    }

    void a() {
        synchronized (this) {
            try {
                a aVar = this.f;
                if (aVar == null) {
                    mi.a("MediationParamsLoader: onResult has already been called");
                    return;
                }
                this.f = null;
                aVar.a(this.e);
                this.a.close();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void b() {
        if (this.g == 0) {
            mi.a("MediationParamsLoader: empty loaders list, direct onResult call");
            a();
            return;
        }
        mi.a("MediationParamsLoader: params loading started, loaders count: " + this.g);
        this.a.a(this);
        for (AdNetworkLoader adNetworkLoader : this.d) {
            mi.a("MediationParamsLoader: loading params for " + adNetworkLoader);
            adNetworkLoader.setAdParamsListener(this);
            adNetworkLoader.loadParams(this.b, this.c.a);
        }
    }

    @Override // com.my.target.mediation.AdNetworkLoader.AdParamsListener
    public void onLoad(AdNetworkLoader adNetworkLoader, Map map, String str) {
        synchronized (this) {
            try {
                if (this.f == null) {
                    mi.a("MediationParamsLoader: onResult has already been called, skipping params processing");
                    return;
                }
                if (TextUtils.isEmpty(str)) {
                    mi.a("MediationParamsLoader: mediation params is received for " + adNetworkLoader);
                    if (!map.isEmpty()) {
                        this.e.putAll(map);
                    }
                } else {
                    mi.a("MediationParamsLoader: failed to get params in " + adNetworkLoader + " with error - " + str);
                }
                this.g--;
                if (this.g > 0) {
                    return;
                }
                a();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        mi.a("MediationParamsLoader: loading timeout");
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((AdNetworkLoader) it.next()).setAdParamsListener(null);
        }
        a();
    }
}
