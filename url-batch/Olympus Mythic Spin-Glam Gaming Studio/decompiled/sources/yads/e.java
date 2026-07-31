package yads;

import android.util.Pair;

/* loaded from: classes3.dex */
public abstract class e extends g73 {
    public final int c;
    public final hz2 d;

    public e(hz2 hz2Var) {
        this.d = hz2Var;
        this.c = hz2Var.b.length;
    }

    public static Object b(Object obj) {
        return ((Pair) obj).second;
    }

    public static Object c(Object obj) {
        return ((Pair) obj).first;
    }

    @Override // yads.g73
    public final d73 a(Object obj, d73 d73Var) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        vf2 vf2Var = (vf2) this;
        Integer num = (Integer) vf2Var.k.get(obj2);
        int intValue = num == null ? -1 : num.intValue();
        int i = vf2Var.h[intValue];
        vf2Var.i[intValue].a(obj3, d73Var);
        d73Var.d += i;
        d73Var.c = obj;
        return d73Var;
    }

    @Override // yads.g73
    public final int b(boolean z) {
        int i;
        int i2 = this.c;
        if (i2 == 0) {
            return -1;
        }
        if (z) {
            int[] iArr = this.d.b;
            i = iArr.length > 0 ? iArr[iArr.length - 1] : -1;
        } else {
            i = i2 - 1;
        }
        do {
            vf2 vf2Var = (vf2) this;
            if (!vf2Var.i[i].c()) {
                return vf2Var.i[i].b(z) + vf2Var.h[i];
            }
            i = b(z, i);
        } while (i != -1);
        return -1;
    }

    public static Object a(Object obj, Object obj2) {
        return Pair.create(obj, obj2);
    }

    @Override // yads.g73
    public final int a(int i, int i2, boolean z) {
        vf2 vf2Var = (vf2) this;
        int a = sb3.a(vf2Var.h, i + 1, false, false);
        int i3 = vf2Var.h[a];
        int a2 = vf2Var.i[a].a(i - i3, i2 != 2 ? i2 : 0, z);
        if (a2 != -1) {
            return i3 + a2;
        }
        int a3 = a(z, a);
        while (a3 != -1 && vf2Var.i[a3].c()) {
            a3 = a(z, a3);
        }
        if (a3 != -1) {
            return vf2Var.i[a3].a(z) + vf2Var.h[a3];
        }
        if (i2 == 2) {
            return a(z);
        }
        return -1;
    }

    public final int b(boolean z, int i) {
        if (!z) {
            if (i > 0) {
                return i - 1;
            }
            return -1;
        }
        hz2 hz2Var = this.d;
        int i2 = hz2Var.c[i] - 1;
        if (i2 >= 0) {
            return hz2Var.b[i2];
        }
        return -1;
    }

    @Override // yads.g73
    public final int a(int i, int i2) {
        vf2 vf2Var = (vf2) this;
        int a = sb3.a(vf2Var.h, i + 1, false, false);
        int i3 = vf2Var.h[a];
        int a2 = vf2Var.i[a].a(i - i3, i2 == 2 ? 0 : i2);
        if (a2 != -1) {
            return i3 + a2;
        }
        int b = b(false, a);
        while (b != -1 && vf2Var.i[b].c()) {
            b = b(false, b);
        }
        if (b != -1) {
            return vf2Var.i[b].b(false) + vf2Var.h[b];
        }
        if (i2 == 2) {
            return b(false);
        }
        return -1;
    }

    @Override // yads.g73
    public final int a(boolean z) {
        if (this.c == 0) {
            return -1;
        }
        int i = 0;
        if (z) {
            int[] iArr = this.d.b;
            i = iArr.length > 0 ? iArr[0] : -1;
        }
        do {
            vf2 vf2Var = (vf2) this;
            if (vf2Var.i[i].c()) {
                i = a(z, i);
            } else {
                return vf2Var.i[i].a(z) + vf2Var.h[i];
            }
        } while (i != -1);
        return -1;
    }

    @Override // yads.g73
    public final f73 a(int i, f73 f73Var, long j) {
        vf2 vf2Var = (vf2) this;
        int a = sb3.a(vf2Var.h, i + 1, false, false);
        int i2 = vf2Var.h[a];
        int i3 = vf2Var.g[a];
        vf2Var.i[a].a(i - i2, f73Var, j);
        Object obj = vf2Var.j[a];
        if (!f73.s.equals(f73Var.b)) {
            obj = Pair.create(obj, f73Var.b);
        }
        f73Var.b = obj;
        f73Var.p += i3;
        f73Var.q += i3;
        return f73Var;
    }

    @Override // yads.g73
    public final d73 a(int i, d73 d73Var, boolean z) {
        vf2 vf2Var = (vf2) this;
        int a = sb3.a(vf2Var.g, i + 1, false, false);
        int i2 = vf2Var.h[a];
        vf2Var.i[a].a(i - vf2Var.g[a], d73Var, z);
        d73Var.d += i2;
        if (z) {
            Object obj = vf2Var.j[a];
            Object obj2 = d73Var.c;
            obj2.getClass();
            d73Var.c = Pair.create(obj, obj2);
        }
        return d73Var;
    }

    @Override // yads.g73
    public final int a(Object obj) {
        int a;
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        vf2 vf2Var = (vf2) this;
        Integer num = (Integer) vf2Var.k.get(obj2);
        int intValue = num == null ? -1 : num.intValue();
        if (intValue == -1 || (a = vf2Var.i[intValue].a(obj3)) == -1) {
            return -1;
        }
        return vf2Var.g[intValue] + a;
    }

    @Override // yads.g73
    public final Object a(int i) {
        vf2 vf2Var = (vf2) this;
        int a = sb3.a(vf2Var.g, i + 1, false, false);
        return Pair.create(vf2Var.j[a], vf2Var.i[a].a(i - vf2Var.g[a]));
    }

    public final int a(boolean z, int i) {
        if (z) {
            hz2 hz2Var = this.d;
            int i2 = hz2Var.c[i] + 1;
            int[] iArr = hz2Var.b;
            if (i2 < iArr.length) {
                return iArr[i2];
            }
        } else if (i < this.c - 1) {
            return i + 1;
        }
        return -1;
    }
}
