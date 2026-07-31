package com.my.target;

import java.util.ArrayList;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes5.dex */
public final class y {
    private Boolean A;
    private Boolean B;
    private Boolean C;
    private Boolean D;
    private Boolean E;
    private Boolean F;
    private Boolean G;
    private Boolean H;
    private Boolean I;
    private Boolean J;
    private Boolean K;
    private String L;
    private de M;
    private e N;
    public final String a;
    public final String b;
    private ArrayList f;
    private ArrayList g;
    private y h;
    private String i;
    private String j;
    private String k;
    private ue l;
    private String m;
    private int n;
    private boolean v;
    private boolean w;
    private boolean x;
    private Boolean z;
    private final ArrayList c = new ArrayList();
    private final ArrayList d = new ArrayList();
    private final th e = th.a(w0.d, (sh) null);
    private int o = -1;
    private int p = -1;
    private int q = -1;
    private int r = -1;
    private int s = -1;
    private float t = -1.0f;
    private float u = -1.0f;
    private float y = -1.0f;

    public y(String str, String str2) {
        this.b = str;
        this.a = str2;
    }

    public static y a(String str, String str2) {
        return new y(str, str2);
    }

    public static y b(String str) {
        return a(str, null);
    }

    public float A() {
        return this.t;
    }

    public float B() {
        return this.u;
    }

    public int C() {
        return this.p;
    }

    public ue D() {
        return this.l;
    }

    public int E() {
        return this.n;
    }

    public int F() {
        return this.r;
    }

    public ArrayList G() {
        return this.c;
    }

    public boolean H() {
        return this.v;
    }

    public boolean I() {
        return this.w;
    }

    public Boolean J() {
        return this.K;
    }

    public boolean K() {
        return this.x;
    }

    public void c(int i) {
        this.o = i;
    }

    public void d(int i) {
        this.p = i;
        y yVar = this.h;
        if (yVar != null) {
            yVar.d(i);
        }
    }

    public void e(int i) {
        this.n = i;
    }

    public void f(String str) {
        this.i = str;
    }

    public void g(Boolean bool) {
        this.D = bool;
    }

    public Boolean h() {
        return this.B;
    }

    public Boolean i() {
        return this.C;
    }

    public Boolean j() {
        return this.D;
    }

    public Boolean k() {
        return this.I;
    }

    public void l(Boolean bool) {
        this.F = bool;
    }

    public th m() {
        return this.e;
    }

    public int n() {
        return this.s;
    }

    public ArrayList o() {
        return this.g;
    }

    public String p() {
        return this.k;
    }

    public String q() {
        return this.j;
    }

    public Boolean r() {
        return this.E;
    }

    public int s() {
        return this.q;
    }

    public String t() {
        return this.L;
    }

    public int u() {
        return this.o;
    }

    public ArrayList v() {
        if (this.f != null) {
            return new ArrayList(this.f);
        }
        return null;
    }

    public String w() {
        return this.i;
    }

    public de x() {
        return this.M;
    }

    public y y() {
        return this.h;
    }

    public Boolean z() {
        return this.F;
    }

    public void a(de deVar) {
        this.M = deVar;
    }

    public void b(boolean z) {
        this.w = z;
    }

    public void c(ArrayList arrayList) {
        this.f = arrayList;
    }

    public void e(String str) {
        this.j = str;
    }

    public Boolean f() {
        return this.A;
    }

    public Boolean g() {
        return this.G;
    }

    public void h(Boolean bool) {
        this.I = bool;
    }

    public void i(Boolean bool) {
        this.J = bool;
    }

    public void j(Boolean bool) {
        this.E = bool;
    }

    public void k(Boolean bool) {
        this.K = bool;
    }

    public Boolean l() {
        return this.J;
    }

    public void a(boolean z) {
        this.v = z;
    }

    public void b(int i) {
        this.q = i;
    }

    public void c(float f) {
        this.u = f;
    }

    public float e() {
        return this.y;
    }

    public void f(Boolean bool) {
        this.C = bool;
    }

    public void a(rh rhVar) {
        this.d.add(rhVar);
    }

    public void b(y yVar) {
        this.h = yVar;
        if (yVar != null) {
            yVar.d(this.p);
        }
    }

    public void c(boolean z) {
        this.x = z;
    }

    public void d(String str) {
        this.k = str;
    }

    public void e(Boolean bool) {
        this.B = bool;
    }

    public void f(int i) {
        this.r = i;
    }

    public ArrayList a(String str) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.d;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            rh rhVar = (rh) obj;
            if (str.equals(rhVar.b())) {
                arrayList.add(rhVar);
            }
        }
        return arrayList;
    }

    public void c(Boolean bool) {
        this.A = bool;
    }

    public Boolean d() {
        return this.z;
    }

    public Boolean c() {
        return this.H;
    }

    public void d(Boolean bool) {
        this.G = bool;
    }

    public void b(ArrayList arrayList) {
        this.g = arrayList;
    }

    public void c(String str) {
        this.m = str;
    }

    public void b(float f) {
        this.t = f;
    }

    public void a(y yVar) {
        this.c.add(yVar);
    }

    public void b(Boolean bool) {
        this.z = bool;
    }

    public void a(ArrayList arrayList) {
        ArrayList arrayList2 = this.f;
        if (arrayList2 == null) {
            this.f = arrayList;
        } else if (arrayList != null) {
            arrayList2.addAll(arrayList);
        }
    }

    public String b() {
        return this.m;
    }

    public void a(ue ueVar) {
        this.l = ueVar;
    }

    public void a(float f) {
        this.y = f;
    }

    public void a(Boolean bool) {
        this.H = bool;
    }

    public void a(int i) {
        this.s = i;
    }

    public e a() {
        return this.N;
    }

    public void a(e eVar) {
        this.N = eVar;
    }
}
