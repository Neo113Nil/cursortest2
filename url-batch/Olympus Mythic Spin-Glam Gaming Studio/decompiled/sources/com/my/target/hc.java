package com.my.target;

import android.database.sqlite.SQLiteDatabase;
import java.net.CookieHandler;
import java.net.CookieManager;
import java.net.CookieStore;
import java.net.URI;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes6.dex */
public final class hc {
    private final CookieHandler a;

    hc(CookieManager cookieManager) {
        this.a = cookieManager;
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static hc a(kc kcVar) {
        CookieStore jcVar;
        SQLiteDatabase a = kcVar.a();
        if (a != null) {
            try {
                jcVar = new jc(a);
            } catch (Throwable th) {
                mi.a("CookieStore error: " + th);
            }
            if (jcVar == null) {
                jcVar = new ic();
            }
            return new hc(new CookieManager(jcVar, null));
        }
        jcVar = null;
        if (jcVar == null) {
        }
        return new hc(new CookieManager(jcVar, null));
    }

    public void b(URLConnection uRLConnection) {
        try {
            a(uRLConnection, this.a.get(URI.create(uRLConnection.getURL().toString()), new HashMap()));
        } catch (Throwable th) {
            mi.a("MyTargetCookieManager: Unable to set cookies to urlconnection - " + th.getMessage());
        }
    }

    public void a(URLConnection uRLConnection) {
        try {
            this.a.put(URI.create(uRLConnection.getURL().toString()), uRLConnection.getHeaderFields());
        } catch (Throwable th) {
            mi.a("MyTargetCookieManager: Unable to set cookies from urlconnection - " + th.getMessage());
        }
    }

    private void a(URLConnection uRLConnection, Map map) {
        Iterator it = map.entrySet().iterator();
        for (boolean hasNext = it.hasNext(); hasNext; hasNext = it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            Iterator it2 = ((List) entry.getValue()).iterator();
            for (boolean hasNext2 = it2.hasNext(); hasNext2; hasNext2 = it2.hasNext()) {
                uRLConnection.addRequestProperty(str, (String) it2.next());
            }
        }
    }
}
