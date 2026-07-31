package com.five_corp.ad.internal.storage;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.five_corp.ad.internal.cache.n;
import com.five_corp.ad.internal.l;
import com.five_corp.ad.internal.m;
import com.five_corp.ad.internal.x;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes12.dex */
public final class d {
    public final e a;
    public final j b;
    public final com.five_corp.ad.internal.system.c c;
    public final com.five_corp.ad.internal.logger.a d;
    public final Object e = new Object();
    public final HashMap f = new HashMap();

    public d(e eVar, j jVar, com.five_corp.ad.internal.system.c cVar, com.five_corp.ad.internal.logger.a aVar) {
        this.a = eVar;
        this.b = jVar;
        this.c = cVar;
        this.d = aVar;
    }

    public final void a(HashSet hashSet) {
        HashSet hashSet2 = new HashSet();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            com.five_corp.ad.internal.ad.h hVar = (com.five_corp.ad.internal.ad.h) it.next();
            Pattern pattern = j.b;
            hashSet2.add(x.a(hVar.a));
        }
        synchronized (this.e) {
            try {
                Iterator it2 = this.f.entrySet().iterator();
                while (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    if (!hashSet2.contains(entry.getKey())) {
                        ((n) entry.getValue()).a();
                        it2.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final n b(com.five_corp.ad.internal.ad.h hVar) {
        Looper looper;
        HandlerThread handlerThread;
        Pattern pattern = j.b;
        String a = x.a(hVar.a);
        n nVar = (n) this.f.get(a);
        if (nVar != null) {
            return nVar;
        }
        int nextInt = this.b.a.nextInt(1073741824);
        String a2 = x.a(hVar.a);
        String format = String.format("%08X", Integer.valueOf(nextInt));
        Matcher matcher = j.b.matcher(hVar.a);
        String str = "res6=" + a2 + "=" + format + (!matcher.find() ? "" : matcher.group(1));
        b bVar = this.a.a;
        a aVar = new a(bVar, str, bVar.b);
        com.five_corp.ad.internal.system.c cVar = this.c;
        if (cVar.b < cVar.a.size()) {
            handlerThread = (HandlerThread) cVar.a.get(cVar.b);
            cVar.b++;
        } else {
            if (cVar.a.isEmpty()) {
                looper = null;
                Handler handler = looper != null ? new Handler(looper) : null;
                handler.post(new c(aVar));
                n nVar2 = new n(handler, aVar);
                this.f.put(a, nVar2);
                return nVar2;
            }
            handlerThread = (HandlerThread) cVar.a.get(0);
            cVar.b = 1;
        }
        looper = handlerThread.getLooper();
        if (looper != null) {
        }
        handler.post(new c(aVar));
        n nVar22 = new n(handler, aVar);
        this.f.put(a, nVar22);
        return nVar22;
    }

    public final n a(com.five_corp.ad.internal.ad.h hVar) {
        n b;
        synchronized (this.e) {
            b = b(hVar);
        }
        return b;
    }

    public final HashMap a(ArrayList arrayList) {
        HashMap hashMap;
        synchronized (this.e) {
            try {
                hashMap = new HashMap();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    com.five_corp.ad.internal.ad.h hVar = (com.five_corp.ad.internal.ad.h) it.next();
                    hashMap.put(hVar, b(hVar));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return hashMap;
    }

    public final com.five_corp.ad.internal.util.c a() {
        com.five_corp.ad.internal.util.b bVar;
        com.five_corp.ad.internal.util.c a = this.a.a.a();
        if (!a.a) {
            return a;
        }
        b bVar2 = this.a.a;
        bVar2.getClass();
        try {
            File[] listFiles = bVar2.a.listFiles();
            ArrayList arrayList = new ArrayList();
            for (File file : listFiles) {
                arrayList.add(file.getName());
            }
            bVar = new com.five_corp.ad.internal.util.b(true, null, arrayList);
        } catch (SecurityException e) {
            bVar = new com.five_corp.ad.internal.util.b(false, new l(m.P2, "Data directory path: " + bVar2.a.getAbsolutePath(), e), null);
        }
        if (!bVar.a) {
            return new com.five_corp.ad.internal.util.c(false, bVar.b);
        }
        Iterator it = ((List) bVar.c).iterator();
        while (it.hasNext()) {
            com.five_corp.ad.internal.util.c a2 = this.a.a.a((String) it.next());
            if (!a2.a) {
                this.d.a.a(new com.five_corp.ad.internal.logger.b(5, null, null, a2.b.a()));
            }
        }
        return new com.five_corp.ad.internal.util.c(true, null);
    }
}
