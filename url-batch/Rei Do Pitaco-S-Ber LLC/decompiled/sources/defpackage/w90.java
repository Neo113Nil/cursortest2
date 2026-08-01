package defpackage;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public abstract class w90 implements xe {
    public int a;
    public tc b;
    public l00 c;
    public int d;
    public final mf e = new mf(this);
    public int f = 0;
    public boolean g = false;
    public final ze h = new ze(this);
    public final ze i = new ze(this);
    public int j = 1;

    public w90(tc tcVar) {
        this.b = tcVar;
    }

    public static void b(ze zeVar, ze zeVar2, int i) {
        zeVar.l.add(zeVar2);
        zeVar.f = i;
        zeVar2.k.add(zeVar);
    }

    public static ze h(ec ecVar) {
        ec ecVar2 = ecVar.f;
        if (ecVar2 == null) {
            return null;
        }
        tc tcVar = ecVar2.d;
        int h = n20.h(ecVar2.e);
        if (h == 1) {
            return tcVar.d.h;
        }
        if (h == 2) {
            return tcVar.e.h;
        }
        if (h == 3) {
            return tcVar.d.i;
        }
        if (h == 4) {
            return tcVar.e.i;
        }
        if (h != 5) {
            return null;
        }
        return tcVar.e.k;
    }

    public static ze i(ec ecVar, int i) {
        ec ecVar2 = ecVar.f;
        if (ecVar2 == null) {
            return null;
        }
        tc tcVar = ecVar2.d;
        w90 w90Var = i == 0 ? tcVar.d : tcVar.e;
        int h = n20.h(ecVar2.e);
        if (h == 1 || h == 2) {
            return w90Var.h;
        }
        if (h == 3 || h == 4) {
            return w90Var.i;
        }
        return null;
    }

    public final void c(ze zeVar, ze zeVar2, int i, mf mfVar) {
        zeVar.l.add(zeVar2);
        zeVar.l.add(this.e);
        zeVar.h = i;
        zeVar.i = mfVar;
        zeVar2.k.add(zeVar);
        mfVar.k.add(zeVar);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int i, int i2) {
        tc tcVar = this.b;
        if (i2 == 0) {
            int i3 = tcVar.v;
            int max = Math.max(tcVar.u, i);
            if (i3 > 0) {
                max = Math.min(i3, i);
            }
            if (max != i) {
                return max;
            }
        } else {
            int i4 = tcVar.y;
            int max2 = Math.max(tcVar.x, i);
            if (i4 > 0) {
                max2 = Math.min(i4, i);
            }
            if (max2 != i) {
                return max2;
            }
        }
        return i;
    }

    public long j() {
        if (this.e.j) {
            return r2.g;
        }
        return 0L;
    }

    public abstract boolean k();

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0051, code lost:
    
        if (r9.a == 3) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(ec ecVar, ec ecVar2, int i) {
        ze h = h(ecVar);
        ze h2 = h(ecVar2);
        if (h.j && h2.j) {
            int e = ecVar.e() + h.g;
            int e2 = h2.g - ecVar2.e();
            int i2 = e2 - e;
            mf mfVar = this.e;
            if (!mfVar.j && this.d == 3) {
                int i3 = this.a;
                if (i3 == 0) {
                    mfVar.d(g(i2, i));
                } else if (i3 == 1) {
                    mfVar.d(Math.min(g(mfVar.m, i), i2));
                } else if (i3 == 2) {
                    tc tcVar = this.b;
                    tc tcVar2 = tcVar.T;
                    if (tcVar2 != null) {
                        if ((i == 0 ? tcVar2.d : tcVar2.e).e.j) {
                            mfVar.d(g((int) ((r6.g * (i == 0 ? tcVar.w : tcVar.z)) + 0.5f), i));
                        }
                    }
                } else if (i3 == 3) {
                    tc tcVar3 = this.b;
                    w90 w90Var = tcVar3.d;
                    if (w90Var.d == 3 && w90Var.a == 3) {
                        q70 q70Var = tcVar3.e;
                        if (q70Var.d == 3) {
                        }
                    }
                    if (i == 0) {
                        w90Var = tcVar3.e;
                    }
                    mf mfVar2 = w90Var.e;
                    if (mfVar2.j) {
                        float f = tcVar3.W;
                        int i4 = mfVar2.g;
                        mfVar.d(i == 1 ? (int) ((i4 / f) + 0.5f) : (int) ((f * i4) + 0.5f));
                    }
                }
            }
            if (mfVar.j) {
                int i5 = mfVar.g;
                ze zeVar = this.i;
                ze zeVar2 = this.h;
                if (i5 == i2) {
                    zeVar2.d(e);
                    zeVar.d(e2);
                    return;
                }
                tc tcVar4 = this.b;
                float f2 = i == 0 ? tcVar4.d0 : tcVar4.e0;
                if (h == h2) {
                    e = h.g;
                    e2 = h2.g;
                    f2 = 0.5f;
                }
                zeVar2.d((int) ((((e2 - e) - i5) * f2) + e + 0.5f));
                zeVar.d(zeVar2.g + mfVar.g);
            }
        }
    }
}
