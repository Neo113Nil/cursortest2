package yads;

import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.json.Json;

/* loaded from: classes4.dex */
public final class yy {
    public static final Object b = new Object();
    public final og1 a;

    public yy(og1 og1Var) {
        this.a = og1Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x05fe, code lost:
    
        if (kotlin.Result.m8028isFailureimpl(r12) != false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x05b8, code lost:
    
        if (kotlin.Result.m8028isFailureimpl(r12) != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x04a5, code lost:
    
        if (kotlin.Result.m8028isFailureimpl(r6) != false) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final bu2 a() {
        bu2 bu2Var;
        Object m8023constructorimpl;
        long j;
        Object m8023constructorimpl2;
        Object m8023constructorimpl3;
        synchronized (b) {
            try {
                long b2 = ((qg1) this.a).b(xy.c.a());
                Boolean a = wy.a(this.a, xy.h.a());
                if (b2 != 0) {
                    Integer b3 = wy.b(this.a, xy.s.a());
                    Integer b4 = wy.b(this.a, xy.t.a());
                    int a2 = ((qg1) this.a).a(0, xy.g.a());
                    int a3 = ((qg1) this.a).a(0, xy.B.a());
                    long b5 = ((qg1) this.a).b(xy.C.a());
                    long b6 = ((qg1) this.a).b(xy.D.a());
                    Boolean a4 = wy.a(this.a, xy.j.a());
                    boolean a5 = ((qg1) this.a).a(xy.l.a(), false);
                    boolean a6 = ((qg1) this.a).a(xy.m.a(), false);
                    Boolean a7 = wy.a(this.a, xy.n.a());
                    String c = ((qg1) this.a).c(xy.i.a());
                    String c2 = ((qg1) this.a).c(xy.V.a());
                    String c3 = ((qg1) this.a).c(xy.W.a());
                    String c4 = ((qg1) this.a).c(xy.S.a());
                    String c5 = ((qg1) this.a).c(xy.d.a());
                    String c6 = ((qg1) this.a).c(xy.e.a());
                    boolean a8 = ((qg1) this.a).a(xy.f.a(), false);
                    boolean a9 = ((qg1) this.a).a(xy.k.a(), false);
                    boolean a10 = ((qg1) this.a).a(xy.T.a(), false);
                    boolean a11 = ((qg1) this.a).a(xy.p.a(), false);
                    boolean a12 = ((qg1) this.a).a(xy.o.a(), false);
                    boolean a13 = ((qg1) this.a).a(xy.q.a(), false);
                    boolean a14 = ((qg1) this.a).a(xy.r.a(), false);
                    boolean a15 = ((qg1) this.a).a(xy.w.a(), false);
                    boolean a16 = ((qg1) this.a).a(xy.x.a(), false);
                    boolean a17 = ((qg1) this.a).a(xy.u.a(), false);
                    boolean a18 = ((qg1) this.a).a(xy.v.a(), false);
                    boolean a19 = ((qg1) this.a).a(xy.z.a(), false);
                    boolean a20 = ((qg1) this.a).a(xy.A.a(), false);
                    boolean a21 = ((qg1) this.a).a(xy.J.a(), false);
                    boolean a22 = ((qg1) this.a).a(xy.K.a(), false);
                    boolean a23 = ((qg1) this.a).a(xy.L.a(), false);
                    Json json = cp.a;
                    ap a24 = cp.a(this.a);
                    String c7 = ((qg1) this.a).c(xy.E.a());
                    String c8 = ((qg1) this.a).c(xy.y.a());
                    Integer b7 = wy.b(this.a, xy.F.a());
                    boolean a25 = ((qg1) this.a).a(xy.G.a(), false);
                    boolean a26 = ((qg1) this.a).a(xy.I.a(), false);
                    boolean a27 = ((qg1) this.a).a(xy.M.a(), false);
                    String c9 = ((qg1) this.a).c(xy.N.a());
                    boolean a28 = ((qg1) this.a).a(xy.O.a(), false);
                    boolean a29 = ((qg1) this.a).a(xy.P.a(), false);
                    boolean a30 = ((qg1) this.a).a(xy.H.a(), false);
                    boolean a31 = ((qg1) this.a).a(xy.Q.a(), false);
                    boolean a32 = ((qg1) this.a).a(xy.R.a(), false);
                    boolean a33 = ((qg1) this.a).a(xy.X.a(), false);
                    Boolean a34 = wy.a(this.a, xy.U.a());
                    boolean a35 = ((qg1) this.a).a(xy.Y.a(), false);
                    boolean a36 = ((qg1) this.a).a(xy.Z.a(), false);
                    String c10 = ((qg1) this.a).c(xy.a0.a());
                    String c11 = ((qg1) this.a).c(xy.b0.a());
                    String c12 = ((qg1) this.a).c(xy.c0.a());
                    Map a37 = c12 != null ? a43.a(c12) : null;
                    boolean a38 = ((qg1) this.a).a(xy.d0.a(), false);
                    boolean a39 = ((qg1) this.a).a(xy.e0.a(), false);
                    boolean a40 = ((qg1) this.a).a(xy.f0.a(), false);
                    boolean a41 = ((qg1) this.a).a(xy.g0.a(), false);
                    boolean a42 = ((qg1) this.a).a(xy.h0.a(), false);
                    boolean a43 = ((qg1) this.a).a(xy.i0.a(), false);
                    boolean a44 = ((qg1) this.a).a(xy.j0.a(), false);
                    boolean a45 = ((qg1) this.a).a(xy.k0.a(), false);
                    Long c13 = wy.c(this.a, xy.l0.a());
                    Long c14 = wy.c(this.a, xy.m0.a());
                    boolean a46 = ((qg1) this.a).a(xy.n0.a(), false);
                    Integer b8 = wy.b(this.a, xy.o0.a());
                    Integer b9 = wy.b(this.a, xy.p0.a());
                    Boolean a47 = wy.a(this.a, xy.q0.a());
                    boolean a48 = ((qg1) this.a).a(xy.r0.a(), false);
                    boolean a49 = ((qg1) this.a).a(xy.s0.a(), false);
                    String c15 = ((qg1) this.a).c(xy.t0.a());
                    Set a50 = c15 != null ? fn0.a(c15) : null;
                    boolean a51 = ((qg1) this.a).a(xy.u0.a(), false);
                    boolean a52 = ((qg1) this.a).a(xy.v0.a(), true);
                    boolean a53 = ((qg1) this.a).a(xy.w0.a(), false);
                    Integer b10 = wy.b(this.a, xy.x0.a());
                    Integer b11 = wy.b(this.a, xy.y0.a());
                    Integer b12 = wy.b(this.a, xy.z0.a());
                    Integer b13 = wy.b(this.a, xy.A0.a());
                    String c16 = ((qg1) this.a).c(xy.B0.a());
                    d7 a54 = c16 != null ? s6.a(c16) : null;
                    String c17 = ((qg1) this.a).c(xy.M0.a());
                    if (c17 != null) {
                        try {
                            Result.Companion companion = Result.INSTANCE;
                            Json json2 = hd1.a;
                            json2.getSerializersModule();
                            m8023constructorimpl = Result.m8023constructorimpl(json2.decodeFromString(tv0.Companion.serializer(), c17));
                        } catch (Throwable th) {
                            Result.Companion companion2 = Result.INSTANCE;
                            m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(th));
                        }
                    }
                    m8023constructorimpl = null;
                    tv0 tv0Var = (tv0) m8023constructorimpl;
                    boolean a55 = ((qg1) this.a).a(xy.C0.a(), false);
                    List a56 = tg1.a(this.a, xy.D0.a());
                    if (a56 == null) {
                        a56 = CollectionsKt.emptyList();
                    }
                    List list = a56;
                    boolean a57 = ((qg1) this.a).a(xy.E0.a(), false);
                    boolean a58 = ((qg1) this.a).a(xy.F0.a(), false);
                    boolean a59 = ((qg1) this.a).a(xy.G0.a(), false);
                    boolean a60 = ((qg1) this.a).a(xy.H0.a(), false);
                    boolean a61 = ((qg1) this.a).a(xy.I0.a(), false);
                    Integer b14 = wy.b(this.a, xy.J0.a());
                    boolean a62 = ((qg1) this.a).a(xy.K0.a(), false);
                    boolean a63 = ((qg1) this.a).a(xy.L0.a(), false);
                    boolean a64 = ((qg1) this.a).a(xy.N0.a(), false);
                    boolean a65 = ((qg1) this.a).a(xy.P0.a(), false);
                    boolean a66 = ((qg1) this.a).a(xy.Q0.a(), false);
                    String c18 = ((qg1) this.a).c(xy.O0.a());
                    String c19 = ((qg1) this.a).c(xy.R0.a());
                    if (c19 != null) {
                        try {
                            Result.Companion companion3 = Result.INSTANCE;
                            Json json3 = hd1.a;
                            json3.getSerializersModule();
                            j = b2;
                            try {
                                m8023constructorimpl2 = Result.m8023constructorimpl(json3.decodeFromString(yd2.Companion.serializer(), c19));
                            } catch (Throwable th2) {
                                th = th2;
                                Throwable th3 = th;
                                Result.Companion companion4 = Result.INSTANCE;
                                m8023constructorimpl2 = Result.m8023constructorimpl(ResultKt.createFailure(th3));
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            j = b2;
                        }
                    } else {
                        j = b2;
                    }
                    m8023constructorimpl2 = null;
                    yd2 yd2Var = (yd2) m8023constructorimpl2;
                    String c20 = ((qg1) this.a).c(xy.S0.a());
                    if (c20 != null) {
                        try {
                            Result.Companion companion5 = Result.INSTANCE;
                            Json json4 = hd1.a;
                            json4.getSerializersModule();
                            m8023constructorimpl3 = Result.m8023constructorimpl(json4.decodeFromString(new ArrayListSerializer(fi2.Companion.serializer()), c20));
                        } catch (Throwable th5) {
                            Result.Companion companion6 = Result.INSTANCE;
                            m8023constructorimpl3 = Result.m8023constructorimpl(ResultKt.createFailure(th5));
                        }
                    }
                    m8023constructorimpl3 = null;
                    bu2Var = new bu2(a2, a3, b5, b6, j, a8, a5, a6, a9, a10, a12, a11, a13, a14, a17, a18, a16, a15, a19, a30, a25, a26, a20, a27, c9, a28, a29, a31, a32, a33, a35, a36, a38, a39, a40, a41, a42, b3, b4, a7, a34, a21, a, c10, c5, c6, c, c4, c8, c2, c3, a4, (c7 == null || b7 == null) ? null : new lm0(b7.intValue(), c7), a22, a23, a24, c11, a37, a43, a44, a45, c13, c14, a46, b8, b9, a47, a48, a49, a50, a51, a52, a53, b10, b11, b12, b13, a54, a55, list, a57, a58, a59, a60, a61, b14, a62, a63, tv0Var, a64, a65, c18 != null ? new ry2(c18) : null, yd2Var, a66, (List) m8023constructorimpl3, oq1.b(((qg1) this.a).c(xy.T0.a())), ((qg1) this.a).a(xy.U0.a(), false), ((qg1) this.a).a(xy.V0.a(), false), wy.c(this.a, xy.W0.a()));
                } else {
                    bu2Var = null;
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th6) {
                throw th6;
            }
        }
        return bu2Var;
    }

    public final void a(bu2 bu2Var) {
        String str;
        String str2;
        synchronized (b) {
            try {
                ((qg1) this.a).a(xy.i.a(), bu2Var.V());
                ((qg1) this.a).a(xy.S.a(), bu2Var.m());
                ((qg1) this.a).b(xy.k.a(), bu2Var.N0());
                ((qg1) this.a).b(xy.T.a(), bu2Var.u0());
                ((qg1) this.a).a(xy.c.a(), bu2Var.y());
                ((qg1) this.a).a(xy.d.a(), bu2Var.K());
                ((qg1) this.a).a(xy.e.a(), bu2Var.N());
                ((qg1) this.a).a(xy.y.a(), bu2Var.E());
                ((qg1) this.a).b(xy.f.a(), bu2Var.q());
                ((qg1) this.a).b(xy.w.a(), bu2Var.Z());
                ((qg1) this.a).b(xy.x.a(), bu2Var.Y());
                ((qg1) this.a).b(bu2Var.b(), xy.g.a());
                ((qg1) this.a).b(xy.u.a(), bu2Var.w0());
                ((qg1) this.a).b(xy.v.a(), bu2Var.y0());
                ((qg1) this.a).b(xy.G.a(), bu2Var.q0());
                ((qg1) this.a).b(xy.I.a(), bu2Var.p0());
                og1 og1Var = this.a;
                xy xyVar = xy.H;
                ((qg1) og1Var).b(xyVar.a(), bu2Var.t);
                ((qg1) this.a).b(xy.J.a(), bu2Var.C0());
                ((qg1) this.a).b(xy.M.a(), bu2Var.B0());
                ((qg1) this.a).a(xy.N.a(), bu2Var.G());
                ((qg1) this.a).b(xy.O.a(), bu2Var.c0());
                ((qg1) this.a).b(xy.P.a(), bu2Var.a0());
                ((qg1) this.a).b(xy.Q.a(), bu2Var.r0());
                og1 og1Var2 = this.a;
                xy xyVar2 = xy.R;
                ((qg1) og1Var2).b(xyVar2.a(), bu2Var.C);
                ((qg1) this.a).b(bu2Var.L(), xy.B.a());
                ((qg1) this.a).a(xy.C.a(), bu2Var.I());
                ((qg1) this.a).a(xy.D.a(), bu2Var.H());
                ((qg1) this.a).a(xy.V.a(), bu2Var.a());
                ((qg1) this.a).a(xy.W.a(), bu2Var.r());
                ((qg1) this.a).a(xy.a0.a(), bu2Var.k());
                Boolean R0 = bu2Var.R0();
                Boolean E0 = bu2Var.E0();
                boolean t0 = bu2Var.t0();
                boolean D0 = bu2Var.D0();
                Boolean P0 = bu2Var.P0();
                boolean z0 = bu2Var.z0();
                boolean A0 = bu2Var.A0();
                boolean J0 = bu2Var.J0();
                boolean K0 = bu2Var.K0();
                boolean s0 = bu2Var.s0();
                boolean I0 = bu2Var.I0();
                boolean o0 = bu2Var.o0();
                boolean v0 = bu2Var.v0();
                Integer d = bu2Var.d();
                Integer R = bu2Var.R();
                ap l = bu2Var.l();
                boolean z = bu2Var.t;
                boolean z2 = bu2Var.C;
                Boolean l0 = bu2Var.l0();
                boolean n0 = bu2Var.n0();
                boolean F0 = bu2Var.F0();
                boolean O0 = bu2Var.O0();
                wy.a(this.a, xy.h.a(), R0);
                wy.a(this.a, xy.j.a(), E0);
                wy.a(this.a, xy.l.a(), Boolean.valueOf(t0));
                wy.a(this.a, xy.m.a(), Boolean.valueOf(D0));
                wy.a(this.a, xy.n.a(), P0);
                wy.a(this.a, xy.p.a(), Boolean.valueOf(z0));
                wy.a(this.a, xy.o.a(), Boolean.valueOf(A0));
                wy.a(this.a, xy.q.a(), Boolean.valueOf(J0));
                wy.a(this.a, xy.r.a(), Boolean.valueOf(K0));
                wy.a(this.a, xyVar.a(), Boolean.valueOf(z));
                wy.a(this.a, xy.z.a(), Boolean.valueOf(s0));
                wy.a(this.a, xy.A.a(), Boolean.valueOf(I0));
                wy.a(this.a, xy.U.a(), l0);
                wy.a(this.a, xy.X.a(), Boolean.valueOf(n0));
                wy.a(this.a, xy.K.a(), Boolean.valueOf(o0));
                wy.a(this.a, xy.L.a(), Boolean.valueOf(v0));
                wy.a(this.a, xy.s.a(), d);
                wy.a(this.a, xy.t.a(), R);
                if (l != null) {
                    Json json = cp.a;
                    cp.a(this.a, l);
                } else {
                    Json json2 = cp.a;
                    cp.b(this.a);
                }
                lm0 s = bu2Var.s();
                if (s != null) {
                    ((qg1) this.a).a(xy.E.a(), s.a());
                    ((qg1) this.a).b(s.b(), xy.F.a());
                }
                wy.a(this.a, xyVar2.a(), Boolean.valueOf(z2));
                ((qg1) this.a).b(xy.Y.a(), F0);
                ((qg1) this.a).b(xy.Z.a(), O0);
                ((qg1) this.a).a(xy.b0.a(), bu2Var.e0());
                og1 og1Var3 = this.a;
                String a = xy.c0.a();
                Map d0 = bu2Var.d0();
                String str3 = null;
                ((qg1) og1Var3).a(a, d0 != null ? a43.a(d0) : null);
                ((qg1) this.a).b(xy.d0.a(), bu2Var.m0());
                ((qg1) this.a).b(xy.e0.a(), bu2Var.x0());
                ((qg1) this.a).b(xy.f0.a(), bu2Var.L0());
                ((qg1) this.a).b(xy.g0.a(), bu2Var.G0());
                ((qg1) this.a).b(xy.h0.a(), bu2Var.Q0());
                ((qg1) this.a).b(xy.i0.a(), bu2Var.p());
                ((qg1) this.a).b(xy.j0.a(), bu2Var.t());
                ((qg1) this.a).b(xy.k0.a(), bu2Var.f());
                og1 og1Var4 = this.a;
                String a2 = xy.l0.a();
                Long g = bu2Var.g();
                if (g != null) {
                    ((qg1) og1Var4).a(a2, g.longValue());
                } else {
                    ((qg1) og1Var4).d(a2);
                }
                og1 og1Var5 = this.a;
                String a3 = xy.m0.a();
                Long h = bu2Var.h();
                if (h != null) {
                    ((qg1) og1Var5).a(a3, h.longValue());
                } else {
                    ((qg1) og1Var5).d(a3);
                }
                ((qg1) this.a).b(xy.n0.a(), bu2Var.u());
                wy.a(this.a, xy.o0.a(), bu2Var.x());
                wy.a(this.a, xy.p0.a(), bu2Var.w());
                wy.a(this.a, xy.q0.a(), bu2Var.v());
                ((qg1) this.a).b(xy.r0.a(), bu2Var.n());
                ((qg1) this.a).b(xy.s0.a(), bu2Var.Q());
                ((qg1) this.a).a(xy.t0.a(), fn0.a(bu2Var.o()));
                ((qg1) this.a).b(xy.u0.a(), bu2Var.g0());
                ((qg1) this.a).b(xy.v0.a(), bu2Var.i());
                ((qg1) this.a).b(xy.w0.a(), bu2Var.j());
                wy.a(this.a, xy.x0.a(), bu2Var.M());
                wy.a(this.a, xy.y0.a(), bu2Var.D());
                wy.a(this.a, xy.z0.a(), bu2Var.i0());
                wy.a(this.a, xy.A0.a(), bu2Var.h0());
                ((qg1) this.a).a(xy.B0.a(), s6.a(bu2Var.c()));
                og1 og1Var6 = this.a;
                String a4 = xy.M0.a();
                tv0 A = bu2Var.A();
                if (A != null) {
                    Json.Default r7 = Json.Default;
                    r7.getSerializersModule();
                    str = r7.encodeToString(tv0.Companion.serializer(), A);
                } else {
                    str = null;
                }
                ((qg1) og1Var6).a(a4, str);
                ((qg1) this.a).b(xy.C0.a(), bu2Var.U());
                tg1.a(this.a, xy.D0.a(), bu2Var.z());
                ((qg1) this.a).b(xy.E0.a(), bu2Var.X());
                ((qg1) this.a).b(xy.F0.a(), bu2Var.b0());
                ((qg1) this.a).b(xy.G0.a(), bu2Var.O());
                ((qg1) this.a).b(xy.H0.a(), bu2Var.j0());
                ((qg1) this.a).b(xy.I0.a(), bu2Var.P());
                wy.a(this.a, xy.J0.a(), bu2Var.F());
                ((qg1) this.a).b(xy.K0.a(), bu2Var.C());
                ((qg1) this.a).b(xy.L0.a(), bu2Var.T());
                ((qg1) this.a).b(xy.N0.a(), bu2Var.B());
                ((qg1) this.a).b(xy.P0.a(), bu2Var.f0());
                ((qg1) this.a).b(xy.Q0.a(), bu2Var.M0());
                ((qg1) this.a).b(xy.U0.a(), bu2Var.H0());
                ((qg1) this.a).b(xy.V0.a(), bu2Var.k0());
                og1 og1Var7 = this.a;
                String a5 = xy.W0.a();
                Long e = bu2Var.e();
                if (e != null) {
                    ((qg1) og1Var7).a(a5, e.longValue());
                } else {
                    ((qg1) og1Var7).d(a5);
                }
                ry2 W = bu2Var.W();
                if (W != null) {
                    ((qg1) this.a).a(xy.O0.a(), W.a());
                }
                og1 og1Var8 = this.a;
                String a6 = xy.R0.a();
                yd2 S = bu2Var.S();
                if (S != null) {
                    Json.Default r72 = Json.Default;
                    r72.getSerializersModule();
                    str2 = r72.encodeToString(yd2.Companion.serializer(), S);
                } else {
                    str2 = null;
                }
                ((qg1) og1Var8).a(a6, str2);
                if (bu2Var.Q0 != null) {
                    og1 og1Var9 = this.a;
                    String a7 = xy.S0.a();
                    List list = bu2Var.Q0;
                    if (list != null) {
                        Json.Default r6 = Json.Default;
                        r6.getSerializersModule();
                        str3 = r6.encodeToString(new ArrayListSerializer(fi2.Companion.serializer()), list);
                    }
                    ((qg1) og1Var9).a(a7, str3);
                } else {
                    ((qg1) this.a).d(xy.S0.a());
                }
                pq1 J = bu2Var.J();
                if (J != null) {
                    ((qg1) this.a).a(xy.T0.a(), J.a());
                } else {
                    ((qg1) this.a).d(xy.T0.a());
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
