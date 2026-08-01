package com.vectorharbor.planetvectorsurvey.ui.screens;

import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.c;
import com.vectorharbor.planetvectorsurvey.model.CalibrationState;
import com.vectorharbor.planetvectorsurvey.model.RunResult;
import com.vectorharbor.planetvectorsurvey.ui.components.RelayComponentsKt;
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
import defpackage.gc;
import defpackage.gf0;
import defpackage.gi;
import defpackage.gm0;
import defpackage.h6;
import defpackage.ih;
import defpackage.ky0;
import defpackage.ld0;
import defpackage.lk;
import defpackage.lt0;
import defpackage.nk;
import defpackage.nz;
import defpackage.pv0;
import defpackage.px0;
import defpackage.qh;
import defpackage.ri0;
import defpackage.u50;
import defpackage.ud0;
import defpackage.ut;
import defpackage.xe;
import defpackage.y6;
import defpackage.yb;
import defpackage.yc0;
import defpackage.z7;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class DebriefScreenKt {
    public static final void DebriefScreen(RelayViewModel relayViewModel, bu buVar, bu buVar2, ih ihVar, int i) {
        int i2;
        relayViewModel.getClass();
        buVar.getClass();
        buVar2.getClass();
        qh qhVar = (qh) ihVar;
        qhVar.W(-406789593);
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
        if (qhVar.N(i2 & 1, (i2 & 147) != 146)) {
            f70 g = ud0.g(relayViewModel.getCalibrationState(), qhVar);
            RelayComponentsKt.RelayScrollLayout(a50.E(-941027526, new lk(DebriefScreen$lambda$0(g).getResult(), buVar2, buVar, g, 1), qhVar), qhVar, 6);
        } else {
            qhVar.Q();
        }
        ri0 s = qhVar.s();
        if (s != null) {
            s.d = new yb(relayViewModel, buVar, buVar2, i, 1);
        }
    }

    private static final CalibrationState DebriefScreen$lambda$0(bt0 bt0Var) {
        return (CalibrationState) bt0Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ky0 DebriefScreen$lambda$4(RunResult runResult, bu buVar, bu buVar2, bt0 bt0Var, xe xeVar, ih ihVar, int i) {
        xeVar.getClass();
        int i2 = 1;
        qh qhVar = (qh) ihVar;
        if (qhVar.N(i & 1, (i & 17) != 16)) {
            RelayComponentsKt.ScreenTopBar("Debrief", (runResult == null || !runResult.getCleared()) ? "Signal lost before full completion." : "Survey locked successfully.", null, qhVar, 6, 4);
            RelayComponentsKt.m8RelayPanel3IgeMak(null, ColorKt.getSolarAmber(), a50.E(-142791476, new gc(i2, runResult), qhVar), qhVar, 432, 1);
            RelayComponentsKt.m8RelayPanel3IgeMak(null, 0L, a50.E(-359258621, new lk(runResult, buVar, buVar2, bt0Var, 0), qhVar), qhVar, 384, 3);
        } else {
            qhVar.Q();
        }
        return ky0.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ky0 DebriefScreen$lambda$4$lambda$1(RunResult runResult, xe xeVar, ih ihVar, int i) {
        String str;
        xeVar.getClass();
        qh qhVar = (qh) ihVar;
        if (qhVar.N(i & 1, (i & 17) != 16)) {
            if (runResult == null || (str = runResult.getRank()) == null) {
                str = "-";
            }
            RelayComponentsKt.CenterMessage("Rank ".concat(str), (runResult == null || !runResult.getCleared()) ? "The mission broke apart, but the telemetry is still useful for the next launch." : "The observatory held the route and logged every planned lock.", qhVar, 0);
        } else {
            qhVar.Q();
        }
        return ky0.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ky0 DebriefScreen$lambda$4$lambda$3(RunResult runResult, bu buVar, bu buVar2, bt0 bt0Var, xe xeVar, ih ihVar, int i) {
        String num;
        String num2;
        String num3;
        xeVar.getClass();
        qh qhVar = (qh) ihVar;
        if (qhVar.N(i & 1, (i & 17) != 16)) {
            lt0 lt0Var = ey0.a;
            pv0.b("Run metrics", null, 0L, 0L, ut.i, 0L, null, 0L, 0, false, 0, 0, ((dy0) qhVar.j(lt0Var)).g, qhVar, 196614, 65502);
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
            RelayComponentsKt.m9StatPillXOJAsU("Score", (runResult == null || (num3 = Integer.valueOf(runResult.getScore()).toString()) == null) ? "0" : num3, ColorKt.getSolarAmber(), qhVar, 390);
            RelayComponentsKt.m9StatPillXOJAsU("Locks", (runResult == null || (num2 = Integer.valueOf(runResult.getCompletedLocks()).toString()) == null) ? "0" : num2, ColorKt.getCyanBeam(), qhVar, 390);
            RelayComponentsKt.m9StatPillXOJAsU("Combo", (runResult == null || (num = Integer.valueOf(runResult.getBestCombo()).toString()) == null) ? "0" : num, ColorKt.getMintTrace(), qhVar, 390);
            qhVar.q(true);
            int remainingLives = runResult != null ? runResult.getRemainingLives() : 0;
            pv0.b("Lives left " + remainingLives + ". Mission target " + DebriefScreen$lambda$0(bt0Var).getMission().getTargetScore() + ".", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((dy0) qhVar.j(lt0Var)).j, qhVar, 0, 65534);
            RelayComponentsKt.RelayPrimaryButton("Retry Mission", buVar, null, false, qhVar, 6, 12);
            RelayComponentsKt.RelaySecondaryButton("Return to Briefing", buVar2, null, false, qhVar, 6, 12);
        } else {
            qhVar.Q();
        }
        return ky0.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ky0 DebriefScreen$lambda$5(RelayViewModel relayViewModel, bu buVar, bu buVar2, int i, ih ihVar, int i2) {
        DebriefScreen(relayViewModel, buVar, buVar2, ihVar, yc0.v(i | 1));
        return ky0.a;
    }
}
