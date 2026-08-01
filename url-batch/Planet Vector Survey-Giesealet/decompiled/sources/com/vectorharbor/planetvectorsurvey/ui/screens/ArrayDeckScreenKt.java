package com.vectorharbor.planetvectorsurvey.ui.screens;

import com.vectorharbor.planetvectorsurvey.model.ArrayModule;
import com.vectorharbor.planetvectorsurvey.model.RelayStats;
import com.vectorharbor.planetvectorsurvey.ui.components.RelayComponentsKt;
import com.vectorharbor.planetvectorsurvey.viewmodel.RelayViewModel;
import defpackage.a50;
import defpackage.bt0;
import defpackage.bu;
import defpackage.c8;
import defpackage.d8;
import defpackage.dy0;
import defpackage.e8;
import defpackage.ey0;
import defpackage.f8;
import defpackage.hh;
import defpackage.ih;
import defpackage.ky0;
import defpackage.lt0;
import defpackage.pv0;
import defpackage.qh;
import defpackage.ri0;
import defpackage.ud0;
import defpackage.ut;
import defpackage.xe;
import defpackage.yc0;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class ArrayDeckScreenKt {
    public static final void ArrayDeckScreen(RelayViewModel relayViewModel, bu buVar, ih ihVar, int i) {
        int i2;
        RelayViewModel relayViewModel2;
        bu buVar2;
        relayViewModel.getClass();
        buVar.getClass();
        qh qhVar = (qh) ihVar;
        qhVar.W(-1697658935);
        if ((i & 6) == 0) {
            i2 = (qhVar.h(relayViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= qhVar.h(buVar) ? 32 : 16;
        }
        int i3 = 0;
        if (qhVar.N(i2 & 1, (i2 & 19) != 18)) {
            relayViewModel2 = relayViewModel;
            buVar2 = buVar;
            RelayComponentsKt.RelayScrollLayout(a50.E(-1818755300, new c8(buVar2, relayViewModel2, ud0.g(relayViewModel.getStats(), qhVar), ud0.g(relayViewModel.getSelectedModule(), qhVar), 0), qhVar), qhVar, 6);
        } else {
            relayViewModel2 = relayViewModel;
            buVar2 = buVar;
            qhVar.Q();
        }
        ri0 s = qhVar.s();
        if (s != null) {
            s.d = new d8(i, i3, relayViewModel2, buVar2);
        }
    }

    private static final ArrayModule ArrayDeckScreen$lambda$0(bt0 bt0Var) {
        return (ArrayModule) bt0Var.getValue();
    }

    private static final RelayStats ArrayDeckScreen$lambda$1(bt0 bt0Var) {
        return (RelayStats) bt0Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ky0 ArrayDeckScreen$lambda$6(bu buVar, RelayViewModel relayViewModel, bt0 bt0Var, bt0 bt0Var2, xe xeVar, ih ihVar, int i) {
        xeVar.getClass();
        int i2 = 0;
        qh qhVar = (qh) ihVar;
        if (qhVar.N(i & 1, (i & 17) != 16)) {
            RelayComponentsKt.ScreenTopBar("Array Deck", "Swap support hardware before the next scan. Active module changes the starting toolkit.", buVar, qhVar, 54, 0);
            RelayComponentsKt.m8RelayPanel3IgeMak(null, 0L, a50.E(-1783746002, new e8(bt0Var, i2), qhVar), qhVar, 384, 3);
            for (ArrayModule arrayModule : relayViewModel.getModules()) {
                boolean z = arrayModule.getId() == ArrayDeckScreen$lambda$0(bt0Var2).getId();
                boolean h = qhVar.h(relayViewModel) | qhVar.f(arrayModule);
                Object K = qhVar.K();
                if (h || K == hh.a) {
                    K = new f8(i2, relayViewModel, arrayModule);
                    qhVar.e0(K);
                }
                RelayComponentsKt.ModuleCard(arrayModule, z, (bu) K, qhVar, 0);
            }
        } else {
            qhVar.Q();
        }
        return ky0.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ky0 ArrayDeckScreen$lambda$6$lambda$2(bt0 bt0Var, xe xeVar, ih ihVar, int i) {
        xeVar.getClass();
        qh qhVar = (qh) ihVar;
        if (qhVar.N(i & 1, (i & 17) != 16)) {
            lt0 lt0Var = ey0.a;
            pv0.b("Field record", null, 0L, 0L, ut.i, 0L, null, 0L, 0, false, 0, 0, ((dy0) qhVar.j(lt0Var)).g, qhVar, 196614, 65502);
            pv0.b("Cleared missions " + ArrayDeckScreen$lambda$1(bt0Var).getMissionsCleared() + ", best score " + ArrayDeckScreen$lambda$1(bt0Var).getBestScore() + ", best combo " + ArrayDeckScreen$lambda$1(bt0Var).getBestCombo() + ".", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((dy0) qhVar.j(lt0Var)).j, qhVar, 0, 65534);
        } else {
            qhVar.Q();
        }
        return ky0.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ky0 ArrayDeckScreen$lambda$6$lambda$5$lambda$4$lambda$3(RelayViewModel relayViewModel, ArrayModule arrayModule) {
        relayViewModel.selectModule(arrayModule.getId());
        return ky0.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ky0 ArrayDeckScreen$lambda$7(RelayViewModel relayViewModel, bu buVar, int i, ih ihVar, int i2) {
        ArrayDeckScreen(relayViewModel, buVar, ihVar, yc0.v(i | 1));
        return ky0.a;
    }
}
