package yads;

import android.content.Context;
import android.location.Location;
import android.os.Build;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;

/* loaded from: classes15.dex */
public final class st0 {
    public String A;
    public float A0;
    public String B;
    public float B0;
    public Integer C;
    public String C0;
    public Integer D;
    public String D0;
    public String E;
    public String E0;
    public String F;
    public String F0;
    public Location G;
    public String G0;
    public Integer H;
    public String H0;
    public Integer I;
    public String I0;
    public Float J;
    public String J0;
    public Integer K;
    public Boolean K0;
    public Integer L;
    public String L0;
    public String M;
    public String N;
    public String N0;
    public d8 O;
    public String O0;
    public Integer P;
    public String P0;
    public Integer Q;
    public String Q0;
    public String R;
    public String R0;
    public Boolean S;
    public Boolean S0;
    public Boolean T;
    public Boolean T0;
    public String U;
    public Long U0;
    public Boolean V;
    public Integer V0;
    public String W;
    public String W0;
    public Integer X;
    public String X0;
    public Boolean Y;
    public Long Y0;
    public String Z;
    public Long Z0;
    public final boolean a;
    public String a0;
    public Long a1;
    public String b0;
    public String b1;
    public String c0;
    public Long d0;
    public String e0;
    public String f0;
    public String g0;
    public String h0;
    public String i0;
    public String j0;
    public boolean k;
    public String k0;
    public boolean l;
    public String l0;
    public String m0;
    public String n0;
    public Boolean o;
    public String o0;
    public Boolean p;
    public String p0;
    public String q;
    public List q0;
    public String r;
    public String r0;
    public Integer s;
    public String s0;
    public boolean t;
    public String t0;
    public String u;
    public String u0;
    public String v;
    public int v0;
    public String w;
    public float w0;
    public String x;
    public float x0;
    public String y;
    public float y0;
    public String z;
    public float z0;
    public final rg0 b = new rg0();
    public final fg c = new fg();
    public final dx2 d = new dx2();
    public final jc e = new jc();
    public final qz0 f = new qz0();
    public final u53 g = new u53();
    public final fh0 h = new fh0();
    public final a73 i = new a73();
    public final sh3 j = new sh3();
    public final HashMap m = new HashMap();
    public final HashMap n = new HashMap();
    public Map M0 = MapsKt.emptyMap();

    public st0(boolean z) {
        this.a = z;
    }

    public static boolean a(Context context) {
        vw2 vw2Var;
        vw2 vw2Var2 = vw2.l;
        if (vw2Var2 == null) {
            synchronized (vw2.k) {
                vw2Var = vw2.l;
                if (vw2Var == null) {
                    vw2Var = new vw2();
                    vw2.l = vw2Var;
                }
            }
            vw2Var2 = vw2Var;
        }
        bu2 a = vw2Var2.a(context);
        return a != null && a.S0;
    }

    public final st0 b() {
        vw2 vw2Var;
        vw2 vw2Var2 = vw2.l;
        if (vw2Var2 == null) {
            synchronized (vw2.k) {
                vw2Var = vw2.l;
                if (vw2Var == null) {
                    vw2Var = new vw2();
                    vw2.l = vw2Var;
                }
            }
            vw2Var2 = vw2Var;
        }
        this.p = vw2Var2.c();
        return this;
    }

    public final st0 c() {
        vw2 vw2Var;
        vw2 vw2Var2 = vw2.l;
        if (vw2Var2 == null) {
            synchronized (vw2.k) {
                vw2Var = vw2.l;
                if (vw2Var == null) {
                    vw2Var = new vw2();
                    vw2.l = vw2Var;
                }
            }
            vw2Var2 = vw2Var;
        }
        this.o = vw2Var2.e();
        return this;
    }

    public final st0 d(Context context) {
        if (qw.a == null) {
            synchronized (qw.b) {
                try {
                    if (qw.a == null) {
                        qw.a = rw.a(context);
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        sw swVar = qw.a;
        if (swVar == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        this.v = swVar.b();
        return this;
    }

    public final st0 e(Context context) {
        if (qw.a == null) {
            synchronized (qw.b) {
                try {
                    if (qw.a == null) {
                        qw.a = rw.a(context);
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        sw swVar = qw.a;
        if (swVar == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        this.w = swVar.d();
        return this;
    }

    public final st0 f(Context context) {
        vw2 vw2Var;
        vw2 vw2Var2 = vw2.l;
        if (vw2Var2 == null) {
            synchronized (vw2.k) {
                vw2Var = vw2.l;
                if (vw2Var == null) {
                    vw2Var = new vw2();
                    vw2.l = vw2Var;
                }
            }
            vw2Var2 = vw2Var;
        }
        bu2 a = vw2Var2.a(context);
        Map map = a != null ? a.f0 : null;
        if (map != null) {
            this.M0 = map;
        }
        return this;
    }

    public final st0 g(Context context) {
        vw2 vw2Var;
        vw2 vw2Var2 = vw2.l;
        if (vw2Var2 == null) {
            synchronized (vw2.k) {
                vw2Var = vw2.l;
                if (vw2Var == null) {
                    vw2Var = new vw2();
                    vw2.l = vw2Var;
                }
            }
            vw2Var2 = vw2Var;
        }
        bu2 a = vw2Var2.a(context);
        if (a != null) {
            this.L0 = a.e0;
        }
        return this;
    }

    public final st0 h(Context context) {
        if (qw.a == null) {
            synchronized (qw.b) {
                try {
                    if (qw.a == null) {
                        qw.a = rw.a(context);
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        sw swVar = qw.a;
        if (swVar == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        this.x = swVar.e();
        return this;
    }

    public final st0 b(Context context) {
        String str;
        sw a = qw.a(context);
        synchronized (sw.i) {
            str = a.h;
        }
        this.y = str;
        return this;
    }

    public final st0 c(Context context) {
        if (qw.a == null) {
            synchronized (qw.b) {
                try {
                    if (qw.a == null) {
                        qw.a = rw.a(context);
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        sw swVar = qw.a;
        if (swVar != null) {
            this.t = swVar.a();
            return this;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public final st0 a() {
        vw2 vw2Var;
        vw2 vw2Var2 = vw2.l;
        if (vw2Var2 == null) {
            synchronized (vw2.k) {
                vw2Var = vw2.l;
                if (vw2Var == null) {
                    vw2Var = new vw2();
                    vw2.l = vw2Var;
                }
            }
            vw2Var2 = vw2Var;
        }
        ua a = vw2Var2.a();
        if (a != null) {
            this.m.putAll(MapsKt.mapOf(TuplesKt.to("adapter_network_name", a.a), TuplesKt.to("adapter_version", a.b), TuplesKt.to("adapter_network_sdk_version", a.c)));
        }
        return this;
    }

    public final st0 a(Context context, String str) {
        this.j0 = this.b.a(context);
        this.b.getClass();
        this.k0 = "android";
        this.b.getClass();
        this.l0 = Build.VERSION.RELEASE;
        this.b.getClass();
        this.m0 = rg0.a();
        this.b.getClass();
        this.n0 = Build.MODEL;
        this.b.b.getClass();
        this.o0 = ug1.a(context.getResources().getConfiguration().locale);
        this.p0 = this.b.b.a(context);
        this.q0 = this.b.b.b(context);
        if (this.a) {
            str = null;
        }
        this.u0 = str;
        this.b.c.getClass();
        this.Y = Boolean.valueOf(ls2.a());
        return this;
    }
}
