package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class q6 implements g50 {
    public final w6 a;
    public boolean b;

    public q6(w6 w6Var) {
        this.a = w6Var;
    }

    @Override // defpackage.g50
    public final e40 f(f40 f40Var, List list, long j) {
        Object obj;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(((b50) list.get(i)).d(j));
        }
        Object obj2 = null;
        if (arrayList.isEmpty()) {
            obj = null;
        } else {
            obj = arrayList.get(0);
            int i2 = ((yf0) obj).d;
            int size2 = arrayList.size() - 1;
            if (1 <= size2) {
                int i3 = 1;
                while (true) {
                    Object obj3 = arrayList.get(i3);
                    int i4 = ((yf0) obj3).d;
                    if (i2 < i4) {
                        obj = obj3;
                        i2 = i4;
                    }
                    if (i3 == size2) {
                        break;
                    }
                    i3++;
                }
            }
        }
        yf0 yf0Var = (yf0) obj;
        int i5 = yf0Var != null ? yf0Var.d : 0;
        if (!arrayList.isEmpty()) {
            obj2 = arrayList.get(0);
            int i6 = ((yf0) obj2).e;
            int size3 = arrayList.size() - 1;
            if (1 <= size3) {
                int i7 = 1;
                while (true) {
                    Object obj4 = arrayList.get(i7);
                    int i8 = ((yf0) obj4).e;
                    if (i6 < i8) {
                        obj2 = obj4;
                        i6 = i8;
                    }
                    if (i7 == size3) {
                        break;
                    }
                    i7++;
                }
            }
        }
        yf0 yf0Var2 = (yf0) obj2;
        int i9 = yf0Var2 != null ? yf0Var2.e : 0;
        boolean f0 = f40Var.f0();
        w6 w6Var = this.a;
        if (f0) {
            this.b = true;
            w6Var.a.setValue(new iz(px0.c(i5, i9)));
        } else if (!this.b) {
            w6Var.a.setValue(new iz(px0.c(i5, i9)));
        }
        return f40Var.h0(i5, i9, xp.d, new j4(1, arrayList));
    }
}
