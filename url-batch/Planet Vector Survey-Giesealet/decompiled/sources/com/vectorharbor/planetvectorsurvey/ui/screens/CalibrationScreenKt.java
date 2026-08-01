package com.vectorharbor.planetvectorsurvey.ui.screens;

import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.c;
import com.vectorharbor.planetvectorsurvey.model.CalibrationState;
import com.vectorharbor.planetvectorsurvey.model.GaugeState;
import com.vectorharbor.planetvectorsurvey.model.RunPhase;
import com.vectorharbor.planetvectorsurvey.model.TargetProfile;
import com.vectorharbor.planetvectorsurvey.ui.components.RelayComponentsKt;
import com.vectorharbor.planetvectorsurvey.ui.screens.CalibrationScreenKt;
import com.vectorharbor.planetvectorsurvey.ui.theme.ColorKt;
import com.vectorharbor.planetvectorsurvey.viewmodel.RelayViewModel;
import defpackage.a50;
import defpackage.b2;
import defpackage.bt0;
import defpackage.bu;
import defpackage.dh;
import defpackage.dw0;
import defpackage.dy0;
import defpackage.e8;
import defpackage.eh;
import defpackage.em0;
import defpackage.ey0;
import defpackage.f70;
import defpackage.ge;
import defpackage.gf0;
import defpackage.gi;
import defpackage.gm0;
import defpackage.h6;
import defpackage.hh;
import defpackage.ia;
import defpackage.ih;
import defpackage.ke;
import defpackage.ky0;
import defpackage.ld0;
import defpackage.le;
import defpackage.lt0;
import defpackage.mz;
import defpackage.nk;
import defpackage.nz;
import defpackage.od0;
import defpackage.pv0;
import defpackage.px0;
import defpackage.qh;
import defpackage.qu;
import defpackage.r50;
import defpackage.ri0;
import defpackage.ru;
import defpackage.u50;
import defpackage.ud0;
import defpackage.ut;
import defpackage.vb;
import defpackage.xe;
import defpackage.y6;
import defpackage.y7;
import defpackage.yb;
import defpackage.yc0;
import defpackage.z7;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class CalibrationScreenKt {
    public static final void CalibrationScreen(RelayViewModel relayViewModel, bu buVar, bu buVar2, ih ihVar, int i) {
        int i2;
        relayViewModel.getClass();
        buVar.getClass();
        buVar2.getClass();
        qh qhVar = (qh) ihVar;
        qhVar.W(702859909);
        if ((i & 6) == 0) {
            i2 = (qhVar.h(relayViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= qhVar.h(buVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= qhVar.h(buVar2) ? 256 : 128;
        }
        int i3 = 1;
        if (qhVar.N(i2 & 1, (i2 & 147) != 146)) {
            f70 g = ud0.g(relayViewModel.getCalibrationState(), qhVar);
            f70 p = ud0.p(CalibrationScreen$lambda$0(g), qhVar);
            RunPhase phase = CalibrationScreen$lambda$0(g).getPhase();
            boolean f = qhVar.f(g) | qhVar.f(p) | qhVar.h(relayViewModel);
            Object K = qhVar.K();
            y7 y7Var = hh.a;
            if (f || K == y7Var) {
                K = new CalibrationScreenKt$CalibrationScreen$1$1(g, p, relayViewModel, null);
                qhVar.e0(K);
            }
            mz.k(qhVar, (qu) K, phase);
            RunPhase phase2 = CalibrationScreen$lambda$0(g).getPhase();
            boolean f2 = qhVar.f(g) | ((i2 & 896) == 256);
            Object K2 = qhVar.K();
            if (f2 || K2 == y7Var) {
                K2 = new CalibrationScreenKt$CalibrationScreen$2$1(buVar2, g, null);
                qhVar.e0(K2);
            }
            mz.k(qhVar, (qu) K2, phase2);
            RelayComponentsKt.RelayScrollLayout(a50.E(1789146264, new ia(buVar, g, relayViewModel, i3), qhVar), qhVar, 6);
        } else {
            qhVar.Q();
        }
        ri0 s = qhVar.s();
        if (s != null) {
            s.d = new yb(relayViewModel, buVar, buVar2, i, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CalibrationState CalibrationScreen$lambda$0(bt0 bt0Var) {
        return (CalibrationState) bt0Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CalibrationState CalibrationScreen$lambda$1(bt0 bt0Var) {
        return (CalibrationState) bt0Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ky0 CalibrationScreen$lambda$23(bu buVar, final bt0 bt0Var, final RelayViewModel relayViewModel, xe xeVar, ih ihVar, int i) {
        xeVar.getClass();
        final int i2 = 0;
        final int i3 = 1;
        qh qhVar = (qh) ihVar;
        if (qhVar.N(i & 1, (i & 17) != 16)) {
            RelayComponentsKt.ScreenTopBar(CalibrationScreen$lambda$0(bt0Var).getMission().getTitle(), CalibrationScreen$lambda$0(bt0Var).getMission().getCluster(), buVar, qhVar, 0, 0);
            RelayComponentsKt.m8RelayPanel3IgeMak(null, ColorKt.getCyanBeam(), a50.E(366125098, new e8(bt0Var, i3), qhVar), qhVar, 432, 1);
            RelayComponentsKt.m8RelayPanel3IgeMak(null, ColorKt.getSolarAmber(), a50.E(-610897311, new e8(bt0Var, 2), qhVar), qhVar, 432, 1);
            if (CalibrationScreen$lambda$0(bt0Var).getPhase() == RunPhase.Ready) {
                qhVar.V(-85688409);
                RelayComponentsKt.m8RelayPanel3IgeMak(null, 0L, a50.E(2146328197, new ru() { // from class: xb
                    @Override // defpackage.ru
                    public final Object b(Object obj, Object obj2, Object obj3) {
                        ky0 CalibrationScreen$lambda$23$lambda$22;
                        ky0 CalibrationScreen$lambda$23$lambda$10;
                        int i4 = i3;
                        xe xeVar2 = (xe) obj;
                        ih ihVar2 = (ih) obj2;
                        int intValue = ((Integer) obj3).intValue();
                        switch (i4) {
                            case 0:
                                CalibrationScreen$lambda$23$lambda$22 = CalibrationScreenKt.CalibrationScreen$lambda$23$lambda$22(relayViewModel, bt0Var, xeVar2, ihVar2, intValue);
                                return CalibrationScreen$lambda$23$lambda$22;
                            default:
                                CalibrationScreen$lambda$23$lambda$10 = CalibrationScreenKt.CalibrationScreen$lambda$23$lambda$10(relayViewModel, bt0Var, xeVar2, ihVar2, intValue);
                                return CalibrationScreen$lambda$23$lambda$10;
                        }
                    }
                }, qhVar), qhVar, 384, 3);
                qhVar.q(false);
            } else {
                if (CalibrationScreen$lambda$0(bt0Var).getPhase() == RunPhase.Running) {
                    qhVar.V(-84955259);
                    qhVar.V(1382732681);
                    for (final GaugeState gaugeState : CalibrationScreen$lambda$0(bt0Var).getGauges()) {
                        TargetProfile target = CalibrationScreen$lambda$0(bt0Var).getTarget();
                        boolean h = qhVar.h(relayViewModel) | qhVar.f(gaugeState);
                        Object K = qhVar.K();
                        Object obj = hh.a;
                        if (h || K == obj) {
                            K = new bu() { // from class: wb
                                @Override // defpackage.bu
                                public final Object a() {
                                    ky0 CalibrationScreen$lambda$23$lambda$15$lambda$14$lambda$13;
                                    ky0 CalibrationScreen$lambda$23$lambda$15$lambda$12$lambda$11;
                                    switch (i3) {
                                        case 0:
                                            CalibrationScreen$lambda$23$lambda$15$lambda$14$lambda$13 = CalibrationScreenKt.CalibrationScreen$lambda$23$lambda$15$lambda$14$lambda$13(relayViewModel, gaugeState);
                                            return CalibrationScreen$lambda$23$lambda$15$lambda$14$lambda$13;
                                        default:
                                            CalibrationScreen$lambda$23$lambda$15$lambda$12$lambda$11 = CalibrationScreenKt.CalibrationScreen$lambda$23$lambda$15$lambda$12$lambda$11(relayViewModel, gaugeState);
                                            return CalibrationScreen$lambda$23$lambda$15$lambda$12$lambda$11;
                                    }
                                }
                            };
                            qhVar.e0(K);
                        }
                        bu buVar2 = (bu) K;
                        boolean h2 = qhVar.h(relayViewModel) | qhVar.f(gaugeState);
                        Object K2 = qhVar.K();
                        if (h2 || K2 == obj) {
                            K2 = new bu() { // from class: wb
                                @Override // defpackage.bu
                                public final Object a() {
                                    ky0 CalibrationScreen$lambda$23$lambda$15$lambda$14$lambda$13;
                                    ky0 CalibrationScreen$lambda$23$lambda$15$lambda$12$lambda$11;
                                    switch (i2) {
                                        case 0:
                                            CalibrationScreen$lambda$23$lambda$15$lambda$14$lambda$13 = CalibrationScreenKt.CalibrationScreen$lambda$23$lambda$15$lambda$14$lambda$13(relayViewModel, gaugeState);
                                            return CalibrationScreen$lambda$23$lambda$15$lambda$14$lambda$13;
                                        default:
                                            CalibrationScreen$lambda$23$lambda$15$lambda$12$lambda$11 = CalibrationScreenKt.CalibrationScreen$lambda$23$lambda$15$lambda$12$lambda$11(relayViewModel, gaugeState);
                                            return CalibrationScreen$lambda$23$lambda$15$lambda$12$lambda$11;
                                    }
                                }
                            };
                            qhVar.e0(K2);
                        }
                        RelayComponentsKt.GaugeControlCard(gaugeState, target, buVar2, (bu) K2, qhVar, 0);
                    }
                    qhVar.q(false);
                    RelayComponentsKt.m8RelayPanel3IgeMak(null, ColorKt.getMintTrace(), a50.E(-66468690, new ru() { // from class: xb
                        @Override // defpackage.ru
                        public final Object b(Object obj2, Object obj22, Object obj3) {
                            ky0 CalibrationScreen$lambda$23$lambda$22;
                            ky0 CalibrationScreen$lambda$23$lambda$10;
                            int i4 = i2;
                            xe xeVar2 = (xe) obj2;
                            ih ihVar2 = (ih) obj22;
                            int intValue = ((Integer) obj3).intValue();
                            switch (i4) {
                                case 0:
                                    CalibrationScreen$lambda$23$lambda$22 = CalibrationScreenKt.CalibrationScreen$lambda$23$lambda$22(relayViewModel, bt0Var, xeVar2, ihVar2, intValue);
                                    return CalibrationScreen$lambda$23$lambda$22;
                                default:
                                    CalibrationScreen$lambda$23$lambda$10 = CalibrationScreenKt.CalibrationScreen$lambda$23$lambda$10(relayViewModel, bt0Var, xeVar2, ihVar2, intValue);
                                    return CalibrationScreen$lambda$23$lambda$10;
                            }
                        }
                    }, qhVar), qhVar, 432, 1);
                } else {
                    qhVar.V(-90533430);
                }
                qhVar.q(false);
            }
        } else {
            qhVar.Q();
        }
        return ky0.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ky0 CalibrationScreen$lambda$23$lambda$10(RelayViewModel relayViewModel, bt0 bt0Var, xe xeVar, ih ihVar, int i) {
        xeVar.getClass();
        qh qhVar = (qh) ihVar;
        if (qhVar.N(i & 1, (i & 17) != 16)) {
            lt0 lt0Var = ey0.a;
            pv0.b("Mission plan", null, 0L, 0L, ut.i, 0L, null, 0L, 0, false, 0, 0, ((dy0) qhVar.j(lt0Var)).g, qhVar, 196614, 65502);
            pv0.b(CalibrationScreen$lambda$0(bt0Var).getMission().getGoal(), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((dy0) qhVar.j(lt0Var)).j, qhVar, 0, 65534);
            pv0.b("Support deck: " + CalibrationScreen$lambda$0(bt0Var).getModule().getTitle() + ". Stasis " + CalibrationScreen$lambda$0(bt0Var).getStasisCharges() + ", auto tune " + CalibrationScreen$lambda$0(bt0Var).getAutoTuneCharges() + ".", null, ge.b(((ke) qhVar.j(le.a)).q, 0.78f), 0L, null, 0L, null, 0L, 0, false, 0, 0, ((dy0) qhVar.j(lt0Var)).k, qhVar, 0, 65530);
            boolean h = qhVar.h(relayViewModel);
            Object K = qhVar.K();
            if (h || K == hh.a) {
                K = new vb(relayViewModel, 3);
                qhVar.e0(K);
            }
            RelayComponentsKt.RelayPrimaryButton("Open Scan", (bu) K, null, false, qhVar, 6, 12);
        } else {
            qhVar.Q();
        }
        return ky0.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ky0 CalibrationScreen$lambda$23$lambda$10$lambda$9$lambda$8(RelayViewModel relayViewModel) {
        relayViewModel.startRun();
        return ky0.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ky0 CalibrationScreen$lambda$23$lambda$15$lambda$12$lambda$11(RelayViewModel relayViewModel, GaugeState gaugeState) {
        relayViewModel.nudgeGauge(gaugeState.getChannel(), false);
        return ky0.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ky0 CalibrationScreen$lambda$23$lambda$15$lambda$14$lambda$13(RelayViewModel relayViewModel, GaugeState gaugeState) {
        relayViewModel.nudgeGauge(gaugeState.getChannel(), true);
        return ky0.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ky0 CalibrationScreen$lambda$23$lambda$22(RelayViewModel relayViewModel, bt0 bt0Var, xe xeVar, ih ihVar, int i) {
        xeVar.getClass();
        int i2 = 1;
        int i3 = 0;
        qh qhVar = (qh) ihVar;
        if (qhVar.N(i & 1, (i & 17) != 16)) {
            lt0 lt0Var = ey0.a;
            pv0.b("Support tools", null, 0L, 0L, ut.i, 0L, null, 0L, 0, false, 0, 0, ((dy0) qhVar.j(lt0Var)).g, qhVar, 196614, 65502);
            pv0.b("Stasis freezes drift for a short window. Auto Tune pulls the worst channel closer to center.", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((dy0) qhVar.j(lt0Var)).j, qhVar, 6, 65534);
            String str = "Use Stasis (" + CalibrationScreen$lambda$0(bt0Var).getStasisCharges() + ")";
            boolean h = qhVar.h(relayViewModel);
            Object K = qhVar.K();
            y7 y7Var = hh.a;
            if (h || K == y7Var) {
                K = new vb(relayViewModel, i3);
                qhVar.e0(K);
            }
            RelayComponentsKt.RelaySecondaryButton(str, (bu) K, null, CalibrationScreen$lambda$0(bt0Var).getStasisCharges() > 0, qhVar, 0, 4);
            String str2 = "Use Auto Tune (" + CalibrationScreen$lambda$0(bt0Var).getAutoTuneCharges() + ")";
            boolean h2 = qhVar.h(relayViewModel);
            Object K2 = qhVar.K();
            if (h2 || K2 == y7Var) {
                K2 = new vb(relayViewModel, i2);
                qhVar.e0(K2);
            }
            RelayComponentsKt.RelaySecondaryButton(str2, (bu) K2, null, CalibrationScreen$lambda$0(bt0Var).getAutoTuneCharges() > 0, qhVar, 0, 4);
            boolean h3 = qhVar.h(relayViewModel);
            Object K3 = qhVar.K();
            if (h3 || K3 == y7Var) {
                K3 = new vb(relayViewModel, 2);
                qhVar.e0(K3);
            }
            RelayComponentsKt.RelayPrimaryButton("Lock Target", (bu) K3, null, false, qhVar, 6, 12);
        } else {
            qhVar.Q();
        }
        return ky0.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ky0 CalibrationScreen$lambda$23$lambda$22$lambda$17$lambda$16(RelayViewModel relayViewModel) {
        relayViewModel.useStasis();
        return ky0.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ky0 CalibrationScreen$lambda$23$lambda$22$lambda$19$lambda$18(RelayViewModel relayViewModel) {
        relayViewModel.useAutoTune();
        return ky0.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ky0 CalibrationScreen$lambda$23$lambda$22$lambda$21$lambda$20(RelayViewModel relayViewModel) {
        relayViewModel.lockTarget();
        return ky0.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ky0 CalibrationScreen$lambda$23$lambda$5(bt0 bt0Var, xe xeVar, ih ihVar, int i) {
        xeVar.getClass();
        qh qhVar = (qh) ihVar;
        if (qhVar.N(i & 1, (i & 17) != 16)) {
            FillElement fillElement = c.a;
            gm0 a = em0.a(nz.d, b2.o, qhVar, 54);
            int A = px0.A(qhVar);
            gf0 l = qhVar.l();
            u50 D = nk.D(qhVar, fillElement);
            eh.b.getClass();
            gi giVar = dh.b;
            qhVar.X();
            if (qhVar.Q) {
                qhVar.k(giVar);
            } else {
                qhVar.h0();
            }
            ld0.r(qhVar, dh.e, a);
            ld0.r(qhVar, dh.d, l);
            h6 h6Var = dh.f;
            if (qhVar.Q || !nz.l(qhVar.K(), Integer.valueOf(A))) {
                y6.y(A, qhVar, A, h6Var);
            }
            ld0.r(qhVar, dh.c, D);
            lt0 lt0Var = ey0.a;
            dw0 dw0Var = ((dy0) qhVar.j(lt0Var)).g;
            ut utVar = ut.i;
            pv0.b("Current target", null, 0L, 0L, utVar, 0L, null, 0L, 0, false, 0, 0, dw0Var, qhVar, 196614, 65502);
            px0.b(od0.r(CalibrationScreen$lambda$0(bt0Var).getTarget().getArtRes(), qhVar), CalibrationScreen$lambda$0(bt0Var).getTarget().getTitle(), c.c(r50.a, 82.0f), null, null, 0.0f, qhVar, 384, 120);
            qhVar.q(true);
            pv0.b(CalibrationScreen$lambda$0(bt0Var).getTarget().getTitle(), null, 0L, 0L, utVar, 0L, null, 0L, 0, false, 0, 0, ((dy0) qhVar.j(lt0Var)).f, qhVar, 196608, 65502);
            pv0.b(CalibrationScreen$lambda$0(bt0Var).getTarget().getSubtitle(), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((dy0) qhVar.j(lt0Var)).j, qhVar, 0, 65534);
            RelayComponentsKt.MissionProgress(CalibrationScreen$lambda$0(bt0Var).getCompletedLocks(), CalibrationScreen$lambda$0(bt0Var).getMission().getRequiredLocks(), qhVar, 0);
            pv0.b(CalibrationScreen$lambda$0(bt0Var).getCompletedLocks() + "/" + CalibrationScreen$lambda$0(bt0Var).getMission().getRequiredLocks() + " locks secured", null, ge.b(((ke) qhVar.j(le.a)).q, 0.76f), 0L, null, 0L, null, 0L, 0, false, 0, 0, ((dy0) qhVar.j(lt0Var)).k, qhVar, 0, 65530);
        } else {
            qhVar.Q();
        }
        return ky0.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ky0 CalibrationScreen$lambda$23$lambda$7(bt0 bt0Var, xe xeVar, ih ihVar, int i) {
        xeVar.getClass();
        qh qhVar = (qh) ihVar;
        if (qhVar.N(i & 1, (i & 17) != 16)) {
            FillElement fillElement = c.a;
            gm0 a = em0.a(new z7(10.0f), b2.n, qhVar, 6);
            int A = px0.A(qhVar);
            gf0 l = qhVar.l();
            u50 D = nk.D(qhVar, fillElement);
            eh.b.getClass();
            gi giVar = dh.b;
            qhVar.X();
            if (qhVar.Q) {
                qhVar.k(giVar);
            } else {
                qhVar.h0();
            }
            ld0.r(qhVar, dh.e, a);
            ld0.r(qhVar, dh.d, l);
            h6 h6Var = dh.f;
            if (qhVar.Q || !nz.l(qhVar.K(), Integer.valueOf(A))) {
                y6.y(A, qhVar, A, h6Var);
            }
            ld0.r(qhVar, dh.c, D);
            RelayComponentsKt.m9StatPillXOJAsU("Time", String.valueOf((int) Math.ceil(CalibrationScreen$lambda$0(bt0Var).getTimeLeft())), ColorKt.getCyanBeam(), qhVar, 390);
            RelayComponentsKt.m9StatPillXOJAsU("Score", String.valueOf(CalibrationScreen$lambda$0(bt0Var).getScore()), ColorKt.getSolarAmber(), qhVar, 390);
            RelayComponentsKt.m9StatPillXOJAsU("Lives", String.valueOf(CalibrationScreen$lambda$0(bt0Var).getLives()), ColorKt.getAlertCoral(), qhVar, 390);
            RelayComponentsKt.m9StatPillXOJAsU("Energy", ((int) (CalibrationScreen$lambda$0(bt0Var).getEnergy() * 100.0f)) + "%", ColorKt.getMintTrace(), qhVar, 390);
            qhVar.q(true);
            pv0.b(CalibrationScreen$lambda$0(bt0Var).getMessage(), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((dy0) qhVar.j(ey0.a)).j, qhVar, 0, 65534);
        } else {
            qhVar.Q();
        }
        return ky0.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ky0 CalibrationScreen$lambda$24(RelayViewModel relayViewModel, bu buVar, bu buVar2, int i, ih ihVar, int i2) {
        CalibrationScreen(relayViewModel, buVar, buVar2, ihVar, yc0.v(i | 1));
        return ky0.a;
    }
}
