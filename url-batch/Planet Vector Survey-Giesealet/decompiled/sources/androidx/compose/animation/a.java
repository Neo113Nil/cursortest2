package androidx.compose.animation;

import defpackage.bh;
import defpackage.bs0;
import defpackage.ce0;
import defpackage.ch0;
import defpackage.cq;
import defpackage.cx0;
import defpackage.dh;
import defpackage.dq;
import defpackage.dx0;
import defpackage.dz0;
import defpackage.eg;
import defpackage.eh;
import defpackage.ex0;
import defpackage.f70;
import defpackage.fq;
import defpackage.gf0;
import defpackage.gi;
import defpackage.gq;
import defpackage.h6;
import defpackage.h70;
import defpackage.hh;
import defpackage.ih;
import defpackage.j3;
import defpackage.kj;
import defpackage.kq;
import defpackage.ky0;
import defpackage.ld0;
import defpackage.mu;
import defpackage.mz;
import defpackage.nk;
import defpackage.nz;
import defpackage.px0;
import defpackage.q6;
import defpackage.qh;
import defpackage.qu;
import defpackage.r50;
import defpackage.r6;
import defpackage.ri0;
import defpackage.u10;
import defpackage.u50;
import defpackage.u6;
import defpackage.ud0;
import defpackage.w6;
import defpackage.wq;
import defpackage.xq;
import defpackage.xw0;
import defpackage.y3;
import defpackage.y6;
import defpackage.y7;
import defpackage.z50;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public abstract class a {
    /* JADX WARN: Removed duplicated region for block: B:120:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0445  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0449  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x048e  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(cx0 cx0Var, mu muVar, u50 u50Var, kq kqVar, wq wqVar, qu quVar, eg egVar, ih ihVar, int i) {
        bh bhVar;
        kq kqVar2;
        boolean f;
        Object K;
        wq wqVar2;
        dx0 dx0Var;
        dx0 dx0Var2;
        boolean z;
        xw0 xw0Var;
        boolean h;
        Object K2;
        kq kqVar3;
        wq wqVar3;
        boolean g;
        Object K3;
        Object K4;
        int A;
        eg egVar2;
        boolean z2;
        ri0 s;
        qh qhVar = (qh) ihVar;
        qhVar.W(-891967166);
        int i2 = i | (qhVar.f(cx0Var) ? 4 : 2) | (qhVar.h(muVar) ? 32 : 16) | (qhVar.f(u50Var) ? 256 : 128) | (qhVar.f(kqVar) ? 2048 : 1024) | (qhVar.f(wqVar) ? 16384 : 8192) | (qhVar.h(quVar) ? 131072 : 65536) | 1572864;
        if ((4793491 & i2) == 4793490 && qhVar.z()) {
            qhVar.Q();
        } else {
            ce0 ce0Var = cx0Var.d;
            bh bhVar2 = cx0Var.a;
            if (((Boolean) muVar.c(ce0Var.getValue())).booleanValue() || ((Boolean) muVar.c(bhVar2.b())).booleanValue() || cx0Var.g() || cx0Var.d()) {
                qhVar.V(1787977937);
                int i3 = i2 & 14;
                int i4 = i3 | 48;
                int i5 = i4 & 14;
                boolean z3 = ((i5 ^ 6) > 4 && qhVar.f(cx0Var)) || (i4 & 6) == 4;
                Object K5 = qhVar.K();
                y7 y7Var = hh.a;
                if (z3 || K5 == y7Var) {
                    K5 = bhVar2.b();
                    qhVar.e0(K5);
                }
                if (cx0Var.g()) {
                    K5 = bhVar2.b();
                }
                qhVar.V(-466616829);
                cq b = b(cx0Var, muVar, K5, qhVar);
                qhVar.q(false);
                Object value = cx0Var.d.getValue();
                qhVar.V(-466616829);
                cq b2 = b(cx0Var, muVar, value, qhVar);
                qhVar.q(false);
                int i6 = i5 | 3072;
                u10 u10Var = ex0.a;
                int i7 = (i6 & 14) ^ 6;
                boolean z4 = (i7 > 4 && qhVar.f(cx0Var)) || (i6 & 6) == 4;
                Object K6 = qhVar.K();
                if (z4 || K6 == y7Var) {
                    K6 = new cx0(new h70(b), cx0Var, cx0Var.c.concat(" > EnterExitTransition"));
                    qhVar.e0(K6);
                }
                cx0 cx0Var2 = (cx0) K6;
                boolean f2 = ((i7 > 4 && qhVar.f(cx0Var)) || (i6 & 6) == 4) | qhVar.f(cx0Var2);
                Object K7 = qhVar.K();
                if (f2 || K7 == y7Var) {
                    K7 = new y3(21, cx0Var, cx0Var2);
                    qhVar.e0(K7);
                }
                mz.h(cx0Var2, (mu) K7, qhVar);
                if (cx0Var.g()) {
                    cx0Var2.l(b, b2);
                } else {
                    cx0Var2.q(b2);
                    cx0Var2.k.setValue(Boolean.FALSE);
                }
                f70 p = ud0.p(quVar, qhVar);
                bh bhVar3 = cx0Var2.a;
                bh bhVar4 = cx0Var2.a;
                ce0 ce0Var2 = cx0Var2.d;
                Object invoke = quVar.invoke(bhVar3.b(), ce0Var2.getValue());
                boolean f3 = qhVar.f(cx0Var2) | qhVar.f(p);
                Object K8 = qhVar.K();
                if (f3 || K8 == y7Var) {
                    K8 = new u6(cx0Var2, p, (kj) null, 0);
                    qhVar.e0(K8);
                }
                qu quVar2 = (qu) K8;
                Object K9 = qhVar.K();
                if (K9 == y7Var) {
                    K9 = ud0.o(invoke);
                    qhVar.e0(K9);
                }
                f70 f70Var = (f70) K9;
                boolean h2 = qhVar.h(quVar2);
                Object K10 = qhVar.K();
                if (h2 || K10 == y7Var) {
                    K10 = new bs0(quVar2, f70Var, null, 0);
                    qhVar.e0(K10);
                }
                mz.k(qhVar, (qu) K10, ky0.a);
                Object b3 = bhVar4.b();
                cq cqVar = cq.f;
                if (b3 == cqVar && ce0Var2.getValue() == cqVar && ((Boolean) f70Var.getValue()).booleanValue()) {
                    qhVar.V(1790256282);
                    z2 = false;
                    qhVar.q(false);
                    egVar2 = egVar;
                } else {
                    qhVar.V(1788869559);
                    boolean z5 = i3 == 4;
                    Object K11 = qhVar.K();
                    if (z5 || K11 == y7Var) {
                        K11 = new w6();
                        qhVar.e0(K11);
                    }
                    w6 w6Var = (w6) K11;
                    j3 j3Var = gq.a;
                    gi giVar = gi.k;
                    boolean f4 = qhVar.f(cx0Var2);
                    Object K12 = qhVar.K();
                    if (f4 || K12 == y7Var) {
                        K12 = ud0.o(kqVar);
                        qhVar.e0(K12);
                    }
                    f70 f70Var2 = (f70) K12;
                    Object b4 = bhVar4.b();
                    Object value2 = ce0Var2.getValue();
                    cq cqVar2 = cq.e;
                    if (b4 == value2 && bhVar4.b() == cqVar2) {
                        if (cx0Var2.g()) {
                            f70Var2.setValue(kqVar);
                        } else {
                            f70Var2.setValue(kq.b);
                        }
                    } else if (ce0Var2.getValue() == cqVar2) {
                        dx0 dx0Var3 = ((kq) f70Var2.getValue()).a;
                        dx0 dx0Var4 = kqVar.a;
                        xq xqVar = dx0Var4.a;
                        if (xqVar == null) {
                            xqVar = dx0Var3.a;
                        }
                        Map map = dx0Var3.c;
                        Map map2 = dx0Var4.c;
                        map.getClass();
                        map2.getClass();
                        bhVar = bhVar4;
                        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
                        linkedHashMap.putAll(map2);
                        f70Var2.setValue(new kq(new dx0(xqVar, (ch0) null, linkedHashMap, 16)));
                        kqVar2 = (kq) f70Var2.getValue();
                        f = qhVar.f(cx0Var2);
                        K = qhVar.K();
                        if (!f || K == y7Var) {
                            K = ud0.o(wqVar);
                            qhVar.e0(K);
                        }
                        f70 f70Var3 = (f70) K;
                        if (bhVar.b() == ce0Var2.getValue() || bhVar.b() != cqVar2) {
                            if (ce0Var2.getValue() != cqVar2) {
                                dx0 dx0Var5 = ((wq) f70Var3.getValue()).a;
                                dx0 dx0Var6 = wqVar.a;
                                xq xqVar2 = dx0Var6.a;
                                if (xqVar2 == null) {
                                    xqVar2 = dx0Var5.a;
                                }
                                boolean z6 = dx0Var6.b || dx0Var5.b;
                                Map map3 = dx0Var5.c;
                                Map map4 = dx0Var6.c;
                                map3.getClass();
                                map4.getClass();
                                LinkedHashMap linkedHashMap2 = new LinkedHashMap(map3);
                                linkedHashMap2.putAll(map4);
                                f70Var3.setValue(new wq(new dx0(xqVar2, (ch0) null, z6, linkedHashMap2)));
                            }
                        } else if (cx0Var2.g()) {
                            f70Var3.setValue(wqVar);
                        } else {
                            f70Var3.setValue(wq.b);
                        }
                        wqVar2 = (wq) f70Var3.getValue();
                        dx0Var = kqVar2.a;
                        dx0Var2 = wqVar2.a;
                        qhVar.V(-821278096);
                        qhVar.q(false);
                        qhVar.V(-821099041);
                        qhVar.q(false);
                        qhVar.V(-820883777);
                        qhVar.q(false);
                        if (dx0Var.a == null || dx0Var2.a != null) {
                            z = false;
                            qhVar.V(-675252433);
                            qhVar.q(false);
                            xw0Var = null;
                        } else {
                            qhVar.V(-675389204);
                            j3 j3Var2 = dz0.a;
                            Object K13 = qhVar.K();
                            if (K13 == y7Var) {
                                K13 = "Built-in alpha";
                                qhVar.e0("Built-in alpha");
                            }
                            xw0Var = ex0.a(cx0Var2, j3Var2, (String) K13, qhVar, 384, 0);
                            z = false;
                            qhVar.q(false);
                        }
                        qhVar.V(-675057009);
                        qhVar.q(z);
                        qhVar.V(-674835793);
                        qhVar.q(z);
                        h = qhVar.h(xw0Var) | qhVar.f(kqVar2) | qhVar.f(wqVar2) | qhVar.h(null) | qhVar.f(cx0Var2) | qhVar.h(null);
                        K2 = qhVar.K();
                        if (!h || K2 == y7Var) {
                            kqVar3 = kqVar2;
                            wqVar3 = wqVar2;
                            K2 = new dq(xw0Var, null, cx0Var2, kqVar3, wqVar3, null);
                            qhVar.e0(K2);
                        } else {
                            kqVar3 = kqVar2;
                            wqVar3 = wqVar2;
                        }
                        dq dqVar = (dq) K2;
                        g = qhVar.g(true) | qhVar.f(giVar);
                        K3 = qhVar.K();
                        if (!g || K3 == y7Var) {
                            K3 = new fq(true, giVar);
                            qhVar.e0(K3);
                        }
                        u50 d = y6.d((z50) androidx.compose.ui.graphics.a.a((mu) K3), new EnterExitTransitionElement(cx0Var2, kqVar3, wqVar3, giVar, dqVar));
                        qhVar.V(1581766416);
                        qhVar.q(false);
                        u50 c = u50Var.c(d.c(r50.a));
                        K4 = qhVar.K();
                        if (K4 == y7Var) {
                            K4 = new q6(w6Var);
                            qhVar.e0(K4);
                        }
                        q6 q6Var = (q6) K4;
                        A = px0.A(qhVar);
                        gf0 l = qhVar.l();
                        u50 D = nk.D(qhVar, c);
                        eh.b.getClass();
                        gi giVar2 = dh.b;
                        qhVar.X();
                        if (qhVar.Q) {
                            qhVar.h0();
                        } else {
                            qhVar.k(giVar2);
                        }
                        ld0.r(qhVar, dh.e, q6Var);
                        ld0.r(qhVar, dh.d, l);
                        h6 h6Var = dh.f;
                        if (!qhVar.Q || !nz.l(qhVar.K(), Integer.valueOf(A))) {
                            y6.y(A, qhVar, A, h6Var);
                        }
                        ld0.r(qhVar, dh.c, D);
                        egVar2 = egVar;
                        egVar2.b(w6Var, qhVar, 48);
                        qhVar.q(true);
                        z2 = false;
                        qhVar.q(false);
                    }
                    bhVar = bhVar4;
                    kqVar2 = (kq) f70Var2.getValue();
                    f = qhVar.f(cx0Var2);
                    K = qhVar.K();
                    if (!f) {
                    }
                    K = ud0.o(wqVar);
                    qhVar.e0(K);
                    f70 f70Var32 = (f70) K;
                    if (bhVar.b() == ce0Var2.getValue()) {
                    }
                    if (ce0Var2.getValue() != cqVar2) {
                    }
                    wqVar2 = (wq) f70Var32.getValue();
                    dx0Var = kqVar2.a;
                    dx0Var2 = wqVar2.a;
                    qhVar.V(-821278096);
                    qhVar.q(false);
                    qhVar.V(-821099041);
                    qhVar.q(false);
                    qhVar.V(-820883777);
                    qhVar.q(false);
                    if (dx0Var.a == null || dx0Var2.a != null) {
                    }
                    qhVar.V(-675057009);
                    qhVar.q(z);
                    qhVar.V(-674835793);
                    qhVar.q(z);
                    h = qhVar.h(xw0Var) | qhVar.f(kqVar2) | qhVar.f(wqVar2) | qhVar.h(null) | qhVar.f(cx0Var2) | qhVar.h(null);
                    K2 = qhVar.K();
                    if (h) {
                    }
                    kqVar3 = kqVar2;
                    wqVar3 = wqVar2;
                    K2 = new dq(xw0Var, null, cx0Var2, kqVar3, wqVar3, null);
                    qhVar.e0(K2);
                    dq dqVar2 = (dq) K2;
                    g = qhVar.g(true) | qhVar.f(giVar);
                    K3 = qhVar.K();
                    if (!g) {
                    }
                    K3 = new fq(true, giVar);
                    qhVar.e0(K3);
                    u50 d2 = y6.d((z50) androidx.compose.ui.graphics.a.a((mu) K3), new EnterExitTransitionElement(cx0Var2, kqVar3, wqVar3, giVar, dqVar2));
                    qhVar.V(1581766416);
                    qhVar.q(false);
                    u50 c2 = u50Var.c(d2.c(r50.a));
                    K4 = qhVar.K();
                    if (K4 == y7Var) {
                    }
                    q6 q6Var2 = (q6) K4;
                    A = px0.A(qhVar);
                    gf0 l2 = qhVar.l();
                    u50 D2 = nk.D(qhVar, c2);
                    eh.b.getClass();
                    gi giVar22 = dh.b;
                    qhVar.X();
                    if (qhVar.Q) {
                    }
                    ld0.r(qhVar, dh.e, q6Var2);
                    ld0.r(qhVar, dh.d, l2);
                    h6 h6Var2 = dh.f;
                    if (!qhVar.Q) {
                    }
                    y6.y(A, qhVar, A, h6Var2);
                    ld0.r(qhVar, dh.c, D2);
                    egVar2 = egVar;
                    egVar2.b(w6Var, qhVar, 48);
                    qhVar.q(true);
                    z2 = false;
                    qhVar.q(false);
                }
                qhVar.q(z2);
                s = qhVar.s();
                if (s == null) {
                    s.d = new r6(cx0Var, muVar, u50Var, kqVar, wqVar, quVar, egVar2, i);
                    return;
                }
                return;
            }
            qhVar.V(1790262234);
            qhVar.q(false);
        }
        egVar2 = egVar;
        s = qhVar.s();
        if (s == null) {
        }
    }

    public static final cq b(cx0 cx0Var, mu muVar, Object obj, ih ihVar) {
        qh qhVar = (qh) ihVar;
        qhVar.R(-902048200, 0, cx0Var, null);
        boolean g = cx0Var.g();
        bh bhVar = cx0Var.a;
        cq cqVar = cq.d;
        cq cqVar2 = cq.f;
        cq cqVar3 = cq.e;
        if (g) {
            qhVar.V(2101296683);
            qhVar.q(false);
            if (((Boolean) muVar.c(obj)).booleanValue()) {
                cqVar = cqVar3;
            } else if (((Boolean) muVar.c(bhVar.b())).booleanValue()) {
                cqVar = cqVar2;
            }
        } else {
            qhVar.V(2101530516);
            Object K = qhVar.K();
            if (K == hh.a) {
                K = ud0.o(Boolean.FALSE);
                qhVar.e0(K);
            }
            f70 f70Var = (f70) K;
            if (((Boolean) muVar.c(bhVar.b())).booleanValue()) {
                f70Var.setValue(Boolean.TRUE);
            }
            if (((Boolean) muVar.c(obj)).booleanValue()) {
                cqVar = cqVar3;
            } else if (((Boolean) f70Var.getValue()).booleanValue()) {
                cqVar = cqVar2;
            }
            qhVar.q(false);
        }
        qhVar.q(false);
        return cqVar;
    }
}
