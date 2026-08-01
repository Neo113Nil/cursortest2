package defpackage;

import java.util.Comparator;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class us implements Comparator {
    public static final us b = new us(0);
    public static final us c = new us(1);
    public static final us d = new us(2);
    public static final us e = new us(3);
    public static final us f = new us(4);
    public final /* synthetic */ int a;

    public /* synthetic */ us(int i) {
        this.a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.lang.Object, java.lang.Object[]] */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ts tsVar = (ts) obj;
                ts tsVar2 = (ts) obj2;
                if (!nz.H(tsVar) || !nz.H(tsVar2)) {
                    if (nz.H(tsVar)) {
                        return -1;
                    }
                    return nz.H(tsVar2) ? 1 : 0;
                }
                p10 a0 = nz.a0(tsVar);
                p10 a02 = nz.a0(tsVar2);
                if (nz.l(a0, a02)) {
                    return 0;
                }
                p10[] p10VarArr = new p10[16];
                int i = 0;
                while (a0 != null) {
                    int i2 = i + 1;
                    if (p10VarArr.length < i2) {
                        int length = p10VarArr.length;
                        ?? r4 = new Object[Math.max(i2, length * 2)];
                        System.arraycopy(p10VarArr, 0, r4, 0, length);
                        p10VarArr = r4;
                    }
                    if (i != 0) {
                        System.arraycopy(p10VarArr, 0, p10VarArr, 0 + 1, i + 0);
                    }
                    p10VarArr[0] = a0;
                    i++;
                    a0 = a0.n();
                }
                p10[] p10VarArr2 = new p10[16];
                int i3 = 0;
                while (a02 != null) {
                    int i4 = i3 + 1;
                    if (p10VarArr2.length < i4) {
                        int length2 = p10VarArr2.length;
                        ?? r42 = new Object[Math.max(i4, length2 * 2)];
                        System.arraycopy(p10VarArr2, 0, r42, 0, length2);
                        p10VarArr2 = r42;
                    }
                    if (i3 != 0) {
                        System.arraycopy(p10VarArr2, 0, p10VarArr2, 0 + 1, i3 + 0);
                    }
                    p10VarArr2[0] = a02;
                    i3++;
                    a02 = a02.n();
                }
                int min = Math.min(i - 1, i3 - 1);
                if (min >= 0) {
                    int i5 = 0;
                    while (nz.l(p10VarArr[i5], p10VarArr2[i5])) {
                        if (i5 != min) {
                            i5++;
                        }
                    }
                    return nz.s(p10VarArr[i5].o(), p10VarArr2[i5].o());
                }
                g8.s("Could not find a common ancestor between the two FocusModifiers.");
                return 0;
            case 1:
                zi0 h = ((rp0) obj).h();
                zi0 h2 = ((rp0) obj2).h();
                int compare = Float.compare(h.a, h2.a);
                if (compare != 0) {
                    return compare;
                }
                int compare2 = Float.compare(h.b, h2.b);
                if (compare2 != 0) {
                    return compare2;
                }
                int compare3 = Float.compare(h.d, h2.d);
                return compare3 != 0 ? compare3 : Float.compare(h.c, h2.c);
            case 2:
                p10 p10Var = (p10) obj;
                p10 p10Var2 = (p10) obj2;
                int s = nz.s(p10Var2.q, p10Var.q);
                return s != 0 ? s : nz.s(p10Var.hashCode(), p10Var2.hashCode());
            case 3:
                zi0 h3 = ((rp0) obj).h();
                zi0 h4 = ((rp0) obj2).h();
                int compare4 = Float.compare(h4.c, h3.c);
                if (compare4 != 0) {
                    return compare4;
                }
                int compare5 = Float.compare(h3.b, h4.b);
                if (compare5 != 0) {
                    return compare5;
                }
                int compare6 = Float.compare(h3.d, h4.d);
                return compare6 != 0 ? compare6 : Float.compare(h4.a, h3.a);
            case 4:
                pd0 pd0Var = (pd0) obj;
                pd0 pd0Var2 = (pd0) obj2;
                int compare7 = Float.compare(((zi0) pd0Var.d).b, ((zi0) pd0Var2.d).b);
                return compare7 != 0 ? compare7 : Float.compare(((zi0) pd0Var.d).d, ((zi0) pd0Var2.d).d);
            case 5:
                return mz.w(Integer.valueOf(((k7) obj).b), Integer.valueOf(((k7) obj2).b));
            case 6:
                return mz.w(Integer.valueOf(((k7) obj).b), Integer.valueOf(((k7) obj2).b));
            default:
                p10 p10Var3 = (p10) obj;
                p10 p10Var4 = (p10) obj2;
                int s2 = nz.s(p10Var3.q, p10Var4.q);
                return s2 != 0 ? s2 : nz.s(p10Var3.hashCode(), p10Var4.hashCode());
        }
    }
}
