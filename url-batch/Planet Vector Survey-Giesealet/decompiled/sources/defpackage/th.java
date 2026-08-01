package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public abstract class th {
    public static final jb0 a = new jb0("provider");
    public static final jb0 b = new jb0("provider");
    public static final jb0 c = new jb0("compositionLocalMap");
    public static final jb0 d = new jb0("providers");
    public static final jb0 e = new jb0("reference");
    public static final rh f = new rh(0);

    public static final void a(ArrayList arrayList, int i, int i2) {
        int e2 = e(arrayList, i);
        if (e2 < 0) {
            e2 = -(e2 + 1);
        }
        while (e2 < arrayList.size() && ((uz) arrayList.get(e2)).b < i2) {
        }
    }

    public static final void b(ir0 ir0Var, ArrayList arrayList, int i) {
        boolean l = ir0Var.l(i);
        int[] iArr = ir0Var.b;
        if (l) {
            arrayList.add(ir0Var.n(i));
            return;
        }
        int i2 = iArr[(i * 5) + 3] + i;
        for (int i3 = i + 1; i3 < i2; i3 += iArr[(i3 * 5) + 3]) {
            b(ir0Var, arrayList, i3);
        }
    }

    public static final void c(String str) {
        throw new vg("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (" + str + "). Please report to Google or use https://goo.gle/compose-feedback");
    }

    public static final Void d(String str) {
        throw new vg("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (" + str + "). Please report to Google or use https://goo.gle/compose-feedback");
    }

    public static final int e(List list, int i) {
        int size = list.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            int s = nz.s(((uz) list.get(i3)).b, i);
            if (s < 0) {
                i2 = i3 + 1;
            } else {
                if (s <= 0) {
                    return i3;
                }
                size = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x00fb, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void f(mr0 mr0Var, ca0 ca0Var) {
        sh shVar;
        int i;
        int i2;
        sh shVar2;
        h2 h2Var;
        int i3 = mr0Var.t;
        int i4 = 0;
        sh shVar3 = new sh(i4, ca0Var);
        int C = mr0Var.C(mr0Var.b, i3);
        int o = mr0Var.o();
        int s = mr0Var.s(i3) + i3;
        q60 q60Var = null;
        int i5 = i3;
        o60 o60Var = null;
        loop0: while (i5 < s) {
            int i6 = i5 + 1;
            int f2 = mr0Var.f(i6);
            for (int f3 = mr0Var.f(i5); f3 < f2; f3++) {
                Object obj = mr0Var.c[mr0Var.h(f3)];
                if ((obj instanceof dk0) && (h2Var = ((dk0) obj).b) != null && h2Var.a()) {
                    int c2 = mr0Var.c(h2Var);
                    if (q60Var == null) {
                        int[] iArr = hz.a;
                        q60Var = new q60();
                    }
                    if (o60Var == null) {
                        o60Var = new o60();
                    }
                    q60Var.a(c2);
                    o60Var.a(c2);
                    o60Var.a(f3);
                } else {
                    shVar3.invoke(Integer.valueOf(f3), obj);
                }
            }
            int C2 = i6 < o ? mr0Var.C(mr0Var.b, i6) : -1;
            if (C2 != i5) {
                while (true) {
                    if (o60Var == null || q60Var == null || !q60Var.e(i5)) {
                        shVar = shVar3;
                        i = o;
                    } else {
                        int i7 = o60Var.b;
                        int i8 = i7 / 2;
                        int i9 = i4;
                        int i10 = i9;
                        while (i9 < i8) {
                            int i11 = i9 * 2;
                            int i12 = o;
                            int b2 = o60Var.b(i11);
                            if (b2 == i5) {
                                int b3 = o60Var.b(i11 + 1);
                                shVar3.invoke(Integer.valueOf(b3), mr0Var.c[mr0Var.h(b3)]);
                                shVar2 = shVar3;
                            } else if (i11 != i10) {
                                shVar2 = shVar3;
                                int i13 = i10 + 1;
                                o60Var.d(i10, b2);
                                i10 += 2;
                                o60Var.d(i13, o60Var.b(i11 + 1));
                            } else {
                                shVar2 = shVar3;
                                i10 += 2;
                            }
                            i9++;
                            o = i12;
                            shVar3 = shVar2;
                        }
                        shVar = shVar3;
                        i = o;
                        if (i10 != i7) {
                            if (i10 < 0 || i10 > (i2 = o60Var.b) || i7 < 0 || i7 > i2) {
                                break loop0;
                            }
                            if (i7 < i10) {
                                g8.r("The end index must be < start index");
                                return;
                            } else if (i7 != i10) {
                                if (i7 < i2) {
                                    int[] iArr2 = o60Var.a;
                                    p8.R(iArr2, iArr2, i10, i7, i2);
                                }
                                o60Var.b -= i7 - i10;
                            }
                        }
                    }
                    if (i5 != i3 && C != C2) {
                        o = i;
                        i5 = C;
                        i4 = 0;
                        C = mr0Var.C(mr0Var.b, C);
                        shVar3 = shVar;
                    }
                }
            } else {
                shVar = shVar3;
                i = o;
            }
            o = i;
            C = C2;
            i5 = i6;
            shVar3 = shVar;
            i4 = 0;
        }
        mr0Var.F();
    }
}
