package com.vectorharbor.planetvectorsurvey.ui.theme;

import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import defpackage.he;
import defpackage.ih;
import defpackage.ke;
import defpackage.ky0;
import defpackage.le;
import defpackage.lt0;
import defpackage.m30;
import defpackage.qh;
import defpackage.qu;
import defpackage.ri0;
import defpackage.yc0;
import defpackage.z40;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class ThemeKt {
    private static final ke DarkColors;
    private static final ke LightColors;

    static {
        long cyanBeam = ColorKt.getCyanBeam();
        long solarAmber = ColorKt.getSolarAmber();
        long magentaGlow = ColorKt.getMagentaGlow();
        long nebulaInk = ColorKt.getNebulaInk();
        long deepPanel = ColorKt.getDeepPanel();
        long nebulaInk2 = ColorKt.getNebulaInk();
        long nebulaInk3 = ColorKt.getNebulaInk();
        long softWhite = ColorKt.getSoftWhite();
        long softWhite2 = ColorKt.getSoftWhite();
        long softWhite3 = ColorKt.getSoftWhite();
        long alertCoral = ColorKt.getAlertCoral();
        lt0 lt0Var = le.a;
        DarkColors = new ke(cyanBeam, nebulaInk2, he.m, he.g, he.c, solarAmber, nebulaInk3, he.o, he.h, magentaGlow, softWhite, he.x, he.j, nebulaInk, softWhite2, deepPanel, softWhite3, he.w, he.i, cyanBeam, he.d, he.b, alertCoral, he.e, he.a, he.f, he.k, he.l, he.n, he.p, he.v, he.q, he.r, he.s, he.t, he.u);
        LightColors = le.d(ColorKt.getCyanBeam(), ColorKt.getNebulaInk(), ColorKt.getSolarAmber(), ColorKt.getNebulaInk(), ColorKt.getMagentaGlow(), ColorKt.getSoftWhite(), ColorKt.getNebulaInk(), ColorKt.getSoftWhite(), ColorKt.getDeepPanelAlt(), ColorKt.getSoftWhite(), ColorKt.getAlertCoral(), -4318820);
    }

    public static final void PlanetVectorSurveyTheme(qu quVar, ih ihVar, int i) {
        int i2;
        qu quVar2;
        quVar.getClass();
        qh qhVar = (qh) ihVar;
        qhVar.W(-1840314318);
        int i3 = 2;
        if ((i & 6) == 0) {
            i2 = (qhVar.h(quVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (qhVar.N(i2 & 1, (i2 & 3) != 2)) {
            quVar2 = quVar;
            z40.a((((Configuration) qhVar.j(AndroidCompositionLocals_androidKt.a)).uiMode & 48) == 32 ? DarkColors : LightColors, null, null, quVar2, qhVar, (i2 << 9) & 7168);
        } else {
            quVar2 = quVar;
            qhVar.Q();
        }
        ri0 s = qhVar.s();
        if (s != null) {
            s.d = new m30(quVar2, i, i3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ky0 PlanetVectorSurveyTheme$lambda$0(qu quVar, int i, ih ihVar, int i2) {
        PlanetVectorSurveyTheme(quVar, ihVar, yc0.v(i | 1));
        return ky0.a;
    }
}
