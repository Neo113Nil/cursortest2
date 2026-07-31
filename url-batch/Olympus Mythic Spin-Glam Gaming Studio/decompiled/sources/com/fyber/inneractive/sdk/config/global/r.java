package com.fyber.inneractive.sdk.config.global;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.global.features.s;
import com.fyber.inneractive.sdk.config.global.features.v;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.w;
import com.fyber.inneractive.sdk.util.x;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public final class r {
    public String a = "";
    public final HashMap b;
    public JSONArray c;

    public r() {
        HashMap hashMap = new HashMap();
        hashMap.put(v.class, new v());
        hashMap.put(com.fyber.inneractive.sdk.config.global.features.d.class, new com.fyber.inneractive.sdk.config.global.features.d());
        hashMap.put(com.fyber.inneractive.sdk.config.global.features.m.class, new com.fyber.inneractive.sdk.config.global.features.m());
        hashMap.put(com.fyber.inneractive.sdk.config.global.features.f.class, new com.fyber.inneractive.sdk.config.global.features.f());
        hashMap.put(com.fyber.inneractive.sdk.config.global.features.l.class, new com.fyber.inneractive.sdk.config.global.features.l());
        hashMap.put(com.fyber.inneractive.sdk.config.global.features.e.class, new com.fyber.inneractive.sdk.config.global.features.e());
        hashMap.put(s.class, new s());
        hashMap.put(com.fyber.inneractive.sdk.config.global.features.j.class, new com.fyber.inneractive.sdk.config.global.features.j());
        hashMap.put(com.fyber.inneractive.sdk.config.global.features.r.class, new com.fyber.inneractive.sdk.config.global.features.r());
        hashMap.put(com.fyber.inneractive.sdk.config.global.features.o.class, new com.fyber.inneractive.sdk.config.global.features.o());
        hashMap.put(com.fyber.inneractive.sdk.config.global.features.c.class, new com.fyber.inneractive.sdk.config.global.features.c());
        hashMap.put(com.fyber.inneractive.sdk.config.global.features.n.class, new com.fyber.inneractive.sdk.config.global.features.n());
        hashMap.put(com.fyber.inneractive.sdk.config.global.features.b.class, new com.fyber.inneractive.sdk.config.global.features.b());
        hashMap.put(com.fyber.inneractive.sdk.config.global.features.h.class, new com.fyber.inneractive.sdk.config.global.features.h());
        hashMap.put(com.fyber.inneractive.sdk.config.global.features.k.class, new com.fyber.inneractive.sdk.config.global.features.k());
        hashMap.put(com.fyber.inneractive.sdk.config.global.features.g.class, new com.fyber.inneractive.sdk.config.global.features.g());
        this.b = hashMap;
        this.c = null;
        HashMap hashMap2 = new HashMap();
        for (Map.Entry entry : hashMap.entrySet()) {
            hashMap2.put((Class) entry.getKey(), ((com.fyber.inneractive.sdk.config.global.features.i) entry.getValue()).b());
        }
        this.b = hashMap2;
        IAlog.a("%s: created. Supported features: %s", "SupportedFeaturesProvider", hashMap2);
    }

    public static r a() {
        int i = com.fyber.inneractive.sdk.config.k.a;
        String property = System.getProperty("ia.testEnvironmentConfiguration.featuresConfig");
        boolean z = false;
        if (!TextUtils.isEmpty(property)) {
            try {
                IAConfigManager.N.y.a = l.a(new JSONObject(property));
                z = true;
            } catch (Exception unused) {
                IAlog.a("failed parsing local features json", new Object[0]);
            }
        }
        r rVar = new r();
        if (z) {
            IAConfigManager iAConfigManager = IAConfigManager.N;
            iAConfigManager.L.a(true, "");
            iAConfigManager.D.a(iAConfigManager.L);
        }
        return rVar;
    }

    public final JSONArray b() {
        JSONArray jSONArray = this.c;
        if (jSONArray == null || jSONArray.length() == 0) {
            JSONArray a = g.a(this.b, false);
            this.c = a;
            IAlog.a("%s: active experiments json set = %s", "SupportedFeaturesProvider", a);
        }
        return this.c;
    }

    public final void a(e eVar) {
        for (com.fyber.inneractive.sdk.config.global.features.i iVar : this.b.values()) {
            iVar.getClass();
            ArrayList arrayList = new ArrayList(iVar.c.values());
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                b bVar = (b) arrayList.get(size);
                ArrayList arrayList2 = bVar.d;
                if (arrayList2 != null) {
                    Iterator it = arrayList2.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        d dVar = (d) it.next();
                        if (dVar.a(eVar)) {
                            iVar.c.remove(bVar.a);
                            iVar.d.remove(bVar.a);
                            this.c = null;
                            IAlog.a("%s: Experiment %s filtered! after response %s", "SupportedFeaturesProvider", bVar.a, dVar);
                            break;
                        }
                    }
                }
            }
        }
    }

    public final com.fyber.inneractive.sdk.config.global.features.i a(Class cls) {
        if (this.b.containsKey(cls)) {
            com.fyber.inneractive.sdk.config.global.features.i iVar = (com.fyber.inneractive.sdk.config.global.features.i) this.b.get(cls);
            if (cls.isInstance(iVar)) {
                return iVar;
            }
        }
        try {
            return (com.fyber.inneractive.sdk.config.global.features.i) cls.getConstructor(null).newInstance(null);
        } catch (Exception e) {
            IAlog.a("Couldn't create a feature for %s", e, cls.getName());
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x013c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0057 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(boolean z, String str) {
        boolean z2;
        e eVar;
        k kVar;
        this.a = str;
        a aVar = IAConfigManager.N.y;
        aVar.b = this;
        for (com.fyber.inneractive.sdk.config.global.features.i iVar : this.b.values()) {
            boolean z3 = iVar instanceof com.fyber.inneractive.sdk.config.global.features.p;
            if ((z3 && z) || (!z3 && !z)) {
                l lVar = aVar.a;
                if (iVar != null && lVar != null) {
                    q qVar = (q) lVar.a.get(iVar.b);
                    if (qVar != null) {
                        iVar.a = qVar.a;
                        IAlog.a("%s: Feature before variant merge: %s", "a", iVar);
                        HashMap hashMap = qVar.c;
                        Iterator it = hashMap.keySet().iterator();
                        while (it.hasNext()) {
                            b bVar = (b) hashMap.get((String) it.next());
                            if (bVar != null) {
                                int nextInt = new Random().nextInt(100) + 1;
                                int i = 0;
                                if (bVar.b < nextInt) {
                                    IAlog.a("%s: Experiment '%s' filtered! rand: %d, with perc: %d", "a", bVar.a, Integer.valueOf(nextInt), Integer.valueOf(bVar.b));
                                } else {
                                    ArrayList arrayList = bVar.d;
                                    if (arrayList != null) {
                                        Iterator it2 = arrayList.iterator();
                                        while (it2.hasNext()) {
                                            d dVar = (d) it2.next();
                                            try {
                                                Long valueOf = Long.valueOf(IAConfigManager.N.d);
                                                eVar = new e();
                                                eVar.b = valueOf;
                                                eVar.c = com.fyber.inneractive.sdk.serverapi.b.a(aVar.b.a);
                                            } catch (NumberFormatException unused) {
                                                IAlog.a("%s: invalid publisherId", "a");
                                            }
                                            if (dVar.a(eVar)) {
                                                IAlog.a("%s: Experiment '%s' filtered! with %s", "a", bVar.a, dVar);
                                                break;
                                            }
                                        }
                                    }
                                    if (iVar instanceof v) {
                                        Iterator it3 = bVar.c.iterator();
                                        while (it3.hasNext()) {
                                            k kVar2 = (k) it3.next();
                                            n nVar = kVar2.a;
                                            if (nVar != null && nVar.a() != null && kVar2.a.a().containsKey("use_fmp_cache_mechanism")) {
                                                w wVar = (w) IAConfigManager.N.G.get(x.Video);
                                                if (!(wVar != null ? wVar.a() : false)) {
                                                }
                                            }
                                        }
                                    }
                                    IAlog.a("%s: Experiment '%s' NOT filtered! rand: %d, with perc: %d", "a", bVar.a, Integer.valueOf(nextInt), Integer.valueOf(bVar.b));
                                    z2 = false;
                                    if (z2) {
                                        ArrayList arrayList2 = bVar.c;
                                        int nextInt2 = new Random().nextInt(100) + 1;
                                        IAlog.a("%s: selectVariant for experiment '%s' generated random number: %d", "a", bVar.a, Integer.valueOf(nextInt2));
                                        Iterator it4 = arrayList2.iterator();
                                        while (true) {
                                            if (!it4.hasNext()) {
                                                kVar = null;
                                                break;
                                            }
                                            kVar = (k) it4.next();
                                            i += kVar.c;
                                            IAlog.a("%s: selectVariant variant found: %s", "a", kVar);
                                            if (i >= nextInt2) {
                                                break;
                                            } else {
                                                IAlog.a("%s: selectVariant variant '%s' percentage outside selected range", "a", kVar.b);
                                            }
                                        }
                                        if (kVar != null) {
                                            IAlog.a("%s: experiment '%s' variant selected! %s", "a", bVar.a, kVar);
                                        } else {
                                            IAlog.a("%s: experiment '%s' no variant was selected! using control group", "a", bVar.a);
                                        }
                                        iVar.c.put(bVar.a, bVar);
                                        if (kVar != null) {
                                            iVar.d.put(bVar.a, kVar);
                                        }
                                    }
                                }
                                z2 = true;
                                if (z2) {
                                }
                            }
                        }
                    }
                    IAlog.a("%s: Feature after variant merge: %s", "a", iVar);
                }
            }
        }
    }
}
