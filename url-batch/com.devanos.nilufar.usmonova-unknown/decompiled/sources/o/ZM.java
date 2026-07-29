package o;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Trace;
import android.util.Log;
import com.google.firebase.messaging.ServiceStarter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public abstract class ZM implements EZ {
    public static long a;
    public static Method b;
    public static Method c;
    public static Method d;

    public static final void a(LU lu, QU qu, String str) {
        RU.h.getClass();
        RU.j.fine(qu.b + ' ' + String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1)) + ": " + lu.a);
    }

    public static final Object b(Object obj, boolean z) {
        EnumC1791qv enumC1791qv;
        AbstractC0048Bt.n(obj, "possiblyPrimitiveType");
        if (!z) {
            return obj;
        }
        AbstractC0335Mv abstractC0335Mv = (AbstractC0335Mv) obj;
        if (!(abstractC0335Mv instanceof C0309Lv) || (enumC1791qv = ((C0309Lv) abstractC0335Mv).i) == null) {
            return abstractC0335Mv;
        }
        String e = C0870cv.c(enumC1791qv.e()).e();
        AbstractC0048Bt.m(e, "byFqNameWithoutInnerClas…apperFqName).internalName");
        return C0460Rq.q(e);
    }

    public static String d(Object obj, String str) {
        AbstractC0048Bt.n(obj, "value");
        return str + " value: " + obj;
    }

    public static boolean e(Method method, InterfaceC0517Tv interfaceC0517Tv) {
        AbstractC0048Bt.n(interfaceC0517Tv, "clazz");
        return method.getReturnType().equals(AbstractC1473m3.D(interfaceC0517Tv));
    }

    public static final String f(long j) {
        String str;
        if (j <= -999500000) {
            str = ((j - 500000000) / 1000000000) + " s ";
        } else if (j <= -999500) {
            str = ((j - 500000) / 1000000) + " ms";
        } else if (j <= 0) {
            str = ((j - ServiceStarter.ERROR_UNKNOWN) / 1000) + " µs";
        } else if (j < 999500) {
            str = ((j + ServiceStarter.ERROR_UNKNOWN) / 1000) + " µs";
        } else if (j < 999500000) {
            str = ((j + 500000) / 1000000) + " ms";
        } else {
            str = ((j + 500000000) / 1000000000) + " s ";
        }
        return String.format("%6s", Arrays.copyOf(new Object[]{str}, 1));
    }

    public static void g(String str, Exception exc) {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = exc.getCause();
            if (!(cause instanceof RuntimeException)) {
                throw new RuntimeException(cause);
            }
            throw ((RuntimeException) cause);
        }
        Log.v("Trace", "Unable to call " + str + " via reflection", exc);
    }

    public static boolean h() {
        if (Build.VERSION.SDK_INT >= 29) {
            return AbstractC1436lW.c();
        }
        try {
            if (b == null) {
                a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                b = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) b.invoke(null, Long.valueOf(a))).booleanValue();
        } catch (Exception e) {
            g("isTagEnabled", e);
            return false;
        }
    }

    public static boolean i(byte b2) {
        return b2 > -65;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static List j(C0972eS c0972eS, int i, C0972eS c0972eS2, boolean z, boolean z2, boolean z3) {
        C1318jk c1318jk;
        boolean z4;
        C1471m2 H;
        int i2;
        int i3;
        int q = c0972eS.q(i);
        int i4 = i + q;
        int f = c0972eS.f(c0972eS.b, c0972eS.p(i));
        int f2 = c0972eS.f(c0972eS.b, c0972eS.p(i4));
        int i5 = f2 - f;
        boolean z5 = i >= 0 && (c0972eS.b[(c0972eS.p(i) * 5) + 1] & 201326592) != 0;
        c0972eS2.r(q);
        c0972eS2.s(i5, c0972eS2.t);
        if (c0972eS.g < i4) {
            c0972eS.u(i4);
        }
        if (c0972eS.k < f2) {
            c0972eS.v(f2, i4);
        }
        int[] iArr = c0972eS2.b;
        int i6 = c0972eS2.t;
        int i7 = i6 * 5;
        P6.a0(i7, i * 5, i4 * 5, c0972eS.b, iArr);
        Object[] objArr = c0972eS2.c;
        int i8 = c0972eS2.i;
        P6.b0(c0972eS.c, objArr, i8, f, f2);
        int i9 = c0972eS2.v;
        iArr[i7 + 2] = i9;
        int i10 = i6 - i;
        int i11 = i6 + q;
        int f3 = i8 - c0972eS2.f(iArr, i6);
        int i12 = c0972eS2.m;
        int i13 = c0972eS2.l;
        int length = objArr.length;
        boolean z6 = z5;
        int i14 = i12;
        int i15 = i6;
        while (i15 < i11) {
            if (i15 != i6) {
                int i16 = (i15 * 5) + 2;
                iArr[i16] = iArr[i16] + i10;
            }
            int i17 = i10;
            int f4 = c0972eS2.f(iArr, i15) + f3;
            if (i14 < i15) {
                i2 = i11;
                i3 = 0;
            } else {
                i2 = i11;
                i3 = c0972eS2.k;
            }
            iArr[(i15 * 5) + 4] = C0972eS.h(f4, i3, i13, length);
            if (i15 == i14) {
                i14++;
            }
            i15++;
            i11 = i2;
            i10 = i17;
        }
        int i18 = i10;
        int i19 = i11;
        c0972eS2.m = i14;
        int g = TM.g(c0972eS.d, i, c0972eS.n());
        int g2 = TM.g(c0972eS.d, i4, c0972eS.n());
        if (g < g2) {
            ArrayList arrayList = c0972eS.d;
            ArrayList arrayList2 = new ArrayList(g2 - g);
            for (int i20 = g; i20 < g2; i20++) {
                C1471m2 c1471m2 = (C1471m2) arrayList.get(i20);
                c1471m2.a += i18;
                arrayList2.add(c1471m2);
            }
            c0972eS2.d.addAll(TM.g(c0972eS2.d, c0972eS2.t, c0972eS2.n()), arrayList2);
            arrayList.subList(g, g2).clear();
            c1318jk = arrayList2;
        } else {
            c1318jk = C1318jk.h;
        }
        if (!c1318jk.isEmpty()) {
            HashMap hashMap = c0972eS.e;
            HashMap hashMap2 = c0972eS2.e;
            if (hashMap != null && hashMap2 != null) {
                int size = c1318jk.size();
                for (int i21 = 0; i21 < size; i21++) {
                }
            }
        }
        int i22 = c0972eS2.v;
        HashMap hashMap3 = c0972eS2.e;
        if (hashMap3 != null && (H = c0972eS2.H(i9)) != null) {
        }
        int w = c0972eS.w(c0972eS.b, i);
        if (!z3) {
            z4 = false;
        } else if (z) {
            boolean z7 = w >= 0;
            if (z7) {
                c0972eS.F();
                c0972eS.a(w - c0972eS.t);
                c0972eS.F();
            }
            c0972eS.a(i - c0972eS.t);
            boolean z8 = c0972eS.z();
            if (z7) {
                c0972eS.C();
                c0972eS.i();
                c0972eS.C();
                c0972eS.i();
            }
            z4 = z8;
        } else {
            boolean A = c0972eS.A(i, q);
            c0972eS.B(f, i5, i - 1);
            z4 = A;
        }
        if (z4) {
            EB.h("Unexpectedly removed anchors");
            throw null;
        }
        c0972eS2.f162o += TM.f(iArr, i6) ? 1 : TM.h(iArr, i6);
        if (z2) {
            c0972eS2.t = i19;
            c0972eS2.i = i8 + i5;
        }
        if (z6) {
            c0972eS2.J(i9);
        }
        return c1318jk;
    }

    public static String l(String str) {
        return str.length() <= 127 ? str : str.substring(0, 127);
    }

    public static final boolean m(String str, InterfaceC1455lp interfaceC1455lp) {
        try {
            boolean booleanValue = ((Boolean) interfaceC1455lp.invoke()).booleanValue();
            if (!booleanValue && str != null) {
                Log.e("ReflectionGuard", str);
            }
            return booleanValue;
        } catch (ClassNotFoundException unused) {
            if (str == null) {
                str = "";
            }
            Log.e("ReflectionGuard", "ClassNotFound: ".concat(str));
            return false;
        } catch (NoSuchMethodException unused2) {
            if (str == null) {
                str = "";
            }
            Log.e("ReflectionGuard", "NoSuchMethod: ".concat(str));
            return false;
        }
    }

    public static void n(Parcel parcel, int i, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        int r = r(parcel, i);
        parcel.writeBundle(bundle);
        s(parcel, r);
    }

    public static void o(Parcel parcel, int i, Parcelable parcelable, int i2) {
        if (parcelable == null) {
            return;
        }
        int r = r(parcel, i);
        parcelable.writeToParcel(parcel, i2);
        s(parcel, r);
    }

    public static void p(Parcel parcel, int i, String str) {
        if (str == null) {
            return;
        }
        int r = r(parcel, i);
        parcel.writeString(str);
        s(parcel, r);
    }

    public static void q(Parcel parcel, int i, Parcelable[] parcelableArr, int i2) {
        if (parcelableArr == null) {
            return;
        }
        int r = r(parcel, i);
        parcel.writeInt(parcelableArr.length);
        for (Parcelable parcelable : parcelableArr) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int dataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int dataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, i2);
                int dataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(dataPosition);
                parcel.writeInt(dataPosition3 - dataPosition2);
                parcel.setDataPosition(dataPosition3);
            }
        }
        s(parcel, r);
    }

    public static int r(Parcel parcel, int i) {
        parcel.writeInt(i | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static void s(Parcel parcel, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i - 4);
        parcel.writeInt(dataPosition - i);
        parcel.setDataPosition(dataPosition);
    }

    public static void t(Parcel parcel, int i, int i2) {
        parcel.writeInt(i | (i2 << 16));
    }

    public abstract Object c();

    public abstract ZM k(String str, InterfaceC2114vp interfaceC2114vp);
}
