package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public abstract class aq0 {
    public static final Comparator[] a;
    public static final h6 b;

    static {
        Comparator[] comparatorArr = new Comparator[2];
        int i = 0;
        while (i < 2) {
            comparatorArr[i] = new zp0(new zp0(i == 0 ? us.e : us.c));
            i++;
        }
        a = comparatorArr;
        b = h6.H;
    }

    public static final void a(rp0 rp0Var, ArrayList arrayList, f2 f2Var, f2 f2Var2, p60 p60Var) {
        np0 np0Var = rp0Var.d;
        Object g = np0Var.d.g(vp0.m);
        if (g == null) {
            g = Boolean.FALSE;
        }
        boolean booleanValue = ((Boolean) g).booleanValue();
        if ((booleanValue || ((Boolean) f2Var2.c(rp0Var)).booleanValue()) && ((Boolean) f2Var.c(rp0Var)).booleanValue()) {
            arrayList.add(rp0Var);
        }
        if (booleanValue) {
            p60Var.h(rp0Var.g, b(rp0Var, f2Var, f2Var2, rp0.j(7, rp0Var)));
            return;
        }
        List j = rp0.j(7, rp0Var);
        int size = j.size();
        for (int i = 0; i < size; i++) {
            a((rp0) j.get(i), arrayList, f2Var, f2Var2, p60Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00f3 A[LOOP:1: B:11:0x0046->B:29:0x00f3, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00fa A[EDGE_INSN: B:30:0x00fa->B:31:0x00fa BREAK  A[LOOP:1: B:11:0x0046->B:29:0x00f3], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final ArrayList b(rp0 rp0Var, f2 f2Var, f2 f2Var2, List list) {
        int i;
        p60 p60Var = az.a;
        p60 p60Var2 = new p60();
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            a((rp0) list.get(i2), arrayList, f2Var, f2Var2, p60Var2);
        }
        int i3 = 1;
        char c = rp0Var.c.z == c10.e ? (char) 1 : (char) 0;
        ArrayList arrayList2 = new ArrayList(arrayList.size() / 2);
        int size2 = arrayList.size() - 1;
        if (size2 >= 0) {
            int i4 = 0;
            while (true) {
                rp0 rp0Var2 = (rp0) arrayList.get(i4);
                if (i4 != 0) {
                    float f = rp0Var2.h().b;
                    float f2 = rp0Var2.h().d;
                    int i5 = f >= f2 ? i3 : 0;
                    int size3 = arrayList2.size() - i3;
                    if (size3 >= 0) {
                        int i6 = 0;
                        while (true) {
                            zi0 zi0Var = (zi0) ((pd0) arrayList2.get(i6)).d;
                            i = 0;
                            float f3 = zi0Var.b;
                            float f4 = zi0Var.d;
                            boolean z = f3 >= f4;
                            if (i5 == 0 && !z && Math.max(f, f3) < Math.min(f2, f4)) {
                                arrayList2.set(i6, new pd0(new zi0(Math.max(zi0Var.a, 0.0f), Math.max(zi0Var.b, f), Math.min(zi0Var.c, Float.POSITIVE_INFINITY), Math.min(f4, f2)), ((pd0) arrayList2.get(i6)).e));
                                ((List) ((pd0) arrayList2.get(i6)).e).add(rp0Var2);
                                break;
                            }
                            if (i6 == size3) {
                                break;
                            }
                            i6++;
                        }
                        zi0 h = rp0Var2.h();
                        rp0[] rp0VarArr = new rp0[1];
                        rp0VarArr[i] = rp0Var2;
                        arrayList2.add(new pd0(h, new ArrayList(new b8(rp0VarArr, true))));
                        if (i4 != size2) {
                            break;
                        }
                        i4++;
                        i3 = 1;
                    }
                }
                i = 0;
                zi0 h2 = rp0Var2.h();
                rp0[] rp0VarArr2 = new rp0[1];
                rp0VarArr2[i] = rp0Var2;
                arrayList2.add(new pd0(h2, new ArrayList(new b8(rp0VarArr2, true))));
                if (i4 != size2) {
                }
            }
        } else {
            i = 0;
        }
        de.Z(arrayList2, us.f);
        ArrayList arrayList3 = new ArrayList();
        Comparator comparator = a[c ^ 1];
        int size4 = arrayList2.size();
        for (int i7 = i; i7 < size4; i7++) {
            pd0 pd0Var = (pd0) arrayList2.get(i7);
            de.Z((List) pd0Var.e, comparator);
            arrayList3.addAll((Collection) pd0Var.e);
        }
        de.Z(arrayList3, new df(1, b));
        int i8 = i;
        while (i8 <= arrayList3.size() - 1) {
            List list2 = (List) p60Var2.b(((rp0) arrayList3.get(i8)).g);
            if (list2 != null) {
                if (((Boolean) f2Var2.c(arrayList3.get(i8))).booleanValue()) {
                    i8++;
                } else {
                    arrayList3.remove(i8);
                }
                arrayList3.addAll(i8, list2);
                i8 += list2.size();
            } else {
                i8++;
            }
        }
        return arrayList3;
    }
}
