package com.vectorharbor.planetvectorsurvey.ui.screens;

import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.c;
import com.vectorharbor.planetvectorsurvey.R;
import com.vectorharbor.planetvectorsurvey.model.ArrayModule;
import com.vectorharbor.planetvectorsurvey.model.RelayStats;
import com.vectorharbor.planetvectorsurvey.ui.components.RelayComponentsKt;
import com.vectorharbor.planetvectorsurvey.ui.screens.BriefingScreenKt;
import com.vectorharbor.planetvectorsurvey.ui.theme.ColorKt;
import com.vectorharbor.planetvectorsurvey.viewmodel.RelayViewModel;
import defpackage.a50;
import defpackage.b2;
import defpackage.bt0;
import defpackage.bu;
import defpackage.dh;
import defpackage.dy0;
import defpackage.eh;
import defpackage.em0;
import defpackage.ey0;
import defpackage.f70;
import defpackage.ge;
import defpackage.gf0;
import defpackage.gi;
import defpackage.gm0;
import defpackage.h6;
import defpackage.ha;
import defpackage.ia;
import defpackage.ih;
import defpackage.ka;
import defpackage.ke;
import defpackage.ky0;
import defpackage.ld0;
import defpackage.le;
import defpackage.lt0;
import defpackage.nk;
import defpackage.nz;
import defpackage.od0;
import defpackage.pv0;
import defpackage.px0;
import defpackage.qh;
import defpackage.r50;
import defpackage.ri0;
import defpackage.ru;
import defpackage.u50;
import defpackage.ud0;
import defpackage.ut;
import defpackage.xe;
import defpackage.y6;
import defpackage.yc0;
import defpackage.z7;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class BriefingScreenKt {
    public static final void BriefingScreen(RelayViewModel relayViewModel, final bu buVar, final bu buVar2, final bu buVar3, ih ihVar, int i) {
        int i2;
        relayViewModel.getClass();
        buVar.getClass();
        buVar2.getClass();
        buVar3.getClass();
        qh qhVar = (qh) ihVar;
        qhVar.W(326962637);
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
        if ((i & 3072) == 0) {
            i2 |= qhVar.h(buVar3) ? 2048 : 1024;
        }
        if (qhVar.N(i2 & 1, (i2 & 1171) != 1170)) {
            final f70 g = ud0.g(relayViewModel.getStats(), qhVar);
            final f70 g2 = ud0.g(relayViewModel.getSelectedModule(), qhVar);
            RelayComponentsKt.RelayScrollLayout(a50.E(-1283246496, new ru() { // from class: ja
                @Override // defpackage.ru
                public final Object b(Object obj, Object obj2, Object obj3) {
                    ky0 BriefingScreen$lambda$6;
                    int intValue = ((Integer) obj3).intValue();
                    BriefingScreen$lambda$6 = BriefingScreenKt.BriefingScreen$lambda$6(g, g2, buVar, buVar2, buVar3, (xe) obj, (ih) obj2, intValue);
                    return BriefingScreen$lambda$6;
                }
            }, qhVar), qhVar, 6);
        } else {
            qhVar.Q();
        }
        ri0 s = qhVar.s();
        if (s != null) {
            s.d = new ka(relayViewModel, buVar, buVar2, buVar3, i, 0);
        }
    }

    private static final RelayStats BriefingScreen$lambda$0(bt0 bt0Var) {
        return (RelayStats) bt0Var.getValue();
    }

    private static final ArrayModule BriefingScreen$lambda$1(bt0 bt0Var) {
        return (ArrayModule) bt0Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ky0 BriefingScreen$lambda$6(bt0 bt0Var, bt0 bt0Var2, bu buVar, bu buVar2, bu buVar3, xe xeVar, ih ihVar, int i) {
        xeVar.getClass();
        int i2 = 0;
        qh qhVar = (qh) ihVar;
        if (qhVar.N(i & 1, (i & 17) != 16)) {
            RelayComponentsKt.ScreenTopBar("Planet Vector Survey", "Command the observatory array and hold each celestial lock under pressure.", null, qhVar, 54, 4);
            RelayComponentsKt.HeroArt(R.drawable.dome_observatory, c.b(r50.a, 240.0f), "Observatory", qhVar, 432, 0);
            RelayComponentsKt.CenterMessage("Night shift briefing", "This run is built around live calibration. Focus, relay, and flux drift at different speeds, so steady hands matter more than fast tapping.", qhVar, 54);
            RelayComponentsKt.m8RelayPanel3IgeMak(null, ColorKt.getSolarAmber(), a50.E(59607282, new ha(i2, bt0Var, bt0Var2), qhVar), qhVar, 432, 1);
            RelayComponentsKt.m8RelayPanel3IgeMak(null, ColorKt.getCyanBeam(), a50.E(-1038129239, new ia(buVar, buVar2, buVar3, i2), qhVar), qhVar, 432, 1);
        } else {
            qhVar.Q();
        }
        return ky0.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ky0 BriefingScreen$lambda$6$lambda$3(bt0 bt0Var, bt0 bt0Var2, xe xeVar, ih ihVar, int i) {
        xeVar.getClass();
        qh qhVar = (qh) ihVar;
        if (qhVar.N(i & 1, (i & 17) != 16)) {
            lt0 lt0Var = ey0.a;
            pv0.b("Array status", null, 0L, 0L, ut.i, 0L, null, 0L, 0, false, 0, 0, ((dy0) qhVar.j(lt0Var)).g, qhVar, 196614, 65502);
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
            RelayComponentsKt.m9StatPillXOJAsU("Best score", String.valueOf(BriefingScreen$lambda$0(bt0Var).getBestScore()), ColorKt.getCyanBeam(), qhVar, 390);
            RelayComponentsKt.m9StatPillXOJAsU("Best combo", String.valueOf(BriefingScreen$lambda$0(bt0Var).getBestCombo()), ColorKt.getMagentaGlow(), qhVar, 390);
            RelayComponentsKt.m9StatPillXOJAsU("Locks", String.valueOf(BriefingScreen$lambda$0(bt0Var).getTotalLocks()), ColorKt.getSolarAmber(), qhVar, 390);
            qhVar.q(true);
            pv0.b("Active deck: " + BriefingScreen$lambda$1(bt0Var2).getTitle(), null, ge.b(((ke) qhVar.j(le.a)).q, 0.84f), 0L, null, 0L, null, 0L, 0, false, 0, 0, ((dy0) qhVar.j(lt0Var)).j, qhVar, 0, 65530);
        } else {
            qhVar.Q();
        }
        return ky0.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ky0 BriefingScreen$lambda$6$lambda$5(bu buVar, bu buVar2, bu buVar3, xe xeVar, ih ihVar, int i) {
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
            pv0.b("Signal kit", null, 0L, 0L, ut.i, 0L, null, 0L, 0, false, 0, 0, ((dy0) qhVar.j(lt0Var)).g, qhVar, 196614, 65502);
            px0.b(od0.r(R.drawable.relay_satellite, qhVar), null, c.c(r50.a, 72.0f), null, null, 0.0f, qhVar, 432, 120);
            qhVar.q(true);
            pv0.b("Choose a sector, lock every target in sequence, spend stasis carefully, and use auto tune only when a band is truly slipping away.", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((dy0) qhVar.j(lt0Var)).j, qhVar, 6, 65534);
            RelayComponentsKt.RelayPrimaryButton("Open Sector Board", buVar, null, false, qhVar, 6, 12);
            RelayComponentsKt.RelaySecondaryButton("Tune Array Deck", buVar2, null, false, qhVar, 6, 12);
            RelayComponentsKt.RelaySecondaryButton("Read Field Rules", buVar3, null, false, qhVar, 6, 12);
        } else {
            qhVar.Q();
        }
        return ky0.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ky0 BriefingScreen$lambda$7(RelayViewModel relayViewModel, bu buVar, bu buVar2, bu buVar3, int i, ih ihVar, int i2) {
        BriefingScreen(relayViewModel, buVar, buVar2, buVar3, ihVar, yc0.v(i | 1));
        return ky0.a;
    }
}
