package com.my.target;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes14.dex */
public abstract class gb {
    private final Map a = new HashMap();

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    public interface a {
        void a();

        void a(Object obj);
    }

    protected void a(String str, Object obj) {
        synchronized (this.a) {
            try {
                List list = (List) this.a.get(str);
                if (list == null) {
                    return;
                }
                if (obj == null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((a) it.next()).a();
                    }
                } else {
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        ((a) it2.next()).a(obj);
                    }
                }
                this.a.remove(str);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    protected boolean a(String str, a aVar) {
        boolean z;
        synchronized (this.a) {
            try {
                if (this.a.containsKey(str)) {
                    List list = (List) this.a.get(str);
                    if (list != null) {
                        list.add(aVar);
                    }
                    z = true;
                } else {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(aVar);
                    this.a.put(str, arrayList);
                    z = false;
                }
            } finally {
            }
        }
        return z;
    }
}
