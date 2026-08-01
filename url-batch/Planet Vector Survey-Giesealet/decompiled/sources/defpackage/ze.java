package defpackage;

import com.vectorharbor.planetvectorsurvey.ComposableSingletons$MainActivityKt;
import com.vectorharbor.planetvectorsurvey.ui.components.ComposableSingletons$RelayComponentsKt;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final /* synthetic */ class ze implements qu {
    public final /* synthetic */ int d;

    public /* synthetic */ ze(int i) {
        this.d = i;
    }

    @Override // defpackage.qu
    public final Object invoke(Object obj, Object obj2) {
        ky0 lambda_402480579$lambda$0;
        ky0 lambda_1299297320$lambda$1;
        ky0 lambda__998255631$lambda$2;
        ky0 lambda_1965612397$lambda$0;
        ky0 lambda_705031925$lambda$1;
        af afVar;
        n7 n7Var;
        Object a;
        int i = 0;
        switch (this.d) {
            case 0:
                String str = (String) obj;
                pj pjVar = (pj) obj2;
                str.getClass();
                pjVar.getClass();
                if (str.length() == 0) {
                    return pjVar.toString();
                }
                return str + ", " + pjVar;
            case 1:
                lambda_402480579$lambda$0 = ComposableSingletons$MainActivityKt.lambda_402480579$lambda$0((ih) obj, ((Integer) obj2).intValue());
                return lambda_402480579$lambda$0;
            case 2:
                lambda_1299297320$lambda$1 = ComposableSingletons$MainActivityKt.lambda_1299297320$lambda$1((ih) obj, ((Integer) obj2).intValue());
                return lambda_1299297320$lambda$1;
            case 3:
                lambda__998255631$lambda$2 = ComposableSingletons$MainActivityKt.lambda__998255631$lambda$2((ih) obj, ((Integer) obj2).intValue());
                return lambda__998255631$lambda$2;
            case 4:
                lambda_1965612397$lambda$0 = ComposableSingletons$RelayComponentsKt.lambda_1965612397$lambda$0((ih) obj, ((Integer) obj2).intValue());
                return lambda_1965612397$lambda$0;
            case 5:
                lambda_705031925$lambda$1 = ComposableSingletons$RelayComponentsKt.lambda_705031925$lambda$1((ih) obj, ((Integer) obj2).intValue());
                return lambda_705031925$lambda$1;
            case 6:
                rj rjVar = (rj) obj;
                pj pjVar2 = (pj) obj2;
                rjVar.getClass();
                pjVar2.getClass();
                rj s = rjVar.s(pjVar2.getKey());
                up upVar = up.d;
                if (s == upVar) {
                    return pjVar2;
                }
                b2 b2Var = b2.t;
                uj ujVar = (uj) s.k(b2Var);
                if (ujVar == null) {
                    afVar = new af(pjVar2, s);
                } else {
                    rj s2 = s.s(b2Var);
                    if (s2 == upVar) {
                        return new af(ujVar, pjVar2);
                    }
                    afVar = new af(ujVar, new af(pjVar2, s2));
                }
                return afVar;
            case 7:
                return ((rj) obj).i((pj) obj2);
            case 8:
                return ((rj) obj).i((pj) obj2);
            case 9:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool;
            case 10:
                return Integer.valueOf(((Integer) obj).intValue() + 1);
            case 11:
                wm0 wm0Var = (wm0) obj2;
                Map map = wm0Var.a;
                a70 a70Var = wm0Var.b;
                Object[] objArr = a70Var.b;
                Object[] objArr2 = a70Var.c;
                long[] jArr = a70Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i2 = 0;
                    while (true) {
                        long j = jArr[i2];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i3 = 8 - ((~(i2 - length)) >>> 31);
                            for (int i4 = 0; i4 < i3; i4++) {
                                if ((255 & j) < 128) {
                                    int i5 = (i2 << 3) + i4;
                                    Object obj3 = objArr[i5];
                                    Map c = ((xm0) objArr2[i5]).c();
                                    if (c.isEmpty()) {
                                        map.remove(obj3);
                                    } else {
                                        map.put(obj3, c);
                                    }
                                }
                                j >>= 8;
                            }
                            if (i3 != 8) {
                            }
                        }
                        if (i2 != length) {
                            i2++;
                        }
                    }
                }
                if (map.isEmpty()) {
                    return null;
                }
                return map;
            case 12:
                return obj2;
            case 13:
                l7 l7Var = (l7) obj2;
                return px0.h(l7Var.e, sn0.a(l7Var.d, sn0.a, (vm0) obj));
            case 14:
                return Integer.valueOf(((gv0) obj2).a);
            case 15:
                lv0 lv0Var = (lv0) obj2;
                return px0.h(Float.valueOf(lv0Var.a), Float.valueOf(lv0Var.b));
            case 16:
                vm0 vm0Var = (vm0) obj;
                mv0 mv0Var = (mv0) obj2;
                fw0 fw0Var = new fw0(mv0Var.a);
                rn0 rn0Var = sn0.q;
                return px0.h(sn0.a(fw0Var, rn0Var, vm0Var), sn0.a(new fw0(mv0Var.b), rn0Var, vm0Var));
            case 17:
                return Integer.valueOf(((ut) obj2).d);
            case 18:
                f30 f30Var = (f30) obj2;
                return px0.h(f30Var.a, sn0.a(f30Var.b, sn0.i, (vm0) obj));
            case 19:
                return Float.valueOf(((i9) obj2).a);
            case 20:
                vm0 vm0Var2 = (vm0) obj;
                List list = (List) obj2;
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                while (i < size) {
                    arrayList.add(sn0.a((k7) list.get(i), sn0.b, vm0Var2));
                    i++;
                }
                return arrayList;
            case 21:
                xv0 xv0Var = (xv0) obj2;
                return px0.h(Integer.valueOf((int) (xv0Var.a >> 32)), Integer.valueOf((int) (4294967295L & xv0Var.a)));
            case 22:
                vm0 vm0Var3 = (vm0) obj;
                pq0 pq0Var = (pq0) obj2;
                return px0.h(sn0.a(new ge(pq0Var.a), sn0.p, vm0Var3), sn0.a(new ra0(pq0Var.b), sn0.r, vm0Var3), Float.valueOf(pq0Var.c));
            case 23:
                fw0 fw0Var2 = (fw0) obj2;
                return fw0Var2 == null ? false : fw0.a(fw0Var2.a, fw0.c) ? Boolean.FALSE : px0.h(Float.valueOf(fw0.c(fw0Var2.a)), new gw0(fw0.b(fw0Var2.a)));
            case 24:
                ra0 ra0Var = (ra0) obj2;
                return ra0Var == null ? false : ra0.b(ra0Var.a, 9205357640488583168L) ? Boolean.FALSE : px0.h(Float.valueOf(Float.intBitsToFloat((int) (ra0Var.a >> 32))), Float.valueOf(Float.intBitsToFloat((int) (4294967295L & ra0Var.a))));
            case 25:
                vm0 vm0Var4 = (vm0) obj;
                List list2 = ((t30) obj2).d;
                ArrayList arrayList2 = new ArrayList(list2.size());
                int size2 = list2.size();
                while (i < size2) {
                    arrayList2.add(sn0.a((s30) list2.get(i), sn0.t, vm0Var4));
                    i++;
                }
                return arrayList2;
            case 26:
                return ((s30) obj2).a.toLanguageTag();
            case 27:
                z20 z20Var = (z20) obj2;
                return px0.h(new w20(z20Var.a), new y20(z20Var.b), new x20());
            case 28:
                vm0 vm0Var5 = (vm0) obj;
                k7 k7Var = (k7) obj2;
                Object obj4 = k7Var.a;
                if (obj4 instanceof wd0) {
                    n7Var = n7.d;
                } else if (obj4 instanceof ns0) {
                    n7Var = n7.e;
                } else if (obj4 instanceof qz0) {
                    n7Var = n7.f;
                } else if (obj4 instanceof vy0) {
                    n7Var = n7.g;
                } else if (obj4 instanceof f30) {
                    n7Var = n7.h;
                } else if (obj4 instanceof e30) {
                    n7Var = n7.i;
                } else {
                    if (!(obj4 instanceof nt0)) {
                        throw new UnsupportedOperationException();
                    }
                    n7Var = n7.j;
                }
                switch (n7Var.ordinal()) {
                    case 0:
                        obj4.getClass();
                        a = sn0.a((wd0) obj4, sn0.g, vm0Var5);
                        break;
                    case 1:
                        obj4.getClass();
                        a = sn0.a((ns0) obj4, sn0.h, vm0Var5);
                        break;
                    case 2:
                        obj4.getClass();
                        a = sn0.a((qz0) obj4, sn0.c, vm0Var5);
                        break;
                    case 3:
                        obj4.getClass();
                        a = sn0.a((vy0) obj4, sn0.d, vm0Var5);
                        break;
                    case 4:
                        obj4.getClass();
                        a = sn0.a((f30) obj4, sn0.e, vm0Var5);
                        break;
                    case 5:
                        obj4.getClass();
                        a = sn0.a((e30) obj4, sn0.f, vm0Var5);
                        break;
                    case 6:
                        obj4.getClass();
                        a = ((nt0) obj4).a;
                        break;
                    default:
                        g8.c();
                        return null;
                }
                return px0.h(n7Var, a, Integer.valueOf(k7Var.b), Integer.valueOf(k7Var.c), k7Var.d);
            default:
                e30 e30Var = (e30) obj2;
                return px0.h(e30Var.a, sn0.a(e30Var.b, sn0.i, (vm0) obj));
        }
    }
}
