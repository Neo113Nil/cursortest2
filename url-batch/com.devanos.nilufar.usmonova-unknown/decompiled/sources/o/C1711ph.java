package o;

import android.os.DeadObjectException;
import android.os.IInterface;
import android.os.Parcel;
import java.util.ArrayDeque;

/* renamed from: o.ph, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1711ph implements InterfaceC1070fy {
    public boolean h;
    public final Object i;
    public Object j;

    public C1711ph(C1818rJ c1818rJ, C0300Ll[] c0300LlArr, boolean z) {
        this.j = c1818rJ;
        this.i = c0300LlArr;
        boolean z2 = false;
        if (c0300LlArr != null && z) {
            z2 = true;
        }
        this.h = z2;
    }

    public static final void a(C1711ph c1711ph) {
        ((MD) c1711ph.i).a();
        int i = 0;
        c1711ph.h = false;
        YD yd = (YD) c1711ph.j;
        int i2 = yd.j;
        if (i2 > 0) {
            Object[] objArr = yd.h;
            do {
                ((InterfaceC1455lp) objArr[i]).invoke();
                i++;
            } while (i < i2);
        }
        yd.h();
    }

    public static final void b(C1711ph c1711ph) {
        MD md = (MD) c1711ph.i;
        Object[] objArr = md.b;
        long[] jArr = md.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            C0405Pn c0405Pn = (C0405Pn) objArr[(i << 3) + i3];
                            c0405Pn.getClass();
                            EnumC0379On enumC0379On = (EnumC0379On) ((MD) AbstractC1473m3.W(c0405Pn).i).e(c0405Pn);
                            if (enumC0379On == null) {
                                AbstractC0868ct.X("committing a node that was not updated in the current transaction");
                                throw null;
                            }
                            c0405Pn.p = enumC0379On;
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                } else {
                    i++;
                }
            }
        }
        md.a();
        c1711ph.h = false;
        ((YD) c1711ph.j).h();
    }

    public void c(D4 d4, NU nu) {
        IInterface iInterface;
        VU vu = (VU) ((C2329z20) ((C1818rJ) this.j).i).a;
        D20 d20 = (D20) d4;
        synchronized (d20.f) {
            if (d20.m == 5) {
                throw new DeadObjectException();
            }
            if (!d20.a()) {
                throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
            }
            iInterface = d20.j;
            AbstractC1473m3.o(iInterface, "Client is connected but service is null");
        }
        C2263y20 c2263y20 = (C2263y20) iInterface;
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(c2263y20.b);
        int i = AbstractC1670p20.a;
        if (vu == null) {
            obtain.writeInt(0);
        } else {
            obtain.writeInt(1);
            vu.writeToParcel(obtain, 0);
        }
        try {
            c2263y20.a.transact(1, obtain, null, 1);
            obtain.recycle();
            nu.b(null);
        } catch (Throwable th) {
            obtain.recycle();
            throw th;
        }
    }

    public void d(double d, double d2) {
        double[] dArr = (double[]) this.i;
        double d3 = 1.0d;
        if (!this.h) {
            d3 = 1.0d / (((dArr[7] * d2) + (dArr[3] * d)) + dArr[15]);
        }
        double d4 = ((dArr[4] * d2) + (dArr[0] * d) + dArr[12]) * d3;
        double d5 = ((dArr[5] * d2) + (dArr[1] * d) + dArr[13]) * d3;
        double[] dArr2 = (double[]) this.j;
        if (d4 < dArr2[0]) {
            dArr2[0] = d4;
        } else if (d4 > dArr2[1]) {
            dArr2[1] = d4;
        }
        if (d5 < dArr2[2]) {
            dArr2[2] = d5;
        } else if (d5 > dArr2[3]) {
            dArr2[3] = d5;
        }
    }

    public void e(k30 k30Var) {
        synchronized (this.i) {
            try {
                if (((ArrayDeque) this.j) == null) {
                    this.j = new ArrayDeque();
                }
                ((ArrayDeque) this.j).add(k30Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void f(MU mu) {
        k30 k30Var;
        synchronized (this.i) {
            if (((ArrayDeque) this.j) != null && !this.h) {
                this.h = true;
                while (true) {
                    synchronized (this.i) {
                        try {
                            k30Var = (k30) ((ArrayDeque) this.j).poll();
                            if (k30Var == null) {
                                this.h = false;
                                return;
                            }
                        } finally {
                        }
                    }
                    k30Var.a(mu);
                }
            }
        }
    }

    @Override // o.InterfaceC1070fy
    public boolean g(SW sw, SW sw2) {
        boolean z = this.h;
        InterfaceC2072v9 interfaceC2072v9 = (InterfaceC2072v9) this.i;
        InterfaceC2072v9 interfaceC2072v92 = (InterfaceC2072v9) this.j;
        AbstractC0048Bt.n(interfaceC2072v9, "$a");
        AbstractC0048Bt.n(interfaceC2072v92, "$b");
        AbstractC0048Bt.n(sw, "c1");
        AbstractC0048Bt.n(sw2, "c2");
        if (sw.equals(sw2)) {
            return true;
        }
        InterfaceC2364zb c = sw.c();
        InterfaceC2364zb c2 = sw2.c();
        if ((c instanceof InterfaceC1437lX) && (c2 instanceof InterfaceC1437lX)) {
            return C0460Rq.z.k((InterfaceC1437lX) c, (InterfaceC1437lX) c2, z, new C1671p3(interfaceC2072v9, 2, interfaceC2072v92));
        }
        return false;
    }

    public /* synthetic */ C1711ph(boolean z, Object obj, Object obj2) {
        this.h = z;
        this.i = obj;
        this.j = obj2;
    }

    public C1711ph(int i) {
        switch (i) {
            case 4:
                this.i = new Object();
                break;
            default:
                long[] jArr = UP.a;
                this.i = new MD();
                this.j = new YD(new InterfaceC1455lp[16]);
                break;
        }
    }
}
