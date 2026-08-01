package com.vectorharbor.planetvectorsurvey.ui.screens;

import android.content.res.Resources;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.b;
import androidx.compose.foundation.layout.c;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.vectorharbor.planetvectorsurvey.R;
import com.vectorharbor.planetvectorsurvey.ui.components.RelayComponentsKt;
import com.vectorharbor.planetvectorsurvey.ui.theme.ColorKt;
import defpackage.a50;
import defpackage.ar;
import defpackage.aw;
import defpackage.b2;
import defpackage.bt0;
import defpackage.bu;
import defpackage.ca;
import defpackage.d31;
import defpackage.dh;
import defpackage.dw0;
import defpackage.dy0;
import defpackage.eh;
import defpackage.ey0;
import defpackage.fr0;
import defpackage.g50;
import defpackage.g8;
import defpackage.ga;
import defpackage.ge;
import defpackage.gf0;
import defpackage.gi;
import defpackage.h6;
import defpackage.hh;
import defpackage.ia;
import defpackage.ih;
import defpackage.ky0;
import defpackage.ld0;
import defpackage.m30;
import defpackage.mi0;
import defpackage.mu;
import defpackage.mz;
import defpackage.nk;
import defpackage.nz;
import defpackage.o9;
import defpackage.oo;
import defpackage.pv0;
import defpackage.px0;
import defpackage.qh;
import defpackage.qu;
import defpackage.r50;
import defpackage.ri0;
import defpackage.so;
import defpackage.u50;
import defpackage.ut;
import defpackage.wx;
import defpackage.x40;
import defpackage.y6;
import defpackage.y7;
import defpackage.yc0;
import defpackage.ze0;
import defpackage.zx;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class LoadingScreenKt {
    public static final void LoadingScreen(bu buVar, ih ihVar, int i) {
        int i2;
        buVar.getClass();
        qh qhVar = (qh) ihVar;
        qhVar.W(2063442386);
        int i3 = 2;
        if ((i & 6) == 0) {
            i2 = (qhVar.h(buVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i4 = 0;
        if (qhVar.N(i2 & 1, (i2 & 3) != 2)) {
            boolean z = (i2 & 14) == 4;
            Object K = qhVar.K();
            y7 y7Var = hh.a;
            if (z || K == y7Var) {
                K = new LoadingScreenKt$LoadingScreen$1$1(buVar, null);
                qhVar.e0(K);
            }
            mz.k(qhVar, (qu) K, ky0.a);
            String string = ((Resources) qhVar.j(AndroidCompositionLocals_androidKt.c)).getString(R.string.app_name);
            Object K2 = qhVar.K();
            if (K2 == y7Var) {
                K2 = new zx();
                qhVar.e0(K2);
            }
            zx zxVar = (zx) K2;
            zxVar.a(qhVar, 0);
            g8 g8Var = so.b;
            RelayComponentsKt.RelayScene(a50.E(913816433, new ia(x40.p(zxVar, 6.2831855f, new wx(nk.Q(1900, 2, g8Var), 1), "orbit", qhVar, 28728), x40.p(zxVar, 1.0f, new wx(nk.Q(1350, 2, g8Var), 2), "sweep", qhVar, 29112), string, i3), qhVar), qhVar, 6);
        } else {
            qhVar.Q();
        }
        ri0 s = qhVar.s();
        if (s != null) {
            s.d = new m30(buVar, i, i4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ky0 LoadingScreen$lambda$5(bt0 bt0Var, bt0 bt0Var2, String str, ga gaVar, ih ihVar, int i) {
        gaVar.getClass();
        int i2 = 1;
        qh qhVar = (qh) ihVar;
        if (qhVar.N(i & 1, (i & 17) != 16)) {
            FillElement fillElement = c.b;
            o9 o9Var = b2.i;
            g50 e = ca.e(o9Var, false);
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
            h6 h6Var = dh.e;
            ld0.r(qhVar, h6Var, e);
            h6 h6Var2 = dh.d;
            ld0.r(qhVar, h6Var2, l);
            h6 h6Var3 = dh.f;
            if (qhVar.Q || !nz.l(qhVar.K(), Integer.valueOf(A))) {
                y6.y(A, qhVar, A, h6Var3);
            }
            h6 h6Var4 = dh.c;
            ld0.r(qhVar, h6Var4, D);
            u50 f = c.f();
            g50 e2 = ca.e(o9Var, false);
            int A2 = px0.A(qhVar);
            gf0 l2 = qhVar.l();
            u50 D2 = nk.D(qhVar, f);
            qhVar.X();
            if (qhVar.Q) {
                qhVar.k(giVar);
            } else {
                qhVar.h0();
            }
            ld0.r(qhVar, h6Var, e2);
            ld0.r(qhVar, h6Var2, l2);
            if (qhVar.Q || !nz.l(qhVar.K(), Integer.valueOf(A2))) {
                y6.y(A2, qhVar, A2, h6Var3);
            }
            ld0.r(qhVar, h6Var4, D2);
            u50 e3 = b.e(c.b(c.d(), 220.0f), 7);
            boolean f2 = qhVar.f(bt0Var) | qhVar.f(bt0Var2);
            Object K = qhVar.K();
            if (f2 || K == hh.a) {
                K = new aw(i2, bt0Var, bt0Var2);
                qhVar.e0(K);
            }
            nz.a(e3, (mu) K, qhVar, 6);
            pv0.b(str, b.e(r50.a, 13), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, dw0.a(((dy0) qhVar.j(ey0.a)).e, ze0.m(30), ut.i, null, 0L, 0L, null, 16777209), qhVar, 48, 65532);
            qhVar.q(true);
            qhVar.q(true);
        } else {
            qhVar.Q();
        }
        return ky0.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ky0 LoadingScreen$lambda$5$lambda$4$lambda$3$lambda$2$lambda$1(bt0 bt0Var, bt0 bt0Var2, oo ooVar) {
        ooVar.getClass();
        long floatToRawIntBits = (Float.floatToRawIntBits(Float.intBitsToFloat((int) (ooVar.c() >> 32)) / 2.0f) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (ooVar.c() & 4294967295L)) / 2.0f) & 4294967295L);
        float d = fr0.d(ooVar.c()) * 0.3f;
        ooVar.w(new mi0(px0.I(new ge(d31.c(1442840575)), new ge(ge.f)), 9205357640488583168L, Float.POSITIVE_INFINITY), fr0.d(ooVar.c()) * 0.42f, floatToRawIntBits, ar.o);
        y6.m(ooVar, ge.b(ColorKt.getCyanBeam(), 0.22f), d, floatToRawIntBits, 120);
        y6.m(ooVar, ge.b(ColorKt.getSolarAmber(), 0.25f), 0.68f * d, floatToRawIntBits, 120);
        int i = (int) (floatToRawIntBits >> 32);
        int i2 = (int) (floatToRawIntBits & 4294967295L);
        long floatToRawIntBits2 = (Float.floatToRawIntBits((((float) Math.cos(((Number) bt0Var.getValue()).floatValue())) * d) + Float.intBitsToFloat(i)) << 32) | (Float.floatToRawIntBits((((float) Math.sin(((Number) bt0Var.getValue()).floatValue())) * d) + Float.intBitsToFloat(i2)) & 4294967295L);
        long floatToRawIntBits3 = (Float.floatToRawIntBits(((((float) Math.cos(((Number) bt0Var.getValue()).floatValue() + 2.1f)) * d) * 0.72f) + Float.intBitsToFloat(i)) << 32) | (Float.floatToRawIntBits((((float) Math.sin(((Number) bt0Var.getValue()).floatValue() + 2.1f)) * d * 0.72f) + Float.intBitsToFloat(i2)) & 4294967295L);
        y6.m(ooVar, ColorKt.getMagentaGlow(), 12.0f, floatToRawIntBits2, 120);
        y6.m(ooVar, ColorKt.getCyanBeam(), 10.0f, floatToRawIntBits3, 120);
        y6.m(ooVar, ColorKt.getSolarAmber(), 9.0f, (Float.floatToRawIntBits((((Float.intBitsToFloat((int) (ooVar.c() >> 32)) * ((Number) bt0Var2.getValue()).floatValue()) * 0.66f) + Float.intBitsToFloat(i)) - (Float.intBitsToFloat((int) (ooVar.c() >> 32)) * 0.33f)) << 32) | (Float.floatToRawIntBits((Float.intBitsToFloat((int) (ooVar.c() & 4294967295L)) * 0.22f) + Float.intBitsToFloat(i2)) & 4294967295L), 120);
        return ky0.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ky0 LoadingScreen$lambda$6(bu buVar, int i, ih ihVar, int i2) {
        LoadingScreen(buVar, ihVar, yc0.v(i | 1));
        return ky0.a;
    }
}
