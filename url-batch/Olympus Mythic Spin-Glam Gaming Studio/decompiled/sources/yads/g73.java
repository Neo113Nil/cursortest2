package yads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Pair;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;

/* loaded from: classes9.dex */
public abstract class g73 implements nq {
    public static final c73 b = new c73();

    static {
        new mq() { // from class: yads.g73$$ExternalSyntheticLambda0
            @Override // yads.mq
            public final nq a(Bundle bundle) {
                return g73.a(bundle);
            }
        };
    }

    public abstract int a();

    public int a(int i, int i2, boolean z) {
        if (i2 == 0) {
            if (i == b(z)) {
                return -1;
            }
            return i + 1;
        }
        if (i2 == 1) {
            return i;
        }
        if (i2 == 2) {
            return i == b(z) ? a(z) : i + 1;
        }
        throw new IllegalStateException();
    }

    public abstract int a(Object obj);

    public abstract Object a(int i);

    public abstract d73 a(int i, d73 d73Var, boolean z);

    public abstract f73 a(int i, f73 f73Var, long j);

    public abstract int b();

    public int b(boolean z) {
        if (c()) {
            return -1;
        }
        return b() - 1;
    }

    public final boolean c() {
        return b() == 0;
    }

    public final boolean equals(Object obj) {
        int b2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g73)) {
            return false;
        }
        g73 g73Var = (g73) obj;
        if (g73Var.b() != b() || g73Var.a() != a()) {
            return false;
        }
        f73 f73Var = new f73();
        d73 d73Var = new d73();
        f73 f73Var2 = new f73();
        d73 d73Var2 = new d73();
        for (int i = 0; i < b(); i++) {
            if (!a(i, f73Var, 0L).equals(g73Var.a(i, f73Var2, 0L))) {
                return false;
            }
        }
        for (int i2 = 0; i2 < a(); i2++) {
            if (!a(i2, d73Var, true).equals(g73Var.a(i2, d73Var2, true))) {
                return false;
            }
        }
        int a = a(true);
        if (a != g73Var.a(true) || (b2 = b(true)) != g73Var.b(true)) {
            return false;
        }
        while (a != b2) {
            int a2 = a(a, 0, true);
            if (a2 != g73Var.a(a, 0, true)) {
                return false;
            }
            a = a2;
        }
        return true;
    }

    public final int hashCode() {
        f73 f73Var = new f73();
        d73 d73Var = new d73();
        int b2 = b() + Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE;
        for (int i = 0; i < b(); i++) {
            b2 = (b2 * 31) + a(i, f73Var, 0L).hashCode();
        }
        int a = a() + (b2 * 31);
        for (int i2 = 0; i2 < a(); i2++) {
            a = (a * 31) + a(i2, d73Var, true).hashCode();
        }
        int a2 = a(true);
        while (a2 != -1) {
            a = (a * 31) + a2;
            a2 = a(a2, 0, true);
        }
        return a;
    }

    public int a(int i, int i2) {
        if (i2 == 0) {
            if (i == a(false)) {
                return -1;
            }
            return i - 1;
        }
        if (i2 == 1) {
            return i;
        }
        if (i2 == 2) {
            return i == a(false) ? b(false) : i - 1;
        }
        throw new IllegalStateException();
    }

    public int a(boolean z) {
        return c() ? -1 : 0;
    }

    public final Pair a(f73 f73Var, d73 d73Var, int i, long j) {
        Pair a = a(f73Var, d73Var, i, j, 0L);
        a.getClass();
        return a;
    }

    public final Pair a(f73 f73Var, d73 d73Var, int i, long j, long j2) {
        oh.a(i, b());
        a(i, f73Var, j2);
        if (j == -9223372036854775807L) {
            j = f73Var.n;
            if (j == -9223372036854775807L) {
                return null;
            }
        }
        int i2 = f73Var.p;
        a(i2, d73Var, false);
        while (i2 < f73Var.q && d73Var.f != j) {
            int i3 = i2 + 1;
            if (a(i3, d73Var, false).f > j) {
                break;
            }
            i2 = i3;
        }
        a(i2, d73Var, true);
        long j3 = j - d73Var.f;
        long j4 = d73Var.e;
        if (j4 != -9223372036854775807L) {
            j3 = Math.min(j3, j4 - 1);
        }
        long max = Math.max(0L, j3);
        Object obj = d73Var.c;
        obj.getClass();
        return Pair.create(obj, Long.valueOf(max));
    }

    public d73 a(Object obj, d73 d73Var) {
        return a(a(obj), d73Var, true);
    }

    public final int a(int i, d73 d73Var, f73 f73Var, int i2, boolean z) {
        int i3 = a(i, d73Var, false).d;
        if (a(i3, f73Var, 0L).q != i) {
            return i + 1;
        }
        int a = a(i3, i2, z);
        if (a == -1) {
            return -1;
        }
        return a(a, f73Var, 0L).p;
    }

    public static g73 a(Bundle bundle) {
        um2 a = a(f73.v, lq.a(bundle, Integer.toString(0, 36)));
        um2 a2 = a(d73.i, lq.a(bundle, Integer.toString(1, 36)));
        int[] intArray = bundle.getIntArray(Integer.toString(2, 36));
        if (intArray == null) {
            int i = a.e;
            int[] iArr = new int[i];
            for (int i2 = 0; i2 < i; i2++) {
                iArr[i2] = i2;
            }
            intArray = iArr;
        }
        return new e73(a, a2, intArray);
    }

    public static um2 a(mq mqVar, IBinder iBinder) {
        int readInt;
        if (iBinder == null) {
            i41 i41Var = l41.c;
            return um2.f;
        }
        dx.a(4, "initialCapacity");
        Object[] objArr = new Object[4];
        int i = kq.$r8$clinit;
        i41 i41Var2 = l41.c;
        dx.a(4, "initialCapacity");
        Object[] objArr2 = new Object[4];
        int i2 = 0;
        int i3 = 1;
        int i4 = 0;
        int i5 = 0;
        while (i3 != 0) {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInt(i5);
                try {
                    iBinder.transact(1, obtain, obtain2, 0);
                    while (true) {
                        readInt = obtain2.readInt();
                        if (readInt == 1) {
                            Bundle readBundle = obtain2.readBundle();
                            readBundle.getClass();
                            int i6 = i4 + 1;
                            if (objArr2.length < i6) {
                                objArr2 = Arrays.copyOf(objArr2, e41.a(objArr2.length, i6));
                            }
                            objArr2[i4] = readBundle;
                            i5++;
                            i4 = i6;
                        }
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    i3 = readInt;
                } catch (RemoteException e) {
                    throw new RuntimeException(e);
                }
            } catch (Throwable th) {
                obtain2.recycle();
                obtain.recycle();
                throw th;
            }
        }
        um2 b2 = l41.b(i4, objArr2);
        int i7 = 0;
        while (i2 < b2.e) {
            nq a = mqVar.a((Bundle) b2.get(i2));
            a.getClass();
            int i8 = i7 + 1;
            if (objArr.length < i8) {
                objArr = Arrays.copyOf(objArr, e41.a(objArr.length, i8));
            }
            objArr[i7] = a;
            i2++;
            i7 = i8;
        }
        return l41.b(i7, objArr);
    }
}
