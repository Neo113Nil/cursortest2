package com.my.target;

import com.my.target.common.CustomParams;
import com.my.target.mediation.AdNetworkConfig;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes5.dex */
public final class n {
    private int g;
    private String h;
    private int j;
    private volatile String k;
    private String l;
    private final CustomParams a = new CustomParams();
    private final Map b = Collections.synchronizedMap(new HashMap());
    private long c = 86400000;
    private boolean d = true;
    private boolean e = true;
    private int f = 360;
    private int i = 0;
    private t m = t.k;
    private final g0 n = g0.a();

    private n(int i, String str) {
        this.j = i;
        this.k = str;
    }

    public static n a(int i, String str) {
        return new n(i, str);
    }

    public void b(boolean z) {
        this.e = z;
    }

    public void c(String str) {
        this.k = str;
    }

    public void d(int i) {
        this.f = i;
    }

    public String e() {
        return this.h;
    }

    public long f() {
        return this.c;
    }

    public int g() {
        return this.i;
    }

    public CustomParams h() {
        return this.a;
    }

    public String i() {
        return this.k;
    }

    public int j() {
        return this.j;
    }

    public String k() {
        return this.l;
    }

    public int l() {
        return this.f;
    }

    public boolean m() {
        return this.d;
    }

    public boolean n() {
        return this.e;
    }

    public t a() {
        return this.m;
    }

    public void b(String str) {
        this.h = str;
    }

    public void c(int i) {
        this.j = i;
    }

    public int d() {
        return this.g;
    }

    public void a(t tVar) {
        this.m = tVar;
        tVar.a(this.i);
        tVar.a(this.l);
    }

    public void b(int i) {
        this.i = i;
        this.m.a(i);
    }

    public g0 c() {
        return this.n;
    }

    public void d(String str) {
        this.l = str;
        this.m.a(str);
    }

    public Collection b() {
        return this.b.values();
    }

    public void a(long j) {
        if (j < 0) {
            this.c = 0L;
        } else {
            this.c = j;
        }
    }

    public void a(int i) {
        this.g = i;
    }

    public void a(boolean z) {
        this.d = z;
    }

    public void a(String str, AdNetworkConfig adNetworkConfig) {
        this.b.put(str.toLowerCase(Locale.ROOT), adNetworkConfig);
    }

    public AdNetworkConfig a(String str) {
        return (AdNetworkConfig) this.b.get(str.toLowerCase(Locale.ROOT));
    }
}
