package yads;

import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;

/* loaded from: classes14.dex */
public abstract class q41 extends f41 implements Set {
    public transient l41 c;

    public static int a(int i) {
        int max = Math.max(i, 2);
        if (max >= 751619276) {
            if (max < 1073741824) {
                return 1073741824;
            }
            throw new IllegalArgumentException("collection too large");
        }
        int highestOneBit = Integer.highestOneBit(max - 1) << 1;
        while (highestOneBit * 0.7d < max) {
            highestOneBit <<= 1;
        }
        return highestOneBit;
    }

    public static q41 b(int i, Object... objArr) {
        if (i == 0) {
            return an2.j;
        }
        if (i == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new i03(obj);
        }
        int a = a(i);
        Object[] objArr2 = new Object[a];
        int i2 = a - 1;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            Object obj2 = objArr[i5];
            if (obj2 == null) {
                throw new NullPointerException(gg2.a(i5, "at index "));
            }
            int hashCode = obj2.hashCode();
            int a2 = rz0.a(hashCode);
            while (true) {
                int i6 = a2 & i2;
                Object obj3 = objArr2[i6];
                if (obj3 == null) {
                    objArr[i4] = obj2;
                    objArr2[i6] = obj2;
                    i3 += hashCode;
                    i4++;
                    break;
                }
                if (obj3.equals(obj2)) {
                    break;
                }
                a2++;
            }
        }
        Arrays.fill(objArr, i4, i, (Object) null);
        if (i4 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new i03(obj4);
        }
        if (a(i4) < a / 2) {
            return b(i4, objArr);
        }
        int length = objArr.length;
        if (i4 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i4);
        }
        return new an2(objArr, i3, objArr2, i2, i4);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof q41) && (this instanceof an2)) {
            q41 q41Var = (q41) obj;
            q41Var.getClass();
            if ((q41Var instanceof an2) && hashCode() != obj.hashCode()) {
                return false;
            }
        }
        return az2.a(this, obj);
    }

    public l41 f() {
        Object[] array = toArray(f41.b);
        i41 i41Var = l41.c;
        return l41.b(array.length, array);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return az2.a(this);
    }

    @Override // yads.f41
    public Object writeReplace() {
        return new p41(toArray(f41.b));
    }

    public static q41 a(Collection collection) {
        if ((collection instanceof q41) && !(collection instanceof SortedSet)) {
            q41 q41Var = (q41) collection;
            if (!q41Var.e()) {
                return q41Var;
            }
        }
        Object[] array = collection.toArray();
        return b(array.length, array);
    }

    @Override // yads.f41
    public l41 a() {
        l41 l41Var = this.c;
        if (l41Var != null) {
            return l41Var;
        }
        l41 f = f();
        this.c = f;
        return f;
    }
}
