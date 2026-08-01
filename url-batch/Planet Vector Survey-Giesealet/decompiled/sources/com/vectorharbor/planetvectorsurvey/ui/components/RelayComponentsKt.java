package com.vectorharbor.planetvectorsurvey.ui.components;

import androidx.compose.foundation.a;
import androidx.compose.foundation.d;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.b;
import androidx.compose.foundation.layout.c;
import com.vectorharbor.planetvectorsurvey.R;
import com.vectorharbor.planetvectorsurvey.model.ArrayModule;
import com.vectorharbor.planetvectorsurvey.model.GaugeState;
import com.vectorharbor.planetvectorsurvey.model.SignalChannel;
import com.vectorharbor.planetvectorsurvey.model.TargetProfile;
import com.vectorharbor.planetvectorsurvey.ui.components.RelayComponentsKt;
import com.vectorharbor.planetvectorsurvey.ui.theme.ColorKt;
import defpackage.a50;
import defpackage.aj;
import defpackage.am0;
import defpackage.au0;
import defpackage.b2;
import defpackage.bm0;
import defpackage.bu;
import defpackage.c30;
import defpackage.ca;
import defpackage.d31;
import defpackage.d8;
import defpackage.dh;
import defpackage.dv0;
import defpackage.dw0;
import defpackage.dy0;
import defpackage.eg;
import defpackage.eh;
import defpackage.ej;
import defpackage.em0;
import defpackage.ey0;
import defpackage.fr0;
import defpackage.g50;
import defpackage.g8;
import defpackage.ga;
import defpackage.ge;
import defpackage.gf0;
import defpackage.gh;
import defpackage.gi;
import defpackage.gm0;
import defpackage.h6;
import defpackage.hh;
import defpackage.hm0;
import defpackage.ho0;
import defpackage.ib;
import defpackage.id0;
import defpackage.ih;
import defpackage.j3;
import defpackage.jb;
import defpackage.ka;
import defpackage.ke;
import defpackage.kg;
import defpackage.ks0;
import defpackage.ky0;
import defpackage.ld0;
import defpackage.le;
import defpackage.lj0;
import defpackage.lt0;
import defpackage.mi0;
import defpackage.mj0;
import defpackage.mu;
import defpackage.nj0;
import defpackage.nk;
import defpackage.nz;
import defpackage.od0;
import defpackage.oo;
import defpackage.pc;
import defpackage.pv0;
import defpackage.px0;
import defpackage.qh;
import defpackage.qj0;
import defpackage.qu;
import defpackage.r50;
import defpackage.rg0;
import defpackage.ri0;
import defpackage.ru;
import defpackage.sh;
import defpackage.tj0;
import defpackage.u50;
import defpackage.ue;
import defpackage.ut;
import defpackage.ut0;
import defpackage.we;
import defpackage.xe;
import defpackage.y6;
import defpackage.yc0;
import defpackage.ye;
import defpackage.z7;
import defpackage.z9;
import defpackage.ze0;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class RelayComponentsKt {

    /* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SignalChannel.values().length];
            try {
                iArr[SignalChannel.Focus.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SignalChannel.Relay.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SignalChannel.Flux.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void CenterMessage(String str, String str2, ih ihVar, int i) {
        int i2;
        String str3;
        qh qhVar;
        str.getClass();
        str2.getClass();
        qh qhVar2 = (qh) ihVar;
        qhVar2.W(1508516496);
        if ((i & 6) == 0) {
            i2 = i | (qhVar2.f(str) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= qhVar2.f(str2) ? 32 : 16;
        }
        int i3 = i2;
        if (qhVar2.N(i3 & 1, (i3 & 19) != 18)) {
            FillElement fillElement = c.a;
            we a = ue.a(new z7(8.0f), b2.q, qhVar2, 54);
            int A = px0.A(qhVar2);
            gf0 l = qhVar2.l();
            u50 D = nk.D(qhVar2, fillElement);
            eh.b.getClass();
            gi giVar = dh.b;
            qhVar2.X();
            if (qhVar2.Q) {
                qhVar2.k(giVar);
            } else {
                qhVar2.h0();
            }
            ld0.r(qhVar2, dh.e, a);
            ld0.r(qhVar2, dh.d, l);
            h6 h6Var = dh.f;
            if (qhVar2.Q || !nz.l(qhVar2.K(), Integer.valueOf(A))) {
                y6.y(A, qhVar2, A, h6Var);
            }
            ld0.r(qhVar2, dh.c, D);
            lt0 lt0Var = ey0.a;
            pv0.b(str, null, 0L, 0L, ut.i, 0L, new dv0(3), 0L, 0, false, 0, 0, ((dy0) qhVar2.j(lt0Var)).e, qhVar2, (i3 & 14) | 196608, 64990);
            str3 = str2;
            pv0.b(str3, null, ge.b(ColorKt.getSoftWhite(), 0.8f), 0L, null, 0L, new dv0(3), 0L, 0, false, 0, 0, ((dy0) qhVar2.j(lt0Var)).j, qhVar2, ((i3 >> 3) & 14) | 384, 65018);
            qhVar = qhVar2;
            qhVar.q(true);
        } else {
            str3 = str2;
            qhVar = qhVar2;
            qhVar.Q();
        }
        ri0 s = qhVar.s();
        if (s != null) {
            s.d = new d8(i, 4, str, str3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ky0 CenterMessage$lambda$40(String str, String str2, int i, ih ihVar, int i2) {
        CenterMessage(str, str2, ihVar, yc0.v(i | 1));
        return ky0.a;
    }

    public static final void GaugeControlCard(final GaugeState gaugeState, final TargetProfile targetProfile, final bu buVar, final bu buVar2, ih ihVar, int i) {
        int i2;
        long cyanBeam;
        gaugeState.getClass();
        targetProfile.getClass();
        buVar.getClass();
        buVar2.getClass();
        qh qhVar = (qh) ihVar;
        qhVar.W(1637373302);
        if ((i & 6) == 0) {
            i2 = (qhVar.f(gaugeState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= qhVar.h(targetProfile) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= qhVar.h(buVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= qhVar.h(buVar2) ? 2048 : 1024;
        }
        if (qhVar.N(i2 & 1, (i2 & 1171) != 1170)) {
            int i3 = WhenMappings.$EnumSwitchMapping$0[gaugeState.getChannel().ordinal()];
            if (i3 == 1) {
                cyanBeam = ColorKt.getCyanBeam();
            } else if (i3 == 2) {
                cyanBeam = ColorKt.getSolarAmber();
            } else {
                if (i3 != 3) {
                    g8.c();
                    return;
                }
                cyanBeam = ColorKt.getMintTrace();
            }
            final long j = cyanBeam;
            m8RelayPanel3IgeMak(null, j, a50.E(1054460580, new ru() { // from class: xj0
                @Override // defpackage.ru
                public final Object b(Object obj, Object obj2, Object obj3) {
                    ky0 GaugeControlCard$lambda$27;
                    int intValue = ((Integer) obj3).intValue();
                    GaugeControlCard$lambda$27 = RelayComponentsKt.GaugeControlCard$lambda$27(GaugeState.this, targetProfile, j, buVar, buVar2, (xe) obj, (ih) obj2, intValue);
                    return GaugeControlCard$lambda$27;
                }
            }, qhVar), qhVar, 384, 1);
        } else {
            qhVar.Q();
        }
        ri0 s = qhVar.s();
        if (s != null) {
            s.d = new ka(gaugeState, targetProfile, buVar, buVar2, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ky0 GaugeControlCard$lambda$27(GaugeState gaugeState, TargetProfile targetProfile, long j, bu buVar, bu buVar2, xe xeVar, ih ihVar, int i) {
        CharSequence charSequence;
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
            h6 h6Var = dh.e;
            ld0.r(qhVar, h6Var, a);
            h6 h6Var2 = dh.d;
            ld0.r(qhVar, h6Var2, l);
            h6 h6Var3 = dh.f;
            if (qhVar.Q || !nz.l(qhVar.K(), Integer.valueOf(A))) {
                y6.y(A, qhVar, A, h6Var3);
            }
            h6 h6Var4 = dh.c;
            ld0.r(qhVar, h6Var4, D);
            we a2 = ue.a(new z7(2.0f), b2.p, qhVar, 6);
            int A2 = px0.A(qhVar);
            gf0 l2 = qhVar.l();
            r50 r50Var = r50.a;
            u50 D2 = nk.D(qhVar, r50Var);
            qhVar.X();
            if (qhVar.Q) {
                qhVar.k(giVar);
            } else {
                qhVar.h0();
            }
            ld0.r(qhVar, h6Var, a2);
            ld0.r(qhVar, h6Var2, l2);
            if (qhVar.Q || !nz.l(qhVar.K(), Integer.valueOf(A2))) {
                y6.y(A2, qhVar, A2, h6Var3);
            }
            ld0.r(qhVar, h6Var4, D2);
            String label = gaugeState.getChannel().getLabel();
            dw0 dw0Var = ((dy0) qhVar.j(ey0.a)).h;
            ut utVar = ut.i;
            pv0.b(label, null, 0L, 0L, utVar, 0L, null, 0L, 0, false, 0, 0, dw0Var, qhVar, 196608, 65502);
            String valueOf = String.valueOf((int) (targetProfile.getCenters().get(gaugeState.getChannel().ordinal()).floatValue() * 100.0f));
            valueOf.getClass();
            if (2 <= valueOf.length()) {
                charSequence = valueOf.subSequence(0, valueOf.length());
            } else {
                StringBuilder sb = new StringBuilder(2);
                int length = 2 - valueOf.length();
                if (1 <= length) {
                    int i2 = 1;
                    while (true) {
                        sb.append('0');
                        if (i2 == length) {
                            break;
                        }
                        i2++;
                    }
                }
                sb.append((CharSequence) valueOf);
                charSequence = sb;
            }
            String str = "Target " + charSequence.toString();
            lt0 lt0Var = ey0.a;
            pv0.b(str, null, ge.b(ColorKt.getSoftWhite(), 0.72f), 0L, null, 0L, null, 0L, 0, false, 0, 0, ((dy0) qhVar.j(lt0Var)).l, qhVar, 384, 65530);
            qhVar.q(true);
            pv0.b(String.valueOf((int) (gaugeState.getValue() * 100.0f)), null, j, 0L, utVar, 0L, null, 0L, 0, false, 0, 0, ((dy0) qhVar.j(lt0Var)).f, qhVar, 196608, 65498);
            qhVar.q(true);
            m7GaugeTrackBx497Mc(gaugeState.getValue(), targetProfile.getCenters().get(gaugeState.getChannel().ordinal()).floatValue(), targetProfile.getWindowRadius(), j, qhVar, 0);
            gm0 a3 = em0.a(new z7(10.0f), b2.n, qhVar, 6);
            int A3 = px0.A(qhVar);
            gf0 l3 = qhVar.l();
            u50 D3 = nk.D(qhVar, r50Var);
            qhVar.X();
            if (qhVar.Q) {
                qhVar.k(giVar);
            } else {
                qhVar.h0();
            }
            ld0.r(qhVar, h6Var, a3);
            ld0.r(qhVar, h6Var2, l3);
            if (qhVar.Q || !nz.l(qhVar.K(), Integer.valueOf(A3))) {
                y6.y(A3, qhVar, A3, h6Var3);
            }
            ld0.r(qhVar, h6Var4, D3);
            RelaySecondaryButton("Shift -", buVar, y6.E(), false, qhVar, 6, 8);
            RelayPrimaryButton("Shift +", buVar2, y6.E(), false, qhVar, 6, 8);
            qhVar.q(true);
        } else {
            qhVar.Q();
        }
        return ky0.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ky0 GaugeControlCard$lambda$28(GaugeState gaugeState, TargetProfile targetProfile, bu buVar, bu buVar2, int i, ih ihVar, int i2) {
        GaugeControlCard(gaugeState, targetProfile, buVar, buVar2, ihVar, yc0.v(i | 1));
        return ky0.a;
    }

    /* renamed from: GaugeTrack-Bx497Mc, reason: not valid java name */
    public static final void m7GaugeTrackBx497Mc(final float f, final float f2, final float f3, final long j, ih ihVar, final int i) {
        float f4;
        int i2;
        final float f5;
        qh qhVar = (qh) ihVar;
        qhVar.W(-1288712499);
        if ((i & 6) == 0) {
            f4 = f;
            i2 = (qhVar.c(f4) ? 4 : 2) | i;
        } else {
            f4 = f;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= qhVar.c(f2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            f5 = f3;
            i2 |= qhVar.c(f5) ? 256 : 128;
        } else {
            f5 = f3;
        }
        if ((i & 3072) == 0) {
            i2 |= qhVar.e(j) ? 2048 : 1024;
        }
        if (qhVar.N(i2 & 1, (i2 & 1171) != 1170)) {
            u50 b = c.b(c.a, 44.0f);
            boolean z = ((i2 & 112) == 32) | ((i2 & 896) == 256) | ((i2 & 7168) == 2048) | ((i2 & 14) == 4);
            Object K = qhVar.K();
            if (z || K == hh.a) {
                final float f6 = f4;
                mu muVar = new mu() { // from class: ak0
                    @Override // defpackage.mu
                    public final Object c(Object obj) {
                        ky0 GaugeTrack_Bx497Mc$lambda$30$lambda$29;
                        GaugeTrack_Bx497Mc$lambda$30$lambda$29 = RelayComponentsKt.GaugeTrack_Bx497Mc$lambda$30$lambda$29(f2, f5, j, f6, (oo) obj);
                        return GaugeTrack_Bx497Mc$lambda$30$lambda$29;
                    }
                };
                qhVar.e0(muVar);
                K = muVar;
            }
            nz.a(b, (mu) K, qhVar, 6);
        } else {
            qhVar.Q();
        }
        ri0 s = qhVar.s();
        if (s != null) {
            s.d = new qu() { // from class: bk0
                @Override // defpackage.qu
                public final Object invoke(Object obj, Object obj2) {
                    ky0 GaugeTrack_Bx497Mc$lambda$31;
                    int intValue = ((Integer) obj2).intValue();
                    GaugeTrack_Bx497Mc$lambda$31 = RelayComponentsKt.GaugeTrack_Bx497Mc$lambda$31(f, f2, f3, j, i, (ih) obj, intValue);
                    return GaugeTrack_Bx497Mc$lambda$31;
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ky0 GaugeTrack_Bx497Mc$lambda$30$lambda$29(float f, float f2, long j, float f3, oo ooVar) {
        ooVar.getClass();
        long j2 = ge.c;
        y6.s(ooVar, ge.b(j2, 0.1f), 0L, 0L, (Float.floatToRawIntBits(16.0f) << 32) | (Float.floatToRawIntBits(16.0f) & 4294967295L), null, 246);
        float intBitsToFloat = Float.intBitsToFloat((int) (ooVar.c() >> 32)) * rg0.f(f - f2, 0.0f, 1.0f);
        float intBitsToFloat2 = Float.intBitsToFloat((int) (ooVar.c() >> 32)) * rg0.f(f + f2, 0.0f, 1.0f);
        long b = ge.b(j, 0.22f);
        long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L);
        long c = ooVar.c();
        float f4 = intBitsToFloat2 - intBitsToFloat;
        if (f4 < 10.0f) {
            f4 = 10.0f;
        }
        y6.s(ooVar, b, floatToRawIntBits, fr0.a(c, f4), (Float.floatToRawIntBits(16.0f) << 32) | (Float.floatToRawIntBits(16.0f) & 4294967295L), null, 240);
        float intBitsToFloat3 = Float.intBitsToFloat((int) (ooVar.c() >> 32)) * f;
        float intBitsToFloat4 = Float.intBitsToFloat((int) (ooVar.c() & 4294967295L)) - 6.0f;
        ooVar.K(ge.b(j2, 0.35f), (Float.floatToRawIntBits(Float.intBitsToFloat((int) (ooVar.c() >> 32)) * f) << 32) | (Float.floatToRawIntBits(6.0f) & 4294967295L), (Float.floatToRawIntBits(intBitsToFloat3) << 32) | (Float.floatToRawIntBits(intBitsToFloat4) & 4294967295L), 4.0f);
        float intBitsToFloat5 = Float.intBitsToFloat((int) (ooVar.c() >> 32)) * f3;
        float intBitsToFloat6 = Float.intBitsToFloat((int) (ooVar.c() & 4294967295L)) - 4.0f;
        ooVar.K(j, (Float.floatToRawIntBits(Float.intBitsToFloat((int) (ooVar.c() >> 32)) * f3) << 32) | (Float.floatToRawIntBits(4.0f) & 4294967295L), (Float.floatToRawIntBits(intBitsToFloat6) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat5) << 32), 8.0f);
        y6.s(ooVar, ge.b(j, 0.35f), 0L, 0L, (Float.floatToRawIntBits(16.0f) << 32) | (Float.floatToRawIntBits(16.0f) & 4294967295L), new ut0(2.0f, 0.0f, 0, 0, 30), 230);
        return ky0.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ky0 GaugeTrack_Bx497Mc$lambda$31(float f, float f2, float f3, long j, int i, ih ihVar, int i2) {
        m7GaugeTrackBx497Mc(f, f2, f3, j, ihVar, yc0.v(i | 1));
        return ky0.a;
    }

    public static final void HeroArt(final int i, u50 u50Var, final String str, ih ihVar, final int i2, final int i3) {
        int i4;
        final u50 u50Var2;
        qh qhVar = (qh) ihVar;
        qhVar.W(-660583844);
        if ((i2 & 6) == 0) {
            i4 = (qhVar.d(i) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i5 = i3 & 2;
        if (i5 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= qhVar.f(u50Var) ? 32 : 16;
        }
        int i6 = i3 & 4;
        if (i6 != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            i4 |= qhVar.f(str) ? 256 : 128;
        }
        if (qhVar.N(i4 & 1, (i4 & 147) != 146)) {
            if (i5 != 0) {
                u50Var = r50.a;
            }
            u50 u50Var3 = u50Var;
            if (i6 != 0) {
                str = null;
            }
            m8RelayPanel3IgeMak(u50Var3, ColorKt.getMagentaGlow(), a50.E(1683450634, new ru() { // from class: yj0
                @Override // defpackage.ru
                public final Object b(Object obj, Object obj2, Object obj3) {
                    ky0 HeroArt$lambda$37;
                    int intValue = ((Integer) obj3).intValue();
                    HeroArt$lambda$37 = RelayComponentsKt.HeroArt$lambda$37(i, str, (xe) obj, (ih) obj2, intValue);
                    return HeroArt$lambda$37;
                }
            }, qhVar), qhVar, ((i4 >> 3) & 14) | 432, 0);
            u50Var2 = u50Var3;
        } else {
            qhVar.Q();
            u50Var2 = u50Var;
        }
        final String str2 = str;
        ri0 s = qhVar.s();
        if (s != null) {
            s.d = new qu() { // from class: zj0
                @Override // defpackage.qu
                public final Object invoke(Object obj, Object obj2) {
                    ky0 HeroArt$lambda$38;
                    int intValue = ((Integer) obj2).intValue();
                    HeroArt$lambda$38 = RelayComponentsKt.HeroArt$lambda$38(i, u50Var2, str2, i2, i3, (ih) obj, intValue);
                    return HeroArt$lambda$38;
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ky0 HeroArt$lambda$37(int i, String str, xe xeVar, ih ihVar, int i2) {
        xeVar.getClass();
        qh qhVar = (qh) ihVar;
        if (qhVar.N(i2 & 1, (i2 & 17) != 16)) {
            u50 a = a.a(androidx.compose.ui.graphics.a.c(c.b(c.a, 180.0f), bm0.a(22.0f), 518143), new c30(px0.I(new ge(d31.d(2855014254L)), new ge(d31.c(1429853183)), new ge(d31.d(2570130279L))), 0L, 9187343241974906880L));
            g50 e = ca.e(b2.i, false);
            int A = px0.A(qhVar);
            gf0 l = qhVar.l();
            u50 D = nk.D(qhVar, a);
            eh.b.getClass();
            gi giVar = dh.b;
            qhVar.X();
            if (qhVar.Q) {
                qhVar.k(giVar);
            } else {
                qhVar.h0();
            }
            ld0.r(qhVar, dh.e, e);
            ld0.r(qhVar, dh.d, l);
            h6 h6Var = dh.f;
            if (qhVar.Q || !nz.l(qhVar.K(), Integer.valueOf(A))) {
                y6.y(A, qhVar, A, h6Var);
            }
            ld0.r(qhVar, dh.c, D);
            px0.b(od0.r(i, qhVar), str, c.c(r50.a, 132.0f), null, ej.b, 0.0f, qhVar, 24960, 104);
            qhVar.q(true);
        } else {
            qhVar.Q();
        }
        return ky0.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ky0 HeroArt$lambda$38(int i, u50 u50Var, String str, int i2, int i3, ih ihVar, int i4) {
        HeroArt(i, u50Var, str, ihVar, yc0.v(i2 | 1), i3);
        return ky0.a;
    }

    public static final void MissionProgress(final int i, final int i2, ih ihVar, final int i3) {
        int i4;
        qh qhVar = (qh) ihVar;
        qhVar.W(-293736541);
        if ((i3 & 6) == 0) {
            i4 = (qhVar.d(i) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= qhVar.d(i2) ? 32 : 16;
        }
        if (qhVar.N(i4 & 1, (i4 & 19) != 18)) {
            u50 c = androidx.compose.ui.graphics.a.c(c.b(c.a, 14.0f), bm0.a(999.0f), 518143);
            boolean z = ((i4 & 112) == 32) | ((i4 & 14) == 4);
            Object K = qhVar.K();
            if (z || K == hh.a) {
                K = new mu() { // from class: vj0
                    @Override // defpackage.mu
                    public final Object c(Object obj) {
                        ky0 MissionProgress$lambda$22$lambda$21;
                        MissionProgress$lambda$22$lambda$21 = RelayComponentsKt.MissionProgress$lambda$22$lambda$21(i2, i, (oo) obj);
                        return MissionProgress$lambda$22$lambda$21;
                    }
                };
                qhVar.e0(K);
            }
            nz.a(c, (mu) K, qhVar, 0);
        } else {
            qhVar.Q();
        }
        ri0 s = qhVar.s();
        if (s != null) {
            s.d = new qu() { // from class: wj0
                @Override // defpackage.qu
                public final Object invoke(Object obj, Object obj2) {
                    ky0 MissionProgress$lambda$23;
                    int intValue = ((Integer) obj2).intValue();
                    MissionProgress$lambda$23 = RelayComponentsKt.MissionProgress$lambda$23(i, i2, i3, (ih) obj, intValue);
                    return MissionProgress$lambda$23;
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ky0 MissionProgress$lambda$22$lambda$21(int i, int i2, oo ooVar) {
        ooVar.getClass();
        long b = ge.b(ge.c, 0.14f);
        float intBitsToFloat = Float.intBitsToFloat((int) (ooVar.c() & 4294967295L)) / 2.0f;
        y6.s(ooVar, b, 0L, 0L, (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat) & 4294967295L), null, 246);
        float f = i == 0 ? 0.0f : i2 / i;
        c30 c30Var = new c30(px0.I(new ge(ColorKt.getCyanBeam()), new ge(ColorKt.getSolarAmber()), new ge(ColorKt.getMagentaGlow())), (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L), (Float.floatToRawIntBits(Float.POSITIVE_INFINITY) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L));
        long a = fr0.a(ooVar.c(), rg0.f(f, 0.0f, 1.0f) * Float.intBitsToFloat((int) (ooVar.c() >> 32)));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (ooVar.c() & 4294967295L)) / 2.0f;
        y6.r(ooVar, c30Var, 0L, a, (Float.floatToRawIntBits(intBitsToFloat2) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L), null, 242);
        return ky0.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ky0 MissionProgress$lambda$23(int i, int i2, int i3, ih ihVar, int i4) {
        MissionProgress(i, i2, ihVar, yc0.v(i3 | 1));
        return ky0.a;
    }

    public static final void ModuleCard(final ArrayModule arrayModule, final boolean z, final bu buVar, ih ihVar, final int i) {
        int i2;
        arrayModule.getClass();
        buVar.getClass();
        qh qhVar = (qh) ihVar;
        qhVar.W(624515657);
        if ((i & 6) == 0) {
            i2 = (qhVar.f(arrayModule) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= qhVar.g(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= qhVar.h(buVar) ? 256 : 128;
        }
        if (qhVar.N(i2 & 1, (i2 & 147) != 146)) {
            m8RelayPanel3IgeMak(null, z ? ColorKt.getSolarAmber() : ColorKt.getCyanBeam(), a50.E(-657111973, new ru() { // from class: oj0
                @Override // defpackage.ru
                public final Object b(Object obj, Object obj2, Object obj3) {
                    ky0 ModuleCard$lambda$34;
                    int intValue = ((Integer) obj3).intValue();
                    ModuleCard$lambda$34 = RelayComponentsKt.ModuleCard$lambda$34(ArrayModule.this, z, buVar, (xe) obj, (ih) obj2, intValue);
                    return ModuleCard$lambda$34;
                }
            }, qhVar), qhVar, 384, 1);
        } else {
            qhVar.Q();
        }
        ri0 s = qhVar.s();
        if (s != null) {
            s.d = new qu() { // from class: pj0
                @Override // defpackage.qu
                public final Object invoke(Object obj, Object obj2) {
                    ky0 ModuleCard$lambda$35;
                    int intValue = ((Integer) obj2).intValue();
                    ModuleCard$lambda$35 = RelayComponentsKt.ModuleCard$lambda$35(ArrayModule.this, z, buVar, i, (ih) obj, intValue);
                    return ModuleCard$lambda$35;
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ky0 ModuleCard$lambda$34(ArrayModule arrayModule, boolean z, bu buVar, xe xeVar, ih ihVar, int i) {
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
            h6 h6Var = dh.e;
            ld0.r(qhVar, h6Var, a);
            h6 h6Var2 = dh.d;
            ld0.r(qhVar, h6Var2, l);
            h6 h6Var3 = dh.f;
            if (qhVar.Q || !nz.l(qhVar.K(), Integer.valueOf(A))) {
                y6.y(A, qhVar, A, h6Var3);
            }
            h6 h6Var4 = dh.c;
            ld0.r(qhVar, h6Var4, D);
            u50 E = y6.E();
            we a2 = ue.a(new z7(4.0f), b2.p, qhVar, 6);
            int A2 = px0.A(qhVar);
            gf0 l2 = qhVar.l();
            u50 D2 = nk.D(qhVar, E);
            qhVar.X();
            if (qhVar.Q) {
                qhVar.k(giVar);
            } else {
                qhVar.h0();
            }
            ld0.r(qhVar, h6Var, a2);
            ld0.r(qhVar, h6Var2, l2);
            if (qhVar.Q || !nz.l(qhVar.K(), Integer.valueOf(A2))) {
                y6.y(A2, qhVar, A2, h6Var3);
            }
            ld0.r(qhVar, h6Var4, D2);
            String title = arrayModule.getTitle();
            lt0 lt0Var = ey0.a;
            pv0.b(title, null, 0L, 0L, ut.i, 0L, null, 0L, 0, false, 0, 0, ((dy0) qhVar.j(lt0Var)).g, qhVar, 196608, 65502);
            pv0.b(arrayModule.getSummary(), null, ge.b(ColorKt.getSoftWhite(), 0.78f), 0L, null, 0L, null, 0L, 0, false, 0, 0, ((dy0) qhVar.j(lt0Var)).k, qhVar, 384, 65530);
            qhVar.q(true);
            if (z) {
                qhVar.V(-2031727769);
                au0.a(null, bm0.a, ColorKt.getSolarAmber(), 0L, 0.0f, null, ComposableSingletons$RelayComponentsKt.INSTANCE.getLambda$705031925$app(), qhVar, 12583296, 121);
            } else {
                qhVar.V(-2045204957);
            }
            qhVar.q(false);
            qhVar.q(true);
            pv0.b(arrayModule.getDetail(), null, ge.b(ColorKt.getSoftWhite(), 0.74f), 0L, null, 0L, null, 0L, 0, false, 0, 0, ((dy0) qhVar.j(lt0Var)).k, qhVar, 384, 65530);
            if (z) {
                qhVar.V(425386439);
            } else {
                qhVar.V(439444877);
                RelaySecondaryButton("Activate Module", buVar, null, false, qhVar, 6, 12);
            }
            qhVar.q(false);
        } else {
            qhVar.Q();
        }
        return ky0.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ky0 ModuleCard$lambda$35(ArrayModule arrayModule, boolean z, bu buVar, int i, ih ihVar, int i2) {
        ModuleCard(arrayModule, z, buVar, ihVar, yc0.v(i | 1));
        return ky0.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0063  */
    /* renamed from: RelayPanel-3IgeMak, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m8RelayPanel3IgeMak(u50 u50Var, long j, final ru ruVar, ih ihVar, final int i, final int i2) {
        final u50 u50Var2;
        int i3;
        long j2;
        final long j3;
        ri0 s;
        u50 u50Var3;
        ruVar.getClass();
        qh qhVar = (qh) ihVar;
        qhVar.W(-1766856285);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            u50Var2 = u50Var;
        } else if ((i & 6) == 0) {
            u50Var2 = u50Var;
            i3 = (qhVar.f(u50Var2) ? 4 : 2) | i;
        } else {
            u50Var2 = u50Var;
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            j2 = j;
            i3 |= qhVar.e(j2) ? 32 : 16;
            if ((i & 384) == 0) {
                i3 |= qhVar.h(ruVar) ? 256 : 128;
            }
            if (qhVar.N(i3 & 1, (i3 & 147) == 146)) {
                qhVar.Q();
                j3 = j2;
            } else {
                u50 u50Var4 = i4 != 0 ? r50.a : u50Var2;
                long cyanBeam = i5 != 0 ? ColorKt.getCyanBeam() : j2;
                u50 c = u50Var4.c(c.a);
                long deepPanel = ColorKt.getDeepPanel();
                long softWhite = ColorKt.getSoftWhite();
                long j4 = ge.g;
                long b = ge.b(le.b(deepPanel, qhVar), 0.38f);
                ke keVar = (ke) qhVar.j(le.a);
                pc pcVar = keVar.M;
                if (pcVar == null) {
                    u50Var3 = c;
                    pcVar = new pc(le.c(keVar, 35), le.a(keVar, le.c(keVar, 35)), le.c(keVar, 35), ge.b(le.a(keVar, le.c(keVar, 35)), 0.38f));
                    keVar.M = pcVar;
                } else {
                    u50Var3 = c;
                }
                if (deepPanel == 16) {
                    deepPanel = pcVar.a;
                }
                long j5 = deepPanel;
                if (softWhite == 16) {
                    softWhite = pcVar.b;
                }
                long j6 = softWhite;
                long j7 = j4 != 16 ? j4 : pcVar.c;
                if (b == 16) {
                    b = pcVar.d;
                }
                px0.e(u50Var3, bm0.a(24.0f), new pc(j5, j6, j7, b), null, new z9(1.25f, new ks0(ge.b(cyanBeam, 0.5f))), a50.E(1218449839, new lj0(ruVar, 1), qhVar), qhVar, 196608);
                j3 = cyanBeam;
                u50Var2 = u50Var4;
            }
            s = qhVar.s();
            if (s == null) {
                s.d = new qu() { // from class: rj0
                    @Override // defpackage.qu
                    public final Object invoke(Object obj, Object obj2) {
                        ky0 RelayPanel_3IgeMak$lambda$13;
                        int intValue = ((Integer) obj2).intValue();
                        RelayPanel_3IgeMak$lambda$13 = RelayComponentsKt.RelayPanel_3IgeMak$lambda$13(u50.this, j3, ruVar, i, i2, (ih) obj, intValue);
                        return RelayPanel_3IgeMak$lambda$13;
                    }
                };
                return;
            }
            return;
        }
        j2 = j;
        if ((i & 384) == 0) {
        }
        if (qhVar.N(i3 & 1, (i3 & 147) == 146)) {
        }
        s = qhVar.s();
        if (s == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ky0 RelayPanel_3IgeMak$lambda$12(ru ruVar, xe xeVar, ih ihVar, int i) {
        xeVar.getClass();
        qh qhVar = (qh) ihVar;
        if (qhVar.N(i & 1, (i & 17) != 16)) {
            u50 b = b.b(c.a);
            we a = ue.a(new z7(12.0f), b2.p, qhVar, 6);
            int A = px0.A(qhVar);
            gf0 l = qhVar.l();
            u50 D = nk.D(qhVar, b);
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
            ruVar.b(ye.a, qhVar, 6);
            qhVar.q(true);
        } else {
            qhVar.Q();
        }
        return ky0.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ky0 RelayPanel_3IgeMak$lambda$13(u50 u50Var, long j, ru ruVar, int i, int i2, ih ihVar, int i3) {
        m8RelayPanel3IgeMak(u50Var, j, ruVar, ihVar, yc0.v(i | 1), i2);
        return ky0.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void RelayPrimaryButton(String str, bu buVar, u50 u50Var, boolean z, ih ihVar, int i, int i2) {
        int i3;
        bu buVar2;
        u50 u50Var2;
        int i4;
        boolean z2;
        u50 u50Var3;
        boolean z3;
        ri0 s;
        str.getClass();
        buVar.getClass();
        qh qhVar = (qh) ihVar;
        qhVar.W(-1564446099);
        if ((i & 6) == 0) {
            i3 = (qhVar.f(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            buVar2 = buVar;
            i3 |= qhVar.h(buVar2) ? 32 : 16;
        } else {
            buVar2 = buVar;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            u50Var2 = u50Var;
            i3 |= qhVar.f(u50Var2) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                z2 = z;
                i3 |= qhVar.g(z2) ? 2048 : 1024;
                int i6 = 0;
                if (qhVar.N(i3 & 1, (i3 & 1171) != 1170)) {
                    u50Var3 = i5 != 0 ? r50.a : u50Var2;
                    boolean z4 = i4 != 0 ? true : z2;
                    u50 c = u50Var3.c(c.a);
                    am0 a = bm0.a(18.0f);
                    id0 id0Var = jb.a;
                    long solarAmber = ColorKt.getSolarAmber();
                    long nebulaInk = ColorKt.getNebulaInk();
                    long b = ge.b(ColorKt.getSolarAmber(), 0.35f);
                    long b2 = ge.b(ColorKt.getNebulaInk(), 0.5f);
                    ke keVar = (ke) qhVar.j(le.a);
                    ib ibVar = keVar.K;
                    if (ibVar == null) {
                        ibVar = new ib(le.c(keVar, 26), le.c(keVar, 10), ge.b(le.c(keVar, 18), 0.12f), ge.b(le.c(keVar, 18), 0.38f));
                        keVar.K = ibVar;
                    }
                    int i7 = i3 >> 3;
                    nk.a(buVar2, c, z4, a, ibVar.a(solarAmber, nebulaInk, b, b2), null, null, null, a50.E(-131522979, new nj0(str, i6), qhVar), qhVar, (i7 & 14) | 805306368 | (i7 & 896), 480);
                    z3 = z4;
                } else {
                    qhVar.Q();
                    u50Var3 = u50Var2;
                    z3 = z2;
                }
                s = qhVar.s();
                if (s != null) {
                    s.d = new mj0(str, buVar, u50Var3, z3, i, i2, 1);
                    return;
                }
                return;
            }
            z2 = z;
            int i62 = 0;
            if (qhVar.N(i3 & 1, (i3 & 1171) != 1170)) {
            }
            s = qhVar.s();
            if (s != null) {
            }
        }
        u50Var2 = u50Var;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z2 = z;
        int i622 = 0;
        if (qhVar.N(i3 & 1, (i3 & 1171) != 1170)) {
        }
        s = qhVar.s();
        if (s != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ky0 RelayPrimaryButton$lambda$14(String str, hm0 hm0Var, ih ihVar, int i) {
        hm0Var.getClass();
        qh qhVar = (qh) ihVar;
        if (qhVar.N(i & 1, (i & 17) != 16)) {
            pv0.b(str, b.d(), 0L, 0L, ut.i, 0L, null, 0L, 0, false, 0, 0, null, qhVar, 196656, 131036);
        } else {
            qhVar.Q();
        }
        return ky0.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ky0 RelayPrimaryButton$lambda$15(String str, bu buVar, u50 u50Var, boolean z, int i, int i2, ih ihVar, int i3) {
        RelayPrimaryButton(str, buVar, u50Var, z, ihVar, yc0.v(i | 1), i2);
        return ky0.a;
    }

    public static final void RelayScene(ru ruVar, ih ihVar, int i) {
        int i2;
        ruVar.getClass();
        qh qhVar = (qh) ihVar;
        qhVar.W(-1902516821);
        int i3 = 2;
        if ((i & 6) == 0) {
            i2 = (qhVar.h(ruVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (qhVar.N(i2 & 1, (i2 & 3) != 2)) {
            FillElement fillElement = c.b;
            g50 e = ca.e(b2.e, false);
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
            ld0.r(qhVar, dh.e, e);
            ld0.r(qhVar, dh.d, l);
            h6 h6Var = dh.f;
            if (qhVar.Q || !nz.l(qhVar.K(), Integer.valueOf(A))) {
                y6.y(A, qhVar, A, h6Var);
            }
            ld0.r(qhVar, dh.c, D);
            px0.b(od0.r(R.drawable.cosmic_backdrop, qhVar), null, fillElement, null, ej.a, 0.92f, qhVar, 221616, 72);
            ca.a(a.a(fillElement, new c30(px0.I(new ge(d31.d(2852390936L)), new ge(d31.d(3423211568L)), new ge(d31.d(4060481820L))), (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L), (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(Float.POSITIVE_INFINITY) & 4294967295L))), qhVar, 6);
            nz.b(aj.a.a(new ge(ColorKt.getSoftWhite())), a50.E(842875505, new sh(i3, ruVar), qhVar), qhVar, 56);
            qhVar.q(true);
        } else {
            qhVar.Q();
        }
        ri0 s = qhVar.s();
        if (s != null) {
            s.d = new qj0(ruVar, i, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ky0 RelayScene$lambda$2$lambda$1(ru ruVar, ih ihVar, int i) {
        int i2 = 1;
        qh qhVar = (qh) ihVar;
        if (qhVar.N(i & 1, (i & 3) != 2)) {
            u50 a = a.a(c.b.c(new gh(new kg(3, i2))), new mi0(px0.I(new ge(d31.c(570490879)), new ge(ge.f)), 9205357640488583168L, 900.0f));
            g50 e = ca.e(b2.e, false);
            int A = px0.A(qhVar);
            gf0 l = qhVar.l();
            u50 D = nk.D(qhVar, a);
            eh.b.getClass();
            gi giVar = dh.b;
            qhVar.X();
            if (qhVar.Q) {
                qhVar.k(giVar);
            } else {
                qhVar.h0();
            }
            ld0.r(qhVar, dh.e, e);
            ld0.r(qhVar, dh.d, l);
            h6 h6Var = dh.f;
            if (qhVar.Q || !nz.l(qhVar.K(), Integer.valueOf(A))) {
                y6.y(A, qhVar, A, h6Var);
            }
            ld0.r(qhVar, dh.c, D);
            ruVar.b(androidx.compose.foundation.layout.a.a, qhVar, 6);
            qhVar.q(true);
        } else {
            qhVar.Q();
        }
        return ky0.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ky0 RelayScene$lambda$3(ru ruVar, int i, ih ihVar, int i2) {
        RelayScene(ruVar, ihVar, yc0.v(i | 1));
        return ky0.a;
    }

    public static final void RelayScrollLayout(ru ruVar, ih ihVar, int i) {
        int i2;
        ruVar.getClass();
        qh qhVar = (qh) ihVar;
        qhVar.W(1411620250);
        if ((i & 6) == 0) {
            i2 = (qhVar.h(ruVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = 0;
        int i4 = 1;
        if (qhVar.N(i2 & 1, (i2 & 3) != 2)) {
            RelayScene(a50.E(-1914893925, new lj0(ruVar, i3), qhVar), qhVar, 6);
        } else {
            qhVar.Q();
        }
        ri0 s = qhVar.s();
        if (s != null) {
            s.d = new qj0(ruVar, i, i4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ky0 RelayScrollLayout$lambda$5(ru ruVar, ga gaVar, ih ihVar, int i) {
        gaVar.getClass();
        if ((i & 6) == 0) {
            i |= ((qh) ihVar).f(gaVar) ? 4 : 2;
        }
        int i2 = 0;
        qh qhVar = (qh) ihVar;
        if (qhVar.N(i & 1, (i & 19) != 18)) {
            FillElement fillElement = c.b;
            Object[] objArr = new Object[0];
            j3 j3Var = ho0.i;
            boolean d = qhVar.d(0);
            Object K = qhVar.K();
            if (d || K == hh.a) {
                K = new gi(i2, 28);
                qhVar.e0(K);
            }
            u50 a = ((androidx.compose.foundation.layout.a) gaVar).a(c.e(b.c(fillElement.c(new gh(new d((ho0) ze0.q(objArr, j3Var, (bu) K, qhVar, 0, 4)))), 20.0f, 18.0f)));
            we a2 = ue.a(new z7(16.0f), b2.p, qhVar, 6);
            int A = px0.A(qhVar);
            gf0 l = qhVar.l();
            u50 D = nk.D(qhVar, a);
            eh.b.getClass();
            gi giVar = dh.b;
            qhVar.X();
            if (qhVar.Q) {
                qhVar.k(giVar);
            } else {
                qhVar.h0();
            }
            ld0.r(qhVar, dh.e, a2);
            ld0.r(qhVar, dh.d, l);
            h6 h6Var = dh.f;
            if (qhVar.Q || !nz.l(qhVar.K(), Integer.valueOf(A))) {
                y6.y(A, qhVar, A, h6Var);
            }
            ld0.r(qhVar, dh.c, D);
            ruVar.b(ye.a, qhVar, 6);
            qhVar.q(true);
        } else {
            qhVar.Q();
        }
        return ky0.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ky0 RelayScrollLayout$lambda$6(ru ruVar, int i, ih ihVar, int i2) {
        RelayScrollLayout(ruVar, ihVar, yc0.v(i | 1));
        return ky0.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void RelaySecondaryButton(String str, bu buVar, u50 u50Var, boolean z, ih ihVar, int i, int i2) {
        int i3;
        bu buVar2;
        u50 u50Var2;
        int i4;
        boolean z2;
        u50 u50Var3;
        boolean z3;
        ri0 s;
        str.getClass();
        buVar.getClass();
        qh qhVar = (qh) ihVar;
        qhVar.W(-488875269);
        if ((i & 6) == 0) {
            i3 = (qhVar.f(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            buVar2 = buVar;
            i3 |= qhVar.h(buVar2) ? 32 : 16;
        } else {
            buVar2 = buVar;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            u50Var2 = u50Var;
            i3 |= qhVar.f(u50Var2) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                z2 = z;
                i3 |= qhVar.g(z2) ? 2048 : 1024;
                int i6 = 1;
                if (qhVar.N(i3 & 1, (i3 & 1171) != 1170)) {
                    u50Var3 = i5 != 0 ? r50.a : u50Var2;
                    boolean z4 = i4 != 0 ? true : z2;
                    u50 c = u50Var3.c(c.a);
                    am0 a = bm0.a(18.0f);
                    id0 id0Var = jb.a;
                    long softWhite = ColorKt.getSoftWhite();
                    long b = ge.b(ColorKt.getSoftWhite(), 0.4f);
                    long j = ge.g;
                    ke keVar = (ke) qhVar.j(le.a);
                    ib ibVar = keVar.L;
                    if (ibVar == null) {
                        long j2 = ge.f;
                        ibVar = new ib(j2, le.c(keVar, 26), j2, ge.b(le.c(keVar, 18), 0.38f));
                        keVar.L = ibVar;
                    }
                    int i7 = i3 >> 3;
                    nk.c(buVar2, c, z4, a, ibVar.a(j, softWhite, j, b), null, null, a50.E(-36078227, new nj0(str, i6), qhVar), qhVar, (i7 & 14) | 805306368 | (i7 & 896));
                    z3 = z4;
                } else {
                    qhVar.Q();
                    u50Var3 = u50Var2;
                    z3 = z2;
                }
                s = qhVar.s();
                if (s != null) {
                    s.d = new mj0(str, buVar, u50Var3, z3, i, i2, 0);
                    return;
                }
                return;
            }
            z2 = z;
            int i62 = 1;
            if (qhVar.N(i3 & 1, (i3 & 1171) != 1170)) {
            }
            s = qhVar.s();
            if (s != null) {
            }
        }
        u50Var2 = u50Var;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z2 = z;
        int i622 = 1;
        if (qhVar.N(i3 & 1, (i3 & 1171) != 1170)) {
        }
        s = qhVar.s();
        if (s != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ky0 RelaySecondaryButton$lambda$16(String str, hm0 hm0Var, ih ihVar, int i) {
        hm0Var.getClass();
        qh qhVar = (qh) ihVar;
        if (qhVar.N(i & 1, (i & 17) != 16)) {
            pv0.b(str, b.d(), 0L, 0L, ut.h, 0L, null, 0L, 0, false, 0, 0, null, qhVar, 196656, 131036);
        } else {
            qhVar.Q();
        }
        return ky0.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ky0 RelaySecondaryButton$lambda$17(String str, bu buVar, u50 u50Var, boolean z, int i, int i2, ih ihVar, int i3) {
        RelaySecondaryButton(str, buVar, u50Var, z, ihVar, yc0.v(i | 1), i2);
        return ky0.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ScreenTopBar(final String str, String str2, bu buVar, ih ihVar, final int i, final int i2) {
        int i3;
        String str3;
        int i4;
        bu buVar2;
        final String str4;
        final bu buVar3;
        ri0 s;
        int i5;
        bu buVar4;
        String str5;
        h6 h6Var;
        h6 h6Var2;
        h6 h6Var3;
        boolean z;
        gi giVar;
        h6 h6Var4;
        String str6;
        str.getClass();
        qh qhVar = (qh) ihVar;
        qhVar.W(1047564880);
        if ((i & 6) == 0) {
            i3 = (qhVar.f(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            str3 = str2;
            i3 |= qhVar.f(str3) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                buVar2 = buVar;
                i3 |= qhVar.h(buVar2) ? 256 : 128;
                if (qhVar.N(i3 & 1, (i3 & 147) != 146)) {
                    if (i6 != 0) {
                        str3 = null;
                    }
                    bu buVar5 = i4 != 0 ? null : buVar2;
                    FillElement fillElement = c.a;
                    gm0 a = em0.a(new z7(14.0f), b2.o, qhVar, 54);
                    int A = px0.A(qhVar);
                    gf0 l = qhVar.l();
                    u50 D = nk.D(qhVar, fillElement);
                    eh.b.getClass();
                    gi giVar2 = dh.b;
                    qhVar.X();
                    if (qhVar.Q) {
                        qhVar.k(giVar2);
                    } else {
                        qhVar.h0();
                    }
                    h6 h6Var5 = dh.e;
                    ld0.r(qhVar, h6Var5, a);
                    h6 h6Var6 = dh.d;
                    ld0.r(qhVar, h6Var6, l);
                    h6 h6Var7 = dh.f;
                    if (qhVar.Q || !nz.l(qhVar.K(), Integer.valueOf(A))) {
                        y6.y(A, qhVar, A, h6Var7);
                    }
                    h6 h6Var8 = dh.c;
                    ld0.r(qhVar, h6Var8, D);
                    int i7 = 3;
                    if (buVar5 != null) {
                        qhVar.V(-1205643092);
                        am0 am0Var = bm0.a;
                        long deepPanelAlt = ColorKt.getDeepPanelAlt();
                        eg E = a50.E(569389034, new sh(i7, buVar5), qhVar);
                        h6Var2 = h6Var8;
                        i5 = i3;
                        buVar4 = buVar5;
                        str5 = str3;
                        h6Var = h6Var6;
                        h6Var3 = h6Var7;
                        z = false;
                        giVar = giVar2;
                        h6Var4 = h6Var5;
                        au0.a(null, am0Var, deepPanelAlt, 0L, 0.0f, null, E, qhVar, 12583296, 121);
                    } else {
                        i5 = i3;
                        buVar4 = buVar5;
                        str5 = str3;
                        h6Var = h6Var6;
                        h6Var2 = h6Var8;
                        h6Var3 = h6Var7;
                        z = false;
                        giVar = giVar2;
                        h6Var4 = h6Var5;
                        qhVar.V(-1210847186);
                    }
                    qhVar.q(z);
                    u50 E2 = y6.E();
                    we a2 = ue.a(new z7(2.0f), b2.p, qhVar, 6);
                    int A2 = px0.A(qhVar);
                    gf0 l2 = qhVar.l();
                    u50 D2 = nk.D(qhVar, E2);
                    qhVar.X();
                    if (qhVar.Q) {
                        qhVar.k(giVar);
                    } else {
                        qhVar.h0();
                    }
                    ld0.r(qhVar, h6Var4, a2);
                    ld0.r(qhVar, h6Var, l2);
                    if (qhVar.Q || !nz.l(qhVar.K(), Integer.valueOf(A2))) {
                        y6.y(A2, qhVar, A2, h6Var3);
                    }
                    ld0.r(qhVar, h6Var2, D2);
                    lt0 lt0Var = ey0.a;
                    pv0.b(str, null, 0L, 0L, ut.i, 0L, null, 0L, 0, false, 0, 0, ((dy0) qhVar.j(lt0Var)).f, qhVar, (i5 & 14) | 196608, 65502);
                    qhVar = qhVar;
                    if (str5 != null) {
                        qhVar.V(-380681023);
                        str6 = str5;
                        pv0.b(str6, null, ge.b(ColorKt.getSoftWhite(), 0.75f), 0L, null, 0L, null, 0L, 0, false, 0, 0, ((dy0) qhVar.j(lt0Var)).k, qhVar, ((i5 >> 3) & 14) | 384, 65530);
                        qhVar = qhVar;
                    } else {
                        str6 = str5;
                        qhVar.V(-386629768);
                    }
                    qhVar.q(z);
                    qhVar.q(true);
                    qhVar.q(true);
                    buVar3 = buVar4;
                    str4 = str6;
                } else {
                    qhVar.Q();
                    str4 = str3;
                    buVar3 = buVar2;
                }
                s = qhVar.s();
                if (s != null) {
                    s.d = new qu() { // from class: uj0
                        @Override // defpackage.qu
                        public final Object invoke(Object obj, Object obj2) {
                            ky0 ScreenTopBar$lambda$10;
                            int intValue = ((Integer) obj2).intValue();
                            ScreenTopBar$lambda$10 = RelayComponentsKt.ScreenTopBar$lambda$10(str, str4, buVar3, i, i2, (ih) obj, intValue);
                            return ScreenTopBar$lambda$10;
                        }
                    };
                    return;
                }
                return;
            }
            buVar2 = buVar;
            if (qhVar.N(i3 & 1, (i3 & 147) != 146)) {
            }
            s = qhVar.s();
            if (s != null) {
            }
        }
        str3 = str2;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        buVar2 = buVar;
        if (qhVar.N(i3 & 1, (i3 & 147) != 146)) {
        }
        s = qhVar.s();
        if (s != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ky0 ScreenTopBar$lambda$10(String str, String str2, bu buVar, int i, int i2, ih ihVar, int i3) {
        ScreenTopBar(str, str2, buVar, ihVar, yc0.v(i | 1), i2);
        return ky0.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ky0 ScreenTopBar$lambda$9$lambda$7(bu buVar, ih ihVar, int i) {
        qh qhVar = (qh) ihVar;
        if (qhVar.N(i & 1, (i & 3) != 2)) {
            nz.d(buVar, null, false, null, ComposableSingletons$RelayComponentsKt.INSTANCE.getLambda$1965612397$app(), qhVar, 196608);
        } else {
            qhVar.Q();
        }
        return ky0.a;
    }

    /* renamed from: StatPill-XO-JAsU, reason: not valid java name */
    public static final void m9StatPillXOJAsU(final String str, final String str2, long j, ih ihVar, int i) {
        int i2;
        str.getClass();
        str2.getClass();
        qh qhVar = (qh) ihVar;
        qhVar.W(-1398800286);
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
        if (qhVar.N(i2 & 1, (i2 & 147) != 146)) {
            au0.a(null, bm0.a(18.0f), ge.b(j, 0.18f), 0L, 0.0f, null, a50.E(-626307651, new qu() { // from class: sj0
                @Override // defpackage.qu
                public final Object invoke(Object obj, Object obj2) {
                    ky0 StatPill_XO_JAsU$lambda$19;
                    int intValue = ((Integer) obj2).intValue();
                    StatPill_XO_JAsU$lambda$19 = RelayComponentsKt.StatPill_XO_JAsU$lambda$19(str, str2, (ih) obj, intValue);
                    return StatPill_XO_JAsU$lambda$19;
                }
            }, qhVar), qhVar, 12582912, 121);
        } else {
            qhVar.Q();
        }
        ri0 s = qhVar.s();
        if (s != null) {
            s.d = new tj0(str, str2, j, i, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ky0 StatPill_XO_JAsU$lambda$19(String str, String str2, ih ihVar, int i) {
        qh qhVar = (qh) ihVar;
        if (qhVar.N(i & 1, (i & 3) != 2)) {
            u50 c = b.c(r50.a, 14.0f, 10.0f);
            we a = ue.a(new z7(2.0f), b2.p, qhVar, 6);
            int A = px0.A(qhVar);
            gf0 l = qhVar.l();
            u50 D = nk.D(qhVar, c);
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
            pv0.b(str, null, ge.b(ColorKt.getSoftWhite(), 0.72f), 0L, null, 0L, null, 0L, 0, false, 0, 0, ((dy0) qhVar.j(lt0Var)).n, qhVar, 384, 65530);
            pv0.b(str2, null, 0L, 0L, ut.i, 0L, null, 0L, 0, false, 0, 0, ((dy0) qhVar.j(lt0Var)).h, qhVar, 196608, 65502);
            qhVar.q(true);
        } else {
            qhVar.Q();
        }
        return ky0.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ky0 StatPill_XO_JAsU$lambda$20(String str, String str2, long j, int i, ih ihVar, int i2) {
        m9StatPillXOJAsU(str, str2, j, ihVar, yc0.v(i | 1));
        return ky0.a;
    }
}
