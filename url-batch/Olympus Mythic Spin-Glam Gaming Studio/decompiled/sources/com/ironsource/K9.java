package com.ironsource;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes12.dex */
public class K9 {
    private final boolean a;
    private String b;
    private String c;
    private boolean d;
    private C4625e8 e;
    private Map<String, String> f;
    private Ic g;
    private String h;
    private boolean i;
    private boolean j;

    K9(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, String str3, Map<String, String> map, Ic ic, C4625e8 c4625e8) {
        this.b = str;
        this.c = str2;
        this.a = z;
        this.d = z2;
        this.f = map;
        this.g = ic;
        this.e = c4625e8;
        this.i = z3;
        this.j = z4;
        this.h = str3;
    }

    public Map<String, String> a() {
        HashMap hashMap = new HashMap();
        hashMap.put("instanceId", this.b);
        hashMap.put("instanceName", this.c);
        hashMap.put("rewarded", Boolean.toString(this.a));
        hashMap.put("inAppBidding", Boolean.toString(this.d));
        hashMap.put("isOneFlow", Boolean.toString(this.i));
        hashMap.put(X3.s, String.valueOf(2));
        C4625e8 c4625e8 = this.e;
        hashMap.put("width", c4625e8 != null ? Integer.toString(c4625e8.c()) : "0");
        C4625e8 c4625e82 = this.e;
        hashMap.put("height", c4625e82 != null ? Integer.toString(c4625e82.a()) : "0");
        C4625e8 c4625e83 = this.e;
        hashMap.put("label", c4625e83 != null ? c4625e83.b() : "");
        hashMap.put(X3.w, Boolean.toString(i()));
        if (this.j) {
            hashMap.put("isMultipleAdObjects", "true");
        }
        String str = this.h;
        if (str != null) {
            hashMap.put("adUnitId", str);
        }
        Map<String, String> map = this.f;
        if (map != null) {
            hashMap.putAll(map);
        }
        return hashMap;
    }

    public final Ic b() {
        return this.g;
    }

    public String c() {
        return this.h;
    }

    public Map<String, String> d() {
        return this.f;
    }

    public String e() {
        return this.b;
    }

    public String f() {
        return this.c.replaceAll("IronSource_", "");
    }

    public String g() {
        return this.c;
    }

    public C4625e8 h() {
        return this.e;
    }

    public boolean i() {
        return h() != null && h().d();
    }

    public boolean j() {
        return this.d;
    }

    public boolean k() {
        return j() || m();
    }

    public boolean l() {
        return this.j;
    }

    public boolean m() {
        return this.i;
    }

    public boolean n() {
        return this.a;
    }

    public void a(Ic ic) {
        this.g = ic;
    }

    public void a(String str) {
        this.h = str;
    }
}
