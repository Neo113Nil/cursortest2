package com.vectorharbor.planetvectorsurvey.ui.screens;

import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.c;
import com.vectorharbor.planetvectorsurvey.model.ArrayModule;
import com.vectorharbor.planetvectorsurvey.model.SectorMission;
import com.vectorharbor.planetvectorsurvey.ui.components.RelayComponentsKt;
import com.vectorharbor.planetvectorsurvey.viewmodel.RelayViewModel;
import defpackage.a50;
import defpackage.b2;
import defpackage.bt0;
import defpackage.bu;
import defpackage.c8;
import defpackage.cg;
import defpackage.dh;
import defpackage.dw0;
import defpackage.dy0;
import defpackage.e8;
import defpackage.eh;
import defpackage.em0;
import defpackage.ey0;
import defpackage.f8;
import defpackage.ge;
import defpackage.gf0;
import defpackage.gi;
import defpackage.gm0;
import defpackage.h6;
import defpackage.ha;
import defpackage.hh;
import defpackage.ih;
import defpackage.ke;
import defpackage.ky0;
import defpackage.ld0;
import defpackage.le;
import defpackage.lt0;
import defpackage.mu;
import defpackage.nk;
import defpackage.nz;
import defpackage.od0;
import defpackage.pv0;
import defpackage.px0;
import defpackage.qh;
import defpackage.r50;
import defpackage.ri0;
import defpackage.u50;
import defpackage.ud0;
import defpackage.ut;
import defpackage.xe;
import defpackage.y6;
import defpackage.yc0;
import java.util.Iterator;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class SectorsScreenKt {
    public static final void SectorsScreen(RelayViewModel relayViewModel, bu buVar, mu muVar, ih ihVar, int i) {
        int i2;
        relayViewModel.getClass();
        buVar.getClass();
        muVar.getClass();
        qh qhVar = (qh) ihVar;
        qhVar.W(1098912256);
        if ((i & 6) == 0) {
            i2 = (qhVar.h(relayViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= qhVar.h(buVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= qhVar.h(muVar) ? 256 : 128;
        }
        if (qhVar.N(i2 & 1, (i2 & 147) != 146)) {
            RelayComponentsKt.RelayScrollLayout(a50.E(564674323, new c8(buVar, relayViewModel, ud0.g(relayViewModel.getSelectedModule(), qhVar), muVar, 1), qhVar), qhVar, 6);
        } else {
            qhVar.Q();
        }
        ri0 s = qhVar.s();
        if (s != null) {
            s.d = new cg(relayViewModel, buVar, muVar, i, 3);
        }
    }

    private static final ArrayModule SectorsScreen$lambda$0(bt0 bt0Var) {
        return (ArrayModule) bt0Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ky0 SectorsScreen$lambda$7(bu buVar, RelayViewModel relayViewModel, bt0 bt0Var, mu muVar, xe xeVar, ih ihVar, int i) {
        xeVar.getClass();
        qh qhVar = (qh) ihVar;
        if (qhVar.N(i & 1, (i & 17) != 16)) {
            RelayComponentsKt.ScreenTopBar("Sector Board", "Pick the cluster and take your active module into the relay run.", buVar, qhVar, 54, 0);
            RelayComponentsKt.m8RelayPanel3IgeMak(null, 0L, a50.E(1362910373, new e8(bt0Var, 3), qhVar), qhVar, 384, 3);
            qh qhVar2 = qhVar;
            Iterator<T> it = relayViewModel.getMissions().iterator();
            while (it.hasNext()) {
                qh qhVar3 = qhVar2;
                RelayComponentsKt.m8RelayPanel3IgeMak(null, 0L, a50.E(-1602104172, new ha(2, (SectorMission) it.next(), muVar), qhVar2), qhVar3, 384, 3);
                qhVar2 = qhVar3;
            }
        } else {
            qhVar.Q();
        }
        return ky0.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ky0 SectorsScreen$lambda$7$lambda$1(bt0 bt0Var, xe xeVar, ih ihVar, int i) {
        xeVar.getClass();
        qh qhVar = (qh) ihVar;
        if (qhVar.N(i & 1, (i & 17) != 16)) {
            lt0 lt0Var = ey0.a;
            dw0 dw0Var = ((dy0) qhVar.j(lt0Var)).h;
            ut utVar = ut.i;
            pv0.b("Loaded module", null, 0L, 0L, utVar, 0L, null, 0L, 0, false, 0, 0, dw0Var, qhVar, 196614, 65502);
            pv0.b(SectorsScreen$lambda$0(bt0Var).getTitle(), null, 0L, 0L, utVar, 0L, null, 0L, 0, false, 0, 0, ((dy0) qhVar.j(lt0Var)).f, qhVar, 196608, 65502);
            pv0.b(SectorsScreen$lambda$0(bt0Var).getSummary(), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((dy0) qhVar.j(lt0Var)).j, qhVar, 0, 65534);
        } else {
            qhVar.Q();
        }
        return ky0.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ky0 SectorsScreen$lambda$7$lambda$6$lambda$5(SectorMission sectorMission, mu muVar, xe xeVar, ih ihVar, int i) {
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
            String title = sectorMission.getTitle();
            lt0 lt0Var = ey0.a;
            pv0.b(title, null, 0L, 0L, ut.i, 0L, null, 0L, 0, false, 0, 0, ((dy0) qhVar.j(lt0Var)).g, qhVar, 196608, 65502);
            px0.b(od0.r(sectorMission.getArtRes(), qhVar), sectorMission.getTitle(), c.c(r50.a, 82.0f), null, null, 0.0f, qhVar, 384, 120);
            qhVar.q(true);
            String cluster = sectorMission.getCluster();
            dw0 dw0Var = ((dy0) qhVar.j(lt0Var)).i;
            lt0 lt0Var2 = le.a;
            pv0.b(cluster, null, ((ke) qhVar.j(lt0Var2)).f, 0L, null, 0L, null, 0L, 0, false, 0, 0, dw0Var, qhVar, 0, 65530);
            pv0.b(sectorMission.getGoal(), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((dy0) qhVar.j(lt0Var)).j, qhVar, 0, 65534);
            pv0.b("Need " + sectorMission.getRequiredLocks() + " clean locks in " + sectorMission.getTimeLimit() + "s. Target score " + sectorMission.getTargetScore() + ".", null, ge.b(((ke) qhVar.j(lt0Var2)).q, 0.78f), 0L, null, 0L, null, 0L, 0, false, 0, 0, ((dy0) qhVar.j(lt0Var)).k, qhVar, 0, 65530);
            String title2 = sectorMission.getTitle();
            StringBuilder sb = new StringBuilder("Launch ");
            sb.append(title2);
            String sb2 = sb.toString();
            boolean f = qhVar.f(muVar) | qhVar.f(sectorMission);
            Object K = qhVar.K();
            if (f || K == hh.a) {
                K = new f8(5, muVar, sectorMission);
                qhVar.e0(K);
            }
            RelayComponentsKt.RelayPrimaryButton(sb2, (bu) K, null, false, qhVar, 0, 12);
        } else {
            qhVar.Q();
        }
        return ky0.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ky0 SectorsScreen$lambda$7$lambda$6$lambda$5$lambda$4$lambda$3(mu muVar, SectorMission sectorMission) {
        muVar.c(Integer.valueOf(sectorMission.getId()));
        return ky0.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ky0 SectorsScreen$lambda$8(RelayViewModel relayViewModel, bu buVar, mu muVar, int i, ih ihVar, int i2) {
        SectorsScreen(relayViewModel, buVar, muVar, ihVar, yc0.v(i | 1));
        return ky0.a;
    }
}
