package defpackage;

import com.vectorharbor.planetvectorsurvey.navigation.PlanetVectorSurveyAppKt;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final /* synthetic */ class sj implements mu {
    public final /* synthetic */ int d;

    public /* synthetic */ sj(int i) {
        this.d = i;
    }

    @Override // defpackage.mu
    public final Object c(Object obj) {
        ky0 PlanetVectorSurveyApp$lambda$38$lambda$37$lambda$36$lambda$33$lambda$32$lambda$31;
        ky0 PlanetVectorSurveyApp$lambda$38$lambda$37$lambda$29$lambda$28$lambda$27$lambda$26;
        ky0 PlanetVectorSurveyApp$lambda$38$lambda$37$lambda$4$lambda$3$lambda$2$lambda$1;
        k7 k7Var;
        int i = 0;
        ns0 ns0Var = null;
        r10 = null;
        pq0 pq0Var = null;
        r10 = null;
        wv0 wv0Var = null;
        r10 = null;
        uv0 uv0Var = null;
        r10 = null;
        e30 e30Var = null;
        r10 = null;
        f30 f30Var = null;
        r10 = null;
        vy0 vy0Var = null;
        r10 = null;
        qz0 qz0Var = null;
        r10 = null;
        ns0 ns0Var2 = null;
        r10 = null;
        wd0 wd0Var = null;
        r10 = null;
        uv0 uv0Var2 = null;
        ns0Var = null;
        switch (this.d) {
            case 0:
                pj pjVar = (pj) obj;
                if (pjVar instanceof uj) {
                    return (uj) pjVar;
                }
                return null;
            case 1:
                synchronized (ur0.c) {
                    List list = ur0.i;
                    int size = list.size();
                    while (i < size) {
                        ((mu) list.get(i)).c(obj);
                        i++;
                    }
                }
                return ky0.a;
            case 2:
                rd0 rd0Var = (rd0) obj;
                return "[" + rd0Var.b + ", " + rd0Var.c + ')';
            case 3:
                PlanetVectorSurveyApp$lambda$38$lambda$37$lambda$36$lambda$33$lambda$32$lambda$31 = PlanetVectorSurveyAppKt.PlanetVectorSurveyApp$lambda$38$lambda$37$lambda$36$lambda$33$lambda$32$lambda$31((d90) obj);
                return PlanetVectorSurveyApp$lambda$38$lambda$37$lambda$36$lambda$33$lambda$32$lambda$31;
            case 4:
                PlanetVectorSurveyApp$lambda$38$lambda$37$lambda$29$lambda$28$lambda$27$lambda$26 = PlanetVectorSurveyAppKt.PlanetVectorSurveyApp$lambda$38$lambda$37$lambda$29$lambda$28$lambda$27$lambda$26((d90) obj);
                return PlanetVectorSurveyApp$lambda$38$lambda$37$lambda$29$lambda$28$lambda$27$lambda$26;
            case 5:
                PlanetVectorSurveyApp$lambda$38$lambda$37$lambda$4$lambda$3$lambda$2$lambda$1 = PlanetVectorSurveyAppKt.PlanetVectorSurveyApp$lambda$38$lambda$37$lambda$4$lambda$3$lambda$2$lambda$1((d90) obj);
                return PlanetVectorSurveyApp$lambda$38$lambda$37$lambda$4$lambda$3$lambda$2$lambda$1;
            case 6:
                return new wm0((Map) obj);
            case 7:
                return obj;
            case 8:
                obj.getClass();
                List list2 = (List) obj;
                Object obj2 = list2.get(0);
                mu muVar = (mu) sn0.h.f;
                Boolean bool = Boolean.FALSE;
                ns0 ns0Var3 = (nz.l(obj2, bool) || obj2 == null) ? null : (ns0) muVar.c(obj2);
                Object obj3 = list2.get(1);
                ns0 ns0Var4 = (nz.l(obj3, bool) || obj3 == null) ? null : (ns0) muVar.c(obj3);
                Object obj4 = list2.get(2);
                ns0 ns0Var5 = (nz.l(obj4, bool) || obj4 == null) ? null : (ns0) muVar.c(obj4);
                Object obj5 = list2.get(3);
                if (!nz.l(obj5, bool) && obj5 != null) {
                    ns0Var = (ns0) muVar.c(obj5);
                }
                return new uv0(ns0Var3, ns0Var4, ns0Var5, ns0Var);
            case 9:
                obj.getClass();
                List list3 = (List) obj;
                Object obj6 = list3.get(1);
                List list4 = (nz.l(obj6, Boolean.FALSE) || obj6 == null) ? null : (List) ((mu) sn0.a.f).c(obj6);
                Object obj7 = list3.get(0);
                String str = obj7 != null ? (String) obj7 : null;
                str.getClass();
                return new l7(list4, str);
            case 10:
                obj.getClass();
                return new gv0(((Integer) obj).intValue());
            case 11:
                obj.getClass();
                List list5 = (List) obj;
                return new lv0(((Number) list5.get(0)).floatValue(), ((Number) list5.get(1)).floatValue());
            case 12:
                obj.getClass();
                List list6 = (List) obj;
                Object obj8 = list6.get(0);
                gw0[] gw0VarArr = fw0.b;
                mu muVar2 = sn0.q.e;
                Boolean bool2 = Boolean.FALSE;
                nz.l(obj8, bool2);
                fw0 fw0Var = obj8 != null ? (fw0) muVar2.c(obj8) : null;
                fw0Var.getClass();
                long j = fw0Var.a;
                Object obj9 = list6.get(1);
                nz.l(obj9, bool2);
                fw0 fw0Var2 = obj9 != null ? (fw0) muVar2.c(obj9) : null;
                fw0Var2.getClass();
                return new mv0(j, fw0Var2.a);
            case 13:
                obj.getClass();
                return new ut(((Integer) obj).intValue());
            case 14:
                obj.getClass();
                return new i9(((Float) obj).floatValue());
            case 15:
                obj.getClass();
                List list7 = (List) obj;
                Object obj10 = list7.get(0);
                Integer num = obj10 != null ? (Integer) obj10 : null;
                num.getClass();
                int intValue = num.intValue();
                Object obj11 = list7.get(1);
                Integer num2 = obj11 != null ? (Integer) obj11 : null;
                num2.getClass();
                return new xv0(od0.c(intValue, num2.intValue()));
            case 16:
                obj.getClass();
                List list8 = (List) obj;
                Object obj12 = list8.get(0);
                int i2 = ge.h;
                Boolean bool3 = Boolean.FALSE;
                nz.l(obj12, bool3);
                ge geVar = obj12 != null ? nz.l(obj12, Boolean.FALSE) ? new ge(ge.g) : new ge(d31.c(((Integer) obj12).intValue())) : null;
                geVar.getClass();
                long j2 = geVar.a;
                Object obj13 = list8.get(1);
                rn0 rn0Var = sn0.r;
                nz.l(obj13, bool3);
                ra0 ra0Var = obj13 != null ? (ra0) rn0Var.e.c(obj13) : null;
                ra0Var.getClass();
                long j3 = ra0Var.a;
                Object obj14 = list8.get(2);
                Float f = obj14 != null ? (Float) obj14 : null;
                f.getClass();
                return new pq0(f.floatValue(), j2, j3);
            case 17:
                if (nz.l(obj, Boolean.FALSE)) {
                    return new fw0(fw0.c);
                }
                obj.getClass();
                List list9 = (List) obj;
                Object obj15 = list9.get(0);
                Float f2 = obj15 != null ? (Float) obj15 : null;
                f2.getClass();
                float floatValue = f2.floatValue();
                Object obj16 = list9.get(1);
                gw0 gw0Var = obj16 != null ? (gw0) obj16 : null;
                gw0Var.getClass();
                return new fw0(ze0.p(gw0Var.a, floatValue));
            case 18:
                obj.getClass();
                List list10 = (List) obj;
                Object obj17 = list10.get(0);
                String str2 = obj17 != null ? (String) obj17 : null;
                str2.getClass();
                Object obj18 = list10.get(1);
                j3 j3Var = sn0.i;
                if (!nz.l(obj18, Boolean.FALSE) && obj18 != null) {
                    uv0Var2 = (uv0) ((mu) j3Var.f).c(obj18);
                }
                return new f30(str2, uv0Var2);
            case 19:
                if (nz.l(obj, Boolean.FALSE)) {
                    return new ra0(9205357640488583168L);
                }
                obj.getClass();
                List list11 = (List) obj;
                Object obj19 = list11.get(0);
                Float f3 = obj19 != null ? (Float) obj19 : null;
                f3.getClass();
                float floatValue2 = f3.floatValue();
                Object obj20 = list11.get(1);
                (obj20 != null ? (Float) obj20 : null).getClass();
                return new ra0((Float.floatToRawIntBits(floatValue2) << 32) | (Float.floatToRawIntBits(r10.floatValue()) & 4294967295L));
            case 20:
                obj.getClass();
                List list12 = (List) obj;
                ArrayList arrayList = new ArrayList(list12.size());
                int size2 = list12.size();
                while (i < size2) {
                    Object obj21 = list12.get(i);
                    s30 s30Var = (nz.l(obj21, Boolean.FALSE) || obj21 == null) ? null : (s30) ((mu) sn0.t.f).c(obj21);
                    s30Var.getClass();
                    arrayList.add(s30Var);
                    i++;
                }
                return new t30(arrayList);
            case 21:
                obj.getClass();
                List list13 = (List) obj;
                ArrayList arrayList2 = new ArrayList(list13.size());
                int size3 = list13.size();
                while (i < size3) {
                    Object obj22 = list13.get(i);
                    k7 k7Var2 = (nz.l(obj22, Boolean.FALSE) || obj22 == null) ? null : (k7) ((mu) sn0.b.f).c(obj22);
                    k7Var2.getClass();
                    arrayList2.add(k7Var2);
                    i++;
                }
                return arrayList2;
            case 22:
                obj.getClass();
                return new s30(jg0.a.m((String) obj));
            case 23:
                obj.getClass();
                List list14 = (List) obj;
                Object obj23 = list14.get(0);
                w20 w20Var = obj23 != null ? (w20) obj23 : null;
                w20Var.getClass();
                float f4 = w20Var.a;
                Object obj24 = list14.get(1);
                y20 y20Var = obj24 != null ? (y20) obj24 : null;
                y20Var.getClass();
                int i3 = y20Var.a;
                Object obj25 = list14.get(2);
                (obj25 != null ? (x20) obj25 : null).getClass();
                return new z20(f4, i3);
            case 24:
                obj.getClass();
                List list15 = (List) obj;
                Object obj26 = list15.get(0);
                n7 n7Var = obj26 != null ? (n7) obj26 : null;
                n7Var.getClass();
                Object obj27 = list15.get(2);
                Integer num3 = obj27 != null ? (Integer) obj27 : null;
                num3.getClass();
                int intValue2 = num3.intValue();
                Object obj28 = list15.get(3);
                Integer num4 = obj28 != null ? (Integer) obj28 : null;
                num4.getClass();
                int intValue3 = num4.intValue();
                Object obj29 = list15.get(4);
                String str3 = obj29 != null ? (String) obj29 : null;
                str3.getClass();
                switch (n7Var.ordinal()) {
                    case 0:
                        Object obj30 = list15.get(1);
                        j3 j3Var2 = sn0.g;
                        if (!nz.l(obj30, Boolean.FALSE) && obj30 != null) {
                            wd0Var = (wd0) ((mu) j3Var2.f).c(obj30);
                        }
                        wd0Var.getClass();
                        k7Var = new k7(wd0Var, intValue2, intValue3, str3);
                        break;
                    case 1:
                        Object obj31 = list15.get(1);
                        j3 j3Var3 = sn0.h;
                        if (!nz.l(obj31, Boolean.FALSE) && obj31 != null) {
                            ns0Var2 = (ns0) ((mu) j3Var3.f).c(obj31);
                        }
                        ns0Var2.getClass();
                        k7Var = new k7(ns0Var2, intValue2, intValue3, str3);
                        break;
                    case 2:
                        Object obj32 = list15.get(1);
                        j3 j3Var4 = sn0.c;
                        if (!nz.l(obj32, Boolean.FALSE) && obj32 != null) {
                            qz0Var = (qz0) ((mu) j3Var4.f).c(obj32);
                        }
                        qz0Var.getClass();
                        k7Var = new k7(qz0Var, intValue2, intValue3, str3);
                        break;
                    case 3:
                        Object obj33 = list15.get(1);
                        j3 j3Var5 = sn0.d;
                        if (!nz.l(obj33, Boolean.FALSE) && obj33 != null) {
                            vy0Var = (vy0) ((mu) j3Var5.f).c(obj33);
                        }
                        vy0Var.getClass();
                        k7Var = new k7(vy0Var, intValue2, intValue3, str3);
                        break;
                    case 4:
                        Object obj34 = list15.get(1);
                        j3 j3Var6 = sn0.e;
                        if (!nz.l(obj34, Boolean.FALSE) && obj34 != null) {
                            f30Var = (f30) ((mu) j3Var6.f).c(obj34);
                        }
                        f30Var.getClass();
                        k7Var = new k7(f30Var, intValue2, intValue3, str3);
                        break;
                    case 5:
                        Object obj35 = list15.get(1);
                        j3 j3Var7 = sn0.f;
                        if (!nz.l(obj35, Boolean.FALSE) && obj35 != null) {
                            e30Var = (e30) ((mu) j3Var7.f).c(obj35);
                        }
                        e30Var.getClass();
                        k7Var = new k7(e30Var, intValue2, intValue3, str3);
                        break;
                    case 6:
                        Object obj36 = list15.get(1);
                        String str4 = obj36 != null ? (String) obj36 : null;
                        str4.getClass();
                        k7Var = new k7(new nt0(str4), intValue2, intValue3, str3);
                        break;
                    default:
                        g8.c();
                        return null;
                }
                return k7Var;
            case 25:
                String str5 = obj != null ? (String) obj : null;
                str5.getClass();
                return new qz0(str5);
            case 26:
                String str6 = obj != null ? (String) obj : null;
                str6.getClass();
                return new vy0(str6);
            case 27:
                obj.getClass();
                List list16 = (List) obj;
                Object obj37 = list16.get(0);
                String str7 = obj37 != null ? (String) obj37 : null;
                str7.getClass();
                Object obj38 = list16.get(1);
                j3 j3Var8 = sn0.i;
                if (!nz.l(obj38, Boolean.FALSE) && obj38 != null) {
                    uv0Var = (uv0) ((mu) j3Var8.f).c(obj38);
                }
                return new e30(str7, uv0Var);
            case 28:
                obj.getClass();
                List list17 = (List) obj;
                Object obj39 = list17.get(0);
                dv0 dv0Var = obj39 != null ? (dv0) obj39 : null;
                dv0Var.getClass();
                int i4 = dv0Var.a;
                Object obj40 = list17.get(1);
                iv0 iv0Var = obj40 != null ? (iv0) obj40 : null;
                iv0Var.getClass();
                int i5 = iv0Var.a;
                Object obj41 = list17.get(2);
                gw0[] gw0VarArr2 = fw0.b;
                rn0 rn0Var2 = sn0.q;
                Boolean bool4 = Boolean.FALSE;
                nz.l(obj41, bool4);
                fw0 fw0Var3 = obj41 != null ? (fw0) rn0Var2.e.c(obj41) : null;
                fw0Var3.getClass();
                long j4 = fw0Var3.a;
                Object obj42 = list17.get(3);
                mv0 mv0Var = mv0.c;
                mv0 mv0Var2 = (nz.l(obj42, bool4) || obj42 == null) ? null : (mv0) ((mu) sn0.l.f).c(obj42);
                Object obj43 = list17.get(4);
                lg0 lg0Var = (nz.l(obj43, bool4) || obj43 == null) ? null : (lg0) ((mu) mz.m.f).c(obj43);
                Object obj44 = list17.get(5);
                z20 z20Var = z20.c;
                z20 z20Var2 = (nz.l(obj44, bool4) || obj44 == null) ? null : (z20) ((mu) sn0.u.f).c(obj44);
                Object obj45 = list17.get(6);
                u20 u20Var = (nz.l(obj45, bool4) || obj45 == null) ? null : (u20) ((mu) mz.n.f).c(obj45);
                u20Var.getClass();
                int i6 = u20Var.a;
                Object obj46 = list17.get(7);
                qw qwVar = obj46 != null ? (qw) obj46 : null;
                qwVar.getClass();
                int i7 = qwVar.a;
                Object obj47 = list17.get(8);
                j3 j3Var9 = mz.o;
                if (!nz.l(obj47, bool4) && obj47 != null) {
                    wv0Var = (wv0) ((mu) j3Var9.f).c(obj47);
                }
                return new wd0(i4, i5, j4, mv0Var2, lg0Var, z20Var2, i6, i7, wv0Var);
            default:
                obj.getClass();
                List list18 = (List) obj;
                Object obj48 = list18.get(0);
                int i8 = ge.h;
                Boolean bool5 = Boolean.FALSE;
                nz.l(obj48, bool5);
                ge geVar2 = obj48 != null ? obj48.equals(bool5) ? new ge(ge.g) : new ge(d31.c(((Integer) obj48).intValue())) : null;
                geVar2.getClass();
                long j5 = geVar2.a;
                Object obj49 = list18.get(1);
                gw0[] gw0VarArr3 = fw0.b;
                mu muVar3 = sn0.q.e;
                nz.l(obj49, bool5);
                fw0 fw0Var4 = obj49 != null ? (fw0) muVar3.c(obj49) : null;
                fw0Var4.getClass();
                long j6 = fw0Var4.a;
                Object obj50 = list18.get(2);
                ut utVar = ut.e;
                ut utVar2 = (nz.l(obj50, bool5) || obj50 == null) ? null : (ut) ((mu) sn0.m.f).c(obj50);
                Object obj51 = list18.get(3);
                st stVar = obj51 != null ? (st) obj51 : null;
                Object obj52 = list18.get(4);
                tt ttVar = obj52 != null ? (tt) obj52 : null;
                Object obj53 = list18.get(6);
                String str8 = obj53 != null ? (String) obj53 : null;
                Object obj54 = list18.get(7);
                nz.l(obj54, bool5);
                fw0 fw0Var5 = obj54 != null ? (fw0) muVar3.c(obj54) : null;
                fw0Var5.getClass();
                long j7 = fw0Var5.a;
                Object obj55 = list18.get(8);
                i9 i9Var = (nz.l(obj55, bool5) || obj55 == null) ? null : (i9) ((mu) sn0.n.f).c(obj55);
                Object obj56 = list18.get(9);
                lv0 lv0Var = (nz.l(obj56, bool5) || obj56 == null) ? null : (lv0) ((mu) sn0.k.f).c(obj56);
                Object obj57 = list18.get(10);
                t30 t30Var = t30.f;
                t30 t30Var2 = (nz.l(obj57, bool5) || obj57 == null) ? null : (t30) ((mu) sn0.s.f).c(obj57);
                Object obj58 = list18.get(11);
                nz.l(obj58, bool5);
                ge geVar3 = obj58 != null ? obj58.equals(bool5) ? new ge(ge.g) : new ge(d31.c(((Integer) obj58).intValue())) : null;
                geVar3.getClass();
                long j8 = geVar3.a;
                Object obj59 = list18.get(12);
                gv0 gv0Var = (nz.l(obj59, bool5) || obj59 == null) ? null : (gv0) ((mu) sn0.j.f).c(obj59);
                Object obj60 = list18.get(13);
                pq0 pq0Var2 = pq0.d;
                j3 j3Var10 = sn0.o;
                if (!nz.l(obj60, bool5) && obj60 != null) {
                    pq0Var = (pq0) ((mu) j3Var10.f).c(obj60);
                }
                return new ns0(j5, j6, utVar2, stVar, ttVar, (qu0) null, str8, j7, i9Var, lv0Var, t30Var2, j8, gv0Var, pq0Var, 49184);
        }
    }
}
