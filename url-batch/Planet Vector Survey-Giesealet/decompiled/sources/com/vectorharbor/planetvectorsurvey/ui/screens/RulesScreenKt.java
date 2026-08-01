package com.vectorharbor.planetvectorsurvey.ui.screens;

import com.vectorharbor.planetvectorsurvey.ui.components.RelayComponentsKt;
import com.vectorharbor.planetvectorsurvey.ui.theme.ColorKt;
import defpackage.a50;
import defpackage.bu;
import defpackage.dy0;
import defpackage.ey0;
import defpackage.gc;
import defpackage.ha;
import defpackage.ih;
import defpackage.ky0;
import defpackage.lt0;
import defpackage.m30;
import defpackage.pv0;
import defpackage.qh;
import defpackage.ri0;
import defpackage.tj0;
import defpackage.ut;
import defpackage.xe;
import defpackage.yc0;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class RulesScreenKt {
    /* renamed from: RulePanel-XO-JAsU, reason: not valid java name */
    private static final void m10RulePanelXOJAsU(String str, String str2, long j, ih ihVar, int i) {
        int i2;
        qh qhVar = (qh) ihVar;
        qhVar.W(-1863150782);
        if ((i & 6) == 0) {
            i2 = (qhVar.f(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= qhVar.f(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= qhVar.e(j) ? 256 : 128;
        }
        int i3 = 1;
        if (qhVar.N(i2 & 1, (i2 & 147) != 146)) {
            RelayComponentsKt.m8RelayPanel3IgeMak(null, j, a50.E(-906412588, new ha(i3, str, str2), qhVar), qhVar, ((i2 >> 3) & 112) | 384, 1);
        } else {
            qhVar.Q();
        }
        ri0 s = qhVar.s();
        if (s != null) {
            s.d = new tj0(str, str2, j, i, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ky0 RulePanel_XO_JAsU$lambda$2(String str, String str2, xe xeVar, ih ihVar, int i) {
        xeVar.getClass();
        qh qhVar = (qh) ihVar;
        if (qhVar.N(i & 1, (i & 17) != 16)) {
            lt0 lt0Var = ey0.a;
            pv0.b(str, null, 0L, 0L, ut.i, 0L, null, 0L, 0, false, 0, 0, ((dy0) qhVar.j(lt0Var)).g, qhVar, 196608, 65502);
            pv0.b(str2, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((dy0) qhVar.j(lt0Var)).j, qhVar, 0, 65534);
        } else {
            qhVar.Q();
        }
        return ky0.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ky0 RulePanel_XO_JAsU$lambda$3(String str, String str2, long j, int i, ih ihVar, int i2) {
        m10RulePanelXOJAsU(str, str2, j, ihVar, yc0.v(i | 1));
        return ky0.a;
    }

    public static final void RulesScreen(bu buVar, ih ihVar, int i) {
        int i2;
        buVar.getClass();
        qh qhVar = (qh) ihVar;
        qhVar.W(1231566578);
        if ((i & 6) == 0) {
            i2 = (qhVar.h(buVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = 1;
        if (qhVar.N(i2 & 1, (i2 & 3) != 2)) {
            RelayComponentsKt.RelayScrollLayout(a50.E(779157759, new gc(3, buVar), qhVar), qhVar, 6);
        } else {
            qhVar.Q();
        }
        ri0 s = qhVar.s();
        if (s != null) {
            s.d = new m30(buVar, i, i3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ky0 RulesScreen$lambda$0(bu buVar, xe xeVar, ih ihVar, int i) {
        xeVar.getClass();
        qh qhVar = (qh) ihVar;
        if (qhVar.N(i & 1, (i & 17) != 16)) {
            RelayComponentsKt.ScreenTopBar("Field Rules", "The relay is won by stability, pacing, and clean lock timing.", buVar, qhVar, 54, 0);
            m10RulePanelXOJAsU("1. Read the target band", "Each target card shows the ideal position for Focus, Relay, and Flux. All three gauges must sit inside their glowing band before you lock.", ColorKt.getCyanBeam(), qhVar, 438);
            m10RulePanelXOJAsU("2. Spend energy with intent", "Manual shifts are precise but expensive. The array recharges over time, so frantic tapping leaves you powerless when the drift accelerates.", ColorKt.getSolarAmber(), qhVar, 438);
            m10RulePanelXOJAsU("3. Save support tools for danger", "Stasis freezes the gauges briefly, while Auto Tune rescues the worst channel. Waste either one too early and the last targets become much sharper.", ColorKt.getMintTrace(), qhVar, 438);
            m10RulePanelXOJAsU("4. Protect the combo chain", "Clean locks raise score and difficulty together. A missed lock breaks the chain, costs a life, and throws every channel off center.", ColorKt.getMagentaGlow(), qhVar, 438);
        } else {
            qhVar.Q();
        }
        return ky0.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ky0 RulesScreen$lambda$1(bu buVar, int i, ih ihVar, int i2) {
        RulesScreen(buVar, ihVar, yc0.v(i | 1));
        return ky0.a;
    }
}
