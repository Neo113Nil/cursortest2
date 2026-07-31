package com.my.target;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes6.dex */
public class l6 extends x {
    private final HashMap b;

    private l6() {
        HashMap hashMap = new HashMap();
        this.b = hashMap;
        hashMap.put("preroll", hb.a("preroll"));
        hashMap.put("pauseroll", hb.a("pauseroll"));
        hashMap.put("midroll", hb.a("midroll"));
        hashMap.put("postroll", hb.a("postroll"));
    }

    public static l6 e() {
        return new l6();
    }

    public static l6 f() {
        return new l6();
    }

    public hb a(String str) {
        return (hb) this.b.get(str);
    }

    public ArrayList c() {
        return new ArrayList(this.b.values());
    }

    public boolean d() {
        Iterator it = this.b.values().iterator();
        while (it.hasNext()) {
            if (((hb) it.next()).i()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.my.target.x
    public int a() {
        Iterator it = this.b.values().iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((hb) it.next()).a();
        }
        return i;
    }
}
