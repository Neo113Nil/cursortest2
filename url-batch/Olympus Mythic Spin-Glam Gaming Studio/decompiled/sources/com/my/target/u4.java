package com.my.target;

import android.content.Context;
import com.my.target.common.MyTargetConfig;
import com.my.target.common.MyTargetPrivacy;
import com.my.target.common.MyTargetVersion;
import com.my.target.q4;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes4.dex */
public final class u4 {
    private static final u4 n = new u4();
    private final j0 a = new j0();
    private final w3 b = new w3();
    private final q4 c = new q4();
    private final a5 d = new a5();
    private final be e = new be();
    private final o5 f = new o5();
    private final n1 g = new n1();
    private final i1 h = new i1();
    private final c1 i = new c1();
    private final vj j = new vj();
    private final qc k = new qc();
    private volatile String l = null;
    private volatile String m = null;

    private u4() {
    }

    public static u4 b() {
        return n;
    }

    public v3 a() {
        return this.b.a();
    }

    public String a(Context context) {
        return this.b.a(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.util.Map] */
    public Map a(MyTargetConfig myTargetConfig, MyTargetPrivacy myTargetPrivacy, tb tbVar, Context context) {
        Map map;
        Map map2;
        Map map3;
        Map map4;
        HashMap hashMap;
        if (o0.a()) {
            mi.a("FingerprintDataProvider: You must not call collectData method from main thread");
            return Collections.EMPTY_MAP;
        }
        long currentTimeMillis = System.currentTimeMillis();
        Map a = this.a.a(myTargetConfig, context);
        a(tbVar, 23, currentTimeMillis);
        Map a2 = this.b.a(myTargetConfig, context);
        long a3 = a(tbVar, 10, currentTimeMillis);
        Map a4 = this.j.a(myTargetConfig, context);
        a(tbVar, 21, a3);
        Map a5 = this.i.a(myTargetConfig, context);
        long a6 = a(tbVar, 16, a3);
        Map a7 = this.k.a(myTargetConfig, context);
        a(tbVar, 22, a6);
        HashMap hashMap2 = new HashMap();
        if (myTargetPrivacy.isConsent()) {
            this.c.b(myTargetConfig, context);
            long a8 = a(tbVar, 15, a6);
            Map a9 = this.d.a(myTargetConfig, context);
            long a10 = a(tbVar, 11, a8);
            ?? a11 = this.e.a(myTargetConfig, context);
            long a12 = a(tbVar, 14, a10);
            map3 = this.f.a(myTargetConfig, context);
            long a13 = a(tbVar, 13, a12);
            map4 = this.h.a(myTargetConfig, context);
            long a14 = a(tbVar, 17, a13);
            map = this.g.a(myTargetConfig, context);
            a(tbVar, 18, a14);
            map2 = a9;
            hashMap2 = a11;
        } else {
            map = hashMap2;
            map2 = map;
            map3 = map2;
            map4 = map3;
        }
        synchronized (this) {
            try {
                hashMap = new HashMap();
                hashMap.putAll(a);
                hashMap.putAll(a2);
                hashMap.putAll(a4);
                hashMap.putAll(a5);
                hashMap.putAll(a7);
                if (myTargetPrivacy.isConsent()) {
                    q4.d a15 = this.c.a();
                    if (tbVar != null) {
                        tbVar.b(15, a15.a());
                    }
                    hashMap.putAll(a15.b());
                    hashMap.putAll(map2);
                    hashMap.putAll(hashMap2);
                    hashMap.putAll(map3);
                    hashMap.putAll(map4);
                    hashMap.putAll(map);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return hashMap;
    }

    public String a(MyTargetConfig myTargetConfig, MyTargetPrivacy myTargetPrivacy, Context context) {
        if (o0.a()) {
            mi.a("FingerprintDataProvider: You must not call getBidderToken method from main thread");
            return "";
        }
        if (this.l == null) {
            synchronized (this) {
                try {
                    if (this.l == null) {
                        HashMap hashMap = new HashMap();
                        hashMap.put("sdk_ver_int", MyTargetVersion.VERSION_INT);
                        hashMap.putAll(this.b.a(myTargetConfig, context));
                        this.l = p4.a(hashMap);
                        hashMap.putAll(this.d.a(myTargetConfig, context));
                        hashMap.putAll(this.f.a(myTargetConfig, context));
                        this.m = p4.a(hashMap);
                    }
                } finally {
                }
            }
        }
        String str = myTargetPrivacy.isConsent() ? this.m : this.l;
        return str != null ? str : "";
    }

    public void a(MyTargetConfig myTargetConfig, Context context) {
        if (o0.a()) {
            mi.a("FingerprintDataProvider: You must not call collectData method from main thread");
            return;
        }
        this.a.a(myTargetConfig, context);
        this.b.a(myTargetConfig, context);
        this.d.a(myTargetConfig, context);
        this.f.a(myTargetConfig, context);
    }

    private long a(tb tbVar, int i, long j) {
        if (tbVar == null) {
            return 0L;
        }
        long currentTimeMillis = System.currentTimeMillis();
        tbVar.b(i, currentTimeMillis - j);
        return currentTimeMillis;
    }
}
