package com.my.target;

import android.text.TextUtils;
import com.my.target.common.models.Disclaimer;
import com.my.target.common.models.ImageData;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes5.dex */
public abstract class b {
    protected int A;
    protected Disclaimer B;
    protected int C;
    protected int D;
    protected float E;
    protected String F;
    protected String G;
    protected String H;
    protected String I;
    protected String J;
    protected String K;
    protected String L;
    protected e M;
    protected de N;
    protected String O;
    protected String P;
    protected boolean Q;
    protected String R;
    private String S;
    private String T;
    private boolean U;
    private final v0 V;
    private final w0 W;
    private final th a;
    private final lj b;
    protected String c;
    protected String d;
    protected String e;
    protected String f;
    protected String g;
    protected String h;
    protected String i;
    protected Float j;
    protected Integer k;
    protected String l;
    protected long m;
    protected String n;
    protected String o;
    protected String p;
    protected String q;
    protected String r;
    protected List s;
    protected ImageData t;
    protected ImageData u;
    protected String v;
    protected e2 w;
    protected boolean x;
    protected boolean y;
    protected boolean z;

    protected b() {
        this(w0.d, null, null);
    }

    public long A() {
        return this.m;
    }

    public String B() {
        return this.p;
    }

    public String C() {
        return this.R;
    }

    public String D() {
        return this.P;
    }

    public de E() {
        return this.N;
    }

    public String F() {
        return this.S;
    }

    public float G() {
        Float f = this.j;
        if (f == null) {
            return 0.0f;
        }
        return f.floatValue();
    }

    public th H() {
        return this.a;
    }

    public String I() {
        return this.q;
    }

    public String J() {
        return this.n;
    }

    public String K() {
        return this.f;
    }

    public String L() {
        return this.K;
    }

    public String M() {
        return this.F;
    }

    public List N() {
        return this.s;
    }

    public String O() {
        return this.H;
    }

    public lj P() {
        return this.b;
    }

    public int Q() {
        Integer num = this.k;
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public int R() {
        return this.C;
    }

    public boolean S() {
        return this.z;
    }

    public boolean T() {
        return this.y;
    }

    public boolean U() {
        return this.U;
    }

    public boolean V() {
        return this.x;
    }

    public boolean W() {
        return this.Q;
    }

    public void a(de deVar) {
        this.N = deVar;
    }

    public void b(String str) {
        this.h = str;
    }

    public void c(String str) {
        this.I = str;
    }

    public String d() {
        return this.h;
    }

    public void e(boolean z) {
        this.Q = z;
    }

    public final w0 f() {
        return this.W;
    }

    public String g() {
        return this.I;
    }

    public String h() {
        return this.l;
    }

    public void i(String str) {
        this.c = str;
    }

    public String j() {
        return this.e;
    }

    public String k() {
        return this.L;
    }

    public String l() {
        String str = this.d;
        return str == null ? "store".equals(this.p) ? "Install" : "Visit" : str;
    }

    public void m(String str) {
        this.i = str;
    }

    public String n() {
        return this.c;
    }

    public String o() {
        return this.g;
    }

    public Disclaimer p() {
        return this.B;
    }

    public int q() {
        return this.A;
    }

    public String r() {
        return this.O;
    }

    public String s() {
        return this.o;
    }

    public float t() {
        return this.E;
    }

    public String u() {
        return this.i;
    }

    public int v() {
        return this.D;
    }

    public ImageData w() {
        return this.u;
    }

    public String x() {
        return this.G;
    }

    public ImageData y() {
        return this.t;
    }

    public String z() {
        return this.v;
    }

    protected b(w0 w0Var, sh shVar, g0 g0Var) {
        this.b = lj.d();
        this.c = "";
        this.f = "";
        this.g = "";
        this.h = "";
        this.i = "";
        this.l = "";
        this.m = -1L;
        this.n = "";
        this.o = "";
        this.p = "web";
        this.r = "";
        this.s = new ArrayList();
        this.w = e2.p;
        this.x = false;
        this.y = false;
        this.z = false;
        this.A = 0;
        this.F = "";
        this.G = "";
        this.Q = false;
        this.R = "";
        this.U = true;
        this.V = new v0();
        this.W = w0Var;
        this.a = th.a(w0Var, shVar, g0Var);
    }

    public void a(int i) {
        this.A = i;
    }

    public void b(int i) {
        this.D = i;
    }

    public void c(int i) {
        this.k = Integer.valueOf(i);
    }

    public void d(String str) {
        this.l = str;
    }

    public void e(String str) {
        this.e = str;
    }

    public void f(String str) {
        this.L = str;
    }

    public void g(String str) {
        this.d = str;
    }

    public void h(String str) {
        this.J = str;
    }

    public e2 i() {
        return this.w;
    }

    public void j(String str) {
        this.g = str;
    }

    public void k(String str) {
        this.O = str;
    }

    public String m() {
        return this.J;
    }

    public void n(String str) {
        this.G = str;
    }

    public void o(String str) {
        this.v = str;
    }

    public void p(String str) {
        this.p = str;
    }

    public void q(String str) {
        this.R = str;
    }

    public void r(String str) {
        this.P = str;
    }

    public void s(String str) {
        this.S = str;
    }

    public void t(String str) {
        this.T = str;
    }

    public void u(String str) {
        this.q = str;
    }

    public void v(String str) {
        this.n = str;
    }

    public void w(String str) {
        this.f = str;
    }

    public void x(String str) {
        this.K = str;
    }

    public void y(String str) {
        this.F = str;
    }

    public void z(String str) {
        this.H = str;
    }

    public void a(Disclaimer disclaimer) {
        this.B = disclaimer;
    }

    public void b(ImageData imageData) {
        this.t = imageData;
    }

    public String c() {
        return this.r;
    }

    public void d(int i) {
        this.C = i;
    }

    public v0 e() {
        return this.V;
    }

    public void a(ImageData imageData) {
        this.u = imageData;
    }

    public void b(float f) {
        this.j = Float.valueOf(f);
    }

    public void c(boolean z) {
        this.U = z;
    }

    public void d(boolean z) {
        this.x = z;
    }

    public void a(String str) {
        this.r = str;
    }

    public void b(boolean z) {
        this.y = z;
    }

    public void a(List list) {
        this.s = list;
    }

    public void l(String str) {
        this.o = str;
    }

    public void a(float f) {
        this.E = f;
    }

    public String b() {
        String str = "";
        if (!TextUtils.isEmpty(this.r)) {
            str = "" + this.r;
        }
        if (TextUtils.isEmpty(this.h)) {
            return str;
        }
        if (!TextUtils.isEmpty(str)) {
            str = str + " ";
        }
        return str + this.h;
    }

    public void a(e2 e2Var) {
        this.w = e2Var;
    }

    public e a() {
        return this.M;
    }

    public void a(e eVar) {
        this.M = eVar;
    }

    public void a(boolean z) {
        this.z = z;
    }

    public void a(long j) {
        this.m = j;
    }
}
