package yads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes6.dex */
public final class uo3 implements c53 {
    public final List b;
    public final long[] c;
    public final long[] d;

    public uo3(ArrayList arrayList) {
        this.b = Collections.unmodifiableList(new ArrayList(arrayList));
        this.c = new long[arrayList.size() * 2];
        for (int i = 0; i < arrayList.size(); i++) {
            mo3 mo3Var = (mo3) arrayList.get(i);
            int i2 = i * 2;
            long[] jArr = this.c;
            jArr[i2] = mo3Var.b;
            jArr[i2 + 1] = mo3Var.c;
        }
        long[] jArr2 = this.c;
        long[] copyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.d = copyOf;
        Arrays.sort(copyOf);
    }

    @Override // yads.c53
    public final int a(long j) {
        int a = sb3.a(this.d, j, false);
        if (a < this.d.length) {
            return a;
        }
        return -1;
    }

    @Override // yads.c53
    public final List b(long j) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < this.b.size(); i++) {
            long[] jArr = this.c;
            int i2 = i * 2;
            if (jArr[i2] <= j && j < jArr[i2 + 1]) {
                mo3 mo3Var = (mo3) this.b.get(i);
                s20 s20Var = mo3Var.a;
                if (s20Var.f == -3.4028235E38f) {
                    arrayList2.add(mo3Var);
                } else {
                    arrayList.add(s20Var);
                }
            }
        }
        Collections.sort(arrayList2, new Comparator() { // from class: yads.uo3$$ExternalSyntheticLambda0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int compare;
                compare = Long.compare(((mo3) obj).b, ((mo3) obj2).b);
                return compare;
            }
        });
        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
            s20 s20Var2 = ((mo3) arrayList2.get(i3)).a;
            s20Var2.getClass();
            arrayList.add(new s20(s20Var2.b, s20Var2.c, s20Var2.d, s20Var2.e, (-1) - i3, 1, s20Var2.h, s20Var2.i, s20Var2.j, s20Var2.o, s20Var2.p, s20Var2.k, s20Var2.l, s20Var2.m, s20Var2.n, s20Var2.q, s20Var2.r));
        }
        return arrayList;
    }

    @Override // yads.c53
    public final int a() {
        return this.d.length;
    }

    @Override // yads.c53
    public final long a(int i) {
        if (i >= 0) {
            long[] jArr = this.d;
            if (i < jArr.length) {
                return jArr[i];
            }
            throw new IllegalArgumentException();
        }
        throw new IllegalArgumentException();
    }
}
