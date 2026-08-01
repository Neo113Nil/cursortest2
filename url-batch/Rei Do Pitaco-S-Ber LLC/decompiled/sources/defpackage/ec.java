package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class ec {
    public int b;
    public boolean c;
    public final tc d;
    public final int e;
    public ec f;
    public o20 i;
    public HashSet a = null;
    public int g = 0;
    public int h = Integer.MIN_VALUE;

    public ec(tc tcVar, int i) {
        this.d = tcVar;
        this.e = i;
    }

    public final void a(ec ecVar, int i) {
        b(ecVar, i, Integer.MIN_VALUE, false);
    }

    public final boolean b(ec ecVar, int i, int i2, boolean z) {
        if (ecVar == null) {
            j();
            return true;
        }
        if (!z && !i(ecVar)) {
            return false;
        }
        this.f = ecVar;
        if (ecVar.a == null) {
            ecVar.a = new HashSet();
        }
        HashSet hashSet = this.f.a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.g = i;
        this.h = i2;
        return true;
    }

    public final void c(int i, v90 v90Var, ArrayList arrayList) {
        HashSet hashSet = this.a;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                g8.x(((ec) it.next()).d, i, arrayList, v90Var);
            }
        }
    }

    public final int d() {
        if (this.c) {
            return this.b;
        }
        return 0;
    }

    public final int e() {
        ec ecVar;
        if (this.d.g0 == 8) {
            return 0;
        }
        int i = this.h;
        return (i == Integer.MIN_VALUE || (ecVar = this.f) == null || ecVar.d.g0 != 8) ? this.g : i;
    }

    public final ec f() {
        int i = this.e;
        int h = n20.h(i);
        tc tcVar = this.d;
        switch (h) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
                return tcVar.K;
            case 2:
                return tcVar.L;
            case 3:
                return tcVar.I;
            case 4:
                return tcVar.J;
            default:
                throw new AssertionError(n20.g(i));
        }
    }

    public final boolean g() {
        HashSet hashSet = this.a;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((ec) it.next()).f().h()) {
                return true;
            }
        }
        return false;
    }

    public final boolean h() {
        return this.f != null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0063 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean i(ec ecVar) {
        if (ecVar != null) {
            tc tcVar = ecVar.d;
            int i = ecVar.e;
            int i2 = this.e;
            if (i != i2) {
                switch (n20.h(i2)) {
                    case 0:
                    case 7:
                    case 8:
                        break;
                    case 1:
                    case 3:
                        boolean z = i == 2 || i == 4;
                        if (!(tcVar instanceof gm)) {
                            return z;
                        }
                        if (z || i == 8) {
                        }
                        break;
                    case 2:
                    case 4:
                        boolean z2 = i == 3 || i == 5;
                        if (!(tcVar instanceof gm)) {
                            return z2;
                        }
                        if (z2 || i == 9) {
                        }
                        break;
                    case 5:
                        if (i == 2 || i == 4) {
                        }
                        break;
                    case 6:
                        if (i == 6 || i == 8 || i == 9) {
                        }
                        break;
                    default:
                        throw new AssertionError(n20.g(i2));
                }
            } else if (i2 != 6 || (tcVar.E && this.d.E)) {
                return true;
            }
        }
        return false;
    }

    public final void j() {
        HashSet hashSet;
        ec ecVar = this.f;
        if (ecVar != null && (hashSet = ecVar.a) != null) {
            hashSet.remove(this);
            if (this.f.a.size() == 0) {
                this.f.a = null;
            }
        }
        this.a = null;
        this.f = null;
        this.g = 0;
        this.h = Integer.MIN_VALUE;
        this.c = false;
        this.b = 0;
    }

    public final void k() {
        o20 o20Var = this.i;
        if (o20Var == null) {
            this.i = new o20(1);
        } else {
            o20Var.c();
        }
    }

    public final void l(int i) {
        this.b = i;
        this.c = true;
    }

    public final String toString() {
        return this.d.h0 + ":" + n20.g(this.e);
    }
}
