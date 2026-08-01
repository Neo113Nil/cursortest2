package com.vectorharbor.planetvectorsurvey.navigation;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.vectorharbor.planetvectorsurvey.navigation.PlanetVectorSurveyAppKt;
import com.vectorharbor.planetvectorsurvey.ui.screens.ArrayDeckScreenKt;
import com.vectorharbor.planetvectorsurvey.ui.screens.BriefingScreenKt;
import com.vectorharbor.planetvectorsurvey.ui.screens.CalibrationScreenKt;
import com.vectorharbor.planetvectorsurvey.ui.screens.DebriefScreenKt;
import com.vectorharbor.planetvectorsurvey.ui.screens.LoadingScreenKt;
import com.vectorharbor.planetvectorsurvey.ui.screens.RulesScreenKt;
import com.vectorharbor.planetvectorsurvey.ui.screens.SectorsScreenKt;
import com.vectorharbor.planetvectorsurvey.viewmodel.RelayViewModel;
import defpackage.b;
import defpackage.bu;
import defpackage.cg0;
import defpackage.d90;
import defpackage.eg;
import defpackage.eg0;
import defpackage.eh0;
import defpackage.f2;
import defpackage.f8;
import defpackage.fg0;
import defpackage.fw;
import defpackage.g8;
import defpackage.gk;
import defpackage.h6;
import defpackage.hh;
import defpackage.hj0;
import defpackage.ih;
import defpackage.j3;
import defpackage.k6;
import defpackage.ky0;
import defpackage.mu;
import defpackage.nk;
import defpackage.od0;
import defpackage.p90;
import defpackage.px0;
import defpackage.q80;
import defpackage.qh;
import defpackage.qu;
import defpackage.r01;
import defpackage.r30;
import defpackage.ri0;
import defpackage.s80;
import defpackage.sj;
import defpackage.su;
import defpackage.x40;
import defpackage.y7;
import defpackage.y70;
import defpackage.yc0;
import defpackage.ze0;
import java.util.Arrays;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class PlanetVectorSurveyAppKt {
    public static final void PlanetVectorSurveyApp(ih ihVar, final int i) {
        qh qhVar = (qh) ihVar;
        qhVar.W(232454869);
        if (qhVar.N(i & 1, i != 0)) {
            Context context = (Context) qhVar.j(AndroidCompositionLocals_androidKt.b);
            Object[] copyOf = Arrays.copyOf(new p90[0], 0);
            j3 j3Var = new j3(12, h6.o, new f2(16, context));
            boolean h = qhVar.h(context);
            Object K = qhVar.K();
            Object obj = hh.a;
            if (h || K == obj) {
                K = new b(11, context);
                qhVar.e0(K);
            }
            s80 s80Var = (s80) ze0.q(copyOf, j3Var, (bu) K, qhVar, 0, 4);
            r01 a = r30.a(qhVar);
            if (a == null) {
                g8.s("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            RelayViewModel relayViewModel = (RelayViewModel) od0.w(hj0.a(RelayViewModel.class), a, a instanceof fw ? ((fw) a).getDefaultViewModelCreationExtras() : gk.b, qhVar);
            String value = Route.Loading.getValue();
            boolean h2 = qhVar.h(s80Var) | qhVar.h(relayViewModel);
            Object K2 = qhVar.K();
            if (h2 || K2 == obj) {
                K2 = new fg0(s80Var, relayViewModel);
                qhVar.e0(K2);
            }
            x40.h(s80Var, value, null, null, null, null, null, null, (mu) K2, qhVar, 48);
            qhVar = qhVar;
        } else {
            qhVar.Q();
        }
        ri0 s = qhVar.s();
        if (s != null) {
            s.d = new qu() { // from class: gg0
                @Override // defpackage.qu
                public final Object invoke(Object obj2, Object obj3) {
                    ky0 PlanetVectorSurveyApp$lambda$39;
                    int intValue = ((Integer) obj3).intValue();
                    PlanetVectorSurveyApp$lambda$39 = PlanetVectorSurveyAppKt.PlanetVectorSurveyApp$lambda$39(i, (ih) obj2, intValue);
                    return PlanetVectorSurveyApp$lambda$39;
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ky0 PlanetVectorSurveyApp$lambda$38$lambda$37(final s80 s80Var, final RelayViewModel relayViewModel, q80 q80Var) {
        q80Var.getClass();
        final int i = 1;
        px0.s(q80Var, Route.Loading.getValue(), new eg(-1636024366, true, new eg0(i, s80Var)));
        final int i2 = 0;
        px0.s(q80Var, Route.Briefing.getValue(), new eg(-532641285, true, new su() { // from class: dg0
            @Override // defpackage.su
            public final Object f(Object obj, Object obj2, Object obj3, Object obj4) {
                ky0 PlanetVectorSurveyApp$lambda$38$lambda$37$lambda$11;
                ky0 PlanetVectorSurveyApp$lambda$38$lambda$37$lambda$16;
                ky0 PlanetVectorSurveyApp$lambda$38$lambda$37$lambda$19;
                ky0 PlanetVectorSurveyApp$lambda$38$lambda$37$lambda$29;
                ky0 PlanetVectorSurveyApp$lambda$38$lambda$37$lambda$36;
                switch (i2) {
                    case 0:
                        int intValue = ((Integer) obj4).intValue();
                        PlanetVectorSurveyApp$lambda$38$lambda$37$lambda$11 = PlanetVectorSurveyAppKt.PlanetVectorSurveyApp$lambda$38$lambda$37$lambda$11(relayViewModel, s80Var, (k6) obj, (y70) obj2, (ih) obj3, intValue);
                        return PlanetVectorSurveyApp$lambda$38$lambda$37$lambda$11;
                    case 1:
                        int intValue2 = ((Integer) obj4).intValue();
                        PlanetVectorSurveyApp$lambda$38$lambda$37$lambda$16 = PlanetVectorSurveyAppKt.PlanetVectorSurveyApp$lambda$38$lambda$37$lambda$16(relayViewModel, s80Var, (k6) obj, (y70) obj2, (ih) obj3, intValue2);
                        return PlanetVectorSurveyApp$lambda$38$lambda$37$lambda$16;
                    case 2:
                        int intValue3 = ((Integer) obj4).intValue();
                        PlanetVectorSurveyApp$lambda$38$lambda$37$lambda$19 = PlanetVectorSurveyAppKt.PlanetVectorSurveyApp$lambda$38$lambda$37$lambda$19(relayViewModel, s80Var, (k6) obj, (y70) obj2, (ih) obj3, intValue3);
                        return PlanetVectorSurveyApp$lambda$38$lambda$37$lambda$19;
                    case 3:
                        int intValue4 = ((Integer) obj4).intValue();
                        PlanetVectorSurveyApp$lambda$38$lambda$37$lambda$29 = PlanetVectorSurveyAppKt.PlanetVectorSurveyApp$lambda$38$lambda$37$lambda$29(relayViewModel, s80Var, (k6) obj, (y70) obj2, (ih) obj3, intValue4);
                        return PlanetVectorSurveyApp$lambda$38$lambda$37$lambda$29;
                    default:
                        int intValue5 = ((Integer) obj4).intValue();
                        PlanetVectorSurveyApp$lambda$38$lambda$37$lambda$36 = PlanetVectorSurveyAppKt.PlanetVectorSurveyApp$lambda$38$lambda$37$lambda$36(relayViewModel, s80Var, (k6) obj, (y70) obj2, (ih) obj3, intValue5);
                        return PlanetVectorSurveyApp$lambda$38$lambda$37$lambda$36;
                }
            }
        }));
        px0.s(q80Var, Route.Sectors.getValue(), new eg(-1216871590, true, new su() { // from class: dg0
            @Override // defpackage.su
            public final Object f(Object obj, Object obj2, Object obj3, Object obj4) {
                ky0 PlanetVectorSurveyApp$lambda$38$lambda$37$lambda$11;
                ky0 PlanetVectorSurveyApp$lambda$38$lambda$37$lambda$16;
                ky0 PlanetVectorSurveyApp$lambda$38$lambda$37$lambda$19;
                ky0 PlanetVectorSurveyApp$lambda$38$lambda$37$lambda$29;
                ky0 PlanetVectorSurveyApp$lambda$38$lambda$37$lambda$36;
                switch (i) {
                    case 0:
                        int intValue = ((Integer) obj4).intValue();
                        PlanetVectorSurveyApp$lambda$38$lambda$37$lambda$11 = PlanetVectorSurveyAppKt.PlanetVectorSurveyApp$lambda$38$lambda$37$lambda$11(relayViewModel, s80Var, (k6) obj, (y70) obj2, (ih) obj3, intValue);
                        return PlanetVectorSurveyApp$lambda$38$lambda$37$lambda$11;
                    case 1:
                        int intValue2 = ((Integer) obj4).intValue();
                        PlanetVectorSurveyApp$lambda$38$lambda$37$lambda$16 = PlanetVectorSurveyAppKt.PlanetVectorSurveyApp$lambda$38$lambda$37$lambda$16(relayViewModel, s80Var, (k6) obj, (y70) obj2, (ih) obj3, intValue2);
                        return PlanetVectorSurveyApp$lambda$38$lambda$37$lambda$16;
                    case 2:
                        int intValue3 = ((Integer) obj4).intValue();
                        PlanetVectorSurveyApp$lambda$38$lambda$37$lambda$19 = PlanetVectorSurveyAppKt.PlanetVectorSurveyApp$lambda$38$lambda$37$lambda$19(relayViewModel, s80Var, (k6) obj, (y70) obj2, (ih) obj3, intValue3);
                        return PlanetVectorSurveyApp$lambda$38$lambda$37$lambda$19;
                    case 3:
                        int intValue4 = ((Integer) obj4).intValue();
                        PlanetVectorSurveyApp$lambda$38$lambda$37$lambda$29 = PlanetVectorSurveyAppKt.PlanetVectorSurveyApp$lambda$38$lambda$37$lambda$29(relayViewModel, s80Var, (k6) obj, (y70) obj2, (ih) obj3, intValue4);
                        return PlanetVectorSurveyApp$lambda$38$lambda$37$lambda$29;
                    default:
                        int intValue5 = ((Integer) obj4).intValue();
                        PlanetVectorSurveyApp$lambda$38$lambda$37$lambda$36 = PlanetVectorSurveyAppKt.PlanetVectorSurveyApp$lambda$38$lambda$37$lambda$36(relayViewModel, s80Var, (k6) obj, (y70) obj2, (ih) obj3, intValue5);
                        return PlanetVectorSurveyApp$lambda$38$lambda$37$lambda$36;
                }
            }
        }));
        final int i3 = 2;
        px0.s(q80Var, Route.ArrayDeck.getValue(), new eg(-1901101895, true, new su() { // from class: dg0
            @Override // defpackage.su
            public final Object f(Object obj, Object obj2, Object obj3, Object obj4) {
                ky0 PlanetVectorSurveyApp$lambda$38$lambda$37$lambda$11;
                ky0 PlanetVectorSurveyApp$lambda$38$lambda$37$lambda$16;
                ky0 PlanetVectorSurveyApp$lambda$38$lambda$37$lambda$19;
                ky0 PlanetVectorSurveyApp$lambda$38$lambda$37$lambda$29;
                ky0 PlanetVectorSurveyApp$lambda$38$lambda$37$lambda$36;
                switch (i3) {
                    case 0:
                        int intValue = ((Integer) obj4).intValue();
                        PlanetVectorSurveyApp$lambda$38$lambda$37$lambda$11 = PlanetVectorSurveyAppKt.PlanetVectorSurveyApp$lambda$38$lambda$37$lambda$11(relayViewModel, s80Var, (k6) obj, (y70) obj2, (ih) obj3, intValue);
                        return PlanetVectorSurveyApp$lambda$38$lambda$37$lambda$11;
                    case 1:
                        int intValue2 = ((Integer) obj4).intValue();
                        PlanetVectorSurveyApp$lambda$38$lambda$37$lambda$16 = PlanetVectorSurveyAppKt.PlanetVectorSurveyApp$lambda$38$lambda$37$lambda$16(relayViewModel, s80Var, (k6) obj, (y70) obj2, (ih) obj3, intValue2);
                        return PlanetVectorSurveyApp$lambda$38$lambda$37$lambda$16;
                    case 2:
                        int intValue3 = ((Integer) obj4).intValue();
                        PlanetVectorSurveyApp$lambda$38$lambda$37$lambda$19 = PlanetVectorSurveyAppKt.PlanetVectorSurveyApp$lambda$38$lambda$37$lambda$19(relayViewModel, s80Var, (k6) obj, (y70) obj2, (ih) obj3, intValue3);
                        return PlanetVectorSurveyApp$lambda$38$lambda$37$lambda$19;
                    case 3:
                        int intValue4 = ((Integer) obj4).intValue();
                        PlanetVectorSurveyApp$lambda$38$lambda$37$lambda$29 = PlanetVectorSurveyAppKt.PlanetVectorSurveyApp$lambda$38$lambda$37$lambda$29(relayViewModel, s80Var, (k6) obj, (y70) obj2, (ih) obj3, intValue4);
                        return PlanetVectorSurveyApp$lambda$38$lambda$37$lambda$29;
                    default:
                        int intValue5 = ((Integer) obj4).intValue();
                        PlanetVectorSurveyApp$lambda$38$lambda$37$lambda$36 = PlanetVectorSurveyAppKt.PlanetVectorSurveyApp$lambda$38$lambda$37$lambda$36(relayViewModel, s80Var, (k6) obj, (y70) obj2, (ih) obj3, intValue5);
                        return PlanetVectorSurveyApp$lambda$38$lambda$37$lambda$36;
                }
            }
        }));
        px0.s(q80Var, Route.Rules.getValue(), new eg(1709635096, true, new eg0(i2, s80Var)));
        final int i4 = 3;
        px0.s(q80Var, Route.Calibration.getValue(), new eg(1025404791, true, new su() { // from class: dg0
            @Override // defpackage.su
            public final Object f(Object obj, Object obj2, Object obj3, Object obj4) {
                ky0 PlanetVectorSurveyApp$lambda$38$lambda$37$lambda$11;
                ky0 PlanetVectorSurveyApp$lambda$38$lambda$37$lambda$16;
                ky0 PlanetVectorSurveyApp$lambda$38$lambda$37$lambda$19;
                ky0 PlanetVectorSurveyApp$lambda$38$lambda$37$lambda$29;
                ky0 PlanetVectorSurveyApp$lambda$38$lambda$37$lambda$36;
                switch (i4) {
                    case 0:
                        int intValue = ((Integer) obj4).intValue();
                        PlanetVectorSurveyApp$lambda$38$lambda$37$lambda$11 = PlanetVectorSurveyAppKt.PlanetVectorSurveyApp$lambda$38$lambda$37$lambda$11(relayViewModel, s80Var, (k6) obj, (y70) obj2, (ih) obj3, intValue);
                        return PlanetVectorSurveyApp$lambda$38$lambda$37$lambda$11;
                    case 1:
                        int intValue2 = ((Integer) obj4).intValue();
                        PlanetVectorSurveyApp$lambda$38$lambda$37$lambda$16 = PlanetVectorSurveyAppKt.PlanetVectorSurveyApp$lambda$38$lambda$37$lambda$16(relayViewModel, s80Var, (k6) obj, (y70) obj2, (ih) obj3, intValue2);
                        return PlanetVectorSurveyApp$lambda$38$lambda$37$lambda$16;
                    case 2:
                        int intValue3 = ((Integer) obj4).intValue();
                        PlanetVectorSurveyApp$lambda$38$lambda$37$lambda$19 = PlanetVectorSurveyAppKt.PlanetVectorSurveyApp$lambda$38$lambda$37$lambda$19(relayViewModel, s80Var, (k6) obj, (y70) obj2, (ih) obj3, intValue3);
                        return PlanetVectorSurveyApp$lambda$38$lambda$37$lambda$19;
                    case 3:
                        int intValue4 = ((Integer) obj4).intValue();
                        PlanetVectorSurveyApp$lambda$38$lambda$37$lambda$29 = PlanetVectorSurveyAppKt.PlanetVectorSurveyApp$lambda$38$lambda$37$lambda$29(relayViewModel, s80Var, (k6) obj, (y70) obj2, (ih) obj3, intValue4);
                        return PlanetVectorSurveyApp$lambda$38$lambda$37$lambda$29;
                    default:
                        int intValue5 = ((Integer) obj4).intValue();
                        PlanetVectorSurveyApp$lambda$38$lambda$37$lambda$36 = PlanetVectorSurveyAppKt.PlanetVectorSurveyApp$lambda$38$lambda$37$lambda$36(relayViewModel, s80Var, (k6) obj, (y70) obj2, (ih) obj3, intValue5);
                        return PlanetVectorSurveyApp$lambda$38$lambda$37$lambda$36;
                }
            }
        }));
        final int i5 = 4;
        px0.s(q80Var, Route.Debrief.getValue(), new eg(341174486, true, new su() { // from class: dg0
            @Override // defpackage.su
            public final Object f(Object obj, Object obj2, Object obj3, Object obj4) {
                ky0 PlanetVectorSurveyApp$lambda$38$lambda$37$lambda$11;
                ky0 PlanetVectorSurveyApp$lambda$38$lambda$37$lambda$16;
                ky0 PlanetVectorSurveyApp$lambda$38$lambda$37$lambda$19;
                ky0 PlanetVectorSurveyApp$lambda$38$lambda$37$lambda$29;
                ky0 PlanetVectorSurveyApp$lambda$38$lambda$37$lambda$36;
                switch (i5) {
                    case 0:
                        int intValue = ((Integer) obj4).intValue();
                        PlanetVectorSurveyApp$lambda$38$lambda$37$lambda$11 = PlanetVectorSurveyAppKt.PlanetVectorSurveyApp$lambda$38$lambda$37$lambda$11(relayViewModel, s80Var, (k6) obj, (y70) obj2, (ih) obj3, intValue);
                        return PlanetVectorSurveyApp$lambda$38$lambda$37$lambda$11;
                    case 1:
                        int intValue2 = ((Integer) obj4).intValue();
                        PlanetVectorSurveyApp$lambda$38$lambda$37$lambda$16 = PlanetVectorSurveyAppKt.PlanetVectorSurveyApp$lambda$38$lambda$37$lambda$16(relayViewModel, s80Var, (k6) obj, (y70) obj2, (ih) obj3, intValue2);
                        return PlanetVectorSurveyApp$lambda$38$lambda$37$lambda$16;
                    case 2:
                        int intValue3 = ((Integer) obj4).intValue();
                        PlanetVectorSurveyApp$lambda$38$lambda$37$lambda$19 = PlanetVectorSurveyAppKt.PlanetVectorSurveyApp$lambda$38$lambda$37$lambda$19(relayViewModel, s80Var, (k6) obj, (y70) obj2, (ih) obj3, intValue3);
                        return PlanetVectorSurveyApp$lambda$38$lambda$37$lambda$19;
                    case 3:
                        int intValue4 = ((Integer) obj4).intValue();
                        PlanetVectorSurveyApp$lambda$38$lambda$37$lambda$29 = PlanetVectorSurveyAppKt.PlanetVectorSurveyApp$lambda$38$lambda$37$lambda$29(relayViewModel, s80Var, (k6) obj, (y70) obj2, (ih) obj3, intValue4);
                        return PlanetVectorSurveyApp$lambda$38$lambda$37$lambda$29;
                    default:
                        int intValue5 = ((Integer) obj4).intValue();
                        PlanetVectorSurveyApp$lambda$38$lambda$37$lambda$36 = PlanetVectorSurveyAppKt.PlanetVectorSurveyApp$lambda$38$lambda$37$lambda$36(relayViewModel, s80Var, (k6) obj, (y70) obj2, (ih) obj3, intValue5);
                        return PlanetVectorSurveyApp$lambda$38$lambda$37$lambda$36;
                }
            }
        }));
        return ky0.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ky0 PlanetVectorSurveyApp$lambda$38$lambda$37$lambda$11(RelayViewModel relayViewModel, s80 s80Var, k6 k6Var, y70 y70Var, ih ihVar, int i) {
        k6Var.getClass();
        y70Var.getClass();
        qh qhVar = (qh) ihVar;
        boolean h = qhVar.h(s80Var);
        Object K = qhVar.K();
        y7 y7Var = hh.a;
        if (h || K == y7Var) {
            K = new cg0(s80Var, 1);
            qhVar.e0(K);
        }
        bu buVar = (bu) K;
        boolean h2 = qhVar.h(s80Var);
        Object K2 = qhVar.K();
        if (h2 || K2 == y7Var) {
            K2 = new cg0(s80Var, 2);
            qhVar.e0(K2);
        }
        bu buVar2 = (bu) K2;
        boolean h3 = qhVar.h(s80Var);
        Object K3 = qhVar.K();
        if (h3 || K3 == y7Var) {
            K3 = new cg0(s80Var, 4);
            qhVar.e0(K3);
        }
        BriefingScreenKt.BriefingScreen(relayViewModel, buVar, buVar2, (bu) K3, qhVar, 0);
        return ky0.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ky0 PlanetVectorSurveyApp$lambda$38$lambda$37$lambda$11$lambda$10$lambda$9(s80 s80Var) {
        s80.k(s80Var, Route.Rules.getValue(), null, 6);
        return ky0.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ky0 PlanetVectorSurveyApp$lambda$38$lambda$37$lambda$11$lambda$6$lambda$5(s80 s80Var) {
        s80.k(s80Var, Route.Sectors.getValue(), null, 6);
        return ky0.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ky0 PlanetVectorSurveyApp$lambda$38$lambda$37$lambda$11$lambda$8$lambda$7(s80 s80Var) {
        s80.k(s80Var, Route.ArrayDeck.getValue(), null, 6);
        return ky0.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ky0 PlanetVectorSurveyApp$lambda$38$lambda$37$lambda$16(RelayViewModel relayViewModel, s80 s80Var, k6 k6Var, y70 y70Var, ih ihVar, int i) {
        k6Var.getClass();
        y70Var.getClass();
        qh qhVar = (qh) ihVar;
        boolean h = qhVar.h(s80Var);
        Object K = qhVar.K();
        y7 y7Var = hh.a;
        if (h || K == y7Var) {
            K = new cg0(s80Var, 8);
            qhVar.e0(K);
        }
        bu buVar = (bu) K;
        boolean h2 = qhVar.h(relayViewModel) | qhVar.h(s80Var);
        Object K2 = qhVar.K();
        if (h2 || K2 == y7Var) {
            K2 = new fg0(relayViewModel, s80Var);
            qhVar.e0(K2);
        }
        SectorsScreenKt.SectorsScreen(relayViewModel, buVar, (mu) K2, qhVar, 0);
        return ky0.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ky0 PlanetVectorSurveyApp$lambda$38$lambda$37$lambda$16$lambda$13$lambda$12(s80 s80Var) {
        s80Var.l();
        return ky0.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ky0 PlanetVectorSurveyApp$lambda$38$lambda$37$lambda$16$lambda$15$lambda$14(RelayViewModel relayViewModel, s80 s80Var, int i) {
        relayViewModel.prepareMission(i);
        s80.k(s80Var, Route.Calibration.getValue(), null, 6);
        return ky0.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ky0 PlanetVectorSurveyApp$lambda$38$lambda$37$lambda$19(RelayViewModel relayViewModel, s80 s80Var, k6 k6Var, y70 y70Var, ih ihVar, int i) {
        k6Var.getClass();
        y70Var.getClass();
        qh qhVar = (qh) ihVar;
        boolean h = qhVar.h(s80Var);
        Object K = qhVar.K();
        if (h || K == hh.a) {
            K = new cg0(s80Var, 9);
            qhVar.e0(K);
        }
        ArrayDeckScreenKt.ArrayDeckScreen(relayViewModel, (bu) K, qhVar, 0);
        return ky0.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ky0 PlanetVectorSurveyApp$lambda$38$lambda$37$lambda$19$lambda$18$lambda$17(s80 s80Var) {
        s80Var.l();
        return ky0.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ky0 PlanetVectorSurveyApp$lambda$38$lambda$37$lambda$22(s80 s80Var, k6 k6Var, y70 y70Var, ih ihVar, int i) {
        k6Var.getClass();
        y70Var.getClass();
        qh qhVar = (qh) ihVar;
        boolean h = qhVar.h(s80Var);
        Object K = qhVar.K();
        int i2 = 0;
        if (h || K == hh.a) {
            K = new cg0(s80Var, i2);
            qhVar.e0(K);
        }
        RulesScreenKt.RulesScreen((bu) K, qhVar, 0);
        return ky0.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ky0 PlanetVectorSurveyApp$lambda$38$lambda$37$lambda$22$lambda$21$lambda$20(s80 s80Var) {
        s80Var.l();
        return ky0.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ky0 PlanetVectorSurveyApp$lambda$38$lambda$37$lambda$29(RelayViewModel relayViewModel, s80 s80Var, k6 k6Var, y70 y70Var, ih ihVar, int i) {
        k6Var.getClass();
        y70Var.getClass();
        qh qhVar = (qh) ihVar;
        boolean h = qhVar.h(s80Var);
        Object K = qhVar.K();
        y7 y7Var = hh.a;
        if (h || K == y7Var) {
            K = new cg0(s80Var, 5);
            qhVar.e0(K);
        }
        bu buVar = (bu) K;
        boolean h2 = qhVar.h(s80Var);
        Object K2 = qhVar.K();
        if (h2 || K2 == y7Var) {
            K2 = new cg0(s80Var, 6);
            qhVar.e0(K2);
        }
        CalibrationScreenKt.CalibrationScreen(relayViewModel, buVar, (bu) K2, qhVar, 0);
        return ky0.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ky0 PlanetVectorSurveyApp$lambda$38$lambda$37$lambda$29$lambda$24$lambda$23(s80 s80Var) {
        s80Var.l();
        return ky0.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ky0 PlanetVectorSurveyApp$lambda$38$lambda$37$lambda$29$lambda$28$lambda$27(s80 s80Var) {
        String value = Route.Debrief.getValue();
        sj sjVar = new sj(4);
        s80Var.getClass();
        value.getClass();
        s80.k(s80Var, value, nk.G(sjVar), 4);
        return ky0.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ky0 PlanetVectorSurveyApp$lambda$38$lambda$37$lambda$29$lambda$28$lambda$27$lambda$26(d90 d90Var) {
        d90Var.getClass();
        String value = Route.Calibration.getValue();
        value.getClass();
        d90Var.a(value);
        d90Var.b = -1;
        d90Var.d = false;
        eh0 eh0Var = new eh0();
        PlanetVectorSurveyApp$lambda$38$lambda$37$lambda$29$lambda$28$lambda$27$lambda$26$lambda$25(eh0Var);
        d90Var.d = eh0Var.a;
        d90Var.e = false;
        return ky0.a;
    }

    private static final ky0 PlanetVectorSurveyApp$lambda$38$lambda$37$lambda$29$lambda$28$lambda$27$lambda$26$lambda$25(eh0 eh0Var) {
        eh0Var.getClass();
        eh0Var.a = true;
        return ky0.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ky0 PlanetVectorSurveyApp$lambda$38$lambda$37$lambda$36(RelayViewModel relayViewModel, s80 s80Var, k6 k6Var, y70 y70Var, ih ihVar, int i) {
        k6Var.getClass();
        y70Var.getClass();
        qh qhVar = (qh) ihVar;
        boolean h = qhVar.h(s80Var);
        Object K = qhVar.K();
        y7 y7Var = hh.a;
        if (h || K == y7Var) {
            K = new cg0(s80Var, 3);
            qhVar.e0(K);
        }
        bu buVar = (bu) K;
        boolean h2 = qhVar.h(relayViewModel) | qhVar.h(s80Var);
        Object K2 = qhVar.K();
        if (h2 || K2 == y7Var) {
            K2 = new f8(2, relayViewModel, s80Var);
            qhVar.e0(K2);
        }
        DebriefScreenKt.DebriefScreen(relayViewModel, buVar, (bu) K2, qhVar, 0);
        return ky0.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ky0 PlanetVectorSurveyApp$lambda$38$lambda$37$lambda$36$lambda$33$lambda$32(s80 s80Var) {
        String value = Route.Briefing.getValue();
        sj sjVar = new sj(3);
        s80Var.getClass();
        value.getClass();
        s80.k(s80Var, value, nk.G(sjVar), 4);
        return ky0.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ky0 PlanetVectorSurveyApp$lambda$38$lambda$37$lambda$36$lambda$33$lambda$32$lambda$31(d90 d90Var) {
        d90Var.getClass();
        String value = Route.Briefing.getValue();
        value.getClass();
        d90Var.a(value);
        d90Var.b = -1;
        d90Var.d = false;
        eh0 eh0Var = new eh0();
        PlanetVectorSurveyApp$lambda$38$lambda$37$lambda$36$lambda$33$lambda$32$lambda$31$lambda$30(eh0Var);
        d90Var.d = eh0Var.a;
        d90Var.e = false;
        return ky0.a;
    }

    private static final ky0 PlanetVectorSurveyApp$lambda$38$lambda$37$lambda$36$lambda$33$lambda$32$lambda$31$lambda$30(eh0 eh0Var) {
        eh0Var.getClass();
        eh0Var.a = true;
        return ky0.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ky0 PlanetVectorSurveyApp$lambda$38$lambda$37$lambda$36$lambda$35$lambda$34(RelayViewModel relayViewModel, s80 s80Var) {
        relayViewModel.resetCurrentMission();
        s80.k(s80Var, Route.Calibration.getValue(), null, 6);
        return ky0.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ky0 PlanetVectorSurveyApp$lambda$38$lambda$37$lambda$4(s80 s80Var, k6 k6Var, y70 y70Var, ih ihVar, int i) {
        k6Var.getClass();
        y70Var.getClass();
        qh qhVar = (qh) ihVar;
        boolean h = qhVar.h(s80Var);
        Object K = qhVar.K();
        if (h || K == hh.a) {
            K = new cg0(s80Var, 7);
            qhVar.e0(K);
        }
        LoadingScreenKt.LoadingScreen((bu) K, qhVar, 0);
        return ky0.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ky0 PlanetVectorSurveyApp$lambda$38$lambda$37$lambda$4$lambda$3$lambda$2(s80 s80Var) {
        String value = Route.Briefing.getValue();
        sj sjVar = new sj(5);
        s80Var.getClass();
        value.getClass();
        s80.k(s80Var, value, nk.G(sjVar), 4);
        return ky0.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ky0 PlanetVectorSurveyApp$lambda$38$lambda$37$lambda$4$lambda$3$lambda$2$lambda$1(d90 d90Var) {
        d90Var.getClass();
        String value = Route.Loading.getValue();
        value.getClass();
        d90Var.a(value);
        d90Var.b = -1;
        d90Var.d = false;
        eh0 eh0Var = new eh0();
        PlanetVectorSurveyApp$lambda$38$lambda$37$lambda$4$lambda$3$lambda$2$lambda$1$lambda$0(eh0Var);
        d90Var.d = eh0Var.a;
        d90Var.e = false;
        return ky0.a;
    }

    private static final ky0 PlanetVectorSurveyApp$lambda$38$lambda$37$lambda$4$lambda$3$lambda$2$lambda$1$lambda$0(eh0 eh0Var) {
        eh0Var.getClass();
        eh0Var.a = true;
        return ky0.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ky0 PlanetVectorSurveyApp$lambda$39(int i, ih ihVar, int i2) {
        PlanetVectorSurveyApp(ihVar, yc0.v(i | 1));
        return ky0.a;
    }
}
